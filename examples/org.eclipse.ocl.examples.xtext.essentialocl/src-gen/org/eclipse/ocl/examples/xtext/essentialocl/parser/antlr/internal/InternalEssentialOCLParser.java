package org.eclipse.ocl.examples.xtext.essentialocl.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_SINGLE_QUOTED_STRING", "RULE_DOUBLE_QUOTED_STRING", "RULE_ML_SINGLE_QUOTED_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'body'", "'der'", "'init'", "'inv'", "'post'", "'pre'", "':'", "';'", "'.'", "'e'", "'E'", "'+'", "'-'", "'not'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'='", "'<>'", "'and'", "'or'", "'xor'", "'implies'", "'->'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "'('", "')'", "'Tuple'", "','", "'{'", "'}'", "'..'", "'true'", "'false'", "'invalid'", "'null'", "'::'", "'['", "']'", "'|'", "'if'", "'then'", "'else'", "'endif'", "'let'", "'in'", "'self'"
    };
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int EOF=-1;
    public static final int RULE_INT=4;
    public static final int RULE_SINGLE_QUOTED_STRING=6;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_ML_SINGLE_QUOTED_STRING=8;
    public static final int RULE_DOUBLE_QUOTED_STRING=7;
    public static final int RULE_SL_COMMENT=10;

        public InternalEssentialOCLParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[194+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private EssentialOCLGrammarAccess grammarAccess;
     	
        public InternalEssentialOCLParser(TokenStream input, IAstFactory factory, EssentialOCLGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected EssentialOCLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:83:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:84:2: (iv_ruleModel= ruleModel EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:85:2: iv_ruleModel= ruleModel EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel81);
            iv_ruleModel=ruleModel();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel91); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:92:1: ruleModel returns [EObject current=null] : ( ( ( (lv_name_0_1= 'body' | lv_name_0_2= 'der' | lv_name_0_3= 'init' | lv_name_0_4= 'inv' | lv_name_0_5= 'post' | lv_name_0_6= 'pre' ) ) ) ':' ( (lv_ownedExpression_2_0= ruleExpCS ) ) ';' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token lv_name_0_5=null;
        Token lv_name_0_6=null;
        EObject lv_ownedExpression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:97:6: ( ( ( ( (lv_name_0_1= 'body' | lv_name_0_2= 'der' | lv_name_0_3= 'init' | lv_name_0_4= 'inv' | lv_name_0_5= 'post' | lv_name_0_6= 'pre' ) ) ) ':' ( (lv_ownedExpression_2_0= ruleExpCS ) ) ';' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:98:1: ( ( ( (lv_name_0_1= 'body' | lv_name_0_2= 'der' | lv_name_0_3= 'init' | lv_name_0_4= 'inv' | lv_name_0_5= 'post' | lv_name_0_6= 'pre' ) ) ) ':' ( (lv_ownedExpression_2_0= ruleExpCS ) ) ';' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:98:1: ( ( ( (lv_name_0_1= 'body' | lv_name_0_2= 'der' | lv_name_0_3= 'init' | lv_name_0_4= 'inv' | lv_name_0_5= 'post' | lv_name_0_6= 'pre' ) ) ) ':' ( (lv_ownedExpression_2_0= ruleExpCS ) ) ';' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:98:2: ( ( (lv_name_0_1= 'body' | lv_name_0_2= 'der' | lv_name_0_3= 'init' | lv_name_0_4= 'inv' | lv_name_0_5= 'post' | lv_name_0_6= 'pre' ) ) ) ':' ( (lv_ownedExpression_2_0= ruleExpCS ) ) ';'
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:98:2: ( ( (lv_name_0_1= 'body' | lv_name_0_2= 'der' | lv_name_0_3= 'init' | lv_name_0_4= 'inv' | lv_name_0_5= 'post' | lv_name_0_6= 'pre' ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:99:1: ( (lv_name_0_1= 'body' | lv_name_0_2= 'der' | lv_name_0_3= 'init' | lv_name_0_4= 'inv' | lv_name_0_5= 'post' | lv_name_0_6= 'pre' ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:99:1: ( (lv_name_0_1= 'body' | lv_name_0_2= 'der' | lv_name_0_3= 'init' | lv_name_0_4= 'inv' | lv_name_0_5= 'post' | lv_name_0_6= 'pre' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:100:1: (lv_name_0_1= 'body' | lv_name_0_2= 'der' | lv_name_0_3= 'init' | lv_name_0_4= 'inv' | lv_name_0_5= 'post' | lv_name_0_6= 'pre' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:100:1: (lv_name_0_1= 'body' | lv_name_0_2= 'der' | lv_name_0_3= 'init' | lv_name_0_4= 'inv' | lv_name_0_5= 'post' | lv_name_0_6= 'pre' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            case 16:
                {
                alt1=4;
                }
                break;
            case 17:
                {
                alt1=5;
                }
                break;
            case 18:
                {
                alt1=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("100:1: (lv_name_0_1= 'body' | lv_name_0_2= 'der' | lv_name_0_3= 'init' | lv_name_0_4= 'inv' | lv_name_0_5= 'post' | lv_name_0_6= 'pre' )", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:101:3: lv_name_0_1= 'body'
                    {
                    lv_name_0_1=(Token)input.LT(1);
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleModel136); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getModelAccess().getNameBodyKeyword_0_0_0(), "name"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_0_1, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:119:8: lv_name_0_2= 'der'
                    {
                    lv_name_0_2=(Token)input.LT(1);
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleModel165); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getModelAccess().getNameDerKeyword_0_0_1(), "name"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_0_2, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:137:8: lv_name_0_3= 'init'
                    {
                    lv_name_0_3=(Token)input.LT(1);
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleModel194); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getModelAccess().getNameInitKeyword_0_0_2(), "name"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_0_3, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:155:8: lv_name_0_4= 'inv'
                    {
                    lv_name_0_4=(Token)input.LT(1);
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleModel223); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getModelAccess().getNameInvKeyword_0_0_3(), "name"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_0_4, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:173:8: lv_name_0_5= 'post'
                    {
                    lv_name_0_5=(Token)input.LT(1);
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleModel252); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getModelAccess().getNamePostKeyword_0_0_4(), "name"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_0_5, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:191:8: lv_name_0_6= 'pre'
                    {
                    lv_name_0_6=(Token)input.LT(1);
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleModel281); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getModelAccess().getNamePreKeyword_0_0_5(), "name"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_0_6, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }


            }


            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleModel307); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModelAccess().getColonKeyword_1(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:216:1: ( (lv_ownedExpression_2_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:217:1: (lv_ownedExpression_2_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:217:1: (lv_ownedExpression_2_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:218:3: lv_ownedExpression_2_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getOwnedExpressionExpCSParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleModel328);
            lv_ownedExpression_2_0=ruleExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"ownedExpression",
              	        		lv_ownedExpression_2_0, 
              	        		"ExpCS", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleModel338); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModelAccess().getSemicolonKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleNUMBER_LITERAL
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:252:1: entryRuleNUMBER_LITERAL returns [String current=null] : iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF ;
    public final String entryRuleNUMBER_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER_LITERAL = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:253:2: (iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:254:2: iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNUMBER_LITERALRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL375);
            iv_ruleNUMBER_LITERAL=ruleNUMBER_LITERAL();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNUMBER_LITERAL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNUMBER_LITERAL386); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNUMBER_LITERAL


    // $ANTLR start ruleNUMBER_LITERAL
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:261:1: ruleNUMBER_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_7=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:266:6: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:267:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:267:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:267:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )?
            {
            this_INT_0=(Token)input.LT(1);
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL426); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getNUMBER_LITERALAccess().getINTTerminalRuleCall_0(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:274:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_INT) ) {
                    int LA2_3 = input.LA(3);

                    if ( (synpred6()) ) {
                        alt2=1;
                    }
                }
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:275:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)input.LT(1);
                    match(input,21,FollowSets000.FOLLOW_21_in_ruleNUMBER_LITERAL445); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getNUMBER_LITERALAccess().getFullStopKeyword_1_0(), null); 
                          
                    }
                    this_INT_2=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL460); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_INT_2);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getNUMBER_LITERALAccess().getINTTerminalRuleCall_1_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:287:3: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=22 && LA5_0<=23)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:287:4: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:287:4: (kw= 'e' | kw= 'E' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==22) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==23) ) {
                        alt3=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("287:4: (kw= 'e' | kw= 'E' )", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:288:2: kw= 'e'
                            {
                            kw=(Token)input.LT(1);
                            match(input,22,FollowSets000.FOLLOW_22_in_ruleNUMBER_LITERAL482); if (failed) return current;
                            if ( backtracking==0 ) {

                                      current.merge(kw);
                                      createLeafNode(grammarAccess.getNUMBER_LITERALAccess().getEKeyword_2_0_0(), null); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:295:2: kw= 'E'
                            {
                            kw=(Token)input.LT(1);
                            match(input,23,FollowSets000.FOLLOW_23_in_ruleNUMBER_LITERAL501); if (failed) return current;
                            if ( backtracking==0 ) {

                                      current.merge(kw);
                                      createLeafNode(grammarAccess.getNUMBER_LITERALAccess().getEKeyword_2_0_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:300:2: (kw= '+' | kw= '-' )?
                    int alt4=3;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==24) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==25) ) {
                        alt4=2;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:301:2: kw= '+'
                            {
                            kw=(Token)input.LT(1);
                            match(input,24,FollowSets000.FOLLOW_24_in_ruleNUMBER_LITERAL516); if (failed) return current;
                            if ( backtracking==0 ) {

                                      current.merge(kw);
                                      createLeafNode(grammarAccess.getNUMBER_LITERALAccess().getPlusSignKeyword_2_1_0(), null); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:308:2: kw= '-'
                            {
                            kw=(Token)input.LT(1);
                            match(input,25,FollowSets000.FOLLOW_25_in_ruleNUMBER_LITERAL535); if (failed) return current;
                            if ( backtracking==0 ) {

                                      current.merge(kw);
                                      createLeafNode(grammarAccess.getNUMBER_LITERALAccess().getHyphenMinusKeyword_2_1_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    this_INT_7=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL552); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_INT_7);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getNUMBER_LITERALAccess().getINTTerminalRuleCall_2_2(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNUMBER_LITERAL


    // $ANTLR start entryRuleEssentialOCLPrefixOperator
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:330:1: entryRuleEssentialOCLPrefixOperator returns [String current=null] : iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF ;
    public final String entryRuleEssentialOCLPrefixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLPrefixOperator = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:331:2: (iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:332:2: iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEssentialOCLPrefixOperatorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLPrefixOperator_in_entryRuleEssentialOCLPrefixOperator602);
            iv_ruleEssentialOCLPrefixOperator=ruleEssentialOCLPrefixOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEssentialOCLPrefixOperator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLPrefixOperator613); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEssentialOCLPrefixOperator


    // $ANTLR start ruleEssentialOCLPrefixOperator
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:339:1: ruleEssentialOCLPrefixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLPrefixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:344:6: ( (kw= '-' | kw= 'not' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:345:1: (kw= '-' | kw= 'not' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:345:1: (kw= '-' | kw= 'not' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            else if ( (LA6_0==26) ) {
                alt6=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("345:1: (kw= '-' | kw= 'not' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:346:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,25,FollowSets000.FOLLOW_25_in_ruleEssentialOCLPrefixOperator651); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLPrefixOperatorAccess().getHyphenMinusKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:353:2: kw= 'not'
                    {
                    kw=(Token)input.LT(1);
                    match(input,26,FollowSets000.FOLLOW_26_in_ruleEssentialOCLPrefixOperator670); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLPrefixOperatorAccess().getNotKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEssentialOCLPrefixOperator


    // $ANTLR start entryRuleEssentialOCLInfixOperator
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:366:1: entryRuleEssentialOCLInfixOperator returns [String current=null] : iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF ;
    public final String entryRuleEssentialOCLInfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLInfixOperator = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:367:2: (iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:368:2: iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEssentialOCLInfixOperatorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLInfixOperator_in_entryRuleEssentialOCLInfixOperator711);
            iv_ruleEssentialOCLInfixOperator=ruleEssentialOCLInfixOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEssentialOCLInfixOperator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLInfixOperator722); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEssentialOCLInfixOperator


    // $ANTLR start ruleEssentialOCLInfixOperator
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:375:1: ruleEssentialOCLInfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' | kw= '.' | kw= '->' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLInfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:380:6: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' | kw= '.' | kw= '->' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:381:1: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' | kw= '.' | kw= '->' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:381:1: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' | kw= '.' | kw= '->' )
            int alt7=16;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt7=1;
                }
                break;
            case 28:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            case 25:
                {
                alt7=4;
                }
                break;
            case 29:
                {
                alt7=5;
                }
                break;
            case 30:
                {
                alt7=6;
                }
                break;
            case 31:
                {
                alt7=7;
                }
                break;
            case 32:
                {
                alt7=8;
                }
                break;
            case 33:
                {
                alt7=9;
                }
                break;
            case 34:
                {
                alt7=10;
                }
                break;
            case 35:
                {
                alt7=11;
                }
                break;
            case 36:
                {
                alt7=12;
                }
                break;
            case 37:
                {
                alt7=13;
                }
                break;
            case 38:
                {
                alt7=14;
                }
                break;
            case 21:
                {
                alt7=15;
                }
                break;
            case 39:
                {
                alt7=16;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("381:1: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' | kw= '.' | kw= '->' )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:382:2: kw= '*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleEssentialOCLInfixOperator760); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getAsteriskKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:389:2: kw= '/'
                    {
                    kw=(Token)input.LT(1);
                    match(input,28,FollowSets000.FOLLOW_28_in_ruleEssentialOCLInfixOperator779); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getSolidusKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:396:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,24,FollowSets000.FOLLOW_24_in_ruleEssentialOCLInfixOperator798); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getPlusSignKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:403:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,25,FollowSets000.FOLLOW_25_in_ruleEssentialOCLInfixOperator817); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getHyphenMinusKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:410:2: kw= '>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,29,FollowSets000.FOLLOW_29_in_ruleEssentialOCLInfixOperator836); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:417:2: kw= '<'
                    {
                    kw=(Token)input.LT(1);
                    match(input,30,FollowSets000.FOLLOW_30_in_ruleEssentialOCLInfixOperator855); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignKeyword_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:424:2: kw= '>='
                    {
                    kw=(Token)input.LT(1);
                    match(input,31,FollowSets000.FOLLOW_31_in_ruleEssentialOCLInfixOperator874); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignEqualsSignKeyword_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:431:2: kw= '<='
                    {
                    kw=(Token)input.LT(1);
                    match(input,32,FollowSets000.FOLLOW_32_in_ruleEssentialOCLInfixOperator893); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignEqualsSignKeyword_7(), null); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:438:2: kw= '='
                    {
                    kw=(Token)input.LT(1);
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleEssentialOCLInfixOperator912); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getEqualsSignKeyword_8(), null); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:445:2: kw= '<>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,34,FollowSets000.FOLLOW_34_in_ruleEssentialOCLInfixOperator931); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignGreaterThanSignKeyword_9(), null); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:452:2: kw= 'and'
                    {
                    kw=(Token)input.LT(1);
                    match(input,35,FollowSets000.FOLLOW_35_in_ruleEssentialOCLInfixOperator950); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getAndKeyword_10(), null); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:459:2: kw= 'or'
                    {
                    kw=(Token)input.LT(1);
                    match(input,36,FollowSets000.FOLLOW_36_in_ruleEssentialOCLInfixOperator969); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getOrKeyword_11(), null); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:466:2: kw= 'xor'
                    {
                    kw=(Token)input.LT(1);
                    match(input,37,FollowSets000.FOLLOW_37_in_ruleEssentialOCLInfixOperator988); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getXorKeyword_12(), null); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:473:2: kw= 'implies'
                    {
                    kw=(Token)input.LT(1);
                    match(input,38,FollowSets000.FOLLOW_38_in_ruleEssentialOCLInfixOperator1007); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getImpliesKeyword_13(), null); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:480:2: kw= '.'
                    {
                    kw=(Token)input.LT(1);
                    match(input,21,FollowSets000.FOLLOW_21_in_ruleEssentialOCLInfixOperator1026); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getFullStopKeyword_14(), null); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:487:2: kw= '->'
                    {
                    kw=(Token)input.LT(1);
                    match(input,39,FollowSets000.FOLLOW_39_in_ruleEssentialOCLInfixOperator1045); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getHyphenMinusGreaterThanSignKeyword_15(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEssentialOCLInfixOperator


    // $ANTLR start entryRuleIdentifier
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:500:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:501:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:502:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIdentifierRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier1086);
            iv_ruleIdentifier=ruleIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier1097); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIdentifier


    // $ANTLR start ruleIdentifier
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:509:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'e' | kw= 'E' | kw= 'body' | kw= 'der' | kw= 'init' | kw= 'inv' | kw= 'post' | kw= 'pre' ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:514:6: ( (this_ID_0= RULE_ID | kw= 'e' | kw= 'E' | kw= 'body' | kw= 'der' | kw= 'init' | kw= 'inv' | kw= 'post' | kw= 'pre' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:515:1: (this_ID_0= RULE_ID | kw= 'e' | kw= 'E' | kw= 'body' | kw= 'der' | kw= 'init' | kw= 'inv' | kw= 'post' | kw= 'pre' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:515:1: (this_ID_0= RULE_ID | kw= 'e' | kw= 'E' | kw= 'body' | kw= 'der' | kw= 'init' | kw= 'inv' | kw= 'post' | kw= 'pre' )
            int alt8=9;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 13:
                {
                alt8=4;
                }
                break;
            case 14:
                {
                alt8=5;
                }
                break;
            case 15:
                {
                alt8=6;
                }
                break;
            case 16:
                {
                alt8=7;
                }
                break;
            case 17:
                {
                alt8=8;
                }
                break;
            case 18:
                {
                alt8=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("515:1: (this_ID_0= RULE_ID | kw= 'e' | kw= 'E' | kw= 'body' | kw= 'der' | kw= 'init' | kw= 'inv' | kw= 'post' | kw= 'pre' )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:515:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIdentifier1137); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:524:2: kw= 'e'
                    {
                    kw=(Token)input.LT(1);
                    match(input,22,FollowSets000.FOLLOW_22_in_ruleIdentifier1161); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getIdentifierAccess().getEKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:531:2: kw= 'E'
                    {
                    kw=(Token)input.LT(1);
                    match(input,23,FollowSets000.FOLLOW_23_in_ruleIdentifier1180); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getIdentifierAccess().getEKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:538:2: kw= 'body'
                    {
                    kw=(Token)input.LT(1);
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleIdentifier1199); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getIdentifierAccess().getBodyKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:545:2: kw= 'der'
                    {
                    kw=(Token)input.LT(1);
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleIdentifier1218); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getIdentifierAccess().getDerKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:552:2: kw= 'init'
                    {
                    kw=(Token)input.LT(1);
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleIdentifier1237); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getIdentifierAccess().getInitKeyword_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:559:2: kw= 'inv'
                    {
                    kw=(Token)input.LT(1);
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleIdentifier1256); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getIdentifierAccess().getInvKeyword_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:566:2: kw= 'post'
                    {
                    kw=(Token)input.LT(1);
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleIdentifier1275); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getIdentifierAccess().getPostKeyword_7(), null); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:573:2: kw= 'pre'
                    {
                    kw=(Token)input.LT(1);
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleIdentifier1294); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getIdentifierAccess().getPreKeyword_8(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIdentifier


    // $ANTLR start entryRuleStringLiteral
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:586:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:587:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:588:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStringLiteralRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1335);
            iv_ruleStringLiteral=ruleStringLiteral();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteral1346); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringLiteral


    // $ANTLR start ruleStringLiteral
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:595:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:600:6: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:601:5: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)input.LT(1);
            match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleStringLiteral1385); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_SINGLE_QUOTED_STRING_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getStringLiteralAccess().getSINGLE_QUOTED_STRINGTerminalRuleCall(), null); 
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringLiteral


    // $ANTLR start entryRulePrefixOperator
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:616:1: entryRulePrefixOperator returns [String current=null] : iv_rulePrefixOperator= rulePrefixOperator EOF ;
    public final String entryRulePrefixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefixOperator = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:617:2: (iv_rulePrefixOperator= rulePrefixOperator EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:618:2: iv_rulePrefixOperator= rulePrefixOperator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrefixOperatorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixOperator_in_entryRulePrefixOperator1430);
            iv_rulePrefixOperator=rulePrefixOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrefixOperator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrefixOperator1441); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrefixOperator


    // $ANTLR start rulePrefixOperator
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:625:1: rulePrefixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator ;
    public final AntlrDatatypeRuleToken rulePrefixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLPrefixOperator_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:630:6: (this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:632:5: this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getPrefixOperatorAccess().getEssentialOCLPrefixOperatorParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLPrefixOperator_in_rulePrefixOperator1487);
            this_EssentialOCLPrefixOperator_0=ruleEssentialOCLPrefixOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_EssentialOCLPrefixOperator_0);
                  
            }
            if ( backtracking==0 ) {
               
                      currentNode = currentNode.getParent();
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrefixOperator


    // $ANTLR start entryRuleInfixOperator
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:650:1: entryRuleInfixOperator returns [String current=null] : iv_ruleInfixOperator= ruleInfixOperator EOF ;
    public final String entryRuleInfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixOperator = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:651:2: (iv_ruleInfixOperator= ruleInfixOperator EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:652:2: iv_ruleInfixOperator= ruleInfixOperator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInfixOperatorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixOperator_in_entryRuleInfixOperator1532);
            iv_ruleInfixOperator=ruleInfixOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInfixOperator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfixOperator1543); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInfixOperator


    // $ANTLR start ruleInfixOperator
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:659:1: ruleInfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator ;
    public final AntlrDatatypeRuleToken ruleInfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLInfixOperator_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:664:6: (this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:666:5: this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getInfixOperatorAccess().getEssentialOCLInfixOperatorParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLInfixOperator_in_ruleInfixOperator1589);
            this_EssentialOCLInfixOperator_0=ruleEssentialOCLInfixOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_EssentialOCLInfixOperator_0);
                  
            }
            if ( backtracking==0 ) {
               
                      currentNode = currentNode.getParent();
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInfixOperator


    // $ANTLR start entryRuleEssentialOCLUnrestrictedName
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:684:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:685:2: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:686:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_entryRuleEssentialOCLUnrestrictedName1634);
            iv_ruleEssentialOCLUnrestrictedName=ruleEssentialOCLUnrestrictedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEssentialOCLUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedName1645); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEssentialOCLUnrestrictedName


    // $ANTLR start ruleEssentialOCLUnrestrictedName
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:693:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:698:6: (this_Identifier_0= ruleIdentifier )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:700:5: this_Identifier_0= ruleIdentifier
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameAccess().getIdentifierParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleEssentialOCLUnrestrictedName1691);
            this_Identifier_0=ruleIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_Identifier_0);
                  
            }
            if ( backtracking==0 ) {
               
                      currentNode = currentNode.getParent();
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEssentialOCLUnrestrictedName


    // $ANTLR start entryRuleUnrestrictedName
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:718:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:719:2: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:720:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnrestrictedNameRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_entryRuleUnrestrictedName1736);
            iv_ruleUnrestrictedName=ruleUnrestrictedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnrestrictedName1747); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUnrestrictedName


    // $ANTLR start ruleUnrestrictedName
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:727:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:732:6: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:734:5: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getUnrestrictedNameAccess().getEssentialOCLUnrestrictedNameParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_ruleUnrestrictedName1793);
            this_EssentialOCLUnrestrictedName_0=ruleEssentialOCLUnrestrictedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_EssentialOCLUnrestrictedName_0);
                  
            }
            if ( backtracking==0 ) {
               
                      currentNode = currentNode.getParent();
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUnrestrictedName


    // $ANTLR start entryRuleEssentialOCLUnreservedName
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:752:1: entryRuleEssentialOCLUnreservedName returns [String current=null] : iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF ;
    public final String entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnreservedName = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:753:2: (iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:754:2: iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEssentialOCLUnreservedNameRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnreservedName_in_entryRuleEssentialOCLUnreservedName1838);
            iv_ruleEssentialOCLUnreservedName=ruleEssentialOCLUnreservedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEssentialOCLUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnreservedName1849); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEssentialOCLUnreservedName


    // $ANTLR start ruleEssentialOCLUnreservedName
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:761:1: ruleEssentialOCLUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_UnrestrictedName_0= ruleUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:766:6: (this_UnrestrictedName_0= ruleUnrestrictedName )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:768:5: this_UnrestrictedName_0= ruleUnrestrictedName
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getUnrestrictedNameParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleEssentialOCLUnreservedName1895);
            this_UnrestrictedName_0=ruleUnrestrictedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_UnrestrictedName_0);
                  
            }
            if ( backtracking==0 ) {
               
                      currentNode = currentNode.getParent();
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEssentialOCLUnreservedName


    // $ANTLR start entryRuleUnreservedName
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:786:1: entryRuleUnreservedName returns [String current=null] : iv_ruleUnreservedName= ruleUnreservedName EOF ;
    public final String entryRuleUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnreservedName = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:787:2: (iv_ruleUnreservedName= ruleUnreservedName EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:788:2: iv_ruleUnreservedName= ruleUnreservedName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnreservedNameRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_entryRuleUnreservedName1940);
            iv_ruleUnreservedName=ruleUnreservedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnreservedName1951); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUnreservedName


    // $ANTLR start ruleUnreservedName
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:795:1: ruleUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName ;
    public final AntlrDatatypeRuleToken ruleUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnreservedName_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:800:6: (this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:802:5: this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getUnreservedNameAccess().getEssentialOCLUnreservedNameParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnreservedName_in_ruleUnreservedName1997);
            this_EssentialOCLUnreservedName_0=ruleEssentialOCLUnreservedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_EssentialOCLUnreservedName_0);
                  
            }
            if ( backtracking==0 ) {
               
                      currentNode = currentNode.getParent();
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUnreservedName


    // $ANTLR start entryRulePrimitiveTypeIdentifier
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:820:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:821:2: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:822:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveTypeIdentifierRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_entryRulePrimitiveTypeIdentifier2042);
            iv_rulePrimitiveTypeIdentifier=rulePrimitiveTypeIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveTypeIdentifier2053); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimitiveTypeIdentifier


    // $ANTLR start rulePrimitiveTypeIdentifier
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:829:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:834:6: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:835:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:835:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            int alt9=8;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt9=1;
                }
                break;
            case 41:
                {
                alt9=2;
                }
                break;
            case 42:
                {
                alt9=3;
                }
                break;
            case 43:
                {
                alt9=4;
                }
                break;
            case 44:
                {
                alt9=5;
                }
                break;
            case 45:
                {
                alt9=6;
                }
                break;
            case 46:
                {
                alt9=7;
                }
                break;
            case 47:
                {
                alt9=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("835:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:836:2: kw= 'Boolean'
                    {
                    kw=(Token)input.LT(1);
                    match(input,40,FollowSets000.FOLLOW_40_in_rulePrimitiveTypeIdentifier2091); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:843:2: kw= 'Integer'
                    {
                    kw=(Token)input.LT(1);
                    match(input,41,FollowSets000.FOLLOW_41_in_rulePrimitiveTypeIdentifier2110); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:850:2: kw= 'Real'
                    {
                    kw=(Token)input.LT(1);
                    match(input,42,FollowSets000.FOLLOW_42_in_rulePrimitiveTypeIdentifier2129); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:857:2: kw= 'String'
                    {
                    kw=(Token)input.LT(1);
                    match(input,43,FollowSets000.FOLLOW_43_in_rulePrimitiveTypeIdentifier2148); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:864:2: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)input.LT(1);
                    match(input,44,FollowSets000.FOLLOW_44_in_rulePrimitiveTypeIdentifier2167); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:871:2: kw= 'OclAny'
                    {
                    kw=(Token)input.LT(1);
                    match(input,45,FollowSets000.FOLLOW_45_in_rulePrimitiveTypeIdentifier2186); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:878:2: kw= 'OclInvalid'
                    {
                    kw=(Token)input.LT(1);
                    match(input,46,FollowSets000.FOLLOW_46_in_rulePrimitiveTypeIdentifier2205); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:885:2: kw= 'OclVoid'
                    {
                    kw=(Token)input.LT(1);
                    match(input,47,FollowSets000.FOLLOW_47_in_rulePrimitiveTypeIdentifier2224); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getPrimitiveTypeIdentifierAccess().getOclVoidKeyword_7(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrimitiveTypeIdentifier


    // $ANTLR start entryRulePrimitiveTypeCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:898:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:899:2: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:900:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveTypeCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeCS_in_entryRulePrimitiveTypeCS2264);
            iv_rulePrimitiveTypeCS=rulePrimitiveTypeCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveTypeCS2274); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimitiveTypeCS


    // $ANTLR start rulePrimitiveTypeCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:907:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:912:6: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:913:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:913:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:914:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:914:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:915:3: lv_name_0_0= rulePrimitiveTypeIdentifier
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveTypeCSAccess().getNamePrimitiveTypeIdentifierParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_rulePrimitiveTypeCS2319);
            lv_name_0_0=rulePrimitiveTypeIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPrimitiveTypeCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"PrimitiveTypeIdentifier", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrimitiveTypeCS


    // $ANTLR start entryRuleCollectionTypeIdentifier
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:945:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:946:2: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:947:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCollectionTypeIdentifierRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_entryRuleCollectionTypeIdentifier2355);
            iv_ruleCollectionTypeIdentifier=ruleCollectionTypeIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCollectionTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionTypeIdentifier2366); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCollectionTypeIdentifier


    // $ANTLR start ruleCollectionTypeIdentifier
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:954:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:959:6: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:960:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:960:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt10=1;
                }
                break;
            case 49:
                {
                alt10=2;
                }
                break;
            case 50:
                {
                alt10=3;
                }
                break;
            case 51:
                {
                alt10=4;
                }
                break;
            case 52:
                {
                alt10=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("960:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:961:2: kw= 'Set'
                    {
                    kw=(Token)input.LT(1);
                    match(input,48,FollowSets000.FOLLOW_48_in_ruleCollectionTypeIdentifier2404); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:968:2: kw= 'Bag'
                    {
                    kw=(Token)input.LT(1);
                    match(input,49,FollowSets000.FOLLOW_49_in_ruleCollectionTypeIdentifier2423); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:975:2: kw= 'Sequence'
                    {
                    kw=(Token)input.LT(1);
                    match(input,50,FollowSets000.FOLLOW_50_in_ruleCollectionTypeIdentifier2442); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:982:2: kw= 'Collection'
                    {
                    kw=(Token)input.LT(1);
                    match(input,51,FollowSets000.FOLLOW_51_in_ruleCollectionTypeIdentifier2461); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:989:2: kw= 'OrderedSet'
                    {
                    kw=(Token)input.LT(1);
                    match(input,52,FollowSets000.FOLLOW_52_in_ruleCollectionTypeIdentifier2480); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCollectionTypeIdentifierAccess().getOrderedSetKeyword_4(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCollectionTypeIdentifier


    // $ANTLR start entryRuleCollectionTypeCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1002:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1003:2: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1004:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCollectionTypeCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_entryRuleCollectionTypeCS2520);
            iv_ruleCollectionTypeCS=ruleCollectionTypeCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCollectionTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionTypeCS2530); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCollectionTypeCS


    // $ANTLR start ruleCollectionTypeCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1011:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ')' )? ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1016:6: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ')' )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1017:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ')' )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1017:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ')' )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1017:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ')' )?
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1017:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1018:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1018:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1019:3: lv_name_0_0= ruleCollectionTypeIdentifier
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_ruleCollectionTypeCS2576);
            lv_name_0_0=ruleCollectionTypeIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCollectionTypeCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"CollectionTypeIdentifier", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1041:2: ( '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==53) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1041:4: '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ')'
                    {
                    match(input,53,FollowSets000.FOLLOW_53_in_ruleCollectionTypeCS2587); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1045:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1046:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1046:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1047:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS2608);
                    lv_ownedType_2_0=ruleTypeExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCollectionTypeCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"ownedType",
                      	        		lv_ownedType_2_0, 
                      	        		"TypeExpCS", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,54,FollowSets000.FOLLOW_54_in_ruleCollectionTypeCS2618); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_1_2(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCollectionTypeCS


    // $ANTLR start entryRuleTupleTypeCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1081:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1082:2: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1083:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTupleTypeCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleTypeCS_in_entryRuleTupleTypeCS2656);
            iv_ruleTupleTypeCS=ruleTupleTypeCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTupleTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleTypeCS2666); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTupleTypeCS


    // $ANTLR start ruleTupleTypeCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1090:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) ( '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? ')' )? ) ;
    public final EObject ruleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1095:6: ( ( ( (lv_name_0_0= 'Tuple' ) ) ( '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? ')' )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1096:1: ( ( (lv_name_0_0= 'Tuple' ) ) ( '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? ')' )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1096:1: ( ( (lv_name_0_0= 'Tuple' ) ) ( '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? ')' )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1096:2: ( (lv_name_0_0= 'Tuple' ) ) ( '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? ')' )?
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1096:2: ( (lv_name_0_0= 'Tuple' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1097:1: (lv_name_0_0= 'Tuple' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1097:1: (lv_name_0_0= 'Tuple' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1098:3: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,55,FollowSets000.FOLLOW_55_in_ruleTupleTypeCS2709); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTupleTypeCSAccess().getNameTupleKeyword_0_0(), "name"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTupleTypeCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_0_0, "Tuple", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1117:2: ( '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==53) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1117:4: '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? ')'
                    {
                    match(input,53,FollowSets000.FOLLOW_53_in_ruleTupleTypeCS2733); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1121:1: ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ID||(LA13_0>=13 && LA13_0<=18)||(LA13_0>=22 && LA13_0<=23)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1121:2: ( (lv_ownedParts_2_0= ruletuplePartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )*
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1121:2: ( (lv_ownedParts_2_0= ruletuplePartCS ) )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1122:1: (lv_ownedParts_2_0= ruletuplePartCS )
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1122:1: (lv_ownedParts_2_0= ruletuplePartCS )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1123:3: lv_ownedParts_2_0= ruletuplePartCS
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruletuplePartCS_in_ruleTupleTypeCS2755);
                            lv_ownedParts_2_0=ruletuplePartCS();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTupleTypeCSRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"ownedParts",
                              	        		lv_ownedParts_2_0, 
                              	        		"tuplePartCS", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1145:2: ( ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )*
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==56) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1145:4: ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) )
                            	    {
                            	    match(input,56,FollowSets000.FOLLOW_56_in_ruleTupleTypeCS2766); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_0(), null); 
                            	          
                            	    }
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1149:1: ( (lv_ownedParts_4_0= ruletuplePartCS ) )
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1150:1: (lv_ownedParts_4_0= ruletuplePartCS )
                            	    {
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1150:1: (lv_ownedParts_4_0= ruletuplePartCS )
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1151:3: lv_ownedParts_4_0= ruletuplePartCS
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruletuplePartCS_in_ruleTupleTypeCS2787);
                            	    lv_ownedParts_4_0=ruletuplePartCS();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getTupleTypeCSRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"ownedParts",
                            	      	        		lv_ownedParts_4_0, 
                            	      	        		"tuplePartCS", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop12;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,54,FollowSets000.FOLLOW_54_in_ruleTupleTypeCS2801); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_2(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTupleTypeCS


    // $ANTLR start entryRuletuplePartCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1185:1: entryRuletuplePartCS returns [EObject current=null] : iv_ruletuplePartCS= ruletuplePartCS EOF ;
    public final EObject entryRuletuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletuplePartCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1186:2: (iv_ruletuplePartCS= ruletuplePartCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1187:2: iv_ruletuplePartCS= ruletuplePartCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTuplePartCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruletuplePartCS_in_entryRuletuplePartCS2839);
            iv_ruletuplePartCS=ruletuplePartCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruletuplePartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuletuplePartCS2849); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuletuplePartCS


    // $ANTLR start ruletuplePartCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1194:1: ruletuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruletuplePartCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1199:6: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1200:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1200:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1200:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1200:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1201:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1201:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1202:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTuplePartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruletuplePartCS2895);
            lv_name_0_0=ruleUnrestrictedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTuplePartCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"UnrestrictedName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruletuplePartCS2905); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTuplePartCSAccess().getColonKeyword_1(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1228:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1229:1: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1229:1: (lv_ownedType_2_0= ruleTypeExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1230:3: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTuplePartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruletuplePartCS2926);
            lv_ownedType_2_0=ruleTypeExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTuplePartCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"ownedType",
              	        		lv_ownedType_2_0, 
              	        		"TypeExpCS", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruletuplePartCS


    // $ANTLR start entryRuleCollectionLiteralExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1260:1: entryRuleCollectionLiteralExpCS returns [EObject current=null] : iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF ;
    public final EObject entryRuleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1261:2: (iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1262:2: iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCollectionLiteralExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_entryRuleCollectionLiteralExpCS2962);
            iv_ruleCollectionLiteralExpCS=ruleCollectionLiteralExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCollectionLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionLiteralExpCS2972); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCollectionLiteralExpCS


    // $ANTLR start ruleCollectionLiteralExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1269:1: ruleCollectionLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? '}' ) ;
    public final EObject ruleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1274:6: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? '}' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1275:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? '}' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1275:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? '}' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1275:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? '}'
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1275:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1276:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1276:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1277:3: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleCollectionLiteralExpCS3018);
            lv_ownedType_0_0=ruleCollectionTypeCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCollectionLiteralExpCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"ownedType",
              	        		lv_ownedType_0_0, 
              	        		"CollectionTypeCS", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,57,FollowSets000.FOLLOW_57_in_ruleCollectionLiteralExpCS3028); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1303:1: ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_INT && LA16_0<=RULE_SINGLE_QUOTED_STRING)||(LA16_0>=13 && LA16_0<=18)||(LA16_0>=22 && LA16_0<=23)||(LA16_0>=25 && LA16_0<=27)||(LA16_0>=40 && LA16_0<=53)||LA16_0==55||(LA16_0>=60 && LA16_0<=63)||LA16_0==68||LA16_0==72||LA16_0==74) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1303:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1303:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1304:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1304:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1305:3: lv_ownedParts_2_0= ruleCollectionLiteralPartCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS3050);
                    lv_ownedParts_2_0=ruleCollectionLiteralPartCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCollectionLiteralExpCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"ownedParts",
                      	        		lv_ownedParts_2_0, 
                      	        		"CollectionLiteralPartCS", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1327:2: ( ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==56) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1327:4: ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    match(input,56,FollowSets000.FOLLOW_56_in_ruleCollectionLiteralExpCS3061); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0(), null); 
                    	          
                    	    }
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1331:1: ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1332:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1332:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1333:3: lv_ownedParts_4_0= ruleCollectionLiteralPartCS
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS3082);
                    	    lv_ownedParts_4_0=ruleCollectionLiteralPartCS();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getCollectionLiteralExpCSRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"ownedParts",
                    	      	        		lv_ownedParts_4_0, 
                    	      	        		"CollectionLiteralPartCS", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
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

            match(input,58,FollowSets000.FOLLOW_58_in_ruleCollectionLiteralExpCS3096); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCollectionLiteralExpCSAccess().getRightCurlyBracketKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCollectionLiteralExpCS


    // $ANTLR start entryRuleCollectionLiteralPartCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1367:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1368:2: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1369:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCollectionLiteralPartCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_entryRuleCollectionLiteralPartCS3132);
            iv_ruleCollectionLiteralPartCS=ruleCollectionLiteralPartCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCollectionLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionLiteralPartCS3142); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCollectionLiteralPartCS


    // $ANTLR start ruleCollectionLiteralPartCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1376:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( (lv_expressionCS_0_0= ruleExpCS ) ) ( '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject lv_expressionCS_0_0 = null;

        EObject lv_lastExpressionCS_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1381:6: ( ( ( (lv_expressionCS_0_0= ruleExpCS ) ) ( '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1382:1: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) ( '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1382:1: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) ( '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1382:2: ( (lv_expressionCS_0_0= ruleExpCS ) ) ( '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1382:2: ( (lv_expressionCS_0_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1383:1: (lv_expressionCS_0_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1383:1: (lv_expressionCS_0_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1384:3: lv_expressionCS_0_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSExpCSParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS3188);
            lv_expressionCS_0_0=ruleExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCollectionLiteralPartCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"expressionCS",
              	        		lv_expressionCS_0_0, 
              	        		"ExpCS", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1406:2: ( '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==59) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1406:4: '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    {
                    match(input,59,FollowSets000.FOLLOW_59_in_ruleCollectionLiteralPartCS3199); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_1_0(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1410:1: ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1411:1: (lv_lastExpressionCS_2_0= ruleExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1411:1: (lv_lastExpressionCS_2_0= ruleExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1412:3: lv_lastExpressionCS_2_0= ruleExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getLastExpressionCSExpCSParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS3220);
                    lv_lastExpressionCS_2_0=ruleExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCollectionLiteralPartCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"lastExpressionCS",
                      	        		lv_lastExpressionCS_2_0, 
                      	        		"ExpCS", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCollectionLiteralPartCS


    // $ANTLR start entryRulePrimitiveLiteralExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1442:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1443:2: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1444:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveLiteralExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveLiteralExpCS_in_entryRulePrimitiveLiteralExpCS3258);
            iv_rulePrimitiveLiteralExpCS=rulePrimitiveLiteralExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveLiteralExpCS3268); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimitiveLiteralExpCS


    // $ANTLR start rulePrimitiveLiteralExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1451:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
    public final EObject rulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteralExpCS_0 = null;

        EObject this_StringLiteralExpCS_1 = null;

        EObject this_BooleanLiteralExpCS_2 = null;

        EObject this_UnlimitedNaturalLiteralExpCS_3 = null;

        EObject this_InvalidLiteralExpCS_4 = null;

        EObject this_NullLiteralExpCS_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1456:6: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1457:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1457:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt18=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt18=1;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt18=2;
                }
                break;
            case 60:
            case 61:
                {
                alt18=3;
                }
                break;
            case 27:
                {
                alt18=4;
                }
                break;
            case 62:
                {
                alt18=5;
                }
                break;
            case 63:
                {
                alt18=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1457:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1458:2: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNumberLiteralExpCSParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpCS_in_rulePrimitiveLiteralExpCS3318);
                    this_NumberLiteralExpCS_0=ruleNumberLiteralExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NumberLiteralExpCS_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1471:2: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteralExpCS_in_rulePrimitiveLiteralExpCS3348);
                    this_StringLiteralExpCS_1=ruleStringLiteralExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_StringLiteralExpCS_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1484:2: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpCS_in_rulePrimitiveLiteralExpCS3378);
                    this_BooleanLiteralExpCS_2=ruleBooleanLiteralExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BooleanLiteralExpCS_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1497:2: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_rulePrimitiveLiteralExpCS3408);
                    this_UnlimitedNaturalLiteralExpCS_3=ruleUnlimitedNaturalLiteralExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_UnlimitedNaturalLiteralExpCS_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1510:2: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getInvalidLiteralExpCSParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInvalidLiteralExpCS_in_rulePrimitiveLiteralExpCS3438);
                    this_InvalidLiteralExpCS_4=ruleInvalidLiteralExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_InvalidLiteralExpCS_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1523:2: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNullLiteralExpCSParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNullLiteralExpCS_in_rulePrimitiveLiteralExpCS3468);
                    this_NullLiteralExpCS_5=ruleNullLiteralExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NullLiteralExpCS_5; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrimitiveLiteralExpCS


    // $ANTLR start entryRuleTupleLiteralExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1542:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1543:2: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1544:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTupleLiteralExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_entryRuleTupleLiteralExpCS3503);
            iv_ruleTupleLiteralExpCS=ruleTupleLiteralExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTupleLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralExpCS3513); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTupleLiteralExpCS


    // $ANTLR start ruleTupleLiteralExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1551:1: ruleTupleLiteralExpCS returns [EObject current=null] : ( 'Tuple' '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* '}' ) ;
    public final EObject ruleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1556:6: ( ( 'Tuple' '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* '}' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1557:1: ( 'Tuple' '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* '}' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1557:1: ( 'Tuple' '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* '}' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1557:3: 'Tuple' '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* '}'
            {
            match(input,55,FollowSets000.FOLLOW_55_in_ruleTupleLiteralExpCS3548); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0(), null); 
                  
            }
            match(input,57,FollowSets000.FOLLOW_57_in_ruleTupleLiteralExpCS3558); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1565:1: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1566:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1566:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1567:3: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS3579);
            lv_ownedParts_2_0=ruleTupleLiteralPartCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTupleLiteralExpCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"ownedParts",
              	        		lv_ownedParts_2_0, 
              	        		"TupleLiteralPartCS", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1589:2: ( ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==56) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1589:4: ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    match(input,56,FollowSets000.FOLLOW_56_in_ruleTupleLiteralExpCS3590); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0(), null); 
            	          
            	    }
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1593:1: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1594:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1594:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1595:3: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS3611);
            	    lv_ownedParts_4_0=ruleTupleLiteralPartCS();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getTupleLiteralExpCSRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"ownedParts",
            	      	        		lv_ownedParts_4_0, 
            	      	        		"TupleLiteralPartCS", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match(input,58,FollowSets000.FOLLOW_58_in_ruleTupleLiteralExpCS3623); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTupleLiteralExpCSAccess().getRightCurlyBracketKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTupleLiteralExpCS


    // $ANTLR start entryRuleTupleLiteralPartCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1629:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1630:2: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1631:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTupleLiteralPartCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_entryRuleTupleLiteralPartCS3659);
            iv_ruleTupleLiteralPartCS=ruleTupleLiteralPartCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTupleLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralPartCS3669); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTupleLiteralPartCS


    // $ANTLR start ruleTupleLiteralPartCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1638:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1643:6: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1644:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1644:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1644:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1644:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1645:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1645:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1646:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTupleLiteralPartCS3715);
            lv_name_0_0=ruleUnrestrictedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTupleLiteralPartCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"UnrestrictedName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1668:2: ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1668:4: ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_ruleTupleLiteralPartCS3726); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1672:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1673:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1673:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1674:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleTupleLiteralPartCS3747);
                    lv_ownedType_2_0=ruleTypeExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTupleLiteralPartCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"ownedType",
                      	        		lv_ownedType_2_0, 
                      	        		"TypeExpCS", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            match(input,33,FollowSets000.FOLLOW_33_in_ruleTupleLiteralPartCS3759); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1700:1: ( (lv_initExpression_4_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1701:1: (lv_initExpression_4_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1701:1: (lv_initExpression_4_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1702:3: lv_initExpression_4_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getInitExpressionExpCSParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleTupleLiteralPartCS3780);
            lv_initExpression_4_0=ruleExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTupleLiteralPartCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"initExpression",
              	        		lv_initExpression_4_0, 
              	        		"ExpCS", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTupleLiteralPartCS


    // $ANTLR start entryRuleNumberLiteralExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1732:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1733:2: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1734:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNumberLiteralExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpCS_in_entryRuleNumberLiteralExpCS3816);
            iv_ruleNumberLiteralExpCS=ruleNumberLiteralExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNumberLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumberLiteralExpCS3826); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNumberLiteralExpCS


    // $ANTLR start ruleNumberLiteralExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1741:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= ruleNUMBER_LITERAL ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1746:6: ( ( (lv_name_0_0= ruleNUMBER_LITERAL ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1747:1: ( (lv_name_0_0= ruleNUMBER_LITERAL ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1747:1: ( (lv_name_0_0= ruleNUMBER_LITERAL ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1748:1: (lv_name_0_0= ruleNUMBER_LITERAL )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1748:1: (lv_name_0_0= ruleNUMBER_LITERAL )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1749:3: lv_name_0_0= ruleNUMBER_LITERAL
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNumberLiteralExpCSAccess().getNameNUMBER_LITERALParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNUMBER_LITERAL_in_ruleNumberLiteralExpCS3871);
            lv_name_0_0=ruleNUMBER_LITERAL();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNumberLiteralExpCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"NUMBER_LITERAL", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNumberLiteralExpCS


    // $ANTLR start entryRuleStringLiteralExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1779:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1780:2: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1781:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStringLiteralExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteralExpCS_in_entryRuleStringLiteralExpCS3906);
            iv_ruleStringLiteralExpCS=ruleStringLiteralExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStringLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteralExpCS3916); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringLiteralExpCS


    // $ANTLR start ruleStringLiteralExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1788:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= ruleStringLiteral ) )+ ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1793:6: ( ( (lv_name_0_0= ruleStringLiteral ) )+ )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1794:1: ( (lv_name_0_0= ruleStringLiteral ) )+
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1794:1: ( (lv_name_0_0= ruleStringLiteral ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_SINGLE_QUOTED_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1795:1: (lv_name_0_0= ruleStringLiteral )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1795:1: (lv_name_0_0= ruleStringLiteral )
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1796:3: lv_name_0_0= ruleStringLiteral
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStringLiteralExpCSAccess().getNameStringLiteralParserRuleCall_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleStringLiteralExpCS3961);
            	    lv_name_0_0=ruleStringLiteral();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStringLiteralExpCSRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"name",
            	      	        		lv_name_0_0, 
            	      	        		"StringLiteral", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringLiteralExpCS


    // $ANTLR start entryRuleBooleanLiteralExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1826:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1827:2: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1828:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanLiteralExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpCS_in_entryRuleBooleanLiteralExpCS3997);
            iv_ruleBooleanLiteralExpCS=ruleBooleanLiteralExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanLiteralExpCS4007); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBooleanLiteralExpCS


    // $ANTLR start ruleBooleanLiteralExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1835:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1840:6: ( ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1841:1: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1841:1: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==60) ) {
                alt22=1;
            }
            else if ( (LA22_0==61) ) {
                alt22=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1841:1: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1841:2: ( (lv_name_0_0= 'true' ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1841:2: ( (lv_name_0_0= 'true' ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1842:1: (lv_name_0_0= 'true' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1842:1: (lv_name_0_0= 'true' )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1843:3: lv_name_0_0= 'true'
                    {
                    lv_name_0_0=(Token)input.LT(1);
                    match(input,60,FollowSets000.FOLLOW_60_in_ruleBooleanLiteralExpCS4050); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBooleanLiteralExpCSAccess().getNameTrueKeyword_0_0(), "name"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBooleanLiteralExpCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_0_0, "true", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1863:6: ( (lv_name_1_0= 'false' ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1863:6: ( (lv_name_1_0= 'false' ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1864:1: (lv_name_1_0= 'false' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1864:1: (lv_name_1_0= 'false' )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1865:3: lv_name_1_0= 'false'
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,61,FollowSets000.FOLLOW_61_in_ruleBooleanLiteralExpCS4087); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBooleanLiteralExpCSAccess().getNameFalseKeyword_1_0(), "name"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBooleanLiteralExpCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_1_0, "false", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBooleanLiteralExpCS


    // $ANTLR start entryRuleUnlimitedNaturalLiteralExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1892:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1893:2: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1894:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_entryRuleUnlimitedNaturalLiteralExpCS4136);
            iv_ruleUnlimitedNaturalLiteralExpCS=ruleUnlimitedNaturalLiteralExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnlimitedNaturalLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnlimitedNaturalLiteralExpCS4146); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUnlimitedNaturalLiteralExpCS


    // $ANTLR start ruleUnlimitedNaturalLiteralExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1901:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1906:6: ( ( () '*' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1907:1: ( () '*' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1907:1: ( () '*' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1907:2: () '*'
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1907:2: ()
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1908:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,27,FollowSets000.FOLLOW_27_in_ruleUnlimitedNaturalLiteralExpCS4193); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getAsteriskKeyword_1(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUnlimitedNaturalLiteralExpCS


    // $ANTLR start entryRuleInvalidLiteralExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1933:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1934:2: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1935:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInvalidLiteralExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInvalidLiteralExpCS_in_entryRuleInvalidLiteralExpCS4229);
            iv_ruleInvalidLiteralExpCS=ruleInvalidLiteralExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInvalidLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvalidLiteralExpCS4239); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInvalidLiteralExpCS


    // $ANTLR start ruleInvalidLiteralExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1942:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1947:6: ( ( () 'invalid' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1948:1: ( () 'invalid' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1948:1: ( () 'invalid' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1948:2: () 'invalid'
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1948:2: ()
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1949:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getInvalidLiteralExpCSAccess().getInvalidLiteralExpCSAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getInvalidLiteralExpCSAccess().getInvalidLiteralExpCSAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,62,FollowSets000.FOLLOW_62_in_ruleInvalidLiteralExpCS4286); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInvalidLiteralExpCSAccess().getInvalidKeyword_1(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInvalidLiteralExpCS


    // $ANTLR start entryRuleNullLiteralExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1974:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1975:2: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1976:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNullLiteralExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNullLiteralExpCS_in_entryRuleNullLiteralExpCS4322);
            iv_ruleNullLiteralExpCS=ruleNullLiteralExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNullLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNullLiteralExpCS4332); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNullLiteralExpCS


    // $ANTLR start ruleNullLiteralExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1983:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1988:6: ( ( () 'null' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1989:1: ( () 'null' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1989:1: ( () 'null' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1989:2: () 'null'
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1989:2: ()
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:1990:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getNullLiteralExpCSAccess().getNullLiteralExpCSAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getNullLiteralExpCSAccess().getNullLiteralExpCSAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,63,FollowSets000.FOLLOW_63_in_ruleNullLiteralExpCS4379); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNullLiteralExpCSAccess().getNullKeyword_1(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNullLiteralExpCS


    // $ANTLR start entryRuleTypeLiteralCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2015:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2016:2: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2017:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeLiteralCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_entryRuleTypeLiteralCS4415);
            iv_ruleTypeLiteralCS=ruleTypeLiteralCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeLiteralCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralCS4425); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeLiteralCS


    // $ANTLR start ruleTypeLiteralCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2024:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_CollectionTypeCS_1 = null;

        EObject this_TupleTypeCS_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2029:6: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2030:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2030:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
                {
                alt23=1;
                }
                break;
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                {
                alt23=2;
                }
                break;
            case 55:
                {
                alt23=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2030:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS )", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2031:2: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeLiteralCSAccess().getPrimitiveTypeCSParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeCS_in_ruleTypeLiteralCS4475);
                    this_PrimitiveTypeCS_0=rulePrimitiveTypeCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PrimitiveTypeCS_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2044:2: this_CollectionTypeCS_1= ruleCollectionTypeCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeLiteralCSAccess().getCollectionTypeCSParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleTypeLiteralCS4505);
                    this_CollectionTypeCS_1=ruleCollectionTypeCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_CollectionTypeCS_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2057:2: this_TupleTypeCS_2= ruleTupleTypeCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeLiteralCSAccess().getTupleTypeCSParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleTypeCS_in_ruleTypeLiteralCS4535);
                    this_TupleTypeCS_2=ruleTupleTypeCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TupleTypeCS_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeLiteralCS


    // $ANTLR start entryRuleTypeLiteralExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2076:1: entryRuleTypeLiteralExpCS returns [EObject current=null] : iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF ;
    public final EObject entryRuleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2077:2: (iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2078:2: iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeLiteralExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_entryRuleTypeLiteralExpCS4570);
            iv_ruleTypeLiteralExpCS=ruleTypeLiteralExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralExpCS4580); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeLiteralExpCS


    // $ANTLR start ruleTypeLiteralExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2085:1: ruleTypeLiteralExpCS returns [EObject current=null] : ( (lv_ownedType_0_0= ruleTypeLiteralCS ) ) ;
    public final EObject ruleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedType_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2090:6: ( ( (lv_ownedType_0_0= ruleTypeLiteralCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2091:1: ( (lv_ownedType_0_0= ruleTypeLiteralCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2091:1: ( (lv_ownedType_0_0= ruleTypeLiteralCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2092:1: (lv_ownedType_0_0= ruleTypeLiteralCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2092:1: (lv_ownedType_0_0= ruleTypeLiteralCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2093:3: lv_ownedType_0_0= ruleTypeLiteralCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeTypeLiteralCSParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_ruleTypeLiteralExpCS4625);
            lv_ownedType_0_0=ruleTypeLiteralCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTypeLiteralExpCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"ownedType",
              	        		lv_ownedType_0_0, 
              	        		"TypeLiteralCS", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeLiteralExpCS


    // $ANTLR start entryRuleTypeNameExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2123:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2124:2: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2125:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeNameExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeNameExpCS_in_entryRuleTypeNameExpCS4660);
            iv_ruleTypeNameExpCS=ruleTypeNameExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeNameExpCS4670); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeNameExpCS


    // $ANTLR start ruleTypeNameExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2132:1: ruleTypeNameExpCS returns [EObject current=null] : ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) ) ;
    public final EObject ruleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2137:6: ( ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2138:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2138:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )
            int alt25=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==EOF||LA25_1==20||LA25_1==33||LA25_1==54||LA25_1==56||LA25_1==67) ) {
                    alt25=2;
                }
                else if ( (LA25_1==64) ) {
                    alt25=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2138:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 25, 1, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==EOF||LA25_2==20||LA25_2==33||LA25_2==54||LA25_2==56||LA25_2==67) ) {
                    alt25=2;
                }
                else if ( (LA25_2==64) ) {
                    alt25=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2138:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 25, 2, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                int LA25_3 = input.LA(2);

                if ( (LA25_3==EOF||LA25_3==20||LA25_3==33||LA25_3==54||LA25_3==56||LA25_3==67) ) {
                    alt25=2;
                }
                else if ( (LA25_3==64) ) {
                    alt25=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2138:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 25, 3, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                int LA25_4 = input.LA(2);

                if ( (LA25_4==64) ) {
                    alt25=1;
                }
                else if ( (LA25_4==EOF||LA25_4==20||LA25_4==33||LA25_4==54||LA25_4==56||LA25_4==67) ) {
                    alt25=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2138:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 25, 4, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                int LA25_5 = input.LA(2);

                if ( (LA25_5==64) ) {
                    alt25=1;
                }
                else if ( (LA25_5==EOF||LA25_5==20||LA25_5==33||LA25_5==54||LA25_5==56||LA25_5==67) ) {
                    alt25=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2138:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 25, 5, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA25_6 = input.LA(2);

                if ( (LA25_6==64) ) {
                    alt25=1;
                }
                else if ( (LA25_6==EOF||LA25_6==20||LA25_6==33||LA25_6==54||LA25_6==56||LA25_6==67) ) {
                    alt25=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2138:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 25, 6, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA25_7 = input.LA(2);

                if ( (LA25_7==64) ) {
                    alt25=1;
                }
                else if ( (LA25_7==EOF||LA25_7==20||LA25_7==33||LA25_7==54||LA25_7==56||LA25_7==67) ) {
                    alt25=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2138:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 25, 7, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                int LA25_8 = input.LA(2);

                if ( (LA25_8==EOF||LA25_8==20||LA25_8==33||LA25_8==54||LA25_8==56||LA25_8==67) ) {
                    alt25=2;
                }
                else if ( (LA25_8==64) ) {
                    alt25=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2138:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 25, 8, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                int LA25_9 = input.LA(2);

                if ( (LA25_9==EOF||LA25_9==20||LA25_9==33||LA25_9==54||LA25_9==56||LA25_9==67) ) {
                    alt25=2;
                }
                else if ( (LA25_9==64) ) {
                    alt25=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2138:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 25, 9, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2138:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2138:2: ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2138:2: ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2138:3: ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2138:3: ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2138:4: ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )*
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2138:4: ( ( ruleUnrestrictedName ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2139:1: ( ruleUnrestrictedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2139:1: ( ruleUnrestrictedName )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2140:3: ruleUnrestrictedName
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeNameExpCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTypeNameExpCSAccess().getNamespaceNamespaceCrossReference_0_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTypeNameExpCS4724);
                    ruleUnrestrictedName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,64,FollowSets000.FOLLOW_64_in_ruleTypeNameExpCS4734); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeNameExpCSAccess().getColonColonKeyword_0_0_1(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2161:1: ( ( ( ruleUnreservedName ) ) '::' )*
                    loop24:
                    do {
                        int alt24=2;
                        switch ( input.LA(1) ) {
                        case RULE_ID:
                            {
                            int LA24_1 = input.LA(2);

                            if ( (LA24_1==64) ) {
                                alt24=1;
                            }


                            }
                            break;
                        case 22:
                            {
                            int LA24_2 = input.LA(2);

                            if ( (LA24_2==64) ) {
                                alt24=1;
                            }


                            }
                            break;
                        case 23:
                            {
                            int LA24_3 = input.LA(2);

                            if ( (LA24_3==64) ) {
                                alt24=1;
                            }


                            }
                            break;
                        case 13:
                            {
                            int LA24_4 = input.LA(2);

                            if ( (LA24_4==64) ) {
                                alt24=1;
                            }


                            }
                            break;
                        case 14:
                            {
                            int LA24_5 = input.LA(2);

                            if ( (LA24_5==64) ) {
                                alt24=1;
                            }


                            }
                            break;
                        case 15:
                            {
                            int LA24_6 = input.LA(2);

                            if ( (LA24_6==64) ) {
                                alt24=1;
                            }


                            }
                            break;
                        case 16:
                            {
                            int LA24_7 = input.LA(2);

                            if ( (LA24_7==64) ) {
                                alt24=1;
                            }


                            }
                            break;
                        case 17:
                            {
                            int LA24_8 = input.LA(2);

                            if ( (LA24_8==64) ) {
                                alt24=1;
                            }


                            }
                            break;
                        case 18:
                            {
                            int LA24_9 = input.LA(2);

                            if ( (LA24_9==64) ) {
                                alt24=1;
                            }


                            }
                            break;

                        }

                        switch (alt24) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2161:2: ( ( ruleUnreservedName ) ) '::'
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2161:2: ( ( ruleUnreservedName ) )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2162:1: ( ruleUnreservedName )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2162:1: ( ruleUnreservedName )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2163:3: ruleUnreservedName
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = factory.create(grammarAccess.getTypeNameExpCSRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode, current);
                    	      	        }
                    	              
                    	    }
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTypeNameExpCSAccess().getNamespaceNamespaceCrossReference_0_0_2_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_ruleTypeNameExpCS4762);
                    	    ruleUnreservedName();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    match(input,64,FollowSets000.FOLLOW_64_in_ruleTypeNameExpCS4772); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getTypeNameExpCSAccess().getColonColonKeyword_0_0_2_1(), null); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2184:4: ( ( ruleUnreservedName ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2185:1: ( ruleUnreservedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2185:1: ( ruleUnreservedName )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2186:3: ruleUnreservedName
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeNameExpCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTypeNameExpCSAccess().getElementTypeCrossReference_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_ruleTypeNameExpCS4802);
                    ruleUnreservedName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2204:6: ( ( ruleUnrestrictedName ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2204:6: ( ( ruleUnrestrictedName ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2205:1: ( ruleUnrestrictedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2205:1: ( ruleUnrestrictedName )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2206:3: ruleUnrestrictedName
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeNameExpCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTypeNameExpCSAccess().getElementTypeCrossReference_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTypeNameExpCS4836);
                    ruleUnrestrictedName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeNameExpCS


    // $ANTLR start entryRuleTypeExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2231:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2232:2: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2233:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_entryRuleTypeExpCS4872);
            iv_ruleTypeExpCS=ruleTypeExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeExpCS4882); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeExpCS


    // $ANTLR start ruleTypeExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2240:1: ruleTypeExpCS returns [EObject current=null] : (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2245:6: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2246:1: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2246:1: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID||(LA26_0>=13 && LA26_0<=18)||(LA26_0>=22 && LA26_0<=23)) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=40 && LA26_0<=52)||LA26_0==55) ) {
                alt26=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2246:1: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2247:2: this_TypeNameExpCS_0= ruleTypeNameExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeNameExpCSParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeNameExpCS_in_ruleTypeExpCS4932);
                    this_TypeNameExpCS_0=ruleTypeNameExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TypeNameExpCS_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2260:2: this_TypeLiteralCS_1= ruleTypeLiteralCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeLiteralCSParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_ruleTypeExpCS4962);
                    this_TypeLiteralCS_1=ruleTypeLiteralCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TypeLiteralCS_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeExpCS


    // $ANTLR start entryRuleExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2279:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2280:2: (iv_ruleExpCS= ruleExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2281:2: iv_ruleExpCS= ruleExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_entryRuleExpCS4997);
            iv_ruleExpCS=ruleExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpCS5007); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpCS


    // $ANTLR start ruleExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2288:1: ruleExpCS returns [EObject current=null] : this_InfixedExpCS_0= ruleInfixedExpCS ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_InfixedExpCS_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2293:6: (this_InfixedExpCS_0= ruleInfixedExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2295:2: this_InfixedExpCS_0= ruleInfixedExpCS
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getExpCSAccess().getInfixedExpCSParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixedExpCS_in_ruleExpCS5056);
            this_InfixedExpCS_0=ruleInfixedExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_InfixedExpCS_0; 
                      currentNode = currentNode.getParent();
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpCS


    // $ANTLR start entryRuleInfixedExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2314:1: entryRuleInfixedExpCS returns [EObject current=null] : iv_ruleInfixedExpCS= ruleInfixedExpCS EOF ;
    public final EObject entryRuleInfixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixedExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2315:2: (iv_ruleInfixedExpCS= ruleInfixedExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2316:2: iv_ruleInfixedExpCS= ruleInfixedExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInfixedExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixedExpCS_in_entryRuleInfixedExpCS5090);
            iv_ruleInfixedExpCS=ruleInfixedExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInfixedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfixedExpCS5100); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInfixedExpCS


    // $ANTLR start ruleInfixedExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2323:1: ruleInfixedExpCS returns [EObject current=null] : (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? ) ;
    public final EObject ruleInfixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedExpCS_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2328:6: ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2329:1: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2329:1: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2330:2: this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getInfixedExpCSAccess().getPrefixedExpCSParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_ruleInfixedExpCS5150);
            this_PrefixedExpCS_0=rulePrefixedExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_PrefixedExpCS_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2341:1: ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?
            int alt28=2;
            switch ( input.LA(1) ) {
                case 27:
                    {
                    int LA28_1 = input.LA(2);

                    if ( (synpred68()) ) {
                        alt28=1;
                    }
                    }
                    break;
                case 28:
                    {
                    int LA28_2 = input.LA(2);

                    if ( (synpred68()) ) {
                        alt28=1;
                    }
                    }
                    break;
                case 24:
                    {
                    int LA28_3 = input.LA(2);

                    if ( (synpred68()) ) {
                        alt28=1;
                    }
                    }
                    break;
                case 25:
                    {
                    int LA28_4 = input.LA(2);

                    if ( (synpred68()) ) {
                        alt28=1;
                    }
                    }
                    break;
                case 29:
                    {
                    int LA28_5 = input.LA(2);

                    if ( (synpred68()) ) {
                        alt28=1;
                    }
                    }
                    break;
                case 30:
                    {
                    int LA28_6 = input.LA(2);

                    if ( (synpred68()) ) {
                        alt28=1;
                    }
                    }
                    break;
                case 31:
                    {
                    int LA28_7 = input.LA(2);

                    if ( (synpred68()) ) {
                        alt28=1;
                    }
                    }
                    break;
                case 32:
                    {
                    int LA28_8 = input.LA(2);

                    if ( (synpred68()) ) {
                        alt28=1;
                    }
                    }
                    break;
                case 33:
                    {
                    int LA28_9 = input.LA(2);

                    if ( (synpred68()) ) {
                        alt28=1;
                    }
                    }
                    break;
                case 34:
                    {
                    int LA28_10 = input.LA(2);

                    if ( (synpred68()) ) {
                        alt28=1;
                    }
                    }
                    break;
                case 35:
                    {
                    int LA28_11 = input.LA(2);

                    if ( (synpred68()) ) {
                        alt28=1;
                    }
                    }
                    break;
                case 36:
                    {
                    int LA28_12 = input.LA(2);

                    if ( (synpred68()) ) {
                        alt28=1;
                    }
                    }
                    break;
                case 37:
                    {
                    int LA28_13 = input.LA(2);

                    if ( (synpred68()) ) {
                        alt28=1;
                    }
                    }
                    break;
                case 38:
                    {
                    int LA28_14 = input.LA(2);

                    if ( (synpred68()) ) {
                        alt28=1;
                    }
                    }
                    break;
                case 21:
                    {
                    int LA28_15 = input.LA(2);

                    if ( (synpred68()) ) {
                        alt28=1;
                    }
                    }
                    break;
                case 39:
                    {
                    int LA28_16 = input.LA(2);

                    if ( (synpred68()) ) {
                        alt28=1;
                    }
                    }
                    break;
            }

            switch (alt28) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2341:2: () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2341:2: ()
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2342:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0().getType().getClassifier());
                              try {
                              	factory.add(temp, "ownedExpression", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2360:2: ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        switch ( input.LA(1) ) {
                        case 27:
                            {
                            int LA27_2 = input.LA(2);

                            if ( (synpred67()) ) {
                                alt27=1;
                            }


                            }
                            break;
                        case 28:
                            {
                            int LA27_3 = input.LA(2);

                            if ( (synpred67()) ) {
                                alt27=1;
                            }


                            }
                            break;
                        case 24:
                            {
                            int LA27_4 = input.LA(2);

                            if ( (synpred67()) ) {
                                alt27=1;
                            }


                            }
                            break;
                        case 25:
                            {
                            int LA27_5 = input.LA(2);

                            if ( (synpred67()) ) {
                                alt27=1;
                            }


                            }
                            break;
                        case 29:
                            {
                            int LA27_6 = input.LA(2);

                            if ( (synpred67()) ) {
                                alt27=1;
                            }


                            }
                            break;
                        case 30:
                            {
                            int LA27_7 = input.LA(2);

                            if ( (synpred67()) ) {
                                alt27=1;
                            }


                            }
                            break;
                        case 31:
                            {
                            int LA27_8 = input.LA(2);

                            if ( (synpred67()) ) {
                                alt27=1;
                            }


                            }
                            break;
                        case 32:
                            {
                            int LA27_9 = input.LA(2);

                            if ( (synpred67()) ) {
                                alt27=1;
                            }


                            }
                            break;
                        case 33:
                            {
                            int LA27_10 = input.LA(2);

                            if ( (synpred67()) ) {
                                alt27=1;
                            }


                            }
                            break;
                        case 34:
                            {
                            int LA27_11 = input.LA(2);

                            if ( (synpred67()) ) {
                                alt27=1;
                            }


                            }
                            break;
                        case 35:
                            {
                            int LA27_12 = input.LA(2);

                            if ( (synpred67()) ) {
                                alt27=1;
                            }


                            }
                            break;
                        case 36:
                            {
                            int LA27_13 = input.LA(2);

                            if ( (synpred67()) ) {
                                alt27=1;
                            }


                            }
                            break;
                        case 37:
                            {
                            int LA27_14 = input.LA(2);

                            if ( (synpred67()) ) {
                                alt27=1;
                            }


                            }
                            break;
                        case 38:
                            {
                            int LA27_15 = input.LA(2);

                            if ( (synpred67()) ) {
                                alt27=1;
                            }


                            }
                            break;
                        case 21:
                            {
                            int LA27_16 = input.LA(2);

                            if ( (synpred67()) ) {
                                alt27=1;
                            }


                            }
                            break;
                        case 39:
                            {
                            int LA27_17 = input.LA(2);

                            if ( (synpred67()) ) {
                                alt27=1;
                            }


                            }
                            break;

                        }

                        switch (alt27) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2360:3: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2360:3: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2361:1: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2361:1: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2362:3: lv_ownedOperator_2_0= ruleBinaryOperatorCS
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_1_1_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_ruleInfixedExpCS5184);
                    	    lv_ownedOperator_2_0=ruleBinaryOperatorCS();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getInfixedExpCSRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"ownedOperator",
                    	      	        		lv_ownedOperator_2_0, 
                    	      	        		"BinaryOperatorCS", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2384:2: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2385:1: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2385:1: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2386:3: lv_ownedExpression_3_0= rulePrefixedExpCS
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_ruleInfixedExpCS5205);
                    	    lv_ownedExpression_3_0=rulePrefixedExpCS();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getInfixedExpCSRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"ownedExpression",
                    	      	        		lv_ownedExpression_3_0, 
                    	      	        		"PrefixedExpCS", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInfixedExpCS


    // $ANTLR start entryRuleBinaryOperatorCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2416:1: entryRuleBinaryOperatorCS returns [EObject current=null] : iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF ;
    public final EObject entryRuleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperatorCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2417:2: (iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2418:2: iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBinaryOperatorCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_entryRuleBinaryOperatorCS5245);
            iv_ruleBinaryOperatorCS=ruleBinaryOperatorCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBinaryOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryOperatorCS5255); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBinaryOperatorCS


    // $ANTLR start ruleBinaryOperatorCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2425:1: ruleBinaryOperatorCS returns [EObject current=null] : ( (lv_name_0_0= ruleInfixOperator ) ) ;
    public final EObject ruleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2430:6: ( ( (lv_name_0_0= ruleInfixOperator ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2431:1: ( (lv_name_0_0= ruleInfixOperator ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2431:1: ( (lv_name_0_0= ruleInfixOperator ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2432:1: (lv_name_0_0= ruleInfixOperator )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2432:1: (lv_name_0_0= ruleInfixOperator )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2433:3: lv_name_0_0= ruleInfixOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getBinaryOperatorCSAccess().getNameInfixOperatorParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixOperator_in_ruleBinaryOperatorCS5300);
            lv_name_0_0=ruleInfixOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBinaryOperatorCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"InfixOperator", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBinaryOperatorCS


    // $ANTLR start entryRulePrefixedExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2463:1: entryRulePrefixedExpCS returns [EObject current=null] : iv_rulePrefixedExpCS= rulePrefixedExpCS EOF ;
    public final EObject entryRulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2464:2: (iv_rulePrefixedExpCS= rulePrefixedExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2465:2: iv_rulePrefixedExpCS= rulePrefixedExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrefixedExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_entryRulePrefixedExpCS5335);
            iv_rulePrefixedExpCS=rulePrefixedExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrefixedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrefixedExpCS5345); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrefixedExpCS


    // $ANTLR start rulePrefixedExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2472:1: rulePrefixedExpCS returns [EObject current=null] : (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) ) ;
    public final EObject rulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpCS_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2477:6: ( (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2478:1: (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2478:1: (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_INT && LA30_0<=RULE_SINGLE_QUOTED_STRING)||(LA30_0>=13 && LA30_0<=18)||(LA30_0>=22 && LA30_0<=23)||LA30_0==27||(LA30_0>=40 && LA30_0<=53)||LA30_0==55||(LA30_0>=60 && LA30_0<=63)||LA30_0==68||LA30_0==72||LA30_0==74) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=25 && LA30_0<=26)) ) {
                alt30=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2478:1: (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) )", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2479:2: this_PrimaryExpCS_0= rulePrimaryExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrefixedExpCSAccess().getPrimaryExpCSParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS5395);
                    this_PrimaryExpCS_0=rulePrimaryExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PrimaryExpCS_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2491:6: ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2491:6: ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2491:7: () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2491:7: ()
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2492:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getPrefixedExpCSAccess().getPrefixExpCSAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getPrefixedExpCSAccess().getPrefixExpCSAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2505:2: ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0>=25 && LA29_0<=26)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2506:1: (lv_ownedOperator_2_0= ruleUnaryOperatorCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2506:1: (lv_ownedOperator_2_0= ruleUnaryOperatorCS )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2507:3: lv_ownedOperator_2_0= ruleUnaryOperatorCS
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getPrefixedExpCSAccess().getOwnedOperatorUnaryOperatorCSParserRuleCall_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorCS_in_rulePrefixedExpCS5434);
                    	    lv_ownedOperator_2_0=ruleUnaryOperatorCS();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getPrefixedExpCSRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"ownedOperator",
                    	      	        		lv_ownedOperator_2_0, 
                    	      	        		"UnaryOperatorCS", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2529:3: ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2530:1: (lv_ownedExpression_3_0= rulePrimaryExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2530:1: (lv_ownedExpression_3_0= rulePrimaryExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2531:3: lv_ownedExpression_3_0= rulePrimaryExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPrefixedExpCSAccess().getOwnedExpressionPrimaryExpCSParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS5456);
                    lv_ownedExpression_3_0=rulePrimaryExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPrefixedExpCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"ownedExpression",
                      	        		lv_ownedExpression_3_0, 
                      	        		"PrimaryExpCS", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrefixedExpCS


    // $ANTLR start entryRuleUnaryOperatorCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2561:1: entryRuleUnaryOperatorCS returns [EObject current=null] : iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF ;
    public final EObject entryRuleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperatorCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2562:2: (iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2563:2: iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnaryOperatorCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorCS_in_entryRuleUnaryOperatorCS5493);
            iv_ruleUnaryOperatorCS=ruleUnaryOperatorCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnaryOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryOperatorCS5503); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUnaryOperatorCS


    // $ANTLR start ruleUnaryOperatorCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2570:1: ruleUnaryOperatorCS returns [EObject current=null] : ( (lv_name_0_0= rulePrefixOperator ) ) ;
    public final EObject ruleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2575:6: ( ( (lv_name_0_0= rulePrefixOperator ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2576:1: ( (lv_name_0_0= rulePrefixOperator ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2576:1: ( (lv_name_0_0= rulePrefixOperator ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2577:1: (lv_name_0_0= rulePrefixOperator )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2577:1: (lv_name_0_0= rulePrefixOperator )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2578:3: lv_name_0_0= rulePrefixOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUnaryOperatorCSAccess().getNamePrefixOperatorParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixOperator_in_ruleUnaryOperatorCS5548);
            lv_name_0_0=rulePrefixOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getUnaryOperatorCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"PrefixOperator", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUnaryOperatorCS


    // $ANTLR start entryRulePrimaryExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2608:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2609:2: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2610:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimaryExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_entryRulePrimaryExpCS5583);
            iv_rulePrimaryExpCS=rulePrimaryExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimaryExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpCS5593); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimaryExpCS


    // $ANTLR start rulePrimaryExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2617:1: rulePrimaryExpCS returns [EObject current=null] : (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS ) ;
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


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2622:6: ( (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2623:1: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2623:1: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )
            int alt31=9;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 22:
            case 23:
                {
                alt31=1;
                }
                break;
            case 74:
                {
                alt31=2;
                }
                break;
            case RULE_INT:
            case RULE_SINGLE_QUOTED_STRING:
            case 27:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt31=3;
                }
                break;
            case 55:
                {
                int LA31_18 = input.LA(2);

                if ( (synpred74()) ) {
                    alt31=4;
                }
                else if ( (synpred76()) ) {
                    alt31=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2623:1: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )", 31, 18, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                int LA31_19 = input.LA(2);

                if ( (synpred75()) ) {
                    alt31=5;
                }
                else if ( (synpred76()) ) {
                    alt31=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2623:1: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )", 31, 19, input);

                    throw nvae;
                }
                }
                break;
            case 49:
                {
                int LA31_20 = input.LA(2);

                if ( (synpred75()) ) {
                    alt31=5;
                }
                else if ( (synpred76()) ) {
                    alt31=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2623:1: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )", 31, 20, input);

                    throw nvae;
                }
                }
                break;
            case 50:
                {
                int LA31_21 = input.LA(2);

                if ( (synpred75()) ) {
                    alt31=5;
                }
                else if ( (synpred76()) ) {
                    alt31=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2623:1: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )", 31, 21, input);

                    throw nvae;
                }
                }
                break;
            case 51:
                {
                int LA31_22 = input.LA(2);

                if ( (synpred75()) ) {
                    alt31=5;
                }
                else if ( (synpred76()) ) {
                    alt31=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2623:1: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )", 31, 22, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                int LA31_23 = input.LA(2);

                if ( (synpred75()) ) {
                    alt31=5;
                }
                else if ( (synpred76()) ) {
                    alt31=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2623:1: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )", 31, 23, input);

                    throw nvae;
                }
                }
                break;
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
                {
                alt31=6;
                }
                break;
            case 72:
                {
                alt31=7;
                }
                break;
            case 68:
                {
                alt31=8;
                }
                break;
            case 53:
                {
                alt31=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2623:1: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2624:2: this_NavigatingExpCS_0= ruleNavigatingExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNavigatingExpCSParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingExpCS_in_rulePrimaryExpCS5643);
                    this_NavigatingExpCS_0=ruleNavigatingExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NavigatingExpCS_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2637:2: this_SelfExpCS_1= ruleSelfExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSelfExpCSParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSelfExpCS_in_rulePrimaryExpCS5673);
                    this_SelfExpCS_1=ruleSelfExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SelfExpCS_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2650:2: this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPrimitiveLiteralExpCSParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveLiteralExpCS_in_rulePrimaryExpCS5703);
                    this_PrimitiveLiteralExpCS_2=rulePrimitiveLiteralExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PrimitiveLiteralExpCS_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2663:2: this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTupleLiteralExpCSParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_rulePrimaryExpCS5733);
                    this_TupleLiteralExpCS_3=ruleTupleLiteralExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TupleLiteralExpCS_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2676:2: this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpCSAccess().getCollectionLiteralExpCSParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_rulePrimaryExpCS5763);
                    this_CollectionLiteralExpCS_4=ruleCollectionLiteralExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_CollectionLiteralExpCS_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2689:2: this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTypeLiteralExpCSParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_rulePrimaryExpCS5793);
                    this_TypeLiteralExpCS_5=ruleTypeLiteralExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TypeLiteralExpCS_5; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2702:2: this_LetExpCS_6= ruleLetExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpCSAccess().getLetExpCSParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_rulePrimaryExpCS5823);
                    this_LetExpCS_6=ruleLetExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_LetExpCS_6; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2715:2: this_IfExpCS_7= ruleIfExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpCSAccess().getIfExpCSParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIfExpCS_in_rulePrimaryExpCS5853);
                    this_IfExpCS_7=ruleIfExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_IfExpCS_7; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2728:2: this_NestedExpCS_8= ruleNestedExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNestedExpCSParserRuleCall_8(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNestedExpCS_in_rulePrimaryExpCS5883);
                    this_NestedExpCS_8=ruleNestedExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NestedExpCS_8; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrimaryExpCS


    // $ANTLR start entryRuleNameExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2747:1: entryRuleNameExpCS returns [EObject current=null] : iv_ruleNameExpCS= ruleNameExpCS EOF ;
    public final EObject entryRuleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2748:2: (iv_ruleNameExpCS= ruleNameExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2749:2: iv_ruleNameExpCS= ruleNameExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNameExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNameExpCS_in_entryRuleNameExpCS5918);
            iv_ruleNameExpCS=ruleNameExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNameExpCS5928); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNameExpCS


    // $ANTLR start ruleNameExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2756:1: ruleNameExpCS returns [EObject current=null] : ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) ) ;
    public final EObject ruleNameExpCS() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2761:6: ( ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2762:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2762:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )
            int alt33=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==64) ) {
                    alt33=1;
                }
                else if ( (LA33_1==EOF||(LA33_1>=19 && LA33_1<=21)||(LA33_1>=24 && LA33_1<=25)||(LA33_1>=27 && LA33_1<=39)||(LA33_1>=53 && LA33_1<=54)||LA33_1==56||(LA33_1>=58 && LA33_1<=59)||(LA33_1>=65 && LA33_1<=67)||(LA33_1>=69 && LA33_1<=71)||LA33_1==73) ) {
                    alt33=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2762:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 33, 1, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                int LA33_2 = input.LA(2);

                if ( (LA33_2==EOF||(LA33_2>=19 && LA33_2<=21)||(LA33_2>=24 && LA33_2<=25)||(LA33_2>=27 && LA33_2<=39)||(LA33_2>=53 && LA33_2<=54)||LA33_2==56||(LA33_2>=58 && LA33_2<=59)||(LA33_2>=65 && LA33_2<=67)||(LA33_2>=69 && LA33_2<=71)||LA33_2==73) ) {
                    alt33=2;
                }
                else if ( (LA33_2==64) ) {
                    alt33=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2762:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 33, 2, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                int LA33_3 = input.LA(2);

                if ( (LA33_3==EOF||(LA33_3>=19 && LA33_3<=21)||(LA33_3>=24 && LA33_3<=25)||(LA33_3>=27 && LA33_3<=39)||(LA33_3>=53 && LA33_3<=54)||LA33_3==56||(LA33_3>=58 && LA33_3<=59)||(LA33_3>=65 && LA33_3<=67)||(LA33_3>=69 && LA33_3<=71)||LA33_3==73) ) {
                    alt33=2;
                }
                else if ( (LA33_3==64) ) {
                    alt33=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2762:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 33, 3, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                int LA33_4 = input.LA(2);

                if ( (LA33_4==EOF||(LA33_4>=19 && LA33_4<=21)||(LA33_4>=24 && LA33_4<=25)||(LA33_4>=27 && LA33_4<=39)||(LA33_4>=53 && LA33_4<=54)||LA33_4==56||(LA33_4>=58 && LA33_4<=59)||(LA33_4>=65 && LA33_4<=67)||(LA33_4>=69 && LA33_4<=71)||LA33_4==73) ) {
                    alt33=2;
                }
                else if ( (LA33_4==64) ) {
                    alt33=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2762:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 33, 4, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                int LA33_5 = input.LA(2);

                if ( (LA33_5==64) ) {
                    alt33=1;
                }
                else if ( (LA33_5==EOF||(LA33_5>=19 && LA33_5<=21)||(LA33_5>=24 && LA33_5<=25)||(LA33_5>=27 && LA33_5<=39)||(LA33_5>=53 && LA33_5<=54)||LA33_5==56||(LA33_5>=58 && LA33_5<=59)||(LA33_5>=65 && LA33_5<=67)||(LA33_5>=69 && LA33_5<=71)||LA33_5==73) ) {
                    alt33=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2762:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 33, 5, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA33_6 = input.LA(2);

                if ( (LA33_6==EOF||(LA33_6>=19 && LA33_6<=21)||(LA33_6>=24 && LA33_6<=25)||(LA33_6>=27 && LA33_6<=39)||(LA33_6>=53 && LA33_6<=54)||LA33_6==56||(LA33_6>=58 && LA33_6<=59)||(LA33_6>=65 && LA33_6<=67)||(LA33_6>=69 && LA33_6<=71)||LA33_6==73) ) {
                    alt33=2;
                }
                else if ( (LA33_6==64) ) {
                    alt33=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2762:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 33, 6, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA33_7 = input.LA(2);

                if ( (LA33_7==EOF||(LA33_7>=19 && LA33_7<=21)||(LA33_7>=24 && LA33_7<=25)||(LA33_7>=27 && LA33_7<=39)||(LA33_7>=53 && LA33_7<=54)||LA33_7==56||(LA33_7>=58 && LA33_7<=59)||(LA33_7>=65 && LA33_7<=67)||(LA33_7>=69 && LA33_7<=71)||LA33_7==73) ) {
                    alt33=2;
                }
                else if ( (LA33_7==64) ) {
                    alt33=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2762:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 33, 7, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                int LA33_8 = input.LA(2);

                if ( (LA33_8==64) ) {
                    alt33=1;
                }
                else if ( (LA33_8==EOF||(LA33_8>=19 && LA33_8<=21)||(LA33_8>=24 && LA33_8<=25)||(LA33_8>=27 && LA33_8<=39)||(LA33_8>=53 && LA33_8<=54)||LA33_8==56||(LA33_8>=58 && LA33_8<=59)||(LA33_8>=65 && LA33_8<=67)||(LA33_8>=69 && LA33_8<=71)||LA33_8==73) ) {
                    alt33=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2762:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 33, 8, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                int LA33_9 = input.LA(2);

                if ( (LA33_9==EOF||(LA33_9>=19 && LA33_9<=21)||(LA33_9>=24 && LA33_9<=25)||(LA33_9>=27 && LA33_9<=39)||(LA33_9>=53 && LA33_9<=54)||LA33_9==56||(LA33_9>=58 && LA33_9<=59)||(LA33_9>=65 && LA33_9<=67)||(LA33_9>=69 && LA33_9<=71)||LA33_9==73) ) {
                    alt33=2;
                }
                else if ( (LA33_9==64) ) {
                    alt33=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2762:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 33, 9, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2762:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2762:2: ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2762:2: ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2762:3: ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2762:3: ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2762:4: ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )*
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2762:4: ( ( ruleUnrestrictedName ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2763:1: ( ruleUnrestrictedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2763:1: ( ruleUnrestrictedName )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2764:3: ruleUnrestrictedName
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getNameExpCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNameExpCSAccess().getNamespaceNamespaceCrossReference_0_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleNameExpCS5982);
                    ruleUnrestrictedName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,64,FollowSets000.FOLLOW_64_in_ruleNameExpCS5992); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNameExpCSAccess().getColonColonKeyword_0_0_1(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2785:1: ( ( ( ruleUnreservedName ) ) '::' )*
                    loop32:
                    do {
                        int alt32=2;
                        switch ( input.LA(1) ) {
                        case RULE_ID:
                            {
                            int LA32_1 = input.LA(2);

                            if ( (LA32_1==64) ) {
                                alt32=1;
                            }


                            }
                            break;
                        case 22:
                            {
                            int LA32_2 = input.LA(2);

                            if ( (LA32_2==64) ) {
                                alt32=1;
                            }


                            }
                            break;
                        case 23:
                            {
                            int LA32_3 = input.LA(2);

                            if ( (LA32_3==64) ) {
                                alt32=1;
                            }


                            }
                            break;
                        case 13:
                            {
                            int LA32_4 = input.LA(2);

                            if ( (LA32_4==64) ) {
                                alt32=1;
                            }


                            }
                            break;
                        case 14:
                            {
                            int LA32_5 = input.LA(2);

                            if ( (LA32_5==64) ) {
                                alt32=1;
                            }


                            }
                            break;
                        case 15:
                            {
                            int LA32_6 = input.LA(2);

                            if ( (LA32_6==64) ) {
                                alt32=1;
                            }


                            }
                            break;
                        case 16:
                            {
                            int LA32_7 = input.LA(2);

                            if ( (LA32_7==64) ) {
                                alt32=1;
                            }


                            }
                            break;
                        case 17:
                            {
                            int LA32_8 = input.LA(2);

                            if ( (LA32_8==64) ) {
                                alt32=1;
                            }


                            }
                            break;
                        case 18:
                            {
                            int LA32_9 = input.LA(2);

                            if ( (LA32_9==64) ) {
                                alt32=1;
                            }


                            }
                            break;

                        }

                        switch (alt32) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2785:2: ( ( ruleUnreservedName ) ) '::'
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2785:2: ( ( ruleUnreservedName ) )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2786:1: ( ruleUnreservedName )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2786:1: ( ruleUnreservedName )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2787:3: ruleUnreservedName
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = factory.create(grammarAccess.getNameExpCSRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode, current);
                    	      	        }
                    	              
                    	    }
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getNameExpCSAccess().getNamespaceNamespaceCrossReference_0_0_2_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_ruleNameExpCS6020);
                    	    ruleUnreservedName();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    match(input,64,FollowSets000.FOLLOW_64_in_ruleNameExpCS6030); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getNameExpCSAccess().getColonColonKeyword_0_0_2_1(), null); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2808:4: ( ( ruleUnreservedName ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2809:1: ( ruleUnreservedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2809:1: ( ruleUnreservedName )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2810:3: ruleUnreservedName
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getNameExpCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNameExpCSAccess().getElementNamedElementCrossReference_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_ruleNameExpCS6060);
                    ruleUnreservedName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2828:6: ( ( ruleUnrestrictedName ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2828:6: ( ( ruleUnrestrictedName ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2829:1: ( ruleUnrestrictedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2829:1: ( ruleUnrestrictedName )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2830:3: ruleUnrestrictedName
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getNameExpCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNameExpCSAccess().getElementNamedElementCrossReference_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleNameExpCS6094);
                    ruleUnrestrictedName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNameExpCS


    // $ANTLR start entryRuleIndexExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2855:1: entryRuleIndexExpCS returns [EObject current=null] : iv_ruleIndexExpCS= ruleIndexExpCS EOF ;
    public final EObject entryRuleIndexExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2856:2: (iv_ruleIndexExpCS= ruleIndexExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2857:2: iv_ruleIndexExpCS= ruleIndexExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIndexExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIndexExpCS_in_entryRuleIndexExpCS6130);
            iv_ruleIndexExpCS=ruleIndexExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIndexExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIndexExpCS6140); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIndexExpCS


    // $ANTLR start ruleIndexExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2864:1: ruleIndexExpCS returns [EObject current=null] : (this_NameExpCS_0= ruleNameExpCS ( () '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) ( ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* ']' ( '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) ( ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* ']' )? )? ) ;
    public final EObject ruleIndexExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NameExpCS_0 = null;

        EObject lv_firstIndexes_3_0 = null;

        EObject lv_firstIndexes_5_0 = null;

        EObject lv_secondIndexes_8_0 = null;

        EObject lv_secondIndexes_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2869:6: ( (this_NameExpCS_0= ruleNameExpCS ( () '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) ( ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* ']' ( '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) ( ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* ']' )? )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2870:1: (this_NameExpCS_0= ruleNameExpCS ( () '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) ( ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* ']' ( '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) ( ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* ']' )? )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2870:1: (this_NameExpCS_0= ruleNameExpCS ( () '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) ( ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* ']' ( '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) ( ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* ']' )? )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2871:2: this_NameExpCS_0= ruleNameExpCS ( () '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) ( ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* ']' ( '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) ( ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* ']' )? )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getIndexExpCSAccess().getNameExpCSParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNameExpCS_in_ruleIndexExpCS6190);
            this_NameExpCS_0=ruleNameExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_NameExpCS_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2882:1: ( () '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) ( ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* ']' ( '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) ( ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* ']' )? )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==65) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2882:2: () '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) ( ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* ']' ( '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) ( ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* ']' )?
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2882:2: ()
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2883:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getIndexExpCSAccess().getIndexExpCSNameAction_1_0().getType().getClassifier());
                              try {
                              	factory.set(temp, "name", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getIndexExpCSAccess().getIndexExpCSNameAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,65,FollowSets000.FOLLOW_65_in_ruleIndexExpCS6212); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getIndexExpCSAccess().getLeftSquareBracketKeyword_1_1(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2905:1: ( (lv_firstIndexes_3_0= ruleExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2906:1: (lv_firstIndexes_3_0= ruleExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2906:1: (lv_firstIndexes_3_0= ruleExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2907:3: lv_firstIndexes_3_0= ruleExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getIndexExpCSAccess().getFirstIndexesExpCSParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIndexExpCS6233);
                    lv_firstIndexes_3_0=ruleExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getIndexExpCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"firstIndexes",
                      	        		lv_firstIndexes_3_0, 
                      	        		"ExpCS", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2929:2: ( ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==56) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2929:4: ',' ( (lv_firstIndexes_5_0= ruleExpCS ) )
                    	    {
                    	    match(input,56,FollowSets000.FOLLOW_56_in_ruleIndexExpCS6244); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getIndexExpCSAccess().getCommaKeyword_1_3_0(), null); 
                    	          
                    	    }
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2933:1: ( (lv_firstIndexes_5_0= ruleExpCS ) )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2934:1: (lv_firstIndexes_5_0= ruleExpCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2934:1: (lv_firstIndexes_5_0= ruleExpCS )
                    	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2935:3: lv_firstIndexes_5_0= ruleExpCS
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getIndexExpCSAccess().getFirstIndexesExpCSParserRuleCall_1_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIndexExpCS6265);
                    	    lv_firstIndexes_5_0=ruleExpCS();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getIndexExpCSRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"firstIndexes",
                    	      	        		lv_firstIndexes_5_0, 
                    	      	        		"ExpCS", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    match(input,66,FollowSets000.FOLLOW_66_in_ruleIndexExpCS6277); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getIndexExpCSAccess().getRightSquareBracketKeyword_1_4(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2961:1: ( '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) ( ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* ']' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==65) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2961:3: '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) ( ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* ']'
                            {
                            match(input,65,FollowSets000.FOLLOW_65_in_ruleIndexExpCS6288); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getIndexExpCSAccess().getLeftSquareBracketKeyword_1_5_0(), null); 
                                  
                            }
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2965:1: ( (lv_secondIndexes_8_0= ruleExpCS ) )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2966:1: (lv_secondIndexes_8_0= ruleExpCS )
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2966:1: (lv_secondIndexes_8_0= ruleExpCS )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2967:3: lv_secondIndexes_8_0= ruleExpCS
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getIndexExpCSAccess().getSecondIndexesExpCSParserRuleCall_1_5_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIndexExpCS6309);
                            lv_secondIndexes_8_0=ruleExpCS();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getIndexExpCSRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"secondIndexes",
                              	        		lv_secondIndexes_8_0, 
                              	        		"ExpCS", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2989:2: ( ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )*
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( (LA35_0==56) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2989:4: ',' ( (lv_secondIndexes_10_0= ruleExpCS ) )
                            	    {
                            	    match(input,56,FollowSets000.FOLLOW_56_in_ruleIndexExpCS6320); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getIndexExpCSAccess().getCommaKeyword_1_5_2_0(), null); 
                            	          
                            	    }
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2993:1: ( (lv_secondIndexes_10_0= ruleExpCS ) )
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2994:1: (lv_secondIndexes_10_0= ruleExpCS )
                            	    {
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2994:1: (lv_secondIndexes_10_0= ruleExpCS )
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2995:3: lv_secondIndexes_10_0= ruleExpCS
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getIndexExpCSAccess().getSecondIndexesExpCSParserRuleCall_1_5_2_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIndexExpCS6341);
                            	    lv_secondIndexes_10_0=ruleExpCS();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getIndexExpCSRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"secondIndexes",
                            	      	        		lv_secondIndexes_10_0, 
                            	      	        		"ExpCS", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop35;
                                }
                            } while (true);

                            match(input,66,FollowSets000.FOLLOW_66_in_ruleIndexExpCS6353); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getIndexExpCSAccess().getRightSquareBracketKeyword_1_5_3(), null); 
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIndexExpCS


    // $ANTLR start entryRuleNavigatingExpCS_Base
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3029:1: entryRuleNavigatingExpCS_Base returns [EObject current=null] : iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF ;
    public final EObject entryRuleNavigatingExpCS_Base() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingExpCS_Base = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3030:2: (iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3031:2: iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNavigatingExpCS_BaseRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingExpCS_Base_in_entryRuleNavigatingExpCS_Base6393);
            iv_ruleNavigatingExpCS_Base=ruleNavigatingExpCS_Base();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNavigatingExpCS_Base; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingExpCS_Base6403); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNavigatingExpCS_Base


    // $ANTLR start ruleNavigatingExpCS_Base
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3038:1: ruleNavigatingExpCS_Base returns [EObject current=null] : this_IndexExpCS_0= ruleIndexExpCS ;
    public final EObject ruleNavigatingExpCS_Base() throws RecognitionException {
        EObject current = null;

        EObject this_IndexExpCS_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3043:6: (this_IndexExpCS_0= ruleIndexExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3045:2: this_IndexExpCS_0= ruleIndexExpCS
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getNavigatingExpCS_BaseAccess().getIndexExpCSParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleIndexExpCS_in_ruleNavigatingExpCS_Base6452);
            this_IndexExpCS_0=ruleIndexExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_IndexExpCS_0; 
                      currentNode = currentNode.getParent();
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNavigatingExpCS_Base


    // $ANTLR start entryRuleNavigatingExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3064:1: entryRuleNavigatingExpCS returns [EObject current=null] : iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF ;
    public final EObject entryRuleNavigatingExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3065:2: (iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3066:2: iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNavigatingExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingExpCS_in_entryRuleNavigatingExpCS6486);
            iv_ruleNavigatingExpCS=ruleNavigatingExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNavigatingExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingExpCS6496); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNavigatingExpCS


    // $ANTLR start ruleNavigatingExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3073:1: ruleNavigatingExpCS returns [EObject current=null] : (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () '(' ( ( (lv_arguments_3_0= ruleNavigatingArgCSfirst ) ) ( (lv_arguments_4_0= ruleNavigatingArgCSnext ) )* )? ')' )? ) ;
    public final EObject ruleNavigatingExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NavigatingExpCS_Base_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3078:6: ( (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () '(' ( ( (lv_arguments_3_0= ruleNavigatingArgCSfirst ) ) ( (lv_arguments_4_0= ruleNavigatingArgCSnext ) )* )? ')' )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3079:1: (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () '(' ( ( (lv_arguments_3_0= ruleNavigatingArgCSfirst ) ) ( (lv_arguments_4_0= ruleNavigatingArgCSnext ) )* )? ')' )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3079:1: (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () '(' ( ( (lv_arguments_3_0= ruleNavigatingArgCSfirst ) ) ( (lv_arguments_4_0= ruleNavigatingArgCSnext ) )* )? ')' )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3080:2: this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () '(' ( ( (lv_arguments_3_0= ruleNavigatingArgCSfirst ) ) ( (lv_arguments_4_0= ruleNavigatingArgCSnext ) )* )? ')' )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCS_BaseParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingExpCS_Base_in_ruleNavigatingExpCS6546);
            this_NavigatingExpCS_Base_0=ruleNavigatingExpCS_Base();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_NavigatingExpCS_Base_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3091:1: ( () '(' ( ( (lv_arguments_3_0= ruleNavigatingArgCSfirst ) ) ( (lv_arguments_4_0= ruleNavigatingArgCSnext ) )* )? ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==53) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3091:2: () '(' ( ( (lv_arguments_3_0= ruleNavigatingArgCSfirst ) ) ( (lv_arguments_4_0= ruleNavigatingArgCSnext ) )* )? ')'
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3091:2: ()
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3092:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCSNameAction_1_0().getType().getClassifier());
                              try {
                              	factory.set(temp, "name", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCSNameAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,53,FollowSets000.FOLLOW_53_in_ruleNavigatingExpCS6568); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNavigatingExpCSAccess().getLeftParenthesisKeyword_1_1(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3114:1: ( ( (lv_arguments_3_0= ruleNavigatingArgCSfirst ) ) ( (lv_arguments_4_0= ruleNavigatingArgCSnext ) )* )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0>=RULE_INT && LA39_0<=RULE_SINGLE_QUOTED_STRING)||(LA39_0>=13 && LA39_0<=18)||(LA39_0>=22 && LA39_0<=23)||(LA39_0>=25 && LA39_0<=27)||(LA39_0>=40 && LA39_0<=53)||LA39_0==55||(LA39_0>=60 && LA39_0<=63)||LA39_0==68||LA39_0==72||LA39_0==74) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3114:2: ( (lv_arguments_3_0= ruleNavigatingArgCSfirst ) ) ( (lv_arguments_4_0= ruleNavigatingArgCSnext ) )*
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3114:2: ( (lv_arguments_3_0= ruleNavigatingArgCSfirst ) )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3115:1: (lv_arguments_3_0= ruleNavigatingArgCSfirst )
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3115:1: (lv_arguments_3_0= ruleNavigatingArgCSfirst )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3116:3: lv_arguments_3_0= ruleNavigatingArgCSfirst
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentsNavigatingArgCSfirstParserRuleCall_1_2_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCSfirst_in_ruleNavigatingExpCS6590);
                            lv_arguments_3_0=ruleNavigatingArgCSfirst();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getNavigatingExpCSRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"arguments",
                              	        		lv_arguments_3_0, 
                              	        		"NavigatingArgCSfirst", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3138:2: ( (lv_arguments_4_0= ruleNavigatingArgCSnext ) )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==20||LA38_0==56||LA38_0==67) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3139:1: (lv_arguments_4_0= ruleNavigatingArgCSnext )
                            	    {
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3139:1: (lv_arguments_4_0= ruleNavigatingArgCSnext )
                            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3140:3: lv_arguments_4_0= ruleNavigatingArgCSnext
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentsNavigatingArgCSnextParserRuleCall_1_2_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCSnext_in_ruleNavigatingExpCS6611);
                            	    lv_arguments_4_0=ruleNavigatingArgCSnext();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getNavigatingExpCSRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"arguments",
                            	      	        		lv_arguments_4_0, 
                            	      	        		"NavigatingArgCSnext", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop38;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,54,FollowSets000.FOLLOW_54_in_ruleNavigatingExpCS6624); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNavigatingExpCSAccess().getRightParenthesisKeyword_1_3(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNavigatingExpCS


    // $ANTLR start entryRuleNavigatingArgCSfirst
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3174:1: entryRuleNavigatingArgCSfirst returns [EObject current=null] : iv_ruleNavigatingArgCSfirst= ruleNavigatingArgCSfirst EOF ;
    public final EObject entryRuleNavigatingArgCSfirst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCSfirst = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3175:2: (iv_ruleNavigatingArgCSfirst= ruleNavigatingArgCSfirst EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3176:2: iv_ruleNavigatingArgCSfirst= ruleNavigatingArgCSfirst EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNavigatingArgCSfirstRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCSfirst_in_entryRuleNavigatingArgCSfirst6662);
            iv_ruleNavigatingArgCSfirst=ruleNavigatingArgCSfirst();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNavigatingArgCSfirst; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgCSfirst6672); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNavigatingArgCSfirst


    // $ANTLR start ruleNavigatingArgCSfirst
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3183:1: ruleNavigatingArgCSfirst returns [EObject current=null] : ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? ) ;
    public final EObject ruleNavigatingArgCSfirst() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3188:6: ( ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3189:1: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3189:1: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3189:2: ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3189:2: ( (lv_name_0_0= ruleNavigatingArgExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3190:1: (lv_name_0_0= ruleNavigatingArgExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3190:1: (lv_name_0_0= ruleNavigatingArgExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3191:3: lv_name_0_0= ruleNavigatingArgExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNavigatingArgCSfirstAccess().getNameNavigatingArgExpCSParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCSfirst6718);
            lv_name_0_0=ruleNavigatingArgExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNavigatingArgCSfirstRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"NavigatingArgExpCS", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3213:2: ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==19) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3213:4: ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_ruleNavigatingArgCSfirst6729); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNavigatingArgCSfirstAccess().getColonKeyword_1_0(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3217:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3218:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3218:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3219:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNavigatingArgCSfirstAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCSfirst6750);
                    lv_ownedType_2_0=ruleTypeExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNavigatingArgCSfirstRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"ownedType",
                      	        		lv_ownedType_2_0, 
                      	        		"TypeExpCS", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNavigatingArgCSfirst


    // $ANTLR start entryRuleNavigatingArgCSnext
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3249:1: entryRuleNavigatingArgCSnext returns [EObject current=null] : iv_ruleNavigatingArgCSnext= ruleNavigatingArgCSnext EOF ;
    public final EObject entryRuleNavigatingArgCSnext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCSnext = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3250:2: (iv_ruleNavigatingArgCSnext= ruleNavigatingArgCSnext EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3251:2: iv_ruleNavigatingArgCSnext= ruleNavigatingArgCSnext EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNavigatingArgCSnextRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCSnext_in_entryRuleNavigatingArgCSnext6788);
            iv_ruleNavigatingArgCSnext=ruleNavigatingArgCSnext();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNavigatingArgCSnext; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgCSnext6798); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNavigatingArgCSnext


    // $ANTLR start ruleNavigatingArgCSnext
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3258:1: ruleNavigatingArgCSnext returns [EObject current=null] : ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) ) | ( ( (lv_prefix_2_0= ',' ) ) ( (lv_name_3_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) )? ) | ( ( (lv_prefix_6_0= ';' ) ) ( (lv_name_7_0= ruleNavigatingArgExpCS ) ) ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) ) '=' ( (lv_init_11_0= ruleExpCS ) ) ) ) ;
    public final EObject ruleNavigatingArgCSnext() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token lv_prefix_2_0=null;
        Token lv_prefix_6_0=null;
        EObject lv_name_1_0 = null;

        EObject lv_name_3_0 = null;

        EObject lv_ownedType_5_0 = null;

        EObject lv_name_7_0 = null;

        EObject lv_ownedType_9_0 = null;

        EObject lv_init_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3263:6: ( ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) ) | ( ( (lv_prefix_2_0= ',' ) ) ( (lv_name_3_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) )? ) | ( ( (lv_prefix_6_0= ';' ) ) ( (lv_name_7_0= ruleNavigatingArgExpCS ) ) ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) ) '=' ( (lv_init_11_0= ruleExpCS ) ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3264:1: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) ) | ( ( (lv_prefix_2_0= ',' ) ) ( (lv_name_3_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) )? ) | ( ( (lv_prefix_6_0= ';' ) ) ( (lv_name_7_0= ruleNavigatingArgExpCS ) ) ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) ) '=' ( (lv_init_11_0= ruleExpCS ) ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3264:1: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) ) | ( ( (lv_prefix_2_0= ',' ) ) ( (lv_name_3_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) )? ) | ( ( (lv_prefix_6_0= ';' ) ) ( (lv_name_7_0= ruleNavigatingArgExpCS ) ) ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) ) '=' ( (lv_init_11_0= ruleExpCS ) ) ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt43=1;
                }
                break;
            case 56:
                {
                alt43=2;
                }
                break;
            case 20:
                {
                alt43=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3264:1: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) ) | ( ( (lv_prefix_2_0= ',' ) ) ( (lv_name_3_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) )? ) | ( ( (lv_prefix_6_0= ';' ) ) ( (lv_name_7_0= ruleNavigatingArgExpCS ) ) ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) ) '=' ( (lv_init_11_0= ruleExpCS ) ) ) )", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3264:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3264:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3264:3: ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3264:3: ( (lv_prefix_0_0= '|' ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3265:1: (lv_prefix_0_0= '|' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3265:1: (lv_prefix_0_0= '|' )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3266:3: lv_prefix_0_0= '|'
                    {
                    lv_prefix_0_0=(Token)input.LT(1);
                    match(input,67,FollowSets000.FOLLOW_67_in_ruleNavigatingArgCSnext6842); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNavigatingArgCSnextAccess().getPrefixVerticalLineKeyword_0_0_0(), "prefix"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNavigatingArgCSnextRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "prefix", lv_prefix_0_0, "|", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3285:2: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3286:1: (lv_name_1_0= ruleNavigatingArgExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3286:1: (lv_name_1_0= ruleNavigatingArgExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3287:3: lv_name_1_0= ruleNavigatingArgExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNavigatingArgCSnextAccess().getNameNavigatingArgExpCSParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCSnext6876);
                    lv_name_1_0=ruleNavigatingArgExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNavigatingArgCSnextRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_1_0, 
                      	        		"NavigatingArgExpCS", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3310:6: ( ( (lv_prefix_2_0= ',' ) ) ( (lv_name_3_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) )? )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3310:6: ( ( (lv_prefix_2_0= ',' ) ) ( (lv_name_3_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) )? )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3310:7: ( (lv_prefix_2_0= ',' ) ) ( (lv_name_3_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) )?
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3310:7: ( (lv_prefix_2_0= ',' ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3311:1: (lv_prefix_2_0= ',' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3311:1: (lv_prefix_2_0= ',' )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3312:3: lv_prefix_2_0= ','
                    {
                    lv_prefix_2_0=(Token)input.LT(1);
                    match(input,56,FollowSets000.FOLLOW_56_in_ruleNavigatingArgCSnext6902); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNavigatingArgCSnextAccess().getPrefixCommaKeyword_1_0_0(), "prefix"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNavigatingArgCSnextRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "prefix", lv_prefix_2_0, ",", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3331:2: ( (lv_name_3_0= ruleNavigatingArgExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3332:1: (lv_name_3_0= ruleNavigatingArgExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3332:1: (lv_name_3_0= ruleNavigatingArgExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3333:3: lv_name_3_0= ruleNavigatingArgExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNavigatingArgCSnextAccess().getNameNavigatingArgExpCSParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCSnext6936);
                    lv_name_3_0=ruleNavigatingArgExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNavigatingArgCSnextRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_3_0, 
                      	        		"NavigatingArgExpCS", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3355:2: ( ':' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==19) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3355:4: ':' ( (lv_ownedType_5_0= ruleTypeExpCS ) )
                            {
                            match(input,19,FollowSets000.FOLLOW_19_in_ruleNavigatingArgCSnext6947); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getNavigatingArgCSnextAccess().getColonKeyword_1_2_0(), null); 
                                  
                            }
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3359:1: ( (lv_ownedType_5_0= ruleTypeExpCS ) )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3360:1: (lv_ownedType_5_0= ruleTypeExpCS )
                            {
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3360:1: (lv_ownedType_5_0= ruleTypeExpCS )
                            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3361:3: lv_ownedType_5_0= ruleTypeExpCS
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getNavigatingArgCSnextAccess().getOwnedTypeTypeExpCSParserRuleCall_1_2_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCSnext6968);
                            lv_ownedType_5_0=ruleTypeExpCS();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getNavigatingArgCSnextRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"ownedType",
                              	        		lv_ownedType_5_0, 
                              	        		"TypeExpCS", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3384:6: ( ( (lv_prefix_6_0= ';' ) ) ( (lv_name_7_0= ruleNavigatingArgExpCS ) ) ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) ) '=' ( (lv_init_11_0= ruleExpCS ) ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3384:6: ( ( (lv_prefix_6_0= ';' ) ) ( (lv_name_7_0= ruleNavigatingArgExpCS ) ) ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) ) '=' ( (lv_init_11_0= ruleExpCS ) ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3384:7: ( (lv_prefix_6_0= ';' ) ) ( (lv_name_7_0= ruleNavigatingArgExpCS ) ) ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) ) '=' ( (lv_init_11_0= ruleExpCS ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3384:7: ( (lv_prefix_6_0= ';' ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3385:1: (lv_prefix_6_0= ';' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3385:1: (lv_prefix_6_0= ';' )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3386:3: lv_prefix_6_0= ';'
                    {
                    lv_prefix_6_0=(Token)input.LT(1);
                    match(input,20,FollowSets000.FOLLOW_20_in_ruleNavigatingArgCSnext6996); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNavigatingArgCSnextAccess().getPrefixSemicolonKeyword_2_0_0(), "prefix"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNavigatingArgCSnextRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "prefix", lv_prefix_6_0, ";", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3405:2: ( (lv_name_7_0= ruleNavigatingArgExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3406:1: (lv_name_7_0= ruleNavigatingArgExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3406:1: (lv_name_7_0= ruleNavigatingArgExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3407:3: lv_name_7_0= ruleNavigatingArgExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNavigatingArgCSnextAccess().getNameNavigatingArgExpCSParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCSnext7030);
                    lv_name_7_0=ruleNavigatingArgExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNavigatingArgCSnextRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_7_0, 
                      	        		"NavigatingArgExpCS", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,19,FollowSets000.FOLLOW_19_in_ruleNavigatingArgCSnext7040); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNavigatingArgCSnextAccess().getColonKeyword_2_2(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3433:1: ( (lv_ownedType_9_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3434:1: (lv_ownedType_9_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3434:1: (lv_ownedType_9_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3435:3: lv_ownedType_9_0= ruleTypeExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNavigatingArgCSnextAccess().getOwnedTypeTypeExpCSParserRuleCall_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCSnext7061);
                    lv_ownedType_9_0=ruleTypeExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNavigatingArgCSnextRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"ownedType",
                      	        		lv_ownedType_9_0, 
                      	        		"TypeExpCS", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,33,FollowSets000.FOLLOW_33_in_ruleNavigatingArgCSnext7071); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNavigatingArgCSnextAccess().getEqualsSignKeyword_2_4(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3461:1: ( (lv_init_11_0= ruleExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3462:1: (lv_init_11_0= ruleExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3462:1: (lv_init_11_0= ruleExpCS )
                    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3463:3: lv_init_11_0= ruleExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNavigatingArgCSnextAccess().getInitExpCSParserRuleCall_2_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgCSnext7092);
                    lv_init_11_0=ruleExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNavigatingArgCSnextRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"init",
                      	        		lv_init_11_0, 
                      	        		"ExpCS", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNavigatingArgCSnext


    // $ANTLR start entryRuleNavigatingArgExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3493:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3494:2: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3495:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNavigatingArgExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_entryRuleNavigatingArgExpCS7129);
            iv_ruleNavigatingArgExpCS=ruleNavigatingArgExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNavigatingArgExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgExpCS7139); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNavigatingArgExpCS


    // $ANTLR start ruleNavigatingArgExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3502:1: ruleNavigatingArgExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3507:6: (this_ExpCS_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3509:2: this_ExpCS_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getNavigatingArgExpCSAccess().getExpCSParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgExpCS7188);
            this_ExpCS_0=ruleExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_ExpCS_0; 
                      currentNode = currentNode.getParent();
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNavigatingArgExpCS


    // $ANTLR start entryRuleIfExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3528:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3529:2: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3530:2: iv_ruleIfExpCS= ruleIfExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIfExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIfExpCS_in_entryRuleIfExpCS7222);
            iv_ruleIfExpCS=ruleIfExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfExpCS7232); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIfExpCS


    // $ANTLR start ruleIfExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3537:1: ruleIfExpCS returns [EObject current=null] : ( 'if' ( (lv_condition_1_0= ruleExpCS ) ) 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) 'endif' ) ;
    public final EObject ruleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_condition_1_0 = null;

        EObject lv_thenExpression_3_0 = null;

        EObject lv_elseExpression_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3542:6: ( ( 'if' ( (lv_condition_1_0= ruleExpCS ) ) 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) 'endif' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3543:1: ( 'if' ( (lv_condition_1_0= ruleExpCS ) ) 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) 'endif' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3543:1: ( 'if' ( (lv_condition_1_0= ruleExpCS ) ) 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) 'endif' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3543:3: 'if' ( (lv_condition_1_0= ruleExpCS ) ) 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) 'endif'
            {
            match(input,68,FollowSets000.FOLLOW_68_in_ruleIfExpCS7267); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIfExpCSAccess().getIfKeyword_0(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3547:1: ( (lv_condition_1_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3548:1: (lv_condition_1_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3548:1: (lv_condition_1_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3549:3: lv_condition_1_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getIfExpCSAccess().getConditionExpCSParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS7288);
            lv_condition_1_0=ruleExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIfExpCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"condition",
              	        		lv_condition_1_0, 
              	        		"ExpCS", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,69,FollowSets000.FOLLOW_69_in_ruleIfExpCS7298); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIfExpCSAccess().getThenKeyword_2(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3575:1: ( (lv_thenExpression_3_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3576:1: (lv_thenExpression_3_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3576:1: (lv_thenExpression_3_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3577:3: lv_thenExpression_3_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getIfExpCSAccess().getThenExpressionExpCSParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS7319);
            lv_thenExpression_3_0=ruleExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIfExpCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"thenExpression",
              	        		lv_thenExpression_3_0, 
              	        		"ExpCS", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,70,FollowSets000.FOLLOW_70_in_ruleIfExpCS7329); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIfExpCSAccess().getElseKeyword_4(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3603:1: ( (lv_elseExpression_5_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3604:1: (lv_elseExpression_5_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3604:1: (lv_elseExpression_5_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3605:3: lv_elseExpression_5_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getIfExpCSAccess().getElseExpressionExpCSParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS7350);
            lv_elseExpression_5_0=ruleExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIfExpCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"elseExpression",
              	        		lv_elseExpression_5_0, 
              	        		"ExpCS", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,71,FollowSets000.FOLLOW_71_in_ruleIfExpCS7360); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIfExpCSAccess().getEndifKeyword_6(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIfExpCS


    // $ANTLR start entryRuleLetExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3639:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3640:2: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3641:2: iv_ruleLetExpCS= ruleLetExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLetExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_entryRuleLetExpCS7396);
            iv_ruleLetExpCS=ruleLetExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetExpCS7406); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLetExpCS


    // $ANTLR start ruleLetExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3648:1: ruleLetExpCS returns [EObject current=null] : ( 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) ( ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* 'in' ( (lv_in_5_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_variable_1_0 = null;

        EObject lv_variable_3_0 = null;

        EObject lv_in_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3653:6: ( ( 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) ( ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* 'in' ( (lv_in_5_0= ruleExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3654:1: ( 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) ( ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3654:1: ( 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) ( ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3654:3: 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) ( ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* 'in' ( (lv_in_5_0= ruleExpCS ) )
            {
            match(input,72,FollowSets000.FOLLOW_72_in_ruleLetExpCS7441); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLetExpCSAccess().getLetKeyword_0(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3658:1: ( (lv_variable_1_0= ruleLetVariableCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3659:1: (lv_variable_1_0= ruleLetVariableCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3659:1: (lv_variable_1_0= ruleLetVariableCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3660:3: lv_variable_1_0= ruleLetVariableCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_ruleLetExpCS7462);
            lv_variable_1_0=ruleLetVariableCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLetExpCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"variable",
              	        		lv_variable_1_0, 
              	        		"LetVariableCS", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3682:2: ( ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==56) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3682:4: ',' ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    {
            	    match(input,56,FollowSets000.FOLLOW_56_in_ruleLetExpCS7473); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0(), null); 
            	          
            	    }
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3686:1: ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3687:1: (lv_variable_3_0= ruleLetVariableCS )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3687:1: (lv_variable_3_0= ruleLetVariableCS )
            	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3688:3: lv_variable_3_0= ruleLetVariableCS
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_ruleLetExpCS7494);
            	    lv_variable_3_0=ruleLetVariableCS();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getLetExpCSRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"variable",
            	      	        		lv_variable_3_0, 
            	      	        		"LetVariableCS", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            match(input,73,FollowSets000.FOLLOW_73_in_ruleLetExpCS7506); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLetExpCSAccess().getInKeyword_3(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3714:1: ( (lv_in_5_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3715:1: (lv_in_5_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3715:1: (lv_in_5_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3716:3: lv_in_5_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetExpCSAccess().getInExpCSParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLetExpCS7527);
            lv_in_5_0=ruleExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLetExpCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"in",
              	        		lv_in_5_0, 
              	        		"ExpCS", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLetExpCS


    // $ANTLR start entryRuleLetVariableCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3746:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3747:2: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3748:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLetVariableCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_entryRuleLetVariableCS7563);
            iv_ruleLetVariableCS=ruleLetVariableCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLetVariableCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetVariableCS7573); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLetVariableCS


    // $ANTLR start ruleLetVariableCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3755:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetVariableCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3760:6: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3761:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3761:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3761:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3761:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3762:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3762:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3763:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleLetVariableCS7619);
            lv_name_0_0=ruleUnrestrictedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLetVariableCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"UnrestrictedName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleLetVariableCS7629); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLetVariableCSAccess().getColonKeyword_1(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3789:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3790:1: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3790:1: (lv_ownedType_2_0= ruleTypeExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3791:3: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleLetVariableCS7650);
            lv_ownedType_2_0=ruleTypeExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLetVariableCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"ownedType",
              	        		lv_ownedType_2_0, 
              	        		"TypeExpCS", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,33,FollowSets000.FOLLOW_33_in_ruleLetVariableCS7660); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_3(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3817:1: ( (lv_initExpression_4_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3818:1: (lv_initExpression_4_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3818:1: (lv_initExpression_4_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3819:3: lv_initExpression_4_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetVariableCSAccess().getInitExpressionExpCSParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLetVariableCS7681);
            lv_initExpression_4_0=ruleExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLetVariableCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"initExpression",
              	        		lv_initExpression_4_0, 
              	        		"ExpCS", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLetVariableCS


    // $ANTLR start entryRuleNestedExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3849:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3850:2: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3851:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNestedExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNestedExpCS_in_entryRuleNestedExpCS7717);
            iv_ruleNestedExpCS=ruleNestedExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNestedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNestedExpCS7727); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNestedExpCS


    // $ANTLR start ruleNestedExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3858:1: ruleNestedExpCS returns [EObject current=null] : ( '(' ( (lv_source_1_0= ruleExpCS ) ) ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_source_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3863:6: ( ( '(' ( (lv_source_1_0= ruleExpCS ) ) ')' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3864:1: ( '(' ( (lv_source_1_0= ruleExpCS ) ) ')' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3864:1: ( '(' ( (lv_source_1_0= ruleExpCS ) ) ')' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3864:3: '(' ( (lv_source_1_0= ruleExpCS ) ) ')'
            {
            match(input,53,FollowSets000.FOLLOW_53_in_ruleNestedExpCS7762); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3868:1: ( (lv_source_1_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3869:1: (lv_source_1_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3869:1: (lv_source_1_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3870:3: lv_source_1_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNestedExpCSAccess().getSourceExpCSParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNestedExpCS7783);
            lv_source_1_0=ruleExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNestedExpCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"source",
              	        		lv_source_1_0, 
              	        		"ExpCS", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,54,FollowSets000.FOLLOW_54_in_ruleNestedExpCS7793); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNestedExpCSAccess().getRightParenthesisKeyword_2(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNestedExpCS


    // $ANTLR start entryRuleSelfExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3904:1: entryRuleSelfExpCS returns [EObject current=null] : iv_ruleSelfExpCS= ruleSelfExpCS EOF ;
    public final EObject entryRuleSelfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3905:2: (iv_ruleSelfExpCS= ruleSelfExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3906:2: iv_ruleSelfExpCS= ruleSelfExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSelfExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSelfExpCS_in_entryRuleSelfExpCS7829);
            iv_ruleSelfExpCS=ruleSelfExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSelfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelfExpCS7839); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSelfExpCS


    // $ANTLR start ruleSelfExpCS
    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3913:1: ruleSelfExpCS returns [EObject current=null] : ( () 'self' ) ;
    public final EObject ruleSelfExpCS() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3918:6: ( ( () 'self' ) )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3919:1: ( () 'self' )
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3919:1: ( () 'self' )
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3919:2: () 'self'
            {
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3919:2: ()
            // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:3920:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getSelfExpCSAccess().getSelfExpCSAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getSelfExpCSAccess().getSelfExpCSAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,74,FollowSets000.FOLLOW_74_in_ruleSelfExpCS7886); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSelfExpCSAccess().getSelfKeyword_1(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSelfExpCS

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:275:2: ( '.' RULE_INT )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:275:2: '.' RULE_INT
        {
        match(input,21,FollowSets000.FOLLOW_21_in_synpred6445); if (failed) return ;
        match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_synpred6460); if (failed) return ;

        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred67
    public final void synpred67_fragment() throws RecognitionException {   
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2360:3: ( ( ( ruleBinaryOperatorCS ) ) ( ( rulePrefixedExpCS ) ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2360:3: ( ( ruleBinaryOperatorCS ) ) ( ( rulePrefixedExpCS ) )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2360:3: ( ( ruleBinaryOperatorCS ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2361:1: ( ruleBinaryOperatorCS )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2361:1: ( ruleBinaryOperatorCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2362:3: ruleBinaryOperatorCS
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_1_1_0_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_synpred675184);
        ruleBinaryOperatorCS();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2384:2: ( ( rulePrefixedExpCS ) )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2385:1: ( rulePrefixedExpCS )
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2385:1: ( rulePrefixedExpCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2386:3: rulePrefixedExpCS
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_1_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_synpred675205);
        rulePrefixedExpCS();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred67

    // $ANTLR start synpred68
    public final void synpred68_fragment() throws RecognitionException {   
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2341:2: ( () ( ( ( ruleBinaryOperatorCS ) ) ( ( rulePrefixedExpCS ) ) )+ )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2341:2: () ( ( ( ruleBinaryOperatorCS ) ) ( ( rulePrefixedExpCS ) ) )+
        {
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2341:2: ()
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2342:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2360:2: ( ( ( ruleBinaryOperatorCS ) ) ( ( rulePrefixedExpCS ) ) )+
        int cnt51=0;
        loop51:
        do {
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==21||(LA51_0>=24 && LA51_0<=25)||(LA51_0>=27 && LA51_0<=39)) ) {
                alt51=1;
            }


            switch (alt51) {
        	case 1 :
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2360:3: ( ( ruleBinaryOperatorCS ) ) ( ( rulePrefixedExpCS ) )
        	    {
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2360:3: ( ( ruleBinaryOperatorCS ) )
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2361:1: ( ruleBinaryOperatorCS )
        	    {
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2361:1: ( ruleBinaryOperatorCS )
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2362:3: ruleBinaryOperatorCS
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_1_1_0_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_synpred685184);
        	    ruleBinaryOperatorCS();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }

        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2384:2: ( ( rulePrefixedExpCS ) )
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2385:1: ( rulePrefixedExpCS )
        	    {
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2385:1: ( rulePrefixedExpCS )
        	    // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2386:3: rulePrefixedExpCS
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_1_1_1_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_synpred685205);
        	    rulePrefixedExpCS();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt51 >= 1 ) break loop51;
        	    if (backtracking>0) {failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(51, input);
                    throw eee;
            }
            cnt51++;
        } while (true);


        }
    }
    // $ANTLR end synpred68

    // $ANTLR start synpred74
    public final void synpred74_fragment() throws RecognitionException {   
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2663:2: ( ruleTupleLiteralExpCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2663:2: ruleTupleLiteralExpCS
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_synpred745733);
        ruleTupleLiteralExpCS();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred74

    // $ANTLR start synpred75
    public final void synpred75_fragment() throws RecognitionException {   
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2676:2: ( ruleCollectionLiteralExpCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2676:2: ruleCollectionLiteralExpCS
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_synpred755763);
        ruleCollectionLiteralExpCS();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred75

    // $ANTLR start synpred76
    public final void synpred76_fragment() throws RecognitionException {   
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2689:2: ( ruleTypeLiteralExpCS )
        // ../org.eclipse.ocl.examples.xtext.essentialocl/src-gen/org/eclipse/ocl/examples/xtext/essentialocl/parser/antlr/internal/InternalEssentialOCL.g:2689:2: ruleTypeLiteralExpCS
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_synpred765793);
        ruleTypeLiteralExpCS();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred76

    public final boolean synpred74() {
        backtracking++;
        int start = input.mark();
        try {
            synpred74_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred67() {
        backtracking++;
        int start = input.mark();
        try {
            synpred67_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred76() {
        backtracking++;
        int start = input.mark();
        try {
            synpred76_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred6() {
        backtracking++;
        int start = input.mark();
        try {
            synpred6_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred68() {
        backtracking++;
        int start = input.mark();
        try {
            synpred68_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred75() {
        backtracking++;
        int start = input.mark();
        try {
            synpred75_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleModel136 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_14_in_ruleModel165 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_15_in_ruleModel194 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_16_in_ruleModel223 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_17_in_ruleModel252 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_18_in_ruleModel281 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleModel307 = new BitSet(new long[]{0xF0BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleModel328 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleModel338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL375 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER_LITERAL386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL426 = new BitSet(new long[]{0x0000000000E00002L});
        public static final BitSet FOLLOW_21_in_ruleNUMBER_LITERAL445 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL460 = new BitSet(new long[]{0x0000000000C00002L});
        public static final BitSet FOLLOW_22_in_ruleNUMBER_LITERAL482 = new BitSet(new long[]{0x0000000003000010L});
        public static final BitSet FOLLOW_23_in_ruleNUMBER_LITERAL501 = new BitSet(new long[]{0x0000000003000010L});
        public static final BitSet FOLLOW_24_in_ruleNUMBER_LITERAL516 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_25_in_ruleNUMBER_LITERAL535 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLPrefixOperator_in_entryRuleEssentialOCLPrefixOperator602 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLPrefixOperator613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEssentialOCLPrefixOperator651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleEssentialOCLPrefixOperator670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLInfixOperator_in_entryRuleEssentialOCLInfixOperator711 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLInfixOperator722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleEssentialOCLInfixOperator760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleEssentialOCLInfixOperator779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleEssentialOCLInfixOperator798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEssentialOCLInfixOperator817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleEssentialOCLInfixOperator836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleEssentialOCLInfixOperator855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleEssentialOCLInfixOperator874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleEssentialOCLInfixOperator893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleEssentialOCLInfixOperator912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEssentialOCLInfixOperator931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleEssentialOCLInfixOperator950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleEssentialOCLInfixOperator969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleEssentialOCLInfixOperator988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleEssentialOCLInfixOperator1007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleEssentialOCLInfixOperator1026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleEssentialOCLInfixOperator1045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier1086 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier1097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIdentifier1137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleIdentifier1161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleIdentifier1180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleIdentifier1199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleIdentifier1218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleIdentifier1237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleIdentifier1256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleIdentifier1275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleIdentifier1294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1335 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleStringLiteral1385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixOperator_in_entryRulePrefixOperator1430 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrefixOperator1441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLPrefixOperator_in_rulePrefixOperator1487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperator_in_entryRuleInfixOperator1532 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfixOperator1543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLInfixOperator_in_ruleInfixOperator1589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_entryRuleEssentialOCLUnrestrictedName1634 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedName1645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleEssentialOCLUnrestrictedName1691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_entryRuleUnrestrictedName1736 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnrestrictedName1747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_ruleUnrestrictedName1793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnreservedName_in_entryRuleEssentialOCLUnreservedName1838 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnreservedName1849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleEssentialOCLUnreservedName1895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_entryRuleUnreservedName1940 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnreservedName1951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnreservedName_in_ruleUnreservedName1997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_entryRulePrimitiveTypeIdentifier2042 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeIdentifier2053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rulePrimitiveTypeIdentifier2091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rulePrimitiveTypeIdentifier2110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rulePrimitiveTypeIdentifier2129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rulePrimitiveTypeIdentifier2148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rulePrimitiveTypeIdentifier2167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rulePrimitiveTypeIdentifier2186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rulePrimitiveTypeIdentifier2205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rulePrimitiveTypeIdentifier2224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeCS_in_entryRulePrimitiveTypeCS2264 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeCS2274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_rulePrimitiveTypeCS2319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_entryRuleCollectionTypeIdentifier2355 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionTypeIdentifier2366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleCollectionTypeIdentifier2404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleCollectionTypeIdentifier2423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleCollectionTypeIdentifier2442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleCollectionTypeIdentifier2461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleCollectionTypeIdentifier2480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_entryRuleCollectionTypeCS2520 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionTypeCS2530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_ruleCollectionTypeCS2576 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_53_in_ruleCollectionTypeCS2587 = new BitSet(new long[]{0x009FFF0000C7E020L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS2608 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleCollectionTypeCS2618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeCS_in_entryRuleTupleTypeCS2656 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleTypeCS2666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleTupleTypeCS2709 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTupleTypeCS2733 = new BitSet(new long[]{0x0040000000C7E020L});
        public static final BitSet FOLLOW_ruletuplePartCS_in_ruleTupleTypeCS2755 = new BitSet(new long[]{0x0140000000000000L});
        public static final BitSet FOLLOW_56_in_ruleTupleTypeCS2766 = new BitSet(new long[]{0x0000000000C7E020L});
        public static final BitSet FOLLOW_ruletuplePartCS_in_ruleTupleTypeCS2787 = new BitSet(new long[]{0x0140000000000000L});
        public static final BitSet FOLLOW_54_in_ruleTupleTypeCS2801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletuplePartCS_in_entryRuletuplePartCS2839 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuletuplePartCS2849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruletuplePartCS2895 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruletuplePartCS2905 = new BitSet(new long[]{0x009FFF0000C7E020L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruletuplePartCS2926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_entryRuleCollectionLiteralExpCS2962 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteralExpCS2972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleCollectionLiteralExpCS3018 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_ruleCollectionLiteralExpCS3028 = new BitSet(new long[]{0xF4BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS3050 = new BitSet(new long[]{0x0500000000000000L});
        public static final BitSet FOLLOW_56_in_ruleCollectionLiteralExpCS3061 = new BitSet(new long[]{0xF0BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS3082 = new BitSet(new long[]{0x0500000000000000L});
        public static final BitSet FOLLOW_58_in_ruleCollectionLiteralExpCS3096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_entryRuleCollectionLiteralPartCS3132 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteralPartCS3142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS3188 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_59_in_ruleCollectionLiteralPartCS3199 = new BitSet(new long[]{0xF0BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS3220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_entryRulePrimitiveLiteralExpCS3258 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveLiteralExpCS3268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpCS_in_rulePrimitiveLiteralExpCS3318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteralExpCS_in_rulePrimitiveLiteralExpCS3348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpCS_in_rulePrimitiveLiteralExpCS3378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_rulePrimitiveLiteralExpCS3408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvalidLiteralExpCS_in_rulePrimitiveLiteralExpCS3438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullLiteralExpCS_in_rulePrimitiveLiteralExpCS3468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_entryRuleTupleLiteralExpCS3503 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralExpCS3513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleTupleLiteralExpCS3548 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_ruleTupleLiteralExpCS3558 = new BitSet(new long[]{0x0000000000C7E020L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS3579 = new BitSet(new long[]{0x0500000000000000L});
        public static final BitSet FOLLOW_56_in_ruleTupleLiteralExpCS3590 = new BitSet(new long[]{0x0000000000C7E020L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS3611 = new BitSet(new long[]{0x0500000000000000L});
        public static final BitSet FOLLOW_58_in_ruleTupleLiteralExpCS3623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_entryRuleTupleLiteralPartCS3659 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralPartCS3669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTupleLiteralPartCS3715 = new BitSet(new long[]{0x0000000200080000L});
        public static final BitSet FOLLOW_19_in_ruleTupleLiteralPartCS3726 = new BitSet(new long[]{0x009FFF0000C7E020L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleTupleLiteralPartCS3747 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleTupleLiteralPartCS3759 = new BitSet(new long[]{0xF0BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleTupleLiteralPartCS3780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpCS_in_entryRuleNumberLiteralExpCS3816 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteralExpCS3826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_ruleNumberLiteralExpCS3871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteralExpCS_in_entryRuleStringLiteralExpCS3906 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteralExpCS3916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleStringLiteralExpCS3961 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpCS_in_entryRuleBooleanLiteralExpCS3997 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteralExpCS4007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleBooleanLiteralExpCS4050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleBooleanLiteralExpCS4087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_entryRuleUnlimitedNaturalLiteralExpCS4136 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedNaturalLiteralExpCS4146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleUnlimitedNaturalLiteralExpCS4193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvalidLiteralExpCS_in_entryRuleInvalidLiteralExpCS4229 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvalidLiteralExpCS4239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleInvalidLiteralExpCS4286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullLiteralExpCS_in_entryRuleNullLiteralExpCS4322 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteralExpCS4332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleNullLiteralExpCS4379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_entryRuleTypeLiteralCS4415 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralCS4425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeCS_in_ruleTypeLiteralCS4475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleTypeLiteralCS4505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeCS_in_ruleTypeLiteralCS4535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_entryRuleTypeLiteralExpCS4570 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralExpCS4580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_ruleTypeLiteralExpCS4625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeNameExpCS_in_entryRuleTypeNameExpCS4660 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeNameExpCS4670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTypeNameExpCS4724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_64_in_ruleTypeNameExpCS4734 = new BitSet(new long[]{0x0000000000C7E020L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_ruleTypeNameExpCS4762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_64_in_ruleTypeNameExpCS4772 = new BitSet(new long[]{0x0000000000C7E020L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_ruleTypeNameExpCS4802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTypeNameExpCS4836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_entryRuleTypeExpCS4872 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeExpCS4882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeNameExpCS_in_ruleTypeExpCS4932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_ruleTypeExpCS4962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_entryRuleExpCS4997 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpCS5007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixedExpCS_in_ruleExpCS5056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixedExpCS_in_entryRuleInfixedExpCS5090 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfixedExpCS5100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_ruleInfixedExpCS5150 = new BitSet(new long[]{0x000000FFFB200002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_ruleInfixedExpCS5184 = new BitSet(new long[]{0xF0BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_ruleInfixedExpCS5205 = new BitSet(new long[]{0x000000FFFB200002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_entryRuleBinaryOperatorCS5245 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperatorCS5255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperator_in_ruleBinaryOperatorCS5300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_entryRulePrefixedExpCS5335 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrefixedExpCS5345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS5395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorCS_in_rulePrefixedExpCS5434 = new BitSet(new long[]{0xF0BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS5456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorCS_in_entryRuleUnaryOperatorCS5493 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperatorCS5503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixOperator_in_ruleUnaryOperatorCS5548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_entryRulePrimaryExpCS5583 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpCS5593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingExpCS_in_rulePrimaryExpCS5643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelfExpCS_in_rulePrimaryExpCS5673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_rulePrimaryExpCS5703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_rulePrimaryExpCS5733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_rulePrimaryExpCS5763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_rulePrimaryExpCS5793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_rulePrimaryExpCS5823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpCS_in_rulePrimaryExpCS5853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpCS_in_rulePrimaryExpCS5883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNameExpCS_in_entryRuleNameExpCS5918 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNameExpCS5928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleNameExpCS5982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_64_in_ruleNameExpCS5992 = new BitSet(new long[]{0x0000000000C7E020L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_ruleNameExpCS6020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_64_in_ruleNameExpCS6030 = new BitSet(new long[]{0x0000000000C7E020L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_ruleNameExpCS6060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleNameExpCS6094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIndexExpCS_in_entryRuleIndexExpCS6130 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIndexExpCS6140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNameExpCS_in_ruleIndexExpCS6190 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleIndexExpCS6212 = new BitSet(new long[]{0xF0BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIndexExpCS6233 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_56_in_ruleIndexExpCS6244 = new BitSet(new long[]{0xF0BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIndexExpCS6265 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_66_in_ruleIndexExpCS6277 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleIndexExpCS6288 = new BitSet(new long[]{0xF0BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIndexExpCS6309 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_56_in_ruleIndexExpCS6320 = new BitSet(new long[]{0xF0BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIndexExpCS6341 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_66_in_ruleIndexExpCS6353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingExpCS_Base_in_entryRuleNavigatingExpCS_Base6393 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingExpCS_Base6403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIndexExpCS_in_ruleNavigatingExpCS_Base6452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingExpCS_in_entryRuleNavigatingExpCS6486 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingExpCS6496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingExpCS_Base_in_ruleNavigatingExpCS6546 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_53_in_ruleNavigatingExpCS6568 = new BitSet(new long[]{0xF0FFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_ruleNavigatingArgCSfirst_in_ruleNavigatingExpCS6590 = new BitSet(new long[]{0x0140000000100000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleNavigatingArgCSnext_in_ruleNavigatingExpCS6611 = new BitSet(new long[]{0x0140000000100000L,0x0000000000000008L});
        public static final BitSet FOLLOW_54_in_ruleNavigatingExpCS6624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgCSfirst_in_entryRuleNavigatingArgCSfirst6662 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgCSfirst6672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCSfirst6718 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleNavigatingArgCSfirst6729 = new BitSet(new long[]{0x009FFF0000C7E020L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCSfirst6750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgCSnext_in_entryRuleNavigatingArgCSnext6788 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgCSnext6798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleNavigatingArgCSnext6842 = new BitSet(new long[]{0xF0BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCSnext6876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleNavigatingArgCSnext6902 = new BitSet(new long[]{0xF0BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCSnext6936 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleNavigatingArgCSnext6947 = new BitSet(new long[]{0x009FFF0000C7E020L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCSnext6968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleNavigatingArgCSnext6996 = new BitSet(new long[]{0xF0BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCSnext7030 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleNavigatingArgCSnext7040 = new BitSet(new long[]{0x009FFF0000C7E020L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCSnext7061 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleNavigatingArgCSnext7071 = new BitSet(new long[]{0xF0BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgCSnext7092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_entryRuleNavigatingArgExpCS7129 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgExpCS7139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgExpCS7188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpCS_in_entryRuleIfExpCS7222 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfExpCS7232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleIfExpCS7267 = new BitSet(new long[]{0xF0BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS7288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleIfExpCS7298 = new BitSet(new long[]{0xF0BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS7319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_70_in_ruleIfExpCS7329 = new BitSet(new long[]{0xF0BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS7350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_71_in_ruleIfExpCS7360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_entryRuleLetExpCS7396 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetExpCS7406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleLetExpCS7441 = new BitSet(new long[]{0x0000000000C7E020L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_ruleLetExpCS7462 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_56_in_ruleLetExpCS7473 = new BitSet(new long[]{0x0000000000C7E020L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_ruleLetExpCS7494 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_73_in_ruleLetExpCS7506 = new BitSet(new long[]{0xF0BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLetExpCS7527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_entryRuleLetVariableCS7563 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetVariableCS7573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleLetVariableCS7619 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleLetVariableCS7629 = new BitSet(new long[]{0x009FFF0000C7E020L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleLetVariableCS7650 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleLetVariableCS7660 = new BitSet(new long[]{0xF0BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLetVariableCS7681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpCS_in_entryRuleNestedExpCS7717 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNestedExpCS7727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleNestedExpCS7762 = new BitSet(new long[]{0xF0BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNestedExpCS7783 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleNestedExpCS7793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelfExpCS_in_entryRuleSelfExpCS7829 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelfExpCS7839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleSelfExpCS7886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_synpred6445 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_synpred6460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_synpred675184 = new BitSet(new long[]{0xF0BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_synpred675205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_synpred685184 = new BitSet(new long[]{0xF0BFFF000EC7E070L,0x0000000000000510L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_synpred685205 = new BitSet(new long[]{0x000000FFFB200002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_synpred745733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_synpred755763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_synpred765793 = new BitSet(new long[]{0x0000000000000002L});
    }


}