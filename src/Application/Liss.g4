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
         : constant
         | array_definition
         | set_definition[idTH]
         | sequence_definition
         ;

constant : sign number
         | 'true'
         | 'false'
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
           : identifier array_access[idTH] {
                                if(!$array_access.response){
                                    if(!$idTH.getIdentifiersTable().containsKey($identifier.text)){
                                        Debug.errorSemantic($identifier.text,$identifier.line,$identifier.pos,Debug.errorStatements);
                                    }
                                }else{ //significa que é um array

                                }
                    }
           ;

array_access [IdentifiersTable idTH]
             returns [boolean response]//response variable => if array_access exists or not
             :                          {$response = false;}
             | '[' elem_array[idTH] ']' {$response = true;}
             ;

elem_array [IdentifiersTable idTH]
           : expression[idTH] (',' expression[idTH])*
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
                  : term[idTH] (add_op term[idTH])*
                  ;

/* ****** Term ****** */

term [IdentifiersTable idTH]
     : factor[idTH] (mul_op factor[idTH])*
     ;

/* ****** Factor ****** */

factor [IdentifiersTable idTH]
       : inic_var[idTH]
       | designator[idTH]
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
add_op : '+'
       | '-'
       | '||'
       | '++' //( uniao de conjuntos)
       ;

//tem mais prioridade que add_op
mul_op : '*'
       | '/'
       | '&&'
       | '**' //( interseccao de conjuntos)
       ;

rel_op : '=='
       | '!='
       | '<'
       | '>'
       | '<='
       | '>='
       | 'in' // pertence
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
