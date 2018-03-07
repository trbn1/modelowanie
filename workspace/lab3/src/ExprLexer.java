// $ANTLR 3.4 /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g 2018-03-07 12:52:10

//  package com.sample;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ExprLexer() {} 
    public ExprLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g"; }

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:61:5: ( 'int' )
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:61:7: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:64:5: ( 'for' )
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:64:7: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:67:5: ( 'if' )
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:67:7: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:69:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:69:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:69:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:71:5: ( ( '0' .. '9' )+ )
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:71:7: ( '0' .. '9' )+
            {
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:71:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
        try {
            int _type = NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:73:4: ( ( '\\r' )? '\\n' )
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:73:6: ( '\\r' )? '\\n'
            {
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:73:6: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:73:6: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NL"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:75:4: ( ( ' ' | '\\t' )+ )
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:75:6: ( ' ' | '\\t' )+
            {
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:75:6: ( ' ' | '\\t' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\t'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMP"
    public final void mCOMP() throws RecognitionException {
        try {
            int _type = COMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:77:6: ( '==' )
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:77:8: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMP"

    // $ANTLR start "START"
    public final void mSTART() throws RecognitionException {
        try {
            int _type = START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:81:3: ( '{' )
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:81:5: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "START"

    // $ANTLR start "STOP"
    public final void mSTOP() throws RecognitionException {
        try {
            int _type = STOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:85:3: ( '}' )
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:85:5: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STOP"

    // $ANTLR start "LP"
    public final void mLP() throws RecognitionException {
        try {
            int _type = LP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:89:3: ( '(' )
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:89:5: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LP"

    // $ANTLR start "RP"
    public final void mRP() throws RecognitionException {
        try {
            int _type = RP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:93:3: ( ')' )
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:93:5: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RP"

    // $ANTLR start "PODST"
    public final void mPODST() throws RecognitionException {
        try {
            int _type = PODST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:97:3: ( '=' )
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:97:5: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PODST"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:101:3: ( '+' )
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:101:5: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:105:3: ( '-' )
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:105:5: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:109:3: ( '*' )
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:109:5: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:113:3: ( '/' )
            // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:113:5: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    public void mTokens() throws RecognitionException {
        // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:1:8: ( VAR | FOR | IF | ID | INT | NL | WS | COMP | START | STOP | LP | RP | PODST | PLUS | MINUS | MUL | DIV )
        int alt5=17;
        switch ( input.LA(1) ) {
        case 'i':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA5_16 = input.LA(3);

                if ( (LA5_16=='t') ) {
                    int LA5_21 = input.LA(4);

                    if ( ((LA5_21 >= '0' && LA5_21 <= '9')||(LA5_21 >= 'A' && LA5_21 <= 'Z')||LA5_21=='_'||(LA5_21 >= 'a' && LA5_21 <= 'z')) ) {
                        alt5=4;
                    }
                    else {
                        alt5=1;
                    }
                }
                else {
                    alt5=4;
                }
                }
                break;
            case 'f':
                {
                int LA5_17 = input.LA(3);

                if ( ((LA5_17 >= '0' && LA5_17 <= '9')||(LA5_17 >= 'A' && LA5_17 <= 'Z')||LA5_17=='_'||(LA5_17 >= 'a' && LA5_17 <= 'z')) ) {
                    alt5=4;
                }
                else {
                    alt5=3;
                }
                }
                break;
            default:
                alt5=4;
            }

            }
            break;
        case 'f':
            {
            int LA5_2 = input.LA(2);

            if ( (LA5_2=='o') ) {
                int LA5_18 = input.LA(3);

                if ( (LA5_18=='r') ) {
                    int LA5_23 = input.LA(4);

                    if ( ((LA5_23 >= '0' && LA5_23 <= '9')||(LA5_23 >= 'A' && LA5_23 <= 'Z')||LA5_23=='_'||(LA5_23 >= 'a' && LA5_23 <= 'z')) ) {
                        alt5=4;
                    }
                    else {
                        alt5=2;
                    }
                }
                else {
                    alt5=4;
                }
            }
            else {
                alt5=4;
            }
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'g':
        case 'h':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt5=4;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt5=5;
            }
            break;
        case '\n':
        case '\r':
            {
            alt5=6;
            }
            break;
        case '\t':
        case ' ':
            {
            alt5=7;
            }
            break;
        case '=':
            {
            int LA5_7 = input.LA(2);

            if ( (LA5_7=='=') ) {
                alt5=8;
            }
            else {
                alt5=13;
            }
            }
            break;
        case '{':
            {
            alt5=9;
            }
            break;
        case '}':
            {
            alt5=10;
            }
            break;
        case '(':
            {
            alt5=11;
            }
            break;
        case ')':
            {
            alt5=12;
            }
            break;
        case '+':
            {
            alt5=14;
            }
            break;
        case '-':
            {
            alt5=15;
            }
            break;
        case '*':
            {
            alt5=16;
            }
            break;
        case '/':
            {
            alt5=17;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;

        }

        switch (alt5) {
            case 1 :
                // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:1:10: VAR
                {
                mVAR(); 


                }
                break;
            case 2 :
                // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:1:14: FOR
                {
                mFOR(); 


                }
                break;
            case 3 :
                // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:1:18: IF
                {
                mIF(); 


                }
                break;
            case 4 :
                // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:1:21: ID
                {
                mID(); 


                }
                break;
            case 5 :
                // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:1:24: INT
                {
                mINT(); 


                }
                break;
            case 6 :
                // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:1:28: NL
                {
                mNL(); 


                }
                break;
            case 7 :
                // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:1:31: WS
                {
                mWS(); 


                }
                break;
            case 8 :
                // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:1:34: COMP
                {
                mCOMP(); 


                }
                break;
            case 9 :
                // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:1:39: START
                {
                mSTART(); 


                }
                break;
            case 10 :
                // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:1:45: STOP
                {
                mSTOP(); 


                }
                break;
            case 11 :
                // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:1:50: LP
                {
                mLP(); 


                }
                break;
            case 12 :
                // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:1:53: RP
                {
                mRP(); 


                }
                break;
            case 13 :
                // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:1:56: PODST
                {
                mPODST(); 


                }
                break;
            case 14 :
                // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:1:62: PLUS
                {
                mPLUS(); 


                }
                break;
            case 15 :
                // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:1:67: MINUS
                {
                mMINUS(); 


                }
                break;
            case 16 :
                // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:1:73: MUL
                {
                mMUL(); 


                }
                break;
            case 17 :
                // /home/uml/Pulpit/bn/modelowanie/workspace/lab2-1/src/Expr.g:1:77: DIV
                {
                mDIV(); 


                }
                break;

        }

    }


 

}