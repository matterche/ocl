lexer grammar InternalOCLstdlib;
@header {
package org.eclipse.ocl.examples.xtext.oclstdlib.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T14 : 'library' ;
T15 : 'module' ;
T16 : '*' ;
T17 : 'conformsTo' ;
T18 : 'documentation' ;
T19 : 'extends' ;
T20 : 'import' ;
T21 : 'inv' ;
T22 : 'iteration' ;
T23 : 'left' ;
T24 : 'operation' ;
T25 : 'package' ;
T26 : 'post' ;
T27 : 'pre' ;
T28 : 'precedence' ;
T29 : 'primitive' ;
T30 : 'property' ;
T31 : 'right' ;
T32 : 'static' ;
T33 : 'super' ;
T34 : 'type' ;
T35 : 'Tuple' ;
T36 : ';' ;
T37 : '+' ;
T38 : '?' ;
T39 : 'e' ;
T40 : 'E' ;
T41 : '-' ;
T42 : 'and' ;
T43 : 'else' ;
T44 : 'endif' ;
T45 : 'if' ;
T46 : 'implies' ;
T47 : 'in' ;
T48 : 'let' ;
T49 : 'not' ;
T50 : 'or' ;
T51 : 'then' ;
T52 : 'xor' ;
T53 : '/' ;
T54 : '>' ;
T55 : '<' ;
T56 : '>=' ;
T57 : '<=' ;
T58 : '=' ;
T59 : '<>' ;
T60 : '.' ;
T61 : '->' ;
T62 : 'Boolean' ;
T63 : 'Integer' ;
T64 : 'Real' ;
T65 : 'String' ;
T66 : 'UnlimitedNatural' ;
T67 : 'OclAny' ;
T68 : 'OclInvalid' ;
T69 : 'OclVoid' ;
T70 : 'Set' ;
T71 : 'Bag' ;
T72 : 'Sequence' ;
T73 : 'Collection' ;
T74 : 'OrderedSet' ;
T75 : '{' ;
T76 : '}' ;
T77 : ':' ;
T78 : 'annotation' ;
T79 : '(' ;
T80 : ')' ;
T81 : ',' ;
T82 : '|' ;
T83 : '=>' ;
T84 : '[' ;
T85 : ']' ;
T86 : '..' ;
T87 : '::' ;
T88 : '&&' ;
T89 : 'invalid' ;
T90 : 'null' ;
T91 : 'self' ;
T92 : 'true' ;
T93 : 'false' ;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 18362
RULE_ML_SINGLE_QUOTED_STRING : '/\'' ( options {greedy=false;} : . )*'\'/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 18364
RULE_DOUBLE_QUOTED_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 18366
RULE_SINGLE_QUOTED_STRING : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 18368
RULE_ID : (('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*|'_' RULE_SINGLE_QUOTED_STRING);

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 18370
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 18372
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'**/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 18374
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 18376
RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 18378
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 18380
RULE_ANY_OTHER : .;


