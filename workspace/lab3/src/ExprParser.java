// $ANTLR 3.4 /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g 2018-03-07 12:52:09

// package com.sample;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ExprParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ExprParser.tokenNames; }
    public String getGrammarFileName() { return "/home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:16:1: prog : ( stat | blok )+ EOF !;
    public final ExprParser.prog_return prog() throws RecognitionException {
        ExprParser.prog_return retval = new ExprParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF3=null;
        ExprParser.stat_return stat1 =null;

        ExprParser.blok_return blok2 =null;


        CommonTree EOF3_tree=null;

        try {
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:17:5: ( ( stat | blok )+ EOF !)
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:17:7: ( stat | blok )+ EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:17:7: ( stat | blok )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= FOR && LA1_0 <= ID)||(LA1_0 >= INT && LA1_0 <= LP)||LA1_0==NL||LA1_0==VAR) ) {
                    alt1=1;
                }
                else if ( (LA1_0==START) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:17:8: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog49);
            	    stat1=stat();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stat1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:17:13: blok
            	    {
            	    pushFollow(FOLLOW_blok_in_prog51);
            	    blok2=blok();

            	    state._fsp--;

            	    adaptor.addChild(root_0, blok2.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_prog55); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class blok_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blok"
    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:19:1: blok : START ^ ( blok | stat )* STOP !;
    public final ExprParser.blok_return blok() throws RecognitionException {
        ExprParser.blok_return retval = new ExprParser.blok_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token START4=null;
        Token STOP7=null;
        ExprParser.blok_return blok5 =null;

        ExprParser.stat_return stat6 =null;


        CommonTree START4_tree=null;
        CommonTree STOP7_tree=null;

        try {
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:20:5: ( START ^ ( blok | stat )* STOP !)
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:20:7: START ^ ( blok | stat )* STOP !
            {
            root_0 = (CommonTree)adaptor.nil();


            START4=(Token)match(input,START,FOLLOW_START_in_blok72); 
            START4_tree = 
            (CommonTree)adaptor.create(START4)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(START4_tree, root_0);


            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:21:5: ( blok | stat )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==START) ) {
                    alt2=1;
                }
                else if ( ((LA2_0 >= FOR && LA2_0 <= ID)||(LA2_0 >= INT && LA2_0 <= LP)||LA2_0==NL||LA2_0==VAR) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:21:6: blok
            	    {
            	    pushFollow(FOLLOW_blok_in_blok80);
            	    blok5=blok();

            	    state._fsp--;

            	    adaptor.addChild(root_0, blok5.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:21:11: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_blok82);
            	    stat6=stat();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stat6.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            STOP7=(Token)match(input,STOP,FOLLOW_STOP_in_blok90); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "blok"


    public static class stat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stat"
    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:25:1: stat : ( expr NL -> expr | ID PODST expr NL -> ^( PODST ID expr ) | NL ->| VAR ID NL -> ^( VAR ID ) | loop NL -> loop );
    public final ExprParser.stat_return stat() throws RecognitionException {
        ExprParser.stat_return retval = new ExprParser.stat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NL9=null;
        Token ID10=null;
        Token PODST11=null;
        Token NL13=null;
        Token NL14=null;
        Token VAR15=null;
        Token ID16=null;
        Token NL17=null;
        Token NL19=null;
        ExprParser.expr_return expr8 =null;

        ExprParser.expr_return expr12 =null;

        ExprParser.loop_return loop18 =null;


        CommonTree NL9_tree=null;
        CommonTree ID10_tree=null;
        CommonTree PODST11_tree=null;
        CommonTree NL13_tree=null;
        CommonTree NL14_tree=null;
        CommonTree VAR15_tree=null;
        CommonTree ID16_tree=null;
        CommonTree NL17_tree=null;
        CommonTree NL19_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_PODST=new RewriteRuleTokenStream(adaptor,"token PODST");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_loop=new RewriteRuleSubtreeStream(adaptor,"rule loop");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:26:5: ( expr NL -> expr | ID PODST expr NL -> ^( PODST ID expr ) | NL ->| VAR ID NL -> ^( VAR ID ) | loop NL -> loop )
            int alt3=5;
            switch ( input.LA(1) ) {
            case INT:
            case LP:
                {
                alt3=1;
                }
                break;
            case ID:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==PODST) ) {
                    alt3=2;
                }
                else if ( ((LA3_2 >= COMP && LA3_2 <= DIV)||(LA3_2 >= MINUS && LA3_2 <= PLUS)) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;

                }
                }
                break;
            case NL:
                {
                alt3=3;
                }
                break;
            case VAR:
                {
                alt3=4;
                }
                break;
            case FOR:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:26:7: expr NL
                    {
                    pushFollow(FOLLOW_expr_in_stat108);
                    expr8=expr();

                    state._fsp--;

                    stream_expr.add(expr8.getTree());

                    NL9=(Token)match(input,NL,FOLLOW_NL_in_stat110);  
                    stream_NL.add(NL9);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 26:15: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:27:7: ID PODST expr NL
                    {
                    ID10=(Token)match(input,ID,FOLLOW_ID_in_stat122);  
                    stream_ID.add(ID10);


                    PODST11=(Token)match(input,PODST,FOLLOW_PODST_in_stat124);  
                    stream_PODST.add(PODST11);


                    pushFollow(FOLLOW_expr_in_stat126);
                    expr12=expr();

                    state._fsp--;

                    stream_expr.add(expr12.getTree());

                    NL13=(Token)match(input,NL,FOLLOW_NL_in_stat128);  
                    stream_NL.add(NL13);


                    // AST REWRITE
                    // elements: ID, PODST, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 27:24: -> ^( PODST ID expr )
                    {
                        // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:27:27: ^( PODST ID expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_PODST.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:28:7: NL
                    {
                    NL14=(Token)match(input,NL,FOLLOW_NL_in_stat146);  
                    stream_NL.add(NL14);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 28:10: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:29:7: VAR ID NL
                    {
                    VAR15=(Token)match(input,VAR,FOLLOW_VAR_in_stat156);  
                    stream_VAR.add(VAR15);


                    ID16=(Token)match(input,ID,FOLLOW_ID_in_stat158);  
                    stream_ID.add(ID16);


                    NL17=(Token)match(input,NL,FOLLOW_NL_in_stat160);  
                    stream_NL.add(NL17);


                    // AST REWRITE
                    // elements: ID, VAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 29:17: -> ^( VAR ID )
                    {
                        // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:29:20: ^( VAR ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_VAR.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:30:7: loop NL
                    {
                    pushFollow(FOLLOW_loop_in_stat176);
                    loop18=loop();

                    state._fsp--;

                    stream_loop.add(loop18.getTree());

                    NL19=(Token)match(input,NL,FOLLOW_NL_in_stat178);  
                    stream_NL.add(NL19);


                    // AST REWRITE
                    // elements: loop
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 30:15: -> loop
                    {
                        adaptor.addChild(root_0, stream_loop.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stat"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:33:1: expr : multExpr ( PLUS ^ multExpr | MINUS ^ multExpr )* ;
    public final ExprParser.expr_return expr() throws RecognitionException {
        ExprParser.expr_return retval = new ExprParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PLUS21=null;
        Token MINUS23=null;
        ExprParser.multExpr_return multExpr20 =null;

        ExprParser.multExpr_return multExpr22 =null;

        ExprParser.multExpr_return multExpr24 =null;


        CommonTree PLUS21_tree=null;
        CommonTree MINUS23_tree=null;

        try {
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:34:5: ( multExpr ( PLUS ^ multExpr | MINUS ^ multExpr )* )
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:34:7: multExpr ( PLUS ^ multExpr | MINUS ^ multExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_expr199);
            multExpr20=multExpr();

            state._fsp--;

            adaptor.addChild(root_0, multExpr20.getTree());

            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:35:7: ( PLUS ^ multExpr | MINUS ^ multExpr )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==PLUS) ) {
                    alt4=1;
                }
                else if ( (LA4_0==MINUS) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:35:9: PLUS ^ multExpr
            	    {
            	    PLUS21=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr209); 
            	    PLUS21_tree = 
            	    (CommonTree)adaptor.create(PLUS21)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(PLUS21_tree, root_0);


            	    pushFollow(FOLLOW_multExpr_in_expr212);
            	    multExpr22=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr22.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:36:9: MINUS ^ multExpr
            	    {
            	    MINUS23=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr222); 
            	    MINUS23_tree = 
            	    (CommonTree)adaptor.create(MINUS23)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(MINUS23_tree, root_0);


            	    pushFollow(FOLLOW_multExpr_in_expr225);
            	    multExpr24=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr24.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class multExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multExpr"
    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:40:1: multExpr : if_stat ( MUL ^ if_stat | DIV ^ if_stat )* ;
    public final ExprParser.multExpr_return multExpr() throws RecognitionException {
        ExprParser.multExpr_return retval = new ExprParser.multExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token MUL26=null;
        Token DIV28=null;
        ExprParser.if_stat_return if_stat25 =null;

        ExprParser.if_stat_return if_stat27 =null;

        ExprParser.if_stat_return if_stat29 =null;


        CommonTree MUL26_tree=null;
        CommonTree DIV28_tree=null;

        try {
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:41:5: ( if_stat ( MUL ^ if_stat | DIV ^ if_stat )* )
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:41:7: if_stat ( MUL ^ if_stat | DIV ^ if_stat )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_if_stat_in_multExpr251);
            if_stat25=if_stat();

            state._fsp--;

            adaptor.addChild(root_0, if_stat25.getTree());

            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:42:7: ( MUL ^ if_stat | DIV ^ if_stat )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==MUL) ) {
                    alt5=1;
                }
                else if ( (LA5_0==DIV) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:42:9: MUL ^ if_stat
            	    {
            	    MUL26=(Token)match(input,MUL,FOLLOW_MUL_in_multExpr261); 
            	    MUL26_tree = 
            	    (CommonTree)adaptor.create(MUL26)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(MUL26_tree, root_0);


            	    pushFollow(FOLLOW_if_stat_in_multExpr264);
            	    if_stat27=if_stat();

            	    state._fsp--;

            	    adaptor.addChild(root_0, if_stat27.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:43:9: DIV ^ if_stat
            	    {
            	    DIV28=(Token)match(input,DIV,FOLLOW_DIV_in_multExpr274); 
            	    DIV28_tree = 
            	    (CommonTree)adaptor.create(DIV28)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(DIV28_tree, root_0);


            	    pushFollow(FOLLOW_if_stat_in_multExpr277);
            	    if_stat29=if_stat();

            	    state._fsp--;

            	    adaptor.addChild(root_0, if_stat29.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multExpr"


    public static class if_stat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_stat"
    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:47:1: if_stat : atom ( COMP ^ if_stat )? ;
    public final ExprParser.if_stat_return if_stat() throws RecognitionException {
        ExprParser.if_stat_return retval = new ExprParser.if_stat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMP31=null;
        ExprParser.atom_return atom30 =null;

        ExprParser.if_stat_return if_stat32 =null;


        CommonTree COMP31_tree=null;

        try {
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:48:5: ( atom ( COMP ^ if_stat )? )
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:48:7: atom ( COMP ^ if_stat )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_atom_in_if_stat308);
            atom30=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom30.getTree());

            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:49:5: ( COMP ^ if_stat )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==COMP) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:49:6: COMP ^ if_stat
                    {
                    COMP31=(Token)match(input,COMP,FOLLOW_COMP_in_if_stat315); 
                    COMP31_tree = 
                    (CommonTree)adaptor.create(COMP31)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(COMP31_tree, root_0);


                    pushFollow(FOLLOW_if_stat_in_if_stat318);
                    if_stat32=if_stat();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stat32.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_stat"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:52:1: atom : ( INT | ID | LP ! expr RP !);
    public final ExprParser.atom_return atom() throws RecognitionException {
        ExprParser.atom_return retval = new ExprParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT33=null;
        Token ID34=null;
        Token LP35=null;
        Token RP37=null;
        ExprParser.expr_return expr36 =null;


        CommonTree INT33_tree=null;
        CommonTree ID34_tree=null;
        CommonTree LP35_tree=null;
        CommonTree RP37_tree=null;

        try {
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:53:5: ( INT | ID | LP ! expr RP !)
            int alt7=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt7=1;
                }
                break;
            case ID:
                {
                alt7=2;
                }
                break;
            case LP:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:53:7: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT33=(Token)match(input,INT,FOLLOW_INT_in_atom337); 
                    INT33_tree = 
                    (CommonTree)adaptor.create(INT33)
                    ;
                    adaptor.addChild(root_0, INT33_tree);


                    }
                    break;
                case 2 :
                    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:54:7: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID34=(Token)match(input,ID,FOLLOW_ID_in_atom345); 
                    ID34_tree = 
                    (CommonTree)adaptor.create(ID34)
                    ;
                    adaptor.addChild(root_0, ID34_tree);


                    }
                    break;
                case 3 :
                    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:55:7: LP ! expr RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LP35=(Token)match(input,LP,FOLLOW_LP_in_atom353); 

                    pushFollow(FOLLOW_expr_in_atom356);
                    expr36=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr36.getTree());

                    RP37=(Token)match(input,RP,FOLLOW_RP_in_atom358); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class loop_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "loop"
    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:58:1: loop : FOR ^ INT ;
    public final ExprParser.loop_return loop() throws RecognitionException {
        ExprParser.loop_return retval = new ExprParser.loop_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token FOR38=null;
        Token INT39=null;

        CommonTree FOR38_tree=null;
        CommonTree INT39_tree=null;

        try {
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:59:5: ( FOR ^ INT )
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:59:7: FOR ^ INT
            {
            root_0 = (CommonTree)adaptor.nil();


            FOR38=(Token)match(input,FOR,FOLLOW_FOR_in_loop381); 
            FOR38_tree = 
            (CommonTree)adaptor.create(FOR38)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(FOR38_tree, root_0);


            INT39=(Token)match(input,INT,FOLLOW_INT_in_loop384); 
            INT39_tree = 
            (CommonTree)adaptor.create(INT39)
            ;
            adaptor.addChild(root_0, INT39_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "loop"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog49 = new BitSet(new long[]{0x00000000000A26C0L});
    public static final BitSet FOLLOW_blok_in_prog51 = new BitSet(new long[]{0x00000000000A26C0L});
    public static final BitSet FOLLOW_EOF_in_prog55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_blok72 = new BitSet(new long[]{0x00000000000E26C0L});
    public static final BitSet FOLLOW_blok_in_blok80 = new BitSet(new long[]{0x00000000000E26C0L});
    public static final BitSet FOLLOW_stat_in_blok82 = new BitSet(new long[]{0x00000000000E26C0L});
    public static final BitSet FOLLOW_STOP_in_blok90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stat108 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_stat110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat122 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_PODST_in_stat124 = new BitSet(new long[]{0x0000000000000680L});
    public static final BitSet FOLLOW_expr_in_stat126 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_stat128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_stat146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_stat156 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_stat158 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_stat160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loop_in_stat176 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_stat178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr199 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_PLUS_in_expr209 = new BitSet(new long[]{0x0000000000000680L});
    public static final BitSet FOLLOW_multExpr_in_expr212 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_MINUS_in_expr222 = new BitSet(new long[]{0x0000000000000680L});
    public static final BitSet FOLLOW_multExpr_in_expr225 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_if_stat_in_multExpr251 = new BitSet(new long[]{0x0000000000001022L});
    public static final BitSet FOLLOW_MUL_in_multExpr261 = new BitSet(new long[]{0x0000000000000680L});
    public static final BitSet FOLLOW_if_stat_in_multExpr264 = new BitSet(new long[]{0x0000000000001022L});
    public static final BitSet FOLLOW_DIV_in_multExpr274 = new BitSet(new long[]{0x0000000000000680L});
    public static final BitSet FOLLOW_if_stat_in_multExpr277 = new BitSet(new long[]{0x0000000000001022L});
    public static final BitSet FOLLOW_atom_in_if_stat308 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_COMP_in_if_stat315 = new BitSet(new long[]{0x0000000000000680L});
    public static final BitSet FOLLOW_if_stat_in_if_stat318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_atom353 = new BitSet(new long[]{0x0000000000000680L});
    public static final BitSet FOLLOW_expr_in_atom356 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RP_in_atom358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_loop381 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_loop384 = new BitSet(new long[]{0x0000000000000002L});

}