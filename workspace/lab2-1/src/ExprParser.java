// $ANTLR 3.4 /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g 2018-02-28 12:51:42

// package com.sample;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIV", "ID", "INT", "LP", "MINUS", "MUL", "NL", "PLUS", "PODST", "POW", "RP", "START", "STOP", "VAR", "WS"
    };

    public static final int EOF=-1;
    public static final int DIV=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int LP=7;
    public static final int MINUS=8;
    public static final int MUL=9;
    public static final int NL=10;
    public static final int PLUS=11;
    public static final int PODST=12;
    public static final int POW=13;
    public static final int RP=14;
    public static final int START=15;
    public static final int STOP=16;
    public static final int VAR=17;
    public static final int WS=18;

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
    public String getGrammarFileName() { return "/home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:16:1: prog : ( stat | blok )+ EOF !;
    public final ExprParser.prog_return prog() throws RecognitionException {
        ExprParser.prog_return retval = new ExprParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF3=null;
        ExprParser.stat_return stat1 =null;

        ExprParser.blok_return blok2 =null;


        CommonTree EOF3_tree=null;

        try {
            // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:17:5: ( ( stat | blok )+ EOF !)
            // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:17:7: ( stat | blok )+ EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:17:7: ( stat | blok )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ID && LA1_0 <= LP)||LA1_0==NL) ) {
                    alt1=1;
                }
                else if ( (LA1_0==START) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:17:8: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog49);
            	    stat1=stat();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stat1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:17:13: blok
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
    // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:19:1: blok : START ^ ( blok | stat )* STOP !;
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
            // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:20:5: ( START ^ ( blok | stat )* STOP !)
            // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:20:7: START ^ ( blok | stat )* STOP !
            {
            root_0 = (CommonTree)adaptor.nil();


            START4=(Token)match(input,START,FOLLOW_START_in_blok72); 
            START4_tree = 
            (CommonTree)adaptor.create(START4)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(START4_tree, root_0);


            // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:21:5: ( blok | stat )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==START) ) {
                    alt2=1;
                }
                else if ( ((LA2_0 >= ID && LA2_0 <= LP)||LA2_0==NL) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:21:6: blok
            	    {
            	    pushFollow(FOLLOW_blok_in_blok80);
            	    blok5=blok();

            	    state._fsp--;

            	    adaptor.addChild(root_0, blok5.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:21:11: stat
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
    // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:25:1: stat : ( expr NL -> expr | ID PODST expr NL -> ^( PODST ID expr ) | NL ->);
    public final ExprParser.stat_return stat() throws RecognitionException {
        ExprParser.stat_return retval = new ExprParser.stat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NL9=null;
        Token ID10=null;
        Token PODST11=null;
        Token NL13=null;
        Token NL14=null;
        ExprParser.expr_return expr8 =null;

        ExprParser.expr_return expr12 =null;


        CommonTree NL9_tree=null;
        CommonTree ID10_tree=null;
        CommonTree PODST11_tree=null;
        CommonTree NL13_tree=null;
        CommonTree NL14_tree=null;
        RewriteRuleTokenStream stream_PODST=new RewriteRuleTokenStream(adaptor,"token PODST");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:26:5: ( expr NL -> expr | ID PODST expr NL -> ^( PODST ID expr ) | NL ->)
            int alt3=3;
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
                else if ( (LA3_2==DIV||(LA3_2 >= MINUS && LA3_2 <= PLUS)||LA3_2==POW) ) {
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:26:7: expr NL
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
                    // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:29:7: ID PODST expr NL
                    {
                    ID10=(Token)match(input,ID,FOLLOW_ID_in_stat128);  
                    stream_ID.add(ID10);


                    PODST11=(Token)match(input,PODST,FOLLOW_PODST_in_stat130);  
                    stream_PODST.add(PODST11);


                    pushFollow(FOLLOW_expr_in_stat132);
                    expr12=expr();

                    state._fsp--;

                    stream_expr.add(expr12.getTree());

                    NL13=(Token)match(input,NL,FOLLOW_NL_in_stat134);  
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
                    // 29:24: -> ^( PODST ID expr )
                    {
                        // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:29:27: ^( PODST ID expr )
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
                    // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:31:7: NL
                    {
                    NL14=(Token)match(input,NL,FOLLOW_NL_in_stat153);  
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
                    // 31:10: ->
                    {
                        root_0 = null;
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
    // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:34:1: expr : multExpr ( PLUS ^ multExpr | MINUS ^ multExpr )* ;
    public final ExprParser.expr_return expr() throws RecognitionException {
        ExprParser.expr_return retval = new ExprParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PLUS16=null;
        Token MINUS18=null;
        ExprParser.multExpr_return multExpr15 =null;

        ExprParser.multExpr_return multExpr17 =null;

        ExprParser.multExpr_return multExpr19 =null;


        CommonTree PLUS16_tree=null;
        CommonTree MINUS18_tree=null;

        try {
            // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:35:5: ( multExpr ( PLUS ^ multExpr | MINUS ^ multExpr )* )
            // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:35:7: multExpr ( PLUS ^ multExpr | MINUS ^ multExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_expr172);
            multExpr15=multExpr();

            state._fsp--;

            adaptor.addChild(root_0, multExpr15.getTree());

            // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:36:7: ( PLUS ^ multExpr | MINUS ^ multExpr )*
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
            	    // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:36:9: PLUS ^ multExpr
            	    {
            	    PLUS16=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr182); 
            	    PLUS16_tree = 
            	    (CommonTree)adaptor.create(PLUS16)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(PLUS16_tree, root_0);


            	    pushFollow(FOLLOW_multExpr_in_expr185);
            	    multExpr17=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr17.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:37:9: MINUS ^ multExpr
            	    {
            	    MINUS18=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr195); 
            	    MINUS18_tree = 
            	    (CommonTree)adaptor.create(MINUS18)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(MINUS18_tree, root_0);


            	    pushFollow(FOLLOW_multExpr_in_expr198);
            	    multExpr19=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr19.getTree());

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
    // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:41:1: multExpr : pot ( MUL ^ pot | DIV ^ pot )* ;
    public final ExprParser.multExpr_return multExpr() throws RecognitionException {
        ExprParser.multExpr_return retval = new ExprParser.multExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token MUL21=null;
        Token DIV23=null;
        ExprParser.pot_return pot20 =null;

        ExprParser.pot_return pot22 =null;

        ExprParser.pot_return pot24 =null;


        CommonTree MUL21_tree=null;
        CommonTree DIV23_tree=null;

        try {
            // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:42:5: ( pot ( MUL ^ pot | DIV ^ pot )* )
            // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:42:7: pot ( MUL ^ pot | DIV ^ pot )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_pot_in_multExpr224);
            pot20=pot();

            state._fsp--;

            adaptor.addChild(root_0, pot20.getTree());

            // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:43:7: ( MUL ^ pot | DIV ^ pot )*
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
            	    // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:43:9: MUL ^ pot
            	    {
            	    MUL21=(Token)match(input,MUL,FOLLOW_MUL_in_multExpr234); 
            	    MUL21_tree = 
            	    (CommonTree)adaptor.create(MUL21)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(MUL21_tree, root_0);


            	    pushFollow(FOLLOW_pot_in_multExpr237);
            	    pot22=pot();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pot22.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:44:9: DIV ^ pot
            	    {
            	    DIV23=(Token)match(input,DIV,FOLLOW_DIV_in_multExpr247); 
            	    DIV23_tree = 
            	    (CommonTree)adaptor.create(DIV23)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(DIV23_tree, root_0);


            	    pushFollow(FOLLOW_pot_in_multExpr250);
            	    pot24=pot();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pot24.getTree());

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


    public static class pot_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pot"
    // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:48:1: pot : atom ( POW ^ pot )? ;
    public final ExprParser.pot_return pot() throws RecognitionException {
        ExprParser.pot_return retval = new ExprParser.pot_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token POW26=null;
        ExprParser.atom_return atom25 =null;

        ExprParser.pot_return pot27 =null;


        CommonTree POW26_tree=null;

        try {
            // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:49:5: ( atom ( POW ^ pot )? )
            // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:49:7: atom ( POW ^ pot )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_atom_in_pot276);
            atom25=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom25.getTree());

            // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:50:7: ( POW ^ pot )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==POW) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:50:8: POW ^ pot
                    {
                    POW26=(Token)match(input,POW,FOLLOW_POW_in_pot285); 
                    POW26_tree = 
                    (CommonTree)adaptor.create(POW26)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(POW26_tree, root_0);


                    pushFollow(FOLLOW_pot_in_pot288);
                    pot27=pot();

                    state._fsp--;

                    adaptor.addChild(root_0, pot27.getTree());

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
    // $ANTLR end "pot"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:53:1: atom : ( INT | ID | LP ! expr RP !);
    public final ExprParser.atom_return atom() throws RecognitionException {
        ExprParser.atom_return retval = new ExprParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT28=null;
        Token ID29=null;
        Token LP30=null;
        Token RP32=null;
        ExprParser.expr_return expr31 =null;


        CommonTree INT28_tree=null;
        CommonTree ID29_tree=null;
        CommonTree LP30_tree=null;
        CommonTree RP32_tree=null;

        try {
            // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:54:5: ( INT | ID | LP ! expr RP !)
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
                    // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:54:7: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT28=(Token)match(input,INT,FOLLOW_INT_in_atom307); 
                    INT28_tree = 
                    (CommonTree)adaptor.create(INT28)
                    ;
                    adaptor.addChild(root_0, INT28_tree);


                    }
                    break;
                case 2 :
                    // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:55:7: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID29=(Token)match(input,ID,FOLLOW_ID_in_atom315); 
                    ID29_tree = 
                    (CommonTree)adaptor.create(ID29)
                    ;
                    adaptor.addChild(root_0, ID29_tree);


                    }
                    break;
                case 3 :
                    // /home/uml/Pulpit/bnowak/workspace/lab2-1/src/Expr.g:56:7: LP ! expr RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LP30=(Token)match(input,LP,FOLLOW_LP_in_atom323); 

                    pushFollow(FOLLOW_expr_in_atom326);
                    expr31=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr31.getTree());

                    RP32=(Token)match(input,RP,FOLLOW_RP_in_atom328); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog49 = new BitSet(new long[]{0x00000000000084E0L});
    public static final BitSet FOLLOW_blok_in_prog51 = new BitSet(new long[]{0x00000000000084E0L});
    public static final BitSet FOLLOW_EOF_in_prog55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_blok72 = new BitSet(new long[]{0x00000000000184E0L});
    public static final BitSet FOLLOW_blok_in_blok80 = new BitSet(new long[]{0x00000000000184E0L});
    public static final BitSet FOLLOW_stat_in_blok82 = new BitSet(new long[]{0x00000000000184E0L});
    public static final BitSet FOLLOW_STOP_in_blok90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stat108 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NL_in_stat110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat128 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_PODST_in_stat130 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_expr_in_stat132 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NL_in_stat134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_stat153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr172 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_PLUS_in_expr182 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_multExpr_in_expr185 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_MINUS_in_expr195 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_multExpr_in_expr198 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_pot_in_multExpr224 = new BitSet(new long[]{0x0000000000000212L});
    public static final BitSet FOLLOW_MUL_in_multExpr234 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_pot_in_multExpr237 = new BitSet(new long[]{0x0000000000000212L});
    public static final BitSet FOLLOW_DIV_in_multExpr247 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_pot_in_multExpr250 = new BitSet(new long[]{0x0000000000000212L});
    public static final BitSet FOLLOW_atom_in_pot276 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_POW_in_pot285 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_pot_in_pot288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_atom323 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_expr_in_atom326 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RP_in_atom328 = new BitSet(new long[]{0x0000000000000002L});

}