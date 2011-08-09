package org.eclipse.ocl.examples.xtext.markup.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMarkupLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__12=12;
    public static final int RULE_WS=6;
    public static final int T__17=17;
    public static final int RULE_NL=7;
    public static final int RULE_TEXT=9;
    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__16=16;
    public static final int RULE_STRING=8;
    public static final int RULE_WORD=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__14=14;
    public static final int T__11=11;
    public static final int T__18=18;
    public static final int T__15=15;

    // delegates
    // delegators

    public InternalMarkupLexer() {;} 
    public InternalMarkupLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMarkupLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:11:7: ( 'b[' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:11:9: 'b['
            {
            match("b["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:12:7: ( 'e[' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:12:9: 'e['
            {
            match("e["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:13:7: ( ']' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:13:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:14:7: ( 'fig[' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:14:9: 'fig['
            {
            match("fig["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:15:7: ( 'fig:' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:15:9: 'fig:'
            {
            match("fig:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:16:7: ( '[' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:16:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:17:7: ( 'fig-[' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:17:9: 'fig-['
            {
            match("fig-["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:18:7: ( 'ocl[' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:18:9: 'ocl['
            {
            match("ocl["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:639:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:639:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:639:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:641:11: ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' | '[' | ']' ) | ~ ( ( '\\\\' | '[' | ']' | ' ' | '\\t' | '\\n' | '\\r' ) ) )+ )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:641:13: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' | '[' | ']' ) | ~ ( ( '\\\\' | '[' | ']' | ' ' | '\\t' | '\\n' | '\\r' ) ) )+
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:641:13: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' | '[' | ']' ) | ~ ( ( '\\\\' | '[' | ']' | ' ' | '\\t' | '\\n' | '\\r' ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='\b')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\u001F')||(LA2_0>='!' && LA2_0<='Z')||(LA2_0>='^' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:641:14: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' | '[' | ']' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='<'||input.LA(1)=='>'||(input.LA(1)>='[' && input.LA(1)<=']')||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:641:71: ~ ( ( '\\\\' | '[' | ']' | ' ' | '\\t' | '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='Z')||(input.LA(1)>='^' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
        }
    }
    // $ANTLR end "RULE_WORD"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:643:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:643:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:643:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:643:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='<'||input.LA(1)=='>'||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:643:69: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_TEXT"
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:645:11: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '[' | ']' ) | ~ ( ( '\\\\' | '\\'' | '[' | ']' | '\\n' ) ) )* '\\'' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:645:13: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '[' | ']' ) | ~ ( ( '\\\\' | '\\'' | '[' | ']' | '\\n' ) ) )* '\\''
            {
            match('\''); 
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:645:18: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '[' | ']' ) | ~ ( ( '\\\\' | '\\'' | '[' | ']' | '\\n' ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\\') ) {
                    alt4=1;
                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='Z')||(LA4_0>='^' && LA4_0<='\uFFFF')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:645:19: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '[' | ']' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||(input.LA(1)>='[' && input.LA(1)<=']')||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:645:68: ~ ( ( '\\\\' | '\\'' | '[' | ']' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='Z')||(input.LA(1)>='^' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            int _type = RULE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:647:9: ( ( '\\n' | '\\r' ) ( ( RULE_WS )* ( '\\n' | '\\r' ) )* )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:647:11: ( '\\n' | '\\r' ) ( ( RULE_WS )* ( '\\n' | '\\r' ) )*
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:647:23: ( ( RULE_WS )* ( '\\n' | '\\r' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:647:24: ( RULE_WS )* ( '\\n' | '\\r' )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:647:24: ( RULE_WS )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0=='\t'||LA5_0==' ') ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:647:24: RULE_WS
            	    	    {
            	    	    mRULE_WS(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:649:9: ( ( ' ' | '\\t' )+ )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:649:11: ( ' ' | '\\t' )+
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:649:11: ( ' ' | '\\t' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\t'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:651:16: ( . )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:651:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | RULE_ID | RULE_WORD | RULE_STRING | RULE_TEXT | RULE_NL | RULE_WS | RULE_ANY_OTHER )
        int alt8=15;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:58: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 10 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:66: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 11 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:76: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 12 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:88: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 13 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:98: RULE_NL
                {
                mRULE_NL(); 

                }
                break;
            case 14 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:106: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 15 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:114: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\2\17\1\uffff\1\17\1\uffff\2\17\1\27\2\20\6\uffff\1\17"+
        "\2\uffff\1\17\1\uffff\1\17\2\uffff\1\20\3\uffff\1\20\4\uffff\2\17"+
        "\2\20\1\uffff\1\52\1\20\3\uffff";
    static final String DFA8_eofS =
        "\54\uffff";
    static final String DFA8_minS =
        "\3\0\1\uffff\1\0\1\uffff\2\0\1\42\2\0\6\uffff\1\0\2\uffff\1\0\1"+
        "\uffff\1\0\1\uffff\1\42\1\0\2\uffff\1\42\1\0\4\uffff\4\0\1\uffff"+
        "\1\0\1\133\3\uffff";
    static final String DFA8_maxS =
        "\3\uffff\1\uffff\1\uffff\1\uffff\2\uffff\1\164\2\uffff\6\uffff"+
        "\1\uffff\2\uffff\1\uffff\1\uffff\1\uffff\1\uffff\1\164\1\uffff\2"+
        "\uffff\1\164\1\uffff\4\uffff\4\uffff\1\uffff\1\uffff\1\133\3\uffff";
    static final String DFA8_acceptS =
        "\3\uffff\1\3\1\uffff\1\6\5\uffff\1\12\1\15\1\16\1\1\1\11\1\12\1"+
        "\uffff\1\2\1\3\1\uffff\1\6\1\uffff\1\17\2\uffff\1\12\1\13\2\uffff"+
        "\1\12\1\14\1\15\1\16\4\uffff\1\4\2\uffff\1\10\1\5\1\7";
    static final String DFA8_specialS =
        "\1\16\1\7\1\0\1\uffff\1\20\1\uffff\1\11\1\1\1\uffff\1\3\1\15\6"+
        "\uffff\1\14\2\uffff\1\13\1\uffff\1\17\2\uffff\1\10\3\uffff\1\5\4"+
        "\uffff\1\2\1\21\1\4\1\12\1\uffff\1\6\4\uffff}>";
    static final String[] DFA8_transitionS = {
            "\11\13\1\15\1\14\2\13\1\14\22\13\1\15\1\13\1\11\4\13\1\12\31"+
            "\13\32\7\1\5\1\10\1\3\1\13\1\7\1\13\1\7\1\1\2\7\1\2\1\4\10\7"+
            "\1\6\13\7\uff85\13",
            "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\17\20\12\21\7\20"+
            "\32\21\1\16\1\20\1\uffff\1\20\1\21\1\20\32\21\uff85\20",
            "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\17\20\12\21\7\20"+
            "\32\21\1\22\1\20\1\uffff\1\20\1\21\1\20\32\21\uff85\20",
            "",
            "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\17\20\12\21\7\20"+
            "\32\21\1\uffff\1\20\1\uffff\1\20\1\21\1\20\10\21\1\24\21\21"+
            "\uff85\20",
            "",
            "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\17\20\12\21\7\20"+
            "\32\21\1\uffff\1\20\1\uffff\1\20\1\21\1\20\2\21\1\26\27\21\uff85"+
            "\20",
            "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\17\20\12\21\7\20"+
            "\32\21\1\uffff\1\20\1\uffff\1\20\1\21\1\20\32\21\uff85\20",
            "\1\20\4\uffff\1\20\24\uffff\1\20\1\uffff\1\20\34\uffff\3\20"+
            "\4\uffff\1\20\3\uffff\1\20\7\uffff\1\20\3\uffff\1\20\1\uffff"+
            "\1\20",
            "\11\31\2\33\2\31\1\33\22\31\1\33\1\31\1\32\70\31\1\33\1\30"+
            "\1\33\uffa2\31",
            "\11\35\1\37\1\uffff\2\35\1\37\22\35\1\37\6\35\1\36\63\35\1"+
            "\uffff\1\34\1\uffff\uffa2\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\17\20\12\21\7\20"+
            "\32\21\1\uffff\1\20\1\uffff\1\20\1\21\1\20\32\21\uff85\20",
            "",
            "",
            "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\17\20\12\21\7\20"+
            "\32\21\1\uffff\1\20\1\uffff\1\20\1\21\1\20\6\21\1\42\23\21\uff85"+
            "\20",
            "",
            "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\17\20\12\21\7\20"+
            "\32\21\1\uffff\1\20\1\uffff\1\20\1\21\1\20\13\21\1\43\16\21"+
            "\uff85\20",
            "",
            "\1\44\4\uffff\1\44\24\uffff\1\44\1\uffff\1\44\34\uffff\1\20"+
            "\1\44\1\20\4\uffff\1\44\3\uffff\1\44\7\uffff\1\44\3\uffff\1"+
            "\44\1\uffff\1\44",
            "\11\31\2\33\2\31\1\33\22\31\1\33\1\31\1\32\70\31\1\33\1\30"+
            "\1\33\uffa2\31",
            "",
            "",
            "\1\45\4\uffff\1\45\24\uffff\1\20\1\uffff\1\20\34\uffff\3\45"+
            "\4\uffff\1\45\3\uffff\1\45\7\uffff\1\45\3\uffff\1\45\1\uffff"+
            "\1\45",
            "\11\35\1\37\1\uffff\2\35\1\37\22\35\1\37\6\35\1\36\63\35\1"+
            "\uffff\1\34\1\uffff\uffa2\35",
            "",
            "",
            "",
            "",
            "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\14\20\1\50\2\20"+
            "\12\21\1\47\6\20\32\21\1\46\1\20\1\uffff\1\20\1\21\1\20\32\21"+
            "\uff85\20",
            "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\17\20\12\21\7\20"+
            "\32\21\1\51\1\20\1\uffff\1\20\1\21\1\20\32\21\uff85\20",
            "\11\31\2\33\2\31\1\33\22\31\1\33\1\31\1\32\70\31\1\33\1\30"+
            "\1\33\uffa2\31",
            "\11\35\1\37\1\uffff\2\35\1\37\22\35\1\37\6\35\1\36\63\35\1"+
            "\uffff\1\34\1\uffff\uffa2\35",
            "",
            "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\72\20\1\uffff\1"+
            "\20\1\uffff\uffa2\20",
            "\1\53",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | RULE_ID | RULE_WORD | RULE_STRING | RULE_TEXT | RULE_NL | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_2 = input.LA(1);

                        s = -1;
                        if ( (LA8_2=='[') ) {s = 18;}

                        else if ( ((LA8_2>='\u0000' && LA8_2<='\b')||(LA8_2>='\u000B' && LA8_2<='\f')||(LA8_2>='\u000E' && LA8_2<='\u001F')||(LA8_2>='!' && LA8_2<='/')||(LA8_2>=':' && LA8_2<='@')||LA8_2=='\\'||LA8_2=='^'||LA8_2=='`'||(LA8_2>='{' && LA8_2<='\uFFFF')) ) {s = 16;}

                        else if ( ((LA8_2>='0' && LA8_2<='9')||(LA8_2>='A' && LA8_2<='Z')||LA8_2=='_'||(LA8_2>='a' && LA8_2<='z')) ) {s = 17;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_7 = input.LA(1);

                        s = -1;
                        if ( ((LA8_7>='\u0000' && LA8_7<='\b')||(LA8_7>='\u000B' && LA8_7<='\f')||(LA8_7>='\u000E' && LA8_7<='\u001F')||(LA8_7>='!' && LA8_7<='/')||(LA8_7>=':' && LA8_7<='@')||LA8_7=='\\'||LA8_7=='^'||LA8_7=='`'||(LA8_7>='{' && LA8_7<='\uFFFF')) ) {s = 16;}

                        else if ( ((LA8_7>='0' && LA8_7<='9')||(LA8_7>='A' && LA8_7<='Z')||LA8_7=='_'||(LA8_7>='a' && LA8_7<='z')) ) {s = 17;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_34 = input.LA(1);

                        s = -1;
                        if ( (LA8_34=='[') ) {s = 38;}

                        else if ( (LA8_34==':') ) {s = 39;}

                        else if ( (LA8_34=='-') ) {s = 40;}

                        else if ( ((LA8_34>='\u0000' && LA8_34<='\b')||(LA8_34>='\u000B' && LA8_34<='\f')||(LA8_34>='\u000E' && LA8_34<='\u001F')||(LA8_34>='!' && LA8_34<=',')||(LA8_34>='.' && LA8_34<='/')||(LA8_34>=';' && LA8_34<='@')||LA8_34=='\\'||LA8_34=='^'||LA8_34=='`'||(LA8_34>='{' && LA8_34<='\uFFFF')) ) {s = 16;}

                        else if ( ((LA8_34>='0' && LA8_34<='9')||(LA8_34>='A' && LA8_34<='Z')||LA8_34=='_'||(LA8_34>='a' && LA8_34<='z')) ) {s = 17;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_9 = input.LA(1);

                        s = -1;
                        if ( (LA8_9=='\\') ) {s = 24;}

                        else if ( ((LA8_9>='\u0000' && LA8_9<='\b')||(LA8_9>='\u000B' && LA8_9<='\f')||(LA8_9>='\u000E' && LA8_9<='\u001F')||LA8_9=='!'||(LA8_9>='#' && LA8_9<='Z')||(LA8_9>='^' && LA8_9<='\uFFFF')) ) {s = 25;}

                        else if ( (LA8_9=='\"') ) {s = 26;}

                        else if ( ((LA8_9>='\t' && LA8_9<='\n')||LA8_9=='\r'||LA8_9==' '||LA8_9=='['||LA8_9==']') ) {s = 27;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_36 = input.LA(1);

                        s = -1;
                        if ( (LA8_36=='\"') ) {s = 26;}

                        else if ( (LA8_36=='\\') ) {s = 24;}

                        else if ( ((LA8_36>='\u0000' && LA8_36<='\b')||(LA8_36>='\u000B' && LA8_36<='\f')||(LA8_36>='\u000E' && LA8_36<='\u001F')||LA8_36=='!'||(LA8_36>='#' && LA8_36<='Z')||(LA8_36>='^' && LA8_36<='\uFFFF')) ) {s = 25;}

                        else if ( ((LA8_36>='\t' && LA8_36<='\n')||LA8_36=='\r'||LA8_36==' '||LA8_36=='['||LA8_36==']') ) {s = 27;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA8_29 = input.LA(1);

                        s = -1;
                        if ( (LA8_29=='\\') ) {s = 28;}

                        else if ( (LA8_29=='\'') ) {s = 30;}

                        else if ( ((LA8_29>='\u0000' && LA8_29<='\b')||(LA8_29>='\u000B' && LA8_29<='\f')||(LA8_29>='\u000E' && LA8_29<='\u001F')||(LA8_29>='!' && LA8_29<='&')||(LA8_29>='(' && LA8_29<='Z')||(LA8_29>='^' && LA8_29<='\uFFFF')) ) {s = 29;}

                        else if ( (LA8_29=='\t'||LA8_29=='\r'||LA8_29==' ') ) {s = 31;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA8_39 = input.LA(1);

                        s = -1;
                        if ( ((LA8_39>='\u0000' && LA8_39<='\b')||(LA8_39>='\u000B' && LA8_39<='\f')||(LA8_39>='\u000E' && LA8_39<='\u001F')||(LA8_39>='!' && LA8_39<='Z')||LA8_39=='\\'||(LA8_39>='^' && LA8_39<='\uFFFF')) ) {s = 16;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA8_1 = input.LA(1);

                        s = -1;
                        if ( (LA8_1=='[') ) {s = 14;}

                        else if ( ((LA8_1>='\u0000' && LA8_1<='\b')||(LA8_1>='\u000B' && LA8_1<='\f')||(LA8_1>='\u000E' && LA8_1<='\u001F')||(LA8_1>='!' && LA8_1<='/')||(LA8_1>=':' && LA8_1<='@')||LA8_1=='\\'||LA8_1=='^'||LA8_1=='`'||(LA8_1>='{' && LA8_1<='\uFFFF')) ) {s = 16;}

                        else if ( ((LA8_1>='0' && LA8_1<='9')||(LA8_1>='A' && LA8_1<='Z')||LA8_1=='_'||(LA8_1>='a' && LA8_1<='z')) ) {s = 17;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA8_25 = input.LA(1);

                        s = -1;
                        if ( (LA8_25=='\\') ) {s = 24;}

                        else if ( (LA8_25=='\"') ) {s = 26;}

                        else if ( ((LA8_25>='\u0000' && LA8_25<='\b')||(LA8_25>='\u000B' && LA8_25<='\f')||(LA8_25>='\u000E' && LA8_25<='\u001F')||LA8_25=='!'||(LA8_25>='#' && LA8_25<='Z')||(LA8_25>='^' && LA8_25<='\uFFFF')) ) {s = 25;}

                        else if ( ((LA8_25>='\t' && LA8_25<='\n')||LA8_25=='\r'||LA8_25==' '||LA8_25=='['||LA8_25==']') ) {s = 27;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA8_6 = input.LA(1);

                        s = -1;
                        if ( (LA8_6=='c') ) {s = 22;}

                        else if ( ((LA8_6>='\u0000' && LA8_6<='\b')||(LA8_6>='\u000B' && LA8_6<='\f')||(LA8_6>='\u000E' && LA8_6<='\u001F')||(LA8_6>='!' && LA8_6<='/')||(LA8_6>=':' && LA8_6<='@')||LA8_6=='\\'||LA8_6=='^'||LA8_6=='`'||(LA8_6>='{' && LA8_6<='\uFFFF')) ) {s = 16;}

                        else if ( ((LA8_6>='0' && LA8_6<='9')||(LA8_6>='A' && LA8_6<='Z')||LA8_6=='_'||(LA8_6>='a' && LA8_6<='b')||(LA8_6>='d' && LA8_6<='z')) ) {s = 17;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA8_37 = input.LA(1);

                        s = -1;
                        if ( (LA8_37=='\\') ) {s = 28;}

                        else if ( (LA8_37=='\'') ) {s = 30;}

                        else if ( ((LA8_37>='\u0000' && LA8_37<='\b')||(LA8_37>='\u000B' && LA8_37<='\f')||(LA8_37>='\u000E' && LA8_37<='\u001F')||(LA8_37>='!' && LA8_37<='&')||(LA8_37>='(' && LA8_37<='Z')||(LA8_37>='^' && LA8_37<='\uFFFF')) ) {s = 29;}

                        else if ( (LA8_37=='\t'||LA8_37=='\r'||LA8_37==' ') ) {s = 31;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA8_20 = input.LA(1);

                        s = -1;
                        if ( (LA8_20=='g') ) {s = 34;}

                        else if ( ((LA8_20>='\u0000' && LA8_20<='\b')||(LA8_20>='\u000B' && LA8_20<='\f')||(LA8_20>='\u000E' && LA8_20<='\u001F')||(LA8_20>='!' && LA8_20<='/')||(LA8_20>=':' && LA8_20<='@')||LA8_20=='\\'||LA8_20=='^'||LA8_20=='`'||(LA8_20>='{' && LA8_20<='\uFFFF')) ) {s = 16;}

                        else if ( ((LA8_20>='0' && LA8_20<='9')||(LA8_20>='A' && LA8_20<='Z')||LA8_20=='_'||(LA8_20>='a' && LA8_20<='f')||(LA8_20>='h' && LA8_20<='z')) ) {s = 17;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA8_17 = input.LA(1);

                        s = -1;
                        if ( ((LA8_17>='\u0000' && LA8_17<='\b')||(LA8_17>='\u000B' && LA8_17<='\f')||(LA8_17>='\u000E' && LA8_17<='\u001F')||(LA8_17>='!' && LA8_17<='/')||(LA8_17>=':' && LA8_17<='@')||LA8_17=='\\'||LA8_17=='^'||LA8_17=='`'||(LA8_17>='{' && LA8_17<='\uFFFF')) ) {s = 16;}

                        else if ( ((LA8_17>='0' && LA8_17<='9')||(LA8_17>='A' && LA8_17<='Z')||LA8_17=='_'||(LA8_17>='a' && LA8_17<='z')) ) {s = 17;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA8_10 = input.LA(1);

                        s = -1;
                        if ( (LA8_10=='\\') ) {s = 28;}

                        else if ( ((LA8_10>='\u0000' && LA8_10<='\b')||(LA8_10>='\u000B' && LA8_10<='\f')||(LA8_10>='\u000E' && LA8_10<='\u001F')||(LA8_10>='!' && LA8_10<='&')||(LA8_10>='(' && LA8_10<='Z')||(LA8_10>='^' && LA8_10<='\uFFFF')) ) {s = 29;}

                        else if ( (LA8_10=='\'') ) {s = 30;}

                        else if ( (LA8_10=='\t'||LA8_10=='\r'||LA8_10==' ') ) {s = 31;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA8_0 = input.LA(1);

                        s = -1;
                        if ( (LA8_0=='b') ) {s = 1;}

                        else if ( (LA8_0=='e') ) {s = 2;}

                        else if ( (LA8_0==']') ) {s = 3;}

                        else if ( (LA8_0=='f') ) {s = 4;}

                        else if ( (LA8_0=='[') ) {s = 5;}

                        else if ( (LA8_0=='o') ) {s = 6;}

                        else if ( ((LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||LA8_0=='a'||(LA8_0>='c' && LA8_0<='d')||(LA8_0>='g' && LA8_0<='n')||(LA8_0>='p' && LA8_0<='z')) ) {s = 7;}

                        else if ( (LA8_0=='\\') ) {s = 8;}

                        else if ( (LA8_0=='\"') ) {s = 9;}

                        else if ( (LA8_0=='\'') ) {s = 10;}

                        else if ( ((LA8_0>='\u0000' && LA8_0<='\b')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\u001F')||LA8_0=='!'||(LA8_0>='#' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='@')||LA8_0=='^'||LA8_0=='`'||(LA8_0>='{' && LA8_0<='\uFFFF')) ) {s = 11;}

                        else if ( (LA8_0=='\n'||LA8_0=='\r') ) {s = 12;}

                        else if ( (LA8_0=='\t'||LA8_0==' ') ) {s = 13;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA8_22 = input.LA(1);

                        s = -1;
                        if ( (LA8_22=='l') ) {s = 35;}

                        else if ( ((LA8_22>='\u0000' && LA8_22<='\b')||(LA8_22>='\u000B' && LA8_22<='\f')||(LA8_22>='\u000E' && LA8_22<='\u001F')||(LA8_22>='!' && LA8_22<='/')||(LA8_22>=':' && LA8_22<='@')||LA8_22=='\\'||LA8_22=='^'||LA8_22=='`'||(LA8_22>='{' && LA8_22<='\uFFFF')) ) {s = 16;}

                        else if ( ((LA8_22>='0' && LA8_22<='9')||(LA8_22>='A' && LA8_22<='Z')||LA8_22=='_'||(LA8_22>='a' && LA8_22<='k')||(LA8_22>='m' && LA8_22<='z')) ) {s = 17;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA8_4 = input.LA(1);

                        s = -1;
                        if ( (LA8_4=='i') ) {s = 20;}

                        else if ( ((LA8_4>='\u0000' && LA8_4<='\b')||(LA8_4>='\u000B' && LA8_4<='\f')||(LA8_4>='\u000E' && LA8_4<='\u001F')||(LA8_4>='!' && LA8_4<='/')||(LA8_4>=':' && LA8_4<='@')||LA8_4=='\\'||LA8_4=='^'||LA8_4=='`'||(LA8_4>='{' && LA8_4<='\uFFFF')) ) {s = 16;}

                        else if ( ((LA8_4>='0' && LA8_4<='9')||(LA8_4>='A' && LA8_4<='Z')||LA8_4=='_'||(LA8_4>='a' && LA8_4<='h')||(LA8_4>='j' && LA8_4<='z')) ) {s = 17;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA8_35 = input.LA(1);

                        s = -1;
                        if ( (LA8_35=='[') ) {s = 41;}

                        else if ( ((LA8_35>='\u0000' && LA8_35<='\b')||(LA8_35>='\u000B' && LA8_35<='\f')||(LA8_35>='\u000E' && LA8_35<='\u001F')||(LA8_35>='!' && LA8_35<='/')||(LA8_35>=':' && LA8_35<='@')||LA8_35=='\\'||LA8_35=='^'||LA8_35=='`'||(LA8_35>='{' && LA8_35<='\uFFFF')) ) {s = 16;}

                        else if ( ((LA8_35>='0' && LA8_35<='9')||(LA8_35>='A' && LA8_35<='Z')||LA8_35=='_'||(LA8_35>='a' && LA8_35<='z')) ) {s = 17;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}