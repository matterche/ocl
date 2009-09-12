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

package org.eclipse.ocl.parser.backtracking;



public class OCLBacktrackingKWLexer extends OCLBacktrackingKWLexerprs implements OCLBacktrackingParsersym
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
        tokenKind['$'] = OCLBacktrackingKWLexersym.Char_DollarSign;
        tokenKind['%'] = OCLBacktrackingKWLexersym.Char_Percent;
        tokenKind['_'] = OCLBacktrackingKWLexersym.Char__;

        tokenKind['a'] = OCLBacktrackingKWLexersym.Char_a;
        tokenKind['b'] = OCLBacktrackingKWLexersym.Char_b;
        tokenKind['c'] = OCLBacktrackingKWLexersym.Char_c;
        tokenKind['d'] = OCLBacktrackingKWLexersym.Char_d;
        tokenKind['e'] = OCLBacktrackingKWLexersym.Char_e;
        tokenKind['f'] = OCLBacktrackingKWLexersym.Char_f;
        tokenKind['g'] = OCLBacktrackingKWLexersym.Char_g;
        tokenKind['h'] = OCLBacktrackingKWLexersym.Char_h;
        tokenKind['i'] = OCLBacktrackingKWLexersym.Char_i;
        tokenKind['j'] = OCLBacktrackingKWLexersym.Char_j;
        tokenKind['k'] = OCLBacktrackingKWLexersym.Char_k;
        tokenKind['l'] = OCLBacktrackingKWLexersym.Char_l;
        tokenKind['m'] = OCLBacktrackingKWLexersym.Char_m;
        tokenKind['n'] = OCLBacktrackingKWLexersym.Char_n;
        tokenKind['o'] = OCLBacktrackingKWLexersym.Char_o;
        tokenKind['p'] = OCLBacktrackingKWLexersym.Char_p;
        tokenKind['q'] = OCLBacktrackingKWLexersym.Char_q;
        tokenKind['r'] = OCLBacktrackingKWLexersym.Char_r;
        tokenKind['s'] = OCLBacktrackingKWLexersym.Char_s;
        tokenKind['t'] = OCLBacktrackingKWLexersym.Char_t;
        tokenKind['u'] = OCLBacktrackingKWLexersym.Char_u;
        tokenKind['v'] = OCLBacktrackingKWLexersym.Char_v;
        tokenKind['w'] = OCLBacktrackingKWLexersym.Char_w;
        tokenKind['x'] = OCLBacktrackingKWLexersym.Char_x;
        tokenKind['y'] = OCLBacktrackingKWLexersym.Char_y;
        tokenKind['z'] = OCLBacktrackingKWLexersym.Char_z;

        tokenKind['A'] = OCLBacktrackingKWLexersym.Char_A;
        tokenKind['B'] = OCLBacktrackingKWLexersym.Char_B;
        tokenKind['C'] = OCLBacktrackingKWLexersym.Char_C;
        tokenKind['D'] = OCLBacktrackingKWLexersym.Char_D;
        tokenKind['E'] = OCLBacktrackingKWLexersym.Char_E;
        tokenKind['F'] = OCLBacktrackingKWLexersym.Char_F;
        tokenKind['G'] = OCLBacktrackingKWLexersym.Char_G;
        tokenKind['H'] = OCLBacktrackingKWLexersym.Char_H;
        tokenKind['I'] = OCLBacktrackingKWLexersym.Char_I;
        tokenKind['J'] = OCLBacktrackingKWLexersym.Char_J;
        tokenKind['K'] = OCLBacktrackingKWLexersym.Char_K;
        tokenKind['L'] = OCLBacktrackingKWLexersym.Char_L;
        tokenKind['M'] = OCLBacktrackingKWLexersym.Char_M;
        tokenKind['N'] = OCLBacktrackingKWLexersym.Char_N;
        tokenKind['O'] = OCLBacktrackingKWLexersym.Char_O;
        tokenKind['P'] = OCLBacktrackingKWLexersym.Char_P;
        tokenKind['Q'] = OCLBacktrackingKWLexersym.Char_Q;
        tokenKind['R'] = OCLBacktrackingKWLexersym.Char_R;
        tokenKind['S'] = OCLBacktrackingKWLexersym.Char_S;
        tokenKind['T'] = OCLBacktrackingKWLexersym.Char_T;
        tokenKind['U'] = OCLBacktrackingKWLexersym.Char_U;
        tokenKind['V'] = OCLBacktrackingKWLexersym.Char_V;
        tokenKind['W'] = OCLBacktrackingKWLexersym.Char_W;
        tokenKind['X'] = OCLBacktrackingKWLexersym.Char_X;
        tokenKind['Y'] = OCLBacktrackingKWLexersym.Char_Y;
        tokenKind['Z'] = OCLBacktrackingKWLexersym.Char_Z;
    };

    final int getKind(int c)
    {
        return (((c & 0xFFFFFF80) == 0) /* 0 <= c < 128? */ ? tokenKind[c] : 0);
    }


    public OCLBacktrackingKWLexer(char[] inputChars, int identifierKind)
    {
        this.inputChars = inputChars;
        keywordKind[0] = identifierKind;

        //
        // Rule 1:  KeyWord ::= s e l f
        //
        
		keywordKind[1] = (OCLBacktrackingParsersym.TK_self);
	  
	
        //
        // Rule 2:  KeyWord ::= i n v
        //
        
		keywordKind[2] = (OCLBacktrackingParsersym.TK_inv);
	  
	
        //
        // Rule 3:  KeyWord ::= p r e
        //
        
		keywordKind[3] = (OCLBacktrackingParsersym.TK_pre);
	  
	
        //
        // Rule 4:  KeyWord ::= p o s t
        //
        
		keywordKind[4] = (OCLBacktrackingParsersym.TK_post);
	  
	
        //
        // Rule 5:  KeyWord ::= b o d y
        //
        
		keywordKind[5] = (OCLBacktrackingParsersym.TK_body);
	  
	
        //
        // Rule 6:  KeyWord ::= c o n t e x t
        //
        
		keywordKind[6] = (OCLBacktrackingParsersym.TK_context);
	  
	
        //
        // Rule 7:  KeyWord ::= p a c k a g e
        //
        
		keywordKind[7] = (OCLBacktrackingParsersym.TK_package);
	  
	
        //
        // Rule 8:  KeyWord ::= e n d p a c k a g e
        //
        
		keywordKind[8] = (OCLBacktrackingParsersym.TK_endpackage);
	  
	
        //
        // Rule 9:  KeyWord ::= d e f
        //
        
		keywordKind[9] = (OCLBacktrackingParsersym.TK_def);
	  
	
        //
        // Rule 10:  KeyWord ::= d e r i v e
        //
        
		keywordKind[10] = (OCLBacktrackingParsersym.TK_derive);
	  
	
        //
        // Rule 11:  KeyWord ::= i n i t
        //
        
		keywordKind[11] = (OCLBacktrackingParsersym.TK_init);
	  
	
        //
        // Rule 12:  KeyWord ::= i f
        //
        
		keywordKind[12] = (OCLBacktrackingParsersym.TK_if);
	  
	
        //
        // Rule 13:  KeyWord ::= t h e n
        //
        
		keywordKind[13] = (OCLBacktrackingParsersym.TK_then);
	  
	
        //
        // Rule 14:  KeyWord ::= e l s e
        //
        
		keywordKind[14] = (OCLBacktrackingParsersym.TK_else);
	  
	
        //
        // Rule 15:  KeyWord ::= e n d i f
        //
        
		keywordKind[15] = (OCLBacktrackingParsersym.TK_endif);
	  
	
        //
        // Rule 16:  KeyWord ::= a n d
        //
        
		keywordKind[16] = (OCLBacktrackingParsersym.TK_and);
	  
	
        //
        // Rule 17:  KeyWord ::= o r
        //
        
		keywordKind[17] = (OCLBacktrackingParsersym.TK_or);
	  
	
        //
        // Rule 18:  KeyWord ::= x o r
        //
        
		keywordKind[18] = (OCLBacktrackingParsersym.TK_xor);
	  
	
        //
        // Rule 19:  KeyWord ::= n o t
        //
        
		keywordKind[19] = (OCLBacktrackingParsersym.TK_not);
	  
	
        //
        // Rule 20:  KeyWord ::= i m p l i e s
        //
        
		keywordKind[20] = (OCLBacktrackingParsersym.TK_implies);
	  
	
        //
        // Rule 21:  KeyWord ::= l e t
        //
        
		keywordKind[21] = (OCLBacktrackingParsersym.TK_let);
	  
	
        //
        // Rule 22:  KeyWord ::= i n
        //
        
		keywordKind[22] = (OCLBacktrackingParsersym.TK_in);
	  
	
        //
        // Rule 23:  KeyWord ::= t r u e
        //
        
		keywordKind[23] = (OCLBacktrackingParsersym.TK_true);
	  
	
        //
        // Rule 24:  KeyWord ::= f a l s e
        //
        
		keywordKind[24] = (OCLBacktrackingParsersym.TK_false);
	  
	
        //
        // Rule 25:  KeyWord ::= S e t
        //
        
		keywordKind[25] = (OCLBacktrackingParsersym.TK_Set);
	  
	
        //
        // Rule 26:  KeyWord ::= B a g
        //
        
		keywordKind[26] = (OCLBacktrackingParsersym.TK_Bag);
	  
	
        //
        // Rule 27:  KeyWord ::= S e q u e n c e
        //
        
		keywordKind[27] = (OCLBacktrackingParsersym.TK_Sequence);
	  
	
        //
        // Rule 28:  KeyWord ::= C o l l e c t i o n
        //
        
		keywordKind[28] = (OCLBacktrackingParsersym.TK_Collection);
	  
	
        //
        // Rule 29:  KeyWord ::= O r d e r e d S e t
        //
        
		keywordKind[29] = (OCLBacktrackingParsersym.TK_OrderedSet);
	  
	
        //
        // Rule 30:  KeyWord ::= i t e r a t e
        //
        
		keywordKind[30] = (OCLBacktrackingParsersym.TK_iterate);
	  
	
        //
        // Rule 31:  KeyWord ::= f o r A l l
        //
        
		keywordKind[31] = (OCLBacktrackingParsersym.TK_forAll);
	  
	
        //
        // Rule 32:  KeyWord ::= e x i s t s
        //
        
		keywordKind[32] = (OCLBacktrackingParsersym.TK_exists);
	  
	
        //
        // Rule 33:  KeyWord ::= i s U n i q u e
        //
        
		keywordKind[33] = (OCLBacktrackingParsersym.TK_isUnique);
	  
	
        //
        // Rule 34:  KeyWord ::= a n y
        //
        
		keywordKind[34] = (OCLBacktrackingParsersym.TK_any);
	  
	
        //
        // Rule 35:  KeyWord ::= o n e
        //
        
		keywordKind[35] = (OCLBacktrackingParsersym.TK_one);
	  
	
        //
        // Rule 36:  KeyWord ::= c o l l e c t
        //
        
		keywordKind[36] = (OCLBacktrackingParsersym.TK_collect);
	  
	
        //
        // Rule 37:  KeyWord ::= s e l e c t
        //
        
		keywordKind[37] = (OCLBacktrackingParsersym.TK_select);
	  
	
        //
        // Rule 38:  KeyWord ::= r e j e c t
        //
        
		keywordKind[38] = (OCLBacktrackingParsersym.TK_reject);
	  
	
        //
        // Rule 39:  KeyWord ::= c o l l e c t N e s t e d
        //
        
		keywordKind[39] = (OCLBacktrackingParsersym.TK_collectNested);
	  
	
        //
        // Rule 40:  KeyWord ::= s o r t e d B y
        //
        
		keywordKind[40] = (OCLBacktrackingParsersym.TK_sortedBy);
	  
	
        //
        // Rule 41:  KeyWord ::= c l o s u r e
        //
        
		keywordKind[41] = (OCLBacktrackingParsersym.TK_closure);
	  
	
        //
        // Rule 42:  KeyWord ::= o c l I s K i n d O f
        //
        
		keywordKind[42] = (OCLBacktrackingParsersym.TK_oclIsKindOf);
	  
	
        //
        // Rule 43:  KeyWord ::= o c l I s T y p e O f
        //
        
		keywordKind[43] = (OCLBacktrackingParsersym.TK_oclIsTypeOf);
	  
	
        //
        // Rule 44:  KeyWord ::= o c l A s T y p e
        //
        
		keywordKind[44] = (OCLBacktrackingParsersym.TK_oclAsType);
	  
	
        //
        // Rule 45:  KeyWord ::= o c l I s N e w
        //
        
		keywordKind[45] = (OCLBacktrackingParsersym.TK_oclIsNew);
	  
	
        //
        // Rule 46:  KeyWord ::= o c l I s U n d e f i n e d
        //
        
		keywordKind[46] = (OCLBacktrackingParsersym.TK_oclIsUndefined);
	  
	
        //
        // Rule 47:  KeyWord ::= o c l I s I n v a l i d
        //
        
		keywordKind[47] = (OCLBacktrackingParsersym.TK_oclIsInvalid);
	  
	
        //
        // Rule 48:  KeyWord ::= o c l I s I n S t a t e
        //
        
		keywordKind[48] = (OCLBacktrackingParsersym.TK_oclIsInState);
	  
	
        //
        // Rule 49:  KeyWord ::= a l l I n s t a n c e s
        //
        
		keywordKind[49] = (OCLBacktrackingParsersym.TK_allInstances);
	  
	
        //
        // Rule 50:  KeyWord ::= S t r i n g
        //
        
		keywordKind[50] = (OCLBacktrackingParsersym.TK_String);
	  
	
        //
        // Rule 51:  KeyWord ::= I n t e g e r
        //
        
		keywordKind[51] = (OCLBacktrackingParsersym.TK_Integer);
	  
	
        //
        // Rule 52:  KeyWord ::= U n l i m i t e d N a t u r a l
        //
        
		keywordKind[52] = (OCLBacktrackingParsersym.TK_UnlimitedNatural);
	  
	
        //
        // Rule 53:  KeyWord ::= R e a l
        //
        
		keywordKind[53] = (OCLBacktrackingParsersym.TK_Real);
	  
	
        //
        // Rule 54:  KeyWord ::= B o o l e a n
        //
        
		keywordKind[54] = (OCLBacktrackingParsersym.TK_Boolean);
	  
	
        //
        // Rule 55:  KeyWord ::= T u p l e
        //
        
		keywordKind[55] = (OCLBacktrackingParsersym.TK_Tuple);
	  
	
        //
        // Rule 56:  KeyWord ::= O c l A n y
        //
        
		keywordKind[56] = (OCLBacktrackingParsersym.TK_OclAny);
	  
	
        //
        // Rule 57:  KeyWord ::= O c l V o i d
        //
        
		keywordKind[57] = (OCLBacktrackingParsersym.TK_OclVoid);
	  
	
        //
        // Rule 58:  KeyWord ::= O c l I n v a l i d
        //
        
		keywordKind[58] = (OCLBacktrackingParsersym.TK_OclInvalid);
	  
	
        //
        // Rule 59:  KeyWord ::= O c l M e s s a g e
        //
        
		keywordKind[59] = (OCLBacktrackingParsersym.TK_OclMessage);
	  
	
        //
        // Rule 60:  KeyWord ::= n u l l
        //
        
		keywordKind[60] = (OCLBacktrackingParsersym.TK_null);
	  
	
        //
        // Rule 61:  KeyWord ::= i n v a l i d
        //
        
		keywordKind[61] = (OCLBacktrackingParsersym.TK_invalid);
	  
	
        //
        // Rule 62:  KeyWord ::= a t t r
        //
        
		keywordKind[62] = (OCLBacktrackingParsersym.TK_attr);
	  
	
        //
        // Rule 63:  KeyWord ::= o p e r
        //
        
		keywordKind[63] = (OCLBacktrackingParsersym.TK_oper);
	  
	
        //
        // Rule 64:  KeyWord ::= s t a t i c
        //
        
		keywordKind[64] = (OCLBacktrackingParsersym.TK_static);
	  
	
        for (int i = 0; i < keywordKind.length; i++)
        {
            if (keywordKind[i] == 0)
                keywordKind[i] = identifierKind;
        }
    }
}

