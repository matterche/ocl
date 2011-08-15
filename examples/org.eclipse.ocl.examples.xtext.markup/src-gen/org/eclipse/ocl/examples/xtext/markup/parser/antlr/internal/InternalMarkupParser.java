package org.eclipse.ocl.examples.xtext.markup.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.ocl.examples.xtext.markup.services.MarkupGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMarkupParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WORD", "RULE_WS", "RULE_NL", "RULE_STRING", "RULE_TEXT", "RULE_ANY_OTHER", "'b['", "'e['", "']'", "'fig['", "'fig:'", "'['", "'fig-['", "'oclCode['", "'oclEval['", "'oclText['"
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
    public String getGrammarFileName() { return "../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private MarkupGrammarAccess grammarAccess;
     	
        public InternalMarkupParser(TokenStream input, MarkupGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Markup";	
       	}
       	
       	@Override
       	protected MarkupGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMarkup"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:73:1: entryRuleMarkup returns [EObject current=null] : iv_ruleMarkup= ruleMarkup EOF ;
    public final EObject entryRuleMarkup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkup = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:74:2: (iv_ruleMarkup= ruleMarkup EOF )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:75:2: iv_ruleMarkup= ruleMarkup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMarkupRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkup_in_entryRuleMarkup81);
            iv_ruleMarkup=ruleMarkup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMarkup; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMarkup91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMarkup"


    // $ANTLR start "ruleMarkup"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:82:1: ruleMarkup returns [EObject current=null] : ( (lv_elements_0_0= ruleMarkupElement ) )* ;
    public final EObject ruleMarkup() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:85:28: ( ( (lv_elements_0_0= ruleMarkupElement ) )* )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:86:1: ( (lv_elements_0_0= ruleMarkupElement ) )*
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:86:1: ( (lv_elements_0_0= ruleMarkupElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_NL)||(LA1_0>=11 && LA1_0<=12)||(LA1_0>=14 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:87:1: (lv_elements_0_0= ruleMarkupElement )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:87:1: (lv_elements_0_0= ruleMarkupElement )
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:88:3: lv_elements_0_0= ruleMarkupElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMarkupAccess().getElementsMarkupElementParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_ruleMarkup136);
            	    lv_elements_0_0=ruleMarkupElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMarkupRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_0_0, 
            	              		"MarkupElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMarkup"


    // $ANTLR start "entryRuleMarkupElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:112:1: entryRuleMarkupElement returns [EObject current=null] : iv_ruleMarkupElement= ruleMarkupElement EOF ;
    public final EObject entryRuleMarkupElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupElement = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:113:2: (iv_ruleMarkupElement= ruleMarkupElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:114:2: iv_ruleMarkupElement= ruleMarkupElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMarkupElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_entryRuleMarkupElement172);
            iv_ruleMarkupElement=ruleMarkupElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMarkupElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMarkupElement182); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMarkupElement"


    // $ANTLR start "ruleMarkupElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:121:1: ruleMarkupElement returns [EObject current=null] : (this_FontElement_0= ruleFontElement | this_NewLineElement_1= ruleNewLineElement | this_TextElement_2= ruleTextElement | this_FigElement_3= ruleFigElement | this_FigRefElement_4= ruleFigRefElement | this_NullElement_5= ruleNullElement | this_OclCodeElement_6= ruleOclCodeElement | this_OclEvalElement_7= ruleOclEvalElement | this_OclTextElement_8= ruleOclTextElement ) ;
    public final EObject ruleMarkupElement() throws RecognitionException {
        EObject current = null;

        EObject this_FontElement_0 = null;

        EObject this_NewLineElement_1 = null;

        EObject this_TextElement_2 = null;

        EObject this_FigElement_3 = null;

        EObject this_FigRefElement_4 = null;

        EObject this_NullElement_5 = null;

        EObject this_OclCodeElement_6 = null;

        EObject this_OclEvalElement_7 = null;

        EObject this_OclTextElement_8 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:124:28: ( (this_FontElement_0= ruleFontElement | this_NewLineElement_1= ruleNewLineElement | this_TextElement_2= ruleTextElement | this_FigElement_3= ruleFigElement | this_FigRefElement_4= ruleFigRefElement | this_NullElement_5= ruleNullElement | this_OclCodeElement_6= ruleOclCodeElement | this_OclEvalElement_7= ruleOclEvalElement | this_OclTextElement_8= ruleOclTextElement ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:125:1: (this_FontElement_0= ruleFontElement | this_NewLineElement_1= ruleNewLineElement | this_TextElement_2= ruleTextElement | this_FigElement_3= ruleFigElement | this_FigRefElement_4= ruleFigRefElement | this_NullElement_5= ruleNullElement | this_OclCodeElement_6= ruleOclCodeElement | this_OclEvalElement_7= ruleOclEvalElement | this_OclTextElement_8= ruleOclTextElement )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:125:1: (this_FontElement_0= ruleFontElement | this_NewLineElement_1= ruleNewLineElement | this_TextElement_2= ruleTextElement | this_FigElement_3= ruleFigElement | this_FigRefElement_4= ruleFigRefElement | this_NullElement_5= ruleNullElement | this_OclCodeElement_6= ruleOclCodeElement | this_OclEvalElement_7= ruleOclEvalElement | this_OclTextElement_8= ruleOclTextElement )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
                {
                alt2=1;
                }
                break;
            case RULE_NL:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
            case RULE_WORD:
            case RULE_WS:
                {
                alt2=3;
                }
                break;
            case 14:
            case 15:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 18:
                {
                alt2=7;
                }
                break;
            case 19:
                {
                alt2=8;
                }
                break;
            case 20:
                {
                alt2=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:126:2: this_FontElement_0= ruleFontElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMarkupElementAccess().getFontElementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFontElement_in_ruleMarkupElement232);
                    this_FontElement_0=ruleFontElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FontElement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:139:2: this_NewLineElement_1= ruleNewLineElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMarkupElementAccess().getNewLineElementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNewLineElement_in_ruleMarkupElement262);
                    this_NewLineElement_1=ruleNewLineElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NewLineElement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:152:2: this_TextElement_2= ruleTextElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMarkupElementAccess().getTextElementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextElement_in_ruleMarkupElement292);
                    this_TextElement_2=ruleTextElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TextElement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:165:2: this_FigElement_3= ruleFigElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMarkupElementAccess().getFigElementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFigElement_in_ruleMarkupElement322);
                    this_FigElement_3=ruleFigElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FigElement_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:178:2: this_FigRefElement_4= ruleFigRefElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMarkupElementAccess().getFigRefElementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFigRefElement_in_ruleMarkupElement352);
                    this_FigRefElement_4=ruleFigRefElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FigRefElement_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:191:2: this_NullElement_5= ruleNullElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMarkupElementAccess().getNullElementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNullElement_in_ruleMarkupElement382);
                    this_NullElement_5=ruleNullElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NullElement_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:204:2: this_OclCodeElement_6= ruleOclCodeElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMarkupElementAccess().getOclCodeElementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOclCodeElement_in_ruleMarkupElement412);
                    this_OclCodeElement_6=ruleOclCodeElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OclCodeElement_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:217:2: this_OclEvalElement_7= ruleOclEvalElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMarkupElementAccess().getOclEvalElementParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOclEvalElement_in_ruleMarkupElement442);
                    this_OclEvalElement_7=ruleOclEvalElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OclEvalElement_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:230:2: this_OclTextElement_8= ruleOclTextElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMarkupElementAccess().getOclTextElementParserRuleCall_8()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOclTextElement_in_ruleMarkupElement472);
                    this_OclTextElement_8=ruleOclTextElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OclTextElement_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMarkupElement"


    // $ANTLR start "entryRuleTextElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:249:1: entryRuleTextElement returns [EObject current=null] : iv_ruleTextElement= ruleTextElement EOF ;
    public final EObject entryRuleTextElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextElement = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:250:2: (iv_ruleTextElement= ruleTextElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:251:2: iv_ruleTextElement= ruleTextElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextElement_in_entryRuleTextElement507);
            iv_ruleTextElement=ruleTextElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextElement517); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextElement"


    // $ANTLR start "ruleTextElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:258:1: ruleTextElement returns [EObject current=null] : ( ( (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS ) ) )+ ;
    public final EObject ruleTextElement() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_1=null;
        Token lv_text_0_2=null;
        Token lv_text_0_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:261:28: ( ( ( (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS ) ) )+ )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:262:1: ( ( (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS ) ) )+
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:262:1: ( ( (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA4_2 = input.LA(2);

                    if ( (synpred12_InternalMarkup()) ) {
                        alt4=1;
                    }


                    }
                    break;
                case RULE_WORD:
                    {
                    int LA4_3 = input.LA(2);

                    if ( (synpred12_InternalMarkup()) ) {
                        alt4=1;
                    }


                    }
                    break;
                case RULE_WS:
                    {
                    int LA4_4 = input.LA(2);

                    if ( (synpred12_InternalMarkup()) ) {
                        alt4=1;
                    }


                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:263:1: ( (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS ) )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:263:1: ( (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS ) )
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:264:1: (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:264:1: (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS )
            	    int alt3=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case RULE_WORD:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt3) {
            	        case 1 :
            	            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:265:3: lv_text_0_1= RULE_ID
            	            {
            	            lv_text_0_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTextElement560); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_text_0_1, grammarAccess.getTextElementAccess().getTextIDTerminalRuleCall_0_0()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getTextElementRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"text",
            	                      		lv_text_0_1, 
            	                      		"ID");
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:280:8: lv_text_0_2= RULE_WORD
            	            {
            	            lv_text_0_2=(Token)match(input,RULE_WORD,FollowSets000.FOLLOW_RULE_WORD_in_ruleTextElement580); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_text_0_2, grammarAccess.getTextElementAccess().getTextWORDTerminalRuleCall_0_1()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getTextElementRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"text",
            	                      		lv_text_0_2, 
            	                      		"WORD");
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:295:8: lv_text_0_3= RULE_WS
            	            {
            	            lv_text_0_3=(Token)match(input,RULE_WS,FollowSets000.FOLLOW_RULE_WS_in_ruleTextElement600); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_text_0_3, grammarAccess.getTextElementAccess().getTextWSTerminalRuleCall_0_2()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getTextElementRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"text",
            	                      		lv_text_0_3, 
            	                      		"WS");
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextElement"


    // $ANTLR start "entryRuleNewLineElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:321:1: entryRuleNewLineElement returns [EObject current=null] : iv_ruleNewLineElement= ruleNewLineElement EOF ;
    public final EObject entryRuleNewLineElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewLineElement = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:322:2: (iv_ruleNewLineElement= ruleNewLineElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:323:2: iv_ruleNewLineElement= ruleNewLineElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewLineElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNewLineElement_in_entryRuleNewLineElement644);
            iv_ruleNewLineElement=ruleNewLineElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNewLineElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNewLineElement654); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNewLineElement"


    // $ANTLR start "ruleNewLineElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:330:1: ruleNewLineElement returns [EObject current=null] : ( (lv_text_0_0= RULE_NL ) ) ;
    public final EObject ruleNewLineElement() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:333:28: ( ( (lv_text_0_0= RULE_NL ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:334:1: ( (lv_text_0_0= RULE_NL ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:334:1: ( (lv_text_0_0= RULE_NL ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:335:1: (lv_text_0_0= RULE_NL )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:335:1: (lv_text_0_0= RULE_NL )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:336:3: lv_text_0_0= RULE_NL
            {
            lv_text_0_0=(Token)match(input,RULE_NL,FollowSets000.FOLLOW_RULE_NL_in_ruleNewLineElement695); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_text_0_0, grammarAccess.getNewLineElementAccess().getTextNLTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNewLineElementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"text",
                      		lv_text_0_0, 
                      		"NL");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNewLineElement"


    // $ANTLR start "entryRuleFontElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:360:1: entryRuleFontElement returns [EObject current=null] : iv_ruleFontElement= ruleFontElement EOF ;
    public final EObject entryRuleFontElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontElement = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:361:2: (iv_ruleFontElement= ruleFontElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:362:2: iv_ruleFontElement= ruleFontElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFontElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFontElement_in_entryRuleFontElement735);
            iv_ruleFontElement=ruleFontElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFontElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFontElement745); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFontElement"


    // $ANTLR start "ruleFontElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:369:1: ruleFontElement returns [EObject current=null] : ( ( ( (lv_font_0_1= 'b[' | lv_font_0_2= 'e[' ) ) ) ( (lv_elements_1_0= ruleMarkupElement ) )* otherlv_2= ']' ) ;
    public final EObject ruleFontElement() throws RecognitionException {
        EObject current = null;

        Token lv_font_0_1=null;
        Token lv_font_0_2=null;
        Token otherlv_2=null;
        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:372:28: ( ( ( ( (lv_font_0_1= 'b[' | lv_font_0_2= 'e[' ) ) ) ( (lv_elements_1_0= ruleMarkupElement ) )* otherlv_2= ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:373:1: ( ( ( (lv_font_0_1= 'b[' | lv_font_0_2= 'e[' ) ) ) ( (lv_elements_1_0= ruleMarkupElement ) )* otherlv_2= ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:373:1: ( ( ( (lv_font_0_1= 'b[' | lv_font_0_2= 'e[' ) ) ) ( (lv_elements_1_0= ruleMarkupElement ) )* otherlv_2= ']' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:373:2: ( ( (lv_font_0_1= 'b[' | lv_font_0_2= 'e[' ) ) ) ( (lv_elements_1_0= ruleMarkupElement ) )* otherlv_2= ']'
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:373:2: ( ( (lv_font_0_1= 'b[' | lv_font_0_2= 'e[' ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:374:1: ( (lv_font_0_1= 'b[' | lv_font_0_2= 'e[' ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:374:1: ( (lv_font_0_1= 'b[' | lv_font_0_2= 'e[' ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:375:1: (lv_font_0_1= 'b[' | lv_font_0_2= 'e[' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:375:1: (lv_font_0_1= 'b[' | lv_font_0_2= 'e[' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:376:3: lv_font_0_1= 'b['
                    {
                    lv_font_0_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleFontElement790); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_font_0_1, grammarAccess.getFontElementAccess().getFontBKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFontElementRule());
                      	        }
                             		setWithLastConsumed(current, "font", lv_font_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:388:8: lv_font_0_2= 'e['
                    {
                    lv_font_0_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFontElement819); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_font_0_2, grammarAccess.getFontElementAccess().getFontEKeyword_0_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFontElementRule());
                      	        }
                             		setWithLastConsumed(current, "font", lv_font_0_2, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:403:2: ( (lv_elements_1_0= ruleMarkupElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_NL)||(LA6_0>=11 && LA6_0<=12)||(LA6_0>=14 && LA6_0<=20)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:404:1: (lv_elements_1_0= ruleMarkupElement )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:404:1: (lv_elements_1_0= ruleMarkupElement )
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:405:3: lv_elements_1_0= ruleMarkupElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFontElementAccess().getElementsMarkupElementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_ruleFontElement856);
            	    lv_elements_1_0=ruleMarkupElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFontElementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_1_0, 
            	              		"MarkupElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFontElement869); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFontElementAccess().getRightSquareBracketKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFontElement"


    // $ANTLR start "entryRuleFigElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:433:1: entryRuleFigElement returns [EObject current=null] : iv_ruleFigElement= ruleFigElement EOF ;
    public final EObject entryRuleFigElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFigElement = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:434:2: (iv_ruleFigElement= ruleFigElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:435:2: iv_ruleFigElement= ruleFigElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFigElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFigElement_in_entryRuleFigElement905);
            iv_ruleFigElement=ruleFigElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFigElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFigElement915); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFigElement"


    // $ANTLR start "ruleFigElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:442:1: ruleFigElement returns [EObject current=null] : ( (otherlv_0= 'fig[' | (otherlv_1= 'fig:' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '[' ) ) ( (lv_src_4_0= RULE_STRING ) ) otherlv_5= ']' ) ;
    public final EObject ruleFigElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token lv_src_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:445:28: ( ( (otherlv_0= 'fig[' | (otherlv_1= 'fig:' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '[' ) ) ( (lv_src_4_0= RULE_STRING ) ) otherlv_5= ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:446:1: ( (otherlv_0= 'fig[' | (otherlv_1= 'fig:' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '[' ) ) ( (lv_src_4_0= RULE_STRING ) ) otherlv_5= ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:446:1: ( (otherlv_0= 'fig[' | (otherlv_1= 'fig:' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '[' ) ) ( (lv_src_4_0= RULE_STRING ) ) otherlv_5= ']' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:446:2: (otherlv_0= 'fig[' | (otherlv_1= 'fig:' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '[' ) ) ( (lv_src_4_0= RULE_STRING ) ) otherlv_5= ']'
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:446:2: (otherlv_0= 'fig[' | (otherlv_1= 'fig:' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '[' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:446:4: otherlv_0= 'fig['
                    {
                    otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFigElement953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getFigElementAccess().getFigKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:451:6: (otherlv_1= 'fig:' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '[' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:451:6: (otherlv_1= 'fig:' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '[' )
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:451:8: otherlv_1= 'fig:' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '['
                    {
                    otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFigElement972); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getFigElementAccess().getFigKeyword_0_1_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:455:1: ( (lv_id_2_0= RULE_ID ) )
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:456:1: (lv_id_2_0= RULE_ID )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:456:1: (lv_id_2_0= RULE_ID )
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:457:3: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFigElement989); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_2_0, grammarAccess.getFigElementAccess().getIdIDTerminalRuleCall_0_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFigElementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"id",
                              		lv_id_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFigElement1006); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFigElementAccess().getLeftSquareBracketKeyword_0_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:477:3: ( (lv_src_4_0= RULE_STRING ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:478:1: (lv_src_4_0= RULE_STRING )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:478:1: (lv_src_4_0= RULE_STRING )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:479:3: lv_src_4_0= RULE_STRING
            {
            lv_src_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFigElement1025); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_src_4_0, grammarAccess.getFigElementAccess().getSrcSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFigElementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"src",
                      		lv_src_4_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFigElement1042); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getFigElementAccess().getRightSquareBracketKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFigElement"


    // $ANTLR start "entryRuleFigRefElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:507:1: entryRuleFigRefElement returns [EObject current=null] : iv_ruleFigRefElement= ruleFigRefElement EOF ;
    public final EObject entryRuleFigRefElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFigRefElement = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:508:2: (iv_ruleFigRefElement= ruleFigRefElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:509:2: iv_ruleFigRefElement= ruleFigRefElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFigRefElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFigRefElement_in_entryRuleFigRefElement1078);
            iv_ruleFigRefElement=ruleFigRefElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFigRefElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFigRefElement1088); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFigRefElement"


    // $ANTLR start "ruleFigRefElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:516:1: ruleFigRefElement returns [EObject current=null] : (otherlv_0= 'fig-[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) ;
    public final EObject ruleFigRefElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:519:28: ( (otherlv_0= 'fig-[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:520:1: (otherlv_0= 'fig-[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:520:1: (otherlv_0= 'fig-[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:520:3: otherlv_0= 'fig-[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFigRefElement1125); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFigRefElementAccess().getFigKeyword_0());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:524:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:525:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:525:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:526:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFigRefElementRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFigRefElement1149); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getFigRefElementAccess().getRefFigElementCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFigRefElement1161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFigRefElementAccess().getRightSquareBracketKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFigRefElement"


    // $ANTLR start "entryRuleNullElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:552:1: entryRuleNullElement returns [EObject current=null] : iv_ruleNullElement= ruleNullElement EOF ;
    public final EObject entryRuleNullElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullElement = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:553:2: (iv_ruleNullElement= ruleNullElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:554:2: iv_ruleNullElement= ruleNullElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNullElement_in_entryRuleNullElement1197);
            iv_ruleNullElement=ruleNullElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNullElement1207); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullElement"


    // $ANTLR start "ruleNullElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:561:1: ruleNullElement returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_elements_2_0= ruleMarkupElement ) )* otherlv_3= ']' ) ;
    public final EObject ruleNullElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:564:28: ( ( () otherlv_1= '[' ( (lv_elements_2_0= ruleMarkupElement ) )* otherlv_3= ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:565:1: ( () otherlv_1= '[' ( (lv_elements_2_0= ruleMarkupElement ) )* otherlv_3= ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:565:1: ( () otherlv_1= '[' ( (lv_elements_2_0= ruleMarkupElement ) )* otherlv_3= ']' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:565:2: () otherlv_1= '[' ( (lv_elements_2_0= ruleMarkupElement ) )* otherlv_3= ']'
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:565:2: ()
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:566:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNullElementAccess().getNullElementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNullElement1256); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNullElementAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:578:1: ( (lv_elements_2_0= ruleMarkupElement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_NL)||(LA8_0>=11 && LA8_0<=12)||(LA8_0>=14 && LA8_0<=20)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:579:1: (lv_elements_2_0= ruleMarkupElement )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:579:1: (lv_elements_2_0= ruleMarkupElement )
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:580:3: lv_elements_2_0= ruleMarkupElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNullElementAccess().getElementsMarkupElementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_ruleNullElement1277);
            	    lv_elements_2_0=ruleMarkupElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNullElementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_2_0, 
            	              		"MarkupElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNullElement1290); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getNullElementAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullElement"


    // $ANTLR start "entryRuleOclCodeElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:608:1: entryRuleOclCodeElement returns [EObject current=null] : iv_ruleOclCodeElement= ruleOclCodeElement EOF ;
    public final EObject entryRuleOclCodeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclCodeElement = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:609:2: (iv_ruleOclCodeElement= ruleOclCodeElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:610:2: iv_ruleOclCodeElement= ruleOclCodeElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOclCodeElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOclCodeElement_in_entryRuleOclCodeElement1326);
            iv_ruleOclCodeElement=ruleOclCodeElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOclCodeElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOclCodeElement1336); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOclCodeElement"


    // $ANTLR start "ruleOclCodeElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:617:1: ruleOclCodeElement returns [EObject current=null] : ( () otherlv_1= 'oclCode[' ( (lv_elements_2_0= ruleMarkupElement ) )* otherlv_3= ']' ) ;
    public final EObject ruleOclCodeElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:620:28: ( ( () otherlv_1= 'oclCode[' ( (lv_elements_2_0= ruleMarkupElement ) )* otherlv_3= ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:621:1: ( () otherlv_1= 'oclCode[' ( (lv_elements_2_0= ruleMarkupElement ) )* otherlv_3= ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:621:1: ( () otherlv_1= 'oclCode[' ( (lv_elements_2_0= ruleMarkupElement ) )* otherlv_3= ']' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:621:2: () otherlv_1= 'oclCode[' ( (lv_elements_2_0= ruleMarkupElement ) )* otherlv_3= ']'
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:621:2: ()
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:622:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOclCodeElementAccess().getOclCodeElementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOclCodeElement1385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOclCodeElementAccess().getOclCodeKeyword_1());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:634:1: ( (lv_elements_2_0= ruleMarkupElement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_NL)||(LA9_0>=11 && LA9_0<=12)||(LA9_0>=14 && LA9_0<=20)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:635:1: (lv_elements_2_0= ruleMarkupElement )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:635:1: (lv_elements_2_0= ruleMarkupElement )
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:636:3: lv_elements_2_0= ruleMarkupElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOclCodeElementAccess().getElementsMarkupElementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_ruleOclCodeElement1406);
            	    lv_elements_2_0=ruleMarkupElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOclCodeElementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_2_0, 
            	              		"MarkupElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleOclCodeElement1419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOclCodeElementAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOclCodeElement"


    // $ANTLR start "entryRuleOclEvalElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:664:1: entryRuleOclEvalElement returns [EObject current=null] : iv_ruleOclEvalElement= ruleOclEvalElement EOF ;
    public final EObject entryRuleOclEvalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclEvalElement = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:665:2: (iv_ruleOclEvalElement= ruleOclEvalElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:666:2: iv_ruleOclEvalElement= ruleOclEvalElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOclEvalElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOclEvalElement_in_entryRuleOclEvalElement1455);
            iv_ruleOclEvalElement=ruleOclEvalElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOclEvalElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOclEvalElement1465); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOclEvalElement"


    // $ANTLR start "ruleOclEvalElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:673:1: ruleOclEvalElement returns [EObject current=null] : ( () otherlv_1= 'oclEval[' ( (lv_elements_2_0= ruleMarkupElement ) )* otherlv_3= ']' ) ;
    public final EObject ruleOclEvalElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:676:28: ( ( () otherlv_1= 'oclEval[' ( (lv_elements_2_0= ruleMarkupElement ) )* otherlv_3= ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:677:1: ( () otherlv_1= 'oclEval[' ( (lv_elements_2_0= ruleMarkupElement ) )* otherlv_3= ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:677:1: ( () otherlv_1= 'oclEval[' ( (lv_elements_2_0= ruleMarkupElement ) )* otherlv_3= ']' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:677:2: () otherlv_1= 'oclEval[' ( (lv_elements_2_0= ruleMarkupElement ) )* otherlv_3= ']'
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:677:2: ()
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:678:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOclEvalElementAccess().getOclEvalElementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOclEvalElement1514); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOclEvalElementAccess().getOclEvalKeyword_1());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:690:1: ( (lv_elements_2_0= ruleMarkupElement ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_NL)||(LA10_0>=11 && LA10_0<=12)||(LA10_0>=14 && LA10_0<=20)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:691:1: (lv_elements_2_0= ruleMarkupElement )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:691:1: (lv_elements_2_0= ruleMarkupElement )
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:692:3: lv_elements_2_0= ruleMarkupElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOclEvalElementAccess().getElementsMarkupElementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_ruleOclEvalElement1535);
            	    lv_elements_2_0=ruleMarkupElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOclEvalElementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_2_0, 
            	              		"MarkupElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleOclEvalElement1548); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOclEvalElementAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOclEvalElement"


    // $ANTLR start "entryRuleOclTextElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:720:1: entryRuleOclTextElement returns [EObject current=null] : iv_ruleOclTextElement= ruleOclTextElement EOF ;
    public final EObject entryRuleOclTextElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclTextElement = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:721:2: (iv_ruleOclTextElement= ruleOclTextElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:722:2: iv_ruleOclTextElement= ruleOclTextElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOclTextElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOclTextElement_in_entryRuleOclTextElement1584);
            iv_ruleOclTextElement=ruleOclTextElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOclTextElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOclTextElement1594); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOclTextElement"


    // $ANTLR start "ruleOclTextElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:729:1: ruleOclTextElement returns [EObject current=null] : ( () otherlv_1= 'oclText[' ( (lv_elements_2_0= ruleMarkupElement ) )* otherlv_3= ']' ) ;
    public final EObject ruleOclTextElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:732:28: ( ( () otherlv_1= 'oclText[' ( (lv_elements_2_0= ruleMarkupElement ) )* otherlv_3= ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:733:1: ( () otherlv_1= 'oclText[' ( (lv_elements_2_0= ruleMarkupElement ) )* otherlv_3= ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:733:1: ( () otherlv_1= 'oclText[' ( (lv_elements_2_0= ruleMarkupElement ) )* otherlv_3= ']' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:733:2: () otherlv_1= 'oclText[' ( (lv_elements_2_0= ruleMarkupElement ) )* otherlv_3= ']'
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:733:2: ()
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:734:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOclTextElementAccess().getOclTextElementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleOclTextElement1643); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOclTextElementAccess().getOclTextKeyword_1());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:746:1: ( (lv_elements_2_0= ruleMarkupElement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_NL)||(LA11_0>=11 && LA11_0<=12)||(LA11_0>=14 && LA11_0<=20)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:747:1: (lv_elements_2_0= ruleMarkupElement )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:747:1: (lv_elements_2_0= ruleMarkupElement )
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:748:3: lv_elements_2_0= ruleMarkupElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOclTextElementAccess().getElementsMarkupElementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_ruleOclTextElement1664);
            	    lv_elements_2_0=ruleMarkupElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOclTextElementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_2_0, 
            	              		"MarkupElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleOclTextElement1677); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOclTextElementAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOclTextElement"

    // $ANTLR start synpred12_InternalMarkup
    public final void synpred12_InternalMarkup_fragment() throws RecognitionException {   
        Token lv_text_0_1=null;
        Token lv_text_0_2=null;
        Token lv_text_0_3=null;

        // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:263:1: ( ( (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS ) ) )
        // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:263:1: ( (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS ) )
        {
        // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:263:1: ( (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS ) )
        // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:264:1: (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS )
        {
        // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:264:1: (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS )
        int alt12=3;
        switch ( input.LA(1) ) {
        case RULE_ID:
            {
            alt12=1;
            }
            break;
        case RULE_WORD:
            {
            alt12=2;
            }
            break;
        case RULE_WS:
            {
            alt12=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 12, 0, input);

            throw nvae;
        }

        switch (alt12) {
            case 1 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:265:3: lv_text_0_1= RULE_ID
                {
                lv_text_0_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_synpred12_InternalMarkup560); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:280:8: lv_text_0_2= RULE_WORD
                {
                lv_text_0_2=(Token)match(input,RULE_WORD,FollowSets000.FOLLOW_RULE_WORD_in_synpred12_InternalMarkup580); if (state.failed) return ;

                }
                break;
            case 3 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:295:8: lv_text_0_3= RULE_WS
                {
                lv_text_0_3=(Token)match(input,RULE_WS,FollowSets000.FOLLOW_RULE_WS_in_synpred12_InternalMarkup600); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalMarkup

    // Delegated rules

    public final boolean synpred12_InternalMarkup() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalMarkup_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_ruleMarkup_in_entryRuleMarkup81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMarkup91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_ruleMarkup136 = new BitSet(new long[]{0x00000000001FD8F2L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_entryRuleMarkupElement172 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMarkupElement182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFontElement_in_ruleMarkupElement232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNewLineElement_in_ruleMarkupElement262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextElement_in_ruleMarkupElement292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFigElement_in_ruleMarkupElement322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFigRefElement_in_ruleMarkupElement352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullElement_in_ruleMarkupElement382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOclCodeElement_in_ruleMarkupElement412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOclEvalElement_in_ruleMarkupElement442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOclTextElement_in_ruleMarkupElement472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextElement_in_entryRuleTextElement507 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextElement517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTextElement560 = new BitSet(new long[]{0x0000000000000072L});
        public static final BitSet FOLLOW_RULE_WORD_in_ruleTextElement580 = new BitSet(new long[]{0x0000000000000072L});
        public static final BitSet FOLLOW_RULE_WS_in_ruleTextElement600 = new BitSet(new long[]{0x0000000000000072L});
        public static final BitSet FOLLOW_ruleNewLineElement_in_entryRuleNewLineElement644 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNewLineElement654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NL_in_ruleNewLineElement695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFontElement_in_entryRuleFontElement735 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFontElement745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleFontElement790 = new BitSet(new long[]{0x00000000001FF8F0L});
        public static final BitSet FOLLOW_12_in_ruleFontElement819 = new BitSet(new long[]{0x00000000001FF8F0L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_ruleFontElement856 = new BitSet(new long[]{0x00000000001FF8F0L});
        public static final BitSet FOLLOW_13_in_ruleFontElement869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFigElement_in_entryRuleFigElement905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFigElement915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleFigElement953 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_15_in_ruleFigElement972 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFigElement989 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFigElement1006 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFigElement1025 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleFigElement1042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFigRefElement_in_entryRuleFigRefElement1078 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFigRefElement1088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleFigRefElement1125 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFigRefElement1149 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleFigRefElement1161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullElement_in_entryRuleNullElement1197 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNullElement1207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleNullElement1256 = new BitSet(new long[]{0x00000000001FF8F0L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_ruleNullElement1277 = new BitSet(new long[]{0x00000000001FF8F0L});
        public static final BitSet FOLLOW_13_in_ruleNullElement1290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOclCodeElement_in_entryRuleOclCodeElement1326 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOclCodeElement1336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleOclCodeElement1385 = new BitSet(new long[]{0x00000000001FF8F0L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_ruleOclCodeElement1406 = new BitSet(new long[]{0x00000000001FF8F0L});
        public static final BitSet FOLLOW_13_in_ruleOclCodeElement1419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOclEvalElement_in_entryRuleOclEvalElement1455 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOclEvalElement1465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleOclEvalElement1514 = new BitSet(new long[]{0x00000000001FF8F0L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_ruleOclEvalElement1535 = new BitSet(new long[]{0x00000000001FF8F0L});
        public static final BitSet FOLLOW_13_in_ruleOclEvalElement1548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOclTextElement_in_entryRuleOclTextElement1584 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOclTextElement1594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleOclTextElement1643 = new BitSet(new long[]{0x00000000001FF8F0L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_ruleOclTextElement1664 = new BitSet(new long[]{0x00000000001FF8F0L});
        public static final BitSet FOLLOW_13_in_ruleOclTextElement1677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_synpred12_InternalMarkup560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_WORD_in_synpred12_InternalMarkup580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_WS_in_synpred12_InternalMarkup600 = new BitSet(new long[]{0x0000000000000002L});
    }


}