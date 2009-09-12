/**
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
*   E.D.Willink - Lexer and Parser refactoring to support extensibility and flexible error handling
*   E.D.Willink - Bug 285633 static definitions
*   Adolfo Sanchez-Barbudo Herrera (Open Canarias) - LPG v 2.0.17 adoption (242153)
*
* </copyright>
*
* 
*/

package org.eclipse.ocl.parser;



public class OCLKWLexer extends OCLKWLexerprs implements OCLParsersym
{
    private char[] inputChars;
    private final int keywordKind[] = new int[64 + 1];

    public int[] getKeywordKinds() { return keywordKind; }

    public int lexer(int curtok, int lasttok)
    {
        int current_kind = getKind(inputChars[curtok]),
            act;

        for (act = tAction(START_STATE, current_kind);
             act > NUM_RULES && act < ACCEPT_ACTION;
             act = tAction(act, current_kind))
        {
            curtok++;
            current_kind = (curtok > lasttok
                                   ? Char_EOF
                                   : getKind(inputChars[curtok]));
        }

        if (act > ERROR_ACTION)
        {
            curtok++;
            act -= ERROR_ACTION;
        }

        return keywordKind[act == ERROR_ACTION  || curtok <= lasttok ? 0 : act];
    }

    public void setInputChars(char[] inputChars) { this.inputChars = inputChars; }


    final static int tokenKind[] = new int[128];
    static
    {
        tokenKind['$'] = OCLKWLexersym.Char_DollarSign;
        tokenKind['%'] = OCLKWLexersym.Char_Percent;
        tokenKind['_'] = OCLKWLexersym.Char__;

        tokenKind['a'] = OCLKWLexersym.Char_a;
        tokenKind['b'] = OCLKWLexersym.Char_b;
        tokenKind['c'] = OCLKWLexersym.Char_c;
        tokenKind['d'] = OCLKWLexersym.Char_d;
        tokenKind['e'] = OCLKWLexersym.Char_e;
        tokenKind['f'] = OCLKWLexersym.Char_f;
        tokenKind['g'] = OCLKWLexersym.Char_g;
        tokenKind['h'] = OCLKWLexersym.Char_h;
        tokenKind['i'] = OCLKWLexersym.Char_i;
        tokenKind['j'] = OCLKWLexersym.Char_j;
        tokenKind['k'] = OCLKWLexersym.Char_k;
        tokenKind['l'] = OCLKWLexersym.Char_l;
        tokenKind['m'] = OCLKWLexersym.Char_m;
        tokenKind['n'] = OCLKWLexersym.Char_n;
        tokenKind['o'] = OCLKWLexersym.Char_o;
        tokenKind['p'] = OCLKWLexersym.Char_p;
        tokenKind['q'] = OCLKWLexersym.Char_q;
        tokenKind['r'] = OCLKWLexersym.Char_r;
        tokenKind['s'] = OCLKWLexersym.Char_s;
        tokenKind['t'] = OCLKWLexersym.Char_t;
        tokenKind['u'] = OCLKWLexersym.Char_u;
        tokenKind['v'] = OCLKWLexersym.Char_v;
        tokenKind['w'] = OCLKWLexersym.Char_w;
        tokenKind['x'] = OCLKWLexersym.Char_x;
        tokenKind['y'] = OCLKWLexersym.Char_y;
        tokenKind['z'] = OCLKWLexersym.Char_z;

        tokenKind['A'] = OCLKWLexersym.Char_A;
        tokenKind['B'] = OCLKWLexersym.Char_B;
        tokenKind['C'] = OCLKWLexersym.Char_C;
        tokenKind['D'] = OCLKWLexersym.Char_D;
        tokenKind['E'] = OCLKWLexersym.Char_E;
        tokenKind['F'] = OCLKWLexersym.Char_F;
        tokenKind['G'] = OCLKWLexersym.Char_G;
        tokenKind['H'] = OCLKWLexersym.Char_H;
        tokenKind['I'] = OCLKWLexersym.Char_I;
        tokenKind['J'] = OCLKWLexersym.Char_J;
        tokenKind['K'] = OCLKWLexersym.Char_K;
        tokenKind['L'] = OCLKWLexersym.Char_L;
        tokenKind['M'] = OCLKWLexersym.Char_M;
        tokenKind['N'] = OCLKWLexersym.Char_N;
        tokenKind['O'] = OCLKWLexersym.Char_O;
        tokenKind['P'] = OCLKWLexersym.Char_P;
        tokenKind['Q'] = OCLKWLexersym.Char_Q;
        tokenKind['R'] = OCLKWLexersym.Char_R;
        tokenKind['S'] = OCLKWLexersym.Char_S;
        tokenKind['T'] = OCLKWLexersym.Char_T;
        tokenKind['U'] = OCLKWLexersym.Char_U;
        tokenKind['V'] = OCLKWLexersym.Char_V;
        tokenKind['W'] = OCLKWLexersym.Char_W;
        tokenKind['X'] = OCLKWLexersym.Char_X;
        tokenKind['Y'] = OCLKWLexersym.Char_Y;
        tokenKind['Z'] = OCLKWLexersym.Char_Z;
    };

