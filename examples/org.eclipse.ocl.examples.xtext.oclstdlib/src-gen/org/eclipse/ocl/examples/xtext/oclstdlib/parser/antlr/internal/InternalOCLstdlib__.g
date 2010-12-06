lexer grammar InternalOCLstdlib;
@header {
package org.eclipse.ocl.examples.xtext.oclstdlib.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T14 : 'library' ;
T15 : 'module' ;
T16 : ':' ;
T17 : '=' ;
T18 : '{' ;
T19 : 'precedence' ;
T20 : ';' ;
T21 : '}' ;
T22 : '*' ;
T23 : 'conformsTo' ;
T24 : 'documentation' ;
T25 : 'extends' ;
T26 : 'import' ;
T27 : 'inv' ;
T28 : 'iteration' ;
T29 : 'left' ;
T30 : 'operation' ;
T31 : 'package' ;
T32 : 'post' ;
T33 : 'pre' ;
T34 : 'primitive' ;
T35 : 'property' ;
T36 : 'right' ;
T37 : 'static' ;
T38 : 'super' ;
T39 : 'type' ;
T40 : 'Tuple' ;
T41 : 'annotation' ;
T42 : '(' ;
T43 : ',' ;
T44 : ')' ;
T45 : '|' ;
T46 : '=>' ;
T47 : '[' ;
T48 : '..' ;
T49 : '+' ;
T50 : '?' ;
T51 : ']' ;
T52 : '::' ;
T53 : '<' ;
T54 : '>' ;
T55 : '&&' ;
T56 : '.' ;
T57 : 'e' ;
T58 : 'E' ;
T59 : '-' ;
T60 : 'and' ;
T61 : 'else' ;
T62 : 'endif' ;
T63 : 'if' ;
T64 : 'implies' ;
T65 : 'in' ;
T66 : 'let' ;
T67 : 'not' ;
T68 : 'or' ;
T69 : 'then' ;
T70 : 'xor' ;
T71 : '/' ;
T72 : '>=' ;
T73 : '<=' ;
T74 : '<>' ;
T75 : '->' ;
T76 : 'Boolean' ;
T77 : 'Integer' ;
T78 : 'Real' ;
T79 : 'String' ;
T80 : 'UnlimitedNatural' ;
T81 : 'OclAny' ;
T82 : 'OclInvalid' ;
T83 : 'OclVoid' ;
T84 : 'Set' ;
T85 : 'Bag' ;
T86 : 'Sequence' ;
T87 : 'Collection' ;
T88 : 'OrderedSet' ;
T89 : 'true' ;
T90 : 'false' ;
T91 : 'invalid' ;
T92 : 'null' ;
T93 : 'self' ;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 8131
RULE_ML_SINGLE_QUOTED_STRING : '/\'' ( options {greedy=false;} : . )*'\'/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 8133
RULE_DOUBLE_QUOTED_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 8135
RULE_SINGLE_QUOTED_STRING : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 8137
RULE_ID : (('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*|'_' RULE_SINGLE_QUOTED_STRING);

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 8139
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 8141
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'**/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 8143
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 8145
RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 8147
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 8149
RULE_ANY_OTHER : .;


