package org.eclipse.ocl.examples.xtext.oclstdlib.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOCLstdlibLexer extends Lexer {
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
    public static final int RULE_ML_COMMENT=9;
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
    public static final int T13=13;
    public static final int T65=65;
    public static final int T56=56;
    public static final int T87=87;
    public static final int T76=76;
    public static final int T80=80;
    public static final int T75=75;
    public static final int T59=59;
    public static final int RULE_WS=11;
    public static final int T48=48;
    public static final int T15=15;
    public static final int T89=89;
    public static final int T54=54;
    public static final int EOF=-1;
    public static final int T67=67;
    public static final int T47=47;
    public static final int Tokens=90;
    public static final int T53=53;
    public static final int T60=60;
    public static final int RULE_ANY_OTHER=12;
    public static final int T31=31;
    public static final int T82=82;
    public static final int T49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int T27=27;
    public static final int T52=52;
    public static final int T30=30;
    public InternalOCLstdlibLexer() {;} 
    public InternalOCLstdlibLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g"; }

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:10:5: ( 'library' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:10:7: 'library'
            {
            match("library"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:11:5: ( 'module' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:11:7: 'module'
            {
            match("module"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:12:5: ( ':' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:12:7: ':'
            {
            match(':'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:13:5: ( '=' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:13:7: '='
            {
            match('='); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:14:5: ( '{' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:14:7: '{'
            {
            match('{'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:15:5: ( 'precedence' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:15:7: 'precedence'
            {
            match("precedence"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:16:5: ( ';' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:16:7: ';'
            {
            match(';'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:17:5: ( '}' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:17:7: '}'
            {
            match('}'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:18:5: ( '*' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:18:7: '*'
            {
            match('*'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:19:5: ( 'conformsTo' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:19:7: 'conformsTo'
            {
            match("conformsTo"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:20:5: ( 'documentation' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:20:7: 'documentation'
            {
            match("documentation"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:21:5: ( 'extends' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:21:7: 'extends'
            {
            match("extends"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:22:5: ( 'import' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:22:7: 'import'
            {
            match("import"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:23:5: ( 'iteration' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:23:7: 'iteration'
            {
            match("iteration"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:24:5: ( 'left' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:24:7: 'left'
            {
            match("left"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:25:5: ( 'operation' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:25:7: 'operation'
            {
            match("operation"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:26:5: ( 'package' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:26:7: 'package'
            {
            match("package"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:27:5: ( 'post' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:27:7: 'post'
            {
            match("post"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:28:5: ( 'pre' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:28:7: 'pre'
            {
            match("pre"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:29:5: ( 'property' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:29:7: 'property'
            {
            match("property"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:30:5: ( 'right' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:30:7: 'right'
            {
            match("right"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:31:5: ( 'super' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:31:7: 'super'
            {
            match("super"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:32:5: ( 'type' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:32:7: 'type'
            {
            match("type"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:33:5: ( 'Tuple' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:33:7: 'Tuple'
            {
            match("Tuple"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:34:5: ( 'annotation' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:34:7: 'annotation'
            {
            match("annotation"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:35:5: ( '(' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:35:7: '('
            {
            match('('); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:36:5: ( ',' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:36:7: ','
            {
            match(','); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:37:5: ( ')' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:37:7: ')'
            {
            match(')'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:38:5: ( '|' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:38:7: '|'
            {
            match('|'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:39:5: ( '=>' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:39:7: '=>'
            {
            match("=>"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:40:5: ( '[' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:40:7: '['
            {
            match('['); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:41:5: ( '..' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:41:7: '..'
            {
            match(".."); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:42:5: ( '+' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:42:7: '+'
            {
            match('+'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:43:5: ( '?' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:43:7: '?'
            {
            match('?'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:44:5: ( ']' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:44:7: ']'
            {
            match(']'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:45:5: ( '::' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:45:7: '::'
            {
            match("::"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:46:5: ( '<' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:46:7: '<'
            {
            match('<'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:47:5: ( '>' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:47:7: '>'
            {
            match('>'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:48:5: ( '&&' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:48:7: '&&'
            {
            match("&&"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:49:5: ( '.' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:49:7: '.'
            {
            match('.'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:50:5: ( 'e' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:50:7: 'e'
            {
            match('e'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:51:5: ( 'E' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:51:7: 'E'
            {
            match('E'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:52:5: ( '-' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:52:7: '-'
            {
            match('-'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:53:5: ( 'and' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:53:7: 'and'
            {
            match("and"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:54:5: ( 'else' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:54:7: 'else'
            {
            match("else"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:55:5: ( 'endif' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:55:7: 'endif'
            {
            match("endif"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:56:5: ( 'if' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:56:7: 'if'
            {
            match("if"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:57:5: ( 'implies' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:57:7: 'implies'
            {
            match("implies"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:58:5: ( 'in' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:58:7: 'in'
            {
            match("in"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:59:5: ( 'let' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:59:7: 'let'
            {
            match("let"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:60:5: ( 'not' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:60:7: 'not'
            {
            match("not"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:61:5: ( 'or' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:61:7: 'or'
            {
            match("or"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:62:5: ( 'then' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:62:7: 'then'
            {
            match("then"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:63:5: ( 'xor' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:63:7: 'xor'
            {
            match("xor"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:64:5: ( '/' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:64:7: '/'
            {
            match('/'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:65:5: ( '>=' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:65:7: '>='
            {
            match(">="); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:66:5: ( '<=' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:66:7: '<='
            {
            match("<="); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:67:5: ( '<>' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:67:7: '<>'
            {
            match("<>"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:68:5: ( '->' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:68:7: '->'
            {
            match("->"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:69:5: ( 'Boolean' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:69:7: 'Boolean'
            {
            match("Boolean"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:70:5: ( 'Integer' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:70:7: 'Integer'
            {
            match("Integer"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:71:5: ( 'Real' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:71:7: 'Real'
            {
            match("Real"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:72:5: ( 'String' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:72:7: 'String'
            {
            match("String"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:73:5: ( 'UnlimitedNatural' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:73:7: 'UnlimitedNatural'
            {
            match("UnlimitedNatural"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:74:5: ( 'OclAny' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:74:7: 'OclAny'
            {
            match("OclAny"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:75:5: ( 'OclInvalid' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:75:7: 'OclInvalid'
            {
            match("OclInvalid"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:76:5: ( 'OclVoid' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:76:7: 'OclVoid'
            {
            match("OclVoid"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:77:5: ( 'Set' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:77:7: 'Set'
            {
            match("Set"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:78:5: ( 'Bag' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:78:7: 'Bag'
            {
            match("Bag"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:79:5: ( 'Sequence' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:79:7: 'Sequence'
            {
            match("Sequence"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:80:5: ( 'Collection' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:80:7: 'Collection'
            {
            match("Collection"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:81:5: ( 'OrderedSet' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:81:7: 'OrderedSet'
            {
            match("OrderedSet"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:82:5: ( 'true' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:82:7: 'true'
            {
            match("true"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:83:5: ( 'false' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:83:7: 'false'
            {
            match("false"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:84:5: ( 'invalid' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:84:7: 'invalid'
            {
            match("invalid"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:85:5: ( 'null' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:85:7: 'null'
            {
            match("null"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T88

    // $ANTLR start T89
    public final void mT89() throws RecognitionException {
        try {
            int _type = T89;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:86:5: ( 'self' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:86:7: 'self'
            {
            match("self"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T89

    // $ANTLR start RULE_ML_SINGLE_QUOTED_STRING
    public final void mRULE_ML_SINGLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_ML_SINGLE_QUOTED_STRING;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7385:30: ( '/\\'' ( options {greedy=false; } : . )* '\\'/' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7385:32: '/\\'' ( options {greedy=false; } : . )* '\\'/'
            {
            match("/\'"); 

            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7385:38: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\'') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFE')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7385:66: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
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

    // $ANTLR start RULE_DOUBLE_QUOTED_STRING
    public final void mRULE_DOUBLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_QUOTED_STRING;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7387:27: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7387:29: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7387:33: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFE')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7387:34: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
            	    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7387:79: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop2;
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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7389:27: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7389:29: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7389:34: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFE')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7389:35: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
            	    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7389:80: ~ ( ( '\\\\' | '\\'' ) )
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
            	    break loop3;
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

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7391:9: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '_' RULE_SINGLE_QUOTED_STRING ) )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7391:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '_' RULE_SINGLE_QUOTED_STRING )
            {
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7391:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '_' RULE_SINGLE_QUOTED_STRING )
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
                    new NoViableAltException("7391:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '_' RULE_SINGLE_QUOTED_STRING )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7391:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7391:36: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:
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
                    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7391:70: '_' RULE_SINGLE_QUOTED_STRING
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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7393:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7393:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7393:12: ( '0' .. '9' )+
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
            	    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7393:13: '0' .. '9'
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

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7395:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7395:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7395:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7395:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7397:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7397:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7397:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7397:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7397:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7397:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7397:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7397:41: '\\r'
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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7399:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7399:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7399:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7401:16: ( . )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:7401:18: .
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
        // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:8: ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | RULE_ML_SINGLE_QUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=86;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='l') ) {
            alt12 = mTokensHelper001();
        }
        else if ( (LA12_0=='m') ) {
            alt12 = mTokensHelper002();
        }
        else if ( (LA12_0==':') ) {
            alt12 = mTokensHelper003();
        }
        else if ( (LA12_0=='=') ) {
            alt12 = mTokensHelper004();
        }
        else if ( (LA12_0=='{') ) {
            alt12 = mTokensHelper005();
        }
        else if ( (LA12_0=='p') ) {
            alt12 = mTokensHelper006();
        }
        else if ( (LA12_0==';') ) {
            alt12 = mTokensHelper007();
        }
        else if ( (LA12_0=='}') ) {
            alt12 = mTokensHelper008();
        }
        else if ( (LA12_0=='*') ) {
            alt12 = mTokensHelper009();
        }
        else if ( (LA12_0=='c') ) {
            alt12 = mTokensHelper010();
        }
        else if ( (LA12_0=='d') ) {
            alt12 = mTokensHelper011();
        }
        else if ( (LA12_0=='e') ) {
            alt12 = mTokensHelper012();
        }
        else if ( (LA12_0=='i') ) {
            alt12 = mTokensHelper013();
        }
        else if ( (LA12_0=='o') ) {
            alt12 = mTokensHelper014();
        }
        else if ( (LA12_0=='r') ) {
            alt12 = mTokensHelper015();
        }
        else if ( (LA12_0=='s') ) {
            alt12 = mTokensHelper016();
        }
        else if ( (LA12_0=='t') ) {
            alt12 = mTokensHelper017();
        }
        else if ( (LA12_0=='T') ) {
            alt12 = mTokensHelper018();
        }
        else if ( (LA12_0=='a') ) {
            alt12 = mTokensHelper019();
        }
        else if ( (LA12_0=='(') ) {
            alt12 = mTokensHelper020();
        }
        else if ( (LA12_0==',') ) {
            alt12 = mTokensHelper021();
        }
        else if ( (LA12_0==')') ) {
            alt12 = mTokensHelper022();
        }
        else if ( (LA12_0=='|') ) {
            alt12 = mTokensHelper023();
        }
        else if ( (LA12_0=='[') ) {
            alt12 = mTokensHelper024();
        }
        else if ( (LA12_0=='.') ) {
            alt12 = mTokensHelper025();
        }
        else if ( (LA12_0=='+') ) {
            alt12 = mTokensHelper026();
        }
        else if ( (LA12_0=='?') ) {
            alt12 = mTokensHelper027();
        }
        else if ( (LA12_0==']') ) {
            alt12 = mTokensHelper028();
        }
        else if ( (LA12_0=='<') ) {
            alt12 = mTokensHelper029();
        }
        else if ( (LA12_0=='>') ) {
            alt12 = mTokensHelper030();
        }
        else if ( (LA12_0=='&') ) {
            alt12 = mTokensHelper031();
        }
        else if ( (LA12_0=='E') ) {
            alt12 = mTokensHelper032();
        }
        else if ( (LA12_0=='-') ) {
            alt12 = mTokensHelper033();
        }
        else if ( (LA12_0=='n') ) {
            alt12 = mTokensHelper034();
        }
        else if ( (LA12_0=='x') ) {
            alt12 = mTokensHelper035();
        }
        else if ( (LA12_0=='/') ) {
            alt12 = mTokensHelper036();
        }
        else if ( (LA12_0=='B') ) {
            alt12 = mTokensHelper037();
        }
        else if ( (LA12_0=='I') ) {
            alt12 = mTokensHelper038();
        }
        else if ( (LA12_0=='R') ) {
            alt12 = mTokensHelper039();
        }
        else if ( (LA12_0=='S') ) {
            alt12 = mTokensHelper040();
        }
        else if ( (LA12_0=='U') ) {
            alt12 = mTokensHelper041();
        }
        else if ( (LA12_0=='O') ) {
            alt12 = mTokensHelper042();
        }
        else if ( (LA12_0=='C') ) {
            alt12 = mTokensHelper043();
        }
        else if ( (LA12_0=='f') ) {
            alt12 = mTokensHelper044();
        }
        else if ( (LA12_0=='\"') ) {
            alt12 = mTokensHelper045();
        }
        else if ( (LA12_0=='\'') ) {
            alt12 = mTokensHelper046();
        }
        else if ( (LA12_0=='_') ) {
            alt12 = mTokensHelper047();
        }
        else if ( (LA12_0=='A'||LA12_0=='D'||(LA12_0>='F' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='N')||(LA12_0>='P' && LA12_0<='Q')||(LA12_0>='V' && LA12_0<='Z')||LA12_0=='b'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||LA12_0=='q'||(LA12_0>='u' && LA12_0<='w')||(LA12_0>='y' && LA12_0<='z')) ) {
            alt12 = mTokensHelper048();
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12 = mTokensHelper049();
        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12 = mTokensHelper050();
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='%')||LA12_0=='@'||LA12_0=='\\'||LA12_0=='^'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12 = mTokensHelper051();
        }
        else {
            alt12 = mTokensHelper052();
        }
        switch (alt12) {
            case 1 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:10: T13
                {
                mT13(); 

                }
                break;
            case 2 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:14: T14
                {
                mT14(); 

                }
                break;
            case 3 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:18: T15
                {
                mT15(); 

                }
                break;
            case 4 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:22: T16
                {
                mT16(); 

                }
                break;
            case 5 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:26: T17
                {
                mT17(); 

                }
                break;
            case 6 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:30: T18
                {
                mT18(); 

                }
                break;
            case 7 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:34: T19
                {
                mT19(); 

                }
                break;
            case 8 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:38: T20
                {
                mT20(); 

                }
                break;
            case 9 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:42: T21
                {
                mT21(); 

                }
                break;
            case 10 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:46: T22
                {
                mT22(); 

                }
                break;
            case 11 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:50: T23
                {
                mT23(); 

                }
                break;
            case 12 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:54: T24
                {
                mT24(); 

                }
                break;
            case 13 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:58: T25
                {
                mT25(); 

                }
                break;
            case 14 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:62: T26
                {
                mT26(); 

                }
                break;
            case 15 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:66: T27
                {
                mT27(); 

                }
                break;
            case 16 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:70: T28
                {
                mT28(); 

                }
                break;
            case 17 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:74: T29
                {
                mT29(); 

                }
                break;
            case 18 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:78: T30
                {
                mT30(); 

                }
                break;
            case 19 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:82: T31
                {
                mT31(); 

                }
                break;
            case 20 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:86: T32
                {
                mT32(); 

                }
                break;
            case 21 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:90: T33
                {
                mT33(); 

                }
                break;
            case 22 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:94: T34
                {
                mT34(); 

                }
                break;
            case 23 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:98: T35
                {
                mT35(); 

                }
                break;
            case 24 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:102: T36
                {
                mT36(); 

                }
                break;
            case 25 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:106: T37
                {
                mT37(); 

                }
                break;
            case 26 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:110: T38
                {
                mT38(); 

                }
                break;
            case 27 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:114: T39
                {
                mT39(); 

                }
                break;
            case 28 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:118: T40
                {
                mT40(); 

                }
                break;
            case 29 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:122: T41
                {
                mT41(); 

                }
                break;
            case 30 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:126: T42
                {
                mT42(); 

                }
                break;
            case 31 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:130: T43
                {
                mT43(); 

                }
                break;
            case 32 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:134: T44
                {
                mT44(); 

                }
                break;
            case 33 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:138: T45
                {
                mT45(); 

                }
                break;
            case 34 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:142: T46
                {
                mT46(); 

                }
                break;
            case 35 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:146: T47
                {
                mT47(); 

                }
                break;
            case 36 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:150: T48
                {
                mT48(); 

                }
                break;
            case 37 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:154: T49
                {
                mT49(); 

                }
                break;
            case 38 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:158: T50
                {
                mT50(); 

                }
                break;
            case 39 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:162: T51
                {
                mT51(); 

                }
                break;
            case 40 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:166: T52
                {
                mT52(); 

                }
                break;
            case 41 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:170: T53
                {
                mT53(); 

                }
                break;
            case 42 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:174: T54
                {
                mT54(); 

                }
                break;
            case 43 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:178: T55
                {
                mT55(); 

                }
                break;
            case 44 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:182: T56
                {
                mT56(); 

                }
                break;
            case 45 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:186: T57
                {
                mT57(); 

                }
                break;
            case 46 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:190: T58
                {
                mT58(); 

                }
                break;
            case 47 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:194: T59
                {
                mT59(); 

                }
                break;
            case 48 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:198: T60
                {
                mT60(); 

                }
                break;
            case 49 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:202: T61
                {
                mT61(); 

                }
                break;
            case 50 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:206: T62
                {
                mT62(); 

                }
                break;
            case 51 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:210: T63
                {
                mT63(); 

                }
                break;
            case 52 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:214: T64
                {
                mT64(); 

                }
                break;
            case 53 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:218: T65
                {
                mT65(); 

                }
                break;
            case 54 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:222: T66
                {
                mT66(); 

                }
                break;
            case 55 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:226: T67
                {
                mT67(); 

                }
                break;
            case 56 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:230: T68
                {
                mT68(); 

                }
                break;
            case 57 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:234: T69
                {
                mT69(); 

                }
                break;
            case 58 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:238: T70
                {
                mT70(); 

                }
                break;
            case 59 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:242: T71
                {
                mT71(); 

                }
                break;
            case 60 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:246: T72
                {
                mT72(); 

                }
                break;
            case 61 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:250: T73
                {
                mT73(); 

                }
                break;
            case 62 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:254: T74
                {
                mT74(); 

                }
                break;
            case 63 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:258: T75
                {
                mT75(); 

                }
                break;
            case 64 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:262: T76
                {
                mT76(); 

                }
                break;
            case 65 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:266: T77
                {
                mT77(); 

                }
                break;
            case 66 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:270: T78
                {
                mT78(); 

                }
                break;
            case 67 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:274: T79
                {
                mT79(); 

                }
                break;
            case 68 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:278: T80
                {
                mT80(); 

                }
                break;
            case 69 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:282: T81
                {
                mT81(); 

                }
                break;
            case 70 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:286: T82
                {
                mT82(); 

                }
                break;
            case 71 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:290: T83
                {
                mT83(); 

                }
                break;
            case 72 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:294: T84
                {
                mT84(); 

                }
                break;
            case 73 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:298: T85
                {
                mT85(); 

                }
                break;
            case 74 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:302: T86
                {
                mT86(); 

                }
                break;
            case 75 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:306: T87
                {
                mT87(); 

                }
                break;
            case 76 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:310: T88
                {
                mT88(); 

                }
                break;
            case 77 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:314: T89
                {
                mT89(); 

                }
                break;
            case 78 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:318: RULE_ML_SINGLE_QUOTED_STRING
                {
                mRULE_ML_SINGLE_QUOTED_STRING(); 

                }
                break;
            case 79 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:347: RULE_DOUBLE_QUOTED_STRING
                {
                mRULE_DOUBLE_QUOTED_STRING(); 

                }
                break;
            case 80 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:373: RULE_SINGLE_QUOTED_STRING
                {
                mRULE_SINGLE_QUOTED_STRING(); 

                }
                break;
            case 81 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:399: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 82 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:407: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 83 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:416: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 84 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:432: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 85 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:448: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 86 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:456: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }
    private int mTokensHelper001() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'e':
            {
            switch ( input.LA(3) ) {
            case 'f':
                {
                int LA12_128 = input.LA(4);

                if ( (LA12_128=='t') ) {
                    int LA12_172 = input.LA(5);

                    if ( ((LA12_172>='0' && LA12_172<='9')||(LA12_172>='A' && LA12_172<='Z')||LA12_172=='_'||(LA12_172>='a' && LA12_172<='z')) ) {
                        return 81;
                    }
                    else {
                        return 15;}
                }
                else {
                    return 81;}
                }
            case 't':
                {
                int LA12_129 = input.LA(4);

                if ( ((LA12_129>='0' && LA12_129<='9')||(LA12_129>='A' && LA12_129<='Z')||LA12_129=='_'||(LA12_129>='a' && LA12_129<='z')) ) {
                    return 81;
                }
                else {
                    return 50;}
                }
            default:
                return 81;}

            }
        case 'i':
            {
            int LA12_53 = input.LA(3);

            if ( (LA12_53=='b') ) {
                int LA12_130 = input.LA(4);

                if ( (LA12_130=='r') ) {
                    int LA12_174 = input.LA(5);

                    if ( (LA12_174=='a') ) {
                        int LA12_218 = input.LA(6);

                        if ( (LA12_218=='r') ) {
                            int LA12_255 = input.LA(7);

                            if ( (LA12_255=='y') ) {
                                int LA12_284 = input.LA(8);

                                if ( ((LA12_284>='0' && LA12_284<='9')||(LA12_284>='A' && LA12_284<='Z')||LA12_284=='_'||(LA12_284>='a' && LA12_284<='z')) ) {
                                    return 81;
                                }
                                else {
                                    return 1;}
                            }
                            else {
                                return 81;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
            }
        default:
            return 81;}

    }

    private int mTokensHelper002() throws RecognitionException {
        int LA12_2 = input.LA(2);

        if ( (LA12_2=='o') ) {
            int LA12_55 = input.LA(3);

            if ( (LA12_55=='d') ) {
                int LA12_131 = input.LA(4);

                if ( (LA12_131=='u') ) {
                    int LA12_175 = input.LA(5);

                    if ( (LA12_175=='l') ) {
                        int LA12_219 = input.LA(6);

                        if ( (LA12_219=='e') ) {
                            int LA12_256 = input.LA(7);

                            if ( ((LA12_256>='0' && LA12_256<='9')||(LA12_256>='A' && LA12_256<='Z')||LA12_256=='_'||(LA12_256>='a' && LA12_256<='z')) ) {
                                return 81;
                            }
                            else {
                                return 2;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
        }
        else {
            return 81;}
    }

    private int mTokensHelper003() throws RecognitionException {
        int LA12_3 = input.LA(2);

        if ( (LA12_3==':') ) {
            return 36;
        }
        else {
            return 3;}
    }

    private int mTokensHelper004() throws RecognitionException {
        int LA12_4 = input.LA(2);

        if ( (LA12_4=='>') ) {
            return 30;
        }
        else {
            return 4;}
    }

    private int mTokensHelper005() throws RecognitionException {
        return 5;
    }

    private int mTokensHelper006() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'r':
            {
            switch ( input.LA(3) ) {
            case 'e':
                {
                switch ( input.LA(4) ) {
                case 'c':
                    {
                    int LA12_176 = input.LA(5);

                    if ( (LA12_176=='e') ) {
                        int LA12_220 = input.LA(6);

                        if ( (LA12_220=='d') ) {
                            int LA12_257 = input.LA(7);

                            if ( (LA12_257=='e') ) {
                                int LA12_286 = input.LA(8);

                                if ( (LA12_286=='n') ) {
                                    int LA12_309 = input.LA(9);

                                    if ( (LA12_309=='c') ) {
                                        int LA12_328 = input.LA(10);

                                        if ( (LA12_328=='e') ) {
                                            int LA12_340 = input.LA(11);

                                            if ( ((LA12_340>='0' && LA12_340<='9')||(LA12_340>='A' && LA12_340<='Z')||LA12_340=='_'||(LA12_340>='a' && LA12_340<='z')) ) {
                                                return 81;
                                            }
                                            else {
                                                return 6;}
                                        }
                                        else {
                                            return 81;}
                                    }
                                    else {
                                        return 81;}
                                }
                                else {
                                    return 81;}
                            }
                            else {
                                return 81;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
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
                    return 81;
                    }
                default:
                    return 19;}

                }
            case 'o':
                {
                int LA12_133 = input.LA(4);

                if ( (LA12_133=='p') ) {
                    int LA12_178 = input.LA(5);

                    if ( (LA12_178=='e') ) {
                        int LA12_221 = input.LA(6);

                        if ( (LA12_221=='r') ) {
                            int LA12_258 = input.LA(7);

                            if ( (LA12_258=='t') ) {
                                int LA12_287 = input.LA(8);

                                if ( (LA12_287=='y') ) {
                                    int LA12_310 = input.LA(9);

                                    if ( ((LA12_310>='0' && LA12_310<='9')||(LA12_310>='A' && LA12_310<='Z')||LA12_310=='_'||(LA12_310>='a' && LA12_310<='z')) ) {
                                        return 81;
                                    }
                                    else {
                                        return 20;}
                                }
                                else {
                                    return 81;}
                            }
                            else {
                                return 81;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
                }
            default:
                return 81;}

            }
        case 'a':
            {
            int LA12_62 = input.LA(3);

            if ( (LA12_62=='c') ) {
                int LA12_134 = input.LA(4);

                if ( (LA12_134=='k') ) {
                    int LA12_179 = input.LA(5);

                    if ( (LA12_179=='a') ) {
                        int LA12_222 = input.LA(6);

                        if ( (LA12_222=='g') ) {
                            int LA12_259 = input.LA(7);

                            if ( (LA12_259=='e') ) {
                                int LA12_288 = input.LA(8);

                                if ( ((LA12_288>='0' && LA12_288<='9')||(LA12_288>='A' && LA12_288<='Z')||LA12_288=='_'||(LA12_288>='a' && LA12_288<='z')) ) {
                                    return 81;
                                }
                                else {
                                    return 17;}
                            }
                            else {
                                return 81;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
            }
        case 'o':
            {
            int LA12_63 = input.LA(3);

            if ( (LA12_63=='s') ) {
                int LA12_135 = input.LA(4);

                if ( (LA12_135=='t') ) {
                    int LA12_180 = input.LA(5);

                    if ( ((LA12_180>='0' && LA12_180<='9')||(LA12_180>='A' && LA12_180<='Z')||LA12_180=='_'||(LA12_180>='a' && LA12_180<='z')) ) {
                        return 81;
                    }
                    else {
                        return 18;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
            }
        default:
            return 81;}

    }

    private int mTokensHelper007() throws RecognitionException {
        return 7;
    }

    private int mTokensHelper008() throws RecognitionException {
        return 8;
    }

    private int mTokensHelper009() throws RecognitionException {
        return 9;
    }

    private int mTokensHelper010() throws RecognitionException {
        int LA12_10 = input.LA(2);

        if ( (LA12_10=='o') ) {
            int LA12_67 = input.LA(3);

            if ( (LA12_67=='n') ) {
                int LA12_136 = input.LA(4);

                if ( (LA12_136=='f') ) {
                    int LA12_181 = input.LA(5);

                    if ( (LA12_181=='o') ) {
                        int LA12_224 = input.LA(6);

                        if ( (LA12_224=='r') ) {
                            int LA12_260 = input.LA(7);

                            if ( (LA12_260=='m') ) {
                                int LA12_289 = input.LA(8);

                                if ( (LA12_289=='s') ) {
                                    int LA12_312 = input.LA(9);

                                    if ( (LA12_312=='T') ) {
                                        int LA12_330 = input.LA(10);

                                        if ( (LA12_330=='o') ) {
                                            int LA12_341 = input.LA(11);

                                            if ( ((LA12_341>='0' && LA12_341<='9')||(LA12_341>='A' && LA12_341<='Z')||LA12_341=='_'||(LA12_341>='a' && LA12_341<='z')) ) {
                                                return 81;
                                            }
                                            else {
                                                return 10;}
                                        }
                                        else {
                                            return 81;}
                                    }
                                    else {
                                        return 81;}
                                }
                                else {
                                    return 81;}
                            }
                            else {
                                return 81;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
        }
        else {
            return 81;}
    }

    private int mTokensHelper011() throws RecognitionException {
        int LA12_11 = input.LA(2);

        if ( (LA12_11=='o') ) {
            int LA12_68 = input.LA(3);

            if ( (LA12_68=='c') ) {
                int LA12_137 = input.LA(4);

                if ( (LA12_137=='u') ) {
                    int LA12_182 = input.LA(5);

                    if ( (LA12_182=='m') ) {
                        int LA12_225 = input.LA(6);

                        if ( (LA12_225=='e') ) {
                            int LA12_261 = input.LA(7);

                            if ( (LA12_261=='n') ) {
                                int LA12_290 = input.LA(8);

                                if ( (LA12_290=='t') ) {
                                    int LA12_313 = input.LA(9);

                                    if ( (LA12_313=='a') ) {
                                        int LA12_331 = input.LA(10);

                                        if ( (LA12_331=='t') ) {
                                            int LA12_342 = input.LA(11);

                                            if ( (LA12_342=='i') ) {
                                                int LA12_352 = input.LA(12);

                                                if ( (LA12_352=='o') ) {
                                                    int LA12_358 = input.LA(13);

                                                    if ( (LA12_358=='n') ) {
                                                        int LA12_360 = input.LA(14);

                                                        if ( ((LA12_360>='0' && LA12_360<='9')||(LA12_360>='A' && LA12_360<='Z')||LA12_360=='_'||(LA12_360>='a' && LA12_360<='z')) ) {
                                                            return 81;
                                                        }
                                                        else {
                                                            return 11;}
                                                    }
                                                    else {
                                                        return 81;}
                                                }
                                                else {
                                                    return 81;}
                                            }
                                            else {
                                                return 81;}
                                        }
                                        else {
                                            return 81;}
                                    }
                                    else {
                                        return 81;}
                                }
                                else {
                                    return 81;}
                            }
                            else {
                                return 81;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
        }
        else {
            return 81;}
    }

    private int mTokensHelper012() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'x':
            {
            int LA12_69 = input.LA(3);

            if ( (LA12_69=='t') ) {
                int LA12_138 = input.LA(4);

                if ( (LA12_138=='e') ) {
                    int LA12_183 = input.LA(5);

                    if ( (LA12_183=='n') ) {
                        int LA12_226 = input.LA(6);

                        if ( (LA12_226=='d') ) {
                            int LA12_262 = input.LA(7);

                            if ( (LA12_262=='s') ) {
                                int LA12_291 = input.LA(8);

                                if ( ((LA12_291>='0' && LA12_291<='9')||(LA12_291>='A' && LA12_291<='Z')||LA12_291=='_'||(LA12_291>='a' && LA12_291<='z')) ) {
                                    return 81;
                                }
                                else {
                                    return 12;}
                            }
                            else {
                                return 81;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
            }
        case 'n':
            {
            int LA12_70 = input.LA(3);

            if ( (LA12_70=='d') ) {
                int LA12_139 = input.LA(4);

                if ( (LA12_139=='i') ) {
                    int LA12_184 = input.LA(5);

                    if ( (LA12_184=='f') ) {
                        int LA12_227 = input.LA(6);

                        if ( ((LA12_227>='0' && LA12_227<='9')||(LA12_227>='A' && LA12_227<='Z')||LA12_227=='_'||(LA12_227>='a' && LA12_227<='z')) ) {
                            return 81;
                        }
                        else {
                            return 46;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
            }
        case 'l':
            {
            int LA12_71 = input.LA(3);

            if ( (LA12_71=='s') ) {
                int LA12_140 = input.LA(4);

                if ( (LA12_140=='e') ) {
                    int LA12_185 = input.LA(5);

                    if ( ((LA12_185>='0' && LA12_185<='9')||(LA12_185>='A' && LA12_185<='Z')||LA12_185=='_'||(LA12_185>='a' && LA12_185<='z')) ) {
                        return 81;
                    }
                    else {
                        return 45;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
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
        case 'y':
        case 'z':
            {
            return 81;
            }
        default:
            return 41;}

    }

    private int mTokensHelper013() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'n':
            {
            switch ( input.LA(3) ) {
            case 'v':
                {
                int LA12_141 = input.LA(4);

                if ( (LA12_141=='a') ) {
                    int LA12_186 = input.LA(5);

                    if ( (LA12_186=='l') ) {
                        int LA12_229 = input.LA(6);

                        if ( (LA12_229=='i') ) {
                            int LA12_264 = input.LA(7);

                            if ( (LA12_264=='d') ) {
                                int LA12_292 = input.LA(8);

                                if ( ((LA12_292>='0' && LA12_292<='9')||(LA12_292>='A' && LA12_292<='Z')||LA12_292=='_'||(LA12_292>='a' && LA12_292<='z')) ) {
                                    return 81;
                                }
                                else {
                                    return 75;}
                            }
                            else {
                                return 81;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
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
                return 81;
                }
            default:
                return 49;}

            }
        case 'f':
            {
            int LA12_74 = input.LA(3);

            if ( ((LA12_74>='0' && LA12_74<='9')||(LA12_74>='A' && LA12_74<='Z')||LA12_74=='_'||(LA12_74>='a' && LA12_74<='z')) ) {
                return 81;
            }
            else {
                return 47;}
            }
        case 'm':
            {
            int LA12_75 = input.LA(3);

            if ( (LA12_75=='p') ) {
                switch ( input.LA(4) ) {
                case 'o':
                    {
                    int LA12_187 = input.LA(5);

                    if ( (LA12_187=='r') ) {
                        int LA12_230 = input.LA(6);

                        if ( (LA12_230=='t') ) {
                            int LA12_265 = input.LA(7);

                            if ( ((LA12_265>='0' && LA12_265<='9')||(LA12_265>='A' && LA12_265<='Z')||LA12_265=='_'||(LA12_265>='a' && LA12_265<='z')) ) {
                                return 81;
                            }
                            else {
                                return 13;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                    }
                case 'l':
                    {
                    int LA12_188 = input.LA(5);

                    if ( (LA12_188=='i') ) {
                        int LA12_231 = input.LA(6);

                        if ( (LA12_231=='e') ) {
                            int LA12_266 = input.LA(7);

                            if ( (LA12_266=='s') ) {
                                int LA12_294 = input.LA(8);

                                if ( ((LA12_294>='0' && LA12_294<='9')||(LA12_294>='A' && LA12_294<='Z')||LA12_294=='_'||(LA12_294>='a' && LA12_294<='z')) ) {
                                    return 81;
                                }
                                else {
                                    return 48;}
                            }
                            else {
                                return 81;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                    }
                default:
                    return 81;}

            }
            else {
                return 81;}
            }
        case 't':
            {
            int LA12_76 = input.LA(3);

            if ( (LA12_76=='e') ) {
                int LA12_145 = input.LA(4);

                if ( (LA12_145=='r') ) {
                    int LA12_189 = input.LA(5);

                    if ( (LA12_189=='a') ) {
                        int LA12_232 = input.LA(6);

                        if ( (LA12_232=='t') ) {
                            int LA12_267 = input.LA(7);

                            if ( (LA12_267=='i') ) {
                                int LA12_295 = input.LA(8);

                                if ( (LA12_295=='o') ) {
                                    int LA12_317 = input.LA(9);

                                    if ( (LA12_317=='n') ) {
                                        int LA12_332 = input.LA(10);

                                        if ( ((LA12_332>='0' && LA12_332<='9')||(LA12_332>='A' && LA12_332<='Z')||LA12_332=='_'||(LA12_332>='a' && LA12_332<='z')) ) {
                                            return 81;
                                        }
                                        else {
                                            return 14;}
                                    }
                                    else {
                                        return 81;}
                                }
                                else {
                                    return 81;}
                            }
                            else {
                                return 81;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
            }
        default:
            return 81;}

    }

    private int mTokensHelper014() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'r':
            {
            int LA12_77 = input.LA(3);

            if ( ((LA12_77>='0' && LA12_77<='9')||(LA12_77>='A' && LA12_77<='Z')||LA12_77=='_'||(LA12_77>='a' && LA12_77<='z')) ) {
                return 81;
            }
            else {
                return 52;}
            }
        case 'p':
            {
            int LA12_78 = input.LA(3);

            if ( (LA12_78=='e') ) {
                int LA12_147 = input.LA(4);

                if ( (LA12_147=='r') ) {
                    int LA12_190 = input.LA(5);

                    if ( (LA12_190=='a') ) {
                        int LA12_233 = input.LA(6);

                        if ( (LA12_233=='t') ) {
                            int LA12_268 = input.LA(7);

                            if ( (LA12_268=='i') ) {
                                int LA12_296 = input.LA(8);

                                if ( (LA12_296=='o') ) {
                                    int LA12_318 = input.LA(9);

                                    if ( (LA12_318=='n') ) {
                                        int LA12_333 = input.LA(10);

                                        if ( ((LA12_333>='0' && LA12_333<='9')||(LA12_333>='A' && LA12_333<='Z')||LA12_333=='_'||(LA12_333>='a' && LA12_333<='z')) ) {
                                            return 81;
                                        }
                                        else {
                                            return 16;}
                                    }
                                    else {
                                        return 81;}
                                }
                                else {
                                    return 81;}
                            }
                            else {
                                return 81;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
            }
        default:
            return 81;}

    }

    private int mTokensHelper015() throws RecognitionException {
        int LA12_15 = input.LA(2);

        if ( (LA12_15=='i') ) {
            int LA12_79 = input.LA(3);

            if ( (LA12_79=='g') ) {
                int LA12_148 = input.LA(4);

                if ( (LA12_148=='h') ) {
                    int LA12_191 = input.LA(5);

                    if ( (LA12_191=='t') ) {
                        int LA12_234 = input.LA(6);

                        if ( ((LA12_234>='0' && LA12_234<='9')||(LA12_234>='A' && LA12_234<='Z')||LA12_234=='_'||(LA12_234>='a' && LA12_234<='z')) ) {
                            return 81;
                        }
                        else {
                            return 21;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
        }
        else {
            return 81;}
    }

    private int mTokensHelper016() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'u':
            {
            int LA12_80 = input.LA(3);

            if ( (LA12_80=='p') ) {
                int LA12_149 = input.LA(4);

                if ( (LA12_149=='e') ) {
                    int LA12_192 = input.LA(5);

                    if ( (LA12_192=='r') ) {
                        int LA12_235 = input.LA(6);

                        if ( ((LA12_235>='0' && LA12_235<='9')||(LA12_235>='A' && LA12_235<='Z')||LA12_235=='_'||(LA12_235>='a' && LA12_235<='z')) ) {
                            return 81;
                        }
                        else {
                            return 22;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
            }
        case 'e':
            {
            int LA12_81 = input.LA(3);

            if ( (LA12_81=='l') ) {
                int LA12_150 = input.LA(4);

                if ( (LA12_150=='f') ) {
                    int LA12_193 = input.LA(5);

                    if ( ((LA12_193>='0' && LA12_193<='9')||(LA12_193>='A' && LA12_193<='Z')||LA12_193=='_'||(LA12_193>='a' && LA12_193<='z')) ) {
                        return 81;
                    }
                    else {
                        return 77;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
            }
        default:
            return 81;}

    }

    private int mTokensHelper017() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'r':
            {
            int LA12_82 = input.LA(3);

            if ( (LA12_82=='u') ) {
                int LA12_151 = input.LA(4);

                if ( (LA12_151=='e') ) {
                    int LA12_194 = input.LA(5);

                    if ( ((LA12_194>='0' && LA12_194<='9')||(LA12_194>='A' && LA12_194<='Z')||LA12_194=='_'||(LA12_194>='a' && LA12_194<='z')) ) {
                        return 81;
                    }
                    else {
                        return 73;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
            }
        case 'y':
            {
            int LA12_83 = input.LA(3);

            if ( (LA12_83=='p') ) {
                int LA12_152 = input.LA(4);

                if ( (LA12_152=='e') ) {
                    int LA12_195 = input.LA(5);

                    if ( ((LA12_195>='0' && LA12_195<='9')||(LA12_195>='A' && LA12_195<='Z')||LA12_195=='_'||(LA12_195>='a' && LA12_195<='z')) ) {
                        return 81;
                    }
                    else {
                        return 23;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
            }
        case 'h':
            {
            int LA12_84 = input.LA(3);

            if ( (LA12_84=='e') ) {
                int LA12_153 = input.LA(4);

                if ( (LA12_153=='n') ) {
                    int LA12_196 = input.LA(5);

                    if ( ((LA12_196>='0' && LA12_196<='9')||(LA12_196>='A' && LA12_196<='Z')||LA12_196=='_'||(LA12_196>='a' && LA12_196<='z')) ) {
                        return 81;
                    }
                    else {
                        return 53;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
            }
        default:
            return 81;}

    }

    private int mTokensHelper018() throws RecognitionException {
        int LA12_18 = input.LA(2);

        if ( (LA12_18=='u') ) {
            int LA12_85 = input.LA(3);

            if ( (LA12_85=='p') ) {
                int LA12_154 = input.LA(4);

                if ( (LA12_154=='l') ) {
                    int LA12_197 = input.LA(5);

                    if ( (LA12_197=='e') ) {
                        int LA12_240 = input.LA(6);

                        if ( ((LA12_240>='0' && LA12_240<='9')||(LA12_240>='A' && LA12_240<='Z')||LA12_240=='_'||(LA12_240>='a' && LA12_240<='z')) ) {
                            return 81;
                        }
                        else {
                            return 24;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
        }
        else {
            return 81;}
    }

    private int mTokensHelper019() throws RecognitionException {
        int LA12_19 = input.LA(2);

        if ( (LA12_19=='n') ) {
            switch ( input.LA(3) ) {
            case 'n':
                {
                int LA12_155 = input.LA(4);

                if ( (LA12_155=='o') ) {
                    int LA12_198 = input.LA(5);

                    if ( (LA12_198=='t') ) {
                        int LA12_241 = input.LA(6);

                        if ( (LA12_241=='a') ) {
                            int LA12_272 = input.LA(7);

                            if ( (LA12_272=='t') ) {
                                int LA12_297 = input.LA(8);

                                if ( (LA12_297=='i') ) {
                                    int LA12_319 = input.LA(9);

                                    if ( (LA12_319=='o') ) {
                                        int LA12_334 = input.LA(10);

                                        if ( (LA12_334=='n') ) {
                                            int LA12_345 = input.LA(11);

                                            if ( ((LA12_345>='0' && LA12_345<='9')||(LA12_345>='A' && LA12_345<='Z')||LA12_345=='_'||(LA12_345>='a' && LA12_345<='z')) ) {
                                                return 81;
                                            }
                                            else {
                                                return 25;}
                                        }
                                        else {
                                            return 81;}
                                    }
                                    else {
                                        return 81;}
                                }
                                else {
                                    return 81;}
                            }
                            else {
                                return 81;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
                }
            case 'd':
                {
                int LA12_156 = input.LA(4);

                if ( ((LA12_156>='0' && LA12_156<='9')||(LA12_156>='A' && LA12_156<='Z')||LA12_156=='_'||(LA12_156>='a' && LA12_156<='z')) ) {
                    return 81;
                }
                else {
                    return 44;}
                }
            default:
                return 81;}

        }
        else {
            return 81;}
    }

    private int mTokensHelper020() throws RecognitionException {
        return 26;
    }

    private int mTokensHelper021() throws RecognitionException {
        return 27;
    }

    private int mTokensHelper022() throws RecognitionException {
        return 28;
    }

    private int mTokensHelper023() throws RecognitionException {
        return 29;
    }

    private int mTokensHelper024() throws RecognitionException {
        return 31;
    }

    private int mTokensHelper025() throws RecognitionException {
        int LA12_25 = input.LA(2);

        if ( (LA12_25=='.') ) {
            return 32;
        }
        else {
            return 40;}
    }

    private int mTokensHelper026() throws RecognitionException {
        return 33;
    }

    private int mTokensHelper027() throws RecognitionException {
        return 34;
    }

    private int mTokensHelper028() throws RecognitionException {
        return 35;
    }

    private int mTokensHelper029() throws RecognitionException {
        switch ( input.LA(2) ) {
        case '>':
            {
            return 58;
            }
        case '=':
            {
            return 57;
            }
        default:
            return 37;}

    }

    private int mTokensHelper030() throws RecognitionException {
        int LA12_30 = input.LA(2);

        if ( (LA12_30=='=') ) {
            return 56;
        }
        else {
            return 38;}
    }

    private int mTokensHelper031() throws RecognitionException {
        int LA12_31 = input.LA(2);

        if ( (LA12_31=='&') ) {
            return 39;
        }
        else {
            return 86;}
    }

    private int mTokensHelper032() throws RecognitionException {
        int LA12_32 = input.LA(2);

        if ( ((LA12_32>='0' && LA12_32<='9')||(LA12_32>='A' && LA12_32<='Z')||LA12_32=='_'||(LA12_32>='a' && LA12_32<='z')) ) {
            return 81;
        }
        else {
            return 42;}
    }

    private int mTokensHelper033() throws RecognitionException {
        switch ( input.LA(2) ) {
        case '>':
            {
            return 59;
            }
        case '-':
            {
            return 84;
            }
        default:
            return 43;}

    }

    private int mTokensHelper034() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'o':
            {
            int LA12_107 = input.LA(3);

            if ( (LA12_107=='t') ) {
                int LA12_157 = input.LA(4);

                if ( ((LA12_157>='0' && LA12_157<='9')||(LA12_157>='A' && LA12_157<='Z')||LA12_157=='_'||(LA12_157>='a' && LA12_157<='z')) ) {
                    return 81;
                }
                else {
                    return 51;}
            }
            else {
                return 81;}
            }
        case 'u':
            {
            int LA12_108 = input.LA(3);

            if ( (LA12_108=='l') ) {
                int LA12_158 = input.LA(4);

                if ( (LA12_158=='l') ) {
                    int LA12_201 = input.LA(5);

                    if ( ((LA12_201>='0' && LA12_201<='9')||(LA12_201>='A' && LA12_201<='Z')||LA12_201=='_'||(LA12_201>='a' && LA12_201<='z')) ) {
                        return 81;
                    }
                    else {
                        return 76;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
            }
        default:
            return 81;}

    }

    private int mTokensHelper035() throws RecognitionException {
        int LA12_35 = input.LA(2);

        if ( (LA12_35=='o') ) {
            int LA12_109 = input.LA(3);

            if ( (LA12_109=='r') ) {
                int LA12_159 = input.LA(4);

                if ( ((LA12_159>='0' && LA12_159<='9')||(LA12_159>='A' && LA12_159<='Z')||LA12_159=='_'||(LA12_159>='a' && LA12_159<='z')) ) {
                    return 81;
                }
                else {
                    return 54;}
            }
            else {
                return 81;}
        }
        else {
            return 81;}
    }

    private int mTokensHelper036() throws RecognitionException {
        switch ( input.LA(2) ) {
        case '*':
            {
            return 83;
            }
        case '\'':
            {
            return 78;
            }
        default:
            return 55;}

    }

    private int mTokensHelper037() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'o':
            {
            int LA12_113 = input.LA(3);

            if ( (LA12_113=='o') ) {
                int LA12_160 = input.LA(4);

                if ( (LA12_160=='l') ) {
                    int LA12_203 = input.LA(5);

                    if ( (LA12_203=='e') ) {
                        int LA12_243 = input.LA(6);

                        if ( (LA12_243=='a') ) {
                            int LA12_273 = input.LA(7);

                            if ( (LA12_273=='n') ) {
                                int LA12_298 = input.LA(8);

                                if ( ((LA12_298>='0' && LA12_298<='9')||(LA12_298>='A' && LA12_298<='Z')||LA12_298=='_'||(LA12_298>='a' && LA12_298<='z')) ) {
                                    return 81;
                                }
                                else {
                                    return 60;}
                            }
                            else {
                                return 81;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
            }
        case 'a':
            {
            int LA12_114 = input.LA(3);

            if ( (LA12_114=='g') ) {
                int LA12_161 = input.LA(4);

                if ( ((LA12_161>='0' && LA12_161<='9')||(LA12_161>='A' && LA12_161<='Z')||LA12_161=='_'||(LA12_161>='a' && LA12_161<='z')) ) {
                    return 81;
                }
                else {
                    return 69;}
            }
            else {
                return 81;}
            }
        default:
            return 81;}

    }

    private int mTokensHelper038() throws RecognitionException {
        int LA12_38 = input.LA(2);

        if ( (LA12_38=='n') ) {
            int LA12_115 = input.LA(3);

            if ( (LA12_115=='t') ) {
                int LA12_162 = input.LA(4);

                if ( (LA12_162=='e') ) {
                    int LA12_205 = input.LA(5);

                    if ( (LA12_205=='g') ) {
                        int LA12_244 = input.LA(6);

                        if ( (LA12_244=='e') ) {
                            int LA12_274 = input.LA(7);

                            if ( (LA12_274=='r') ) {
                                int LA12_299 = input.LA(8);

                                if ( ((LA12_299>='0' && LA12_299<='9')||(LA12_299>='A' && LA12_299<='Z')||LA12_299=='_'||(LA12_299>='a' && LA12_299<='z')) ) {
                                    return 81;
                                }
                                else {
                                    return 61;}
                            }
                            else {
                                return 81;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
        }
        else {
            return 81;}
    }

    private int mTokensHelper039() throws RecognitionException {
        int LA12_39 = input.LA(2);

        if ( (LA12_39=='e') ) {
            int LA12_116 = input.LA(3);

            if ( (LA12_116=='a') ) {
                int LA12_163 = input.LA(4);

                if ( (LA12_163=='l') ) {
                    int LA12_206 = input.LA(5);

                    if ( ((LA12_206>='0' && LA12_206<='9')||(LA12_206>='A' && LA12_206<='Z')||LA12_206=='_'||(LA12_206>='a' && LA12_206<='z')) ) {
                        return 81;
                    }
                    else {
                        return 62;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
        }
        else {
            return 81;}
    }

    private int mTokensHelper040() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'e':
            {
            switch ( input.LA(3) ) {
            case 't':
                {
                int LA12_164 = input.LA(4);

                if ( ((LA12_164>='0' && LA12_164<='9')||(LA12_164>='A' && LA12_164<='Z')||LA12_164=='_'||(LA12_164>='a' && LA12_164<='z')) ) {
                    return 81;
                }
                else {
                    return 68;}
                }
            case 'q':
                {
                int LA12_165 = input.LA(4);

                if ( (LA12_165=='u') ) {
                    int LA12_208 = input.LA(5);

                    if ( (LA12_208=='e') ) {
                        int LA12_246 = input.LA(6);

                        if ( (LA12_246=='n') ) {
                            int LA12_275 = input.LA(7);

                            if ( (LA12_275=='c') ) {
                                int LA12_300 = input.LA(8);

                                if ( (LA12_300=='e') ) {
                                    int LA12_322 = input.LA(9);

                                    if ( ((LA12_322>='0' && LA12_322<='9')||(LA12_322>='A' && LA12_322<='Z')||LA12_322=='_'||(LA12_322>='a' && LA12_322<='z')) ) {
                                        return 81;
                                    }
                                    else {
                                        return 70;}
                                }
                                else {
                                    return 81;}
                            }
                            else {
                                return 81;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
                }
            default:
                return 81;}

            }
        case 't':
            {
            int LA12_118 = input.LA(3);

            if ( (LA12_118=='r') ) {
                int LA12_166 = input.LA(4);

                if ( (LA12_166=='i') ) {
                    int LA12_209 = input.LA(5);

                    if ( (LA12_209=='n') ) {
                        int LA12_247 = input.LA(6);

                        if ( (LA12_247=='g') ) {
                            int LA12_276 = input.LA(7);

                            if ( ((LA12_276>='0' && LA12_276<='9')||(LA12_276>='A' && LA12_276<='Z')||LA12_276=='_'||(LA12_276>='a' && LA12_276<='z')) ) {
                                return 81;
                            }
                            else {
                                return 63;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
            }
        default:
            return 81;}

    }

    private int mTokensHelper041() throws RecognitionException {
        int LA12_41 = input.LA(2);

        if ( (LA12_41=='n') ) {
            int LA12_119 = input.LA(3);

            if ( (LA12_119=='l') ) {
                int LA12_167 = input.LA(4);

                if ( (LA12_167=='i') ) {
                    int LA12_210 = input.LA(5);

                    if ( (LA12_210=='m') ) {
                        int LA12_248 = input.LA(6);

                        if ( (LA12_248=='i') ) {
                            int LA12_277 = input.LA(7);

                            if ( (LA12_277=='t') ) {
                                int LA12_302 = input.LA(8);

                                if ( (LA12_302=='e') ) {
                                    int LA12_323 = input.LA(9);

                                    if ( (LA12_323=='d') ) {
                                        int LA12_336 = input.LA(10);

                                        if ( (LA12_336=='N') ) {
                                            int LA12_346 = input.LA(11);

                                            if ( (LA12_346=='a') ) {
                                                int LA12_354 = input.LA(12);

                                                if ( (LA12_354=='t') ) {
                                                    int LA12_359 = input.LA(13);

                                                    if ( (LA12_359=='u') ) {
                                                        int LA12_361 = input.LA(14);

                                                        if ( (LA12_361=='r') ) {
                                                            int LA12_363 = input.LA(15);

                                                            if ( (LA12_363=='a') ) {
                                                                int LA12_364 = input.LA(16);

                                                                if ( (LA12_364=='l') ) {
                                                                    int LA12_365 = input.LA(17);

                                                                    if ( ((LA12_365>='0' && LA12_365<='9')||(LA12_365>='A' && LA12_365<='Z')||LA12_365=='_'||(LA12_365>='a' && LA12_365<='z')) ) {
                                                                        return 81;
                                                                    }
                                                                    else {
                                                                        return 64;}
                                                                }
                                                                else {
                                                                    return 81;}
                                                            }
                                                            else {
                                                                return 81;}
                                                        }
                                                        else {
                                                            return 81;}
                                                    }
                                                    else {
                                                        return 81;}
                                                }
                                                else {
                                                    return 81;}
                                            }
                                            else {
                                                return 81;}
                                        }
                                        else {
                                            return 81;}
                                    }
                                    else {
                                        return 81;}
                                }
                                else {
                                    return 81;}
                            }
                            else {
                                return 81;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
        }
        else {
            return 81;}
    }

    private int mTokensHelper042() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'c':
            {
            int LA12_120 = input.LA(3);

            if ( (LA12_120=='l') ) {
                switch ( input.LA(4) ) {
                case 'I':
                    {
                    int LA12_211 = input.LA(5);

                    if ( (LA12_211=='n') ) {
                        int LA12_249 = input.LA(6);

                        if ( (LA12_249=='v') ) {
                            int LA12_278 = input.LA(7);

                            if ( (LA12_278=='a') ) {
                                int LA12_303 = input.LA(8);

                                if ( (LA12_303=='l') ) {
                                    int LA12_324 = input.LA(9);

                                    if ( (LA12_324=='i') ) {
                                        int LA12_337 = input.LA(10);

                                        if ( (LA12_337=='d') ) {
                                            int LA12_347 = input.LA(11);

                                            if ( ((LA12_347>='0' && LA12_347<='9')||(LA12_347>='A' && LA12_347<='Z')||LA12_347=='_'||(LA12_347>='a' && LA12_347<='z')) ) {
                                                return 81;
                                            }
                                            else {
                                                return 66;}
                                        }
                                        else {
                                            return 81;}
                                    }
                                    else {
                                        return 81;}
                                }
                                else {
                                    return 81;}
                            }
                            else {
                                return 81;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                    }
                case 'A':
                    {
                    int LA12_212 = input.LA(5);

                    if ( (LA12_212=='n') ) {
                        int LA12_250 = input.LA(6);

                        if ( (LA12_250=='y') ) {
                            int LA12_279 = input.LA(7);

                            if ( ((LA12_279>='0' && LA12_279<='9')||(LA12_279>='A' && LA12_279<='Z')||LA12_279=='_'||(LA12_279>='a' && LA12_279<='z')) ) {
                                return 81;
                            }
                            else {
                                return 65;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                    }
                case 'V':
                    {
                    int LA12_213 = input.LA(5);

                    if ( (LA12_213=='o') ) {
                        int LA12_251 = input.LA(6);

                        if ( (LA12_251=='i') ) {
                            int LA12_280 = input.LA(7);

                            if ( (LA12_280=='d') ) {
                                int LA12_305 = input.LA(8);

                                if ( ((LA12_305>='0' && LA12_305<='9')||(LA12_305>='A' && LA12_305<='Z')||LA12_305=='_'||(LA12_305>='a' && LA12_305<='z')) ) {
                                    return 81;
                                }
                                else {
                                    return 67;}
                            }
                            else {
                                return 81;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                    }
                default:
                    return 81;}

            }
            else {
                return 81;}
            }
        case 'r':
            {
            int LA12_121 = input.LA(3);

            if ( (LA12_121=='d') ) {
                int LA12_169 = input.LA(4);

                if ( (LA12_169=='e') ) {
                    int LA12_214 = input.LA(5);

                    if ( (LA12_214=='r') ) {
                        int LA12_252 = input.LA(6);

                        if ( (LA12_252=='e') ) {
                            int LA12_281 = input.LA(7);

                            if ( (LA12_281=='d') ) {
                                int LA12_306 = input.LA(8);

                                if ( (LA12_306=='S') ) {
                                    int LA12_326 = input.LA(9);

                                    if ( (LA12_326=='e') ) {
                                        int LA12_338 = input.LA(10);

                                        if ( (LA12_338=='t') ) {
                                            int LA12_348 = input.LA(11);

                                            if ( ((LA12_348>='0' && LA12_348<='9')||(LA12_348>='A' && LA12_348<='Z')||LA12_348=='_'||(LA12_348>='a' && LA12_348<='z')) ) {
                                                return 81;
                                            }
                                            else {
                                                return 72;}
                                        }
                                        else {
                                            return 81;}
                                    }
                                    else {
                                        return 81;}
                                }
                                else {
                                    return 81;}
                            }
                            else {
                                return 81;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
            }
        default:
            return 81;}

    }

    private int mTokensHelper043() throws RecognitionException {
        int LA12_43 = input.LA(2);

        if ( (LA12_43=='o') ) {
            int LA12_122 = input.LA(3);

            if ( (LA12_122=='l') ) {
                int LA12_170 = input.LA(4);

                if ( (LA12_170=='l') ) {
                    int LA12_215 = input.LA(5);

                    if ( (LA12_215=='e') ) {
                        int LA12_253 = input.LA(6);

                        if ( (LA12_253=='c') ) {
                            int LA12_282 = input.LA(7);

                            if ( (LA12_282=='t') ) {
                                int LA12_307 = input.LA(8);

                                if ( (LA12_307=='i') ) {
                                    int LA12_327 = input.LA(9);

                                    if ( (LA12_327=='o') ) {
                                        int LA12_339 = input.LA(10);

                                        if ( (LA12_339=='n') ) {
                                            int LA12_349 = input.LA(11);

                                            if ( ((LA12_349>='0' && LA12_349<='9')||(LA12_349>='A' && LA12_349<='Z')||LA12_349=='_'||(LA12_349>='a' && LA12_349<='z')) ) {
                                                return 81;
                                            }
                                            else {
                                                return 71;}
                                        }
                                        else {
                                            return 81;}
                                    }
                                    else {
                                        return 81;}
                                }
                                else {
                                    return 81;}
                            }
                            else {
                                return 81;}
                        }
                        else {
                            return 81;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
        }
        else {
            return 81;}
    }

    private int mTokensHelper044() throws RecognitionException {
        int LA12_44 = input.LA(2);

        if ( (LA12_44=='a') ) {
            int LA12_123 = input.LA(3);

            if ( (LA12_123=='l') ) {
                int LA12_171 = input.LA(4);

                if ( (LA12_171=='s') ) {
                    int LA12_216 = input.LA(5);

                    if ( (LA12_216=='e') ) {
                        int LA12_254 = input.LA(6);

                        if ( ((LA12_254>='0' && LA12_254<='9')||(LA12_254>='A' && LA12_254<='Z')||LA12_254=='_'||(LA12_254>='a' && LA12_254<='z')) ) {
                            return 81;
                        }
                        else {
                            return 74;}
                    }
                    else {
                        return 81;}
                }
                else {
                    return 81;}
            }
            else {
                return 81;}
        }
        else {
            return 81;}
    }

    private int mTokensHelper045() throws RecognitionException {
        int LA12_45 = input.LA(2);

        if ( ((LA12_45>='\u0000' && LA12_45<='\uFFFE')) ) {
            return 79;
        }
        else {
            return 86;}
    }

    private int mTokensHelper046() throws RecognitionException {
        int LA12_46 = input.LA(2);

        if ( ((LA12_46>='\u0000' && LA12_46<='\uFFFE')) ) {
            return 80;
        }
        else {
            return 86;}
    }

    private int mTokensHelper047() throws RecognitionException {
        return 81;
    }

    private int mTokensHelper048() throws RecognitionException {
        return 81;
    }

    private int mTokensHelper049() throws RecognitionException {
        return 82;
    }

    private int mTokensHelper050() throws RecognitionException {
        return 85;
    }

    private int mTokensHelper051() throws RecognitionException {
        return 86;
    }

    private int mTokensHelper052() throws RecognitionException {
        NoViableAltException nvae =
            new NoViableAltException("1:1: Tokens : ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | RULE_ML_SINGLE_QUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

        throw nvae;
    }



 

}