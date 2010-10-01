lexer grammar InternalOCLstdlib;
@header {
package org.eclipse.ocl.examples.xtext.oclstdlib.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : 'library' ;
T14 : 'module' ;
T15 : ':' ;
T16 : '=' ;
T17 : '{' ;
T18 : 'precedence' ;
T19 : ';' ;
T20 : '}' ;
T21 : '*' ;
T22 : 'conformsTo' ;
T23 : 'documentation' ;
T24 : 'extends' ;
T25 : 'import' ;
T26 : 'iteration' ;
T27 : 'left' ;
T28 : 'operation' ;
T29 : 'package' ;
T30 : 'post' ;
T31 : 'pre' ;
T32 : 'property' ;
T33 : 'right' ;
T34 : 'super' ;
T35 : 'type' ;
T36 : 'Tuple' ;
T37 : 'annotation' ;
T38 : '(' ;
T39 : ',' ;
T40 : ')' ;
T41 : '|' ;
T42 : '=>' ;
T43 : '[' ;
T44 : '..' ;
T45 : '+' ;
T46 : '?' ;
T47 : ']' ;
T48 : '::' ;
T49 : '<' ;
T50 : '>' ;
T51 : '&&' ;
T52 : '.' ;
T53 : 'e' ;
T54 : 'E' ;
T55 : '-' ;
T56 : 'and' ;
T57 : 'else' ;
T58 : 'endif' ;
T59 : 'if' ;
T60 : 'implies' ;
T61 : 'in' ;
T62 : 'let' ;
T63 : 'not' ;
T64 : 'or' ;
T65 : 'then' ;
T66 : 'xor' ;
T67 : '/' ;
T68 : '>=' ;
T69 : '<=' ;
T70 : '<>' ;
T71 : '->' ;
T72 : 'Boolean' ;
T73 : 'Integer' ;
T74 : 'Real' ;
T75 : 'String' ;
T76 : 'UnlimitedNatural' ;
T77 : 'OclAny' ;
T78 : 'OclInvalid' ;
T79 : 'OclVoid' ;
T80 : 'Set' ;
T81 : 'Bag' ;
T82 : 'Sequence' ;
T83 : 'Collection' ;
T84 : 'OrderedSet' ;
T85 : 'true' ;
T86 : 'false' ;
T87 : 'invalid' ;
T88 : 'null' ;
T89 : 'self' ;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 7385
RULE_ML_SINGLE_QUOTED_STRING : '/\'' ( options {greedy=false;} : . )*'\'/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 7387
RULE_DOUBLE_QUOTED_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 7389
RULE_SINGLE_QUOTED_STRING : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 7391
RULE_ID : (('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*|'_' RULE_SINGLE_QUOTED_STRING);

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 7393
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 7395
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 7397
RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 7399
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 7401
RULE_ANY_OTHER : .;


