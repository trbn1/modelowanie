tree grammar TExpr3;

options {
  tokenVocab=Expr;

  ASTLabelType=CommonTree;

  output=template;
}

@header {
// package com.sample;
}

prog    : (d+=dekl | e+=expr)* -> template(e={$e},d={$d}) <<
<d;separator="\n">
start:
<e;separator="\n">
>>
;

dekl    : ^(VAR ID) -> dekl(zm={$ID.text});

expr    : ^(PLUS  e1=expr e2=expr) -> dodaj(p1={$e1.st},p2={$e2.st})
        | ^(MINUS e1=expr e2=expr) -> odejmij(p1={$e1.st},p2={$e2.st})
        | ^(MUL   e1=expr e2=expr) -> pomnoz(p1={$e1.st},p2={$e2.st})
        | ^(DIV   e1=expr e2=expr) -> podziel(p1={$e1.st},p2={$e2.st})
        | ^(PODST i1=ID   e2=expr) -> podstaw(p1={$e1.st},p2={$e2.st})
        | ^(FOR e1=expr)           -> loop(p1={$e1.st})
        | ^(IF e1=expr e2=expr)    -> if_stat(p1={$e1.st},p2={$e2.st})
        | INT                      -> int(i={$INT.text})
        | ID                       -> odczyt(i={$ID.text})
    ;