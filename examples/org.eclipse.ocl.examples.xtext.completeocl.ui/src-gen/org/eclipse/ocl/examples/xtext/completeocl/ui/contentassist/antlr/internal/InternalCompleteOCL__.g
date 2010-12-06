lexer grammar InternalCompleteOCL;
@header {
package org.eclipse.ocl.examples.xtext.completeocl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
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
T33 : 'e' ;
T34 : 'E' ;
T35 : '+' ;
T36 : '-' ;
T37 : 'der' ;
T38 : 'post' ;
T39 : 'pre' ;
T40 : 'not' ;
T41 : '*' ;
T42 : '/' ;
T43 : '>' ;
T44 : '<' ;
T45 : '>=' ;
T46 : '<=' ;
T47 : '=' ;
T48 : '<>' ;
T49 : 'and' ;
T50 : 'or' ;
T51 : 'xor' ;
T52 : 'implies' ;
T53 : '.' ;
T54 : '->' ;
T55 : 'Set' ;
T56 : 'Bag' ;
T57 : 'Sequence' ;
T58 : 'Collection' ;
T59 : 'OrderedSet' ;
T60 : ':' ;
T61 : '(' ;
T62 : ')' ;
T63 : ',' ;
T64 : 'package' ;
T65 : 'endpackage' ;
T66 : '::' ;
T67 : '@' ;
T68 : '?' ;
T69 : '{' ;
T70 : '}' ;
T71 : '..' ;
T72 : 'Tuple' ;
T73 : 'invalid' ;
T74 : 'null' ;
T75 : '[' ;
T76 : ']' ;
T77 : 'if' ;
T78 : 'then' ;
T79 : 'else' ;
T80 : 'endif' ;
T81 : 'let' ;
T82 : 'in' ;
T83 : 'self' ;
T84 : 'static' ;
T85 : 'true' ;
T86 : 'false' ;
T87 : '|' ;
T88 : ';' ;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g" 13396
RULE_DOUBLE_QUOTED_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g" 13398
RULE_SINGLE_QUOTED_STRING : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g" 13400
RULE_ML_SINGLE_QUOTED_STRING : '/\'' ( options {greedy=false;} : . )*'\'/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g" 13402
RULE_ID : (('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*|'_' RULE_SINGLE_QUOTED_STRING);

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g" 13404
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g" 13406
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'**/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g" 13408
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g" 13410
RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g" 13412
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g" 13414
RULE_ANY_OTHER : .;


