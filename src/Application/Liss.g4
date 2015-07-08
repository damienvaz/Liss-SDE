/*
 * Version eBNF of Liss
 * Author : Damien + PRH
 * Date : 2015.03.11
 */
grammar Liss;

@header{
    import java.util.HashMap;
    import java.util.LinkedList;
    import SymbolTable.*;
}

@members{
    int level = 0;
    TableError e = new TableError();
    boolean isSet = false;
    int i= 0;

    boolean isDeclarations;

     Mips m = new Mips();
}

/* ****** Program ****** */

liss [IdentifiersTable idTH]
     : 'program' identifier body[idTH] { System.out.println(e.toString()); if(e.isNull()){ m.write();}}
     ;

body[IdentifiersTable idTH]
     : '{'
       'declarations' {isDeclarations = true;} declarations[idTH]
       'statements'   {isDeclarations = false;} statements[idTH]
       '}'
     ;

/* ****** Declarations ****** */

declarations[IdentifiersTable idTH]
             : declaration[idTH]
             ;

declaration [IdentifiersTable idTH]
            : variable_declaration[idTH]* subprogram_definition[idTH]*
            ;

/* ****** Variables ****** */

variable_declaration [IdentifiersTable idTH]
                     : vars[idTH] '->' type ';' {
                            HashMap<String, HashMap<String,Object>> varsH = $vars.varsS;
                            if($type.typeS == "array" ){
                                for(String i : varsH.keySet()){
                                    varsH.get(i).put("dimension",$type.arrayDimension);
                                    varsH.get(i).put("type",$type.typeS);
                                    if(varsH.get(i).get("accessArray") != null){
                                        ArrayList<ArrayList<Integer>> accessArray = (ArrayList<ArrayList<Integer>>) varsH.get(i).get("accessArray");

                                        String mipsCodeS = null;

                                        m.addTextInstruction("\t##### Initialize Array :"+i+"#####\n");
                                        for(ArrayList<Integer> array :accessArray){
                                            int value = array.get(array.size()-1);
                                            array.remove(array.size()-1);

                                            mipsCodeS = m.loadImmediateWord(String.valueOf(value), (int)varsH.get(i).get("line"), (int)varsH.get(i).get("pos")); //generate mips code for value of the array
                                            //System.out.println(mipsCodeS);

                                            int res = 0;
                                            for(int j=0; j< array.size(); j++){
                                                System.out.print(array.get(j).toString()+" ");
                                                int calc = array.get(j);
                                                for(int h=j+1; h< array.size(); h++){
                                                    calc = calc*$type.arrayDimension.get(h);
                                                }
                                                res = res + calc;
                                            }
                                            res = res*4;
                                            //System.out.println(res+" woot2");
                                            mipsCodeS = mipsCodeS + m.loadImmediateWord(String.valueOf(res), (int)varsH.get(i).get("line"), (int)varsH.get(i).get("pos"));//generate mips code for position of the array
                                            mipsCodeS = mipsCodeS + m.storeWordArray(i,(int)varsH.get(i).get("line"), (int)varsH.get(i).get("pos"));
                                            m.addTextInstruction(mipsCodeS);
                                        }
                                        m.addTextInstruction("\t#######################################\n");
                                        varsH.get(i).put("mips",mipsCodeS);
                                    }
                                }
                            }else if($type.typeS == "set"){
                                for(String i : varsH.keySet()){
                                    HashMap<String,Object> v = (HashMap<String,Object>)varsH.get(i);
                                    if(v.get("set") == null){
                                        v.put("set", new Set());
                                    }
                                }
                                for(String i : varsH.keySet()){
                                    System.out.println("Variable: "+i+" "+varsH.get(i).toString());
                                }
                            }

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
                            /*for(String i : varsH.keySet()){
                                System.out.println("Variable: "+i+" "+varsH.get(i).toString());
                            }*/


                            $idTH.add(e,varsH,$type.typeS,level);
                            if(isSet){isSet = false;}

                            //MIPS
                            m.addDataInstructions(varsH,$type.typeS);

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
        if($v.type_ != null && $v.type_.equals("array")){
            //System.out.println("I HAVE BEEN HERE "+$v.text);
            //info.put("type_", $v.type_);
            info.put("accessArray", $v.accessArrayS);
        }

        $idS = $identifier.text;
        $infoVarS = info;
    }
    ;

