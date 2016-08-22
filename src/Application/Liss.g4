/*
 * Version eBNF of Liss
 * Author : Damien + PRH
 * Date : 2015.03.11
 */
grammar Liss;

@header{
    import java.util.HashMap;
    import java.util.LinkedList;
    import Application.SymbolTable.*;
}

@members{
    int level = 0;
    //TableError e = new TableError();
    TableError e;
    boolean isSet = false;
    int i= 0;

    boolean isDeclarations;

    boolean functionState = false;


     //Mips m = new Mips();
     Mips m;
}

/* ****** Program ****** */

liss [IdentifiersTable idTH, TableError tableError,Mips mips]
      @init{
        e = tableError;
        m = mips;
      }
     : 'program' identifier body[idTH] { m.addDataInstruction(m.dataTextOriginal()); m.textExitCode(); System.out.println(e.toString()); System.out.println("/***************************************/\n"+m.getAssemblyCode()+"/***************************************/\n"); /*System.out.println(m.areSomeRegistersUsed());if(e.isNull()){ m.write();}*/}
     ;


body[IdentifiersTable idTH]
     : '{'
       'declarations' {isDeclarations = true;} declarations[idTH,null]
       'statements'   {isDeclarations = false; String mipsCodeS = "\t#########BEGIN STATEMENTS#########\n"; m.addTextInstruction(mipsCodeS); } s=statements[idTH] {mipsCodeS = "\t##########END STATEMENTS##########\n"; m.addTextInstruction(mipsCodeS);}
       '}'
     ;

/* ****** Declarations ****** */

declarations[IdentifiersTable idTH, HashMap<String,Object> varInfo]
            @init{
                 HashMap<String, HashMap<String, Object>> hashmapVar = new HashMap<String, HashMap<String,Object>>();
            }
            : variable_declaration[idTH]*
              {

                //It is necessary to the add function ASAP on the idTH due to consistency of the idTH ! And to add it, we must know ASAP when we know the stack frame size !! Even before a subprogram is detected or a statement !!
                if(functionState == true && varInfo!=null){
                    $idTH.pushSP(m.numberOfRegistersInBytes()); //only add when subprogram are activated !!!!
                    varInfo.put("address",$idTH.getSizeSP(level));

                    String nameFunction = (String) varInfo.get("nameFunction");
                    //varInfo.remove("nameFunction");
                    hashmapVar.put(nameFunction,varInfo);

                    $idTH.add(e,hashmapVar,"function",level-1); //Name of the function is always one level below (for this part of the code) !
                    //Code below generate the mipscode for functions
                    String mipsCodeS = m.increaseStackFrameSP($idTH.getSizeSP(level));
                    mipsCodeS += m.saveRegistersAndReturnAddressBeginFunctions($idTH.getSizeSP(level));
                    mipsCodeS += "\t#########BEGIN DECLARATIONS#########\n";
                    m.addIncreaseSFMipsCodeFunction(m.getNameFunction(),mipsCodeS);


                    mipsCodeS = "\t#########END DECLARATIONS#########\n";
                    //mipsCodeS += m.saveRegistersAndReturnAddressBeginFunctions($idTH.getSizeSP(level));

                    m.addMipsCodeFunction(m.getNameFunction(),mipsCodeS);
                    //add the rest of the mipsCode of variable_Declaration NT

                }
              }
              subprogram_definition[idTH]*
              {
                System.out.println("-------");
                $idTH.printSP();
                //$idTH.popSP();
                //$idTH.printSP();
                System.out.println("-------");
              }
            ;

/* ****** Variables ****** */

variable_declaration [IdentifiersTable idTH]
                     : vars[idTH] '->' type ';' {
                        HashMap<String, HashMap<String,Object>> varsH = $vars.varsS;
                            if($type.typeS == "array" ){
                                //we need to count which position will you store in the sp. And for that we need to count it for each array declared.
                                int addressSP = $idTH.getAddress();
                                for(String i : varsH.keySet()){
                                    varsH.get(i).put("dimension",$type.arrayDimension);
                                    String mipsCodeS="";

                                    System.out.println("ARRAY: "+i+" FUNCTIONSTAT: "+functionState);

                                    //If variable_declaration is in a subprogram, we need to initialize all the area concerned in the SP to 0!
                                    if(functionState == true){
                                        System.out.println("ARRAY: "+i+" FUNCTIONSTAT: "+functionState+" ENTERED TO THAT STATE");
                                        ArrayList<Integer> dimension = $type.arrayDimension;
                                        int res = 1;
                                        for(Integer l : dimension){
                                            res *= l;
                                        }
                                        res *= m.numberOfBytesForEachAddress();

                                        mipsCodeS += "\t##### Initialize Array :"+i+"#####\n";
                                        for(int j = 0; j< res; j+=m.numberOfBytesForEachAddress()){
                                            mipsCodeS += m.loadImmediateWord("0", (int) varsH.get(i).get("line"), (int) varsH.get(i).get("pos")) + m.storeArgumentsSP(addressSP+j);
                                        }
                                        mipsCodeS += "\t#######################################\n";
                                    }

                                    //Now if there are some values to set to the array, we need to generate that code!
                                    if(varsH.get(i).get("accessArray") != null){
                                        ArrayList<ArrayList<Integer>> accessArray = (ArrayList<ArrayList<Integer>>) varsH.get(i).get("accessArray");

                                        mipsCodeS += "\t##### Initialize Value Array :"+i+"#####\n";

                                        for(ArrayList<Integer> array :accessArray){
                                            int valueOfThePositionOfTheArray = array.get(array.size()-1);
                                            array.remove(array.size()-1);

                                            int res = 0;
                                            for(int j=0; j< array.size(); j++){
                                                int calc = array.get(j);
                                                //Verify if the position of the value for setting the array is in the limits of the array !!!
                                                if(calc < $type.arrayDimension.get(j)){
                                                    for(int h=j+1; h< array.size(); h++){
                                                        calc = calc*$type.arrayDimension.get(h);
                                                    }
                                                    res = res + calc;
                                                }else{
                                                    e.addMessage((int)varsH.get(i).get("line"),(int)varsH.get(i).get("pos"),ErrorMessage.semantic($vars.text,ErrorMessage.LimitsArray));
                                                }
                                            }
                                            res = res*m.numberOfBytesForEachAddress();

                                            //Add the value of the array firstly
                                            mipsCodeS += m.loadImmediateWord(String.valueOf(valueOfThePositionOfTheArray), (int)varsH.get(i).get("line"), (int)varsH.get(i).get("pos")); //generate mips code for value of the array
                                            //Add the address of the value of the array
                                            mipsCodeS += m.loadImmediateWord(String.valueOf(res), (int)varsH.get(i).get("line"), (int)varsH.get(i).get("pos"));//generate mips code for position of the array
                                            if(functionState == false){
                                                //Function for adding the value and the address of the value to the given array
                                                mipsCodeS += m.storeWordArray(i,(int)varsH.get(i).get("line"), (int)varsH.get(i).get("pos"));

                                            }else if(functionState == true){

                                                //System.out.println($idTH.toString());
                                                System.out.println(i+" ADDRESS OF VARIABLE DECLARATION: "+addressSP);
                                                mipsCodeS += m.loadImmediateWord(""+addressSP, (int)varsH.get(i).get("line"), (int)varsH.get(i).get("pos"))+m.textAdd((int)varsH.get(i).get("line"), (int)varsH.get(i).get("pos"));
                                                //è necessario adicionar o endereço da stack frame a posicao calculado do endereço array (para acceder bem)
                                                mipsCodeS += m.storeValueWordArraySP((int)varsH.get(i).get("line"), (int)varsH.get(i).get("pos"));

                                            }

                                        }

                                        mipsCodeS += "\t#######################################\n";
                                        varsH.get(i).put("mips",mipsCodeS);
                                    }else{
                                        //It means that there is no access Values in the initialization of the Array, we need to add the generated code!
                                        varsH.get(i).put("mips",mipsCodeS);
                                    }

                                    //This algorithm counts the next address in the sp for the array(basically, it simulates the number)!!!
                                    ArrayList<Integer> limits = $type.arrayDimension;
                                    int res=1;
                                    for(Integer l : limits){
                                        res*=l;
                                    }
                                    addressSP+=res*m.numberOfBytesForEachAddress();

                                }
                            }else if($type.typeS == "set"){
                                for(String i : varsH.keySet()){
                                    HashMap<String,Object> v = (HashMap<String,Object>)varsH.get(i);
                                    if(v.get("set") == null){
                                        v.put("set", new Set());
                                    }else{
                                        Application.Set ss= (Application.Set) varsH.get(i).get("set");
                                    }
                                }
                                /*for(String i : varsH.keySet()){
                                    Node n1 = new Node(new String("2"),null,null);
                                    Node n2 = new Node(new String("3"),null,null);
                                    Node n3 = new Node(new String("+"),n1,n2);

                                    Application.Set ss= (Application.Set) varsH.get(i).get("set");
                                }*/
                            }else if($type.typeS == "boolean"){
                                if(functionState == true){
                                    int address = $idTH.getAddress();
                                    Type typeSpace = (Type) $idTH.getInfoIdentifiersTable("boolean");

                                    for(String i : varsH.keySet()){
                                        if(varsH.get(i).get("mips")!=null){
                                            String mipsCodeS = varsH.get(i).get("mips") + m.storeArgumentsSP(address);
                                            varsH.get(i).put("mips",mipsCodeS);
                                            address += typeSpace.getSpace();
                                        }else{
                                            //This means that the integer exists but the mipsCode is null, we must set it for the function otherwise there will be a random value
                                            String mipsCodeS = m.loadImmediateWord("0", (int) varsH.get(i).get("line"), (int) varsH.get(i).get("pos")) + m.storeArgumentsSP(address);
                                            varsH.get(i).put("mips",mipsCodeS);
                                            address += typeSpace.getSpace();
                                        }
                                    }
                                }
                            }else if($type.typeS == "integer"){
                                if(functionState == true){
                                    int address = $idTH.getAddress();
                                    Type typeSpace = (Type) $idTH.getInfoIdentifiersTable("integer");

                                    for(String i : varsH.keySet()){
                                        if(varsH.get(i).get("mips")!=null){
                                            String mipsCodeS = varsH.get(i).get("mips") + m.storeArgumentsSP(address);
                                            varsH.get(i).put("mips",mipsCodeS);
                                            address += typeSpace.getSpace();
                                        }else{
                                            //This means that the integer exists but the mipsCode is null, we must set it for the function otherwise there will be a random value
                                            String mipsCodeS = m.loadImmediateWord("0", (int) varsH.get(i).get("line"), (int) varsH.get(i).get("pos")) + m.storeArgumentsSP(address);
                                            varsH.get(i).put("mips",mipsCodeS);
                                            address += typeSpace.getSpace();
                                        }
                                    }
                                }
                            }else if($type.typeS == "sequence"){
                                int address = $idTH.getAddress();
                                for(String i : varsH.keySet()){
                                    LinkedList<Integer> sequence = (LinkedList<Integer>) varsH.get(i).get("sequence");

                                    String mipsCodeS=null;

                                    if(sequence!=null && sequence.size()>0){
                                        mipsCodeS = "\t##### Initialize Sequence :"+i+"#####\n";
                                        mipsCodeS += m.textInitSequence(i, sequence, functionState, address, (int)varsH.get(i).get("line"), (int)varsH.get(i).get("pos"));
                                        mipsCodeS += "\t#######################################\n";
                                    }else{
                                        //this means that we need to create the sequence if it is empty when the functionState is set to 'true'
                                        if(functionState==true){
                                            mipsCodeS = "\t##### Initialize Sequence :"+i+"#####\n";
                                            mipsCodeS += m.textInitSequence(i, null, functionState, address, (int)varsH.get(i).get("line"), (int)varsH.get(i).get("pos"));
                                            mipsCodeS += "\t#######################################\n";
                                        }else{
                                            mipsCodeS = m.textInitSequence(i, null, functionState, address, (int)varsH.get(i).get("line"), (int)varsH.get(i).get("pos"));
                                        }
                                    }
                                    address += m.numberOfBytesForEachAddress();
                                    varsH.get(i).put("mips",mipsCodeS);

                                    System.out.println("INIT SEQUENCE: "+i);
                                    if(sequence != null){
                                        for(Integer v : sequence){
                                            System.out.print("["+v.toString()+"]->");
                                        }
                                    }
                                    System.out.println("*");
                                    System.out.println("END SEQUENCE");
                                    System.out.println("MIPSCODE SEQUENCE:\n"+mipsCodeS);
                                }
                            }

                            //Testing the type of the variables and the type of types ! if they ain't equals then we must throw an error
                            for(String i : varsH.keySet()){
                                HashMap<String, Object> varInfo = (HashMap<String, Object>)varsH.get(i);
                                boolean s=false;
                                for(String j : varInfo.keySet()){
                                    String type = (String) varInfo.get("type");
                                    if(type!=null && !type.equals($type.typeS) && s==false){
                                        e.addMessage((int)varInfo.get("line"),(int)varInfo.get("pos"),ErrorMessage.semantic(i,ErrorMessage.type((String)varInfo.get("type"),$type.typeS)));
                                        s=true;
                                    }
                                }
                            }


                            //Print the HashMap<String, HashMap<String,Object>> varsH
                            for(String i : varsH.keySet()){
                                System.out.println("Variable: "+i+" "+varsH.get(i).toString()+"\n");
                            }


                            $idTH.add(e,varsH,$type.typeS,level);




                            //MIPS
                            if(functionState == false){
                                m.addDataInstructions(varsH,$type.typeS);
                            }else if(functionState == true){
                                System.out.println($idTH.toString());
                                m.addDataFunctionInstructions(varsH, $type.typeS);
                            }
                     }
                     ;

vars [IdentifiersTable idTH]
     returns [HashMap<String, HashMap<String,Object>> varsS]
     @init{
        HashMap<String, HashMap<String,Object>> info = new HashMap<String, HashMap<String,Object>>();
     }
     : v1=var[idTH]
            {
                if(!info.containsKey($var.text)){
                    info.put($var.idS,$var.infoVarS);
                }else{
                    e.addMessage((int)$var.infoVarS.get("line"),(int)$var.infoVarS.get("pos"),ErrorMessage.semantic($var.text,ErrorMessage.Declarations));
                }

            }
       (',' v2=var[idTH]
                {
                    if(!info.containsKey($var.text)){
                        info.put($var.idS,$var.infoVarS);
                    }else{
                        e.addMessage((int)$var.infoVarS.get("line"),(int)$var.infoVarS.get("pos"),ErrorMessage.semantic($var.text,ErrorMessage.Declarations));
                    }
                }
       )*


       {
            $varsS = info;
       }

     ;

var [IdentifiersTable idTH]
    returns[String idS, HashMap<String,Object> infoVarS]
    @init{
        HashMap<String, Object> info = new HashMap<String, Object>();
    }
    : i=identifier v=value_var[idTH]
    {
        info.put("pos",$i.pos);
        info.put("line",$i.line);

        if($v.typeS!=null){
            info.put("type",$v.typeS);
        }

        if($v.setS!=null){
            info.put("set",$v.setS);
        }
        if($v.mipsCodeS != null){
            info.put("mips",$v.mipsCodeS);

        }
        if($v.typeS != null && $v.typeS.equals("array")){
            info.put("accessArray", $v.accessArrayS);
        }

        if($v.typeS != null && $v.typeS.equals("sequence")){
            info.put("sequence", $v.sequenceS);
        }

        $idS = $identifier.text;
        $infoVarS = info;
    }
    ;

value_var [IdentifiersTable idTH]
          returns [Set setS, String typeS, String mipsCodeS, ArrayList<ArrayList<Integer>> accessArrayS, LinkedList<Integer> sequenceS]
          @init{
            Set set = null;
            $mipsCodeS = null;
            $typeS = null;
          }
          :                            { $setS = set; $typeS = null;}
          | '=' i=inic_var[idTH, set]  {
                //if(isSet){ set = $i.setS; $setS = set;}
                set = $i.setS; $setS = set;
                $typeS = $i.typeS;
                $mipsCodeS = $i.mipsCodeS;
                if($i.typeS != null && $i.typeS.equals("array")){
                    $accessArrayS = $i.accessArrayS;
                }else if($i.typeS != null && $i.typeS.equals("sequence")){
                    $sequenceS = $i.sequenceS;
                }
          }
          ;

