/**
* Essential OCL Grammar
* <copyright>
*
* Copyright (c) 2005, 2010 IBM Corporation and others.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   IBM - Initial API and implementation
*   E.D.Willink - Elimination of some shift-reduce conflicts
*   E.D.Willink - Remove unnecessary warning suppression
*   E.D.Willink - Bugs 184048, 225493, 243976, 259818, 282882, 287993, 288040, 292112, 295166
*   Borland - Bug 242880
*   Adolfo Sanchez-Barbudo Herrera (Open Canarias):
*        - 242153: LPG v 2.0.17 adoption.
*        - 299396: Introducing new LPG templates
*        - 300534: Removing the use of deprecated macros.
* </copyright>
*
* $Id: EssentialOCL.gi,v 1.2 2011/01/24 21:31:48 ewillink Exp $
*/
/**
* Complete OCL Grammar
* <copyright>
*
* Copyright (c) 2005, 2009 IBM Corporation and others.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   IBM - Initial API and implementation
*   E.D.Willink - Bug 259818, 285633, 292112
*   Adolfo Sanchez-Barbudo Herrera (Open Canarias):
*        - 242153: LPG v 2.0.17 adoption.
*        - 299396: Introducing new LPG templates
*        - 300534: Removing the use of deprecated macros.
* </copyright>
*/

package org.eclipse.ocl.examples.xtext.essentialocl.parser;

public interface OCLParsersym {
    public final static int
      TK_QUOTED_IDENTIFIER = 2,
      TK_INTEGER_LITERAL = 26,
      TK_REAL_LITERAL = 27,
      TK_STRING_LITERAL = 23,
      TK_PLUS = 53,
      TK_MINUS = 24,
      TK_MULTIPLY = 25,
      TK_DIVIDE = 54,
      TK_GREATER = 55,
      TK_LESS = 56,
      TK_EQUAL = 7,
      TK_GREATER_EQUAL = 57,
      TK_LESS_EQUAL = 58,
      TK_NOT_EQUAL = 59,
      TK_LPAREN = 4,
      TK_RPAREN = 5,
      TK_LBRACE = 48,
      TK_RBRACE = 49,
      TK_LBRACKET = 50,
      TK_RBRACKET = 51,
      TK_ARROW = 60,
      TK_BAR = 28,
      TK_COMMA = 6,
      TK_COLON = 1,
      TK_COLONCOLON = 38,
      TK_SEMICOLON = 61,
      TK_DOT = 62,
      TK_DOTDOT = 63,
      TK_AT = 64,
      TK_CARET = 65,
      TK_CARETCARET = 66,
      TK_QUESTIONMARK = 41,
      TK_self = 29,
      TK_if = 30,
      TK_then = 67,
      TK_else = 68,
      TK_endif = 69,
      TK_and = 70,
      TK_or = 71,
      TK_xor = 72,
      TK_not = 31,
      TK_implies = 73,
      TK_let = 32,
      TK_in = 74,
      TK_true = 33,
      TK_false = 34,
      TK_null = 35,
      TK_invalid = 36,
      TK_Set = 8,
      TK_Bag = 9,
      TK_Sequence = 10,
      TK_Collection = 11,
      TK_OrderedSet = 12,
      TK_String = 13,
      TK_Integer = 14,
      TK_UnlimitedNatural = 15,
      TK_Real = 16,
      TK_Boolean = 17,
      TK_Tuple = 18,
      TK_OclAny = 19,
      TK_OclVoid = 20,
      TK_OclInvalid = 21,
      TK_inv = 39,
      TK_pre = 42,
      TK_post = 44,
      TK_context = 43,
      TK_package = 52,
      TK_endpackage = 75,
      TK_def = 37,
      TK_body = 45,
      TK_derive = 46,
      TK_init = 47,
      TK_static = 40,
      TK_OclMessage = 22,
      TK_EOF_TOKEN = 76,
      TK_IDENTIFIER = 3,
      TK_SINGLE_LINE_COMMENT = 77,
      TK_MULTI_LINE_COMMENT = 78,
      TK_ERROR_TOKEN = 79;

    public final static String orderedTerminalSymbols[] = {
                 "",
                 "COLON",
                 "QUOTED_IDENTIFIER",
                 "IDENTIFIER",
                 "LPAREN",
                 "RPAREN",
                 "COMMA",
                 "EQUAL",
                 "Set",
                 "Bag",
                 "Sequence",
                 "Collection",
                 "OrderedSet",
                 "String",
                 "Integer",
                 "UnlimitedNatural",
                 "Real",
                 "Boolean",
                 "Tuple",
                 "OclAny",
                 "OclVoid",
                 "OclInvalid",
                 "OclMessage",
                 "STRING_LITERAL",
                 "MINUS",
                 "MULTIPLY",
                 "INTEGER_LITERAL",
                 "REAL_LITERAL",
                 "BAR",
                 "self",
                 "if",
                 "not",
                 "let",
                 "true",
                 "false",
                 "null",
                 "invalid",
                 "def",
                 "COLONCOLON",
                 "inv",
                 "static",
                 "QUESTIONMARK",
                 "pre",
                 "context",
                 "post",
                 "body",
                 "derive",
                 "init",
                 "LBRACE",
                 "RBRACE",
                 "LBRACKET",
                 "RBRACKET",
                 "package",
                 "PLUS",
                 "DIVIDE",
                 "GREATER",
                 "LESS",
                 "GREATER_EQUAL",
                 "LESS_EQUAL",
                 "NOT_EQUAL",
                 "ARROW",
                 "SEMICOLON",
                 "DOT",
                 "DOTDOT",
                 "AT",
                 "CARET",
                 "CARETCARET",
                 "then",
                 "else",
                 "endif",
                 "and",
                 "or",
                 "xor",
                 "implies",
                 "in",
                 "endpackage",
                 "EOF_TOKEN",
                 "SINGLE_LINE_COMMENT",
                 "MULTI_LINE_COMMENT",
                 "ERROR_TOKEN"
             };

    public final static int numTokenKinds = orderedTerminalSymbols.length;
    public final static boolean isValidForParser = true;
}