value_var [IdentifiersTable idTH]
          returns [Set setS, String typeS, String type_, String mipsCodeS, ArrayList<ArrayList<Integer>> accessArrayS]
          @init{
            Set set = null;
            $mipsCodeS = null;
            $type_ = null;
          }
          :                            { $setS = set; $typeS = null;}
          | '=' i=inic_var[idTH, set]  {
                if(isSet){ set = $i.setS; $setS = set;}
                $typeS = $i.typeS;
                $mipsCodeS = $i.mipsCodeS;
                if($i.type_ != null && $i.type_.equals("array")){
                    $type_ = $i.type_;
                    $accessArrayS = $i.accessArrayS;
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

dimension returns [ArrayList<Integer> arrayDimension]
          @init{
            ArrayList<Integer> vars = new ArrayList<Integer>();
          }
          : number      {vars.add($number.numberS);}
            (',' number {vars.add($number.numberS);} )*  { $arrayDimension = vars;}
          ;

inic_var [IdentifiersTable idTH, Set set]
         returns [String typeS, String type_, int line, int pos,Set setS, Node treeS, String mipsCodeS, ArrayList<ArrayList<Integer>> accessArrayS]
         @init{
            $treeS = null;
            $type_ = null;
            $mipsCodeS = null;
            ArrayList<Integer> a= new ArrayList<Integer>();
            ArrayList<ArrayList<Integer>> accessArray = new ArrayList<ArrayList<Integer>>();
         }
         : c=constant               {$typeS = $constant.typeS; $line = $constant.line; $pos = $constant.pos; $mipsCodeS = $c.mipsCodeS; if(isSet && $set!=null){ Node n = new Node(new Data($c.text)); $treeS = n; } }
         | a=array_definition[a, accessArray] {
                                                    $typeS = "integer";
                                                    $type_ = "array";
                                                    /*for(ArrayList<Integer> array :accessArray){
                                                        for(int i=0; i< array.size(); i++){
                                                            System.out.print(array.get(i).toString()+" ");
                                                        }
                                                        System.out.println("woot");
                                                    }*/
                                                    $accessArrayS = accessArray;
                                              }
         | s1=set_definition[idTH]  {$typeS = "set"; $line = $s1.line; $pos = $s1.pos;if(isSet && $s1.treeS!=null){$treeS = $s1.treeS;} if(isSet && $s1.setS!=null){$setS = $s1.setS;}}
         | s2=sequence_definition   {$typeS = "sequence"; if(isSet && $set!=null){$treeS = $s2.treeS;}}
         ;

constant returns [String typeS, int line, int pos, String mipsCodeS]
         : sign number   {$typeS = "integer"; $line = $number.line; $pos = $number.pos; if(isDeclarations){ $mipsCodeS = m.dataWord($sign.text+$number.text,$number.line,$number.pos);}else{ $mipsCodeS = m.loadImmediateWord($sign.text+$number.text,$number.line,$number.pos);} }
         | t='true'      {$typeS = "boolean"; $line = $t.line; $pos = $t.pos; if(isDeclarations){ $mipsCodeS = m.dataBoolean(true,$t.line,$t.pos);}else{} }
         | f='false'     {$typeS = "boolean"; $line = $f.line; $pos = $f.pos; if(isDeclarations){ $mipsCodeS = m.dataBoolean(false,$f.line,$f.pos);}else{} }
         ;

sign :
     | '+'
     | '-'
     ;

/* ****** Array definition ****** */

array_definition [ArrayList<Integer> a, ArrayList<ArrayList<Integer>> accessArray]
                 : '[' array_initialization[a,accessArray] ']'
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

sequence_definition returns [Node treeS]
                    : '<<' s=sequence_initialization {if(isSet){Node n = new Node(new Data("sequence"),null,$s.treeS); $treeS = n;}}'>>'
                    ;

sequence_initialization returns [Node treeS]
                        :             {if(isSet){$treeS = null;}}
                        | v=values    {if(isSet){$treeS = $v.treeS;}}
                        ;

values returns [Node treeS]
       @init{
            Node head = null;
            Node m = null;
       }
       : n1=number    {if(isSet){head = new Node(new Data("args"),new Node(new Data($n1.text),null,null),null); m = head;}}
       (',' n2=number {if(isSet){m.setRight(new Node(new Data("args"),new Node(new Data($n2.text),null,null),null)); m = m.getRight();}}
       )*

       {
        if(isSet && head!=null){
            $treeS = head;
        }
       }
       ;

/* ****** Set definition ****** */

set_definition [IdentifiersTable idTH]
               returns [Set setS, Node treeS,int line, int pos]
               : m='{'
                   s=set_initialization[idTH] {$line = $m.line; $pos = $m.pos;$setS = $s.setS; $treeS = $s.treeS; if($s.setS!=null){System.out.println("SET_DEFINITION: {"+$s.text+"} -> "+$s.setS.toString());}}
                 '}'
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
                     s = new Set($i.text,tree);
                   }
                    '|'
                    e=expression[idTH,s]
                   {
                    if( !($e.typeS != null && $e.typeS.equals("boolean")) ){
                        e.addMessage($e.line,$e.pos,ErrorMessage.semantic($e.text,ErrorMessage.type($e.typeS,"boolean")));
                    }

                    if($e.treeS!=null && isSet && $e.typeS != null && $e.typeS.equals("boolean")){                                              //só se pode adicionar caso a expressao for booleano !
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
                        level++;
                        HashMap<String,Object> varInfo = new HashMap<String, Object>();
                        HashMap<String, HashMap<String, Object>> hashmapVar = new HashMap<String, HashMap<String,Object>>();

                        $idTH.setAddress(0);
                      }
                      : 'subprogram' i=identifier
                        '(' f=formal_args[idTH] ')' r=return_type f_body[idTH]
                        {
                            //Pre-Condition : Remover todas as variaveis do nivel actual

                            $idTH.removeLevel(level);

                            level--;

                            varInfo.put("line",$i.line);
                            varInfo.put("pos",$i.pos);
                            varInfo.put("return",$r.typeS);
                            varInfo.put("numberArguments", $f.numberArgumentS);
                            varInfo.put("typeList",$f.typeListS);

                            hashmapVar.put($i.text,varInfo);
                            $idTH.add(e,hashmapVar,"function",level);
                        }
                      ;

f_body[IdentifiersTable idTH]
       : '{'
         'declarations' declarations[idTH]
         'statements' statements[idTH]
         returnSubPrg[idTH]
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
          (';' f2=formal_arg
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

            hashmapVar.put($i.text,varInfo);
            $hashmapVarS = hashmapVar;
            $typeS = $t.typeS;
           }
           ;

/* ****** Return type ****** */

return_type
            returns [String typeS]
            :               {$typeS = "null";}
            | '->' t=type   {$typeS = $t.typeS;}
            ;

/* ****** Return ****** */

returnSubPrg [IdentifiersTable idTH]
             returns [String typeS]
             @init{
                Set tree = null;
                $typeS = null;
             }
             :
             | 'return' e=expression[idTH,tree]{$typeS = $e.typeS;} ';'
             ;

/* ****** Statements ****** */

statements [IdentifiersTable idTH]
            : statement[idTH]* {m.resetRegister();}
            ;

statement [IdentifiersTable idTH]
          @init{
            Set set = null;
          }
          : assignment[idTH] ';'
          | write_statement[idTH] ';'
          | read_statement[idTH] ';'
          | conditional_statement[idTH]
          | iterative_statement[idTH]
          | function_call[idTH, set] ';'
          | succ_or_pred[idTH] ';'
          | copy_statement[idTH] ';'
          | cat_statement[idTH] ';' // conjuntos de sequencias
          ;

/* ****** Assignment ****** */

assignment [IdentifiersTable idTH]
           returns [String typeS]
           @init{
                $typeS = null;
                Set set = null;
                String side = "left";
           }
           : designator[idTH, set, side] '=' expression[idTH,set]
           {
              if(($designator.typeS != null && $expression.typeS != null) && $designator.typeS.equals($expression.typeS)){
                $typeS = $designator.typeS;
                System.out.println($designator.line+"Funcionou ;D");

                //MIPS
                if(/*$designator.mipsCodeS != null &&*/ $expression.mipsCodeS != null){
                    String mipsCodeS = "";
                    if($designator.arrayS == false){
                        mipsCodeS = $expression.mipsCodeS;
                        mipsCodeS += m.storeWord($designator.text, $designator.line, $designator.pos);
                        //m.addTextInstructions($designator.text,$expression.mipsCodeS,$designator.typeS,$designator.line,$designator.pos);
                    }else if($designator.arrayS == true){
                        mipsCodeS = $designator.mipsCodeS;
                        mipsCodeS += $expression.mipsCodeS;
                        mipsCodeS += m.storeWordArrayText($designator.identifierS, $designator.line, $designator.pos);
                    }

                    m.addTextInstructions(mipsCodeS);
                }

              }else{
                //ErrorMessage.errorSemanticAssignment($designator.line);
                e.addMessage($designator.line,-1,ErrorMessage.semanticAssignment($designator.line)); //-1 => assignemen error => there is no pos.
              }



           }
           ;

/* ****** Designator ****** */

designator [IdentifiersTable idTH, Set set, String side]
            returns [String identifierS,String typeS, int line, int pos, Node treeS, String mipsCodeS, boolean arrayS]
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
                                        if(!isSet && !$idTH.getInfoIdentifiersTable($identifier.text).getCategory().equals(new String("TYPE"))){
                                            if($idTH.getInfoIdentifiersTable($identifier.text) instanceof Var){
                                                Var v = (Var) $idTH.getInfoIdentifiersTable($identifier.text);
                                                $typeS = v.getInfoType();

                                                //MIPS
                                                if($typeS.equals("integer")){
                                                    if($side.equals("right")){
                                                        $mipsCodeS = m.loadWord($i.text, $i.line, $i.pos);
                                                        //System.out.println($mipsCodeS);
                                                    }
                                                }
                                            }

                                        }
                                    }
                                    if(isSet && $set!=null){
                                        Data d = $set.getIdentifier();
                                        $typeS = "integer";
                                        Node n = null;
                                        if(d.getData().equals($identifier.text)){
                                            n = new Node(d);
                                            //System.out.println("NT : designator, é um identificador igual ao identificador do set, i.e., setId:"+d.getData()+" designatorId: "+$identifier.text);
                                        }else{
                                            n = new Node(new Data($identifier.text));
                                            //System.out.println("NT : designator, é um identificador que nao é igual ao identificador do set, i.e., setId:"+d.getData()+" designatorId: "+$identifier.text);
                                        }
                                        $treeS = n;
                                    }
                                }
                                //Pre-Condicao: é um array
                                else{
                                    //Pre-Condicao: se existe na tabela de identificador
                                    if(!$idTH.getIdentifiersTable().containsKey($identifier.text)){
                                        //ErrorMessage.errorSemantic($identifier.text,$identifier.line,$identifier.pos,ErrorMessage.errorStatements);
                                        e.addMessage($identifier.line,$identifier.pos,ErrorMessage.semantic($identifier.text,ErrorMessage.Statements));

                                    }else{
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
                                        if(isSet && $set!=null){
                                            Node m = new Node(new Data($identifier.text),null,null);
                                            Node head = new Node(new Data("array"),m,$a.treeS);
                                            $treeS = head;
                                        }
                                    }

                                }

           }
           ;

