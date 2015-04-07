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
    int level=0;
    TableError e = new TableError();
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


                            $idTH.addElementsIdentifiersTables(varsH,$type.typeS,level);

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
                    ErrorMessage.errorSemantic($var.text,(int)$var.infoVarS.get("line"), (int)$var.infoVarS.get("pos"),ErrorMessage.errorDeclarations);
                }
            }
       (',' var[idTH] {
                    if(!info.containsKey($var.text)){
                        info.put($var.idS,$var.infoVarS);
                    }else{
                        ErrorMessage.errorSemantic($var.text,(int)$var.infoVarS.get("line"), (int)$var.infoVarS.get("pos"),ErrorMessage.errorDeclarations);
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
    : identifier value_var[idTH] {
                            info.put("pos",$identifier.pos);
                            info.put("line",$identifier.line);

                            $idS = $identifier.text;
                            $infoVarS = info;
                            }
    ;

value_var [IdentifiersTable idTH]
          :
          | '=' inic_var[idTH]
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
                   :
                   | identifier '|' expression[idTH]
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
             :
             | 'return' expression[idTH] ';'
             ;

/* ****** Statements ****** */

statements [IdentifiersTable idTH]
            : statement[idTH]*
            ;

statement [IdentifiersTable idTH]
          : assignment[idTH] ';'
          | write_statement[idTH] ';'
          | read_statement ';'
          | conditional_statement[idTH]
          | iterative_statement[idTH]
          | function_call[idTH] ';'
          | succ_or_pred ';'
          | copy_statement ';'
          | cat_statement ';' // conjuntos de sequencias
          ;

/* ****** Assignment ****** */

assignment [IdentifiersTable idTH]
           returns [String typeS]
           @init{
                $typeS = null;
           }
           : designator[idTH] '=' expression[idTH]
           {
              if(($designator.typeS != null && $expression.typeS != null) && $designator.typeS.equals($expression.typeS)){
                $typeS = $designator.typeS;
                System.out.println($designator.line+"Funcionou ;D");
              }else{
                ErrorMessage.errorSemanticAssignment($designator.line);
              }
           }
           ;

/* ****** Designator ****** */

designator [IdentifiersTable idTH]
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

                                        ErrorMessage.errorSemantic($identifier.text,$identifier.line,$identifier.pos,ErrorMessage.errorStatements);

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
                                        ErrorMessage.errorSemantic($identifier.text,$identifier.line,$identifier.pos,ErrorMessage.errorStatements);

                                    }else{
                                        Var v = (Var) $idTH.getIdentifiersTable().get($identifier.text);

                                        if(v.getCategory().equals(new String("TYPE"))){
                                            ErrorMessage.errorSemantic($identifier.text,$identifier.line,$identifier.pos,ErrorMessage.errorStatements);

                                        }else{
                                            if(!v.getInfoType().equals(new String("array"))){
                                                ErrorMessage.errorSemantic($identifier.text,$identifier.line,$identifier.pos,ErrorMessage.errorArrayType);
                                            }else{
                                                Array a = (Array) v;
                                                //System.out.println("Dimension: "+a.getDimension());

                                                //Pre-Condição : Testar as dimensoes do array (feito atraves da seguinta forma : Valor do identifier da TI == valor do identifier)
                                                if(a.getDimension().compareTo($array_access.dimensionS) == 0){
                                                    //$typeS = v.getInfoType() ;
                                                    $typeS = "integer"; //v[1,1] => inteiro como tipo nao array
                                                }else{
                                                    ErrorMessage.errorSemantic($identifier.text,$identifier.line,$identifier.pos,ErrorMessage.createMessageDimensionArray($array_access.dimensionS,a.getDimension()));
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
           }
           : single_expression[idTH]
                                    {
                                      dimension++;
                                      if(!($single_expression.typeS == "integer"))
                                           {
                                            ErrorMessage.errorSemantic($single_expression.text,$single_expression.line,$single_expression.pos,ErrorMessage.type($single_expression.typeS,"integer"));
                                           }
                                    }
           (',' single_expression[idTH]
                                    {
                                        dimension++;
                                        if(!($single_expression.typeS == "integer")){
                                            ErrorMessage.errorSemantic($single_expression.text,$single_expression.line,$single_expression.pos,ErrorMessage.type($single_expression.typeS,"integer"));
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
     : expression[idTH] (',' expression[idTH])*
     ;

/* ****** Expression ****** */

expression [IdentifiersTable idTH]
            returns [String typeS, int line, int pos ]
            @init{
                $typeS = null;
                boolean correctType = true;
                boolean relationExp = false;
            }
           : s1=single_expression[idTH]{$line = $s1.line; $pos = $s1.pos;}
            (rel_op s2=single_expression[idTH]
                {   relationExp = true;
                    if($rel_op.text.matches("([=!<>]=|[<>])")){ // ! in
                        if(($s1.typeS != null) && $s1.typeS.equals($rel_op.typeS)){
                            if(($s2.typeS !=null) && $rel_op.typeS.equals($s2.typeS)){
                                $typeS = "boolean";
                            }else{
                                System.out.print("expression > ");
                                ErrorMessage.errorSemantic($s2.text, $s2.line, $s2.pos, ErrorMessage.type($s2.typeS,$rel_op.typeS));
                                correctType = false;
                            }
                        }else{
                            System.out.print("expression > ");
                            ErrorMessage.errorSemantic($s1.text, $s1.line, $s1.pos, ErrorMessage.type($s1.typeS,$rel_op.typeS));
                            correctType = false;
                        }
                    }else if($rel_op.text.equals("in")){

                        if(($s1.typeS != null) && ($s1.typeS.equals("integer"))){
                            if(($s2.typeS != null) && ($s2.typeS.equals("set"))){
                                $typeS = "boolean" ;
                            }else{
                                System.out.print("expression > ");
                                ErrorMessage.errorSemantic($s2.text, $s2.line, $s2.pos, ErrorMessage.type($s2.typeS,"set"));
                                correctType = false;
                            }
                        }else{
                            System.out.print("expression > ");
                            ErrorMessage.errorSemantic($s1.text, $s1.line, $s1.pos, ErrorMessage.type($s1.typeS,$rel_op.typeS));
                            correctType = false;
                        }
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
            }
           ;

/* ****** Single expression ****** */

single_expression [IdentifiersTable idTH]
                  returns [String typeS, int line, int pos ]
                  @init{
                    $typeS = null;
                    boolean correctType = true;
                    boolean firstTime = true;
                    String leftType = null;

                    //Tratar os erros com mais especificaçoes
                    LinkedList<ErrorInfo> errorManagement = new LinkedList<ErrorInfo>();
                  }
                  : t1=term[idTH] {$line = $term.line; $pos = $term.pos; errorManagement.add(new ErrorInfo($t1.text,$t1.line,$t1.pos));}
                  (add_op t2=term[idTH] {
                                        errorManagement.add(new ErrorInfo($add_op.text,$add_op.line,$add_op.pos));
                                        errorManagement.add(new ErrorInfo($t2.text,$t2.line,$t2.pos));


                                        if(firstTime){
                                            firstTime = false;
                                            if(($t1.typeS != null) && $t1.typeS.equals($add_op.typeS)){
                                                if(($t2.typeS != null) && $add_op.typeS.equals($t2.typeS)){
                                                    leftType = $add_op.typeS;

                                                }else{
                                                    System.out.print("single_expression1 > ");
                                                    ErrorMessage.errorSemantic($t2.text, $t2.line, $t2.pos, ErrorMessage.type($t2.typeS,$add_op.typeS));
                                                    correctType = false;

                                                }
                                            }else{
                                                System.out.print("single_expression2 > ");
                                                ErrorMessage.errorSemantic($t1.text, $t1.line, $t1.pos, ErrorMessage.type($t1.typeS,$add_op.typeS));
                                                correctType = false;

                                            }
                                        }else{
                                            errorManagement.pop();
                                            errorManagement.pop();

                                            if( (leftType != null) && leftType.equals($add_op.typeS)){
                                                if(($t2.typeS != null) && $add_op.typeS.equals($t2.typeS)){
                                                    leftType = $add_op.typeS;
                                                }else{
                                                    System.out.print("single_expression3 > ");
                                                    ErrorMessage.errorSemantic($t2.text, $t2.line, $t2.pos, ErrorMessage.type($t2.typeS,$add_op.typeS));
                                                    correctType = false;
                                                }
                                            }else{
                                                System.out.print("single_expression4 > ");
                                                ErrorMessage.errorSemantic(errorManagement.get(0).getIdentifier().concat($add_op.text).concat($t2.text), errorManagement.get(0).getLine(), errorManagement.get(0).getPos(), ErrorMessage.type(leftType,$add_op.typeS));

                                                correctType = false;
                                            }

                                        }

                                     }
                  )* {
                        if(correctType == true){
                            $typeS = $t1.typeS;
                        }
                     }
                  ;

/* ****** Term ****** */

term [IdentifiersTable idTH]
     returns [String typeS, int line, int pos]
     @init{
        $typeS = null;
        boolean correctType = true;
        boolean firstTime = true;
        String leftType = null;

        //Tratar os erros com mais especificaçoes
        LinkedList<ErrorInfo> errorManagement = new LinkedList<ErrorInfo>();


     }
     : f1=factor[idTH] { $line = $f1.line; $pos = $f1.pos;  errorManagement.add(new ErrorInfo($f1.text,$f1.line,$f1.pos));}
     (mul_op f2=factor[idTH] {

                                errorManagement.add(new ErrorInfo($mul_op.text,$mul_op.line,$mul_op.pos));
                                errorManagement.add(new ErrorInfo($f2.text,$f2.line,$f2.pos));

                                if(firstTime){
                                    firstTime = false;
                                    if(($f1.typeS != null) && $f1.typeS.equals($mul_op.typeS)){
                                        if(($f2.typeS != null) && $mul_op.typeS.equals($f2.typeS)){
                                            leftType = $mul_op.typeS;
                                        }else{
                                            System.out.print("term1 > ");
                                            ErrorMessage.errorSemantic($f2.text, $f2.line, $f2.pos, ErrorMessage.type($f2.typeS,$mul_op.typeS));
                                            e.addMessage($f2.line,$f2.pos,ErrorMessage.semantic($f2.text,ErrorMessage.type($f2.typeS,$mul_op.typeS)));
                                            correctType = false;
                                        }
                                    }else{
                                        System.out.print("term2 > ");
                                        ErrorMessage.errorSemantic($f1.text, $f1.line, $f1.pos, ErrorMessage.type($f1.typeS,$mul_op.typeS));
                                        e.addMessage($f1.line,$f1.pos,ErrorMessage.semantic($f1.text,ErrorMessage.type($f1.typeS,$mul_op.typeS)));
                                        correctType = false;
                                    }
                                }else{

                                        errorManagement.pop();
                                        errorManagement.pop();

                                        if((leftType != null) && leftType.equals($mul_op.typeS)){
                                            if(($f2.typeS != null) && $mul_op.typeS.equals($f2.typeS)){
                                                leftType = $mul_op.typeS;
                                            }else{
                                                System.out.print("term3 > ");
                                                ErrorMessage.errorSemantic($f2.text, $f2.line, $f2.pos, ErrorMessage.type($f2.typeS,$mul_op.typeS));
                                                e.addMessage($f2.line,$f2.pos,ErrorMessage.semantic($f2.text,ErrorMessage.type($f2.typeS,$mul_op.typeS)));
                                                correctType = false;
                                            }
                                        }else{
                                            System.out.print("term4 > ");
                                            ErrorMessage.errorSemantic(errorManagement.get(0).getIdentifier().concat($mul_op.text).concat($f2.text), errorManagement.get(0).getLine(), errorManagement.get(0).getPos(), ErrorMessage.type(leftType,$mul_op.typeS));
                                            e.addMessage(errorManagement.get(0).getLine(),errorManagement.get(0).getPos(),ErrorMessage.semantic(errorManagement.get(0).getIdentifier().concat($mul_op.text).concat($f2.text),ErrorMessage.type(leftType,$mul_op.typeS)));
                                            correctType = false;
                                        }

                                }

                          }
     )* {
            if(correctType == true){
                $typeS = $f1.typeS;
            }
        }
     ;

/* ****** Factor ****** */

factor [IdentifiersTable idTH] //vai ser preciso ver as pre-condiçoes de todos as alternativas feitas
       returns [String typeS,int line, int pos]
       @init{
            $typeS = null;
       }
       : inic_var[idTH]           {$typeS = $inic_var.typeS; $line = $inic_var.line; $pos = $inic_var.pos;}
       | designator[idTH]         {$typeS = $designator.typeS; $line = $designator.line; $pos = $designator.pos;}
       | '(' expression[idTH] ')' {$typeS = $expression.typeS; }
       | '!' f1=factor[idTH]      { if($f1.typeS.equals("boolean")){$typeS = $f1.typeS;}else{$typeS = null; ErrorMessage.errorSemantic($f1.text,$f1.line,$f1.pos,ErrorMessage.type($f1.typeS,"boolean"));}}
       | function_call[idTH]
       | specialFunctions[idTH]   {$typeS = $specialFunctions.typeS;}
       ;

specialFunctions [IdentifiersTable idTH]
                 returns [String typeS]
                 : tail[idTH]     {$typeS = $tail.typeS;}
                 | head[idTH]     {$typeS = $head.typeS;}
                 | cons[idTH]     {$typeS = $cons.typeS;}
                 | member[idTH]   {$typeS = $member.typeS;}
                 | is_empty[idTH] {$typeS = $is_empty.typeS;}
                 | length[idTH]   {$typeS = $length.typeS;}
                 | delete[idTH]   {$typeS = $delete.typeS;}
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
           :
           | expression[idTH]
           ;

/* ****** Read statement ****** */

read_statement : 'input' '(' identifier ')'
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
                  : 'if' '(' expression[idTH] ')'
                    'then' '{' statements[idTH] '}'
                    else_expression[idTH]
                  ;

else_expression [IdentifiersTable idTH]
                :
                | 'else' '{' statements[idTH] '}'
                ;

/* ****** for_stat ****** */

for_stat [IdentifiersTable idTH]
         : 'for' '(' interval ')' step satisfy[idTH]
           '{' statements[idTH] '}'
         ;

interval : identifier type_interval
         ;

type_interval : 'in' range
              | 'inArray' identifier
              //| 'inFunction' identifier //tenho aqui representado !
              ;

range : minimum '..' maximum
      ;

minimum : number
        | identifier
        ;

maximum : number
        | identifier
        ;

step :
     | up_down number
     ;

up_down : 'stepUp'
        | 'stepDown'
        ;

satisfy [IdentifiersTable idTH]
        :
        | 'satisfying' expression[idTH] //boolean expression
        ;

/* ****** While_Stat ****** */

while_stat [IdentifiersTable idTH]
           : 'while' '(' expression[idTH] ')'
             '{' statements[idTH] '}'
           ;

/* ****** Succ_Or_Predd ****** */

succ_or_pred : succ_pred identifier
             ;

succ_pred : 'succ'
          | 'pred'
          ;

/* ****** SequenceOper ****** */

tail [IdentifiersTable idTH]
     returns [String typeS]
     // tail : sequence -> sequence
     : t='tail' '(' expression[idTH] ')'
     {
        if(($expression.typeS != null) && $expression.typeS.equals("sequence")){
            $typeS = $expression.typeS;
        }else{
            ErrorMessage.errorSemantic($t.text.concat("(").concat($expression.text).concat(")"),$t.line,$t.pos,ErrorMessage.type($expression.typeS,"sequence"));
            e.addMessage($t.line,$t.pos,ErrorMessage.semantic($t.text.concat("(").concat($expression.text).concat(")"),ErrorMessage.type($expression.typeS,"sequence")));
        }
     }
     ;

head [IdentifiersTable idTH]
     returns [String typeS]
     // head : sequence -> integer
     : h='head' '(' expression[idTH] ')' 
     {
        if(($expression.typeS != null) && $expression.typeS.equals("sequence")){ 
            $typeS = "integer"; 
        }else{ 
            ErrorMessage.errorSemantic($h.text.concat("(").concat($expression.text).concat(")"),$h.line,$h.pos,ErrorMessage.type($expression.typeS,"sequence"));
            e.addMessage($h.line,$h.pos,ErrorMessage.semantic($h.text.concat("(").concat($expression.text).concat(")"),ErrorMessage.type($expression.typeS,"sequence")));
        }
     }
     ;

cons [IdentifiersTable idTH]
     returns [String typeS]
     // integer x sequence -> sequence
     : c='cons' '(' e1=expression[idTH] ',' e2=expression[idTH] ')'
        {
            if(($e1.typeS != null) && $e1.typeS.equals("integer") ){
                if(($e2.typeS != null) && $e2.typeS.equals("sequence")){
                    $typeS = "sequence";
                }else{
                        ErrorMessage.errorSemantic($e2.text,$e2.line,$e2.pos,ErrorMessage.type($e2.typeS,"sequence"));
                        e.addMessage($e2.line,$e2.pos,ErrorMessage.semantic($e2.text,ErrorMessage.type($e2.typeS,"sequence")));
                }
            }else{
                    ErrorMessage.errorSemantic($e1.text,$e1.line,$e1.pos,ErrorMessage.type($e1.typeS,"integer"));
                    e.addMessage($e1.line,$e1.pos,ErrorMessage.semantic($e1.text,ErrorMessage.type($e1.typeS,"integer")));
            }
        }
     ;

delete [IdentifiersTable idTH]
       returns [String typeS]
       // del : integer x sequence -> sequence
       : 'del' '(' e1=expression[idTH] ',' e2=expression[idTH] ')'
        {
            if(($e1.typeS != null) && $e1.typeS.equals("integer") ){
                if(($e2.typeS != null) && $e2.typeS.equals("sequence")){
                    $typeS = "sequence";
                }else{
                    ErrorMessage.errorSemantic($e2.text,$e2.line,$e2.pos,ErrorMessage.type($e2.typeS,"sequence"));
                    e.addMessage($e2.line,$e2.pos,ErrorMessage.semantic($e2.text,ErrorMessage.type($e2.typeS,"sequence")));
                }
            }else{
                ErrorMessage.errorSemantic($e1.text,$e1.line,$e1.pos,ErrorMessage.type($e1.typeS,"integer"));
                e.addMessage($e1.line,$e1.pos,ErrorMessage.semantic($e1.text,ErrorMessage.type($e1.typeS,"integer")));
            }
        }
       ;

copy_statement
               : 'copy' '(' identifier ',' identifier ')'
               ;

cat_statement
              : 'cat' '(' identifier ',' identifier ')'
              ;

is_empty [IdentifiersTable idTH]
         returns [String typeS]
         // is_empty : sequence -> boolean
         : 'isEmpty' '(' e1=expression[idTH] ')'
         {
            if(($e1.typeS != null) && $e1.typeS.equals("sequence")){
                $typeS = "boolean";
            }else{
                ErrorMessage.errorSemantic($e1.text,$e1.line,$e1.pos,ErrorMessage.type($e1.typeS,"sequence"));
                e.addMessage($e1.line,$e1.pos,ErrorMessage.semantic($e1.text,ErrorMessage.type($e1.typeS,"sequence")));
            }
         }
         ;

length [IdentifiersTable idTH]
       returns [String typeS]
       // length : sequence -> integer
       : 'length' '(' e1=expression[idTH] ')'
       {
          if(($e1.typeS != null) && $e1.typeS.equals("sequence")){
              $typeS = "integer";
          }else{
              ErrorMessage.errorSemantic($e1.text,$e1.line,$e1.pos,ErrorMessage.type($e1.typeS,"sequence"));
              e.addMessage($e1.line,$e1.pos,ErrorMessage.semantic($e1.text,ErrorMessage.type($e1.typeS,"sequence")));
          }
       }
       ;

/* ****** set_oper ****** */

member [IdentifiersTable idTH]
       returns [String typeS]
       // isMember : integer x sequence -> boolean
       : 'isMember' '(' e=expression[idTH] ',' i=identifier ')'
       {

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
                        ErrorMessage.errorSemantic($e.text,$e.line,$e.pos,ErrorMessage.type($e.typeS,"integer"));
                        e.addMessage($e.line,$e.pos,ErrorMessage.semantic($e.text,ErrorMessage.type($e.typeS,"integer")));
                    }
                }else{
                    ErrorMessage.errorSemantic($i.text,$i.line,$i.pos,ErrorMessage.type(type,"sequence"));
                    e.addMessage($i.line,$i.pos,ErrorMessage.semantic($i.text,ErrorMessage.type(type,"sequence")));
                }
            }
            //Normally doesn't need else statement.
          }else{
            ErrorMessage.errorSemantic($i.text, $i.line, $i.pos,ErrorMessage.errorStatements);
            e.addMessage($i.line,$i.pos,ErrorMessage.semantic($i.text,ErrorMessage.errorStatements));
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
