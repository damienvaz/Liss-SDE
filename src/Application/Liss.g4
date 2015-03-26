/*
 * Version eBNF of Liss
 * Author : Damien + PRH
 * Date : 2015.03.11
 */
grammar Liss;

@header{
    import java.util.HashMap;
}

@members{
    int level=0;
}

/* ****** Program ****** */

liss [IdentifiersTable idTH]
     : 'program' identifier body[idTH]
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
                            }
                            */

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
                    Debug.errorSemantic($var.text,(int)$var.infoVarS.get("line"), (int)$var.infoVarS.get("pos"),Debug.errorDeclarations);
                }
            }
       (',' var[idTH] {
                    if(!info.containsKey($var.text)){
                        info.put($var.idS,$var.infoVarS);
                    }else{
                        Debug.errorSemantic($var.text,(int)$var.infoVarS.get("line"), (int)$var.infoVarS.get("pos"),Debug.errorDeclarations);
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
         returns [String typeS]
         : constant              {$typeS = $constant.typeS;}
         | array_definition      {$typeS = "integer";}
         | set_definition[idTH]  {$typeS = "set";}
         | sequence_definition   {$typeS = "sequence";}
         ;

constant returns [String typeS]
         : sign number {$typeS = "integer";}
         | 'true'      {$typeS = "boolean";}
         | 'false'     {$typeS = "boolean";}
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
           : designator[idTH] '=' expression[idTH]
           ;

/* ****** Designator ****** */

designator [IdentifiersTable idTH]
            returns [String typeS, int line, int pos]
           : identifier array_access[idTH]
           {
                                $line = $identifier.line;
                                $pos = $identifier.pos;
                                //Pre-Condicao: é um identificador
                                if(!$array_access.response){
                                    //Pre-Condicao: ver se existe na tabela de identificador
                                    if(!$idTH.getIdentifiersTable().containsKey($identifier.text)){
                                        Debug.errorSemantic($identifier.text,$identifier.line,$identifier.pos,Debug.errorStatements);

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
                                        Debug.errorSemantic($identifier.text,$identifier.line,$identifier.pos,Debug.errorStatements);

                                    }else{
                                        Var v = (Var) $idTH.getIdentifiersTable().get($identifier.text);

                                        if(v.getCategory().equals(new String("TYPE"))){
                                            Debug.errorSemantic($identifier.text,$identifier.line,$identifier.pos,Debug.errorStatements);

                                        }else{
                                            if(!v.getInfoType().equals(new String("array"))){
                                                Debug.errorSemantic($identifier.text,$identifier.line,$identifier.pos,Debug.errorArrayType);
                                            }else{
                                                $typeS = v.getInfoType() ;
                                            }
                                        }
                                    }

                                }

           }
           ;

array_access [IdentifiersTable idTH]
             returns [boolean response]//response variable => if array_access exists or not
             :                          {$response = false;}
             | '[' elem_array[idTH] ']' {$response = true;}
             ;

elem_array [IdentifiersTable idTH]
           : single_expression[idTH]
                                    {
                                      if(!($single_expression.typeS == "integer"))
                                           {
                                            Debug.errorSemantic($single_expression.text,$single_expression.line,$single_expression.pos,Debug.createMessageType($single_expression.typeS,"integer"));
                                           }
                                    }
           (',' single_expression[idTH]
                                    {
                                        if(!($single_expression.typeS == "integer")){
                                            Debug.errorSemantic($single_expression.text,$single_expression.line,$single_expression.pos,Debug.createMessageType($single_expression.typeS,"integer"));
                                        }

                                    }
           )* //ver isto
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
           : single_expression[idTH] (rel_op single_expression[idTH])?
           ;

/* ****** Single expression ****** */

single_expression [IdentifiersTable idTH]
                  returns [String typeS, int line, int pos ]
                  : term[idTH] {$typeS = $term.typeS; $line = $term.line; $pos = $term.pos;}
                  (add_op term[idTH] {$typeS = $term.typeS; $line = $term.line; $pos = $term.pos;} )*
                  ;

/* ****** Term ****** */

term [IdentifiersTable idTH]
     returns [String typeS, int line, int pos]
     @init{
        boolean correctType = true;
     }
     : f1=factor[idTH] {$line = $f1.line; $pos = $f1.pos;}
     (mul_op f2=factor[idTH] {
                                if($f1.typeS==$mul_op.typeS){
                                    if(!($mul_op.typeS == $f2.typeS)){
                                        Debug.errorSemantic($f2.text, $f2.line, $f2.pos, Debug.createMessageType($f2.typeS,$mul_op.typeS));
                                        correctType = false;
                                    }
                                }else{
                                    Debug.errorSemantic($f1.text, $f1.line, $f1.pos, Debug.createMessageType($f1.typeS,$mul_op.typeS));
                                    correctType = false;
                                }
                          }
     )* {if(correctType == true){ $typeS = $f1.typeS;}else{System.out.println("Nao conseguiu devolver nada como tipo.");}}
     ;

/* ****** Factor ****** */

factor [IdentifiersTable idTH] //vai ser preciso ver as pre-condiçoes de todos as alternativas feitas
       returns [String typeS,int line, int pos]
       : inic_var[idTH] {$typeS = $inic_var.typeS;}
       | designator[idTH] {$typeS = $designator.typeS; $line = $designator.line; $pos = $designator.pos;}
       | function_call[idTH]
       | '(' expression[idTH] ')'
       | '!' factor[idTH]
       | specialFunctions[idTH] //criado para ser usado na situação do NT 'statement'
       ;

specialFunctions [IdentifiersTable idTH]
                 : tail[idTH]
                 | head[idTH]
                 | cons[idTH]
                 | member[idTH]
                 | is_empty[idTH]
                 | length[idTH]
                 | delete[idTH]
                 ;

/* ****** add_op, mul_op, rel_op ****** */

//o que tem menor prioridade
add_op returns [String typeS]
       : '+' {$typeS = "integer";}
       | '-' {$typeS = "integer";}
       | '||'{$typeS = "boolean";}
       | '++'{$typeS = "set";} //( uniao de conjuntos)
       ;

//tem mais prioridade que add_op
mul_op returns [String typeS]
       : '*' {$typeS = "integer";}
       | '/' {$typeS = "integer";}
       | '&&'{$typeS = "boolean";}
       | '**'{$typeS = "set";}//( interseccao de conjuntos)
       ;

rel_op returns [String typeS]
       : '==' {$typeS = "integer";}
       | '!=' {$typeS = "integer";}
       | '<'  {$typeS = "integer";}
       | '>'  {$typeS = "integer";}
       | '<=' {$typeS = "integer";}
       | '>=' {$typeS = "integer";}
       | 'in' {$typeS = "integer";} // perguntar ao prof o que se deve devolver ??? Eu acho que deve dar para ser tanto SET como SEQUENCE
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
     : 'tail' '(' expression[idTH] ')'
     ;

head [IdentifiersTable idTH]
     : 'head' '(' expression[idTH] ')'
     ;

cons [IdentifiersTable idTH]
     : 'cons' '(' expression[idTH] ',' expression[idTH] ')'
     ;

delete [IdentifiersTable idTH]
       : 'del' '(' expression[idTH] ',' expression[idTH] ')'
       ;

copy_statement
               : 'copy' '(' identifier ',' identifier ')'
               ;

cat_statement
              : 'cat' '(' identifier ',' identifier ')'
              ;

is_empty [IdentifiersTable idTH]
         : 'isEmpty' '(' expression[idTH] ')'
         ;

length [IdentifiersTable idTH]
       : 'length' '(' expression[idTH] ')'
       ;

/* ****** set_oper ****** */

member [IdentifiersTable idTH]
       : 'isMember' '(' expression[idTH] ',' identifier ')'
       ;



/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

string : STR ; /* verificar se é mesmo assim sintaticamente a nivel de lexer !*/

number  returns [Integer numberS]
        : NBR {$numberS = Integer.parseInt($NBR.text);};

identifier returns [int line, int pos]
           : ID {$line = $ID.line;$pos = $ID.pos;}
           ;
/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */


/* ****** Lexer ****** */

NBR : ('0'..'9')+
    ;

ID : ('a'..'z'|'A'..'Z'|'0'..'9'|'_')+ //removi o uso do signal '-' conflitos com os valores do signal
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