type returns[String typeS, ArrayList<Integer> arrayDimension]
     : 'integer' {$typeS = "integer"; }
     | 'boolean' {$typeS = "boolean";}
     | 'set'     {$typeS = "set";}
     | 'sequence'{$typeS = "sequence";}
     | 'array' 'size' dimension {$typeS = "array"; $arrayDimension = $dimension.arrayDimension;}
     ;

typeReturnSubProgram
     returns[String typeS]
     : 'integer' {$typeS = "integer"; }
     | 'boolean' {$typeS = "boolean";}
     ;

dimension returns [ArrayList<Integer> arrayDimension]
          @init{
            ArrayList<Integer> vars = new ArrayList<Integer>();
          }
          : number      {vars.add($number.numberS);}
            (',' number {vars.add($number.numberS);} )*  { $arrayDimension = vars;}
          ;

inic_var [IdentifiersTable idTH, Set set]
         returns [String typeS, int line, int pos,Set setS, Node treeS, String mipsCodeS, ArrayList<ArrayList<Integer>> accessArrayS, LinkedList<Integer> sequenceS]
         @init{
            $treeS = null;

            $mipsCodeS = null;
            ArrayList<Integer> a= new ArrayList<Integer>();
            ArrayList<ArrayList<Integer>> accessArray = new ArrayList<ArrayList<Integer>>();
            LinkedList<Integer> sequence = new LinkedList<Integer>();
         }
         : c=constant               {$typeS = $constant.typeS; $line = $constant.line; $pos = $constant.pos; $mipsCodeS = $c.mipsCodeS; Node n = new Node(new String($c.text)); $treeS = n; /*if(isSet && $set!=null){ Node n = new Node(new String($c.text)); $treeS = n; }*/ }
         | a=array_definition[a, accessArray] {
                                                    //$typeS = "integer";
                                                    $typeS = "array";

                                                    $accessArrayS = accessArray;
                                                    $line = $a.line;
                                                    $pos = $a.pos;
                                              }
         | s1=set_definition[idTH]  {$typeS = "set"; $line = $s1.line; $pos = $s1.pos; $treeS = $s1.treeS; $setS = $s1.setS;/*if(isSet && $s1.treeS!=null){$treeS = $s1.treeS;} if(isSet && $s1.setS!=null){$setS = $s1.setS;}*/}
         | s2=sequence_definition[sequence]   {$typeS = "sequence"; $line = $s2.line; $pos = $s2.pos; $treeS = $s2.treeS; $sequenceS = sequence; /*if(isSet && $set!=null){$treeS = $s2.treeS;}*/}
         ;

constant returns [String typeS, int line, int pos, String mipsCodeS]
         : sign number   {
                            $typeS = "integer"; $line = $number.line; $pos = $number.pos;
                            if(isDeclarations){
                                if(functionState == false){
                                    //Works perfectly
                                    $mipsCodeS = m.dataWord($sign.text+$number.text,$number.line,$number.pos);
                                }else{
                                    $mipsCodeS = m.loadImmediateWord($sign.text+$number.text,$number.line,$number.pos);
                                }
                            }else{
                                $mipsCodeS = m.loadImmediateWord($sign.text+$number.text,$number.line,$number.pos);
                                //System.out.println("TODO: "+$mipsCodeS);
                            }
                         }
         | t='true'      {$typeS = "boolean"; $line = $t.line; $pos = $t.pos; if(isDeclarations){ if(functionState == false){$mipsCodeS = m.dataBoolean(true,$t.line,$t.pos);}else{$mipsCodeS = m.loadBoolTrue($t.line,$t.pos);}}else{ $mipsCodeS = m.loadBoolTrue($t.line,$t.pos);} }
         | f='false'     {$typeS = "boolean"; $line = $f.line; $pos = $f.pos; if(isDeclarations){ if(functionState == false){$mipsCodeS = m.dataBoolean(false,$f.line,$f.pos);}else{$mipsCodeS = m.loadBoolFalse($f.line, $f.pos);}}else{ $mipsCodeS = m.loadBoolFalse($f.line, $f.pos);} }
         ;

sign :
     | '+'
     | '-'
     ;

/* ****** Array definition ****** */

array_definition [ArrayList<Integer> a, ArrayList<ArrayList<Integer>> accessArray]
                 returns [int line, int pos]
                 : b='[' array_initialization[a,accessArray] ']'{$line = $b.line; $pos = $b.pos;}
                 ;

array_initialization [ArrayList<Integer> a, ArrayList<ArrayList<Integer>> accessArray]
                     @init{
                        int position = 0;
                     }
                     : {a.add(position);} elem[a,accessArray] {position++;} (','{a.remove(a.size()-1);a.add(position);} elem[a,accessArray] {position++;})*

                        {a.remove(a.size()-1);}
                     ;

elem [ArrayList<Integer> a, ArrayList<ArrayList<Integer>> accessArray]
     : number           {
                            ArrayList<Integer> m = new ArrayList<Integer>();
                            for(Integer i: a){
                                //System.out.print(i.toString()+" ");
                                m.add(i);
                            }
                            //System.out.println(" = "+$number.text);
                            m.add(Integer.valueOf($number.text));
                            accessArray.add(m);
                        }
     | array_definition[a, accessArray]
     ;

/* ****** Sequence definition ****** */

sequence_definition [LinkedList<Integer> sequence]
                    returns [Node treeS, int line, int pos]
                    : '<<' s=sequence_initialization[sequence] { Node n = new Node(new String("sequence"),null,$s.treeS); $treeS = n; /*if(isSet){Node n = new Node(new String("sequence"),null,$s.treeS); $treeS = n;}*/}'>>'
                    ;

sequence_initialization [LinkedList<Integer> sequence]
                        returns [Node treeS]
                        :             { $treeS = null; /*if(isSet){$treeS = null;}*/}
                        | v=values[sequence]    { $treeS = $v.treeS; /*if(isSet){$treeS = $v.treeS;}*/}
                        ;

values [LinkedList<Integer> sequence]
       returns [Node treeS]
       @init{
            Node head = null;
            Node m = null;
       }
       : n1=number    { sequence.add(Integer.valueOf($number.text)); head = new Node(new String("args"),new Node(new String($n1.text),null,null),null); m = head; /*if(isSet){head = new Node(new String("args"),new Node(new String($n1.text),null,null),null); m = head;}*/}
       (',' n2=number { sequence.add(Integer.valueOf($number.text)); m.setRight(new Node(new String("args"),new Node(new String($n2.text),null,null),null)); m = m.getRight(); /*if(isSet){m.setRight(new Node(new String("args"),new Node(new String($n2.text),null,null),null)); m = m.getRight();}*/}
       )*

       {
        /*if(isSet && head!=null){
            $treeS = head;
        }*/
        if( head!=null){ //For sets
            $treeS = head;
        }
       }
       ;

/* ****** Set definition ****** */

set_definition [IdentifiersTable idTH]
               returns [Set setS, Node treeS,int line, int pos]
               : m='{'
                   s=set_initialization[idTH] {$line = $m.line; $pos = $m.pos;$setS = $s.setS; $treeS = $s.treeS; if($s.setS!=null){/*System.out.println("SET_DEFINITION: {"+$s.text+"} -> "+$s.setS.toString());*/}}
                 '}'
                 {isSet = false;}
               ;

set_initialization [IdentifiersTable idTH]
                   returns [Set setS, Node treeS]
                   @init{
                      isSet = true;
                      Set s = null;
                      Node tree = null;
                   }
                   :                    { s = new Set("x"); $setS = s; $treeS=null;}                //o set é vazio, é o nada
                   | i=identifier
                   {
                     //s = new Set($i.text,tree);
                     s = new Set($i.text);
                   }
                    '|'
                    e=expression[idTH,s]
                   {
                    if( !($e.typeS != null && $e.typeS.equals("boolean")) ){
                        e.addMessage($e.line,$e.pos,ErrorMessage.semantic($e.text,ErrorMessage.type($e.typeS,"boolean")));
                    }

                    //if($e.treeS!=null && isSet && $e.typeS != null && $e.typeS.equals("boolean")){                                              //só se pode adicionar caso a expressao for booleano !
                    if($e.treeS!=null && $e.typeS != null && $e.typeS.equals("boolean")){
                        s.setHead($e.treeS);
                        $treeS = $e.treeS;
                    }else{
                        //s.isntASet(); //se nao é booleano deve-se enviar o conjunto vazio ( que é constituido por identifier nao nulo e
                    }
                    $setS = s;

                   }
                   ;

/* ****** SubProgram definition ****** */

subprogram_definition[IdentifiersTable idTH]

                      @init{
                        HashMap<String,Object> varInfo = new HashMap<String, Object>();

                        //If level == 0 , then it means that it will enter to a subprogram and must activate the flag of functionState (state which is saying if it is on a subprogram or not) to true !!!
                        if(level == 0){functionState = true;}
                        level++;
                        $idTH.setAddress(0);
                      }
                      : 'subprogram' i=identifier { m.addNameFunction($i.text); }
                        '(' f=formal_args[idTH] ')' r=return_type
                        {
                            //Info we must create for adding to the identifier table (regarding to the FUNCTION)
                            varInfo.put("line",$i.line);
                            varInfo.put("pos",$i.pos);
                            varInfo.put("return",$r.typeS);
                            varInfo.put("numberArguments", $f.numberArgumentS);
                            varInfo.put("typeList",$f.typeListS);
                            varInfo.put("nameFunction",$i.text);
                        }

                        f2=f_body[idTH, varInfo]

                        {
                            //MIPS
                            System.out.println(level+" WOOOTTTTT");
                            String mipsCodeS = m.textEndFunction($idTH.getSizeSP(level),$f2.returnMipsCodeS);
                            m.addMipsCodeFunction(m.getNameFunction(),mipsCodeS);
                            m.removeMipsCodeFunction();


                            //Pre-Condition : Remover todas as variaveis do nivel actual
                            $idTH.removeLevel(level);
                            //System.out.println(m.getNameFunction());
                            m.removeNameFunction();

                            //Remove the last SP !
                            if(level != 0){
                                $idTH.popSP();
                            }
                            //Decrease level by one
                            level--;

                            if( ($r.typeS!=null && $f2.typeS!=null && !$r.typeS.equals($f2.typeS))){
                                e.addMessage($i.line,$i.pos,ErrorMessage.semanticSubProgram($i.text,ErrorMessage.returnType($f2.typeS,$r.typeS)));
                            }
                            //Note that the regular expression is done for looking some text to $r.text!
                            if($r.text.matches(".+") && $r.typeS==null){
                                e.addMessage($i.line,$i.pos,ErrorMessage.semanticSubProgram($i.text,ErrorMessage.returnTypePossible()));
                                System.out.println("RETURN TEXT: "+$r.text+" LINE: "+$i.line+" REGEX RES: "+$r.text.matches(".+"));
                            }



                            //If the level is equal to zero, then it means that it exited a subprogram and the behaviour is different from now on ! Everything is related to global variables !
                            if(level == 0){functionState = false; }

                        }
                      ;

f_body[IdentifiersTable idTH, HashMap<String,Object> varInfo]
      returns [String typeS, String returnS, String returnMipsCodeS]
       : '{'
         'declarations' {isDeclarations = true;}    declarations[idTH, varInfo]
         'statements'   {isDeclarations = false; String mipsCodeS = "\t#########BEGIN STATEMENTS#########\n"; m.addMipsCodeFunction(m.getNameFunction(),mipsCodeS);}
         statements[idTH] {mipsCodeS = "\t##########END STATEMENTS##########\n"; m.addMipsCodeFunction(m.getNameFunction(),mipsCodeS);}
         r=returnSubPrg[idTH] {$typeS = $r.typeS; $returnS = $r.text; $returnMipsCodeS = $r.mipsCodeS;}
         '}'
       ;

/* ****** Formal args ****** */

formal_args [IdentifiersTable idTH]
            returns[int numberArgumentS, LinkedList<String> typeListS]
            :                   { $numberArgumentS = 0; $typeListS = null;}
            | f=f_args[idTH]    { $numberArgumentS = $f.numberArgumentS; $typeListS = $f.typeListS;}

            ;

f_args  [IdentifiersTable idTH]
        returns [int numberArgumentS, LinkedList<String> typeListS]
        @init{
            int numberArgument = 0;
            LinkedList<String> typeList = new LinkedList<String>();
        }
        : f1=formal_arg
          {
            numberArgument++;
            $idTH.add(e,$f1.hashmapVarS,$f1.typeS,level);
            typeList.add($f1.typeS);
          }
          (',' f2=formal_arg
          {
            numberArgument++;
            $idTH.add(e,$f2.hashmapVarS,$f2.typeS,level);
            typeList.add($f2.typeS);
          }
          )*

          {
            $numberArgumentS = numberArgument;
            $typeListS = typeList;
          }
        ;

formal_arg
           returns[HashMap<String,HashMap<String,Object>> hashmapVarS, String typeS ]
           @init{
            HashMap<String,Object> varInfo = new HashMap<String, Object>();
            HashMap<String, HashMap<String, Object>> hashmapVar = new HashMap<String, HashMap<String,Object>>();
           }
           : i=identifier '->' t=type
           {
            varInfo.put("line",$i.line);
            varInfo.put("pos",$i.pos);

            if($t.typeS.equals("array")){
                varInfo.put("dimension",$type.arrayDimension);
            }

            hashmapVar.put($i.text,varInfo);
            $hashmapVarS = hashmapVar;
            $typeS = $t.typeS;
           }
           ;

/* ****** Return type ****** */

return_type
            returns [String typeS]
            :                               {$typeS = null;}
            | '->' t=typeReturnSubProgram   {$typeS = $t.typeS;}
            ;

/* ****** Return ****** */

returnSubPrg [IdentifiersTable idTH]
             returns [String typeS, int line, int pos, String mipsCodeS]
             @init{
                Set tree = null;
                $typeS = null;

             }
             :                                   {$mipsCodeS = null;}
             | r='return' e=expression[idTH,tree]{$typeS = $e.typeS; $mipsCodeS = $e.mipsCodeS;} ';'
             ;

/* ****** Statements ****** */

statements [IdentifiersTable idTH]
           returns [int line, int pos]
            : ({ m.resetRegister(); }s=statement[idTH] { $line = $s.line; $pos = $s.pos; })*
            ;

statement [IdentifiersTable idTH]
          returns [int line, int pos]
          @init{
            Set set = null;
          }
          : a=assignment[idTH] ';'          {$line=$a.line; $pos=$a.pos;}           //done
          | w=write_statement[idTH] ';'     {$line=$w.line; $pos=$w.pos;}           //done
          | r=read_statement[idTH] ';'      {$line=$r.line; $pos=$r.pos;}           //done
          | c=conditional_statement[idTH]   {$line=$c.line; $pos=$c.pos;}           //done
          | i=iterative_statement[idTH]     {$line=$i.line; $pos=$i.pos;}           //done
          | f=function_call[idTH, set] ';'  {$line=$f.line; $pos=$f.pos;}
          | s=succ_or_pred[idTH] ';'        {$line=$s.line; $pos=$s.pos;}           //done
          | copy_statement[idTH] ';' //conjunto de sequencias
          | cat_statement[idTH] ';' // conjuntos de sequencias
          ;

/* ****** Assignment ****** */