    final int getKind(int c)
    {
        return (((c & 0xFFFFFF80) == 0) /* 0 <= c < 128? */ ? tokenKind[c] : 0);
    }


    public OCLKWLexer(char[] inputChars, int identifierKind)
    {
        this.inputChars = inputChars;
        keywordKind[0] = identifierKind;

        //
        // Rule 1:  KeyWord ::= s e l f
        //
        
		keywordKind[1] = (OCLParsersym.TK_self);
	  
	
        //
        // Rule 2:  KeyWord ::= i n v
        //
        
		keywordKind[2] = (OCLParsersym.TK_inv);
	  
	
        //
        // Rule 3:  KeyWord ::= p r e
        //
        
		keywordKind[3] = (OCLParsersym.TK_pre);
	  
	
        //
        // Rule 4:  KeyWord ::= p o s t
        //
        
		keywordKind[4] = (OCLParsersym.TK_post);
	  
	
        //
        // Rule 5:  KeyWord ::= b o d y
        //
        
		keywordKind[5] = (OCLParsersym.TK_body);
	  
	
        //
        // Rule 6:  KeyWord ::= c o n t e x t
        //
        
		keywordKind[6] = (OCLParsersym.TK_context);
	  
	
        //
        // Rule 7:  KeyWord ::= p a c k a g e
        //
        
		keywordKind[7] = (OCLParsersym.TK_package);
	  
	
        //
        // Rule 8:  KeyWord ::= e n d p a c k a g e
        //
        
		keywordKind[8] = (OCLParsersym.TK_endpackage);
	  
	
        //
        // Rule 9:  KeyWord ::= d e f
        //
        
		keywordKind[9] = (OCLParsersym.TK_def);
	  
	
        //
        // Rule 10:  KeyWord ::= d e r i v e
        //
        
		keywordKind[10] = (OCLParsersym.TK_derive);
	  
	
        //
        // Rule 11:  KeyWord ::= i n i t
        //
        
		keywordKind[11] = (OCLParsersym.TK_init);
	  
	
        //
        // Rule 12:  KeyWord ::= i f
        //
        
		keywordKind[12] = (OCLParsersym.TK_if);
	  
	
        //
        // Rule 13:  KeyWord ::= t h e n
        //
        
		keywordKind[13] = (OCLParsersym.TK_then);
	  
	
        //
        // Rule 14:  KeyWord ::= e l s e
        //
        
		keywordKind[14] = (OCLParsersym.TK_else);
	  
	
        //
        // Rule 15:  KeyWord ::= e n d i f
        //
        
		keywordKind[15] = (OCLParsersym.TK_endif);
	  
	
        //
        // Rule 16:  KeyWord ::= a n d
        //
        
		keywordKind[16] = (OCLParsersym.TK_and);
	  
	
        //
        // Rule 17:  KeyWord ::= o r
        //
        
		keywordKind[17] = (OCLParsersym.TK_or);
	  
	
        //
        // Rule 18:  KeyWord ::= x o r
        //
        
		keywordKind[18] = (OCLParsersym.TK_xor);
	  
	
        //
        // Rule 19:  KeyWord ::= n o t
        //
        
		keywordKind[19] = (OCLParsersym.TK_not);
	  
	
        //
        // Rule 20:  KeyWord ::= i m p l i e s
        //
        
		keywordKind[20] = (OCLParsersym.TK_implies);
	  
	
        //
        // Rule 21:  KeyWord ::= l e t
        //
        
		keywordKind[21] = (OCLParsersym.TK_let);
	  
	
        //
        // Rule 22:  KeyWord ::= i n
        //
        
		keywordKind[22] = (OCLParsersym.TK_in);
	  
	
        //
        // Rule 23:  KeyWord ::= t r u e
        //
        
		keywordKind[23] = (OCLParsersym.TK_true);
	  
	
        //
        // Rule 24:  KeyWord ::= f a l s e
        //
        
		keywordKind[24] = (OCLParsersym.TK_false);
	  
	
        //
        // Rule 25:  KeyWord ::= S e t
        //
        
		keywordKind[25] = (OCLParsersym.TK_Set);
	  
	
        //
        // Rule 26:  KeyWord ::= B a g
        //
        
		keywordKind[26] = (OCLParsersym.TK_Bag);
	  
	
        //
        // Rule 27:  KeyWord ::= S e q u e n c e
        //
        
		keywordKind[27] = (OCLParsersym.TK_Sequence);
	  
	
        //
        // Rule 28:  KeyWord ::= C o l l e c t i o n
        //
        
		keywordKind[28] = (OCLParsersym.TK_Collection);
	  
	
        //
        // Rule 29:  KeyWord ::= O r d e r e d S e t
        //
        
		keywordKind[29] = (OCLParsersym.TK_OrderedSet);
	  
	
        //
        // Rule 30:  KeyWord ::= i t e r a t e
        //
        
		keywordKind[30] = (OCLParsersym.TK_iterate);
	  
	
        //
        // Rule 31:  KeyWord ::= f o r A l l
        //
        
		keywordKind[31] = (OCLParsersym.TK_forAll);
	  
	
        //
        // Rule 32:  KeyWord ::= e x i s t s
        //
        
		keywordKind[32] = (OCLParsersym.TK_exists);
	  
	
        //
        // Rule 33:  KeyWord ::= i s U n i q u e
        //
        
		keywordKind[33] = (OCLParsersym.TK_isUnique);
	  
	
        //
        // Rule 34:  KeyWord ::= a n y
        //
        
		keywordKind[34] = (OCLParsersym.TK_any);
	  
	
        //
        // Rule 35:  KeyWord ::= o n e
        //
        
		keywordKind[35] = (OCLParsersym.TK_one);
	  
	
        //
        // Rule 36:  KeyWord ::= c o l l e c t
        //
        
		keywordKind[36] = (OCLParsersym.TK_collect);
	  
	
        //
        // Rule 37:  KeyWord ::= s e l e c t
        //
        
		keywordKind[37] = (OCLParsersym.TK_select);
	  
	
        //
        // Rule 38:  KeyWord ::= r e j e c t
        //
        
		keywordKind[38] = (OCLParsersym.TK_reject);
	  
	
        //
        // Rule 39:  KeyWord ::= c o l l e c t N e s t e d
        //
        
		keywordKind[39] = (OCLParsersym.TK_collectNested);
	  
	
        //
        // Rule 40:  KeyWord ::= s o r t e d B y
        //
        
		keywordKind[40] = (OCLParsersym.TK_sortedBy);
	  
	
        //
        // Rule 41:  KeyWord ::= c l o s u r e
        //
        
		keywordKind[41] = (OCLParsersym.TK_closure);
	  
	
        //
        // Rule 42:  KeyWord ::= o c l I s K i n d O f
        //
        
		keywordKind[42] = (OCLParsersym.TK_oclIsKindOf);
	  
	
        //
        // Rule 43:  KeyWord ::= o c l I s T y p e O f
        //
        
		keywordKind[43] = (OCLParsersym.TK_oclIsTypeOf);
	  
	
        //
        // Rule 44:  KeyWord ::= o c l A s T y p e
        //
        
		keywordKind[44] = (OCLParsersym.TK_oclAsType);
	  
	
        //
        // Rule 45:  KeyWord ::= o c l I s N e w
        //
        
		keywordKind[45] = (OCLParsersym.TK_oclIsNew);
	  
	
        //
        // Rule 46:  KeyWord ::= o c l I s U n d e f i n e d
        //
        
		keywordKind[46] = (OCLParsersym.TK_oclIsUndefined);
	  
	
        //
        // Rule 47:  KeyWord ::= o c l I s I n v a l i d
        //
        
		keywordKind[47] = (OCLParsersym.TK_oclIsInvalid);
	  
	
        //
        // Rule 48:  KeyWord ::= o c l I s I n S t a t e
        //
        
		keywordKind[48] = (OCLParsersym.TK_oclIsInState);
	  
	
        //
        // Rule 49:  KeyWord ::= a l l I n s t a n c e s
        //
        
		keywordKind[49] = (OCLParsersym.TK_allInstances);
	  
	
        //
        // Rule 50:  KeyWord ::= S t r i n g
        //
        
		keywordKind[50] = (OCLParsersym.TK_String);
	  
	
        //
        // Rule 51:  KeyWord ::= I n t e g e r
        //
        
		keywordKind[51] = (OCLParsersym.TK_Integer);
	  
	
        //
        // Rule 52:  KeyWord ::= U n l i m i t e d N a t u r a l
        //
        
		keywordKind[52] = (OCLParsersym.TK_UnlimitedNatural);
	  
	
        //
        // Rule 53:  KeyWord ::= R e a l
        //
        
		keywordKind[53] = (OCLParsersym.TK_Real);
	  
	
        //
        // Rule 54:  KeyWord ::= B o o l e a n
        //
        
		keywordKind[54] = (OCLParsersym.TK_Boolean);
	  
	
        //
        // Rule 55:  KeyWord ::= T u p l e
        //
        
		keywordKind[55] = (OCLParsersym.TK_Tuple);
	  
	
        //
        // Rule 56:  KeyWord ::= O c l A n y
        //
        
		keywordKind[56] = (OCLParsersym.TK_OclAny);
	  
	
        //
        // Rule 57:  KeyWord ::= O c l V o i d
        //
        
		keywordKind[57] = (OCLParsersym.TK_OclVoid);
	  
	
        //
        // Rule 58:  KeyWord ::= O c l I n v a l i d
        //
        
		keywordKind[58] = (OCLParsersym.TK_OclInvalid);
	  
	
        //
        // Rule 59:  KeyWord ::= O c l M e s s a g e
        //
        
		keywordKind[59] = (OCLParsersym.TK_OclMessage);
	  
	
        //
        // Rule 60:  KeyWord ::= n u l l
        //
        
		keywordKind[60] = (OCLParsersym.TK_null);
	  
	
        //
        // Rule 61:  KeyWord ::= i n v a l i d
        //
        
		keywordKind[61] = (OCLParsersym.TK_invalid);
	  
	
        //
        // Rule 62:  KeyWord ::= a t t r
        //
        
		keywordKind[62] = (OCLParsersym.TK_attr);
	  
	
        //
        // Rule 63:  KeyWord ::= o p e r
        //
        
		keywordKind[63] = (OCLParsersym.TK_oper);
	  
	
        //
        // Rule 64:  KeyWord ::= s t a t i c
        //
        
		keywordKind[64] = (OCLParsersym.TK_static);
	  
	
        for (int i = 0; i < keywordKind.length; i++)
        {
            if (keywordKind[i] == 0)
                keywordKind[i] = identifierKind;
        }
    }
}

