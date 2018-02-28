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
    : (stat|blok )+ EOF!;

blok
    : START^
    (blok|stat)*
    STOP!
    ;
    
stat
    : expr NL -> expr

    
    | ID PODST expr NL -> ^(PODST ID expr)

    | NL ->
    ;

expr
    : multExpr
      ( PLUS^ multExpr
      | MINUS^ multExpr
      )*
    ;

multExpr
    : pot
      ( MUL^ pot
      | DIV^ pot
      )*
    ;
    
pot
    : atom
      (POW^ pot)?
    ;

atom
    : INT
    | ID
    | LP! expr RP!
    ;
    
VAR : 'int';

ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

INT : '0'..'9'+;

NL : '\r'? '\n' ;

WS : (' ' | '\t')+ {$channel = HIDDEN;} ;

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
  
POW
  : '^'
  ;
  //lewostr: r1: r2 (OP r2);
  //prawostr: r1: r2 (OP r1);
