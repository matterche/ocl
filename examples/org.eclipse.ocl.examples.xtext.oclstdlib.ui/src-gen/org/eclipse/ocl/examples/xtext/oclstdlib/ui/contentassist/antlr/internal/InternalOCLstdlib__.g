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
T29 : 'property' ;
T30 : 'right' ;
T31 : 'static' ;
T32 : 'super' ;
T33 : 'type' ;
T34 : 'Tuple' ;
T35 : 'AnyType' ;
T36 : 'BagType' ;
T37 : 'Class' ;
T38 : 'CollectionType' ;
T39 : 'InvalidType' ;
T40 : 'OrderedSetType' ;
T41 : 'PrimitiveType' ;
T42 : 'SequenceType' ;
T43 : 'SetType' ;
T44 : 'TupleType' ;
T45 : 'VoidType' ;
T46 : ';' ;
T47 : '+' ;
T48 : '?' ;
T49 : 'e' ;
T50 : 'E' ;
T51 : '-' ;
T52 : 'and' ;
T53 : 'else' ;
T54 : 'endif' ;
T55 : 'if' ;
T56 : 'implies' ;
T57 : 'in' ;
T58 : 'let' ;
T59 : 'not' ;
T60 : 'or' ;
T61 : 'then' ;
T62 : 'xor' ;
T63 : '/' ;
T64 : '>' ;
T65 : '<' ;
T66 : '>=' ;
T67 : '<=' ;
T68 : '=' ;
T69 : '<>' ;
T70 : '.' ;
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
T85 : '{' ;
T86 : '}' ;
T87 : ':' ;
T88 : 'annotation' ;
T89 : '(' ;
T90 : ')' ;
T91 : ',' ;
T92 : '|' ;
T93 : '=>' ;
T94 : '[' ;
T95 : ']' ;
T96 : '..' ;
T97 : '::' ;
T98 : '&&' ;
T99 : 'invalid' ;
T100 : 'null' ;
T101 : 'self' ;
T102 : 'true' ;
T103 : 'false' ;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 18606
RULE_ML_SINGLE_QUOTED_STRING : '/\'' ( options {greedy=false;} : . )*'\'/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 18608
RULE_DOUBLE_QUOTED_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 18610
RULE_SINGLE_QUOTED_STRING : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 18612
RULE_ID : (('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*|'_' RULE_SINGLE_QUOTED_STRING);

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 18614
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 18616
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'**/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 18618
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 18620
RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 18622
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 18624
RULE_ANY_OTHER : .;


