lexer grammar InternalOCLinEcore;
@header {
package org.eclipse.ocl.examples.xtext.oclinecore.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T14 : 'module' ;
T15 : '*' ;
T16 : 'abstract' ;
T17 : 'annotation' ;
T18 : 'attribute' ;
T19 : 'body' ;
T20 : 'class' ;
T21 : 'composes' ;
T22 : 'datatype' ;
T23 : 'definition' ;
T24 : 'derivation' ;
T25 : 'derived' ;
T26 : 'documentation' ;
T27 : 'enum' ;
T28 : 'extends' ;
T29 : 'id' ;
T30 : 'import' ;
T31 : 'initial' ;
T32 : 'interface' ;
T33 : 'invariant' ;
T34 : 'library' ;
T35 : 'operation' ;
T36 : 'ordered' ;
T37 : 'package' ;
T38 : 'postcondition' ;
T39 : 'precondition' ;
T40 : 'property' ;
T41 : 'readonly' ;
T42 : 'resolve' ;
T43 : 'serializable' ;
T44 : 'static' ;
T45 : 'super' ;
T46 : 'throws' ;
T47 : 'transient' ;
T48 : 'unique' ;
T49 : 'unsettable' ;
T50 : 'volatile' ;
T51 : ':' ;
T52 : ';' ;
T53 : '(' ;
T54 : ')' ;
T55 : ',' ;
T56 : '{' ;
T57 : '}' ;
T58 : '[' ;
T59 : '..' ;
T60 : '+' ;
T61 : '?' ;
T62 : ']' ;
T63 : '=' ;
T64 : '!derived' ;
T65 : '!id' ;
T66 : '!ordered' ;
T67 : '!readonly' ;
T68 : '!transient' ;
T69 : '!unique' ;
T70 : '!unsettable' ;
T71 : '!volatile' ;
T72 : '!serializable' ;
T73 : '::' ;
T74 : '#' ;
T75 : '!composes' ;
T76 : '!resolve' ;
T77 : '<' ;
T78 : '>' ;
T79 : '&&' ;
T80 : '.' ;
T81 : 'e' ;
T82 : 'E' ;
T83 : '-' ;
T84 : 'not' ;
T85 : '/' ;
T86 : '>=' ;
T87 : '<=' ;
T88 : '<>' ;
T89 : 'and' ;
T90 : 'or' ;
T91 : 'xor' ;
T92 : 'implies' ;
T93 : '->' ;
T94 : 'der' ;
T95 : 'init' ;
T96 : 'inv' ;
T97 : 'post' ;
T98 : 'pre' ;
T99 : 'Boolean' ;
T100 : 'Integer' ;
T101 : 'Real' ;
T102 : 'String' ;
T103 : 'UnlimitedNatural' ;
T104 : 'OclAny' ;
T105 : 'OclInvalid' ;
T106 : 'OclVoid' ;
T107 : 'Set' ;
T108 : 'Bag' ;
T109 : 'Sequence' ;
T110 : 'Collection' ;
T111 : 'OrderedSet' ;
T112 : 'Tuple' ;
T113 : 'true' ;
T114 : 'false' ;
T115 : 'invalid' ;
T116 : 'null' ;
T117 : '|' ;
T118 : 'if' ;
T119 : 'then' ;
T120 : 'else' ;
T121 : 'endif' ;
T122 : 'let' ;
T123 : 'in' ;
T124 : 'self' ;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/parser/antlr/internal/InternalOCLinEcore.g" 10374
RULE_UNQUOTED_STRING : '\u00C2\u00A3$%^\u00C2\u00A3$%^';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/parser/antlr/internal/InternalOCLinEcore.g" 10376
RULE_DOUBLE_QUOTED_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/parser/antlr/internal/InternalOCLinEcore.g" 10378
RULE_SINGLE_QUOTED_STRING : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/parser/antlr/internal/InternalOCLinEcore.g" 10380
RULE_ML_SINGLE_QUOTED_STRING : '/\'' ( options {greedy=false;} : . )*'\'/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/parser/antlr/internal/InternalOCLinEcore.g" 10382
RULE_ID : (('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*|'_' RULE_SINGLE_QUOTED_STRING);

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/parser/antlr/internal/InternalOCLinEcore.g" 10384
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/parser/antlr/internal/InternalOCLinEcore.g" 10386
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/parser/antlr/internal/InternalOCLinEcore.g" 10388
RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/parser/antlr/internal/InternalOCLinEcore.g" 10390
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/parser/antlr/internal/InternalOCLinEcore.g" 10392
RULE_ANY_OTHER : .;


