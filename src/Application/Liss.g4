/*
 * Version eBNF of Liss
 * Author : Damien + PRH
 * Date : 2015.03.11
 */
grammar Liss;

@header{
    import java.util.HashMap;
    import java.util.LinkedList;
}

@members{
    int level = 0;
    TableError e = new TableError();
    boolean set = false;
    int i= 0;

}

/* ****** Program ****** */

liss [IdentifiersTable idTH]
     : 'program' identifier body[idTH] {System.out.println(e.toString());}
     ;

body[IdentifiersTable idTH]
     : '{'
       'declarations' declarations[idTH]
       'statements' statements[idTH]
       '}'
     ;

/* ****** Declarations ****** */

declarations[IdentifiersTable idTH]
             : declaration[idTH]*
             ;

declaration [IdentifiersTable idTH]
            : variable_declaration[idTH]
            | subprogram_definition[idTH] {level--;}
            ;

/* ****** Variables ****** */

variable_declaration [IdentifiersTable idTH]
                     : vars[idTH] '->' type ';' {
                            HashMap<String, HashMap<String,Object>> varsH = $vars.varsS;
                            if($type.typeS == "array" ){
                                for(String i : varsH.keySet()){
                                    varsH.get(i).put("dimension",$type.arrayDimension);
                                }
                            }


                            //Print the HashMap<String, HashMap<String,Object>> varsH
                            /*for(String i : varsH.keySet()){
                                System.out.println("Variable: "+i+" "+varsH.get(i).toString());
                            }*/


                            $idTH.add(e,varsH,$type.typeS,level);
                            if(set){set = false;}
                     }
                     ;

