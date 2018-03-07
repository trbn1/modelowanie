// $ANTLR 3.4 /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/TExpr3.g 2018-03-07 12:52:10

// package com.sample;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class TExpr3 extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMP", "DIV", "FOR", "ID", "IF", "INT", "LP", "MINUS", "MUL", "NL", "PLUS", "PODST", "RP", "START", "STOP", "VAR", "WS"
    };

    public static final int EOF=-1;
    public static final int COMP=4;
    public static final int DIV=5;
    public static final int FOR=6;
    public static final int ID=7;
    public static final int IF=8;
    public static final int INT=9;
    public static final int LP=10;
    public static final int MINUS=11;
    public static final int MUL=12;
    public static final int NL=13;
    public static final int PLUS=14;
    public static final int PODST=15;
    public static final int RP=16;
    public static final int START=17;
    public static final int STOP=18;
    public static final int VAR=19;
    public static final int WS=20;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public TExpr3(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public TExpr3(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("TExpr3Templates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return TExpr3.tokenNames; }
    public String getGrammarFileName() { return "/home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/TExpr3.g"; }


    public static class prog_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "prog"
    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/TExpr3.g:15:1: prog : (d+= dekl |e+= expr )* -> template(e=$ed=$d) <<\n<d;separator=\"\\n\">\nstart:\n<e;separator=\"\\n\">\n>>;
    public final TExpr3.prog_return prog() throws RecognitionException {
        TExpr3.prog_return retval = new TExpr3.prog_return();
        retval.start = input.LT(1);


        List list_d=null;
        List list_e=null;
        RuleReturnScope d = null;
        RuleReturnScope e = null;
        try {
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/TExpr3.g:15:9: ( (d+= dekl |e+= expr )* -> template(e=$ed=$d) <<\n<d;separator=\"\\n\">\nstart:\n<e;separator=\"\\n\">\n>>)
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/TExpr3.g:15:11: (d+= dekl |e+= expr )*
            {
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/TExpr3.g:15:11: (d+= dekl |e+= expr )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==VAR) ) {
                    alt1=1;
                }
                else if ( ((LA1_0 >= DIV && LA1_0 <= INT)||(LA1_0 >= MINUS && LA1_0 <= MUL)||(LA1_0 >= PLUS && LA1_0 <= PODST)) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/TExpr3.g:15:12: d+= dekl
            	    {
            	    pushFollow(FOLLOW_dekl_in_prog52);
            	    d=dekl();

            	    state._fsp--;

            	    if (list_d==null) list_d=new ArrayList();
            	    list_d.add(d.getTemplate());


            	    }
            	    break;
            	case 2 :
            	    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/TExpr3.g:15:22: e+= expr
            	    {
            	    pushFollow(FOLLOW_expr_in_prog58);
            	    e=expr();

            	    state._fsp--;

            	    if (list_e==null) list_e=new ArrayList();
            	    list_e.add(e.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // TEMPLATE REWRITE
            // 15:32: -> template(e=$ed=$d) <<\n<d;separator=\"\\n\">\nstart:\n<e;separator=\"\\n\">\n>>
            {
                retval.st = new StringTemplate(templateLib, "\n<d;separator=\"\\n\">\nstart:\n<e;separator=\"\\n\">\n",new STAttrMap().put("e", list_e).put("d", list_d));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class dekl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "dekl"
    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/TExpr3.g:22:1: dekl : ^( VAR ID ) -> dekl(zm=$ID.text);
    public final TExpr3.dekl_return dekl() throws RecognitionException {
        TExpr3.dekl_return retval = new TExpr3.dekl_return();
        retval.start = input.LT(1);


        CommonTree ID1=null;

        try {
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/TExpr3.g:22:9: ( ^( VAR ID ) -> dekl(zm=$ID.text))
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/TExpr3.g:22:11: ^( VAR ID )
            {
            match(input,VAR,FOLLOW_VAR_in_dekl88); 

            match(input, Token.DOWN, null); 
            ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_dekl90); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 22:21: -> dekl(zm=$ID.text)
            {
                retval.st = templateLib.getInstanceOf("dekl",new STAttrMap().put("zm", (ID1!=null?ID1.getText():null)));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dekl"


    public static class expr_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "expr"
    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/TExpr3.g:24:1: expr : ( ^( PLUS e1= expr e2= expr ) -> dodaj(p1=$e1.stp2=$e2.st)| ^( MINUS e1= expr e2= expr ) -> odejmij(p1=$e1.stp2=$e2.st)| ^( MUL e1= expr e2= expr ) -> pomnoz(p1=$e1.stp2=$e2.st)| ^( DIV e1= expr e2= expr ) -> podziel(p1=$e1.stp2=$e2.st)| ^( PODST i1= ID e2= expr ) -> podstaw(p1=$e1.stp2=$e2.st)| ^( FOR e1= expr ) -> loop(p1=$e1.st)| ^( IF e1= expr e2= expr ) -> if_stat(p1=$e1.stp2=$e2.st)| INT -> int(i=$INT.text)| ID -> odczyt(i=$ID.text));
    public final TExpr3.expr_return expr() throws RecognitionException {
        TExpr3.expr_return retval = new TExpr3.expr_return();
        retval.start = input.LT(1);


        CommonTree i1=null;
        CommonTree INT2=null;
        CommonTree ID3=null;
        TExpr3.expr_return e1 =null;

        TExpr3.expr_return e2 =null;


        try {
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/TExpr3.g:24:9: ( ^( PLUS e1= expr e2= expr ) -> dodaj(p1=$e1.stp2=$e2.st)| ^( MINUS e1= expr e2= expr ) -> odejmij(p1=$e1.stp2=$e2.st)| ^( MUL e1= expr e2= expr ) -> pomnoz(p1=$e1.stp2=$e2.st)| ^( DIV e1= expr e2= expr ) -> podziel(p1=$e1.stp2=$e2.st)| ^( PODST i1= ID e2= expr ) -> podstaw(p1=$e1.stp2=$e2.st)| ^( FOR e1= expr ) -> loop(p1=$e1.st)| ^( IF e1= expr e2= expr ) -> if_stat(p1=$e1.stp2=$e2.st)| INT -> int(i=$INT.text)| ID -> odczyt(i=$ID.text))
            int alt2=9;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt2=1;
                }
                break;
            case MINUS:
                {
                alt2=2;
                }
                break;
            case MUL:
                {
                alt2=3;
                }
                break;
            case DIV:
                {
                alt2=4;
                }
                break;
            case PODST:
                {
                alt2=5;
                }
                break;
            case FOR:
                {
                alt2=6;
                }
                break;
            case IF:
                {
                alt2=7;
                }
                break;
            case INT:
                {
                alt2=8;
                }
                break;
            case ID:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/TExpr3.g:24:11: ^( PLUS e1= expr e2= expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr112); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr117);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr121);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 24:36: -> dodaj(p1=$e1.stp2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("dodaj",new STAttrMap().put("p1", (e1!=null?e1.st:null)).put("p2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/TExpr3.g:25:11: ^( MINUS e1= expr e2= expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr148); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr152);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr156);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 25:36: -> odejmij(p1=$e1.stp2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("odejmij",new STAttrMap().put("p1", (e1!=null?e1.st:null)).put("p2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/TExpr3.g:26:11: ^( MUL e1= expr e2= expr )
                    {
                    match(input,MUL,FOLLOW_MUL_in_expr183); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr189);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr193);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 26:36: -> pomnoz(p1=$e1.stp2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("pomnoz",new STAttrMap().put("p1", (e1!=null?e1.st:null)).put("p2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/TExpr3.g:27:11: ^( DIV e1= expr e2= expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr220); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr226);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr230);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 27:36: -> podziel(p1=$e1.stp2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("podziel",new STAttrMap().put("p1", (e1!=null?e1.st:null)).put("p2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 5 :
                    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/TExpr3.g:28:11: ^( PODST i1= ID e2= expr )
                    {
                    match(input,PODST,FOLLOW_PODST_in_expr257); 

                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_expr261); 

                    pushFollow(FOLLOW_expr_in_expr267);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 28:36: -> podstaw(p1=$e1.stp2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("podstaw",new STAttrMap().put("p1", (e1!=null?e1.st:null)).put("p2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 6 :
                    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/TExpr3.g:29:11: ^( FOR e1= expr )
                    {
                    match(input,FOR,FOLLOW_FOR_in_expr294); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr298);
                    e1=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 29:36: -> loop(p1=$e1.st)
                    {
                        retval.st = templateLib.getInstanceOf("loop",new STAttrMap().put("p1", (e1!=null?e1.st:null)));
                    }



                    }
                    break;
                case 7 :
                    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/TExpr3.g:30:11: ^( IF e1= expr e2= expr )
                    {
                    match(input,IF,FOLLOW_IF_in_expr331); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr335);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr339);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 30:36: -> if_stat(p1=$e1.stp2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("if_stat",new STAttrMap().put("p1", (e1!=null?e1.st:null)).put("p2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 8 :
                    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/TExpr3.g:31:11: INT
                    {
                    INT2=(CommonTree)match(input,INT,FOLLOW_INT_in_expr368); 

                    // TEMPLATE REWRITE
                    // 31:36: -> int(i=$INT.text)
                    {
                        retval.st = templateLib.getInstanceOf("int",new STAttrMap().put("i", (INT2!=null?INT2.getText():null)));
                    }



                    }
                    break;
                case 9 :
                    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/TExpr3.g:32:11: ID
                    {
                    ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_expr410); 

                    // TEMPLATE REWRITE
                    // 32:36: -> odczyt(i=$ID.text)
                    {
                        retval.st = templateLib.getInstanceOf("odczyt",new STAttrMap().put("i", (ID3!=null?ID3.getText():null)));
                    }



                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"

    // Delegated rules


 

    public static final BitSet FOLLOW_dekl_in_prog52 = new BitSet(new long[]{0x000000000008DBE2L});
    public static final BitSet FOLLOW_expr_in_prog58 = new BitSet(new long[]{0x000000000008DBE2L});
    public static final BitSet FOLLOW_VAR_in_dekl88 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_dekl90 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr112 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr117 = new BitSet(new long[]{0x000000000000DBE0L});
    public static final BitSet FOLLOW_expr_in_expr121 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr148 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr152 = new BitSet(new long[]{0x000000000000DBE0L});
    public static final BitSet FOLLOW_expr_in_expr156 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_expr183 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr189 = new BitSet(new long[]{0x000000000000DBE0L});
    public static final BitSet FOLLOW_expr_in_expr193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr226 = new BitSet(new long[]{0x000000000000DBE0L});
    public static final BitSet FOLLOW_expr_in_expr230 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PODST_in_expr257 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr261 = new BitSet(new long[]{0x000000000000DBE0L});
    public static final BitSet FOLLOW_expr_in_expr267 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_expr294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr298 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_expr331 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr335 = new BitSet(new long[]{0x000000000000DBE0L});
    public static final BitSet FOLLOW_expr_in_expr339 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_expr368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr410 = new BitSet(new long[]{0x0000000000000002L});

}