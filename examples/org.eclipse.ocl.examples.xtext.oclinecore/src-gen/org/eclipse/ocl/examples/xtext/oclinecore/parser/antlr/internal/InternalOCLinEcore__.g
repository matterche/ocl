lexer grammar InternalOCLinEcore;
@header {
package org.eclipse.ocl.examples.xtext.oclinecore.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T15 : 'module' ;
T16 : '*' ;
T17 : 'abstract' ;
T18 : 'annotation' ;
T19 : 'attribute' ;
T20 : 'body' ;
T21 : 'class' ;
T22 : 'composes' ;
T23 : 'datatype' ;
T24 : 'definition' ;
T25 : 'derivation' ;
T26 : 'derived' ;
T27 : 'documentation' ;
T28 : 'enum' ;
T29 : 'extends' ;
T30 : 'id' ;
T31 : 'import' ;
T32 : 'initial' ;
T33 : 'interface' ;
T34 : 'invariant' ;
T35 : 'library' ;
T36 : 'operation' ;
T37 : 'ordered' ;
T38 : 'package' ;
T39 : 'postcondition' ;
T40 : 'precondition' ;
T41 : 'property' ;
T42 : 'readonly' ;
T43 : 'resolve' ;
T44 : 'serializable' ;
T45 : 'static' ;
T46 : 'super' ;
T47 : 'throws' ;
T48 : 'transient' ;
T49 : 'unique' ;
T50 : 'unsettable' ;
T51 : 'volatile' ;
T52 : ':' ;
T53 : ';' ;
T54 : '(' ;
T55 : ')' ;
T56 : ',' ;
T57 : '{' ;
T58 : '}' ;
T59 : '[' ;
T60 : '..' ;
T61 : '+' ;
T62 : '?' ;
T63 : ']' ;
T64 : '=' ;
T65 : '!derived' ;
T66 : '!id' ;
T67 : '!ordered' ;
T68 : '!readonly' ;
T69 : '!transient' ;
T70 : '!unique' ;
T71 : '!unsettable' ;
T72 : '!volatile' ;
T73 : '!serializable' ;
T74 : '::' ;
T75 : '#' ;
T76 : '!composes' ;
T77 : '!resolve' ;
T78 : '<' ;
T79 : '>' ;
T80 : '&&' ;
T81 : '.' ;
T82 : 'e' ;
T83 : 'E' ;
T84 : '-' ;
T85 : 'der' ;
T86 : 'init' ;
T87 : 'inv' ;
T88 : 'post' ;
T89 : 'pre' ;
T90 : 'not' ;
T91 : '/' ;
T92 : '>=' ;
T93 : '<=' ;
T94 : '<>' ;
T95 : 'and' ;
T96 : 'or' ;
T97 : 'xor' ;
T98 : 'implies' ;
T99 : '->' ;
T100 : 'Boolean' ;
T101 : 'Integer' ;
T102 : 'Real' ;
T103 : 'String' ;
T104 : 'UnlimitedNatural' ;
T105 : 'OclAny' ;
T106 : 'OclInvalid' ;
T107 : 'OclVoid' ;
T108 : 'Set' ;
T109 : 'Bag' ;
T110 : 'Sequence' ;
T111 : 'Collection' ;
T112 : 'OrderedSet' ;
T113 : 'Tuple' ;
T114 : 'true' ;
T115 : 'false' ;
T116 : 'invalid' ;
T117 : 'null' ;
T118 : '|' ;
T119 : 'if' ;
T120 : 'then' ;
T121 : 'else' ;
T122 : 'endif' ;
T123 : 'let' ;
T124 : 'in' ;
T125 : 'self' ;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/parser/antlr/internal/InternalOCLinEcore.g" 10437
RULE_UNQUOTED_STRING : '\u00C2\u00A3$%^\u00C2\u00A3$%^';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/parser/antlr/internal/InternalOCLinEcore.g" 10439
RULE_DOUBLE_QUOTED_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/parser/antlr/internal/InternalOCLinEcore.g" 10441
RULE_SINGLE_QUOTED_STRING : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/parser/antlr/internal/InternalOCLinEcore.g" 10443
RULE_ML_SINGLE_QUOTED_STRING : '/\'' ( options {greedy=false;} : . )*'\'/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/parser/antlr/internal/InternalOCLinEcore.g" 10445
RULE_ID : (('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*|'_' RULE_SINGLE_QUOTED_STRING);

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/parser/antlr/internal/InternalOCLinEcore.g" 10447
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/parser/antlr/internal/InternalOCLinEcore.g" 10449
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'**/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/parser/antlr/internal/InternalOCLinEcore.g" 10451
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/parser/antlr/internal/InternalOCLinEcore.g" 10453
RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/parser/antlr/internal/InternalOCLinEcore.g" 10455
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/parser/antlr/internal/InternalOCLinEcore.g" 10457
RULE_ANY_OTHER : .;


