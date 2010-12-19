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
T34 : 'property' ;
T35 : 'right' ;
T36 : 'static' ;
T37 : 'super' ;
T38 : 'type' ;
T39 : 'Tuple' ;
T40 : 'AnyType' ;
T41 : 'BagType' ;
T42 : 'Class' ;
T43 : 'CollectionType' ;
T44 : 'InvalidType' ;
T45 : 'OrderedSetType' ;
T46 : 'PrimitiveType' ;
T47 : 'SequenceType' ;
T48 : 'SetType' ;
T49 : 'TupleType' ;
T50 : 'VoidType' ;
T51 : 'annotation' ;
T52 : '(' ;
T53 : ',' ;
T54 : ')' ;
T55 : '|' ;
T56 : '=>' ;
T57 : '[' ;
T58 : '..' ;
T59 : '+' ;
T60 : '?' ;
T61 : ']' ;
T62 : '::' ;
T63 : '<' ;
T64 : '>' ;
T65 : '&&' ;
T66 : '.' ;
T67 : 'e' ;
T68 : 'E' ;
T69 : '-' ;
T70 : 'and' ;
T71 : 'else' ;
T72 : 'endif' ;
T73 : 'if' ;
T74 : 'implies' ;
T75 : 'in' ;
T76 : 'let' ;
T77 : 'not' ;
T78 : 'or' ;
T79 : 'then' ;
T80 : 'xor' ;
T81 : '/' ;
T82 : '>=' ;
T83 : '<=' ;
T84 : '<>' ;
T85 : '->' ;
T86 : 'Boolean' ;
T87 : 'Integer' ;
T88 : 'Real' ;
T89 : 'String' ;
T90 : 'UnlimitedNatural' ;
T91 : 'OclAny' ;
T92 : 'OclInvalid' ;
T93 : 'OclVoid' ;
T94 : 'Set' ;
T95 : 'Bag' ;
T96 : 'Sequence' ;
T97 : 'Collection' ;
T98 : 'OrderedSet' ;
T99 : 'true' ;
T100 : 'false' ;
T101 : 'invalid' ;
T102 : 'null' ;
T103 : 'self' ;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 8261
RULE_ML_SINGLE_QUOTED_STRING : '/\'' ( options {greedy=false;} : . )*'\'/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 8263
RULE_DOUBLE_QUOTED_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 8265
RULE_SINGLE_QUOTED_STRING : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 8267
RULE_ID : (('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*|'_' RULE_SINGLE_QUOTED_STRING);

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 8269
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 8271
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'**/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 8273
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 8275
RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 8277
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/parser/antlr/internal/InternalOCLstdlib.g" 8279
RULE_ANY_OTHER : .;