assignment [IdentifiersTable idTH]
           returns [String typeS,int line, int pos]
           @init{
                $typeS = null;
                Set set = null;
                String side = "left";
           }
           : d=designator[idTH, set, side] r='=' e=expression[idTH,set]
           {
              $line = $r.line;
              $pos = $r.pos;
                  if(($designator.typeS != null && $expression.typeS != null) && $designator.typeS.equals($expression.typeS)){
                    $typeS = $designator.typeS;
                    System.out.println($designator.line+"Funcionou ;D");

                    //MIPS
                    if($expression.mipsCodeS != null){
                        //System.out.println("INICIO <- assignment");
                        //System.out.println($expression.mipsCodeS);
                        //System.out.println("FIM <- assignment");
                        String mipsCodeS = "";
                        if($designator.arrayS == false){
                            mipsCodeS = $expression.mipsCodeS;
                            //System.out.println("####################### ASSIGNMENT SEQUENCE #######################");
                            //System.out.println(mipsCodeS);
                            //System.out.println("###################################################################");
                            if($idTH.getInfoIdentifiersTable($designator.text).getLevel().equals(0)){
                                if($designator.typeS.equals("sequence")){
                                    mipsCodeS += m.textStoreSequence($designator.text, functionState, $idTH.getValueSP(level,$designator.text), $designator.line, $designator.pos);
                                }else if($designator.typeS.equals("array")){
                                    Array designator = (Array) $idTH.getInfoIdentifiersTable($designator.text);
                                    Array expression = (Array) $idTH.getInfoIdentifiersTable($expression.text);

                                    //designator variable is level 0, we need to check the level of variable expression. It might be level 0 or any others level
                                    if(designator!=null && expression!=null){
                                        if($idTH.limitsAndDimensionOfArraysEquals(designator, expression)){
                                            if(expression.getLevel().equals(0)){
                                                Integer numberOfPositionToCopy = 1;
                                                for(Integer limit : expression.getLimits()){
                                                    numberOfPositionToCopy*=limit;
                                                }
                                                //System.out.println("Number Of Position to copy for the array: "+numberOfPositionToCopy);

                                                for(int i=0; i<numberOfPositionToCopy;i++){
                                                    mipsCodeS += m.loadImmediateWord(Integer.toString(i*4),$e.line,$e.pos); //this load the position of the array to the register
                                                    mipsCodeS += m.loadWordValueArrayWithName($e.text, $e.line, $e.pos);//need to load the value of the position of the array
                                                    mipsCodeS += m.copyWordArray($d.text, $d.line, $d.pos);
                                                }

                                            }else{
                                                Integer numberOfPositionToCopy = 1;
                                                for(Integer limit : expression.getLimits()){
                                                    numberOfPositionToCopy*=limit;
                                                }
                                                //System.out.println("Number Of Position to copy for the array: "+numberOfPositionToCopy);

                                                for(int i=0; i<numberOfPositionToCopy*4;i+=4){
                                                    mipsCodeS += m.loadImmediateWord(""+i,$e.line,$e.pos); //this load the position of the array to the register
                                                    mipsCodeS += m.loadWordSP($idTH.getValueSP(level, $e.text)+i);
                                                    mipsCodeS += m.copyWordArray($d.text, $d.line, $d.pos);
                                                }
                                            }
                                        }else{
                                            //Throw error of dimension and limits
                                            e.addMessage($designator.line,-1,ErrorMessage.semantic($d.text+" "+$r.text+" "+$e.text,ErrorMessage.limitsAndDimensionsNotEqualForBothArrays()));
                                        }
                                    }


                                }else{
                                    mipsCodeS += m.storeWord($designator.text, $designator.line, $designator.pos);
                                }
                            }else{ //if(!$idTH.getInfoIdentifiersTable($designator.text).getLevel().equals(0)){
                                if($designator.typeS.equals("sequence")){
                                    mipsCodeS += m.textStoreSequence($designator.text, functionState, $idTH.getValueSP(level,$designator.text), $designator.line, $designator.pos);
                                }else if($designator.typeS.equals("array")){
                                    Array designator = (Array) $idTH.getInfoIdentifiersTable($designator.text);
                                    Array expression = (Array) $idTH.getInfoIdentifiersTable($expression.text);

                                    if(designator!=null && expression!=null){
                                        if($idTH.limitsAndDimensionOfArraysEquals(designator, expression)){
                                            if(expression.getLevel().equals(0)){
                                                System.out.println("WOOT3");
                                                Integer numberOfPositionToCopy = 1;
                                                for(Integer limit : expression.getLimits()){
                                                    numberOfPositionToCopy*=limit;
                                                }
                                                //System.out.println("Number Of Position to copy for the array: "+numberOfPositionToCopy);

                                                for(int i=0; i<numberOfPositionToCopy*4;i+=4){
                                                    mipsCodeS += m.loadImmediateWord(""+i, $e.line, $e.pos);
                                                    mipsCodeS += m.loadWordValueArrayWithName($e.text, $e.line, $e.pos);
                                                    mipsCodeS += m.copyWordValueArraySP($idTH.getValueSP(level, $d.text)+i);
                                                }

                                            }else{
                                                Integer numberOfPositionToCopy = 1;
                                                for(Integer limit : expression.getLimits()){
                                                    numberOfPositionToCopy*=limit;
                                                }
                                                //System.out.println("Number Of Position to copy for the array: "+numberOfPositionToCopy);

                                                for(int i=0; i<numberOfPositionToCopy*4;i+=4){
                                                    mipsCodeS += m.loadWordSP(i+$idTH.getValueSP(level, $e.text));
                                                    mipsCodeS += m.storeWordSP(i+$idTH.getValueSP(level, $d.text));

                                                }
                                            }
                                        }else{
                                            //Throw error of dimension and limits
                                            e.addMessage($designator.line,-1,ErrorMessage.semantic($d.text+" "+$r.text+" "+$e.text,ErrorMessage.limitsAndDimensionsNotEqualForBothArrays()));
                                        }
                                    }

                                }else{
                                    mipsCodeS += m.storeWordSP($idTH.getValueSP(level,$designator.text));
                                }
                            }
                            //m.addTextInstruction($designator.text,$expression.mipsCodeS,$designator.typeS,$designator.line,$designator.pos);
                        }else if($designator.arrayS == true){
                            mipsCodeS = $designator.mipsCodeS;
                            mipsCodeS += $expression.mipsCodeS;
                            System.out.println("Designator: "+$designator.text+" = "+$expression.text);
                            System.out.println("MIPSCODE: \n"+mipsCodeS);
                            mipsCodeS += m.storeWordArrayText($designator.identifierS, $designator.line, $designator.pos); //<- problem here
                        }
                        if(functionState == false){
                            System.out.println("ENTREI AQUI: "+$d.text+"\nMIPSCODE: "+mipsCodeS);
                            m.addTextInstruction(mipsCodeS);
                        }else if(functionState == true){
                            m.addMipsCodeFunction(m.getNameFunction(),mipsCodeS);
                        }
                    }else{
                        //This means that it is a set (For this particular case: f= f++g)
                        if($d.typeS.equals("set")){
                            if($e.setS!=null){
                                Set s1 = $e.setS ;
                                if($idTH.doesExist($d.text)){
                                    Application.SymbolTable.Set s = (Application.SymbolTable.Set) $idTH.getInfoIdentifiersTable($d.text);
                                    s.setSet(s1);
                                }
                            }
                        }
                    }
                  }else{
                    e.addMessage($designator.line,-1,ErrorMessage.semanticAssignment($designator.line)); //-1 => assignemen error => there is no pos.
                  }




           }
           ;

/* ****** Designator ****** */

designator [IdentifiersTable idTH, Set set, String side]
            returns [String identifierS, String typeS, int line, int pos, Node treeS, String mipsCodeS, boolean arrayS]
            @init{
                $typeS = null;
                $treeS = null;
                $mipsCodeS = null;

            }
           : i=identifier a=array_access[idTH, set, $identifier.text]
           {
                                $identifierS = $identifier.text;
                                $arrayS = $array_access.response;
                                $line = $identifier.line;
                                $pos = $identifier.pos;
                                //Pre-Condicao: é um identificador
                                if(!$array_access.response){
                                    //Pre-Condicao: ver se existe na tabela de identificador
                                    if(!isSet && !$idTH.getIdentifiersTable().containsKey($identifier.text)){

                                        //ErrorMessage.errorSemantic($identifier.text,$identifier.line,$identifier.pos,ErrorMessage.errorStatements);
                                        e.addMessage($identifier.line,$identifier.pos,ErrorMessage.semantic($identifier.text,ErrorMessage.Statements));

                                    }else{
                                        //Só se pode buscar os elementos que estao na tabela de identificador ! Casos como variaveis livres de um conjunto, nao podem ser pesquisado ! Daí o '!isSet'
                                        //if(!isSet && !$idTH.getInfoIdentifiersTable($identifier.text).getCategory().equals(new String("TYPE"))){
                                        if($idTH.doesExist($identifier.text)){
                                            if(!isSet && !$idTH.getInfoIdentifiersTable($identifier.text).getCategory().equals(new String("TYPE"))){
                                                if($idTH.getInfoIdentifiersTable($identifier.text) instanceof Var){
                                                    Var v = (Var) $idTH.getInfoIdentifiersTable($identifier.text);
                                                    $typeS = v.getInfoType();

                                                    //MIPS

                                                        if($side.equals("right")){
                                                            if($typeS.equals("integer") || $typeS.equals("boolean")){
                                                                if(v.getLevel().equals(0)){
                                                                    $mipsCodeS = m.loadWord($i.text, $i.line, $i.pos);
                                                                    //System.out.println($mipsCodeS);
                                                                }else if(!v.getLevel().equals(0)){
                                                                    int addressOfVariable = $idTH.getValueSP(level,$i.text);
                                                                    $mipsCodeS = m.loadWordSP(addressOfVariable);
                                                                    //$mipsCodeS = m.loadWord($i.text, $i.line, $i.pos);
                                                                    System.out.println($mipsCodeS+" "+$identifier.text+" line: "+$i.line);
                                                                }
                                                            }else if($typeS.equals("array")){
                                                                if(v.getLevel().equals(0)){
                                                                    if($mipsCodeS==null){
                                                                        System.out.println("Identifier: "+$identifier.text+" Type: "+$typeS+" Level: "+v.getLevel());
                                                                        $mipsCodeS = "";
                                                                    }
                                                                }else if(!v.getLevel().equals(0)){
                                                                    System.out.println($typeS+" Level: "+v.getLevel());
                                                                    $mipsCodeS = "";
                                                                }
                                                            }else if($typeS.equals("sequence")){
                                                                if(v.getLevel().equals(0)){
                                                                    if($mipsCodeS==null){
                                                                        $mipsCodeS = m.loadWord($i.text, $i.line, $i.pos);
                                                                    }
                                                                }else if(!v.getLevel().equals(0)){
                                                                    if($mipsCodeS==null){
                                                                        int addressOfVariable = $idTH.getValueSP(level,$i.text);
                                                                        //$mipsCodeS = m.loadWord($i.text, $i.line, $i.pos);
                                                                        $mipsCodeS = m.loadWordSP(addressOfVariable);
                                                                    }
                                                                }
                                                            }
                                                        }

                                                }

                                            }
                                        }
                                    }
                                    //if(isSet && $set!=null){
                                    if($set!=null){
                                        Node d = $set.getIdentifier().get(0);  //ver se funciona
                                        $typeS = "integer";
                                        Node n = null;
                                        if(d.getData().equals($identifier.text)){
                                            //n = new Node(d);
                                            n = d;
                                            //System.out.println("NT : designator, é um identificador igual ao identificador do set, i.e., setId:"+d.getData()+" designatorId: "+$identifier.text);
                                        }else{
                                            n = new Node(new String($identifier.text));
                                            //System.out.println("NT : designator, é um identificador que nao é igual ao identificador do set, i.e., setId:"+d.getData()+" designatorId: "+$identifier.text);
                                        }
                                        $treeS = n;
                                    }else{
                                        if($idTH.doesExist($i.text)){
                                            Var v = (Var) $idTH.getInfoIdentifiersTable($i.text);
                                            if(v.getInfoType().equals("integer")){
                                                Node n = new Node(new String($i.text));
                                                $treeS = n;
                                            }
                                        }
                                    }
                                }
                                //Pre-Condicao: é um array
                                else{
                                    //Pre-Condicao: se existe na tabela de identificador
                                    if(!$idTH.getIdentifiersTable().containsKey($identifier.text)){
                                        //ErrorMessage.errorSemantic($identifier.text,$identifier.line,$identifier.pos,ErrorMessage.errorStatements);
                                        e.addMessage($identifier.line,$identifier.pos,ErrorMessage.semantic($identifier.text,ErrorMessage.Statements));

                                    }else{
                                        if($idTH.doesExist($identifier.text)){
                                            Var v = (Var) $idTH.getInfoIdentifiersTable($identifier.text);

                                            if(v!=null && v.getCategory().equals(new String("TYPE"))){
                                                //ErrorMessage.errorSemantic($identifier.text,$identifier.line,$identifier.pos,ErrorMessage.errorStatements);
                                                e.addMessage($identifier.line,$identifier.pos,ErrorMessage.semantic($identifier.text,ErrorMessage.Statements));

                                            }else{
                                                if(v!=null && !v.getInfoType().equals(new String("array"))){
                                                    //ErrorMessage.errorSemantic($identifier.text,$identifier.line,$identifier.pos,ErrorMessage.errorArrayType);
                                                    e.addMessage($identifier.line,$identifier.pos,ErrorMessage.semantic($identifier.text,ErrorMessage.ArrayType));
                                                }else{
                                                    Array a = (Array) v;
                                                    //System.out.println("Dimension: "+a.getDimension());

                                                    //Pre-Condição : Testar as dimensoes do array (feito atraves da seguinta forma : Valor do identifier da TI == valor do identifier)
                                                    if(a.getDimension().compareTo($array_access.dimensionS) == 0){
                                                        //$typeS = v.getInfoType() ;
                                                        $typeS = "integer"; //v[1,1] => inteiro como tipo nao array

                                                        //o codigo do array todo ;D

                                                        if($side.equals("right") && $a.mipsCodeS != null){
                                                            //$mipsCodeS += m.loadWordArray($identifier.text, $identifier.line, $identifier.pos);
                                                            $mipsCodeS = $a.mipsCodeS;
                                                            $mipsCodeS += m.loadWordArray($identifier.text, $identifier.line, $identifier.pos);
                                                        }else{
                                                            $mipsCodeS = $a.mipsCodeS;
                                                        }
                                                        //System.out.println($a.mipsCodeS);


                                                    }else{
                                                        //ErrorMessage.errorSemantic($identifier.text,$identifier.line,$identifier.pos,ErrorMessage.createMessageDimensionArray($array_access.dimensionS,a.getDimension()));
                                                        e.addMessage($identifier.line,$identifier.pos,ErrorMessage.semantic($identifier.text,ErrorMessage.dimensionArray($array_access.dimensionS,a.getDimension())));
                                                        //System.out.println("Dimension demasiadas grandes do array "+$identifier.text);
                                                    }
                                                }
                                            }
                                        }
                                        //if(isSet && $set!=null){
                                        if( $set!=null){
                                            Node m = new Node(new String($identifier.text),null,null);
                                            Node head = new Node(new String("array"),m,$a.treeS);
                                            $treeS = head;
                                        }
                                    }

                                }

           }
           ;

array_access [IdentifiersTable idTH, Set set, String id]
             returns [boolean response, int dimensionS, Node treeS, String mipsCodeS] //response variable => if array_access exists or not
             :                                     {$response = false;}
             | '[' e=elem_array[idTH, set, id] ']' {$response = true; $dimensionS = $elem_array.dimensionS; $treeS = $e.treeS; if($e.mipsCodeS != null){$mipsCodeS = $e.mipsCodeS;}}
                           ;

