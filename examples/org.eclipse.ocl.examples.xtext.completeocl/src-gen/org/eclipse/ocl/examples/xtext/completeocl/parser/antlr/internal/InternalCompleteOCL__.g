lexer grammar InternalCompleteOCL;
@header {
package org.eclipse.ocl.examples.xtext.completeocl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : '^' ;
T14 : '^^' ;
T15 : 'body' ;
T16 : 'context' ;
T17 : 'def' ;
T18 : 'derive' ;
T19 : 'import' ;
T20 : 'init' ;
T21 : 'inv' ;
T22 : 'Boolean' ;
T23 : 'Integer' ;
T24 : 'Real' ;
T25 : 'String' ;
T26 : 'UnlimitedNatural' ;
T27 : 'OclAny' ;
T28 : 'OclInvalid' ;
T29 : 'OclMessage' ;
T30 : 'OclState' ;
T31 : 'OclVoid' ;
T32 : ':' ;
T33 : 'static' ;
T34 : '(' ;
T35 : ',' ;
T36 : ')' ;
T37 : '=' ;
T38 : 'package' ;
T39 : 'endpackage' ;
T40 : 'post' ;
T41 : 'pre' ;
T42 : '::' ;
T43 : '@' ;
T44 : '?' ;
T45 : '.' ;
T46 : 'e' ;
T47 : 'E' ;
T48 : '+' ;
T49 : '-' ;
T50 : 'not' ;
T51 : '*' ;
T52 : '/' ;
T53 : '>' ;
T54 : '<' ;
T55 : '>=' ;
T56 : '<=' ;
T57 : '<>' ;
T58 : 'and' ;
T59 : 'or' ;
T60 : 'xor' ;
T61 : 'implies' ;
T62 : '->' ;
T63 : 'der' ;
T64 : 'Set' ;
T65 : 'Bag' ;
T66 : 'Sequence' ;
T67 : 'Collection' ;
T68 : 'OrderedSet' ;
T69 : 'Tuple' ;
T70 : '{' ;
T71 : '}' ;
T72 : '..' ;
T73 : 'true' ;
T74 : 'false' ;
T75 : 'invalid' ;
T76 : 'null' ;
T77 : '[' ;
T78 : ']' ;
T79 : '|' ;
T80 : ';' ;
T81 : 'if' ;
T82 : 'then' ;
T83 : 'else' ;
T84 : 'endif' ;
T85 : 'let' ;
T86 : 'in' ;
T87 : 'self' ;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g" 6350
RULE_DOUBLE_QUOTED_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g" 6352
RULE_SINGLE_QUOTED_STRING : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g" 6354
RULE_ML_SINGLE_QUOTED_STRING : '/\'' ( options {greedy=false;} : . )*'\'/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g" 6356
RULE_ID : (('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*|'_' RULE_SINGLE_QUOTED_STRING);

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g" 6358
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g" 6360
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g" 6362
RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g" 6364
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g" 6366
RULE_ANY_OTHER : .;


