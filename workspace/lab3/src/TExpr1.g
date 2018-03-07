tree grammar TExpr1;

options {
  tokenVocab=Expr;

  ASTLabelType=CommonTree;

}

@header {
        import java.util.HashMap;
}


@members {
        Integer getSymbol (String name) {
                for (int lv=$blok.size()-1; lv >=0; lv--) {
                        if ($blok[lv]::hm.containsKey(name))
                                return $blok[lv]::hm.get(name);
                }
/*              Obsluga wyjatkow prezentowana byla w poprzednim odcinku
                throw new NotFoundException(name);   */
                return -1;
        }

        Integer putSymbol (String name, Integer value) {
                for (int lv=$blok.size()-1; lv >=0; lv--) {
                        if ($blok[lv]::hm.containsKey(name)) {
                                $blok[lv]::hm.put(name, value);
                                return value;
                        }
                }
//              throw new NotFoundException(name);   
                return -1;
        }

        void declareSymbol (String name) {
                if(!$blok::hm.containsKey(name))
                        $blok::hm.put(name, -1);
/*              else
                        throw new RedeclaredException(name);   */
        }
}

prog    : (blok)*;

blok
scope { HashMap<String, Integer> hm; }
@init { $blok::hm=new HashMap<String, Integer>(); }
        :
        ^(START (blok 
        | (e=expr {System.out.println ($e.out);}) 
        | e2)*);

expr returns [Integer out]
        : ^(PLUS  e1=expr e2=expr) {$out = $e1.out + $e2.out;}
        | ^(MINUS e1=expr e2=expr) {$out = $e1.out - $e2.out;}
        | ^(MUL   e1=expr e2=expr) {$out = $e1.out * $e2.out;}
        | ^(DIV   e1=expr e2=expr) {$out = $e1.out / $e2.out;}
        | ^(POW   e1=expr e2=expr) {$out = (int)Math.pow((int)$e1.out, (int)$e2.out);}
        | ^(PODST i1=ID   e2=expr) {memory.put($ID.text, new Integer($expr.value));}
        | INT                      {$out = Integer.parseInt($INT.text);}
        | ID                       {$out = memory.get($ID.text);}
        ;
        
        e2
        :
        ;