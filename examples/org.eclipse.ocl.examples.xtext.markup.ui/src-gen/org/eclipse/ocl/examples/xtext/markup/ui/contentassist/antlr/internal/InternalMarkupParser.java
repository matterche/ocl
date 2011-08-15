package org.eclipse.ocl.examples.xtext.markup.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.ocl.examples.xtext.markup.services.MarkupGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMarkupParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WORD", "RULE_WS", "RULE_NL", "RULE_STRING", "RULE_TEXT", "RULE_ANY_OTHER", "'b['", "'e['", "'fig['", "']'", "'fig:'", "'['", "'fig-['", "'oclCode['", "'oclEval['", "'oclText['"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int RULE_NL=7;
    public static final int RULE_TEXT=9;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int RULE_STRING=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_WS=6;
    public static final int RULE_WORD=5;

    // delegates
    // delegators


        public InternalMarkupParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMarkupParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMarkupParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g"; }


     
     	private MarkupGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MarkupGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleMarkup"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:61:1: entryRuleMarkup : ruleMarkup EOF ;
    public final void entryRuleMarkup() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:62:1: ( ruleMarkup EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:63:1: ruleMarkup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarkupRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkup_in_entryRuleMarkup67);
            ruleMarkup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMarkupRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMarkup74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMarkup"


    // $ANTLR start "ruleMarkup"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:70:1: ruleMarkup : ( ( rule__Markup__ElementsAssignment )* ) ;
    public final void ruleMarkup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:74:2: ( ( ( rule__Markup__ElementsAssignment )* ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:75:1: ( ( rule__Markup__ElementsAssignment )* )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:75:1: ( ( rule__Markup__ElementsAssignment )* )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:76:1: ( rule__Markup__ElementsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getElementsAssignment()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:77:1: ( rule__Markup__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_NL)||(LA1_0>=11 && LA1_0<=13)||(LA1_0>=15 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:77:2: rule__Markup__ElementsAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Markup__ElementsAssignment_in_ruleMarkup100);
            	    rule__Markup__ElementsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMarkupAccess().getElementsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMarkup"


    // $ANTLR start "entryRuleMarkupElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:89:1: entryRuleMarkupElement : ruleMarkupElement EOF ;
    public final void entryRuleMarkupElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:90:1: ( ruleMarkupElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:91:1: ruleMarkupElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarkupElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_entryRuleMarkupElement128);
            ruleMarkupElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMarkupElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMarkupElement135); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMarkupElement"


    // $ANTLR start "ruleMarkupElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:98:1: ruleMarkupElement : ( ( rule__MarkupElement__Alternatives ) ) ;
    public final void ruleMarkupElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:102:2: ( ( ( rule__MarkupElement__Alternatives ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:103:1: ( ( rule__MarkupElement__Alternatives ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:103:1: ( ( rule__MarkupElement__Alternatives ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:104:1: ( rule__MarkupElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarkupElementAccess().getAlternatives()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:105:1: ( rule__MarkupElement__Alternatives )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:105:2: rule__MarkupElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarkupElement__Alternatives_in_ruleMarkupElement161);
            rule__MarkupElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMarkupElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMarkupElement"


    // $ANTLR start "entryRuleTextElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:117:1: entryRuleTextElement : ruleTextElement EOF ;
    public final void entryRuleTextElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:118:1: ( ruleTextElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:119:1: ruleTextElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextElement_in_entryRuleTextElement188);
            ruleTextElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextElement195); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextElement"


    // $ANTLR start "ruleTextElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:126:1: ruleTextElement : ( ( ( rule__TextElement__TextAssignment ) ) ( ( rule__TextElement__TextAssignment )* ) ) ;
    public final void ruleTextElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:130:2: ( ( ( ( rule__TextElement__TextAssignment ) ) ( ( rule__TextElement__TextAssignment )* ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:131:1: ( ( ( rule__TextElement__TextAssignment ) ) ( ( rule__TextElement__TextAssignment )* ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:131:1: ( ( ( rule__TextElement__TextAssignment ) ) ( ( rule__TextElement__TextAssignment )* ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:132:1: ( ( rule__TextElement__TextAssignment ) ) ( ( rule__TextElement__TextAssignment )* )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:132:1: ( ( rule__TextElement__TextAssignment ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:133:1: ( rule__TextElement__TextAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextElementAccess().getTextAssignment()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:134:1: ( rule__TextElement__TextAssignment )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:134:2: rule__TextElement__TextAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextElement__TextAssignment_in_ruleTextElement223);
            rule__TextElement__TextAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextElementAccess().getTextAssignment()); 
            }

            }

            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:137:1: ( ( rule__TextElement__TextAssignment )* )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:138:1: ( rule__TextElement__TextAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextElementAccess().getTextAssignment()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:139:1: ( rule__TextElement__TextAssignment )*
            loop2:
            do {
                int alt2=2;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA2_2 = input.LA(2);

                    if ( (synpred2_InternalMarkup()) ) {
                        alt2=1;
                    }


                    }
                    break;
                case RULE_WORD:
                    {
                    int LA2_3 = input.LA(2);

                    if ( (synpred2_InternalMarkup()) ) {
                        alt2=1;
                    }


                    }
                    break;
                case RULE_WS:
                    {
                    int LA2_4 = input.LA(2);

                    if ( (synpred2_InternalMarkup()) ) {
                        alt2=1;
                    }


                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:139:2: rule__TextElement__TextAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TextElement__TextAssignment_in_ruleTextElement235);
            	    rule__TextElement__TextAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextElementAccess().getTextAssignment()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextElement"


    // $ANTLR start "entryRuleNewLineElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:152:1: entryRuleNewLineElement : ruleNewLineElement EOF ;
    public final void entryRuleNewLineElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:153:1: ( ruleNewLineElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:154:1: ruleNewLineElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewLineElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNewLineElement_in_entryRuleNewLineElement265);
            ruleNewLineElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewLineElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNewLineElement272); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNewLineElement"


    // $ANTLR start "ruleNewLineElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:161:1: ruleNewLineElement : ( ( rule__NewLineElement__TextAssignment ) ) ;
    public final void ruleNewLineElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:165:2: ( ( ( rule__NewLineElement__TextAssignment ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:166:1: ( ( rule__NewLineElement__TextAssignment ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:166:1: ( ( rule__NewLineElement__TextAssignment ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:167:1: ( rule__NewLineElement__TextAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewLineElementAccess().getTextAssignment()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:168:1: ( rule__NewLineElement__TextAssignment )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:168:2: rule__NewLineElement__TextAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__NewLineElement__TextAssignment_in_ruleNewLineElement298);
            rule__NewLineElement__TextAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewLineElementAccess().getTextAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNewLineElement"


    // $ANTLR start "entryRuleFontElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:180:1: entryRuleFontElement : ruleFontElement EOF ;
    public final void entryRuleFontElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:181:1: ( ruleFontElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:182:1: ruleFontElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFontElement_in_entryRuleFontElement325);
            ruleFontElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFontElement332); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFontElement"


    // $ANTLR start "ruleFontElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:189:1: ruleFontElement : ( ( rule__FontElement__Group__0 ) ) ;
    public final void ruleFontElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:193:2: ( ( ( rule__FontElement__Group__0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:194:1: ( ( rule__FontElement__Group__0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:194:1: ( ( rule__FontElement__Group__0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:195:1: ( rule__FontElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getGroup()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:196:1: ( rule__FontElement__Group__0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:196:2: rule__FontElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__0_in_ruleFontElement358);
            rule__FontElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontElementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFontElement"


    // $ANTLR start "entryRuleFigElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:208:1: entryRuleFigElement : ruleFigElement EOF ;
    public final void entryRuleFigElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:209:1: ( ruleFigElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:210:1: ruleFigElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFigElement_in_entryRuleFigElement385);
            ruleFigElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFigElement392); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFigElement"


    // $ANTLR start "ruleFigElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:217:1: ruleFigElement : ( ( rule__FigElement__Group__0 ) ) ;
    public final void ruleFigElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:221:2: ( ( ( rule__FigElement__Group__0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:222:1: ( ( rule__FigElement__Group__0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:222:1: ( ( rule__FigElement__Group__0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:223:1: ( rule__FigElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getGroup()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:224:1: ( rule__FigElement__Group__0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:224:2: rule__FigElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group__0_in_ruleFigElement418);
            rule__FigElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigElementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFigElement"


    // $ANTLR start "entryRuleFigRefElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:236:1: entryRuleFigRefElement : ruleFigRefElement EOF ;
    public final void entryRuleFigRefElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:237:1: ( ruleFigRefElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:238:1: ruleFigRefElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigRefElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFigRefElement_in_entryRuleFigRefElement445);
            ruleFigRefElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigRefElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFigRefElement452); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFigRefElement"


    // $ANTLR start "ruleFigRefElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:245:1: ruleFigRefElement : ( ( rule__FigRefElement__Group__0 ) ) ;
    public final void ruleFigRefElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:249:2: ( ( ( rule__FigRefElement__Group__0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:250:1: ( ( rule__FigRefElement__Group__0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:250:1: ( ( rule__FigRefElement__Group__0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:251:1: ( rule__FigRefElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigRefElementAccess().getGroup()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:252:1: ( rule__FigRefElement__Group__0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:252:2: rule__FigRefElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigRefElement__Group__0_in_ruleFigRefElement478);
            rule__FigRefElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigRefElementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFigRefElement"


    // $ANTLR start "entryRuleNullElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:264:1: entryRuleNullElement : ruleNullElement EOF ;
    public final void entryRuleNullElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:265:1: ( ruleNullElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:266:1: ruleNullElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNullElement_in_entryRuleNullElement505);
            ruleNullElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNullElement512); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullElement"


    // $ANTLR start "ruleNullElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:273:1: ruleNullElement : ( ( rule__NullElement__Group__0 ) ) ;
    public final void ruleNullElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:277:2: ( ( ( rule__NullElement__Group__0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:278:1: ( ( rule__NullElement__Group__0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:278:1: ( ( rule__NullElement__Group__0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:279:1: ( rule__NullElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullElementAccess().getGroup()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:280:1: ( rule__NullElement__Group__0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:280:2: rule__NullElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__NullElement__Group__0_in_ruleNullElement538);
            rule__NullElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullElementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullElement"


    // $ANTLR start "entryRuleOclCodeElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:292:1: entryRuleOclCodeElement : ruleOclCodeElement EOF ;
    public final void entryRuleOclCodeElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:293:1: ( ruleOclCodeElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:294:1: ruleOclCodeElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclCodeElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOclCodeElement_in_entryRuleOclCodeElement565);
            ruleOclCodeElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclCodeElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOclCodeElement572); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOclCodeElement"


    // $ANTLR start "ruleOclCodeElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:301:1: ruleOclCodeElement : ( ( rule__OclCodeElement__Group__0 ) ) ;
    public final void ruleOclCodeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:305:2: ( ( ( rule__OclCodeElement__Group__0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:306:1: ( ( rule__OclCodeElement__Group__0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:306:1: ( ( rule__OclCodeElement__Group__0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:307:1: ( rule__OclCodeElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclCodeElementAccess().getGroup()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:308:1: ( rule__OclCodeElement__Group__0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:308:2: rule__OclCodeElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OclCodeElement__Group__0_in_ruleOclCodeElement598);
            rule__OclCodeElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclCodeElementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOclCodeElement"


    // $ANTLR start "entryRuleOclEvalElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:320:1: entryRuleOclEvalElement : ruleOclEvalElement EOF ;
    public final void entryRuleOclEvalElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:321:1: ( ruleOclEvalElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:322:1: ruleOclEvalElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclEvalElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOclEvalElement_in_entryRuleOclEvalElement625);
            ruleOclEvalElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclEvalElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOclEvalElement632); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOclEvalElement"


    // $ANTLR start "ruleOclEvalElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:329:1: ruleOclEvalElement : ( ( rule__OclEvalElement__Group__0 ) ) ;
    public final void ruleOclEvalElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:333:2: ( ( ( rule__OclEvalElement__Group__0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:334:1: ( ( rule__OclEvalElement__Group__0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:334:1: ( ( rule__OclEvalElement__Group__0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:335:1: ( rule__OclEvalElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclEvalElementAccess().getGroup()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:336:1: ( rule__OclEvalElement__Group__0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:336:2: rule__OclEvalElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OclEvalElement__Group__0_in_ruleOclEvalElement658);
            rule__OclEvalElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclEvalElementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOclEvalElement"


    // $ANTLR start "entryRuleOclTextElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:348:1: entryRuleOclTextElement : ruleOclTextElement EOF ;
    public final void entryRuleOclTextElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:349:1: ( ruleOclTextElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:350:1: ruleOclTextElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclTextElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOclTextElement_in_entryRuleOclTextElement685);
            ruleOclTextElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclTextElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOclTextElement692); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOclTextElement"


    // $ANTLR start "ruleOclTextElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:357:1: ruleOclTextElement : ( ( rule__OclTextElement__Group__0 ) ) ;
    public final void ruleOclTextElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:361:2: ( ( ( rule__OclTextElement__Group__0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:362:1: ( ( rule__OclTextElement__Group__0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:362:1: ( ( rule__OclTextElement__Group__0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:363:1: ( rule__OclTextElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclTextElementAccess().getGroup()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:364:1: ( rule__OclTextElement__Group__0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:364:2: rule__OclTextElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OclTextElement__Group__0_in_ruleOclTextElement718);
            rule__OclTextElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclTextElementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOclTextElement"


    // $ANTLR start "rule__MarkupElement__Alternatives"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:378:1: rule__MarkupElement__Alternatives : ( ( ruleFontElement ) | ( ruleNewLineElement ) | ( ruleTextElement ) | ( ruleFigElement ) | ( ruleFigRefElement ) | ( ruleNullElement ) | ( ruleOclCodeElement ) | ( ruleOclEvalElement ) | ( ruleOclTextElement ) );
    public final void rule__MarkupElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:382:1: ( ( ruleFontElement ) | ( ruleNewLineElement ) | ( ruleTextElement ) | ( ruleFigElement ) | ( ruleFigRefElement ) | ( ruleNullElement ) | ( ruleOclCodeElement ) | ( ruleOclEvalElement ) | ( ruleOclTextElement ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
                {
                alt3=1;
                }
                break;
            case RULE_NL:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
            case RULE_WORD:
            case RULE_WS:
                {
                alt3=3;
                }
                break;
            case 13:
            case 15:
                {
                alt3=4;
                }
                break;
            case 17:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 18:
                {
                alt3=7;
                }
                break;
            case 19:
                {
                alt3=8;
                }
                break;
            case 20:
                {
                alt3=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:383:1: ( ruleFontElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:383:1: ( ruleFontElement )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:384:1: ruleFontElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getFontElementParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFontElement_in_rule__MarkupElement__Alternatives756);
                    ruleFontElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMarkupElementAccess().getFontElementParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:389:6: ( ruleNewLineElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:389:6: ( ruleNewLineElement )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:390:1: ruleNewLineElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getNewLineElementParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNewLineElement_in_rule__MarkupElement__Alternatives773);
                    ruleNewLineElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMarkupElementAccess().getNewLineElementParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:395:6: ( ruleTextElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:395:6: ( ruleTextElement )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:396:1: ruleTextElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getTextElementParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextElement_in_rule__MarkupElement__Alternatives790);
                    ruleTextElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMarkupElementAccess().getTextElementParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:401:6: ( ruleFigElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:401:6: ( ruleFigElement )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:402:1: ruleFigElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getFigElementParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFigElement_in_rule__MarkupElement__Alternatives807);
                    ruleFigElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMarkupElementAccess().getFigElementParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:407:6: ( ruleFigRefElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:407:6: ( ruleFigRefElement )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:408:1: ruleFigRefElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getFigRefElementParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFigRefElement_in_rule__MarkupElement__Alternatives824);
                    ruleFigRefElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMarkupElementAccess().getFigRefElementParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:413:6: ( ruleNullElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:413:6: ( ruleNullElement )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:414:1: ruleNullElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getNullElementParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNullElement_in_rule__MarkupElement__Alternatives841);
                    ruleNullElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMarkupElementAccess().getNullElementParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:419:6: ( ruleOclCodeElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:419:6: ( ruleOclCodeElement )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:420:1: ruleOclCodeElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getOclCodeElementParserRuleCall_6()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOclCodeElement_in_rule__MarkupElement__Alternatives858);
                    ruleOclCodeElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMarkupElementAccess().getOclCodeElementParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:425:6: ( ruleOclEvalElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:425:6: ( ruleOclEvalElement )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:426:1: ruleOclEvalElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getOclEvalElementParserRuleCall_7()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOclEvalElement_in_rule__MarkupElement__Alternatives875);
                    ruleOclEvalElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMarkupElementAccess().getOclEvalElementParserRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:431:6: ( ruleOclTextElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:431:6: ( ruleOclTextElement )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:432:1: ruleOclTextElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getOclTextElementParserRuleCall_8()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOclTextElement_in_rule__MarkupElement__Alternatives892);
                    ruleOclTextElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMarkupElementAccess().getOclTextElementParserRuleCall_8()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkupElement__Alternatives"


    // $ANTLR start "rule__TextElement__TextAlternatives_0"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:442:1: rule__TextElement__TextAlternatives_0 : ( ( RULE_ID ) | ( RULE_WORD ) | ( RULE_WS ) );
    public final void rule__TextElement__TextAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:446:1: ( ( RULE_ID ) | ( RULE_WORD ) | ( RULE_WS ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case RULE_WORD:
                {
                alt4=2;
                }
                break;
            case RULE_WS:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:447:1: ( RULE_ID )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:447:1: ( RULE_ID )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:448:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextElementAccess().getTextIDTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TextElement__TextAlternatives_0924); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextElementAccess().getTextIDTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:453:6: ( RULE_WORD )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:453:6: ( RULE_WORD )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:454:1: RULE_WORD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextElementAccess().getTextWORDTerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_WORD,FollowSets000.FOLLOW_RULE_WORD_in_rule__TextElement__TextAlternatives_0941); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextElementAccess().getTextWORDTerminalRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:459:6: ( RULE_WS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:459:6: ( RULE_WS )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:460:1: RULE_WS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextElementAccess().getTextWSTerminalRuleCall_0_2()); 
                    }
                    match(input,RULE_WS,FollowSets000.FOLLOW_RULE_WS_in_rule__TextElement__TextAlternatives_0958); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextElementAccess().getTextWSTerminalRuleCall_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__TextAlternatives_0"


    // $ANTLR start "rule__FontElement__FontAlternatives_0_0"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:470:1: rule__FontElement__FontAlternatives_0_0 : ( ( 'b[' ) | ( 'e[' ) );
    public final void rule__FontElement__FontAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:474:1: ( ( 'b[' ) | ( 'e[' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:475:1: ( 'b[' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:475:1: ( 'b[' )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:476:1: 'b['
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFontElementAccess().getFontBKeyword_0_0_0()); 
                    }
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__FontElement__FontAlternatives_0_0991); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFontElementAccess().getFontBKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:483:6: ( 'e[' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:483:6: ( 'e[' )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:484:1: 'e['
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFontElementAccess().getFontEKeyword_0_0_1()); 
                    }
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__FontElement__FontAlternatives_0_01011); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFontElementAccess().getFontEKeyword_0_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontElement__FontAlternatives_0_0"


    // $ANTLR start "rule__FigElement__Alternatives_0"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:496:1: rule__FigElement__Alternatives_0 : ( ( 'fig[' ) | ( ( rule__FigElement__Group_0_1__0 ) ) );
    public final void rule__FigElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:500:1: ( ( 'fig[' ) | ( ( rule__FigElement__Group_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:501:1: ( 'fig[' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:501:1: ( 'fig[' )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:502:1: 'fig['
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFigElementAccess().getFigKeyword_0_0()); 
                    }
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__FigElement__Alternatives_01046); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFigElementAccess().getFigKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:509:6: ( ( rule__FigElement__Group_0_1__0 ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:509:6: ( ( rule__FigElement__Group_0_1__0 ) )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:510:1: ( rule__FigElement__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFigElementAccess().getGroup_0_1()); 
                    }
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:511:1: ( rule__FigElement__Group_0_1__0 )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:511:2: rule__FigElement__Group_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group_0_1__0_in_rule__FigElement__Alternatives_01065);
                    rule__FigElement__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFigElementAccess().getGroup_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Alternatives_0"


    // $ANTLR start "rule__FontElement__Group__0"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:523:1: rule__FontElement__Group__0 : rule__FontElement__Group__0__Impl rule__FontElement__Group__1 ;
    public final void rule__FontElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:527:1: ( rule__FontElement__Group__0__Impl rule__FontElement__Group__1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:528:2: rule__FontElement__Group__0__Impl rule__FontElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__0__Impl_in_rule__FontElement__Group__01097);
            rule__FontElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__1_in_rule__FontElement__Group__01100);
            rule__FontElement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontElement__Group__0"


    // $ANTLR start "rule__FontElement__Group__0__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:535:1: rule__FontElement__Group__0__Impl : ( ( rule__FontElement__FontAssignment_0 ) ) ;
    public final void rule__FontElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:539:1: ( ( ( rule__FontElement__FontAssignment_0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:540:1: ( ( rule__FontElement__FontAssignment_0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:540:1: ( ( rule__FontElement__FontAssignment_0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:541:1: ( rule__FontElement__FontAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getFontAssignment_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:542:1: ( rule__FontElement__FontAssignment_0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:542:2: rule__FontElement__FontAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__FontAssignment_0_in_rule__FontElement__Group__0__Impl1127);
            rule__FontElement__FontAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontElementAccess().getFontAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontElement__Group__0__Impl"


    // $ANTLR start "rule__FontElement__Group__1"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:552:1: rule__FontElement__Group__1 : rule__FontElement__Group__1__Impl rule__FontElement__Group__2 ;
    public final void rule__FontElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:556:1: ( rule__FontElement__Group__1__Impl rule__FontElement__Group__2 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:557:2: rule__FontElement__Group__1__Impl rule__FontElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__1__Impl_in_rule__FontElement__Group__11157);
            rule__FontElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__2_in_rule__FontElement__Group__11160);
            rule__FontElement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontElement__Group__1"


    // $ANTLR start "rule__FontElement__Group__1__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:564:1: rule__FontElement__Group__1__Impl : ( ( rule__FontElement__ElementsAssignment_1 )* ) ;
    public final void rule__FontElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:568:1: ( ( ( rule__FontElement__ElementsAssignment_1 )* ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:569:1: ( ( rule__FontElement__ElementsAssignment_1 )* )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:569:1: ( ( rule__FontElement__ElementsAssignment_1 )* )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:570:1: ( rule__FontElement__ElementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getElementsAssignment_1()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:571:1: ( rule__FontElement__ElementsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_NL)||(LA7_0>=11 && LA7_0<=13)||(LA7_0>=15 && LA7_0<=20)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:571:2: rule__FontElement__ElementsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__FontElement__ElementsAssignment_1_in_rule__FontElement__Group__1__Impl1187);
            	    rule__FontElement__ElementsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontElementAccess().getElementsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontElement__Group__1__Impl"


    // $ANTLR start "rule__FontElement__Group__2"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:581:1: rule__FontElement__Group__2 : rule__FontElement__Group__2__Impl ;
    public final void rule__FontElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:585:1: ( rule__FontElement__Group__2__Impl )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:586:2: rule__FontElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__2__Impl_in_rule__FontElement__Group__21218);
            rule__FontElement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontElement__Group__2"


    // $ANTLR start "rule__FontElement__Group__2__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:592:1: rule__FontElement__Group__2__Impl : ( ']' ) ;
    public final void rule__FontElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:596:1: ( ( ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:597:1: ( ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:597:1: ( ']' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:598:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__FontElement__Group__2__Impl1246); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontElementAccess().getRightSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontElement__Group__2__Impl"


    // $ANTLR start "rule__FigElement__Group__0"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:617:1: rule__FigElement__Group__0 : rule__FigElement__Group__0__Impl rule__FigElement__Group__1 ;
    public final void rule__FigElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:621:1: ( rule__FigElement__Group__0__Impl rule__FigElement__Group__1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:622:2: rule__FigElement__Group__0__Impl rule__FigElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group__0__Impl_in_rule__FigElement__Group__01283);
            rule__FigElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group__1_in_rule__FigElement__Group__01286);
            rule__FigElement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group__0"


    // $ANTLR start "rule__FigElement__Group__0__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:629:1: rule__FigElement__Group__0__Impl : ( ( rule__FigElement__Alternatives_0 ) ) ;
    public final void rule__FigElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:633:1: ( ( ( rule__FigElement__Alternatives_0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:634:1: ( ( rule__FigElement__Alternatives_0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:634:1: ( ( rule__FigElement__Alternatives_0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:635:1: ( rule__FigElement__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getAlternatives_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:636:1: ( rule__FigElement__Alternatives_0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:636:2: rule__FigElement__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Alternatives_0_in_rule__FigElement__Group__0__Impl1313);
            rule__FigElement__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigElementAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group__0__Impl"


    // $ANTLR start "rule__FigElement__Group__1"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:646:1: rule__FigElement__Group__1 : rule__FigElement__Group__1__Impl rule__FigElement__Group__2 ;
    public final void rule__FigElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:650:1: ( rule__FigElement__Group__1__Impl rule__FigElement__Group__2 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:651:2: rule__FigElement__Group__1__Impl rule__FigElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group__1__Impl_in_rule__FigElement__Group__11343);
            rule__FigElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group__2_in_rule__FigElement__Group__11346);
            rule__FigElement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group__1"


    // $ANTLR start "rule__FigElement__Group__1__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:658:1: rule__FigElement__Group__1__Impl : ( ( rule__FigElement__SrcAssignment_1 ) ) ;
    public final void rule__FigElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:662:1: ( ( ( rule__FigElement__SrcAssignment_1 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:663:1: ( ( rule__FigElement__SrcAssignment_1 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:663:1: ( ( rule__FigElement__SrcAssignment_1 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:664:1: ( rule__FigElement__SrcAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getSrcAssignment_1()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:665:1: ( rule__FigElement__SrcAssignment_1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:665:2: rule__FigElement__SrcAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__SrcAssignment_1_in_rule__FigElement__Group__1__Impl1373);
            rule__FigElement__SrcAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigElementAccess().getSrcAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group__1__Impl"


    // $ANTLR start "rule__FigElement__Group__2"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:675:1: rule__FigElement__Group__2 : rule__FigElement__Group__2__Impl ;
    public final void rule__FigElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:679:1: ( rule__FigElement__Group__2__Impl )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:680:2: rule__FigElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group__2__Impl_in_rule__FigElement__Group__21403);
            rule__FigElement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group__2"


    // $ANTLR start "rule__FigElement__Group__2__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:686:1: rule__FigElement__Group__2__Impl : ( ']' ) ;
    public final void rule__FigElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:690:1: ( ( ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:691:1: ( ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:691:1: ( ']' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:692:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__FigElement__Group__2__Impl1431); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigElementAccess().getRightSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group__2__Impl"


    // $ANTLR start "rule__FigElement__Group_0_1__0"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:711:1: rule__FigElement__Group_0_1__0 : rule__FigElement__Group_0_1__0__Impl rule__FigElement__Group_0_1__1 ;
    public final void rule__FigElement__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:715:1: ( rule__FigElement__Group_0_1__0__Impl rule__FigElement__Group_0_1__1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:716:2: rule__FigElement__Group_0_1__0__Impl rule__FigElement__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group_0_1__0__Impl_in_rule__FigElement__Group_0_1__01468);
            rule__FigElement__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group_0_1__1_in_rule__FigElement__Group_0_1__01471);
            rule__FigElement__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group_0_1__0"


    // $ANTLR start "rule__FigElement__Group_0_1__0__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:723:1: rule__FigElement__Group_0_1__0__Impl : ( 'fig:' ) ;
    public final void rule__FigElement__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:727:1: ( ( 'fig:' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:728:1: ( 'fig:' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:728:1: ( 'fig:' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:729:1: 'fig:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getFigKeyword_0_1_0()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__FigElement__Group_0_1__0__Impl1499); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigElementAccess().getFigKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group_0_1__0__Impl"


    // $ANTLR start "rule__FigElement__Group_0_1__1"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:742:1: rule__FigElement__Group_0_1__1 : rule__FigElement__Group_0_1__1__Impl rule__FigElement__Group_0_1__2 ;
    public final void rule__FigElement__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:746:1: ( rule__FigElement__Group_0_1__1__Impl rule__FigElement__Group_0_1__2 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:747:2: rule__FigElement__Group_0_1__1__Impl rule__FigElement__Group_0_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group_0_1__1__Impl_in_rule__FigElement__Group_0_1__11530);
            rule__FigElement__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group_0_1__2_in_rule__FigElement__Group_0_1__11533);
            rule__FigElement__Group_0_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group_0_1__1"


    // $ANTLR start "rule__FigElement__Group_0_1__1__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:754:1: rule__FigElement__Group_0_1__1__Impl : ( ( rule__FigElement__IdAssignment_0_1_1 ) ) ;
    public final void rule__FigElement__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:758:1: ( ( ( rule__FigElement__IdAssignment_0_1_1 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:759:1: ( ( rule__FigElement__IdAssignment_0_1_1 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:759:1: ( ( rule__FigElement__IdAssignment_0_1_1 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:760:1: ( rule__FigElement__IdAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getIdAssignment_0_1_1()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:761:1: ( rule__FigElement__IdAssignment_0_1_1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:761:2: rule__FigElement__IdAssignment_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__IdAssignment_0_1_1_in_rule__FigElement__Group_0_1__1__Impl1560);
            rule__FigElement__IdAssignment_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigElementAccess().getIdAssignment_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group_0_1__1__Impl"


    // $ANTLR start "rule__FigElement__Group_0_1__2"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:771:1: rule__FigElement__Group_0_1__2 : rule__FigElement__Group_0_1__2__Impl ;
    public final void rule__FigElement__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:775:1: ( rule__FigElement__Group_0_1__2__Impl )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:776:2: rule__FigElement__Group_0_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group_0_1__2__Impl_in_rule__FigElement__Group_0_1__21590);
            rule__FigElement__Group_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group_0_1__2"


    // $ANTLR start "rule__FigElement__Group_0_1__2__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:782:1: rule__FigElement__Group_0_1__2__Impl : ( '[' ) ;
    public final void rule__FigElement__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:786:1: ( ( '[' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:787:1: ( '[' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:787:1: ( '[' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:788:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getLeftSquareBracketKeyword_0_1_2()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__FigElement__Group_0_1__2__Impl1618); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigElementAccess().getLeftSquareBracketKeyword_0_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group_0_1__2__Impl"


    // $ANTLR start "rule__FigRefElement__Group__0"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:807:1: rule__FigRefElement__Group__0 : rule__FigRefElement__Group__0__Impl rule__FigRefElement__Group__1 ;
    public final void rule__FigRefElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:811:1: ( rule__FigRefElement__Group__0__Impl rule__FigRefElement__Group__1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:812:2: rule__FigRefElement__Group__0__Impl rule__FigRefElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigRefElement__Group__0__Impl_in_rule__FigRefElement__Group__01655);
            rule__FigRefElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FigRefElement__Group__1_in_rule__FigRefElement__Group__01658);
            rule__FigRefElement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigRefElement__Group__0"


    // $ANTLR start "rule__FigRefElement__Group__0__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:819:1: rule__FigRefElement__Group__0__Impl : ( 'fig-[' ) ;
    public final void rule__FigRefElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:823:1: ( ( 'fig-[' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:824:1: ( 'fig-[' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:824:1: ( 'fig-[' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:825:1: 'fig-['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigRefElementAccess().getFigKeyword_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__FigRefElement__Group__0__Impl1686); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigRefElementAccess().getFigKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigRefElement__Group__0__Impl"


    // $ANTLR start "rule__FigRefElement__Group__1"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:838:1: rule__FigRefElement__Group__1 : rule__FigRefElement__Group__1__Impl rule__FigRefElement__Group__2 ;
    public final void rule__FigRefElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:842:1: ( rule__FigRefElement__Group__1__Impl rule__FigRefElement__Group__2 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:843:2: rule__FigRefElement__Group__1__Impl rule__FigRefElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigRefElement__Group__1__Impl_in_rule__FigRefElement__Group__11717);
            rule__FigRefElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FigRefElement__Group__2_in_rule__FigRefElement__Group__11720);
            rule__FigRefElement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigRefElement__Group__1"


    // $ANTLR start "rule__FigRefElement__Group__1__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:850:1: rule__FigRefElement__Group__1__Impl : ( ( rule__FigRefElement__RefAssignment_1 ) ) ;
    public final void rule__FigRefElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:854:1: ( ( ( rule__FigRefElement__RefAssignment_1 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:855:1: ( ( rule__FigRefElement__RefAssignment_1 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:855:1: ( ( rule__FigRefElement__RefAssignment_1 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:856:1: ( rule__FigRefElement__RefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigRefElementAccess().getRefAssignment_1()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:857:1: ( rule__FigRefElement__RefAssignment_1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:857:2: rule__FigRefElement__RefAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigRefElement__RefAssignment_1_in_rule__FigRefElement__Group__1__Impl1747);
            rule__FigRefElement__RefAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigRefElementAccess().getRefAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigRefElement__Group__1__Impl"


    // $ANTLR start "rule__FigRefElement__Group__2"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:867:1: rule__FigRefElement__Group__2 : rule__FigRefElement__Group__2__Impl ;
    public final void rule__FigRefElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:871:1: ( rule__FigRefElement__Group__2__Impl )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:872:2: rule__FigRefElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigRefElement__Group__2__Impl_in_rule__FigRefElement__Group__21777);
            rule__FigRefElement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigRefElement__Group__2"


    // $ANTLR start "rule__FigRefElement__Group__2__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:878:1: rule__FigRefElement__Group__2__Impl : ( ']' ) ;
    public final void rule__FigRefElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:882:1: ( ( ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:883:1: ( ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:883:1: ( ']' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:884:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigRefElementAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__FigRefElement__Group__2__Impl1805); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigRefElementAccess().getRightSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigRefElement__Group__2__Impl"


    // $ANTLR start "rule__NullElement__Group__0"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:903:1: rule__NullElement__Group__0 : rule__NullElement__Group__0__Impl rule__NullElement__Group__1 ;
    public final void rule__NullElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:907:1: ( rule__NullElement__Group__0__Impl rule__NullElement__Group__1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:908:2: rule__NullElement__Group__0__Impl rule__NullElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NullElement__Group__0__Impl_in_rule__NullElement__Group__01842);
            rule__NullElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NullElement__Group__1_in_rule__NullElement__Group__01845);
            rule__NullElement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullElement__Group__0"


    // $ANTLR start "rule__NullElement__Group__0__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:915:1: rule__NullElement__Group__0__Impl : ( () ) ;
    public final void rule__NullElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:919:1: ( ( () ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:920:1: ( () )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:920:1: ( () )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:921:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullElementAccess().getNullElementAction_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:922:1: ()
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:924:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullElementAccess().getNullElementAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullElement__Group__0__Impl"


    // $ANTLR start "rule__NullElement__Group__1"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:934:1: rule__NullElement__Group__1 : rule__NullElement__Group__1__Impl rule__NullElement__Group__2 ;
    public final void rule__NullElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:938:1: ( rule__NullElement__Group__1__Impl rule__NullElement__Group__2 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:939:2: rule__NullElement__Group__1__Impl rule__NullElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NullElement__Group__1__Impl_in_rule__NullElement__Group__11903);
            rule__NullElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NullElement__Group__2_in_rule__NullElement__Group__11906);
            rule__NullElement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullElement__Group__1"


    // $ANTLR start "rule__NullElement__Group__1__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:946:1: rule__NullElement__Group__1__Impl : ( '[' ) ;
    public final void rule__NullElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:950:1: ( ( '[' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:951:1: ( '[' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:951:1: ( '[' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:952:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullElementAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__NullElement__Group__1__Impl1934); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullElementAccess().getLeftSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullElement__Group__1__Impl"


    // $ANTLR start "rule__NullElement__Group__2"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:965:1: rule__NullElement__Group__2 : rule__NullElement__Group__2__Impl rule__NullElement__Group__3 ;
    public final void rule__NullElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:969:1: ( rule__NullElement__Group__2__Impl rule__NullElement__Group__3 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:970:2: rule__NullElement__Group__2__Impl rule__NullElement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__NullElement__Group__2__Impl_in_rule__NullElement__Group__21965);
            rule__NullElement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NullElement__Group__3_in_rule__NullElement__Group__21968);
            rule__NullElement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullElement__Group__2"


    // $ANTLR start "rule__NullElement__Group__2__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:977:1: rule__NullElement__Group__2__Impl : ( ( rule__NullElement__ElementsAssignment_2 )* ) ;
    public final void rule__NullElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:981:1: ( ( ( rule__NullElement__ElementsAssignment_2 )* ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:982:1: ( ( rule__NullElement__ElementsAssignment_2 )* )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:982:1: ( ( rule__NullElement__ElementsAssignment_2 )* )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:983:1: ( rule__NullElement__ElementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullElementAccess().getElementsAssignment_2()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:984:1: ( rule__NullElement__ElementsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_NL)||(LA8_0>=11 && LA8_0<=13)||(LA8_0>=15 && LA8_0<=20)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:984:2: rule__NullElement__ElementsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__NullElement__ElementsAssignment_2_in_rule__NullElement__Group__2__Impl1995);
            	    rule__NullElement__ElementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullElementAccess().getElementsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullElement__Group__2__Impl"


    // $ANTLR start "rule__NullElement__Group__3"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:994:1: rule__NullElement__Group__3 : rule__NullElement__Group__3__Impl ;
    public final void rule__NullElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:998:1: ( rule__NullElement__Group__3__Impl )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:999:2: rule__NullElement__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NullElement__Group__3__Impl_in_rule__NullElement__Group__32026);
            rule__NullElement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullElement__Group__3"


    // $ANTLR start "rule__NullElement__Group__3__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1005:1: rule__NullElement__Group__3__Impl : ( ']' ) ;
    public final void rule__NullElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1009:1: ( ( ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1010:1: ( ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1010:1: ( ']' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1011:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullElementAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__NullElement__Group__3__Impl2054); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullElementAccess().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullElement__Group__3__Impl"


    // $ANTLR start "rule__OclCodeElement__Group__0"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1032:1: rule__OclCodeElement__Group__0 : rule__OclCodeElement__Group__0__Impl rule__OclCodeElement__Group__1 ;
    public final void rule__OclCodeElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1036:1: ( rule__OclCodeElement__Group__0__Impl rule__OclCodeElement__Group__1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1037:2: rule__OclCodeElement__Group__0__Impl rule__OclCodeElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OclCodeElement__Group__0__Impl_in_rule__OclCodeElement__Group__02093);
            rule__OclCodeElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OclCodeElement__Group__1_in_rule__OclCodeElement__Group__02096);
            rule__OclCodeElement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclCodeElement__Group__0"


    // $ANTLR start "rule__OclCodeElement__Group__0__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1044:1: rule__OclCodeElement__Group__0__Impl : ( () ) ;
    public final void rule__OclCodeElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1048:1: ( ( () ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1049:1: ( () )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1049:1: ( () )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1050:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclCodeElementAccess().getOclCodeElementAction_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1051:1: ()
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1053:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclCodeElementAccess().getOclCodeElementAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclCodeElement__Group__0__Impl"


    // $ANTLR start "rule__OclCodeElement__Group__1"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1063:1: rule__OclCodeElement__Group__1 : rule__OclCodeElement__Group__1__Impl rule__OclCodeElement__Group__2 ;
    public final void rule__OclCodeElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1067:1: ( rule__OclCodeElement__Group__1__Impl rule__OclCodeElement__Group__2 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1068:2: rule__OclCodeElement__Group__1__Impl rule__OclCodeElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OclCodeElement__Group__1__Impl_in_rule__OclCodeElement__Group__12154);
            rule__OclCodeElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OclCodeElement__Group__2_in_rule__OclCodeElement__Group__12157);
            rule__OclCodeElement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclCodeElement__Group__1"


    // $ANTLR start "rule__OclCodeElement__Group__1__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1075:1: rule__OclCodeElement__Group__1__Impl : ( 'oclCode[' ) ;
    public final void rule__OclCodeElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1079:1: ( ( 'oclCode[' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1080:1: ( 'oclCode[' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1080:1: ( 'oclCode[' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1081:1: 'oclCode['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclCodeElementAccess().getOclCodeKeyword_1()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__OclCodeElement__Group__1__Impl2185); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclCodeElementAccess().getOclCodeKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclCodeElement__Group__1__Impl"


    // $ANTLR start "rule__OclCodeElement__Group__2"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1094:1: rule__OclCodeElement__Group__2 : rule__OclCodeElement__Group__2__Impl rule__OclCodeElement__Group__3 ;
    public final void rule__OclCodeElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1098:1: ( rule__OclCodeElement__Group__2__Impl rule__OclCodeElement__Group__3 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1099:2: rule__OclCodeElement__Group__2__Impl rule__OclCodeElement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OclCodeElement__Group__2__Impl_in_rule__OclCodeElement__Group__22216);
            rule__OclCodeElement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OclCodeElement__Group__3_in_rule__OclCodeElement__Group__22219);
            rule__OclCodeElement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclCodeElement__Group__2"


    // $ANTLR start "rule__OclCodeElement__Group__2__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1106:1: rule__OclCodeElement__Group__2__Impl : ( ( rule__OclCodeElement__ElementsAssignment_2 )* ) ;
    public final void rule__OclCodeElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1110:1: ( ( ( rule__OclCodeElement__ElementsAssignment_2 )* ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1111:1: ( ( rule__OclCodeElement__ElementsAssignment_2 )* )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1111:1: ( ( rule__OclCodeElement__ElementsAssignment_2 )* )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1112:1: ( rule__OclCodeElement__ElementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclCodeElementAccess().getElementsAssignment_2()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1113:1: ( rule__OclCodeElement__ElementsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_NL)||(LA9_0>=11 && LA9_0<=13)||(LA9_0>=15 && LA9_0<=20)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1113:2: rule__OclCodeElement__ElementsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OclCodeElement__ElementsAssignment_2_in_rule__OclCodeElement__Group__2__Impl2246);
            	    rule__OclCodeElement__ElementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclCodeElementAccess().getElementsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclCodeElement__Group__2__Impl"


    // $ANTLR start "rule__OclCodeElement__Group__3"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1123:1: rule__OclCodeElement__Group__3 : rule__OclCodeElement__Group__3__Impl ;
    public final void rule__OclCodeElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1127:1: ( rule__OclCodeElement__Group__3__Impl )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1128:2: rule__OclCodeElement__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OclCodeElement__Group__3__Impl_in_rule__OclCodeElement__Group__32277);
            rule__OclCodeElement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclCodeElement__Group__3"


    // $ANTLR start "rule__OclCodeElement__Group__3__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1134:1: rule__OclCodeElement__Group__3__Impl : ( ']' ) ;
    public final void rule__OclCodeElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1138:1: ( ( ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1139:1: ( ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1139:1: ( ']' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1140:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclCodeElementAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OclCodeElement__Group__3__Impl2305); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclCodeElementAccess().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclCodeElement__Group__3__Impl"


    // $ANTLR start "rule__OclEvalElement__Group__0"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1161:1: rule__OclEvalElement__Group__0 : rule__OclEvalElement__Group__0__Impl rule__OclEvalElement__Group__1 ;
    public final void rule__OclEvalElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1165:1: ( rule__OclEvalElement__Group__0__Impl rule__OclEvalElement__Group__1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1166:2: rule__OclEvalElement__Group__0__Impl rule__OclEvalElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OclEvalElement__Group__0__Impl_in_rule__OclEvalElement__Group__02344);
            rule__OclEvalElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OclEvalElement__Group__1_in_rule__OclEvalElement__Group__02347);
            rule__OclEvalElement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclEvalElement__Group__0"


    // $ANTLR start "rule__OclEvalElement__Group__0__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1173:1: rule__OclEvalElement__Group__0__Impl : ( () ) ;
    public final void rule__OclEvalElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1177:1: ( ( () ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1178:1: ( () )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1178:1: ( () )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1179:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclEvalElementAccess().getOclEvalElementAction_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1180:1: ()
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1182:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclEvalElementAccess().getOclEvalElementAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclEvalElement__Group__0__Impl"


    // $ANTLR start "rule__OclEvalElement__Group__1"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1192:1: rule__OclEvalElement__Group__1 : rule__OclEvalElement__Group__1__Impl rule__OclEvalElement__Group__2 ;
    public final void rule__OclEvalElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1196:1: ( rule__OclEvalElement__Group__1__Impl rule__OclEvalElement__Group__2 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1197:2: rule__OclEvalElement__Group__1__Impl rule__OclEvalElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OclEvalElement__Group__1__Impl_in_rule__OclEvalElement__Group__12405);
            rule__OclEvalElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OclEvalElement__Group__2_in_rule__OclEvalElement__Group__12408);
            rule__OclEvalElement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclEvalElement__Group__1"


    // $ANTLR start "rule__OclEvalElement__Group__1__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1204:1: rule__OclEvalElement__Group__1__Impl : ( 'oclEval[' ) ;
    public final void rule__OclEvalElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1208:1: ( ( 'oclEval[' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1209:1: ( 'oclEval[' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1209:1: ( 'oclEval[' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1210:1: 'oclEval['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclEvalElementAccess().getOclEvalKeyword_1()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__OclEvalElement__Group__1__Impl2436); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclEvalElementAccess().getOclEvalKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclEvalElement__Group__1__Impl"


    // $ANTLR start "rule__OclEvalElement__Group__2"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1223:1: rule__OclEvalElement__Group__2 : rule__OclEvalElement__Group__2__Impl rule__OclEvalElement__Group__3 ;
    public final void rule__OclEvalElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1227:1: ( rule__OclEvalElement__Group__2__Impl rule__OclEvalElement__Group__3 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1228:2: rule__OclEvalElement__Group__2__Impl rule__OclEvalElement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OclEvalElement__Group__2__Impl_in_rule__OclEvalElement__Group__22467);
            rule__OclEvalElement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OclEvalElement__Group__3_in_rule__OclEvalElement__Group__22470);
            rule__OclEvalElement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclEvalElement__Group__2"


    // $ANTLR start "rule__OclEvalElement__Group__2__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1235:1: rule__OclEvalElement__Group__2__Impl : ( ( rule__OclEvalElement__ElementsAssignment_2 )* ) ;
    public final void rule__OclEvalElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1239:1: ( ( ( rule__OclEvalElement__ElementsAssignment_2 )* ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1240:1: ( ( rule__OclEvalElement__ElementsAssignment_2 )* )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1240:1: ( ( rule__OclEvalElement__ElementsAssignment_2 )* )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1241:1: ( rule__OclEvalElement__ElementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclEvalElementAccess().getElementsAssignment_2()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1242:1: ( rule__OclEvalElement__ElementsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_NL)||(LA10_0>=11 && LA10_0<=13)||(LA10_0>=15 && LA10_0<=20)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1242:2: rule__OclEvalElement__ElementsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OclEvalElement__ElementsAssignment_2_in_rule__OclEvalElement__Group__2__Impl2497);
            	    rule__OclEvalElement__ElementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclEvalElementAccess().getElementsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclEvalElement__Group__2__Impl"


    // $ANTLR start "rule__OclEvalElement__Group__3"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1252:1: rule__OclEvalElement__Group__3 : rule__OclEvalElement__Group__3__Impl ;
    public final void rule__OclEvalElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1256:1: ( rule__OclEvalElement__Group__3__Impl )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1257:2: rule__OclEvalElement__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OclEvalElement__Group__3__Impl_in_rule__OclEvalElement__Group__32528);
            rule__OclEvalElement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclEvalElement__Group__3"


    // $ANTLR start "rule__OclEvalElement__Group__3__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1263:1: rule__OclEvalElement__Group__3__Impl : ( ']' ) ;
    public final void rule__OclEvalElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1267:1: ( ( ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1268:1: ( ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1268:1: ( ']' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1269:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclEvalElementAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OclEvalElement__Group__3__Impl2556); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclEvalElementAccess().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclEvalElement__Group__3__Impl"


    // $ANTLR start "rule__OclTextElement__Group__0"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1290:1: rule__OclTextElement__Group__0 : rule__OclTextElement__Group__0__Impl rule__OclTextElement__Group__1 ;
    public final void rule__OclTextElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1294:1: ( rule__OclTextElement__Group__0__Impl rule__OclTextElement__Group__1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1295:2: rule__OclTextElement__Group__0__Impl rule__OclTextElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OclTextElement__Group__0__Impl_in_rule__OclTextElement__Group__02595);
            rule__OclTextElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OclTextElement__Group__1_in_rule__OclTextElement__Group__02598);
            rule__OclTextElement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclTextElement__Group__0"


    // $ANTLR start "rule__OclTextElement__Group__0__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1302:1: rule__OclTextElement__Group__0__Impl : ( () ) ;
    public final void rule__OclTextElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1306:1: ( ( () ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1307:1: ( () )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1307:1: ( () )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1308:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclTextElementAccess().getOclTextElementAction_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1309:1: ()
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1311:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclTextElementAccess().getOclTextElementAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclTextElement__Group__0__Impl"


    // $ANTLR start "rule__OclTextElement__Group__1"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1321:1: rule__OclTextElement__Group__1 : rule__OclTextElement__Group__1__Impl rule__OclTextElement__Group__2 ;
    public final void rule__OclTextElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1325:1: ( rule__OclTextElement__Group__1__Impl rule__OclTextElement__Group__2 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1326:2: rule__OclTextElement__Group__1__Impl rule__OclTextElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OclTextElement__Group__1__Impl_in_rule__OclTextElement__Group__12656);
            rule__OclTextElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OclTextElement__Group__2_in_rule__OclTextElement__Group__12659);
            rule__OclTextElement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclTextElement__Group__1"


    // $ANTLR start "rule__OclTextElement__Group__1__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1333:1: rule__OclTextElement__Group__1__Impl : ( 'oclText[' ) ;
    public final void rule__OclTextElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1337:1: ( ( 'oclText[' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1338:1: ( 'oclText[' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1338:1: ( 'oclText[' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1339:1: 'oclText['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclTextElementAccess().getOclTextKeyword_1()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__OclTextElement__Group__1__Impl2687); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclTextElementAccess().getOclTextKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclTextElement__Group__1__Impl"


    // $ANTLR start "rule__OclTextElement__Group__2"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1352:1: rule__OclTextElement__Group__2 : rule__OclTextElement__Group__2__Impl rule__OclTextElement__Group__3 ;
    public final void rule__OclTextElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1356:1: ( rule__OclTextElement__Group__2__Impl rule__OclTextElement__Group__3 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1357:2: rule__OclTextElement__Group__2__Impl rule__OclTextElement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OclTextElement__Group__2__Impl_in_rule__OclTextElement__Group__22718);
            rule__OclTextElement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OclTextElement__Group__3_in_rule__OclTextElement__Group__22721);
            rule__OclTextElement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclTextElement__Group__2"


    // $ANTLR start "rule__OclTextElement__Group__2__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1364:1: rule__OclTextElement__Group__2__Impl : ( ( rule__OclTextElement__ElementsAssignment_2 )* ) ;
    public final void rule__OclTextElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1368:1: ( ( ( rule__OclTextElement__ElementsAssignment_2 )* ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1369:1: ( ( rule__OclTextElement__ElementsAssignment_2 )* )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1369:1: ( ( rule__OclTextElement__ElementsAssignment_2 )* )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1370:1: ( rule__OclTextElement__ElementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclTextElementAccess().getElementsAssignment_2()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1371:1: ( rule__OclTextElement__ElementsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_NL)||(LA11_0>=11 && LA11_0<=13)||(LA11_0>=15 && LA11_0<=20)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1371:2: rule__OclTextElement__ElementsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OclTextElement__ElementsAssignment_2_in_rule__OclTextElement__Group__2__Impl2748);
            	    rule__OclTextElement__ElementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclTextElementAccess().getElementsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclTextElement__Group__2__Impl"


    // $ANTLR start "rule__OclTextElement__Group__3"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1381:1: rule__OclTextElement__Group__3 : rule__OclTextElement__Group__3__Impl ;
    public final void rule__OclTextElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1385:1: ( rule__OclTextElement__Group__3__Impl )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1386:2: rule__OclTextElement__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OclTextElement__Group__3__Impl_in_rule__OclTextElement__Group__32779);
            rule__OclTextElement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclTextElement__Group__3"


    // $ANTLR start "rule__OclTextElement__Group__3__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1392:1: rule__OclTextElement__Group__3__Impl : ( ']' ) ;
    public final void rule__OclTextElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1396:1: ( ( ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1397:1: ( ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1397:1: ( ']' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1398:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclTextElementAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OclTextElement__Group__3__Impl2807); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclTextElementAccess().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclTextElement__Group__3__Impl"


    // $ANTLR start "rule__Markup__ElementsAssignment"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1420:1: rule__Markup__ElementsAssignment : ( ruleMarkupElement ) ;
    public final void rule__Markup__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1424:1: ( ( ruleMarkupElement ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1425:1: ( ruleMarkupElement )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1425:1: ( ruleMarkupElement )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1426:1: ruleMarkupElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getElementsMarkupElementParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_rule__Markup__ElementsAssignment2851);
            ruleMarkupElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMarkupAccess().getElementsMarkupElementParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Markup__ElementsAssignment"


    // $ANTLR start "rule__TextElement__TextAssignment"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1435:1: rule__TextElement__TextAssignment : ( ( rule__TextElement__TextAlternatives_0 ) ) ;
    public final void rule__TextElement__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1439:1: ( ( ( rule__TextElement__TextAlternatives_0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1440:1: ( ( rule__TextElement__TextAlternatives_0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1440:1: ( ( rule__TextElement__TextAlternatives_0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1441:1: ( rule__TextElement__TextAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextElementAccess().getTextAlternatives_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1442:1: ( rule__TextElement__TextAlternatives_0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1442:2: rule__TextElement__TextAlternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextElement__TextAlternatives_0_in_rule__TextElement__TextAssignment2882);
            rule__TextElement__TextAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextElementAccess().getTextAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__TextAssignment"


    // $ANTLR start "rule__NewLineElement__TextAssignment"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1451:1: rule__NewLineElement__TextAssignment : ( RULE_NL ) ;
    public final void rule__NewLineElement__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1455:1: ( ( RULE_NL ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1456:1: ( RULE_NL )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1456:1: ( RULE_NL )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1457:1: RULE_NL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewLineElementAccess().getTextNLTerminalRuleCall_0()); 
            }
            match(input,RULE_NL,FollowSets000.FOLLOW_RULE_NL_in_rule__NewLineElement__TextAssignment2915); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewLineElementAccess().getTextNLTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewLineElement__TextAssignment"


    // $ANTLR start "rule__FontElement__FontAssignment_0"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1466:1: rule__FontElement__FontAssignment_0 : ( ( rule__FontElement__FontAlternatives_0_0 ) ) ;
    public final void rule__FontElement__FontAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1470:1: ( ( ( rule__FontElement__FontAlternatives_0_0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1471:1: ( ( rule__FontElement__FontAlternatives_0_0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1471:1: ( ( rule__FontElement__FontAlternatives_0_0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1472:1: ( rule__FontElement__FontAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getFontAlternatives_0_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1473:1: ( rule__FontElement__FontAlternatives_0_0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1473:2: rule__FontElement__FontAlternatives_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__FontAlternatives_0_0_in_rule__FontElement__FontAssignment_02946);
            rule__FontElement__FontAlternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontElementAccess().getFontAlternatives_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontElement__FontAssignment_0"


    // $ANTLR start "rule__FontElement__ElementsAssignment_1"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1482:1: rule__FontElement__ElementsAssignment_1 : ( ruleMarkupElement ) ;
    public final void rule__FontElement__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1486:1: ( ( ruleMarkupElement ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1487:1: ( ruleMarkupElement )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1487:1: ( ruleMarkupElement )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1488:1: ruleMarkupElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getElementsMarkupElementParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_rule__FontElement__ElementsAssignment_12979);
            ruleMarkupElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontElementAccess().getElementsMarkupElementParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontElement__ElementsAssignment_1"


    // $ANTLR start "rule__FigElement__IdAssignment_0_1_1"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1497:1: rule__FigElement__IdAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__FigElement__IdAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1501:1: ( ( RULE_ID ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1502:1: ( RULE_ID )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1502:1: ( RULE_ID )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1503:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getIdIDTerminalRuleCall_0_1_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__FigElement__IdAssignment_0_1_13010); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigElementAccess().getIdIDTerminalRuleCall_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__IdAssignment_0_1_1"


    // $ANTLR start "rule__FigElement__SrcAssignment_1"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1512:1: rule__FigElement__SrcAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FigElement__SrcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1516:1: ( ( RULE_STRING ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1517:1: ( RULE_STRING )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1517:1: ( RULE_STRING )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1518:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getSrcSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__FigElement__SrcAssignment_13041); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigElementAccess().getSrcSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__SrcAssignment_1"


    // $ANTLR start "rule__FigRefElement__RefAssignment_1"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1527:1: rule__FigRefElement__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FigRefElement__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1531:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1532:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1532:1: ( ( RULE_ID ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1533:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigRefElementAccess().getRefFigElementCrossReference_1_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1534:1: ( RULE_ID )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1535:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigRefElementAccess().getRefFigElementIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__FigRefElement__RefAssignment_13076); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigRefElementAccess().getRefFigElementIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigRefElementAccess().getRefFigElementCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigRefElement__RefAssignment_1"


    // $ANTLR start "rule__NullElement__ElementsAssignment_2"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1546:1: rule__NullElement__ElementsAssignment_2 : ( ruleMarkupElement ) ;
    public final void rule__NullElement__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1550:1: ( ( ruleMarkupElement ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1551:1: ( ruleMarkupElement )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1551:1: ( ruleMarkupElement )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1552:1: ruleMarkupElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullElementAccess().getElementsMarkupElementParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_rule__NullElement__ElementsAssignment_23111);
            ruleMarkupElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullElementAccess().getElementsMarkupElementParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullElement__ElementsAssignment_2"


    // $ANTLR start "rule__OclCodeElement__ElementsAssignment_2"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1561:1: rule__OclCodeElement__ElementsAssignment_2 : ( ruleMarkupElement ) ;
    public final void rule__OclCodeElement__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1565:1: ( ( ruleMarkupElement ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1566:1: ( ruleMarkupElement )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1566:1: ( ruleMarkupElement )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1567:1: ruleMarkupElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclCodeElementAccess().getElementsMarkupElementParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_rule__OclCodeElement__ElementsAssignment_23142);
            ruleMarkupElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclCodeElementAccess().getElementsMarkupElementParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclCodeElement__ElementsAssignment_2"


    // $ANTLR start "rule__OclEvalElement__ElementsAssignment_2"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1576:1: rule__OclEvalElement__ElementsAssignment_2 : ( ruleMarkupElement ) ;
    public final void rule__OclEvalElement__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1580:1: ( ( ruleMarkupElement ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1581:1: ( ruleMarkupElement )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1581:1: ( ruleMarkupElement )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1582:1: ruleMarkupElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclEvalElementAccess().getElementsMarkupElementParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_rule__OclEvalElement__ElementsAssignment_23173);
            ruleMarkupElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclEvalElementAccess().getElementsMarkupElementParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclEvalElement__ElementsAssignment_2"


    // $ANTLR start "rule__OclTextElement__ElementsAssignment_2"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1591:1: rule__OclTextElement__ElementsAssignment_2 : ( ruleMarkupElement ) ;
    public final void rule__OclTextElement__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1595:1: ( ( ruleMarkupElement ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1596:1: ( ruleMarkupElement )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1596:1: ( ruleMarkupElement )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1597:1: ruleMarkupElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclTextElementAccess().getElementsMarkupElementParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_rule__OclTextElement__ElementsAssignment_23204);
            ruleMarkupElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclTextElementAccess().getElementsMarkupElementParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclTextElement__ElementsAssignment_2"

    // $ANTLR start synpred2_InternalMarkup
    public final void synpred2_InternalMarkup_fragment() throws RecognitionException {   
        // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:139:2: ( rule__TextElement__TextAssignment )
        // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:139:2: rule__TextElement__TextAssignment
        {
        pushFollow(FollowSets000.FOLLOW_rule__TextElement__TextAssignment_in_synpred2_InternalMarkup235);
        rule__TextElement__TextAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalMarkup

    // Delegated rules

    public final boolean synpred2_InternalMarkup() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMarkup_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMarkup_in_entryRuleMarkup67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMarkup74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Markup__ElementsAssignment_in_ruleMarkup100 = new BitSet(new long[]{0x00000000001FB8F2L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_entryRuleMarkupElement128 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMarkupElement135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarkupElement__Alternatives_in_ruleMarkupElement161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextElement_in_entryRuleTextElement188 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextElement195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextElement__TextAssignment_in_ruleTextElement223 = new BitSet(new long[]{0x0000000000000072L});
        public static final BitSet FOLLOW_rule__TextElement__TextAssignment_in_ruleTextElement235 = new BitSet(new long[]{0x0000000000000072L});
        public static final BitSet FOLLOW_ruleNewLineElement_in_entryRuleNewLineElement265 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNewLineElement272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NewLineElement__TextAssignment_in_ruleNewLineElement298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFontElement_in_entryRuleFontElement325 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFontElement332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FontElement__Group__0_in_ruleFontElement358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFigElement_in_entryRuleFigElement385 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFigElement392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group__0_in_ruleFigElement418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFigRefElement_in_entryRuleFigRefElement445 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFigRefElement452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigRefElement__Group__0_in_ruleFigRefElement478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullElement_in_entryRuleNullElement505 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNullElement512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NullElement__Group__0_in_ruleNullElement538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOclCodeElement_in_entryRuleOclCodeElement565 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOclCodeElement572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OclCodeElement__Group__0_in_ruleOclCodeElement598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOclEvalElement_in_entryRuleOclEvalElement625 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOclEvalElement632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OclEvalElement__Group__0_in_ruleOclEvalElement658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOclTextElement_in_entryRuleOclTextElement685 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOclTextElement692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OclTextElement__Group__0_in_ruleOclTextElement718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFontElement_in_rule__MarkupElement__Alternatives756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNewLineElement_in_rule__MarkupElement__Alternatives773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextElement_in_rule__MarkupElement__Alternatives790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFigElement_in_rule__MarkupElement__Alternatives807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFigRefElement_in_rule__MarkupElement__Alternatives824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullElement_in_rule__MarkupElement__Alternatives841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOclCodeElement_in_rule__MarkupElement__Alternatives858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOclEvalElement_in_rule__MarkupElement__Alternatives875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOclTextElement_in_rule__MarkupElement__Alternatives892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TextElement__TextAlternatives_0924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_WORD_in_rule__TextElement__TextAlternatives_0941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_WS_in_rule__TextElement__TextAlternatives_0958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__FontElement__FontAlternatives_0_0991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__FontElement__FontAlternatives_0_01011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__FigElement__Alternatives_01046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group_0_1__0_in_rule__FigElement__Alternatives_01065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FontElement__Group__0__Impl_in_rule__FontElement__Group__01097 = new BitSet(new long[]{0x00000000001FF8F0L});
        public static final BitSet FOLLOW_rule__FontElement__Group__1_in_rule__FontElement__Group__01100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FontElement__FontAssignment_0_in_rule__FontElement__Group__0__Impl1127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FontElement__Group__1__Impl_in_rule__FontElement__Group__11157 = new BitSet(new long[]{0x00000000001FF8F0L});
        public static final BitSet FOLLOW_rule__FontElement__Group__2_in_rule__FontElement__Group__11160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FontElement__ElementsAssignment_1_in_rule__FontElement__Group__1__Impl1187 = new BitSet(new long[]{0x00000000001FB8F2L});
        public static final BitSet FOLLOW_rule__FontElement__Group__2__Impl_in_rule__FontElement__Group__21218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__FontElement__Group__2__Impl1246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group__0__Impl_in_rule__FigElement__Group__01283 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__FigElement__Group__1_in_rule__FigElement__Group__01286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Alternatives_0_in_rule__FigElement__Group__0__Impl1313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group__1__Impl_in_rule__FigElement__Group__11343 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__FigElement__Group__2_in_rule__FigElement__Group__11346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__SrcAssignment_1_in_rule__FigElement__Group__1__Impl1373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group__2__Impl_in_rule__FigElement__Group__21403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__FigElement__Group__2__Impl1431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group_0_1__0__Impl_in_rule__FigElement__Group_0_1__01468 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__FigElement__Group_0_1__1_in_rule__FigElement__Group_0_1__01471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__FigElement__Group_0_1__0__Impl1499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group_0_1__1__Impl_in_rule__FigElement__Group_0_1__11530 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__FigElement__Group_0_1__2_in_rule__FigElement__Group_0_1__11533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__IdAssignment_0_1_1_in_rule__FigElement__Group_0_1__1__Impl1560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group_0_1__2__Impl_in_rule__FigElement__Group_0_1__21590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__FigElement__Group_0_1__2__Impl1618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigRefElement__Group__0__Impl_in_rule__FigRefElement__Group__01655 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__FigRefElement__Group__1_in_rule__FigRefElement__Group__01658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__FigRefElement__Group__0__Impl1686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigRefElement__Group__1__Impl_in_rule__FigRefElement__Group__11717 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__FigRefElement__Group__2_in_rule__FigRefElement__Group__11720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigRefElement__RefAssignment_1_in_rule__FigRefElement__Group__1__Impl1747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigRefElement__Group__2__Impl_in_rule__FigRefElement__Group__21777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__FigRefElement__Group__2__Impl1805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NullElement__Group__0__Impl_in_rule__NullElement__Group__01842 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__NullElement__Group__1_in_rule__NullElement__Group__01845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NullElement__Group__1__Impl_in_rule__NullElement__Group__11903 = new BitSet(new long[]{0x00000000001FF8F0L});
        public static final BitSet FOLLOW_rule__NullElement__Group__2_in_rule__NullElement__Group__11906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__NullElement__Group__1__Impl1934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NullElement__Group__2__Impl_in_rule__NullElement__Group__21965 = new BitSet(new long[]{0x00000000001FF8F0L});
        public static final BitSet FOLLOW_rule__NullElement__Group__3_in_rule__NullElement__Group__21968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NullElement__ElementsAssignment_2_in_rule__NullElement__Group__2__Impl1995 = new BitSet(new long[]{0x00000000001FB8F2L});
        public static final BitSet FOLLOW_rule__NullElement__Group__3__Impl_in_rule__NullElement__Group__32026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__NullElement__Group__3__Impl2054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OclCodeElement__Group__0__Impl_in_rule__OclCodeElement__Group__02093 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__OclCodeElement__Group__1_in_rule__OclCodeElement__Group__02096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OclCodeElement__Group__1__Impl_in_rule__OclCodeElement__Group__12154 = new BitSet(new long[]{0x00000000001FF8F0L});
        public static final BitSet FOLLOW_rule__OclCodeElement__Group__2_in_rule__OclCodeElement__Group__12157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__OclCodeElement__Group__1__Impl2185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OclCodeElement__Group__2__Impl_in_rule__OclCodeElement__Group__22216 = new BitSet(new long[]{0x00000000001FF8F0L});
        public static final BitSet FOLLOW_rule__OclCodeElement__Group__3_in_rule__OclCodeElement__Group__22219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OclCodeElement__ElementsAssignment_2_in_rule__OclCodeElement__Group__2__Impl2246 = new BitSet(new long[]{0x00000000001FB8F2L});
        public static final BitSet FOLLOW_rule__OclCodeElement__Group__3__Impl_in_rule__OclCodeElement__Group__32277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OclCodeElement__Group__3__Impl2305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OclEvalElement__Group__0__Impl_in_rule__OclEvalElement__Group__02344 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__OclEvalElement__Group__1_in_rule__OclEvalElement__Group__02347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OclEvalElement__Group__1__Impl_in_rule__OclEvalElement__Group__12405 = new BitSet(new long[]{0x00000000001FF8F0L});
        public static final BitSet FOLLOW_rule__OclEvalElement__Group__2_in_rule__OclEvalElement__Group__12408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__OclEvalElement__Group__1__Impl2436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OclEvalElement__Group__2__Impl_in_rule__OclEvalElement__Group__22467 = new BitSet(new long[]{0x00000000001FF8F0L});
        public static final BitSet FOLLOW_rule__OclEvalElement__Group__3_in_rule__OclEvalElement__Group__22470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OclEvalElement__ElementsAssignment_2_in_rule__OclEvalElement__Group__2__Impl2497 = new BitSet(new long[]{0x00000000001FB8F2L});
        public static final BitSet FOLLOW_rule__OclEvalElement__Group__3__Impl_in_rule__OclEvalElement__Group__32528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OclEvalElement__Group__3__Impl2556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OclTextElement__Group__0__Impl_in_rule__OclTextElement__Group__02595 = new BitSet(new long[]{0x00000000001FB8F0L});
        public static final BitSet FOLLOW_rule__OclTextElement__Group__1_in_rule__OclTextElement__Group__02598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OclTextElement__Group__1__Impl_in_rule__OclTextElement__Group__12656 = new BitSet(new long[]{0x00000000001FF8F0L});
        public static final BitSet FOLLOW_rule__OclTextElement__Group__2_in_rule__OclTextElement__Group__12659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__OclTextElement__Group__1__Impl2687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OclTextElement__Group__2__Impl_in_rule__OclTextElement__Group__22718 = new BitSet(new long[]{0x00000000001FF8F0L});
        public static final BitSet FOLLOW_rule__OclTextElement__Group__3_in_rule__OclTextElement__Group__22721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OclTextElement__ElementsAssignment_2_in_rule__OclTextElement__Group__2__Impl2748 = new BitSet(new long[]{0x00000000001FB8F2L});
        public static final BitSet FOLLOW_rule__OclTextElement__Group__3__Impl_in_rule__OclTextElement__Group__32779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OclTextElement__Group__3__Impl2807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_rule__Markup__ElementsAssignment2851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextElement__TextAlternatives_0_in_rule__TextElement__TextAssignment2882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NL_in_rule__NewLineElement__TextAssignment2915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FontElement__FontAlternatives_0_0_in_rule__FontElement__FontAssignment_02946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_rule__FontElement__ElementsAssignment_12979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__FigElement__IdAssignment_0_1_13010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__FigElement__SrcAssignment_13041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__FigRefElement__RefAssignment_13076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_rule__NullElement__ElementsAssignment_23111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_rule__OclCodeElement__ElementsAssignment_23142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_rule__OclEvalElement__ElementsAssignment_23173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_rule__OclTextElement__ElementsAssignment_23204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextElement__TextAssignment_in_synpred2_InternalMarkup235 = new BitSet(new long[]{0x0000000000000002L});
    }


}