elem_array [IdentifiersTable idTH, Set set, String id] //id = name of the array
           returns[int dimensionS, Node treeS, String mipsCodeS]
           @init{
                int dimension = 0;
                $treeS = null;
                Node head = null;
                Node right = null;

                //$mipsCodeS = null;
                Array array=null;
                Var typeOfArray = (Var) idTH.getInfoIdentifiersTable(id);
                if($idTH.doesExist(id) && typeOfArray.getInfoType().equals("array")){
                    array= (Array) idTH.getInfoIdentifiersTable(id);
                }

                int n = 1;

           }
           : s1=single_expression[idTH, set]
                                    {
                                        if(array!=null){
                                          dimension++;
                                          if(!($single_expression.typeS == "integer"))
                                               {
                                                //ErrorMessage.errorSemantic($single_expression.text,$single_expression.line,$single_expression.pos,ErrorMessage.type($single_expression.typeS,"integer"));
                                                e.addMessage($single_expression.line,$single_expression.pos,ErrorMessage.semantic($single_expression.text,ErrorMessage.type($single_expression.typeS,"integer")));
                                               }
                                          else{
                                            if(!isSet){
                                                if(array.getDimension() == 1){
                                                    $mipsCodeS = $s1.mipsCodeS;
                                                }else{
                                                    int res = 1;
                                                    for(int i = n; i < array.getDimension(); i++){
                                                        res = res* array.getLimits().get(i);
                                                    }
                                                    $mipsCodeS = $s1.mipsCodeS + m.loadImmediateWord(String.valueOf(res),$s1.line,$s1.pos) + m.textMul($s1.line,$s1.pos);
                                                    //System.out.println($mipsCodeS);
                                                    n++;
                                                }
                                            }
                                          }
                                        }
                                          //if(isSet && $set!=null && head == null){
                                          if( $set!=null && head == null){
                                            head = new Node(new String("args"),$s1.treeS,null);
                                            right = head;
                                          }
                                    }
           (',' s2=single_expression[idTH, set]
                                    {
                                        if(array!=null){
                                            dimension++;
                                            if(!($single_expression.typeS == "integer")){
                                                //ErrorMessage.errorSemantic($single_expression.text,$single_expression.line,$single_expression.pos,ErrorMessage.type($single_expression.typeS,"integer"));
                                                e.addMessage($single_expression.line,$single_expression.pos,ErrorMessage.semantic($single_expression.text,ErrorMessage.type($single_expression.typeS,"integer")));
                                            }else{
                                                if(!isSet){
                                                    if(array.getDimension() == n){
                                                        $mipsCodeS += $s2.mipsCodeS + m.textAdd($s2.line,$s2.pos);
                                                    }else{
                                                        int res = 1;
                                                        for(int i = n; i < array.getDimension(); i++){
                                                            res = res* array.getLimits().get(i);
                                                        }
                                                        $mipsCodeS += $s2.mipsCodeS + m.loadImmediateWord(String.valueOf(res),$s2.line,$s2.pos) + m.textMul($s2.line,$s2.pos) + m.textAdd($s2.line,$s2.pos);
                                                        n++;
                                                    }
                                                }


                                            }
                                        }
                                        //if(isSet && $set!=null){
                                        if( $set!=null){
                                            Node m = new Node(new String("args"),$s2.treeS,null);
                                            right.setRight(m);
                                            right = m;
                                        }
                                    }
           )*
           {
              $dimensionS = dimension;
              //if(isSet && $set!=null && head!=null){
              if( $set!=null && head!=null){
                $treeS = head;
              }

              //gerar o codigo asssembly mips
              if(!isSet){
                  if(array!=null){
                      //Verificar os limites dos arrays se estao na zona do array
                      int res = 1;
                      for(int i = 0; i < array.getDimension(); i++){
                        res = res* array.getLimits().get(i);
                      }
                      $mipsCodeS += m.textLimitsArray(res,$s1.line,$s1.pos);
                      //caso estiver tudo correcto multiplicar o array por 4
                      $mipsCodeS += m.loadImmediateWord(String.valueOf("4"),$s1.line,$s1.pos) + m.textMul($s1.line,$s1.pos);
                      }
              }
           }
           ;

/* ****** Function call ****** */

function_call [IdentifiersTable idTH, Set set]
              returns [Node treeS, int line, int pos, String typeS, String mipsCodeS]
              @init{
                boolean areRegistersBeingUsed = m.areSomeRegistersUsed();
                int numberOfUsedRegisters = 0;
                boolean returnBoolean = false;

                System.out.println("STATE OF AREREGISTERSBEINGUSED FUNCTION: "+areRegistersBeingUsed);

                if(areRegistersBeingUsed){
                    //Info: This means that we need to save the information of the registers in the stack ! Because some Jump call will be called and we need to save the state of those registers for having a consistancy.

                    //We need to calculate how many registers are being used
                    numberOfUsedRegisters = m.numbersOfRegisteresUsedRightNow();
                    //we need to calculate
                    $idTH.pushStateRegistersToSP(numberOfUsedRegisters);
                    $mipsCodeS = m.textSaveStateBeforeCallingFunction(numberOfUsedRegisters);

                    //we need to reset the registers (but i dont know if this worth due to the fact that the function 'textSaveStateBeforeCallingFunction' uses 'freeLastRegister'
                    //m.resetRegister();
                }
              }
              @after{
                    if(areRegistersBeingUsed){
                        //This means that we need to save the information of the registers in the stack ! Because some Jump call will be called and we need to save the state of those registers for having a consistancy.

                        $mipsCodeS += m.textRestoreStateAfterCallingFunction(numberOfUsedRegisters);
                        //m.textRestoreStateAfterEndedCallingFunction(numberOfRegistersUsed)+m.textReturnResultOfSpecialFunctions(line, pos);
                        $idTH.popSP();
                    }
                    if(returnBoolean){
                        $mipsCodeS += m.textReturnResultOfSpecialFunctions($line, $pos);
                    }

                    System.out.println("MIPSCODES SPECIALFUNCTION AFTER: "+$mipsCodeS);
              }
              : i=identifier '(' s=sub_prg_args[idTH, set, $i.text] ')'
                {

                    $line = $i.line;
                    $pos = $i.pos;
                    if($idTH.doesExist($identifier.text) && $idTH.getIdentifiersTable().containsKey($i.text)){
                        System.out.println("IDENTIFIER: "+$identifier.text);
                        System.out.println("GLOBAL LEVEL: "+level);
                        System.out.println("LEVEL OF FUNCTION: "+((Function)$idTH.getInfoIdentifiersTable($i.text)).getLevel());
                        /*!(((Function)$idTH.getInfoIdentifiersTable($i.text)).getLevel()<level)
                        *This is a test for testing the level of the function and the global level for cycle redundacy (infinite cycle)
                        */

                        //if($idTH.getInfoIdentifiersTable($i.text) instanceof Function && !(((Function)$idTH.getInfoIdentifiersTable($i.text)).getLevel()<level)){
                        if($idTH.getInfoIdentifiersTable($i.text) instanceof Function){
                            Function f = (Function) $idTH.getInfoIdentifiersTable($i.text);
                            $typeS = f.getInfoType();

                            //MIPS
                            //boolean returnBoolean = false;
                            //if(!$typeS.equals(null)){
                            if($typeS!=null){
                                returnBoolean = true;
                            }

                            System.out.println("FUNCTION: "+ $i.text+" Line: "+$i.line+" Pos: "+$i.pos);

                            if(!areRegistersBeingUsed){$mipsCodeS = "";}
                            $mipsCodeS += m.textFunctionCall(m.getNameFunction()+$i.text, $i.line, $i.pos, returnBoolean,$s.argumentsMipsCodeS, true); // TODO: we need to change the 'true' value to a variable for checking if the register was called or not!


                            System.out.println("FUNCTION CALL HERE : ");
                            System.out.println($mipsCodeS);
                            System.out.println("FUNCTION CALL END : ");
                        }else{
                            e.addMessage($i.line,$i.pos,ErrorMessage.semanticSubProgram($i.text,ErrorMessage.warningRecursivityFunction()));
                        }
                    }else{
                        $typeS = null;
                        e.addMessage($i.line,$i.pos,ErrorMessage.semanticSubProgram($i.text,ErrorMessage.functionDoesntExist()));
                    }

                    if( $set!=null){
                        Node m = new Node(new String("call"),new Node(new String($i.text),null,null),$s.treeS);
                    }
                }
              ;

sub_prg_args [IdentifiersTable idTH, Set set,String nameOfTheFunction]
             returns [Node treeS, String argumentsMipsCodeS]
             :                                          { $argumentsMipsCodeS = null; $treeS = null; /*if(isSet && $set!=null){$treeS = null;}*/}
             | a=args[idTH, set, nameOfTheFunction]     { $argumentsMipsCodeS = $a.mipsCodeS; $treeS = $a.treeS;/*if(isSet && $set!=null){$treeS = $a.treeS;}*/}
             ;

args [IdentifiersTable idTH, Set set,String nameOfTheFunction]
     returns [Node treeS, String mipsCodeS]
     @init{
        Node head = null;
        Node m1 = null;
        Integer addressOfArgumentsOnSF = 0;
        Integer sizeOfSFFunction = 0;
        if($idTH.doesExist(nameOfTheFunction)){
            sizeOfSFFunction = ((Info)$idTH.getInfoIdentifiersTable(nameOfTheFunction)).getAddress();
        }

     }
     : e1=expression[idTH, set]      {  if(!$e1.typeS.equals("array")){
                                            $mipsCodeS = $e1.mipsCodeS;
                                            $mipsCodeS += m.storeArgumentsSP(-(sizeOfSFFunction-addressOfArgumentsOnSF));
                                        }else if($e1.typeS.equals("array")){
                                            if($idTH.getInfoIdentifiersTable($expression.text) instanceof Var){
                                                Array a = (Array) $idTH.getInfoIdentifiersTable($expression.text);
                                                Integer level = a.getLevel();
                                                System.out.println("SIZE: "+a.getMemorySize());
                                                $mipsCodeS = m.copyArrayArgumentsForFunctions(level,$expression.text,a.getMemorySize(),sizeOfSFFunction-addressOfArgumentsOnSF,$idTH.getValueSP(level,$e1.text),$e1.line,$e1.pos);
                                            }
                                        }
                                        addressOfArgumentsOnSF += m.numberOfBytesForEachAddress();
                                        head = new Node(new String("args"),$e1.treeS,null); m1 = head;/*if(isSet && $set!=null){ head = new Node(new String("args"),$e1.treeS,null); m = head;}*/
                                     }
     (',' e2=expression[idTH, set]   {  if(!$e2.typeS.equals("array")){
                                            $mipsCodeS += $e2.mipsCodeS;
                                            $mipsCodeS += m.storeArgumentsSP(-(sizeOfSFFunction-addressOfArgumentsOnSF));
                                        }else if($e2.typeS.equals("array")){
                                            if($idTH.getInfoIdentifiersTable($expression.text) instanceof Var){
                                                Array a = (Array) $idTH.getInfoIdentifiersTable($expression.text);
                                                Integer level = a.getLevel();
                                                $mipsCodeS += m.copyArrayArgumentsForFunctions(level,$expression.text,a.getMemorySize(),sizeOfSFFunction-addressOfArgumentsOnSF,$idTH.getValueSP(level,$e1.text),$e1.line,$e1.pos);
                                            }
                                        }
                                        addressOfArgumentsOnSF += m.numberOfBytesForEachAddress();
                                        m1.setRight(new Node(new String("args"),$e2.treeS,null));
                                        m1 = m1.getRight();/*if(isSet && $set!=null){ m.setRight(new Node(new String("args"),$e2.treeS,null)); m = m.getRight();}*/
                                     }
     )*

     {
        System.out.println("/*******************ARGUMENTS MIPSCODE***********************/");
        if($mipsCodeS!=null){
            System.out.println($mipsCodeS);
        }else{
            System.out.println("IT IS NULL !!!!");
        }
        System.out.println("/******************************************/");

        //if(isSet && $set!=null){
        if($set!=null){
            $treeS = head;
        }
     }
     ;

/* ****** Expression ****** */

expression [IdentifiersTable idTH, Set set]
            returns [String typeS, int line, int pos, Node treeS, String mipsCodeS,Set setS, boolean relationExp ]
            @init{
                $typeS = null;
                boolean correctType = true;
                boolean relationExp = false;
                Node n = null;
                $mipsCodeS = null;
            }
           : s1=single_expression[idTH, set]{ $line = $s1.line; $pos = $s1.pos; n = $s1.treeS; $setS = $s1.setS; $mipsCodeS = $s1.mipsCodeS;/*if($rel_op.text == null){$mipsCodeS = $s1.mipsCodeS;}*/}
            (rel_op s2=single_expression[idTH,set]
                {   relationExp = true;
                    if(!$rel_op.text.equals("in")){
                        if(($s1.typeS != null) && ($rel_op.text.equals("==") || $rel_op.text.equals("!=")) && $s1.typeS.equals("boolean")){
                            if(($s2.typeS !=null) && ($rel_op.text.equals("==") || $rel_op.text.equals("!=")) && $s2.typeS.equals("boolean")){
                                //MIPS

                                if(!isDeclarations && !isSet){
                                    $mipsCodeS = $mipsCodeS + $s2.mipsCodeS;
                                    //System.out.println("/*****************************123**********************/");
                                    //System.out.println($mipsCodeS);
                                    //System.out.println("/*****************************123**********************/");

                                    if($rel_op.text.equals("==")){
                                        $mipsCodeS = $mipsCodeS + m.textEquals($rel_op.line,$rel_op.pos);
                                    }else if($rel_op.text.equals("!=")){
                                        $mipsCodeS = $mipsCodeS + m.textDifferent($rel_op.line,$rel_op.pos);
                                    }

                                }
                                //System.out.println($mipsCodeS);

                                //END_MIPS
                            }else{
                                correctType = false;
                            }
                        }else if(($s1.typeS != null) && $s1.typeS.equals($rel_op.typeS)){ //Tratar as relacoes em que os tipos sao inteiros e nao booleanos
                            if(($s2.typeS !=null) && $rel_op.typeS.equals($s2.typeS)){
                                $typeS = "boolean";
                                //MIPS
                                    if($rel_op.typeS.equals("integer") && !isDeclarations && !isSet){
                                        $mipsCodeS = $mipsCodeS + $s2.mipsCodeS;
                                        if($rel_op.text.equals("==")){
                                            $mipsCodeS = $mipsCodeS + m.textEquals($rel_op.line,$rel_op.pos);
                                            //$mipsCodeS = $mipsCodeS + m.textSetOnLessThan($rel_op.line,$rel_op.pos) + m.textNot($rel_op.line,$rel_op.pos);
                                            //$mipsCodeS = $mipsCodeS + m.textSetOnGreatThan($rel_op.line,$rel_op.pos) + m.textNot($rel_op.line,$rel_op.pos);
                                            //$mipsCodeS = $mipsCodeS + m.textAnd($rel_op.line,$rel_op.pos);
                                        }else if($rel_op.text.equals("!=")){
                                            $mipsCodeS = $mipsCodeS + m.textDifferent($rel_op.line,$rel_op.pos);
                                            //$mipsCodeS = $mipsCodeS + m.textSetOnLessThan($rel_op.line,$rel_op.pos);
                                            //$mipsCodeS = $mipsCodeS + m.textSetOnGreatThan($rel_op.line,$rel_op.pos);
                                            //$mipsCodeS = $mipsCodeS + m.textOr($rel_op.line,$rel_op.pos);
                                        }else if($rel_op.text.equals(">=")){
                                            //$mipsCodeS = $mipsCodeS + $s2.mipsCodeS;
                                            $mipsCodeS = $mipsCodeS + m.textSetOnLessThan($rel_op.line,$rel_op.pos) + m.textNot($rel_op.line,$rel_op.pos);
                                        }else if($rel_op.text.equals("<=")){
                                            //$mipsCodeS = $mipsCodeS + $s2.mipsCodeS;
                                            $mipsCodeS = $mipsCodeS + m.textSetOnGreatThan($rel_op.line,$rel_op.pos) + m.textNot($rel_op.line,$rel_op.pos);
                                        }else if($rel_op.text.equals("<")){
                                            //$mipsCodeS = $mipsCodeS + $s2.mipsCodeS;
                                            $mipsCodeS = $mipsCodeS + m.textSetOnLessThan($rel_op.line,$rel_op.pos);
                                        }else if($rel_op.text.equals(">")){
                                            //$mipsCodeS = $mipsCodeS + $s2.mipsCodeS;
                                            $mipsCodeS = $mipsCodeS + m.textSetOnGreatThan($rel_op.line,$rel_op.pos);
                                        }
                                    }
                                //END_MIPS
                            }else{
                                correctType = false;
                            }
                        }else{
                            correctType = false;
                        }
                        if(!correctType){
                            e.addMessage($s1.line,$s1.pos,ErrorMessage.semantic($s1.text+" "+$rel_op.text+" "+$s2.text,ErrorMessage.typeExpression($s1.typeS,$rel_op.text,$s2.typeS,$rel_op.typeS,$rel_op.typeS)+" < expression 1"));
                        }
                    }else{
                        // integer 'in' set
                        if(($s1.typeS != null) && ($s1.typeS.equals("integer"))){
                            if(($s2.typeS != null) && ($s2.typeS.equals("set"))){
                                $typeS = "boolean" ;
                            }else{
                                correctType = false;
                            }
                        }else{
                            correctType = false;
                        }
                        if(!correctType){
                            // 'integer' in 'set'
                            e.addMessage($s1.line,$s1.pos,ErrorMessage.semantic($s1.text+" "+$rel_op.text+" "+$s2.text,ErrorMessage.typeExpression($s1.typeS,$rel_op.text,$s2.typeS,"integer","set")+" < expression 2"));
                        }

                        Set s = $s2.setS;
                        if(s!=null && !isDeclarations && $s1.treeS!=null /*&& $rel_op.text.equals("in")*/){ // Only can be built if the rel_op is equals to 'in'
                            System.out.println(s.toString()+" LINE : "+$rel_op.line);
                            s.setIdentifier($s1.treeS);
                            System.out.println(s.toString());
                            //escrever o mips code para gerar !
                            $mipsCodeS = s.mipsCode($idTH,m, $rel_op.line);
                            System.out.println("Constructing the set: "+$mipsCodeS);
                        }else{
                            //This means that s == null or s1.treeS is null
                            if(s==null){
                                System.out.println("S is NULL");
                            }
                            if($s1.treeS==null){
                                System.out.println("S1.treeS is NULL");
                            }

                        }

                    }
                    //if(isSet && $set!=null && !$rel_op.text.equals("in")){ //!$rel_op.text.equals("in") -> the 'in' relation serves for the use of set only
                    if(!$rel_op.text.equals("in")){ //!$rel_op.text.equals("in") -> the 'in' relation serves for the use of set only
                        Node m = new Node(new String($rel_op.text),$s1.treeS,$s2.treeS);
                        n = m;
                    }
                }
            )?
            {

                if(correctType){
                    if(!relationExp){
                        $typeS = $s1.typeS;
                    }else{
                        $typeS = "boolean";
                    }
                }

                $treeS = n;
                $relationExp = relationExp;

            }
           ;

