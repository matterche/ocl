package org.eclipse.ocl.examples.xtext.completeocl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCompleteOCLLexer extends Lexer {
    public static final int T79=79;
    public static final int T14=14;
    public static final int T29=29;
    public static final int T36=36;
    public static final int T58=58;
    public static final int T70=70;
    public static final int T74=74;
    public static final int RULE_ML_SINGLE_QUOTED_STRING=8;
    public static final int T35=35;
    public static final int T85=85;
    public static final int T83=83;
    public static final int T61=61;
    public static final int T45=45;
    public static final int T20=20;
    public static final int T34=34;
    public static final int T64=64;
    public static final int T25=25;
    public static final int T86=86;
    public static final int T18=18;
    public static final int T37=37;
    public static final int T26=26;
    public static final int RULE_INT=5;
    public static final int T32=32;
    public static final int T81=81;
    public static final int T17=17;
    public static final int T51=51;
    public static final int RULE_SINGLE_QUOTED_STRING=4;
    public static final int T46=46;
    public static final int RULE_DOUBLE_QUOTED_STRING=7;
    public static final int T77=77;
    public static final int T16=16;
    public static final int T38=38;
    public static final int T41=41;
    public static final int T24=24;
    public static final int T19=19;
    public static final int T69=69;
    public static final int T39=39;
    public static final int T21=21;
    public static final int T62=62;
    public static final int T44=44;
    public static final int T55=55;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_ID=6;
    public static final int T84=84;
    public static final int T73=73;
    public static final int T68=68;
    public static final int T33=33;
    public static final int T22=22;
    public static final int T50=50;
    public static final int T78=78;
    public static final int T43=43;
    public static final int T23=23;
    public static final int T28=28;
    public static final int T42=42;
    public static final int T66=66;
    public static final int T40=40;
    public static final int T88=88;
    public static final int T71=71;
    public static final int T63=63;
    public static final int T57=57;
    public static final int T72=72;
    public static final int T65=65;
    public static final int T56=56;
    public static final int T87=87;
    public static final int T76=76;
    public static final int T80=80;
    public static final int T75=75;
    public static final int T59=59;
    public static final int RULE_WS=12;
    public static final int T48=48;
    public static final int T15=15;
    public static final int T54=54;
    public static final int EOF=-1;
    public static final int T67=67;
    public static final int T47=47;
    public static final int Tokens=89;
    public static final int T53=53;
    public static final int RULE_DOCUMENTATION=9;
    public static final int T60=60;
    public static final int RULE_ANY_OTHER=13;
    public static final int T31=31;
    public static final int T82=82;
    public static final int T49=49;
    public static final int RULE_SL_COMMENT=11;
    public static final int T27=27;
    public static final int T52=52;
    public static final int T30=30;
    public InternalCompleteOCLLexer() {;} 
    public InternalCompleteOCLLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g"; }

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:10:5: ( '^' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:10:7: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:11:5: ( '^^' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:11:7: '^^'
            {
            match("^^"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:12:5: ( 'body' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:12:7: 'body'
            {
            match("body"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:13:5: ( 'context' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:13:7: 'context'
            {
            match("context"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:14:5: ( 'def' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:14:7: 'def'
            {
            match("def"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:15:5: ( 'derive' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:15:7: 'derive'
            {
            match("derive"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:16:5: ( 'import' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:16:7: 'import'
            {
            match("import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:17:5: ( 'init' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:17:7: 'init'
            {
            match("init"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:18:5: ( 'inv' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:18:7: 'inv'
            {
            match("inv"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:19:5: ( 'Boolean' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:19:7: 'Boolean'
            {
            match("Boolean"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:20:5: ( 'Integer' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:20:7: 'Integer'
            {
            match("Integer"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:21:5: ( 'Real' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:21:7: 'Real'
            {
            match("Real"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:22:5: ( 'String' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:22:7: 'String'
            {
            match("String"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:23:5: ( 'UnlimitedNatural' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:23:7: 'UnlimitedNatural'
            {
            match("UnlimitedNatural"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:24:5: ( 'OclAny' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:24:7: 'OclAny'
            {
            match("OclAny"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:25:5: ( 'OclInvalid' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:25:7: 'OclInvalid'
            {
            match("OclInvalid"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:26:5: ( 'OclMessage' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:26:7: 'OclMessage'
            {
            match("OclMessage"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:27:5: ( 'OclState' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:27:7: 'OclState'
            {
            match("OclState"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:28:5: ( 'OclVoid' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:28:7: 'OclVoid'
            {
            match("OclVoid"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:29:5: ( ':' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:29:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:30:5: ( 'static' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:30:7: 'static'
            {
            match("static"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:31:5: ( '(' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:31:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:32:5: ( ',' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:32:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:33:5: ( ')' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:33:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:34:5: ( '=' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:34:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:35:5: ( 'package' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:35:7: 'package'
            {
            match("package"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:36:5: ( 'endpackage' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:36:7: 'endpackage'
            {
            match("endpackage"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:37:5: ( 'post' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:37:7: 'post'
            {
            match("post"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:38:5: ( 'pre' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:38:7: 'pre'
            {
            match("pre"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:39:5: ( '::' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:39:7: '::'
            {
            match("::"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:40:5: ( '@' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:40:7: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:41:5: ( '?' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:41:7: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:42:5: ( '.' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:42:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:43:5: ( 'e' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:43:7: 'e'
            {
            match('e'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:44:5: ( 'E' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:44:7: 'E'
            {
            match('E'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:45:5: ( '+' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:45:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:46:5: ( '-' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:46:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:47:5: ( 'der' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:47:7: 'der'
            {
            match("der"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:48:5: ( 'not' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:48:7: 'not'
            {
            match("not"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:49:5: ( '*' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:49:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:50:5: ( '/' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:50:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:51:5: ( '>' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:51:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:52:5: ( '<' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:52:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:53:5: ( '>=' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:53:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:54:5: ( '<=' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:54:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:55:5: ( '<>' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:55:7: '<>'
            {
            match("<>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:56:5: ( 'and' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:56:7: 'and'
            {
            match("and"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:57:5: ( 'or' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:57:7: 'or'
            {
            match("or"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:58:5: ( 'xor' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:58:7: 'xor'
            {
            match("xor"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:59:5: ( 'implies' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:59:7: 'implies'
            {
            match("implies"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:60:5: ( '->' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:60:7: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:61:5: ( 'Set' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:61:7: 'Set'
            {
            match("Set"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:62:5: ( 'Bag' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:62:7: 'Bag'
            {
            match("Bag"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:63:5: ( 'Sequence' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:63:7: 'Sequence'
            {
            match("Sequence"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:64:5: ( 'Collection' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:64:7: 'Collection'
            {
            match("Collection"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:65:5: ( 'OrderedSet' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:65:7: 'OrderedSet'
            {
            match("OrderedSet"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:66:5: ( 'Tuple' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:66:7: 'Tuple'
            {
            match("Tuple"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:67:5: ( '{' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:67:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:68:5: ( '}' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:68:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:69:5: ( '..' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:69:7: '..'
            {
            match(".."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:70:5: ( 'true' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:70:7: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:71:5: ( 'false' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:71:7: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:72:5: ( 'invalid' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:72:7: 'invalid'
            {
            match("invalid"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:73:5: ( 'null' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:73:7: 'null'
            {
            match("null"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:74:5: ( '[' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:74:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:75:5: ( ']' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:75:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public final void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:76:5: ( '|' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:76:7: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start T81
    public final void mT81() throws RecognitionException {
        try {
            int _type = T81;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:77:5: ( ';' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:77:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start T82
    public final void mT82() throws RecognitionException {
        try {
            int _type = T82;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:78:5: ( 'if' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:78:7: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T82

    // $ANTLR start T83
    public final void mT83() throws RecognitionException {
        try {
            int _type = T83;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:79:5: ( 'then' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:79:7: 'then'
            {
            match("then"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T83

    // $ANTLR start T84
    public final void mT84() throws RecognitionException {
        try {
            int _type = T84;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:80:5: ( 'else' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:80:7: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T84

    // $ANTLR start T85
    public final void mT85() throws RecognitionException {
        try {
            int _type = T85;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:81:5: ( 'endif' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:81:7: 'endif'
            {
            match("endif"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T85

    // $ANTLR start T86
    public final void mT86() throws RecognitionException {
        try {
            int _type = T86;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:82:5: ( 'let' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:82:7: 'let'
            {
            match("let"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T86

    // $ANTLR start T87
    public final void mT87() throws RecognitionException {
        try {
            int _type = T87;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:83:5: ( 'in' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:83:7: 'in'
            {
            match("in"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T87

    // $ANTLR start T88
    public final void mT88() throws RecognitionException {
        try {
            int _type = T88;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:84:5: ( 'self' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:84:7: 'self'
            {
            match("self"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T88

    // $ANTLR start RULE_DOUBLE_QUOTED_STRING
    public final void mRULE_DOUBLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_QUOTED_STRING;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6384:27: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6384:29: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6384:33: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFE')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6384:34: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6384:79: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_DOUBLE_QUOTED_STRING

    // $ANTLR start RULE_SINGLE_QUOTED_STRING
    public final void mRULE_SINGLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_SINGLE_QUOTED_STRING;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6386:27: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6386:29: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6386:34: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFE')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6386:35: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6386:80: ~ ( ( '\\\\' | '\\'' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\''); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SINGLE_QUOTED_STRING

    // $ANTLR start RULE_ML_SINGLE_QUOTED_STRING
    public final void mRULE_ML_SINGLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_ML_SINGLE_QUOTED_STRING;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6388:30: ( '/\\'' ( options {greedy=false; } : . )* '\\'/' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6388:32: '/\\'' ( options {greedy=false; } : . )* '\\'/'
            {
            match("/\'"); 

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6388:38: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\'') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFE')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='\uFFFE')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6388:66: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match("\'/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_SINGLE_QUOTED_STRING

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6390:9: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '_' RULE_SINGLE_QUOTED_STRING ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6390:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '_' RULE_SINGLE_QUOTED_STRING )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6390:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '_' RULE_SINGLE_QUOTED_STRING )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='_') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='\'') ) {
                    alt5=2;
                }
                else {
                    alt5=1;}
            }
            else if ( ((LA5_0>='A' && LA5_0<='Z')||(LA5_0>='a' && LA5_0<='z')) ) {
                alt5=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("6390:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '_' RULE_SINGLE_QUOTED_STRING )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6390:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6390:36: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6390:70: '_' RULE_SINGLE_QUOTED_STRING
                    {
                    match('_'); 
                    mRULE_SINGLE_QUOTED_STRING(); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6392:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6392:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6392:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6392:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_DOCUMENTATION
    public final void mRULE_DOCUMENTATION() throws RecognitionException {
        try {
            int _type = RULE_DOCUMENTATION;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6394:20: ( '/**' ( options {greedy=false; } : . )* '**/' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6394:22: '/**' ( options {greedy=false; } : . )* '**/'
            {
            match("/**"); 

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6394:28: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='*') ) {
                        int LA7_3 = input.LA(3);

                        if ( (LA7_3=='/') ) {
                            alt7=2;
                        }
                        else if ( ((LA7_3>='\u0000' && LA7_3<='.')||(LA7_3>='0' && LA7_3<='\uFFFE')) ) {
                            alt7=1;
                        }


                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<=')')||(LA7_1>='+' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6394:56: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("**/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_DOCUMENTATION

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6396:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6396:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFE') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6396:31: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFE')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6396:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6398:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6398:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6398:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6398:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6398:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6398:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6398:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6398:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6400:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6400:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6400:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6402:16: ( . )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6402:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:8: ( T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ML_SINGLE_QUOTED_STRING | RULE_ID | RULE_INT | RULE_DOCUMENTATION | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=85;
        int LA13_0 = input.LA(1);

        if ( (LA13_0=='^') ) {
            alt13 = mTokensHelper001();
        }
        else if ( (LA13_0=='b') ) {
            alt13 = mTokensHelper002();
        }
        else if ( (LA13_0=='c') ) {
            alt13 = mTokensHelper003();
        }
        else if ( (LA13_0=='d') ) {
            alt13 = mTokensHelper004();
        }
        else if ( (LA13_0=='i') ) {
            alt13 = mTokensHelper005();
        }
        else if ( (LA13_0=='B') ) {
            alt13 = mTokensHelper006();
        }
        else if ( (LA13_0=='I') ) {
            alt13 = mTokensHelper007();
        }
        else if ( (LA13_0=='R') ) {
            alt13 = mTokensHelper008();
        }
        else if ( (LA13_0=='S') ) {
            alt13 = mTokensHelper009();
        }
        else if ( (LA13_0=='U') ) {
            alt13 = mTokensHelper010();
        }
        else if ( (LA13_0=='O') ) {
            alt13 = mTokensHelper011();
        }
        else if ( (LA13_0==':') ) {
            alt13 = mTokensHelper012();
        }
        else if ( (LA13_0=='s') ) {
            alt13 = mTokensHelper013();
        }
        else if ( (LA13_0=='(') ) {
            alt13 = mTokensHelper014();
        }
        else if ( (LA13_0==',') ) {
            alt13 = mTokensHelper015();
        }
        else if ( (LA13_0==')') ) {
            alt13 = mTokensHelper016();
        }
        else if ( (LA13_0=='=') ) {
            alt13 = mTokensHelper017();
        }
        else if ( (LA13_0=='p') ) {
            alt13 = mTokensHelper018();
        }
        else if ( (LA13_0=='e') ) {
            alt13 = mTokensHelper019();
        }
        else if ( (LA13_0=='@') ) {
            alt13 = mTokensHelper020();
        }
        else if ( (LA13_0=='?') ) {
            alt13 = mTokensHelper021();
        }
        else if ( (LA13_0=='.') ) {
            alt13 = mTokensHelper022();
        }
        else if ( (LA13_0=='E') ) {
            alt13 = mTokensHelper023();
        }
        else if ( (LA13_0=='+') ) {
            alt13 = mTokensHelper024();
        }
        else if ( (LA13_0=='-') ) {
            alt13 = mTokensHelper025();
        }
        else if ( (LA13_0=='n') ) {
            alt13 = mTokensHelper026();
        }
        else if ( (LA13_0=='*') ) {
            alt13 = mTokensHelper027();
        }
        else if ( (LA13_0=='/') ) {
            alt13 = mTokensHelper028();
        }
        else if ( (LA13_0=='>') ) {
            alt13 = mTokensHelper029();
        }
        else if ( (LA13_0=='<') ) {
            alt13 = mTokensHelper030();
        }
        else if ( (LA13_0=='a') ) {
            alt13 = mTokensHelper031();
        }
        else if ( (LA13_0=='o') ) {
            alt13 = mTokensHelper032();
        }
        else if ( (LA13_0=='x') ) {
            alt13 = mTokensHelper033();
        }
        else if ( (LA13_0=='C') ) {
            alt13 = mTokensHelper034();
        }
        else if ( (LA13_0=='T') ) {
            alt13 = mTokensHelper035();
        }
        else if ( (LA13_0=='{') ) {
            alt13 = mTokensHelper036();
        }
        else if ( (LA13_0=='}') ) {
            alt13 = mTokensHelper037();
        }
        else if ( (LA13_0=='t') ) {
            alt13 = mTokensHelper038();
        }
        else if ( (LA13_0=='f') ) {
            alt13 = mTokensHelper039();
        }
        else if ( (LA13_0=='[') ) {
            alt13 = mTokensHelper040();
        }
        else if ( (LA13_0==']') ) {
            alt13 = mTokensHelper041();
        }
        else if ( (LA13_0=='|') ) {
            alt13 = mTokensHelper042();
        }
        else if ( (LA13_0==';') ) {
            alt13 = mTokensHelper043();
        }
        else if ( (LA13_0=='l') ) {
            alt13 = mTokensHelper044();
        }
        else if ( (LA13_0=='\"') ) {
            alt13 = mTokensHelper045();
        }
        else if ( (LA13_0=='\'') ) {
            alt13 = mTokensHelper046();
        }
        else if ( (LA13_0=='_') ) {
            alt13 = mTokensHelper047();
        }
        else if ( (LA13_0=='A'||LA13_0=='D'||(LA13_0>='F' && LA13_0<='H')||(LA13_0>='J' && LA13_0<='N')||(LA13_0>='P' && LA13_0<='Q')||(LA13_0>='V' && LA13_0<='Z')||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='k')||LA13_0=='m'||(LA13_0>='q' && LA13_0<='r')||(LA13_0>='u' && LA13_0<='w')||(LA13_0>='y' && LA13_0<='z')) ) {
            alt13 = mTokensHelper048();
        }
        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {
            alt13 = mTokensHelper049();
        }
        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
            alt13 = mTokensHelper050();
        }
        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFE')) ) {
            alt13 = mTokensHelper051();
        }
        else {
            alt13 = mTokensHelper052();
        }
        switch (alt13) {
            case 1 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:10: T14
                {
                mT14(); 

                }
                break;
            case 2 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:14: T15
                {
                mT15(); 

                }
                break;
            case 3 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:18: T16
                {
                mT16(); 

                }
                break;
            case 4 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:22: T17
                {
                mT17(); 

                }
                break;
            case 5 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:26: T18
                {
                mT18(); 

                }
                break;
            case 6 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:30: T19
                {
                mT19(); 

                }
                break;
            case 7 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:34: T20
                {
                mT20(); 

                }
                break;
            case 8 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:38: T21
                {
                mT21(); 

                }
                break;
            case 9 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:42: T22
                {
                mT22(); 

                }
                break;
            case 10 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:46: T23
                {
                mT23(); 

                }
                break;
            case 11 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:50: T24
                {
                mT24(); 

                }
                break;
            case 12 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:54: T25
                {
                mT25(); 

                }
                break;
            case 13 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:58: T26
                {
                mT26(); 

                }
                break;
            case 14 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:62: T27
                {
                mT27(); 

                }
                break;
            case 15 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:66: T28
                {
                mT28(); 

                }
                break;
            case 16 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:70: T29
                {
                mT29(); 

                }
                break;
            case 17 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:74: T30
                {
                mT30(); 

                }
                break;
            case 18 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:78: T31
                {
                mT31(); 

                }
                break;
            case 19 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:82: T32
                {
                mT32(); 

                }
                break;
            case 20 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:86: T33
                {
                mT33(); 

                }
                break;
            case 21 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:90: T34
                {
                mT34(); 

                }
                break;
            case 22 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:94: T35
                {
                mT35(); 

                }
                break;
            case 23 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:98: T36
                {
                mT36(); 

                }
                break;
            case 24 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:102: T37
                {
                mT37(); 

                }
                break;
            case 25 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:106: T38
                {
                mT38(); 

                }
                break;
            case 26 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:110: T39
                {
                mT39(); 

                }
                break;
            case 27 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:114: T40
                {
                mT40(); 

                }
                break;
            case 28 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:118: T41
                {
                mT41(); 

                }
                break;
            case 29 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:122: T42
                {
                mT42(); 

                }
                break;
            case 30 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:126: T43
                {
                mT43(); 

                }
                break;
            case 31 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:130: T44
                {
                mT44(); 

                }
                break;
            case 32 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:134: T45
                {
                mT45(); 

                }
                break;
            case 33 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:138: T46
                {
                mT46(); 

                }
                break;
            case 34 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:142: T47
                {
                mT47(); 

                }
                break;
            case 35 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:146: T48
                {
                mT48(); 

                }
                break;
            case 36 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:150: T49
                {
                mT49(); 

                }
                break;
            case 37 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:154: T50
                {
                mT50(); 

                }
                break;
            case 38 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:158: T51
                {
                mT51(); 

                }
                break;
            case 39 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:162: T52
                {
                mT52(); 

                }
                break;
            case 40 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:166: T53
                {
                mT53(); 

                }
                break;
            case 41 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:170: T54
                {
                mT54(); 

                }
                break;
            case 42 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:174: T55
                {
                mT55(); 

                }
                break;
            case 43 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:178: T56
                {
                mT56(); 

                }
                break;
            case 44 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:182: T57
                {
                mT57(); 

                }
                break;
            case 45 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:186: T58
                {
                mT58(); 

                }
                break;
            case 46 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:190: T59
                {
                mT59(); 

                }
                break;
            case 47 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:194: T60
                {
                mT60(); 

                }
                break;
            case 48 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:198: T61
                {
                mT61(); 

                }
                break;
            case 49 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:202: T62
                {
                mT62(); 

                }
                break;
            case 50 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:206: T63
                {
                mT63(); 

                }
                break;
            case 51 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:210: T64
                {
                mT64(); 

                }
                break;
            case 52 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:214: T65
                {
                mT65(); 

                }
                break;
            case 53 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:218: T66
                {
                mT66(); 

                }
                break;
            case 54 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:222: T67
                {
                mT67(); 

                }
                break;
            case 55 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:226: T68
                {
                mT68(); 

                }
                break;
            case 56 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:230: T69
                {
                mT69(); 

                }
                break;
            case 57 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:234: T70
                {
                mT70(); 

                }
                break;
            case 58 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:238: T71
                {
                mT71(); 

                }
                break;
            case 59 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:242: T72
                {
                mT72(); 

                }
                break;
            case 60 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:246: T73
                {
                mT73(); 

                }
                break;
            case 61 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:250: T74
                {
                mT74(); 

                }
                break;
            case 62 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:254: T75
                {
                mT75(); 

                }
                break;
            case 63 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:258: T76
                {
                mT76(); 

                }
                break;
            case 64 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:262: T77
                {
                mT77(); 

                }
                break;
            case 65 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:266: T78
                {
                mT78(); 

                }
                break;
            case 66 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:270: T79
                {
                mT79(); 

                }
                break;
            case 67 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:274: T80
                {
                mT80(); 

                }
                break;
            case 68 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:278: T81
                {
                mT81(); 

                }
                break;
            case 69 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:282: T82
                {
                mT82(); 

                }
                break;
            case 70 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:286: T83
                {
                mT83(); 

                }
                break;
            case 71 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:290: T84
                {
                mT84(); 

                }
                break;
            case 72 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:294: T85
                {
                mT85(); 

                }
                break;
            case 73 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:298: T86
                {
                mT86(); 

                }
                break;
            case 74 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:302: T87
                {
                mT87(); 

                }
                break;
            case 75 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:306: T88
                {
                mT88(); 

                }
                break;
            case 76 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:310: RULE_DOUBLE_QUOTED_STRING
                {
                mRULE_DOUBLE_QUOTED_STRING(); 

                }
                break;
            case 77 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:336: RULE_SINGLE_QUOTED_STRING
                {
                mRULE_SINGLE_QUOTED_STRING(); 

                }
                break;
            case 78 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:362: RULE_ML_SINGLE_QUOTED_STRING
                {
                mRULE_ML_SINGLE_QUOTED_STRING(); 

                }
                break;
            case 79 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:391: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 80 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:399: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 81 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:408: RULE_DOCUMENTATION
                {
                mRULE_DOCUMENTATION(); 

                }
                break;
            case 82 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:427: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 83 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:443: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 84 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:459: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 85 :
                // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1:467: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }
    private int mTokensHelper001() throws RecognitionException {
        int LA13_1 = input.LA(2);

        if ( (LA13_1=='^') ) {
            return 2;
        }
        else {
            return 1;}
    }

    private int mTokensHelper002() throws RecognitionException {
        int LA13_2 = input.LA(2);

        if ( (LA13_2=='o') ) {
            int LA13_54 = input.LA(3);

            if ( (LA13_54=='d') ) {
                int LA13_123 = input.LA(4);

                if ( (LA13_123=='y') ) {
                    int LA13_162 = input.LA(5);

                    if ( ((LA13_162>='0' && LA13_162<='9')||(LA13_162>='A' && LA13_162<='Z')||LA13_162=='_'||(LA13_162>='a' && LA13_162<='z')) ) {
                        return 79;
                    }
                    else {
                        return 3;}
                }
                else {
                    return 79;}
            }
            else {
                return 79;}
        }
        else {
            return 79;}
    }

    private int mTokensHelper003() throws RecognitionException {
        int LA13_3 = input.LA(2);

        if ( (LA13_3=='o') ) {
            int LA13_56 = input.LA(3);

            if ( (LA13_56=='n') ) {
                int LA13_124 = input.LA(4);

                if ( (LA13_124=='t') ) {
                    int LA13_163 = input.LA(5);

                    if ( (LA13_163=='e') ) {
                        int LA13_205 = input.LA(6);

                        if ( (LA13_205=='x') ) {
                            int LA13_236 = input.LA(7);

                            if ( (LA13_236=='t') ) {
                                int LA13_259 = input.LA(8);

                                if ( ((LA13_259>='0' && LA13_259<='9')||(LA13_259>='A' && LA13_259<='Z')||LA13_259=='_'||(LA13_259>='a' && LA13_259<='z')) ) {
                                    return 79;
                                }
                                else {
                                    return 4;}
                            }
                            else {
                                return 79;}
                        }
                        else {
                            return 79;}
                    }
                    else {
                        return 79;}
                }
                else {
                    return 79;}
            }
            else {
                return 79;}
        }
        else {
            return 79;}
    }

    private int mTokensHelper004() throws RecognitionException {
        int LA13_4 = input.LA(2);

        if ( (LA13_4=='e') ) {
            switch ( input.LA(3) ) {
            case 'r':
                {
                switch ( input.LA(4) ) {
                case 'i':
                    {
                    int LA13_164 = input.LA(5);

                    if ( (LA13_164=='v') ) {
                        int LA13_206 = input.LA(6);

                        if ( (LA13_206=='e') ) {
                            int LA13_237 = input.LA(7);

                            if ( ((LA13_237>='0' && LA13_237<='9')||(LA13_237>='A' && LA13_237<='Z')||LA13_237=='_'||(LA13_237>='a' && LA13_237<='z')) ) {
                                return 79;
                            }
                            else {
                                return 6;}
                        }
                        else {
                            return 79;}
                    }
                    else {
                        return 79;}
                    }
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
                case 'f':
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
                    return 79;
                    }
                default:
                    return 38;}

                }
            case 'f':
                {
                int LA13_126 = input.LA(4);

                if ( ((LA13_126>='0' && LA13_126<='9')||(LA13_126>='A' && LA13_126<='Z')||LA13_126=='_'||(LA13_126>='a' && LA13_126<='z')) ) {
                    return 79;
                }
                else {
                    return 5;}
                }
            default:
                return 79;}

        }
        else {
            return 79;}
    }

    private int mTokensHelper005() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'n':
            {
            switch ( input.LA(3) ) {
            case 'i':
                {
                int LA13_127 = input.LA(4);

                if ( (LA13_127=='t') ) {
                    int LA13_167 = input.LA(5);

                    if ( ((LA13_167>='0' && LA13_167<='9')||(LA13_167>='A' && LA13_167<='Z')||LA13_167=='_'||(LA13_167>='a' && LA13_167<='z')) ) {
                        return 79;
                    }
                    else {
                        return 8;}
                }
                else {
                    return 79;}
                }
            case 'v':
                {
                switch ( input.LA(4) ) {
                case 'a':
                    {
                    int LA13_168 = input.LA(5);

                    if ( (LA13_168=='l') ) {
                        int LA13_208 = input.LA(6);

                        if ( (LA13_208=='i') ) {
                            int LA13_238 = input.LA(7);

                            if ( (LA13_238=='d') ) {
                                int LA13_261 = input.LA(8);

                                if ( ((LA13_261>='0' && LA13_261<='9')||(LA13_261>='A' && LA13_261<='Z')||LA13_261=='_'||(LA13_261>='a' && LA13_261<='z')) ) {
                                    return 79;
                                }
                                else {
                                    return 63;}
                            }
                            else {
                                return 79;}
                        }
                        else {
                            return 79;}
                    }
                    else {
                        return 79;}
                    }
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
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
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
                    return 79;
                    }
                default:
                    return 9;}

                }
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
            case 'f':
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
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                return 79;
                }
            default:
                return 74;}

            }
        case 'f':
            {
            int LA13_59 = input.LA(3);

            if ( ((LA13_59>='0' && LA13_59<='9')||(LA13_59>='A' && LA13_59<='Z')||LA13_59=='_'||(LA13_59>='a' && LA13_59<='z')) ) {
                return 79;
            }
            else {
                return 69;}
            }
        case 'm':
            {
            int LA13_60 = input.LA(3);

            if ( (LA13_60=='p') ) {
                switch ( input.LA(4) ) {
                case 'l':
                    {
                    int LA13_170 = input.LA(5);

                    if ( (LA13_170=='i') ) {
                        int LA13_209 = input.LA(6);

                        if ( (LA13_209=='e') ) {
                            int LA13_239 = input.LA(7);

                            if ( (LA13_239=='s') ) {
                                int LA13_262 = input.LA(8);

                                if ( ((LA13_262>='0' && LA13_262<='9')||(LA13_262>='A' && LA13_262<='Z')||LA13_262=='_'||(LA13_262>='a' && LA13_262<='z')) ) {
                                    return 79;
                                }
                                else {
                                    return 50;}
                            }
                            else {
                                return 79;}
                        }
                        else {
                            return 79;}
                    }
                    else {
                        return 79;}
                    }
                case 'o':
                    {
                    int LA13_171 = input.LA(5);

                    if ( (LA13_171=='r') ) {
                        int LA13_210 = input.LA(6);

                        if ( (LA13_210=='t') ) {
                            int LA13_240 = input.LA(7);

                            if ( ((LA13_240>='0' && LA13_240<='9')||(LA13_240>='A' && LA13_240<='Z')||LA13_240=='_'||(LA13_240>='a' && LA13_240<='z')) ) {
                                return 79;
                            }
                            else {
                                return 7;}
                        }
                        else {
                            return 79;}
                    }
                    else {
                        return 79;}
                    }
                default:
                    return 79;}

            }
            else {
                return 79;}
            }
        default:
            return 79;}

    }

    private int mTokensHelper006() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'a':
            {
            int LA13_61 = input.LA(3);

            if ( (LA13_61=='g') ) {
                int LA13_132 = input.LA(4);

                if ( ((LA13_132>='0' && LA13_132<='9')||(LA13_132>='A' && LA13_132<='Z')||LA13_132=='_'||(LA13_132>='a' && LA13_132<='z')) ) {
                    return 79;
                }
                else {
                    return 53;}
            }
            else {
                return 79;}
            }
        case 'o':
            {
            int LA13_62 = input.LA(3);

            if ( (LA13_62=='o') ) {
                int LA13_133 = input.LA(4);

                if ( (LA13_133=='l') ) {
                    int LA13_173 = input.LA(5);

                    if ( (LA13_173=='e') ) {
                        int LA13_211 = input.LA(6);

                        if ( (LA13_211=='a') ) {
                            int LA13_241 = input.LA(7);

                            if ( (LA13_241=='n') ) {
                                int LA13_264 = input.LA(8);

                                if ( ((LA13_264>='0' && LA13_264<='9')||(LA13_264>='A' && LA13_264<='Z')||LA13_264=='_'||(LA13_264>='a' && LA13_264<='z')) ) {
                                    return 79;
                                }
                                else {
                                    return 10;}
                            }
                            else {
                                return 79;}
                        }
                        else {
                            return 79;}
                    }
                    else {
                        return 79;}
                }
                else {
                    return 79;}
            }
            else {
                return 79;}
            }
        default:
            return 79;}

    }

    private int mTokensHelper007() throws RecognitionException {
        int LA13_7 = input.LA(2);

        if ( (LA13_7=='n') ) {
            int LA13_63 = input.LA(3);

            if ( (LA13_63=='t') ) {
                int LA13_134 = input.LA(4);

                if ( (LA13_134=='e') ) {
                    int LA13_174 = input.LA(5);

                    if ( (LA13_174=='g') ) {
                        int LA13_212 = input.LA(6);

                        if ( (LA13_212=='e') ) {
                            int LA13_242 = input.LA(7);

                            if ( (LA13_242=='r') ) {
                                int LA13_265 = input.LA(8);

                                if ( ((LA13_265>='0' && LA13_265<='9')||(LA13_265>='A' && LA13_265<='Z')||LA13_265=='_'||(LA13_265>='a' && LA13_265<='z')) ) {
                                    return 79;
                                }
                                else {
                                    return 11;}
                            }
                            else {
                                return 79;}
                        }
                        else {
                            return 79;}
                    }
                    else {
                        return 79;}
                }
                else {
                    return 79;}
            }
            else {
                return 79;}
        }
        else {
            return 79;}
    }

    private int mTokensHelper008() throws RecognitionException {
        int LA13_8 = input.LA(2);

        if ( (LA13_8=='e') ) {
            int LA13_64 = input.LA(3);

            if ( (LA13_64=='a') ) {
                int LA13_135 = input.LA(4);

                if ( (LA13_135=='l') ) {
                    int LA13_175 = input.LA(5);

                    if ( ((LA13_175>='0' && LA13_175<='9')||(LA13_175>='A' && LA13_175<='Z')||LA13_175=='_'||(LA13_175>='a' && LA13_175<='z')) ) {
                        return 79;
                    }
                    else {
                        return 12;}
                }
                else {
                    return 79;}
            }
            else {
                return 79;}
        }
        else {
            return 79;}
    }

    private int mTokensHelper009() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'e':
            {
            switch ( input.LA(3) ) {
            case 't':
                {
                int LA13_136 = input.LA(4);

                if ( ((LA13_136>='0' && LA13_136<='9')||(LA13_136>='A' && LA13_136<='Z')||LA13_136=='_'||(LA13_136>='a' && LA13_136<='z')) ) {
                    return 79;
                }
                else {
                    return 52;}
                }
            case 'q':
                {
                int LA13_137 = input.LA(4);

                if ( (LA13_137=='u') ) {
                    int LA13_177 = input.LA(5);

                    if ( (LA13_177=='e') ) {
                        int LA13_214 = input.LA(6);

                        if ( (LA13_214=='n') ) {
                            int LA13_243 = input.LA(7);

                            if ( (LA13_243=='c') ) {
                                int LA13_266 = input.LA(8);

                                if ( (LA13_266=='e') ) {
                                    int LA13_284 = input.LA(9);

                                    if ( ((LA13_284>='0' && LA13_284<='9')||(LA13_284>='A' && LA13_284<='Z')||LA13_284=='_'||(LA13_284>='a' && LA13_284<='z')) ) {
                                        return 79;
                                    }
                                    else {
                                        return 54;}
                                }
                                else {
                                    return 79;}
                            }
                            else {
                                return 79;}
                        }
                        else {
                            return 79;}
                    }
                    else {
                        return 79;}
                }
                else {
                    return 79;}
                }
            default:
                return 79;}

            }
        case 't':
            {
            int LA13_66 = input.LA(3);

            if ( (LA13_66=='r') ) {
                int LA13_138 = input.LA(4);

                if ( (LA13_138=='i') ) {
                    int LA13_178 = input.LA(5);

                    if ( (LA13_178=='n') ) {
                        int LA13_215 = input.LA(6);

                        if ( (LA13_215=='g') ) {
                            int LA13_244 = input.LA(7);

                            if ( ((LA13_244>='0' && LA13_244<='9')||(LA13_244>='A' && LA13_244<='Z')||LA13_244=='_'||(LA13_244>='a' && LA13_244<='z')) ) {
                                return 79;
                            }
                            else {
                                return 13;}
                        }
                        else {
                            return 79;}
                    }
                    else {
                        return 79;}
                }
                else {
                    return 79;}
            }
            else {
                return 79;}
            }
        default:
            return 79;}

    }

    private int mTokensHelper010() throws RecognitionException {
        int LA13_10 = input.LA(2);

        if ( (LA13_10=='n') ) {
            int LA13_67 = input.LA(3);

            if ( (LA13_67=='l') ) {
                int LA13_139 = input.LA(4);

                if ( (LA13_139=='i') ) {
                    int LA13_179 = input.LA(5);

                    if ( (LA13_179=='m') ) {
                        int LA13_216 = input.LA(6);

                        if ( (LA13_216=='i') ) {
                            int LA13_245 = input.LA(7);

                            if ( (LA13_245=='t') ) {
                                int LA13_268 = input.LA(8);

                                if ( (LA13_268=='e') ) {
                                    int LA13_285 = input.LA(9);

                                    if ( (LA13_285=='d') ) {
                                        int LA13_295 = input.LA(10);

                                        if ( (LA13_295=='N') ) {
                                            int LA13_302 = input.LA(11);

                                            if ( (LA13_302=='a') ) {
                                                int LA13_308 = input.LA(12);

                                                if ( (LA13_308=='t') ) {
                                                    int LA13_314 = input.LA(13);

                                                    if ( (LA13_314=='u') ) {
                                                        int LA13_315 = input.LA(14);

                                                        if ( (LA13_315=='r') ) {
                                                            int LA13_316 = input.LA(15);

                                                            if ( (LA13_316=='a') ) {
                                                                int LA13_317 = input.LA(16);

                                                                if ( (LA13_317=='l') ) {
                                                                    int LA13_318 = input.LA(17);

                                                                    if ( ((LA13_318>='0' && LA13_318<='9')||(LA13_318>='A' && LA13_318<='Z')||LA13_318=='_'||(LA13_318>='a' && LA13_318<='z')) ) {
                                                                        return 79;
                                                                    }
                                                                    else {
                                                                        return 14;}
                                                                }
                                                                else {
                                                                    return 79;}
                                                            }
                                                            else {
                                                                return 79;}
                                                        }
                                                        else {
                                                            return 79;}
                                                    }
                                                    else {
                                                        return 79;}
                                                }
                                                else {
                                                    return 79;}
                                            }
                                            else {
                                                return 79;}
                                        }
                                        else {
                                            return 79;}
                                    }
                                    else {
                                        return 79;}
                                }
                                else {
                                    return 79;}
                            }
                            else {
                                return 79;}
                        }
                        else {
                            return 79;}
                    }
                    else {
                        return 79;}
                }
                else {
                    return 79;}
            }
            else {
                return 79;}
        }
        else {
            return 79;}
    }

    private int mTokensHelper011() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'c':
            {
            int LA13_68 = input.LA(3);

            if ( (LA13_68=='l') ) {
                switch ( input.LA(4) ) {
                case 'A':
                    {
                    int LA13_180 = input.LA(5);

                    if ( (LA13_180=='n') ) {
                        int LA13_217 = input.LA(6);

                        if ( (LA13_217=='y') ) {
                            int LA13_246 = input.LA(7);

                            if ( ((LA13_246>='0' && LA13_246<='9')||(LA13_246>='A' && LA13_246<='Z')||LA13_246=='_'||(LA13_246>='a' && LA13_246<='z')) ) {
                                return 79;
                            }
                            else {
                                return 15;}
                        }
                        else {
                            return 79;}
                    }
                    else {
                        return 79;}
                    }
                case 'I':
                    {
                    int LA13_181 = input.LA(5);

                    if ( (LA13_181=='n') ) {
                        int LA13_218 = input.LA(6);

                        if ( (LA13_218=='v') ) {
                            int LA13_247 = input.LA(7);

                            if ( (LA13_247=='a') ) {
                                int LA13_270 = input.LA(8);

                                if ( (LA13_270=='l') ) {
                                    int LA13_286 = input.LA(9);

                                    if ( (LA13_286=='i') ) {
                                        int LA13_296 = input.LA(10);

                                        if ( (LA13_296=='d') ) {
                                            int LA13_303 = input.LA(11);

                                            if ( ((LA13_303>='0' && LA13_303<='9')||(LA13_303>='A' && LA13_303<='Z')||LA13_303=='_'||(LA13_303>='a' && LA13_303<='z')) ) {
                                                return 79;
                                            }
                                            else {
                                                return 16;}
                                        }
                                        else {
                                            return 79;}
                                    }
                                    else {
                                        return 79;}
                                }
                                else {
                                    return 79;}
                            }
                            else {
                                return 79;}
                        }
                        else {
                            return 79;}
                    }
                    else {
                        return 79;}
                    }
                case 'V':
                    {
                    int LA13_182 = input.LA(5);

                    if ( (LA13_182=='o') ) {
                        int LA13_219 = input.LA(6);

                        if ( (LA13_219=='i') ) {
                            int LA13_248 = input.LA(7);

                            if ( (LA13_248=='d') ) {
                                int LA13_271 = input.LA(8);

                                if ( ((LA13_271>='0' && LA13_271<='9')||(LA13_271>='A' && LA13_271<='Z')||LA13_271=='_'||(LA13_271>='a' && LA13_271<='z')) ) {
                                    return 79;
                                }
                                else {
                                    return 19;}
                            }
                            else {
                                return 79;}
                        }
                        else {
                            return 79;}
                    }
                    else {
                        return 79;}
                    }
                case 'M':
                    {
                    int LA13_183 = input.LA(5);

                    if ( (LA13_183=='e') ) {
                        int LA13_220 = input.LA(6);

                        if ( (LA13_220=='s') ) {
                            int LA13_249 = input.LA(7);

                            if ( (LA13_249=='s') ) {
                                int LA13_272 = input.LA(8);

                                if ( (LA13_272=='a') ) {
                                    int LA13_288 = input.LA(9);

                                    if ( (LA13_288=='g') ) {
                                        int LA13_297 = input.LA(10);

                                        if ( (LA13_297=='e') ) {
                                            int LA13_304 = input.LA(11);

                                            if ( ((LA13_304>='0' && LA13_304<='9')||(LA13_304>='A' && LA13_304<='Z')||LA13_304=='_'||(LA13_304>='a' && LA13_304<='z')) ) {
                                                return 79;
                                            }
                                            else {
                                                return 17;}
                                        }
                                        else {
                                            return 79;}
                                    }
                                    else {
                                        return 79;}
                                }
                                else {
                                    return 79;}
                            }
                            else {
                                return 79;}
                        }
                        else {
                            return 79;}
                    }
                    else {
                        return 79;}
                    }
                case 'S':
                    {
                    int LA13_184 = input.LA(5);

                    if ( (LA13_184=='t') ) {
                        int LA13_221 = input.LA(6);

                        if ( (LA13_221=='a') ) {
                            int LA13_250 = input.LA(7);

                            if ( (LA13_250=='t') ) {
                                int LA13_273 = input.LA(8);

                                if ( (LA13_273=='e') ) {
                                    int LA13_289 = input.LA(9);

                                    if ( ((LA13_289>='0' && LA13_289<='9')||(LA13_289>='A' && LA13_289<='Z')||LA13_289=='_'||(LA13_289>='a' && LA13_289<='z')) ) {
                                        return 79;
                                    }
                                    else {
                                        return 18;}
                                }
                                else {
                                    return 79;}
                            }
                            else {
                                return 79;}
                        }
                        else {
                            return 79;}
                    }
                    else {
                        return 79;}
                    }
                default:
                    return 79;}

            }
            else {
                return 79;}
            }
        case 'r':
            {
            int LA13_69 = input.LA(3);

            if ( (LA13_69=='d') ) {
                int LA13_141 = input.LA(4);

                if ( (LA13_141=='e') ) {
                    int LA13_185 = input.LA(5);

                    if ( (LA13_185=='r') ) {
                        int LA13_222 = input.LA(6);

                        if ( (LA13_222=='e') ) {
                            int LA13_251 = input.LA(7);

                            if ( (LA13_251=='d') ) {
                                int LA13_274 = input.LA(8);

                                if ( (LA13_274=='S') ) {
                                    int LA13_290 = input.LA(9);

                                    if ( (LA13_290=='e') ) {
                                        int LA13_299 = input.LA(10);

                                        if ( (LA13_299=='t') ) {
                                            int LA13_305 = input.LA(11);

                                            if ( ((LA13_305>='0' && LA13_305<='9')||(LA13_305>='A' && LA13_305<='Z')||LA13_305=='_'||(LA13_305>='a' && LA13_305<='z')) ) {
                                                return 79;
                                            }
                                            else {
                                                return 56;}
                                        }
                                        else {
                                            return 79;}
                                    }
                                    else {
                                        return 79;}
                                }
                                else {
                                    return 79;}
                            }
                            else {
                                return 79;}
                        }
                        else {
                            return 79;}
                    }
                    else {
                        return 79;}
                }
                else {
                    return 79;}
            }
            else {
                return 79;}
            }
        default:
            return 79;}

    }

    private int mTokensHelper012() throws RecognitionException {
        int LA13_12 = input.LA(2);

        if ( (LA13_12==':') ) {
            return 30;
        }
        else {
            return 20;}
    }

    private int mTokensHelper013() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'e':
            {
            int LA13_72 = input.LA(3);

            if ( (LA13_72=='l') ) {
                int LA13_142 = input.LA(4);

                if ( (LA13_142=='f') ) {
                    int LA13_186 = input.LA(5);

                    if ( ((LA13_186>='0' && LA13_186<='9')||(LA13_186>='A' && LA13_186<='Z')||LA13_186=='_'||(LA13_186>='a' && LA13_186<='z')) ) {
                        return 79;
                    }
                    else {
                        return 75;}
                }
                else {
                    return 79;}
            }
            else {
                return 79;}
            }
        case 't':
            {
            int LA13_73 = input.LA(3);

            if ( (LA13_73=='a') ) {
                int LA13_143 = input.LA(4);

                if ( (LA13_143=='t') ) {
                    int LA13_187 = input.LA(5);

                    if ( (LA13_187=='i') ) {
                        int LA13_224 = input.LA(6);

                        if ( (LA13_224=='c') ) {
                            int LA13_252 = input.LA(7);

                            if ( ((LA13_252>='0' && LA13_252<='9')||(LA13_252>='A' && LA13_252<='Z')||LA13_252=='_'||(LA13_252>='a' && LA13_252<='z')) ) {
                                return 79;
                            }
                            else {
                                return 21;}
                        }
                        else {
                            return 79;}
                    }
                    else {
                        return 79;}
                }
                else {
                    return 79;}
            }
            else {
                return 79;}
            }
        default:
            return 79;}

    }

    private int mTokensHelper014() throws RecognitionException {
        return 22;
    }

    private int mTokensHelper015() throws RecognitionException {
        return 23;
    }

    private int mTokensHelper016() throws RecognitionException {
        return 24;
    }

    private int mTokensHelper017() throws RecognitionException {
        return 25;
    }

    private int mTokensHelper018() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'a':
            {
            int LA13_78 = input.LA(3);

            if ( (LA13_78=='c') ) {
                int LA13_144 = input.LA(4);

                if ( (LA13_144=='k') ) {
                    int LA13_188 = input.LA(5);

                    if ( (LA13_188=='a') ) {
                        int LA13_225 = input.LA(6);

                        if ( (LA13_225=='g') ) {
                            int LA13_253 = input.LA(7);

                            if ( (LA13_253=='e') ) {
                                int LA13_276 = input.LA(8);

                                if ( ((LA13_276>='0' && LA13_276<='9')||(LA13_276>='A' && LA13_276<='Z')||LA13_276=='_'||(LA13_276>='a' && LA13_276<='z')) ) {
                                    return 79;
                                }
                                else {
                                    return 26;}
                            }
                            else {
                                return 79;}
                        }
                        else {
                            return 79;}
                    }
                    else {
                        return 79;}
                }
                else {
                    return 79;}
            }
            else {
                return 79;}
            }
        case 'o':
            {
            int LA13_79 = input.LA(3);

            if ( (LA13_79=='s') ) {
                int LA13_145 = input.LA(4);

                if ( (LA13_145=='t') ) {
                    int LA13_189 = input.LA(5);

                    if ( ((LA13_189>='0' && LA13_189<='9')||(LA13_189>='A' && LA13_189<='Z')||LA13_189=='_'||(LA13_189>='a' && LA13_189<='z')) ) {
                        return 79;
                    }
                    else {
                        return 28;}
                }
                else {
                    return 79;}
            }
            else {
                return 79;}
            }
        case 'r':
            {
            int LA13_80 = input.LA(3);

            if ( (LA13_80=='e') ) {
                int LA13_146 = input.LA(4);

                if ( ((LA13_146>='0' && LA13_146<='9')||(LA13_146>='A' && LA13_146<='Z')||LA13_146=='_'||(LA13_146>='a' && LA13_146<='z')) ) {
                    return 79;
                }
                else {
                    return 29;}
            }
            else {
                return 79;}
            }
        default:
            return 79;}

    }

    private int mTokensHelper019() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'l':
            {
            int LA13_81 = input.LA(3);

            if ( (LA13_81=='s') ) {
                int LA13_147 = input.LA(4);

                if ( (LA13_147=='e') ) {
                    int LA13_191 = input.LA(5);

                    if ( ((LA13_191>='0' && LA13_191<='9')||(LA13_191>='A' && LA13_191<='Z')||LA13_191=='_'||(LA13_191>='a' && LA13_191<='z')) ) {
                        return 79;
                    }
                    else {
                        return 71;}
                }
                else {
                    return 79;}
            }
            else {
                return 79;}
            }
        case 'n':
            {
            int LA13_82 = input.LA(3);

            if ( (LA13_82=='d') ) {
                switch ( input.LA(4) ) {
                case 'i':
                    {
                    int LA13_192 = input.LA(5);

                    if ( (LA13_192=='f') ) {
                        int LA13_228 = input.LA(6);

                        if ( ((LA13_228>='0' && LA13_228<='9')||(LA13_228>='A' && LA13_228<='Z')||LA13_228=='_'||(LA13_228>='a' && LA13_228<='z')) ) {
                            return 79;
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 79;}
                    }
                case 'p':
                    {
                    int LA13_193 = input.LA(5);

                    if ( (LA13_193=='a') ) {
                        int LA13_229 = input.LA(6);

                        if ( (LA13_229=='c') ) {
                            int LA13_255 = input.LA(7);

                            if ( (LA13_255=='k') ) {
                                int LA13_277 = input.LA(8);

                                if ( (LA13_277=='a') ) {
                                    int LA13_292 = input.LA(9);

                                    if ( (LA13_292=='g') ) {
                                        int LA13_300 = input.LA(10);

                                        if ( (LA13_300=='e') ) {
                                            int LA13_306 = input.LA(11);

                                            if ( ((LA13_306>='0' && LA13_306<='9')||(LA13_306>='A' && LA13_306<='Z')||LA13_306=='_'||(LA13_306>='a' && LA13_306<='z')) ) {
                                                return 79;
                                            }
                                            else {
                                                return 27;}
                                        }
                                        else {
                                            return 79;}
                                    }
                                    else {
                                        return 79;}
                                }
                                else {
                                    return 79;}
                            }
                            else {
                                return 79;}
                        }
                        else {
                            return 79;}
                    }
                    else {
                        return 79;}
                    }
                default:
                    return 79;}

            }
            else {
                return 79;}
            }
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
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'm':
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
            return 79;
            }
        default:
            return 34;}

    }

    private int mTokensHelper020() throws RecognitionException {
        return 31;
    }

    private int mTokensHelper021() throws RecognitionException {
        return 32;
    }

    private int mTokensHelper022() throws RecognitionException {
        int LA13_22 = input.LA(2);

        if ( (LA13_22=='.') ) {
            return 60;
        }
        else {
            return 33;}
    }

    private int mTokensHelper023() throws RecognitionException {
        int LA13_23 = input.LA(2);

        if ( ((LA13_23>='0' && LA13_23<='9')||(LA13_23>='A' && LA13_23<='Z')||LA13_23=='_'||(LA13_23>='a' && LA13_23<='z')) ) {
            return 79;
        }
        else {
            return 35;}
    }

    private int mTokensHelper024() throws RecognitionException {
        return 36;
    }

    private int mTokensHelper025() throws RecognitionException {
        switch ( input.LA(2) ) {
        case '>':
            {
            return 51;
            }
        case '-':
            {
            return 83;
            }
        default:
            return 37;}

    }

    private int mTokensHelper026() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'u':
            {
            int LA13_93 = input.LA(3);

            if ( (LA13_93=='l') ) {
                int LA13_149 = input.LA(4);

                if ( (LA13_149=='l') ) {
                    int LA13_194 = input.LA(5);

                    if ( ((LA13_194>='0' && LA13_194<='9')||(LA13_194>='A' && LA13_194<='Z')||LA13_194=='_'||(LA13_194>='a' && LA13_194<='z')) ) {
                        return 79;
                    }
                    else {
                        return 64;}
                }
                else {
                    return 79;}
            }
            else {
                return 79;}
            }
        case 'o':
            {
            int LA13_94 = input.LA(3);

            if ( (LA13_94=='t') ) {
                int LA13_150 = input.LA(4);

                if ( ((LA13_150>='0' && LA13_150<='9')||(LA13_150>='A' && LA13_150<='Z')||LA13_150=='_'||(LA13_150>='a' && LA13_150<='z')) ) {
                    return 79;
                }
                else {
                    return 39;}
            }
            else {
                return 79;}
            }
        default:
            return 79;}

    }

    private int mTokensHelper027() throws RecognitionException {
        return 40;
    }

    private int mTokensHelper028() throws RecognitionException {
        switch ( input.LA(2) ) {
        case '\'':
            {
            return 78;
            }
        case '*':
            {
            int LA13_97 = input.LA(3);

            if ( ((LA13_97>='\u0000' && LA13_97<=')')||(LA13_97>='+' && LA13_97<='\uFFFE')) ) {
                return 82;
            }
            else if ( (LA13_97=='*') ) {
                return 81;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ML_SINGLE_QUOTED_STRING | RULE_ID | RULE_INT | RULE_DOCUMENTATION | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 13, 97, input);

                throw nvae;
            }
            }
        default:
            return 41;}

    }

    private int mTokensHelper029() throws RecognitionException {
        int LA13_29 = input.LA(2);

        if ( (LA13_29=='=') ) {
            return 44;
        }
        else {
            return 42;}
    }

    private int mTokensHelper030() throws RecognitionException {
        switch ( input.LA(2) ) {
        case '=':
            {
            return 45;
            }
        case '>':
            {
            return 46;
            }
        default:
            return 43;}

    }

    private int mTokensHelper031() throws RecognitionException {
        int LA13_31 = input.LA(2);

        if ( (LA13_31=='n') ) {
            int LA13_104 = input.LA(3);

            if ( (LA13_104=='d') ) {
                int LA13_153 = input.LA(4);

                if ( ((LA13_153>='0' && LA13_153<='9')||(LA13_153>='A' && LA13_153<='Z')||LA13_153=='_'||(LA13_153>='a' && LA13_153<='z')) ) {
                    return 79;
                }
                else {
                    return 47;}
            }
            else {
                return 79;}
        }
        else {
            return 79;}
    }

    private int mTokensHelper032() throws RecognitionException {
        int LA13_32 = input.LA(2);

        if ( (LA13_32=='r') ) {
            int LA13_105 = input.LA(3);

            if ( ((LA13_105>='0' && LA13_105<='9')||(LA13_105>='A' && LA13_105<='Z')||LA13_105=='_'||(LA13_105>='a' && LA13_105<='z')) ) {
                return 79;
            }
            else {
                return 48;}
        }
        else {
            return 79;}
    }

    private int mTokensHelper033() throws RecognitionException {
        int LA13_33 = input.LA(2);

        if ( (LA13_33=='o') ) {
            int LA13_106 = input.LA(3);

            if ( (LA13_106=='r') ) {
                int LA13_155 = input.LA(4);

                if ( ((LA13_155>='0' && LA13_155<='9')||(LA13_155>='A' && LA13_155<='Z')||LA13_155=='_'||(LA13_155>='a' && LA13_155<='z')) ) {
                    return 79;
                }
                else {
                    return 49;}
            }
            else {
                return 79;}
        }
        else {
            return 79;}
    }

    private int mTokensHelper034() throws RecognitionException {
        int LA13_34 = input.LA(2);

        if ( (LA13_34=='o') ) {
            int LA13_107 = input.LA(3);

            if ( (LA13_107=='l') ) {
                int LA13_156 = input.LA(4);

                if ( (LA13_156=='l') ) {
                    int LA13_198 = input.LA(5);

                    if ( (LA13_198=='e') ) {
                        int LA13_231 = input.LA(6);

                        if ( (LA13_231=='c') ) {
                            int LA13_256 = input.LA(7);

                            if ( (LA13_256=='t') ) {
                                int LA13_278 = input.LA(8);

                                if ( (LA13_278=='i') ) {
                                    int LA13_293 = input.LA(9);

                                    if ( (LA13_293=='o') ) {
                                        int LA13_301 = input.LA(10);

                                        if ( (LA13_301=='n') ) {
                                            int LA13_307 = input.LA(11);

                                            if ( ((LA13_307>='0' && LA13_307<='9')||(LA13_307>='A' && LA13_307<='Z')||LA13_307=='_'||(LA13_307>='a' && LA13_307<='z')) ) {
                                                return 79;
                                            }
                                            else {
                                                return 55;}
                                        }
                                        else {
                                            return 79;}
                                    }
                                    else {
                                        return 79;}
                                }
                                else {
                                    return 79;}
                            }
                            else {
                                return 79;}
                        }
                        else {
                            return 79;}
                    }
                    else {
                        return 79;}
                }
                else {
                    return 79;}
            }
            else {
                return 79;}
        }
        else {
            return 79;}
    }

    private int mTokensHelper035() throws RecognitionException {
        int LA13_35 = input.LA(2);

        if ( (LA13_35=='u') ) {
            int LA13_108 = input.LA(3);

            if ( (LA13_108=='p') ) {
                int LA13_157 = input.LA(4);

                if ( (LA13_157=='l') ) {
                    int LA13_199 = input.LA(5);

                    if ( (LA13_199=='e') ) {
                        int LA13_232 = input.LA(6);

                        if ( ((LA13_232>='0' && LA13_232<='9')||(LA13_232>='A' && LA13_232<='Z')||LA13_232=='_'||(LA13_232>='a' && LA13_232<='z')) ) {
                            return 79;
                        }
                        else {
                            return 57;}
                    }
                    else {
                        return 79;}
                }
                else {
                    return 79;}
            }
            else {
                return 79;}
        }
        else {
            return 79;}
    }

    private int mTokensHelper036() throws RecognitionException {
        return 58;
    }

    private int mTokensHelper037() throws RecognitionException {
        return 59;
    }

    private int mTokensHelper038() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'r':
            {
            int LA13_111 = input.LA(3);

            if ( (LA13_111=='u') ) {
                int LA13_158 = input.LA(4);

                if ( (LA13_158=='e') ) {
                    int LA13_200 = input.LA(5);

                    if ( ((LA13_200>='0' && LA13_200<='9')||(LA13_200>='A' && LA13_200<='Z')||LA13_200=='_'||(LA13_200>='a' && LA13_200<='z')) ) {
                        return 79;
                    }
                    else {
                        return 61;}
                }
                else {
                    return 79;}
            }
            else {
                return 79;}
            }
        case 'h':
            {
            int LA13_112 = input.LA(3);

            if ( (LA13_112=='e') ) {
                int LA13_159 = input.LA(4);

                if ( (LA13_159=='n') ) {
                    int LA13_201 = input.LA(5);

                    if ( ((LA13_201>='0' && LA13_201<='9')||(LA13_201>='A' && LA13_201<='Z')||LA13_201=='_'||(LA13_201>='a' && LA13_201<='z')) ) {
                        return 79;
                    }
                    else {
                        return 70;}
                }
                else {
                    return 79;}
            }
            else {
                return 79;}
            }
        default:
            return 79;}

    }

    private int mTokensHelper039() throws RecognitionException {
        int LA13_39 = input.LA(2);

        if ( (LA13_39=='a') ) {
            int LA13_113 = input.LA(3);

            if ( (LA13_113=='l') ) {
                int LA13_160 = input.LA(4);

                if ( (LA13_160=='s') ) {
                    int LA13_202 = input.LA(5);

                    if ( (LA13_202=='e') ) {
                        int LA13_235 = input.LA(6);

                        if ( ((LA13_235>='0' && LA13_235<='9')||(LA13_235>='A' && LA13_235<='Z')||LA13_235=='_'||(LA13_235>='a' && LA13_235<='z')) ) {
                            return 79;
                        }
                        else {
                            return 62;}
                    }
                    else {
                        return 79;}
                }
                else {
                    return 79;}
            }
            else {
                return 79;}
        }
        else {
            return 79;}
    }

    private int mTokensHelper040() throws RecognitionException {
        return 65;
    }

    private int mTokensHelper041() throws RecognitionException {
        return 66;
    }

    private int mTokensHelper042() throws RecognitionException {
        return 67;
    }

    private int mTokensHelper043() throws RecognitionException {
        return 68;
    }

    private int mTokensHelper044() throws RecognitionException {
        int LA13_44 = input.LA(2);

        if ( (LA13_44=='e') ) {
            int LA13_118 = input.LA(3);

            if ( (LA13_118=='t') ) {
                int LA13_161 = input.LA(4);

                if ( ((LA13_161>='0' && LA13_161<='9')||(LA13_161>='A' && LA13_161<='Z')||LA13_161=='_'||(LA13_161>='a' && LA13_161<='z')) ) {
                    return 79;
                }
                else {
                    return 73;}
            }
            else {
                return 79;}
        }
        else {
            return 79;}
    }

    private int mTokensHelper045() throws RecognitionException {
        int LA13_45 = input.LA(2);

        if ( ((LA13_45>='\u0000' && LA13_45<='\uFFFE')) ) {
            return 76;
        }
        else {
            return 85;}
    }

    private int mTokensHelper046() throws RecognitionException {
        int LA13_46 = input.LA(2);

        if ( ((LA13_46>='\u0000' && LA13_46<='\uFFFE')) ) {
            return 77;
        }
        else {
            return 85;}
    }

    private int mTokensHelper047() throws RecognitionException {
        return 79;
    }

    private int mTokensHelper048() throws RecognitionException {
        return 79;
    }

    private int mTokensHelper049() throws RecognitionException {
        return 80;
    }

    private int mTokensHelper050() throws RecognitionException {
        return 84;
    }

    private int mTokensHelper051() throws RecognitionException {
        return 85;
    }

    private int mTokensHelper052() throws RecognitionException {
        NoViableAltException nvae =
            new NoViableAltException("1:1: Tokens : ( T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ML_SINGLE_QUOTED_STRING | RULE_ID | RULE_INT | RULE_DOCUMENTATION | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 13, 0, input);

        throw nvae;
    }



 

}