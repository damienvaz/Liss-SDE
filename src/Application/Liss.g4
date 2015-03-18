/*
 * Version eBNF of Liss
 * Author : Damien + PRH
 * Date : 2015.03.11
 */
grammar Liss;

@members{
    int level=0;
    int address = 0;
}

/* ****** Program ****** */

liss [IdentifiersTable idTH]
     : 'program' identifier body[idTH]
     ;

body[IdentifiersTable idTH]
     : '{'
       'declarations' declarations[idTH] {System.out.println("VM exclusive: "+address+"\n");}
       'statements' statements
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
                     : vars '->' type ';' {
                            ArrayList<String> array = $vars.arrayS;
                            Type typeSpace;
                            if($type.typeS == "integer"){
                                Int i = new Int(new String("VAR"),new Integer(level),address);
                                typeSpace = (Type) $idTH.getIdentifiersTable().get("integer");

                                for(String id : array){
                                    $idTH.addIdentifiersTable(id,i.clone());

                                    address = address + typeSpace.getSpace();
                                    i.setAddress(address);
                                }
                            }else if($type.typeS == "boolean"){
                                Bool b = new Bool(new String("VAR"),new Integer(level),address);
                                typeSpace = (Type) $idTH.getIdentifiersTable().get("boolean");

                                for(String id : array){
                                    $idTH.addIdentifiersTable(id,b.clone());

                                    address = address + typeSpace.getSpace();
                                    b.setAddress(address);
                                }
                            }else if($type.typeS == "array"){
                                Array a = new Array(new String("VAR"),new Integer(level),new Integer($type.arrayDimension.size()),$type.arrayDimension,address);
                                typeSpace = (Type) $idTH.getIdentifiersTable().get("integer"); //inteiro porque guarda, supostamente, o endereço do array (nao o conteudo)

                                for(String id : array){
                                    $idTH.addIdentifiersTable(id,a.clone());

                                    address = address + (a.getMemorySize()*typeSpace.getSpace());
                                    a.setAddress(address);
                                }

                            }
                            else if($type.typeS == "sequence"){
                                Sequence s = new Sequence(new String("VAR"),new Integer(level),address,"integer");
                                typeSpace = (Type) $idTH.getIdentifiersTable().get("sequence");

                                for(String id : array){
                                    $idTH.addIdentifiersTable(id,s.clone());

                                    address = address + typeSpace.getSpace();
                                    s.setAddress(address);
                                }

                            }





                     }
                     ;

vars returns [ArrayList<String> arrayS]
     @init{
        ArrayList<String> vars = new ArrayList<String>();
     }
     : var { vars.add($var.idS);}
       (',' var {vars.add($var.idS);})* {$arrayS = vars;}

     ;

var returns[String idS]
    : identifier value_var {$idS = $identifier.text;}
    ;

value_var
          :
          | '=' inic_var
          ;

type returns[String typeS, ArrayList<Integer> arrayDimension]
     : 'integer' {$typeS = "integer";}
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

inic_var
         : constant
         | array_definition
         | set_definition
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

set_definition : '{'
                 set_initialization
                 '}'
               ;

set_initialization :
                   | identifier '|' expression
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
         'statements' statements
         returnSubPrg
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

returnSubPrg :
       | 'return' expression ';'
       ;

/* ****** Statements ****** */

statements : statement*
           ;

statement : assignment ';'
          | write_statement ';'
          | read_statement ';'
          | conditional_statement
          | iterative_statement
          | function_call ';'
          | succ_or_pred ';'
          | copy_statement ';'
          | cat_statement ';' // conjuntos de sequencias
          ;

/* ****** Assignment ****** */

assignment : designator '=' expression
           ;

/* ****** Designator ****** */

designator : identifier array_access
           ;

array_access :
             | '[' elem_array ']'
             ;

elem_array : expression (',' expression)*
           ;

/* ****** Function call ****** */

function_call : identifier '(' sub_prg_args ')'
              ;

sub_prg_args :
             | args
             ;

args : expression (',' expression)*
     ;

/* ****** Expression ****** */

expression : single_expression (rel_op single_expression)?
           ;

/* ****** Single expression ****** */

single_expression : term (add_op term)*
                  ;

/* ****** Term ****** */

term : factor (mul_op factor)*
     ;

/* ****** Factor ****** */

factor : inic_var
       | designator
       | function_call
       | '(' expression ')'
       | '!' factor
       | specialFunctions //criado para ser usado na situação do NT 'statement'
       ;

specialFunctions : tail
                 | head
                 | cons
                 | member
                 | is_empty
                 | length
                 | delete
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

write_statement : write_expr '(' print_what ')'
                ;

write_expr : 'write'
           | 'writeln'
           ;

print_what :
           | expression
           ;

/* ****** Read statement ****** */

read_statement : 'input' '(' identifier ')'
               ;

/* ****** Conditional & Iterative ****** */

conditional_statement : if_then_else_stat
                      ;

iterative_statement : for_stat
                    | while_stat
                    ;

/* ****** if_then_else_stat ****** */

if_then_else_stat : 'if' '(' expression ')'
                    'then' '{' statements '}'
                    else_expression
                  ;

else_expression :
                | 'else' '{' statements '}'
                ;

/* ****** for_stat ****** */

for_stat : 'for' '(' interval ')' step satisfy
           '{' statements '}'
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

satisfy :
        | 'satisfying' expression //boolean expression
        ;

/* ****** While_Stat ****** */

while_stat : 'while' '(' expression ')'
             '{' statements '}'
           ;

/* ****** Succ_Or_Predd ****** */

succ_or_pred : succ_pred identifier
             ;

succ_pred : 'succ'
          | 'pred'
          ;

/* ****** SequenceOper ****** */

tail : 'tail' '(' expression ')'
     ;

head : 'head' '(' expression ')'
     ;

cons : 'cons' '(' expression ',' expression ')'
     ;

delete : 'del' '(' expression ',' expression ')'
       ;

copy_statement : 'copy' '(' identifier ',' identifier ')'
               ;

cat_statement : 'cat' '(' identifier ',' identifier ')'
              ;

is_empty : 'isEmpty' '(' expression ')'
         ;

length : 'length' '(' expression ')'
       ;

/* ****** set_oper ****** */

member : 'isMember' '(' expression ',' identifier ')'
       ;



/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

string : STR ; /* verificar se é mesmo assim sintaticamente a nivel de lexer !*/

number  returns [Integer numberS]
        : NBR {$numberS = Integer.parseInt($NBR.text);};

identifier
           : ID
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
