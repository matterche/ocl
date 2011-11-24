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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SIMPLE_ID", "RULE_ESCAPED_ID", "RULE_INT", "RULE_SINGLE_QUOTED_STRING", "RULE_DOUBLE_QUOTED_STRING", "RULE_ML_SINGLE_QUOTED_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'e'", "'E'", "'+'", "'-'", "'not'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'='", "'<>'", "'and'", "'or'", "'xor'", "'implies'", "'->'", "'Tuple'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "'('", "')'", "','", "':'", "'{'", "'}'", "'..'", "'true'", "'false'", "'invalid'", "'null'", "'::'", "'['", "']'", "'|'", "';'", "'if'", "'then'", "'else'", "'endif'", "'let'", "'in'", "'self'"
    };
    public static final int T__42=42;
    public static final int T__28=28;
    public static final int T__57=57;
    public static final int T__23=23;
    public static final int T__51=51;
    public static final int T__69=69;
    public static final int T__47=47;
    public static final int T__50=50;
    public static final int T__21=21;
    public static final int RULE_ML_SINGLE_QUOTED_STRING=9;
    public static final int T__65=65;
    public static final int T__19=19;
    public static final int T__67=67;
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
    public static final int RULE_DOUBLE_QUOTED_STRING=8;
    public static final int T__59=59;
    public static final int T__54=54;
    public static final int T__48=48;
    public static final int T__34=34;
    public static final int T__56=56;
    public static final int T__15=15;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__20=20;
    public static final int T__58=58;
    public static final int T__64=64;
    public static final int RULE_SIMPLE_ID=4;
    public static final int T__44=44;
    public static final int T__66=66;
    public static final int T__14=14;
    public static final int T__33=33;
    public static final int T__22=22;
    public static final int T__55=55;
    public static final int T__29=29;
    public static final int T__45=45;
    public static final int RULE_ESCAPED_ID=5;
    public static final int RULE_WS=12;
    public static final int T__63=63;
    public static final int T__43=43;
    public static final int T__31=31;
    public static final int T__40=40;
    public static final int EOF=-1;
    public static final int T__53=53;
    public static final int T__16=16;
    public static final int T__32=32;
    public static final int T__38=38;
    public static final int T__37=37;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__60=60;
    public static final int T__41=41;
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


    // $ANTLR start "entryRuleNUMBER_LITERAL"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:148:1: entryRuleNUMBER_LITERAL returns [String current=null] : iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF ;
    public final String entryRuleNUMBER_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER_LITERAL = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:149:2: (iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:150:2: iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBER_LITERALRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL295);
            iv_ruleNUMBER_LITERAL=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER_LITERAL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNUMBER_LITERAL306); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:157:1: ruleNUMBER_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:160:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:161:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:161:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:161:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL346); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getNUMBER_LITERALAccess().getINTTerminalRuleCall_0()); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:168:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_INT) ) {
                    int LA2_3 = input.LA(3);

                    if ( (synpred2_InternalEssentialOCL()) ) {
                        alt2=1;
                    }
                }
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:169:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNUMBER_LITERAL365); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNUMBER_LITERALAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL380); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_2, grammarAccess.getNUMBER_LITERALAccess().getINTTerminalRuleCall_1_1()); 
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:181:3: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=15 && LA5_0<=16)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:181:4: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:181:4: (kw= 'e' | kw= 'E' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==15) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==16) ) {
                        alt3=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:182:2: kw= 'e'
                            {
                            kw=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNUMBER_LITERAL402); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNUMBER_LITERALAccess().getEKeyword_2_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:189:2: kw= 'E'
                            {
                            kw=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNUMBER_LITERAL421); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNUMBER_LITERALAccess().getEKeyword_2_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:194:2: (kw= '+' | kw= '-' )?
                    int alt4=3;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==17) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==18) ) {
                        alt4=2;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:195:2: kw= '+'
                            {
                            kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleNUMBER_LITERAL436); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNUMBER_LITERALAccess().getPlusSignKeyword_2_1_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:202:2: kw= '-'
                            {
                            kw=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleNUMBER_LITERAL455); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNUMBER_LITERALAccess().getHyphenMinusKeyword_2_1_1()); 
                                  
                            }

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL472); if (state.failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:226:1: entryRuleEssentialOCLUnrestrictedIdentifier returns [String current=null] : iv_ruleEssentialOCLUnrestrictedIdentifier= ruleEssentialOCLUnrestrictedIdentifier EOF ;
    public final String entryRuleEssentialOCLUnrestrictedIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedIdentifier = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:227:2: (iv_ruleEssentialOCLUnrestrictedIdentifier= ruleEssentialOCLUnrestrictedIdentifier EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:228:2: iv_ruleEssentialOCLUnrestrictedIdentifier= ruleEssentialOCLUnrestrictedIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedIdentifier_in_entryRuleEssentialOCLUnrestrictedIdentifier524);
            iv_ruleEssentialOCLUnrestrictedIdentifier=ruleEssentialOCLUnrestrictedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnrestrictedIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedIdentifier535); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:235:1: ruleEssentialOCLUnrestrictedIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'e' | kw= 'E' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:238:28: ( (kw= 'e' | kw= 'E' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:239:1: (kw= 'e' | kw= 'E' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:239:1: (kw= 'e' | kw= 'E' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:240:2: kw= 'e'
                    {
                    kw=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEssentialOCLUnrestrictedIdentifier573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLUnrestrictedIdentifierAccess().getEKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:247:2: kw= 'E'
                    {
                    kw=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEssentialOCLUnrestrictedIdentifier592); if (state.failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:260:1: entryRuleEssentialOCLPrefixOperator returns [String current=null] : iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF ;
    public final String entryRuleEssentialOCLPrefixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLPrefixOperator = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:261:2: (iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:262:2: iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLPrefixOperatorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLPrefixOperator_in_entryRuleEssentialOCLPrefixOperator633);
            iv_ruleEssentialOCLPrefixOperator=ruleEssentialOCLPrefixOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLPrefixOperator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLPrefixOperator644); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:269:1: ruleEssentialOCLPrefixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLPrefixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:272:28: ( (kw= '-' | kw= 'not' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:273:1: (kw= '-' | kw= 'not' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:273:1: (kw= '-' | kw= 'not' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
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
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:274:2: kw= '-'
                    {
                    kw=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEssentialOCLPrefixOperator682); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLPrefixOperatorAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:281:2: kw= 'not'
                    {
                    kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEssentialOCLPrefixOperator701); if (state.failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:294:1: entryRuleEssentialOCLInfixOperator returns [String current=null] : iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF ;
    public final String entryRuleEssentialOCLInfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLInfixOperator = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:295:2: (iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:296:2: iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLInfixOperatorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLInfixOperator_in_entryRuleEssentialOCLInfixOperator742);
            iv_ruleEssentialOCLInfixOperator=ruleEssentialOCLInfixOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLInfixOperator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLInfixOperator753); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:303:1: ruleEssentialOCLInfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLInfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:306:28: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:307:1: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:307:1: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            int alt8=14;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 17:
                {
                alt8=3;
                }
                break;
            case 18:
                {
                alt8=4;
                }
                break;
            case 22:
                {
                alt8=5;
                }
                break;
            case 23:
                {
                alt8=6;
                }
                break;
            case 24:
                {
                alt8=7;
                }
                break;
            case 25:
                {
                alt8=8;
                }
                break;
            case 26:
                {
                alt8=9;
                }
                break;
            case 27:
                {
                alt8=10;
                }
                break;
            case 28:
                {
                alt8=11;
                }
                break;
            case 29:
                {
                alt8=12;
                }
                break;
            case 30:
                {
                alt8=13;
                }
                break;
            case 31:
                {
                alt8=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:308:2: kw= '*'
                    {
                    kw=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEssentialOCLInfixOperator791); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:315:2: kw= '/'
                    {
                    kw=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEssentialOCLInfixOperator810); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getSolidusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:322:2: kw= '+'
                    {
                    kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEssentialOCLInfixOperator829); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:329:2: kw= '-'
                    {
                    kw=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEssentialOCLInfixOperator848); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getHyphenMinusKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:336:2: kw= '>'
                    {
                    kw=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEssentialOCLInfixOperator867); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:343:2: kw= '<'
                    {
                    kw=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEssentialOCLInfixOperator886); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:350:2: kw= '>='
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEssentialOCLInfixOperator905); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignEqualsSignKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:357:2: kw= '<='
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEssentialOCLInfixOperator924); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignEqualsSignKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:364:2: kw= '='
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEssentialOCLInfixOperator943); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getEqualsSignKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:371:2: kw= '<>'
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEssentialOCLInfixOperator962); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignGreaterThanSignKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:378:2: kw= 'and'
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEssentialOCLInfixOperator981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getAndKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:385:2: kw= 'or'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEssentialOCLInfixOperator1000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getOrKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:392:2: kw= 'xor'
                    {
                    kw=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEssentialOCLInfixOperator1019); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getXorKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:399:2: kw= 'implies'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleEssentialOCLInfixOperator1038); if (state.failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:412:1: entryRuleEssentialOCLNavigationOperator returns [String current=null] : iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF ;
    public final String entryRuleEssentialOCLNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLNavigationOperator = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:413:2: (iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:414:2: iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLNavigationOperatorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLNavigationOperator_in_entryRuleEssentialOCLNavigationOperator1079);
            iv_ruleEssentialOCLNavigationOperator=ruleEssentialOCLNavigationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLNavigationOperator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLNavigationOperator1090); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:421:1: ruleEssentialOCLNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:424:28: ( (kw= '.' | kw= '->' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:425:1: (kw= '.' | kw= '->' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:425:1: (kw= '.' | kw= '->' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            else if ( (LA9_0==32) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:426:2: kw= '.'
                    {
                    kw=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEssentialOCLNavigationOperator1128); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorAccess().getFullStopKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:433:2: kw= '->'
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEssentialOCLNavigationOperator1147); if (state.failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:446:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:447:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:448:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier1188);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier1199); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:455:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= ruleID | this_EssentialOCLUnrestrictedIdentifier_1= ruleEssentialOCLUnrestrictedIdentifier ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ID_0 = null;

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedIdentifier_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:458:28: ( (this_ID_0= ruleID | this_EssentialOCLUnrestrictedIdentifier_1= ruleEssentialOCLUnrestrictedIdentifier ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:459:1: (this_ID_0= ruleID | this_EssentialOCLUnrestrictedIdentifier_1= ruleEssentialOCLUnrestrictedIdentifier )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:459:1: (this_ID_0= ruleID | this_EssentialOCLUnrestrictedIdentifier_1= ruleEssentialOCLUnrestrictedIdentifier )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_SIMPLE_ID && LA10_0<=RULE_ESCAPED_ID)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=15 && LA10_0<=16)) ) {
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
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:460:5: this_ID_0= ruleID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdentifierAccess().getIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleIdentifier1246);
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
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:472:5: this_EssentialOCLUnrestrictedIdentifier_1= ruleEssentialOCLUnrestrictedIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdentifierAccess().getEssentialOCLUnrestrictedIdentifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedIdentifier_in_ruleIdentifier1279);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:490:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:491:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:492:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1325);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteral1336); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:499:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:502:28: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:503:5: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleStringLiteral1375); if (state.failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:518:1: entryRulePrefixOperator returns [String current=null] : iv_rulePrefixOperator= rulePrefixOperator EOF ;
    public final String entryRulePrefixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefixOperator = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:519:2: (iv_rulePrefixOperator= rulePrefixOperator EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:520:2: iv_rulePrefixOperator= rulePrefixOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixOperatorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixOperator_in_entryRulePrefixOperator1420);
            iv_rulePrefixOperator=rulePrefixOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixOperator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrefixOperator1431); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:527:1: rulePrefixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator ;
    public final AntlrDatatypeRuleToken rulePrefixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLPrefixOperator_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:530:28: (this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:532:5: this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPrefixOperatorAccess().getEssentialOCLPrefixOperatorParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLPrefixOperator_in_rulePrefixOperator1477);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:550:1: entryRuleInfixOperator returns [String current=null] : iv_ruleInfixOperator= ruleInfixOperator EOF ;
    public final String entryRuleInfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixOperator = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:551:2: (iv_ruleInfixOperator= ruleInfixOperator EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:552:2: iv_ruleInfixOperator= ruleInfixOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixOperatorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixOperator_in_entryRuleInfixOperator1522);
            iv_ruleInfixOperator=ruleInfixOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixOperator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfixOperator1533); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:559:1: ruleInfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator ;
    public final AntlrDatatypeRuleToken ruleInfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLInfixOperator_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:562:28: (this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:564:5: this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInfixOperatorAccess().getEssentialOCLInfixOperatorParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLInfixOperator_in_ruleInfixOperator1579);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:582:1: entryRuleNavigationOperator returns [String current=null] : iv_ruleNavigationOperator= ruleNavigationOperator EOF ;
    public final String entryRuleNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperator = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:583:2: (iv_ruleNavigationOperator= ruleNavigationOperator EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:584:2: iv_ruleNavigationOperator= ruleNavigationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationOperatorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigationOperator_in_entryRuleNavigationOperator1624);
            iv_ruleNavigationOperator=ruleNavigationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationOperator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigationOperator1635); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:591:1: ruleNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator ;
    public final AntlrDatatypeRuleToken ruleNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLNavigationOperator_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:594:28: (this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:596:5: this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNavigationOperatorAccess().getEssentialOCLNavigationOperatorParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLNavigationOperator_in_ruleNavigationOperator1681);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:614:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:615:2: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:616:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_entryRuleEssentialOCLUnrestrictedName1726);
            iv_ruleEssentialOCLUnrestrictedName=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedName1737); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:623:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:626:28: (this_Identifier_0= ruleIdentifier )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:628:5: this_Identifier_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameAccess().getIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleEssentialOCLUnrestrictedName1783);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:646:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:647:2: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:648:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_entryRuleUnrestrictedName1828);
            iv_ruleUnrestrictedName=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnrestrictedName1839); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:655:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:658:28: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:660:5: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnrestrictedNameAccess().getEssentialOCLUnrestrictedNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_ruleUnrestrictedName1885);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:678:1: entryRuleEssentialOCLUnreservedName returns [String current=null] : iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF ;
    public final String entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnreservedName = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:679:2: (iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:680:2: iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnreservedName_in_entryRuleEssentialOCLUnreservedName1930);
            iv_ruleEssentialOCLUnreservedName=ruleEssentialOCLUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnreservedName1941); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:687:1: ruleEssentialOCLUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_CollectionTypeIdentifier_1 = null;

        AntlrDatatypeRuleToken this_PrimitiveTypeIdentifier_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:690:28: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:691:1: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:691:1: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
            case RULE_ESCAPED_ID:
            case 15:
            case 16:
                {
                alt11=1;
                }
                break;
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt11=2;
                }
                break;
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt11=3;
                }
                break;
            case 33:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:692:5: this_UnrestrictedName_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getUnrestrictedNameParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleEssentialOCLUnreservedName1988);
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
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:704:5: this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getCollectionTypeIdentifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_ruleEssentialOCLUnreservedName2021);
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
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:716:5: this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getPrimitiveTypeIdentifierParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_ruleEssentialOCLUnreservedName2054);
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
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:728:2: kw= 'Tuple'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEssentialOCLUnreservedName2078); if (state.failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:741:1: entryRuleUnreservedName returns [String current=null] : iv_ruleUnreservedName= ruleUnreservedName EOF ;
    public final String entryRuleUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnreservedName = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:742:2: (iv_ruleUnreservedName= ruleUnreservedName EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:743:2: iv_ruleUnreservedName= ruleUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_entryRuleUnreservedName2119);
            iv_ruleUnreservedName=ruleUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnreservedName2130); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:750:1: ruleUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName ;
    public final AntlrDatatypeRuleToken ruleUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnreservedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:753:28: (this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:755:5: this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnreservedNameAccess().getEssentialOCLUnreservedNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnreservedName_in_ruleUnreservedName2176);
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


    // $ANTLR start "entryRulePrimitiveTypeIdentifier"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:773:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:774:2: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:775:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_entryRulePrimitiveTypeIdentifier2221);
            iv_rulePrimitiveTypeIdentifier=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveTypeIdentifier2232); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:782:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:785:28: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:786:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:786:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            int alt12=8;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt12=1;
                }
                break;
            case 35:
                {
                alt12=2;
                }
                break;
            case 36:
                {
                alt12=3;
                }
                break;
            case 37:
                {
                alt12=4;
                }
                break;
            case 38:
                {
                alt12=5;
                }
                break;
            case 39:
                {
                alt12=6;
                }
                break;
            case 40:
                {
                alt12=7;
                }
                break;
            case 41:
                {
                alt12=8;
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
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:787:2: kw= 'Boolean'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_rulePrimitiveTypeIdentifier2270); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:794:2: kw= 'Integer'
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_rulePrimitiveTypeIdentifier2289); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:801:2: kw= 'Real'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_rulePrimitiveTypeIdentifier2308); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:808:2: kw= 'String'
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_rulePrimitiveTypeIdentifier2327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:815:2: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_rulePrimitiveTypeIdentifier2346); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:822:2: kw= 'OclAny'
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_39_in_rulePrimitiveTypeIdentifier2365); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:829:2: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,40,FollowSets000.FOLLOW_40_in_rulePrimitiveTypeIdentifier2384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:836:2: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_41_in_rulePrimitiveTypeIdentifier2403); if (state.failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:849:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:850:2: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:851:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeCS_in_entryRulePrimitiveTypeCS2443);
            iv_rulePrimitiveTypeCS=rulePrimitiveTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveTypeCS2453); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:858:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:861:28: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:862:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:862:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:863:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:863:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:864:3: lv_name_0_0= rulePrimitiveTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveTypeCSAccess().getNamePrimitiveTypeIdentifierParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_rulePrimitiveTypeCS2498);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:888:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:889:2: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:890:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_entryRuleCollectionTypeIdentifier2534);
            iv_ruleCollectionTypeIdentifier=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionTypeIdentifier2545); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:897:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:900:28: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:901:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:901:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt13=1;
                }
                break;
            case 43:
                {
                alt13=2;
                }
                break;
            case 44:
                {
                alt13=3;
                }
                break;
            case 45:
                {
                alt13=4;
                }
                break;
            case 46:
                {
                alt13=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:902:2: kw= 'Set'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleCollectionTypeIdentifier2583); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:909:2: kw= 'Bag'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleCollectionTypeIdentifier2602); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:916:2: kw= 'Sequence'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleCollectionTypeIdentifier2621); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:923:2: kw= 'Collection'
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleCollectionTypeIdentifier2640); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:930:2: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleCollectionTypeIdentifier2659); if (state.failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:943:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:944:2: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:945:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_entryRuleCollectionTypeCS2699);
            iv_ruleCollectionTypeCS=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionTypeCS2709); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:952:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedType_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:955:28: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:956:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:956:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:956:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )?
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:956:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:957:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:957:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:958:3: lv_name_0_0= ruleCollectionTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_ruleCollectionTypeCS2755);
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

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:974:2: ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )?
            int alt14=3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:974:3: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:974:3: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:974:5: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleCollectionTypeCS2769); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:978:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:979:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:979:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:980:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS2790);
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

                    otherlv_3=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleCollectionTypeCS2802); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_1_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1001:6: (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1001:6: (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1001:8: otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>'
                    {
                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCollectionTypeCS2822); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getCollectionTypeCSAccess().getLessThanSignKeyword_1_1_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1005:1: ( (lv_ownedType_5_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1006:1: (lv_ownedType_5_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1006:1: (lv_ownedType_5_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1007:3: lv_ownedType_5_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS2843);
                    lv_ownedType_5_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_5_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCollectionTypeCS2855); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCollectionTypeCSAccess().getGreaterThanSignKeyword_1_1_2());
                          
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
    // $ANTLR end "ruleCollectionTypeCS"


    // $ANTLR start "entryRuleTupleTypeCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1035:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1036:2: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1037:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleTypeCS_in_entryRuleTupleTypeCS2894);
            iv_ruleTupleTypeCS=ruleTupleTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleTypeCS2904); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1044:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ) ;
    public final EObject ruleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;

        EObject lv_ownedParts_7_0 = null;

        EObject lv_ownedParts_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1047:28: ( ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1048:1: ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1048:1: ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1048:2: ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )?
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1048:2: ( (lv_name_0_0= 'Tuple' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1049:1: (lv_name_0_0= 'Tuple' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1049:1: (lv_name_0_0= 'Tuple' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1050:3: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleTupleTypeCS2947); if (state.failed) return current;
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

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1063:2: ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )?
            int alt19=3;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1063:3: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1063:3: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1063:5: otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleTupleTypeCS2974); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1067:1: ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=RULE_SIMPLE_ID && LA16_0<=RULE_ESCAPED_ID)||(LA16_0>=15 && LA16_0<=16)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1067:2: ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )*
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1067:2: ( (lv_ownedParts_2_0= ruletuplePartCS ) )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1068:1: (lv_ownedParts_2_0= ruletuplePartCS )
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1068:1: (lv_ownedParts_2_0= ruletuplePartCS )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1069:3: lv_ownedParts_2_0= ruletuplePartCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruletuplePartCS_in_ruleTupleTypeCS2996);
                            lv_ownedParts_2_0=ruletuplePartCS();

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
                                      		"tuplePartCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1085:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==49) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1085:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleTupleTypeCS3009); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1089:1: ( (lv_ownedParts_4_0= ruletuplePartCS ) )
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1090:1: (lv_ownedParts_4_0= ruletuplePartCS )
                            	    {
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1090:1: (lv_ownedParts_4_0= ruletuplePartCS )
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1091:3: lv_ownedParts_4_0= ruletuplePartCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruletuplePartCS_in_ruleTupleTypeCS3030);
                            	    lv_ownedParts_4_0=ruletuplePartCS();

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
                            	              		"tuplePartCS");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleTupleTypeCS3046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1112:6: (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1112:6: (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1112:8: otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>'
                    {
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTupleTypeCS3066); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTupleTypeCSAccess().getLessThanSignKeyword_1_1_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1116:1: ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>=RULE_SIMPLE_ID && LA18_0<=RULE_ESCAPED_ID)||(LA18_0>=15 && LA18_0<=16)) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1116:2: ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )*
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1116:2: ( (lv_ownedParts_7_0= ruletuplePartCS ) )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1117:1: (lv_ownedParts_7_0= ruletuplePartCS )
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1117:1: (lv_ownedParts_7_0= ruletuplePartCS )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1118:3: lv_ownedParts_7_0= ruletuplePartCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruletuplePartCS_in_ruleTupleTypeCS3088);
                            lv_ownedParts_7_0=ruletuplePartCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"ownedParts",
                                      		lv_ownedParts_7_0, 
                                      		"tuplePartCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1134:2: (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==49) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1134:4: otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) )
                            	    {
                            	    otherlv_8=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleTupleTypeCS3101); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_8, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1138:1: ( (lv_ownedParts_9_0= ruletuplePartCS ) )
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1139:1: (lv_ownedParts_9_0= ruletuplePartCS )
                            	    {
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1139:1: (lv_ownedParts_9_0= ruletuplePartCS )
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1140:3: lv_ownedParts_9_0= ruletuplePartCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruletuplePartCS_in_ruleTupleTypeCS3122);
                            	    lv_ownedParts_9_0=ruletuplePartCS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"ownedParts",
                            	              		lv_ownedParts_9_0, 
                            	              		"tuplePartCS");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop17;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTupleTypeCS3138); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getTupleTypeCSAccess().getGreaterThanSignKeyword_1_1_2());
                          
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
    // $ANTLR end "ruleTupleTypeCS"


    // $ANTLR start "entryRuletuplePartCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1168:1: entryRuletuplePartCS returns [EObject current=null] : iv_ruletuplePartCS= ruletuplePartCS EOF ;
    public final EObject entryRuletuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletuplePartCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1169:2: (iv_ruletuplePartCS= ruletuplePartCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1170:2: iv_ruletuplePartCS= ruletuplePartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTuplePartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruletuplePartCS_in_entryRuletuplePartCS3177);
            iv_ruletuplePartCS=ruletuplePartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletuplePartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuletuplePartCS3187); if (state.failed) return current;

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
    // $ANTLR end "entryRuletuplePartCS"


    // $ANTLR start "ruletuplePartCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1177:1: ruletuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruletuplePartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1180:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1181:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1181:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1181:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1181:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1182:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1182:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1183:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTuplePartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruletuplePartCS3233);
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

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruletuplePartCS3245); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTuplePartCSAccess().getColonKeyword_1());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1203:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1204:1: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1204:1: (lv_ownedType_2_0= ruleTypeExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1205:3: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTuplePartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruletuplePartCS3266);
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
    // $ANTLR end "ruletuplePartCS"


    // $ANTLR start "entryRuleCollectionLiteralExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1229:1: entryRuleCollectionLiteralExpCS returns [EObject current=null] : iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF ;
    public final EObject entryRuleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1230:2: (iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1231:2: iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_entryRuleCollectionLiteralExpCS3302);
            iv_ruleCollectionLiteralExpCS=ruleCollectionLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionLiteralExpCS3312); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1238:1: ruleCollectionLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
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
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1241:28: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1242:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1242:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1242:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1242:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1243:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1243:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1244:3: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleCollectionLiteralExpCS3358);
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

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleCollectionLiteralExpCS3370); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1264:1: ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_SIMPLE_ID && LA21_0<=RULE_SINGLE_QUOTED_STRING)||(LA21_0>=15 && LA21_0<=16)||(LA21_0>=18 && LA21_0<=20)||(LA21_0>=33 && LA21_0<=47)||(LA21_0>=54 && LA21_0<=57)||LA21_0==63||LA21_0==67||LA21_0==69) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1264:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1264:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1265:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1265:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1266:3: lv_ownedParts_2_0= ruleCollectionLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS3392);
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

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1282:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==49) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1282:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleCollectionLiteralExpCS3405); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1286:1: ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1287:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1287:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1288:3: lv_ownedParts_4_0= ruleCollectionLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS3426);
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
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleCollectionLiteralExpCS3442); if (state.failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1316:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1317:2: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1318:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_entryRuleCollectionLiteralPartCS3478);
            iv_ruleCollectionLiteralPartCS=ruleCollectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionLiteralPartCS3488); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1325:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressionCS_0_0 = null;

        EObject lv_lastExpressionCS_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1328:28: ( ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1329:1: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1329:1: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1329:2: ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1329:2: ( (lv_expressionCS_0_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1330:1: (lv_expressionCS_0_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1330:1: (lv_expressionCS_0_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1331:3: lv_expressionCS_0_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSExpCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS3534);
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

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1347:2: (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==53) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1347:4: otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    {
                    otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleCollectionLiteralPartCS3547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_1_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1351:1: ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1352:1: (lv_lastExpressionCS_2_0= ruleExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1352:1: (lv_lastExpressionCS_2_0= ruleExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1353:3: lv_lastExpressionCS_2_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getLastExpressionCSExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS3568);
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


    // $ANTLR start "entryRulePrimitiveLiteralExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1377:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1378:2: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1379:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveLiteralExpCS_in_entryRulePrimitiveLiteralExpCS3606);
            iv_rulePrimitiveLiteralExpCS=rulePrimitiveLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveLiteralExpCS3616); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1386:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
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
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1389:28: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1390:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1390:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt23=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt23=1;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt23=2;
                }
                break;
            case 54:
            case 55:
                {
                alt23=3;
                }
                break;
            case 20:
                {
                alt23=4;
                }
                break;
            case 56:
                {
                alt23=5;
                }
                break;
            case 57:
                {
                alt23=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1391:2: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNumberLiteralExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpCS_in_rulePrimitiveLiteralExpCS3666);
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
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1404:2: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteralExpCS_in_rulePrimitiveLiteralExpCS3696);
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
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1417:2: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpCS_in_rulePrimitiveLiteralExpCS3726);
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
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1430:2: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_rulePrimitiveLiteralExpCS3756);
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
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1443:2: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getInvalidLiteralExpCSParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInvalidLiteralExpCS_in_rulePrimitiveLiteralExpCS3786);
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
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1456:2: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNullLiteralExpCSParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNullLiteralExpCS_in_rulePrimitiveLiteralExpCS3816);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1475:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1476:2: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1477:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_entryRuleTupleLiteralExpCS3851);
            iv_ruleTupleLiteralExpCS=ruleTupleLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralExpCS3861); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1484:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
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
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1487:28: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1488:1: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1488:1: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1488:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleTupleLiteralExpCS3898); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleTupleLiteralExpCS3910); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1496:1: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1497:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1497:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1498:3: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS3931);
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

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1514:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==49) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1514:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleTupleLiteralExpCS3944); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1518:1: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1519:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1519:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1520:3: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS3965);
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
            	    break loop24;
                }
            } while (true);

            otherlv_5=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleTupleLiteralExpCS3979); if (state.failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1548:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1549:2: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1550:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_entryRuleTupleLiteralPartCS4015);
            iv_ruleTupleLiteralPartCS=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralPartCS4025); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1557:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1560:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1561:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1561:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1561:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1561:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1562:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1562:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1563:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTupleLiteralPartCS4071);
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

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1579:2: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==50) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1579:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleTupleLiteralPartCS4084); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1583:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1584:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1584:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1585:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleTupleLiteralPartCS4105);
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

            otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTupleLiteralPartCS4119); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1605:1: ( (lv_initExpression_4_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1606:1: (lv_initExpression_4_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1606:1: (lv_initExpression_4_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1607:3: lv_initExpression_4_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getInitExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleTupleLiteralPartCS4140);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1631:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1632:2: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1633:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpCS_in_entryRuleNumberLiteralExpCS4176);
            iv_ruleNumberLiteralExpCS=ruleNumberLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumberLiteralExpCS4186); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1640:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= ruleNUMBER_LITERAL ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1643:28: ( ( (lv_name_0_0= ruleNUMBER_LITERAL ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1644:1: ( (lv_name_0_0= ruleNUMBER_LITERAL ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1644:1: ( (lv_name_0_0= ruleNUMBER_LITERAL ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1645:1: (lv_name_0_0= ruleNUMBER_LITERAL )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1645:1: (lv_name_0_0= ruleNUMBER_LITERAL )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1646:3: lv_name_0_0= ruleNUMBER_LITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralExpCSAccess().getNameNUMBER_LITERALParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNUMBER_LITERAL_in_ruleNumberLiteralExpCS4231);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1670:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1671:2: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1672:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteralExpCS_in_entryRuleStringLiteralExpCS4266);
            iv_ruleStringLiteralExpCS=ruleStringLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteralExpCS4276); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1679:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= ruleStringLiteral ) )+ ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1682:28: ( ( (lv_name_0_0= ruleStringLiteral ) )+ )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1683:1: ( (lv_name_0_0= ruleStringLiteral ) )+
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1683:1: ( (lv_name_0_0= ruleStringLiteral ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_SINGLE_QUOTED_STRING) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1684:1: (lv_name_0_0= ruleStringLiteral )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1684:1: (lv_name_0_0= ruleStringLiteral )
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1685:3: lv_name_0_0= ruleStringLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStringLiteralExpCSAccess().getNameStringLiteralParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleStringLiteralExpCS4321);
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
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1709:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1710:2: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1711:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpCS_in_entryRuleBooleanLiteralExpCS4357);
            iv_ruleBooleanLiteralExpCS=ruleBooleanLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanLiteralExpCS4367); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1718:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1721:28: ( ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1722:1: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1722:1: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==54) ) {
                alt27=1;
            }
            else if ( (LA27_0==55) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1722:2: ( (lv_name_0_0= 'true' ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1722:2: ( (lv_name_0_0= 'true' ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1723:1: (lv_name_0_0= 'true' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1723:1: (lv_name_0_0= 'true' )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1724:3: lv_name_0_0= 'true'
                    {
                    lv_name_0_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleBooleanLiteralExpCS4410); if (state.failed) return current;
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
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1738:6: ( (lv_name_1_0= 'false' ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1738:6: ( (lv_name_1_0= 'false' ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1739:1: (lv_name_1_0= 'false' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1739:1: (lv_name_1_0= 'false' )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1740:3: lv_name_1_0= 'false'
                    {
                    lv_name_1_0=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleBooleanLiteralExpCS4447); if (state.failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1761:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1762:2: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1763:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_entryRuleUnlimitedNaturalLiteralExpCS4496);
            iv_ruleUnlimitedNaturalLiteralExpCS=ruleUnlimitedNaturalLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedNaturalLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnlimitedNaturalLiteralExpCS4506); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1770:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1773:28: ( ( () otherlv_1= '*' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1774:1: ( () otherlv_1= '*' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1774:1: ( () otherlv_1= '*' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1774:2: () otherlv_1= '*'
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1774:2: ()
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1775:2: 
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

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleUnlimitedNaturalLiteralExpCS4555); if (state.failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1795:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1796:2: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1797:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvalidLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInvalidLiteralExpCS_in_entryRuleInvalidLiteralExpCS4591);
            iv_ruleInvalidLiteralExpCS=ruleInvalidLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvalidLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvalidLiteralExpCS4601); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1804:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1807:28: ( ( () otherlv_1= 'invalid' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1808:1: ( () otherlv_1= 'invalid' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1808:1: ( () otherlv_1= 'invalid' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1808:2: () otherlv_1= 'invalid'
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1808:2: ()
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1809:2: 
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

            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleInvalidLiteralExpCS4650); if (state.failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1829:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1830:2: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1831:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNullLiteralExpCS_in_entryRuleNullLiteralExpCS4686);
            iv_ruleNullLiteralExpCS=ruleNullLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNullLiteralExpCS4696); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1838:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1841:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1842:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1842:1: ( () otherlv_1= 'null' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1842:2: () otherlv_1= 'null'
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1842:2: ()
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1843:2: 
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

            otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleNullLiteralExpCS4745); if (state.failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1863:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1864:2: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1865:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_entryRuleTypeLiteralCS4781);
            iv_ruleTypeLiteralCS=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralCS4791); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1872:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_CollectionTypeCS_1 = null;

        EObject this_TupleTypeCS_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1875:28: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1876:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1876:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt28=1;
                }
                break;
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt28=2;
                }
                break;
            case 33:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1877:2: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getPrimitiveTypeCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeCS_in_ruleTypeLiteralCS4841);
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
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1890:2: this_CollectionTypeCS_1= ruleCollectionTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getCollectionTypeCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleTypeLiteralCS4871);
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
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1903:2: this_TupleTypeCS_2= ruleTupleTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getTupleTypeCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleTypeCS_in_ruleTypeLiteralCS4901);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1922:1: entryRuleTypeLiteralExpCS returns [EObject current=null] : iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF ;
    public final EObject entryRuleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1923:2: (iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1924:2: iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_entryRuleTypeLiteralExpCS4936);
            iv_ruleTypeLiteralExpCS=ruleTypeLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralExpCS4946); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1931:1: ruleTypeLiteralExpCS returns [EObject current=null] : ( (lv_ownedType_0_0= ruleTypeLiteralCS ) ) ;
    public final EObject ruleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedType_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1934:28: ( ( (lv_ownedType_0_0= ruleTypeLiteralCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1935:1: ( (lv_ownedType_0_0= ruleTypeLiteralCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1935:1: ( (lv_ownedType_0_0= ruleTypeLiteralCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1936:1: (lv_ownedType_0_0= ruleTypeLiteralCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1936:1: (lv_ownedType_0_0= ruleTypeLiteralCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1937:3: lv_ownedType_0_0= ruleTypeLiteralCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeTypeLiteralCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_ruleTypeLiteralExpCS4991);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1961:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1962:2: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1963:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeNameExpCS_in_entryRuleTypeNameExpCS5026);
            iv_ruleTypeNameExpCS=ruleTypeNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeNameExpCS5036); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1970:1: ruleTypeNameExpCS returns [EObject current=null] : ( ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '::' ( ( ( ruleUnreservedName ) ) otherlv_3= '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) ) ;
    public final EObject ruleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1973:28: ( ( ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '::' ( ( ( ruleUnreservedName ) ) otherlv_3= '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1974:1: ( ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '::' ( ( ( ruleUnreservedName ) ) otherlv_3= '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1974:1: ( ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '::' ( ( ( ruleUnreservedName ) ) otherlv_3= '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )
            int alt30=2;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
                {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==EOF||LA30_1==22||LA30_1==26||(LA30_1>=48 && LA30_1<=49)||(LA30_1>=61 && LA30_1<=62)) ) {
                    alt30=2;
                }
                else if ( (LA30_1==58) ) {
                    alt30=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==EOF||LA30_2==22||LA30_2==26||(LA30_2>=48 && LA30_2<=49)||(LA30_2>=61 && LA30_2<=62)) ) {
                    alt30=2;
                }
                else if ( (LA30_2==58) ) {
                    alt30=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA30_3 = input.LA(2);

                if ( (LA30_3==58) ) {
                    alt30=1;
                }
                else if ( (LA30_3==EOF||LA30_3==22||LA30_3==26||(LA30_3>=48 && LA30_3<=49)||(LA30_3>=61 && LA30_3<=62)) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA30_4 = input.LA(2);

                if ( (LA30_4==58) ) {
                    alt30=1;
                }
                else if ( (LA30_4==EOF||LA30_4==22||LA30_4==26||(LA30_4>=48 && LA30_4<=49)||(LA30_4>=61 && LA30_4<=62)) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1974:2: ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '::' ( ( ( ruleUnreservedName ) ) otherlv_3= '::' )* ) ( ( ruleUnreservedName ) ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1974:2: ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '::' ( ( ( ruleUnreservedName ) ) otherlv_3= '::' )* ) ( ( ruleUnreservedName ) ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1974:3: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '::' ( ( ( ruleUnreservedName ) ) otherlv_3= '::' )* ) ( ( ruleUnreservedName ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1974:3: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '::' ( ( ( ruleUnreservedName ) ) otherlv_3= '::' )* )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1974:4: ( ( ruleUnrestrictedName ) ) otherlv_1= '::' ( ( ( ruleUnreservedName ) ) otherlv_3= '::' )*
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1974:4: ( ( ruleUnrestrictedName ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1975:1: ( ruleUnrestrictedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1975:1: ( ruleUnrestrictedName )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1976:3: ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeNameExpCSRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getNamespaceNamespaceCrossReference_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTypeNameExpCS5090);
                    ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleTypeNameExpCS5102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTypeNameExpCSAccess().getColonColonKeyword_0_0_1());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1996:1: ( ( ( ruleUnreservedName ) ) otherlv_3= '::' )*
                    loop29:
                    do {
                        int alt29=2;
                        alt29 = dfa29.predict(input);
                        switch (alt29) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1996:2: ( ( ruleUnreservedName ) ) otherlv_3= '::'
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1996:2: ( ( ruleUnreservedName ) )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1997:1: ( ruleUnreservedName )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1997:1: ( ruleUnreservedName )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1998:3: ruleUnreservedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTypeNameExpCSRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getNamespaceNamespaceCrossReference_0_0_2_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_ruleTypeNameExpCS5130);
                    	    ruleUnreservedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_3=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleTypeNameExpCS5142); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getTypeNameExpCSAccess().getColonColonKeyword_0_0_2_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2018:4: ( ( ruleUnreservedName ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2019:1: ( ruleUnreservedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2019:1: ( ruleUnreservedName )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2020:3: ruleUnreservedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeNameExpCSRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getElementTypeCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_ruleTypeNameExpCS5172);
                    ruleUnreservedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2037:6: ( ( ruleUnrestrictedName ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2037:6: ( ( ruleUnrestrictedName ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2038:1: ( ruleUnrestrictedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2038:1: ( ruleUnrestrictedName )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2039:3: ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeNameExpCSRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getElementTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTypeNameExpCS5206);
                    ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleTypeNameExpCS"


    // $ANTLR start "entryRuleTypeExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2063:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2064:2: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2065:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_entryRuleTypeExpCS5242);
            iv_ruleTypeExpCS=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeExpCS5252); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2072:1: ruleTypeExpCS returns [EObject current=null] : (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2075:28: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2076:1: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2076:1: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_SIMPLE_ID && LA31_0<=RULE_ESCAPED_ID)||(LA31_0>=15 && LA31_0<=16)) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=33 && LA31_0<=46)) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2077:2: this_TypeNameExpCS_0= ruleTypeNameExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeNameExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeNameExpCS_in_ruleTypeExpCS5302);
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
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2090:2: this_TypeLiteralCS_1= ruleTypeLiteralCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeLiteralCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_ruleTypeExpCS5332);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2109:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2110:2: (iv_ruleExpCS= ruleExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2111:2: iv_ruleExpCS= ruleExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_entryRuleExpCS5367);
            iv_ruleExpCS=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpCS5377); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2118:1: ruleExpCS returns [EObject current=null] : this_InfixedExpCS_0= ruleInfixedExpCS ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_InfixedExpCS_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2121:28: (this_InfixedExpCS_0= ruleInfixedExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2123:2: this_InfixedExpCS_0= ruleInfixedExpCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpCSAccess().getInfixedExpCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixedExpCS_in_ruleExpCS5426);
            this_InfixedExpCS_0=ruleInfixedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_InfixedExpCS_0; 
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
    // $ANTLR end "ruleExpCS"


    // $ANTLR start "entryRuleInfixedExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2142:1: entryRuleInfixedExpCS returns [EObject current=null] : iv_ruleInfixedExpCS= ruleInfixedExpCS EOF ;
    public final EObject entryRuleInfixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixedExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2143:2: (iv_ruleInfixedExpCS= ruleInfixedExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2144:2: iv_ruleInfixedExpCS= ruleInfixedExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixedExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixedExpCS_in_entryRuleInfixedExpCS5460);
            iv_ruleInfixedExpCS=ruleInfixedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfixedExpCS5470); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInfixedExpCS"


    // $ANTLR start "ruleInfixedExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2151:1: ruleInfixedExpCS returns [EObject current=null] : (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? ) ;
    public final EObject ruleInfixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedExpCS_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2154:28: ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2155:1: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2155:1: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2156:2: this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInfixedExpCSAccess().getPrefixedExpCSParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_ruleInfixedExpCS5520);
            this_PrefixedExpCS_0=rulePrefixedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrefixedExpCS_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2167:1: ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2167:2: () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2167:2: ()
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2168:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2176:2: ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        alt32 = dfa32.predict(input);
                        switch (alt32) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2176:3: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2176:3: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2177:1: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2177:1: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2178:3: lv_ownedOperator_2_0= ruleBinaryOperatorCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_ruleInfixedExpCS5554);
                    	    lv_ownedOperator_2_0=ruleBinaryOperatorCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInfixedExpCSRule());
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

                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2194:2: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2195:1: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2195:1: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2196:3: lv_ownedExpression_3_0= rulePrefixedExpCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_ruleInfixedExpCS5575);
                    	    lv_ownedExpression_3_0=rulePrefixedExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInfixedExpCSRule());
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


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);


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
    // $ANTLR end "ruleInfixedExpCS"


    // $ANTLR start "entryRuleBinaryOperatorCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2220:1: entryRuleBinaryOperatorCS returns [EObject current=null] : iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF ;
    public final EObject entryRuleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperatorCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2221:2: (iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2222:2: iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_entryRuleBinaryOperatorCS5615);
            iv_ruleBinaryOperatorCS=ruleBinaryOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryOperatorCS5625); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2229:1: ruleBinaryOperatorCS returns [EObject current=null] : (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) ;
    public final EObject ruleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject this_InfixOperatorCS_0 = null;

        EObject this_NavigationOperatorCS_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2232:28: ( (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2233:1: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2233:1: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=17 && LA34_0<=18)||(LA34_0>=20 && LA34_0<=31)) ) {
                alt34=1;
            }
            else if ( (LA34_0==14||LA34_0==32) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2234:2: this_InfixOperatorCS_0= ruleInfixOperatorCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinaryOperatorCSAccess().getInfixOperatorCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInfixOperatorCS_in_ruleBinaryOperatorCS5675);
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
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2247:2: this_NavigationOperatorCS_1= ruleNavigationOperatorCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinaryOperatorCSAccess().getNavigationOperatorCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigationOperatorCS_in_ruleBinaryOperatorCS5705);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2266:1: entryRuleInfixOperatorCS returns [EObject current=null] : iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF ;
    public final EObject entryRuleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixOperatorCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2267:2: (iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2268:2: iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixOperatorCS_in_entryRuleInfixOperatorCS5740);
            iv_ruleInfixOperatorCS=ruleInfixOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfixOperatorCS5750); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2275:1: ruleInfixOperatorCS returns [EObject current=null] : ( (lv_name_0_0= ruleInfixOperator ) ) ;
    public final EObject ruleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2278:28: ( ( (lv_name_0_0= ruleInfixOperator ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2279:1: ( (lv_name_0_0= ruleInfixOperator ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2279:1: ( (lv_name_0_0= ruleInfixOperator ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2280:1: (lv_name_0_0= ruleInfixOperator )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2280:1: (lv_name_0_0= ruleInfixOperator )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2281:3: lv_name_0_0= ruleInfixOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInfixOperatorCSAccess().getNameInfixOperatorParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixOperator_in_ruleInfixOperatorCS5795);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2305:1: entryRuleNavigationOperatorCS returns [EObject current=null] : iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF ;
    public final EObject entryRuleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationOperatorCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2306:2: (iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2307:2: iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigationOperatorCS_in_entryRuleNavigationOperatorCS5830);
            iv_ruleNavigationOperatorCS=ruleNavigationOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigationOperatorCS5840); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2314:1: ruleNavigationOperatorCS returns [EObject current=null] : ( (lv_name_0_0= ruleNavigationOperator ) ) ;
    public final EObject ruleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2317:28: ( ( (lv_name_0_0= ruleNavigationOperator ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2318:1: ( (lv_name_0_0= ruleNavigationOperator ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2318:1: ( (lv_name_0_0= ruleNavigationOperator ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2319:1: (lv_name_0_0= ruleNavigationOperator )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2319:1: (lv_name_0_0= ruleNavigationOperator )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2320:3: lv_name_0_0= ruleNavigationOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigationOperatorCSAccess().getNameNavigationOperatorParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigationOperator_in_ruleNavigationOperatorCS5885);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2344:1: entryRulePrefixedExpCS returns [EObject current=null] : iv_rulePrefixedExpCS= rulePrefixedExpCS EOF ;
    public final EObject entryRulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2345:2: (iv_rulePrefixedExpCS= rulePrefixedExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2346:2: iv_rulePrefixedExpCS= rulePrefixedExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_entryRulePrefixedExpCS5920);
            iv_rulePrefixedExpCS=rulePrefixedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrefixedExpCS5930); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2353:1: rulePrefixedExpCS returns [EObject current=null] : (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) ) ;
    public final EObject rulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpCS_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2356:28: ( (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2357:1: (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2357:1: (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_SIMPLE_ID && LA36_0<=RULE_SINGLE_QUOTED_STRING)||(LA36_0>=15 && LA36_0<=16)||LA36_0==20||(LA36_0>=33 && LA36_0<=47)||(LA36_0>=54 && LA36_0<=57)||LA36_0==63||LA36_0==67||LA36_0==69) ) {
                alt36=1;
            }
            else if ( ((LA36_0>=18 && LA36_0<=19)) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2358:2: this_PrimaryExpCS_0= rulePrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixedExpCSAccess().getPrimaryExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS5980);
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
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2370:6: ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2370:6: ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2370:7: () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2370:7: ()
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2371:2: 
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

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2379:2: ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0>=18 && LA35_0<=19)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2380:1: (lv_ownedOperator_2_0= ruleUnaryOperatorCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2380:1: (lv_ownedOperator_2_0= ruleUnaryOperatorCS )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2381:3: lv_ownedOperator_2_0= ruleUnaryOperatorCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrefixedExpCSAccess().getOwnedOperatorUnaryOperatorCSParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorCS_in_rulePrefixedExpCS6019);
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
                    	    if ( cnt35 >= 1 ) break loop35;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2397:3: ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2398:1: (lv_ownedExpression_3_0= rulePrimaryExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2398:1: (lv_ownedExpression_3_0= rulePrimaryExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2399:3: lv_ownedExpression_3_0= rulePrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedExpCSAccess().getOwnedExpressionPrimaryExpCSParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS6041);
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


    // $ANTLR start "entryRuleUnaryOperatorCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2423:1: entryRuleUnaryOperatorCS returns [EObject current=null] : iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF ;
    public final EObject entryRuleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperatorCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2424:2: (iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2425:2: iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorCS_in_entryRuleUnaryOperatorCS6078);
            iv_ruleUnaryOperatorCS=ruleUnaryOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryOperatorCS6088); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2432:1: ruleUnaryOperatorCS returns [EObject current=null] : ( (lv_name_0_0= rulePrefixOperator ) ) ;
    public final EObject ruleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2435:28: ( ( (lv_name_0_0= rulePrefixOperator ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2436:1: ( (lv_name_0_0= rulePrefixOperator ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2436:1: ( (lv_name_0_0= rulePrefixOperator ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2437:1: (lv_name_0_0= rulePrefixOperator )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2437:1: (lv_name_0_0= rulePrefixOperator )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2438:3: lv_name_0_0= rulePrefixOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnaryOperatorCSAccess().getNamePrefixOperatorParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixOperator_in_ruleUnaryOperatorCS6133);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2462:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2463:2: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2464:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_entryRulePrimaryExpCS6168);
            iv_rulePrimaryExpCS=rulePrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpCS6178); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2471:1: rulePrimaryExpCS returns [EObject current=null] : (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS ) ;
    public final EObject rulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NavigatingExpCS_0 = null;

        EObject this_SelfExpCS_1 = null;

        EObject this_PrimitiveLiteralExpCS_2 = null;

        EObject this_TupleLiteralExpCS_3 = null;

        EObject this_CollectionLiteralExpCS_4 = null;

        EObject this_TypeLiteralExpCS_5 = null;

        EObject this_LetExpCS_6 = null;

        EObject this_IfExpCS_7 = null;

        EObject this_NestedExpCS_8 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2474:28: ( (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2475:1: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2475:1: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )
            int alt37=9;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2476:2: this_NavigatingExpCS_0= ruleNavigatingExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNavigatingExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingExpCS_in_rulePrimaryExpCS6228);
                    this_NavigatingExpCS_0=ruleNavigatingExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NavigatingExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2489:2: this_SelfExpCS_1= ruleSelfExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSelfExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSelfExpCS_in_rulePrimaryExpCS6258);
                    this_SelfExpCS_1=ruleSelfExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SelfExpCS_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2502:2: this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPrimitiveLiteralExpCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveLiteralExpCS_in_rulePrimaryExpCS6288);
                    this_PrimitiveLiteralExpCS_2=rulePrimitiveLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimitiveLiteralExpCS_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2515:2: this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTupleLiteralExpCSParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_rulePrimaryExpCS6318);
                    this_TupleLiteralExpCS_3=ruleTupleLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TupleLiteralExpCS_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2528:2: this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getCollectionLiteralExpCSParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_rulePrimaryExpCS6348);
                    this_CollectionLiteralExpCS_4=ruleCollectionLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CollectionLiteralExpCS_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2541:2: this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTypeLiteralExpCSParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_rulePrimaryExpCS6378);
                    this_TypeLiteralExpCS_5=ruleTypeLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeLiteralExpCS_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2554:2: this_LetExpCS_6= ruleLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getLetExpCSParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_rulePrimaryExpCS6408);
                    this_LetExpCS_6=ruleLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LetExpCS_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2567:2: this_IfExpCS_7= ruleIfExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getIfExpCSParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIfExpCS_in_rulePrimaryExpCS6438);
                    this_IfExpCS_7=ruleIfExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfExpCS_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2580:2: this_NestedExpCS_8= ruleNestedExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNestedExpCSParserRuleCall_8()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNestedExpCS_in_rulePrimaryExpCS6468);
                    this_NestedExpCS_8=ruleNestedExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NestedExpCS_8; 
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


    // $ANTLR start "entryRuleNameExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2599:1: entryRuleNameExpCS returns [EObject current=null] : iv_ruleNameExpCS= ruleNameExpCS EOF ;
    public final EObject entryRuleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2600:2: (iv_ruleNameExpCS= ruleNameExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2601:2: iv_ruleNameExpCS= ruleNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNameExpCS_in_entryRuleNameExpCS6503);
            iv_ruleNameExpCS=ruleNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNameExpCS6513); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNameExpCS"


    // $ANTLR start "ruleNameExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2608:1: ruleNameExpCS returns [EObject current=null] : ( ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '::' ( ( ( ruleUnreservedName ) ) otherlv_3= '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) ) ;
    public final EObject ruleNameExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2611:28: ( ( ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '::' ( ( ( ruleUnreservedName ) ) otherlv_3= '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2612:1: ( ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '::' ( ( ( ruleUnreservedName ) ) otherlv_3= '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2612:1: ( ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '::' ( ( ( ruleUnreservedName ) ) otherlv_3= '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )
            int alt39=2;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
                {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==58) ) {
                    alt39=1;
                }
                else if ( (LA39_1==EOF||LA39_1==14||(LA39_1>=17 && LA39_1<=18)||(LA39_1>=20 && LA39_1<=32)||(LA39_1>=47 && LA39_1<=50)||(LA39_1>=52 && LA39_1<=53)||(LA39_1>=59 && LA39_1<=62)||(LA39_1>=64 && LA39_1<=66)||LA39_1==68) ) {
                    alt39=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA39_2 = input.LA(2);

                if ( (LA39_2==EOF||LA39_2==14||(LA39_2>=17 && LA39_2<=18)||(LA39_2>=20 && LA39_2<=32)||(LA39_2>=47 && LA39_2<=50)||(LA39_2>=52 && LA39_2<=53)||(LA39_2>=59 && LA39_2<=62)||(LA39_2>=64 && LA39_2<=66)||LA39_2==68) ) {
                    alt39=2;
                }
                else if ( (LA39_2==58) ) {
                    alt39=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 2, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA39_3 = input.LA(2);

                if ( (LA39_3==58) ) {
                    alt39=1;
                }
                else if ( (LA39_3==EOF||LA39_3==14||(LA39_3>=17 && LA39_3<=18)||(LA39_3>=20 && LA39_3<=32)||(LA39_3>=47 && LA39_3<=50)||(LA39_3>=52 && LA39_3<=53)||(LA39_3>=59 && LA39_3<=62)||(LA39_3>=64 && LA39_3<=66)||LA39_3==68) ) {
                    alt39=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 3, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA39_4 = input.LA(2);

                if ( (LA39_4==EOF||LA39_4==14||(LA39_4>=17 && LA39_4<=18)||(LA39_4>=20 && LA39_4<=32)||(LA39_4>=47 && LA39_4<=50)||(LA39_4>=52 && LA39_4<=53)||(LA39_4>=59 && LA39_4<=62)||(LA39_4>=64 && LA39_4<=66)||LA39_4==68) ) {
                    alt39=2;
                }
                else if ( (LA39_4==58) ) {
                    alt39=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2612:2: ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '::' ( ( ( ruleUnreservedName ) ) otherlv_3= '::' )* ) ( ( ruleUnreservedName ) ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2612:2: ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '::' ( ( ( ruleUnreservedName ) ) otherlv_3= '::' )* ) ( ( ruleUnreservedName ) ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2612:3: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '::' ( ( ( ruleUnreservedName ) ) otherlv_3= '::' )* ) ( ( ruleUnreservedName ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2612:3: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '::' ( ( ( ruleUnreservedName ) ) otherlv_3= '::' )* )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2612:4: ( ( ruleUnrestrictedName ) ) otherlv_1= '::' ( ( ( ruleUnreservedName ) ) otherlv_3= '::' )*
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2612:4: ( ( ruleUnrestrictedName ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2613:1: ( ruleUnrestrictedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2613:1: ( ruleUnrestrictedName )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2614:3: ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getNameExpCSRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNameExpCSAccess().getNamespaceNamespaceCrossReference_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleNameExpCS6567);
                    ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleNameExpCS6579); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNameExpCSAccess().getColonColonKeyword_0_0_1());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2634:1: ( ( ( ruleUnreservedName ) ) otherlv_3= '::' )*
                    loop38:
                    do {
                        int alt38=2;
                        alt38 = dfa38.predict(input);
                        switch (alt38) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2634:2: ( ( ruleUnreservedName ) ) otherlv_3= '::'
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2634:2: ( ( ruleUnreservedName ) )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2635:1: ( ruleUnreservedName )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2635:1: ( ruleUnreservedName )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2636:3: ruleUnreservedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getNameExpCSRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNameExpCSAccess().getNamespaceNamespaceCrossReference_0_0_2_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_ruleNameExpCS6607);
                    	    ruleUnreservedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_3=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleNameExpCS6619); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getNameExpCSAccess().getColonColonKeyword_0_0_2_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2656:4: ( ( ruleUnreservedName ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2657:1: ( ruleUnreservedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2657:1: ( ruleUnreservedName )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2658:3: ruleUnreservedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getNameExpCSRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNameExpCSAccess().getElementNamedElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_ruleNameExpCS6649);
                    ruleUnreservedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2675:6: ( ( ruleUnrestrictedName ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2675:6: ( ( ruleUnrestrictedName ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2676:1: ( ruleUnrestrictedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2676:1: ( ruleUnrestrictedName )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2677:3: ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getNameExpCSRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNameExpCSAccess().getElementNamedElementCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleNameExpCS6683);
                    ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleNameExpCS"


    // $ANTLR start "entryRuleIndexExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2701:1: entryRuleIndexExpCS returns [EObject current=null] : iv_ruleIndexExpCS= ruleIndexExpCS EOF ;
    public final EObject entryRuleIndexExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2702:2: (iv_ruleIndexExpCS= ruleIndexExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2703:2: iv_ruleIndexExpCS= ruleIndexExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIndexExpCS_in_entryRuleIndexExpCS6719);
            iv_ruleIndexExpCS=ruleIndexExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIndexExpCS6729); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIndexExpCS"


    // $ANTLR start "ruleIndexExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2710:1: ruleIndexExpCS returns [EObject current=null] : (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? ) ;
    public final EObject ruleIndexExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_NameExpCS_0 = null;

        EObject lv_firstIndexes_3_0 = null;

        EObject lv_firstIndexes_5_0 = null;

        EObject lv_secondIndexes_8_0 = null;

        EObject lv_secondIndexes_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2713:28: ( (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2714:1: (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2714:1: (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2715:2: this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIndexExpCSAccess().getNameExpCSParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNameExpCS_in_ruleIndexExpCS6779);
            this_NameExpCS_0=ruleNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NameExpCS_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2726:1: ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==59) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2726:2: () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )?
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2726:2: ()
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2727:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getIndexExpCSAccess().getIndexExpCSNamedExpAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleIndexExpCS6803); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getIndexExpCSAccess().getLeftSquareBracketKeyword_1_1());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2739:1: ( (lv_firstIndexes_3_0= ruleExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2740:1: (lv_firstIndexes_3_0= ruleExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2740:1: (lv_firstIndexes_3_0= ruleExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2741:3: lv_firstIndexes_3_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIndexExpCSAccess().getFirstIndexesExpCSParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIndexExpCS6824);
                    lv_firstIndexes_3_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIndexExpCSRule());
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

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2757:2: (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==49) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2757:4: otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) )
                    	    {
                    	    otherlv_4=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleIndexExpCS6837); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getIndexExpCSAccess().getCommaKeyword_1_3_0());
                    	          
                    	    }
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2761:1: ( (lv_firstIndexes_5_0= ruleExpCS ) )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2762:1: (lv_firstIndexes_5_0= ruleExpCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2762:1: (lv_firstIndexes_5_0= ruleExpCS )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2763:3: lv_firstIndexes_5_0= ruleExpCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIndexExpCSAccess().getFirstIndexesExpCSParserRuleCall_1_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIndexExpCS6858);
                    	    lv_firstIndexes_5_0=ruleExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getIndexExpCSRule());
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
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleIndexExpCS6872); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getIndexExpCSAccess().getRightSquareBracketKeyword_1_4());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2783:1: (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==59) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2783:3: otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']'
                            {
                            otherlv_7=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleIndexExpCS6885); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getIndexExpCSAccess().getLeftSquareBracketKeyword_1_5_0());
                                  
                            }
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2787:1: ( (lv_secondIndexes_8_0= ruleExpCS ) )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2788:1: (lv_secondIndexes_8_0= ruleExpCS )
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2788:1: (lv_secondIndexes_8_0= ruleExpCS )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2789:3: lv_secondIndexes_8_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getIndexExpCSAccess().getSecondIndexesExpCSParserRuleCall_1_5_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIndexExpCS6906);
                            lv_secondIndexes_8_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getIndexExpCSRule());
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

                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2805:2: (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==49) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2805:4: otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) )
                            	    {
                            	    otherlv_9=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleIndexExpCS6919); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_9, grammarAccess.getIndexExpCSAccess().getCommaKeyword_1_5_2_0());
                            	          
                            	    }
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2809:1: ( (lv_secondIndexes_10_0= ruleExpCS ) )
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2810:1: (lv_secondIndexes_10_0= ruleExpCS )
                            	    {
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2810:1: (lv_secondIndexes_10_0= ruleExpCS )
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2811:3: lv_secondIndexes_10_0= ruleExpCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getIndexExpCSAccess().getSecondIndexesExpCSParserRuleCall_1_5_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIndexExpCS6940);
                            	    lv_secondIndexes_10_0=ruleExpCS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getIndexExpCSRule());
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
                            	    break loop41;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleIndexExpCS6954); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getIndexExpCSAccess().getRightSquareBracketKeyword_1_5_3());
                                  
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
    // $ANTLR end "ruleIndexExpCS"


    // $ANTLR start "entryRuleNavigatingExpCS_Base"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2839:1: entryRuleNavigatingExpCS_Base returns [EObject current=null] : iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF ;
    public final EObject entryRuleNavigatingExpCS_Base() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingExpCS_Base = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2840:2: (iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2841:2: iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingExpCS_BaseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingExpCS_Base_in_entryRuleNavigatingExpCS_Base6994);
            iv_ruleNavigatingExpCS_Base=ruleNavigatingExpCS_Base();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingExpCS_Base; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingExpCS_Base7004); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingExpCS_Base"


    // $ANTLR start "ruleNavigatingExpCS_Base"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2848:1: ruleNavigatingExpCS_Base returns [EObject current=null] : this_IndexExpCS_0= ruleIndexExpCS ;
    public final EObject ruleNavigatingExpCS_Base() throws RecognitionException {
        EObject current = null;

        EObject this_IndexExpCS_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2851:28: (this_IndexExpCS_0= ruleIndexExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2853:2: this_IndexExpCS_0= ruleIndexExpCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNavigatingExpCS_BaseAccess().getIndexExpCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleIndexExpCS_in_ruleNavigatingExpCS_Base7053);
            this_IndexExpCS_0=ruleIndexExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_IndexExpCS_0; 
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
    // $ANTLR end "ruleNavigatingExpCS_Base"


    // $ANTLR start "entryRuleNavigatingExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2872:1: entryRuleNavigatingExpCS returns [EObject current=null] : iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF ;
    public final EObject entryRuleNavigatingExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2873:2: (iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2874:2: iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingExpCS_in_entryRuleNavigatingExpCS7087);
            iv_ruleNavigatingExpCS=ruleNavigatingExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingExpCS7097); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingExpCS"


    // $ANTLR start "ruleNavigatingExpCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2881:1: ruleNavigatingExpCS returns [EObject current=null] : (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? ) ;
    public final EObject ruleNavigatingExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_9=null;
        EObject this_NavigatingExpCS_Base_0 = null;

        EObject lv_argument_3_0 = null;

        EObject lv_argument_4_0 = null;

        EObject lv_argument_5_0 = null;

        EObject lv_argument_6_0 = null;

        EObject lv_argument_7_0 = null;

        EObject lv_argument_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2884:28: ( (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2885:1: (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2885:1: (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2886:2: this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCS_BaseParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingExpCS_Base_in_ruleNavigatingExpCS7147);
            this_NavigatingExpCS_Base_0=ruleNavigatingExpCS_Base();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NavigatingExpCS_Base_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2897:1: ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==47) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2897:2: () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')'
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2897:2: ()
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2898:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCSNamedExpAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleNavigatingExpCS7171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingExpCSAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2910:1: ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( ((LA49_0>=RULE_SIMPLE_ID && LA49_0<=RULE_SINGLE_QUOTED_STRING)||(LA49_0>=15 && LA49_0<=16)||(LA49_0>=18 && LA49_0<=20)||(LA49_0>=33 && LA49_0<=47)||(LA49_0>=54 && LA49_0<=57)||LA49_0==63||LA49_0==67||LA49_0==69) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2910:2: ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )?
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2910:2: ( (lv_argument_3_0= ruleNavigatingArgCS ) )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2911:1: (lv_argument_3_0= ruleNavigatingArgCS )
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2911:1: (lv_argument_3_0= ruleNavigatingArgCS )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2912:3: lv_argument_3_0= ruleNavigatingArgCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingArgCSParserRuleCall_1_2_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCS_in_ruleNavigatingExpCS7193);
                            lv_argument_3_0=ruleNavigatingArgCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"argument",
                                      		lv_argument_3_0, 
                                      		"NavigatingArgCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2928:2: ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )*
                            loop44:
                            do {
                                int alt44=2;
                                int LA44_0 = input.LA(1);

                                if ( (LA44_0==49) ) {
                                    alt44=1;
                                }


                                switch (alt44) {
                            	case 1 :
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2929:1: (lv_argument_4_0= ruleNavigatingCommaArgCS )
                            	    {
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2929:1: (lv_argument_4_0= ruleNavigatingCommaArgCS )
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2930:3: lv_argument_4_0= ruleNavigatingCommaArgCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_ruleNavigatingExpCS7214);
                            	    lv_argument_4_0=ruleNavigatingCommaArgCS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"argument",
                            	              		lv_argument_4_0, 
                            	              		"NavigatingCommaArgCS");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop44;
                                }
                            } while (true);

                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2946:3: ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )?
                            int alt46=2;
                            int LA46_0 = input.LA(1);

                            if ( (LA46_0==62) ) {
                                alt46=1;
                            }
                            switch (alt46) {
                                case 1 :
                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2946:4: ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )*
                                    {
                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2946:4: ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) )
                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2947:1: (lv_argument_5_0= ruleNavigatingSemiArgCS )
                                    {
                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2947:1: (lv_argument_5_0= ruleNavigatingSemiArgCS )
                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2948:3: lv_argument_5_0= ruleNavigatingSemiArgCS
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingSemiArgCSParserRuleCall_1_2_2_0_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingSemiArgCS_in_ruleNavigatingExpCS7237);
                                    lv_argument_5_0=ruleNavigatingSemiArgCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                                      	        }
                                             		add(
                                             			current, 
                                             			"argument",
                                              		lv_argument_5_0, 
                                              		"NavigatingSemiArgCS");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }

                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2964:2: ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )*
                                    loop45:
                                    do {
                                        int alt45=2;
                                        int LA45_0 = input.LA(1);

                                        if ( (LA45_0==49) ) {
                                            alt45=1;
                                        }


                                        switch (alt45) {
                                    	case 1 :
                                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2965:1: (lv_argument_6_0= ruleNavigatingCommaArgCS )
                                    	    {
                                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2965:1: (lv_argument_6_0= ruleNavigatingCommaArgCS )
                                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2966:3: lv_argument_6_0= ruleNavigatingCommaArgCS
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_2_1_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_ruleNavigatingExpCS7258);
                                    	    lv_argument_6_0=ruleNavigatingCommaArgCS();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      	        if (current==null) {
                                    	      	            current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                                    	      	        }
                                    	             		add(
                                    	             			current, 
                                    	             			"argument",
                                    	              		lv_argument_6_0, 
                                    	              		"NavigatingCommaArgCS");
                                    	      	        afterParserOrEnumRuleCall();
                                    	      	    
                                    	    }

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop45;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2982:5: ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )?
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( (LA48_0==61) ) {
                                alt48=1;
                            }
                            switch (alt48) {
                                case 1 :
                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2982:6: ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )*
                                    {
                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2982:6: ( (lv_argument_7_0= ruleNavigatingBarArgCS ) )
                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2983:1: (lv_argument_7_0= ruleNavigatingBarArgCS )
                                    {
                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2983:1: (lv_argument_7_0= ruleNavigatingBarArgCS )
                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2984:3: lv_argument_7_0= ruleNavigatingBarArgCS
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingBarArgCSParserRuleCall_1_2_3_0_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingBarArgCS_in_ruleNavigatingExpCS7283);
                                    lv_argument_7_0=ruleNavigatingBarArgCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                                      	        }
                                             		add(
                                             			current, 
                                             			"argument",
                                              		lv_argument_7_0, 
                                              		"NavigatingBarArgCS");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }

                                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3000:2: ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )*
                                    loop47:
                                    do {
                                        int alt47=2;
                                        int LA47_0 = input.LA(1);

                                        if ( (LA47_0==49) ) {
                                            alt47=1;
                                        }


                                        switch (alt47) {
                                    	case 1 :
                                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3001:1: (lv_argument_8_0= ruleNavigatingCommaArgCS )
                                    	    {
                                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3001:1: (lv_argument_8_0= ruleNavigatingCommaArgCS )
                                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3002:3: lv_argument_8_0= ruleNavigatingCommaArgCS
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_3_1_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_ruleNavigatingExpCS7304);
                                    	    lv_argument_8_0=ruleNavigatingCommaArgCS();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      	        if (current==null) {
                                    	      	            current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                                    	      	        }
                                    	             		add(
                                    	             			current, 
                                    	             			"argument",
                                    	              		lv_argument_8_0, 
                                    	              		"NavigatingCommaArgCS");
                                    	      	        afterParserOrEnumRuleCall();
                                    	      	    
                                    	    }

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop47;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleNavigatingExpCS7321); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getNavigatingExpCSAccess().getRightParenthesisKeyword_1_3());
                          
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
    // $ANTLR end "ruleNavigatingExpCS"


    // $ANTLR start "entryRuleNavigatingArgCS"
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3030:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3031:2: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3032:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCS_in_entryRuleNavigatingArgCS7359);
            iv_ruleNavigatingArgCS=ruleNavigatingArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgCS7369); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3039:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_init_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3042:28: ( ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3043:1: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3043:1: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3043:2: ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )?
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3043:2: ( (lv_name_0_0= ruleNavigatingArgExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3044:1: (lv_name_0_0= ruleNavigatingArgExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3044:1: (lv_name_0_0= ruleNavigatingArgExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3045:3: lv_name_0_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCS7415);
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

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3061:2: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==50) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3061:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleNavigatingArgCS7428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3065:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3066:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3066:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3067:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS7449);
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


                    }
                    break;

            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3083:4: (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==26) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3083:6: otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) )
                    {
                    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleNavigatingArgCS7464); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3087:1: ( (lv_init_4_0= ruleExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3088:1: (lv_init_4_0= ruleExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3088:1: (lv_init_4_0= ruleExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3089:3: lv_init_4_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getInitExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgCS7485);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3113:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3114:2: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3115:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingBarArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingBarArgCS_in_entryRuleNavigatingBarArgCS7523);
            iv_ruleNavigatingBarArgCS=ruleNavigatingBarArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingBarArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingBarArgCS7533); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3122:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) ;
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
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3125:28: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3126:1: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3126:1: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3126:2: ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3126:2: ( (lv_prefix_0_0= '|' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3127:1: (lv_prefix_0_0= '|' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3127:1: (lv_prefix_0_0= '|' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3128:3: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleNavigatingBarArgCS7576); if (state.failed) return current;
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

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3141:2: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3142:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3142:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3143:3: lv_name_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingBarArgCS7610);
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

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3159:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==50) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3159:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleNavigatingBarArgCS7623); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingBarArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3163:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3164:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3164:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3165:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingBarArgCS7644);
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


                    }
                    break;

            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3181:4: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==26) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3181:6: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                    {
                    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleNavigatingBarArgCS7659); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNavigatingBarArgCSAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3185:1: ( (lv_init_5_0= ruleExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3186:1: (lv_init_5_0= ruleExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3186:1: (lv_init_5_0= ruleExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3187:3: lv_init_5_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getInitExpCSParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingBarArgCS7680);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3211:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3212:2: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3213:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingCommaArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_entryRuleNavigatingCommaArgCS7718);
            iv_ruleNavigatingCommaArgCS=ruleNavigatingCommaArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingCommaArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingCommaArgCS7728); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3220:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) ;
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
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3223:28: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3224:1: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3224:1: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3224:2: ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3224:2: ( (lv_prefix_0_0= ',' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3225:1: (lv_prefix_0_0= ',' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3225:1: (lv_prefix_0_0= ',' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3226:3: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleNavigatingCommaArgCS7771); if (state.failed) return current;
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

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3239:2: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3240:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3240:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3241:3: lv_name_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingCommaArgCS7805);
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

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3257:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==50) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3257:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleNavigatingCommaArgCS7818); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3261:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3262:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3262:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3263:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingCommaArgCS7839);
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


                    }
                    break;

            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3279:4: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==26) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3279:6: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                    {
                    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleNavigatingCommaArgCS7854); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3283:1: ( (lv_init_5_0= ruleExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3284:1: (lv_init_5_0= ruleExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3284:1: (lv_init_5_0= ruleExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3285:3: lv_init_5_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getInitExpCSParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS7875);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3309:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3310:2: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3311:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingSemiArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingSemiArgCS_in_entryRuleNavigatingSemiArgCS7913);
            iv_ruleNavigatingSemiArgCS=ruleNavigatingSemiArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingSemiArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingSemiArgCS7923); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3318:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) ;
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
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3321:28: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3322:1: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3322:1: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3322:2: ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3322:2: ( (lv_prefix_0_0= ';' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3323:1: (lv_prefix_0_0= ';' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3323:1: (lv_prefix_0_0= ';' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3324:3: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleNavigatingSemiArgCS7966); if (state.failed) return current;
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

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3337:2: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3338:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3338:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3339:3: lv_name_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingSemiArgCS8000);
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

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3355:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==50) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3355:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleNavigatingSemiArgCS8013); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingSemiArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3359:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3360:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3360:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3361:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingSemiArgCS8034);
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


                    }
                    break;

            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3377:4: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==26) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3377:6: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                    {
                    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleNavigatingSemiArgCS8049); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNavigatingSemiArgCSAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3381:1: ( (lv_init_5_0= ruleExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3382:1: (lv_init_5_0= ruleExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3382:1: (lv_init_5_0= ruleExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3383:3: lv_init_5_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getInitExpCSParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingSemiArgCS8070);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3407:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3408:2: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3409:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_entryRuleNavigatingArgExpCS8108);
            iv_ruleNavigatingArgExpCS=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgExpCS8118); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3416:1: ruleNavigatingArgExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3419:28: (this_ExpCS_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3421:2: this_ExpCS_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNavigatingArgExpCSAccess().getExpCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgExpCS8167);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3440:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3441:2: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3442:2: iv_ruleIfExpCS= ruleIfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIfExpCS_in_entryRuleIfExpCS8201);
            iv_ruleIfExpCS=ruleIfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfExpCS8211); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3449:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' ) ;
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
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3452:28: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3453:1: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3453:1: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3453:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif'
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleIfExpCS8248); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3457:1: ( (lv_condition_1_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3458:1: (lv_condition_1_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3458:1: (lv_condition_1_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3459:3: lv_condition_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getConditionExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS8269);
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

            otherlv_2=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleIfExpCS8281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3479:1: ( (lv_thenExpression_3_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3480:1: (lv_thenExpression_3_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3480:1: (lv_thenExpression_3_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3481:3: lv_thenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getThenExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS8302);
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

            otherlv_4=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleIfExpCS8314); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getIfExpCSAccess().getElseKeyword_4());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3501:1: ( (lv_elseExpression_5_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3502:1: (lv_elseExpression_5_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3502:1: (lv_elseExpression_5_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3503:3: lv_elseExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getElseExpressionExpCSParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS8335);
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

            otherlv_6=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleIfExpCS8347); if (state.failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3531:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3532:2: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3533:2: iv_ruleLetExpCS= ruleLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_entryRuleLetExpCS8383);
            iv_ruleLetExpCS=ruleLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetExpCS8393); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3540:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) ) ;
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
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3543:28: ( (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3544:1: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3544:1: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3544:3: otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleLetExpCS8430); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3548:1: ( (lv_variable_1_0= ruleLetVariableCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3549:1: (lv_variable_1_0= ruleLetVariableCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3549:1: (lv_variable_1_0= ruleLetVariableCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3550:3: lv_variable_1_0= ruleLetVariableCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_ruleLetExpCS8451);
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

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3566:2: (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==49) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3566:4: otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleLetExpCS8464); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3570:1: ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3571:1: (lv_variable_3_0= ruleLetVariableCS )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3571:1: (lv_variable_3_0= ruleLetVariableCS )
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3572:3: lv_variable_3_0= ruleLetVariableCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_ruleLetExpCS8485);
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
            	    break loop59;
                }
            } while (true);

            otherlv_4=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleLetExpCS8499); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3592:1: ( (lv_in_5_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3593:1: (lv_in_5_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3593:1: (lv_in_5_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3594:3: lv_in_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpCSAccess().getInExpCSParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLetExpCS8520);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3618:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3619:2: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3620:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetVariableCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_entryRuleLetVariableCS8556);
            iv_ruleLetVariableCS=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetVariableCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetVariableCS8566); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3627:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3630:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3631:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3631:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3631:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3631:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3632:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3632:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3633:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleLetVariableCS8612);
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

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3649:2: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==50) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3649:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleLetVariableCS8625); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLetVariableCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3653:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3654:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3654:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3655:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleLetVariableCS8646);
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

            otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleLetVariableCS8660); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_2());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3675:1: ( (lv_initExpression_4_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3676:1: (lv_initExpression_4_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3676:1: (lv_initExpression_4_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3677:3: lv_initExpression_4_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getInitExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLetVariableCS8681);
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3701:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3702:2: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3703:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNestedExpCS_in_entryRuleNestedExpCS8717);
            iv_ruleNestedExpCS=ruleNestedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNestedExpCS8727); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3710:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_source_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3713:28: ( (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3714:1: (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3714:1: (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3714:3: otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleNestedExpCS8764); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3718:1: ( (lv_source_1_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3719:1: (lv_source_1_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3719:1: (lv_source_1_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3720:3: lv_source_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNestedExpCSAccess().getSourceExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNestedExpCS8785);
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

            otherlv_2=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleNestedExpCS8797); if (state.failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3748:1: entryRuleSelfExpCS returns [EObject current=null] : iv_ruleSelfExpCS= ruleSelfExpCS EOF ;
    public final EObject entryRuleSelfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3749:2: (iv_ruleSelfExpCS= ruleSelfExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3750:2: iv_ruleSelfExpCS= ruleSelfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSelfExpCS_in_entryRuleSelfExpCS8833);
            iv_ruleSelfExpCS=ruleSelfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelfExpCS8843); if (state.failed) return current;

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
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3757:1: ruleSelfExpCS returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3760:28: ( ( () otherlv_1= 'self' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3761:1: ( () otherlv_1= 'self' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3761:1: ( () otherlv_1= 'self' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3761:2: () otherlv_1= 'self'
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3761:2: ()
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3762:2: 
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

            otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleSelfExpCS8892); if (state.failed) return current;
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

    // $ANTLR start synpred2_InternalEssentialOCL
    public final void synpred2_InternalEssentialOCL_fragment() throws RecognitionException {   
        Token kw=null;
        Token this_INT_2=null;

        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:169:2: (kw= '.' this_INT_2= RULE_INT )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:169:2: kw= '.' this_INT_2= RULE_INT
        {
        kw=(Token)match(input,14,FollowSets000.FOLLOW_14_in_synpred2_InternalEssentialOCL365); if (state.failed) return ;
        this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_synpred2_InternalEssentialOCL380); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalEssentialOCL

    // $ANTLR start synpred39_InternalEssentialOCL
    public final void synpred39_InternalEssentialOCL_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_ownedType_5_0 = null;


        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1001:6: ( (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1001:6: (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1001:6: (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1001:8: otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>'
        {
        otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_synpred39_InternalEssentialOCL2822); if (state.failed) return ;
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1005:1: ( (lv_ownedType_5_0= ruleTypeExpCS ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1006:1: (lv_ownedType_5_0= ruleTypeExpCS )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1006:1: (lv_ownedType_5_0= ruleTypeExpCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1007:3: lv_ownedType_5_0= ruleTypeExpCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_synpred39_InternalEssentialOCL2843);
        lv_ownedType_5_0=ruleTypeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_synpred39_InternalEssentialOCL2855); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred39_InternalEssentialOCL

    // $ANTLR start synpred45_InternalEssentialOCL
    public final void synpred45_InternalEssentialOCL_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_ownedParts_7_0 = null;

        EObject lv_ownedParts_9_0 = null;


        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1112:6: ( (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1112:6: (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1112:6: (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1112:8: otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>'
        {
        otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_synpred45_InternalEssentialOCL3066); if (state.failed) return ;
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1116:1: ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )?
        int alt68=2;
        int LA68_0 = input.LA(1);

        if ( ((LA68_0>=RULE_SIMPLE_ID && LA68_0<=RULE_ESCAPED_ID)||(LA68_0>=15 && LA68_0<=16)) ) {
            alt68=1;
        }
        switch (alt68) {
            case 1 :
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1116:2: ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )*
                {
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1116:2: ( (lv_ownedParts_7_0= ruletuplePartCS ) )
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1117:1: (lv_ownedParts_7_0= ruletuplePartCS )
                {
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1117:1: (lv_ownedParts_7_0= ruletuplePartCS )
                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1118:3: lv_ownedParts_7_0= ruletuplePartCS
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_0_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruletuplePartCS_in_synpred45_InternalEssentialOCL3088);
                lv_ownedParts_7_0=ruletuplePartCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1134:2: (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )*
                loop67:
                do {
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==49) ) {
                        alt67=1;
                    }


                    switch (alt67) {
                	case 1 :
                	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1134:4: otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) )
                	    {
                	    otherlv_8=(Token)match(input,49,FollowSets000.FOLLOW_49_in_synpred45_InternalEssentialOCL3101); if (state.failed) return ;
                	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1138:1: ( (lv_ownedParts_9_0= ruletuplePartCS ) )
                	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1139:1: (lv_ownedParts_9_0= ruletuplePartCS )
                	    {
                	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1139:1: (lv_ownedParts_9_0= ruletuplePartCS )
                	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1140:3: lv_ownedParts_9_0= ruletuplePartCS
                	    {
                	    if ( state.backtracking==0 ) {
                	       
                	      	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_1_0()); 
                	      	    
                	    }
                	    pushFollow(FollowSets000.FOLLOW_ruletuplePartCS_in_synpred45_InternalEssentialOCL3122);
                	    lv_ownedParts_9_0=ruletuplePartCS();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop67;
                    }
                } while (true);


                }
                break;

        }

        otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_22_in_synpred45_InternalEssentialOCL3138); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred45_InternalEssentialOCL

    // $ANTLR start synpred63_InternalEssentialOCL
    public final void synpred63_InternalEssentialOCL_fragment() throws RecognitionException {   
        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;


        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2176:3: ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2176:3: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2176:3: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2177:1: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2177:1: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2178:3: lv_ownedOperator_2_0= ruleBinaryOperatorCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_1_1_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_synpred63_InternalEssentialOCL5554);
        lv_ownedOperator_2_0=ruleBinaryOperatorCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2194:2: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2195:1: (lv_ownedExpression_3_0= rulePrefixedExpCS )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2195:1: (lv_ownedExpression_3_0= rulePrefixedExpCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2196:3: lv_ownedExpression_3_0= rulePrefixedExpCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_1_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_synpred63_InternalEssentialOCL5575);
        lv_ownedExpression_3_0=rulePrefixedExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred63_InternalEssentialOCL

    // $ANTLR start synpred64_InternalEssentialOCL
    public final void synpred64_InternalEssentialOCL_fragment() throws RecognitionException {   
        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;


        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2167:2: ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2167:2: () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2167:2: ()
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2168:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2176:2: ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+
        int cnt71=0;
        loop71:
        do {
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==14||(LA71_0>=17 && LA71_0<=18)||(LA71_0>=20 && LA71_0<=32)) ) {
                alt71=1;
            }


            switch (alt71) {
        	case 1 :
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2176:3: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
        	    {
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2176:3: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) )
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2177:1: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
        	    {
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2177:1: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2178:3: lv_ownedOperator_2_0= ruleBinaryOperatorCS
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_1_1_0_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_synpred64_InternalEssentialOCL5554);
        	    lv_ownedOperator_2_0=ruleBinaryOperatorCS();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }

        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2194:2: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2195:1: (lv_ownedExpression_3_0= rulePrefixedExpCS )
        	    {
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2195:1: (lv_ownedExpression_3_0= rulePrefixedExpCS )
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2196:3: lv_ownedExpression_3_0= rulePrefixedExpCS
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_1_1_1_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_synpred64_InternalEssentialOCL5575);
        	    lv_ownedExpression_3_0=rulePrefixedExpCS();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt71 >= 1 ) break loop71;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(71, input);
                    throw eee;
            }
            cnt71++;
        } while (true);


        }
    }
    // $ANTLR end synpred64_InternalEssentialOCL

    // $ANTLR start synpred71_InternalEssentialOCL
    public final void synpred71_InternalEssentialOCL_fragment() throws RecognitionException {   
        EObject this_TupleLiteralExpCS_3 = null;


        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2515:2: (this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2515:2: this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_synpred71_InternalEssentialOCL6318);
        this_TupleLiteralExpCS_3=ruleTupleLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_InternalEssentialOCL

    // $ANTLR start synpred72_InternalEssentialOCL
    public final void synpred72_InternalEssentialOCL_fragment() throws RecognitionException {   
        EObject this_CollectionLiteralExpCS_4 = null;


        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2528:2: (this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2528:2: this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_synpred72_InternalEssentialOCL6348);
        this_CollectionLiteralExpCS_4=ruleCollectionLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_InternalEssentialOCL

    // $ANTLR start synpred73_InternalEssentialOCL
    public final void synpred73_InternalEssentialOCL_fragment() throws RecognitionException {   
        EObject this_TypeLiteralExpCS_5 = null;


        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2541:2: (this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2541:2: this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_synpred73_InternalEssentialOCL6378);
        this_TypeLiteralExpCS_5=ruleTypeLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_InternalEssentialOCL

    // Delegated rules

    public final boolean synpred63_InternalEssentialOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalEssentialOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalEssentialOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalEssentialOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_InternalEssentialOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_InternalEssentialOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_InternalEssentialOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_InternalEssentialOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_InternalEssentialOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_InternalEssentialOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalEssentialOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalEssentialOCL_fragment(); // can never throw exception
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
    public final boolean synpred45_InternalEssentialOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalEssentialOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA38 dfa38 = new DFA38(this);
    static final String DFA14_eotS =
        "\41\uffff";
    static final String DFA14_eofS =
        "\1\3\40\uffff";
    static final String DFA14_minS =
        "\1\16\1\uffff\1\0\36\uffff";
    static final String DFA14_maxS =
        "\1\104\1\uffff\1\0\36\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\34\uffff\1\2";
    static final String DFA14_specialS =
        "\2\uffff\1\0\36\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\3\2\uffff\2\3\1\uffff\3\3\1\2\11\3\16\uffff\1\1\6\3\6\uffff"+
            "\3\3\1\uffff\3\3\1\uffff\1\3",
            "",
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

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "974:2: ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalEssentialOCL()) ) {s = 32;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\40\uffff";
    static final String DFA19_eofS =
        "\1\3\37\uffff";
    static final String DFA19_minS =
        "\1\16\1\uffff\1\0\35\uffff";
    static final String DFA19_maxS =
        "\1\104\1\uffff\1\0\35\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\33\uffff\1\2";
    static final String DFA19_specialS =
        "\2\uffff\1\0\35\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\3\2\uffff\2\3\1\uffff\3\3\1\2\11\3\16\uffff\1\1\3\3\1\uffff"+
            "\2\3\6\uffff\3\3\1\uffff\3\3\1\uffff\1\3",
            "",
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

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1063:2: ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_2 = input.LA(1);

                         
                        int index19_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalEssentialOCL()) ) {s = 31;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index19_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\25\uffff";
    static final String DFA29_eofS =
        "\1\uffff\22\23\2\uffff";
    static final String DFA29_minS =
        "\1\4\22\26\2\uffff";
    static final String DFA29_maxS =
        "\1\56\22\76\2\uffff";
    static final String DFA29_acceptS =
        "\23\uffff\1\2\1\1";
    static final String DFA29_specialS =
        "\25\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1\1\2\11\uffff\1\3\1\4\20\uffff\1\22\1\12\1\13\1\14\1\15"+
            "\1\16\1\17\1\20\1\21\1\5\1\6\1\7\1\10\1\11",
            "\1\23\3\uffff\1\23\25\uffff\2\23\10\uffff\1\24\2\uffff\2\23",
            "\1\23\3\uffff\1\23\25\uffff\2\23\10\uffff\1\24\2\uffff\2\23",
            "\1\23\3\uffff\1\23\25\uffff\2\23\10\uffff\1\24\2\uffff\2\23",
            "\1\23\3\uffff\1\23\25\uffff\2\23\10\uffff\1\24\2\uffff\2\23",
            "\1\23\3\uffff\1\23\25\uffff\2\23\10\uffff\1\24\2\uffff\2\23",
            "\1\23\3\uffff\1\23\25\uffff\2\23\10\uffff\1\24\2\uffff\2\23",
            "\1\23\3\uffff\1\23\25\uffff\2\23\10\uffff\1\24\2\uffff\2\23",
            "\1\23\3\uffff\1\23\25\uffff\2\23\10\uffff\1\24\2\uffff\2\23",
            "\1\23\3\uffff\1\23\25\uffff\2\23\10\uffff\1\24\2\uffff\2\23",
            "\1\23\3\uffff\1\23\25\uffff\2\23\10\uffff\1\24\2\uffff\2\23",
            "\1\23\3\uffff\1\23\25\uffff\2\23\10\uffff\1\24\2\uffff\2\23",
            "\1\23\3\uffff\1\23\25\uffff\2\23\10\uffff\1\24\2\uffff\2\23",
            "\1\23\3\uffff\1\23\25\uffff\2\23\10\uffff\1\24\2\uffff\2\23",
            "\1\23\3\uffff\1\23\25\uffff\2\23\10\uffff\1\24\2\uffff\2\23",
            "\1\23\3\uffff\1\23\25\uffff\2\23\10\uffff\1\24\2\uffff\2\23",
            "\1\23\3\uffff\1\23\25\uffff\2\23\10\uffff\1\24\2\uffff\2\23",
            "\1\23\3\uffff\1\23\25\uffff\2\23\10\uffff\1\24\2\uffff\2\23",
            "\1\23\3\uffff\1\23\25\uffff\2\23\10\uffff\1\24\2\uffff\2\23",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "()* loopback of 1996:1: ( ( ( ruleUnreservedName ) ) otherlv_3= '::' )*";
        }
    }
    static final String DFA33_eotS =
        "\23\uffff";
    static final String DFA33_eofS =
        "\1\21\22\uffff";
    static final String DFA33_minS =
        "\1\16\20\0\2\uffff";
    static final String DFA33_maxS =
        "\1\104\20\0\2\uffff";
    static final String DFA33_acceptS =
        "\21\uffff\1\2\1\1";
    static final String DFA33_specialS =
        "\1\uffff\1\3\1\13\1\5\1\11\1\17\1\14\1\0\1\1\1\6\1\15\1\7\1\4\1"+
        "\12\1\10\1\2\1\16\2\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\17\2\uffff\1\3\1\4\1\uffff\1\1\1\2\1\5\1\6\1\7\1\10\1\11"+
            "\1\12\1\13\1\14\1\15\1\16\1\20\17\uffff\3\21\1\uffff\2\21\6"+
            "\uffff\3\21\1\uffff\3\21\1\uffff\1\21",
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
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "2167:1: ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_7 = input.LA(1);

                         
                        int index33_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index33_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_8 = input.LA(1);

                         
                        int index33_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index33_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_15 = input.LA(1);

                         
                        int index33_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index33_15);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA33_12 = input.LA(1);

                         
                        int index33_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index33_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA33_3 = input.LA(1);

                         
                        int index33_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index33_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA33_9 = input.LA(1);

                         
                        int index33_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index33_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA33_11 = input.LA(1);

                         
                        int index33_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index33_11);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA33_14 = input.LA(1);

                         
                        int index33_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index33_14);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA33_4 = input.LA(1);

                         
                        int index33_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index33_4);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA33_13 = input.LA(1);

                         
                        int index33_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index33_13);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index33_2);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA33_6 = input.LA(1);

                         
                        int index33_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index33_6);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA33_10 = input.LA(1);

                         
                        int index33_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index33_10);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA33_16 = input.LA(1);

                         
                        int index33_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index33_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA33_5 = input.LA(1);

                         
                        int index33_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index33_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA32_eotS =
        "\23\uffff";
    static final String DFA32_eofS =
        "\1\1\22\uffff";
    static final String DFA32_minS =
        "\1\16\1\uffff\20\0\1\uffff";
    static final String DFA32_maxS =
        "\1\104\1\uffff\20\0\1\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\2\20\uffff\1\1";
    static final String DFA32_specialS =
        "\2\uffff\1\5\1\3\1\13\1\6\1\11\1\17\1\14\1\0\1\1\1\15\1\7\1\4\1"+
        "\12\1\10\1\2\1\16\1\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\20\2\uffff\1\5\1\6\1\uffff\1\3\1\4\1\7\1\10\1\11\1\12\1"+
            "\2\1\13\1\14\1\15\1\16\1\17\1\21\17\uffff\3\1\1\uffff\2\1\6"+
            "\uffff\3\1\1\uffff\3\1\1\uffff\1\1",
            "",
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
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "()+ loopback of 2176:2: ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_9 = input.LA(1);

                         
                        int index32_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_10 = input.LA(1);

                         
                        int index32_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_16 = input.LA(1);

                         
                        int index32_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_3 = input.LA(1);

                         
                        int index32_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_13 = input.LA(1);

                         
                        int index32_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_13);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_2);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_5 = input.LA(1);

                         
                        int index32_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_5);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_12 = input.LA(1);

                         
                        int index32_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_12);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_15 = input.LA(1);

                         
                        int index32_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_15);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA32_6 = input.LA(1);

                         
                        int index32_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_6);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA32_14 = input.LA(1);

                         
                        int index32_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_14);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA32_4 = input.LA(1);

                         
                        int index32_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_4);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA32_8 = input.LA(1);

                         
                        int index32_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_8);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA32_11 = input.LA(1);

                         
                        int index32_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_11);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA32_17 = input.LA(1);

                         
                        int index32_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_17);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA32_7 = input.LA(1);

                         
                        int index32_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalEssentialOCL()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA37_eotS =
        "\40\uffff";
    static final String DFA37_eofS =
        "\40\uffff";
    static final String DFA37_minS =
        "\1\4\14\uffff\6\0\15\uffff";
    static final String DFA37_maxS =
        "\1\105\14\uffff\6\0\15\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\1\3\uffff\1\2\1\3\14\uffff\1\6\7\uffff\1\7\1\10\1\11"+
        "\1\4\1\5";
    static final String DFA37_specialS =
        "\15\uffff\1\0\1\1\1\2\1\3\1\4\1\5\15\uffff}>";
    static final String[] DFA37_transitionS = {
            "\2\1\2\6\7\uffff\2\1\3\uffff\1\6\14\uffff\1\15\10\23\1\16\1"+
            "\17\1\20\1\21\1\22\1\35\6\uffff\4\6\5\uffff\1\34\3\uffff\1\33"+
            "\1\uffff\1\5",
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
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "2475:1: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_13 = input.LA(1);

                         
                        int index37_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalEssentialOCL()) ) {s = 30;}

                        else if ( (synpred73_InternalEssentialOCL()) ) {s = 19;}

                         
                        input.seek(index37_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_14 = input.LA(1);

                         
                        int index37_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalEssentialOCL()) ) {s = 31;}

                        else if ( (synpred73_InternalEssentialOCL()) ) {s = 19;}

                         
                        input.seek(index37_14);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA37_15 = input.LA(1);

                         
                        int index37_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalEssentialOCL()) ) {s = 31;}

                        else if ( (synpred73_InternalEssentialOCL()) ) {s = 19;}

                         
                        input.seek(index37_15);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA37_16 = input.LA(1);

                         
                        int index37_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalEssentialOCL()) ) {s = 31;}

                        else if ( (synpred73_InternalEssentialOCL()) ) {s = 19;}

                         
                        input.seek(index37_16);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA37_17 = input.LA(1);

                         
                        int index37_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalEssentialOCL()) ) {s = 31;}

                        else if ( (synpred73_InternalEssentialOCL()) ) {s = 19;}

                         
                        input.seek(index37_17);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA37_18 = input.LA(1);

                         
                        int index37_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalEssentialOCL()) ) {s = 31;}

                        else if ( (synpred73_InternalEssentialOCL()) ) {s = 19;}

                         
                        input.seek(index37_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA38_eotS =
        "\25\uffff";
    static final String DFA38_eofS =
        "\1\uffff\22\23\2\uffff";
    static final String DFA38_minS =
        "\1\4\22\16\2\uffff";
    static final String DFA38_maxS =
        "\1\56\22\104\2\uffff";
    static final String DFA38_acceptS =
        "\23\uffff\1\2\1\1";
    static final String DFA38_specialS =
        "\25\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\1\1\2\11\uffff\1\3\1\4\20\uffff\1\22\1\12\1\13\1\14\1\15"+
            "\1\16\1\17\1\20\1\21\1\5\1\6\1\7\1\10\1\11",
            "\1\23\2\uffff\2\23\1\uffff\15\23\16\uffff\4\23\1\uffff\2\23"+
            "\4\uffff\1\24\4\23\1\uffff\3\23\1\uffff\1\23",
            "\1\23\2\uffff\2\23\1\uffff\15\23\16\uffff\4\23\1\uffff\2\23"+
            "\4\uffff\1\24\4\23\1\uffff\3\23\1\uffff\1\23",
            "\1\23\2\uffff\2\23\1\uffff\15\23\16\uffff\4\23\1\uffff\2\23"+
            "\4\uffff\1\24\4\23\1\uffff\3\23\1\uffff\1\23",
            "\1\23\2\uffff\2\23\1\uffff\15\23\16\uffff\4\23\1\uffff\2\23"+
            "\4\uffff\1\24\4\23\1\uffff\3\23\1\uffff\1\23",
            "\1\23\2\uffff\2\23\1\uffff\15\23\16\uffff\4\23\1\uffff\2\23"+
            "\4\uffff\1\24\4\23\1\uffff\3\23\1\uffff\1\23",
            "\1\23\2\uffff\2\23\1\uffff\15\23\16\uffff\4\23\1\uffff\2\23"+
            "\4\uffff\1\24\4\23\1\uffff\3\23\1\uffff\1\23",
            "\1\23\2\uffff\2\23\1\uffff\15\23\16\uffff\4\23\1\uffff\2\23"+
            "\4\uffff\1\24\4\23\1\uffff\3\23\1\uffff\1\23",
            "\1\23\2\uffff\2\23\1\uffff\15\23\16\uffff\4\23\1\uffff\2\23"+
            "\4\uffff\1\24\4\23\1\uffff\3\23\1\uffff\1\23",
            "\1\23\2\uffff\2\23\1\uffff\15\23\16\uffff\4\23\1\uffff\2\23"+
            "\4\uffff\1\24\4\23\1\uffff\3\23\1\uffff\1\23",
            "\1\23\2\uffff\2\23\1\uffff\15\23\16\uffff\4\23\1\uffff\2\23"+
            "\4\uffff\1\24\4\23\1\uffff\3\23\1\uffff\1\23",
            "\1\23\2\uffff\2\23\1\uffff\15\23\16\uffff\4\23\1\uffff\2\23"+
            "\4\uffff\1\24\4\23\1\uffff\3\23\1\uffff\1\23",
            "\1\23\2\uffff\2\23\1\uffff\15\23\16\uffff\4\23\1\uffff\2\23"+
            "\4\uffff\1\24\4\23\1\uffff\3\23\1\uffff\1\23",
            "\1\23\2\uffff\2\23\1\uffff\15\23\16\uffff\4\23\1\uffff\2\23"+
            "\4\uffff\1\24\4\23\1\uffff\3\23\1\uffff\1\23",
            "\1\23\2\uffff\2\23\1\uffff\15\23\16\uffff\4\23\1\uffff\2\23"+
            "\4\uffff\1\24\4\23\1\uffff\3\23\1\uffff\1\23",
            "\1\23\2\uffff\2\23\1\uffff\15\23\16\uffff\4\23\1\uffff\2\23"+
            "\4\uffff\1\24\4\23\1\uffff\3\23\1\uffff\1\23",
            "\1\23\2\uffff\2\23\1\uffff\15\23\16\uffff\4\23\1\uffff\2\23"+
            "\4\uffff\1\24\4\23\1\uffff\3\23\1\uffff\1\23",
            "\1\23\2\uffff\2\23\1\uffff\15\23\16\uffff\4\23\1\uffff\2\23"+
            "\4\uffff\1\24\4\23\1\uffff\3\23\1\uffff\1\23",
            "\1\23\2\uffff\2\23\1\uffff\15\23\16\uffff\4\23\1\uffff\2\23"+
            "\4\uffff\1\24\4\23\1\uffff\3\23\1\uffff\1\23",
            "",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "()* loopback of 2634:1: ( ( ( ruleUnreservedName ) ) otherlv_3= '::' )*";
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
        public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL295 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER_LITERAL306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL346 = new BitSet(new long[]{0x000000000001C002L});
        public static final BitSet FOLLOW_14_in_ruleNUMBER_LITERAL365 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL380 = new BitSet(new long[]{0x0000000000018002L});
        public static final BitSet FOLLOW_15_in_ruleNUMBER_LITERAL402 = new BitSet(new long[]{0x0000000000060040L});
        public static final BitSet FOLLOW_16_in_ruleNUMBER_LITERAL421 = new BitSet(new long[]{0x0000000000060040L});
        public static final BitSet FOLLOW_17_in_ruleNUMBER_LITERAL436 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_18_in_ruleNUMBER_LITERAL455 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedIdentifier_in_entryRuleEssentialOCLUnrestrictedIdentifier524 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedIdentifier535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleEssentialOCLUnrestrictedIdentifier573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleEssentialOCLUnrestrictedIdentifier592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLPrefixOperator_in_entryRuleEssentialOCLPrefixOperator633 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLPrefixOperator644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleEssentialOCLPrefixOperator682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleEssentialOCLPrefixOperator701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLInfixOperator_in_entryRuleEssentialOCLInfixOperator742 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLInfixOperator753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleEssentialOCLInfixOperator791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleEssentialOCLInfixOperator810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleEssentialOCLInfixOperator829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleEssentialOCLInfixOperator848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleEssentialOCLInfixOperator867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleEssentialOCLInfixOperator886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleEssentialOCLInfixOperator905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEssentialOCLInfixOperator924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleEssentialOCLInfixOperator943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleEssentialOCLInfixOperator962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleEssentialOCLInfixOperator981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleEssentialOCLInfixOperator1000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleEssentialOCLInfixOperator1019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleEssentialOCLInfixOperator1038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLNavigationOperator_in_entryRuleEssentialOCLNavigationOperator1079 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLNavigationOperator1090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleEssentialOCLNavigationOperator1128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleEssentialOCLNavigationOperator1147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier1188 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier1199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_ruleIdentifier1246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedIdentifier_in_ruleIdentifier1279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1325 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleStringLiteral1375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixOperator_in_entryRulePrefixOperator1420 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrefixOperator1431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLPrefixOperator_in_rulePrefixOperator1477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperator_in_entryRuleInfixOperator1522 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfixOperator1533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLInfixOperator_in_ruleInfixOperator1579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperator_in_entryRuleNavigationOperator1624 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigationOperator1635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLNavigationOperator_in_ruleNavigationOperator1681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_entryRuleEssentialOCLUnrestrictedName1726 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedName1737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleEssentialOCLUnrestrictedName1783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_entryRuleUnrestrictedName1828 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnrestrictedName1839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_ruleUnrestrictedName1885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnreservedName_in_entryRuleEssentialOCLUnreservedName1930 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnreservedName1941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleEssentialOCLUnreservedName1988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_ruleEssentialOCLUnreservedName2021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_ruleEssentialOCLUnreservedName2054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleEssentialOCLUnreservedName2078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_entryRuleUnreservedName2119 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnreservedName2130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnreservedName_in_ruleUnreservedName2176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_entryRulePrimitiveTypeIdentifier2221 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeIdentifier2232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rulePrimitiveTypeIdentifier2270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rulePrimitiveTypeIdentifier2289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rulePrimitiveTypeIdentifier2308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rulePrimitiveTypeIdentifier2327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rulePrimitiveTypeIdentifier2346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rulePrimitiveTypeIdentifier2365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rulePrimitiveTypeIdentifier2384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rulePrimitiveTypeIdentifier2403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeCS_in_entryRulePrimitiveTypeCS2443 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeCS2453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_rulePrimitiveTypeCS2498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_entryRuleCollectionTypeIdentifier2534 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionTypeIdentifier2545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleCollectionTypeIdentifier2583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleCollectionTypeIdentifier2602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleCollectionTypeIdentifier2621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleCollectionTypeIdentifier2640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleCollectionTypeIdentifier2659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_entryRuleCollectionTypeCS2699 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionTypeCS2709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_ruleCollectionTypeCS2755 = new BitSet(new long[]{0x0000800000800002L});
        public static final BitSet FOLLOW_47_in_ruleCollectionTypeCS2769 = new BitSet(new long[]{0x00007FFE00018030L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS2790 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_ruleCollectionTypeCS2802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleCollectionTypeCS2822 = new BitSet(new long[]{0x00007FFE00018030L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS2843 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleCollectionTypeCS2855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeCS_in_entryRuleTupleTypeCS2894 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleTypeCS2904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleTupleTypeCS2947 = new BitSet(new long[]{0x0000800000800002L});
        public static final BitSet FOLLOW_47_in_ruleTupleTypeCS2974 = new BitSet(new long[]{0x0001000000018030L});
        public static final BitSet FOLLOW_ruletuplePartCS_in_ruleTupleTypeCS2996 = new BitSet(new long[]{0x0003000000000000L});
        public static final BitSet FOLLOW_49_in_ruleTupleTypeCS3009 = new BitSet(new long[]{0x0000000000018030L});
        public static final BitSet FOLLOW_ruletuplePartCS_in_ruleTupleTypeCS3030 = new BitSet(new long[]{0x0003000000000000L});
        public static final BitSet FOLLOW_48_in_ruleTupleTypeCS3046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleTupleTypeCS3066 = new BitSet(new long[]{0x0000000000418030L});
        public static final BitSet FOLLOW_ruletuplePartCS_in_ruleTupleTypeCS3088 = new BitSet(new long[]{0x0002000000400000L});
        public static final BitSet FOLLOW_49_in_ruleTupleTypeCS3101 = new BitSet(new long[]{0x0000000000018030L});
        public static final BitSet FOLLOW_ruletuplePartCS_in_ruleTupleTypeCS3122 = new BitSet(new long[]{0x0002000000400000L});
        public static final BitSet FOLLOW_22_in_ruleTupleTypeCS3138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletuplePartCS_in_entryRuletuplePartCS3177 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuletuplePartCS3187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruletuplePartCS3233 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruletuplePartCS3245 = new BitSet(new long[]{0x00007FFE00018030L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruletuplePartCS3266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_entryRuleCollectionLiteralExpCS3302 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteralExpCS3312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleCollectionLiteralExpCS3358 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleCollectionLiteralExpCS3370 = new BitSet(new long[]{0x83D0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS3392 = new BitSet(new long[]{0x0012000000000000L});
        public static final BitSet FOLLOW_49_in_ruleCollectionLiteralExpCS3405 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS3426 = new BitSet(new long[]{0x0012000000000000L});
        public static final BitSet FOLLOW_52_in_ruleCollectionLiteralExpCS3442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_entryRuleCollectionLiteralPartCS3478 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteralPartCS3488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS3534 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_53_in_ruleCollectionLiteralPartCS3547 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS3568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_entryRulePrimitiveLiteralExpCS3606 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveLiteralExpCS3616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpCS_in_rulePrimitiveLiteralExpCS3666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteralExpCS_in_rulePrimitiveLiteralExpCS3696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpCS_in_rulePrimitiveLiteralExpCS3726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_rulePrimitiveLiteralExpCS3756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvalidLiteralExpCS_in_rulePrimitiveLiteralExpCS3786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullLiteralExpCS_in_rulePrimitiveLiteralExpCS3816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_entryRuleTupleLiteralExpCS3851 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralExpCS3861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleTupleLiteralExpCS3898 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleTupleLiteralExpCS3910 = new BitSet(new long[]{0x0000000000018030L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS3931 = new BitSet(new long[]{0x0012000000000000L});
        public static final BitSet FOLLOW_49_in_ruleTupleLiteralExpCS3944 = new BitSet(new long[]{0x0000000000018030L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS3965 = new BitSet(new long[]{0x0012000000000000L});
        public static final BitSet FOLLOW_52_in_ruleTupleLiteralExpCS3979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_entryRuleTupleLiteralPartCS4015 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralPartCS4025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTupleLiteralPartCS4071 = new BitSet(new long[]{0x0004000004000000L});
        public static final BitSet FOLLOW_50_in_ruleTupleLiteralPartCS4084 = new BitSet(new long[]{0x00007FFE00018030L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleTupleLiteralPartCS4105 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleTupleLiteralPartCS4119 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleTupleLiteralPartCS4140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpCS_in_entryRuleNumberLiteralExpCS4176 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteralExpCS4186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_ruleNumberLiteralExpCS4231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteralExpCS_in_entryRuleStringLiteralExpCS4266 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteralExpCS4276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleStringLiteralExpCS4321 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpCS_in_entryRuleBooleanLiteralExpCS4357 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteralExpCS4367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleBooleanLiteralExpCS4410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleBooleanLiteralExpCS4447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_entryRuleUnlimitedNaturalLiteralExpCS4496 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedNaturalLiteralExpCS4506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleUnlimitedNaturalLiteralExpCS4555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvalidLiteralExpCS_in_entryRuleInvalidLiteralExpCS4591 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvalidLiteralExpCS4601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleInvalidLiteralExpCS4650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullLiteralExpCS_in_entryRuleNullLiteralExpCS4686 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteralExpCS4696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleNullLiteralExpCS4745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_entryRuleTypeLiteralCS4781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralCS4791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeCS_in_ruleTypeLiteralCS4841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleTypeLiteralCS4871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeCS_in_ruleTypeLiteralCS4901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_entryRuleTypeLiteralExpCS4936 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralExpCS4946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_ruleTypeLiteralExpCS4991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeNameExpCS_in_entryRuleTypeNameExpCS5026 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeNameExpCS5036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTypeNameExpCS5090 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_ruleTypeNameExpCS5102 = new BitSet(new long[]{0x00007FFE00018030L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_ruleTypeNameExpCS5130 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_ruleTypeNameExpCS5142 = new BitSet(new long[]{0x00007FFE00018030L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_ruleTypeNameExpCS5172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTypeNameExpCS5206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_entryRuleTypeExpCS5242 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeExpCS5252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeNameExpCS_in_ruleTypeExpCS5302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_ruleTypeExpCS5332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_entryRuleExpCS5367 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpCS5377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixedExpCS_in_ruleExpCS5426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixedExpCS_in_entryRuleInfixedExpCS5460 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfixedExpCS5470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_ruleInfixedExpCS5520 = new BitSet(new long[]{0x00000001FFF64002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_ruleInfixedExpCS5554 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_ruleInfixedExpCS5575 = new BitSet(new long[]{0x00000001FFF64002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_entryRuleBinaryOperatorCS5615 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperatorCS5625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperatorCS_in_ruleBinaryOperatorCS5675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperatorCS_in_ruleBinaryOperatorCS5705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperatorCS_in_entryRuleInfixOperatorCS5740 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfixOperatorCS5750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperator_in_ruleInfixOperatorCS5795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperatorCS_in_entryRuleNavigationOperatorCS5830 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigationOperatorCS5840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperator_in_ruleNavigationOperatorCS5885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_entryRulePrefixedExpCS5920 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrefixedExpCS5930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS5980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorCS_in_rulePrefixedExpCS6019 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS6041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorCS_in_entryRuleUnaryOperatorCS6078 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperatorCS6088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixOperator_in_ruleUnaryOperatorCS6133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_entryRulePrimaryExpCS6168 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpCS6178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingExpCS_in_rulePrimaryExpCS6228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelfExpCS_in_rulePrimaryExpCS6258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_rulePrimaryExpCS6288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_rulePrimaryExpCS6318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_rulePrimaryExpCS6348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_rulePrimaryExpCS6378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_rulePrimaryExpCS6408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpCS_in_rulePrimaryExpCS6438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpCS_in_rulePrimaryExpCS6468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNameExpCS_in_entryRuleNameExpCS6503 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNameExpCS6513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleNameExpCS6567 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_ruleNameExpCS6579 = new BitSet(new long[]{0x00007FFE00018030L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_ruleNameExpCS6607 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_ruleNameExpCS6619 = new BitSet(new long[]{0x00007FFE00018030L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_ruleNameExpCS6649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleNameExpCS6683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIndexExpCS_in_entryRuleIndexExpCS6719 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIndexExpCS6729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNameExpCS_in_ruleIndexExpCS6779 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_59_in_ruleIndexExpCS6803 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIndexExpCS6824 = new BitSet(new long[]{0x1002000000000000L});
        public static final BitSet FOLLOW_49_in_ruleIndexExpCS6837 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIndexExpCS6858 = new BitSet(new long[]{0x1002000000000000L});
        public static final BitSet FOLLOW_60_in_ruleIndexExpCS6872 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_59_in_ruleIndexExpCS6885 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIndexExpCS6906 = new BitSet(new long[]{0x1002000000000000L});
        public static final BitSet FOLLOW_49_in_ruleIndexExpCS6919 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIndexExpCS6940 = new BitSet(new long[]{0x1002000000000000L});
        public static final BitSet FOLLOW_60_in_ruleIndexExpCS6954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingExpCS_Base_in_entryRuleNavigatingExpCS_Base6994 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingExpCS_Base7004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIndexExpCS_in_ruleNavigatingExpCS_Base7053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingExpCS_in_entryRuleNavigatingExpCS7087 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingExpCS7097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingExpCS_Base_in_ruleNavigatingExpCS7147 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_47_in_ruleNavigatingExpCS7171 = new BitSet(new long[]{0x83C1FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_ruleNavigatingArgCS_in_ruleNavigatingExpCS7193 = new BitSet(new long[]{0x6003000000000000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_ruleNavigatingExpCS7214 = new BitSet(new long[]{0x6003000000000000L});
        public static final BitSet FOLLOW_ruleNavigatingSemiArgCS_in_ruleNavigatingExpCS7237 = new BitSet(new long[]{0x2003000000000000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_ruleNavigatingExpCS7258 = new BitSet(new long[]{0x2003000000000000L});
        public static final BitSet FOLLOW_ruleNavigatingBarArgCS_in_ruleNavigatingExpCS7283 = new BitSet(new long[]{0x0003000000000000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_ruleNavigatingExpCS7304 = new BitSet(new long[]{0x0003000000000000L});
        public static final BitSet FOLLOW_48_in_ruleNavigatingExpCS7321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgCS_in_entryRuleNavigatingArgCS7359 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgCS7369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCS7415 = new BitSet(new long[]{0x0004000004000002L});
        public static final BitSet FOLLOW_50_in_ruleNavigatingArgCS7428 = new BitSet(new long[]{0x00007FFE00018030L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS7449 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleNavigatingArgCS7464 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgCS7485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingBarArgCS_in_entryRuleNavigatingBarArgCS7523 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingBarArgCS7533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleNavigatingBarArgCS7576 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingBarArgCS7610 = new BitSet(new long[]{0x0004000004000002L});
        public static final BitSet FOLLOW_50_in_ruleNavigatingBarArgCS7623 = new BitSet(new long[]{0x00007FFE00018030L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingBarArgCS7644 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleNavigatingBarArgCS7659 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingBarArgCS7680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_entryRuleNavigatingCommaArgCS7718 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingCommaArgCS7728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleNavigatingCommaArgCS7771 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingCommaArgCS7805 = new BitSet(new long[]{0x0004000004000002L});
        public static final BitSet FOLLOW_50_in_ruleNavigatingCommaArgCS7818 = new BitSet(new long[]{0x00007FFE00018030L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingCommaArgCS7839 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleNavigatingCommaArgCS7854 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS7875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingSemiArgCS_in_entryRuleNavigatingSemiArgCS7913 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingSemiArgCS7923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleNavigatingSemiArgCS7966 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingSemiArgCS8000 = new BitSet(new long[]{0x0004000004000002L});
        public static final BitSet FOLLOW_50_in_ruleNavigatingSemiArgCS8013 = new BitSet(new long[]{0x00007FFE00018030L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingSemiArgCS8034 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleNavigatingSemiArgCS8049 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingSemiArgCS8070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_entryRuleNavigatingArgExpCS8108 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgExpCS8118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgExpCS8167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpCS_in_entryRuleIfExpCS8201 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfExpCS8211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleIfExpCS8248 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS8269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_64_in_ruleIfExpCS8281 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS8302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleIfExpCS8314 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS8335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_66_in_ruleIfExpCS8347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_entryRuleLetExpCS8383 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetExpCS8393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleLetExpCS8430 = new BitSet(new long[]{0x0000000000018030L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_ruleLetExpCS8451 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_49_in_ruleLetExpCS8464 = new BitSet(new long[]{0x0000000000018030L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_ruleLetExpCS8485 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleLetExpCS8499 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLetExpCS8520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_entryRuleLetVariableCS8556 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetVariableCS8566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleLetVariableCS8612 = new BitSet(new long[]{0x0004000004000000L});
        public static final BitSet FOLLOW_50_in_ruleLetVariableCS8625 = new BitSet(new long[]{0x00007FFE00018030L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleLetVariableCS8646 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleLetVariableCS8660 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLetVariableCS8681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpCS_in_entryRuleNestedExpCS8717 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNestedExpCS8727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleNestedExpCS8764 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNestedExpCS8785 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_ruleNestedExpCS8797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelfExpCS_in_entryRuleSelfExpCS8833 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelfExpCS8843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleSelfExpCS8892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_synpred2_InternalEssentialOCL365 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_synpred2_InternalEssentialOCL380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_synpred39_InternalEssentialOCL2822 = new BitSet(new long[]{0x00007FFE00018030L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_synpred39_InternalEssentialOCL2843 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_synpred39_InternalEssentialOCL2855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_synpred45_InternalEssentialOCL3066 = new BitSet(new long[]{0x0000000000418030L});
        public static final BitSet FOLLOW_ruletuplePartCS_in_synpred45_InternalEssentialOCL3088 = new BitSet(new long[]{0x0002000000400000L});
        public static final BitSet FOLLOW_49_in_synpred45_InternalEssentialOCL3101 = new BitSet(new long[]{0x0000000000018030L});
        public static final BitSet FOLLOW_ruletuplePartCS_in_synpred45_InternalEssentialOCL3122 = new BitSet(new long[]{0x0002000000400000L});
        public static final BitSet FOLLOW_22_in_synpred45_InternalEssentialOCL3138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_synpred63_InternalEssentialOCL5554 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_synpred63_InternalEssentialOCL5575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_synpred64_InternalEssentialOCL5554 = new BitSet(new long[]{0x83C0FFFE001D80F0L,0x0000000000000028L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_synpred64_InternalEssentialOCL5575 = new BitSet(new long[]{0x00000001FFF64002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_synpred71_InternalEssentialOCL6318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_synpred72_InternalEssentialOCL6348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_synpred73_InternalEssentialOCL6378 = new BitSet(new long[]{0x0000000000000002L});
    }


}