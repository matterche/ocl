package org.eclipse.ocl.examples.xtext.essentialocl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.ocl.examples.xtext.essentialocl.services.EssentialOCLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEssentialOCLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SIMPLE_ID", "RULE_ESCAPED_ID", "RULE_INT", "RULE_SINGLE_QUOTED_STRING", "RULE_ESCAPED_CHARACTER", "RULE_LETTER_CHARACTER", "RULE_DIGIT_CHARACTER", "RULE_DOUBLE_QUOTED_STRING", "RULE_ML_SINGLE_QUOTED_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'.'", "'e'", "'E'", "'+'", "'-'", "'not'", "'/'", "'>'", "'<'", "'>='", "'<='", "'='", "'<>'", "'and'", "'or'", "'xor'", "'implies'", "'->'", "'Tuple'", "'::'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "'('", "')'", "'..'", "'['", "']'", "'?'", "','", "':'", "'{'", "'}'", "'true'", "'false'", "'invalid'", "'null'", "'@'", "'pre'", "'|'", "';'", "'if'", "'then'", "'else'", "'endif'", "'let'", "'in'", "'self'"
    };
    public static final int T__42=42;
    public static final int T__28=28;
    public static final int T__57=57;
    public static final int T__23=23;
    public static final int RULE_DIGIT_CHARACTER=10;
    public static final int T__51=51;
    public static final int RULE_LETTER_CHARACTER=9;
    public static final int T__69=69;
    public static final int T__47=47;
    public static final int T__73=73;
    public static final int T__50=50;
    public static final int T__21=21;
    public static final int RULE_ML_SINGLE_QUOTED_STRING=12;
    public static final int T__65=65;
    public static final int T__19=19;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__67=67;
    public static final int T__74=74;
    public static final int T__39=39;
    public static final int T__30=30;
    public static final int T__46=46;
    public static final int T__52=52;
    public static final int T__68=68;
    public static final int T__17=17;
    public static final int T__62=62;
    public static final int RULE_INT=6;
    public static final int T__27=27;
    public static final int T__24=24;
    public static final int T__49=49;
    public static final int RULE_SINGLE_QUOTED_STRING=7;
    public static final int T__61=61;
    public static final int RULE_DOUBLE_QUOTED_STRING=11;
    public static final int T__59=59;
    public static final int T__48=48;
    public static final int T__54=54;
    public static final int T__34=34;
    public static final int T__56=56;
    public static final int RULE_ESCAPED_CHARACTER=8;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__20=20;
    public static final int T__58=58;
    public static final int T__64=64;
    public static final int RULE_SIMPLE_ID=4;
    public static final int T__44=44;
    public static final int T__66=66;
    public static final int T__33=33;
    public static final int T__22=22;
    public static final int T__29=29;
    public static final int T__45=45;
    public static final int T__55=55;
    public static final int RULE_ESCAPED_ID=5;
    public static final int RULE_WS=15;
    public static final int T__63=63;
    public static final int T__75=75;
    public static final int T__43=43;
    public static final int T__31=31;
    public static final int T__40=40;
    public static final int EOF=-1;
    public static final int T__53=53;
    public static final int T__32=32;
    public static final int T__38=38;
    public static final int T__37=37;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__60=60;
    public static final int T__41=41;
    public static final int T__71=71;
    public static final int T__18=18;

    // delegates
    // delegators


        public InternalEssentialOCLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEssentialOCLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEssentialOCLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private EssentialOCLGrammarAccess grammarAccess;
     	
        public InternalEssentialOCLParser(TokenStream input, EssentialOCLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected EssentialOCLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:73:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:74:2: (iv_ruleModel= ruleModel EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:75:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel81);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:82:1: ruleModel returns [EObject current=null] : ( (lv_ownedExpression_0_0= ruleExpCS ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedExpression_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:85:28: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:86:1: ( (lv_ownedExpression_0_0= ruleExpCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:86:1: ( (lv_ownedExpression_0_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:87:1: (lv_ownedExpression_0_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:87:1: (lv_ownedExpression_0_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:88:3: lv_ownedExpression_0_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getOwnedExpressionExpCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleModel136);
            lv_ownedExpression_0_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"ownedExpression",
                      		lv_ownedExpression_0_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleID"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:112:1: entryRuleID returns [String current=null] : iv_ruleID= ruleID EOF ;
    public final String entryRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:113:2: (iv_ruleID= ruleID EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:114:2: iv_ruleID= ruleID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_entryRuleID172);
            iv_ruleID=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID183); if (state.failed) return current;

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
    // $ANTLR end "entryRuleID"


    // $ANTLR start "ruleID"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:121:1: ruleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) ;
    public final AntlrDatatypeRuleToken ruleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIMPLE_ID_0=null;
        Token this_ESCAPED_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:124:28: ( (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:125:1: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:125:1: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_SIMPLE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ESCAPED_ID) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:125:6: this_SIMPLE_ID_0= RULE_SIMPLE_ID
                    {
                    this_SIMPLE_ID_0=(Token)match(input,RULE_SIMPLE_ID,FollowSets000.FOLLOW_RULE_SIMPLE_ID_in_ruleID223); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SIMPLE_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SIMPLE_ID_0, grammarAccess.getIDAccess().getSIMPLE_IDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:133:10: this_ESCAPED_ID_1= RULE_ESCAPED_ID
                    {
                    this_ESCAPED_ID_1=(Token)match(input,RULE_ESCAPED_ID,FollowSets000.FOLLOW_RULE_ESCAPED_ID_in_ruleID249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ESCAPED_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ESCAPED_ID_1, grammarAccess.getIDAccess().getESCAPED_IDTerminalRuleCall_1()); 
                          
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
    // $ANTLR end "ruleID"


    // $ANTLR start "entryRuleLOWER"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:148:1: entryRuleLOWER returns [String current=null] : iv_ruleLOWER= ruleLOWER EOF ;
    public final String entryRuleLOWER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOWER = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:149:2: (iv_ruleLOWER= ruleLOWER EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:150:2: iv_ruleLOWER= ruleLOWER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLOWERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLOWER_in_entryRuleLOWER295);
            iv_ruleLOWER=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLOWER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLOWER306); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLOWER"


    // $ANTLR start "ruleLOWER"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:157:1: ruleLOWER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLOWER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:160:28: (this_INT_0= RULE_INT )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:161:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleLOWER345); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getLOWERAccess().getINTTerminalRuleCall()); 
                  
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
    // $ANTLR end "ruleLOWER"


    // $ANTLR start "entryRuleUPPER"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:176:1: entryRuleUPPER returns [String current=null] : iv_ruleUPPER= ruleUPPER EOF ;
    public final String entryRuleUPPER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUPPER = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:177:2: (iv_ruleUPPER= ruleUPPER EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:178:2: iv_ruleUPPER= ruleUPPER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUPPERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUPPER_in_entryRuleUPPER390);
            iv_ruleUPPER=ruleUPPER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUPPER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUPPER401); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUPPER"


    // $ANTLR start "ruleUPPER"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:185:1: ruleUPPER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUPPER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:188:28: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:189:1: (this_INT_0= RULE_INT | kw= '*' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:189:1: (this_INT_0= RULE_INT | kw= '*' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:189:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleUPPER441); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getUPPERAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:198:2: kw= '*'
                    {
                    kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleUPPER465); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getUPPERAccess().getAsteriskKeyword_1()); 
                          
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
    // $ANTLR end "ruleUPPER"


    // $ANTLR start "entryRuleNUMBER_LITERAL"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:211:1: entryRuleNUMBER_LITERAL returns [String current=null] : iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF ;
    public final String entryRuleNUMBER_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER_LITERAL = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:212:2: (iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:213:2: iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBER_LITERALRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL506);
            iv_ruleNUMBER_LITERAL=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER_LITERAL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNUMBER_LITERAL517); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNUMBER_LITERAL"


    // $ANTLR start "ruleNUMBER_LITERAL"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:220:1: ruleNUMBER_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:223:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:224:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:224:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:224:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL557); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getNUMBER_LITERALAccess().getINTTerminalRuleCall_0()); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:231:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_INT) ) {
                    int LA3_3 = input.LA(3);

                    if ( (synpred3_InternalEssentialOCL()) ) {
                        alt3=1;
                    }
                }
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:232:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleNUMBER_LITERAL576); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNUMBER_LITERALAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_2, grammarAccess.getNUMBER_LITERALAccess().getINTTerminalRuleCall_1_1()); 
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:244:3: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=19 && LA6_0<=20)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:244:4: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:244:4: (kw= 'e' | kw= 'E' )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==19) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==20) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:245:2: kw= 'e'
                            {
                            kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNUMBER_LITERAL613); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNUMBER_LITERALAccess().getEKeyword_2_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:252:2: kw= 'E'
                            {
                            kw=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNUMBER_LITERAL632); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNUMBER_LITERALAccess().getEKeyword_2_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:257:2: (kw= '+' | kw= '-' )?
                    int alt5=3;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==21) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==22) ) {
                        alt5=2;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:258:2: kw= '+'
                            {
                            kw=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleNUMBER_LITERAL647); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNUMBER_LITERALAccess().getPlusSignKeyword_2_1_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:265:2: kw= '-'
                            {
                            kw=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleNUMBER_LITERAL666); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNUMBER_LITERALAccess().getHyphenMinusKeyword_2_1_1()); 
                                  
                            }

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL683); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_7, grammarAccess.getNUMBER_LITERALAccess().getINTTerminalRuleCall_2_2()); 
                          
                    }

                    }
                    break;

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
    // $ANTLR end "ruleNUMBER_LITERAL"


    // $ANTLR start "entryRuleEssentialOCLUnrestrictedIdentifier"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:289:1: entryRuleEssentialOCLUnrestrictedIdentifier returns [String current=null] : iv_ruleEssentialOCLUnrestrictedIdentifier= ruleEssentialOCLUnrestrictedIdentifier EOF ;
    public final String entryRuleEssentialOCLUnrestrictedIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedIdentifier = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:290:2: (iv_ruleEssentialOCLUnrestrictedIdentifier= ruleEssentialOCLUnrestrictedIdentifier EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:291:2: iv_ruleEssentialOCLUnrestrictedIdentifier= ruleEssentialOCLUnrestrictedIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedIdentifier_in_entryRuleEssentialOCLUnrestrictedIdentifier735);
            iv_ruleEssentialOCLUnrestrictedIdentifier=ruleEssentialOCLUnrestrictedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnrestrictedIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedIdentifier746); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLUnrestrictedIdentifier"


    // $ANTLR start "ruleEssentialOCLUnrestrictedIdentifier"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:298:1: ruleEssentialOCLUnrestrictedIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'e' | kw= 'E' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:301:28: ( (kw= 'e' | kw= 'E' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:302:1: (kw= 'e' | kw= 'E' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:302:1: (kw= 'e' | kw= 'E' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
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
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:303:2: kw= 'e'
                    {
                    kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEssentialOCLUnrestrictedIdentifier784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLUnrestrictedIdentifierAccess().getEKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:310:2: kw= 'E'
                    {
                    kw=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEssentialOCLUnrestrictedIdentifier803); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLUnrestrictedIdentifierAccess().getEKeyword_1()); 
                          
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
    // $ANTLR end "ruleEssentialOCLUnrestrictedIdentifier"


    // $ANTLR start "entryRuleEssentialOCLPrefixOperator"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:323:1: entryRuleEssentialOCLPrefixOperator returns [String current=null] : iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF ;
    public final String entryRuleEssentialOCLPrefixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLPrefixOperator = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:324:2: (iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:325:2: iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLPrefixOperatorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLPrefixOperator_in_entryRuleEssentialOCLPrefixOperator844);
            iv_ruleEssentialOCLPrefixOperator=ruleEssentialOCLPrefixOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLPrefixOperator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLPrefixOperator855); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLPrefixOperator"


    // $ANTLR start "ruleEssentialOCLPrefixOperator"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:332:1: ruleEssentialOCLPrefixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLPrefixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:335:28: ( (kw= '-' | kw= 'not' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:336:1: (kw= '-' | kw= 'not' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:336:1: (kw= '-' | kw= 'not' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:337:2: kw= '-'
                    {
                    kw=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEssentialOCLPrefixOperator893); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLPrefixOperatorAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:344:2: kw= 'not'
                    {
                    kw=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEssentialOCLPrefixOperator912); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLPrefixOperatorAccess().getNotKeyword_1()); 
                          
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
    // $ANTLR end "ruleEssentialOCLPrefixOperator"


    // $ANTLR start "entryRuleEssentialOCLInfixOperator"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:357:1: entryRuleEssentialOCLInfixOperator returns [String current=null] : iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF ;
    public final String entryRuleEssentialOCLInfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLInfixOperator = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:358:2: (iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:359:2: iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLInfixOperatorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLInfixOperator_in_entryRuleEssentialOCLInfixOperator953);
            iv_ruleEssentialOCLInfixOperator=ruleEssentialOCLInfixOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLInfixOperator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLInfixOperator964); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLInfixOperator"


    // $ANTLR start "ruleEssentialOCLInfixOperator"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:366:1: ruleEssentialOCLInfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLInfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:369:28: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:370:1: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:370:1: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            int alt9=14;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            case 25:
                {
                alt9=5;
                }
                break;
            case 26:
                {
                alt9=6;
                }
                break;
            case 27:
                {
                alt9=7;
                }
                break;
            case 28:
                {
                alt9=8;
                }
                break;
            case 29:
                {
                alt9=9;
                }
                break;
            case 30:
                {
                alt9=10;
                }
                break;
            case 31:
                {
                alt9=11;
                }
                break;
            case 32:
                {
                alt9=12;
                }
                break;
            case 33:
                {
                alt9=13;
                }
                break;
            case 34:
                {
                alt9=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:371:2: kw= '*'
                    {
                    kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEssentialOCLInfixOperator1002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:378:2: kw= '/'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEssentialOCLInfixOperator1021); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getSolidusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:385:2: kw= '+'
                    {
                    kw=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEssentialOCLInfixOperator1040); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:392:2: kw= '-'
                    {
                    kw=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEssentialOCLInfixOperator1059); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getHyphenMinusKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:399:2: kw= '>'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEssentialOCLInfixOperator1078); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:406:2: kw= '<'
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEssentialOCLInfixOperator1097); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:413:2: kw= '>='
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEssentialOCLInfixOperator1116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignEqualsSignKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:420:2: kw= '<='
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEssentialOCLInfixOperator1135); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignEqualsSignKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:427:2: kw= '='
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEssentialOCLInfixOperator1154); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getEqualsSignKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:434:2: kw= '<>'
                    {
                    kw=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEssentialOCLInfixOperator1173); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignGreaterThanSignKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:441:2: kw= 'and'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleEssentialOCLInfixOperator1192); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getAndKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:448:2: kw= 'or'
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEssentialOCLInfixOperator1211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getOrKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:455:2: kw= 'xor'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEssentialOCLInfixOperator1230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getXorKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:462:2: kw= 'implies'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEssentialOCLInfixOperator1249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getImpliesKeyword_13()); 
                          
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
    // $ANTLR end "ruleEssentialOCLInfixOperator"


    // $ANTLR start "entryRuleEssentialOCLNavigationOperator"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:475:1: entryRuleEssentialOCLNavigationOperator returns [String current=null] : iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF ;
    public final String entryRuleEssentialOCLNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLNavigationOperator = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:476:2: (iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:477:2: iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLNavigationOperatorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLNavigationOperator_in_entryRuleEssentialOCLNavigationOperator1290);
            iv_ruleEssentialOCLNavigationOperator=ruleEssentialOCLNavigationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLNavigationOperator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLNavigationOperator1301); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLNavigationOperator"


    // $ANTLR start "ruleEssentialOCLNavigationOperator"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:484:1: ruleEssentialOCLNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:487:28: ( (kw= '.' | kw= '->' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:488:1: (kw= '.' | kw= '->' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:488:1: (kw= '.' | kw= '->' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==35) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:489:2: kw= '.'
                    {
                    kw=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEssentialOCLNavigationOperator1339); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorAccess().getFullStopKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:496:2: kw= '->'
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEssentialOCLNavigationOperator1358); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
                          
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
    // $ANTLR end "ruleEssentialOCLNavigationOperator"


    // $ANTLR start "entryRuleIdentifier"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:509:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:510:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:511:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier1399);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier1410); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:518:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= ruleID | this_EssentialOCLUnrestrictedIdentifier_1= ruleEssentialOCLUnrestrictedIdentifier ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ID_0 = null;

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedIdentifier_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:521:28: ( (this_ID_0= ruleID | this_EssentialOCLUnrestrictedIdentifier_1= ruleEssentialOCLUnrestrictedIdentifier ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:522:1: (this_ID_0= ruleID | this_EssentialOCLUnrestrictedIdentifier_1= ruleEssentialOCLUnrestrictedIdentifier )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:522:1: (this_ID_0= ruleID | this_EssentialOCLUnrestrictedIdentifier_1= ruleEssentialOCLUnrestrictedIdentifier )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_SIMPLE_ID && LA11_0<=RULE_ESCAPED_ID)) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=19 && LA11_0<=20)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:523:5: this_ID_0= ruleID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdentifierAccess().getIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleIdentifier1457);
                    this_ID_0=ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:535:5: this_EssentialOCLUnrestrictedIdentifier_1= ruleEssentialOCLUnrestrictedIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdentifierAccess().getEssentialOCLUnrestrictedIdentifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedIdentifier_in_ruleIdentifier1490);
                    this_EssentialOCLUnrestrictedIdentifier_1=ruleEssentialOCLUnrestrictedIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EssentialOCLUnrestrictedIdentifier_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:553:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:554:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:555:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1536);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteral1547); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:562:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:565:28: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:566:5: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleStringLiteral1586); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SINGLE_QUOTED_STRING_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SINGLE_QUOTED_STRING_0, grammarAccess.getStringLiteralAccess().getSINGLE_QUOTED_STRINGTerminalRuleCall()); 
                  
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRulePrefixOperator"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:581:1: entryRulePrefixOperator returns [String current=null] : iv_rulePrefixOperator= rulePrefixOperator EOF ;
    public final String entryRulePrefixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefixOperator = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:582:2: (iv_rulePrefixOperator= rulePrefixOperator EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:583:2: iv_rulePrefixOperator= rulePrefixOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixOperatorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixOperator_in_entryRulePrefixOperator1631);
            iv_rulePrefixOperator=rulePrefixOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixOperator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrefixOperator1642); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrefixOperator"


    // $ANTLR start "rulePrefixOperator"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:590:1: rulePrefixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator ;
    public final AntlrDatatypeRuleToken rulePrefixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLPrefixOperator_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:593:28: (this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:595:5: this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPrefixOperatorAccess().getEssentialOCLPrefixOperatorParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLPrefixOperator_in_rulePrefixOperator1688);
            this_EssentialOCLPrefixOperator_0=ruleEssentialOCLPrefixOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLPrefixOperator_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "rulePrefixOperator"


    // $ANTLR start "entryRuleInfixOperator"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:613:1: entryRuleInfixOperator returns [String current=null] : iv_ruleInfixOperator= ruleInfixOperator EOF ;
    public final String entryRuleInfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixOperator = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:614:2: (iv_ruleInfixOperator= ruleInfixOperator EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:615:2: iv_ruleInfixOperator= ruleInfixOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixOperatorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixOperator_in_entryRuleInfixOperator1733);
            iv_ruleInfixOperator=ruleInfixOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixOperator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfixOperator1744); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInfixOperator"


    // $ANTLR start "ruleInfixOperator"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:622:1: ruleInfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator ;
    public final AntlrDatatypeRuleToken ruleInfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLInfixOperator_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:625:28: (this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:627:5: this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInfixOperatorAccess().getEssentialOCLInfixOperatorParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLInfixOperator_in_ruleInfixOperator1790);
            this_EssentialOCLInfixOperator_0=ruleEssentialOCLInfixOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLInfixOperator_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleInfixOperator"


    // $ANTLR start "entryRuleNavigationOperator"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:645:1: entryRuleNavigationOperator returns [String current=null] : iv_ruleNavigationOperator= ruleNavigationOperator EOF ;
    public final String entryRuleNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperator = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:646:2: (iv_ruleNavigationOperator= ruleNavigationOperator EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:647:2: iv_ruleNavigationOperator= ruleNavigationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationOperatorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigationOperator_in_entryRuleNavigationOperator1835);
            iv_ruleNavigationOperator=ruleNavigationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationOperator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigationOperator1846); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigationOperator"


    // $ANTLR start "ruleNavigationOperator"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:654:1: ruleNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator ;
    public final AntlrDatatypeRuleToken ruleNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLNavigationOperator_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:657:28: (this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:659:5: this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNavigationOperatorAccess().getEssentialOCLNavigationOperatorParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLNavigationOperator_in_ruleNavigationOperator1892);
            this_EssentialOCLNavigationOperator_0=ruleEssentialOCLNavigationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLNavigationOperator_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleNavigationOperator"


    // $ANTLR start "entryRuleEssentialOCLUnrestrictedName"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:677:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:678:2: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:679:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_entryRuleEssentialOCLUnrestrictedName1937);
            iv_ruleEssentialOCLUnrestrictedName=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedName1948); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLUnrestrictedName"


    // $ANTLR start "ruleEssentialOCLUnrestrictedName"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:686:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:689:28: (this_Identifier_0= ruleIdentifier )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:691:5: this_Identifier_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameAccess().getIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleEssentialOCLUnrestrictedName1994);
            this_Identifier_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Identifier_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleEssentialOCLUnrestrictedName"


    // $ANTLR start "entryRuleUnrestrictedName"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:709:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:710:2: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:711:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_entryRuleUnrestrictedName2039);
            iv_ruleUnrestrictedName=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnrestrictedName2050); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnrestrictedName"


    // $ANTLR start "ruleUnrestrictedName"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:718:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:721:28: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:723:5: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnrestrictedNameAccess().getEssentialOCLUnrestrictedNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_ruleUnrestrictedName2096);
            this_EssentialOCLUnrestrictedName_0=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLUnrestrictedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleUnrestrictedName"


    // $ANTLR start "entryRuleEssentialOCLUnreservedName"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:741:1: entryRuleEssentialOCLUnreservedName returns [String current=null] : iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF ;
    public final String entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnreservedName = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:742:2: (iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:743:2: iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnreservedName_in_entryRuleEssentialOCLUnreservedName2141);
            iv_ruleEssentialOCLUnreservedName=ruleEssentialOCLUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnreservedName2152); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLUnreservedName"


    // $ANTLR start "ruleEssentialOCLUnreservedName"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:750:1: ruleEssentialOCLUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_CollectionTypeIdentifier_1 = null;

        AntlrDatatypeRuleToken this_PrimitiveTypeIdentifier_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:753:28: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:754:1: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:754:1: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
            case RULE_ESCAPED_ID:
            case 19:
            case 20:
                {
                alt12=1;
                }
                break;
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                {
                alt12=2;
                }
                break;
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
                {
                alt12=3;
                }
                break;
            case 36:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:755:5: this_UnrestrictedName_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getUnrestrictedNameParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleEssentialOCLUnreservedName2199);
                    this_UnrestrictedName_0=ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_UnrestrictedName_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:767:5: this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getCollectionTypeIdentifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_ruleEssentialOCLUnreservedName2232);
                    this_CollectionTypeIdentifier_1=ruleCollectionTypeIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CollectionTypeIdentifier_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:779:5: this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getPrimitiveTypeIdentifierParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_ruleEssentialOCLUnreservedName2265);
                    this_PrimitiveTypeIdentifier_2=rulePrimitiveTypeIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PrimitiveTypeIdentifier_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:791:2: kw= 'Tuple'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEssentialOCLUnreservedName2289); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLUnreservedNameAccess().getTupleKeyword_3()); 
                          
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
    // $ANTLR end "ruleEssentialOCLUnreservedName"


    // $ANTLR start "entryRuleUnreservedName"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:804:1: entryRuleUnreservedName returns [String current=null] : iv_ruleUnreservedName= ruleUnreservedName EOF ;
    public final String entryRuleUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnreservedName = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:805:2: (iv_ruleUnreservedName= ruleUnreservedName EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:806:2: iv_ruleUnreservedName= ruleUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_entryRuleUnreservedName2330);
            iv_ruleUnreservedName=ruleUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnreservedName2341); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnreservedName"


    // $ANTLR start "ruleUnreservedName"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:813:1: ruleUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName ;
    public final AntlrDatatypeRuleToken ruleUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnreservedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:816:28: (this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:818:5: this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnreservedNameAccess().getEssentialOCLUnreservedNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnreservedName_in_ruleUnreservedName2387);
            this_EssentialOCLUnreservedName_0=ruleEssentialOCLUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLUnreservedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleUnreservedName"


    // $ANTLR start "entryRulePathNameCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:836:1: entryRulePathNameCS returns [EObject current=null] : iv_rulePathNameCS= rulePathNameCS EOF ;
    public final EObject entryRulePathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathNameCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:837:2: (iv_rulePathNameCS= rulePathNameCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:838:2: iv_rulePathNameCS= rulePathNameCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathNameCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_entryRulePathNameCS2431);
            iv_rulePathNameCS=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePathNameCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePathNameCS2441); if (state.failed) return current;

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
    // $ANTLR end "entryRulePathNameCS"


    // $ANTLR start "rulePathNameCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:845:1: rulePathNameCS returns [EObject current=null] : ( ( (lv_path_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )* ) ;
    public final EObject rulePathNameCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_path_0_0 = null;

        EObject lv_path_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:848:28: ( ( ( (lv_path_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )* ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:849:1: ( ( (lv_path_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )* )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:849:1: ( ( (lv_path_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )* )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:849:2: ( (lv_path_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )*
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:849:2: ( (lv_path_0_0= ruleFirstPathElementCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:850:1: (lv_path_0_0= ruleFirstPathElementCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:850:1: (lv_path_0_0= ruleFirstPathElementCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:851:3: lv_path_0_0= ruleFirstPathElementCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPathNameCSAccess().getPathFirstPathElementCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFirstPathElementCS_in_rulePathNameCS2487);
            lv_path_0_0=ruleFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPathNameCSRule());
              	        }
                     		add(
                     			current, 
                     			"path",
                      		lv_path_0_0, 
                      		"FirstPathElementCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:867:2: (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:867:4: otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) )
            	    {
            	    otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_rulePathNameCS2500); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getPathNameCSAccess().getColonColonKeyword_1_0());
            	          
            	    }
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:871:1: ( (lv_path_2_0= ruleNextPathElementCS ) )
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:872:1: (lv_path_2_0= ruleNextPathElementCS )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:872:1: (lv_path_2_0= ruleNextPathElementCS )
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:873:3: lv_path_2_0= ruleNextPathElementCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPathNameCSAccess().getPathNextPathElementCSParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleNextPathElementCS_in_rulePathNameCS2521);
            	    lv_path_2_0=ruleNextPathElementCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPathNameCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"path",
            	              		lv_path_2_0, 
            	              		"NextPathElementCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


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
    // $ANTLR end "rulePathNameCS"


    // $ANTLR start "entryRuleFirstPathElementCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:897:1: entryRuleFirstPathElementCS returns [EObject current=null] : iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF ;
    public final EObject entryRuleFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstPathElementCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:898:2: (iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:899:2: iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFirstPathElementCS_in_entryRuleFirstPathElementCS2559);
            iv_ruleFirstPathElementCS=ruleFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFirstPathElementCS2569); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFirstPathElementCS"


    // $ANTLR start "ruleFirstPathElementCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:906:1: ruleFirstPathElementCS returns [EObject current=null] : ( ( ruleUnrestrictedName ) ) ;
    public final EObject ruleFirstPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:909:28: ( ( ( ruleUnrestrictedName ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:910:1: ( ( ruleUnrestrictedName ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:910:1: ( ( ruleUnrestrictedName ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:911:1: ( ruleUnrestrictedName )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:911:1: ( ruleUnrestrictedName )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:912:3: ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFirstPathElementCSRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFirstPathElementCSAccess().getElementNamedElementCrossReference_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleFirstPathElementCS2620);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleFirstPathElementCS"


    // $ANTLR start "entryRuleNextPathElementCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:936:1: entryRuleNextPathElementCS returns [EObject current=null] : iv_ruleNextPathElementCS= ruleNextPathElementCS EOF ;
    public final EObject entryRuleNextPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextPathElementCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:937:2: (iv_ruleNextPathElementCS= ruleNextPathElementCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:938:2: iv_ruleNextPathElementCS= ruleNextPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNextPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNextPathElementCS_in_entryRuleNextPathElementCS2655);
            iv_ruleNextPathElementCS=ruleNextPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNextPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNextPathElementCS2665); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNextPathElementCS"


    // $ANTLR start "ruleNextPathElementCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:945:1: ruleNextPathElementCS returns [EObject current=null] : ( ( ruleUnreservedName ) ) ;
    public final EObject ruleNextPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:948:28: ( ( ( ruleUnreservedName ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:949:1: ( ( ruleUnreservedName ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:949:1: ( ( ruleUnreservedName ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:950:1: ( ruleUnreservedName )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:950:1: ( ruleUnreservedName )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:951:3: ruleUnreservedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNextPathElementCSRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNextPathElementCSAccess().getElementNamedElementCrossReference_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_ruleNextPathElementCS2716);
            ruleUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleNextPathElementCS"


    // $ANTLR start "entryRulePrimitiveTypeIdentifier"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:975:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:976:2: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:977:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_entryRulePrimitiveTypeIdentifier2752);
            iv_rulePrimitiveTypeIdentifier=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveTypeIdentifier2763); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveTypeIdentifier"


    // $ANTLR start "rulePrimitiveTypeIdentifier"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:984:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:987:28: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:988:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:988:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            int alt14=8;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt14=1;
                }
                break;
            case 39:
                {
                alt14=2;
                }
                break;
            case 40:
                {
                alt14=3;
                }
                break;
            case 41:
                {
                alt14=4;
                }
                break;
            case 42:
                {
                alt14=5;
                }
                break;
            case 43:
                {
                alt14=6;
                }
                break;
            case 44:
                {
                alt14=7;
                }
                break;
            case 45:
                {
                alt14=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:989:2: kw= 'Boolean'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_rulePrimitiveTypeIdentifier2801); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:996:2: kw= 'Integer'
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_39_in_rulePrimitiveTypeIdentifier2820); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1003:2: kw= 'Real'
                    {
                    kw=(Token)match(input,40,FollowSets000.FOLLOW_40_in_rulePrimitiveTypeIdentifier2839); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1010:2: kw= 'String'
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_41_in_rulePrimitiveTypeIdentifier2858); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1017:2: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_rulePrimitiveTypeIdentifier2877); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1024:2: kw= 'OclAny'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_rulePrimitiveTypeIdentifier2896); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1031:2: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_rulePrimitiveTypeIdentifier2915); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1038:2: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_45_in_rulePrimitiveTypeIdentifier2934); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclVoidKeyword_7()); 
                          
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
    // $ANTLR end "rulePrimitiveTypeIdentifier"


    // $ANTLR start "entryRulePrimitiveTypeCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1051:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1052:2: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1053:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeCS_in_entryRulePrimitiveTypeCS2974);
            iv_rulePrimitiveTypeCS=rulePrimitiveTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveTypeCS2984); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveTypeCS"


    // $ANTLR start "rulePrimitiveTypeCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1060:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1063:28: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1064:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1064:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1065:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1065:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1066:3: lv_name_0_0= rulePrimitiveTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveTypeCSAccess().getNamePrimitiveTypeIdentifierParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_rulePrimitiveTypeCS3029);
            lv_name_0_0=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrimitiveTypeCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"PrimitiveTypeIdentifier");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "rulePrimitiveTypeCS"


    // $ANTLR start "entryRuleCollectionTypeIdentifier"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1090:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1091:2: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1092:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_entryRuleCollectionTypeIdentifier3065);
            iv_ruleCollectionTypeIdentifier=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionTypeIdentifier3076); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionTypeIdentifier"


    // $ANTLR start "ruleCollectionTypeIdentifier"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1099:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1102:28: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1103:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1103:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt15=1;
                }
                break;
            case 47:
                {
                alt15=2;
                }
                break;
            case 48:
                {
                alt15=3;
                }
                break;
            case 49:
                {
                alt15=4;
                }
                break;
            case 50:
                {
                alt15=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1104:2: kw= 'Set'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleCollectionTypeIdentifier3114); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1111:2: kw= 'Bag'
                    {
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleCollectionTypeIdentifier3133); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1118:2: kw= 'Sequence'
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleCollectionTypeIdentifier3152); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1125:2: kw= 'Collection'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleCollectionTypeIdentifier3171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1132:2: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleCollectionTypeIdentifier3190); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getOrderedSetKeyword_4()); 
                          
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
    // $ANTLR end "ruleCollectionTypeIdentifier"


    // $ANTLR start "entryRuleCollectionTypeCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1145:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1146:2: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1147:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_entryRuleCollectionTypeCS3230);
            iv_ruleCollectionTypeCS=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionTypeCS3240); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionTypeCS"


    // $ANTLR start "ruleCollectionTypeCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1154:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1157:28: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1158:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1158:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1158:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )?
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1158:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1159:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1159:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1160:3: lv_name_0_0= ruleCollectionTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_ruleCollectionTypeCS3286);
            lv_name_0_0=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"CollectionTypeIdentifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1176:2: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==51) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1176:4: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleCollectionTypeCS3299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1180:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1181:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1181:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1182:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS3320);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_2_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleCollectionTypeCS3332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }
                    break;

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
    // $ANTLR end "ruleCollectionTypeCS"


    // $ANTLR start "entryRuleMultiplicityBoundsCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1210:1: entryRuleMultiplicityBoundsCS returns [EObject current=null] : iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF ;
    public final EObject entryRuleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityBoundsCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1211:2: (iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1212:2: iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityBoundsCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityBoundsCS_in_entryRuleMultiplicityBoundsCS3370);
            iv_ruleMultiplicityBoundsCS=ruleMultiplicityBoundsCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityBoundsCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityBoundsCS3380); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicityBoundsCS"


    // $ANTLR start "ruleMultiplicityBoundsCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1219:1: ruleMultiplicityBoundsCS returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) ;
    public final EObject ruleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1222:28: ( ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1223:1: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1223:1: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1223:2: ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1223:2: ( (lv_lowerBound_0_0= ruleLOWER ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1224:1: (lv_lowerBound_0_0= ruleLOWER )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1224:1: (lv_lowerBound_0_0= ruleLOWER )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1225:3: lv_lowerBound_0_0= ruleLOWER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getLowerBoundLOWERParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLOWER_in_ruleMultiplicityBoundsCS3426);
            lv_lowerBound_0_0=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMultiplicityBoundsCSRule());
              	        }
                     		set(
                     			current, 
                     			"lowerBound",
                      		lv_lowerBound_0_0, 
                      		"LOWER");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1241:2: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==53) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1241:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) )
                    {
                    otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleMultiplicityBoundsCS3439); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMultiplicityBoundsCSAccess().getFullStopFullStopKeyword_1_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1245:1: ( (lv_upperBound_2_0= ruleUPPER ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1246:1: (lv_upperBound_2_0= ruleUPPER )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1246:1: (lv_upperBound_2_0= ruleUPPER )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1247:3: lv_upperBound_2_0= ruleUPPER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getUpperBoundUPPERParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUPPER_in_ruleMultiplicityBoundsCS3460);
                    lv_upperBound_2_0=ruleUPPER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMultiplicityBoundsCSRule());
                      	        }
                             		set(
                             			current, 
                             			"upperBound",
                              		lv_upperBound_2_0, 
                              		"UPPER");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleMultiplicityBoundsCS"


    // $ANTLR start "entryRuleMultiplicityCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1271:1: entryRuleMultiplicityCS returns [EObject current=null] : iv_ruleMultiplicityCS= ruleMultiplicityCS EOF ;
    public final EObject entryRuleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1272:2: (iv_ruleMultiplicityCS= ruleMultiplicityCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1273:2: iv_ruleMultiplicityCS= ruleMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_entryRuleMultiplicityCS3498);
            iv_ruleMultiplicityCS=ruleMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityCS3508); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicityCS"


    // $ANTLR start "ruleMultiplicityCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1280:1: ruleMultiplicityCS returns [EObject current=null] : (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' ) ;
    public final EObject ruleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_MultiplicityBoundsCS_1 = null;

        EObject this_MultiplicityStringCS_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1283:28: ( (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1284:1: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1284:1: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1284:3: otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleMultiplicityCS3545); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMultiplicityCSAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1288:1: (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            else if ( (LA18_0==17||LA18_0==21||LA18_0==56) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1289:2: this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityBoundsCSParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityBoundsCS_in_ruleMultiplicityCS3571);
                    this_MultiplicityBoundsCS_1=ruleMultiplicityBoundsCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MultiplicityBoundsCS_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1302:2: this_MultiplicityStringCS_2= ruleMultiplicityStringCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityStringCSParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityStringCS_in_ruleMultiplicityCS3601);
                    this_MultiplicityStringCS_2=ruleMultiplicityStringCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MultiplicityStringCS_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleMultiplicityCS3613); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMultiplicityCSAccess().getRightSquareBracketKeyword_2());
                  
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
    // $ANTLR end "ruleMultiplicityCS"


    // $ANTLR start "entryRuleMultiplicityStringCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1325:1: entryRuleMultiplicityStringCS returns [EObject current=null] : iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF ;
    public final EObject entryRuleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityStringCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1326:2: (iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1327:2: iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityStringCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityStringCS_in_entryRuleMultiplicityStringCS3649);
            iv_ruleMultiplicityStringCS=ruleMultiplicityStringCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityStringCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityStringCS3659); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicityStringCS"


    // $ANTLR start "ruleMultiplicityStringCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1334:1: ruleMultiplicityStringCS returns [EObject current=null] : ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) ;
    public final EObject ruleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        Token lv_stringBounds_0_1=null;
        Token lv_stringBounds_0_2=null;
        Token lv_stringBounds_0_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1337:28: ( ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1338:1: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1338:1: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1339:1: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1339:1: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1340:1: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1340:1: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt19=1;
                }
                break;
            case 21:
                {
                alt19=2;
                }
                break;
            case 56:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1341:3: lv_stringBounds_0_1= '*'
                    {
                    lv_stringBounds_0_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMultiplicityStringCS3703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_stringBounds_0_1, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsAsteriskKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      	        }
                             		setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1353:8: lv_stringBounds_0_2= '+'
                    {
                    lv_stringBounds_0_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMultiplicityStringCS3732); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_stringBounds_0_2, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsPlusSignKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      	        }
                             		setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1365:8: lv_stringBounds_0_3= '?'
                    {
                    lv_stringBounds_0_3=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleMultiplicityStringCS3761); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_stringBounds_0_3, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsQuestionMarkKeyword_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      	        }
                             		setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_3, null);
                      	    
                    }

                    }
                    break;

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
    // $ANTLR end "ruleMultiplicityStringCS"


    // $ANTLR start "entryRuleTupleTypeCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1388:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1389:2: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1390:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleTypeCS_in_entryRuleTupleTypeCS3812);
            iv_ruleTupleTypeCS=ruleTupleTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleTypeCS3822); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTupleTypeCS"


    // $ANTLR start "ruleTupleTypeCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1397:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) ;
    public final EObject ruleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1400:28: ( ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1401:1: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1401:1: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1401:2: ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1401:2: ( (lv_name_0_0= 'Tuple' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1402:1: (lv_name_0_0= 'Tuple' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1402:1: (lv_name_0_0= 'Tuple' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1403:3: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleTupleTypeCS3865); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_name_0_0, grammarAccess.getTupleTypeCSAccess().getNameTupleKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTupleTypeCSRule());
              	        }
                     		setWithLastConsumed(current, "name", lv_name_0_0, "Tuple");
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1416:2: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==51) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1416:4: otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleTupleTypeCS3891); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1420:1: ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=RULE_SIMPLE_ID && LA21_0<=RULE_ESCAPED_ID)||(LA21_0>=19 && LA21_0<=20)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1420:2: ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1420:2: ( (lv_ownedParts_2_0= ruleTuplePartCS ) )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1421:1: (lv_ownedParts_2_0= ruleTuplePartCS )
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1421:1: (lv_ownedParts_2_0= ruleTuplePartCS )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1422:3: lv_ownedParts_2_0= ruleTuplePartCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS3913);
                            lv_ownedParts_2_0=ruleTuplePartCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"ownedParts",
                                      		lv_ownedParts_2_0, 
                                      		"TuplePartCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1438:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==57) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1438:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleTupleTypeCS3926); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1442:1: ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1443:1: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    {
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1443:1: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1444:3: lv_ownedParts_4_0= ruleTuplePartCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS3947);
                            	    lv_ownedParts_4_0=ruleTuplePartCS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"ownedParts",
                            	              		lv_ownedParts_4_0, 
                            	              		"TuplePartCS");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleTupleTypeCS3963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }
                    break;

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
    // $ANTLR end "ruleTupleTypeCS"


    // $ANTLR start "entryRuleTuplePartCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1472:1: entryRuleTuplePartCS returns [EObject current=null] : iv_ruleTuplePartCS= ruleTuplePartCS EOF ;
    public final EObject entryRuleTuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePartCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1473:2: (iv_ruleTuplePartCS= ruleTuplePartCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1474:2: iv_ruleTuplePartCS= ruleTuplePartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTuplePartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_entryRuleTuplePartCS4001);
            iv_ruleTuplePartCS=ruleTuplePartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuplePartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTuplePartCS4011); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTuplePartCS"


    // $ANTLR start "ruleTuplePartCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1481:1: ruleTuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleTuplePartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1484:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1485:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1485:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1485:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1485:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1486:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1486:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1487:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTuplePartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTuplePartCS4057);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTuplePartCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"UnrestrictedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleTuplePartCS4069); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTuplePartCSAccess().getColonKeyword_1());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1507:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1508:1: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1508:1: (lv_ownedType_2_0= ruleTypeExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1509:3: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTuplePartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleTuplePartCS4090);
            lv_ownedType_2_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTuplePartCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedType",
                      		lv_ownedType_2_0, 
                      		"TypeExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
    // $ANTLR end "ruleTuplePartCS"


    // $ANTLR start "entryRuleCollectionLiteralExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1533:1: entryRuleCollectionLiteralExpCS returns [EObject current=null] : iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF ;
    public final EObject entryRuleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1534:2: (iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1535:2: iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_entryRuleCollectionLiteralExpCS4126);
            iv_ruleCollectionLiteralExpCS=ruleCollectionLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionLiteralExpCS4136); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionLiteralExpCS"


    // $ANTLR start "ruleCollectionLiteralExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1542:1: ruleCollectionLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1545:28: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1546:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1546:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1546:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1546:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1547:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1547:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1548:3: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleCollectionLiteralExpCS4182);
            lv_ownedType_0_0=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedType",
                      		lv_ownedType_0_0, 
                      		"CollectionTypeCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleCollectionLiteralExpCS4194); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1568:1: ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_SIMPLE_ID && LA24_0<=RULE_SINGLE_QUOTED_STRING)||LA24_0==17||(LA24_0>=19 && LA24_0<=20)||(LA24_0>=22 && LA24_0<=23)||LA24_0==36||(LA24_0>=38 && LA24_0<=51)||(LA24_0>=61 && LA24_0<=64)||LA24_0==69||LA24_0==73||LA24_0==75) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1568:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1568:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1569:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1569:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1570:3: lv_ownedParts_2_0= ruleCollectionLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS4216);
                    lv_ownedParts_2_0=ruleCollectionLiteralPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedParts",
                              		lv_ownedParts_2_0, 
                              		"CollectionLiteralPartCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1586:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==57) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1586:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleCollectionLiteralExpCS4229); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1590:1: ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1591:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1591:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1592:3: lv_ownedParts_4_0= ruleCollectionLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS4250);
                    	    lv_ownedParts_4_0=ruleCollectionLiteralPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedParts",
                    	              		lv_ownedParts_4_0, 
                    	              		"CollectionLiteralPartCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleCollectionLiteralExpCS4266); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCollectionLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleCollectionLiteralExpCS"


    // $ANTLR start "entryRuleCollectionLiteralPartCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1620:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1621:2: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1622:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_entryRuleCollectionLiteralPartCS4302);
            iv_ruleCollectionLiteralPartCS=ruleCollectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionLiteralPartCS4312); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionLiteralPartCS"


    // $ANTLR start "ruleCollectionLiteralPartCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1629:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressionCS_0_0 = null;

        EObject lv_lastExpressionCS_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1632:28: ( ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1633:1: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1633:1: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1633:2: ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1633:2: ( (lv_expressionCS_0_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1634:1: (lv_expressionCS_0_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1634:1: (lv_expressionCS_0_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1635:3: lv_expressionCS_0_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSExpCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS4358);
            lv_expressionCS_0_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
              	        }
                     		set(
                     			current, 
                     			"expressionCS",
                      		lv_expressionCS_0_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1651:2: (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==53) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1651:4: otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    {
                    otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleCollectionLiteralPartCS4371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_1_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1655:1: ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1656:1: (lv_lastExpressionCS_2_0= ruleExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1656:1: (lv_lastExpressionCS_2_0= ruleExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1657:3: lv_lastExpressionCS_2_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getLastExpressionCSExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS4392);
                    lv_lastExpressionCS_2_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                      	        }
                             		set(
                             			current, 
                             			"lastExpressionCS",
                              		lv_lastExpressionCS_2_0, 
                              		"ExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleCollectionLiteralPartCS"


    // $ANTLR start "entryRuleConstructorPartCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1681:1: entryRuleConstructorPartCS returns [EObject current=null] : iv_ruleConstructorPartCS= ruleConstructorPartCS EOF ;
    public final EObject entryRuleConstructorPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructorPartCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1682:2: (iv_ruleConstructorPartCS= ruleConstructorPartCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1683:2: iv_ruleConstructorPartCS= ruleConstructorPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructorPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstructorPartCS_in_entryRuleConstructorPartCS4430);
            iv_ruleConstructorPartCS=ruleConstructorPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstructorPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstructorPartCS4440); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstructorPartCS"


    // $ANTLR start "ruleConstructorPartCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1690:1: ruleConstructorPartCS returns [EObject current=null] : ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( (lv_initExpression_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleConstructorPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_initExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1693:28: ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( (lv_initExpression_2_0= ruleExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1694:1: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( (lv_initExpression_2_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1694:1: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( (lv_initExpression_2_0= ruleExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1694:2: ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( (lv_initExpression_2_0= ruleExpCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1694:2: ( ( ruleUnrestrictedName ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1695:1: ( ruleUnrestrictedName )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1695:1: ( ruleUnrestrictedName )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1696:3: ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstructorPartCSRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstructorPartCSAccess().getPropertyPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleConstructorPartCS4492);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleConstructorPartCS4504); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConstructorPartCSAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1716:1: ( (lv_initExpression_2_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1717:1: (lv_initExpression_2_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1717:1: (lv_initExpression_2_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1718:3: lv_initExpression_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstructorPartCSAccess().getInitExpressionExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleConstructorPartCS4525);
            lv_initExpression_2_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstructorPartCSRule());
              	        }
                     		set(
                     			current, 
                     			"initExpression",
                      		lv_initExpression_2_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
    // $ANTLR end "ruleConstructorPartCS"


    // $ANTLR start "entryRulePrimitiveLiteralExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1742:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1743:2: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1744:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveLiteralExpCS_in_entryRulePrimitiveLiteralExpCS4561);
            iv_rulePrimitiveLiteralExpCS=rulePrimitiveLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveLiteralExpCS4571); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveLiteralExpCS"


    // $ANTLR start "rulePrimitiveLiteralExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1751:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
    public final EObject rulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteralExpCS_0 = null;

        EObject this_StringLiteralExpCS_1 = null;

        EObject this_BooleanLiteralExpCS_2 = null;

        EObject this_UnlimitedNaturalLiteralExpCS_3 = null;

        EObject this_InvalidLiteralExpCS_4 = null;

        EObject this_NullLiteralExpCS_5 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1754:28: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1755:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1755:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt26=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt26=1;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt26=2;
                }
                break;
            case 61:
            case 62:
                {
                alt26=3;
                }
                break;
            case 17:
                {
                alt26=4;
                }
                break;
            case 63:
                {
                alt26=5;
                }
                break;
            case 64:
                {
                alt26=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1756:2: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNumberLiteralExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpCS_in_rulePrimitiveLiteralExpCS4621);
                    this_NumberLiteralExpCS_0=ruleNumberLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberLiteralExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1769:2: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteralExpCS_in_rulePrimitiveLiteralExpCS4651);
                    this_StringLiteralExpCS_1=ruleStringLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteralExpCS_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1782:2: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpCS_in_rulePrimitiveLiteralExpCS4681);
                    this_BooleanLiteralExpCS_2=ruleBooleanLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanLiteralExpCS_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1795:2: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_rulePrimitiveLiteralExpCS4711);
                    this_UnlimitedNaturalLiteralExpCS_3=ruleUnlimitedNaturalLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnlimitedNaturalLiteralExpCS_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1808:2: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getInvalidLiteralExpCSParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInvalidLiteralExpCS_in_rulePrimitiveLiteralExpCS4741);
                    this_InvalidLiteralExpCS_4=ruleInvalidLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InvalidLiteralExpCS_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1821:2: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNullLiteralExpCSParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNullLiteralExpCS_in_rulePrimitiveLiteralExpCS4771);
                    this_NullLiteralExpCS_5=ruleNullLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NullLiteralExpCS_5; 
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
    // $ANTLR end "rulePrimitiveLiteralExpCS"


    // $ANTLR start "entryRuleTupleLiteralExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1840:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1841:2: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1842:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_entryRuleTupleLiteralExpCS4806);
            iv_ruleTupleLiteralExpCS=ruleTupleLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralExpCS4816); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTupleLiteralExpCS"


    // $ANTLR start "ruleTupleLiteralExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1849:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1852:28: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1853:1: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1853:1: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1853:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleTupleLiteralExpCS4853); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleTupleLiteralExpCS4865); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1861:1: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1862:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1862:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1863:3: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS4886);
            lv_ownedParts_2_0=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
              	        }
                     		add(
                     			current, 
                     			"ownedParts",
                      		lv_ownedParts_2_0, 
                      		"TupleLiteralPartCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1879:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==57) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1879:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleTupleLiteralExpCS4899); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1883:1: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1884:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1884:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1885:3: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS4920);
            	    lv_ownedParts_4_0=ruleTupleLiteralPartCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedParts",
            	              		lv_ownedParts_4_0, 
            	              		"TupleLiteralPartCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_5=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleTupleLiteralExpCS4934); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTupleLiteralExpCSAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleTupleLiteralExpCS"


    // $ANTLR start "entryRuleTupleLiteralPartCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1913:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1914:2: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1915:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_entryRuleTupleLiteralPartCS4970);
            iv_ruleTupleLiteralPartCS=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralPartCS4980); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTupleLiteralPartCS"


    // $ANTLR start "ruleTupleLiteralPartCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1922:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1925:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1926:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1926:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1926:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1926:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1927:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1927:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1928:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTupleLiteralPartCS5026);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"UnrestrictedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1944:2: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==58) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1944:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleTupleLiteralPartCS5039); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1948:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1949:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1949:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1950:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleTupleLiteralPartCS5060);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_2_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTupleLiteralPartCS5074); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1970:1: ( (lv_initExpression_4_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1971:1: (lv_initExpression_4_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1971:1: (lv_initExpression_4_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1972:3: lv_initExpression_4_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getInitExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleTupleLiteralPartCS5095);
            lv_initExpression_4_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
              	        }
                     		set(
                     			current, 
                     			"initExpression",
                      		lv_initExpression_4_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
    // $ANTLR end "ruleTupleLiteralPartCS"


    // $ANTLR start "entryRuleNumberLiteralExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1996:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1997:2: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1998:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpCS_in_entryRuleNumberLiteralExpCS5131);
            iv_ruleNumberLiteralExpCS=ruleNumberLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumberLiteralExpCS5141); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumberLiteralExpCS"


    // $ANTLR start "ruleNumberLiteralExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2005:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= ruleNUMBER_LITERAL ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2008:28: ( ( (lv_name_0_0= ruleNUMBER_LITERAL ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2009:1: ( (lv_name_0_0= ruleNUMBER_LITERAL ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2009:1: ( (lv_name_0_0= ruleNUMBER_LITERAL ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2010:1: (lv_name_0_0= ruleNUMBER_LITERAL )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2010:1: (lv_name_0_0= ruleNUMBER_LITERAL )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2011:3: lv_name_0_0= ruleNUMBER_LITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralExpCSAccess().getNameNUMBER_LITERALParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNUMBER_LITERAL_in_ruleNumberLiteralExpCS5186);
            lv_name_0_0=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumberLiteralExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"NUMBER_LITERAL");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleNumberLiteralExpCS"


    // $ANTLR start "entryRuleStringLiteralExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2035:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2036:2: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2037:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteralExpCS_in_entryRuleStringLiteralExpCS5221);
            iv_ruleStringLiteralExpCS=ruleStringLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteralExpCS5231); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteralExpCS"


    // $ANTLR start "ruleStringLiteralExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2044:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= ruleStringLiteral ) )+ ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2047:28: ( ( (lv_name_0_0= ruleStringLiteral ) )+ )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2048:1: ( (lv_name_0_0= ruleStringLiteral ) )+
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2048:1: ( (lv_name_0_0= ruleStringLiteral ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_SINGLE_QUOTED_STRING) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2049:1: (lv_name_0_0= ruleStringLiteral )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2049:1: (lv_name_0_0= ruleStringLiteral )
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2050:3: lv_name_0_0= ruleStringLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStringLiteralExpCSAccess().getNameStringLiteralParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleStringLiteralExpCS5276);
            	    lv_name_0_0=ruleStringLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStringLiteralExpCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"name",
            	              		lv_name_0_0, 
            	              		"StringLiteral");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
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
    // $ANTLR end "ruleStringLiteralExpCS"


    // $ANTLR start "entryRuleBooleanLiteralExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2074:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2075:2: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2076:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpCS_in_entryRuleBooleanLiteralExpCS5312);
            iv_ruleBooleanLiteralExpCS=ruleBooleanLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanLiteralExpCS5322); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteralExpCS"


    // $ANTLR start "ruleBooleanLiteralExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2083:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2086:28: ( ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2087:1: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2087:1: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==61) ) {
                alt30=1;
            }
            else if ( (LA30_0==62) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2087:2: ( (lv_name_0_0= 'true' ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2087:2: ( (lv_name_0_0= 'true' ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2088:1: (lv_name_0_0= 'true' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2088:1: (lv_name_0_0= 'true' )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2089:3: lv_name_0_0= 'true'
                    {
                    lv_name_0_0=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleBooleanLiteralExpCS5365); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_0, grammarAccess.getBooleanLiteralExpCSAccess().getNameTrueKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_0, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2103:6: ( (lv_name_1_0= 'false' ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2103:6: ( (lv_name_1_0= 'false' ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2104:1: (lv_name_1_0= 'false' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2104:1: (lv_name_1_0= 'false' )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2105:3: lv_name_1_0= 'false'
                    {
                    lv_name_1_0=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleBooleanLiteralExpCS5402); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_1_0, grammarAccess.getBooleanLiteralExpCSAccess().getNameFalseKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_1_0, "false");
                      	    
                    }

                    }


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
    // $ANTLR end "ruleBooleanLiteralExpCS"


    // $ANTLR start "entryRuleUnlimitedNaturalLiteralExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2126:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2127:2: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2128:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_entryRuleUnlimitedNaturalLiteralExpCS5451);
            iv_ruleUnlimitedNaturalLiteralExpCS=ruleUnlimitedNaturalLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedNaturalLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnlimitedNaturalLiteralExpCS5461); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "ruleUnlimitedNaturalLiteralExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2135:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2138:28: ( ( () otherlv_1= '*' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2139:1: ( () otherlv_1= '*' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2139:1: ( () otherlv_1= '*' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2139:2: () otherlv_1= '*'
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2139:2: ()
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2140:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleUnlimitedNaturalLiteralExpCS5510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getAsteriskKeyword_1());
                  
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
    // $ANTLR end "ruleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "entryRuleInvalidLiteralExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2160:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2161:2: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2162:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvalidLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInvalidLiteralExpCS_in_entryRuleInvalidLiteralExpCS5546);
            iv_ruleInvalidLiteralExpCS=ruleInvalidLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvalidLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvalidLiteralExpCS5556); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInvalidLiteralExpCS"


    // $ANTLR start "ruleInvalidLiteralExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2169:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2172:28: ( ( () otherlv_1= 'invalid' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2173:1: ( () otherlv_1= 'invalid' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2173:1: ( () otherlv_1= 'invalid' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2173:2: () otherlv_1= 'invalid'
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2173:2: ()
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2174:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInvalidLiteralExpCSAccess().getInvalidLiteralExpCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleInvalidLiteralExpCS5605); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInvalidLiteralExpCSAccess().getInvalidKeyword_1());
                  
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
    // $ANTLR end "ruleInvalidLiteralExpCS"


    // $ANTLR start "entryRuleNullLiteralExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2194:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2195:2: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2196:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNullLiteralExpCS_in_entryRuleNullLiteralExpCS5641);
            iv_ruleNullLiteralExpCS=ruleNullLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNullLiteralExpCS5651); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNullLiteralExpCS"


    // $ANTLR start "ruleNullLiteralExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2203:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2206:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2207:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2207:1: ( () otherlv_1= 'null' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2207:2: () otherlv_1= 'null'
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2207:2: ()
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2208:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNullLiteralExpCSAccess().getNullLiteralExpCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleNullLiteralExpCS5700); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNullLiteralExpCSAccess().getNullKeyword_1());
                  
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
    // $ANTLR end "ruleNullLiteralExpCS"


    // $ANTLR start "entryRuleTypeLiteralCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2228:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2229:2: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2230:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_entryRuleTypeLiteralCS5736);
            iv_ruleTypeLiteralCS=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralCS5746); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeLiteralCS"


    // $ANTLR start "ruleTypeLiteralCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2237:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_CollectionTypeCS_1 = null;

        EObject this_TupleTypeCS_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2240:28: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2241:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2241:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
                {
                alt31=1;
                }
                break;
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                {
                alt31=2;
                }
                break;
            case 36:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2242:2: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getPrimitiveTypeCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeCS_in_ruleTypeLiteralCS5796);
                    this_PrimitiveTypeCS_0=rulePrimitiveTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimitiveTypeCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2255:2: this_CollectionTypeCS_1= ruleCollectionTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getCollectionTypeCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleTypeLiteralCS5826);
                    this_CollectionTypeCS_1=ruleCollectionTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CollectionTypeCS_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2268:2: this_TupleTypeCS_2= ruleTupleTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getTupleTypeCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleTypeCS_in_ruleTypeLiteralCS5856);
                    this_TupleTypeCS_2=ruleTupleTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TupleTypeCS_2; 
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
    // $ANTLR end "ruleTypeLiteralCS"


    // $ANTLR start "entryRuleTypeLiteralExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2287:1: entryRuleTypeLiteralExpCS returns [EObject current=null] : iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF ;
    public final EObject entryRuleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2288:2: (iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2289:2: iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_entryRuleTypeLiteralExpCS5891);
            iv_ruleTypeLiteralExpCS=ruleTypeLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralExpCS5901); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeLiteralExpCS"


    // $ANTLR start "ruleTypeLiteralExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2296:1: ruleTypeLiteralExpCS returns [EObject current=null] : ( (lv_ownedType_0_0= ruleTypeLiteralCS ) ) ;
    public final EObject ruleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedType_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2299:28: ( ( (lv_ownedType_0_0= ruleTypeLiteralCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2300:1: ( (lv_ownedType_0_0= ruleTypeLiteralCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2300:1: ( (lv_ownedType_0_0= ruleTypeLiteralCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2301:1: (lv_ownedType_0_0= ruleTypeLiteralCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2301:1: (lv_ownedType_0_0= ruleTypeLiteralCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2302:3: lv_ownedType_0_0= ruleTypeLiteralCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeTypeLiteralCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_ruleTypeLiteralExpCS5946);
            lv_ownedType_0_0=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeLiteralExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedType",
                      		lv_ownedType_0_0, 
                      		"TypeLiteralCS");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleTypeLiteralExpCS"


    // $ANTLR start "entryRuleTypeNameExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2326:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2327:2: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2328:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeNameExpCS_in_entryRuleTypeNameExpCS5981);
            iv_ruleTypeNameExpCS=ruleTypeNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeNameExpCS5991); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeNameExpCS"


    // $ANTLR start "ruleTypeNameExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2335:1: ruleTypeNameExpCS returns [EObject current=null] : ( (lv_pathName_0_0= rulePathNameCS ) ) ;
    public final EObject ruleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_pathName_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2338:28: ( ( (lv_pathName_0_0= rulePathNameCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2339:1: ( (lv_pathName_0_0= rulePathNameCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2339:1: ( (lv_pathName_0_0= rulePathNameCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2340:1: (lv_pathName_0_0= rulePathNameCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2340:1: (lv_pathName_0_0= rulePathNameCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2341:3: lv_pathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getPathNamePathNameCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_ruleTypeNameExpCS6036);
            lv_pathName_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"pathName",
                      		lv_pathName_0_0, 
                      		"PathNameCS");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleTypeNameExpCS"


    // $ANTLR start "entryRuleTypeExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2365:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2366:2: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2367:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_entryRuleTypeExpCS6071);
            iv_ruleTypeExpCS=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeExpCS6081); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeExpCS"


    // $ANTLR start "ruleTypeExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2374:1: ruleTypeExpCS returns [EObject current=null] : ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;

        EObject lv_multiplicity_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2377:28: ( ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2378:1: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2378:1: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2378:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )?
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2378:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_SIMPLE_ID && LA32_0<=RULE_ESCAPED_ID)||(LA32_0>=19 && LA32_0<=20)) ) {
                alt32=1;
            }
            else if ( (LA32_0==36||(LA32_0>=38 && LA32_0<=50)) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2379:2: this_TypeNameExpCS_0= ruleTypeNameExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeNameExpCSParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeNameExpCS_in_ruleTypeExpCS6132);
                    this_TypeNameExpCS_0=ruleTypeNameExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeNameExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2392:2: this_TypeLiteralCS_1= ruleTypeLiteralCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeLiteralCSParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_ruleTypeExpCS6162);
                    this_TypeLiteralCS_1=ruleTypeLiteralCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeLiteralCS_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2403:2: ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==54) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2404:1: (lv_multiplicity_2_0= ruleMultiplicityCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2404:1: (lv_multiplicity_2_0= ruleMultiplicityCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2405:3: lv_multiplicity_2_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeExpCSAccess().getMultiplicityMultiplicityCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_ruleTypeExpCS6183);
                    lv_multiplicity_2_0=ruleMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"multiplicity",
                              		lv_multiplicity_2_0, 
                              		"MultiplicityCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "ruleTypeExpCS"


    // $ANTLR start "entryRuleExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2429:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2430:2: (iv_ruleExpCS= ruleExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2431:2: iv_ruleExpCS= ruleExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_entryRuleExpCS6220);
            iv_ruleExpCS=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpCS6230); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpCS"


    // $ANTLR start "ruleExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2438:1: ruleExpCS returns [EObject current=null] : ( ( () ( (lv_ownedExpression_1_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) )* ( (lv_ownedExpression_5_0= rulePrefixedExpOrLetExpCS ) ) ) | ( () ( (lv_ownedOperator_7_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_8_0= rulePrimaryExpOrLetExpCS ) ) ) | this_PrimaryExpOrLetExpCS_9= rulePrimaryExpOrLetExpCS ) ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedExpression_1_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;

        EObject lv_ownedOperator_4_0 = null;

        EObject lv_ownedExpression_5_0 = null;

        EObject lv_ownedOperator_7_0 = null;

        EObject lv_ownedExpression_8_0 = null;

        EObject this_PrimaryExpOrLetExpCS_9 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2441:28: ( ( ( () ( (lv_ownedExpression_1_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) )* ( (lv_ownedExpression_5_0= rulePrefixedExpOrLetExpCS ) ) ) | ( () ( (lv_ownedOperator_7_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_8_0= rulePrimaryExpOrLetExpCS ) ) ) | this_PrimaryExpOrLetExpCS_9= rulePrimaryExpOrLetExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2442:1: ( ( () ( (lv_ownedExpression_1_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) )* ( (lv_ownedExpression_5_0= rulePrefixedExpOrLetExpCS ) ) ) | ( () ( (lv_ownedOperator_7_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_8_0= rulePrimaryExpOrLetExpCS ) ) ) | this_PrimaryExpOrLetExpCS_9= rulePrimaryExpOrLetExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2442:1: ( ( () ( (lv_ownedExpression_1_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) )* ( (lv_ownedExpression_5_0= rulePrefixedExpOrLetExpCS ) ) ) | ( () ( (lv_ownedOperator_7_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_8_0= rulePrimaryExpOrLetExpCS ) ) ) | this_PrimaryExpOrLetExpCS_9= rulePrimaryExpOrLetExpCS )
            int alt36=3;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2442:2: ( () ( (lv_ownedExpression_1_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) )* ( (lv_ownedExpression_5_0= rulePrefixedExpOrLetExpCS ) ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2442:2: ( () ( (lv_ownedExpression_1_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) )* ( (lv_ownedExpression_5_0= rulePrefixedExpOrLetExpCS ) ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2442:3: () ( (lv_ownedExpression_1_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) )* ( (lv_ownedExpression_5_0= rulePrefixedExpOrLetExpCS ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2442:3: ()
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2443:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpCSAccess().getInfixExpCSAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2451:2: ( (lv_ownedExpression_1_0= rulePrefixedExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2452:1: (lv_ownedExpression_1_0= rulePrefixedExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2452:1: (lv_ownedExpression_1_0= rulePrefixedExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2453:3: lv_ownedExpression_1_0= rulePrefixedExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_ruleExpCS6289);
                    lv_ownedExpression_1_0=rulePrefixedExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpCSRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedExpression",
                              		lv_ownedExpression_1_0, 
                              		"PrefixedExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2469:2: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2470:1: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2470:1: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2471:3: lv_ownedOperator_2_0= ruleBinaryOperatorCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_ruleExpCS6310);
                    lv_ownedOperator_2_0=ruleBinaryOperatorCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpCSRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedOperator",
                              		lv_ownedOperator_2_0, 
                              		"BinaryOperatorCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2487:2: ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        alt34 = dfa34.predict(input);
                        switch (alt34) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2487:3: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2487:3: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2488:1: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2488:1: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2489:3: lv_ownedExpression_3_0= rulePrefixedExpCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_0_3_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_ruleExpCS6332);
                    	    lv_ownedExpression_3_0=rulePrefixedExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getExpCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedExpression",
                    	              		lv_ownedExpression_3_0, 
                    	              		"PrefixedExpCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2505:2: ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2506:1: (lv_ownedOperator_4_0= ruleBinaryOperatorCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2506:1: (lv_ownedOperator_4_0= ruleBinaryOperatorCS )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2507:3: lv_ownedOperator_4_0= ruleBinaryOperatorCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_0_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_ruleExpCS6353);
                    	    lv_ownedOperator_4_0=ruleBinaryOperatorCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getExpCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedOperator",
                    	              		lv_ownedOperator_4_0, 
                    	              		"BinaryOperatorCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2523:4: ( (lv_ownedExpression_5_0= rulePrefixedExpOrLetExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2524:1: (lv_ownedExpression_5_0= rulePrefixedExpOrLetExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2524:1: (lv_ownedExpression_5_0= rulePrefixedExpOrLetExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2525:3: lv_ownedExpression_5_0= rulePrefixedExpOrLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionPrefixedExpOrLetExpCSParserRuleCall_0_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrefixedExpOrLetExpCS_in_ruleExpCS6376);
                    lv_ownedExpression_5_0=rulePrefixedExpOrLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpCSRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedExpression",
                              		lv_ownedExpression_5_0, 
                              		"PrefixedExpOrLetExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2542:6: ( () ( (lv_ownedOperator_7_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_8_0= rulePrimaryExpOrLetExpCS ) ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2542:6: ( () ( (lv_ownedOperator_7_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_8_0= rulePrimaryExpOrLetExpCS ) ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2542:7: () ( (lv_ownedOperator_7_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_8_0= rulePrimaryExpOrLetExpCS ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2542:7: ()
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2543:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpCSAccess().getPrefixExpCSAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2551:2: ( (lv_ownedOperator_7_0= ruleUnaryOperatorCS ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0>=22 && LA35_0<=23)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2552:1: (lv_ownedOperator_7_0= ruleUnaryOperatorCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2552:1: (lv_ownedOperator_7_0= ruleUnaryOperatorCS )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2553:3: lv_ownedOperator_7_0= ruleUnaryOperatorCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedOperatorUnaryOperatorCSParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorCS_in_ruleExpCS6417);
                    	    lv_ownedOperator_7_0=ruleUnaryOperatorCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getExpCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedOperator",
                    	              		lv_ownedOperator_7_0, 
                    	              		"UnaryOperatorCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2569:3: ( (lv_ownedExpression_8_0= rulePrimaryExpOrLetExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2570:1: (lv_ownedExpression_8_0= rulePrimaryExpOrLetExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2570:1: (lv_ownedExpression_8_0= rulePrimaryExpOrLetExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2571:3: lv_ownedExpression_8_0= rulePrimaryExpOrLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionPrimaryExpOrLetExpCSParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpOrLetExpCS_in_ruleExpCS6439);
                    lv_ownedExpression_8_0=rulePrimaryExpOrLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedExpression",
                              		lv_ownedExpression_8_0, 
                              		"PrimaryExpOrLetExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2589:2: this_PrimaryExpOrLetExpCS_9= rulePrimaryExpOrLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpCSAccess().getPrimaryExpOrLetExpCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpOrLetExpCS_in_ruleExpCS6471);
                    this_PrimaryExpOrLetExpCS_9=rulePrimaryExpOrLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimaryExpOrLetExpCS_9; 
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
    // $ANTLR end "ruleExpCS"


    // $ANTLR start "entryRuleBinaryOperatorCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2608:1: entryRuleBinaryOperatorCS returns [EObject current=null] : iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF ;
    public final EObject entryRuleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperatorCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2609:2: (iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2610:2: iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_entryRuleBinaryOperatorCS6506);
            iv_ruleBinaryOperatorCS=ruleBinaryOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryOperatorCS6516); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBinaryOperatorCS"


    // $ANTLR start "ruleBinaryOperatorCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2617:1: ruleBinaryOperatorCS returns [EObject current=null] : (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) ;
    public final EObject ruleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject this_InfixOperatorCS_0 = null;

        EObject this_NavigationOperatorCS_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2620:28: ( (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2621:1: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2621:1: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==17||(LA37_0>=21 && LA37_0<=22)||(LA37_0>=24 && LA37_0<=34)) ) {
                alt37=1;
            }
            else if ( (LA37_0==18||LA37_0==35) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2622:2: this_InfixOperatorCS_0= ruleInfixOperatorCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinaryOperatorCSAccess().getInfixOperatorCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInfixOperatorCS_in_ruleBinaryOperatorCS6566);
                    this_InfixOperatorCS_0=ruleInfixOperatorCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InfixOperatorCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2635:2: this_NavigationOperatorCS_1= ruleNavigationOperatorCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinaryOperatorCSAccess().getNavigationOperatorCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigationOperatorCS_in_ruleBinaryOperatorCS6596);
                    this_NavigationOperatorCS_1=ruleNavigationOperatorCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NavigationOperatorCS_1; 
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
    // $ANTLR end "ruleBinaryOperatorCS"


    // $ANTLR start "entryRuleInfixOperatorCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2654:1: entryRuleInfixOperatorCS returns [EObject current=null] : iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF ;
    public final EObject entryRuleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixOperatorCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2655:2: (iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2656:2: iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixOperatorCS_in_entryRuleInfixOperatorCS6631);
            iv_ruleInfixOperatorCS=ruleInfixOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfixOperatorCS6641); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInfixOperatorCS"


    // $ANTLR start "ruleInfixOperatorCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2663:1: ruleInfixOperatorCS returns [EObject current=null] : ( (lv_name_0_0= ruleInfixOperator ) ) ;
    public final EObject ruleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2666:28: ( ( (lv_name_0_0= ruleInfixOperator ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2667:1: ( (lv_name_0_0= ruleInfixOperator ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2667:1: ( (lv_name_0_0= ruleInfixOperator ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2668:1: (lv_name_0_0= ruleInfixOperator )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2668:1: (lv_name_0_0= ruleInfixOperator )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2669:3: lv_name_0_0= ruleInfixOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInfixOperatorCSAccess().getNameInfixOperatorParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixOperator_in_ruleInfixOperatorCS6686);
            lv_name_0_0=ruleInfixOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInfixOperatorCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"InfixOperator");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleInfixOperatorCS"


    // $ANTLR start "entryRuleNavigationOperatorCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2693:1: entryRuleNavigationOperatorCS returns [EObject current=null] : iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF ;
    public final EObject entryRuleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationOperatorCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2694:2: (iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2695:2: iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigationOperatorCS_in_entryRuleNavigationOperatorCS6721);
            iv_ruleNavigationOperatorCS=ruleNavigationOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigationOperatorCS6731); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigationOperatorCS"


    // $ANTLR start "ruleNavigationOperatorCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2702:1: ruleNavigationOperatorCS returns [EObject current=null] : ( (lv_name_0_0= ruleNavigationOperator ) ) ;
    public final EObject ruleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2705:28: ( ( (lv_name_0_0= ruleNavigationOperator ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2706:1: ( (lv_name_0_0= ruleNavigationOperator ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2706:1: ( (lv_name_0_0= ruleNavigationOperator ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2707:1: (lv_name_0_0= ruleNavigationOperator )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2707:1: (lv_name_0_0= ruleNavigationOperator )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2708:3: lv_name_0_0= ruleNavigationOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigationOperatorCSAccess().getNameNavigationOperatorParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigationOperator_in_ruleNavigationOperatorCS6776);
            lv_name_0_0=ruleNavigationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNavigationOperatorCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"NavigationOperator");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleNavigationOperatorCS"


    // $ANTLR start "entryRulePrefixedExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2732:1: entryRulePrefixedExpCS returns [EObject current=null] : iv_rulePrefixedExpCS= rulePrefixedExpCS EOF ;
    public final EObject entryRulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2733:2: (iv_rulePrefixedExpCS= rulePrefixedExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2734:2: iv_rulePrefixedExpCS= rulePrefixedExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_entryRulePrefixedExpCS6811);
            iv_rulePrefixedExpCS=rulePrefixedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrefixedExpCS6821); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrefixedExpCS"


    // $ANTLR start "rulePrefixedExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2741:1: rulePrefixedExpCS returns [EObject current=null] : (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) ) ;
    public final EObject rulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpCS_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2744:28: ( (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2745:1: (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2745:1: (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_SIMPLE_ID && LA39_0<=RULE_SINGLE_QUOTED_STRING)||LA39_0==17||(LA39_0>=19 && LA39_0<=20)||LA39_0==36||(LA39_0>=38 && LA39_0<=51)||(LA39_0>=61 && LA39_0<=64)||LA39_0==69||LA39_0==75) ) {
                alt39=1;
            }
            else if ( ((LA39_0>=22 && LA39_0<=23)) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2746:2: this_PrimaryExpCS_0= rulePrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixedExpCSAccess().getPrimaryExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS6871);
                    this_PrimaryExpCS_0=rulePrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimaryExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2758:6: ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2758:6: ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2758:7: () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2758:7: ()
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2759:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrefixedExpCSAccess().getPrefixExpCSAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2767:2: ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( ((LA38_0>=22 && LA38_0<=23)) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2768:1: (lv_ownedOperator_2_0= ruleUnaryOperatorCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2768:1: (lv_ownedOperator_2_0= ruleUnaryOperatorCS )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2769:3: lv_ownedOperator_2_0= ruleUnaryOperatorCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrefixedExpCSAccess().getOwnedOperatorUnaryOperatorCSParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorCS_in_rulePrefixedExpCS6910);
                    	    lv_ownedOperator_2_0=ruleUnaryOperatorCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPrefixedExpCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedOperator",
                    	              		lv_ownedOperator_2_0, 
                    	              		"UnaryOperatorCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt38 >= 1 ) break loop38;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
                    } while (true);

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2785:3: ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2786:1: (lv_ownedExpression_3_0= rulePrimaryExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2786:1: (lv_ownedExpression_3_0= rulePrimaryExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2787:3: lv_ownedExpression_3_0= rulePrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedExpCSAccess().getOwnedExpressionPrimaryExpCSParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS6932);
                    lv_ownedExpression_3_0=rulePrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrefixedExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedExpression",
                              		lv_ownedExpression_3_0, 
                              		"PrimaryExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


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
    // $ANTLR end "rulePrefixedExpCS"


    // $ANTLR start "entryRulePrefixedExpOrLetExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2811:1: entryRulePrefixedExpOrLetExpCS returns [EObject current=null] : iv_rulePrefixedExpOrLetExpCS= rulePrefixedExpOrLetExpCS EOF ;
    public final EObject entryRulePrefixedExpOrLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedExpOrLetExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2812:2: (iv_rulePrefixedExpOrLetExpCS= rulePrefixedExpOrLetExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2813:2: iv_rulePrefixedExpOrLetExpCS= rulePrefixedExpOrLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedExpOrLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixedExpOrLetExpCS_in_entryRulePrefixedExpOrLetExpCS6969);
            iv_rulePrefixedExpOrLetExpCS=rulePrefixedExpOrLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedExpOrLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrefixedExpOrLetExpCS6979); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrefixedExpOrLetExpCS"


    // $ANTLR start "rulePrefixedExpOrLetExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2820:1: rulePrefixedExpOrLetExpCS returns [EObject current=null] : (this_PrimaryExpOrLetExpCS_0= rulePrimaryExpOrLetExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpOrLetExpCS ) ) ) ) ;
    public final EObject rulePrefixedExpOrLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpOrLetExpCS_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2823:28: ( (this_PrimaryExpOrLetExpCS_0= rulePrimaryExpOrLetExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpOrLetExpCS ) ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2824:1: (this_PrimaryExpOrLetExpCS_0= rulePrimaryExpOrLetExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpOrLetExpCS ) ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2824:1: (this_PrimaryExpOrLetExpCS_0= rulePrimaryExpOrLetExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpOrLetExpCS ) ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_SIMPLE_ID && LA41_0<=RULE_SINGLE_QUOTED_STRING)||LA41_0==17||(LA41_0>=19 && LA41_0<=20)||LA41_0==36||(LA41_0>=38 && LA41_0<=51)||(LA41_0>=61 && LA41_0<=64)||LA41_0==69||LA41_0==73||LA41_0==75) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=22 && LA41_0<=23)) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2825:2: this_PrimaryExpOrLetExpCS_0= rulePrimaryExpOrLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixedExpOrLetExpCSAccess().getPrimaryExpOrLetExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpOrLetExpCS_in_rulePrefixedExpOrLetExpCS7029);
                    this_PrimaryExpOrLetExpCS_0=rulePrimaryExpOrLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimaryExpOrLetExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2837:6: ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpOrLetExpCS ) ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2837:6: ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpOrLetExpCS ) ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2837:7: () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpOrLetExpCS ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2837:7: ()
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2838:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrefixedExpOrLetExpCSAccess().getPrefixExpCSAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2846:2: ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( ((LA40_0>=22 && LA40_0<=23)) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2847:1: (lv_ownedOperator_2_0= ruleUnaryOperatorCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2847:1: (lv_ownedOperator_2_0= ruleUnaryOperatorCS )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2848:3: lv_ownedOperator_2_0= ruleUnaryOperatorCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrefixedExpOrLetExpCSAccess().getOwnedOperatorUnaryOperatorCSParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorCS_in_rulePrefixedExpOrLetExpCS7068);
                    	    lv_ownedOperator_2_0=ruleUnaryOperatorCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPrefixedExpOrLetExpCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedOperator",
                    	              		lv_ownedOperator_2_0, 
                    	              		"UnaryOperatorCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt40 >= 1 ) break loop40;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(40, input);
                                throw eee;
                        }
                        cnt40++;
                    } while (true);

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2864:3: ( (lv_ownedExpression_3_0= rulePrimaryExpOrLetExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2865:1: (lv_ownedExpression_3_0= rulePrimaryExpOrLetExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2865:1: (lv_ownedExpression_3_0= rulePrimaryExpOrLetExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2866:3: lv_ownedExpression_3_0= rulePrimaryExpOrLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedExpOrLetExpCSAccess().getOwnedExpressionPrimaryExpOrLetExpCSParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpOrLetExpCS_in_rulePrefixedExpOrLetExpCS7090);
                    lv_ownedExpression_3_0=rulePrimaryExpOrLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrefixedExpOrLetExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedExpression",
                              		lv_ownedExpression_3_0, 
                              		"PrimaryExpOrLetExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


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
    // $ANTLR end "rulePrefixedExpOrLetExpCS"


    // $ANTLR start "entryRuleUnaryOperatorCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2890:1: entryRuleUnaryOperatorCS returns [EObject current=null] : iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF ;
    public final EObject entryRuleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperatorCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2891:2: (iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2892:2: iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorCS_in_entryRuleUnaryOperatorCS7127);
            iv_ruleUnaryOperatorCS=ruleUnaryOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryOperatorCS7137); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryOperatorCS"


    // $ANTLR start "ruleUnaryOperatorCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2899:1: ruleUnaryOperatorCS returns [EObject current=null] : ( (lv_name_0_0= rulePrefixOperator ) ) ;
    public final EObject ruleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2902:28: ( ( (lv_name_0_0= rulePrefixOperator ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2903:1: ( (lv_name_0_0= rulePrefixOperator ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2903:1: ( (lv_name_0_0= rulePrefixOperator ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2904:1: (lv_name_0_0= rulePrefixOperator )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2904:1: (lv_name_0_0= rulePrefixOperator )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2905:3: lv_name_0_0= rulePrefixOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnaryOperatorCSAccess().getNamePrefixOperatorParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixOperator_in_ruleUnaryOperatorCS7182);
            lv_name_0_0=rulePrefixOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnaryOperatorCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"PrefixOperator");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleUnaryOperatorCS"


    // $ANTLR start "entryRulePrimaryExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2929:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2930:2: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2931:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_entryRulePrimaryExpCS7217);
            iv_rulePrimaryExpCS=rulePrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpCS7227); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpCS"


    // $ANTLR start "rulePrimaryExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2938:1: rulePrimaryExpCS returns [EObject current=null] : ( ( () ( (lv_pathName_1_0= rulePathNameCS ) ) otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? ( ( (lv_atPre_12_0= '@' ) ) otherlv_13= 'pre' )? ) | ( () ( (lv_pathName_15_0= rulePathNameCS ) ) otherlv_16= '{' ( (lv_ownedParts_17_0= ruleConstructorPartCS ) ) (otherlv_18= ',' ( (lv_ownedParts_19_0= ruleConstructorPartCS ) ) )* otherlv_20= '}' ) | ( () ( (lv_pathName_22_0= rulePathNameCS ) ) ( ( (lv_atPre_23_0= '@' ) ) otherlv_24= 'pre' )? otherlv_25= '(' ( ( (lv_argument_26_0= ruleNavigatingArgCS ) ) ( (lv_argument_27_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_28_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_29_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_30_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_31_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_32= ')' ) | ( () ( (lv_pathName_34_0= rulePathNameCS ) ) ( ( (lv_atPre_35_0= '@' ) ) otherlv_36= 'pre' )? ) | this_SelfExpCS_37= ruleSelfExpCS | this_PrimitiveLiteralExpCS_38= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_39= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_40= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_41= ruleTypeLiteralExpCS | this_IfExpCS_42= ruleIfExpCS | this_NestedExpCS_43= ruleNestedExpCS ) ;
    public final EObject rulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_atPre_12_0=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_atPre_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_32=null;
        Token lv_atPre_35_0=null;
        Token otherlv_36=null;
        EObject lv_pathName_1_0 = null;

        EObject lv_firstIndexes_3_0 = null;

        EObject lv_firstIndexes_5_0 = null;

        EObject lv_secondIndexes_8_0 = null;

        EObject lv_secondIndexes_10_0 = null;

        EObject lv_pathName_15_0 = null;

        EObject lv_ownedParts_17_0 = null;

        EObject lv_ownedParts_19_0 = null;

        EObject lv_pathName_22_0 = null;

        EObject lv_argument_26_0 = null;

        EObject lv_argument_27_0 = null;

        EObject lv_argument_28_0 = null;

        EObject lv_argument_29_0 = null;

        EObject lv_argument_30_0 = null;

        EObject lv_argument_31_0 = null;

        EObject lv_pathName_34_0 = null;

        EObject this_SelfExpCS_37 = null;

        EObject this_PrimitiveLiteralExpCS_38 = null;

        EObject this_TupleLiteralExpCS_39 = null;

        EObject this_CollectionLiteralExpCS_40 = null;

        EObject this_TypeLiteralExpCS_41 = null;

        EObject this_IfExpCS_42 = null;

        EObject this_NestedExpCS_43 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2941:28: ( ( ( () ( (lv_pathName_1_0= rulePathNameCS ) ) otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? ( ( (lv_atPre_12_0= '@' ) ) otherlv_13= 'pre' )? ) | ( () ( (lv_pathName_15_0= rulePathNameCS ) ) otherlv_16= '{' ( (lv_ownedParts_17_0= ruleConstructorPartCS ) ) (otherlv_18= ',' ( (lv_ownedParts_19_0= ruleConstructorPartCS ) ) )* otherlv_20= '}' ) | ( () ( (lv_pathName_22_0= rulePathNameCS ) ) ( ( (lv_atPre_23_0= '@' ) ) otherlv_24= 'pre' )? otherlv_25= '(' ( ( (lv_argument_26_0= ruleNavigatingArgCS ) ) ( (lv_argument_27_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_28_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_29_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_30_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_31_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_32= ')' ) | ( () ( (lv_pathName_34_0= rulePathNameCS ) ) ( ( (lv_atPre_35_0= '@' ) ) otherlv_36= 'pre' )? ) | this_SelfExpCS_37= ruleSelfExpCS | this_PrimitiveLiteralExpCS_38= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_39= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_40= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_41= ruleTypeLiteralExpCS | this_IfExpCS_42= ruleIfExpCS | this_NestedExpCS_43= ruleNestedExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2942:1: ( ( () ( (lv_pathName_1_0= rulePathNameCS ) ) otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? ( ( (lv_atPre_12_0= '@' ) ) otherlv_13= 'pre' )? ) | ( () ( (lv_pathName_15_0= rulePathNameCS ) ) otherlv_16= '{' ( (lv_ownedParts_17_0= ruleConstructorPartCS ) ) (otherlv_18= ',' ( (lv_ownedParts_19_0= ruleConstructorPartCS ) ) )* otherlv_20= '}' ) | ( () ( (lv_pathName_22_0= rulePathNameCS ) ) ( ( (lv_atPre_23_0= '@' ) ) otherlv_24= 'pre' )? otherlv_25= '(' ( ( (lv_argument_26_0= ruleNavigatingArgCS ) ) ( (lv_argument_27_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_28_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_29_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_30_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_31_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_32= ')' ) | ( () ( (lv_pathName_34_0= rulePathNameCS ) ) ( ( (lv_atPre_35_0= '@' ) ) otherlv_36= 'pre' )? ) | this_SelfExpCS_37= ruleSelfExpCS | this_PrimitiveLiteralExpCS_38= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_39= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_40= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_41= ruleTypeLiteralExpCS | this_IfExpCS_42= ruleIfExpCS | this_NestedExpCS_43= ruleNestedExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2942:1: ( ( () ( (lv_pathName_1_0= rulePathNameCS ) ) otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? ( ( (lv_atPre_12_0= '@' ) ) otherlv_13= 'pre' )? ) | ( () ( (lv_pathName_15_0= rulePathNameCS ) ) otherlv_16= '{' ( (lv_ownedParts_17_0= ruleConstructorPartCS ) ) (otherlv_18= ',' ( (lv_ownedParts_19_0= ruleConstructorPartCS ) ) )* otherlv_20= '}' ) | ( () ( (lv_pathName_22_0= rulePathNameCS ) ) ( ( (lv_atPre_23_0= '@' ) ) otherlv_24= 'pre' )? otherlv_25= '(' ( ( (lv_argument_26_0= ruleNavigatingArgCS ) ) ( (lv_argument_27_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_28_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_29_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_30_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_31_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_32= ')' ) | ( () ( (lv_pathName_34_0= rulePathNameCS ) ) ( ( (lv_atPre_35_0= '@' ) ) otherlv_36= 'pre' )? ) | this_SelfExpCS_37= ruleSelfExpCS | this_PrimitiveLiteralExpCS_38= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_39= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_40= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_41= ruleTypeLiteralExpCS | this_IfExpCS_42= ruleIfExpCS | this_NestedExpCS_43= ruleNestedExpCS )
            int alt55=11;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2942:2: ( () ( (lv_pathName_1_0= rulePathNameCS ) ) otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? ( ( (lv_atPre_12_0= '@' ) ) otherlv_13= 'pre' )? )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2942:2: ( () ( (lv_pathName_1_0= rulePathNameCS ) ) otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? ( ( (lv_atPre_12_0= '@' ) ) otherlv_13= 'pre' )? )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2942:3: () ( (lv_pathName_1_0= rulePathNameCS ) ) otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? ( ( (lv_atPre_12_0= '@' ) ) otherlv_13= 'pre' )?
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2942:3: ()
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2943:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpCSAccess().getIndexExpCSAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2951:2: ( (lv_pathName_1_0= rulePathNameCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2952:1: (lv_pathName_1_0= rulePathNameCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2952:1: (lv_pathName_1_0= rulePathNameCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2953:3: lv_pathName_1_0= rulePathNameCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPathNamePathNameCSParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_rulePrimaryExpCS7286);
                    lv_pathName_1_0=rulePathNameCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"pathName",
                              		lv_pathName_1_0, 
                              		"PathNameCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,54,FollowSets000.FOLLOW_54_in_rulePrimaryExpCS7298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpCSAccess().getLeftSquareBracketKeyword_0_2());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2973:1: ( (lv_firstIndexes_3_0= ruleExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2974:1: (lv_firstIndexes_3_0= ruleExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2974:1: (lv_firstIndexes_3_0= ruleExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2975:3: lv_firstIndexes_3_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getFirstIndexesExpCSParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_rulePrimaryExpCS7319);
                    lv_firstIndexes_3_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                      	        }
                             		add(
                             			current, 
                             			"firstIndexes",
                              		lv_firstIndexes_3_0, 
                              		"ExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2991:2: (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==57) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2991:4: otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) )
                    	    {
                    	    otherlv_4=(Token)match(input,57,FollowSets000.FOLLOW_57_in_rulePrimaryExpCS7332); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpCSAccess().getCommaKeyword_0_4_0());
                    	          
                    	    }
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2995:1: ( (lv_firstIndexes_5_0= ruleExpCS ) )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2996:1: (lv_firstIndexes_5_0= ruleExpCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2996:1: (lv_firstIndexes_5_0= ruleExpCS )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2997:3: lv_firstIndexes_5_0= ruleExpCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getFirstIndexesExpCSParserRuleCall_0_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_rulePrimaryExpCS7353);
                    	    lv_firstIndexes_5_0=ruleExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"firstIndexes",
                    	              		lv_firstIndexes_5_0, 
                    	              		"ExpCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,55,FollowSets000.FOLLOW_55_in_rulePrimaryExpCS7367); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getPrimaryExpCSAccess().getRightSquareBracketKeyword_0_5());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3017:1: (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==54) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3017:3: otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']'
                            {
                            otherlv_7=(Token)match(input,54,FollowSets000.FOLLOW_54_in_rulePrimaryExpCS7380); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getPrimaryExpCSAccess().getLeftSquareBracketKeyword_0_6_0());
                                  
                            }
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3021:1: ( (lv_secondIndexes_8_0= ruleExpCS ) )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3022:1: (lv_secondIndexes_8_0= ruleExpCS )
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3022:1: (lv_secondIndexes_8_0= ruleExpCS )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3023:3: lv_secondIndexes_8_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSecondIndexesExpCSParserRuleCall_0_6_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_rulePrimaryExpCS7401);
                            lv_secondIndexes_8_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"secondIndexes",
                                      		lv_secondIndexes_8_0, 
                                      		"ExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3039:2: (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )*
                            loop43:
                            do {
                                int alt43=2;
                                int LA43_0 = input.LA(1);

                                if ( (LA43_0==57) ) {
                                    alt43=1;
                                }


                                switch (alt43) {
                            	case 1 :
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3039:4: otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) )
                            	    {
                            	    otherlv_9=(Token)match(input,57,FollowSets000.FOLLOW_57_in_rulePrimaryExpCS7414); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_9, grammarAccess.getPrimaryExpCSAccess().getCommaKeyword_0_6_2_0());
                            	          
                            	    }
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3043:1: ( (lv_secondIndexes_10_0= ruleExpCS ) )
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3044:1: (lv_secondIndexes_10_0= ruleExpCS )
                            	    {
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3044:1: (lv_secondIndexes_10_0= ruleExpCS )
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3045:3: lv_secondIndexes_10_0= ruleExpCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSecondIndexesExpCSParserRuleCall_0_6_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_rulePrimaryExpCS7435);
                            	    lv_secondIndexes_10_0=ruleExpCS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"secondIndexes",
                            	              		lv_secondIndexes_10_0, 
                            	              		"ExpCS");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop43;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,55,FollowSets000.FOLLOW_55_in_rulePrimaryExpCS7449); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getPrimaryExpCSAccess().getRightSquareBracketKeyword_0_6_3());
                                  
                            }

                            }
                            break;

                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3065:3: ( ( (lv_atPre_12_0= '@' ) ) otherlv_13= 'pre' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==65) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3065:4: ( (lv_atPre_12_0= '@' ) ) otherlv_13= 'pre'
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3065:4: ( (lv_atPre_12_0= '@' ) )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3066:1: (lv_atPre_12_0= '@' )
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3066:1: (lv_atPre_12_0= '@' )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3067:3: lv_atPre_12_0= '@'
                            {
                            lv_atPre_12_0=(Token)match(input,65,FollowSets000.FOLLOW_65_in_rulePrimaryExpCS7470); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_atPre_12_0, grammarAccess.getPrimaryExpCSAccess().getAtPreCommercialAtKeyword_0_7_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpCSRule());
                              	        }
                                     		setWithLastConsumed(current, "atPre", true, "@");
                              	    
                            }

                            }


                            }

                            otherlv_13=(Token)match(input,66,FollowSets000.FOLLOW_66_in_rulePrimaryExpCS7495); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_13, grammarAccess.getPrimaryExpCSAccess().getPreKeyword_0_7_1());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3085:6: ( () ( (lv_pathName_15_0= rulePathNameCS ) ) otherlv_16= '{' ( (lv_ownedParts_17_0= ruleConstructorPartCS ) ) (otherlv_18= ',' ( (lv_ownedParts_19_0= ruleConstructorPartCS ) ) )* otherlv_20= '}' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3085:6: ( () ( (lv_pathName_15_0= rulePathNameCS ) ) otherlv_16= '{' ( (lv_ownedParts_17_0= ruleConstructorPartCS ) ) (otherlv_18= ',' ( (lv_ownedParts_19_0= ruleConstructorPartCS ) ) )* otherlv_20= '}' )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3085:7: () ( (lv_pathName_15_0= rulePathNameCS ) ) otherlv_16= '{' ( (lv_ownedParts_17_0= ruleConstructorPartCS ) ) (otherlv_18= ',' ( (lv_ownedParts_19_0= ruleConstructorPartCS ) ) )* otherlv_20= '}'
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3085:7: ()
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3086:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpCSAccess().getConstructorExpCSAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3094:2: ( (lv_pathName_15_0= rulePathNameCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3095:1: (lv_pathName_15_0= rulePathNameCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3095:1: (lv_pathName_15_0= rulePathNameCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3096:3: lv_pathName_15_0= rulePathNameCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPathNamePathNameCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_rulePrimaryExpCS7538);
                    lv_pathName_15_0=rulePathNameCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"pathName",
                              		lv_pathName_15_0, 
                              		"PathNameCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_16=(Token)match(input,59,FollowSets000.FOLLOW_59_in_rulePrimaryExpCS7550); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getPrimaryExpCSAccess().getLeftCurlyBracketKeyword_1_2());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3116:1: ( (lv_ownedParts_17_0= ruleConstructorPartCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3117:1: (lv_ownedParts_17_0= ruleConstructorPartCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3117:1: (lv_ownedParts_17_0= ruleConstructorPartCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3118:3: lv_ownedParts_17_0= ruleConstructorPartCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getOwnedPartsConstructorPartCSParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstructorPartCS_in_rulePrimaryExpCS7571);
                    lv_ownedParts_17_0=ruleConstructorPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedParts",
                              		lv_ownedParts_17_0, 
                              		"ConstructorPartCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3134:2: (otherlv_18= ',' ( (lv_ownedParts_19_0= ruleConstructorPartCS ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==57) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3134:4: otherlv_18= ',' ( (lv_ownedParts_19_0= ruleConstructorPartCS ) )
                    	    {
                    	    otherlv_18=(Token)match(input,57,FollowSets000.FOLLOW_57_in_rulePrimaryExpCS7584); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_18, grammarAccess.getPrimaryExpCSAccess().getCommaKeyword_1_4_0());
                    	          
                    	    }
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3138:1: ( (lv_ownedParts_19_0= ruleConstructorPartCS ) )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3139:1: (lv_ownedParts_19_0= ruleConstructorPartCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3139:1: (lv_ownedParts_19_0= ruleConstructorPartCS )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3140:3: lv_ownedParts_19_0= ruleConstructorPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getOwnedPartsConstructorPartCSParserRuleCall_1_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleConstructorPartCS_in_rulePrimaryExpCS7605);
                    	    lv_ownedParts_19_0=ruleConstructorPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedParts",
                    	              		lv_ownedParts_19_0, 
                    	              		"ConstructorPartCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,60,FollowSets000.FOLLOW_60_in_rulePrimaryExpCS7619); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getPrimaryExpCSAccess().getRightCurlyBracketKeyword_1_5());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3161:6: ( () ( (lv_pathName_22_0= rulePathNameCS ) ) ( ( (lv_atPre_23_0= '@' ) ) otherlv_24= 'pre' )? otherlv_25= '(' ( ( (lv_argument_26_0= ruleNavigatingArgCS ) ) ( (lv_argument_27_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_28_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_29_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_30_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_31_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_32= ')' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3161:6: ( () ( (lv_pathName_22_0= rulePathNameCS ) ) ( ( (lv_atPre_23_0= '@' ) ) otherlv_24= 'pre' )? otherlv_25= '(' ( ( (lv_argument_26_0= ruleNavigatingArgCS ) ) ( (lv_argument_27_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_28_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_29_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_30_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_31_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_32= ')' )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3161:7: () ( (lv_pathName_22_0= rulePathNameCS ) ) ( ( (lv_atPre_23_0= '@' ) ) otherlv_24= 'pre' )? otherlv_25= '(' ( ( (lv_argument_26_0= ruleNavigatingArgCS ) ) ( (lv_argument_27_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_28_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_29_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_30_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_31_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_32= ')'
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3161:7: ()
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3162:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpCSAccess().getInvocationExpCSAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3170:2: ( (lv_pathName_22_0= rulePathNameCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3171:1: (lv_pathName_22_0= rulePathNameCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3171:1: (lv_pathName_22_0= rulePathNameCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3172:3: lv_pathName_22_0= rulePathNameCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPathNamePathNameCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_rulePrimaryExpCS7660);
                    lv_pathName_22_0=rulePathNameCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"pathName",
                              		lv_pathName_22_0, 
                              		"PathNameCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3188:2: ( ( (lv_atPre_23_0= '@' ) ) otherlv_24= 'pre' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==65) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3188:3: ( (lv_atPre_23_0= '@' ) ) otherlv_24= 'pre'
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3188:3: ( (lv_atPre_23_0= '@' ) )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3189:1: (lv_atPre_23_0= '@' )
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3189:1: (lv_atPre_23_0= '@' )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3190:3: lv_atPre_23_0= '@'
                            {
                            lv_atPre_23_0=(Token)match(input,65,FollowSets000.FOLLOW_65_in_rulePrimaryExpCS7679); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_atPre_23_0, grammarAccess.getPrimaryExpCSAccess().getAtPreCommercialAtKeyword_2_2_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpCSRule());
                              	        }
                                     		setWithLastConsumed(current, "atPre", true, "@");
                              	    
                            }

                            }


                            }

                            otherlv_24=(Token)match(input,66,FollowSets000.FOLLOW_66_in_rulePrimaryExpCS7704); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_24, grammarAccess.getPrimaryExpCSAccess().getPreKeyword_2_2_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_25=(Token)match(input,51,FollowSets000.FOLLOW_51_in_rulePrimaryExpCS7718); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getPrimaryExpCSAccess().getLeftParenthesisKeyword_2_3());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3211:1: ( ( (lv_argument_26_0= ruleNavigatingArgCS ) ) ( (lv_argument_27_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_28_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_29_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_30_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_31_0= ruleNavigatingCommaArgCS ) )* )? )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( ((LA53_0>=RULE_SIMPLE_ID && LA53_0<=RULE_SINGLE_QUOTED_STRING)||LA53_0==17||(LA53_0>=19 && LA53_0<=20)||(LA53_0>=22 && LA53_0<=23)||LA53_0==36||(LA53_0>=38 && LA53_0<=51)||(LA53_0>=61 && LA53_0<=64)||LA53_0==69||LA53_0==73||LA53_0==75) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3211:2: ( (lv_argument_26_0= ruleNavigatingArgCS ) ) ( (lv_argument_27_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_28_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_29_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_30_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_31_0= ruleNavigatingCommaArgCS ) )* )?
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3211:2: ( (lv_argument_26_0= ruleNavigatingArgCS ) )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3212:1: (lv_argument_26_0= ruleNavigatingArgCS )
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3212:1: (lv_argument_26_0= ruleNavigatingArgCS )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3213:3: lv_argument_26_0= ruleNavigatingArgCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingArgCSParserRuleCall_2_4_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCS_in_rulePrimaryExpCS7740);
                            lv_argument_26_0=ruleNavigatingArgCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"argument",
                                      		lv_argument_26_0, 
                                      		"NavigatingArgCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3229:2: ( (lv_argument_27_0= ruleNavigatingCommaArgCS ) )*
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==57) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                            	case 1 :
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3230:1: (lv_argument_27_0= ruleNavigatingCommaArgCS )
                            	    {
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3230:1: (lv_argument_27_0= ruleNavigatingCommaArgCS )
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3231:3: lv_argument_27_0= ruleNavigatingCommaArgCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_2_4_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS7761);
                            	    lv_argument_27_0=ruleNavigatingCommaArgCS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"argument",
                            	              		lv_argument_27_0, 
                            	              		"NavigatingCommaArgCS");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop48;
                                }
                            } while (true);

                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3247:3: ( ( (lv_argument_28_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_29_0= ruleNavigatingCommaArgCS ) )* )?
                            int alt50=2;
                            int LA50_0 = input.LA(1);

                            if ( (LA50_0==68) ) {
                                alt50=1;
                            }
                            switch (alt50) {
                                case 1 :
                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3247:4: ( (lv_argument_28_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_29_0= ruleNavigatingCommaArgCS ) )*
                                    {
                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3247:4: ( (lv_argument_28_0= ruleNavigatingSemiArgCS ) )
                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3248:1: (lv_argument_28_0= ruleNavigatingSemiArgCS )
                                    {
                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3248:1: (lv_argument_28_0= ruleNavigatingSemiArgCS )
                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3249:3: lv_argument_28_0= ruleNavigatingSemiArgCS
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingSemiArgCSParserRuleCall_2_4_2_0_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingSemiArgCS_in_rulePrimaryExpCS7784);
                                    lv_argument_28_0=ruleNavigatingSemiArgCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                                      	        }
                                             		add(
                                             			current, 
                                             			"argument",
                                              		lv_argument_28_0, 
                                              		"NavigatingSemiArgCS");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }

                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3265:2: ( (lv_argument_29_0= ruleNavigatingCommaArgCS ) )*
                                    loop49:
                                    do {
                                        int alt49=2;
                                        int LA49_0 = input.LA(1);

                                        if ( (LA49_0==57) ) {
                                            alt49=1;
                                        }


                                        switch (alt49) {
                                    	case 1 :
                                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3266:1: (lv_argument_29_0= ruleNavigatingCommaArgCS )
                                    	    {
                                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3266:1: (lv_argument_29_0= ruleNavigatingCommaArgCS )
                                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3267:3: lv_argument_29_0= ruleNavigatingCommaArgCS
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_2_4_2_1_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS7805);
                                    	    lv_argument_29_0=ruleNavigatingCommaArgCS();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      	        if (current==null) {
                                    	      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                                    	      	        }
                                    	             		add(
                                    	             			current, 
                                    	             			"argument",
                                    	              		lv_argument_29_0, 
                                    	              		"NavigatingCommaArgCS");
                                    	      	        afterParserOrEnumRuleCall();
                                    	      	    
                                    	    }

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop49;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3283:5: ( ( (lv_argument_30_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_31_0= ruleNavigatingCommaArgCS ) )* )?
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==67) ) {
                                alt52=1;
                            }
                            switch (alt52) {
                                case 1 :
                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3283:6: ( (lv_argument_30_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_31_0= ruleNavigatingCommaArgCS ) )*
                                    {
                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3283:6: ( (lv_argument_30_0= ruleNavigatingBarArgCS ) )
                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3284:1: (lv_argument_30_0= ruleNavigatingBarArgCS )
                                    {
                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3284:1: (lv_argument_30_0= ruleNavigatingBarArgCS )
                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3285:3: lv_argument_30_0= ruleNavigatingBarArgCS
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingBarArgCSParserRuleCall_2_4_3_0_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingBarArgCS_in_rulePrimaryExpCS7830);
                                    lv_argument_30_0=ruleNavigatingBarArgCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                                      	        }
                                             		add(
                                             			current, 
                                             			"argument",
                                              		lv_argument_30_0, 
                                              		"NavigatingBarArgCS");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }

                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3301:2: ( (lv_argument_31_0= ruleNavigatingCommaArgCS ) )*
                                    loop51:
                                    do {
                                        int alt51=2;
                                        int LA51_0 = input.LA(1);

                                        if ( (LA51_0==57) ) {
                                            alt51=1;
                                        }


                                        switch (alt51) {
                                    	case 1 :
                                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3302:1: (lv_argument_31_0= ruleNavigatingCommaArgCS )
                                    	    {
                                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3302:1: (lv_argument_31_0= ruleNavigatingCommaArgCS )
                                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3303:3: lv_argument_31_0= ruleNavigatingCommaArgCS
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_2_4_3_1_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS7851);
                                    	    lv_argument_31_0=ruleNavigatingCommaArgCS();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      	        if (current==null) {
                                    	      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                                    	      	        }
                                    	             		add(
                                    	             			current, 
                                    	             			"argument",
                                    	              		lv_argument_31_0, 
                                    	              		"NavigatingCommaArgCS");
                                    	      	        afterParserOrEnumRuleCall();
                                    	      	    
                                    	    }

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop51;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_32=(Token)match(input,52,FollowSets000.FOLLOW_52_in_rulePrimaryExpCS7868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getPrimaryExpCSAccess().getRightParenthesisKeyword_2_5());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3324:6: ( () ( (lv_pathName_34_0= rulePathNameCS ) ) ( ( (lv_atPre_35_0= '@' ) ) otherlv_36= 'pre' )? )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3324:6: ( () ( (lv_pathName_34_0= rulePathNameCS ) ) ( ( (lv_atPre_35_0= '@' ) ) otherlv_36= 'pre' )? )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3324:7: () ( (lv_pathName_34_0= rulePathNameCS ) ) ( ( (lv_atPre_35_0= '@' ) ) otherlv_36= 'pre' )?
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3324:7: ()
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3325:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpCSAccess().getNameExpCSAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3333:2: ( (lv_pathName_34_0= rulePathNameCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3334:1: (lv_pathName_34_0= rulePathNameCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3334:1: (lv_pathName_34_0= rulePathNameCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3335:3: lv_pathName_34_0= rulePathNameCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPathNamePathNameCSParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_rulePrimaryExpCS7909);
                    lv_pathName_34_0=rulePathNameCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"pathName",
                              		lv_pathName_34_0, 
                              		"PathNameCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3351:2: ( ( (lv_atPre_35_0= '@' ) ) otherlv_36= 'pre' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==65) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3351:3: ( (lv_atPre_35_0= '@' ) ) otherlv_36= 'pre'
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3351:3: ( (lv_atPre_35_0= '@' ) )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3352:1: (lv_atPre_35_0= '@' )
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3352:1: (lv_atPre_35_0= '@' )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3353:3: lv_atPre_35_0= '@'
                            {
                            lv_atPre_35_0=(Token)match(input,65,FollowSets000.FOLLOW_65_in_rulePrimaryExpCS7928); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_atPre_35_0, grammarAccess.getPrimaryExpCSAccess().getAtPreCommercialAtKeyword_3_2_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpCSRule());
                              	        }
                                     		setWithLastConsumed(current, "atPre", true, "@");
                              	    
                            }

                            }


                            }

                            otherlv_36=(Token)match(input,66,FollowSets000.FOLLOW_66_in_rulePrimaryExpCS7953); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_36, grammarAccess.getPrimaryExpCSAccess().getPreKeyword_3_2_1());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3372:2: this_SelfExpCS_37= ruleSelfExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSelfExpCSParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSelfExpCS_in_rulePrimaryExpCS7987);
                    this_SelfExpCS_37=ruleSelfExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SelfExpCS_37; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3385:2: this_PrimitiveLiteralExpCS_38= rulePrimitiveLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPrimitiveLiteralExpCSParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveLiteralExpCS_in_rulePrimaryExpCS8017);
                    this_PrimitiveLiteralExpCS_38=rulePrimitiveLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimitiveLiteralExpCS_38; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3398:2: this_TupleLiteralExpCS_39= ruleTupleLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTupleLiteralExpCSParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_rulePrimaryExpCS8047);
                    this_TupleLiteralExpCS_39=ruleTupleLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TupleLiteralExpCS_39; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3411:2: this_CollectionLiteralExpCS_40= ruleCollectionLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getCollectionLiteralExpCSParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_rulePrimaryExpCS8077);
                    this_CollectionLiteralExpCS_40=ruleCollectionLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CollectionLiteralExpCS_40; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3424:2: this_TypeLiteralExpCS_41= ruleTypeLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTypeLiteralExpCSParserRuleCall_8()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_rulePrimaryExpCS8107);
                    this_TypeLiteralExpCS_41=ruleTypeLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeLiteralExpCS_41; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3437:2: this_IfExpCS_42= ruleIfExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getIfExpCSParserRuleCall_9()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIfExpCS_in_rulePrimaryExpCS8137);
                    this_IfExpCS_42=ruleIfExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfExpCS_42; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3450:2: this_NestedExpCS_43= ruleNestedExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNestedExpCSParserRuleCall_10()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNestedExpCS_in_rulePrimaryExpCS8167);
                    this_NestedExpCS_43=ruleNestedExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NestedExpCS_43; 
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
    // $ANTLR end "rulePrimaryExpCS"


    // $ANTLR start "entryRulePrimaryExpOrLetExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3469:1: entryRulePrimaryExpOrLetExpCS returns [EObject current=null] : iv_rulePrimaryExpOrLetExpCS= rulePrimaryExpOrLetExpCS EOF ;
    public final EObject entryRulePrimaryExpOrLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpOrLetExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3470:2: (iv_rulePrimaryExpOrLetExpCS= rulePrimaryExpOrLetExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3471:2: iv_rulePrimaryExpOrLetExpCS= rulePrimaryExpOrLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpOrLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpOrLetExpCS_in_entryRulePrimaryExpOrLetExpCS8202);
            iv_rulePrimaryExpOrLetExpCS=rulePrimaryExpOrLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpOrLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpOrLetExpCS8212); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpOrLetExpCS"


    // $ANTLR start "rulePrimaryExpOrLetExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3478:1: rulePrimaryExpOrLetExpCS returns [EObject current=null] : (this_PrimaryExpCS_0= rulePrimaryExpCS | this_LetExpCS_1= ruleLetExpCS ) ;
    public final EObject rulePrimaryExpOrLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpCS_0 = null;

        EObject this_LetExpCS_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3481:28: ( (this_PrimaryExpCS_0= rulePrimaryExpCS | this_LetExpCS_1= ruleLetExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3482:1: (this_PrimaryExpCS_0= rulePrimaryExpCS | this_LetExpCS_1= ruleLetExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3482:1: (this_PrimaryExpCS_0= rulePrimaryExpCS | this_LetExpCS_1= ruleLetExpCS )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_SIMPLE_ID && LA56_0<=RULE_SINGLE_QUOTED_STRING)||LA56_0==17||(LA56_0>=19 && LA56_0<=20)||LA56_0==36||(LA56_0>=38 && LA56_0<=51)||(LA56_0>=61 && LA56_0<=64)||LA56_0==69||LA56_0==75) ) {
                alt56=1;
            }
            else if ( (LA56_0==73) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3483:2: this_PrimaryExpCS_0= rulePrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpOrLetExpCSAccess().getPrimaryExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_rulePrimaryExpOrLetExpCS8262);
                    this_PrimaryExpCS_0=rulePrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimaryExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3496:2: this_LetExpCS_1= ruleLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpOrLetExpCSAccess().getLetExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_rulePrimaryExpOrLetExpCS8292);
                    this_LetExpCS_1=ruleLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LetExpCS_1; 
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
    // $ANTLR end "rulePrimaryExpOrLetExpCS"


    // $ANTLR start "entryRuleNavigatingArgCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3515:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3516:2: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3517:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCS_in_entryRuleNavigatingArgCS8327);
            iv_ruleNavigatingArgCS=ruleNavigatingArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgCS8337); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingArgCS"


    // $ANTLR start "ruleNavigatingArgCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3524:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_init_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3527:28: ( ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3528:1: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3528:1: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3528:2: ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )?
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3528:2: ( (lv_name_0_0= ruleNavigatingArgExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3529:1: (lv_name_0_0= ruleNavigatingArgExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3529:1: (lv_name_0_0= ruleNavigatingArgExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3530:3: lv_name_0_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCS8383);
            lv_name_0_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"NavigatingArgExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3546:2: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==58) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3546:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )?
                    {
                    otherlv_1=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleNavigatingArgCS8396); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3550:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3551:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3551:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3552:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS8417);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_2_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3568:2: (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==29) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3568:4: otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) )
                            {
                            otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleNavigatingArgCS8430); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_1_2_0());
                                  
                            }
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3572:1: ( (lv_init_4_0= ruleExpCS ) )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3573:1: (lv_init_4_0= ruleExpCS )
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3573:1: (lv_init_4_0= ruleExpCS )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3574:3: lv_init_4_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getInitExpCSParserRuleCall_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgCS8451);
                            lv_init_4_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"init",
                                      		lv_init_4_0, 
                                      		"ExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleNavigatingArgCS"


    // $ANTLR start "entryRuleNavigatingBarArgCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3598:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3599:2: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3600:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingBarArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingBarArgCS_in_entryRuleNavigatingBarArgCS8491);
            iv_ruleNavigatingBarArgCS=ruleNavigatingBarArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingBarArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingBarArgCS8501); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingBarArgCS"


    // $ANTLR start "ruleNavigatingBarArgCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3607:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_name_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_init_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3610:28: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3611:1: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3611:1: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3611:2: ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3611:2: ( (lv_prefix_0_0= '|' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3612:1: (lv_prefix_0_0= '|' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3612:1: (lv_prefix_0_0= '|' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3613:3: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleNavigatingBarArgCS8544); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingBarArgCSAccess().getPrefixVerticalLineKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNavigatingBarArgCSRule());
              	        }
                     		setWithLastConsumed(current, "prefix", lv_prefix_0_0, "|");
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3626:2: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3627:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3627:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3628:3: lv_name_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingBarArgCS8578);
            lv_name_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"NavigatingArgExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3644:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==58) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3644:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleNavigatingBarArgCS8591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingBarArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3648:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3649:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3649:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3650:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingBarArgCS8612);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_3_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3666:2: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==29) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3666:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleNavigatingBarArgCS8625); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingBarArgCSAccess().getEqualsSignKeyword_2_2_0());
                                  
                            }
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3670:1: ( (lv_init_5_0= ruleExpCS ) )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3671:1: (lv_init_5_0= ruleExpCS )
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3671:1: (lv_init_5_0= ruleExpCS )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3672:3: lv_init_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getInitExpCSParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingBarArgCS8646);
                            lv_init_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"init",
                                      		lv_init_5_0, 
                                      		"ExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleNavigatingBarArgCS"


    // $ANTLR start "entryRuleNavigatingCommaArgCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3696:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3697:2: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3698:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingCommaArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_entryRuleNavigatingCommaArgCS8686);
            iv_ruleNavigatingCommaArgCS=ruleNavigatingCommaArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingCommaArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingCommaArgCS8696); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingCommaArgCS"


    // $ANTLR start "ruleNavigatingCommaArgCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3705:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_name_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_init_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3708:28: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3709:1: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3709:1: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3709:2: ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3709:2: ( (lv_prefix_0_0= ',' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3710:1: (lv_prefix_0_0= ',' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3710:1: (lv_prefix_0_0= ',' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3711:3: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleNavigatingCommaArgCS8739); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingCommaArgCSAccess().getPrefixCommaKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
              	        }
                     		setWithLastConsumed(current, "prefix", lv_prefix_0_0, ",");
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3724:2: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3725:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3725:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3726:3: lv_name_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingCommaArgCS8773);
            lv_name_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"NavigatingArgExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3742:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==58) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3742:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleNavigatingCommaArgCS8786); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3746:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3747:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3747:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3748:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingCommaArgCS8807);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_3_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3764:2: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==29) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3764:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleNavigatingCommaArgCS8820); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_2_2_0());
                                  
                            }
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3768:1: ( (lv_init_5_0= ruleExpCS ) )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3769:1: (lv_init_5_0= ruleExpCS )
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3769:1: (lv_init_5_0= ruleExpCS )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3770:3: lv_init_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getInitExpCSParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS8841);
                            lv_init_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"init",
                                      		lv_init_5_0, 
                                      		"ExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleNavigatingCommaArgCS"


    // $ANTLR start "entryRuleNavigatingSemiArgCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3794:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3795:2: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3796:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingSemiArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingSemiArgCS_in_entryRuleNavigatingSemiArgCS8881);
            iv_ruleNavigatingSemiArgCS=ruleNavigatingSemiArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingSemiArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingSemiArgCS8891); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingSemiArgCS"


    // $ANTLR start "ruleNavigatingSemiArgCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3803:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_name_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_init_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3806:28: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3807:1: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3807:1: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3807:2: ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3807:2: ( (lv_prefix_0_0= ';' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3808:1: (lv_prefix_0_0= ';' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3808:1: (lv_prefix_0_0= ';' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3809:3: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleNavigatingSemiArgCS8934); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingSemiArgCSAccess().getPrefixSemicolonKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNavigatingSemiArgCSRule());
              	        }
                     		setWithLastConsumed(current, "prefix", lv_prefix_0_0, ";");
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3822:2: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3823:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3823:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3824:3: lv_name_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingSemiArgCS8968);
            lv_name_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"NavigatingArgExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3840:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==58) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3840:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleNavigatingSemiArgCS8981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingSemiArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3844:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3845:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3845:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3846:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingSemiArgCS9002);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_3_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3862:2: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==29) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3862:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleNavigatingSemiArgCS9015); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingSemiArgCSAccess().getEqualsSignKeyword_2_2_0());
                                  
                            }
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3866:1: ( (lv_init_5_0= ruleExpCS ) )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3867:1: (lv_init_5_0= ruleExpCS )
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3867:1: (lv_init_5_0= ruleExpCS )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3868:3: lv_init_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getInitExpCSParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingSemiArgCS9036);
                            lv_init_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"init",
                                      		lv_init_5_0, 
                                      		"ExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleNavigatingSemiArgCS"


    // $ANTLR start "entryRuleNavigatingArgExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3892:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3893:2: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3894:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_entryRuleNavigatingArgExpCS9076);
            iv_ruleNavigatingArgExpCS=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgExpCS9086); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingArgExpCS"


    // $ANTLR start "ruleNavigatingArgExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3901:1: ruleNavigatingArgExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3904:28: (this_ExpCS_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3906:2: this_ExpCS_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNavigatingArgExpCSAccess().getExpCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgExpCS9135);
            this_ExpCS_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpCS_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleNavigatingArgExpCS"


    // $ANTLR start "entryRuleIfExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3925:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3926:2: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3927:2: iv_ruleIfExpCS= ruleIfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIfExpCS_in_entryRuleIfExpCS9169);
            iv_ruleIfExpCS=ruleIfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfExpCS9179); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfExpCS"


    // $ANTLR start "ruleIfExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3934:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' ) ;
    public final EObject ruleIfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_1_0 = null;

        EObject lv_thenExpression_3_0 = null;

        EObject lv_elseExpression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3937:28: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3938:1: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3938:1: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3938:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif'
            {
            otherlv_0=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleIfExpCS9216); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3942:1: ( (lv_condition_1_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3943:1: (lv_condition_1_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3943:1: (lv_condition_1_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3944:3: lv_condition_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getConditionExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS9237);
            lv_condition_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_1_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleIfExpCS9249); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3964:1: ( (lv_thenExpression_3_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3965:1: (lv_thenExpression_3_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3965:1: (lv_thenExpression_3_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3966:3: lv_thenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getThenExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS9270);
            lv_thenExpression_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"thenExpression",
                      		lv_thenExpression_3_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleIfExpCS9282); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getIfExpCSAccess().getElseKeyword_4());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3986:1: ( (lv_elseExpression_5_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3987:1: (lv_elseExpression_5_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3987:1: (lv_elseExpression_5_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3988:3: lv_elseExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getElseExpressionExpCSParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS9303);
            lv_elseExpression_5_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"elseExpression",
                      		lv_elseExpression_5_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleIfExpCS9315); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getIfExpCSAccess().getEndifKeyword_6());
                  
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
    // $ANTLR end "ruleIfExpCS"


    // $ANTLR start "entryRuleLetExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4016:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4017:2: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4018:2: iv_ruleLetExpCS= ruleLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_entryRuleLetExpCS9351);
            iv_ruleLetExpCS=ruleLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetExpCS9361); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLetExpCS"


    // $ANTLR start "ruleLetExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4025:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variable_1_0 = null;

        EObject lv_variable_3_0 = null;

        EObject lv_in_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4028:28: ( (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4029:1: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4029:1: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4029:3: otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleLetExpCS9398); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4033:1: ( (lv_variable_1_0= ruleLetVariableCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4034:1: (lv_variable_1_0= ruleLetVariableCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4034:1: (lv_variable_1_0= ruleLetVariableCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4035:3: lv_variable_1_0= ruleLetVariableCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_ruleLetExpCS9419);
            lv_variable_1_0=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetExpCSRule());
              	        }
                     		add(
                     			current, 
                     			"variable",
                      		lv_variable_1_0, 
                      		"LetVariableCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4051:2: (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==57) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4051:4: otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleLetExpCS9432); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4055:1: ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4056:1: (lv_variable_3_0= ruleLetVariableCS )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4056:1: (lv_variable_3_0= ruleLetVariableCS )
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4057:3: lv_variable_3_0= ruleLetVariableCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_ruleLetExpCS9453);
            	    lv_variable_3_0=ruleLetVariableCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLetExpCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variable",
            	              		lv_variable_3_0, 
            	              		"LetVariableCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            otherlv_4=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleLetExpCS9467); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4077:1: ( (lv_in_5_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4078:1: (lv_in_5_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4078:1: (lv_in_5_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4079:3: lv_in_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpCSAccess().getInExpCSParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLetExpCS9488);
            lv_in_5_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"in",
                      		lv_in_5_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
    // $ANTLR end "ruleLetExpCS"


    // $ANTLR start "entryRuleLetVariableCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4103:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4104:2: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4105:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetVariableCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_entryRuleLetVariableCS9524);
            iv_ruleLetVariableCS=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetVariableCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetVariableCS9534); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLetVariableCS"


    // $ANTLR start "ruleLetVariableCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4112:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4115:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4116:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4116:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4116:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4116:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4117:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4117:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4118:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleLetVariableCS9580);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"UnrestrictedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4134:2: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==58) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4134:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleLetVariableCS9593); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLetVariableCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4138:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4139:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4139:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4140:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleLetVariableCS9614);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_2_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleLetVariableCS9628); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_2());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4160:1: ( (lv_initExpression_4_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4161:1: (lv_initExpression_4_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4161:1: (lv_initExpression_4_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4162:3: lv_initExpression_4_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getInitExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLetVariableCS9649);
            lv_initExpression_4_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
              	        }
                     		set(
                     			current, 
                     			"initExpression",
                      		lv_initExpression_4_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
    // $ANTLR end "ruleLetVariableCS"


    // $ANTLR start "entryRuleNestedExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4186:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4187:2: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4188:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNestedExpCS_in_entryRuleNestedExpCS9685);
            iv_ruleNestedExpCS=ruleNestedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNestedExpCS9695); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNestedExpCS"


    // $ANTLR start "ruleNestedExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4195:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_source_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4198:28: ( (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4199:1: (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4199:1: (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4199:3: otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleNestedExpCS9732); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4203:1: ( (lv_source_1_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4204:1: (lv_source_1_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4204:1: (lv_source_1_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4205:3: lv_source_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNestedExpCSAccess().getSourceExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNestedExpCS9753);
            lv_source_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNestedExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"source",
                      		lv_source_1_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleNestedExpCS9765); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNestedExpCSAccess().getRightParenthesisKeyword_2());
                  
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
    // $ANTLR end "ruleNestedExpCS"


    // $ANTLR start "entryRuleSelfExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4233:1: entryRuleSelfExpCS returns [EObject current=null] : iv_ruleSelfExpCS= ruleSelfExpCS EOF ;
    public final EObject entryRuleSelfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4234:2: (iv_ruleSelfExpCS= ruleSelfExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4235:2: iv_ruleSelfExpCS= ruleSelfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSelfExpCS_in_entryRuleSelfExpCS9801);
            iv_ruleSelfExpCS=ruleSelfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelfExpCS9811); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelfExpCS"


    // $ANTLR start "ruleSelfExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4242:1: ruleSelfExpCS returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4245:28: ( ( () otherlv_1= 'self' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4246:1: ( () otherlv_1= 'self' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4246:1: ( () otherlv_1= 'self' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4246:2: () otherlv_1= 'self'
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4246:2: ()
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:4247:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSelfExpCSAccess().getSelfExpCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleSelfExpCS9860); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelfExpCSAccess().getSelfKeyword_1());
                  
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
    // $ANTLR end "ruleSelfExpCS"

    // $ANTLR start synpred3_InternalEssentialOCL
    public final void synpred3_InternalEssentialOCL_fragment() throws RecognitionException {   
        Token kw=null;
        Token this_INT_2=null;

        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:232:2: (kw= '.' this_INT_2= RULE_INT )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:232:2: kw= '.' this_INT_2= RULE_INT
        {
        kw=(Token)match(input,18,FollowSets000.FOLLOW_18_in_synpred3_InternalEssentialOCL576); if (state.failed) return ;
        this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_synpred3_InternalEssentialOCL591); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalEssentialOCL

    // $ANTLR start synpred64_InternalEssentialOCL
    public final void synpred64_InternalEssentialOCL_fragment() throws RecognitionException {   
        EObject lv_ownedExpression_3_0 = null;

        EObject lv_ownedOperator_4_0 = null;


        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2487:3: ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2487:3: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2487:3: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2488:1: (lv_ownedExpression_3_0= rulePrefixedExpCS )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2488:1: (lv_ownedExpression_3_0= rulePrefixedExpCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2489:3: lv_ownedExpression_3_0= rulePrefixedExpCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_0_3_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_synpred64_InternalEssentialOCL6332);
        lv_ownedExpression_3_0=rulePrefixedExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2505:2: ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2506:1: (lv_ownedOperator_4_0= ruleBinaryOperatorCS )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2506:1: (lv_ownedOperator_4_0= ruleBinaryOperatorCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2507:3: lv_ownedOperator_4_0= ruleBinaryOperatorCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_0_3_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_synpred64_InternalEssentialOCL6353);
        lv_ownedOperator_4_0=ruleBinaryOperatorCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred64_InternalEssentialOCL

    // $ANTLR start synpred65_InternalEssentialOCL
    public final void synpred65_InternalEssentialOCL_fragment() throws RecognitionException {   
        EObject lv_ownedExpression_1_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;

        EObject lv_ownedOperator_4_0 = null;

        EObject lv_ownedExpression_5_0 = null;


        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2442:2: ( ( () ( (lv_ownedExpression_1_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) )* ( (lv_ownedExpression_5_0= rulePrefixedExpOrLetExpCS ) ) ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2442:2: ( () ( (lv_ownedExpression_1_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) )* ( (lv_ownedExpression_5_0= rulePrefixedExpOrLetExpCS ) ) )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2442:2: ( () ( (lv_ownedExpression_1_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) )* ( (lv_ownedExpression_5_0= rulePrefixedExpOrLetExpCS ) ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2442:3: () ( (lv_ownedExpression_1_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) )* ( (lv_ownedExpression_5_0= rulePrefixedExpOrLetExpCS ) )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2442:3: ()
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2443:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2451:2: ( (lv_ownedExpression_1_0= rulePrefixedExpCS ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2452:1: (lv_ownedExpression_1_0= rulePrefixedExpCS )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2452:1: (lv_ownedExpression_1_0= rulePrefixedExpCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2453:3: lv_ownedExpression_1_0= rulePrefixedExpCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_0_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_synpred65_InternalEssentialOCL6289);
        lv_ownedExpression_1_0=rulePrefixedExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2469:2: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2470:1: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2470:1: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2471:3: lv_ownedOperator_2_0= ruleBinaryOperatorCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_0_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_synpred65_InternalEssentialOCL6310);
        lv_ownedOperator_2_0=ruleBinaryOperatorCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2487:2: ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) )*
        loop73:
        do {
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
        	case 1 :
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2487:3: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) )
        	    {
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2487:3: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2488:1: (lv_ownedExpression_3_0= rulePrefixedExpCS )
        	    {
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2488:1: (lv_ownedExpression_3_0= rulePrefixedExpCS )
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2489:3: lv_ownedExpression_3_0= rulePrefixedExpCS
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_0_3_0_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_synpred65_InternalEssentialOCL6332);
        	    lv_ownedExpression_3_0=rulePrefixedExpCS();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }

        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2505:2: ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) )
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2506:1: (lv_ownedOperator_4_0= ruleBinaryOperatorCS )
        	    {
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2506:1: (lv_ownedOperator_4_0= ruleBinaryOperatorCS )
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2507:3: lv_ownedOperator_4_0= ruleBinaryOperatorCS
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_0_3_1_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_synpred65_InternalEssentialOCL6353);
        	    lv_ownedOperator_4_0=ruleBinaryOperatorCS();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop73;
            }
        } while (true);

        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2523:4: ( (lv_ownedExpression_5_0= rulePrefixedExpOrLetExpCS ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2524:1: (lv_ownedExpression_5_0= rulePrefixedExpOrLetExpCS )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2524:1: (lv_ownedExpression_5_0= rulePrefixedExpOrLetExpCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2525:3: lv_ownedExpression_5_0= rulePrefixedExpOrLetExpCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionPrefixedExpOrLetExpCSParserRuleCall_0_4_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulePrefixedExpOrLetExpCS_in_synpred65_InternalEssentialOCL6376);
        lv_ownedExpression_5_0=rulePrefixedExpOrLetExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred65_InternalEssentialOCL

    // $ANTLR start synpred67_InternalEssentialOCL
    public final void synpred67_InternalEssentialOCL_fragment() throws RecognitionException {   
        EObject lv_ownedOperator_7_0 = null;

        EObject lv_ownedExpression_8_0 = null;


        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2542:6: ( ( () ( (lv_ownedOperator_7_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_8_0= rulePrimaryExpOrLetExpCS ) ) ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2542:6: ( () ( (lv_ownedOperator_7_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_8_0= rulePrimaryExpOrLetExpCS ) ) )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2542:6: ( () ( (lv_ownedOperator_7_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_8_0= rulePrimaryExpOrLetExpCS ) ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2542:7: () ( (lv_ownedOperator_7_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_8_0= rulePrimaryExpOrLetExpCS ) )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2542:7: ()
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2543:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2551:2: ( (lv_ownedOperator_7_0= ruleUnaryOperatorCS ) )+
        int cnt74=0;
        loop74:
        do {
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=22 && LA74_0<=23)) ) {
                alt74=1;
            }


            switch (alt74) {
        	case 1 :
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2552:1: (lv_ownedOperator_7_0= ruleUnaryOperatorCS )
        	    {
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2552:1: (lv_ownedOperator_7_0= ruleUnaryOperatorCS )
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2553:3: lv_ownedOperator_7_0= ruleUnaryOperatorCS
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedOperatorUnaryOperatorCSParserRuleCall_1_1_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorCS_in_synpred67_InternalEssentialOCL6417);
        	    lv_ownedOperator_7_0=ruleUnaryOperatorCS();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt74 >= 1 ) break loop74;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(74, input);
                    throw eee;
            }
            cnt74++;
        } while (true);

        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2569:3: ( (lv_ownedExpression_8_0= rulePrimaryExpOrLetExpCS ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2570:1: (lv_ownedExpression_8_0= rulePrimaryExpOrLetExpCS )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2570:1: (lv_ownedExpression_8_0= rulePrimaryExpOrLetExpCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2571:3: lv_ownedExpression_8_0= rulePrimaryExpOrLetExpCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionPrimaryExpOrLetExpCSParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulePrimaryExpOrLetExpCS_in_synpred67_InternalEssentialOCL6439);
        lv_ownedExpression_8_0=rulePrimaryExpOrLetExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred67_InternalEssentialOCL

    // $ANTLR start synpred77_InternalEssentialOCL
    public final void synpred77_InternalEssentialOCL_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_atPre_12_0=null;
        Token otherlv_13=null;
        EObject lv_pathName_1_0 = null;

        EObject lv_firstIndexes_3_0 = null;

        EObject lv_firstIndexes_5_0 = null;

        EObject lv_secondIndexes_8_0 = null;

        EObject lv_secondIndexes_10_0 = null;


        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2942:2: ( ( () ( (lv_pathName_1_0= rulePathNameCS ) ) otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? ( ( (lv_atPre_12_0= '@' ) ) otherlv_13= 'pre' )? ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2942:2: ( () ( (lv_pathName_1_0= rulePathNameCS ) ) otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? ( ( (lv_atPre_12_0= '@' ) ) otherlv_13= 'pre' )? )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2942:2: ( () ( (lv_pathName_1_0= rulePathNameCS ) ) otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? ( ( (lv_atPre_12_0= '@' ) ) otherlv_13= 'pre' )? )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2942:3: () ( (lv_pathName_1_0= rulePathNameCS ) ) otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? ( ( (lv_atPre_12_0= '@' ) ) otherlv_13= 'pre' )?
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2942:3: ()
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2943:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2951:2: ( (lv_pathName_1_0= rulePathNameCS ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2952:1: (lv_pathName_1_0= rulePathNameCS )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2952:1: (lv_pathName_1_0= rulePathNameCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2953:3: lv_pathName_1_0= rulePathNameCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPathNamePathNameCSParserRuleCall_0_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_synpred77_InternalEssentialOCL7286);
        lv_pathName_1_0=rulePathNameCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,54,FollowSets000.FOLLOW_54_in_synpred77_InternalEssentialOCL7298); if (state.failed) return ;
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2973:1: ( (lv_firstIndexes_3_0= ruleExpCS ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2974:1: (lv_firstIndexes_3_0= ruleExpCS )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2974:1: (lv_firstIndexes_3_0= ruleExpCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2975:3: lv_firstIndexes_3_0= ruleExpCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getFirstIndexesExpCSParserRuleCall_0_3_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_synpred77_InternalEssentialOCL7319);
        lv_firstIndexes_3_0=ruleExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2991:2: (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )*
        loop76:
        do {
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==57) ) {
                alt76=1;
            }


            switch (alt76) {
        	case 1 :
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2991:4: otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) )
        	    {
        	    otherlv_4=(Token)match(input,57,FollowSets000.FOLLOW_57_in_synpred77_InternalEssentialOCL7332); if (state.failed) return ;
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2995:1: ( (lv_firstIndexes_5_0= ruleExpCS ) )
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2996:1: (lv_firstIndexes_5_0= ruleExpCS )
        	    {
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2996:1: (lv_firstIndexes_5_0= ruleExpCS )
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2997:3: lv_firstIndexes_5_0= ruleExpCS
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getFirstIndexesExpCSParserRuleCall_0_4_1_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_synpred77_InternalEssentialOCL7353);
        	    lv_firstIndexes_5_0=ruleExpCS();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop76;
            }
        } while (true);

        otherlv_6=(Token)match(input,55,FollowSets000.FOLLOW_55_in_synpred77_InternalEssentialOCL7367); if (state.failed) return ;
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3017:1: (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )?
        int alt78=2;
        int LA78_0 = input.LA(1);

        if ( (LA78_0==54) ) {
            alt78=1;
        }
        switch (alt78) {
            case 1 :
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3017:3: otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']'
                {
                otherlv_7=(Token)match(input,54,FollowSets000.FOLLOW_54_in_synpred77_InternalEssentialOCL7380); if (state.failed) return ;
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3021:1: ( (lv_secondIndexes_8_0= ruleExpCS ) )
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3022:1: (lv_secondIndexes_8_0= ruleExpCS )
                {
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3022:1: (lv_secondIndexes_8_0= ruleExpCS )
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3023:3: lv_secondIndexes_8_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSecondIndexesExpCSParserRuleCall_0_6_1_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_synpred77_InternalEssentialOCL7401);
                lv_secondIndexes_8_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3039:2: (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )*
                loop77:
                do {
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==57) ) {
                        alt77=1;
                    }


                    switch (alt77) {
                	case 1 :
                	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3039:4: otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) )
                	    {
                	    otherlv_9=(Token)match(input,57,FollowSets000.FOLLOW_57_in_synpred77_InternalEssentialOCL7414); if (state.failed) return ;
                	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3043:1: ( (lv_secondIndexes_10_0= ruleExpCS ) )
                	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3044:1: (lv_secondIndexes_10_0= ruleExpCS )
                	    {
                	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3044:1: (lv_secondIndexes_10_0= ruleExpCS )
                	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3045:3: lv_secondIndexes_10_0= ruleExpCS
                	    {
                	    if ( state.backtracking==0 ) {
                	       
                	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSecondIndexesExpCSParserRuleCall_0_6_2_1_0()); 
                	      	    
                	    }
                	    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_synpred77_InternalEssentialOCL7435);
                	    lv_secondIndexes_10_0=ruleExpCS();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop77;
                    }
                } while (true);

                otherlv_11=(Token)match(input,55,FollowSets000.FOLLOW_55_in_synpred77_InternalEssentialOCL7449); if (state.failed) return ;

                }
                break;

        }

        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3065:3: ( ( (lv_atPre_12_0= '@' ) ) otherlv_13= 'pre' )?
        int alt79=2;
        int LA79_0 = input.LA(1);

        if ( (LA79_0==65) ) {
            alt79=1;
        }
        switch (alt79) {
            case 1 :
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3065:4: ( (lv_atPre_12_0= '@' ) ) otherlv_13= 'pre'
                {
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3065:4: ( (lv_atPre_12_0= '@' ) )
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3066:1: (lv_atPre_12_0= '@' )
                {
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3066:1: (lv_atPre_12_0= '@' )
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3067:3: lv_atPre_12_0= '@'
                {
                lv_atPre_12_0=(Token)match(input,65,FollowSets000.FOLLOW_65_in_synpred77_InternalEssentialOCL7470); if (state.failed) return ;

                }


                }

                otherlv_13=(Token)match(input,66,FollowSets000.FOLLOW_66_in_synpred77_InternalEssentialOCL7495); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred77_InternalEssentialOCL

    // $ANTLR start synpred79_InternalEssentialOCL
    public final void synpred79_InternalEssentialOCL_fragment() throws RecognitionException {   
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject lv_pathName_15_0 = null;

        EObject lv_ownedParts_17_0 = null;

        EObject lv_ownedParts_19_0 = null;


        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3085:6: ( ( () ( (lv_pathName_15_0= rulePathNameCS ) ) otherlv_16= '{' ( (lv_ownedParts_17_0= ruleConstructorPartCS ) ) (otherlv_18= ',' ( (lv_ownedParts_19_0= ruleConstructorPartCS ) ) )* otherlv_20= '}' ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3085:6: ( () ( (lv_pathName_15_0= rulePathNameCS ) ) otherlv_16= '{' ( (lv_ownedParts_17_0= ruleConstructorPartCS ) ) (otherlv_18= ',' ( (lv_ownedParts_19_0= ruleConstructorPartCS ) ) )* otherlv_20= '}' )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3085:6: ( () ( (lv_pathName_15_0= rulePathNameCS ) ) otherlv_16= '{' ( (lv_ownedParts_17_0= ruleConstructorPartCS ) ) (otherlv_18= ',' ( (lv_ownedParts_19_0= ruleConstructorPartCS ) ) )* otherlv_20= '}' )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3085:7: () ( (lv_pathName_15_0= rulePathNameCS ) ) otherlv_16= '{' ( (lv_ownedParts_17_0= ruleConstructorPartCS ) ) (otherlv_18= ',' ( (lv_ownedParts_19_0= ruleConstructorPartCS ) ) )* otherlv_20= '}'
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3085:7: ()
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3086:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3094:2: ( (lv_pathName_15_0= rulePathNameCS ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3095:1: (lv_pathName_15_0= rulePathNameCS )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3095:1: (lv_pathName_15_0= rulePathNameCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3096:3: lv_pathName_15_0= rulePathNameCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPathNamePathNameCSParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_synpred79_InternalEssentialOCL7538);
        lv_pathName_15_0=rulePathNameCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_16=(Token)match(input,59,FollowSets000.FOLLOW_59_in_synpred79_InternalEssentialOCL7550); if (state.failed) return ;
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3116:1: ( (lv_ownedParts_17_0= ruleConstructorPartCS ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3117:1: (lv_ownedParts_17_0= ruleConstructorPartCS )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3117:1: (lv_ownedParts_17_0= ruleConstructorPartCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3118:3: lv_ownedParts_17_0= ruleConstructorPartCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getOwnedPartsConstructorPartCSParserRuleCall_1_3_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleConstructorPartCS_in_synpred79_InternalEssentialOCL7571);
        lv_ownedParts_17_0=ruleConstructorPartCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3134:2: (otherlv_18= ',' ( (lv_ownedParts_19_0= ruleConstructorPartCS ) ) )*
        loop80:
        do {
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==57) ) {
                alt80=1;
            }


            switch (alt80) {
        	case 1 :
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3134:4: otherlv_18= ',' ( (lv_ownedParts_19_0= ruleConstructorPartCS ) )
        	    {
        	    otherlv_18=(Token)match(input,57,FollowSets000.FOLLOW_57_in_synpred79_InternalEssentialOCL7584); if (state.failed) return ;
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3138:1: ( (lv_ownedParts_19_0= ruleConstructorPartCS ) )
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3139:1: (lv_ownedParts_19_0= ruleConstructorPartCS )
        	    {
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3139:1: (lv_ownedParts_19_0= ruleConstructorPartCS )
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3140:3: lv_ownedParts_19_0= ruleConstructorPartCS
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getOwnedPartsConstructorPartCSParserRuleCall_1_4_1_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleConstructorPartCS_in_synpred79_InternalEssentialOCL7605);
        	    lv_ownedParts_19_0=ruleConstructorPartCS();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop80;
            }
        } while (true);

        otherlv_20=(Token)match(input,60,FollowSets000.FOLLOW_60_in_synpred79_InternalEssentialOCL7619); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred79_InternalEssentialOCL

    // $ANTLR start synpred87_InternalEssentialOCL
    public final void synpred87_InternalEssentialOCL_fragment() throws RecognitionException {   
        Token lv_atPre_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_32=null;
        EObject lv_pathName_22_0 = null;

        EObject lv_argument_26_0 = null;

        EObject lv_argument_27_0 = null;

        EObject lv_argument_28_0 = null;

        EObject lv_argument_29_0 = null;

        EObject lv_argument_30_0 = null;

        EObject lv_argument_31_0 = null;


        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3161:6: ( ( () ( (lv_pathName_22_0= rulePathNameCS ) ) ( ( (lv_atPre_23_0= '@' ) ) otherlv_24= 'pre' )? otherlv_25= '(' ( ( (lv_argument_26_0= ruleNavigatingArgCS ) ) ( (lv_argument_27_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_28_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_29_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_30_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_31_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_32= ')' ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3161:6: ( () ( (lv_pathName_22_0= rulePathNameCS ) ) ( ( (lv_atPre_23_0= '@' ) ) otherlv_24= 'pre' )? otherlv_25= '(' ( ( (lv_argument_26_0= ruleNavigatingArgCS ) ) ( (lv_argument_27_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_28_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_29_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_30_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_31_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_32= ')' )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3161:6: ( () ( (lv_pathName_22_0= rulePathNameCS ) ) ( ( (lv_atPre_23_0= '@' ) ) otherlv_24= 'pre' )? otherlv_25= '(' ( ( (lv_argument_26_0= ruleNavigatingArgCS ) ) ( (lv_argument_27_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_28_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_29_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_30_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_31_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_32= ')' )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3161:7: () ( (lv_pathName_22_0= rulePathNameCS ) ) ( ( (lv_atPre_23_0= '@' ) ) otherlv_24= 'pre' )? otherlv_25= '(' ( ( (lv_argument_26_0= ruleNavigatingArgCS ) ) ( (lv_argument_27_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_28_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_29_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_30_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_31_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_32= ')'
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3161:7: ()
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3162:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3170:2: ( (lv_pathName_22_0= rulePathNameCS ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3171:1: (lv_pathName_22_0= rulePathNameCS )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3171:1: (lv_pathName_22_0= rulePathNameCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3172:3: lv_pathName_22_0= rulePathNameCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPathNamePathNameCSParserRuleCall_2_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_synpred87_InternalEssentialOCL7660);
        lv_pathName_22_0=rulePathNameCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3188:2: ( ( (lv_atPre_23_0= '@' ) ) otherlv_24= 'pre' )?
        int alt88=2;
        int LA88_0 = input.LA(1);

        if ( (LA88_0==65) ) {
            alt88=1;
        }
        switch (alt88) {
            case 1 :
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3188:3: ( (lv_atPre_23_0= '@' ) ) otherlv_24= 'pre'
                {
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3188:3: ( (lv_atPre_23_0= '@' ) )
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3189:1: (lv_atPre_23_0= '@' )
                {
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3189:1: (lv_atPre_23_0= '@' )
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3190:3: lv_atPre_23_0= '@'
                {
                lv_atPre_23_0=(Token)match(input,65,FollowSets000.FOLLOW_65_in_synpred87_InternalEssentialOCL7679); if (state.failed) return ;

                }


                }

                otherlv_24=(Token)match(input,66,FollowSets000.FOLLOW_66_in_synpred87_InternalEssentialOCL7704); if (state.failed) return ;

                }
                break;

        }

        otherlv_25=(Token)match(input,51,FollowSets000.FOLLOW_51_in_synpred87_InternalEssentialOCL7718); if (state.failed) return ;
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3211:1: ( ( (lv_argument_26_0= ruleNavigatingArgCS ) ) ( (lv_argument_27_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_28_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_29_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_30_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_31_0= ruleNavigatingCommaArgCS ) )* )? )?
        int alt94=2;
        int LA94_0 = input.LA(1);

        if ( ((LA94_0>=RULE_SIMPLE_ID && LA94_0<=RULE_SINGLE_QUOTED_STRING)||LA94_0==17||(LA94_0>=19 && LA94_0<=20)||(LA94_0>=22 && LA94_0<=23)||LA94_0==36||(LA94_0>=38 && LA94_0<=51)||(LA94_0>=61 && LA94_0<=64)||LA94_0==69||LA94_0==73||LA94_0==75) ) {
            alt94=1;
        }
        switch (alt94) {
            case 1 :
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3211:2: ( (lv_argument_26_0= ruleNavigatingArgCS ) ) ( (lv_argument_27_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_28_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_29_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_30_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_31_0= ruleNavigatingCommaArgCS ) )* )?
                {
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3211:2: ( (lv_argument_26_0= ruleNavigatingArgCS ) )
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3212:1: (lv_argument_26_0= ruleNavigatingArgCS )
                {
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3212:1: (lv_argument_26_0= ruleNavigatingArgCS )
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3213:3: lv_argument_26_0= ruleNavigatingArgCS
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingArgCSParserRuleCall_2_4_0_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCS_in_synpred87_InternalEssentialOCL7740);
                lv_argument_26_0=ruleNavigatingArgCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3229:2: ( (lv_argument_27_0= ruleNavigatingCommaArgCS ) )*
                loop89:
                do {
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==57) ) {
                        alt89=1;
                    }


                    switch (alt89) {
                	case 1 :
                	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3230:1: (lv_argument_27_0= ruleNavigatingCommaArgCS )
                	    {
                	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3230:1: (lv_argument_27_0= ruleNavigatingCommaArgCS )
                	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3231:3: lv_argument_27_0= ruleNavigatingCommaArgCS
                	    {
                	    if ( state.backtracking==0 ) {
                	       
                	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_2_4_1_0()); 
                	      	    
                	    }
                	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_synpred87_InternalEssentialOCL7761);
                	    lv_argument_27_0=ruleNavigatingCommaArgCS();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }
                	    break;

                	default :
                	    break loop89;
                    }
                } while (true);

                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3247:3: ( ( (lv_argument_28_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_29_0= ruleNavigatingCommaArgCS ) )* )?
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==68) ) {
                    alt91=1;
                }
                switch (alt91) {
                    case 1 :
                        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3247:4: ( (lv_argument_28_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_29_0= ruleNavigatingCommaArgCS ) )*
                        {
                        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3247:4: ( (lv_argument_28_0= ruleNavigatingSemiArgCS ) )
                        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3248:1: (lv_argument_28_0= ruleNavigatingSemiArgCS )
                        {
                        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3248:1: (lv_argument_28_0= ruleNavigatingSemiArgCS )
                        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3249:3: lv_argument_28_0= ruleNavigatingSemiArgCS
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingSemiArgCSParserRuleCall_2_4_2_0_0()); 
                          	    
                        }
                        pushFollow(FollowSets000.FOLLOW_ruleNavigatingSemiArgCS_in_synpred87_InternalEssentialOCL7784);
                        lv_argument_28_0=ruleNavigatingSemiArgCS();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }

                        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3265:2: ( (lv_argument_29_0= ruleNavigatingCommaArgCS ) )*
                        loop90:
                        do {
                            int alt90=2;
                            int LA90_0 = input.LA(1);

                            if ( (LA90_0==57) ) {
                                alt90=1;
                            }


                            switch (alt90) {
                        	case 1 :
                        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3266:1: (lv_argument_29_0= ruleNavigatingCommaArgCS )
                        	    {
                        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3266:1: (lv_argument_29_0= ruleNavigatingCommaArgCS )
                        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3267:3: lv_argument_29_0= ruleNavigatingCommaArgCS
                        	    {
                        	    if ( state.backtracking==0 ) {
                        	       
                        	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_2_4_2_1_0()); 
                        	      	    
                        	    }
                        	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_synpred87_InternalEssentialOCL7805);
                        	    lv_argument_29_0=ruleNavigatingCommaArgCS();

                        	    state._fsp--;
                        	    if (state.failed) return ;

                        	    }


                        	    }
                        	    break;

                        	default :
                        	    break loop90;
                            }
                        } while (true);


                        }
                        break;

                }

                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3283:5: ( ( (lv_argument_30_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_31_0= ruleNavigatingCommaArgCS ) )* )?
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==67) ) {
                    alt93=1;
                }
                switch (alt93) {
                    case 1 :
                        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3283:6: ( (lv_argument_30_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_31_0= ruleNavigatingCommaArgCS ) )*
                        {
                        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3283:6: ( (lv_argument_30_0= ruleNavigatingBarArgCS ) )
                        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3284:1: (lv_argument_30_0= ruleNavigatingBarArgCS )
                        {
                        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3284:1: (lv_argument_30_0= ruleNavigatingBarArgCS )
                        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3285:3: lv_argument_30_0= ruleNavigatingBarArgCS
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingBarArgCSParserRuleCall_2_4_3_0_0()); 
                          	    
                        }
                        pushFollow(FollowSets000.FOLLOW_ruleNavigatingBarArgCS_in_synpred87_InternalEssentialOCL7830);
                        lv_argument_30_0=ruleNavigatingBarArgCS();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }

                        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3301:2: ( (lv_argument_31_0= ruleNavigatingCommaArgCS ) )*
                        loop92:
                        do {
                            int alt92=2;
                            int LA92_0 = input.LA(1);

                            if ( (LA92_0==57) ) {
                                alt92=1;
                            }


                            switch (alt92) {
                        	case 1 :
                        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3302:1: (lv_argument_31_0= ruleNavigatingCommaArgCS )
                        	    {
                        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3302:1: (lv_argument_31_0= ruleNavigatingCommaArgCS )
                        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3303:3: lv_argument_31_0= ruleNavigatingCommaArgCS
                        	    {
                        	    if ( state.backtracking==0 ) {
                        	       
                        	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_2_4_3_1_0()); 
                        	      	    
                        	    }
                        	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_synpred87_InternalEssentialOCL7851);
                        	    lv_argument_31_0=ruleNavigatingCommaArgCS();

                        	    state._fsp--;
                        	    if (state.failed) return ;

                        	    }


                        	    }
                        	    break;

                        	default :
                        	    break loop92;
                            }
                        } while (true);


                        }
                        break;

                }


                }
                break;

        }

        otherlv_32=(Token)match(input,52,FollowSets000.FOLLOW_52_in_synpred87_InternalEssentialOCL7868); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred87_InternalEssentialOCL

    // $ANTLR start synpred89_InternalEssentialOCL
    public final void synpred89_InternalEssentialOCL_fragment() throws RecognitionException {   
        Token lv_atPre_35_0=null;
        Token otherlv_36=null;
        EObject lv_pathName_34_0 = null;


        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3324:6: ( ( () ( (lv_pathName_34_0= rulePathNameCS ) ) ( ( (lv_atPre_35_0= '@' ) ) otherlv_36= 'pre' )? ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3324:6: ( () ( (lv_pathName_34_0= rulePathNameCS ) ) ( ( (lv_atPre_35_0= '@' ) ) otherlv_36= 'pre' )? )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3324:6: ( () ( (lv_pathName_34_0= rulePathNameCS ) ) ( ( (lv_atPre_35_0= '@' ) ) otherlv_36= 'pre' )? )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3324:7: () ( (lv_pathName_34_0= rulePathNameCS ) ) ( ( (lv_atPre_35_0= '@' ) ) otherlv_36= 'pre' )?
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3324:7: ()
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3325:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3333:2: ( (lv_pathName_34_0= rulePathNameCS ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3334:1: (lv_pathName_34_0= rulePathNameCS )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3334:1: (lv_pathName_34_0= rulePathNameCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3335:3: lv_pathName_34_0= rulePathNameCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPathNamePathNameCSParserRuleCall_3_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_synpred89_InternalEssentialOCL7909);
        lv_pathName_34_0=rulePathNameCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3351:2: ( ( (lv_atPre_35_0= '@' ) ) otherlv_36= 'pre' )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==65) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3351:3: ( (lv_atPre_35_0= '@' ) ) otherlv_36= 'pre'
                {
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3351:3: ( (lv_atPre_35_0= '@' ) )
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3352:1: (lv_atPre_35_0= '@' )
                {
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3352:1: (lv_atPre_35_0= '@' )
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3353:3: lv_atPre_35_0= '@'
                {
                lv_atPre_35_0=(Token)match(input,65,FollowSets000.FOLLOW_65_in_synpred89_InternalEssentialOCL7928); if (state.failed) return ;

                }


                }

                otherlv_36=(Token)match(input,66,FollowSets000.FOLLOW_66_in_synpred89_InternalEssentialOCL7953); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred89_InternalEssentialOCL

    // $ANTLR start synpred92_InternalEssentialOCL
    public final void synpred92_InternalEssentialOCL_fragment() throws RecognitionException {   
        EObject this_TupleLiteralExpCS_39 = null;


        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3398:2: (this_TupleLiteralExpCS_39= ruleTupleLiteralExpCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3398:2: this_TupleLiteralExpCS_39= ruleTupleLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_synpred92_InternalEssentialOCL8047);
        this_TupleLiteralExpCS_39=ruleTupleLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred92_InternalEssentialOCL

    // $ANTLR start synpred93_InternalEssentialOCL
    public final void synpred93_InternalEssentialOCL_fragment() throws RecognitionException {   
        EObject this_CollectionLiteralExpCS_40 = null;


        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3411:2: (this_CollectionLiteralExpCS_40= ruleCollectionLiteralExpCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3411:2: this_CollectionLiteralExpCS_40= ruleCollectionLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_synpred93_InternalEssentialOCL8077);
        this_CollectionLiteralExpCS_40=ruleCollectionLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred93_InternalEssentialOCL

    // $ANTLR start synpred94_InternalEssentialOCL
    public final void synpred94_InternalEssentialOCL_fragment() throws RecognitionException {   
        EObject this_TypeLiteralExpCS_41 = null;


        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3424:2: (this_TypeLiteralExpCS_41= ruleTypeLiteralExpCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3424:2: this_TypeLiteralExpCS_41= ruleTypeLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_synpred94_InternalEssentialOCL8107);
        this_TypeLiteralExpCS_41=ruleTypeLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred94_InternalEssentialOCL

    // Delegated rules

    public final boolean synpred77_InternalEssentialOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_InternalEssentialOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_InternalEssentialOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_InternalEssentialOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred92_InternalEssentialOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred92_InternalEssentialOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalEssentialOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalEssentialOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred94_InternalEssentialOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_InternalEssentialOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_InternalEssentialOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalEssentialOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred93_InternalEssentialOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_InternalEssentialOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_InternalEssentialOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_InternalEssentialOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_InternalEssentialOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_InternalEssentialOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred89_InternalEssentialOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_InternalEssentialOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_InternalEssentialOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_InternalEssentialOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA36 dfa36 = new DFA36(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA73 dfa73 = new DFA73(this);
    static final String DFA36_eotS =
        "\42\uffff";
    static final String DFA36_eofS =
        "\42\uffff";
    static final String DFA36_minS =
        "\1\4\36\0\3\uffff";
    static final String DFA36_maxS =
        "\1\113\36\0\3\uffff";
    static final String DFA36_acceptS =
        "\37\uffff\1\3\1\1\1\2";
    static final String DFA36_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\3\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\1\1\2\1\6\1\7\11\uffff\1\12\1\uffff\1\3\1\4\1\uffff\1\35"+
            "\1\36\14\uffff\1\15\1\uffff\1\23\1\24\1\25\1\26\1\27\1\30\1"+
            "\31\1\32\1\16\1\17\1\20\1\21\1\22\1\34\11\uffff\1\10\1\11\1"+
            "\13\1\14\4\uffff\1\33\3\uffff\1\37\1\uffff\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "2442:1: ( ( () ( (lv_ownedExpression_1_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) )* ( (lv_ownedExpression_5_0= rulePrefixedExpOrLetExpCS ) ) ) | ( () ( (lv_ownedOperator_7_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_8_0= rulePrimaryExpOrLetExpCS ) ) ) | this_PrimaryExpOrLetExpCS_9= rulePrimaryExpOrLetExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_1 = input.LA(1);

                         
                        int index36_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_2 = input.LA(1);

                         
                        int index36_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_3 = input.LA(1);

                         
                        int index36_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA36_4 = input.LA(1);

                         
                        int index36_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA36_5 = input.LA(1);

                         
                        int index36_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA36_6 = input.LA(1);

                         
                        int index36_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA36_7 = input.LA(1);

                         
                        int index36_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA36_8 = input.LA(1);

                         
                        int index36_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA36_9 = input.LA(1);

                         
                        int index36_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA36_10 = input.LA(1);

                         
                        int index36_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA36_11 = input.LA(1);

                         
                        int index36_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA36_12 = input.LA(1);

                         
                        int index36_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA36_13 = input.LA(1);

                         
                        int index36_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA36_14 = input.LA(1);

                         
                        int index36_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA36_15 = input.LA(1);

                         
                        int index36_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA36_16 = input.LA(1);

                         
                        int index36_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA36_17 = input.LA(1);

                         
                        int index36_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA36_18 = input.LA(1);

                         
                        int index36_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA36_19 = input.LA(1);

                         
                        int index36_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA36_20 = input.LA(1);

                         
                        int index36_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA36_21 = input.LA(1);

                         
                        int index36_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA36_22 = input.LA(1);

                         
                        int index36_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA36_23 = input.LA(1);

                         
                        int index36_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA36_24 = input.LA(1);

                         
                        int index36_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA36_25 = input.LA(1);

                         
                        int index36_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA36_26 = input.LA(1);

                         
                        int index36_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA36_27 = input.LA(1);

                         
                        int index36_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA36_28 = input.LA(1);

                         
                        int index36_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index36_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA36_29 = input.LA(1);

                         
                        int index36_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (synpred67_InternalEssentialOCL()) ) {s = 33;}

                         
                        input.seek(index36_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA36_30 = input.LA(1);

                         
                        int index36_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (synpred67_InternalEssentialOCL()) ) {s = 33;}

                         
                        input.seek(index36_30);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\41\uffff";
    static final String DFA34_eofS =
        "\41\uffff";
    static final String DFA34_minS =
        "\1\4\34\0\1\uffff\2\0\1\uffff";
    static final String DFA34_maxS =
        "\1\113\34\0\1\uffff\2\0\1\uffff";
    static final String DFA34_acceptS =
        "\35\uffff\1\2\2\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\uffff\1\34\1\35\1\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\1\1\2\1\6\1\7\11\uffff\1\12\1\uffff\1\3\1\4\1\uffff\1\36"+
            "\1\37\14\uffff\1\15\1\uffff\1\23\1\24\1\25\1\26\1\27\1\30\1"+
            "\31\1\32\1\16\1\17\1\20\1\21\1\22\1\34\11\uffff\1\10\1\11\1"+
            "\13\1\14\4\uffff\1\33\3\uffff\1\35\1\uffff\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "()* loopback of 2487:2: ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_3 = input.LA(1);

                         
                        int index34_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_4 = input.LA(1);

                         
                        int index34_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_5 = input.LA(1);

                         
                        int index34_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_6 = input.LA(1);

                         
                        int index34_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA34_7 = input.LA(1);

                         
                        int index34_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA34_8 = input.LA(1);

                         
                        int index34_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA34_9 = input.LA(1);

                         
                        int index34_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA34_10 = input.LA(1);

                         
                        int index34_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA34_11 = input.LA(1);

                         
                        int index34_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA34_12 = input.LA(1);

                         
                        int index34_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA34_13 = input.LA(1);

                         
                        int index34_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA34_14 = input.LA(1);

                         
                        int index34_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA34_15 = input.LA(1);

                         
                        int index34_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA34_16 = input.LA(1);

                         
                        int index34_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA34_17 = input.LA(1);

                         
                        int index34_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA34_18 = input.LA(1);

                         
                        int index34_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA34_19 = input.LA(1);

                         
                        int index34_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA34_20 = input.LA(1);

                         
                        int index34_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA34_21 = input.LA(1);

                         
                        int index34_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA34_22 = input.LA(1);

                         
                        int index34_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA34_23 = input.LA(1);

                         
                        int index34_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA34_24 = input.LA(1);

                         
                        int index34_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA34_25 = input.LA(1);

                         
                        int index34_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA34_26 = input.LA(1);

                         
                        int index34_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA34_27 = input.LA(1);

                         
                        int index34_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA34_28 = input.LA(1);

                         
                        int index34_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA34_30 = input.LA(1);

                         
                        int index34_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_30);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA34_31 = input.LA(1);

                         
                        int index34_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index34_31);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA55_eotS =
        "\43\uffff";
    static final String DFA55_eofS =
        "\43\uffff";
    static final String DFA55_minS =
        "\1\4\4\0\10\uffff\6\0\20\uffff";
    static final String DFA55_maxS =
        "\1\113\4\0\10\uffff\6\0\20\uffff";
    static final String DFA55_acceptS =
        "\5\uffff\1\5\1\6\14\uffff\1\11\7\uffff\1\12\1\13\1\1\1\2\1\3\1"+
        "\4\1\7\1\10";
    static final String DFA55_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\10\uffff\1\4\1\5\1\6\1\7\1\10\1\11\20"+
        "\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\1\1\2\2\6\11\uffff\1\6\1\uffff\1\3\1\4\17\uffff\1\15\1\uffff"+
            "\10\23\1\16\1\17\1\20\1\21\1\22\1\34\11\uffff\4\6\4\uffff\1"+
            "\33\5\uffff\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "2942:1: ( ( () ( (lv_pathName_1_0= rulePathNameCS ) ) otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? ( ( (lv_atPre_12_0= '@' ) ) otherlv_13= 'pre' )? ) | ( () ( (lv_pathName_15_0= rulePathNameCS ) ) otherlv_16= '{' ( (lv_ownedParts_17_0= ruleConstructorPartCS ) ) (otherlv_18= ',' ( (lv_ownedParts_19_0= ruleConstructorPartCS ) ) )* otherlv_20= '}' ) | ( () ( (lv_pathName_22_0= rulePathNameCS ) ) ( ( (lv_atPre_23_0= '@' ) ) otherlv_24= 'pre' )? otherlv_25= '(' ( ( (lv_argument_26_0= ruleNavigatingArgCS ) ) ( (lv_argument_27_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_28_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_29_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_30_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_31_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_32= ')' ) | ( () ( (lv_pathName_34_0= rulePathNameCS ) ) ( ( (lv_atPre_35_0= '@' ) ) otherlv_36= 'pre' )? ) | this_SelfExpCS_37= ruleSelfExpCS | this_PrimitiveLiteralExpCS_38= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_39= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_40= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_41= ruleTypeLiteralExpCS | this_IfExpCS_42= ruleIfExpCS | this_NestedExpCS_43= ruleNestedExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_1 = input.LA(1);

                         
                        int index55_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalEssentialOCL()) ) {s = 29;}

                        else if ( (synpred79_InternalEssentialOCL()) ) {s = 30;}

                        else if ( (synpred87_InternalEssentialOCL()) ) {s = 31;}

                        else if ( (synpred89_InternalEssentialOCL()) ) {s = 32;}

                         
                        input.seek(index55_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA55_2 = input.LA(1);

                         
                        int index55_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalEssentialOCL()) ) {s = 29;}

                        else if ( (synpred79_InternalEssentialOCL()) ) {s = 30;}

                        else if ( (synpred87_InternalEssentialOCL()) ) {s = 31;}

                        else if ( (synpred89_InternalEssentialOCL()) ) {s = 32;}

                         
                        input.seek(index55_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA55_3 = input.LA(1);

                         
                        int index55_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalEssentialOCL()) ) {s = 29;}

                        else if ( (synpred79_InternalEssentialOCL()) ) {s = 30;}

                        else if ( (synpred87_InternalEssentialOCL()) ) {s = 31;}

                        else if ( (synpred89_InternalEssentialOCL()) ) {s = 32;}

                         
                        input.seek(index55_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA55_4 = input.LA(1);

                         
                        int index55_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalEssentialOCL()) ) {s = 29;}

                        else if ( (synpred79_InternalEssentialOCL()) ) {s = 30;}

                        else if ( (synpred87_InternalEssentialOCL()) ) {s = 31;}

                        else if ( (synpred89_InternalEssentialOCL()) ) {s = 32;}

                         
                        input.seek(index55_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA55_13 = input.LA(1);

                         
                        int index55_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_InternalEssentialOCL()) ) {s = 33;}

                        else if ( (synpred94_InternalEssentialOCL()) ) {s = 19;}

                         
                        input.seek(index55_13);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA55_14 = input.LA(1);

                         
                        int index55_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalEssentialOCL()) ) {s = 34;}

                        else if ( (synpred94_InternalEssentialOCL()) ) {s = 19;}

                         
                        input.seek(index55_14);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA55_15 = input.LA(1);

                         
                        int index55_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalEssentialOCL()) ) {s = 34;}

                        else if ( (synpred94_InternalEssentialOCL()) ) {s = 19;}

                         
                        input.seek(index55_15);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA55_16 = input.LA(1);

                         
                        int index55_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalEssentialOCL()) ) {s = 34;}

                        else if ( (synpred94_InternalEssentialOCL()) ) {s = 19;}

                         
                        input.seek(index55_16);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA55_17 = input.LA(1);

                         
                        int index55_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalEssentialOCL()) ) {s = 34;}

                        else if ( (synpred94_InternalEssentialOCL()) ) {s = 19;}

                         
                        input.seek(index55_17);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA55_18 = input.LA(1);

                         
                        int index55_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalEssentialOCL()) ) {s = 34;}

                        else if ( (synpred94_InternalEssentialOCL()) ) {s = 19;}

                         
                        input.seek(index55_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA73_eotS =
        "\41\uffff";
    static final String DFA73_eofS =
        "\41\uffff";
    static final String DFA73_minS =
        "\1\4\34\0\1\uffff\2\0\1\uffff";
    static final String DFA73_maxS =
        "\1\113\34\0\1\uffff\2\0\1\uffff";
    static final String DFA73_acceptS =
        "\35\uffff\1\2\2\uffff\1\1";
    static final String DFA73_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\uffff\1\34\1\35\1\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\1\1\2\1\6\1\7\11\uffff\1\12\1\uffff\1\3\1\4\1\uffff\1\36"+
            "\1\37\14\uffff\1\15\1\uffff\1\23\1\24\1\25\1\26\1\27\1\30\1"+
            "\31\1\32\1\16\1\17\1\20\1\21\1\22\1\34\11\uffff\1\10\1\11\1"+
            "\13\1\14\4\uffff\1\33\3\uffff\1\35\1\uffff\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "()* loopback of 2487:2: ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_2 = input.LA(1);

                         
                        int index73_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_3 = input.LA(1);

                         
                        int index73_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA73_4 = input.LA(1);

                         
                        int index73_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA73_5 = input.LA(1);

                         
                        int index73_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA73_6 = input.LA(1);

                         
                        int index73_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA73_7 = input.LA(1);

                         
                        int index73_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA73_8 = input.LA(1);

                         
                        int index73_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA73_9 = input.LA(1);

                         
                        int index73_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA73_10 = input.LA(1);

                         
                        int index73_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA73_11 = input.LA(1);

                         
                        int index73_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA73_12 = input.LA(1);

                         
                        int index73_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA73_13 = input.LA(1);

                         
                        int index73_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA73_14 = input.LA(1);

                         
                        int index73_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA73_15 = input.LA(1);

                         
                        int index73_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA73_16 = input.LA(1);

                         
                        int index73_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA73_17 = input.LA(1);

                         
                        int index73_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA73_18 = input.LA(1);

                         
                        int index73_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA73_19 = input.LA(1);

                         
                        int index73_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA73_20 = input.LA(1);

                         
                        int index73_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA73_21 = input.LA(1);

                         
                        int index73_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA73_22 = input.LA(1);

                         
                        int index73_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA73_23 = input.LA(1);

                         
                        int index73_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA73_24 = input.LA(1);

                         
                        int index73_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA73_25 = input.LA(1);

                         
                        int index73_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA73_26 = input.LA(1);

                         
                        int index73_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA73_27 = input.LA(1);

                         
                        int index73_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA73_28 = input.LA(1);

                         
                        int index73_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA73_30 = input.LA(1);

                         
                        int index73_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_30);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA73_31 = input.LA(1);

                         
                        int index73_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_31);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleModel136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_entryRuleID172 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SIMPLE_ID_in_ruleID223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ESCAPED_ID_in_ruleID249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLOWER_in_entryRuleLOWER295 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLOWER306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleLOWER345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUPPER_in_entryRuleUPPER390 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUPPER401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleUPPER441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleUPPER465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL506 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER_LITERAL517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL557 = new BitSet(new long[]{0x00000000001C0002L});
        public static final BitSet FOLLOW_18_in_ruleNUMBER_LITERAL576 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL591 = new BitSet(new long[]{0x0000000000180002L});
        public static final BitSet FOLLOW_19_in_ruleNUMBER_LITERAL613 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_20_in_ruleNUMBER_LITERAL632 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_21_in_ruleNUMBER_LITERAL647 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_22_in_ruleNUMBER_LITERAL666 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedIdentifier_in_entryRuleEssentialOCLUnrestrictedIdentifier735 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedIdentifier746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleEssentialOCLUnrestrictedIdentifier784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleEssentialOCLUnrestrictedIdentifier803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLPrefixOperator_in_entryRuleEssentialOCLPrefixOperator844 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLPrefixOperator855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleEssentialOCLPrefixOperator893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleEssentialOCLPrefixOperator912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLInfixOperator_in_entryRuleEssentialOCLInfixOperator953 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLInfixOperator964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleEssentialOCLInfixOperator1002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleEssentialOCLInfixOperator1021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleEssentialOCLInfixOperator1040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleEssentialOCLInfixOperator1059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEssentialOCLInfixOperator1078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleEssentialOCLInfixOperator1097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleEssentialOCLInfixOperator1116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleEssentialOCLInfixOperator1135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleEssentialOCLInfixOperator1154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleEssentialOCLInfixOperator1173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleEssentialOCLInfixOperator1192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleEssentialOCLInfixOperator1211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleEssentialOCLInfixOperator1230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEssentialOCLInfixOperator1249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLNavigationOperator_in_entryRuleEssentialOCLNavigationOperator1290 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLNavigationOperator1301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleEssentialOCLNavigationOperator1339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleEssentialOCLNavigationOperator1358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier1399 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier1410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_ruleIdentifier1457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedIdentifier_in_ruleIdentifier1490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1536 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleStringLiteral1586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixOperator_in_entryRulePrefixOperator1631 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrefixOperator1642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLPrefixOperator_in_rulePrefixOperator1688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperator_in_entryRuleInfixOperator1733 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfixOperator1744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLInfixOperator_in_ruleInfixOperator1790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperator_in_entryRuleNavigationOperator1835 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigationOperator1846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLNavigationOperator_in_ruleNavigationOperator1892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_entryRuleEssentialOCLUnrestrictedName1937 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedName1948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleEssentialOCLUnrestrictedName1994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_entryRuleUnrestrictedName2039 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnrestrictedName2050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_ruleUnrestrictedName2096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnreservedName_in_entryRuleEssentialOCLUnreservedName2141 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnreservedName2152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleEssentialOCLUnreservedName2199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_ruleEssentialOCLUnreservedName2232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_ruleEssentialOCLUnreservedName2265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleEssentialOCLUnreservedName2289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_entryRuleUnreservedName2330 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnreservedName2341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnreservedName_in_ruleUnreservedName2387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_entryRulePathNameCS2431 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePathNameCS2441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFirstPathElementCS_in_rulePathNameCS2487 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_37_in_rulePathNameCS2500 = new BitSet(new long[]{0x0007FFD000180030L});
        public static final BitSet FOLLOW_ruleNextPathElementCS_in_rulePathNameCS2521 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_ruleFirstPathElementCS_in_entryRuleFirstPathElementCS2559 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFirstPathElementCS2569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleFirstPathElementCS2620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNextPathElementCS_in_entryRuleNextPathElementCS2655 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNextPathElementCS2665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_ruleNextPathElementCS2716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_entryRulePrimitiveTypeIdentifier2752 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeIdentifier2763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rulePrimitiveTypeIdentifier2801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rulePrimitiveTypeIdentifier2820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rulePrimitiveTypeIdentifier2839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rulePrimitiveTypeIdentifier2858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rulePrimitiveTypeIdentifier2877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rulePrimitiveTypeIdentifier2896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rulePrimitiveTypeIdentifier2915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rulePrimitiveTypeIdentifier2934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeCS_in_entryRulePrimitiveTypeCS2974 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeCS2984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_rulePrimitiveTypeCS3029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_entryRuleCollectionTypeIdentifier3065 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionTypeIdentifier3076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleCollectionTypeIdentifier3114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleCollectionTypeIdentifier3133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleCollectionTypeIdentifier3152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleCollectionTypeIdentifier3171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleCollectionTypeIdentifier3190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_entryRuleCollectionTypeCS3230 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionTypeCS3240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_ruleCollectionTypeCS3286 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_51_in_ruleCollectionTypeCS3299 = new BitSet(new long[]{0x0007FFD000180030L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS3320 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleCollectionTypeCS3332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityBoundsCS_in_entryRuleMultiplicityBoundsCS3370 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityBoundsCS3380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLOWER_in_ruleMultiplicityBoundsCS3426 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_53_in_ruleMultiplicityBoundsCS3439 = new BitSet(new long[]{0x0000000000020040L});
        public static final BitSet FOLLOW_ruleUPPER_in_ruleMultiplicityBoundsCS3460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_entryRuleMultiplicityCS3498 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityCS3508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleMultiplicityCS3545 = new BitSet(new long[]{0x0100000000220040L});
        public static final BitSet FOLLOW_ruleMultiplicityBoundsCS_in_ruleMultiplicityCS3571 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_ruleMultiplicityStringCS_in_ruleMultiplicityCS3601 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleMultiplicityCS3613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityStringCS_in_entryRuleMultiplicityStringCS3649 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityStringCS3659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleMultiplicityStringCS3703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleMultiplicityStringCS3732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleMultiplicityStringCS3761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeCS_in_entryRuleTupleTypeCS3812 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleTypeCS3822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleTupleTypeCS3865 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_51_in_ruleTupleTypeCS3891 = new BitSet(new long[]{0x0010000000180030L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS3913 = new BitSet(new long[]{0x0210000000000000L});
        public static final BitSet FOLLOW_57_in_ruleTupleTypeCS3926 = new BitSet(new long[]{0x0000000000180030L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS3947 = new BitSet(new long[]{0x0210000000000000L});
        public static final BitSet FOLLOW_52_in_ruleTupleTypeCS3963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_entryRuleTuplePartCS4001 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTuplePartCS4011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTuplePartCS4057 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_ruleTuplePartCS4069 = new BitSet(new long[]{0x0007FFD000180030L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleTuplePartCS4090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_entryRuleCollectionLiteralExpCS4126 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteralExpCS4136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleCollectionLiteralExpCS4182 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_59_in_ruleCollectionLiteralExpCS4194 = new BitSet(new long[]{0xF00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS4216 = new BitSet(new long[]{0x1200000000000000L});
        public static final BitSet FOLLOW_57_in_ruleCollectionLiteralExpCS4229 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS4250 = new BitSet(new long[]{0x1200000000000000L});
        public static final BitSet FOLLOW_60_in_ruleCollectionLiteralExpCS4266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_entryRuleCollectionLiteralPartCS4302 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteralPartCS4312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS4358 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_53_in_ruleCollectionLiteralPartCS4371 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS4392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstructorPartCS_in_entryRuleConstructorPartCS4430 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstructorPartCS4440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleConstructorPartCS4492 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleConstructorPartCS4504 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleConstructorPartCS4525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_entryRulePrimitiveLiteralExpCS4561 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveLiteralExpCS4571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpCS_in_rulePrimitiveLiteralExpCS4621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteralExpCS_in_rulePrimitiveLiteralExpCS4651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpCS_in_rulePrimitiveLiteralExpCS4681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_rulePrimitiveLiteralExpCS4711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvalidLiteralExpCS_in_rulePrimitiveLiteralExpCS4741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullLiteralExpCS_in_rulePrimitiveLiteralExpCS4771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_entryRuleTupleLiteralExpCS4806 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralExpCS4816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleTupleLiteralExpCS4853 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_59_in_ruleTupleLiteralExpCS4865 = new BitSet(new long[]{0x0000000000180030L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS4886 = new BitSet(new long[]{0x1200000000000000L});
        public static final BitSet FOLLOW_57_in_ruleTupleLiteralExpCS4899 = new BitSet(new long[]{0x0000000000180030L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS4920 = new BitSet(new long[]{0x1200000000000000L});
        public static final BitSet FOLLOW_60_in_ruleTupleLiteralExpCS4934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_entryRuleTupleLiteralPartCS4970 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralPartCS4980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTupleLiteralPartCS5026 = new BitSet(new long[]{0x0400000020000000L});
        public static final BitSet FOLLOW_58_in_ruleTupleLiteralPartCS5039 = new BitSet(new long[]{0x0007FFD000180030L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleTupleLiteralPartCS5060 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleTupleLiteralPartCS5074 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleTupleLiteralPartCS5095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpCS_in_entryRuleNumberLiteralExpCS5131 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteralExpCS5141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_ruleNumberLiteralExpCS5186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteralExpCS_in_entryRuleStringLiteralExpCS5221 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteralExpCS5231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleStringLiteralExpCS5276 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpCS_in_entryRuleBooleanLiteralExpCS5312 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteralExpCS5322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleBooleanLiteralExpCS5365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleBooleanLiteralExpCS5402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_entryRuleUnlimitedNaturalLiteralExpCS5451 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedNaturalLiteralExpCS5461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleUnlimitedNaturalLiteralExpCS5510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvalidLiteralExpCS_in_entryRuleInvalidLiteralExpCS5546 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvalidLiteralExpCS5556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleInvalidLiteralExpCS5605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullLiteralExpCS_in_entryRuleNullLiteralExpCS5641 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteralExpCS5651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleNullLiteralExpCS5700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_entryRuleTypeLiteralCS5736 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralCS5746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeCS_in_ruleTypeLiteralCS5796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleTypeLiteralCS5826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeCS_in_ruleTypeLiteralCS5856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_entryRuleTypeLiteralExpCS5891 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralExpCS5901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_ruleTypeLiteralExpCS5946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeNameExpCS_in_entryRuleTypeNameExpCS5981 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeNameExpCS5991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_ruleTypeNameExpCS6036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_entryRuleTypeExpCS6071 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeExpCS6081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeNameExpCS_in_ruleTypeExpCS6132 = new BitSet(new long[]{0x0040000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_ruleTypeExpCS6162 = new BitSet(new long[]{0x0040000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_ruleTypeExpCS6183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_entryRuleExpCS6220 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpCS6230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_ruleExpCS6289 = new BitSet(new long[]{0x0000000FFF660000L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_ruleExpCS6310 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_ruleExpCS6332 = new BitSet(new long[]{0x0000000FFF660000L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_ruleExpCS6353 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_rulePrefixedExpOrLetExpCS_in_ruleExpCS6376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorCS_in_ruleExpCS6417 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_rulePrimaryExpOrLetExpCS_in_ruleExpCS6439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpOrLetExpCS_in_ruleExpCS6471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_entryRuleBinaryOperatorCS6506 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperatorCS6516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperatorCS_in_ruleBinaryOperatorCS6566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperatorCS_in_ruleBinaryOperatorCS6596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperatorCS_in_entryRuleInfixOperatorCS6631 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfixOperatorCS6641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperator_in_ruleInfixOperatorCS6686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperatorCS_in_entryRuleNavigationOperatorCS6721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigationOperatorCS6731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperator_in_ruleNavigationOperatorCS6776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_entryRulePrefixedExpCS6811 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrefixedExpCS6821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS6871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorCS_in_rulePrefixedExpCS6910 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000821L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS6932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedExpOrLetExpCS_in_entryRulePrefixedExpOrLetExpCS6969 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrefixedExpOrLetExpCS6979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpOrLetExpCS_in_rulePrefixedExpOrLetExpCS7029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorCS_in_rulePrefixedExpOrLetExpCS7068 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_rulePrimaryExpOrLetExpCS_in_rulePrefixedExpOrLetExpCS7090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorCS_in_entryRuleUnaryOperatorCS7127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperatorCS7137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixOperator_in_ruleUnaryOperatorCS7182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_entryRulePrimaryExpCS7217 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpCS7227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_rulePrimaryExpCS7286 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_rulePrimaryExpCS7298 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleExpCS_in_rulePrimaryExpCS7319 = new BitSet(new long[]{0x0280000000000000L});
        public static final BitSet FOLLOW_57_in_rulePrimaryExpCS7332 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleExpCS_in_rulePrimaryExpCS7353 = new BitSet(new long[]{0x0280000000000000L});
        public static final BitSet FOLLOW_55_in_rulePrimaryExpCS7367 = new BitSet(new long[]{0x0040000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rulePrimaryExpCS7380 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleExpCS_in_rulePrimaryExpCS7401 = new BitSet(new long[]{0x0280000000000000L});
        public static final BitSet FOLLOW_57_in_rulePrimaryExpCS7414 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleExpCS_in_rulePrimaryExpCS7435 = new BitSet(new long[]{0x0280000000000000L});
        public static final BitSet FOLLOW_55_in_rulePrimaryExpCS7449 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rulePrimaryExpCS7470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_66_in_rulePrimaryExpCS7495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_rulePrimaryExpCS7538 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_59_in_rulePrimaryExpCS7550 = new BitSet(new long[]{0x0000000000180030L});
        public static final BitSet FOLLOW_ruleConstructorPartCS_in_rulePrimaryExpCS7571 = new BitSet(new long[]{0x1200000000000000L});
        public static final BitSet FOLLOW_57_in_rulePrimaryExpCS7584 = new BitSet(new long[]{0x0000000000180030L});
        public static final BitSet FOLLOW_ruleConstructorPartCS_in_rulePrimaryExpCS7605 = new BitSet(new long[]{0x1200000000000000L});
        public static final BitSet FOLLOW_60_in_rulePrimaryExpCS7619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_rulePrimaryExpCS7660 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rulePrimaryExpCS7679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_66_in_rulePrimaryExpCS7704 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_rulePrimaryExpCS7718 = new BitSet(new long[]{0xE01FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleNavigatingArgCS_in_rulePrimaryExpCS7740 = new BitSet(new long[]{0x0210000000000000L,0x0000000000000018L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS7761 = new BitSet(new long[]{0x0210000000000000L,0x0000000000000018L});
        public static final BitSet FOLLOW_ruleNavigatingSemiArgCS_in_rulePrimaryExpCS7784 = new BitSet(new long[]{0x0210000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS7805 = new BitSet(new long[]{0x0210000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleNavigatingBarArgCS_in_rulePrimaryExpCS7830 = new BitSet(new long[]{0x0210000000000000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS7851 = new BitSet(new long[]{0x0210000000000000L});
        public static final BitSet FOLLOW_52_in_rulePrimaryExpCS7868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_rulePrimaryExpCS7909 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rulePrimaryExpCS7928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_66_in_rulePrimaryExpCS7953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelfExpCS_in_rulePrimaryExpCS7987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_rulePrimaryExpCS8017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_rulePrimaryExpCS8047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_rulePrimaryExpCS8077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_rulePrimaryExpCS8107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpCS_in_rulePrimaryExpCS8137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpCS_in_rulePrimaryExpCS8167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpOrLetExpCS_in_entryRulePrimaryExpOrLetExpCS8202 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpOrLetExpCS8212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_rulePrimaryExpOrLetExpCS8262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_rulePrimaryExpOrLetExpCS8292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgCS_in_entryRuleNavigatingArgCS8327 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgCS8337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCS8383 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_58_in_ruleNavigatingArgCS8396 = new BitSet(new long[]{0x0007FFD000180030L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS8417 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleNavigatingArgCS8430 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgCS8451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingBarArgCS_in_entryRuleNavigatingBarArgCS8491 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingBarArgCS8501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleNavigatingBarArgCS8544 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingBarArgCS8578 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_58_in_ruleNavigatingBarArgCS8591 = new BitSet(new long[]{0x0007FFD000180030L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingBarArgCS8612 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleNavigatingBarArgCS8625 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingBarArgCS8646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_entryRuleNavigatingCommaArgCS8686 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingCommaArgCS8696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleNavigatingCommaArgCS8739 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingCommaArgCS8773 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_58_in_ruleNavigatingCommaArgCS8786 = new BitSet(new long[]{0x0007FFD000180030L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingCommaArgCS8807 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleNavigatingCommaArgCS8820 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS8841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingSemiArgCS_in_entryRuleNavigatingSemiArgCS8881 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingSemiArgCS8891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleNavigatingSemiArgCS8934 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingSemiArgCS8968 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_58_in_ruleNavigatingSemiArgCS8981 = new BitSet(new long[]{0x0007FFD000180030L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingSemiArgCS9002 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleNavigatingSemiArgCS9015 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingSemiArgCS9036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_entryRuleNavigatingArgExpCS9076 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgExpCS9086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgExpCS9135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpCS_in_entryRuleIfExpCS9169 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfExpCS9179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleIfExpCS9216 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS9237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_70_in_ruleIfExpCS9249 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS9270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_71_in_ruleIfExpCS9282 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS9303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_72_in_ruleIfExpCS9315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_entryRuleLetExpCS9351 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetExpCS9361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleLetExpCS9398 = new BitSet(new long[]{0x0000000000180030L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_ruleLetExpCS9419 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_57_in_ruleLetExpCS9432 = new BitSet(new long[]{0x0000000000180030L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_ruleLetExpCS9453 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_74_in_ruleLetExpCS9467 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLetExpCS9488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_entryRuleLetVariableCS9524 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetVariableCS9534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleLetVariableCS9580 = new BitSet(new long[]{0x0400000020000000L});
        public static final BitSet FOLLOW_58_in_ruleLetVariableCS9593 = new BitSet(new long[]{0x0007FFD000180030L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleLetVariableCS9614 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleLetVariableCS9628 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLetVariableCS9649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpCS_in_entryRuleNestedExpCS9685 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNestedExpCS9695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleNestedExpCS9732 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNestedExpCS9753 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleNestedExpCS9765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelfExpCS_in_entryRuleSelfExpCS9801 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelfExpCS9811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleSelfExpCS9860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_synpred3_InternalEssentialOCL576 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_synpred3_InternalEssentialOCL591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_synpred64_InternalEssentialOCL6332 = new BitSet(new long[]{0x0000000FFF660000L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_synpred64_InternalEssentialOCL6353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_synpred65_InternalEssentialOCL6289 = new BitSet(new long[]{0x0000000FFF660000L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_synpred65_InternalEssentialOCL6310 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_synpred65_InternalEssentialOCL6332 = new BitSet(new long[]{0x0000000FFF660000L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_synpred65_InternalEssentialOCL6353 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_rulePrefixedExpOrLetExpCS_in_synpred65_InternalEssentialOCL6376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorCS_in_synpred67_InternalEssentialOCL6417 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_rulePrimaryExpOrLetExpCS_in_synpred67_InternalEssentialOCL6439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_synpred77_InternalEssentialOCL7286 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_synpred77_InternalEssentialOCL7298 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleExpCS_in_synpred77_InternalEssentialOCL7319 = new BitSet(new long[]{0x0280000000000000L});
        public static final BitSet FOLLOW_57_in_synpred77_InternalEssentialOCL7332 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleExpCS_in_synpred77_InternalEssentialOCL7353 = new BitSet(new long[]{0x0280000000000000L});
        public static final BitSet FOLLOW_55_in_synpred77_InternalEssentialOCL7367 = new BitSet(new long[]{0x0040000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_synpred77_InternalEssentialOCL7380 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleExpCS_in_synpred77_InternalEssentialOCL7401 = new BitSet(new long[]{0x0280000000000000L});
        public static final BitSet FOLLOW_57_in_synpred77_InternalEssentialOCL7414 = new BitSet(new long[]{0xE00FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleExpCS_in_synpred77_InternalEssentialOCL7435 = new BitSet(new long[]{0x0280000000000000L});
        public static final BitSet FOLLOW_55_in_synpred77_InternalEssentialOCL7449 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_synpred77_InternalEssentialOCL7470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_66_in_synpred77_InternalEssentialOCL7495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_synpred79_InternalEssentialOCL7538 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_59_in_synpred79_InternalEssentialOCL7550 = new BitSet(new long[]{0x0000000000180030L});
        public static final BitSet FOLLOW_ruleConstructorPartCS_in_synpred79_InternalEssentialOCL7571 = new BitSet(new long[]{0x1200000000000000L});
        public static final BitSet FOLLOW_57_in_synpred79_InternalEssentialOCL7584 = new BitSet(new long[]{0x0000000000180030L});
        public static final BitSet FOLLOW_ruleConstructorPartCS_in_synpred79_InternalEssentialOCL7605 = new BitSet(new long[]{0x1200000000000000L});
        public static final BitSet FOLLOW_60_in_synpred79_InternalEssentialOCL7619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_synpred87_InternalEssentialOCL7660 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_synpred87_InternalEssentialOCL7679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_66_in_synpred87_InternalEssentialOCL7704 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_synpred87_InternalEssentialOCL7718 = new BitSet(new long[]{0xE01FFFD000DA00F0L,0x0000000000000A21L});
        public static final BitSet FOLLOW_ruleNavigatingArgCS_in_synpred87_InternalEssentialOCL7740 = new BitSet(new long[]{0x0210000000000000L,0x0000000000000018L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_synpred87_InternalEssentialOCL7761 = new BitSet(new long[]{0x0210000000000000L,0x0000000000000018L});
        public static final BitSet FOLLOW_ruleNavigatingSemiArgCS_in_synpred87_InternalEssentialOCL7784 = new BitSet(new long[]{0x0210000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_synpred87_InternalEssentialOCL7805 = new BitSet(new long[]{0x0210000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleNavigatingBarArgCS_in_synpred87_InternalEssentialOCL7830 = new BitSet(new long[]{0x0210000000000000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_synpred87_InternalEssentialOCL7851 = new BitSet(new long[]{0x0210000000000000L});
        public static final BitSet FOLLOW_52_in_synpred87_InternalEssentialOCL7868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_synpred89_InternalEssentialOCL7909 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_synpred89_InternalEssentialOCL7928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_66_in_synpred89_InternalEssentialOCL7953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_synpred92_InternalEssentialOCL8047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_synpred93_InternalEssentialOCL8077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_synpred94_InternalEssentialOCL8107 = new BitSet(new long[]{0x0000000000000002L});
    }


}