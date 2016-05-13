grammar LissGIC;

/* ****** Program ****** */

liss : 'program' identifier body
     ;


body : '{'
       'declarations' declarations
       'statements'   statements
       '}'
     ;

/* ****** Declarations ****** */

declarations : variable_declaration* subprogram_definition*
             ;

/* ****** Variables ****** */

variable_declaration : vars '->' type ';'
                     ;

vars : var (',' var )*
     ;

var : identifier value_var
    ;

value_var :
          | '=' inic_var
          ;

type : 'integer'
     | 'boolean'
     | 'set'
     | 'sequence'
     | 'array' 'size' dimension
     ;

typeReturnSubProgram : 'integer'
                     | 'boolean'
                     ;

dimension : number (',' number )*
          ;

inic_var : constant
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

values : number (',' number )*
       ;

/* ****** Set definition ****** */

set_definition : '{' set_initialization '}'
               ;

set_initialization :
                   | identifier '|' expression
                   ;

/* ****** SubProgram definition ****** */

subprogram_definition: 'subprogram' identifier '(' formal_args ')' return_type f_body
                     ;

f_body : '{'
         'declarations' declarations
         'statements' statements
         returnSubPrg
         '}'
       ;

/* ****** Formal args ****** */

formal_args :
            | f_args
            ;

f_args  : formal_arg (',' formal_arg )*
        ;

formal_arg : identifier '->' type
           ;

/* ****** Return type ****** */

return_type :
            | '->' typeReturnSubProgram
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
          | cat_statement ';'
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

elem_array : single_expression (',' single_expression )*
           ;

/* ****** Function call ****** */

function_call : identifier '(' sub_prg_args ')'
              ;

sub_prg_args :
             | args
             ;

args : expression (',' expression )*
     ;

/* ****** Expression ****** */

expression : single_expression ( rel_op single_expression )?
           ;

/* ****** Single expression ****** */

single_expression : term ( add_op term )*
                  ;

/* ****** Term ****** */
term : factor ( mul_op factor )*
     ;

/* ****** Factor ****** */

factor : inic_var
       | designator
       | '(' expression ')'
       | '!' factor
       | function_call
       | specialFunctions
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

add_op : '+'
       | '-'
       | '||'
       | '++'
       ;

mul_op : '*'
       | '/'
       | '&&'
       | '**'
       ;

rel_op : '=='
       | '!='
       | '<'
       | '>'
       | '<='
       | '>='
       | 'in'
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
        | 'satisfying' expression
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

tail // tail : sequence -> sequence
     : 'tail' '(' expression ')'
     ;

head // head : sequence -> integer
     : 'head' '(' expression ')'
     ;

cons // integer x sequence -> sequence
     : 'cons' '(' expression ',' expression ')'
     ;

delete // del : integer x sequence -> sequence
       : 'del' '(' expression ',' expression ')'
       ;

copy_statement // copy_statement : seq x seq -> void
               : 'copy' '(' identifier ',' identifier ')'
               ;

cat_statement //cat_statement : seq x seq -> void
              : 'cat' '(' identifier ',' identifier ')'
              ;

is_empty // is_empty : sequence -> boolean
         : 'isEmpty' '(' expression ')'
         ;

length // length : sequence -> integer
       : 'length' '(' expression ')'
       ;

/* ****** set_oper ****** */

member // isMember : integer x sequence -> boolean
       : 'isMember' '(' expression ',' identifier ')'
       ;



/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

string : STR
       ;

number : NBR
       ;

identifier : ID
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
    ;