vars [IdentifiersTable idTH]
     returns [HashMap<String, HashMap<String,Object>> varsS]
     @init{
        HashMap<String, HashMap<String,Object>> info = new HashMap<String, HashMap<String,Object>>();
     }
     : var[idTH]  {
                if(!info.containsKey($var.text)){
                    info.put($var.idS,$var.infoVarS);
                }else{
                    //ErrorMessage.errorSemantic($var.text,(int)$var.infoVarS.get("line"), (int)$var.infoVarS.get("pos"),ErrorMessage.errorDeclarations);
                    e.addMessage((int)$var.infoVarS.get("line"),(int)$var.infoVarS.get("pos"),ErrorMessage.semantic($var.text,ErrorMessage.Declarations));
                }
            }
       (',' var[idTH] {
                    if(!info.containsKey($var.text)){
                        info.put($var.idS,$var.infoVarS);
                    }else{
                        //ErrorMessage.errorSemantic($var.text,(int)$var.infoVarS.get("line"), (int)$var.infoVarS.get("pos"),ErrorMessage.errorDeclarations);
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
    : identifier value_var[idTH]
    {
        info.put("pos",$identifier.pos);
        info.put("line",$identifier.line);

        $idS = $identifier.text;
        $infoVarS = info;
    }
    ;

value_var [IdentifiersTable idTH]
          returns [boolean universe]  //Universe refers to the Set composition
          @init{
            $universe = false;
          }
          :                     {}
          | '=' inic_var[idTH]  {}
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

inic_var [IdentifiersTable idTH]
         returns [String typeS, int line, int pos]
         : constant              {$typeS = $constant.typeS; $line = $constant.line; $pos = $constant.pos;}
         | array_definition      {$typeS = "integer";}
         | set_definition[idTH]  {$typeS = "set";}
         | sequence_definition   {$typeS = "sequence";}
         ;

constant returns [String typeS, int line, int pos]
         : sign number {$typeS = "integer"; $line = $number.line; $pos = $number.pos;}
         | t='true'      {$typeS = "boolean"; $line = $t.line; $pos = $t.pos; }
         | f='false'     {$typeS = "boolean"; $line = $f.line; $pos = $f.pos;}
         ;

sign :
     | '+'
     | '-'
     ;

/* ****** Array definition ****** */

array_definition : '[' array_initialization ']'
                 ;

array_initialization : elem (',' elem)*
                     ;

elem : number
     | array_definition
     ;

/* ****** Sequence definition ****** */

sequence_definition : '<<' sequence_initialization '>>'
                    ;

sequence_initialization :
                        | values
                        ;

values : number (',' number)*
       ;

/* ****** Set definition ****** */

set_definition [IdentifiersTable idTH]
               : '{'
                 set_initialization[idTH]
                 '}'
               ;

set_initialization [IdentifiersTable idTH]
                   returns [BinaryTree treeS]
                   @init{
                      set = true;
                      BinaryTree tree = null;
                   }
                   :                                    //o set é vazio, é o nada
                   | i=identifier
                   {
                    tree = new BinaryTree($i.text);

                   }
                    '|'
                    e=expression[idTH,tree]
                   {
                    if( !($e.typeS != null && $e.typeS.equals("boolean")) ){
                        e.addMessage($e.line,$e.pos,ErrorMessage.semantic($e.text,ErrorMessage.type($e.typeS,"boolean")));
                    }
                    // tree.add("");
                    tree = $e.treeS;
                    /*tree.add("x");
                    tree.add("<");
                    tree.add("2");
                    tree.add("&&");
                    tree.add("x");
                    tree.add(">");
                    tree.add("-1");
                    tree.add("||");
                    tree.add("2");
                    tree.add("<");
                    tree.add("x");
                    System.out.println(tree.toString());
                    tree.setIdentifier("20");
                    System.out.println(tree.toString());
                    tree.setIdentifier("woot");
                    System.out.println(tree.toString());*/

                    $treeS = tree;

                    System.out.println(tree.toString());

                    //$e.treeS.add("<");$e.treeS.add("3");

                   }
                   ;

/* ****** SubProgram definition ****** */

subprogram_definition[IdentifiersTable idTH]
                      @init{
                        level++;
                      }
                      : 'subprogram' identifier
                        '(' formal_args ')' return_type f_body[idTH]
                      ;

f_body[IdentifiersTable idTH]
       : '{'
         'declarations' declarations[idTH]
         'statements' statements[idTH]
         returnSubPrg[idTH]
         '}'
       ;

/* ****** Formal args ****** */

formal_args :
            | f_args
            ;

f_args : formal_arg (';' formal_arg)*
       ;

formal_arg : identifier '->' type
           ;

/* ****** Return type ****** */

return_type :
            | '->' type
            ;

/* ****** Return ****** */

returnSubPrg [IdentifiersTable idTH]
             @init{
                BinaryTree tree = null;
             }
             :
             | 'return' expression[idTH,tree] ';'
             ;

/* ****** Statements ****** */

statements [IdentifiersTable idTH]
            : statement[idTH]*
            ;

statement [IdentifiersTable idTH]
          : assignment[idTH] ';'
          | write_statement[idTH] ';'
          | read_statement[idTH] ';'
          | conditional_statement[idTH]
          | iterative_statement[idTH]
          | function_call[idTH] ';'
          | succ_or_pred[idTH] ';'
          | copy_statement[idTH] ';'
          | cat_statement[idTH] ';' // conjuntos de sequencias
          ;

/* ****** Assignment ****** */

assignment [IdentifiersTable idTH]
           returns [String typeS]
           @init{
                $typeS = null;
                BinaryTree tree = null;
           }
           : designator[idTH,tree] '=' expression[idTH,tree]
           {
              if(($designator.typeS != null && $expression.typeS != null) && $designator.typeS.equals($expression.typeS)){
                $typeS = $designator.typeS;
                System.out.println($designator.line+"Funcionou ;D");
              }else{
                //ErrorMessage.errorSemanticAssignment($designator.line);
                e.addMessage($designator.line,-1,ErrorMessage.semanticAssignment($designator.line)); //-1 => assignemen error => there is no pos.
              }
           }
           ;

/* ****** Designator ****** */

designator [IdentifiersTable idTH, BinaryTree tree]
            returns [String typeS, int line, int pos]
            @init{
                $typeS = null;
            }
           : identifier array_access[idTH]
           {
                                $line = $identifier.line;
                                $pos = $identifier.pos;
                                //Pre-Condicao: é um identificador
                                if(!$array_access.response){
                                    //Pre-Condicao: ver se existe na tabela de identificador
                                    if(!$idTH.getIdentifiersTable().containsKey($identifier.text)){

                                        //ErrorMessage.errorSemantic($identifier.text,$identifier.line,$identifier.pos,ErrorMessage.errorStatements);
                                        e.addMessage($identifier.line,$identifier.pos,ErrorMessage.semantic($identifier.text,ErrorMessage.Statements));

                                    }else{
                                        if(!$idTH.getIdentifiersTable().get($identifier.text).getCategory().equals(new String("TYPE"))){
                                            Var v = (Var) $idTH.getIdentifiersTable().get($identifier.text);
                                            $typeS = v.getInfoType();
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
                                        Var v = (Var) $idTH.getIdentifiersTable().get($identifier.text);

                                        if(v.getCategory().equals(new String("TYPE"))){
                                            //ErrorMessage.errorSemantic($identifier.text,$identifier.line,$identifier.pos,ErrorMessage.errorStatements);
                                            e.addMessage($identifier.line,$identifier.pos,ErrorMessage.semantic($identifier.text,ErrorMessage.Statements));

                                        }else{
                                            if(!v.getInfoType().equals(new String("array"))){
                                                //ErrorMessage.errorSemantic($identifier.text,$identifier.line,$identifier.pos,ErrorMessage.errorArrayType);
                                                e.addMessage($identifier.line,$identifier.pos,ErrorMessage.semantic($identifier.text,ErrorMessage.ArrayType));
                                            }else{
                                                Array a = (Array) v;
                                                //System.out.println("Dimension: "+a.getDimension());

                                                //Pre-Condição : Testar as dimensoes do array (feito atraves da seguinta forma : Valor do identifier da TI == valor do identifier)
                                                if(a.getDimension().compareTo($array_access.dimensionS) == 0){
                                                    //$typeS = v.getInfoType() ;
                                                    $typeS = "integer"; //v[1,1] => inteiro como tipo nao array
                                                }else{
                                                    //ErrorMessage.errorSemantic($identifier.text,$identifier.line,$identifier.pos,ErrorMessage.createMessageDimensionArray($array_access.dimensionS,a.getDimension()));
                                                    e.addMessage($identifier.line,$identifier.pos,ErrorMessage.semantic($identifier.text,ErrorMessage.dimensionArray($array_access.dimensionS,a.getDimension())));
                                                    //System.out.println("Dimension demasiadas grandes do array "+$identifier.text);
                                                }
                                            }
                                        }
                                    }

                                }

           }
           ;

array_access [IdentifiersTable idTH]
             returns [boolean response, int dimensionS]//response variable => if array_access exists or not
             :                          {$response = false;}
             | '[' elem_array[idTH] ']' {$response = true; $dimensionS = $elem_array.dimensionS;}
             ;

elem_array [IdentifiersTable idTH]
           returns[int dimensionS]
           @init{
                int dimension = 0;
                BinaryTree tree = null;
           }
           : single_expression[idTH, tree]
                                    {
                                      dimension++;
                                      if(!($single_expression.typeS == "integer"))
                                           {
                                            //ErrorMessage.errorSemantic($single_expression.text,$single_expression.line,$single_expression.pos,ErrorMessage.type($single_expression.typeS,"integer"));
                                            e.addMessage($single_expression.line,$single_expression.pos,ErrorMessage.semantic($single_expression.text,ErrorMessage.type($single_expression.typeS,"integer")));
                                           }
                                    }
           (',' single_expression[idTH, tree]
                                    {
                                        dimension++;
                                        if(!($single_expression.typeS == "integer")){
                                            //ErrorMessage.errorSemantic($single_expression.text,$single_expression.line,$single_expression.pos,ErrorMessage.type($single_expression.typeS,"integer"));
                                            e.addMessage($single_expression.line,$single_expression.pos,ErrorMessage.semantic($single_expression.text,ErrorMessage.type($single_expression.typeS,"integer")));
                                        }

                                    }
           )* {$dimensionS = dimension;}
           ;

/* ****** Function call ****** */

function_call [IdentifiersTable idTH]
              : identifier '(' sub_prg_args[idTH] ')'
              ;

sub_prg_args [IdentifiersTable idTH]
             :
             | args[idTH]
             ;

args [IdentifiersTable idTH]
     @init{
        BinaryTree tree = null;
     }
     : expression[idTH, tree] (',' expression[idTH, tree])*
     ;

/* ****** Expression ****** */

expression [IdentifiersTable idTH, BinaryTree tree]
            returns [String typeS, int line, int pos, BinaryTree treeS ]
            @init{
                $typeS = null;
                boolean correctType = true;
                boolean relationExp = false;

            }
           : s1=single_expression[idTH, tree]{$line = $s1.line; $pos = $s1.pos;}
            (rel_op s2=single_expression[idTH,tree]
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
                    if($tree != null && set){System.out.println(" da fuck?3");$tree.add($rel_op.text);}

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
                if($tree!= null && set){  $treeS = $tree;}

            }
           ;

/* ****** Single expression ****** */

single_expression [IdentifiersTable idTH, BinaryTree tree]
                  returns [String typeS, int line, int pos, BinaryTree treeS ]
                  @init{
                    $typeS = null;
                    boolean correctType = true;
                    boolean firstTime = true;
                    String leftType = null;

                    //Tratar os erros com mais especificaçoes
                    LinkedList<ErrorInfo> errorManagement = new LinkedList<ErrorInfo>();
                  }
                  : t1=term[idTH, tree] {$line = $term.line; $pos = $term.pos; errorManagement.add(new ErrorInfo($t1.text,$t1.typeS,$t1.line,$t1.pos));}
                  (add_op t2=term[idTH, tree] {
                                        errorManagement.add(new ErrorInfo($add_op.text,$add_op.typeS,$add_op.line,$add_op.pos));
                                        errorManagement.add(new ErrorInfo($t2.text,$t2.typeS,$t2.line,$t2.pos));


                                        if(firstTime){
                                            firstTime = false;
                                            if(($t1.typeS != null) && $t1.typeS.equals($add_op.typeS)){
                                                if(($t2.typeS != null) && $add_op.typeS.equals($t2.typeS)){
                                                    leftType = $add_op.typeS;

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
                                                }else{
                                                    e.addMessage(leftVar.getLine(),leftVar.getPos(),ErrorMessage.semantic(leftVar.getIdentifier()+" "+$add_op.text+" "+$t2.text,ErrorMessage.typeExpression(leftVar.getType(),$add_op.text,$t2.typeS,$add_op.typeS,$add_op.typeS)+" < single_Expression 3"));
                                                    correctType = false;
                                                }
                                            }else{
                                                e.addMessage(leftVar.getLine(),leftVar.getPos(),ErrorMessage.semantic(leftVar.getIdentifier()+" "+$add_op.text+" "+$t2.text,ErrorMessage.typeExpression(leftVar.getType(),$add_op.text,$t2.typeS,$add_op.typeS,$add_op.typeS)+" < single_Expression 4"));
                                                correctType = false;
                                            }

                                        }
                                        //if($tree != null && set ){System.out.println(" da fuck?2 "+$add_op.text);$tree.add($add_op.text);}
                                        if(set && $add_op.text!=null && tree!=null){$tree.add($add_op.text);}
                                     }
                  )* {
                        if(correctType == true){
                            $typeS = $t1.typeS;
                        }
                        if($tree!=null && set){$treeS = $tree;}

                     }
                  ;

/* ****** Term ****** */

term [IdentifiersTable idTH, BinaryTree tree]
     returns [String typeS, int line, int pos, BinaryTree treeS]
     @init{
        $typeS = null;
        boolean correctType = true;
        boolean firstTime = true;
        String leftType = null;

        //Tratar os erros com mais especificaçoes (queue de erros de infromaçoes)
        LinkedList<ErrorInfo> errorManagement = new LinkedList<ErrorInfo>();

     }
     : f1=factor[idTH,tree] { $line = $f1.line; $pos = $f1.pos;  errorManagement.add(new ErrorInfo($f1.text, $f1.typeS, $f1.line,$f1.pos)); if($tree!=null && set){$tree = $f1.treeS;} }
     (mul_op f2=factor[idTH,tree] {

                                errorManagement.add(new ErrorInfo($mul_op.text,$mul_op.typeS,$mul_op.line,$mul_op.pos));
                                errorManagement.add(new ErrorInfo($f2.text,$f2.typeS,$f2.line,$f2.pos));

                                if(firstTime){
                                    firstTime = false;
                                    if(($f1.typeS != null) && $f1.typeS.equals($mul_op.typeS)){
                                        if(($f2.typeS != null) && $mul_op.typeS.equals($f2.typeS)){
                                            leftType = $mul_op.typeS;
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
                                //if($tree!=null && set && $mul_op.text!=null){System.out.println($mul_op.text);System.out.println(" da fuck?");$tree.add($mul_op.text);$tree.add($f2.text);}
                                if(set && $mul_op.text!=null && tree!=null){$tree.add($mul_op.text);}
                                if($tree!=null && set){$tree = $f2.treeS;}

                          }
     )* {
            if(correctType == true){
                $typeS = $f1.typeS;
            }

            if($tree!=null && set){$treeS = $tree;}
        }
     ;

/* ****** Factor ****** */

factor [IdentifiersTable idTH,BinaryTree tree] //vai ser preciso ver as pre-condiçoes de todos as alternativas feitas
       returns [String typeS,int line, int pos,BinaryTree treeS]
       : i=inic_var[idTH]           {$typeS = $i.typeS; $line = $i.line; $pos = $i.pos;}
       | d=designator[idTH,tree]         {$typeS = $d.typeS; $line = $d.line; $pos = $d.pos; if(tree!=null && set){$treeS = $tree;}}
       | '(' e=expression[idTH, tree] ')' {$typeS = $e.typeS; $line = $e.line; $pos = $e.pos;}
       | '!' f=factor[idTH,tree]
        {
            if($f.typeS.equals("boolean")){
                $typeS = $f.typeS;
            }else{
                $typeS = null;
                e.addMessage($f.line,$f.pos,ErrorMessage.semantic($f.text,ErrorMessage.type($f.typeS,"boolean")));
            }
        }
       | function_call[idTH]      {$typeS = null;}                                         // sintetizar a linha e a posição !!!
       | s=specialFunctions[idTH]   {$typeS = $s.typeS; $line = $s.line; $pos = $s.pos;}
       ;

specialFunctions [IdentifiersTable idTH]
                 returns [String typeS, int line, int pos]
                 : tail[idTH]     {$typeS = $tail.typeS; $line = $tail.line; $pos = $tail.pos;}
                 | head[idTH]     {$typeS = $head.typeS; $line = $head.line; $pos = $head.pos;}
                 | cons[idTH]     {$typeS = $cons.typeS; $line = $cons.line; $pos = $cons.pos;}
                 | member[idTH]   {$typeS = $member.typeS; $line = $member.line; $pos = $member.pos;}
                 | is_empty[idTH] {$typeS = $is_empty.typeS; $line = $is_empty.line; $pos = $is_empty.pos;}
                 | length[idTH]   {$typeS = $length.typeS; $line = $length.line; $pos = $length.pos;}
                 | delete[idTH]   {$typeS = $delete.typeS; $line = $delete.line; $pos = $delete.pos;}
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
              BinaryTree tree = null;
           }
           :
           | e=expression[idTH, tree] {if(!($e.typeS != null && $e.typeS.equals("set"))){e.addMessage($e.line,$e.pos,ErrorMessage.semantic($e.text,ErrorMessage.type($e.typeS,"integer | boolean | sequence | array")));}} //conjuntos nao pode pertencer
           ;

/* ****** Read statement ****** */

read_statement [IdentifiersTable idTH]
               : 'input' '(' i=identifier ')'
               {
                  Var v = (Var) $idTH.getIdentifiersTable().get($i.text);
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
                    BinaryTree tree = null;
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
            Var v = (Var) $idTH.getIdentifiersTable().get($i.text);
            if(!(v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer"))){   //identifier tem que pertencer a tabela, cat VAR e tipo inteiro
                e.addMessage($i.line,$i.pos,ErrorMessage.semantic($i.text,ErrorMessage.type(v.getInfoType(),"integer")));
            }
         }
         ;

type_interval [IdentifiersTable idTH]
              : 'in' range[idTH]  //
              | 'inArray' i=identifier
              {
                Var v = (Var) $idTH.getIdentifiersTable().get($i.text);
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
            Var v = (Var) $idTH.getIdentifiersTable().get($i.text);
            if(!(v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer"))){       //tem que existir e tem que ser variavel tipo inteiro , cat VAR
                e.addMessage($i.line,$i.pos,ErrorMessage.semantic($i.text,ErrorMessage.type(v.getInfoType(),"integer")));
            }
         }
        ;

maximum [IdentifiersTable idTH]
        : number
        | i=identifier
        {
            Var v = (Var) $idTH.getIdentifiersTable().get($i.text);
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
            BinaryTree tree = null;
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
              BinaryTree tree = null;
           }
           : 'while' '(' e=expression[idTH, tree] ')' { if(!($e.typeS!=null && $e.typeS.equals("boolean"))){e.addMessage($e.line,$e.pos,ErrorMessage.semantic($e.text,ErrorMessage.type($e.typeS,"boolean")));}}
             '{' statements[idTH] '}'
           ;

/* ****** Succ_Or_Predd ****** */

succ_or_pred [IdentifiersTable idTH]
             : succ_pred i=identifier
             {
                Var v = (Var) $idTH.getIdentifiersTable().get($i.text);
                if( !( $i.text.matches("^[0-9]+$") || (v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer")) ) ){
                    e.addMessage($i.line,$i.pos,ErrorMessage.semantic($i.text,ErrorMessage.type("null","integer")));
                }
             }//identifier inteiro
             ;

succ_pred : 'succ'
          | 'pred'
          ;

/* ****** SequenceOper ****** */

tail [IdentifiersTable idTH]
     returns [String typeS, int line, int pos]
     @init{
        BinaryTree tree = null;
     }
     // tail : sequence -> sequence
     : t='tail' '(' e=expression[idTH, tree] ')'
     {
        $line = $t.line;
        $pos = $t.pos;
        if(($e.typeS != null) && $e.typeS.equals("sequence")){
            $typeS = $e.typeS;
        }else{
            e.addMessage($e.line,$e.pos,ErrorMessage.semantic($e.text,ErrorMessage.type($e.typeS,"sequence")));
        }
     }
     ;

head [IdentifiersTable idTH]
     returns [String typeS, int line, int pos]
     @init{
        BinaryTree tree = null;
     }
     // head : sequence -> integer
     : h='head' '(' e=expression[idTH, tree] ')'
     {
        $line = $h.line;
        $pos = $h.pos;
        if(($e.typeS != null) && $e.typeS.equals("sequence")){
            $typeS = "integer"; 
        }else{ 
            e.addMessage($e.line,$e.pos,ErrorMessage.semantic($e.text,ErrorMessage.type($e.typeS,"sequence")));
        }
     }
     ;

cons [IdentifiersTable idTH]
     returns [String typeS, int line, int pos]
     @init{
        BinaryTree tree = null;
     }
     // integer x sequence -> sequence
     : c='cons' '(' e1=expression[idTH, tree] ',' e2=expression[idTH, tree] ')'
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
        }
     ;

delete [IdentifiersTable idTH]
       returns [String typeS, int line, int pos]
       @init{
          BinaryTree tree = null;
       }
       // del : integer x sequence -> sequence
       : d='del' '(' e1=expression[idTH, tree] ',' e2=expression[idTH, tree] ')'
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
        }
       ;

copy_statement [IdentifiersTable idTH]
               returns [String typeS, int line, int pos]
               // copy_statement : seq x seq -> void
               : 'copy' '(' i1=identifier ',' i2=identifier ')'
               {
                  Var v1 = (Var) $idTH.getIdentifiersTable().get($i1.text);
                  Var v2 = (Var) $idTH.getIdentifiersTable().get($i2.text);

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
                Var v1 = (Var) $idTH.getIdentifiersTable().get($i1.text);
                Var v2 = (Var) $idTH.getIdentifiersTable().get($i2.text);

                if( !( v1 != null && v1.getInfoType().equals("sequence") && v1.getCategory().equals("VAR") ) ){
                    e.addMessage($i1.line,$i2.pos,ErrorMessage.semantic($i1.text,ErrorMessage.type("boolean | sequence | integer","sequence")));
                }
                if( !( v2 != null && v2.getInfoType().equals("sequence") && v2.getCategory().equals("VAR") ) ){
                    e.addMessage($i2.line,$i2.pos,ErrorMessage.semantic($i2.text,ErrorMessage.type("boolean | sequence | integer","sequence")));
                }
              }//ambos identificadores tem que existir, categoria VAR e Sequence
              ;

is_empty [IdentifiersTable idTH]
         returns [String typeS, int line, int pos]
         @init{
            BinaryTree tree = null;
         }
         // is_empty : sequence -> boolean
         : i='isEmpty' '(' e1=expression[idTH, tree] ')'
         {
            $line = $i.line;
            $pos = $i.pos;
            if(($e1.typeS != null) && $e1.typeS.equals("sequence")){
                $typeS = "boolean";
            }else{
                e.addMessage($e1.line,$e1.pos,ErrorMessage.semantic($e1.text,ErrorMessage.type($e1.typeS,"sequence")));
            }
         }
         ;

length [IdentifiersTable idTH]
       returns [String typeS, int line, int pos]
       @init{
            BinaryTree tree = null;
       }
       // length : sequence -> integer
       : l='length' '(' e1=expression[idTH, tree] ')'
       {
          $line = $l.line;
          $pos = $l.pos;
          if(($e1.typeS != null) && $e1.typeS.equals("sequence")){
              $typeS = "integer";
          }else{
              e.addMessage($e1.line,$e1.pos,ErrorMessage.semantic($e1.text,ErrorMessage.type($e1.typeS,"sequence")));
          }
       }
       ;

/* ****** set_oper ****** */

member [IdentifiersTable idTH]
       returns [String typeS, int line, int pos]
       @init{
            BinaryTree tree = null;
       }
       // isMember : integer x sequence -> boolean
       : im='isMember' '(' e=expression[idTH, tree] ',' i=identifier ')'
       {
          $line = $im.line;
          $pos = $im.pos;

          String type = null;

          //Pre-Condicao : verificar se existe o identificador na tabela de identificador, caso nao existir significa que é um inteiro ou que nao foi declarado !!!
          if($idTH.getIdentifiersTable().containsKey($i.text)){
            Var v = (Var) $idTH.getIdentifiersTable().get($i.text);
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
       }
       ;



/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

string : STR ; /* verificar se é mesmo assim sintaticamente a nivel de lexer !*/

number  returns [Integer numberS,int line, int pos]
        : NBR {$numberS = Integer.parseInt($NBR.text);$line = $NBR.line;$pos = $NBR.pos;};

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
