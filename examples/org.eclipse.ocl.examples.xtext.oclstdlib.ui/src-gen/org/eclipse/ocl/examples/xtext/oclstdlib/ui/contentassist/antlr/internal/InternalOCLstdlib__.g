lexer grammar InternalOCLstdlib;
@header {
package org.eclipse.ocl.examples.xtext.oclstdlib.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T13 : 'library' ;
T14 : 'module' ;
T15 : '*' ;
T16 : 'conformsTo' ;
T17 : 'documentation' ;
T18 : 'extends' ;
T19 : 'import' ;
T20 : 'iteration' ;
T21 : 'left' ;
T22 : 'operation' ;
T23 : 'package' ;
T24 : 'post' ;
T25 : 'pre' ;
T26 : 'precedence' ;
T27 : 'property' ;
T28 : 'right' ;
T29 : 'super' ;
T30 : 'type' ;
T31 : 'Tuple' ;
T32 : ';' ;
T33 : '+' ;
T34 : '?' ;
T35 : 'e' ;
T36 : 'E' ;
T37 : '-' ;
T38 : 'and' ;
T39 : 'else' ;
T40 : 'endif' ;
T41 : 'if' ;
T42 : 'implies' ;
T43 : 'in' ;
T44 : 'let' ;
T45 : 'not' ;
T46 : 'or' ;
T47 : 'then' ;
T48 : 'xor' ;
T49 : '/' ;
T50 : '>' ;
T51 : '<' ;
T52 : '>=' ;
T53 : '<=' ;
T54 : '=' ;
T55 : '<>' ;
T56 : '.' ;
T57 : '->' ;
T58 : 'Boolean' ;
T59 : 'Integer' ;
T60 : 'Real' ;
T61 : 'String' ;
T62 : 'UnlimitedNatural' ;
T63 : 'OclAny' ;
T64 : 'OclInvalid' ;
T65 : 'OclVoid' ;
T66 : 'Set' ;
T67 : 'Bag' ;
T68 : 'Sequence' ;
T69 : 'Collection' ;
T70 : 'OrderedSet' ;
T71 : '{' ;
T72 : '}' ;
T73 : ':' ;
T74 : 'annotation' ;
T75 : '(' ;
T76 : ')' ;
T77 : ',' ;
T78 : '=>' ;
T79 : '|' ;
T80 : '[' ;
T81 : ']' ;
T82 : '..' ;
T83 : '::' ;
T84 : '&&' ;
T85 : 'invalid' ;
T86 : 'null' ;
T87 : 'self' ;
T88 : 'true' ;
T89 : 'false' ;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 16698
RULE_ML_SINGLE_QUOTED_STRING : '/\'' ( options {greedy=false;} : . )*'\'/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 16700
RULE_DOUBLE_QUOTED_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 16702
RULE_SINGLE_QUOTED_STRING : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 16704
RULE_ID : (('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*|'_' RULE_SINGLE_QUOTED_STRING);

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 16706
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 16708
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 16710
RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 16712
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 16714
RULE_ANY_OTHER : .;