array_access [IdentifiersTable idTH, Set set, String id]
             returns [boolean response, int dimensionS, Node treeS, String mipsCodeS] //response variable => if array_access exists or not
             :                                 {$response = false;}
             | '[' e=elem_array[idTH, set, id] ']' {$response = true; $dimensionS = $elem_array.dimensionS; if($e.mipsCodeS != null){$mipsCodeS = $e.mipsCodeS;} if(isSet && $set!=null && $e.treeS!=null){ $treeS = $e.treeS;}}
             ;

elem_array [IdentifiersTable idTH, Set set, String id] //id = name of the array
           returns[int dimensionS, Node treeS, String mipsCodeS]
           @init{
                int dimension = 0;
                $treeS = null;
                Node head = null;
                Node right = null;

                //$mipsCodeS = null;
                Array array = (Array) idTH.getInfoIdentifiersTable(id);
                int n = 1;
                System.out.println("Dimension: "+array.getDimension());
           }
           : s1=single_expression[idTH, set]
                                    {
                                      dimension++;
                                      if(!($single_expression.typeS == "integer"))
                                           {
                                            //ErrorMessage.errorSemantic($single_expression.text,$single_expression.line,$single_expression.pos,ErrorMessage.type($single_expression.typeS,"integer"));
                                            e.addMessage($single_expression.line,$single_expression.pos,ErrorMessage.semantic($single_expression.text,ErrorMessage.type($single_expression.typeS,"integer")));
                                           }
                                      else{
                                        if(array.getDimension() == 1){
                                            $mipsCodeS = $s1.mipsCodeS;
                                            //System.out.println($mipsCodeS);
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
                                      if(isSet && $set!=null && head == null){
                                        head = new Node(new Data("args"),$s1.treeS,null);
                                        right = head;
                                      }
                                    }
           (',' s2=single_expression[idTH, set]
                                    {
                                        dimension++;
                                        if(!($single_expression.typeS == "integer")){
                                            //ErrorMessage.errorSemantic($single_expression.text,$single_expression.line,$single_expression.pos,ErrorMessage.type($single_expression.typeS,"integer"));
                                            e.addMessage($single_expression.line,$single_expression.pos,ErrorMessage.semantic($single_expression.text,ErrorMessage.type($single_expression.typeS,"integer")));
                                        }else{
                                            if(array.getDimension() == n){
                                                /*if($mipsCodeS == null){
                                                    $mipsCodeS = $s2.mipsCodeS;
                                                }else{
                                                    $mipsCodeS += $s2.mipsCodeS;
                                                }*/
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
                                        if(isSet && $set!=null){
                                            Node m = new Node(new Data("args"),$s2.treeS,null);
                                            right.setRight(m);
                                            right = m;
                                        }
                                    }
           )*
           {
              $dimensionS = dimension;
              if(isSet && $set!=null && head!=null){
                $treeS = head;
              }

              //multiplicar por 4 no mips!
              $mipsCodeS += m.loadImmediateWord(String.valueOf("4"),$s1.line,$s1.pos) + m.textMul($s1.line,$s1.pos);
              System.out.println($mipsCodeS+" ****");
           }
           ;

/* ****** Function call ****** */

function_call [IdentifiersTable idTH, Set set]
              returns [Node treeS]
              : i=identifier '(' s=sub_prg_args[idTH, set] ')' {if(isSet && $set!=null){Node m = new Node(new Data("call"),new Node(new Data($i.text),null,null),$s.treeS);}}
              ;

sub_prg_args [IdentifiersTable idTH, Set set]
             returns [Node treeS]
             :                      {if(isSet && $set!=null){$treeS = null;}}
             | a=args[idTH, set]    {if(isSet && $set!=null){$treeS = $a.treeS;}}
             ;

args [IdentifiersTable idTH, Set set]
     returns [Node treeS]
     @init{
        Node head = null;
        Node m = null;
     }
     : e1=expression[idTH, set]      {if(isSet && $set!=null){ head = new Node(new Data("args"),$e1.treeS,null); m = head;}}
     (',' e2=expression[idTH, set]   {if(isSet && $set!=null){ m.setRight(new Node(new Data("args"),$e2.treeS,null)); m = m.getRight();}}
     )*

     {
        if(isSet && $set!=null){
            $treeS = head;
        }
     }
     ;

/* ****** Expression ****** */

expression [IdentifiersTable idTH, Set set]
            returns [String typeS, int line, int pos, Node treeS, String mipsCodeS ]
            @init{
                $typeS = null;
                boolean correctType = true;
                boolean relationExp = false;
                Node n = null;
                $mipsCodeS = null;

            }
           : s1=single_expression[idTH, set]{$line = $s1.line; $pos = $s1.pos; if(isSet && $set!=null && $s1.treeS!=null){ n = $s1.treeS;} $mipsCodeS = $s1.mipsCodeS;}
            (rel_op s2=single_expression[idTH,set]
                {   relationExp = true;
                    if(!$rel_op.text.equals("in")){
                        if(($s1.typeS != null) && $s1.typeS.equals($rel_op.typeS)){
                            if(($s2.typeS !=null) && $rel_op.typeS.equals($s2.typeS)){
                                $typeS = "boolean";
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
                    }
                    if(isSet && $set!=null){
                        Node m = new Node(new Data($rel_op.text),$s1.treeS,$s2.treeS);
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
                if(isSet && n!=null && $set!=null){
                    $treeS = n;
                    //System.out.println($s1.text+$rel_op.text+$s2.text+" : "+n.toStringSort("infix"));
                }
            }
           ;

/* ****** Single expression ****** */

single_expression [IdentifiersTable idTH, Set set]
                  returns [String typeS, int line, int pos, Node treeS, String mipsCodeS ]
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
                  : t1=term[idTH, set] {$line = $term.line; $pos = $term.pos; errorManagement.add(new ErrorInfo($t1.text,$t1.typeS,$t1.line,$t1.pos)); if($set!=null && isSet && $t1.treeS!=null){ n = $t1.treeS; } $mipsCodeS = $t1.mipsCodeS;}
                  (add_op t2=term[idTH, set] {
                                        errorManagement.add(new ErrorInfo($add_op.text,$add_op.typeS,$add_op.line,$add_op.pos));
                                        errorManagement.add(new ErrorInfo($t2.text,$t2.typeS,$t2.line,$t2.pos));


                                        if(firstTime){
                                            firstTime = false;
                                            if(($t1.typeS != null) && $t1.typeS.equals($add_op.typeS)){
                                                if(($t2.typeS != null) && $add_op.typeS.equals($t2.typeS)){
                                                    leftType = $add_op.typeS;

                                                    //MIPS
                                                    if(!isSet){
                                                        $mipsCodeS = $mipsCodeS + $t2.mipsCodeS;
                                                        if($add_op.typeS.equals("integer")){
                                                            if($add_op.text.equals("+")){
                                                                $mipsCodeS = $mipsCodeS + m.textAdd($add_op.line,$add_op.pos);
                                                            }
                                                            if($add_op.text.equals("-") && $mipsCodeS != null){
                                                                $mipsCodeS = $mipsCodeS + m.textSub($add_op.line,$add_op.pos);
                                                                //System.out.println($mipsCodeS+" single_expression");
                                                            }
                                                        }
                                                    }
                                                }else{
                                                    e.addMessage($t1.line,$t1.pos,ErrorMessage.semantic($t1.text+" "+$add_op.text+" "+$t2.text,ErrorMessage.typeExpression($t1.typeS,$add_op.text,$t2.typeS,$add_op.typeS,$add_op.typeS)+" < single_Expression 1"));
                                                    correctType = false;

                                                }
                                            }else{
                                                e.addMessage($t1.line,$t1.pos,ErrorMessage.semantic($t1.text+" "+$add_op.text+" "+$t2.text,ErrorMessage.typeExpression($t1.typeS,$add_op.text,$t2.typeS,$add_op.typeS,$add_op.typeS)+" < single_Expression 2"));
                                                correctType = false;
                                            }
                                        }else{
                                            errorManagement.pop();
                                            errorManagement.pop();

                                            ErrorInfo leftVar = errorManagement.get(0);

                                            if( (leftType != null) && leftType.equals($add_op.typeS)){
                                                if(($t2.typeS != null) && $add_op.typeS.equals($t2.typeS)){
                                                    leftType = $add_op.typeS;

                                                    //MIPS
                                                    if(!isSet){
                                                        $mipsCodeS = $mipsCodeS + $t2.mipsCodeS;
                                                        if($add_op.typeS.equals("integer")){
                                                            if($add_op.text.equals("+")){
                                                                $mipsCodeS = $mipsCodeS + m.textAdd($add_op.line,$add_op.pos);
                                                            }
                                                            if($add_op.text.equals("-") && $mipsCodeS != null){
                                                                $mipsCodeS = $mipsCodeS + m.textSub($add_op.line,$add_op.pos);
                                                                //System.out.println($mipsCodeS+" single_expression");
                                                            }
                                                        }
                                                    }
                                                }else{
                                                    e.addMessage(leftVar.getLine(),leftVar.getPos(),ErrorMessage.semantic(leftVar.getIdentifier()+" "+$add_op.text+" "+$t2.text,ErrorMessage.typeExpression(leftVar.getType(),$add_op.text,$t2.typeS,$add_op.typeS,$add_op.typeS)+" < single_Expression 3"));
                                                    correctType = false;
                                                }
                                            }else{
                                                e.addMessage(leftVar.getLine(),leftVar.getPos(),ErrorMessage.semantic(leftVar.getIdentifier()+" "+$add_op.text+" "+$t2.text,ErrorMessage.typeExpression(leftVar.getType(),$add_op.text,$t2.typeS,$add_op.typeS,$add_op.typeS)+" < single_Expression 4"));
                                                correctType = false;
                                            }

                                        }

                                        if(isSet && $set != null){
                                            Node m = new Node(new Data($add_op.text),n,$t2.treeS);
                                            n = m;
                                        }

                                     }
                  )* {
                        if(correctType == true){
                            $typeS = $t1.typeS;
                        }
                        if(isSet && n!=null && $set!=null){
                            $treeS = n;
                            //System.out.println("woot "+n.toStringSort("infix"));
                        }

                     }
                  ;

/* ****** Term ****** */
term [IdentifiersTable idTH, Set set]
     returns [String typeS, int line, int pos, Node treeS, String mipsCodeS]
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
     : f1=factor[idTH, set] { $line = $f1.line; $pos = $f1.pos;  errorManagement.add(new ErrorInfo($f1.text, $f1.typeS, $f1.line,$f1.pos)); if($set!=null && isSet && $f1.treeS!=null){ n = $f1.treeS; } $mipsCodeS = $f1.mipsCodeS; }
     (mul_op f2=factor[idTH, set] {

                                errorManagement.add(new ErrorInfo($mul_op.text,$mul_op.typeS,$mul_op.line,$mul_op.pos));
                                errorManagement.add(new ErrorInfo($f2.text,$f2.typeS,$f2.line,$f2.pos));

                                if(firstTime){
                                    firstTime = false;
                                    if(($f1.typeS != null) && $f1.typeS.equals($mul_op.typeS)){
                                        if(($f2.typeS != null) && $mul_op.typeS.equals($f2.typeS)){
                                            leftType = $mul_op.typeS;

                                            //MIPS
                                            $mipsCodeS = $mipsCodeS + $f2.mipsCodeS;
                                            if($mul_op.typeS.equals("integer")){
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
                                }else{

                                        errorManagement.pop();
                                        errorManagement.pop();

                                        ErrorInfo leftVar = errorManagement.get(0);

                                        if((leftType != null) && leftType.equals($mul_op.typeS)){
                                            if(($f2.typeS != null) && $mul_op.typeS.equals($f2.typeS)){
                                                leftType = $mul_op.typeS;

                                                //MIPS
                                                $mipsCodeS = $mipsCodeS + $f2.mipsCodeS;
                                                if($mul_op.typeS.equals("integer")){
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

                                }

                                //Algorithm for inserting elements in the set
                                if(isSet && $set != null){
                                    Node m = new Node(new Data($mul_op.text),n,$f2.treeS);
                                    n = m;
                                }

                          }
     )* {
            if(correctType == true){
                $typeS = $f1.typeS;
            }
            if(isSet && n!=null && $set!=null){
                $treeS = n;
                //System.out.println("woot "+n.toStringSort("infix"));
            }

        }
     ;

/* ****** Factor ****** */

factor [IdentifiersTable idTH,Set set] //vai ser preciso ver as pre-condiçoes de todos as alternativas feitas
       returns [String typeS,int line, int pos,Node treeS, String mipsCodeS]
       @init{
        $treeS = null;
        $mipsCodeS = null;
        String side = "right";
       }
       : i=inic_var[idTH, set]           {$typeS = $i.typeS; $line = $i.line; $pos = $i.pos; if(isSet && $i.treeS!=null && $set!=null){ $treeS = $i.treeS;} $mipsCodeS = $i.mipsCodeS;}
       | d=designator[idTH, set, side]         {$typeS = $d.typeS; $line = $d.line; $pos = $d.pos; $mipsCodeS = $d.mipsCodeS; if(isSet && $d.treeS!=null && $set!=null){ $treeS = $d.treeS;}}
       | '(' e=expression[idTH, set] ')' {$typeS = $e.typeS; $line = $e.line; $pos = $e.pos; $mipsCodeS = $e.mipsCodeS; if(isSet && $e.treeS!=null && $set!=null){ $treeS = $e.treeS;}}
       | '!' f1=factor[idTH, set]
        {
            $line = $f1.line;
            $pos = $f1.pos;
            if($f1.typeS!=null && $f1.typeS.equals("boolean")){
                $typeS = $f1.typeS;
            }else{
                $typeS = null;
                e.addMessage($f1.line,$f1.pos,ErrorMessage.semantic($f1.text,ErrorMessage.type($f1.typeS,"boolean")));
            }
            if(isSet && $set!=null){
                Node n = new Node(new Data("not"),$f1.treeS,null);
                $treeS = n;
            }
        }
       | f2=function_call[idTH, set]      {$typeS = null; if(isSet && $set!=null){$treeS = $f2.treeS;}}                                         // sintetizar a linha e a posição e declarar o tipo da funcao !!!!!
       | s=specialFunctions[idTH, set]   {$typeS = $s.typeS; $line = $s.line; $pos = $s.pos; if(isSet && $s.treeS!=null && $set!=null){ $treeS = $s.treeS;}}
       ;

specialFunctions [IdentifiersTable idTH, Set set]
                 returns [String typeS, int line, int pos, Node treeS]
                 : t=tail[idTH, set]     {$typeS = $tail.typeS; $line = $tail.line; $pos = $tail.pos; if(isSet && $t.treeS!=null && $set!=null){$treeS = $t.treeS;}}
                 | h=head[idTH, set]     {$typeS = $head.typeS; $line = $head.line; $pos = $head.pos; if(isSet && $h.treeS!=null && $set!=null){$treeS = $h.treeS;}}
                 | c=cons[idTH, set]     {$typeS = $cons.typeS; $line = $cons.line; $pos = $cons.pos; if(isSet && $c.treeS!=null && $set!=null){$treeS = $c.treeS;}}
                 | m=member[idTH, set]   {$typeS = $member.typeS; $line = $member.line; $pos = $member.pos; if(isSet && $m.treeS!=null && $set!=null){$treeS = $m.treeS;}}
                 | i=is_empty[idTH, set] {$typeS = $is_empty.typeS; $line = $is_empty.line; $pos = $is_empty.pos; if(isSet && $i.treeS!=null && $set!=null){$treeS = $i.treeS;}}
                 | l=length[idTH, set]   {$typeS = $length.typeS; $line = $length.line; $pos = $length.pos; if(isSet && $l.treeS!=null && $set!=null){$treeS = $l.treeS;}}
                 | d=delete[idTH, set]   {$typeS = $delete.typeS; $line = $delete.line; $pos = $delete.pos; if(isSet && $d.treeS!=null && $set!=null){$treeS = $d.treeS;}}
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
       : r='==' {$typeS = "integer"; $line = $r.line; $pos = $r.pos;}
       | r='!=' {$typeS = "integer"; $line = $r.line; $pos = $r.pos;}
       | r='<'  {$typeS = "integer"; $line = $r.line; $pos = $r.pos;}
       | r='>'  {$typeS = "integer"; $line = $r.line; $pos = $r.pos;}
       | r='<=' {$typeS = "integer"; $line = $r.line; $pos = $r.pos;}
       | r='>=' {$typeS = "integer"; $line = $r.line; $pos = $r.pos;}
       | r='in' {$typeS = "integer"; $line = $r.line; $pos = $r.pos;}
       ;

/* ****** Write statement ****** */

write_statement [IdentifiersTable idTH]
                : write_expr '(' print_what[idTH] ')'
                ;

write_expr : 'write'
           | 'writeln'
           ;

print_what [IdentifiersTable idTH]
           @init{
              Set tree = null;
           }
           :
           | e=expression[idTH, tree] {if( $e.typeS == null || $e.typeS.equals("set")){e.addMessage($e.line,$e.pos,ErrorMessage.semantic($e.text,ErrorMessage.type($e.typeS,"integer | boolean | sequence | array")));}} //conjuntos nao pode pertencer
           ;

/* ****** Read statement ****** */

read_statement [IdentifiersTable idTH]
               : 'input' '(' i=identifier ')'
               {
                  Var v = (Var) $idTH.getInfoIdentifiersTable($i.text);
                  if(!(v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer"))){       //verificar se existe e é tipo inteiro e class VAR
                    e.addMessage($i.line,$i.pos,ErrorMessage.semantic($i.text,ErrorMessage.type(v.getInfoType(),"integer")));
                  }
               }
               ;

/* ****** Conditional & Iterative ****** */

conditional_statement [IdentifiersTable idTH]
                      : if_then_else_stat[idTH]
                      ;

iterative_statement [IdentifiersTable idTH]
                    : for_stat[idTH]
                    | while_stat[idTH]
                    ;

/* ****** if_then_else_stat ****** */

if_then_else_stat [IdentifiersTable idTH]
                  @init{
                    Set tree = null;
                  }
                  : 'if' '(' e1=expression[idTH, tree] ')' { if(!($e1.typeS!=null && $e1.typeS.equals("boolean"))){e.addMessage($e1.line,$e1.pos,ErrorMessage.semantic($e1.text,ErrorMessage.type($e1.typeS,"boolean")));}}
                    'then' '{' s=statements[idTH] '}'
                    e2=else_expression[idTH]
                  ;

else_expression [IdentifiersTable idTH]
                :
                | 'else' '{' statements[idTH] '}'
                ;

/* ****** for_stat ****** */

for_stat [IdentifiersTable idTH]
         : 'for' '(' interval[idTH] ')' step satisfy[idTH]
           '{' statements[idTH] '}'
         ;

interval [IdentifiersTable idTH]
         : i=identifier type_interval[idTH]
         {
            Var v = (Var) $idTH.getInfoIdentifiersTable($i.text);
            if(!(v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer"))){   //identifier tem que pertencer a tabela, cat VAR e tipo inteiro
                e.addMessage($i.line,$i.pos,ErrorMessage.semantic($i.text,ErrorMessage.type(v.getInfoType(),"integer")));
            }
         }
         ;

type_interval [IdentifiersTable idTH]
              : 'in' range[idTH]  //
              | 'inArray' i=identifier
              {
                Var v = (Var) $idTH.getInfoIdentifiersTable($i.text);
                if(!(v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("array"))){   //identifier => Array e cat VAR
                    e.addMessage($i.line,$i.pos,ErrorMessage.semantic($i.text,ErrorMessage.type(v.getInfoType(),"integer")));
                }
              }
              //| 'inFunction' identifier //tenho aqui representado !
              ;

range [IdentifiersTable idTH]
      : minimum[idTH] '..' maximum[idTH]
      ;

minimum [IdentifiersTable idTH]
        : number
        | i=identifier
         {
            Var v = (Var) $idTH.getInfoIdentifiersTable($i.text);
            if(!(v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer"))){       //tem que existir e tem que ser variavel tipo inteiro , cat VAR
                e.addMessage($i.line,$i.pos,ErrorMessage.semantic($i.text,ErrorMessage.type(v.getInfoType(),"integer")));
            }
         }
        ;

maximum [IdentifiersTable idTH]
        : number
        | i=identifier
        {
            Var v = (Var) $idTH.getInfoIdentifiersTable($i.text);
            if(!(v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer"))){       //tem que existir e tem que ser variavel tipo inteiro , cat VAR
                e.addMessage($i.line,$i.pos,ErrorMessage.semantic($i.text,ErrorMessage.type(v.getInfoType(),"integer")));
            }
        }
        ;

step :
     | up_down number
     ;

up_down : 'stepUp'
        | 'stepDown'
        ;

satisfy [IdentifiersTable idTH]
        @init{
            Set tree = null;
        }
        :
        | 'satisfying' e=expression[idTH, tree]
        {
            if(!($e.typeS !=null && $e.typeS.equals("boolean"))){
                e.addMessage($e.line,$e.pos,ErrorMessage.semantic($e.text,ErrorMessage.type($e.typeS,"boolean")));
            }
        } //boolean expression
        ;

/* ****** While_Stat ****** */

while_stat [IdentifiersTable idTH]
           @init{
              Set tree = null;
           }
           : 'while' '(' e=expression[idTH, tree] ')' { if(!($e.typeS!=null && $e.typeS.equals("boolean"))){e.addMessage($e.line,$e.pos,ErrorMessage.semantic($e.text,ErrorMessage.type($e.typeS,"boolean")));}}
             '{' statements[idTH] '}'
           ;

/* ****** Succ_Or_Predd ****** */

succ_or_pred [IdentifiersTable idTH]
             : succ_pred i=identifier
             {
                Var v = (Var) $idTH.getInfoIdentifiersTable($i.text);
                if( !( $i.text.matches("^[0-9]+$") || (v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer")) ) ){
                    e.addMessage($i.line,$i.pos,ErrorMessage.semantic($i.text,ErrorMessage.type("null","integer")));
                }
             }//identifier inteiro
             ;

succ_pred : 'succ'
          | 'pred'
          ;

/* ****** SequenceOper ****** */

tail [IdentifiersTable idTH, Set set]
     returns [String typeS, int line, int pos, Node treeS]
     @init{

     }
     // tail : sequence -> sequence
     : t='tail' '(' e=expression[idTH, set] ')'
     {
        $line = $t.line;
        $pos = $t.pos;
        if(($e.typeS != null) && $e.typeS.equals("sequence")){
            $typeS = $e.typeS;
        }else{
            e.addMessage($e.line,$e.pos,ErrorMessage.semantic($e.text,ErrorMessage.type($e.typeS,"sequence")));
        }

        if($set!=null && isSet){
            Node left = new Node(new Data("tail"),null,null);
            Node n = new Node(new Data("call"),left,new Node(new Data("args"),$e.treeS,null));
            $treeS = n;
        }
     }
     ;

head [IdentifiersTable idTH, Set set]
     returns [String typeS, int line, int pos, Node treeS]
     @init{

     }
     // head : sequence -> integer
     : h='head' '(' e=expression[idTH, set] ')'
     {
        $line = $h.line;
        $pos = $h.pos;
        if(($e.typeS != null) && $e.typeS.equals("sequence")){
            $typeS = "integer"; 
        }else{ 
            e.addMessage($e.line,$e.pos,ErrorMessage.semantic($e.text,ErrorMessage.type($e.typeS,"sequence")));
        }

        if($set!=null && isSet){
            Node left = new Node(new Data("head"),null,null);
            Node n = new Node(new Data("call"),left,new Node(new Data("args"),$e.treeS,null));
            $treeS = n;
        }
     }
     ;

cons [IdentifiersTable idTH, Set set]
     returns [String typeS, int line, int pos, Node treeS]
     @init{

     }
     // integer x sequence -> sequence
     : c='cons' '(' e1=expression[idTH, set] ',' e2=expression[idTH, set] ')'
        {
            $line = $c.line;
            $pos = $c.pos;
            if(($e1.typeS != null) && $e1.typeS.equals("integer") ){
                if(($e2.typeS != null) && $e2.typeS.equals("sequence")){
                    $typeS = "sequence";
                }else{
                        e.addMessage($e2.line,$e2.pos,ErrorMessage.semantic($e2.text,ErrorMessage.type($e2.typeS,"sequence")));
                }
            }else{
                    e.addMessage($e1.line,$e1.pos,ErrorMessage.semantic($e1.text,ErrorMessage.type($e1.typeS,"integer")));
            }
            if($set!=null && isSet){
                Node left = new Node(new Data("cons"),null,null);
                Node n = new Node(new Data("call"),left,new Node(new Data("args"),$e1.treeS,new Node(new Data("args"),$e2.treeS,null)));
                $treeS = n;
            }
        }
     ;

delete [IdentifiersTable idTH, Set set]
       returns [String typeS, int line, int pos, Node treeS]
       @init{

       }
       // del : integer x sequence -> sequence
       : d='del' '(' e1=expression[idTH, set] ',' e2=expression[idTH, set] ')'
        {
            $line = $d.line;
            $pos = $d.pos;
            if(($e1.typeS != null) && $e1.typeS.equals("integer") ){
                if(($e2.typeS != null) && $e2.typeS.equals("sequence")){
                    $typeS = "sequence";
                }else{
                    e.addMessage($e2.line,$e2.pos,ErrorMessage.semantic($e2.text,ErrorMessage.type($e2.typeS,"sequence")));
                }
            }else{
                e.addMessage($e1.line,$e1.pos,ErrorMessage.semantic($e1.text,ErrorMessage.type($e1.typeS,"integer")));
            }
            if($set!=null && isSet){
                Node left = new Node(new Data("delete"),null,null);
                Node n = new Node(new Data("call"),left,new Node(new Data("args"),$e1.treeS,new Node(new Data("args"),$e2.treeS,null)));
                $treeS = n;
            }
        }
       ;

copy_statement [IdentifiersTable idTH]
               returns [String typeS, int line, int pos]
               // copy_statement : seq x seq -> void
               : 'copy' '(' i1=identifier ',' i2=identifier ')'
               {
                  Var v1 = (Var) $idTH.getInfoIdentifiersTable($i1.text);
                  Var v2 = (Var) $idTH.getInfoIdentifiersTable($i2.text);

                  if( !( v1 != null && v1.getInfoType().equals("sequence") && v1.getCategory().equals("VAR") ) ){
                    e.addMessage($i1.line,$i2.pos,ErrorMessage.semantic($i1.text,ErrorMessage.type("boolean | sequence | integer","sequence")));
                  }
                  if( !( v2 != null && v2.getInfoType().equals("sequence") && v2.getCategory().equals("VAR") ) ){
                    e.addMessage($i2.line,$i2.pos,ErrorMessage.semantic($i2.text,ErrorMessage.type("boolean | sequence | integer","sequence")));
                  }
               }//ambos identificadores tem que existir, categoria VAR e Sequence
               ;

cat_statement [IdentifiersTable idTH]
              returns [String typeS, int line, int pos]
              //cat_statement : seq x seq -> void
              : 'cat' '(' i1=identifier ',' i2=identifier ')'
              {
                Var v1 = (Var) $idTH.getInfoIdentifiersTable($i1.text);
                Var v2 = (Var) $idTH.getInfoIdentifiersTable($i2.text);

                if( !( v1 != null && v1.getInfoType().equals("sequence") && v1.getCategory().equals("VAR") ) ){
                    e.addMessage($i1.line,$i2.pos,ErrorMessage.semantic($i1.text,ErrorMessage.type("boolean | sequence | integer","sequence")));
                }
                if( !( v2 != null && v2.getInfoType().equals("sequence") && v2.getCategory().equals("VAR") ) ){
                    e.addMessage($i2.line,$i2.pos,ErrorMessage.semantic($i2.text,ErrorMessage.type("boolean | sequence | integer","sequence")));
                }

              }//ambos identificadores tem que existir, categoria VAR e Sequence
              ;

is_empty [IdentifiersTable idTH, Set set]
         returns [String typeS, int line, int pos, Node treeS]
         @init{

         }
         // is_empty : sequence -> boolean
         : i='isEmpty' '(' e1=expression[idTH, set] ')'
         {
            $line = $i.line;
            $pos = $i.pos;
            if(($e1.typeS != null) && $e1.typeS.equals("sequence")){
                $typeS = "boolean";
            }else{
                e.addMessage($e1.line,$e1.pos,ErrorMessage.semantic($e1.text,ErrorMessage.type($e1.typeS,"sequence")));
            }
            if($set!=null && isSet){
                Node left = new Node(new Data("is_empty"),null,null);
                Node n = new Node(new Data("call"),left,new Node(new Data("args"),$e1.treeS,null));
                $treeS = n;
            }
         }
         ;

length [IdentifiersTable idTH, Set set]
       returns [String typeS, int line, int pos, Node treeS]
       @init{

       }
       // length : sequence -> integer
       : l='length' '(' e1=expression[idTH, set] ')'
       {
          $line = $l.line;
          $pos = $l.pos;
          if(($e1.typeS != null) && $e1.typeS.equals("sequence")){
              $typeS = "integer";
          }else{
              e.addMessage($e1.line,$e1.pos,ErrorMessage.semantic($e1.text,ErrorMessage.type($e1.typeS,"sequence")));
          }
          if($set!=null && isSet){
             Node left = new Node(new Data("length"),null,null);
             Node n = new Node(new Data("call"),left,new Node(new Data("args"),$e1.treeS,null));
             $treeS = n;
          }
       }
       ;

/* ****** set_oper ****** */

member [IdentifiersTable idTH, Set set]
       returns [String typeS, int line, int pos, Node treeS]
       @init{

       }
       // isMember : integer x sequence -> boolean
       : im='isMember' '(' e=expression[idTH, set] ',' i=identifier ')'
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
          if($set!=null && isSet){
            Data d = $set.getIdentifier();
            Node left = new Node(new Data("member"),null,null);
            Node n = null;
            if(d.getData().equals($i.text)){
                n = new Node(new Data("call"),left,new Node(new Data("args"),$e.treeS,new Node(new Data("args"),new Node(d,null,null),null)));
            }else{
                n = new Node(new Data("call"),left,new Node(new Data("args"),$e.treeS,new Node(new Data("args"),new Node(new Data($i.text),null,null),null)));
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
    : '/*'.*?'*/' /* multiple comments*/
    | '//'~('\r' | '\n')* /* single comment*/
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