/* ****** Single expression ****** */

single_expression [IdentifiersTable idTH, Set set]
                  returns [String typeS, Set setS, int line, int pos, Node treeS, String mipsCodeS ]
                  @init{
                    $typeS = null;
                    boolean correctType = true;
                    boolean firstTime = true;
                    String leftType = null;
                    Node n = null;
                    $mipsCodeS = null;

                    //Tratar os erros com mais especificaçoes
                    LinkedList<ErrorInfo> errorManagement = new LinkedList<ErrorInfo>();
                  }
                  : t1=term[idTH, set] {$line = $term.line; $pos = $term.pos; errorManagement.add(new ErrorInfo($t1.text,$t1.typeS,$t1.line,$t1.pos)); n = $t1.treeS; $setS = $t1.setS; $mipsCodeS = $t1.mipsCodeS;}
                  (a=add_op t2=term[idTH, set] {
                                        errorManagement.add(new ErrorInfo($add_op.text,$add_op.typeS,$add_op.line,$add_op.pos));
                                        errorManagement.add(new ErrorInfo($t2.text,$t2.typeS,$t2.line,$t2.pos));


                                        if(firstTime){
                                            firstTime = false;
                                            if(($t1.typeS != null) && $t1.typeS.equals($add_op.typeS)){
                                                if(($t2.typeS != null) && $add_op.typeS.equals($t2.typeS)){
                                                    leftType = $add_op.typeS;

                                                    //MIPS
                                                    if($add_op.typeS.equals("integer") && !isDeclarations && !isSet){
                                                        $mipsCodeS = $mipsCodeS + $t2.mipsCodeS;
                                                        if($add_op.text.equals("+")){
                                                            //System.out.println("Line: "+$t1.line+" ERROR");
                                                            $mipsCodeS = $mipsCodeS + m.textAdd($add_op.line,$add_op.pos);
                                                        }
                                                        if($add_op.text.equals("-") && $mipsCodeS != null){
                                                            $mipsCodeS = $mipsCodeS + m.textSub($add_op.line,$add_op.pos);
                                                            //System.out.println($mipsCodeS+" single_expression");
                                                        }
                                                        //}
                                                    }
                                                    //END_MIPS
                                                }else{
                                                    e.addMessage($t1.line,$t1.pos,ErrorMessage.semantic($t1.text+" "+$add_op.text+" "+$t2.text,ErrorMessage.typeExpression($t1.typeS,$add_op.text,$t2.typeS,$add_op.typeS,$add_op.typeS)+" < single_Expression 1"));
                                                    correctType = false;

                                                }
                                            }else{
                                                e.addMessage($t1.line,$t1.pos,ErrorMessage.semantic($t1.text+" "+$add_op.text+" "+$t2.text,ErrorMessage.typeExpression($t1.typeS,$add_op.text,$t2.typeS,$add_op.typeS,$add_op.typeS)+" < single_Expression 2"));
                                                correctType = false;
                                            }
                                            //Construct Set
                                            if($add_op.typeS.equals("set") && !isDeclarations){
                                                if($a.text.equals("++")){
                                                    Set s1 = $t1.setS ;
                                                    Set s2 = $t2.setS;
                                                    if(s1 == null ){
                                                        if($idTH.doesExist($t1.text)){
                                                            Application.SymbolTable.Set s = (Application.SymbolTable.Set) $idTH.getInfoIdentifiersTable($t1.text);
                                                            s1 = s.getSet();
                                                        }else{

                                                        }
                                                    }else{
                                                        System.out.println("SET1 IS NOT NULL!");
                                                        System.out.println(s1.toString());
                                                    }
                                                    if(s2 == null ){
                                                        if($idTH.doesExist($t2.text)){
                                                            Application.SymbolTable.Set s = (Application.SymbolTable.Set) $idTH.getInfoIdentifiersTable($t2.text);
                                                            s2 = s.getSet();
                                                        }else{
                                                            //TODO: sets que nao funciona, bem !!!!
                                                        }
                                                    }else{
                                                        System.out.println("SET2 IS NOT NULL!");
                                                        System.out.println(s2.toString());
                                                    }
                                                    if(s1!=null && s2!=null){
                                                        $setS = new Set(s1,s2,$a.text);
                                                        System.out.println($setS.toString());
                                                    }
                                                }
                                            }
                                        }else{
                                            errorManagement.pop();
                                            errorManagement.pop();

                                            ErrorInfo leftVar = errorManagement.get(0);

                                            if( (leftType != null) && leftType.equals($add_op.typeS)){
                                                if(($t2.typeS != null) && $add_op.typeS.equals($t2.typeS)){
                                                    leftType = $add_op.typeS;

                                                    //MIPS
                                                    if($add_op.typeS.equals("integer") && !isDeclarations && !isSet){
                                                        $mipsCodeS = $mipsCodeS + $t2.mipsCodeS;
                                                        if($add_op.text.equals("+")){
                                                            $mipsCodeS = $mipsCodeS + m.textAdd($add_op.line,$add_op.pos);
                                                        }
                                                        if($add_op.text.equals("-") && $mipsCodeS != null){
                                                            $mipsCodeS = $mipsCodeS + m.textSub($add_op.line,$add_op.pos);
                                                            //System.out.println($mipsCodeS+" single_expression");
                                                        }
                                                    }
                                                    //END_MIPS
                                                }else{
                                                    e.addMessage(leftVar.getLine(),leftVar.getPos(),ErrorMessage.semantic(leftVar.getIdentifier()+" "+$add_op.text+" "+$t2.text,ErrorMessage.typeExpression(leftVar.getType(),$add_op.text,$t2.typeS,$add_op.typeS,$add_op.typeS)+" < single_Expression 3"));
                                                    correctType = false;
                                                }
                                            }else{
                                                e.addMessage(leftVar.getLine(),leftVar.getPos(),ErrorMessage.semantic(leftVar.getIdentifier()+" "+$add_op.text+" "+$t2.text,ErrorMessage.typeExpression(leftVar.getType(),$add_op.text,$t2.typeS,$add_op.typeS,$add_op.typeS)+" < single_Expression 4"));
                                                correctType = false;
                                            }

                                            //Construct Set
                                            if($a.text.equals("++")){
                                                Set s1 = $setS ;
                                                Set s2 = $t2.setS;
                                                if(s1 == null ){
                                                    Application.SymbolTable.Set s = (Application.SymbolTable.Set) $idTH.getInfoIdentifiersTable($t1.text);
                                                    s1 = s.getSet();
                                                }
                                                if(s2 == null ){
                                                    Application.SymbolTable.Set s = (Application.SymbolTable.Set) $idTH.getInfoIdentifiersTable($t2.text);
                                                    s2 = s.getSet();
                                                }
                                                $setS = new Set(s1,s2,$a.text);
                                            }
                                        }

                                        //Constructing the tree for others operators
                                        if(!$a.text.equals("++")){
                                            Node m = new Node(new String($add_op.text),n,$t2.treeS);
                                            n = m;
                                        }
                                     }
                  )* {
                        if(correctType == true){
                            $typeS = $t1.typeS;
                        }

                        $treeS = n;

                     }
                  ;

/* ****** Term ****** */
term [IdentifiersTable idTH, Set set]
     returns [String typeS, Set setS, int line, int pos, Node treeS, String mipsCodeS]
     @init{
        $typeS = null;
        boolean correctType = true;
        boolean firstTime = true;
        String leftType = null;
        $treeS = null;
        Node n = null;
        $mipsCodeS = null;

        //Tratar os erros com mais especificaçoes (queue de erros de informaçoes)
        LinkedList<ErrorInfo> errorManagement = new LinkedList<ErrorInfo>();

     }
     : f1=factor[idTH, set] { $line = $f1.line; $pos = $f1.pos;  errorManagement.add(new ErrorInfo($f1.text, $f1.typeS, $f1.line,$f1.pos)); n = $f1.treeS; if($f1.setS == null && !isDeclarations){ if($idTH.doesExist($f1.text)){if($idTH.getInfoIdentifiersTable($f1.text) instanceof Application.SymbolTable.Set){Application.SymbolTable.Set s = (Application.SymbolTable.Set) $idTH.getInfoIdentifiersTable($f1.text); $setS = s.getSet();}}}else{$setS = $f1.setS;} $mipsCodeS = $f1.mipsCodeS; }
     (m=mul_op f2=factor[idTH, set] {

                                errorManagement.add(new ErrorInfo($mul_op.text,$mul_op.typeS,$mul_op.line,$mul_op.pos));
                                errorManagement.add(new ErrorInfo($f2.text,$f2.typeS,$f2.line,$f2.pos));

                                if(firstTime){
                                    firstTime = false;
                                    if(($f1.typeS != null) && $f1.typeS.equals($mul_op.typeS)){
                                        if(($f2.typeS != null) && $mul_op.typeS.equals($f2.typeS)){
                                            leftType = $mul_op.typeS;

                                            //MIPS
                                            if($mul_op.typeS.equals("integer") && !isDeclarations && !isSet){
                                                $mipsCodeS = $mipsCodeS + $f2.mipsCodeS;
                                                if($mul_op.text.equals("*")){
                                                    $mipsCodeS = $mipsCodeS + m.textMul($mul_op.line,$mul_op.pos);
                                                }
                                                if($mul_op.text.equals("/")){
                                                    $mipsCodeS = $mipsCodeS + m.textDiv($mul_op.line,$mul_op.pos);
                                                }
                                            }

                                        }else{
                                            e.addMessage($f1.line,$f1.pos,ErrorMessage.semantic($f1.text+" "+$mul_op.text+" "+$f2.text,ErrorMessage.typeExpression($f1.typeS,$mul_op.text,$f2.typeS,$mul_op.typeS,$mul_op.typeS)+" < term1"));
                                            correctType = false;
                                        }
                                    }else{
                                        e.addMessage($f1.line,$f1.pos,ErrorMessage.semantic($f1.text+" "+$mul_op.text+" "+$f2.text,ErrorMessage.typeExpression($f1.typeS,$mul_op.text,$f2.typeS,$mul_op.typeS,$mul_op.typeS)+" < term2"));
                                        correctType = false;
                                    }
                                    //Construct Set
                                    if($mul_op.typeS.equals("set") && !isDeclarations){
                                        if($m.text.equals("**")){
                                            Set s1 = $f1.setS ;
                                            Set s2 = $f2.setS;
                                            if(s1 == null ){
                                                if($idTH.doesExist($f1.text)){
                                                    Application.SymbolTable.Set s = (Application.SymbolTable.Set) $idTH.getInfoIdentifiersTable($f1.text);
                                                    s1 = s.getSet();
                                                }
                                            }
                                            if(s2 == null ){
                                                if($idTH.doesExist($f2.text)){
                                                    Application.SymbolTable.Set s = (Application.SymbolTable.Set) $idTH.getInfoIdentifiersTable($f2.text);
                                                    s2 = s.getSet();
                                                }
                                            }
                                            if(s1!=null && s2!=null){
                                                $setS = new Set(s1,s2,$m.text);
                                            }
                                            //System.out.println($setS.toString());
                                            //$setS.setIdentifier(new Node("3"));
                                            //System.out.println($setS.toString());

                                        }
                                    }
                                }else{

                                        errorManagement.pop();
                                        errorManagement.pop();

                                        ErrorInfo leftVar = errorManagement.get(0);

                                        if((leftType != null) && leftType.equals($mul_op.typeS)){
                                            if(($f2.typeS != null) && $mul_op.typeS.equals($f2.typeS)){
                                                leftType = $mul_op.typeS;

                                                //MIPS
                                                if($mul_op.typeS.equals("integer") && !isDeclarations && !isSet){
                                                    $mipsCodeS = $mipsCodeS + $f2.mipsCodeS;
                                                    if($mul_op.text.equals("*")){
                                                        $mipsCodeS = $mipsCodeS + m.textMul($mul_op.line,$mul_op.pos);
                                                    }
                                                    if($mul_op.text.equals("/")){
                                                        $mipsCodeS = $mipsCodeS + m.textDiv($mul_op.line,$mul_op.pos);
                                                    }
                                                }


                                            }else{
                                                e.addMessage(leftVar.getLine(),leftVar.getPos(),ErrorMessage.semantic(leftVar.getIdentifier()+" "+$mul_op.text+" "+$f2.text,ErrorMessage.typeExpression(leftVar.getType(),$mul_op.text,$f2.typeS,$mul_op.typeS,$mul_op.typeS)+" < term3"));
                                                correctType = false;
                                            }
                                        }else{
                                            String identifier = errorManagement.get(0).getIdentifier();
                                            e.addMessage(leftVar.getLine(),leftVar.getPos(),ErrorMessage.semantic(leftVar.getIdentifier()+" "+$mul_op.text+" "+$f2.text,ErrorMessage.typeExpression(leftVar.getType(),$mul_op.text,$f2.typeS,$mul_op.typeS,$mul_op.typeS)+" < term4"));
                                            correctType = false;
                                        }
                                        //Construct Set
                                        if($mul_op.typeS.equals("set") && !isDeclarations){
                                            if($m.text.equals("**")){
                                                Set s1 = $setS ;
                                                Set s2 = $f2.setS;
                                                if(s1 == null ){
                                                    Application.SymbolTable.Set s = (Application.SymbolTable.Set) $idTH.getInfoIdentifiersTable($f1.text);
                                                    s1 = s.getSet();
                                                }
                                                if(s2 == null ){
                                                    Application.SymbolTable.Set s = (Application.SymbolTable.Set) $idTH.getInfoIdentifiersTable($f2.text);
                                                    s2 = s.getSet();
                                                }
                                                $setS = new Set(s1,s2,$m.text);

                                            }
                                        }
                                }

                                //Constructing the tree for others operators
                                if(!$m.text.equals("**")){
                                    Node m = new Node(new String($m.text),n,$f2.treeS);
                                    n = m;
                                }
                          }
     )* {
            if(correctType == true){
                $typeS = $f1.typeS;
            }
            $treeS = n;


        }
     ;

/* ****** Factor ****** */

