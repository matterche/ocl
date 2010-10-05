lexer grammar InternalCompleteOCL;
@header {
package org.eclipse.ocl.examples.xtext.completeocl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
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
T32 : 'e' ;
T33 : 'E' ;
T34 : '+' ;
T35 : '-' ;
T36 : 'not' ;
T37 : '*' ;
T38 : '/' ;
T39 : '>' ;
T40 : '<' ;
T41 : '>=' ;
T42 : '<=' ;
T43 : '=' ;
T44 : '<>' ;
T45 : 'and' ;
T46 : 'or' ;
T47 : 'xor' ;
T48 : 'implies' ;
T49 : '.' ;
T50 : '->' ;
T51 : 'der' ;
T52 : 'post' ;
T53 : 'pre' ;
T54 : 'Set' ;
T55 : 'Bag' ;
T56 : 'Sequence' ;
T57 : 'Collection' ;
T58 : 'OrderedSet' ;
T59 : ':' ;
T60 : '(' ;
T61 : ')' ;
T62 : ',' ;
T63 : 'package' ;
T64 : 'endpackage' ;
T65 : '::' ;
T66 : '@' ;
T67 : '?' ;
T68 : '{' ;
T69 : '}' ;
T70 : '..' ;
T71 : 'Tuple' ;
T72 : 'invalid' ;
T73 : 'null' ;
T74 : '[' ;
T75 : ']' ;
T76 : 'if' ;
T77 : 'then' ;
T78 : 'else' ;
T79 : 'endif' ;
T80 : 'let' ;
T81 : 'in' ;
T82 : 'self' ;
T83 : 'static' ;
T84 : 'true' ;
T85 : 'false' ;
T86 : '|' ;
T87 : ';' ;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g" 13322
RULE_DOUBLE_QUOTED_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g" 13324
RULE_SINGLE_QUOTED_STRING : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g" 13326
RULE_ML_SINGLE_QUOTED_STRING : '/\'' ( options {greedy=false;} : . )*'\'/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g" 13328
RULE_ID : (('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*|'_' RULE_SINGLE_QUOTED_STRING);

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g" 13330
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g" 13332
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g" 13334
RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g" 13336
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g" 13338
RULE_ANY_OTHER : .;


