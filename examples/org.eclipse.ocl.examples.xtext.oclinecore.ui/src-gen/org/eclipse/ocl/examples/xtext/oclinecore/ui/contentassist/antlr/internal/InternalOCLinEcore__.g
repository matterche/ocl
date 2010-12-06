lexer grammar InternalOCLinEcore;
@header {
package org.eclipse.ocl.examples.xtext.oclinecore.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

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
T35 : 'module' ;
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
T52 : ';' ;
T53 : '+' ;
T54 : '?' ;
T55 : 'e' ;
T56 : 'E' ;
T57 : '-' ;
T58 : 'der' ;
T59 : 'init' ;
T60 : 'inv' ;
T61 : 'post' ;
T62 : 'pre' ;
T63 : 'not' ;
T64 : '/' ;
T65 : '>' ;
T66 : '<' ;
T67 : '>=' ;
T68 : '<=' ;
T69 : '=' ;
T70 : '<>' ;
T71 : 'and' ;
T72 : 'or' ;
T73 : 'xor' ;
T74 : 'implies' ;
T75 : '.' ;
T76 : '->' ;
T77 : 'Boolean' ;
T78 : 'Integer' ;
T79 : 'Real' ;
T80 : 'String' ;
T81 : 'UnlimitedNatural' ;
T82 : 'OclAny' ;
T83 : 'OclInvalid' ;
T84 : 'OclVoid' ;
T85 : 'Set' ;
T86 : 'Bag' ;
T87 : 'Sequence' ;
T88 : 'Collection' ;
T89 : 'OrderedSet' ;
T90 : ':' ;
T91 : '(' ;
T92 : ')' ;
T93 : ',' ;
T94 : '{' ;
T95 : '}' ;
T96 : '[' ;
T97 : ']' ;
T98 : '..' ;
T99 : '::' ;
T100 : '#' ;
T101 : '&&' ;
T102 : 'Tuple' ;
T103 : 'invalid' ;
T104 : 'null' ;
T105 : 'if' ;
T106 : 'then' ;
T107 : 'else' ;
T108 : 'endif' ;
T109 : 'let' ;
T110 : 'in' ;
T111 : 'self' ;
T112 : '!derived' ;
T113 : '!id' ;
T114 : '!ordered' ;
T115 : '!readonly' ;
T116 : '!transient' ;
T117 : '!unique' ;
T118 : '!unsettable' ;
T119 : '!volatile' ;
T120 : '!serializable' ;
T121 : '!composes' ;
T122 : '!resolve' ;
T123 : 'true' ;
T124 : 'false' ;
T125 : '|' ;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 23592
RULE_UNQUOTED_STRING : '\u00C2\u00A3$%^\u00C2\u00A3$%^';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 23594
RULE_DOUBLE_QUOTED_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 23596
RULE_SINGLE_QUOTED_STRING : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 23598
RULE_ML_SINGLE_QUOTED_STRING : '/\'' ( options {greedy=false;} : . )*'\'/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 23600
RULE_ID : (('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*|'_' RULE_SINGLE_QUOTED_STRING);

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 23602
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 23604
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'**/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 23606
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 23608
RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 23610
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 23612
RULE_ANY_OTHER : .;