factor [IdentifiersTable idTH,Set set] //vai ser preciso ver as pre-condiçoes de todos as alternativas feitas
       returns [String typeS, Set setS, int line, int pos,Node treeS, String mipsCodeS]
       @init{
        $treeS = null;
        $mipsCodeS = null;
        String side = "right";
        $setS = null;

       }
       : i=inic_var[idTH, set]           {$typeS = $i.typeS; $line = $i.line; $pos = $i.pos; $treeS = $i.treeS; $setS = $i.setS; /*if(isSet && $i.treeS!=null && $set!=null){ $treeS = $i.treeS;}*/ $mipsCodeS = $i.mipsCodeS;}
       | d=designator[idTH, set, side]   {$typeS = $d.typeS; $line = $d.line; $pos = $d.pos; $mipsCodeS = $d.mipsCodeS; $treeS = $d.treeS;}
       | '(' e=expression[idTH, set] ')' {$typeS = $e.typeS; $line = $e.line; $pos = $e.pos; $mipsCodeS = $e.mipsCodeS; $treeS = $e.treeS; $setS = $e.setS;/*if(isSet && $e.treeS!=null && $set!=null){ $treeS = $e.treeS;}*/}
       | '!' f1=factor[idTH, set]
        {
            $line = $f1.line;
            $pos = $f1.pos;
            if($f1.typeS!=null && $f1.typeS.equals("boolean")){
                $typeS = $f1.typeS;
                $mipsCodeS = $f1.mipsCodeS + m.textNot($f1.line, $f1.pos);
            }else{
                $typeS = null;
                e.addMessage($f1.line,$f1.pos,ErrorMessage.semantic($f1.text,ErrorMessage.type($f1.typeS,"boolean")));
            }
            /*if(isSet && $set!=null){
                Node n = new Node(new String("not"),$f1.treeS,null);
                $treeS = n;
            }*/
            Node n = new Node(new String("not"),$f1.treeS,null);
            $treeS = n;
        }
       | f2=function_call[idTH, set]      {$typeS = $f2.typeS; $mipsCodeS = $f2.mipsCodeS; $treeS = $f2.treeS; /*if(isSet && $set!=null){$treeS = $f2.treeS;}*/}                                         // sintetizar a linha e a posição e declarar o tipo da funcao !!!!!
       | s=specialFunctions[idTH, set]   {$typeS = $s.typeS; $line = $s.line; $pos = $s.pos; $treeS = $s.treeS; $mipsCodeS = $s.mipsCodeS; /*if(isSet && $s.treeS!=null && $set!=null){ $treeS = $s.treeS;}*/}
       ;

specialFunctions [IdentifiersTable idTH, Set set]
                 returns [String typeS, int line, int pos, Node treeS, String mipsCodeS]
                 @init{
                    boolean areRegistersBeingUsed = m.areSomeRegistersUsed();
                    int numberOfUsedRegisters = 0;

                    System.out.println("STATE OF AREREGISTERSBEINGUSED: "+areRegistersBeingUsed);

                    if(areRegistersBeingUsed){
                        //Info: This means that we need to save the information of the registers in the stack ! Because some Jump call will be called and we need to save the state of those registers for having a consistancy.

                        //We need to calculate how many registers are being used
                        numberOfUsedRegisters = m.numbersOfRegisteresUsedRightNow();
                        //we need to calculate
                        $idTH.pushStateRegistersToSP(numberOfUsedRegisters);
                        $mipsCodeS = m.textSaveStateBeforeCallingFunction(numberOfUsedRegisters);

                        //we need to reset the registers (but i dont know if this worth due to the fact that the function 'textSaveStateBeforeCallingFunction' uses 'freeLastRegister'
                        //m.resetRegister();
                    }

                    m.resetRegister();
                    System.out.println("MIPSCODES SPECIALFUNCTION INIT: "+$mipsCodeS);

                 }
                 @after{
                    //m.textReturnResultOfSpecialFunctions($t.line, $t.pos);


                    if(areRegistersBeingUsed){
                        //This means that we need to save the information of the registers in the stack ! Because some Jump call will be called and we need to save the state of those registers for having a consistancy.

                        $mipsCodeS += m.textRestoreStateAfterCallingFunction(numberOfUsedRegisters);
                        //m.textRestoreStateAfterEndedCallingFunction(numberOfRegistersUsed)+m.textReturnResultOfSpecialFunctions(line, pos);
                        $idTH.popSP();
                    }
                    $mipsCodeS += m.textReturnResultOfSpecialFunctions($line, $pos);

                    System.out.println("MIPSCODES SPECIALFUNCTION AFTER: "+$mipsCodeS);

                 }
                 : t=tail[idTH, set]     {$typeS = $tail.typeS; $line = $tail.line; $pos = $tail.pos; $treeS = $t.treeS; if(areRegistersBeingUsed){$mipsCodeS += $t.mipsCodeS;}else{$mipsCodeS = $t.mipsCodeS;} /*if(isSet && $t.treeS!=null && $set!=null){$treeS = $t.treeS;}*/}
                 | h=head[idTH, set]     {$typeS = $head.typeS; $line = $head.line; $pos = $head.pos; $treeS = $h.treeS; if(areRegistersBeingUsed){$mipsCodeS += $h.mipsCodeS;}else{$mipsCodeS = $h.mipsCodeS;} /*if(isSet && $h.treeS!=null && $set!=null){$treeS = $h.treeS;}*/}
                 | c=cons[idTH, set]     {$typeS = $cons.typeS; $line = $cons.line; $pos = $cons.pos; $treeS = $c.treeS; if(areRegistersBeingUsed){$mipsCodeS += $c.mipsCodeS;}else{$mipsCodeS = $c.mipsCodeS;} /*if(isSet && $c.treeS!=null && $set!=null){$treeS = $c.treeS;}*/}
                 | m=member[idTH, set]   {$typeS = $member.typeS; $line = $member.line; $pos = $member.pos; $treeS = $m.treeS; if(areRegistersBeingUsed){$mipsCodeS += $m.mipsCodeS;}else{$mipsCodeS = $m.mipsCodeS;} /*if(isSet && $m.treeS!=null && $set!=null){$treeS = $m.treeS;}*/}
                 | i=is_empty[idTH, set] {$typeS = $is_empty.typeS; $line = $is_empty.line; $pos = $is_empty.pos; $treeS = $i.treeS; if(areRegistersBeingUsed){$mipsCodeS += $i.mipsCodeS;}else{$mipsCodeS = $i.mipsCodeS;} /*if(isSet && $i.treeS!=null && $set!=null){$treeS = $i.treeS;}*/}
                 | l=length[idTH, set]   {$typeS = $length.typeS; $line = $length.line; $pos = $length.pos; $treeS = $l.treeS; if(areRegistersBeingUsed){$mipsCodeS += $l.mipsCodeS;}else{$mipsCodeS = $l.mipsCodeS;} /*if(isSet && $l.treeS!=null && $set!=null){$treeS = $l.treeS;}*/}
                 | d=delete[idTH, set]   {$typeS = $delete.typeS; $line = $delete.line; $pos = $delete.pos; $treeS = $d.treeS; if(areRegistersBeingUsed){$mipsCodeS += $d.mipsCodeS;}else{$mipsCodeS = $d.mipsCodeS;} /*if(isSet && $d.treeS!=null && $set!=null){$treeS = $d.treeS;}*/}
                 ;

/* ****** add_op, mul_op, rel_op ****** */

//o que tem menor prioridade
add_op returns [String typeS, int line, int pos]
       : a='+' {$typeS = "integer"; $line = $a.line; $pos = $a.pos;}
       | a='-' {$typeS = "integer"; $line = $a.line; $pos = $a.pos;}
       | a='||'{$typeS = "boolean"; $line = $a.line; $pos = $a.pos;}
       | a='++'{$typeS = "set"; $line = $a.line; $pos = $a.pos;} //( uniao de conjuntos)
       ;

//tem mais prioridade que add_op
mul_op returns [String typeS, int line, int pos]
       : m='*' {$typeS = "integer"; $line = $m.line; $pos = $m.pos;}
       | m='/' {$typeS = "integer"; $line = $m.line; $pos = $m.pos;}
       | m='&&'{$typeS = "boolean"; $line = $m.line; $pos = $m.pos;}
       | m='**'{$typeS = "set"; $line = $m.line; $pos = $m.pos;}//( interseccao de conjuntos)
       ;

rel_op returns [String typeS, int line, int pos]
       : r='==' {$typeS = "integer"; $line = $r.line; $pos = $r.pos;} //The return of the type may be boolean or integer
       | r='!=' {$typeS = "integer"; $line = $r.line; $pos = $r.pos;} //The return of the type may be boolean or integer
       | r='<'  {$typeS = "integer"; $line = $r.line; $pos = $r.pos;}
       | r='>'  {$typeS = "integer"; $line = $r.line; $pos = $r.pos;}
       | r='<=' {$typeS = "integer"; $line = $r.line; $pos = $r.pos;}
       | r='>=' {$typeS = "integer"; $line = $r.line; $pos = $r.pos;}
       | r='in' {$typeS = "integer"; $line = $r.line; $pos = $r.pos;}
       ;

/* ****** Write statement ****** */

write_statement [IdentifiersTable idTH]
                returns [int line, int pos]
                : w=write_expr '(' p=print_what[idTH] ')'
                 {
                    $line = $w.line;
                    $pos = $w.pos;
                    String s1="";
                    if($p.mipsCodeS != null){
                        if($p.typeS!=null && $p.typeS.equals("array")){
                            if($idTH.doesExist($p.text)){
                                Array a = (Array) $idTH.getInfoIdentifiersTable($p.text);

                                Integer level;
                                if((level = a.getLevel()).equals(0)){
                                    int res = 1;
                                    for(Integer i: a.getLimits()){
                                        res*= i;
                                        System.out.println("WRITE -> Variable: "+$p.text+" Level: "+level.toString()+" RES: "+res);
                                    }

                                    String mipsCodeS = "";

                                    s1 = m.textWriteArray(true, false, false, $line, $pos);

                                    for(int i=0; i<res*m.numberOfBytesForEachAddress(); i+= m.numberOfBytesForEachAddress()){
                                        mipsCodeS = m.loadImmediateWord(""+i, $line, $pos);
                                        mipsCodeS += m.loadWordValueArrayWithName($p.text, $line, $pos);
                                        s1 += m.textWrite(mipsCodeS, true, false, $w.line, $w.pos);
                                        m.freeLastRegister();
                                        m.freeLastRegister();
                                        if(i+m.numberOfBytesForEachAddress()<res*m.numberOfBytesForEachAddress()){
                                            s1 += m.textWriteArray(false, true, false, $line, $pos);
                                        }
                                        //need to make it beautifull now, the values are printed but not spaced.

                                    }
                                    s1 += m.textWriteArray(false, false, true, $line, $pos);
                                    //s1 += m.textWrite("", $w.write, true, $line, $pos);
                                    if(!$w.write){
                                        s1+= m.textJumpWriteln();
                                    }
                                    System.out.println(s1);
                                }else{

                                    int res = 1;
                                    for(Integer i: a.getLimits()){
                                        res*= i;
                                        System.out.println("WRITE -> Variable: "+$p.text+" Level: "+level.toString()+" RES: "+res);
                                    }

                                    String mipsCodeS = "";

                                    s1 = m.textWriteArray(true, false, false, $line, $pos);
                                    Integer positionOfArrayInSP = $idTH.getValueSP(level,$p.text);

                                    for(int i=0; i<res*m.numberOfBytesForEachAddress(); i+= m.numberOfBytesForEachAddress()){
                                        mipsCodeS = m.loadWordSP(i+positionOfArrayInSP);

                                        s1 += m.textWrite(mipsCodeS, true, false, $w.line, $w.pos);
                                        m.freeLastRegister();
                                        if(i+m.numberOfBytesForEachAddress()<res*m.numberOfBytesForEachAddress()){
                                            s1 += m.textWriteArray(false, true, false, $line, $pos);
                                        }
                                        //need to make it beautifull now, the values are printed but not spaced.

                                    }
                                    s1 += m.textWriteArray(false, false, true, $line, $pos);
                                    //s1 += m.textWrite("", $w.write, true, $line, $pos);
                                    if(!$w.write){
                                        s1+= m.textJumpWriteln();
                                    }

                                }
                            }
                        }else if($p.typeS!=null && $p.typeS.equals("sequence")){
                            if($idTH.doesExist($p.text)){
                                //now we must add the level of the variable because it can be level 0 or superior (also take the variable and check the level)
                                Var v = (Var) $idTH.getInfoIdentifiersTable($p.text);

                                s1 = m.textPrintSequence($p.text, functionState, v.getLevel(), $w.write, $line, $pos);

                            }
                        }else{
                          s1 = m.textWrite($p.mipsCodeS, $w.write, $p.isAString, $w.line, $w.pos);
                        }
                    }else{
                        //it means that there is nothing to print
                        if(!$w.write){
                            s1=m.textJumpWriteln();
                        }
                    }



                    if(functionState == false){
                        m.addTextInstruction(s1);
                    }else if(functionState == true){
                        m.addMipsCodeFunction(m.getNameFunction(),s1);
                    }
                 }
                ;

write_expr
           returns [boolean write, int line, int pos]
           : w='write'    { $write = true; $line = $w.line; $pos = $w.pos;}
           | w='writeln'  { $write = false; $line = $w.line; $pos = $w.pos;}
           ;

print_what [IdentifiersTable idTH]
           returns [String mipsCodeS,boolean isAString, String typeS]
           @init{
              Set tree = null;
           }
           :  {$mipsCodeS=null;}
           | e=expression[idTH, tree]
            {
                if( $e.typeS == null || $e.typeS.equals("set")){
                    e.addMessage($e.line,$e.pos,ErrorMessage.semantic($e.text,ErrorMessage.type($e.typeS,"integer | boolean | sequence | array")));
                }else{
                    $mipsCodeS = $e.mipsCodeS;
                }
                $isAString=false;
                $typeS = $e.typeS;
            } //conjuntos nao pode pertencer
           | s=string
            {
                m.addDataInstruction(m.generateDataStringForWriting(i,$s.text));
                $mipsCodeS = m.loadTextWrite(i);
                i++;
                $isAString=true;
                $typeS = null;
            }
           ;

/* ****** Read statement ****** */

