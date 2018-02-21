grammar supergramatyka;

plik	: expr* { System.out.println($expr.value);} EOF;

expr returns [int value]	: a=term ((PLUS b=term {$value+=$b.value;} | MINUS b=term{$value-=$b.value;}))*;
	
term returns [int value]	: a=atom {$value = $a.value;} ((MUL b=atom {$value*=$b.value;} | DIV b=atom{$value/=$b.value;}))*;
	
atom returns [int value]	: INT {$value = Integer.parseInt($INT.text);} | (LP expr RP) {$value = $expr.value;};

PLUS	: '+';

MINUS	:  '-';

MUL	: '*';

DIV	: '/';

LP	: '(';

RP	: ')';
	
NL	: '\n';

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

INT :	'0'..'9'+;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        ) {$channel=HIDDEN;}
    ;

