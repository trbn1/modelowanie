grammar Expr;

options {
  output=AST;
  ASTLabelType=CommonTree;
}

@header {
// package com.sample;
}

@lexer::header {
//  package com.sample;
}

prog
    : (stat|blok)+ EOF!;
    
blok
    : START^
    (blok|stat)*
    STOP!
    ;

stat
    : expr NL -> expr
    | ID PODST expr NL -> ^(PODST ID expr)
    | NL ->
    | VAR ID NL -> ^(VAR ID)
    | loop NL -> loop
    ;

expr
    : multExpr
      ( PLUS^ multExpr
      | MINUS^ multExpr
      )*
    ;

multExpr
    : if_stat
      ( MUL^ if_stat
      | DIV^ if_stat
      )*
    ;
    
if_stat 
    : atom
    (COMP^ if_stat)?
    ;

atom
    : INT
    | ID
    | LP! expr RP!
    ;
    
loop 
    : FOR^ INT;   
        
VAR : 'int';

FOR 
    : 'for'
    ;

IF  : 'if';

ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

INT : '0'..'9'+;

NL : '\r'? '\n' ;

WS : (' ' | '\t')+ {$channel = HIDDEN;} ;

COMP : '=='
    ;

START
  : '{'
  ;
  
STOP
  : '}'
  ;

LP
  : '('
  ;

RP
  : ')'
  ;

PODST
  : '='
  ;

PLUS
  : '+'
  ;

MINUS
  : '-'
  ;

MUL
  : '*'
  ;

DIV
  : '/'
  ;