lexer grammar InternalEssentialOCL;
@header {
package org.eclipse.ocl.examples.xtext.essentialocl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : 'body' ;
T14 : 'der' ;
T15 : 'init' ;
T16 : 'inv' ;
T17 : 'post' ;
T18 : 'pre' ;
T19 : ':' ;
T20 : ';' ;
T21 : '.' ;
T22 : 'e' ;
T23 : 'E' ;
T24 : '+' ;
T25 : '-' ;
T26 : 'not' ;
T27 : '*' ;
T28 : '/' ;
T29 : '>' ;
T30 : '<' ;
T31 : '>=' ;
T32 : '<=' ;
T33 : '=' ;
T34 : '<>' ;
T35 : 'and' ;
T36 : 'or' ;
T37 : 'xor' ;
T38 : 'implies' ;
T39 : '->' ;
T40 : 'Boolean' ;
T41 : 'Integer' ;
T42 : 'Real' ;
T43 : 'String' ;
T44 : 'UnlimitedNatural' ;
T45 : 'OclAny' ;
T46 : 'OclInvalid' ;
T47 : 'OclVoid' ;
T48 : 'Set' ;
T49 : 'Bag' ;
T50 : 'Sequence' ;
T51 : 'Collection' ;
T52 : 'OrderedSet' ;
T53 : '(' ;
T54 : ')' ;
T55 : 'Tuple' ;
T56 : ',' ;
T57 : '{' ;
T58 : '}' ;
T59 : '..' ;
T60 : 'true' ;
T61 : 'false' ;
T62 : 'invalid' ;
T63 : 'null' ;
T64 : '::' ;
T65 : '[' ;
T66 : ']' ;
T67 : '|' ;
T68 : 'if' ;
T69 : 'then' ;
T70 : 'else' ;
T71 : 'endif' ;
T72 : 'let' ;
T73 : 'in' ;
T74 : 'self' ;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g" 3944
RULE_DOUBLE_QUOTED_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g" 3946
RULE_SINGLE_QUOTED_STRING : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g" 3948
RULE_ML_SINGLE_QUOTED_STRING : '/\'' ( options {greedy=false;} : . )*'\'/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g" 3950
RULE_ID : (('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*|'_' RULE_SINGLE_QUOTED_STRING);

// $ANTLR src "../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g" 3952
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g" 3954
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g" 3956
RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g" 3958
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g" 3960
RULE_ANY_OTHER : .;


