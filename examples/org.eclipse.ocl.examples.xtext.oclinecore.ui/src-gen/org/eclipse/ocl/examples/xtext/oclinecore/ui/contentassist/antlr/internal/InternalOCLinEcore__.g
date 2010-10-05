lexer grammar InternalOCLinEcore;
@header {
package org.eclipse.ocl.examples.xtext.oclinecore.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T14 : '*' ;
T15 : 'abstract' ;
T16 : 'annotation' ;
T17 : 'attribute' ;
T18 : 'body' ;
T19 : 'class' ;
T20 : 'composes' ;
T21 : 'datatype' ;
T22 : 'definition' ;
T23 : 'derivation' ;
T24 : 'derived' ;
T25 : 'documentation' ;
T26 : 'enum' ;
T27 : 'extends' ;
T28 : 'id' ;
T29 : 'import' ;
T30 : 'initial' ;
T31 : 'interface' ;
T32 : 'invariant' ;
T33 : 'library' ;
T34 : 'operation' ;
T35 : 'ordered' ;
T36 : 'package' ;
T37 : 'postcondition' ;
T38 : 'precondition' ;
T39 : 'property' ;
T40 : 'readonly' ;
T41 : 'resolve' ;
T42 : 'serializable' ;
T43 : 'static' ;
T44 : 'super' ;
T45 : 'throws' ;
T46 : 'transient' ;
T47 : 'unique' ;
T48 : 'unsettable' ;
T49 : 'volatile' ;
T50 : ';' ;
T51 : '+' ;
T52 : '?' ;
T53 : 'e' ;
T54 : 'E' ;
T55 : '-' ;
T56 : 'not' ;
T57 : '/' ;
T58 : '>' ;
T59 : '<' ;
T60 : '>=' ;
T61 : '<=' ;
T62 : '=' ;
T63 : '<>' ;
T64 : 'and' ;
T65 : 'or' ;
T66 : 'xor' ;
T67 : 'implies' ;
T68 : '.' ;
T69 : '->' ;
T70 : 'der' ;
T71 : 'init' ;
T72 : 'inv' ;
T73 : 'post' ;
T74 : 'pre' ;
T75 : 'Boolean' ;
T76 : 'Integer' ;
T77 : 'Real' ;
T78 : 'String' ;
T79 : 'UnlimitedNatural' ;
T80 : 'OclAny' ;
T81 : 'OclInvalid' ;
T82 : 'OclVoid' ;
T83 : 'Set' ;
T84 : 'Bag' ;
T85 : 'Sequence' ;
T86 : 'Collection' ;
T87 : 'OrderedSet' ;
T88 : 'module' ;
T89 : ':' ;
T90 : '(' ;
T91 : ')' ;
T92 : ',' ;
T93 : '{' ;
T94 : '}' ;
T95 : '[' ;
T96 : ']' ;
T97 : '..' ;
T98 : '::' ;
T99 : '#' ;
T100 : '&&' ;
T101 : 'Tuple' ;
T102 : 'invalid' ;
T103 : 'null' ;
T104 : 'if' ;
T105 : 'then' ;
T106 : 'else' ;
T107 : 'endif' ;
T108 : 'let' ;
T109 : 'in' ;
T110 : 'self' ;
T111 : '!derived' ;
T112 : '!id' ;
T113 : '!ordered' ;
T114 : '!readonly' ;
T115 : '!transient' ;
T116 : '!unique' ;
T117 : '!unsettable' ;
T118 : '!volatile' ;
T119 : '!serializable' ;
T120 : '!composes' ;
T121 : '!resolve' ;
T122 : 'true' ;
T123 : 'false' ;
T124 : '|' ;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 23510
RULE_UNQUOTED_STRING : '\u00C2\u00A3$%^\u00C2\u00A3$%^';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 23512
RULE_DOUBLE_QUOTED_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 23514
RULE_SINGLE_QUOTED_STRING : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 23516
RULE_ML_SINGLE_QUOTED_STRING : '/\'' ( options {greedy=false;} : . )*'\'/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 23518
RULE_ID : (('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*|'_' RULE_SINGLE_QUOTED_STRING);

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 23520
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 23522
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 23524
RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 23526
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 23528
RULE_ANY_OTHER : .;


