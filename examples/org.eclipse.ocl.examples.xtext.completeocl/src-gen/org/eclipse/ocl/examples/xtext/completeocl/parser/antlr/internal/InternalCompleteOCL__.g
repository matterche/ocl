lexer grammar InternalCompleteOCL;
@header {
package org.eclipse.ocl.examples.xtext.completeocl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T14 : '^' ;
T15 : '^^' ;
T16 : 'body' ;
T17 : 'context' ;
T18 : 'def' ;
T19 : 'derive' ;
T20 : 'import' ;
T21 : 'init' ;
T22 : 'inv' ;
T23 : 'Boolean' ;
T24 : 'Integer' ;
T25 : 'Real' ;
T26 : 'String' ;
T27 : 'UnlimitedNatural' ;
T28 : 'OclAny' ;
T29 : 'OclInvalid' ;
T30 : 'OclMessage' ;
T31 : 'OclState' ;
T32 : 'OclVoid' ;
T33 : ':' ;
T34 : 'static' ;
T35 : '(' ;
T36 : ',' ;
T37 : ')' ;
T38 : '=' ;
T39 : 'package' ;
T40 : 'endpackage' ;
T41 : 'post' ;
T42 : 'pre' ;
T43 : '::' ;
T44 : '@' ;
T45 : '?' ;
T46 : '.' ;
T47 : 'e' ;
T48 : 'E' ;
T49 : '+' ;
T50 : '-' ;
T51 : 'der' ;
T52 : 'not' ;
T53 : '*' ;
T54 : '/' ;
T55 : '>' ;
T56 : '<' ;
T57 : '>=' ;
T58 : '<=' ;
T59 : '<>' ;
T60 : 'and' ;
T61 : 'or' ;
T62 : 'xor' ;
T63 : 'implies' ;
T64 : '->' ;
T65 : 'Set' ;
T66 : 'Bag' ;
T67 : 'Sequence' ;
T68 : 'Collection' ;
T69 : 'OrderedSet' ;
T70 : 'Tuple' ;
T71 : '{' ;
T72 : '}' ;
T73 : '..' ;
T74 : 'true' ;
T75 : 'false' ;
T76 : 'invalid' ;
T77 : 'null' ;
T78 : '[' ;
T79 : ']' ;
T80 : ';' ;
T81 : '|' ;
T82 : 'if' ;
T83 : 'then' ;
T84 : 'else' ;
T85 : 'endif' ;
T86 : 'let' ;
T87 : 'in' ;
T88 : 'self' ;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g" 6406
RULE_DOUBLE_QUOTED_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g" 6408
RULE_SINGLE_QUOTED_STRING : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g" 6410
RULE_ML_SINGLE_QUOTED_STRING : '/\'' ( options {greedy=false;} : . )*'\'/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g" 6412
RULE_ID : (('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*|'_' RULE_SINGLE_QUOTED_STRING);

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g" 6414
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g" 6416
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'**/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g" 6418
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g" 6420
RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g" 6422
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g" 6424
RULE_ANY_OTHER : .;


