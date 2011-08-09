package org.eclipse.ocl.examples.xtext.markup.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WORD", "RULE_WS", "RULE_NL", "RULE_STRING", "RULE_TEXT", "RULE_ANY_OTHER", "'b['", "'e['", "'fig['", "']'", "'fig:'", "'['", "'fig-['", "'ocl['"
    };
    public static final int RULE_ID=4;
    public static final int T__12=12;
    public static final int RULE_WS=6;
    public static final int T__17=17;
    public static final int RULE_NL=7;
    public static final int RULE_TEXT=9;
    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int RULE_STRING=8;
    public static final int T__16=16;
    public static final int RULE_WORD=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__14=14;
    public static final int T__11=11;
    public static final int T__18=18;
    public static final int T__15=15;

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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:62:1: entryRuleMarkup : ruleMarkup EOF ;
    public final void entryRuleMarkup() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:63:1: ( ruleMarkup EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:64:1: ruleMarkup EOF
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:71:1: ruleMarkup : ( ( rule__Markup__ElementsAssignment )* ) ;
    public final void ruleMarkup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:75:2: ( ( ( rule__Markup__ElementsAssignment )* ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:76:1: ( ( rule__Markup__ElementsAssignment )* )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:76:1: ( ( rule__Markup__ElementsAssignment )* )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:77:1: ( rule__Markup__ElementsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getElementsAssignment()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:78:1: ( rule__Markup__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_NL)||(LA1_0>=11 && LA1_0<=13)||(LA1_0>=15 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:78:2: rule__Markup__ElementsAssignment
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:90:1: entryRuleMarkupElement : ruleMarkupElement EOF ;
    public final void entryRuleMarkupElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:91:1: ( ruleMarkupElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:92:1: ruleMarkupElement EOF
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:99:1: ruleMarkupElement : ( ( rule__MarkupElement__Alternatives ) ) ;
    public final void ruleMarkupElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:103:2: ( ( ( rule__MarkupElement__Alternatives ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:104:1: ( ( rule__MarkupElement__Alternatives ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:104:1: ( ( rule__MarkupElement__Alternatives ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:105:1: ( rule__MarkupElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarkupElementAccess().getAlternatives()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:106:1: ( rule__MarkupElement__Alternatives )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:106:2: rule__MarkupElement__Alternatives
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:118:1: entryRuleTextElement : ruleTextElement EOF ;
    public final void entryRuleTextElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:119:1: ( ruleTextElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:120:1: ruleTextElement EOF
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:127:1: ruleTextElement : ( ( ( rule__TextElement__TextAssignment ) ) ( ( rule__TextElement__TextAssignment )* ) ) ;
    public final void ruleTextElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:131:2: ( ( ( ( rule__TextElement__TextAssignment ) ) ( ( rule__TextElement__TextAssignment )* ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:132:1: ( ( ( rule__TextElement__TextAssignment ) ) ( ( rule__TextElement__TextAssignment )* ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:132:1: ( ( ( rule__TextElement__TextAssignment ) ) ( ( rule__TextElement__TextAssignment )* ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:133:1: ( ( rule__TextElement__TextAssignment ) ) ( ( rule__TextElement__TextAssignment )* )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:133:1: ( ( rule__TextElement__TextAssignment ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:134:1: ( rule__TextElement__TextAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextElementAccess().getTextAssignment()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:135:1: ( rule__TextElement__TextAssignment )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:135:2: rule__TextElement__TextAssignment
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

            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:138:1: ( ( rule__TextElement__TextAssignment )* )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:139:1: ( rule__TextElement__TextAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextElementAccess().getTextAssignment()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:140:1: ( rule__TextElement__TextAssignment )*
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
            	    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:140:2: rule__TextElement__TextAssignment
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:153:1: entryRuleNewLineElement : ruleNewLineElement EOF ;
    public final void entryRuleNewLineElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:154:1: ( ruleNewLineElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:155:1: ruleNewLineElement EOF
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:162:1: ruleNewLineElement : ( ( rule__NewLineElement__TextAssignment ) ) ;
    public final void ruleNewLineElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:166:2: ( ( ( rule__NewLineElement__TextAssignment ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:167:1: ( ( rule__NewLineElement__TextAssignment ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:167:1: ( ( rule__NewLineElement__TextAssignment ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:168:1: ( rule__NewLineElement__TextAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewLineElementAccess().getTextAssignment()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:169:1: ( rule__NewLineElement__TextAssignment )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:169:2: rule__NewLineElement__TextAssignment
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:181:1: entryRuleFontElement : ruleFontElement EOF ;
    public final void entryRuleFontElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:182:1: ( ruleFontElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:183:1: ruleFontElement EOF
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:190:1: ruleFontElement : ( ( rule__FontElement__Group__0 ) ) ;
    public final void ruleFontElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:194:2: ( ( ( rule__FontElement__Group__0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:195:1: ( ( rule__FontElement__Group__0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:195:1: ( ( rule__FontElement__Group__0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:196:1: ( rule__FontElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getGroup()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:197:1: ( rule__FontElement__Group__0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:197:2: rule__FontElement__Group__0
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:209:1: entryRuleFigElement : ruleFigElement EOF ;
    public final void entryRuleFigElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:210:1: ( ruleFigElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:211:1: ruleFigElement EOF
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:218:1: ruleFigElement : ( ( rule__FigElement__Group__0 ) ) ;
    public final void ruleFigElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:222:2: ( ( ( rule__FigElement__Group__0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:223:1: ( ( rule__FigElement__Group__0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:223:1: ( ( rule__FigElement__Group__0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:224:1: ( rule__FigElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getGroup()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:225:1: ( rule__FigElement__Group__0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:225:2: rule__FigElement__Group__0
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:237:1: entryRuleFigRefElement : ruleFigRefElement EOF ;
    public final void entryRuleFigRefElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:238:1: ( ruleFigRefElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:239:1: ruleFigRefElement EOF
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:246:1: ruleFigRefElement : ( ( rule__FigRefElement__Group__0 ) ) ;
    public final void ruleFigRefElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:250:2: ( ( ( rule__FigRefElement__Group__0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:251:1: ( ( rule__FigRefElement__Group__0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:251:1: ( ( rule__FigRefElement__Group__0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:252:1: ( rule__FigRefElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigRefElementAccess().getGroup()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:253:1: ( rule__FigRefElement__Group__0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:253:2: rule__FigRefElement__Group__0
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:265:1: entryRuleNullElement : ruleNullElement EOF ;
    public final void entryRuleNullElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:266:1: ( ruleNullElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:267:1: ruleNullElement EOF
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:274:1: ruleNullElement : ( ( rule__NullElement__Group__0 ) ) ;
    public final void ruleNullElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:278:2: ( ( ( rule__NullElement__Group__0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:279:1: ( ( rule__NullElement__Group__0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:279:1: ( ( rule__NullElement__Group__0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:280:1: ( rule__NullElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullElementAccess().getGroup()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:281:1: ( rule__NullElement__Group__0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:281:2: rule__NullElement__Group__0
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


    // $ANTLR start "entryRuleOclElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:293:1: entryRuleOclElement : ruleOclElement EOF ;
    public final void entryRuleOclElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:294:1: ( ruleOclElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:295:1: ruleOclElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOclElement_in_entryRuleOclElement565);
            ruleOclElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOclElement572); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOclElement"


    // $ANTLR start "ruleOclElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:302:1: ruleOclElement : ( ( rule__OclElement__Group__0 ) ) ;
    public final void ruleOclElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:306:2: ( ( ( rule__OclElement__Group__0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:307:1: ( ( rule__OclElement__Group__0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:307:1: ( ( rule__OclElement__Group__0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:308:1: ( rule__OclElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclElementAccess().getGroup()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:309:1: ( rule__OclElement__Group__0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:309:2: rule__OclElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OclElement__Group__0_in_ruleOclElement598);
            rule__OclElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclElementAccess().getGroup()); 
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
    // $ANTLR end "ruleOclElement"


    // $ANTLR start "rule__MarkupElement__Alternatives"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:323:1: rule__MarkupElement__Alternatives : ( ( ruleFontElement ) | ( ruleNewLineElement ) | ( ruleTextElement ) | ( ruleFigElement ) | ( ruleFigRefElement ) | ( ruleNullElement ) | ( ruleOclElement ) );
    public final void rule__MarkupElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:327:1: ( ( ruleFontElement ) | ( ruleNewLineElement ) | ( ruleTextElement ) | ( ruleFigElement ) | ( ruleFigRefElement ) | ( ruleNullElement ) | ( ruleOclElement ) )
            int alt3=7;
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
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:328:1: ( ruleFontElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:328:1: ( ruleFontElement )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:329:1: ruleFontElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getFontElementParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFontElement_in_rule__MarkupElement__Alternatives636);
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
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:334:6: ( ruleNewLineElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:334:6: ( ruleNewLineElement )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:335:1: ruleNewLineElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getNewLineElementParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNewLineElement_in_rule__MarkupElement__Alternatives653);
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
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:340:6: ( ruleTextElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:340:6: ( ruleTextElement )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:341:1: ruleTextElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getTextElementParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextElement_in_rule__MarkupElement__Alternatives670);
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
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:346:6: ( ruleFigElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:346:6: ( ruleFigElement )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:347:1: ruleFigElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getFigElementParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFigElement_in_rule__MarkupElement__Alternatives687);
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
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:352:6: ( ruleFigRefElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:352:6: ( ruleFigRefElement )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:353:1: ruleFigRefElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getFigRefElementParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFigRefElement_in_rule__MarkupElement__Alternatives704);
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
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:358:6: ( ruleNullElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:358:6: ( ruleNullElement )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:359:1: ruleNullElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getNullElementParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNullElement_in_rule__MarkupElement__Alternatives721);
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
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:364:6: ( ruleOclElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:364:6: ( ruleOclElement )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:365:1: ruleOclElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getOclElementParserRuleCall_6()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOclElement_in_rule__MarkupElement__Alternatives738);
                    ruleOclElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMarkupElementAccess().getOclElementParserRuleCall_6()); 
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:375:1: rule__TextElement__TextAlternatives_0 : ( ( RULE_ID ) | ( RULE_WORD ) | ( RULE_WS ) );
    public final void rule__TextElement__TextAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:379:1: ( ( RULE_ID ) | ( RULE_WORD ) | ( RULE_WS ) )
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
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:380:1: ( RULE_ID )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:380:1: ( RULE_ID )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:381:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextElementAccess().getTextIDTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TextElement__TextAlternatives_0770); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextElementAccess().getTextIDTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:386:6: ( RULE_WORD )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:386:6: ( RULE_WORD )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:387:1: RULE_WORD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextElementAccess().getTextWORDTerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_WORD,FollowSets000.FOLLOW_RULE_WORD_in_rule__TextElement__TextAlternatives_0787); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextElementAccess().getTextWORDTerminalRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:392:6: ( RULE_WS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:392:6: ( RULE_WS )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:393:1: RULE_WS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextElementAccess().getTextWSTerminalRuleCall_0_2()); 
                    }
                    match(input,RULE_WS,FollowSets000.FOLLOW_RULE_WS_in_rule__TextElement__TextAlternatives_0804); if (state.failed) return ;
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:403:1: rule__FontElement__FontAlternatives_0_0 : ( ( 'b[' ) | ( 'e[' ) );
    public final void rule__FontElement__FontAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:407:1: ( ( 'b[' ) | ( 'e[' ) )
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
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:408:1: ( 'b[' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:408:1: ( 'b[' )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:409:1: 'b['
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFontElementAccess().getFontBKeyword_0_0_0()); 
                    }
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__FontElement__FontAlternatives_0_0837); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFontElementAccess().getFontBKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:416:6: ( 'e[' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:416:6: ( 'e[' )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:417:1: 'e['
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFontElementAccess().getFontEKeyword_0_0_1()); 
                    }
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__FontElement__FontAlternatives_0_0857); if (state.failed) return ;
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:429:1: rule__FigElement__Alternatives_0 : ( ( 'fig[' ) | ( ( rule__FigElement__Group_0_1__0 ) ) );
    public final void rule__FigElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:433:1: ( ( 'fig[' ) | ( ( rule__FigElement__Group_0_1__0 ) ) )
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
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:434:1: ( 'fig[' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:434:1: ( 'fig[' )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:435:1: 'fig['
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFigElementAccess().getFigKeyword_0_0()); 
                    }
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__FigElement__Alternatives_0892); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFigElementAccess().getFigKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:442:6: ( ( rule__FigElement__Group_0_1__0 ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:442:6: ( ( rule__FigElement__Group_0_1__0 ) )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:443:1: ( rule__FigElement__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFigElementAccess().getGroup_0_1()); 
                    }
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:444:1: ( rule__FigElement__Group_0_1__0 )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:444:2: rule__FigElement__Group_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group_0_1__0_in_rule__FigElement__Alternatives_0911);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:456:1: rule__FontElement__Group__0 : rule__FontElement__Group__0__Impl rule__FontElement__Group__1 ;
    public final void rule__FontElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:460:1: ( rule__FontElement__Group__0__Impl rule__FontElement__Group__1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:461:2: rule__FontElement__Group__0__Impl rule__FontElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__0__Impl_in_rule__FontElement__Group__0943);
            rule__FontElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__1_in_rule__FontElement__Group__0946);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:468:1: rule__FontElement__Group__0__Impl : ( ( rule__FontElement__FontAssignment_0 ) ) ;
    public final void rule__FontElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:472:1: ( ( ( rule__FontElement__FontAssignment_0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:473:1: ( ( rule__FontElement__FontAssignment_0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:473:1: ( ( rule__FontElement__FontAssignment_0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:474:1: ( rule__FontElement__FontAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getFontAssignment_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:475:1: ( rule__FontElement__FontAssignment_0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:475:2: rule__FontElement__FontAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__FontAssignment_0_in_rule__FontElement__Group__0__Impl973);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:485:1: rule__FontElement__Group__1 : rule__FontElement__Group__1__Impl rule__FontElement__Group__2 ;
    public final void rule__FontElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:489:1: ( rule__FontElement__Group__1__Impl rule__FontElement__Group__2 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:490:2: rule__FontElement__Group__1__Impl rule__FontElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__1__Impl_in_rule__FontElement__Group__11003);
            rule__FontElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__2_in_rule__FontElement__Group__11006);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:497:1: rule__FontElement__Group__1__Impl : ( ( rule__FontElement__ElementsAssignment_1 )* ) ;
    public final void rule__FontElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:501:1: ( ( ( rule__FontElement__ElementsAssignment_1 )* ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:502:1: ( ( rule__FontElement__ElementsAssignment_1 )* )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:502:1: ( ( rule__FontElement__ElementsAssignment_1 )* )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:503:1: ( rule__FontElement__ElementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getElementsAssignment_1()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:504:1: ( rule__FontElement__ElementsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_NL)||(LA7_0>=11 && LA7_0<=13)||(LA7_0>=15 && LA7_0<=18)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:504:2: rule__FontElement__ElementsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__FontElement__ElementsAssignment_1_in_rule__FontElement__Group__1__Impl1033);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:514:1: rule__FontElement__Group__2 : rule__FontElement__Group__2__Impl ;
    public final void rule__FontElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:518:1: ( rule__FontElement__Group__2__Impl )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:519:2: rule__FontElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__2__Impl_in_rule__FontElement__Group__21064);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:525:1: rule__FontElement__Group__2__Impl : ( ']' ) ;
    public final void rule__FontElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:529:1: ( ( ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:530:1: ( ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:530:1: ( ']' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:531:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__FontElement__Group__2__Impl1092); if (state.failed) return ;
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:550:1: rule__FigElement__Group__0 : rule__FigElement__Group__0__Impl rule__FigElement__Group__1 ;
    public final void rule__FigElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:554:1: ( rule__FigElement__Group__0__Impl rule__FigElement__Group__1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:555:2: rule__FigElement__Group__0__Impl rule__FigElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group__0__Impl_in_rule__FigElement__Group__01129);
            rule__FigElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group__1_in_rule__FigElement__Group__01132);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:562:1: rule__FigElement__Group__0__Impl : ( ( rule__FigElement__Alternatives_0 ) ) ;
    public final void rule__FigElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:566:1: ( ( ( rule__FigElement__Alternatives_0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:567:1: ( ( rule__FigElement__Alternatives_0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:567:1: ( ( rule__FigElement__Alternatives_0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:568:1: ( rule__FigElement__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getAlternatives_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:569:1: ( rule__FigElement__Alternatives_0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:569:2: rule__FigElement__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Alternatives_0_in_rule__FigElement__Group__0__Impl1159);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:579:1: rule__FigElement__Group__1 : rule__FigElement__Group__1__Impl rule__FigElement__Group__2 ;
    public final void rule__FigElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:583:1: ( rule__FigElement__Group__1__Impl rule__FigElement__Group__2 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:584:2: rule__FigElement__Group__1__Impl rule__FigElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group__1__Impl_in_rule__FigElement__Group__11189);
            rule__FigElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group__2_in_rule__FigElement__Group__11192);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:591:1: rule__FigElement__Group__1__Impl : ( ( rule__FigElement__SrcAssignment_1 ) ) ;
    public final void rule__FigElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:595:1: ( ( ( rule__FigElement__SrcAssignment_1 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:596:1: ( ( rule__FigElement__SrcAssignment_1 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:596:1: ( ( rule__FigElement__SrcAssignment_1 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:597:1: ( rule__FigElement__SrcAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getSrcAssignment_1()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:598:1: ( rule__FigElement__SrcAssignment_1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:598:2: rule__FigElement__SrcAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__SrcAssignment_1_in_rule__FigElement__Group__1__Impl1219);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:608:1: rule__FigElement__Group__2 : rule__FigElement__Group__2__Impl ;
    public final void rule__FigElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:612:1: ( rule__FigElement__Group__2__Impl )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:613:2: rule__FigElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group__2__Impl_in_rule__FigElement__Group__21249);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:619:1: rule__FigElement__Group__2__Impl : ( ']' ) ;
    public final void rule__FigElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:623:1: ( ( ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:624:1: ( ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:624:1: ( ']' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:625:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__FigElement__Group__2__Impl1277); if (state.failed) return ;
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:644:1: rule__FigElement__Group_0_1__0 : rule__FigElement__Group_0_1__0__Impl rule__FigElement__Group_0_1__1 ;
    public final void rule__FigElement__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:648:1: ( rule__FigElement__Group_0_1__0__Impl rule__FigElement__Group_0_1__1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:649:2: rule__FigElement__Group_0_1__0__Impl rule__FigElement__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group_0_1__0__Impl_in_rule__FigElement__Group_0_1__01314);
            rule__FigElement__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group_0_1__1_in_rule__FigElement__Group_0_1__01317);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:656:1: rule__FigElement__Group_0_1__0__Impl : ( 'fig:' ) ;
    public final void rule__FigElement__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:660:1: ( ( 'fig:' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:661:1: ( 'fig:' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:661:1: ( 'fig:' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:662:1: 'fig:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getFigKeyword_0_1_0()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__FigElement__Group_0_1__0__Impl1345); if (state.failed) return ;
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:675:1: rule__FigElement__Group_0_1__1 : rule__FigElement__Group_0_1__1__Impl rule__FigElement__Group_0_1__2 ;
    public final void rule__FigElement__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:679:1: ( rule__FigElement__Group_0_1__1__Impl rule__FigElement__Group_0_1__2 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:680:2: rule__FigElement__Group_0_1__1__Impl rule__FigElement__Group_0_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group_0_1__1__Impl_in_rule__FigElement__Group_0_1__11376);
            rule__FigElement__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group_0_1__2_in_rule__FigElement__Group_0_1__11379);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:687:1: rule__FigElement__Group_0_1__1__Impl : ( ( rule__FigElement__IdAssignment_0_1_1 ) ) ;
    public final void rule__FigElement__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:691:1: ( ( ( rule__FigElement__IdAssignment_0_1_1 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:692:1: ( ( rule__FigElement__IdAssignment_0_1_1 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:692:1: ( ( rule__FigElement__IdAssignment_0_1_1 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:693:1: ( rule__FigElement__IdAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getIdAssignment_0_1_1()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:694:1: ( rule__FigElement__IdAssignment_0_1_1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:694:2: rule__FigElement__IdAssignment_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__IdAssignment_0_1_1_in_rule__FigElement__Group_0_1__1__Impl1406);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:704:1: rule__FigElement__Group_0_1__2 : rule__FigElement__Group_0_1__2__Impl ;
    public final void rule__FigElement__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:708:1: ( rule__FigElement__Group_0_1__2__Impl )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:709:2: rule__FigElement__Group_0_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group_0_1__2__Impl_in_rule__FigElement__Group_0_1__21436);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:715:1: rule__FigElement__Group_0_1__2__Impl : ( '[' ) ;
    public final void rule__FigElement__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:719:1: ( ( '[' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:720:1: ( '[' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:720:1: ( '[' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:721:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getLeftSquareBracketKeyword_0_1_2()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__FigElement__Group_0_1__2__Impl1464); if (state.failed) return ;
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:740:1: rule__FigRefElement__Group__0 : rule__FigRefElement__Group__0__Impl rule__FigRefElement__Group__1 ;
    public final void rule__FigRefElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:744:1: ( rule__FigRefElement__Group__0__Impl rule__FigRefElement__Group__1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:745:2: rule__FigRefElement__Group__0__Impl rule__FigRefElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigRefElement__Group__0__Impl_in_rule__FigRefElement__Group__01501);
            rule__FigRefElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FigRefElement__Group__1_in_rule__FigRefElement__Group__01504);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:752:1: rule__FigRefElement__Group__0__Impl : ( 'fig-[' ) ;
    public final void rule__FigRefElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:756:1: ( ( 'fig-[' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:757:1: ( 'fig-[' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:757:1: ( 'fig-[' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:758:1: 'fig-['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigRefElementAccess().getFigKeyword_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__FigRefElement__Group__0__Impl1532); if (state.failed) return ;
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:771:1: rule__FigRefElement__Group__1 : rule__FigRefElement__Group__1__Impl rule__FigRefElement__Group__2 ;
    public final void rule__FigRefElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:775:1: ( rule__FigRefElement__Group__1__Impl rule__FigRefElement__Group__2 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:776:2: rule__FigRefElement__Group__1__Impl rule__FigRefElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigRefElement__Group__1__Impl_in_rule__FigRefElement__Group__11563);
            rule__FigRefElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FigRefElement__Group__2_in_rule__FigRefElement__Group__11566);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:783:1: rule__FigRefElement__Group__1__Impl : ( ( rule__FigRefElement__RefAssignment_1 ) ) ;
    public final void rule__FigRefElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:787:1: ( ( ( rule__FigRefElement__RefAssignment_1 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:788:1: ( ( rule__FigRefElement__RefAssignment_1 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:788:1: ( ( rule__FigRefElement__RefAssignment_1 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:789:1: ( rule__FigRefElement__RefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigRefElementAccess().getRefAssignment_1()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:790:1: ( rule__FigRefElement__RefAssignment_1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:790:2: rule__FigRefElement__RefAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigRefElement__RefAssignment_1_in_rule__FigRefElement__Group__1__Impl1593);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:800:1: rule__FigRefElement__Group__2 : rule__FigRefElement__Group__2__Impl ;
    public final void rule__FigRefElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:804:1: ( rule__FigRefElement__Group__2__Impl )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:805:2: rule__FigRefElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigRefElement__Group__2__Impl_in_rule__FigRefElement__Group__21623);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:811:1: rule__FigRefElement__Group__2__Impl : ( ']' ) ;
    public final void rule__FigRefElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:815:1: ( ( ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:816:1: ( ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:816:1: ( ']' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:817:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigRefElementAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__FigRefElement__Group__2__Impl1651); if (state.failed) return ;
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:836:1: rule__NullElement__Group__0 : rule__NullElement__Group__0__Impl rule__NullElement__Group__1 ;
    public final void rule__NullElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:840:1: ( rule__NullElement__Group__0__Impl rule__NullElement__Group__1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:841:2: rule__NullElement__Group__0__Impl rule__NullElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NullElement__Group__0__Impl_in_rule__NullElement__Group__01688);
            rule__NullElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NullElement__Group__1_in_rule__NullElement__Group__01691);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:848:1: rule__NullElement__Group__0__Impl : ( () ) ;
    public final void rule__NullElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:852:1: ( ( () ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:853:1: ( () )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:853:1: ( () )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:854:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullElementAccess().getNullElementAction_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:855:1: ()
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:857:1: 
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:867:1: rule__NullElement__Group__1 : rule__NullElement__Group__1__Impl rule__NullElement__Group__2 ;
    public final void rule__NullElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:871:1: ( rule__NullElement__Group__1__Impl rule__NullElement__Group__2 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:872:2: rule__NullElement__Group__1__Impl rule__NullElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NullElement__Group__1__Impl_in_rule__NullElement__Group__11749);
            rule__NullElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NullElement__Group__2_in_rule__NullElement__Group__11752);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:879:1: rule__NullElement__Group__1__Impl : ( '[' ) ;
    public final void rule__NullElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:883:1: ( ( '[' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:884:1: ( '[' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:884:1: ( '[' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:885:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullElementAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__NullElement__Group__1__Impl1780); if (state.failed) return ;
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:898:1: rule__NullElement__Group__2 : rule__NullElement__Group__2__Impl rule__NullElement__Group__3 ;
    public final void rule__NullElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:902:1: ( rule__NullElement__Group__2__Impl rule__NullElement__Group__3 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:903:2: rule__NullElement__Group__2__Impl rule__NullElement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__NullElement__Group__2__Impl_in_rule__NullElement__Group__21811);
            rule__NullElement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NullElement__Group__3_in_rule__NullElement__Group__21814);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:910:1: rule__NullElement__Group__2__Impl : ( ( rule__NullElement__ElementsAssignment_2 )* ) ;
    public final void rule__NullElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:914:1: ( ( ( rule__NullElement__ElementsAssignment_2 )* ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:915:1: ( ( rule__NullElement__ElementsAssignment_2 )* )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:915:1: ( ( rule__NullElement__ElementsAssignment_2 )* )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:916:1: ( rule__NullElement__ElementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullElementAccess().getElementsAssignment_2()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:917:1: ( rule__NullElement__ElementsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_NL)||(LA8_0>=11 && LA8_0<=13)||(LA8_0>=15 && LA8_0<=18)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:917:2: rule__NullElement__ElementsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__NullElement__ElementsAssignment_2_in_rule__NullElement__Group__2__Impl1841);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:927:1: rule__NullElement__Group__3 : rule__NullElement__Group__3__Impl ;
    public final void rule__NullElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:931:1: ( rule__NullElement__Group__3__Impl )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:932:2: rule__NullElement__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NullElement__Group__3__Impl_in_rule__NullElement__Group__31872);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:938:1: rule__NullElement__Group__3__Impl : ( ']' ) ;
    public final void rule__NullElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:942:1: ( ( ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:943:1: ( ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:943:1: ( ']' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:944:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullElementAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__NullElement__Group__3__Impl1900); if (state.failed) return ;
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


    // $ANTLR start "rule__OclElement__Group__0"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:965:1: rule__OclElement__Group__0 : rule__OclElement__Group__0__Impl rule__OclElement__Group__1 ;
    public final void rule__OclElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:969:1: ( rule__OclElement__Group__0__Impl rule__OclElement__Group__1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:970:2: rule__OclElement__Group__0__Impl rule__OclElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OclElement__Group__0__Impl_in_rule__OclElement__Group__01939);
            rule__OclElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OclElement__Group__1_in_rule__OclElement__Group__01942);
            rule__OclElement__Group__1();

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
    // $ANTLR end "rule__OclElement__Group__0"


    // $ANTLR start "rule__OclElement__Group__0__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:977:1: rule__OclElement__Group__0__Impl : ( () ) ;
    public final void rule__OclElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:981:1: ( ( () ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:982:1: ( () )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:982:1: ( () )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:983:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclElementAccess().getOclElementAction_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:984:1: ()
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:986:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclElementAccess().getOclElementAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OclElement__Group__0__Impl"


    // $ANTLR start "rule__OclElement__Group__1"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:996:1: rule__OclElement__Group__1 : rule__OclElement__Group__1__Impl rule__OclElement__Group__2 ;
    public final void rule__OclElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1000:1: ( rule__OclElement__Group__1__Impl rule__OclElement__Group__2 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1001:2: rule__OclElement__Group__1__Impl rule__OclElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OclElement__Group__1__Impl_in_rule__OclElement__Group__12000);
            rule__OclElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OclElement__Group__2_in_rule__OclElement__Group__12003);
            rule__OclElement__Group__2();

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
    // $ANTLR end "rule__OclElement__Group__1"


    // $ANTLR start "rule__OclElement__Group__1__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1008:1: rule__OclElement__Group__1__Impl : ( 'ocl[' ) ;
    public final void rule__OclElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1012:1: ( ( 'ocl[' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1013:1: ( 'ocl[' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1013:1: ( 'ocl[' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1014:1: 'ocl['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclElementAccess().getOclKeyword_1()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__OclElement__Group__1__Impl2031); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclElementAccess().getOclKeyword_1()); 
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
    // $ANTLR end "rule__OclElement__Group__1__Impl"


    // $ANTLR start "rule__OclElement__Group__2"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1027:1: rule__OclElement__Group__2 : rule__OclElement__Group__2__Impl rule__OclElement__Group__3 ;
    public final void rule__OclElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1031:1: ( rule__OclElement__Group__2__Impl rule__OclElement__Group__3 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1032:2: rule__OclElement__Group__2__Impl rule__OclElement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OclElement__Group__2__Impl_in_rule__OclElement__Group__22062);
            rule__OclElement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OclElement__Group__3_in_rule__OclElement__Group__22065);
            rule__OclElement__Group__3();

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
    // $ANTLR end "rule__OclElement__Group__2"


    // $ANTLR start "rule__OclElement__Group__2__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1039:1: rule__OclElement__Group__2__Impl : ( ( rule__OclElement__ElementsAssignment_2 )* ) ;
    public final void rule__OclElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1043:1: ( ( ( rule__OclElement__ElementsAssignment_2 )* ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1044:1: ( ( rule__OclElement__ElementsAssignment_2 )* )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1044:1: ( ( rule__OclElement__ElementsAssignment_2 )* )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1045:1: ( rule__OclElement__ElementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclElementAccess().getElementsAssignment_2()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1046:1: ( rule__OclElement__ElementsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_NL)||(LA9_0>=11 && LA9_0<=13)||(LA9_0>=15 && LA9_0<=18)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1046:2: rule__OclElement__ElementsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OclElement__ElementsAssignment_2_in_rule__OclElement__Group__2__Impl2092);
            	    rule__OclElement__ElementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclElementAccess().getElementsAssignment_2()); 
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
    // $ANTLR end "rule__OclElement__Group__2__Impl"


    // $ANTLR start "rule__OclElement__Group__3"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1056:1: rule__OclElement__Group__3 : rule__OclElement__Group__3__Impl ;
    public final void rule__OclElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1060:1: ( rule__OclElement__Group__3__Impl )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1061:2: rule__OclElement__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OclElement__Group__3__Impl_in_rule__OclElement__Group__32123);
            rule__OclElement__Group__3__Impl();

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
    // $ANTLR end "rule__OclElement__Group__3"


    // $ANTLR start "rule__OclElement__Group__3__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1067:1: rule__OclElement__Group__3__Impl : ( ']' ) ;
    public final void rule__OclElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1071:1: ( ( ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1072:1: ( ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1072:1: ( ']' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1073:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclElementAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OclElement__Group__3__Impl2151); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclElementAccess().getRightSquareBracketKeyword_3()); 
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
    // $ANTLR end "rule__OclElement__Group__3__Impl"


    // $ANTLR start "rule__Markup__ElementsAssignment"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1095:1: rule__Markup__ElementsAssignment : ( ruleMarkupElement ) ;
    public final void rule__Markup__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1099:1: ( ( ruleMarkupElement ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1100:1: ( ruleMarkupElement )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1100:1: ( ruleMarkupElement )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1101:1: ruleMarkupElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getElementsMarkupElementParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_rule__Markup__ElementsAssignment2195);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1110:1: rule__TextElement__TextAssignment : ( ( rule__TextElement__TextAlternatives_0 ) ) ;
    public final void rule__TextElement__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1114:1: ( ( ( rule__TextElement__TextAlternatives_0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1115:1: ( ( rule__TextElement__TextAlternatives_0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1115:1: ( ( rule__TextElement__TextAlternatives_0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1116:1: ( rule__TextElement__TextAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextElementAccess().getTextAlternatives_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1117:1: ( rule__TextElement__TextAlternatives_0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1117:2: rule__TextElement__TextAlternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextElement__TextAlternatives_0_in_rule__TextElement__TextAssignment2226);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1126:1: rule__NewLineElement__TextAssignment : ( RULE_NL ) ;
    public final void rule__NewLineElement__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1130:1: ( ( RULE_NL ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1131:1: ( RULE_NL )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1131:1: ( RULE_NL )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1132:1: RULE_NL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewLineElementAccess().getTextNLTerminalRuleCall_0()); 
            }
            match(input,RULE_NL,FollowSets000.FOLLOW_RULE_NL_in_rule__NewLineElement__TextAssignment2259); if (state.failed) return ;
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1141:1: rule__FontElement__FontAssignment_0 : ( ( rule__FontElement__FontAlternatives_0_0 ) ) ;
    public final void rule__FontElement__FontAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1145:1: ( ( ( rule__FontElement__FontAlternatives_0_0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1146:1: ( ( rule__FontElement__FontAlternatives_0_0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1146:1: ( ( rule__FontElement__FontAlternatives_0_0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1147:1: ( rule__FontElement__FontAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getFontAlternatives_0_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1148:1: ( rule__FontElement__FontAlternatives_0_0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1148:2: rule__FontElement__FontAlternatives_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__FontAlternatives_0_0_in_rule__FontElement__FontAssignment_02290);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1157:1: rule__FontElement__ElementsAssignment_1 : ( ruleMarkupElement ) ;
    public final void rule__FontElement__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1161:1: ( ( ruleMarkupElement ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1162:1: ( ruleMarkupElement )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1162:1: ( ruleMarkupElement )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1163:1: ruleMarkupElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getElementsMarkupElementParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_rule__FontElement__ElementsAssignment_12323);
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1172:1: rule__FigElement__IdAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__FigElement__IdAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1176:1: ( ( RULE_ID ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1177:1: ( RULE_ID )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1177:1: ( RULE_ID )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1178:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getIdIDTerminalRuleCall_0_1_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__FigElement__IdAssignment_0_1_12354); if (state.failed) return ;
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1187:1: rule__FigElement__SrcAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FigElement__SrcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1191:1: ( ( RULE_STRING ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1192:1: ( RULE_STRING )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1192:1: ( RULE_STRING )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1193:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getSrcSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__FigElement__SrcAssignment_12385); if (state.failed) return ;
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1202:1: rule__FigRefElement__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FigRefElement__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1206:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1207:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1207:1: ( ( RULE_ID ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1208:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigRefElementAccess().getRefFigElementCrossReference_1_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1209:1: ( RULE_ID )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1210:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigRefElementAccess().getRefFigElementIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__FigRefElement__RefAssignment_12420); if (state.failed) return ;
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
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1221:1: rule__NullElement__ElementsAssignment_2 : ( ruleMarkupElement ) ;
    public final void rule__NullElement__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1225:1: ( ( ruleMarkupElement ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1226:1: ( ruleMarkupElement )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1226:1: ( ruleMarkupElement )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1227:1: ruleMarkupElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullElementAccess().getElementsMarkupElementParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_rule__NullElement__ElementsAssignment_22455);
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


    // $ANTLR start "rule__OclElement__ElementsAssignment_2"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1236:1: rule__OclElement__ElementsAssignment_2 : ( ruleMarkupElement ) ;
    public final void rule__OclElement__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1240:1: ( ( ruleMarkupElement ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1241:1: ( ruleMarkupElement )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1241:1: ( ruleMarkupElement )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:1242:1: ruleMarkupElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOclElementAccess().getElementsMarkupElementParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_rule__OclElement__ElementsAssignment_22486);
            ruleMarkupElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOclElementAccess().getElementsMarkupElementParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__OclElement__ElementsAssignment_2"

    // $ANTLR start synpred2_InternalMarkup
    public final void synpred2_InternalMarkup_fragment() throws RecognitionException {   
        // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:140:2: ( rule__TextElement__TextAssignment )
        // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:140:2: rule__TextElement__TextAssignment
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
        public static final BitSet FOLLOW_rule__Markup__ElementsAssignment_in_ruleMarkup100 = new BitSet(new long[]{0x000000000007B8F2L});
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
        public static final BitSet FOLLOW_ruleOclElement_in_entryRuleOclElement565 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOclElement572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OclElement__Group__0_in_ruleOclElement598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFontElement_in_rule__MarkupElement__Alternatives636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNewLineElement_in_rule__MarkupElement__Alternatives653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextElement_in_rule__MarkupElement__Alternatives670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFigElement_in_rule__MarkupElement__Alternatives687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFigRefElement_in_rule__MarkupElement__Alternatives704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullElement_in_rule__MarkupElement__Alternatives721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOclElement_in_rule__MarkupElement__Alternatives738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TextElement__TextAlternatives_0770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_WORD_in_rule__TextElement__TextAlternatives_0787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_WS_in_rule__TextElement__TextAlternatives_0804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__FontElement__FontAlternatives_0_0837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__FontElement__FontAlternatives_0_0857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__FigElement__Alternatives_0892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group_0_1__0_in_rule__FigElement__Alternatives_0911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FontElement__Group__0__Impl_in_rule__FontElement__Group__0943 = new BitSet(new long[]{0x000000000007F8F0L});
        public static final BitSet FOLLOW_rule__FontElement__Group__1_in_rule__FontElement__Group__0946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FontElement__FontAssignment_0_in_rule__FontElement__Group__0__Impl973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FontElement__Group__1__Impl_in_rule__FontElement__Group__11003 = new BitSet(new long[]{0x000000000007F8F0L});
        public static final BitSet FOLLOW_rule__FontElement__Group__2_in_rule__FontElement__Group__11006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FontElement__ElementsAssignment_1_in_rule__FontElement__Group__1__Impl1033 = new BitSet(new long[]{0x000000000007B8F2L});
        public static final BitSet FOLLOW_rule__FontElement__Group__2__Impl_in_rule__FontElement__Group__21064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__FontElement__Group__2__Impl1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group__0__Impl_in_rule__FigElement__Group__01129 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__FigElement__Group__1_in_rule__FigElement__Group__01132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Alternatives_0_in_rule__FigElement__Group__0__Impl1159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group__1__Impl_in_rule__FigElement__Group__11189 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__FigElement__Group__2_in_rule__FigElement__Group__11192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__SrcAssignment_1_in_rule__FigElement__Group__1__Impl1219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group__2__Impl_in_rule__FigElement__Group__21249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__FigElement__Group__2__Impl1277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group_0_1__0__Impl_in_rule__FigElement__Group_0_1__01314 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__FigElement__Group_0_1__1_in_rule__FigElement__Group_0_1__01317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__FigElement__Group_0_1__0__Impl1345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group_0_1__1__Impl_in_rule__FigElement__Group_0_1__11376 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__FigElement__Group_0_1__2_in_rule__FigElement__Group_0_1__11379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__IdAssignment_0_1_1_in_rule__FigElement__Group_0_1__1__Impl1406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group_0_1__2__Impl_in_rule__FigElement__Group_0_1__21436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__FigElement__Group_0_1__2__Impl1464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigRefElement__Group__0__Impl_in_rule__FigRefElement__Group__01501 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__FigRefElement__Group__1_in_rule__FigRefElement__Group__01504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__FigRefElement__Group__0__Impl1532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigRefElement__Group__1__Impl_in_rule__FigRefElement__Group__11563 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__FigRefElement__Group__2_in_rule__FigRefElement__Group__11566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigRefElement__RefAssignment_1_in_rule__FigRefElement__Group__1__Impl1593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigRefElement__Group__2__Impl_in_rule__FigRefElement__Group__21623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__FigRefElement__Group__2__Impl1651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NullElement__Group__0__Impl_in_rule__NullElement__Group__01688 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__NullElement__Group__1_in_rule__NullElement__Group__01691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NullElement__Group__1__Impl_in_rule__NullElement__Group__11749 = new BitSet(new long[]{0x000000000007F8F0L});
        public static final BitSet FOLLOW_rule__NullElement__Group__2_in_rule__NullElement__Group__11752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__NullElement__Group__1__Impl1780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NullElement__Group__2__Impl_in_rule__NullElement__Group__21811 = new BitSet(new long[]{0x000000000007F8F0L});
        public static final BitSet FOLLOW_rule__NullElement__Group__3_in_rule__NullElement__Group__21814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NullElement__ElementsAssignment_2_in_rule__NullElement__Group__2__Impl1841 = new BitSet(new long[]{0x000000000007B8F2L});
        public static final BitSet FOLLOW_rule__NullElement__Group__3__Impl_in_rule__NullElement__Group__31872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__NullElement__Group__3__Impl1900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OclElement__Group__0__Impl_in_rule__OclElement__Group__01939 = new BitSet(new long[]{0x000000000007B8F0L});
        public static final BitSet FOLLOW_rule__OclElement__Group__1_in_rule__OclElement__Group__01942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OclElement__Group__1__Impl_in_rule__OclElement__Group__12000 = new BitSet(new long[]{0x000000000007F8F0L});
        public static final BitSet FOLLOW_rule__OclElement__Group__2_in_rule__OclElement__Group__12003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__OclElement__Group__1__Impl2031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OclElement__Group__2__Impl_in_rule__OclElement__Group__22062 = new BitSet(new long[]{0x000000000007F8F0L});
        public static final BitSet FOLLOW_rule__OclElement__Group__3_in_rule__OclElement__Group__22065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OclElement__ElementsAssignment_2_in_rule__OclElement__Group__2__Impl2092 = new BitSet(new long[]{0x000000000007B8F2L});
        public static final BitSet FOLLOW_rule__OclElement__Group__3__Impl_in_rule__OclElement__Group__32123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OclElement__Group__3__Impl2151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_rule__Markup__ElementsAssignment2195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextElement__TextAlternatives_0_in_rule__TextElement__TextAssignment2226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NL_in_rule__NewLineElement__TextAssignment2259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FontElement__FontAlternatives_0_0_in_rule__FontElement__FontAssignment_02290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_rule__FontElement__ElementsAssignment_12323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__FigElement__IdAssignment_0_1_12354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__FigElement__SrcAssignment_12385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__FigRefElement__RefAssignment_12420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_rule__NullElement__ElementsAssignment_22455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_rule__OclElement__ElementsAssignment_22486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextElement__TextAssignment_in_synpred2_InternalMarkup235 = new BitSet(new long[]{0x0000000000000002L});
    }


}