read_statement [IdentifiersTable idTH]
               returns [int line, int pos]
               : in='input' '(' i=identifier ')'
               {
                  $line = $in.line;
                  $pos = $in.pos;
                  if($idTH.doesExist($i.text)){
                      Var v = (Var) $idTH.getInfoIdentifiersTable($i.text);
                      if(!(v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer"))){       //verificar se existe e é tipo inteiro e class VAR
                        e.addMessage($i.line,$i.pos,ErrorMessage.semantic($i.text,ErrorMessage.type(v.getInfoType(),"integer")));
                      }else{
                        String mipsCodeS=null,s=null;
                        /*if($idTH.getInfoIdentifiersTable($i.text).getLevel().equals(0)){
                            s = m.textRead($i.text, $i.line, $i.pos);
                        }else{
                            //mipsCodeS = m.storeWordSP($idTH.getValueSP(level,$i.text));
                            s = m.textRead($i.text, $i.line, $i.pos);
                        }*/

                        //We only need to read the value !!!!! wtf was i doing with this piece of code !!!
                        //s = m.textRead(mipsCodeS, $i.line, $i.pos);
                        //s = m.textRead($i.text, $i.line, $i.pos);
                        s = m.textRead($i.text, $i.line, $i.pos);
                        if(functionState == false && s!=null){
                            m.addTextInstruction(s);
                        }else if(functionState == true && s!=null){
                            m.addMipsCodeFunction(m.getNameFunction(),s);
                        }
                      }
                  }else{
                      e.addMessage($i.line, $i.pos, ErrorMessage.semanticVariableMissing($i.text));
                  }
               }
               ;

/* ****** Conditional & Iterative ****** */

conditional_statement [IdentifiersTable idTH]
                      returns [int line, int pos]
                      : i=if_then_else_stat[idTH] { $line = $i.line; $pos = $i.pos; m.removeLastStack();}
                      ;

iterative_statement [IdentifiersTable idTH]
                    returns [int line, int pos]
                    : f=for_stat[idTH]      {$line = $f.line; $pos = $f.pos;}
                    | w=while_stat[idTH]    {$line = $w.line; $pos = $w.pos;}
                    ;

/* ****** if_then_else_stat ****** */

if_then_else_stat [IdentifiersTable idTH]
                  returns [int line, int pos]
                  @init{
                    Set tree = null;
                    String mipsCodeS = null;
                  }
                  : i='if' '(' e1=expression[idTH, tree] ')'
                        {
                          $line = $i.line;
                          $pos = $i.pos;
                          if(!($e1.typeS!=null && $e1.typeS.equals("boolean"))){
                            e.addMessage($e1.line,$e1.pos,ErrorMessage.semantic($e1.text,ErrorMessage.type($e1.typeS,"boolean")));
                          }else{
                            mipsCodeS = $e1.mipsCodeS;
                            mipsCodeS += m.textIfThenElse($i.line, $i.pos);
                            if(functionState == false){
                                m.addTextInstruction(mipsCodeS);
                            }else if(functionState == true){
                                m.addMipsCodeFunction(m.getNameFunction(),mipsCodeS);
                            }
                          }
                        }
                    'then' '{' s=statements[idTH] '}'
                    e2=else_expression[idTH, $i.line, $i.pos]


                  ;

else_expression [IdentifiersTable idTH, int line, int pos]
                @init{
                    String mipsCodeS = null;
                }
                :                                   { String s1 = m.textElse(line,pos); if(s1 != null){ if(functionState == false){m.addTextInstruction(s1);}else if(functionState == true){ m.addMipsCodeFunction(m.getNameFunction(),s1);}}}
                | e='else' '{'
                    {
                        String s2 = m.textJumpBeforeElse($e.line, $e.pos);
                        if(s2 !=  null){
                            if(functionState == false){
                                m.addTextInstruction(s2);
                            }else if(functionState == true){
                                m.addMipsCodeFunction(m.getNameFunction(),s2);
                            }
                        }
                    }
                  s=statements[idTH] { String s3 = m.textJumpAfterElse($e.line, $e.pos); if(s3 != null){ if(functionState == false){m.addTextInstruction(s3);}else if(functionState == true){ m.addMipsCodeFunction(m.getNameFunction(),s3);}}}
                  '}'
                ;

/* ****** for_stat ****** */

for_stat [IdentifiersTable idTH]
         returns [int line, int pos]
         : f='for' '(' i=interval[idTH] ')' s=step
            {
                $line = $f.line;
                $pos = $f.pos;
                if($i.inArray == true && $s.stepS == true){
                    e.addMessage($f.line, $f.pos, ErrorMessage.forEachStep());
                }else{
                    String s1 = $i.mipsCodeS;
                    if($idTH.doesExist($i.variableS)){
                        Integer positionFromSP = 0, variableLevel = $idTH.getInfoIdentifiersTable($i.variableS).getLevel(); //we must declare that for textForCondition function, it is needed for the use of variables for functions and also, not including IdentifiersTable into Mips class
                        if(!variableLevel.equals(0)){
                            positionFromSP = $idTH.getValueSP(level, $i.variableS);
                        }
                        Integer positionFromSPArray = 0, arrayLevel = 0;
                        if($i.inArray){
                            positionFromSPArray = $idTH.getValueSP(level, $i.arrayS);
                            arrayLevel = $idTH.getInfoIdentifiersTable($i.arrayS).getLevel();
                        }
                        s1 += m.textForCondition($i.inArray,$i.variableS,variableLevel,positionFromSP,$i.arrayS, arrayLevel,positionFromSPArray, $i.maximumMipsCodeS, $s.stepUp, $f.line, $f.pos);
                        if(functionState == false){
                            m.addTextInstruction(s1);
                        }else if(functionState == true){
                            m.addMipsCodeFunction(m.getNameFunction(),s1);
                        }
                    }
                }

            }
            s2=satisfy[idTH]
            {

                if($i.inArray == true && $s2.satisfyingS == true){
                    e.addMessage($f.line, $f.pos, ErrorMessage.forEachSatisfying());
                }else if($s2.mipsCodeS!=null){
                    String s = m.textForSatisfyingInit($s2.mipsCodeS, $s2.line, $s2.pos); //Fazer isto !!!
                    if(functionState == false){
                        m.addTextInstruction(s);
                    }else if(functionState == true){
                        m.addMipsCodeFunction(m.getNameFunction(),s);
                    }
                }

            }
           '{' s3=statements[idTH] '}'
            {
                if($idTH.doesExist($i.variableS)){
                    String  l = null;
                    if($s2.mipsCodeS!=null){
                        l = m.textForSatisfyingEnd(functionState, $s3.line, $s3.pos);
                    }
                    //P.C. = inArray, stepBoolean, StepValue
                    Integer levelVariable = 0, positionFromSP = 0;
                    if(!$idTH.getInfoIdentifiersTable($i.variableS).getLevel().equals(0)){
                        levelVariable = $idTH.getInfoIdentifiersTable($i.variableS).getLevel();
                        positionFromSP = $idTH.getValueSP(level, $i.variableS);
                    }
                    if(l!=null){
                        l += m.textForStep(functionState, $i.variableS, levelVariable,positionFromSP, $i.inArray, $s.stepUp, $s.numberS, $s3.line, $s3.pos);
                    }else{
                        l = m.textForStep(functionState, $i.variableS, levelVariable, positionFromSP, $i.inArray, $s.stepUp, $s.numberS, $s3.line, $s3.pos);
                    }
                    if(functionState == false){
                        m.addTextInstruction(l);
                    }else if(functionState == true){
                        m.addMipsCodeFunction(m.getNameFunction(),l);
                    }
                }

            }
         ;

interval [IdentifiersTable idTH]
         returns [String mipsCodeS, boolean inArray, String maximumMipsCodeS, String arrayS, String variableS]
         @init{
            $mipsCodeS = null;
            $arrayS = null;
            $variableS = null;
         }
         : i=identifier t=type_interval[idTH,$i.text]
         {
            if($idTH.doesExist($i.text)){
                Var v = (Var) $idTH.getInfoIdentifiersTable($i.text);
                if(!(v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer"))){   //identifier tem que pertencer a tabela, cat VAR e tipo inteiro
                    e.addMessage($i.line,$i.pos,ErrorMessage.semantic($i.text,ErrorMessage.type(v.getInfoType(),"integer")));
                }else{
                    $mipsCodeS = $t.minimumMipsCodeS;
                    $inArray = $t.inArrayS;
                    $maximumMipsCodeS = $t.maximumMipsCodeS;
                    $arrayS = $t.arrayS;
                    $variableS = $i.text;
                }
            }else{
                e.addMessage($i.line, $i.pos, ErrorMessage.semanticVariableMissing($i.text));
            }
         }
         ;

type_interval [IdentifiersTable idTH, String variable]
              returns [String minimumMipsCodeS, String maximumMipsCodeS, boolean inArrayS, String arrayS]
              @init{
                $inArrayS = false;
                $arrayS = null;
              }
              : 'in' r=range[idTH,variable,$inArrayS]        {$minimumMipsCodeS = $r.minimumMipsCodeS; $maximumMipsCodeS = $r.maximumMipsCodeS;}
              | 'inArray' i=identifier {
                                        $inArrayS = true;

                                        if($idTH.doesExist($i.text)){
                                            Var v = (Var) $idTH.getInfoIdentifiersTable($i.text);
                                            if(!(v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("array"))){   //identifier => Array e cat VAR
                                                e.addMessage($i.line,$i.pos,ErrorMessage.semantic($i.text,ErrorMessage.type(v.getInfoType(),"integer")));
                                            }else{
                                                if($inArrayS == true){
                                                    String s = m.loadImmediateWord("0", $i.line, $i.pos); // 0 because "inArray" is a foreach !! So it must pass to every position of the array. That's why we begin by 0 until the maximum of the dimension of the array.

                                                    Integer levelVariable = 0, positionFromSP = 0;
                                                    if(!$idTH.getInfoIdentifiersTable($variable).getLevel().equals(0)){
                                                        levelVariable = $idTH.getInfoIdentifiersTable($variable).getLevel();
                                                        positionFromSP = $idTH.getValueSP(level,$variable);
                                                    }
                                                    $minimumMipsCodeS = m.textForInit(functionState, $inArrayS,$variable,levelVariable,positionFromSP,s, $i.line, $i.pos);

                                                    // We need to do the code for maximum ! we need to calculate the size of the array !
                                                    Array a = (Array) $idTH.getInfoIdentifiersTable($i.text);
                                                    Integer res =  new Integer(1);
                                                    for(Integer i : a.getLimits()){
                                                        res = res * i;
                                                    }
                                                    res = res-1; //This is needed due to calculation of the array ! For example : [3|2] => 6 positions but the address goes to [0..20] and not 3*2*4 (=24)
                                                    res = res*4;

                                                    $maximumMipsCodeS = m.loadImmediateWord(res.toString(), $i.line, $i.pos);
                                                    $arrayS = $i.text;
                                                }
                                            }
                                        }else{
                                            e.addMessage($i.line, $i.pos, ErrorMessage.semanticVariableMissing($i.text));
                                        }
                                       }
              //| 'inFunction' identifier //tenho aqui representado !
              ;

range [IdentifiersTable idTH, String variable, boolean inArray]
      returns [String minimumMipsCodeS, String maximumMipsCodeS]
      : m1=minimum[idTH,variable,$inArray] '..' m2=maximum[idTH] { $minimumMipsCodeS = $m1.mipsCodeS; $maximumMipsCodeS = $m2.mipsCodeS;}
      ;

minimum [IdentifiersTable idTH, String variable, boolean inArray]
        returns [String mipsCodeS]
        : n=number        {
                            String s = m.loadImmediateWord($n.text, $n.line, $n.pos);
                            Integer variableLevel = 0,  positionFromSP = 0;
                            if($idTH.doesExist($variable)==true && !$idTH.getInfoIdentifiersTable($variable).getLevel().equals(0)){
                                variableLevel = $idTH.getInfoIdentifiersTable($variable).getLevel();
                                positionFromSP = $idTH.getValueSP(level,$variable);
                            }
                            $mipsCodeS = m.textForInit(functionState, $inArray,$variable,variableLevel,positionFromSP,s, $n.line, $n.pos);
                          }
        | i=identifier
         {
            if($idTH.doesExist($i.text)){
                Var v = (Var) $idTH.getInfoIdentifiersTable($i.text);
                if(!(v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer"))){       //tem que existir e tem que ser variavel tipo inteiro , cat VAR
                    e.addMessage($i.line,$i.pos,ErrorMessage.semantic($i.text,ErrorMessage.type(v.getInfoType(),"integer")));
                }else{
                    String s;
                    if($idTH.getInfoIdentifiersTable($i.text).getLevel().equals(0)){
                        s = m.loadWord($i.text, $i.line, $i.pos);
                    }else{
                        s = m.loadWordSP($idTH.getValueSP(level,$i.text));
                    }
                    Integer variableLevel = 0,  positionFromSP = 0;
                    if(!$idTH.getInfoIdentifiersTable($variable).getLevel().equals(0)){
                        variableLevel = $idTH.getInfoIdentifiersTable($variable).getLevel();
                        positionFromSP = $idTH.getValueSP(level,$variable);
                    }
                    $mipsCodeS = m.textForInit(functionState, $inArray,$variable,variableLevel,positionFromSP,s, $i.line, $i.pos);
                }
            }else{
                e.addMessage($i.line, $i.pos, ErrorMessage.semanticVariableMissing($i.text));
            }
         }
        ;

maximum [IdentifiersTable idTH]
        returns [String mipsCodeS]
        : n=number {

                    $mipsCodeS = m.loadImmediateWord($n.text, $n.line, $n.pos);

                }
        | i=identifier
        {
            if($idTH.doesExist($i.text)){
                Var v = (Var) $idTH.getInfoIdentifiersTable($i.text);
                if(!(v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer"))){       //tem que existir e tem que ser variavel tipo inteiro , cat VAR
                    e.addMessage($i.line,$i.pos,ErrorMessage.semantic($i.text,ErrorMessage.type(v.getInfoType(),"integer")));
                }else{
                    //String s;
                    if($idTH.getInfoIdentifiersTable($i.text).getLevel().equals(0)){
                        $mipsCodeS = m.loadWord($i.text, $i.line, $i.pos);
                    }else{
                        $mipsCodeS = m.loadWordSP($idTH.getValueSP(level,$i.text));
                    }
                    //$mipsCodeS = m.loadWord($i.text, $i.line, $i.pos);
                }
            }else{
                e.addMessage($i.line, $i.pos, ErrorMessage.semanticVariableMissing($i.text));
            }
        }
        ;

step
     returns [boolean stepS, boolean stepUp, String numberS]
     :                      { $numberS = "1"; $stepUp = true; $stepS = false;} //this must be done
     | u=up_down n=number   {
                              $stepUp = $u.stepUp; $numberS = $n.text; $stepS = true;
                            }
     ;

up_down returns [boolean stepUp]
        @init{
            $stepUp = false;
        }
        : 'stepUp'  { $stepUp = true; }
        | 'stepDown'
        ;

satisfy [IdentifiersTable idTH]
        returns [String mipsCodeS, boolean satisfyingS, int line, int pos]
        @init{
            Set tree = null;
            $mipsCodeS = null;
        }
        :                                           {$mipsCodeS = null; $satisfyingS = false;}
        | 'satisfying' e=expression[idTH, tree]
        {   $line = $e.line;
            $pos = $e.pos;
            $satisfyingS = true;
            if(!($e.typeS !=null && $e.typeS.equals("boolean"))){
                e.addMessage($e.line,$e.pos,ErrorMessage.semantic($e.text,ErrorMessage.type($e.typeS,"boolean")));
            }else{
                $mipsCodeS = $e.mipsCodeS;
            }
        } //boolean expression
        ;

/* ****** While_Stat ****** */
while_stat [IdentifiersTable idTH]
           returns [int line, int pos]
           @init{
              Set tree = null;
           }
           : w='while' '('  e=expression[idTH, tree] ')'
                {
                  $line = $w.line;
                  $pos = $w.pos;
                  if(!($e.typeS!=null && $e.typeS.equals("boolean"))){
                    e.addMessage($e.line,$e.pos,ErrorMessage.semantic($e.text,ErrorMessage.type($e.typeS,"boolean")));
                  }else{
                    if($e.mipsCodeS != null){
                        String s1 = m.textWhile(functionState, $e.mipsCodeS, $e.line, $e.pos);
                        if(functionState==false){
                            m.addTextInstruction(s1);
                        }else if(functionState==true){
                            //generate mips assembly code for functions
                            m.addMipsCodeFunction(m.getNameFunction(),s1);
                        }
                        //m.resetRegister();
                    }
                  }
                }
             '{' statements[idTH] l='}'
             {
                if($e.mipsCodeS != null){
                    String s2 = m.textWhileExit(functionState, $l.line, $l.pos);
                    if(functionState == false){
                        m.addTextInstruction(s2);
                    }else if(functionState == true){
                        //generate mips assembly code for functions
                        m.addMipsCodeFunction(m.getNameFunction(),s2);
                    }
                }
             }
           ;

/* ****** Succ_Or_Predd ****** */

succ_or_pred [IdentifiersTable idTH]
             returns [int line, int pos]
             : s=succ_pred i=identifier
             {
                $line = $s.line;
                $pos = $s.pos;
                if($idTH.doesExist($i.text)){
                    Var v = (Var) $idTH.getInfoIdentifiersTable($i.text);
                    if( !( $i.text.matches("^[0-9]+$") || (v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer")) ) ){
                        e.addMessage($i.line,$i.pos,ErrorMessage.semantic($i.text,ErrorMessage.type("null","integer")));
                    }else{
                        if($s.succ == true){
                        //It means that succ is being used
                            String s1;
                            //we need to know the level of the identifier
                            if($idTH.getInfoIdentifiersTable($i.text).getLevel().equals(0)){
                                s1 = m.textSucc($i.text, $s.line, $s.pos);
                            }else{
                                s1 = m.textSuccSF($idTH.getValueSP(level,$i.text), $s.line, $s.pos);
                            }

                            //this is needed for knowing where the instruction will be added to the mips assembly code
                            if(functionState == false){
                                m.addTextInstruction(s1);
                            }else if(functionState == true){
                                m.addMipsCodeFunction(m.getNameFunction(),s1);
                            }
                        }else if($s.succ == false){
                        //It means that pred is being used
                            String s2;
                            //we need to know the level of the identifier
                            if($idTH.getInfoIdentifiersTable($i.text).getLevel().equals(0)){
                                s2 = m.textPred($i.text, $s.line, $s.pos);
                            }else{
                                s2 = m.textPredSF($idTH.getValueSP(level,$i.text),$s.line,$s.pos);
                            }

                            if(functionState == false){
                                m.addTextInstruction(s2);
                            }else if(functionState == true){
                                m.addMipsCodeFunction(m.getNameFunction(),s2);
                            }
                        }
                    }
                }else{
                    e.addMessage($i.line, $i.pos, ErrorMessage.semanticVariableMissing($i.text));
                }
             }//identifier inteiro
             ;

succ_pred
          returns [boolean succ, int line, int pos]
          : s='succ' { $succ = true; $line = $s.line; $pos =$s.pos;}
          | p='pred' { $succ = false; $line = $p.line; $pos = $p.pos;}
          ;

/* ****** SequenceOper ****** */

tail [IdentifiersTable idTH, Set set]
     returns [String typeS, int line, int pos, Node treeS, String mipsCodeS]
     // tail : sequence -> sequence
     : t='tail' '('e=expression[idTH, set] ')'
     {
        $line = $t.line;
        $pos = $t.pos;
        if(($e.typeS != null) && $e.typeS.equals("sequence")){
            $typeS = $e.typeS;

            if($e.mipsCodeS!=null){
                $mipsCodeS = m.textTail($e.mipsCodeS, $t.line, $t.pos);
            }
        }else{
            e.addMessage($e.line,$e.pos,ErrorMessage.semantic($e.text,ErrorMessage.type($e.typeS,"sequence")));
        }

        /*if($set!=null && isSet){
            Node left = new Node(new String("tail"),null,null);
            Node n = new Node(new String("call"),left,new Node(new String("args"),$e.treeS,null));
            $treeS = n;
        }*/

        Node left = new Node(new String("tail"),null,null);
        Node n = new Node(new String("call"),left,new Node(new String("args"),$e.treeS,null));
        $treeS = n;
     }
     ;

head [IdentifiersTable idTH, Set set]
     returns [String typeS, int line, int pos, Node treeS, String mipsCodeS]
     @init{
        $mipsCodeS = null;
     }
     // head : sequence -> integer
     : h='head' '(' e=expression[idTH, set] ')'
     {
        $line = $h.line;
        $pos = $h.pos;
        if(($e.typeS != null) && $e.typeS.equals("sequence")){
            $typeS = "integer";
            if($e.mipsCodeS!=null){
                $mipsCodeS = m.textHead($e.mipsCodeS, $h.line, $h.pos);
            }
        }else{ 
            e.addMessage($e.line,$e.pos,ErrorMessage.semantic($e.text,ErrorMessage.type($e.typeS,"sequence")));
        }

        /*if($set!=null && isSet){
            Node left = new Node(new String("head"),null,null);
            Node n = new Node(new String("call"),left,new Node(new String("args"),$e.treeS,null));
            $treeS = n;
        }*/

        Node left = new Node(new String("head"),null,null);
        Node n = new Node(new String("call"),left,new Node(new String("args"),$e.treeS,null));
        $treeS = n;
     }
     ;

cons [IdentifiersTable idTH, Set set]
     returns [String typeS, int line, int pos, Node treeS, String mipsCodeS]
     // integer x sequence -> sequence
     :  c='cons' '(' e1=expression[idTH, set] ','
        {m.resetRegister();}
        e2=expression[idTH, set] ')'
        {
            //System.out.println("######################### CONS_FUNCTIOn #########################\n");
            //System.out.println($e1.mipsCodeS+"\n"+$e2.mipsCodeS+"\n");
            //System.out.println("#################################################################\n");

            $line = $c.line;
            $pos = $c.pos;
            if(($e1.typeS != null) && $e1.typeS.equals("integer") ){
                if(($e2.typeS != null) && $e2.typeS.equals("sequence")){
                    $typeS = "sequence";

                    if($e1.mipsCodeS!=null && $e2.mipsCodeS!=null){

                        int numberOfUsedRegisters = m.numbersOfRegisteresUsedRightNow();
                        $idTH.pushStateRegistersToSP(numberOfUsedRegisters);
                        $e2.mipsCodeS += m.textSaveStateBeforeCallingFunction(numberOfUsedRegisters);

                        $mipsCodeS = m.textCons($e1.mipsCodeS, $e2.mipsCodeS, $c.line,$c.pos);
                        $idTH.popSP();
                    }

                }else{
                        e.addMessage($e2.line,$e2.pos,ErrorMessage.semantic($e2.text,ErrorMessage.type($e2.typeS,"sequence")));
                }
            }else{
                    e.addMessage($e1.line,$e1.pos,ErrorMessage.semantic($e1.text,ErrorMessage.type($e1.typeS,"integer")));
            }
            /*if($set!=null && isSet){
                Node left = new Node(new String("cons"),null,null);
                Node n = new Node(new String("call"),left,new Node(new String("args"),$e1.treeS,new Node(new String("args"),$e2.treeS,null)));
                $treeS = n;
            }*/

            Node left = new Node(new String("cons"),null,null);
            Node n = new Node(new String("call"),left,new Node(new String("args"),$e1.treeS,new Node(new String("args"),$e2.treeS,null)));
            $treeS = n;
        }
     ;

delete [IdentifiersTable idTH, Set set]
       returns [String typeS, int line, int pos, Node treeS, String mipsCodeS]
       // del : integer x sequence -> sequence
       : d='del' '(' e1=expression[idTH, set] ','
        {m.resetRegister();}
        e2=expression[idTH, set] ')'
        {

            //System.out.println("######################### DELETE_FUNCTIOn #########################\n");
            //System.out.println($e1.mipsCodeS+"\n"+$e2.mipsCodeS);
            //System.out.println("#################################################################\n");

            $line = $d.line;
            $pos = $d.pos;
            if(($e1.typeS != null) && $e1.typeS.equals("integer") ){
                if(($e2.typeS != null) && $e2.typeS.equals("sequence")){
                    $typeS = "sequence";

                    if($e1.mipsCodeS!=null && $e2.mipsCodeS!=null){

                        int numberOfUsedRegisters = m.numbersOfRegisteresUsedRightNow();
                        $idTH.pushStateRegistersToSP(numberOfUsedRegisters);
                        $e2.mipsCodeS += m.textSaveStateBeforeCallingFunction(numberOfUsedRegisters);

                        $mipsCodeS = m.textDelete($e1.mipsCodeS, $e2.mipsCodeS, $d.line, $d.pos);
                        $idTH.popSP();
                    }
                }else{
                    e.addMessage($e2.line,$e2.pos,ErrorMessage.semantic($e2.text,ErrorMessage.type($e2.typeS,"sequence")));
                }
            }else{
                e.addMessage($e1.line,$e1.pos,ErrorMessage.semantic($e1.text,ErrorMessage.type($e1.typeS,"integer")));
            }
            /*if($set!=null && isSet){
                Node left = new Node(new String("delete"),null,null);
                Node n = new Node(new String("call"),left,new Node(new String("args"),$e1.treeS,new Node(new String("args"),$e2.treeS,null)));
                $treeS = n;
            }*/

            Node left = new Node(new String("delete"),null,null);
            Node n = new Node(new String("call"),left,new Node(new String("args"),$e1.treeS,new Node(new String("args"),$e2.treeS,null)));
            $treeS = n;
        }
       ;

copy_statement [IdentifiersTable idTH]
               returns [String typeS, int line, int pos]
               // copy_statement : seq x seq -> void
               : c='copy' '(' i1=identifier ',' i2=identifier ')'
               {
                  if($idTH.doesExist($i1.text) && $idTH.doesExist($i2.text)){
                      Var v1 = (Var) $idTH.getInfoIdentifiersTable($i1.text);
                      Var v2 = (Var) $idTH.getInfoIdentifiersTable($i2.text);

                      if(v1 != null && v1.getInfoType().equals("sequence") && v1.getCategory().equals("VAR")){
                          if(v2 != null && v2.getInfoType().equals("sequence") && v2.getCategory().equals("VAR")){
                              Integer levelIdentifier1 = $idTH.getInfoIdentifiersTable($i1.text).getLevel();
                              Integer levelIdentifier2 = $idTH.getInfoIdentifiersTable($i2.text).getLevel();

                              String mipsCodeS = "";

                              mipsCodeS = m.textCopy($i1.text, levelIdentifier1, $idTH.getValueSP(level,$i1.text), $i2.text, levelIdentifier2, $idTH.getValueSP(level,$i2.text), $c.line, $c.pos );

                              if(functionState == false){
                                  m.addTextInstruction(mipsCodeS);
                              }else if(functionState == true){
                                  m.addMipsCodeFunction(m.getNameFunction(),mipsCodeS);
                              }
                          }else{
                            e.addMessage($i2.line,$i2.pos,ErrorMessage.semantic($i2.text,ErrorMessage.type("boolean | sequence | integer","sequence")));
                          }
                      }else{
                        e.addMessage($i1.line,$i2.pos,ErrorMessage.semantic($i1.text,ErrorMessage.type("boolean | sequence | integer","sequence")));
                      }
                  }else{
                      if(!$idTH.doesExist($i1.text)){
                          e.addMessage($i1.line, $i1.pos, ErrorMessage.semanticVariableMissing($i1.text));
                      }
                      if(!$idTH.doesExist($i2.text)){
                          e.addMessage($i2.line, $i2.pos, ErrorMessage.semanticVariableMissing($i2.text));
                      }
                  }

               }//ambos identificadores tem que existir, categoria VAR e Sequence
               ;

cat_statement [IdentifiersTable idTH]
              returns [String typeS, int line, int pos]
              //cat_statement : seq x seq -> void
              : c='cat' '(' i1=identifier ',' i2=identifier ')'
              {
                if($idTH.doesExist($i1.text) && $idTH.doesExist($i2.text)){
                    Var v1 = (Var) $idTH.getInfoIdentifiersTable($i1.text);
                    Var v2 = (Var) $idTH.getInfoIdentifiersTable($i2.text);

                    if(v1 != null && v1.getInfoType().equals("sequence") && v1.getCategory().equals("VAR")){
                        if(v2 != null && v2.getInfoType().equals("sequence") && v2.getCategory().equals("VAR")){
                            Integer levelIdentifier1 = $idTH.getInfoIdentifiersTable($i1.text).getLevel();
                            Integer levelIdentifier2 = $idTH.getInfoIdentifiersTable($i2.text).getLevel();

                            String mipsCodeS = "";

                            mipsCodeS = m.textCat($i1.text, levelIdentifier1, $idTH.getValueSP(level,$i1.text), $i2.text, levelIdentifier2, $idTH.getValueSP(level,$i2.text), $c.line, $c.pos );

                            if(functionState == false){
                                m.addTextInstruction(mipsCodeS);
                            }else if(functionState == true){
                                m.addMipsCodeFunction(m.getNameFunction(),mipsCodeS);
                            }
                        }else{
                            e.addMessage($i2.line,$i2.pos,ErrorMessage.semantic($i2.text,ErrorMessage.type("boolean | sequence | integer","sequence")));
                        }
                    }else{
                        e.addMessage($i1.line,$i2.pos,ErrorMessage.semantic($i1.text,ErrorMessage.type("boolean | sequence | integer","sequence")));
                    }
                }else{
                    if(!$idTH.doesExist($i1.text)){
                       e.addMessage($i1.line, $i1.pos, ErrorMessage.semanticVariableMissing($i1.text));
                    }
                    if(!$idTH.doesExist($i2.text)){
                       e.addMessage($i2.line, $i2.pos, ErrorMessage.semanticVariableMissing($i2.text));
                    }
                }
              }//ambos identificadores tem que existir, categoria VAR e Sequence
              ;

is_empty [IdentifiersTable idTH, Set set]
         returns [String typeS, int line, int pos, Node treeS, String mipsCodeS]
         @init{
            $mipsCodeS = null;
         }
         // is_empty : sequence -> boolean
         : i='isEmpty' '(' e1=expression[idTH, set] ')'
         {
            $line = $i.line;
            $pos = $i.pos;
            if(($e1.typeS != null) && $e1.typeS.equals("sequence")){
                $typeS = "boolean";
                if($e1.mipsCodeS!=null){
                    $mipsCodeS = m.textIsEmpty($e1.mipsCodeS, $i.line, $i.pos);

                }
            }else{
                e.addMessage($e1.line,$e1.pos,ErrorMessage.semantic($e1.text,ErrorMessage.type($e1.typeS,"sequence")));
            }
            /*if($set!=null && isSet){
                Node left = new Node(new String("is_empty"),null,null);
                Node n = new Node(new String("call"),left,new Node(new String("args"),$e1.treeS,null));
                $treeS = n;
            }*/

             Node left = new Node(new String("is_empty"),null,null);
             Node n = new Node(new String("call"),left,new Node(new String("args"),$e1.treeS,null));
             $treeS = n;
         }
         ;

length [IdentifiersTable idTH, Set set]
       returns [String typeS, int line, int pos, Node treeS, String mipsCodeS]
       @init{
          $mipsCodeS = null;
       }
       // length : sequence -> integer
       : l='length''(' e1=expression[idTH, set] ')'
       {
          $line = $l.line;
          $pos = $l.pos;
          if(($e1.typeS != null) && $e1.typeS.equals("sequence")){
              $typeS = "integer";
              if($e1.mipsCodeS!=null){
                $mipsCodeS = m.textLength($e1.mipsCodeS, $l.line, $l.pos);
              }

          }else{
              e.addMessage($e1.line,$e1.pos,ErrorMessage.semantic($e1.text,ErrorMessage.type($e1.typeS,"sequence")));
          }
          /*if($set!=null && isSet){
             Node left = new Node(new String("length"),null,null);
             Node n = new Node(new String("call"),left,new Node(new String("args"),$e1.treeS,null));
             $treeS = n;
          }*/
          Node left = new Node(new String("length"),null,null);
          Node n = new Node(new String("call"),left,new Node(new String("args"),$e1.treeS,null));
          $treeS = n;
       }
       ;

/* ****** set_oper ****** */

member [IdentifiersTable idTH, Set set]
       returns [String typeS, int line, int pos, Node treeS, String mipsCodeS]
       @init{
            $mipsCodeS = null;
       }
       // isMember : integer x sequence -> boolean
       : im='isMember''(' e=expression[idTH, set] ',' i=identifier ')'
       {
          $line = $im.line;
          $pos = $im.pos;

          String type = null;

          //Pre-Condicao : verificar se existe o identificador na tabela de identificador, caso nao existir significa que é um inteiro ou que nao foi declarado !!!
          if($idTH.getIdentifiersTable().containsKey($i.text)){
            Var v = (Var) $idTH.getInfoIdentifiersTable($i.text);
            if( v != null){
                type = v.getInfoType();
                if((type != null) && type.equals("sequence")){
                    if(($e.typeS != null) && $e.typeS.equals("integer")){
                        $typeS = "boolean";
                        if($e.mipsCodeS!=null){
                            Integer levelIdentifier = $idTH.getInfoIdentifiersTable($i.text).getLevel();
                            $mipsCodeS = m.textMember($e.mipsCodeS, $i.text, levelIdentifier, $idTH.getValueSP(level,$i.text), $im.line, $im.pos);
                        }
                    }else{
                        e.addMessage($e.line,$e.pos,ErrorMessage.semantic($e.text,ErrorMessage.type($e.typeS,"integer")));
                    }
                }else{
                    e.addMessage($i.line,$i.pos,ErrorMessage.semantic($i.text,ErrorMessage.type(type,"sequence")));
                }
            }

            //Normally doesn't need else statement.
          }else{
            e.addMessage($i.line,$i.pos,ErrorMessage.semantic($i.text,ErrorMessage.Statements));
          }
          //if($set!=null && isSet){
          if($set!=null){
            Node d = $set.getIdentifier().get(0);
            Node left = new Node(new String("member"),null,null);
            Node n = null;
            if(d.getData().equals($i.text)){
                n = new Node(new String("call"),left,new Node(new String("args"),$e.treeS,new Node(new String("args"),d,null)));
            }else{
                n = new Node(new String("call"),left,new Node(new String("args"),$e.treeS,new Node(new String("args"),new Node(new String($i.text),null,null),null)));
            }
            $treeS = n;
          }
       }
       ;



/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

string : STR ; /* verificar se é mesmo assim sintaticamente a nivel de lexer !*/

number  returns [Integer numberS,int line, int pos, String valueS]
        : NBR {$numberS = Integer.parseInt($NBR.text);$line = $NBR.line;$pos = $NBR.pos; $valueS = $NBR.text;};

identifier returns [int line, int pos]
           : ID {$line = $ID.line;$pos = $ID.pos;}
           ;
/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */


/* ****** Lexer ****** */

NBR : ('0'..'9')+
    ;

ID : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* //removi o uso do signal '-' conflitos com os valores do signal
   ;

WS  :   ( [ \t\r\n] | COMMENT) -> skip
    ;

STR :  '"' ( ESC_SEQ | ~('"') )* '"'
    ;


fragment
COMMENT
    : '/*'.*?'*/' /* multiple lines comments*/
    | '//'~('\r' | '\n')* /* single line comment*/
    ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F')
          ;

fragment
ACCENT     :   '\u00C0'..'\u00D6'
           | '\u00D9'..'\u00DD'
           | '\u00E0'..'\u00F6'
           |'\u00F9'..'\u00FD'
           ;

fragment
SPECIAL    : '.'
           | '!'
           | '-'
           | '?'
           | ','
           ;
