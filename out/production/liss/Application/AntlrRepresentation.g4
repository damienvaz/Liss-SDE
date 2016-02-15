grammar AntlrRepresentation;

grammarContextFree : gramarline startsymbol; //startlexer;

gramarline : 'grammar' STR ';';

startsymbol : sentences;

sentences : sentence+ ;

sentence : lhs ':' rhs ';' ;

lhs : nonterminal ;

rhs : ( nt=nonterminal | t=terminal {System.out.println("NonTerminal: "+$nt.text);})* recursivity ('|' rhs)* ;

recursivity : ('(' ( nt=nonterminal | t=terminal {System.out.println("NonTerminalRecursivity: "+$nt.text);})* ')' multiplicity)?;

nonterminal : nameofnonterminal multiplicity?;

multiplicity : ('*'|'+'|'?');

terminal : TER;

nameofnonterminal : STR ;

TER : '\'' ~('\'')+ '\'' ;

STR : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'_')* ;

WS  :   ( [ \t\r\n] | COMMENT) -> skip
    ;

fragment
COMMENT
    : '/*'.*?'*/' /* multiple comments */
    | '//'~('\r' | '\n')* /* single comment */
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