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
    public static final int T29=29;
    public static final int T70=70;
    public static final int T74=74;
    public static final int RULE_ML_SINGLE_QUOTED_STRING=8;
    public static final int T85=85;
    public static final int T20=20;
    public static final int T102=102;
    public static final int T18=18;
    public static final int T103=103;
    public static final int T32=32;
    public static final int T17=17;
    public static final int T81=81;
    public static final int RULE_DOUBLE_QUOTED_STRING=7;
    public static final int T16=16;
    public static final int T41=41;
    public static final int T24=24;
    public static final int T19=19;
    public static final int T62=62;
    public static final int T68=68;
    public static final int T73=73;
    public static final int T84=84;
    public static final int T33=33;
    public static final int T78=78;
    public static final int T42=42;
    public static final int T96=96;
    public static final int T71=71;
    public static final int T72=72;
    public static final int T94=94;
    public static final int T76=76;
    public static final int T75=75;
    public static final int RULE_WS=12;
    public static final int T15=15;
    public static final int T89=89;
    public static final int T67=67;
    public static final int T31=31;
    public static final int T60=60;
    public static final int T82=82;
    public static final int T100=100;
    public static final int T49=49;
    public static final int RULE_SL_COMMENT=11;
    public static final int T30=30;
    public static final int T79=79;
    public static final int T14=14;
    public static final int T36=36;
    public static final int T58=58;
    public static final int T93=93;
    public static final int T35=35;
    public static final int T83=83;
    public static final int T61=61;
    public static final int T45=45;
    public static final int T34=34;
    public static final int T101=101;
    public static final int T64=64;
    public static final int T25=25;
    public static final int T91=91;
    public static final int T37=37;
    public static final int T86=86;
    public static final int T26=26;
    public static final int RULE_INT=5;
    public static final int T51=51;
    public static final int RULE_SINGLE_QUOTED_STRING=4;
    public static final int T46=46;
    public static final int T77=77;
    public static final int T38=38;
    public static final int T69=69;
    public static final int T39=39;
    public static final int T21=21;
    public static final int T44=44;
    public static final int RULE_ML_COMMENT=10;
    public static final int T55=55;
    public static final int RULE_ID=6;
    public static final int T95=95;
    public static final int T22=22;
    public static final int T50=50;
    public static final int T92=92;
    public static final int T43=43;
    public static final int T28=28;
    public static final int T23=23;
    public static final int T40=40;
    public static final int T66=66;
    public static final int T88=88;
    public static final int T63=63;
    public static final int T57=57;
    public static final int T65=65;
    public static final int T98=98;
    public static final int T56=56;
    public static final int T87=87;
    public static final int T80=80;
    public static final int T59=59;
    public static final int T97=97;
    public static final int T48=48;
    public static final int T54=54;
    public static final int EOF=-1;
    public static final int T47=47;
    public static final int Tokens=104;
    public static final int RULE_DOCUMENTATION=9;
    public static final int T53=53;
    public static final int RULE_ANY_OTHER=13;
    public static final int T99=99;
    public static final int T27=27;
    public static final int T52=52;
    public static final int T90=90;
    public InternalOCLstdlibLexer() {;} 
    public InternalOCLstdlibLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g"; }

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
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
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
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
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
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
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
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
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
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
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
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
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
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
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
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
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
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
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
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
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
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
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
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
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
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
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:23:5: ( 'inv' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:23:7: 'inv'
            {
            match("inv"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:24:5: ( 'iteration' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:24:7: 'iteration'
            {
            match("iteration"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:25:5: ( 'left' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:25:7: 'left'
            {
            match("left"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:26:5: ( 'operation' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:26:7: 'operation'
            {
            match("operation"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:27:5: ( 'package' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:27:7: 'package'
            {
            match("package"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:28:5: ( 'post' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:28:7: 'post'
            {
            match("post"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:29:5: ( 'pre' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:29:7: 'pre'
            {
            match("pre"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:30:5: ( 'property' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:30:7: 'property'
            {
            match("property"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:31:5: ( 'right' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:31:7: 'right'
            {
            match("right"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:32:5: ( 'static' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:32:7: 'static'
            {
            match("static"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:33:5: ( 'super' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:33:7: 'super'
            {
            match("super"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:34:5: ( 'type' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:34:7: 'type'
            {
            match("type"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:35:5: ( 'Tuple' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:35:7: 'Tuple'
            {
            match("Tuple"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:36:5: ( 'AnyType' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:36:7: 'AnyType'
            {
            match("AnyType"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:37:5: ( 'BagType' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:37:7: 'BagType'
            {
            match("BagType"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:38:5: ( 'Class' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:38:7: 'Class'
            {
            match("Class"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:39:5: ( 'CollectionType' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:39:7: 'CollectionType'
            {
            match("CollectionType"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:40:5: ( 'InvalidType' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:40:7: 'InvalidType'
            {
            match("InvalidType"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:41:5: ( 'OrderedSetType' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:41:7: 'OrderedSetType'
            {
            match("OrderedSetType"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:42:5: ( 'PrimitiveType' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:42:7: 'PrimitiveType'
            {
            match("PrimitiveType"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:43:5: ( 'SequenceType' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:43:7: 'SequenceType'
            {
            match("SequenceType"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:44:5: ( 'SetType' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:44:7: 'SetType'
            {
            match("SetType"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:45:5: ( 'TupleType' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:45:7: 'TupleType'
            {
            match("TupleType"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:46:5: ( 'VoidType' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:46:7: 'VoidType'
            {
            match("VoidType"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:47:5: ( 'annotation' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:47:7: 'annotation'
            {
            match("annotation"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:48:5: ( '(' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:48:7: '('
            {
            match('('); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:49:5: ( ',' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:49:7: ','
            {
            match(','); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:50:5: ( ')' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:50:7: ')'
            {
            match(')'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:51:5: ( '|' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:51:7: '|'
            {
            match('|'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:52:5: ( '=>' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:52:7: '=>'
            {
            match("=>"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:53:5: ( '[' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:53:7: '['
            {
            match('['); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:54:5: ( '..' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:54:7: '..'
            {
            match(".."); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:55:5: ( '+' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:55:7: '+'
            {
            match('+'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:56:5: ( '?' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:56:7: '?'
            {
            match('?'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:57:5: ( ']' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:57:7: ']'
            {
            match(']'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:58:5: ( '::' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:58:7: '::'
            {
            match("::"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:59:5: ( '<' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:59:7: '<'
            {
            match('<'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:60:5: ( '>' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:60:7: '>'
            {
            match('>'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:61:5: ( '&&' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:61:7: '&&'
            {
            match("&&"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:62:5: ( '.' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:62:7: '.'
            {
            match('.'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:63:5: ( 'e' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:63:7: 'e'
            {
            match('e'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:64:5: ( 'E' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:64:7: 'E'
            {
            match('E'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:65:5: ( '-' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:65:7: '-'
            {
            match('-'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:66:5: ( 'and' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:66:7: 'and'
            {
            match("and"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:67:5: ( 'else' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:67:7: 'else'
            {
            match("else"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:68:5: ( 'endif' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:68:7: 'endif'
            {
            match("endif"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:69:5: ( 'if' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:69:7: 'if'
            {
            match("if"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:70:5: ( 'implies' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:70:7: 'implies'
            {
            match("implies"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:71:5: ( 'in' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:71:7: 'in'
            {
            match("in"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:72:5: ( 'let' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:72:7: 'let'
            {
            match("let"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:73:5: ( 'not' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:73:7: 'not'
            {
            match("not"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:74:5: ( 'or' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:74:7: 'or'
            {
            match("or"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:75:5: ( 'then' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:75:7: 'then'
            {
            match("then"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:76:5: ( 'xor' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:76:7: 'xor'
            {
            match("xor"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:77:5: ( '/' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:77:7: '/'
            {
            match('/'); 

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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:78:5: ( '>=' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:78:7: '>='
            {
            match(">="); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:79:5: ( '<=' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:79:7: '<='
            {
            match("<="); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:80:5: ( '<>' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:80:7: '<>'
            {
            match("<>"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:81:5: ( '->' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:81:7: '->'
            {
            match("->"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:82:5: ( 'Boolean' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:82:7: 'Boolean'
            {
            match("Boolean"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:83:5: ( 'Integer' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:83:7: 'Integer'
            {
            match("Integer"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:84:5: ( 'Real' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:84:7: 'Real'
            {
            match("Real"); 


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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:85:5: ( 'String' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:85:7: 'String'
            {
            match("String"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T89

    // $ANTLR start T90
    public final void mT90() throws RecognitionException {
        try {
            int _type = T90;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:86:5: ( 'UnlimitedNatural' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:86:7: 'UnlimitedNatural'
            {
            match("UnlimitedNatural"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T90

    // $ANTLR start T91
    public final void mT91() throws RecognitionException {
        try {
            int _type = T91;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:87:5: ( 'OclAny' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:87:7: 'OclAny'
            {
            match("OclAny"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T91

    // $ANTLR start T92
    public final void mT92() throws RecognitionException {
        try {
            int _type = T92;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:88:5: ( 'OclInvalid' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:88:7: 'OclInvalid'
            {
            match("OclInvalid"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T92

    // $ANTLR start T93
    public final void mT93() throws RecognitionException {
        try {
            int _type = T93;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:89:5: ( 'OclVoid' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:89:7: 'OclVoid'
            {
            match("OclVoid"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T93

    // $ANTLR start T94
    public final void mT94() throws RecognitionException {
        try {
            int _type = T94;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:90:5: ( 'Set' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:90:7: 'Set'
            {
            match("Set"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T94

    // $ANTLR start T95
    public final void mT95() throws RecognitionException {
        try {
            int _type = T95;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:91:5: ( 'Bag' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:91:7: 'Bag'
            {
            match("Bag"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T95

    // $ANTLR start T96
    public final void mT96() throws RecognitionException {
        try {
            int _type = T96;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:92:5: ( 'Sequence' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:92:7: 'Sequence'
            {
            match("Sequence"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T96

    // $ANTLR start T97
    public final void mT97() throws RecognitionException {
        try {
            int _type = T97;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:93:5: ( 'Collection' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:93:7: 'Collection'
            {
            match("Collection"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T97

    // $ANTLR start T98
    public final void mT98() throws RecognitionException {
        try {
            int _type = T98;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:94:5: ( 'OrderedSet' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:94:7: 'OrderedSet'
            {
            match("OrderedSet"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T98

    // $ANTLR start T99
    public final void mT99() throws RecognitionException {
        try {
            int _type = T99;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:95:5: ( 'true' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:95:7: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T99

    // $ANTLR start T100
    public final void mT100() throws RecognitionException {
        try {
            int _type = T100;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:96:6: ( 'false' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:96:8: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T100

    // $ANTLR start T101
    public final void mT101() throws RecognitionException {
        try {
            int _type = T101;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:97:6: ( 'invalid' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:97:8: 'invalid'
            {
            match("invalid"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T101

    // $ANTLR start T102
    public final void mT102() throws RecognitionException {
        try {
            int _type = T102;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:98:6: ( 'null' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:98:8: 'null'
            {
            match("null"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T102

    // $ANTLR start T103
    public final void mT103() throws RecognitionException {
        try {
            int _type = T103;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:99:6: ( 'self' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:99:8: 'self'
            {
            match("self"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T103

    // $ANTLR start RULE_ML_SINGLE_QUOTED_STRING
    public final void mRULE_ML_SINGLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_ML_SINGLE_QUOTED_STRING;
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8261:30: ( '/\\'' ( options {greedy=false; } : . )* '\\'/' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8261:32: '/\\'' ( options {greedy=false; } : . )* '\\'/'
            {
            match("/\'"); 

            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8261:38: ( options {greedy=false; } : . )*
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
            	    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8261:66: .
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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8263:27: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8263:29: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8263:33: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8263:34: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
            	    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8263:79: ~ ( ( '\\\\' | '\"' ) )
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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8265:27: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8265:29: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8265:34: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
            	    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8265:35: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
            	    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8265:80: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8267:9: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '_' RULE_SINGLE_QUOTED_STRING ) )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8267:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '_' RULE_SINGLE_QUOTED_STRING )
            {
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8267:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '_' RULE_SINGLE_QUOTED_STRING )
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
                    new NoViableAltException("8267:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '_' RULE_SINGLE_QUOTED_STRING )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8267:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8267:36: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
                    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8267:70: '_' RULE_SINGLE_QUOTED_STRING
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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8269:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8269:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8269:12: ( '0' .. '9' )+
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
            	    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8269:13: '0' .. '9'
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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8271:20: ( '/**' ( options {greedy=false; } : . )* '**/' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8271:22: '/**' ( options {greedy=false; } : . )* '**/'
            {
            match("/**"); 

            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8271:28: ( options {greedy=false; } : . )*
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
            	    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8271:56: .
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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8273:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8273:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
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

            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8273:31: ( options {greedy=false; } : . )*
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
            	    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8273:59: .
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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8275:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8275:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8275:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8275:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8275:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8275:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8275:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8275:41: '\\r'
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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8277:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8277:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8277:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8279:16: ( . )
            // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:8279:18: .
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
        // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:8: ( T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | RULE_ML_SINGLE_QUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ID | RULE_INT | RULE_DOCUMENTATION | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=100;
        int LA13_0 = input.LA(1);

        if ( (LA13_0=='l') ) {
            alt13 = mTokensHelper001();
        }
        else if ( (LA13_0=='m') ) {
            alt13 = mTokensHelper002();
        }
        else if ( (LA13_0==':') ) {
            alt13 = mTokensHelper003();
        }
        else if ( (LA13_0=='=') ) {
            alt13 = mTokensHelper004();
        }
        else if ( (LA13_0=='{') ) {
            alt13 = mTokensHelper005();
        }
        else if ( (LA13_0=='p') ) {
            alt13 = mTokensHelper006();
        }
        else if ( (LA13_0==';') ) {
            alt13 = mTokensHelper007();
        }
        else if ( (LA13_0=='}') ) {
            alt13 = mTokensHelper008();
        }
        else if ( (LA13_0=='*') ) {
            alt13 = mTokensHelper009();
        }
        else if ( (LA13_0=='c') ) {
            alt13 = mTokensHelper010();
        }
        else if ( (LA13_0=='d') ) {
            alt13 = mTokensHelper011();
        }
        else if ( (LA13_0=='e') ) {
            alt13 = mTokensHelper012();
        }
        else if ( (LA13_0=='i') ) {
            alt13 = mTokensHelper013();
        }
        else if ( (LA13_0=='o') ) {
            alt13 = mTokensHelper014();
        }
        else if ( (LA13_0=='r') ) {
            alt13 = mTokensHelper015();
        }
        else if ( (LA13_0=='s') ) {
            alt13 = mTokensHelper016();
        }
        else if ( (LA13_0=='t') ) {
            alt13 = mTokensHelper017();
        }
        else if ( (LA13_0=='T') ) {
            alt13 = mTokensHelper018();
        }
        else if ( (LA13_0=='A') ) {
            alt13 = mTokensHelper019();
        }
        else if ( (LA13_0=='B') ) {
            alt13 = mTokensHelper020();
        }
        else if ( (LA13_0=='C') ) {
            alt13 = mTokensHelper021();
        }
        else if ( (LA13_0=='I') ) {
            alt13 = mTokensHelper022();
        }
        else if ( (LA13_0=='O') ) {
            alt13 = mTokensHelper023();
        }
        else if ( (LA13_0=='P') ) {
            alt13 = mTokensHelper024();
        }
        else if ( (LA13_0=='S') ) {
            alt13 = mTokensHelper025();
        }
        else if ( (LA13_0=='V') ) {
            alt13 = mTokensHelper026();
        }
        else if ( (LA13_0=='a') ) {
            alt13 = mTokensHelper027();
        }
        else if ( (LA13_0=='(') ) {
            alt13 = mTokensHelper028();
        }
        else if ( (LA13_0==',') ) {
            alt13 = mTokensHelper029();
        }
        else if ( (LA13_0==')') ) {
            alt13 = mTokensHelper030();
        }
        else if ( (LA13_0=='|') ) {
            alt13 = mTokensHelper031();
        }
        else if ( (LA13_0=='[') ) {
            alt13 = mTokensHelper032();
        }
        else if ( (LA13_0=='.') ) {
            alt13 = mTokensHelper033();
        }
        else if ( (LA13_0=='+') ) {
            alt13 = mTokensHelper034();
        }
        else if ( (LA13_0=='?') ) {
            alt13 = mTokensHelper035();
        }
        else if ( (LA13_0==']') ) {
            alt13 = mTokensHelper036();
        }
        else if ( (LA13_0=='<') ) {
            alt13 = mTokensHelper037();
        }
        else if ( (LA13_0=='>') ) {
            alt13 = mTokensHelper038();
        }
        else if ( (LA13_0=='&') ) {
            alt13 = mTokensHelper039();
        }
        else if ( (LA13_0=='E') ) {
            alt13 = mTokensHelper040();
        }
        else if ( (LA13_0=='-') ) {
            alt13 = mTokensHelper041();
        }
        else if ( (LA13_0=='n') ) {
            alt13 = mTokensHelper042();
        }
        else if ( (LA13_0=='x') ) {
            alt13 = mTokensHelper043();
        }
        else if ( (LA13_0=='/') ) {
            alt13 = mTokensHelper044();
        }
        else if ( (LA13_0=='R') ) {
            alt13 = mTokensHelper045();
        }
        else if ( (LA13_0=='U') ) {
            alt13 = mTokensHelper046();
        }
        else if ( (LA13_0=='f') ) {
            alt13 = mTokensHelper047();
        }
        else if ( (LA13_0=='\"') ) {
            alt13 = mTokensHelper048();
        }
        else if ( (LA13_0=='\'') ) {
            alt13 = mTokensHelper049();
        }
        else if ( (LA13_0=='_') ) {
            alt13 = mTokensHelper050();
        }
        else if ( (LA13_0=='D'||(LA13_0>='F' && LA13_0<='H')||(LA13_0>='J' && LA13_0<='N')||LA13_0=='Q'||(LA13_0>='W' && LA13_0<='Z')||LA13_0=='b'||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='k')||LA13_0=='q'||(LA13_0>='u' && LA13_0<='w')||(LA13_0>='y' && LA13_0<='z')) ) {
            alt13 = mTokensHelper051();
        }
        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {
            alt13 = mTokensHelper052();
        }
        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
            alt13 = mTokensHelper053();
        }
        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='%')||LA13_0=='@'||LA13_0=='\\'||LA13_0=='^'||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFE')) ) {
            alt13 = mTokensHelper054();
        }
        else {
            alt13 = mTokensHelper055();
        }
        switch (alt13) {
            case 1 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:10: T14
                {
                mT14(); 

                }
                break;
            case 2 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:14: T15
                {
                mT15(); 

                }
                break;
            case 3 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:18: T16
                {
                mT16(); 

                }
                break;
            case 4 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:22: T17
                {
                mT17(); 

                }
                break;
            case 5 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:26: T18
                {
                mT18(); 

                }
                break;
            case 6 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:30: T19
                {
                mT19(); 

                }
                break;
            case 7 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:34: T20
                {
                mT20(); 

                }
                break;
            case 8 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:38: T21
                {
                mT21(); 

                }
                break;
            case 9 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:42: T22
                {
                mT22(); 

                }
                break;
            case 10 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:46: T23
                {
                mT23(); 

                }
                break;
            case 11 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:50: T24
                {
                mT24(); 

                }
                break;
            case 12 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:54: T25
                {
                mT25(); 

                }
                break;
            case 13 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:58: T26
                {
                mT26(); 

                }
                break;
            case 14 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:62: T27
                {
                mT27(); 

                }
                break;
            case 15 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:66: T28
                {
                mT28(); 

                }
                break;
            case 16 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:70: T29
                {
                mT29(); 

                }
                break;
            case 17 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:74: T30
                {
                mT30(); 

                }
                break;
            case 18 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:78: T31
                {
                mT31(); 

                }
                break;
            case 19 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:82: T32
                {
                mT32(); 

                }
                break;
            case 20 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:86: T33
                {
                mT33(); 

                }
                break;
            case 21 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:90: T34
                {
                mT34(); 

                }
                break;
            case 22 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:94: T35
                {
                mT35(); 

                }
                break;
            case 23 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:98: T36
                {
                mT36(); 

                }
                break;
            case 24 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:102: T37
                {
                mT37(); 

                }
                break;
            case 25 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:106: T38
                {
                mT38(); 

                }
                break;
            case 26 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:110: T39
                {
                mT39(); 

                }
                break;
            case 27 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:114: T40
                {
                mT40(); 

                }
                break;
            case 28 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:118: T41
                {
                mT41(); 

                }
                break;
            case 29 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:122: T42
                {
                mT42(); 

                }
                break;
            case 30 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:126: T43
                {
                mT43(); 

                }
                break;
            case 31 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:130: T44
                {
                mT44(); 

                }
                break;
            case 32 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:134: T45
                {
                mT45(); 

                }
                break;
            case 33 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:138: T46
                {
                mT46(); 

                }
                break;
            case 34 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:142: T47
                {
                mT47(); 

                }
                break;
            case 35 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:146: T48
                {
                mT48(); 

                }
                break;
            case 36 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:150: T49
                {
                mT49(); 

                }
                break;
            case 37 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:154: T50
                {
                mT50(); 

                }
                break;
            case 38 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:158: T51
                {
                mT51(); 

                }
                break;
            case 39 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:162: T52
                {
                mT52(); 

                }
                break;
            case 40 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:166: T53
                {
                mT53(); 

                }
                break;
            case 41 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:170: T54
                {
                mT54(); 

                }
                break;
            case 42 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:174: T55
                {
                mT55(); 

                }
                break;
            case 43 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:178: T56
                {
                mT56(); 

                }
                break;
            case 44 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:182: T57
                {
                mT57(); 

                }
                break;
            case 45 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:186: T58
                {
                mT58(); 

                }
                break;
            case 46 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:190: T59
                {
                mT59(); 

                }
                break;
            case 47 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:194: T60
                {
                mT60(); 

                }
                break;
            case 48 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:198: T61
                {
                mT61(); 

                }
                break;
            case 49 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:202: T62
                {
                mT62(); 

                }
                break;
            case 50 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:206: T63
                {
                mT63(); 

                }
                break;
            case 51 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:210: T64
                {
                mT64(); 

                }
                break;
            case 52 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:214: T65
                {
                mT65(); 

                }
                break;
            case 53 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:218: T66
                {
                mT66(); 

                }
                break;
            case 54 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:222: T67
                {
                mT67(); 

                }
                break;
            case 55 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:226: T68
                {
                mT68(); 

                }
                break;
            case 56 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:230: T69
                {
                mT69(); 

                }
                break;
            case 57 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:234: T70
                {
                mT70(); 

                }
                break;
            case 58 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:238: T71
                {
                mT71(); 

                }
                break;
            case 59 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:242: T72
                {
                mT72(); 

                }
                break;
            case 60 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:246: T73
                {
                mT73(); 

                }
                break;
            case 61 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:250: T74
                {
                mT74(); 

                }
                break;
            case 62 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:254: T75
                {
                mT75(); 

                }
                break;
            case 63 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:258: T76
                {
                mT76(); 

                }
                break;
            case 64 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:262: T77
                {
                mT77(); 

                }
                break;
            case 65 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:266: T78
                {
                mT78(); 

                }
                break;
            case 66 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:270: T79
                {
                mT79(); 

                }
                break;
            case 67 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:274: T80
                {
                mT80(); 

                }
                break;
            case 68 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:278: T81
                {
                mT81(); 

                }
                break;
            case 69 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:282: T82
                {
                mT82(); 

                }
                break;
            case 70 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:286: T83
                {
                mT83(); 

                }
                break;
            case 71 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:290: T84
                {
                mT84(); 

                }
                break;
            case 72 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:294: T85
                {
                mT85(); 

                }
                break;
            case 73 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:298: T86
                {
                mT86(); 

                }
                break;
            case 74 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:302: T87
                {
                mT87(); 

                }
                break;
            case 75 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:306: T88
                {
                mT88(); 

                }
                break;
            case 76 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:310: T89
                {
                mT89(); 

                }
                break;
            case 77 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:314: T90
                {
                mT90(); 

                }
                break;
            case 78 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:318: T91
                {
                mT91(); 

                }
                break;
            case 79 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:322: T92
                {
                mT92(); 

                }
                break;
            case 80 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:326: T93
                {
                mT93(); 

                }
                break;
            case 81 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:330: T94
                {
                mT94(); 

                }
                break;
            case 82 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:334: T95
                {
                mT95(); 

                }
                break;
            case 83 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:338: T96
                {
                mT96(); 

                }
                break;
            case 84 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:342: T97
                {
                mT97(); 

                }
                break;
            case 85 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:346: T98
                {
                mT98(); 

                }
                break;
            case 86 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:350: T99
                {
                mT99(); 

                }
                break;
            case 87 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:354: T100
                {
                mT100(); 

                }
                break;
            case 88 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:359: T101
                {
                mT101(); 

                }
                break;
            case 89 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:364: T102
                {
                mT102(); 

                }
                break;
            case 90 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:369: T103
                {
                mT103(); 

                }
                break;
            case 91 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:374: RULE_ML_SINGLE_QUOTED_STRING
                {
                mRULE_ML_SINGLE_QUOTED_STRING(); 

                }
                break;
            case 92 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:403: RULE_DOUBLE_QUOTED_STRING
                {
                mRULE_DOUBLE_QUOTED_STRING(); 

                }
                break;
            case 93 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:429: RULE_SINGLE_QUOTED_STRING
                {
                mRULE_SINGLE_QUOTED_STRING(); 

                }
                break;
            case 94 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:455: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 95 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:463: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 96 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:472: RULE_DOCUMENTATION
                {
                mRULE_DOCUMENTATION(); 

                }
                break;
            case 97 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:491: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 98 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:507: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 99 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:523: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 100 :
                // ../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g:1:531: RULE_ANY_OTHER
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
            case 't':
                {
                int LA13_136 = input.LA(4);

                if ( ((LA13_136>='0' && LA13_136<='9')||(LA13_136>='A' && LA13_136<='Z')||LA13_136=='_'||(LA13_136>='a' && LA13_136<='z')) ) {
                    return 94;
                }
                else {
                    return 63;}
                }
            case 'f':
                {
                int LA13_137 = input.LA(4);

                if ( (LA13_137=='t') ) {
                    int LA13_189 = input.LA(5);

                    if ( ((LA13_189>='0' && LA13_189<='9')||(LA13_189>='A' && LA13_189<='Z')||LA13_189=='_'||(LA13_189>='a' && LA13_189<='z')) ) {
                        return 94;
                    }
                    else {
                        return 16;}
                }
                else {
                    return 94;}
                }
            default:
                return 94;}

            }
        case 'i':
            {
            int LA13_56 = input.LA(3);

            if ( (LA13_56=='b') ) {
                int LA13_138 = input.LA(4);

                if ( (LA13_138=='r') ) {
                    int LA13_190 = input.LA(5);

                    if ( (LA13_190=='a') ) {
                        int LA13_243 = input.LA(6);

                        if ( (LA13_243=='r') ) {
                            int LA13_288 = input.LA(7);

                            if ( (LA13_288=='y') ) {
                                int LA13_326 = input.LA(8);

                                if ( ((LA13_326>='0' && LA13_326<='9')||(LA13_326>='A' && LA13_326<='Z')||LA13_326=='_'||(LA13_326>='a' && LA13_326<='z')) ) {
                                    return 94;
                                }
                                else {
                                    return 1;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
            }
        default:
            return 94;}

    }

    private int mTokensHelper002() throws RecognitionException {
        int LA13_2 = input.LA(2);

        if ( (LA13_2=='o') ) {
            int LA13_58 = input.LA(3);

            if ( (LA13_58=='d') ) {
                int LA13_139 = input.LA(4);

                if ( (LA13_139=='u') ) {
                    int LA13_191 = input.LA(5);

                    if ( (LA13_191=='l') ) {
                        int LA13_244 = input.LA(6);

                        if ( (LA13_244=='e') ) {
                            int LA13_289 = input.LA(7);

                            if ( ((LA13_289>='0' && LA13_289<='9')||(LA13_289>='A' && LA13_289<='Z')||LA13_289=='_'||(LA13_289>='a' && LA13_289<='z')) ) {
                                return 94;
                            }
                            else {
                                return 2;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
        }
        else {
            return 94;}
    }

    private int mTokensHelper003() throws RecognitionException {
        int LA13_3 = input.LA(2);

        if ( (LA13_3==':') ) {
            return 49;
        }
        else {
            return 3;}
    }

    private int mTokensHelper004() throws RecognitionException {
        int LA13_4 = input.LA(2);

        if ( (LA13_4=='>') ) {
            return 43;
        }
        else {
            return 4;}
    }

    private int mTokensHelper005() throws RecognitionException {
        return 5;
    }

    private int mTokensHelper006() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'a':
            {
            int LA13_64 = input.LA(3);

            if ( (LA13_64=='c') ) {
                int LA13_140 = input.LA(4);

                if ( (LA13_140=='k') ) {
                    int LA13_192 = input.LA(5);

                    if ( (LA13_192=='a') ) {
                        int LA13_245 = input.LA(6);

                        if ( (LA13_245=='g') ) {
                            int LA13_290 = input.LA(7);

                            if ( (LA13_290=='e') ) {
                                int LA13_328 = input.LA(8);

                                if ( ((LA13_328>='0' && LA13_328<='9')||(LA13_328>='A' && LA13_328<='Z')||LA13_328=='_'||(LA13_328>='a' && LA13_328<='z')) ) {
                                    return 94;
                                }
                                else {
                                    return 18;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
            }
        case 'r':
            {
            switch ( input.LA(3) ) {
            case 'e':
                {
                switch ( input.LA(4) ) {
                case 'c':
                    {
                    int LA13_193 = input.LA(5);

                    if ( (LA13_193=='e') ) {
                        int LA13_246 = input.LA(6);

                        if ( (LA13_246=='d') ) {
                            int LA13_291 = input.LA(7);

                            if ( (LA13_291=='e') ) {
                                int LA13_329 = input.LA(8);

                                if ( (LA13_329=='n') ) {
                                    int LA13_360 = input.LA(9);

                                    if ( (LA13_360=='c') ) {
                                        int LA13_385 = input.LA(10);

                                        if ( (LA13_385=='e') ) {
                                            int LA13_402 = input.LA(11);

                                            if ( ((LA13_402>='0' && LA13_402<='9')||(LA13_402>='A' && LA13_402<='Z')||LA13_402=='_'||(LA13_402>='a' && LA13_402<='z')) ) {
                                                return 94;
                                            }
                                            else {
                                                return 6;}
                                        }
                                        else {
                                            return 94;}
                                    }
                                    else {
                                        return 94;}
                                }
                                else {
                                    return 94;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
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
                    return 94;
                    }
                default:
                    return 20;}

                }
            case 'o':
                {
                int LA13_142 = input.LA(4);

                if ( (LA13_142=='p') ) {
                    int LA13_195 = input.LA(5);

                    if ( (LA13_195=='e') ) {
                        int LA13_247 = input.LA(6);

                        if ( (LA13_247=='r') ) {
                            int LA13_292 = input.LA(7);

                            if ( (LA13_292=='t') ) {
                                int LA13_330 = input.LA(8);

                                if ( (LA13_330=='y') ) {
                                    int LA13_361 = input.LA(9);

                                    if ( ((LA13_361>='0' && LA13_361<='9')||(LA13_361>='A' && LA13_361<='Z')||LA13_361=='_'||(LA13_361>='a' && LA13_361<='z')) ) {
                                        return 94;
                                    }
                                    else {
                                        return 21;}
                                }
                                else {
                                    return 94;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
                }
            default:
                return 94;}

            }
        case 'o':
            {
            int LA13_66 = input.LA(3);

            if ( (LA13_66=='s') ) {
                int LA13_143 = input.LA(4);

                if ( (LA13_143=='t') ) {
                    int LA13_196 = input.LA(5);

                    if ( ((LA13_196>='0' && LA13_196<='9')||(LA13_196>='A' && LA13_196<='Z')||LA13_196=='_'||(LA13_196>='a' && LA13_196<='z')) ) {
                        return 94;
                    }
                    else {
                        return 19;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
            }
        default:
            return 94;}

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
        int LA13_10 = input.LA(2);

        if ( (LA13_10=='o') ) {
            int LA13_70 = input.LA(3);

            if ( (LA13_70=='n') ) {
                int LA13_144 = input.LA(4);

                if ( (LA13_144=='f') ) {
                    int LA13_197 = input.LA(5);

                    if ( (LA13_197=='o') ) {
                        int LA13_249 = input.LA(6);

                        if ( (LA13_249=='r') ) {
                            int LA13_293 = input.LA(7);

                            if ( (LA13_293=='m') ) {
                                int LA13_331 = input.LA(8);

                                if ( (LA13_331=='s') ) {
                                    int LA13_362 = input.LA(9);

                                    if ( (LA13_362=='T') ) {
                                        int LA13_387 = input.LA(10);

                                        if ( (LA13_387=='o') ) {
                                            int LA13_403 = input.LA(11);

                                            if ( ((LA13_403>='0' && LA13_403<='9')||(LA13_403>='A' && LA13_403<='Z')||LA13_403=='_'||(LA13_403>='a' && LA13_403<='z')) ) {
                                                return 94;
                                            }
                                            else {
                                                return 10;}
                                        }
                                        else {
                                            return 94;}
                                    }
                                    else {
                                        return 94;}
                                }
                                else {
                                    return 94;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
        }
        else {
            return 94;}
    }

    private int mTokensHelper011() throws RecognitionException {
        int LA13_11 = input.LA(2);

        if ( (LA13_11=='o') ) {
            int LA13_71 = input.LA(3);

            if ( (LA13_71=='c') ) {
                int LA13_145 = input.LA(4);

                if ( (LA13_145=='u') ) {
                    int LA13_198 = input.LA(5);

                    if ( (LA13_198=='m') ) {
                        int LA13_250 = input.LA(6);

                        if ( (LA13_250=='e') ) {
                            int LA13_294 = input.LA(7);

                            if ( (LA13_294=='n') ) {
                                int LA13_332 = input.LA(8);

                                if ( (LA13_332=='t') ) {
                                    int LA13_363 = input.LA(9);

                                    if ( (LA13_363=='a') ) {
                                        int LA13_388 = input.LA(10);

                                        if ( (LA13_388=='t') ) {
                                            int LA13_404 = input.LA(11);

                                            if ( (LA13_404=='i') ) {
                                                int LA13_418 = input.LA(12);

                                                if ( (LA13_418=='o') ) {
                                                    int LA13_429 = input.LA(13);

                                                    if ( (LA13_429=='n') ) {
                                                        int LA13_436 = input.LA(14);

                                                        if ( ((LA13_436>='0' && LA13_436<='9')||(LA13_436>='A' && LA13_436<='Z')||LA13_436=='_'||(LA13_436>='a' && LA13_436<='z')) ) {
                                                            return 94;
                                                        }
                                                        else {
                                                            return 11;}
                                                    }
                                                    else {
                                                        return 94;}
                                                }
                                                else {
                                                    return 94;}
                                            }
                                            else {
                                                return 94;}
                                        }
                                        else {
                                            return 94;}
                                    }
                                    else {
                                        return 94;}
                                }
                                else {
                                    return 94;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
        }
        else {
            return 94;}
    }

    private int mTokensHelper012() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'n':
            {
            int LA13_72 = input.LA(3);

            if ( (LA13_72=='d') ) {
                int LA13_146 = input.LA(4);

                if ( (LA13_146=='i') ) {
                    int LA13_199 = input.LA(5);

                    if ( (LA13_199=='f') ) {
                        int LA13_251 = input.LA(6);

                        if ( ((LA13_251>='0' && LA13_251<='9')||(LA13_251>='A' && LA13_251<='Z')||LA13_251=='_'||(LA13_251>='a' && LA13_251<='z')) ) {
                            return 94;
                        }
                        else {
                            return 59;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
            }
        case 'l':
            {
            int LA13_73 = input.LA(3);

            if ( (LA13_73=='s') ) {
                int LA13_147 = input.LA(4);

                if ( (LA13_147=='e') ) {
                    int LA13_200 = input.LA(5);

                    if ( ((LA13_200>='0' && LA13_200<='9')||(LA13_200>='A' && LA13_200<='Z')||LA13_200=='_'||(LA13_200>='a' && LA13_200<='z')) ) {
                        return 94;
                    }
                    else {
                        return 58;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
            }
        case 'x':
            {
            int LA13_74 = input.LA(3);

            if ( (LA13_74=='t') ) {
                int LA13_148 = input.LA(4);

                if ( (LA13_148=='e') ) {
                    int LA13_201 = input.LA(5);

                    if ( (LA13_201=='n') ) {
                        int LA13_253 = input.LA(6);

                        if ( (LA13_253=='d') ) {
                            int LA13_296 = input.LA(7);

                            if ( (LA13_296=='s') ) {
                                int LA13_333 = input.LA(8);

                                if ( ((LA13_333>='0' && LA13_333<='9')||(LA13_333>='A' && LA13_333<='Z')||LA13_333=='_'||(LA13_333>='a' && LA13_333<='z')) ) {
                                    return 94;
                                }
                                else {
                                    return 12;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
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
            return 94;
            }
        default:
            return 54;}

    }

    private int mTokensHelper013() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 't':
            {
            int LA13_76 = input.LA(3);

            if ( (LA13_76=='e') ) {
                int LA13_149 = input.LA(4);

                if ( (LA13_149=='r') ) {
                    int LA13_202 = input.LA(5);

                    if ( (LA13_202=='a') ) {
                        int LA13_254 = input.LA(6);

                        if ( (LA13_254=='t') ) {
                            int LA13_297 = input.LA(7);

                            if ( (LA13_297=='i') ) {
                                int LA13_334 = input.LA(8);

                                if ( (LA13_334=='o') ) {
                                    int LA13_365 = input.LA(9);

                                    if ( (LA13_365=='n') ) {
                                        int LA13_389 = input.LA(10);

                                        if ( ((LA13_389>='0' && LA13_389<='9')||(LA13_389>='A' && LA13_389<='Z')||LA13_389=='_'||(LA13_389>='a' && LA13_389<='z')) ) {
                                            return 94;
                                        }
                                        else {
                                            return 15;}
                                    }
                                    else {
                                        return 94;}
                                }
                                else {
                                    return 94;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
            }
        case 'n':
            {
            switch ( input.LA(3) ) {
            case 'v':
                {
                switch ( input.LA(4) ) {
                case 'a':
                    {
                    int LA13_203 = input.LA(5);

                    if ( (LA13_203=='l') ) {
                        int LA13_255 = input.LA(6);

                        if ( (LA13_255=='i') ) {
                            int LA13_298 = input.LA(7);

                            if ( (LA13_298=='d') ) {
                                int LA13_335 = input.LA(8);

                                if ( ((LA13_335>='0' && LA13_335<='9')||(LA13_335>='A' && LA13_335<='Z')||LA13_335=='_'||(LA13_335>='a' && LA13_335<='z')) ) {
                                    return 94;
                                }
                                else {
                                    return 88;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
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
                    return 94;
                    }
                default:
                    return 14;}

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
                return 94;
                }
            default:
                return 62;}

            }
        case 'm':
            {
            int LA13_78 = input.LA(3);

            if ( (LA13_78=='p') ) {
                switch ( input.LA(4) ) {
                case 'o':
                    {
                    int LA13_205 = input.LA(5);

                    if ( (LA13_205=='r') ) {
                        int LA13_256 = input.LA(6);

                        if ( (LA13_256=='t') ) {
                            int LA13_299 = input.LA(7);

                            if ( ((LA13_299>='0' && LA13_299<='9')||(LA13_299>='A' && LA13_299<='Z')||LA13_299=='_'||(LA13_299>='a' && LA13_299<='z')) ) {
                                return 94;
                            }
                            else {
                                return 13;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                    }
                case 'l':
                    {
                    int LA13_206 = input.LA(5);

                    if ( (LA13_206=='i') ) {
                        int LA13_257 = input.LA(6);

                        if ( (LA13_257=='e') ) {
                            int LA13_300 = input.LA(7);

                            if ( (LA13_300=='s') ) {
                                int LA13_337 = input.LA(8);

                                if ( ((LA13_337>='0' && LA13_337<='9')||(LA13_337>='A' && LA13_337<='Z')||LA13_337=='_'||(LA13_337>='a' && LA13_337<='z')) ) {
                                    return 94;
                                }
                                else {
                                    return 61;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                    }
                default:
                    return 94;}

            }
            else {
                return 94;}
            }
        case 'f':
            {
            int LA13_79 = input.LA(3);

            if ( ((LA13_79>='0' && LA13_79<='9')||(LA13_79>='A' && LA13_79<='Z')||LA13_79=='_'||(LA13_79>='a' && LA13_79<='z')) ) {
                return 94;
            }
            else {
                return 60;}
            }
        default:
            return 94;}

    }

    private int mTokensHelper014() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'p':
            {
            int LA13_80 = input.LA(3);

            if ( (LA13_80=='e') ) {
                int LA13_154 = input.LA(4);

                if ( (LA13_154=='r') ) {
                    int LA13_207 = input.LA(5);

                    if ( (LA13_207=='a') ) {
                        int LA13_258 = input.LA(6);

                        if ( (LA13_258=='t') ) {
                            int LA13_301 = input.LA(7);

                            if ( (LA13_301=='i') ) {
                                int LA13_338 = input.LA(8);

                                if ( (LA13_338=='o') ) {
                                    int LA13_368 = input.LA(9);

                                    if ( (LA13_368=='n') ) {
                                        int LA13_390 = input.LA(10);

                                        if ( ((LA13_390>='0' && LA13_390<='9')||(LA13_390>='A' && LA13_390<='Z')||LA13_390=='_'||(LA13_390>='a' && LA13_390<='z')) ) {
                                            return 94;
                                        }
                                        else {
                                            return 17;}
                                    }
                                    else {
                                        return 94;}
                                }
                                else {
                                    return 94;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
            }
        case 'r':
            {
            int LA13_81 = input.LA(3);

            if ( ((LA13_81>='0' && LA13_81<='9')||(LA13_81>='A' && LA13_81<='Z')||LA13_81=='_'||(LA13_81>='a' && LA13_81<='z')) ) {
                return 94;
            }
            else {
                return 65;}
            }
        default:
            return 94;}

    }

    private int mTokensHelper015() throws RecognitionException {
        int LA13_15 = input.LA(2);

        if ( (LA13_15=='i') ) {
            int LA13_82 = input.LA(3);

            if ( (LA13_82=='g') ) {
                int LA13_156 = input.LA(4);

                if ( (LA13_156=='h') ) {
                    int LA13_208 = input.LA(5);

                    if ( (LA13_208=='t') ) {
                        int LA13_259 = input.LA(6);

                        if ( ((LA13_259>='0' && LA13_259<='9')||(LA13_259>='A' && LA13_259<='Z')||LA13_259=='_'||(LA13_259>='a' && LA13_259<='z')) ) {
                            return 94;
                        }
                        else {
                            return 22;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
        }
        else {
            return 94;}
    }

    private int mTokensHelper016() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 't':
            {
            int LA13_83 = input.LA(3);

            if ( (LA13_83=='a') ) {
                int LA13_157 = input.LA(4);

                if ( (LA13_157=='t') ) {
                    int LA13_209 = input.LA(5);

                    if ( (LA13_209=='i') ) {
                        int LA13_260 = input.LA(6);

                        if ( (LA13_260=='c') ) {
                            int LA13_303 = input.LA(7);

                            if ( ((LA13_303>='0' && LA13_303<='9')||(LA13_303>='A' && LA13_303<='Z')||LA13_303=='_'||(LA13_303>='a' && LA13_303<='z')) ) {
                                return 94;
                            }
                            else {
                                return 23;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
            }
        case 'u':
            {
            int LA13_84 = input.LA(3);

            if ( (LA13_84=='p') ) {
                int LA13_158 = input.LA(4);

                if ( (LA13_158=='e') ) {
                    int LA13_210 = input.LA(5);

                    if ( (LA13_210=='r') ) {
                        int LA13_261 = input.LA(6);

                        if ( ((LA13_261>='0' && LA13_261<='9')||(LA13_261>='A' && LA13_261<='Z')||LA13_261=='_'||(LA13_261>='a' && LA13_261<='z')) ) {
                            return 94;
                        }
                        else {
                            return 24;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
            }
        case 'e':
            {
            int LA13_85 = input.LA(3);

            if ( (LA13_85=='l') ) {
                int LA13_159 = input.LA(4);

                if ( (LA13_159=='f') ) {
                    int LA13_211 = input.LA(5);

                    if ( ((LA13_211>='0' && LA13_211<='9')||(LA13_211>='A' && LA13_211<='Z')||LA13_211=='_'||(LA13_211>='a' && LA13_211<='z')) ) {
                        return 94;
                    }
                    else {
                        return 90;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
            }
        default:
            return 94;}

    }

    private int mTokensHelper017() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'y':
            {
            int LA13_86 = input.LA(3);

            if ( (LA13_86=='p') ) {
                int LA13_160 = input.LA(4);

                if ( (LA13_160=='e') ) {
                    int LA13_212 = input.LA(5);

                    if ( ((LA13_212>='0' && LA13_212<='9')||(LA13_212>='A' && LA13_212<='Z')||LA13_212=='_'||(LA13_212>='a' && LA13_212<='z')) ) {
                        return 94;
                    }
                    else {
                        return 25;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
            }
        case 'h':
            {
            int LA13_87 = input.LA(3);

            if ( (LA13_87=='e') ) {
                int LA13_161 = input.LA(4);

                if ( (LA13_161=='n') ) {
                    int LA13_213 = input.LA(5);

                    if ( ((LA13_213>='0' && LA13_213<='9')||(LA13_213>='A' && LA13_213<='Z')||LA13_213=='_'||(LA13_213>='a' && LA13_213<='z')) ) {
                        return 94;
                    }
                    else {
                        return 66;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
            }
        case 'r':
            {
            int LA13_88 = input.LA(3);

            if ( (LA13_88=='u') ) {
                int LA13_162 = input.LA(4);

                if ( (LA13_162=='e') ) {
                    int LA13_214 = input.LA(5);

                    if ( ((LA13_214>='0' && LA13_214<='9')||(LA13_214>='A' && LA13_214<='Z')||LA13_214=='_'||(LA13_214>='a' && LA13_214<='z')) ) {
                        return 94;
                    }
                    else {
                        return 86;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
            }
        default:
            return 94;}

    }

    private int mTokensHelper018() throws RecognitionException {
        int LA13_18 = input.LA(2);

        if ( (LA13_18=='u') ) {
            int LA13_89 = input.LA(3);

            if ( (LA13_89=='p') ) {
                int LA13_163 = input.LA(4);

                if ( (LA13_163=='l') ) {
                    int LA13_215 = input.LA(5);

                    if ( (LA13_215=='e') ) {
                        switch ( input.LA(6) ) {
                        case 'T':
                            {
                            int LA13_305 = input.LA(7);

                            if ( (LA13_305=='y') ) {
                                int LA13_340 = input.LA(8);

                                if ( (LA13_340=='p') ) {
                                    int LA13_369 = input.LA(9);

                                    if ( (LA13_369=='e') ) {
                                        int LA13_391 = input.LA(10);

                                        if ( ((LA13_391>='0' && LA13_391<='9')||(LA13_391>='A' && LA13_391<='Z')||LA13_391=='_'||(LA13_391>='a' && LA13_391<='z')) ) {
                                            return 94;
                                        }
                                        else {
                                            return 36;}
                                    }
                                    else {
                                        return 94;}
                                }
                                else {
                                    return 94;}
                            }
                            else {
                                return 94;}
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
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            return 94;
                            }
                        default:
                            return 26;}

                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
        }
        else {
            return 94;}
    }

    private int mTokensHelper019() throws RecognitionException {
        int LA13_19 = input.LA(2);

        if ( (LA13_19=='n') ) {
            int LA13_90 = input.LA(3);

            if ( (LA13_90=='y') ) {
                int LA13_164 = input.LA(4);

                if ( (LA13_164=='T') ) {
                    int LA13_216 = input.LA(5);

                    if ( (LA13_216=='y') ) {
                        int LA13_267 = input.LA(6);

                        if ( (LA13_267=='p') ) {
                            int LA13_307 = input.LA(7);

                            if ( (LA13_307=='e') ) {
                                int LA13_341 = input.LA(8);

                                if ( ((LA13_341>='0' && LA13_341<='9')||(LA13_341>='A' && LA13_341<='Z')||LA13_341=='_'||(LA13_341>='a' && LA13_341<='z')) ) {
                                    return 94;
                                }
                                else {
                                    return 27;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
        }
        else {
            return 94;}
    }

    private int mTokensHelper020() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'a':
            {
            int LA13_91 = input.LA(3);

            if ( (LA13_91=='g') ) {
                switch ( input.LA(4) ) {
                case 'T':
                    {
                    int LA13_217 = input.LA(5);

                    if ( (LA13_217=='y') ) {
                        int LA13_268 = input.LA(6);

                        if ( (LA13_268=='p') ) {
                            int LA13_308 = input.LA(7);

                            if ( (LA13_308=='e') ) {
                                int LA13_342 = input.LA(8);

                                if ( ((LA13_342>='0' && LA13_342<='9')||(LA13_342>='A' && LA13_342<='Z')||LA13_342=='_'||(LA13_342>='a' && LA13_342<='z')) ) {
                                    return 94;
                                }
                                else {
                                    return 28;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
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
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    return 94;
                    }
                default:
                    return 82;}

            }
            else {
                return 94;}
            }
        case 'o':
            {
            int LA13_92 = input.LA(3);

            if ( (LA13_92=='o') ) {
                int LA13_166 = input.LA(4);

                if ( (LA13_166=='l') ) {
                    int LA13_219 = input.LA(5);

                    if ( (LA13_219=='e') ) {
                        int LA13_269 = input.LA(6);

                        if ( (LA13_269=='a') ) {
                            int LA13_309 = input.LA(7);

                            if ( (LA13_309=='n') ) {
                                int LA13_343 = input.LA(8);

                                if ( ((LA13_343>='0' && LA13_343<='9')||(LA13_343>='A' && LA13_343<='Z')||LA13_343=='_'||(LA13_343>='a' && LA13_343<='z')) ) {
                                    return 94;
                                }
                                else {
                                    return 73;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
            }
        default:
            return 94;}

    }

    private int mTokensHelper021() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'l':
            {
            int LA13_93 = input.LA(3);

            if ( (LA13_93=='a') ) {
                int LA13_167 = input.LA(4);

                if ( (LA13_167=='s') ) {
                    int LA13_220 = input.LA(5);

                    if ( (LA13_220=='s') ) {
                        int LA13_270 = input.LA(6);

                        if ( ((LA13_270>='0' && LA13_270<='9')||(LA13_270>='A' && LA13_270<='Z')||LA13_270=='_'||(LA13_270>='a' && LA13_270<='z')) ) {
                            return 94;
                        }
                        else {
                            return 29;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
            }
        case 'o':
            {
            int LA13_94 = input.LA(3);

            if ( (LA13_94=='l') ) {
                int LA13_168 = input.LA(4);

                if ( (LA13_168=='l') ) {
                    int LA13_221 = input.LA(5);

                    if ( (LA13_221=='e') ) {
                        int LA13_271 = input.LA(6);

                        if ( (LA13_271=='c') ) {
                            int LA13_311 = input.LA(7);

                            if ( (LA13_311=='t') ) {
                                int LA13_344 = input.LA(8);

                                if ( (LA13_344=='i') ) {
                                    int LA13_373 = input.LA(9);

                                    if ( (LA13_373=='o') ) {
                                        int LA13_392 = input.LA(10);

                                        if ( (LA13_392=='n') ) {
                                            switch ( input.LA(11) ) {
                                            case 'T':
                                                {
                                                int LA13_419 = input.LA(12);

                                                if ( (LA13_419=='y') ) {
                                                    int LA13_430 = input.LA(13);

                                                    if ( (LA13_430=='p') ) {
                                                        int LA13_437 = input.LA(14);

                                                        if ( (LA13_437=='e') ) {
                                                            int LA13_443 = input.LA(15);

                                                            if ( ((LA13_443>='0' && LA13_443<='9')||(LA13_443>='A' && LA13_443<='Z')||LA13_443=='_'||(LA13_443>='a' && LA13_443<='z')) ) {
                                                                return 94;
                                                            }
                                                            else {
                                                                return 30;}
                                                        }
                                                        else {
                                                            return 94;}
                                                    }
                                                    else {
                                                        return 94;}
                                                }
                                                else {
                                                    return 94;}
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
                                            case 'v':
                                            case 'w':
                                            case 'x':
                                            case 'y':
                                            case 'z':
                                                {
                                                return 94;
                                                }
                                            default:
                                                return 84;}

                                        }
                                        else {
                                            return 94;}
                                    }
                                    else {
                                        return 94;}
                                }
                                else {
                                    return 94;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
            }
        default:
            return 94;}

    }

    private int mTokensHelper022() throws RecognitionException {
        int LA13_22 = input.LA(2);

        if ( (LA13_22=='n') ) {
            switch ( input.LA(3) ) {
            case 'v':
                {
                int LA13_169 = input.LA(4);

                if ( (LA13_169=='a') ) {
                    int LA13_222 = input.LA(5);

                    if ( (LA13_222=='l') ) {
                        int LA13_272 = input.LA(6);

                        if ( (LA13_272=='i') ) {
                            int LA13_312 = input.LA(7);

                            if ( (LA13_312=='d') ) {
                                int LA13_345 = input.LA(8);

                                if ( (LA13_345=='T') ) {
                                    int LA13_374 = input.LA(9);

                                    if ( (LA13_374=='y') ) {
                                        int LA13_393 = input.LA(10);

                                        if ( (LA13_393=='p') ) {
                                            int LA13_409 = input.LA(11);

                                            if ( (LA13_409=='e') ) {
                                                int LA13_421 = input.LA(12);

                                                if ( ((LA13_421>='0' && LA13_421<='9')||(LA13_421>='A' && LA13_421<='Z')||LA13_421=='_'||(LA13_421>='a' && LA13_421<='z')) ) {
                                                    return 94;
                                                }
                                                else {
                                                    return 31;}
                                            }
                                            else {
                                                return 94;}
                                        }
                                        else {
                                            return 94;}
                                    }
                                    else {
                                        return 94;}
                                }
                                else {
                                    return 94;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
                }
            case 't':
                {
                int LA13_170 = input.LA(4);

                if ( (LA13_170=='e') ) {
                    int LA13_223 = input.LA(5);

                    if ( (LA13_223=='g') ) {
                        int LA13_273 = input.LA(6);

                        if ( (LA13_273=='e') ) {
                            int LA13_313 = input.LA(7);

                            if ( (LA13_313=='r') ) {
                                int LA13_346 = input.LA(8);

                                if ( ((LA13_346>='0' && LA13_346<='9')||(LA13_346>='A' && LA13_346<='Z')||LA13_346=='_'||(LA13_346>='a' && LA13_346<='z')) ) {
                                    return 94;
                                }
                                else {
                                    return 74;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
                }
            default:
                return 94;}

        }
        else {
            return 94;}
    }

    private int mTokensHelper023() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'r':
            {
            int LA13_96 = input.LA(3);

            if ( (LA13_96=='d') ) {
                int LA13_171 = input.LA(4);

                if ( (LA13_171=='e') ) {
                    int LA13_224 = input.LA(5);

                    if ( (LA13_224=='r') ) {
                        int LA13_274 = input.LA(6);

                        if ( (LA13_274=='e') ) {
                            int LA13_314 = input.LA(7);

                            if ( (LA13_314=='d') ) {
                                int LA13_347 = input.LA(8);

                                if ( (LA13_347=='S') ) {
                                    int LA13_376 = input.LA(9);

                                    if ( (LA13_376=='e') ) {
                                        int LA13_394 = input.LA(10);

                                        if ( (LA13_394=='t') ) {
                                            switch ( input.LA(11) ) {
                                            case 'T':
                                                {
                                                int LA13_422 = input.LA(12);

                                                if ( (LA13_422=='y') ) {
                                                    int LA13_432 = input.LA(13);

                                                    if ( (LA13_432=='p') ) {
                                                        int LA13_438 = input.LA(14);

                                                        if ( (LA13_438=='e') ) {
                                                            int LA13_444 = input.LA(15);

                                                            if ( ((LA13_444>='0' && LA13_444<='9')||(LA13_444>='A' && LA13_444<='Z')||LA13_444=='_'||(LA13_444>='a' && LA13_444<='z')) ) {
                                                                return 94;
                                                            }
                                                            else {
                                                                return 32;}
                                                        }
                                                        else {
                                                            return 94;}
                                                    }
                                                    else {
                                                        return 94;}
                                                }
                                                else {
                                                    return 94;}
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
                                            case 'v':
                                            case 'w':
                                            case 'x':
                                            case 'y':
                                            case 'z':
                                                {
                                                return 94;
                                                }
                                            default:
                                                return 85;}

                                        }
                                        else {
                                            return 94;}
                                    }
                                    else {
                                        return 94;}
                                }
                                else {
                                    return 94;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
            }
        case 'c':
            {
            int LA13_97 = input.LA(3);

            if ( (LA13_97=='l') ) {
                switch ( input.LA(4) ) {
                case 'I':
                    {
                    int LA13_225 = input.LA(5);

                    if ( (LA13_225=='n') ) {
                        int LA13_275 = input.LA(6);

                        if ( (LA13_275=='v') ) {
                            int LA13_315 = input.LA(7);

                            if ( (LA13_315=='a') ) {
                                int LA13_348 = input.LA(8);

                                if ( (LA13_348=='l') ) {
                                    int LA13_377 = input.LA(9);

                                    if ( (LA13_377=='i') ) {
                                        int LA13_395 = input.LA(10);

                                        if ( (LA13_395=='d') ) {
                                            int LA13_411 = input.LA(11);

                                            if ( ((LA13_411>='0' && LA13_411<='9')||(LA13_411>='A' && LA13_411<='Z')||LA13_411=='_'||(LA13_411>='a' && LA13_411<='z')) ) {
                                                return 94;
                                            }
                                            else {
                                                return 79;}
                                        }
                                        else {
                                            return 94;}
                                    }
                                    else {
                                        return 94;}
                                }
                                else {
                                    return 94;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                    }
                case 'V':
                    {
                    int LA13_226 = input.LA(5);

                    if ( (LA13_226=='o') ) {
                        int LA13_276 = input.LA(6);

                        if ( (LA13_276=='i') ) {
                            int LA13_316 = input.LA(7);

                            if ( (LA13_316=='d') ) {
                                int LA13_349 = input.LA(8);

                                if ( ((LA13_349>='0' && LA13_349<='9')||(LA13_349>='A' && LA13_349<='Z')||LA13_349=='_'||(LA13_349>='a' && LA13_349<='z')) ) {
                                    return 94;
                                }
                                else {
                                    return 80;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                    }
                case 'A':
                    {
                    int LA13_227 = input.LA(5);

                    if ( (LA13_227=='n') ) {
                        int LA13_277 = input.LA(6);

                        if ( (LA13_277=='y') ) {
                            int LA13_317 = input.LA(7);

                            if ( ((LA13_317>='0' && LA13_317<='9')||(LA13_317>='A' && LA13_317<='Z')||LA13_317=='_'||(LA13_317>='a' && LA13_317<='z')) ) {
                                return 94;
                            }
                            else {
                                return 78;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                    }
                default:
                    return 94;}

            }
            else {
                return 94;}
            }
        default:
            return 94;}

    }

    private int mTokensHelper024() throws RecognitionException {
        int LA13_24 = input.LA(2);

        if ( (LA13_24=='r') ) {
            int LA13_98 = input.LA(3);

            if ( (LA13_98=='i') ) {
                int LA13_173 = input.LA(4);

                if ( (LA13_173=='m') ) {
                    int LA13_228 = input.LA(5);

                    if ( (LA13_228=='i') ) {
                        int LA13_278 = input.LA(6);

                        if ( (LA13_278=='t') ) {
                            int LA13_318 = input.LA(7);

                            if ( (LA13_318=='i') ) {
                                int LA13_351 = input.LA(8);

                                if ( (LA13_351=='v') ) {
                                    int LA13_379 = input.LA(9);

                                    if ( (LA13_379=='e') ) {
                                        int LA13_396 = input.LA(10);

                                        if ( (LA13_396=='T') ) {
                                            int LA13_412 = input.LA(11);

                                            if ( (LA13_412=='y') ) {
                                                int LA13_425 = input.LA(12);

                                                if ( (LA13_425=='p') ) {
                                                    int LA13_433 = input.LA(13);

                                                    if ( (LA13_433=='e') ) {
                                                        int LA13_439 = input.LA(14);

                                                        if ( ((LA13_439>='0' && LA13_439<='9')||(LA13_439>='A' && LA13_439<='Z')||LA13_439=='_'||(LA13_439>='a' && LA13_439<='z')) ) {
                                                            return 94;
                                                        }
                                                        else {
                                                            return 33;}
                                                    }
                                                    else {
                                                        return 94;}
                                                }
                                                else {
                                                    return 94;}
                                            }
                                            else {
                                                return 94;}
                                        }
                                        else {
                                            return 94;}
                                    }
                                    else {
                                        return 94;}
                                }
                                else {
                                    return 94;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
        }
        else {
            return 94;}
    }

    private int mTokensHelper025() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 't':
            {
            int LA13_99 = input.LA(3);

            if ( (LA13_99=='r') ) {
                int LA13_174 = input.LA(4);

                if ( (LA13_174=='i') ) {
                    int LA13_229 = input.LA(5);

                    if ( (LA13_229=='n') ) {
                        int LA13_279 = input.LA(6);

                        if ( (LA13_279=='g') ) {
                            int LA13_319 = input.LA(7);

                            if ( ((LA13_319>='0' && LA13_319<='9')||(LA13_319>='A' && LA13_319<='Z')||LA13_319=='_'||(LA13_319>='a' && LA13_319<='z')) ) {
                                return 94;
                            }
                            else {
                                return 76;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
            }
        case 'e':
            {
            switch ( input.LA(3) ) {
            case 't':
                {
                switch ( input.LA(4) ) {
                case 'T':
                    {
                    int LA13_230 = input.LA(5);

                    if ( (LA13_230=='y') ) {
                        int LA13_280 = input.LA(6);

                        if ( (LA13_280=='p') ) {
                            int LA13_320 = input.LA(7);

                            if ( (LA13_320=='e') ) {
                                int LA13_353 = input.LA(8);

                                if ( ((LA13_353>='0' && LA13_353<='9')||(LA13_353>='A' && LA13_353<='Z')||LA13_353=='_'||(LA13_353>='a' && LA13_353<='z')) ) {
                                    return 94;
                                }
                                else {
                                    return 35;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
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
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    return 94;
                    }
                default:
                    return 81;}

                }
            case 'q':
                {
                int LA13_176 = input.LA(4);

                if ( (LA13_176=='u') ) {
                    int LA13_232 = input.LA(5);

                    if ( (LA13_232=='e') ) {
                        int LA13_281 = input.LA(6);

                        if ( (LA13_281=='n') ) {
                            int LA13_321 = input.LA(7);

                            if ( (LA13_321=='c') ) {
                                int LA13_354 = input.LA(8);

                                if ( (LA13_354=='e') ) {
                                    switch ( input.LA(9) ) {
                                    case 'T':
                                        {
                                        int LA13_397 = input.LA(10);

                                        if ( (LA13_397=='y') ) {
                                            int LA13_413 = input.LA(11);

                                            if ( (LA13_413=='p') ) {
                                                int LA13_426 = input.LA(12);

                                                if ( (LA13_426=='e') ) {
                                                    int LA13_434 = input.LA(13);

                                                    if ( ((LA13_434>='0' && LA13_434<='9')||(LA13_434>='A' && LA13_434<='Z')||LA13_434=='_'||(LA13_434>='a' && LA13_434<='z')) ) {
                                                        return 94;
                                                    }
                                                    else {
                                                        return 34;}
                                                }
                                                else {
                                                    return 94;}
                                            }
                                            else {
                                                return 94;}
                                        }
                                        else {
                                            return 94;}
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
                                    case 'v':
                                    case 'w':
                                    case 'x':
                                    case 'y':
                                    case 'z':
                                        {
                                        return 94;
                                        }
                                    default:
                                        return 83;}

                                }
                                else {
                                    return 94;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
                }
            default:
                return 94;}

            }
        default:
            return 94;}

    }

    private int mTokensHelper026() throws RecognitionException {
        int LA13_26 = input.LA(2);

        if ( (LA13_26=='o') ) {
            int LA13_101 = input.LA(3);

            if ( (LA13_101=='i') ) {
                int LA13_177 = input.LA(4);

                if ( (LA13_177=='d') ) {
                    int LA13_233 = input.LA(5);

                    if ( (LA13_233=='T') ) {
                        int LA13_282 = input.LA(6);

                        if ( (LA13_282=='y') ) {
                            int LA13_322 = input.LA(7);

                            if ( (LA13_322=='p') ) {
                                int LA13_355 = input.LA(8);

                                if ( (LA13_355=='e') ) {
                                    int LA13_382 = input.LA(9);

                                    if ( ((LA13_382>='0' && LA13_382<='9')||(LA13_382>='A' && LA13_382<='Z')||LA13_382=='_'||(LA13_382>='a' && LA13_382<='z')) ) {
                                        return 94;
                                    }
                                    else {
                                        return 37;}
                                }
                                else {
                                    return 94;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
        }
        else {
            return 94;}
    }

    private int mTokensHelper027() throws RecognitionException {
        int LA13_27 = input.LA(2);

        if ( (LA13_27=='n') ) {
            switch ( input.LA(3) ) {
            case 'n':
                {
                int LA13_178 = input.LA(4);

                if ( (LA13_178=='o') ) {
                    int LA13_234 = input.LA(5);

                    if ( (LA13_234=='t') ) {
                        int LA13_283 = input.LA(6);

                        if ( (LA13_283=='a') ) {
                            int LA13_323 = input.LA(7);

                            if ( (LA13_323=='t') ) {
                                int LA13_356 = input.LA(8);

                                if ( (LA13_356=='i') ) {
                                    int LA13_383 = input.LA(9);

                                    if ( (LA13_383=='o') ) {
                                        int LA13_400 = input.LA(10);

                                        if ( (LA13_400=='n') ) {
                                            int LA13_414 = input.LA(11);

                                            if ( ((LA13_414>='0' && LA13_414<='9')||(LA13_414>='A' && LA13_414<='Z')||LA13_414=='_'||(LA13_414>='a' && LA13_414<='z')) ) {
                                                return 94;
                                            }
                                            else {
                                                return 38;}
                                        }
                                        else {
                                            return 94;}
                                    }
                                    else {
                                        return 94;}
                                }
                                else {
                                    return 94;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
                }
            case 'd':
                {
                int LA13_179 = input.LA(4);

                if ( ((LA13_179>='0' && LA13_179<='9')||(LA13_179>='A' && LA13_179<='Z')||LA13_179=='_'||(LA13_179>='a' && LA13_179<='z')) ) {
                    return 94;
                }
                else {
                    return 57;}
                }
            default:
                return 94;}

        }
        else {
            return 94;}
    }

    private int mTokensHelper028() throws RecognitionException {
        return 39;
    }

    private int mTokensHelper029() throws RecognitionException {
        return 40;
    }

    private int mTokensHelper030() throws RecognitionException {
        return 41;
    }

    private int mTokensHelper031() throws RecognitionException {
        return 42;
    }

    private int mTokensHelper032() throws RecognitionException {
        return 44;
    }

    private int mTokensHelper033() throws RecognitionException {
        int LA13_33 = input.LA(2);

        if ( (LA13_33=='.') ) {
            return 45;
        }
        else {
            return 53;}
    }

    private int mTokensHelper034() throws RecognitionException {
        return 46;
    }

    private int mTokensHelper035() throws RecognitionException {
        return 47;
    }

    private int mTokensHelper036() throws RecognitionException {
        return 48;
    }

    private int mTokensHelper037() throws RecognitionException {
        switch ( input.LA(2) ) {
        case '>':
            {
            return 71;
            }
        case '=':
            {
            return 70;
            }
        default:
            return 50;}

    }

    private int mTokensHelper038() throws RecognitionException {
        int LA13_38 = input.LA(2);

        if ( (LA13_38=='=') ) {
            return 69;
        }
        else {
            return 51;}
    }

    private int mTokensHelper039() throws RecognitionException {
        int LA13_39 = input.LA(2);

        if ( (LA13_39=='&') ) {
            return 52;
        }
        else {
            return 100;}
    }

    private int mTokensHelper040() throws RecognitionException {
        int LA13_40 = input.LA(2);

        if ( ((LA13_40>='0' && LA13_40<='9')||(LA13_40>='A' && LA13_40<='Z')||LA13_40=='_'||(LA13_40>='a' && LA13_40<='z')) ) {
            return 94;
        }
        else {
            return 55;}
    }

    private int mTokensHelper041() throws RecognitionException {
        switch ( input.LA(2) ) {
        case '>':
            {
            return 72;
            }
        case '-':
            {
            return 98;
            }
        default:
            return 56;}

    }

    private int mTokensHelper042() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'u':
            {
            int LA13_123 = input.LA(3);

            if ( (LA13_123=='l') ) {
                int LA13_180 = input.LA(4);

                if ( (LA13_180=='l') ) {
                    int LA13_236 = input.LA(5);

                    if ( ((LA13_236>='0' && LA13_236<='9')||(LA13_236>='A' && LA13_236<='Z')||LA13_236=='_'||(LA13_236>='a' && LA13_236<='z')) ) {
                        return 94;
                    }
                    else {
                        return 89;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
            }
        case 'o':
            {
            int LA13_124 = input.LA(3);

            if ( (LA13_124=='t') ) {
                int LA13_181 = input.LA(4);

                if ( ((LA13_181>='0' && LA13_181<='9')||(LA13_181>='A' && LA13_181<='Z')||LA13_181=='_'||(LA13_181>='a' && LA13_181<='z')) ) {
                    return 94;
                }
                else {
                    return 64;}
            }
            else {
                return 94;}
            }
        default:
            return 94;}

    }

    private int mTokensHelper043() throws RecognitionException {
        int LA13_43 = input.LA(2);

        if ( (LA13_43=='o') ) {
            int LA13_125 = input.LA(3);

            if ( (LA13_125=='r') ) {
                int LA13_182 = input.LA(4);

                if ( ((LA13_182>='0' && LA13_182<='9')||(LA13_182>='A' && LA13_182<='Z')||LA13_182=='_'||(LA13_182>='a' && LA13_182<='z')) ) {
                    return 94;
                }
                else {
                    return 67;}
            }
            else {
                return 94;}
        }
        else {
            return 94;}
    }

    private int mTokensHelper044() throws RecognitionException {
        switch ( input.LA(2) ) {
        case '\'':
            {
            return 91;
            }
        case '*':
            {
            int LA13_127 = input.LA(3);

            if ( ((LA13_127>='\u0000' && LA13_127<=')')||(LA13_127>='+' && LA13_127<='\uFFFE')) ) {
                return 97;
            }
            else if ( (LA13_127=='*') ) {
                return 96;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | RULE_ML_SINGLE_QUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ID | RULE_INT | RULE_DOCUMENTATION | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 13, 127, input);

                throw nvae;
            }
            }
        default:
            return 68;}

    }

    private int mTokensHelper045() throws RecognitionException {
        int LA13_45 = input.LA(2);

        if ( (LA13_45=='e') ) {
            int LA13_129 = input.LA(3);

            if ( (LA13_129=='a') ) {
                int LA13_185 = input.LA(4);

                if ( (LA13_185=='l') ) {
                    int LA13_239 = input.LA(5);

                    if ( ((LA13_239>='0' && LA13_239<='9')||(LA13_239>='A' && LA13_239<='Z')||LA13_239=='_'||(LA13_239>='a' && LA13_239<='z')) ) {
                        return 94;
                    }
                    else {
                        return 75;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
        }
        else {
            return 94;}
    }

    private int mTokensHelper046() throws RecognitionException {
        int LA13_46 = input.LA(2);

        if ( (LA13_46=='n') ) {
            int LA13_130 = input.LA(3);

            if ( (LA13_130=='l') ) {
                int LA13_186 = input.LA(4);

                if ( (LA13_186=='i') ) {
                    int LA13_240 = input.LA(5);

                    if ( (LA13_240=='m') ) {
                        int LA13_286 = input.LA(6);

                        if ( (LA13_286=='i') ) {
                            int LA13_324 = input.LA(7);

                            if ( (LA13_324=='t') ) {
                                int LA13_357 = input.LA(8);

                                if ( (LA13_357=='e') ) {
                                    int LA13_384 = input.LA(9);

                                    if ( (LA13_384=='d') ) {
                                        int LA13_401 = input.LA(10);

                                        if ( (LA13_401=='N') ) {
                                            int LA13_415 = input.LA(11);

                                            if ( (LA13_415=='a') ) {
                                                int LA13_428 = input.LA(12);

                                                if ( (LA13_428=='t') ) {
                                                    int LA13_435 = input.LA(13);

                                                    if ( (LA13_435=='u') ) {
                                                        int LA13_441 = input.LA(14);

                                                        if ( (LA13_441=='r') ) {
                                                            int LA13_446 = input.LA(15);

                                                            if ( (LA13_446=='a') ) {
                                                                int LA13_449 = input.LA(16);

                                                                if ( (LA13_449=='l') ) {
                                                                    int LA13_450 = input.LA(17);

                                                                    if ( ((LA13_450>='0' && LA13_450<='9')||(LA13_450>='A' && LA13_450<='Z')||LA13_450=='_'||(LA13_450>='a' && LA13_450<='z')) ) {
                                                                        return 94;
                                                                    }
                                                                    else {
                                                                        return 77;}
                                                                }
                                                                else {
                                                                    return 94;}
                                                            }
                                                            else {
                                                                return 94;}
                                                        }
                                                        else {
                                                            return 94;}
                                                    }
                                                    else {
                                                        return 94;}
                                                }
                                                else {
                                                    return 94;}
                                            }
                                            else {
                                                return 94;}
                                        }
                                        else {
                                            return 94;}
                                    }
                                    else {
                                        return 94;}
                                }
                                else {
                                    return 94;}
                            }
                            else {
                                return 94;}
                        }
                        else {
                            return 94;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
        }
        else {
            return 94;}
    }

    private int mTokensHelper047() throws RecognitionException {
        int LA13_47 = input.LA(2);

        if ( (LA13_47=='a') ) {
            int LA13_131 = input.LA(3);

            if ( (LA13_131=='l') ) {
                int LA13_187 = input.LA(4);

                if ( (LA13_187=='s') ) {
                    int LA13_241 = input.LA(5);

                    if ( (LA13_241=='e') ) {
                        int LA13_287 = input.LA(6);

                        if ( ((LA13_287>='0' && LA13_287<='9')||(LA13_287>='A' && LA13_287<='Z')||LA13_287=='_'||(LA13_287>='a' && LA13_287<='z')) ) {
                            return 94;
                        }
                        else {
                            return 87;}
                    }
                    else {
                        return 94;}
                }
                else {
                    return 94;}
            }
            else {
                return 94;}
        }
        else {
            return 94;}
    }

    private int mTokensHelper048() throws RecognitionException {
        int LA13_48 = input.LA(2);

        if ( ((LA13_48>='\u0000' && LA13_48<='\uFFFE')) ) {
            return 92;
        }
        else {
            return 100;}
    }

    private int mTokensHelper049() throws RecognitionException {
        int LA13_49 = input.LA(2);

        if ( ((LA13_49>='\u0000' && LA13_49<='\uFFFE')) ) {
            return 93;
        }
        else {
            return 100;}
    }

    private int mTokensHelper050() throws RecognitionException {
        return 94;
    }

    private int mTokensHelper051() throws RecognitionException {
        return 94;
    }

    private int mTokensHelper052() throws RecognitionException {
        return 95;
    }

    private int mTokensHelper053() throws RecognitionException {
        return 99;
    }

    private int mTokensHelper054() throws RecognitionException {
        return 100;
    }

    private int mTokensHelper055() throws RecognitionException {
        NoViableAltException nvae =
            new NoViableAltException("1:1: Tokens : ( T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | RULE_ML_SINGLE_QUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ID | RULE_INT | RULE_DOCUMENTATION | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 13, 0, input);

        throw nvae;
    }



 

}