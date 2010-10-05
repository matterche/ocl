package org.eclipse.ocl.examples.xtext.completeocl.parser.antlr.internal; 

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
import org.eclipse.ocl.examples.xtext.completeocl.services.CompleteOCLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCompleteOCLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SINGLE_QUOTED_STRING", "RULE_INT", "RULE_ID", "RULE_DOUBLE_QUOTED_STRING", "RULE_ML_SINGLE_QUOTED_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'^'", "'^^'", "'body'", "'context'", "'def'", "'derive'", "'import'", "'init'", "'inv'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclMessage'", "'OclState'", "'OclVoid'", "':'", "'static'", "'('", "','", "')'", "'='", "'package'", "'endpackage'", "'post'", "'pre'", "'::'", "'@'", "'?'", "'.'", "'e'", "'E'", "'+'", "'-'", "'not'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'<>'", "'and'", "'or'", "'xor'", "'implies'", "'->'", "'der'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "'Tuple'", "'{'", "'}'", "'..'", "'true'", "'false'", "'invalid'", "'null'", "'['", "']'", "'|'", "';'", "'if'", "'then'", "'else'", "'endif'", "'let'", "'in'", "'self'"
    };
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int EOF=-1;
    public static final int RULE_INT=5;
    public static final int RULE_SINGLE_QUOTED_STRING=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_ML_SINGLE_QUOTED_STRING=8;
    public static final int RULE_DOUBLE_QUOTED_STRING=7;
    public static final int RULE_SL_COMMENT=10;

        public InternalCompleteOCLParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[298+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private CompleteOCLGrammarAccess grammarAccess;
     	
        public InternalCompleteOCLParser(TokenStream input, IAstFactory factory, CompleteOCLGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CompleteOCLDocumentCS";	
       	}
       	
       	@Override
       	protected CompleteOCLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleCompleteOCLDocumentCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:83:1: entryRuleCompleteOCLDocumentCS returns [EObject current=null] : iv_ruleCompleteOCLDocumentCS= ruleCompleteOCLDocumentCS EOF ;
    public final EObject entryRuleCompleteOCLDocumentCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompleteOCLDocumentCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:84:2: (iv_ruleCompleteOCLDocumentCS= ruleCompleteOCLDocumentCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:85:2: iv_ruleCompleteOCLDocumentCS= ruleCompleteOCLDocumentCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompleteOCLDocumentCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompleteOCLDocumentCS_in_entryRuleCompleteOCLDocumentCS81);
            iv_ruleCompleteOCLDocumentCS=ruleCompleteOCLDocumentCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompleteOCLDocumentCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompleteOCLDocumentCS91); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCompleteOCLDocumentCS


    // $ANTLR start ruleCompleteOCLDocumentCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:92:1: ruleCompleteOCLDocumentCS returns [EObject current=null] : ( ( (lv_ownedImport_0_0= ruleImportCS ) )* ( ( (lv_packages_1_0= rulePackageDeclarationCS ) ) | ( (lv_contexts_2_0= ruleContextDeclCS ) ) )* ) ;
    public final EObject ruleCompleteOCLDocumentCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedImport_0_0 = null;

        EObject lv_packages_1_0 = null;

        EObject lv_contexts_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:97:6: ( ( ( (lv_ownedImport_0_0= ruleImportCS ) )* ( ( (lv_packages_1_0= rulePackageDeclarationCS ) ) | ( (lv_contexts_2_0= ruleContextDeclCS ) ) )* ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:98:1: ( ( (lv_ownedImport_0_0= ruleImportCS ) )* ( ( (lv_packages_1_0= rulePackageDeclarationCS ) ) | ( (lv_contexts_2_0= ruleContextDeclCS ) ) )* )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:98:1: ( ( (lv_ownedImport_0_0= ruleImportCS ) )* ( ( (lv_packages_1_0= rulePackageDeclarationCS ) ) | ( (lv_contexts_2_0= ruleContextDeclCS ) ) )* )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:98:2: ( (lv_ownedImport_0_0= ruleImportCS ) )* ( ( (lv_packages_1_0= rulePackageDeclarationCS ) ) | ( (lv_contexts_2_0= ruleContextDeclCS ) ) )*
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:98:2: ( (lv_ownedImport_0_0= ruleImportCS ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:99:1: (lv_ownedImport_0_0= ruleImportCS )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:99:1: (lv_ownedImport_0_0= ruleImportCS )
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:100:3: lv_ownedImport_0_0= ruleImportCS
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getCompleteOCLDocumentCSAccess().getOwnedImportImportCSParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleImportCS_in_ruleCompleteOCLDocumentCS137);
            	    lv_ownedImport_0_0=ruleImportCS();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getCompleteOCLDocumentCSRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"ownedImport",
            	      	        		lv_ownedImport_0_0, 
            	      	        		"ImportCS", 
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
            	    break loop1;
                }
            } while (true);

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:122:3: ( ( (lv_packages_1_0= rulePackageDeclarationCS ) ) | ( (lv_contexts_2_0= ruleContextDeclCS ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==38) ) {
                    alt2=1;
                }
                else if ( (LA2_0==16) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:122:4: ( (lv_packages_1_0= rulePackageDeclarationCS ) )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:122:4: ( (lv_packages_1_0= rulePackageDeclarationCS ) )
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:123:1: (lv_packages_1_0= rulePackageDeclarationCS )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:123:1: (lv_packages_1_0= rulePackageDeclarationCS )
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:124:3: lv_packages_1_0= rulePackageDeclarationCS
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getCompleteOCLDocumentCSAccess().getPackagesPackageDeclarationCSParserRuleCall_1_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePackageDeclarationCS_in_ruleCompleteOCLDocumentCS160);
            	    lv_packages_1_0=rulePackageDeclarationCS();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getCompleteOCLDocumentCSRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"packages",
            	      	        		lv_packages_1_0, 
            	      	        		"PackageDeclarationCS", 
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
            	case 2 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:147:6: ( (lv_contexts_2_0= ruleContextDeclCS ) )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:147:6: ( (lv_contexts_2_0= ruleContextDeclCS ) )
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:148:1: (lv_contexts_2_0= ruleContextDeclCS )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:148:1: (lv_contexts_2_0= ruleContextDeclCS )
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:149:3: lv_contexts_2_0= ruleContextDeclCS
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getCompleteOCLDocumentCSAccess().getContextsContextDeclCSParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleContextDeclCS_in_ruleCompleteOCLDocumentCS187);
            	    lv_contexts_2_0=ruleContextDeclCS();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getCompleteOCLDocumentCSRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"contexts",
            	      	        		lv_contexts_2_0, 
            	      	        		"ContextDeclCS", 
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
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end ruleCompleteOCLDocumentCS


    // $ANTLR start entryRuleNavigationOperator
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:179:1: entryRuleNavigationOperator returns [String current=null] : iv_ruleNavigationOperator= ruleNavigationOperator EOF ;
    public final String entryRuleNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperator = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:180:2: (iv_ruleNavigationOperator= ruleNavigationOperator EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:181:2: iv_ruleNavigationOperator= ruleNavigationOperator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNavigationOperatorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigationOperator_in_entryRuleNavigationOperator226);
            iv_ruleNavigationOperator=ruleNavigationOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNavigationOperator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigationOperator237); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNavigationOperator


    // $ANTLR start ruleNavigationOperator
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:188:1: ruleNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator | kw= '^' | kw= '^^' ) ;
    public final AntlrDatatypeRuleToken ruleNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EssentialOCLNavigationOperator_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:193:6: ( (this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator | kw= '^' | kw= '^^' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:194:1: (this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator | kw= '^' | kw= '^^' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:194:1: (this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator | kw= '^' | kw= '^^' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 45:
            case 62:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("194:1: (this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator | kw= '^' | kw= '^^' )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:195:5: this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNavigationOperatorAccess().getEssentialOCLNavigationOperatorParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLNavigationOperator_in_ruleNavigationOperator284);
                    this_EssentialOCLNavigationOperator_0=ruleEssentialOCLNavigationOperator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_EssentialOCLNavigationOperator_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:207:2: kw= '^'
                    {
                    kw=(Token)input.LT(1);
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleNavigationOperator308); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getNavigationOperatorAccess().getCircumflexAccentKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:214:2: kw= '^^'
                    {
                    kw=(Token)input.LT(1);
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleNavigationOperator327); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getNavigationOperatorAccess().getCircumflexAccentCircumflexAccentKeyword_2(), null); 
                          
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
    // $ANTLR end ruleNavigationOperator


    // $ANTLR start entryRuleUnrestrictedName
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:227:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:228:2: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:229:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnrestrictedNameRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_entryRuleUnrestrictedName368);
            iv_ruleUnrestrictedName=ruleUnrestrictedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnrestrictedName379); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:236:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName | kw= 'body' | kw= 'context' | kw= 'def' | kw= 'derive' | kw= 'import' | kw= 'init' | kw= 'inv' ) ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:241:6: ( (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName | kw= 'body' | kw= 'context' | kw= 'def' | kw= 'derive' | kw= 'import' | kw= 'init' | kw= 'inv' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:242:1: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName | kw= 'body' | kw= 'context' | kw= 'def' | kw= 'derive' | kw= 'import' | kw= 'init' | kw= 'inv' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:242:1: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName | kw= 'body' | kw= 'context' | kw= 'def' | kw= 'derive' | kw= 'import' | kw= 'init' | kw= 'inv' )
            int alt4=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 40:
            case 41:
            case 46:
            case 47:
            case 63:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                int LA4_2 = input.LA(2);

                if ( (synpred6()) ) {
                    alt4=1;
                }
                else if ( (synpred7()) ) {
                    alt4=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("242:1: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName | kw= 'body' | kw= 'context' | kw= 'def' | kw= 'derive' | kw= 'import' | kw= 'init' | kw= 'inv' )", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                int LA4_3 = input.LA(2);

                if ( (synpred6()) ) {
                    alt4=1;
                }
                else if ( (synpred12()) ) {
                    alt4=7;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("242:1: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName | kw= 'body' | kw= 'context' | kw= 'def' | kw= 'derive' | kw= 'import' | kw= 'init' | kw= 'inv' )", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                int LA4_4 = input.LA(2);

                if ( (synpred6()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=8;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("242:1: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName | kw= 'body' | kw= 'context' | kw= 'def' | kw= 'derive' | kw= 'import' | kw= 'init' | kw= 'inv' )", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                alt4=4;
                }
                break;
            case 18:
                {
                alt4=5;
                }
                break;
            case 19:
                {
                alt4=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("242:1: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName | kw= 'body' | kw= 'context' | kw= 'def' | kw= 'derive' | kw= 'import' | kw= 'init' | kw= 'inv' )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:243:5: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnrestrictedNameAccess().getEssentialOCLUnrestrictedNameParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_ruleUnrestrictedName426);
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
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:255:2: kw= 'body'
                    {
                    kw=(Token)input.LT(1);
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleUnrestrictedName450); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getUnrestrictedNameAccess().getBodyKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:262:2: kw= 'context'
                    {
                    kw=(Token)input.LT(1);
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleUnrestrictedName469); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getUnrestrictedNameAccess().getContextKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:269:2: kw= 'def'
                    {
                    kw=(Token)input.LT(1);
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleUnrestrictedName488); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getUnrestrictedNameAccess().getDefKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:276:2: kw= 'derive'
                    {
                    kw=(Token)input.LT(1);
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleUnrestrictedName507); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getUnrestrictedNameAccess().getDeriveKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:283:2: kw= 'import'
                    {
                    kw=(Token)input.LT(1);
                    match(input,19,FollowSets000.FOLLOW_19_in_ruleUnrestrictedName526); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getUnrestrictedNameAccess().getImportKeyword_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:290:2: kw= 'init'
                    {
                    kw=(Token)input.LT(1);
                    match(input,20,FollowSets000.FOLLOW_20_in_ruleUnrestrictedName545); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getUnrestrictedNameAccess().getInitKeyword_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:297:2: kw= 'inv'
                    {
                    kw=(Token)input.LT(1);
                    match(input,21,FollowSets000.FOLLOW_21_in_ruleUnrestrictedName564); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getUnrestrictedNameAccess().getInvKeyword_7(), null); 
                          
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
    // $ANTLR end ruleUnrestrictedName


    // $ANTLR start entryRulePrimitiveTypeIdentifier
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:310:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:311:2: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:312:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveTypeIdentifierRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_entryRulePrimitiveTypeIdentifier605);
            iv_rulePrimitiveTypeIdentifier=rulePrimitiveTypeIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveTypeIdentifier616); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:319:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclMessage' | kw= 'OclState' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:324:6: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclMessage' | kw= 'OclState' | kw= 'OclVoid' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:325:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclMessage' | kw= 'OclState' | kw= 'OclVoid' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:325:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclMessage' | kw= 'OclState' | kw= 'OclVoid' )
            int alt5=10;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 25:
                {
                alt5=4;
                }
                break;
            case 26:
                {
                alt5=5;
                }
                break;
            case 27:
                {
                alt5=6;
                }
                break;
            case 28:
                {
                alt5=7;
                }
                break;
            case 29:
                {
                alt5=8;
                }
                break;
            case 30:
                {
                alt5=9;
                }
                break;
            case 31:
                {
                alt5=10;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("325:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclMessage' | kw= 'OclState' | kw= 'OclVoid' )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:326:2: kw= 'Boolean'
                    {
                    kw=(Token)input.LT(1);
                    match(input,22,FollowSets000.FOLLOW_22_in_rulePrimitiveTypeIdentifier654); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:333:2: kw= 'Integer'
                    {
                    kw=(Token)input.LT(1);
                    match(input,23,FollowSets000.FOLLOW_23_in_rulePrimitiveTypeIdentifier673); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:340:2: kw= 'Real'
                    {
                    kw=(Token)input.LT(1);
                    match(input,24,FollowSets000.FOLLOW_24_in_rulePrimitiveTypeIdentifier692); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:347:2: kw= 'String'
                    {
                    kw=(Token)input.LT(1);
                    match(input,25,FollowSets000.FOLLOW_25_in_rulePrimitiveTypeIdentifier711); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:354:2: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)input.LT(1);
                    match(input,26,FollowSets000.FOLLOW_26_in_rulePrimitiveTypeIdentifier730); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:361:2: kw= 'OclAny'
                    {
                    kw=(Token)input.LT(1);
                    match(input,27,FollowSets000.FOLLOW_27_in_rulePrimitiveTypeIdentifier749); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:368:2: kw= 'OclInvalid'
                    {
                    kw=(Token)input.LT(1);
                    match(input,28,FollowSets000.FOLLOW_28_in_rulePrimitiveTypeIdentifier768); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:375:2: kw= 'OclMessage'
                    {
                    kw=(Token)input.LT(1);
                    match(input,29,FollowSets000.FOLLOW_29_in_rulePrimitiveTypeIdentifier787); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getPrimitiveTypeIdentifierAccess().getOclMessageKeyword_7(), null); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:382:2: kw= 'OclState'
                    {
                    kw=(Token)input.LT(1);
                    match(input,30,FollowSets000.FOLLOW_30_in_rulePrimitiveTypeIdentifier806); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getPrimitiveTypeIdentifierAccess().getOclStateKeyword_8(), null); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:389:2: kw= 'OclVoid'
                    {
                    kw=(Token)input.LT(1);
                    match(input,31,FollowSets000.FOLLOW_31_in_rulePrimitiveTypeIdentifier825); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getPrimitiveTypeIdentifierAccess().getOclVoidKeyword_9(), null); 
                          
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


    // $ANTLR start entryRuleBodyCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:402:1: entryRuleBodyCS returns [EObject current=null] : iv_ruleBodyCS= ruleBodyCS EOF ;
    public final EObject entryRuleBodyCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:403:2: (iv_ruleBodyCS= ruleBodyCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:404:2: iv_ruleBodyCS= ruleBodyCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBodyCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBodyCS_in_entryRuleBodyCS865);
            iv_ruleBodyCS=ruleBodyCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBodyCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBodyCS875); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBodyCS


    // $ANTLR start ruleBodyCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:411:1: ruleBodyCS returns [EObject current=null] : ( 'body' ( (lv_name_1_0= ruleUnrestrictedName ) )? ':' ( (lv_ownedExpression_3_0= ruleExpCS ) ) ) ;
    public final EObject ruleBodyCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedExpression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:416:6: ( ( 'body' ( (lv_name_1_0= ruleUnrestrictedName ) )? ':' ( (lv_ownedExpression_3_0= ruleExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:417:1: ( 'body' ( (lv_name_1_0= ruleUnrestrictedName ) )? ':' ( (lv_ownedExpression_3_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:417:1: ( 'body' ( (lv_name_1_0= ruleUnrestrictedName ) )? ':' ( (lv_ownedExpression_3_0= ruleExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:417:3: 'body' ( (lv_name_1_0= ruleUnrestrictedName ) )? ':' ( (lv_ownedExpression_3_0= ruleExpCS ) )
            {
            match(input,15,FollowSets000.FOLLOW_15_in_ruleBodyCS910); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBodyCSAccess().getBodyKeyword_0(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:421:1: ( (lv_name_1_0= ruleUnrestrictedName ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||(LA6_0>=15 && LA6_0<=21)||(LA6_0>=40 && LA6_0<=41)||(LA6_0>=46 && LA6_0<=47)||LA6_0==63) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:422:1: (lv_name_1_0= ruleUnrestrictedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:422:1: (lv_name_1_0= ruleUnrestrictedName )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:423:3: lv_name_1_0= ruleUnrestrictedName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBodyCSAccess().getNameUnrestrictedNameParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleBodyCS931);
                    lv_name_1_0=ruleUnrestrictedName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBodyCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_1_0, 
                      	        		"UnrestrictedName", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,32,FollowSets000.FOLLOW_32_in_ruleBodyCS942); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBodyCSAccess().getColonKeyword_2(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:449:1: ( (lv_ownedExpression_3_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:450:1: (lv_ownedExpression_3_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:450:1: (lv_ownedExpression_3_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:451:3: lv_ownedExpression_3_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getBodyCSAccess().getOwnedExpressionExpCSParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleBodyCS963);
            lv_ownedExpression_3_0=ruleExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBodyCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"ownedExpression",
              	        		lv_ownedExpression_3_0, 
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
    // $ANTLR end ruleBodyCS


    // $ANTLR start entryRuleClassifierContextDeclCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:481:1: entryRuleClassifierContextDeclCS returns [EObject current=null] : iv_ruleClassifierContextDeclCS= ruleClassifierContextDeclCS EOF ;
    public final EObject entryRuleClassifierContextDeclCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierContextDeclCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:482:2: (iv_ruleClassifierContextDeclCS= ruleClassifierContextDeclCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:483:2: iv_ruleClassifierContextDeclCS= ruleClassifierContextDeclCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getClassifierContextDeclCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassifierContextDeclCS_in_entryRuleClassifierContextDeclCS999);
            iv_ruleClassifierContextDeclCS=ruleClassifierContextDeclCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleClassifierContextDeclCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassifierContextDeclCS1009); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleClassifierContextDeclCS


    // $ANTLR start ruleClassifierContextDeclCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:490:1: ruleClassifierContextDeclCS returns [EObject current=null] : ( 'context' ( ( (lv_selfName_1_0= ruleUnrestrictedName ) ) ':' )? ( (lv_classifier_3_0= ruleClassifierRefCS ) ) ( ( (lv_invs_4_0= ruleInvCS ) ) | ( (lv_defs_5_0= ruleDefCS ) ) )* ) ;
    public final EObject ruleClassifierContextDeclCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_selfName_1_0 = null;

        EObject lv_classifier_3_0 = null;

        EObject lv_invs_4_0 = null;

        EObject lv_defs_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:495:6: ( ( 'context' ( ( (lv_selfName_1_0= ruleUnrestrictedName ) ) ':' )? ( (lv_classifier_3_0= ruleClassifierRefCS ) ) ( ( (lv_invs_4_0= ruleInvCS ) ) | ( (lv_defs_5_0= ruleDefCS ) ) )* ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:496:1: ( 'context' ( ( (lv_selfName_1_0= ruleUnrestrictedName ) ) ':' )? ( (lv_classifier_3_0= ruleClassifierRefCS ) ) ( ( (lv_invs_4_0= ruleInvCS ) ) | ( (lv_defs_5_0= ruleDefCS ) ) )* )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:496:1: ( 'context' ( ( (lv_selfName_1_0= ruleUnrestrictedName ) ) ':' )? ( (lv_classifier_3_0= ruleClassifierRefCS ) ) ( ( (lv_invs_4_0= ruleInvCS ) ) | ( (lv_defs_5_0= ruleDefCS ) ) )* )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:496:3: 'context' ( ( (lv_selfName_1_0= ruleUnrestrictedName ) ) ':' )? ( (lv_classifier_3_0= ruleClassifierRefCS ) ) ( ( (lv_invs_4_0= ruleInvCS ) ) | ( (lv_defs_5_0= ruleDefCS ) ) )*
            {
            match(input,16,FollowSets000.FOLLOW_16_in_ruleClassifierContextDeclCS1044); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getClassifierContextDeclCSAccess().getContextKeyword_0(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:500:1: ( ( (lv_selfName_1_0= ruleUnrestrictedName ) ) ':' )?
            int alt7=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==32) ) {
                        alt7=1;
                    }
                    }
                    break;
                case 46:
                    {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==32) ) {
                        alt7=1;
                    }
                    }
                    break;
                case 47:
                    {
                    int LA7_3 = input.LA(2);

                    if ( (LA7_3==32) ) {
                        alt7=1;
                    }
                    }
                    break;
                case 15:
                    {
                    int LA7_4 = input.LA(2);

                    if ( (LA7_4==32) ) {
                        alt7=1;
                    }
                    }
                    break;
                case 63:
                    {
                    int LA7_5 = input.LA(2);

                    if ( (LA7_5==32) ) {
                        alt7=1;
                    }
                    }
                    break;
                case 20:
                    {
                    int LA7_6 = input.LA(2);

                    if ( (LA7_6==32) ) {
                        alt7=1;
                    }
                    }
                    break;
                case 21:
                    {
                    int LA7_7 = input.LA(2);

                    if ( (LA7_7==32) ) {
                        alt7=1;
                    }
                    }
                    break;
                case 40:
                    {
                    int LA7_8 = input.LA(2);

                    if ( (LA7_8==32) ) {
                        alt7=1;
                    }
                    }
                    break;
                case 41:
                    {
                    int LA7_9 = input.LA(2);

                    if ( (LA7_9==32) ) {
                        alt7=1;
                    }
                    }
                    break;
                case 16:
                case 17:
                case 18:
                case 19:
                    {
                    alt7=1;
                    }
                    break;
            }

            switch (alt7) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:500:2: ( (lv_selfName_1_0= ruleUnrestrictedName ) ) ':'
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:500:2: ( (lv_selfName_1_0= ruleUnrestrictedName ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:501:1: (lv_selfName_1_0= ruleUnrestrictedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:501:1: (lv_selfName_1_0= ruleUnrestrictedName )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:502:3: lv_selfName_1_0= ruleUnrestrictedName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getClassifierContextDeclCSAccess().getSelfNameUnrestrictedNameParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleClassifierContextDeclCS1066);
                    lv_selfName_1_0=ruleUnrestrictedName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getClassifierContextDeclCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"selfName",
                      	        		lv_selfName_1_0, 
                      	        		"UnrestrictedName", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,32,FollowSets000.FOLLOW_32_in_ruleClassifierContextDeclCS1076); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getClassifierContextDeclCSAccess().getColonKeyword_1_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:528:3: ( (lv_classifier_3_0= ruleClassifierRefCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:529:1: (lv_classifier_3_0= ruleClassifierRefCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:529:1: (lv_classifier_3_0= ruleClassifierRefCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:530:3: lv_classifier_3_0= ruleClassifierRefCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getClassifierContextDeclCSAccess().getClassifierClassifierRefCSParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassifierRefCS_in_ruleClassifierContextDeclCS1099);
            lv_classifier_3_0=ruleClassifierRefCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getClassifierContextDeclCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"classifier",
              	        		lv_classifier_3_0, 
              	        		"ClassifierRefCS", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:552:2: ( ( (lv_invs_4_0= ruleInvCS ) ) | ( (lv_defs_5_0= ruleDefCS ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }
                else if ( (LA8_0==17||LA8_0==33) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:552:3: ( (lv_invs_4_0= ruleInvCS ) )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:552:3: ( (lv_invs_4_0= ruleInvCS ) )
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:553:1: (lv_invs_4_0= ruleInvCS )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:553:1: (lv_invs_4_0= ruleInvCS )
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:554:3: lv_invs_4_0= ruleInvCS
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getClassifierContextDeclCSAccess().getInvsInvCSParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleInvCS_in_ruleClassifierContextDeclCS1121);
            	    lv_invs_4_0=ruleInvCS();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getClassifierContextDeclCSRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"invs",
            	      	        		lv_invs_4_0, 
            	      	        		"InvCS", 
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
            	case 2 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:577:6: ( (lv_defs_5_0= ruleDefCS ) )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:577:6: ( (lv_defs_5_0= ruleDefCS ) )
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:578:1: (lv_defs_5_0= ruleDefCS )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:578:1: (lv_defs_5_0= ruleDefCS )
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:579:3: lv_defs_5_0= ruleDefCS
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getClassifierContextDeclCSAccess().getDefsDefCSParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDefCS_in_ruleClassifierContextDeclCS1148);
            	    lv_defs_5_0=ruleDefCS();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getClassifierContextDeclCSRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"defs",
            	      	        		lv_defs_5_0, 
            	      	        		"DefCS", 
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
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end ruleClassifierContextDeclCS


    // $ANTLR start entryRuleClassifierRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:609:1: entryRuleClassifierRefCS returns [EObject current=null] : iv_ruleClassifierRefCS= ruleClassifierRefCS EOF ;
    public final EObject entryRuleClassifierRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierRefCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:610:2: (iv_ruleClassifierRefCS= ruleClassifierRefCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:611:2: iv_ruleClassifierRefCS= ruleClassifierRefCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getClassifierRefCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassifierRefCS_in_entryRuleClassifierRefCS1186);
            iv_ruleClassifierRefCS=ruleClassifierRefCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleClassifierRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassifierRefCS1196); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleClassifierRefCS


    // $ANTLR start ruleClassifierRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:618:1: ruleClassifierRefCS returns [EObject current=null] : (this_QualifiedClassifierRefCS_0= ruleQualifiedClassifierRefCS | this_SimpleClassifierRefCS_1= ruleSimpleClassifierRefCS ) ;
    public final EObject ruleClassifierRefCS() throws RecognitionException {
        EObject current = null;

        EObject this_QualifiedClassifierRefCS_0 = null;

        EObject this_SimpleClassifierRefCS_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:623:6: ( (this_QualifiedClassifierRefCS_0= ruleQualifiedClassifierRefCS | this_SimpleClassifierRefCS_1= ruleSimpleClassifierRefCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:624:1: (this_QualifiedClassifierRefCS_0= ruleQualifiedClassifierRefCS | this_SimpleClassifierRefCS_1= ruleSimpleClassifierRefCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:624:1: (this_QualifiedClassifierRefCS_0= ruleQualifiedClassifierRefCS | this_SimpleClassifierRefCS_1= ruleSimpleClassifierRefCS )
            int alt9=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==42) ) {
                    alt9=1;
                }
                else if ( (LA9_1==EOF||(LA9_1>=16 && LA9_1<=17)||LA9_1==21||LA9_1==33||(LA9_1>=38 && LA9_1<=39)) ) {
                    alt9=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("624:1: (this_QualifiedClassifierRefCS_0= ruleQualifiedClassifierRefCS | this_SimpleClassifierRefCS_1= ruleSimpleClassifierRefCS )", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==EOF||(LA9_2>=16 && LA9_2<=17)||LA9_2==21||LA9_2==33||(LA9_2>=38 && LA9_2<=39)) ) {
                    alt9=2;
                }
                else if ( (LA9_2==42) ) {
                    alt9=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("624:1: (this_QualifiedClassifierRefCS_0= ruleQualifiedClassifierRefCS | this_SimpleClassifierRefCS_1= ruleSimpleClassifierRefCS )", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==42) ) {
                    alt9=1;
                }
                else if ( (LA9_3==EOF||(LA9_3>=16 && LA9_3<=17)||LA9_3==21||LA9_3==33||(LA9_3>=38 && LA9_3<=39)) ) {
                    alt9=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("624:1: (this_QualifiedClassifierRefCS_0= ruleQualifiedClassifierRefCS | this_SimpleClassifierRefCS_1= ruleSimpleClassifierRefCS )", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA9_4 = input.LA(2);

                if ( (LA9_4==EOF||(LA9_4>=16 && LA9_4<=17)||LA9_4==21||LA9_4==33||(LA9_4>=38 && LA9_4<=39)) ) {
                    alt9=2;
                }
                else if ( (LA9_4==42) ) {
                    alt9=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("624:1: (this_QualifiedClassifierRefCS_0= ruleQualifiedClassifierRefCS | this_SimpleClassifierRefCS_1= ruleSimpleClassifierRefCS )", 9, 4, input);

                    throw nvae;
                }
                }
                break;
            case 63:
                {
                int LA9_5 = input.LA(2);

                if ( (LA9_5==EOF||(LA9_5>=16 && LA9_5<=17)||LA9_5==21||LA9_5==33||(LA9_5>=38 && LA9_5<=39)) ) {
                    alt9=2;
                }
                else if ( (LA9_5==42) ) {
                    alt9=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("624:1: (this_QualifiedClassifierRefCS_0= ruleQualifiedClassifierRefCS | this_SimpleClassifierRefCS_1= ruleSimpleClassifierRefCS )", 9, 5, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                int LA9_6 = input.LA(2);

                if ( (LA9_6==EOF||(LA9_6>=16 && LA9_6<=17)||LA9_6==21||LA9_6==33||(LA9_6>=38 && LA9_6<=39)) ) {
                    alt9=2;
                }
                else if ( (LA9_6==42) ) {
                    alt9=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("624:1: (this_QualifiedClassifierRefCS_0= ruleQualifiedClassifierRefCS | this_SimpleClassifierRefCS_1= ruleSimpleClassifierRefCS )", 9, 6, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                int LA9_7 = input.LA(2);

                if ( (LA9_7==42) ) {
                    alt9=1;
                }
                else if ( (LA9_7==EOF||(LA9_7>=16 && LA9_7<=17)||LA9_7==21||LA9_7==33||(LA9_7>=38 && LA9_7<=39)) ) {
                    alt9=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("624:1: (this_QualifiedClassifierRefCS_0= ruleQualifiedClassifierRefCS | this_SimpleClassifierRefCS_1= ruleSimpleClassifierRefCS )", 9, 7, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                int LA9_8 = input.LA(2);

                if ( (LA9_8==42) ) {
                    alt9=1;
                }
                else if ( (LA9_8==EOF||(LA9_8>=16 && LA9_8<=17)||LA9_8==21||LA9_8==33||(LA9_8>=38 && LA9_8<=39)) ) {
                    alt9=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("624:1: (this_QualifiedClassifierRefCS_0= ruleQualifiedClassifierRefCS | this_SimpleClassifierRefCS_1= ruleSimpleClassifierRefCS )", 9, 8, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                int LA9_9 = input.LA(2);

                if ( (LA9_9==42) ) {
                    alt9=1;
                }
                else if ( (LA9_9==EOF||(LA9_9>=16 && LA9_9<=17)||LA9_9==21||LA9_9==33||(LA9_9>=38 && LA9_9<=39)) ) {
                    alt9=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("624:1: (this_QualifiedClassifierRefCS_0= ruleQualifiedClassifierRefCS | this_SimpleClassifierRefCS_1= ruleSimpleClassifierRefCS )", 9, 9, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("624:1: (this_QualifiedClassifierRefCS_0= ruleQualifiedClassifierRefCS | this_SimpleClassifierRefCS_1= ruleSimpleClassifierRefCS )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:625:2: this_QualifiedClassifierRefCS_0= ruleQualifiedClassifierRefCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getClassifierRefCSAccess().getQualifiedClassifierRefCSParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedClassifierRefCS_in_ruleClassifierRefCS1246);
                    this_QualifiedClassifierRefCS_0=ruleQualifiedClassifierRefCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_QualifiedClassifierRefCS_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:638:2: this_SimpleClassifierRefCS_1= ruleSimpleClassifierRefCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getClassifierRefCSAccess().getSimpleClassifierRefCSParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleClassifierRefCS_in_ruleClassifierRefCS1276);
                    this_SimpleClassifierRefCS_1=ruleSimpleClassifierRefCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SimpleClassifierRefCS_1; 
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
    // $ANTLR end ruleClassifierRefCS


    // $ANTLR start entryRuleContextDeclCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:657:1: entryRuleContextDeclCS returns [EObject current=null] : iv_ruleContextDeclCS= ruleContextDeclCS EOF ;
    public final EObject entryRuleContextDeclCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextDeclCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:658:2: (iv_ruleContextDeclCS= ruleContextDeclCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:659:2: iv_ruleContextDeclCS= ruleContextDeclCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getContextDeclCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleContextDeclCS_in_entryRuleContextDeclCS1311);
            iv_ruleContextDeclCS=ruleContextDeclCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleContextDeclCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContextDeclCS1321); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleContextDeclCS


    // $ANTLR start ruleContextDeclCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:666:1: ruleContextDeclCS returns [EObject current=null] : (this_PropertyContextDeclCS_0= rulePropertyContextDeclCS | this_ClassifierContextDeclCS_1= ruleClassifierContextDeclCS | this_OperationContextDeclCS_2= ruleOperationContextDeclCS ) ;
    public final EObject ruleContextDeclCS() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyContextDeclCS_0 = null;

        EObject this_ClassifierContextDeclCS_1 = null;

        EObject this_OperationContextDeclCS_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:671:6: ( (this_PropertyContextDeclCS_0= rulePropertyContextDeclCS | this_ClassifierContextDeclCS_1= ruleClassifierContextDeclCS | this_OperationContextDeclCS_2= ruleOperationContextDeclCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:672:1: (this_PropertyContextDeclCS_0= rulePropertyContextDeclCS | this_ClassifierContextDeclCS_1= ruleClassifierContextDeclCS | this_OperationContextDeclCS_2= ruleOperationContextDeclCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:672:1: (this_PropertyContextDeclCS_0= rulePropertyContextDeclCS | this_ClassifierContextDeclCS_1= ruleClassifierContextDeclCS | this_OperationContextDeclCS_2= ruleOperationContextDeclCS )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                int LA10_1 = input.LA(2);

                if ( (synpred27()) ) {
                    alt10=1;
                }
                else if ( (synpred28()) ) {
                    alt10=2;
                }
                else if ( (true) ) {
                    alt10=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("672:1: (this_PropertyContextDeclCS_0= rulePropertyContextDeclCS | this_ClassifierContextDeclCS_1= ruleClassifierContextDeclCS | this_OperationContextDeclCS_2= ruleOperationContextDeclCS )", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("672:1: (this_PropertyContextDeclCS_0= rulePropertyContextDeclCS | this_ClassifierContextDeclCS_1= ruleClassifierContextDeclCS | this_OperationContextDeclCS_2= ruleOperationContextDeclCS )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:673:2: this_PropertyContextDeclCS_0= rulePropertyContextDeclCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getContextDeclCSAccess().getPropertyContextDeclCSParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePropertyContextDeclCS_in_ruleContextDeclCS1371);
                    this_PropertyContextDeclCS_0=rulePropertyContextDeclCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PropertyContextDeclCS_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:686:2: this_ClassifierContextDeclCS_1= ruleClassifierContextDeclCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getContextDeclCSAccess().getClassifierContextDeclCSParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleClassifierContextDeclCS_in_ruleContextDeclCS1401);
                    this_ClassifierContextDeclCS_1=ruleClassifierContextDeclCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ClassifierContextDeclCS_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:699:2: this_OperationContextDeclCS_2= ruleOperationContextDeclCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getContextDeclCSAccess().getOperationContextDeclCSParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOperationContextDeclCS_in_ruleContextDeclCS1431);
                    this_OperationContextDeclCS_2=ruleOperationContextDeclCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_OperationContextDeclCS_2; 
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
    // $ANTLR end ruleContextDeclCS


    // $ANTLR start entryRuleDefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:718:1: entryRuleDefCS returns [EObject current=null] : iv_ruleDefCS= ruleDefCS EOF ;
    public final EObject entryRuleDefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:719:2: (iv_ruleDefCS= ruleDefCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:720:2: iv_ruleDefCS= ruleDefCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDefCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDefCS_in_entryRuleDefCS1466);
            iv_ruleDefCS=ruleDefCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDefCS1476); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDefCS


    // $ANTLR start ruleDefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:727:1: ruleDefCS returns [EObject current=null] : ( ( (lv_static_0_0= 'static' ) )? 'def' ( (lv_name_2_0= ruleUnrestrictedName ) )? ':' ( (lv_constrainedName_4_0= ruleUnrestrictedName ) ) ( '(' ( ( (lv_parameters_6_0= ruleParameterCS ) ) ( ',' ( (lv_parameters_8_0= ruleParameterCS ) ) )* )? ')' )? ':' ( (lv_ownedType_11_0= ruleTypeExpCS ) )? '=' ( (lv_ownedExpression_13_0= ruleExpCS ) ) ) ;
    public final EObject ruleDefCS() throws RecognitionException {
        EObject current = null;

        Token lv_static_0_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_constrainedName_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_ownedType_11_0 = null;

        EObject lv_ownedExpression_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:732:6: ( ( ( (lv_static_0_0= 'static' ) )? 'def' ( (lv_name_2_0= ruleUnrestrictedName ) )? ':' ( (lv_constrainedName_4_0= ruleUnrestrictedName ) ) ( '(' ( ( (lv_parameters_6_0= ruleParameterCS ) ) ( ',' ( (lv_parameters_8_0= ruleParameterCS ) ) )* )? ')' )? ':' ( (lv_ownedType_11_0= ruleTypeExpCS ) )? '=' ( (lv_ownedExpression_13_0= ruleExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:733:1: ( ( (lv_static_0_0= 'static' ) )? 'def' ( (lv_name_2_0= ruleUnrestrictedName ) )? ':' ( (lv_constrainedName_4_0= ruleUnrestrictedName ) ) ( '(' ( ( (lv_parameters_6_0= ruleParameterCS ) ) ( ',' ( (lv_parameters_8_0= ruleParameterCS ) ) )* )? ')' )? ':' ( (lv_ownedType_11_0= ruleTypeExpCS ) )? '=' ( (lv_ownedExpression_13_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:733:1: ( ( (lv_static_0_0= 'static' ) )? 'def' ( (lv_name_2_0= ruleUnrestrictedName ) )? ':' ( (lv_constrainedName_4_0= ruleUnrestrictedName ) ) ( '(' ( ( (lv_parameters_6_0= ruleParameterCS ) ) ( ',' ( (lv_parameters_8_0= ruleParameterCS ) ) )* )? ')' )? ':' ( (lv_ownedType_11_0= ruleTypeExpCS ) )? '=' ( (lv_ownedExpression_13_0= ruleExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:733:2: ( (lv_static_0_0= 'static' ) )? 'def' ( (lv_name_2_0= ruleUnrestrictedName ) )? ':' ( (lv_constrainedName_4_0= ruleUnrestrictedName ) ) ( '(' ( ( (lv_parameters_6_0= ruleParameterCS ) ) ( ',' ( (lv_parameters_8_0= ruleParameterCS ) ) )* )? ')' )? ':' ( (lv_ownedType_11_0= ruleTypeExpCS ) )? '=' ( (lv_ownedExpression_13_0= ruleExpCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:733:2: ( (lv_static_0_0= 'static' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:734:1: (lv_static_0_0= 'static' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:734:1: (lv_static_0_0= 'static' )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:735:3: lv_static_0_0= 'static'
                    {
                    lv_static_0_0=(Token)input.LT(1);
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleDefCS1519); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDefCSAccess().getStaticStaticKeyword_0_0(), "static"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDefCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "static", true, "static", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,17,FollowSets000.FOLLOW_17_in_ruleDefCS1543); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDefCSAccess().getDefKeyword_1(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:758:1: ( (lv_name_2_0= ruleUnrestrictedName ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||(LA12_0>=15 && LA12_0<=21)||(LA12_0>=40 && LA12_0<=41)||(LA12_0>=46 && LA12_0<=47)||LA12_0==63) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:759:1: (lv_name_2_0= ruleUnrestrictedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:759:1: (lv_name_2_0= ruleUnrestrictedName )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:760:3: lv_name_2_0= ruleUnrestrictedName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDefCSAccess().getNameUnrestrictedNameParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleDefCS1564);
                    lv_name_2_0=ruleUnrestrictedName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDefCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_2_0, 
                      	        		"UnrestrictedName", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,32,FollowSets000.FOLLOW_32_in_ruleDefCS1575); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDefCSAccess().getColonKeyword_3(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:786:1: ( (lv_constrainedName_4_0= ruleUnrestrictedName ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:787:1: (lv_constrainedName_4_0= ruleUnrestrictedName )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:787:1: (lv_constrainedName_4_0= ruleUnrestrictedName )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:788:3: lv_constrainedName_4_0= ruleUnrestrictedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDefCSAccess().getConstrainedNameUnrestrictedNameParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleDefCS1596);
            lv_constrainedName_4_0=ruleUnrestrictedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDefCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"constrainedName",
              	        		lv_constrainedName_4_0, 
              	        		"UnrestrictedName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:810:2: ( '(' ( ( (lv_parameters_6_0= ruleParameterCS ) ) ( ',' ( (lv_parameters_8_0= ruleParameterCS ) ) )* )? ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:810:4: '(' ( ( (lv_parameters_6_0= ruleParameterCS ) ) ( ',' ( (lv_parameters_8_0= ruleParameterCS ) ) )* )? ')'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_ruleDefCS1607); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDefCSAccess().getLeftParenthesisKeyword_5_0(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:814:1: ( ( (lv_parameters_6_0= ruleParameterCS ) ) ( ',' ( (lv_parameters_8_0= ruleParameterCS ) ) )* )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_ID||(LA14_0>=15 && LA14_0<=31)||(LA14_0>=40 && LA14_0<=41)||(LA14_0>=46 && LA14_0<=47)||(LA14_0>=63 && LA14_0<=69)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:814:2: ( (lv_parameters_6_0= ruleParameterCS ) ) ( ',' ( (lv_parameters_8_0= ruleParameterCS ) ) )*
                            {
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:814:2: ( (lv_parameters_6_0= ruleParameterCS ) )
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:815:1: (lv_parameters_6_0= ruleParameterCS )
                            {
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:815:1: (lv_parameters_6_0= ruleParameterCS )
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:816:3: lv_parameters_6_0= ruleParameterCS
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getDefCSAccess().getParametersParameterCSParserRuleCall_5_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleParameterCS_in_ruleDefCS1629);
                            lv_parameters_6_0=ruleParameterCS();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getDefCSRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"parameters",
                              	        		lv_parameters_6_0, 
                              	        		"ParameterCS", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:838:2: ( ',' ( (lv_parameters_8_0= ruleParameterCS ) ) )*
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( (LA13_0==35) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:838:4: ',' ( (lv_parameters_8_0= ruleParameterCS ) )
                            	    {
                            	    match(input,35,FollowSets000.FOLLOW_35_in_ruleDefCS1640); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getDefCSAccess().getCommaKeyword_5_1_1_0(), null); 
                            	          
                            	    }
                            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:842:1: ( (lv_parameters_8_0= ruleParameterCS ) )
                            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:843:1: (lv_parameters_8_0= ruleParameterCS )
                            	    {
                            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:843:1: (lv_parameters_8_0= ruleParameterCS )
                            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:844:3: lv_parameters_8_0= ruleParameterCS
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getDefCSAccess().getParametersParameterCSParserRuleCall_5_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleParameterCS_in_ruleDefCS1661);
                            	    lv_parameters_8_0=ruleParameterCS();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getDefCSRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"parameters",
                            	      	        		lv_parameters_8_0, 
                            	      	        		"ParameterCS", 
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
                            	    break loop13;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,36,FollowSets000.FOLLOW_36_in_ruleDefCS1675); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDefCSAccess().getRightParenthesisKeyword_5_2(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,32,FollowSets000.FOLLOW_32_in_ruleDefCS1687); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDefCSAccess().getColonKeyword_6(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:874:1: ( (lv_ownedType_11_0= ruleTypeExpCS ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||(LA16_0>=15 && LA16_0<=31)||(LA16_0>=40 && LA16_0<=41)||(LA16_0>=46 && LA16_0<=47)||(LA16_0>=63 && LA16_0<=69)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:875:1: (lv_ownedType_11_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:875:1: (lv_ownedType_11_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:876:3: lv_ownedType_11_0= ruleTypeExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDefCSAccess().getOwnedTypeTypeExpCSParserRuleCall_7_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleDefCS1708);
                    lv_ownedType_11_0=ruleTypeExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDefCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"ownedType",
                      	        		lv_ownedType_11_0, 
                      	        		"TypeExpCS", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,37,FollowSets000.FOLLOW_37_in_ruleDefCS1719); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDefCSAccess().getEqualsSignKeyword_8(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:902:1: ( (lv_ownedExpression_13_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:903:1: (lv_ownedExpression_13_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:903:1: (lv_ownedExpression_13_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:904:3: lv_ownedExpression_13_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDefCSAccess().getOwnedExpressionExpCSParserRuleCall_9_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleDefCS1740);
            lv_ownedExpression_13_0=ruleExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDefCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"ownedExpression",
              	        		lv_ownedExpression_13_0, 
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
    // $ANTLR end ruleDefCS


    // $ANTLR start entryRuleDerCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:934:1: entryRuleDerCS returns [EObject current=null] : iv_ruleDerCS= ruleDerCS EOF ;
    public final EObject entryRuleDerCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:935:2: (iv_ruleDerCS= ruleDerCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:936:2: iv_ruleDerCS= ruleDerCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDerCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDerCS_in_entryRuleDerCS1776);
            iv_ruleDerCS=ruleDerCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDerCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDerCS1786); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDerCS


    // $ANTLR start ruleDerCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:943:1: ruleDerCS returns [EObject current=null] : ( ( (lv_stereotype_0_0= 'derive' ) ) ':' ( (lv_ownedExpression_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleDerCS() throws RecognitionException {
        EObject current = null;

        Token lv_stereotype_0_0=null;
        EObject lv_ownedExpression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:948:6: ( ( ( (lv_stereotype_0_0= 'derive' ) ) ':' ( (lv_ownedExpression_2_0= ruleExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:949:1: ( ( (lv_stereotype_0_0= 'derive' ) ) ':' ( (lv_ownedExpression_2_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:949:1: ( ( (lv_stereotype_0_0= 'derive' ) ) ':' ( (lv_ownedExpression_2_0= ruleExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:949:2: ( (lv_stereotype_0_0= 'derive' ) ) ':' ( (lv_ownedExpression_2_0= ruleExpCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:949:2: ( (lv_stereotype_0_0= 'derive' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:950:1: (lv_stereotype_0_0= 'derive' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:950:1: (lv_stereotype_0_0= 'derive' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:951:3: lv_stereotype_0_0= 'derive'
            {
            lv_stereotype_0_0=(Token)input.LT(1);
            match(input,18,FollowSets000.FOLLOW_18_in_ruleDerCS1829); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDerCSAccess().getStereotypeDeriveKeyword_0_0(), "stereotype"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDerCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "stereotype", lv_stereotype_0_0, "derive", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,32,FollowSets000.FOLLOW_32_in_ruleDerCS1852); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDerCSAccess().getColonKeyword_1(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:974:1: ( (lv_ownedExpression_2_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:975:1: (lv_ownedExpression_2_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:975:1: (lv_ownedExpression_2_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:976:3: lv_ownedExpression_2_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDerCSAccess().getOwnedExpressionExpCSParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleDerCS1873);
            lv_ownedExpression_2_0=ruleExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDerCSRule().getType().getClassifier());
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
    // $ANTLR end ruleDerCS


    // $ANTLR start entryRuleImportCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1006:1: entryRuleImportCS returns [EObject current=null] : iv_ruleImportCS= ruleImportCS EOF ;
    public final EObject entryRuleImportCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1007:2: (iv_ruleImportCS= ruleImportCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1008:2: iv_ruleImportCS= ruleImportCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getImportCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleImportCS_in_entryRuleImportCS1909);
            iv_ruleImportCS=ruleImportCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleImportCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImportCS1919); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleImportCS


    // $ANTLR start ruleImportCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1015:1: ruleImportCS returns [EObject current=null] : ( 'import' ( ( (lv_name_1_0= ruleIdentifier ) ) ':' )? ( ( RULE_SINGLE_QUOTED_STRING ) ) ) ;
    public final EObject ruleImportCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1020:6: ( ( 'import' ( ( (lv_name_1_0= ruleIdentifier ) ) ':' )? ( ( RULE_SINGLE_QUOTED_STRING ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1021:1: ( 'import' ( ( (lv_name_1_0= ruleIdentifier ) ) ':' )? ( ( RULE_SINGLE_QUOTED_STRING ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1021:1: ( 'import' ( ( (lv_name_1_0= ruleIdentifier ) ) ':' )? ( ( RULE_SINGLE_QUOTED_STRING ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1021:3: 'import' ( ( (lv_name_1_0= ruleIdentifier ) ) ':' )? ( ( RULE_SINGLE_QUOTED_STRING ) )
            {
            match(input,19,FollowSets000.FOLLOW_19_in_ruleImportCS1954); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getImportCSAccess().getImportKeyword_0(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1025:1: ( ( (lv_name_1_0= ruleIdentifier ) ) ':' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||LA17_0==15||(LA17_0>=20 && LA17_0<=21)||(LA17_0>=40 && LA17_0<=41)||(LA17_0>=46 && LA17_0<=47)||LA17_0==63) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1025:2: ( (lv_name_1_0= ruleIdentifier ) ) ':'
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1025:2: ( (lv_name_1_0= ruleIdentifier ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1026:1: (lv_name_1_0= ruleIdentifier )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1026:1: (lv_name_1_0= ruleIdentifier )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1027:3: lv_name_1_0= ruleIdentifier
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getImportCSAccess().getNameIdentifierParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleImportCS1976);
                    lv_name_1_0=ruleIdentifier();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getImportCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_1_0, 
                      	        		"Identifier", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,32,FollowSets000.FOLLOW_32_in_ruleImportCS1986); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getImportCSAccess().getColonKeyword_1_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1053:3: ( ( RULE_SINGLE_QUOTED_STRING ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1054:1: ( RULE_SINGLE_QUOTED_STRING )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1054:1: ( RULE_SINGLE_QUOTED_STRING )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1055:3: RULE_SINGLE_QUOTED_STRING
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getImportCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleImportCS2010); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getImportCSAccess().getNamespaceNamespaceCrossReference_2_0(), "namespace"); 
              	
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
    // $ANTLR end ruleImportCS


    // $ANTLR start entryRuleInitCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1078:1: entryRuleInitCS returns [EObject current=null] : iv_ruleInitCS= ruleInitCS EOF ;
    public final EObject entryRuleInitCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1079:2: (iv_ruleInitCS= ruleInitCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1080:2: iv_ruleInitCS= ruleInitCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInitCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInitCS_in_entryRuleInitCS2046);
            iv_ruleInitCS=ruleInitCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInitCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInitCS2056); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInitCS


    // $ANTLR start ruleInitCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1087:1: ruleInitCS returns [EObject current=null] : ( ( (lv_stereotype_0_0= 'init' ) ) ':' ( (lv_ownedExpression_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleInitCS() throws RecognitionException {
        EObject current = null;

        Token lv_stereotype_0_0=null;
        EObject lv_ownedExpression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1092:6: ( ( ( (lv_stereotype_0_0= 'init' ) ) ':' ( (lv_ownedExpression_2_0= ruleExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1093:1: ( ( (lv_stereotype_0_0= 'init' ) ) ':' ( (lv_ownedExpression_2_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1093:1: ( ( (lv_stereotype_0_0= 'init' ) ) ':' ( (lv_ownedExpression_2_0= ruleExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1093:2: ( (lv_stereotype_0_0= 'init' ) ) ':' ( (lv_ownedExpression_2_0= ruleExpCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1093:2: ( (lv_stereotype_0_0= 'init' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1094:1: (lv_stereotype_0_0= 'init' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1094:1: (lv_stereotype_0_0= 'init' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1095:3: lv_stereotype_0_0= 'init'
            {
            lv_stereotype_0_0=(Token)input.LT(1);
            match(input,20,FollowSets000.FOLLOW_20_in_ruleInitCS2099); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInitCSAccess().getStereotypeInitKeyword_0_0(), "stereotype"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInitCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "stereotype", lv_stereotype_0_0, "init", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,32,FollowSets000.FOLLOW_32_in_ruleInitCS2122); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInitCSAccess().getColonKeyword_1(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1118:1: ( (lv_ownedExpression_2_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1119:1: (lv_ownedExpression_2_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1119:1: (lv_ownedExpression_2_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1120:3: lv_ownedExpression_2_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInitCSAccess().getOwnedExpressionExpCSParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleInitCS2143);
            lv_ownedExpression_2_0=ruleExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInitCSRule().getType().getClassifier());
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
    // $ANTLR end ruleInitCS


    // $ANTLR start entryRuleInvCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1150:1: entryRuleInvCS returns [EObject current=null] : iv_ruleInvCS= ruleInvCS EOF ;
    public final EObject entryRuleInvCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1151:2: (iv_ruleInvCS= ruleInvCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1152:2: iv_ruleInvCS= ruleInvCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInvCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInvCS_in_entryRuleInvCS2179);
            iv_ruleInvCS=ruleInvCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInvCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvCS2189); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInvCS


    // $ANTLR start ruleInvCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1159:1: ruleInvCS returns [EObject current=null] : ( ( (lv_stereotype_0_0= 'inv' ) ) ( ( (lv_name_1_0= ruleUnrestrictedName ) ) ( '(' ( (lv_ownedReason_3_0= ruleExpCS ) ) ')' )? )? ':' ( (lv_ownedExpression_6_0= ruleExpCS ) ) ) ;
    public final EObject ruleInvCS() throws RecognitionException {
        EObject current = null;

        Token lv_stereotype_0_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedReason_3_0 = null;

        EObject lv_ownedExpression_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1164:6: ( ( ( (lv_stereotype_0_0= 'inv' ) ) ( ( (lv_name_1_0= ruleUnrestrictedName ) ) ( '(' ( (lv_ownedReason_3_0= ruleExpCS ) ) ')' )? )? ':' ( (lv_ownedExpression_6_0= ruleExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1165:1: ( ( (lv_stereotype_0_0= 'inv' ) ) ( ( (lv_name_1_0= ruleUnrestrictedName ) ) ( '(' ( (lv_ownedReason_3_0= ruleExpCS ) ) ')' )? )? ':' ( (lv_ownedExpression_6_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1165:1: ( ( (lv_stereotype_0_0= 'inv' ) ) ( ( (lv_name_1_0= ruleUnrestrictedName ) ) ( '(' ( (lv_ownedReason_3_0= ruleExpCS ) ) ')' )? )? ':' ( (lv_ownedExpression_6_0= ruleExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1165:2: ( (lv_stereotype_0_0= 'inv' ) ) ( ( (lv_name_1_0= ruleUnrestrictedName ) ) ( '(' ( (lv_ownedReason_3_0= ruleExpCS ) ) ')' )? )? ':' ( (lv_ownedExpression_6_0= ruleExpCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1165:2: ( (lv_stereotype_0_0= 'inv' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1166:1: (lv_stereotype_0_0= 'inv' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1166:1: (lv_stereotype_0_0= 'inv' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1167:3: lv_stereotype_0_0= 'inv'
            {
            lv_stereotype_0_0=(Token)input.LT(1);
            match(input,21,FollowSets000.FOLLOW_21_in_ruleInvCS2232); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInvCSAccess().getStereotypeInvKeyword_0_0(), "stereotype"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInvCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "stereotype", lv_stereotype_0_0, "inv", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1186:2: ( ( (lv_name_1_0= ruleUnrestrictedName ) ) ( '(' ( (lv_ownedReason_3_0= ruleExpCS ) ) ')' )? )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||(LA19_0>=15 && LA19_0<=21)||(LA19_0>=40 && LA19_0<=41)||(LA19_0>=46 && LA19_0<=47)||LA19_0==63) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1186:3: ( (lv_name_1_0= ruleUnrestrictedName ) ) ( '(' ( (lv_ownedReason_3_0= ruleExpCS ) ) ')' )?
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1186:3: ( (lv_name_1_0= ruleUnrestrictedName ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1187:1: (lv_name_1_0= ruleUnrestrictedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1187:1: (lv_name_1_0= ruleUnrestrictedName )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1188:3: lv_name_1_0= ruleUnrestrictedName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInvCSAccess().getNameUnrestrictedNameParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleInvCS2267);
                    lv_name_1_0=ruleUnrestrictedName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInvCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_1_0, 
                      	        		"UnrestrictedName", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1210:2: ( '(' ( (lv_ownedReason_3_0= ruleExpCS ) ) ')' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==34) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1210:4: '(' ( (lv_ownedReason_3_0= ruleExpCS ) ) ')'
                            {
                            match(input,34,FollowSets000.FOLLOW_34_in_ruleInvCS2278); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getInvCSAccess().getLeftParenthesisKeyword_1_1_0(), null); 
                                  
                            }
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1214:1: ( (lv_ownedReason_3_0= ruleExpCS ) )
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1215:1: (lv_ownedReason_3_0= ruleExpCS )
                            {
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1215:1: (lv_ownedReason_3_0= ruleExpCS )
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1216:3: lv_ownedReason_3_0= ruleExpCS
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getInvCSAccess().getOwnedReasonExpCSParserRuleCall_1_1_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleInvCS2299);
                            lv_ownedReason_3_0=ruleExpCS();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getInvCSRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"ownedReason",
                              	        		lv_ownedReason_3_0, 
                              	        		"ExpCS", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            match(input,36,FollowSets000.FOLLOW_36_in_ruleInvCS2309); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getInvCSAccess().getRightParenthesisKeyword_1_1_2(), null); 
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,32,FollowSets000.FOLLOW_32_in_ruleInvCS2323); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInvCSAccess().getColonKeyword_2(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1246:1: ( (lv_ownedExpression_6_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1247:1: (lv_ownedExpression_6_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1247:1: (lv_ownedExpression_6_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1248:3: lv_ownedExpression_6_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInvCSAccess().getOwnedExpressionExpCSParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleInvCS2344);
            lv_ownedExpression_6_0=ruleExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInvCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"ownedExpression",
              	        		lv_ownedExpression_6_0, 
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
    // $ANTLR end ruleInvCS


    // $ANTLR start entryRuleOperationContextDeclCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1278:1: entryRuleOperationContextDeclCS returns [EObject current=null] : iv_ruleOperationContextDeclCS= ruleOperationContextDeclCS EOF ;
    public final EObject entryRuleOperationContextDeclCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationContextDeclCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1279:2: (iv_ruleOperationContextDeclCS= ruleOperationContextDeclCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1280:2: iv_ruleOperationContextDeclCS= ruleOperationContextDeclCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOperationContextDeclCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperationContextDeclCS_in_entryRuleOperationContextDeclCS2380);
            iv_ruleOperationContextDeclCS=ruleOperationContextDeclCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOperationContextDeclCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperationContextDeclCS2390); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOperationContextDeclCS


    // $ANTLR start ruleOperationContextDeclCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1287:1: ruleOperationContextDeclCS returns [EObject current=null] : ( 'context' ( (lv_operation_1_0= ruleOperationRefCS ) ) '(' ( ( (lv_parameters_3_0= ruleParameterCS ) ) ( ',' ( (lv_parameters_5_0= ruleParameterCS ) ) )* )? ')' ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) )? ( ( (lv_pres_9_0= rulePreCS ) ) | ( (lv_posts_10_0= rulePostCS ) ) | ( (lv_bodies_11_0= ruleBodyCS ) ) )* ) ;
    public final EObject ruleOperationContextDeclCS() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_ownedType_8_0 = null;

        EObject lv_pres_9_0 = null;

        EObject lv_posts_10_0 = null;

        EObject lv_bodies_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1292:6: ( ( 'context' ( (lv_operation_1_0= ruleOperationRefCS ) ) '(' ( ( (lv_parameters_3_0= ruleParameterCS ) ) ( ',' ( (lv_parameters_5_0= ruleParameterCS ) ) )* )? ')' ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) )? ( ( (lv_pres_9_0= rulePreCS ) ) | ( (lv_posts_10_0= rulePostCS ) ) | ( (lv_bodies_11_0= ruleBodyCS ) ) )* ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1293:1: ( 'context' ( (lv_operation_1_0= ruleOperationRefCS ) ) '(' ( ( (lv_parameters_3_0= ruleParameterCS ) ) ( ',' ( (lv_parameters_5_0= ruleParameterCS ) ) )* )? ')' ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) )? ( ( (lv_pres_9_0= rulePreCS ) ) | ( (lv_posts_10_0= rulePostCS ) ) | ( (lv_bodies_11_0= ruleBodyCS ) ) )* )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1293:1: ( 'context' ( (lv_operation_1_0= ruleOperationRefCS ) ) '(' ( ( (lv_parameters_3_0= ruleParameterCS ) ) ( ',' ( (lv_parameters_5_0= ruleParameterCS ) ) )* )? ')' ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) )? ( ( (lv_pres_9_0= rulePreCS ) ) | ( (lv_posts_10_0= rulePostCS ) ) | ( (lv_bodies_11_0= ruleBodyCS ) ) )* )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1293:3: 'context' ( (lv_operation_1_0= ruleOperationRefCS ) ) '(' ( ( (lv_parameters_3_0= ruleParameterCS ) ) ( ',' ( (lv_parameters_5_0= ruleParameterCS ) ) )* )? ')' ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) )? ( ( (lv_pres_9_0= rulePreCS ) ) | ( (lv_posts_10_0= rulePostCS ) ) | ( (lv_bodies_11_0= ruleBodyCS ) ) )*
            {
            match(input,16,FollowSets000.FOLLOW_16_in_ruleOperationContextDeclCS2425); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOperationContextDeclCSAccess().getContextKeyword_0(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1297:1: ( (lv_operation_1_0= ruleOperationRefCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1298:1: (lv_operation_1_0= ruleOperationRefCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1298:1: (lv_operation_1_0= ruleOperationRefCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1299:3: lv_operation_1_0= ruleOperationRefCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getOperationOperationRefCSParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperationRefCS_in_ruleOperationContextDeclCS2446);
            lv_operation_1_0=ruleOperationRefCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOperationContextDeclCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"operation",
              	        		lv_operation_1_0, 
              	        		"OperationRefCS", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,34,FollowSets000.FOLLOW_34_in_ruleOperationContextDeclCS2456); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOperationContextDeclCSAccess().getLeftParenthesisKeyword_2(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1325:1: ( ( (lv_parameters_3_0= ruleParameterCS ) ) ( ',' ( (lv_parameters_5_0= ruleParameterCS ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||(LA21_0>=15 && LA21_0<=31)||(LA21_0>=40 && LA21_0<=41)||(LA21_0>=46 && LA21_0<=47)||(LA21_0>=63 && LA21_0<=69)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1325:2: ( (lv_parameters_3_0= ruleParameterCS ) ) ( ',' ( (lv_parameters_5_0= ruleParameterCS ) ) )*
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1325:2: ( (lv_parameters_3_0= ruleParameterCS ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1326:1: (lv_parameters_3_0= ruleParameterCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1326:1: (lv_parameters_3_0= ruleParameterCS )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1327:3: lv_parameters_3_0= ruleParameterCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getParametersParameterCSParserRuleCall_3_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameterCS_in_ruleOperationContextDeclCS2478);
                    lv_parameters_3_0=ruleParameterCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOperationContextDeclCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"parameters",
                      	        		lv_parameters_3_0, 
                      	        		"ParameterCS", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1349:2: ( ',' ( (lv_parameters_5_0= ruleParameterCS ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==35) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1349:4: ',' ( (lv_parameters_5_0= ruleParameterCS ) )
                    	    {
                    	    match(input,35,FollowSets000.FOLLOW_35_in_ruleOperationContextDeclCS2489); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getOperationContextDeclCSAccess().getCommaKeyword_3_1_0(), null); 
                    	          
                    	    }
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1353:1: ( (lv_parameters_5_0= ruleParameterCS ) )
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1354:1: (lv_parameters_5_0= ruleParameterCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1354:1: (lv_parameters_5_0= ruleParameterCS )
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1355:3: lv_parameters_5_0= ruleParameterCS
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getParametersParameterCSParserRuleCall_3_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameterCS_in_ruleOperationContextDeclCS2510);
                    	    lv_parameters_5_0=ruleParameterCS();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getOperationContextDeclCSRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"parameters",
                    	      	        		lv_parameters_5_0, 
                    	      	        		"ParameterCS", 
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
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,36,FollowSets000.FOLLOW_36_in_ruleOperationContextDeclCS2524); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOperationContextDeclCSAccess().getRightParenthesisKeyword_4(), null); 
                  
            }
            match(input,32,FollowSets000.FOLLOW_32_in_ruleOperationContextDeclCS2534); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOperationContextDeclCSAccess().getColonKeyword_5(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1385:1: ( (lv_ownedType_8_0= ruleTypeExpCS ) )?
            int alt22=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 46:
                case 47:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                    {
                    alt22=1;
                    }
                    break;
                case 15:
                    {
                    int LA22_4 = input.LA(2);

                    if ( (synpred40()) ) {
                        alt22=1;
                    }
                    }
                    break;
                case 40:
                    {
                    int LA22_8 = input.LA(2);

                    if ( (synpred40()) ) {
                        alt22=1;
                    }
                    }
                    break;
                case 41:
                    {
                    int LA22_9 = input.LA(2);

                    if ( (synpred40()) ) {
                        alt22=1;
                    }
                    }
                    break;
                case 16:
                    {
                    int LA22_10 = input.LA(2);

                    if ( (synpred40()) ) {
                        alt22=1;
                    }
                    }
                    break;
            }

            switch (alt22) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1386:1: (lv_ownedType_8_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1386:1: (lv_ownedType_8_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1387:3: lv_ownedType_8_0= ruleTypeExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getOwnedTypeTypeExpCSParserRuleCall_6_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleOperationContextDeclCS2555);
                    lv_ownedType_8_0=ruleTypeExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOperationContextDeclCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"ownedType",
                      	        		lv_ownedType_8_0, 
                      	        		"TypeExpCS", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1409:3: ( ( (lv_pres_9_0= rulePreCS ) ) | ( (lv_posts_10_0= rulePostCS ) ) | ( (lv_bodies_11_0= ruleBodyCS ) ) )*
            loop23:
            do {
                int alt23=4;
                switch ( input.LA(1) ) {
                case 41:
                    {
                    alt23=1;
                    }
                    break;
                case 40:
                    {
                    alt23=2;
                    }
                    break;
                case 15:
                    {
                    alt23=3;
                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1409:4: ( (lv_pres_9_0= rulePreCS ) )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1409:4: ( (lv_pres_9_0= rulePreCS ) )
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1410:1: (lv_pres_9_0= rulePreCS )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1410:1: (lv_pres_9_0= rulePreCS )
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1411:3: lv_pres_9_0= rulePreCS
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getPresPreCSParserRuleCall_7_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePreCS_in_ruleOperationContextDeclCS2578);
            	    lv_pres_9_0=rulePreCS();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getOperationContextDeclCSRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"pres",
            	      	        		lv_pres_9_0, 
            	      	        		"PreCS", 
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
            	case 2 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1434:6: ( (lv_posts_10_0= rulePostCS ) )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1434:6: ( (lv_posts_10_0= rulePostCS ) )
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1435:1: (lv_posts_10_0= rulePostCS )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1435:1: (lv_posts_10_0= rulePostCS )
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1436:3: lv_posts_10_0= rulePostCS
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getPostsPostCSParserRuleCall_7_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePostCS_in_ruleOperationContextDeclCS2605);
            	    lv_posts_10_0=rulePostCS();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getOperationContextDeclCSRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"posts",
            	      	        		lv_posts_10_0, 
            	      	        		"PostCS", 
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
            	case 3 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1459:6: ( (lv_bodies_11_0= ruleBodyCS ) )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1459:6: ( (lv_bodies_11_0= ruleBodyCS ) )
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1460:1: (lv_bodies_11_0= ruleBodyCS )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1460:1: (lv_bodies_11_0= ruleBodyCS )
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1461:3: lv_bodies_11_0= ruleBodyCS
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getBodiesBodyCSParserRuleCall_7_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleBodyCS_in_ruleOperationContextDeclCS2632);
            	    lv_bodies_11_0=ruleBodyCS();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getOperationContextDeclCSRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"bodies",
            	      	        		lv_bodies_11_0, 
            	      	        		"BodyCS", 
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
            	    break loop23;
                }
            } while (true);


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
    // $ANTLR end ruleOperationContextDeclCS


    // $ANTLR start entryRuleOperationRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1491:1: entryRuleOperationRefCS returns [EObject current=null] : iv_ruleOperationRefCS= ruleOperationRefCS EOF ;
    public final EObject entryRuleOperationRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationRefCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1492:2: (iv_ruleOperationRefCS= ruleOperationRefCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1493:2: iv_ruleOperationRefCS= ruleOperationRefCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOperationRefCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperationRefCS_in_entryRuleOperationRefCS2670);
            iv_ruleOperationRefCS=ruleOperationRefCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOperationRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperationRefCS2680); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOperationRefCS


    // $ANTLR start ruleOperationRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1500:1: ruleOperationRefCS returns [EObject current=null] : (this_QualifiedOperationRefCS_0= ruleQualifiedOperationRefCS | this_SimpleOperationRefCS_1= ruleSimpleOperationRefCS ) ;
    public final EObject ruleOperationRefCS() throws RecognitionException {
        EObject current = null;

        EObject this_QualifiedOperationRefCS_0 = null;

        EObject this_SimpleOperationRefCS_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1505:6: ( (this_QualifiedOperationRefCS_0= ruleQualifiedOperationRefCS | this_SimpleOperationRefCS_1= ruleSimpleOperationRefCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1506:1: (this_QualifiedOperationRefCS_0= ruleQualifiedOperationRefCS | this_SimpleOperationRefCS_1= ruleSimpleOperationRefCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1506:1: (this_QualifiedOperationRefCS_0= ruleQualifiedOperationRefCS | this_SimpleOperationRefCS_1= ruleSimpleOperationRefCS )
            int alt24=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==42) ) {
                    alt24=1;
                }
                else if ( (LA24_1==EOF||LA24_1==34) ) {
                    alt24=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1506:1: (this_QualifiedOperationRefCS_0= ruleQualifiedOperationRefCS | this_SimpleOperationRefCS_1= ruleSimpleOperationRefCS )", 24, 1, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==42) ) {
                    alt24=1;
                }
                else if ( (LA24_2==EOF||LA24_2==34) ) {
                    alt24=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1506:1: (this_QualifiedOperationRefCS_0= ruleQualifiedOperationRefCS | this_SimpleOperationRefCS_1= ruleSimpleOperationRefCS )", 24, 2, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA24_3 = input.LA(2);

                if ( (LA24_3==EOF||LA24_3==34) ) {
                    alt24=2;
                }
                else if ( (LA24_3==42) ) {
                    alt24=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1506:1: (this_QualifiedOperationRefCS_0= ruleQualifiedOperationRefCS | this_SimpleOperationRefCS_1= ruleSimpleOperationRefCS )", 24, 3, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA24_4 = input.LA(2);

                if ( (LA24_4==42) ) {
                    alt24=1;
                }
                else if ( (LA24_4==EOF||LA24_4==34) ) {
                    alt24=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1506:1: (this_QualifiedOperationRefCS_0= ruleQualifiedOperationRefCS | this_SimpleOperationRefCS_1= ruleSimpleOperationRefCS )", 24, 4, input);

                    throw nvae;
                }
                }
                break;
            case 63:
                {
                int LA24_5 = input.LA(2);

                if ( (LA24_5==42) ) {
                    alt24=1;
                }
                else if ( (LA24_5==EOF||LA24_5==34) ) {
                    alt24=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1506:1: (this_QualifiedOperationRefCS_0= ruleQualifiedOperationRefCS | this_SimpleOperationRefCS_1= ruleSimpleOperationRefCS )", 24, 5, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                int LA24_6 = input.LA(2);

                if ( (LA24_6==EOF||LA24_6==34) ) {
                    alt24=2;
                }
                else if ( (LA24_6==42) ) {
                    alt24=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1506:1: (this_QualifiedOperationRefCS_0= ruleQualifiedOperationRefCS | this_SimpleOperationRefCS_1= ruleSimpleOperationRefCS )", 24, 6, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                int LA24_7 = input.LA(2);

                if ( (LA24_7==42) ) {
                    alt24=1;
                }
                else if ( (LA24_7==EOF||LA24_7==34) ) {
                    alt24=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1506:1: (this_QualifiedOperationRefCS_0= ruleQualifiedOperationRefCS | this_SimpleOperationRefCS_1= ruleSimpleOperationRefCS )", 24, 7, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                int LA24_8 = input.LA(2);

                if ( (LA24_8==EOF||LA24_8==34) ) {
                    alt24=2;
                }
                else if ( (LA24_8==42) ) {
                    alt24=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1506:1: (this_QualifiedOperationRefCS_0= ruleQualifiedOperationRefCS | this_SimpleOperationRefCS_1= ruleSimpleOperationRefCS )", 24, 8, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                int LA24_9 = input.LA(2);

                if ( (LA24_9==42) ) {
                    alt24=1;
                }
                else if ( (LA24_9==EOF||LA24_9==34) ) {
                    alt24=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1506:1: (this_QualifiedOperationRefCS_0= ruleQualifiedOperationRefCS | this_SimpleOperationRefCS_1= ruleSimpleOperationRefCS )", 24, 9, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1506:1: (this_QualifiedOperationRefCS_0= ruleQualifiedOperationRefCS | this_SimpleOperationRefCS_1= ruleSimpleOperationRefCS )", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1507:2: this_QualifiedOperationRefCS_0= ruleQualifiedOperationRefCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getOperationRefCSAccess().getQualifiedOperationRefCSParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedOperationRefCS_in_ruleOperationRefCS2730);
                    this_QualifiedOperationRefCS_0=ruleQualifiedOperationRefCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_QualifiedOperationRefCS_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1520:2: this_SimpleOperationRefCS_1= ruleSimpleOperationRefCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getOperationRefCSAccess().getSimpleOperationRefCSParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleOperationRefCS_in_ruleOperationRefCS2760);
                    this_SimpleOperationRefCS_1=ruleSimpleOperationRefCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SimpleOperationRefCS_1; 
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
    // $ANTLR end ruleOperationRefCS


    // $ANTLR start entryRulePackageDeclarationCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1539:1: entryRulePackageDeclarationCS returns [EObject current=null] : iv_rulePackageDeclarationCS= rulePackageDeclarationCS EOF ;
    public final EObject entryRulePackageDeclarationCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclarationCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1540:2: (iv_rulePackageDeclarationCS= rulePackageDeclarationCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1541:2: iv_rulePackageDeclarationCS= rulePackageDeclarationCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPackageDeclarationCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePackageDeclarationCS_in_entryRulePackageDeclarationCS2795);
            iv_rulePackageDeclarationCS=rulePackageDeclarationCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePackageDeclarationCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackageDeclarationCS2805); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePackageDeclarationCS


    // $ANTLR start rulePackageDeclarationCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1548:1: rulePackageDeclarationCS returns [EObject current=null] : ( 'package' ( (lv_package_1_0= rulePackageRefCS ) ) ( (lv_contexts_2_0= ruleContextDeclCS ) )* 'endpackage' ) ;
    public final EObject rulePackageDeclarationCS() throws RecognitionException {
        EObject current = null;

        EObject lv_package_1_0 = null;

        EObject lv_contexts_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1553:6: ( ( 'package' ( (lv_package_1_0= rulePackageRefCS ) ) ( (lv_contexts_2_0= ruleContextDeclCS ) )* 'endpackage' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1554:1: ( 'package' ( (lv_package_1_0= rulePackageRefCS ) ) ( (lv_contexts_2_0= ruleContextDeclCS ) )* 'endpackage' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1554:1: ( 'package' ( (lv_package_1_0= rulePackageRefCS ) ) ( (lv_contexts_2_0= ruleContextDeclCS ) )* 'endpackage' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1554:3: 'package' ( (lv_package_1_0= rulePackageRefCS ) ) ( (lv_contexts_2_0= ruleContextDeclCS ) )* 'endpackage'
            {
            match(input,38,FollowSets000.FOLLOW_38_in_rulePackageDeclarationCS2840); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPackageDeclarationCSAccess().getPackageKeyword_0(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1558:1: ( (lv_package_1_0= rulePackageRefCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1559:1: (lv_package_1_0= rulePackageRefCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1559:1: (lv_package_1_0= rulePackageRefCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1560:3: lv_package_1_0= rulePackageRefCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPackageDeclarationCSAccess().getPackagePackageRefCSParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePackageRefCS_in_rulePackageDeclarationCS2861);
            lv_package_1_0=rulePackageRefCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPackageDeclarationCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"package",
              	        		lv_package_1_0, 
              	        		"PackageRefCS", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1582:2: ( (lv_contexts_2_0= ruleContextDeclCS ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==16) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1583:1: (lv_contexts_2_0= ruleContextDeclCS )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1583:1: (lv_contexts_2_0= ruleContextDeclCS )
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1584:3: lv_contexts_2_0= ruleContextDeclCS
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPackageDeclarationCSAccess().getContextsContextDeclCSParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleContextDeclCS_in_rulePackageDeclarationCS2882);
            	    lv_contexts_2_0=ruleContextDeclCS();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getPackageDeclarationCSRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"contexts",
            	      	        		lv_contexts_2_0, 
            	      	        		"ContextDeclCS", 
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
            	    break loop25;
                }
            } while (true);

            match(input,39,FollowSets000.FOLLOW_39_in_rulePackageDeclarationCS2893); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPackageDeclarationCSAccess().getEndpackageKeyword_3(), null); 
                  
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
    // $ANTLR end rulePackageDeclarationCS


    // $ANTLR start entryRulePackageRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1618:1: entryRulePackageRefCS returns [EObject current=null] : iv_rulePackageRefCS= rulePackageRefCS EOF ;
    public final EObject entryRulePackageRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageRefCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1619:2: (iv_rulePackageRefCS= rulePackageRefCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1620:2: iv_rulePackageRefCS= rulePackageRefCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPackageRefCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePackageRefCS_in_entryRulePackageRefCS2929);
            iv_rulePackageRefCS=rulePackageRefCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePackageRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackageRefCS2939); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePackageRefCS


    // $ANTLR start rulePackageRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1627:1: rulePackageRefCS returns [EObject current=null] : (this_QualifiedPackageRefCS_0= ruleQualifiedPackageRefCS | this_SimplePackageRefCS_1= ruleSimplePackageRefCS ) ;
    public final EObject rulePackageRefCS() throws RecognitionException {
        EObject current = null;

        EObject this_QualifiedPackageRefCS_0 = null;

        EObject this_SimplePackageRefCS_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1632:6: ( (this_QualifiedPackageRefCS_0= ruleQualifiedPackageRefCS | this_SimplePackageRefCS_1= ruleSimplePackageRefCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1633:1: (this_QualifiedPackageRefCS_0= ruleQualifiedPackageRefCS | this_SimplePackageRefCS_1= ruleSimplePackageRefCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1633:1: (this_QualifiedPackageRefCS_0= ruleQualifiedPackageRefCS | this_SimplePackageRefCS_1= ruleSimplePackageRefCS )
            int alt26=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==EOF||LA26_1==16||LA26_1==39) ) {
                    alt26=2;
                }
                else if ( (LA26_1==42) ) {
                    alt26=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1633:1: (this_QualifiedPackageRefCS_0= ruleQualifiedPackageRefCS | this_SimplePackageRefCS_1= ruleSimplePackageRefCS )", 26, 1, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==EOF||LA26_2==16||LA26_2==39) ) {
                    alt26=2;
                }
                else if ( (LA26_2==42) ) {
                    alt26=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1633:1: (this_QualifiedPackageRefCS_0= ruleQualifiedPackageRefCS | this_SimplePackageRefCS_1= ruleSimplePackageRefCS )", 26, 2, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA26_3 = input.LA(2);

                if ( (LA26_3==EOF||LA26_3==16||LA26_3==39) ) {
                    alt26=2;
                }
                else if ( (LA26_3==42) ) {
                    alt26=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1633:1: (this_QualifiedPackageRefCS_0= ruleQualifiedPackageRefCS | this_SimplePackageRefCS_1= ruleSimplePackageRefCS )", 26, 3, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA26_4 = input.LA(2);

                if ( (LA26_4==42) ) {
                    alt26=1;
                }
                else if ( (LA26_4==EOF||LA26_4==16||LA26_4==39) ) {
                    alt26=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1633:1: (this_QualifiedPackageRefCS_0= ruleQualifiedPackageRefCS | this_SimplePackageRefCS_1= ruleSimplePackageRefCS )", 26, 4, input);

                    throw nvae;
                }
                }
                break;
            case 63:
                {
                int LA26_5 = input.LA(2);

                if ( (LA26_5==EOF||LA26_5==16||LA26_5==39) ) {
                    alt26=2;
                }
                else if ( (LA26_5==42) ) {
                    alt26=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1633:1: (this_QualifiedPackageRefCS_0= ruleQualifiedPackageRefCS | this_SimplePackageRefCS_1= ruleSimplePackageRefCS )", 26, 5, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                int LA26_6 = input.LA(2);

                if ( (LA26_6==42) ) {
                    alt26=1;
                }
                else if ( (LA26_6==EOF||LA26_6==16||LA26_6==39) ) {
                    alt26=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1633:1: (this_QualifiedPackageRefCS_0= ruleQualifiedPackageRefCS | this_SimplePackageRefCS_1= ruleSimplePackageRefCS )", 26, 6, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                int LA26_7 = input.LA(2);

                if ( (LA26_7==42) ) {
                    alt26=1;
                }
                else if ( (LA26_7==EOF||LA26_7==16||LA26_7==39) ) {
                    alt26=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1633:1: (this_QualifiedPackageRefCS_0= ruleQualifiedPackageRefCS | this_SimplePackageRefCS_1= ruleSimplePackageRefCS )", 26, 7, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                int LA26_8 = input.LA(2);

                if ( (LA26_8==EOF||LA26_8==16||LA26_8==39) ) {
                    alt26=2;
                }
                else if ( (LA26_8==42) ) {
                    alt26=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1633:1: (this_QualifiedPackageRefCS_0= ruleQualifiedPackageRefCS | this_SimplePackageRefCS_1= ruleSimplePackageRefCS )", 26, 8, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                int LA26_9 = input.LA(2);

                if ( (LA26_9==EOF||LA26_9==16||LA26_9==39) ) {
                    alt26=2;
                }
                else if ( (LA26_9==42) ) {
                    alt26=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1633:1: (this_QualifiedPackageRefCS_0= ruleQualifiedPackageRefCS | this_SimplePackageRefCS_1= ruleSimplePackageRefCS )", 26, 9, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1633:1: (this_QualifiedPackageRefCS_0= ruleQualifiedPackageRefCS | this_SimplePackageRefCS_1= ruleSimplePackageRefCS )", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1634:2: this_QualifiedPackageRefCS_0= ruleQualifiedPackageRefCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPackageRefCSAccess().getQualifiedPackageRefCSParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedPackageRefCS_in_rulePackageRefCS2989);
                    this_QualifiedPackageRefCS_0=ruleQualifiedPackageRefCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_QualifiedPackageRefCS_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1647:2: this_SimplePackageRefCS_1= ruleSimplePackageRefCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPackageRefCSAccess().getSimplePackageRefCSParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSimplePackageRefCS_in_rulePackageRefCS3019);
                    this_SimplePackageRefCS_1=ruleSimplePackageRefCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SimplePackageRefCS_1; 
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
    // $ANTLR end rulePackageRefCS


    // $ANTLR start entryRuleParameterCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1666:1: entryRuleParameterCS returns [EObject current=null] : iv_ruleParameterCS= ruleParameterCS EOF ;
    public final EObject entryRuleParameterCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1667:2: (iv_ruleParameterCS= ruleParameterCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1668:2: iv_ruleParameterCS= ruleParameterCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParameterCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameterCS_in_entryRuleParameterCS3054);
            iv_ruleParameterCS=ruleParameterCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParameterCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterCS3064); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParameterCS


    // $ANTLR start ruleParameterCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1675:1: ruleParameterCS returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' )? ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleParameterCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1680:6: ( ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' )? ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1681:1: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' )? ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1681:1: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' )? ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1681:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' )? ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1681:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' )?
            int alt27=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==32) ) {
                        alt27=1;
                    }
                    }
                    break;
                case 46:
                    {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==32) ) {
                        alt27=1;
                    }
                    }
                    break;
                case 47:
                    {
                    int LA27_3 = input.LA(2);

                    if ( (LA27_3==32) ) {
                        alt27=1;
                    }
                    }
                    break;
                case 15:
                    {
                    int LA27_4 = input.LA(2);

                    if ( (LA27_4==32) ) {
                        alt27=1;
                    }
                    }
                    break;
                case 63:
                    {
                    int LA27_5 = input.LA(2);

                    if ( (LA27_5==32) ) {
                        alt27=1;
                    }
                    }
                    break;
                case 20:
                    {
                    int LA27_6 = input.LA(2);

                    if ( (LA27_6==32) ) {
                        alt27=1;
                    }
                    }
                    break;
                case 21:
                    {
                    int LA27_7 = input.LA(2);

                    if ( (LA27_7==32) ) {
                        alt27=1;
                    }
                    }
                    break;
                case 40:
                    {
                    int LA27_8 = input.LA(2);

                    if ( (LA27_8==32) ) {
                        alt27=1;
                    }
                    }
                    break;
                case 41:
                    {
                    int LA27_9 = input.LA(2);

                    if ( (LA27_9==32) ) {
                        alt27=1;
                    }
                    }
                    break;
                case 16:
                    {
                    int LA27_10 = input.LA(2);

                    if ( (LA27_10==32) ) {
                        alt27=1;
                    }
                    }
                    break;
                case 17:
                    {
                    int LA27_11 = input.LA(2);

                    if ( (LA27_11==32) ) {
                        alt27=1;
                    }
                    }
                    break;
                case 18:
                    {
                    int LA27_12 = input.LA(2);

                    if ( (LA27_12==32) ) {
                        alt27=1;
                    }
                    }
                    break;
                case 19:
                    {
                    int LA27_13 = input.LA(2);

                    if ( (LA27_13==32) ) {
                        alt27=1;
                    }
                    }
                    break;
            }

            switch (alt27) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1681:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) ':'
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1681:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1682:1: (lv_name_0_0= ruleUnrestrictedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1682:1: (lv_name_0_0= ruleUnrestrictedName )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1683:3: lv_name_0_0= ruleUnrestrictedName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getParameterCSAccess().getNameUnrestrictedNameParserRuleCall_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleParameterCS3111);
                    lv_name_0_0=ruleUnrestrictedName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getParameterCSRule().getType().getClassifier());
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

                    match(input,32,FollowSets000.FOLLOW_32_in_ruleParameterCS3121); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParameterCSAccess().getColonKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1709:3: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1710:1: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1710:1: (lv_ownedType_2_0= ruleTypeExpCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1711:3: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getParameterCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleParameterCS3144);
            lv_ownedType_2_0=ruleTypeExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getParameterCSRule().getType().getClassifier());
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
    // $ANTLR end ruleParameterCS


    // $ANTLR start entryRulePostCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1741:1: entryRulePostCS returns [EObject current=null] : iv_rulePostCS= rulePostCS EOF ;
    public final EObject entryRulePostCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1742:2: (iv_rulePostCS= rulePostCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1743:2: iv_rulePostCS= rulePostCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPostCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePostCS_in_entryRulePostCS3180);
            iv_rulePostCS=rulePostCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePostCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePostCS3190); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePostCS


    // $ANTLR start rulePostCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1750:1: rulePostCS returns [EObject current=null] : ( ( (lv_stereotype_0_0= 'post' ) ) ( (lv_name_1_0= ruleUnrestrictedName ) )? ':' ( (lv_ownedExpression_3_0= ruleExpCS ) ) ) ;
    public final EObject rulePostCS() throws RecognitionException {
        EObject current = null;

        Token lv_stereotype_0_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedExpression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1755:6: ( ( ( (lv_stereotype_0_0= 'post' ) ) ( (lv_name_1_0= ruleUnrestrictedName ) )? ':' ( (lv_ownedExpression_3_0= ruleExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1756:1: ( ( (lv_stereotype_0_0= 'post' ) ) ( (lv_name_1_0= ruleUnrestrictedName ) )? ':' ( (lv_ownedExpression_3_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1756:1: ( ( (lv_stereotype_0_0= 'post' ) ) ( (lv_name_1_0= ruleUnrestrictedName ) )? ':' ( (lv_ownedExpression_3_0= ruleExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1756:2: ( (lv_stereotype_0_0= 'post' ) ) ( (lv_name_1_0= ruleUnrestrictedName ) )? ':' ( (lv_ownedExpression_3_0= ruleExpCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1756:2: ( (lv_stereotype_0_0= 'post' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1757:1: (lv_stereotype_0_0= 'post' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1757:1: (lv_stereotype_0_0= 'post' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1758:3: lv_stereotype_0_0= 'post'
            {
            lv_stereotype_0_0=(Token)input.LT(1);
            match(input,40,FollowSets000.FOLLOW_40_in_rulePostCS3233); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPostCSAccess().getStereotypePostKeyword_0_0(), "stereotype"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPostCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "stereotype", lv_stereotype_0_0, "post", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1777:2: ( (lv_name_1_0= ruleUnrestrictedName ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID||(LA28_0>=15 && LA28_0<=21)||(LA28_0>=40 && LA28_0<=41)||(LA28_0>=46 && LA28_0<=47)||LA28_0==63) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1778:1: (lv_name_1_0= ruleUnrestrictedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1778:1: (lv_name_1_0= ruleUnrestrictedName )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1779:3: lv_name_1_0= ruleUnrestrictedName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPostCSAccess().getNameUnrestrictedNameParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_rulePostCS3267);
                    lv_name_1_0=ruleUnrestrictedName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPostCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_1_0, 
                      	        		"UnrestrictedName", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,32,FollowSets000.FOLLOW_32_in_rulePostCS3278); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPostCSAccess().getColonKeyword_2(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1805:1: ( (lv_ownedExpression_3_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1806:1: (lv_ownedExpression_3_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1806:1: (lv_ownedExpression_3_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1807:3: lv_ownedExpression_3_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPostCSAccess().getOwnedExpressionExpCSParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_rulePostCS3299);
            lv_ownedExpression_3_0=ruleExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPostCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"ownedExpression",
              	        		lv_ownedExpression_3_0, 
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
    // $ANTLR end rulePostCS


    // $ANTLR start entryRulePreCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1837:1: entryRulePreCS returns [EObject current=null] : iv_rulePreCS= rulePreCS EOF ;
    public final EObject entryRulePreCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1838:2: (iv_rulePreCS= rulePreCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1839:2: iv_rulePreCS= rulePreCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPreCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePreCS_in_entryRulePreCS3335);
            iv_rulePreCS=rulePreCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePreCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePreCS3345); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePreCS


    // $ANTLR start rulePreCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1846:1: rulePreCS returns [EObject current=null] : ( ( (lv_stereotype_0_0= 'pre' ) ) ( (lv_name_1_0= ruleUnrestrictedName ) )? ':' ( (lv_ownedExpression_3_0= ruleExpCS ) ) ) ;
    public final EObject rulePreCS() throws RecognitionException {
        EObject current = null;

        Token lv_stereotype_0_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedExpression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1851:6: ( ( ( (lv_stereotype_0_0= 'pre' ) ) ( (lv_name_1_0= ruleUnrestrictedName ) )? ':' ( (lv_ownedExpression_3_0= ruleExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1852:1: ( ( (lv_stereotype_0_0= 'pre' ) ) ( (lv_name_1_0= ruleUnrestrictedName ) )? ':' ( (lv_ownedExpression_3_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1852:1: ( ( (lv_stereotype_0_0= 'pre' ) ) ( (lv_name_1_0= ruleUnrestrictedName ) )? ':' ( (lv_ownedExpression_3_0= ruleExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1852:2: ( (lv_stereotype_0_0= 'pre' ) ) ( (lv_name_1_0= ruleUnrestrictedName ) )? ':' ( (lv_ownedExpression_3_0= ruleExpCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1852:2: ( (lv_stereotype_0_0= 'pre' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1853:1: (lv_stereotype_0_0= 'pre' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1853:1: (lv_stereotype_0_0= 'pre' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1854:3: lv_stereotype_0_0= 'pre'
            {
            lv_stereotype_0_0=(Token)input.LT(1);
            match(input,41,FollowSets000.FOLLOW_41_in_rulePreCS3388); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPreCSAccess().getStereotypePreKeyword_0_0(), "stereotype"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPreCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "stereotype", lv_stereotype_0_0, "pre", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1873:2: ( (lv_name_1_0= ruleUnrestrictedName ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||(LA29_0>=15 && LA29_0<=21)||(LA29_0>=40 && LA29_0<=41)||(LA29_0>=46 && LA29_0<=47)||LA29_0==63) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1874:1: (lv_name_1_0= ruleUnrestrictedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1874:1: (lv_name_1_0= ruleUnrestrictedName )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1875:3: lv_name_1_0= ruleUnrestrictedName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPreCSAccess().getNameUnrestrictedNameParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_rulePreCS3422);
                    lv_name_1_0=ruleUnrestrictedName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPreCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_1_0, 
                      	        		"UnrestrictedName", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,32,FollowSets000.FOLLOW_32_in_rulePreCS3433); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPreCSAccess().getColonKeyword_2(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1901:1: ( (lv_ownedExpression_3_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1902:1: (lv_ownedExpression_3_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1902:1: (lv_ownedExpression_3_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1903:3: lv_ownedExpression_3_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPreCSAccess().getOwnedExpressionExpCSParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_rulePreCS3454);
            lv_ownedExpression_3_0=ruleExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPreCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"ownedExpression",
              	        		lv_ownedExpression_3_0, 
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
    // $ANTLR end rulePreCS


    // $ANTLR start entryRulePropertyContextDeclCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1933:1: entryRulePropertyContextDeclCS returns [EObject current=null] : iv_rulePropertyContextDeclCS= rulePropertyContextDeclCS EOF ;
    public final EObject entryRulePropertyContextDeclCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyContextDeclCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1934:2: (iv_rulePropertyContextDeclCS= rulePropertyContextDeclCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1935:2: iv_rulePropertyContextDeclCS= rulePropertyContextDeclCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPropertyContextDeclCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePropertyContextDeclCS_in_entryRulePropertyContextDeclCS3490);
            iv_rulePropertyContextDeclCS=rulePropertyContextDeclCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePropertyContextDeclCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyContextDeclCS3500); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePropertyContextDeclCS


    // $ANTLR start rulePropertyContextDeclCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1942:1: rulePropertyContextDeclCS returns [EObject current=null] : ( 'context' ( (lv_property_1_0= rulePropertyRefCS ) ) ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( ( (lv_init_4_0= ruleInitCS ) ) ( (lv_der_5_0= ruleDerCS ) )? )? | ( ( (lv_der_6_0= ruleDerCS ) ) ( (lv_init_7_0= ruleInitCS ) )? ) ) ) ;
    public final EObject rulePropertyContextDeclCS() throws RecognitionException {
        EObject current = null;

        EObject lv_property_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_init_4_0 = null;

        EObject lv_der_5_0 = null;

        EObject lv_der_6_0 = null;

        EObject lv_init_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1947:6: ( ( 'context' ( (lv_property_1_0= rulePropertyRefCS ) ) ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( ( (lv_init_4_0= ruleInitCS ) ) ( (lv_der_5_0= ruleDerCS ) )? )? | ( ( (lv_der_6_0= ruleDerCS ) ) ( (lv_init_7_0= ruleInitCS ) )? ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1948:1: ( 'context' ( (lv_property_1_0= rulePropertyRefCS ) ) ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( ( (lv_init_4_0= ruleInitCS ) ) ( (lv_der_5_0= ruleDerCS ) )? )? | ( ( (lv_der_6_0= ruleDerCS ) ) ( (lv_init_7_0= ruleInitCS ) )? ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1948:1: ( 'context' ( (lv_property_1_0= rulePropertyRefCS ) ) ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( ( (lv_init_4_0= ruleInitCS ) ) ( (lv_der_5_0= ruleDerCS ) )? )? | ( ( (lv_der_6_0= ruleDerCS ) ) ( (lv_init_7_0= ruleInitCS ) )? ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1948:3: 'context' ( (lv_property_1_0= rulePropertyRefCS ) ) ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( ( (lv_init_4_0= ruleInitCS ) ) ( (lv_der_5_0= ruleDerCS ) )? )? | ( ( (lv_der_6_0= ruleDerCS ) ) ( (lv_init_7_0= ruleInitCS ) )? ) )
            {
            match(input,16,FollowSets000.FOLLOW_16_in_rulePropertyContextDeclCS3535); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPropertyContextDeclCSAccess().getContextKeyword_0(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1952:1: ( (lv_property_1_0= rulePropertyRefCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1953:1: (lv_property_1_0= rulePropertyRefCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1953:1: (lv_property_1_0= rulePropertyRefCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1954:3: lv_property_1_0= rulePropertyRefCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPropertyContextDeclCSAccess().getPropertyPropertyRefCSParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePropertyRefCS_in_rulePropertyContextDeclCS3556);
            lv_property_1_0=rulePropertyRefCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPropertyContextDeclCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"property",
              	        		lv_property_1_0, 
              	        		"PropertyRefCS", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,32,FollowSets000.FOLLOW_32_in_rulePropertyContextDeclCS3566); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPropertyContextDeclCSAccess().getColonKeyword_2(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1980:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1981:1: (lv_ownedType_3_0= ruleTypeExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1981:1: (lv_ownedType_3_0= ruleTypeExpCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1982:3: lv_ownedType_3_0= ruleTypeExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPropertyContextDeclCSAccess().getOwnedTypeTypeExpCSParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_rulePropertyContextDeclCS3587);
            lv_ownedType_3_0=ruleTypeExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPropertyContextDeclCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"ownedType",
              	        		lv_ownedType_3_0, 
              	        		"TypeExpCS", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2004:2: ( ( ( (lv_init_4_0= ruleInitCS ) ) ( (lv_der_5_0= ruleDerCS ) )? )? | ( ( (lv_der_6_0= ruleDerCS ) ) ( (lv_init_7_0= ruleInitCS ) )? ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==EOF||LA33_0==16||LA33_0==20||(LA33_0>=38 && LA33_0<=39)) ) {
                alt33=1;
            }
            else if ( (LA33_0==18) ) {
                alt33=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2004:2: ( ( ( (lv_init_4_0= ruleInitCS ) ) ( (lv_der_5_0= ruleDerCS ) )? )? | ( ( (lv_der_6_0= ruleDerCS ) ) ( (lv_init_7_0= ruleInitCS ) )? ) )", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2004:3: ( ( (lv_init_4_0= ruleInitCS ) ) ( (lv_der_5_0= ruleDerCS ) )? )?
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2004:3: ( ( (lv_init_4_0= ruleInitCS ) ) ( (lv_der_5_0= ruleDerCS ) )? )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==20) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2004:4: ( (lv_init_4_0= ruleInitCS ) ) ( (lv_der_5_0= ruleDerCS ) )?
                            {
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2004:4: ( (lv_init_4_0= ruleInitCS ) )
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2005:1: (lv_init_4_0= ruleInitCS )
                            {
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2005:1: (lv_init_4_0= ruleInitCS )
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2006:3: lv_init_4_0= ruleInitCS
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getPropertyContextDeclCSAccess().getInitInitCSParserRuleCall_4_0_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleInitCS_in_rulePropertyContextDeclCS3610);
                            lv_init_4_0=ruleInitCS();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getPropertyContextDeclCSRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"init",
                              	        		lv_init_4_0, 
                              	        		"InitCS", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2028:2: ( (lv_der_5_0= ruleDerCS ) )?
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( (LA30_0==18) ) {
                                alt30=1;
                            }
                            switch (alt30) {
                                case 1 :
                                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2029:1: (lv_der_5_0= ruleDerCS )
                                    {
                                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2029:1: (lv_der_5_0= ruleDerCS )
                                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2030:3: lv_der_5_0= ruleDerCS
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      	        currentNode=createCompositeNode(grammarAccess.getPropertyContextDeclCSAccess().getDerDerCSParserRuleCall_4_0_1_0(), currentNode); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleDerCS_in_rulePropertyContextDeclCS3631);
                                    lv_der_5_0=ruleDerCS();
                                    _fsp--;
                                    if (failed) return current;
                                    if ( backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = factory.create(grammarAccess.getPropertyContextDeclCSRule().getType().getClassifier());
                                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                                      	        }
                                      	        try {
                                      	       		set(
                                      	       			current, 
                                      	       			"der",
                                      	        		lv_der_5_0, 
                                      	        		"DerCS", 
                                      	        		currentNode);
                                      	        } catch (ValueConverterException vce) {
                                      				handleValueConverterException(vce);
                                      	        }
                                      	        currentNode = currentNode.getParent();
                                      	    
                                    }

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2053:6: ( ( (lv_der_6_0= ruleDerCS ) ) ( (lv_init_7_0= ruleInitCS ) )? )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2053:6: ( ( (lv_der_6_0= ruleDerCS ) ) ( (lv_init_7_0= ruleInitCS ) )? )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2053:7: ( (lv_der_6_0= ruleDerCS ) ) ( (lv_init_7_0= ruleInitCS ) )?
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2053:7: ( (lv_der_6_0= ruleDerCS ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2054:1: (lv_der_6_0= ruleDerCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2054:1: (lv_der_6_0= ruleDerCS )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2055:3: lv_der_6_0= ruleDerCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPropertyContextDeclCSAccess().getDerDerCSParserRuleCall_4_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDerCS_in_rulePropertyContextDeclCS3662);
                    lv_der_6_0=ruleDerCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPropertyContextDeclCSRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"der",
                      	        		lv_der_6_0, 
                      	        		"DerCS", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2077:2: ( (lv_init_7_0= ruleInitCS ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==20) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2078:1: (lv_init_7_0= ruleInitCS )
                            {
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2078:1: (lv_init_7_0= ruleInitCS )
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2079:3: lv_init_7_0= ruleInitCS
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getPropertyContextDeclCSAccess().getInitInitCSParserRuleCall_4_1_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleInitCS_in_rulePropertyContextDeclCS3683);
                            lv_init_7_0=ruleInitCS();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getPropertyContextDeclCSRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"init",
                              	        		lv_init_7_0, 
                              	        		"InitCS", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;

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
    // $ANTLR end rulePropertyContextDeclCS


    // $ANTLR start entryRulePropertyRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2109:1: entryRulePropertyRefCS returns [EObject current=null] : iv_rulePropertyRefCS= rulePropertyRefCS EOF ;
    public final EObject entryRulePropertyRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRefCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2110:2: (iv_rulePropertyRefCS= rulePropertyRefCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2111:2: iv_rulePropertyRefCS= rulePropertyRefCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPropertyRefCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePropertyRefCS_in_entryRulePropertyRefCS3722);
            iv_rulePropertyRefCS=rulePropertyRefCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePropertyRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyRefCS3732); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePropertyRefCS


    // $ANTLR start rulePropertyRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2118:1: rulePropertyRefCS returns [EObject current=null] : (this_QualifiedPropertyRefCS_0= ruleQualifiedPropertyRefCS | this_SimplePropertyRefCS_1= ruleSimplePropertyRefCS ) ;
    public final EObject rulePropertyRefCS() throws RecognitionException {
        EObject current = null;

        EObject this_QualifiedPropertyRefCS_0 = null;

        EObject this_SimplePropertyRefCS_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2123:6: ( (this_QualifiedPropertyRefCS_0= ruleQualifiedPropertyRefCS | this_SimplePropertyRefCS_1= ruleSimplePropertyRefCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2124:1: (this_QualifiedPropertyRefCS_0= ruleQualifiedPropertyRefCS | this_SimplePropertyRefCS_1= ruleSimplePropertyRefCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2124:1: (this_QualifiedPropertyRefCS_0= ruleQualifiedPropertyRefCS | this_SimplePropertyRefCS_1= ruleSimplePropertyRefCS )
            int alt34=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==42) ) {
                    alt34=1;
                }
                else if ( (LA34_1==EOF||LA34_1==32) ) {
                    alt34=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2124:1: (this_QualifiedPropertyRefCS_0= ruleQualifiedPropertyRefCS | this_SimplePropertyRefCS_1= ruleSimplePropertyRefCS )", 34, 1, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                int LA34_2 = input.LA(2);

                if ( (LA34_2==EOF||LA34_2==32) ) {
                    alt34=2;
                }
                else if ( (LA34_2==42) ) {
                    alt34=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2124:1: (this_QualifiedPropertyRefCS_0= ruleQualifiedPropertyRefCS | this_SimplePropertyRefCS_1= ruleSimplePropertyRefCS )", 34, 2, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA34_3 = input.LA(2);

                if ( (LA34_3==42) ) {
                    alt34=1;
                }
                else if ( (LA34_3==EOF||LA34_3==32) ) {
                    alt34=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2124:1: (this_QualifiedPropertyRefCS_0= ruleQualifiedPropertyRefCS | this_SimplePropertyRefCS_1= ruleSimplePropertyRefCS )", 34, 3, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA34_4 = input.LA(2);

                if ( (LA34_4==EOF||LA34_4==32) ) {
                    alt34=2;
                }
                else if ( (LA34_4==42) ) {
                    alt34=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2124:1: (this_QualifiedPropertyRefCS_0= ruleQualifiedPropertyRefCS | this_SimplePropertyRefCS_1= ruleSimplePropertyRefCS )", 34, 4, input);

                    throw nvae;
                }
                }
                break;
            case 63:
                {
                int LA34_5 = input.LA(2);

                if ( (LA34_5==EOF||LA34_5==32) ) {
                    alt34=2;
                }
                else if ( (LA34_5==42) ) {
                    alt34=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2124:1: (this_QualifiedPropertyRefCS_0= ruleQualifiedPropertyRefCS | this_SimplePropertyRefCS_1= ruleSimplePropertyRefCS )", 34, 5, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                int LA34_6 = input.LA(2);

                if ( (LA34_6==EOF||LA34_6==32) ) {
                    alt34=2;
                }
                else if ( (LA34_6==42) ) {
                    alt34=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2124:1: (this_QualifiedPropertyRefCS_0= ruleQualifiedPropertyRefCS | this_SimplePropertyRefCS_1= ruleSimplePropertyRefCS )", 34, 6, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                int LA34_7 = input.LA(2);

                if ( (LA34_7==42) ) {
                    alt34=1;
                }
                else if ( (LA34_7==EOF||LA34_7==32) ) {
                    alt34=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2124:1: (this_QualifiedPropertyRefCS_0= ruleQualifiedPropertyRefCS | this_SimplePropertyRefCS_1= ruleSimplePropertyRefCS )", 34, 7, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                int LA34_8 = input.LA(2);

                if ( (LA34_8==42) ) {
                    alt34=1;
                }
                else if ( (LA34_8==EOF||LA34_8==32) ) {
                    alt34=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2124:1: (this_QualifiedPropertyRefCS_0= ruleQualifiedPropertyRefCS | this_SimplePropertyRefCS_1= ruleSimplePropertyRefCS )", 34, 8, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                int LA34_9 = input.LA(2);

                if ( (LA34_9==42) ) {
                    alt34=1;
                }
                else if ( (LA34_9==EOF||LA34_9==32) ) {
                    alt34=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2124:1: (this_QualifiedPropertyRefCS_0= ruleQualifiedPropertyRefCS | this_SimplePropertyRefCS_1= ruleSimplePropertyRefCS )", 34, 9, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2124:1: (this_QualifiedPropertyRefCS_0= ruleQualifiedPropertyRefCS | this_SimplePropertyRefCS_1= ruleSimplePropertyRefCS )", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2125:2: this_QualifiedPropertyRefCS_0= ruleQualifiedPropertyRefCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPropertyRefCSAccess().getQualifiedPropertyRefCSParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedPropertyRefCS_in_rulePropertyRefCS3782);
                    this_QualifiedPropertyRefCS_0=ruleQualifiedPropertyRefCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_QualifiedPropertyRefCS_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2138:2: this_SimplePropertyRefCS_1= ruleSimplePropertyRefCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPropertyRefCSAccess().getSimplePropertyRefCSParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSimplePropertyRefCS_in_rulePropertyRefCS3812);
                    this_SimplePropertyRefCS_1=ruleSimplePropertyRefCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SimplePropertyRefCS_1; 
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
    // $ANTLR end rulePropertyRefCS


    // $ANTLR start entryRuleQualifiedClassifierRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2157:1: entryRuleQualifiedClassifierRefCS returns [EObject current=null] : iv_ruleQualifiedClassifierRefCS= ruleQualifiedClassifierRefCS EOF ;
    public final EObject entryRuleQualifiedClassifierRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedClassifierRefCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2158:2: (iv_ruleQualifiedClassifierRefCS= ruleQualifiedClassifierRefCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2159:2: iv_ruleQualifiedClassifierRefCS= ruleQualifiedClassifierRefCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getQualifiedClassifierRefCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedClassifierRefCS_in_entryRuleQualifiedClassifierRefCS3847);
            iv_ruleQualifiedClassifierRefCS=ruleQualifiedClassifierRefCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleQualifiedClassifierRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedClassifierRefCS3857); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleQualifiedClassifierRefCS


    // $ANTLR start ruleQualifiedClassifierRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2166:1: ruleQualifiedClassifierRefCS returns [EObject current=null] : ( ( ( ruleIdentifier ) ) '::' ( (lv_element_2_0= ruleClassifierRefCS ) ) ) ;
    public final EObject ruleQualifiedClassifierRefCS() throws RecognitionException {
        EObject current = null;

        EObject lv_element_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2171:6: ( ( ( ( ruleIdentifier ) ) '::' ( (lv_element_2_0= ruleClassifierRefCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2172:1: ( ( ( ruleIdentifier ) ) '::' ( (lv_element_2_0= ruleClassifierRefCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2172:1: ( ( ( ruleIdentifier ) ) '::' ( (lv_element_2_0= ruleClassifierRefCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2172:2: ( ( ruleIdentifier ) ) '::' ( (lv_element_2_0= ruleClassifierRefCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2172:2: ( ( ruleIdentifier ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2173:1: ( ruleIdentifier )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2173:1: ( ruleIdentifier )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2174:3: ruleIdentifier
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getQualifiedClassifierRefCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getQualifiedClassifierRefCSAccess().getNamespaceNamespaceCrossReference_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleQualifiedClassifierRefCS3909);
            ruleIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,42,FollowSets000.FOLLOW_42_in_ruleQualifiedClassifierRefCS3919); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getQualifiedClassifierRefCSAccess().getColonColonKeyword_1(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2195:1: ( (lv_element_2_0= ruleClassifierRefCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2196:1: (lv_element_2_0= ruleClassifierRefCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2196:1: (lv_element_2_0= ruleClassifierRefCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2197:3: lv_element_2_0= ruleClassifierRefCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getQualifiedClassifierRefCSAccess().getElementClassifierRefCSParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassifierRefCS_in_ruleQualifiedClassifierRefCS3940);
            lv_element_2_0=ruleClassifierRefCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getQualifiedClassifierRefCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"element",
              	        		lv_element_2_0, 
              	        		"ClassifierRefCS", 
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
    // $ANTLR end ruleQualifiedClassifierRefCS


    // $ANTLR start entryRuleQualifiedOperationRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2227:1: entryRuleQualifiedOperationRefCS returns [EObject current=null] : iv_ruleQualifiedOperationRefCS= ruleQualifiedOperationRefCS EOF ;
    public final EObject entryRuleQualifiedOperationRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedOperationRefCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2228:2: (iv_ruleQualifiedOperationRefCS= ruleQualifiedOperationRefCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2229:2: iv_ruleQualifiedOperationRefCS= ruleQualifiedOperationRefCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getQualifiedOperationRefCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedOperationRefCS_in_entryRuleQualifiedOperationRefCS3976);
            iv_ruleQualifiedOperationRefCS=ruleQualifiedOperationRefCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleQualifiedOperationRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedOperationRefCS3986); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleQualifiedOperationRefCS


    // $ANTLR start ruleQualifiedOperationRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2236:1: ruleQualifiedOperationRefCS returns [EObject current=null] : ( ( ( ruleIdentifier ) ) '::' ( (lv_element_2_0= ruleOperationRefCS ) ) ) ;
    public final EObject ruleQualifiedOperationRefCS() throws RecognitionException {
        EObject current = null;

        EObject lv_element_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2241:6: ( ( ( ( ruleIdentifier ) ) '::' ( (lv_element_2_0= ruleOperationRefCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2242:1: ( ( ( ruleIdentifier ) ) '::' ( (lv_element_2_0= ruleOperationRefCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2242:1: ( ( ( ruleIdentifier ) ) '::' ( (lv_element_2_0= ruleOperationRefCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2242:2: ( ( ruleIdentifier ) ) '::' ( (lv_element_2_0= ruleOperationRefCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2242:2: ( ( ruleIdentifier ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2243:1: ( ruleIdentifier )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2243:1: ( ruleIdentifier )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2244:3: ruleIdentifier
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getQualifiedOperationRefCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getQualifiedOperationRefCSAccess().getNamespaceNamespaceCrossReference_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleQualifiedOperationRefCS4038);
            ruleIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,42,FollowSets000.FOLLOW_42_in_ruleQualifiedOperationRefCS4048); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getQualifiedOperationRefCSAccess().getColonColonKeyword_1(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2265:1: ( (lv_element_2_0= ruleOperationRefCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2266:1: (lv_element_2_0= ruleOperationRefCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2266:1: (lv_element_2_0= ruleOperationRefCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2267:3: lv_element_2_0= ruleOperationRefCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getQualifiedOperationRefCSAccess().getElementOperationRefCSParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperationRefCS_in_ruleQualifiedOperationRefCS4069);
            lv_element_2_0=ruleOperationRefCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getQualifiedOperationRefCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"element",
              	        		lv_element_2_0, 
              	        		"OperationRefCS", 
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
    // $ANTLR end ruleQualifiedOperationRefCS


    // $ANTLR start entryRuleQualifiedPropertyRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2297:1: entryRuleQualifiedPropertyRefCS returns [EObject current=null] : iv_ruleQualifiedPropertyRefCS= ruleQualifiedPropertyRefCS EOF ;
    public final EObject entryRuleQualifiedPropertyRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedPropertyRefCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2298:2: (iv_ruleQualifiedPropertyRefCS= ruleQualifiedPropertyRefCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2299:2: iv_ruleQualifiedPropertyRefCS= ruleQualifiedPropertyRefCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getQualifiedPropertyRefCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedPropertyRefCS_in_entryRuleQualifiedPropertyRefCS4105);
            iv_ruleQualifiedPropertyRefCS=ruleQualifiedPropertyRefCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleQualifiedPropertyRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedPropertyRefCS4115); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleQualifiedPropertyRefCS


    // $ANTLR start ruleQualifiedPropertyRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2306:1: ruleQualifiedPropertyRefCS returns [EObject current=null] : ( ( ( ruleIdentifier ) ) '::' ( (lv_element_2_0= rulePropertyRefCS ) ) ) ;
    public final EObject ruleQualifiedPropertyRefCS() throws RecognitionException {
        EObject current = null;

        EObject lv_element_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2311:6: ( ( ( ( ruleIdentifier ) ) '::' ( (lv_element_2_0= rulePropertyRefCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2312:1: ( ( ( ruleIdentifier ) ) '::' ( (lv_element_2_0= rulePropertyRefCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2312:1: ( ( ( ruleIdentifier ) ) '::' ( (lv_element_2_0= rulePropertyRefCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2312:2: ( ( ruleIdentifier ) ) '::' ( (lv_element_2_0= rulePropertyRefCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2312:2: ( ( ruleIdentifier ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2313:1: ( ruleIdentifier )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2313:1: ( ruleIdentifier )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2314:3: ruleIdentifier
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getQualifiedPropertyRefCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getQualifiedPropertyRefCSAccess().getNamespaceNamespaceCrossReference_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleQualifiedPropertyRefCS4167);
            ruleIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,42,FollowSets000.FOLLOW_42_in_ruleQualifiedPropertyRefCS4177); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getQualifiedPropertyRefCSAccess().getColonColonKeyword_1(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2335:1: ( (lv_element_2_0= rulePropertyRefCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2336:1: (lv_element_2_0= rulePropertyRefCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2336:1: (lv_element_2_0= rulePropertyRefCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2337:3: lv_element_2_0= rulePropertyRefCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getQualifiedPropertyRefCSAccess().getElementPropertyRefCSParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePropertyRefCS_in_ruleQualifiedPropertyRefCS4198);
            lv_element_2_0=rulePropertyRefCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getQualifiedPropertyRefCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"element",
              	        		lv_element_2_0, 
              	        		"PropertyRefCS", 
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
    // $ANTLR end ruleQualifiedPropertyRefCS


    // $ANTLR start entryRuleQualifiedPackageRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2367:1: entryRuleQualifiedPackageRefCS returns [EObject current=null] : iv_ruleQualifiedPackageRefCS= ruleQualifiedPackageRefCS EOF ;
    public final EObject entryRuleQualifiedPackageRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedPackageRefCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2368:2: (iv_ruleQualifiedPackageRefCS= ruleQualifiedPackageRefCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2369:2: iv_ruleQualifiedPackageRefCS= ruleQualifiedPackageRefCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getQualifiedPackageRefCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedPackageRefCS_in_entryRuleQualifiedPackageRefCS4234);
            iv_ruleQualifiedPackageRefCS=ruleQualifiedPackageRefCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleQualifiedPackageRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedPackageRefCS4244); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleQualifiedPackageRefCS


    // $ANTLR start ruleQualifiedPackageRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2376:1: ruleQualifiedPackageRefCS returns [EObject current=null] : ( ( ( ruleIdentifier ) ) '::' ( (lv_element_2_0= rulePackageRefCS ) ) ) ;
    public final EObject ruleQualifiedPackageRefCS() throws RecognitionException {
        EObject current = null;

        EObject lv_element_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2381:6: ( ( ( ( ruleIdentifier ) ) '::' ( (lv_element_2_0= rulePackageRefCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2382:1: ( ( ( ruleIdentifier ) ) '::' ( (lv_element_2_0= rulePackageRefCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2382:1: ( ( ( ruleIdentifier ) ) '::' ( (lv_element_2_0= rulePackageRefCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2382:2: ( ( ruleIdentifier ) ) '::' ( (lv_element_2_0= rulePackageRefCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2382:2: ( ( ruleIdentifier ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2383:1: ( ruleIdentifier )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2383:1: ( ruleIdentifier )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2384:3: ruleIdentifier
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getQualifiedPackageRefCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getQualifiedPackageRefCSAccess().getNamespaceNamespaceCrossReference_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleQualifiedPackageRefCS4296);
            ruleIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,42,FollowSets000.FOLLOW_42_in_ruleQualifiedPackageRefCS4306); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getQualifiedPackageRefCSAccess().getColonColonKeyword_1(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2405:1: ( (lv_element_2_0= rulePackageRefCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2406:1: (lv_element_2_0= rulePackageRefCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2406:1: (lv_element_2_0= rulePackageRefCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2407:3: lv_element_2_0= rulePackageRefCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getQualifiedPackageRefCSAccess().getElementPackageRefCSParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePackageRefCS_in_ruleQualifiedPackageRefCS4327);
            lv_element_2_0=rulePackageRefCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getQualifiedPackageRefCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"element",
              	        		lv_element_2_0, 
              	        		"PackageRefCS", 
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
    // $ANTLR end ruleQualifiedPackageRefCS


    // $ANTLR start entryRuleSimpleClassifierRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2437:1: entryRuleSimpleClassifierRefCS returns [EObject current=null] : iv_ruleSimpleClassifierRefCS= ruleSimpleClassifierRefCS EOF ;
    public final EObject entryRuleSimpleClassifierRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleClassifierRefCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2438:2: (iv_ruleSimpleClassifierRefCS= ruleSimpleClassifierRefCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2439:2: iv_ruleSimpleClassifierRefCS= ruleSimpleClassifierRefCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSimpleClassifierRefCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleClassifierRefCS_in_entryRuleSimpleClassifierRefCS4363);
            iv_ruleSimpleClassifierRefCS=ruleSimpleClassifierRefCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSimpleClassifierRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleClassifierRefCS4373); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSimpleClassifierRefCS


    // $ANTLR start ruleSimpleClassifierRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2446:1: ruleSimpleClassifierRefCS returns [EObject current=null] : ( ( ruleIdentifier ) ) ;
    public final EObject ruleSimpleClassifierRefCS() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2451:6: ( ( ( ruleIdentifier ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2452:1: ( ( ruleIdentifier ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2452:1: ( ( ruleIdentifier ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2453:1: ( ruleIdentifier )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2453:1: ( ruleIdentifier )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2454:3: ruleIdentifier
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getSimpleClassifierRefCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSimpleClassifierRefCSAccess().getClassifierClassifierCSCrossReference_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleSimpleClassifierRefCS4424);
            ruleIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
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
    // $ANTLR end ruleSimpleClassifierRefCS


    // $ANTLR start entryRuleSimpleOperationRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2479:1: entryRuleSimpleOperationRefCS returns [EObject current=null] : iv_ruleSimpleOperationRefCS= ruleSimpleOperationRefCS EOF ;
    public final EObject entryRuleSimpleOperationRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleOperationRefCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2480:2: (iv_ruleSimpleOperationRefCS= ruleSimpleOperationRefCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2481:2: iv_ruleSimpleOperationRefCS= ruleSimpleOperationRefCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSimpleOperationRefCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleOperationRefCS_in_entryRuleSimpleOperationRefCS4459);
            iv_ruleSimpleOperationRefCS=ruleSimpleOperationRefCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSimpleOperationRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleOperationRefCS4469); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSimpleOperationRefCS


    // $ANTLR start ruleSimpleOperationRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2488:1: ruleSimpleOperationRefCS returns [EObject current=null] : ( ( ruleIdentifier ) ) ;
    public final EObject ruleSimpleOperationRefCS() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2493:6: ( ( ( ruleIdentifier ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2494:1: ( ( ruleIdentifier ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2494:1: ( ( ruleIdentifier ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2495:1: ( ruleIdentifier )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2495:1: ( ruleIdentifier )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2496:3: ruleIdentifier
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getSimpleOperationRefCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSimpleOperationRefCSAccess().getOperationOperationCSCrossReference_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleSimpleOperationRefCS4520);
            ruleIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
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
    // $ANTLR end ruleSimpleOperationRefCS


    // $ANTLR start entryRuleSimplePackageRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2521:1: entryRuleSimplePackageRefCS returns [EObject current=null] : iv_ruleSimplePackageRefCS= ruleSimplePackageRefCS EOF ;
    public final EObject entryRuleSimplePackageRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimplePackageRefCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2522:2: (iv_ruleSimplePackageRefCS= ruleSimplePackageRefCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2523:2: iv_ruleSimplePackageRefCS= ruleSimplePackageRefCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSimplePackageRefCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimplePackageRefCS_in_entryRuleSimplePackageRefCS4555);
            iv_ruleSimplePackageRefCS=ruleSimplePackageRefCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSimplePackageRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimplePackageRefCS4565); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSimplePackageRefCS


    // $ANTLR start ruleSimplePackageRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2530:1: ruleSimplePackageRefCS returns [EObject current=null] : ( ( ruleIdentifier ) ) ;
    public final EObject ruleSimplePackageRefCS() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2535:6: ( ( ( ruleIdentifier ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2536:1: ( ( ruleIdentifier ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2536:1: ( ( ruleIdentifier ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2537:1: ( ruleIdentifier )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2537:1: ( ruleIdentifier )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2538:3: ruleIdentifier
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getSimplePackageRefCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSimplePackageRefCSAccess().getPackagePackageCSCrossReference_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleSimplePackageRefCS4616);
            ruleIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
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
    // $ANTLR end ruleSimplePackageRefCS


    // $ANTLR start entryRuleSimplePropertyRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2563:1: entryRuleSimplePropertyRefCS returns [EObject current=null] : iv_ruleSimplePropertyRefCS= ruleSimplePropertyRefCS EOF ;
    public final EObject entryRuleSimplePropertyRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimplePropertyRefCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2564:2: (iv_ruleSimplePropertyRefCS= ruleSimplePropertyRefCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2565:2: iv_ruleSimplePropertyRefCS= ruleSimplePropertyRefCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSimplePropertyRefCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimplePropertyRefCS_in_entryRuleSimplePropertyRefCS4651);
            iv_ruleSimplePropertyRefCS=ruleSimplePropertyRefCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSimplePropertyRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimplePropertyRefCS4661); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSimplePropertyRefCS


    // $ANTLR start ruleSimplePropertyRefCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2572:1: ruleSimplePropertyRefCS returns [EObject current=null] : ( ( ruleIdentifier ) ) ;
    public final EObject ruleSimplePropertyRefCS() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2577:6: ( ( ( ruleIdentifier ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2578:1: ( ( ruleIdentifier ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2578:1: ( ( ruleIdentifier ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2579:1: ( ruleIdentifier )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2579:1: ( ruleIdentifier )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2580:3: ruleIdentifier
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getSimplePropertyRefCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSimplePropertyRefCSAccess().getFeatureStructuralFeatureCSCrossReference_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleSimplePropertyRefCS4712);
            ruleIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
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
    // $ANTLR end ruleSimplePropertyRefCS


    // $ANTLR start entryRuleNavigatingExpCS_Base
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2605:1: entryRuleNavigatingExpCS_Base returns [EObject current=null] : iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF ;
    public final EObject entryRuleNavigatingExpCS_Base() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingExpCS_Base = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2606:2: (iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2607:2: iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNavigatingExpCS_BaseRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingExpCS_Base_in_entryRuleNavigatingExpCS_Base4747);
            iv_ruleNavigatingExpCS_Base=ruleNavigatingExpCS_Base();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNavigatingExpCS_Base; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingExpCS_Base4757); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2614:1: ruleNavigatingExpCS_Base returns [EObject current=null] : (this_IndexExpCS_0= ruleIndexExpCS ( () '@' 'pre' )? ) ;
    public final EObject ruleNavigatingExpCS_Base() throws RecognitionException {
        EObject current = null;

        EObject this_IndexExpCS_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2619:6: ( (this_IndexExpCS_0= ruleIndexExpCS ( () '@' 'pre' )? ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2620:1: (this_IndexExpCS_0= ruleIndexExpCS ( () '@' 'pre' )? )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2620:1: (this_IndexExpCS_0= ruleIndexExpCS ( () '@' 'pre' )? )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2621:2: this_IndexExpCS_0= ruleIndexExpCS ( () '@' 'pre' )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getNavigatingExpCS_BaseAccess().getIndexExpCSParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleIndexExpCS_in_ruleNavigatingExpCS_Base4807);
            this_IndexExpCS_0=ruleIndexExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_IndexExpCS_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2632:1: ( () '@' 'pre' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==43) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2632:2: () '@' 'pre'
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2632:2: ()
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2633:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getNavigatingExpCS_BaseAccess().getPreExpCSNameAction_1_0().getType().getClassifier());
                              try {
                              	factory.set(temp, "name", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getNavigatingExpCS_BaseAccess().getPreExpCSNameAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,43,FollowSets000.FOLLOW_43_in_ruleNavigatingExpCS_Base4829); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNavigatingExpCS_BaseAccess().getCommercialAtKeyword_1_1(), null); 
                          
                    }
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleNavigatingExpCS_Base4839); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNavigatingExpCS_BaseAccess().getPreKeyword_1_2(), null); 
                          
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
    // $ANTLR end ruleNavigatingExpCS_Base


    // $ANTLR start entryRuleNavigatingArgExpCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2667:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2668:2: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2669:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNavigatingArgExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_entryRuleNavigatingArgExpCS4877);
            iv_ruleNavigatingArgExpCS=ruleNavigatingArgExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNavigatingArgExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgExpCS4887); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2676:1: ruleNavigatingArgExpCS returns [EObject current=null] : ( ( () '?' ) | this_ExpCS_2= ruleExpCS ) ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2681:6: ( ( ( () '?' ) | this_ExpCS_2= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2682:1: ( ( () '?' ) | this_ExpCS_2= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2682:1: ( ( () '?' ) | this_ExpCS_2= ruleExpCS )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==44) ) {
                alt36=1;
            }
            else if ( ((LA36_0>=RULE_SINGLE_QUOTED_STRING && LA36_0<=RULE_ID)||(LA36_0>=15 && LA36_0<=31)||LA36_0==34||(LA36_0>=40 && LA36_0<=41)||(LA36_0>=46 && LA36_0<=47)||(LA36_0>=49 && LA36_0<=51)||(LA36_0>=63 && LA36_0<=69)||(LA36_0>=73 && LA36_0<=76)||LA36_0==81||LA36_0==85||LA36_0==87) ) {
                alt36=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2682:1: ( ( () '?' ) | this_ExpCS_2= ruleExpCS )", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2682:2: ( () '?' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2682:2: ( () '?' )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2682:3: () '?'
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2682:3: ()
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2683:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getNavigatingArgExpCSAccess().getOclMessageArgCSAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getNavigatingArgExpCSAccess().getOclMessageArgCSAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,44,FollowSets000.FOLLOW_44_in_ruleNavigatingArgExpCS4935); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNavigatingArgExpCSAccess().getQuestionMarkKeyword_0_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2702:2: this_ExpCS_2= ruleExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNavigatingArgExpCSAccess().getExpCSParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgExpCS4967);
                    this_ExpCS_2=ruleExpCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ExpCS_2; 
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
    // $ANTLR end ruleNavigatingArgExpCS


    // $ANTLR start entryRuleNUMBER_LITERAL
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2723:1: entryRuleNUMBER_LITERAL returns [String current=null] : iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF ;
    public final String entryRuleNUMBER_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER_LITERAL = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2724:2: (iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2725:2: iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNUMBER_LITERALRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL5005);
            iv_ruleNUMBER_LITERAL=ruleNUMBER_LITERAL();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNUMBER_LITERAL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNUMBER_LITERAL5016); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2732:1: ruleNUMBER_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_7=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2737:6: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2738:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2738:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2738:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )?
            {
            this_INT_0=(Token)input.LT(1);
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL5056); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getNUMBER_LITERALAccess().getINTTerminalRuleCall_0(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2745:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==45) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==RULE_INT) ) {
                    int LA37_3 = input.LA(3);

                    if ( (synpred57()) ) {
                        alt37=1;
                    }
                }
            }
            switch (alt37) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2746:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)input.LT(1);
                    match(input,45,FollowSets000.FOLLOW_45_in_ruleNUMBER_LITERAL5075); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getNUMBER_LITERALAccess().getFullStopKeyword_1_0(), null); 
                          
                    }
                    this_INT_2=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL5090); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_INT_2);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getNUMBER_LITERALAccess().getINTTerminalRuleCall_1_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2758:3: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=46 && LA40_0<=47)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2758:4: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2758:4: (kw= 'e' | kw= 'E' )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==46) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==47) ) {
                        alt38=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2758:4: (kw= 'e' | kw= 'E' )", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2759:2: kw= 'e'
                            {
                            kw=(Token)input.LT(1);
                            match(input,46,FollowSets000.FOLLOW_46_in_ruleNUMBER_LITERAL5112); if (failed) return current;
                            if ( backtracking==0 ) {

                                      current.merge(kw);
                                      createLeafNode(grammarAccess.getNUMBER_LITERALAccess().getEKeyword_2_0_0(), null); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2766:2: kw= 'E'
                            {
                            kw=(Token)input.LT(1);
                            match(input,47,FollowSets000.FOLLOW_47_in_ruleNUMBER_LITERAL5131); if (failed) return current;
                            if ( backtracking==0 ) {

                                      current.merge(kw);
                                      createLeafNode(grammarAccess.getNUMBER_LITERALAccess().getEKeyword_2_0_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2771:2: (kw= '+' | kw= '-' )?
                    int alt39=3;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==48) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==49) ) {
                        alt39=2;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2772:2: kw= '+'
                            {
                            kw=(Token)input.LT(1);
                            match(input,48,FollowSets000.FOLLOW_48_in_ruleNUMBER_LITERAL5146); if (failed) return current;
                            if ( backtracking==0 ) {

                                      current.merge(kw);
                                      createLeafNode(grammarAccess.getNUMBER_LITERALAccess().getPlusSignKeyword_2_1_0(), null); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2779:2: kw= '-'
                            {
                            kw=(Token)input.LT(1);
                            match(input,49,FollowSets000.FOLLOW_49_in_ruleNUMBER_LITERAL5165); if (failed) return current;
                            if ( backtracking==0 ) {

                                      current.merge(kw);
                                      createLeafNode(grammarAccess.getNUMBER_LITERALAccess().getHyphenMinusKeyword_2_1_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    this_INT_7=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL5182); if (failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2801:1: entryRuleEssentialOCLPrefixOperator returns [String current=null] : iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF ;
    public final String entryRuleEssentialOCLPrefixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLPrefixOperator = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2802:2: (iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2803:2: iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEssentialOCLPrefixOperatorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLPrefixOperator_in_entryRuleEssentialOCLPrefixOperator5232);
            iv_ruleEssentialOCLPrefixOperator=ruleEssentialOCLPrefixOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEssentialOCLPrefixOperator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLPrefixOperator5243); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2810:1: ruleEssentialOCLPrefixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLPrefixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2815:6: ( (kw= '-' | kw= 'not' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2816:1: (kw= '-' | kw= 'not' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2816:1: (kw= '-' | kw= 'not' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==49) ) {
                alt41=1;
            }
            else if ( (LA41_0==50) ) {
                alt41=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2816:1: (kw= '-' | kw= 'not' )", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2817:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,49,FollowSets000.FOLLOW_49_in_ruleEssentialOCLPrefixOperator5281); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLPrefixOperatorAccess().getHyphenMinusKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2824:2: kw= 'not'
                    {
                    kw=(Token)input.LT(1);
                    match(input,50,FollowSets000.FOLLOW_50_in_ruleEssentialOCLPrefixOperator5300); if (failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2837:1: entryRuleEssentialOCLInfixOperator returns [String current=null] : iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF ;
    public final String entryRuleEssentialOCLInfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLInfixOperator = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2838:2: (iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2839:2: iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEssentialOCLInfixOperatorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLInfixOperator_in_entryRuleEssentialOCLInfixOperator5341);
            iv_ruleEssentialOCLInfixOperator=ruleEssentialOCLInfixOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEssentialOCLInfixOperator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLInfixOperator5352); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2846:1: ruleEssentialOCLInfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLInfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2851:6: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2852:1: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2852:1: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            int alt42=14;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt42=1;
                }
                break;
            case 52:
                {
                alt42=2;
                }
                break;
            case 48:
                {
                alt42=3;
                }
                break;
            case 49:
                {
                alt42=4;
                }
                break;
            case 53:
                {
                alt42=5;
                }
                break;
            case 54:
                {
                alt42=6;
                }
                break;
            case 55:
                {
                alt42=7;
                }
                break;
            case 56:
                {
                alt42=8;
                }
                break;
            case 37:
                {
                alt42=9;
                }
                break;
            case 57:
                {
                alt42=10;
                }
                break;
            case 58:
                {
                alt42=11;
                }
                break;
            case 59:
                {
                alt42=12;
                }
                break;
            case 60:
                {
                alt42=13;
                }
                break;
            case 61:
                {
                alt42=14;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2852:1: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2853:2: kw= '*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,51,FollowSets000.FOLLOW_51_in_ruleEssentialOCLInfixOperator5390); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getAsteriskKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2860:2: kw= '/'
                    {
                    kw=(Token)input.LT(1);
                    match(input,52,FollowSets000.FOLLOW_52_in_ruleEssentialOCLInfixOperator5409); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getSolidusKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2867:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,48,FollowSets000.FOLLOW_48_in_ruleEssentialOCLInfixOperator5428); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getPlusSignKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2874:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,49,FollowSets000.FOLLOW_49_in_ruleEssentialOCLInfixOperator5447); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getHyphenMinusKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2881:2: kw= '>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,53,FollowSets000.FOLLOW_53_in_ruleEssentialOCLInfixOperator5466); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2888:2: kw= '<'
                    {
                    kw=(Token)input.LT(1);
                    match(input,54,FollowSets000.FOLLOW_54_in_ruleEssentialOCLInfixOperator5485); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignKeyword_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2895:2: kw= '>='
                    {
                    kw=(Token)input.LT(1);
                    match(input,55,FollowSets000.FOLLOW_55_in_ruleEssentialOCLInfixOperator5504); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignEqualsSignKeyword_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2902:2: kw= '<='
                    {
                    kw=(Token)input.LT(1);
                    match(input,56,FollowSets000.FOLLOW_56_in_ruleEssentialOCLInfixOperator5523); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignEqualsSignKeyword_7(), null); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2909:2: kw= '='
                    {
                    kw=(Token)input.LT(1);
                    match(input,37,FollowSets000.FOLLOW_37_in_ruleEssentialOCLInfixOperator5542); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getEqualsSignKeyword_8(), null); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2916:2: kw= '<>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,57,FollowSets000.FOLLOW_57_in_ruleEssentialOCLInfixOperator5561); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignGreaterThanSignKeyword_9(), null); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2923:2: kw= 'and'
                    {
                    kw=(Token)input.LT(1);
                    match(input,58,FollowSets000.FOLLOW_58_in_ruleEssentialOCLInfixOperator5580); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getAndKeyword_10(), null); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2930:2: kw= 'or'
                    {
                    kw=(Token)input.LT(1);
                    match(input,59,FollowSets000.FOLLOW_59_in_ruleEssentialOCLInfixOperator5599); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getOrKeyword_11(), null); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2937:2: kw= 'xor'
                    {
                    kw=(Token)input.LT(1);
                    match(input,60,FollowSets000.FOLLOW_60_in_ruleEssentialOCLInfixOperator5618); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getXorKeyword_12(), null); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2944:2: kw= 'implies'
                    {
                    kw=(Token)input.LT(1);
                    match(input,61,FollowSets000.FOLLOW_61_in_ruleEssentialOCLInfixOperator5637); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLInfixOperatorAccess().getImpliesKeyword_13(), null); 
                          
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


    // $ANTLR start entryRuleEssentialOCLNavigationOperator
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2957:1: entryRuleEssentialOCLNavigationOperator returns [String current=null] : iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF ;
    public final String entryRuleEssentialOCLNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLNavigationOperator = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2958:2: (iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2959:2: iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEssentialOCLNavigationOperatorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLNavigationOperator_in_entryRuleEssentialOCLNavigationOperator5678);
            iv_ruleEssentialOCLNavigationOperator=ruleEssentialOCLNavigationOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEssentialOCLNavigationOperator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLNavigationOperator5689); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEssentialOCLNavigationOperator


    // $ANTLR start ruleEssentialOCLNavigationOperator
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2966:1: ruleEssentialOCLNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2971:6: ( (kw= '.' | kw= '->' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2972:1: (kw= '.' | kw= '->' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2972:1: (kw= '.' | kw= '->' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==45) ) {
                alt43=1;
            }
            else if ( (LA43_0==62) ) {
                alt43=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2972:1: (kw= '.' | kw= '->' )", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2973:2: kw= '.'
                    {
                    kw=(Token)input.LT(1);
                    match(input,45,FollowSets000.FOLLOW_45_in_ruleEssentialOCLNavigationOperator5727); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLNavigationOperatorAccess().getFullStopKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2980:2: kw= '->'
                    {
                    kw=(Token)input.LT(1);
                    match(input,62,FollowSets000.FOLLOW_62_in_ruleEssentialOCLNavigationOperator5746); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEssentialOCLNavigationOperatorAccess().getHyphenMinusGreaterThanSignKeyword_1(), null); 
                          
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
    // $ANTLR end ruleEssentialOCLNavigationOperator


    // $ANTLR start entryRuleIdentifier
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2993:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2994:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2995:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIdentifierRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier5787);
            iv_ruleIdentifier=ruleIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier5798); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3002:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'e' | kw= 'E' | kw= 'body' | kw= 'der' | kw= 'init' | kw= 'inv' | kw= 'post' | kw= 'pre' ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3007:6: ( (this_ID_0= RULE_ID | kw= 'e' | kw= 'E' | kw= 'body' | kw= 'der' | kw= 'init' | kw= 'inv' | kw= 'post' | kw= 'pre' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3008:1: (this_ID_0= RULE_ID | kw= 'e' | kw= 'E' | kw= 'body' | kw= 'der' | kw= 'init' | kw= 'inv' | kw= 'post' | kw= 'pre' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3008:1: (this_ID_0= RULE_ID | kw= 'e' | kw= 'E' | kw= 'body' | kw= 'der' | kw= 'init' | kw= 'inv' | kw= 'post' | kw= 'pre' )
            int alt44=9;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt44=1;
                }
                break;
            case 46:
                {
                alt44=2;
                }
                break;
            case 47:
                {
                alt44=3;
                }
                break;
            case 15:
                {
                alt44=4;
                }
                break;
            case 63:
                {
                alt44=5;
                }
                break;
            case 20:
                {
                alt44=6;
                }
                break;
            case 21:
                {
                alt44=7;
                }
                break;
            case 40:
                {
                alt44=8;
                }
                break;
            case 41:
                {
                alt44=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3008:1: (this_ID_0= RULE_ID | kw= 'e' | kw= 'E' | kw= 'body' | kw= 'der' | kw= 'init' | kw= 'inv' | kw= 'post' | kw= 'pre' )", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3008:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIdentifier5838); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3017:2: kw= 'e'
                    {
                    kw=(Token)input.LT(1);
                    match(input,46,FollowSets000.FOLLOW_46_in_ruleIdentifier5862); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getIdentifierAccess().getEKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3024:2: kw= 'E'
                    {
                    kw=(Token)input.LT(1);
                    match(input,47,FollowSets000.FOLLOW_47_in_ruleIdentifier5881); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getIdentifierAccess().getEKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3031:2: kw= 'body'
                    {
                    kw=(Token)input.LT(1);
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleIdentifier5900); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getIdentifierAccess().getBodyKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3038:2: kw= 'der'
                    {
                    kw=(Token)input.LT(1);
                    match(input,63,FollowSets000.FOLLOW_63_in_ruleIdentifier5919); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getIdentifierAccess().getDerKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3045:2: kw= 'init'
                    {
                    kw=(Token)input.LT(1);
                    match(input,20,FollowSets000.FOLLOW_20_in_ruleIdentifier5938); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getIdentifierAccess().getInitKeyword_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3052:2: kw= 'inv'
                    {
                    kw=(Token)input.LT(1);
                    match(input,21,FollowSets000.FOLLOW_21_in_ruleIdentifier5957); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getIdentifierAccess().getInvKeyword_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3059:2: kw= 'post'
                    {
                    kw=(Token)input.LT(1);
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleIdentifier5976); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getIdentifierAccess().getPostKeyword_7(), null); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3066:2: kw= 'pre'
                    {
                    kw=(Token)input.LT(1);
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleIdentifier5995); if (failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3079:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3080:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3081:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStringLiteralRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6036);
            iv_ruleStringLiteral=ruleStringLiteral();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteral6047); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3088:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3093:6: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3094:5: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)input.LT(1);
            match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleStringLiteral6086); if (failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3109:1: entryRulePrefixOperator returns [String current=null] : iv_rulePrefixOperator= rulePrefixOperator EOF ;
    public final String entryRulePrefixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefixOperator = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3110:2: (iv_rulePrefixOperator= rulePrefixOperator EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3111:2: iv_rulePrefixOperator= rulePrefixOperator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrefixOperatorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixOperator_in_entryRulePrefixOperator6131);
            iv_rulePrefixOperator=rulePrefixOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrefixOperator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrefixOperator6142); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3118:1: rulePrefixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator ;
    public final AntlrDatatypeRuleToken rulePrefixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLPrefixOperator_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3123:6: (this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3125:5: this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getPrefixOperatorAccess().getEssentialOCLPrefixOperatorParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLPrefixOperator_in_rulePrefixOperator6188);
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3143:1: entryRuleInfixOperator returns [String current=null] : iv_ruleInfixOperator= ruleInfixOperator EOF ;
    public final String entryRuleInfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixOperator = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3144:2: (iv_ruleInfixOperator= ruleInfixOperator EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3145:2: iv_ruleInfixOperator= ruleInfixOperator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInfixOperatorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixOperator_in_entryRuleInfixOperator6233);
            iv_ruleInfixOperator=ruleInfixOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInfixOperator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfixOperator6244); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3152:1: ruleInfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator ;
    public final AntlrDatatypeRuleToken ruleInfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLInfixOperator_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3157:6: (this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3159:5: this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getInfixOperatorAccess().getEssentialOCLInfixOperatorParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLInfixOperator_in_ruleInfixOperator6290);
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3177:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3178:2: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3179:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_entryRuleEssentialOCLUnrestrictedName6335);
            iv_ruleEssentialOCLUnrestrictedName=ruleEssentialOCLUnrestrictedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEssentialOCLUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedName6346); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3186:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3191:6: (this_Identifier_0= ruleIdentifier )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3193:5: this_Identifier_0= ruleIdentifier
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameAccess().getIdentifierParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleEssentialOCLUnrestrictedName6392);
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


    // $ANTLR start entryRuleEssentialOCLUnreservedName
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3211:1: entryRuleEssentialOCLUnreservedName returns [String current=null] : iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF ;
    public final String entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnreservedName = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3212:2: (iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3213:2: iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEssentialOCLUnreservedNameRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnreservedName_in_entryRuleEssentialOCLUnreservedName6437);
            iv_ruleEssentialOCLUnreservedName=ruleEssentialOCLUnreservedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEssentialOCLUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnreservedName6448); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3220:1: ruleEssentialOCLUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_UnrestrictedName_0= ruleUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3225:6: (this_UnrestrictedName_0= ruleUnrestrictedName )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3227:5: this_UnrestrictedName_0= ruleUnrestrictedName
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getUnrestrictedNameParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleEssentialOCLUnreservedName6494);
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3245:1: entryRuleUnreservedName returns [String current=null] : iv_ruleUnreservedName= ruleUnreservedName EOF ;
    public final String entryRuleUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnreservedName = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3246:2: (iv_ruleUnreservedName= ruleUnreservedName EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3247:2: iv_ruleUnreservedName= ruleUnreservedName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnreservedNameRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_entryRuleUnreservedName6539);
            iv_ruleUnreservedName=ruleUnreservedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnreservedName6550); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3254:1: ruleUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName ;
    public final AntlrDatatypeRuleToken ruleUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnreservedName_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3259:6: (this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3261:5: this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getUnreservedNameAccess().getEssentialOCLUnreservedNameParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnreservedName_in_ruleUnreservedName6596);
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


    // $ANTLR start entryRulePrimitiveTypeCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3279:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3280:2: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3281:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveTypeCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeCS_in_entryRulePrimitiveTypeCS6640);
            iv_rulePrimitiveTypeCS=rulePrimitiveTypeCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveTypeCS6650); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3288:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3293:6: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3294:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3294:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3295:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3295:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3296:3: lv_name_0_0= rulePrimitiveTypeIdentifier
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveTypeCSAccess().getNamePrimitiveTypeIdentifierParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_rulePrimitiveTypeCS6695);
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3326:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3327:2: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3328:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCollectionTypeIdentifierRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_entryRuleCollectionTypeIdentifier6731);
            iv_ruleCollectionTypeIdentifier=ruleCollectionTypeIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCollectionTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionTypeIdentifier6742); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3335:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3340:6: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3341:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3341:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt45=5;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt45=1;
                }
                break;
            case 65:
                {
                alt45=2;
                }
                break;
            case 66:
                {
                alt45=3;
                }
                break;
            case 67:
                {
                alt45=4;
                }
                break;
            case 68:
                {
                alt45=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3341:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3342:2: kw= 'Set'
                    {
                    kw=(Token)input.LT(1);
                    match(input,64,FollowSets000.FOLLOW_64_in_ruleCollectionTypeIdentifier6780); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3349:2: kw= 'Bag'
                    {
                    kw=(Token)input.LT(1);
                    match(input,65,FollowSets000.FOLLOW_65_in_ruleCollectionTypeIdentifier6799); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3356:2: kw= 'Sequence'
                    {
                    kw=(Token)input.LT(1);
                    match(input,66,FollowSets000.FOLLOW_66_in_ruleCollectionTypeIdentifier6818); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3363:2: kw= 'Collection'
                    {
                    kw=(Token)input.LT(1);
                    match(input,67,FollowSets000.FOLLOW_67_in_ruleCollectionTypeIdentifier6837); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3370:2: kw= 'OrderedSet'
                    {
                    kw=(Token)input.LT(1);
                    match(input,68,FollowSets000.FOLLOW_68_in_ruleCollectionTypeIdentifier6856); if (failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3383:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3384:2: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3385:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCollectionTypeCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_entryRuleCollectionTypeCS6896);
            iv_ruleCollectionTypeCS=ruleCollectionTypeCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCollectionTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionTypeCS6906); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3392:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ')' )? ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3397:6: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ')' )? ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3398:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ')' )? )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3398:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ')' )? )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3398:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ')' )?
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3398:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3399:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3399:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3400:3: lv_name_0_0= ruleCollectionTypeIdentifier
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_ruleCollectionTypeCS6952);
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

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3422:2: ( '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==34) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3422:4: '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ')'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_ruleCollectionTypeCS6963); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3426:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3427:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3427:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3428:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS6984);
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

                    match(input,36,FollowSets000.FOLLOW_36_in_ruleCollectionTypeCS6994); if (failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3462:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3463:2: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3464:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTupleTypeCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleTypeCS_in_entryRuleTupleTypeCS7032);
            iv_ruleTupleTypeCS=ruleTupleTypeCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTupleTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleTypeCS7042); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3471:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) ( '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? ')' )? ) ;
    public final EObject ruleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3476:6: ( ( ( (lv_name_0_0= 'Tuple' ) ) ( '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? ')' )? ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3477:1: ( ( (lv_name_0_0= 'Tuple' ) ) ( '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? ')' )? )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3477:1: ( ( (lv_name_0_0= 'Tuple' ) ) ( '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? ')' )? )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3477:2: ( (lv_name_0_0= 'Tuple' ) ) ( '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? ')' )?
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3477:2: ( (lv_name_0_0= 'Tuple' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3478:1: (lv_name_0_0= 'Tuple' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3478:1: (lv_name_0_0= 'Tuple' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3479:3: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,69,FollowSets000.FOLLOW_69_in_ruleTupleTypeCS7085); if (failed) return current;
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

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3498:2: ( '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? ')' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==34) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3498:4: '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? ')'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_ruleTupleTypeCS7109); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3502:1: ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_ID||(LA48_0>=15 && LA48_0<=21)||(LA48_0>=40 && LA48_0<=41)||(LA48_0>=46 && LA48_0<=47)||LA48_0==63) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3502:2: ( (lv_ownedParts_2_0= ruletuplePartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )*
                            {
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3502:2: ( (lv_ownedParts_2_0= ruletuplePartCS ) )
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3503:1: (lv_ownedParts_2_0= ruletuplePartCS )
                            {
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3503:1: (lv_ownedParts_2_0= ruletuplePartCS )
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3504:3: lv_ownedParts_2_0= ruletuplePartCS
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruletuplePartCS_in_ruleTupleTypeCS7131);
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

                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3526:2: ( ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )*
                            loop47:
                            do {
                                int alt47=2;
                                int LA47_0 = input.LA(1);

                                if ( (LA47_0==35) ) {
                                    alt47=1;
                                }


                                switch (alt47) {
                            	case 1 :
                            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3526:4: ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) )
                            	    {
                            	    match(input,35,FollowSets000.FOLLOW_35_in_ruleTupleTypeCS7142); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_0(), null); 
                            	          
                            	    }
                            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3530:1: ( (lv_ownedParts_4_0= ruletuplePartCS ) )
                            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3531:1: (lv_ownedParts_4_0= ruletuplePartCS )
                            	    {
                            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3531:1: (lv_ownedParts_4_0= ruletuplePartCS )
                            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3532:3: lv_ownedParts_4_0= ruletuplePartCS
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruletuplePartCS_in_ruleTupleTypeCS7163);
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
                            	    break loop47;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,36,FollowSets000.FOLLOW_36_in_ruleTupleTypeCS7177); if (failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3566:1: entryRuletuplePartCS returns [EObject current=null] : iv_ruletuplePartCS= ruletuplePartCS EOF ;
    public final EObject entryRuletuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletuplePartCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3567:2: (iv_ruletuplePartCS= ruletuplePartCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3568:2: iv_ruletuplePartCS= ruletuplePartCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTuplePartCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruletuplePartCS_in_entryRuletuplePartCS7215);
            iv_ruletuplePartCS=ruletuplePartCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruletuplePartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuletuplePartCS7225); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3575:1: ruletuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruletuplePartCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3580:6: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3581:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3581:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3581:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3581:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3582:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3582:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3583:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTuplePartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruletuplePartCS7271);
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

            match(input,32,FollowSets000.FOLLOW_32_in_ruletuplePartCS7281); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTuplePartCSAccess().getColonKeyword_1(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3609:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3610:1: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3610:1: (lv_ownedType_2_0= ruleTypeExpCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3611:3: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTuplePartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruletuplePartCS7302);
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3641:1: entryRuleCollectionLiteralExpCS returns [EObject current=null] : iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF ;
    public final EObject entryRuleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3642:2: (iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3643:2: iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCollectionLiteralExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_entryRuleCollectionLiteralExpCS7338);
            iv_ruleCollectionLiteralExpCS=ruleCollectionLiteralExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCollectionLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionLiteralExpCS7348); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3650:1: ruleCollectionLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? '}' ) ;
    public final EObject ruleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3655:6: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? '}' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3656:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? '}' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3656:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? '}' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3656:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? '}'
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3656:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3657:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3657:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3658:3: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleCollectionLiteralExpCS7394);
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

            match(input,70,FollowSets000.FOLLOW_70_in_ruleCollectionLiteralExpCS7404); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3684:1: ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_SINGLE_QUOTED_STRING && LA51_0<=RULE_ID)||(LA51_0>=15 && LA51_0<=31)||LA51_0==34||(LA51_0>=40 && LA51_0<=41)||(LA51_0>=46 && LA51_0<=47)||(LA51_0>=49 && LA51_0<=51)||(LA51_0>=63 && LA51_0<=69)||(LA51_0>=73 && LA51_0<=76)||LA51_0==81||LA51_0==85||LA51_0==87) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3684:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3684:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3685:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3685:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3686:3: lv_ownedParts_2_0= ruleCollectionLiteralPartCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS7426);
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

                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3708:2: ( ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==35) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3708:4: ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    match(input,35,FollowSets000.FOLLOW_35_in_ruleCollectionLiteralExpCS7437); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0(), null); 
                    	          
                    	    }
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3712:1: ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3713:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3713:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3714:3: lv_ownedParts_4_0= ruleCollectionLiteralPartCS
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS7458);
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
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,71,FollowSets000.FOLLOW_71_in_ruleCollectionLiteralExpCS7472); if (failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3748:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3749:2: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3750:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCollectionLiteralPartCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_entryRuleCollectionLiteralPartCS7508);
            iv_ruleCollectionLiteralPartCS=ruleCollectionLiteralPartCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCollectionLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionLiteralPartCS7518); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3757:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( (lv_expressionCS_0_0= ruleExpCS ) ) ( '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject lv_expressionCS_0_0 = null;

        EObject lv_lastExpressionCS_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3762:6: ( ( ( (lv_expressionCS_0_0= ruleExpCS ) ) ( '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3763:1: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) ( '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3763:1: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) ( '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3763:2: ( (lv_expressionCS_0_0= ruleExpCS ) ) ( '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3763:2: ( (lv_expressionCS_0_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3764:1: (lv_expressionCS_0_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3764:1: (lv_expressionCS_0_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3765:3: lv_expressionCS_0_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSExpCSParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS7564);
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

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3787:2: ( '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==72) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3787:4: '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    {
                    match(input,72,FollowSets000.FOLLOW_72_in_ruleCollectionLiteralPartCS7575); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_1_0(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3791:1: ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3792:1: (lv_lastExpressionCS_2_0= ruleExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3792:1: (lv_lastExpressionCS_2_0= ruleExpCS )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3793:3: lv_lastExpressionCS_2_0= ruleExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getLastExpressionCSExpCSParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS7596);
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3823:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3824:2: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3825:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveLiteralExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveLiteralExpCS_in_entryRulePrimitiveLiteralExpCS7634);
            iv_rulePrimitiveLiteralExpCS=rulePrimitiveLiteralExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveLiteralExpCS7644); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3832:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
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
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3837:6: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3838:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3838:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt53=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt53=1;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt53=2;
                }
                break;
            case 73:
            case 74:
                {
                alt53=3;
                }
                break;
            case 51:
                {
                alt53=4;
                }
                break;
            case 75:
                {
                alt53=5;
                }
                break;
            case 76:
                {
                alt53=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3838:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3839:2: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNumberLiteralExpCSParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpCS_in_rulePrimitiveLiteralExpCS7694);
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
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3852:2: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteralExpCS_in_rulePrimitiveLiteralExpCS7724);
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
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3865:2: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpCS_in_rulePrimitiveLiteralExpCS7754);
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
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3878:2: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_rulePrimitiveLiteralExpCS7784);
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
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3891:2: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getInvalidLiteralExpCSParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInvalidLiteralExpCS_in_rulePrimitiveLiteralExpCS7814);
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
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3904:2: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNullLiteralExpCSParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNullLiteralExpCS_in_rulePrimitiveLiteralExpCS7844);
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3923:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3924:2: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3925:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTupleLiteralExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_entryRuleTupleLiteralExpCS7879);
            iv_ruleTupleLiteralExpCS=ruleTupleLiteralExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTupleLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralExpCS7889); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3932:1: ruleTupleLiteralExpCS returns [EObject current=null] : ( 'Tuple' '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* '}' ) ;
    public final EObject ruleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3937:6: ( ( 'Tuple' '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* '}' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3938:1: ( 'Tuple' '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* '}' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3938:1: ( 'Tuple' '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* '}' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3938:3: 'Tuple' '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) ( ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* '}'
            {
            match(input,69,FollowSets000.FOLLOW_69_in_ruleTupleLiteralExpCS7924); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0(), null); 
                  
            }
            match(input,70,FollowSets000.FOLLOW_70_in_ruleTupleLiteralExpCS7934); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3946:1: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3947:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3947:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3948:3: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS7955);
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

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3970:2: ( ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==35) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3970:4: ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    match(input,35,FollowSets000.FOLLOW_35_in_ruleTupleLiteralExpCS7966); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0(), null); 
            	          
            	    }
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3974:1: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3975:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3975:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:3976:3: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS7987);
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
            	    break loop54;
                }
            } while (true);

            match(input,71,FollowSets000.FOLLOW_71_in_ruleTupleLiteralExpCS7999); if (failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4010:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4011:2: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4012:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTupleLiteralPartCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_entryRuleTupleLiteralPartCS8035);
            iv_ruleTupleLiteralPartCS=ruleTupleLiteralPartCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTupleLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralPartCS8045); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4019:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4024:6: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4025:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4025:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4025:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4025:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4026:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4026:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4027:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTupleLiteralPartCS8091);
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

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4049:2: ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==32) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4049:4: ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_ruleTupleLiteralPartCS8102); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4053:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4054:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4054:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4055:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleTupleLiteralPartCS8123);
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

            match(input,37,FollowSets000.FOLLOW_37_in_ruleTupleLiteralPartCS8135); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4081:1: ( (lv_initExpression_4_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4082:1: (lv_initExpression_4_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4082:1: (lv_initExpression_4_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4083:3: lv_initExpression_4_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getInitExpressionExpCSParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleTupleLiteralPartCS8156);
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4113:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4114:2: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4115:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNumberLiteralExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpCS_in_entryRuleNumberLiteralExpCS8192);
            iv_ruleNumberLiteralExpCS=ruleNumberLiteralExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNumberLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumberLiteralExpCS8202); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4122:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= ruleNUMBER_LITERAL ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4127:6: ( ( (lv_name_0_0= ruleNUMBER_LITERAL ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4128:1: ( (lv_name_0_0= ruleNUMBER_LITERAL ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4128:1: ( (lv_name_0_0= ruleNUMBER_LITERAL ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4129:1: (lv_name_0_0= ruleNUMBER_LITERAL )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4129:1: (lv_name_0_0= ruleNUMBER_LITERAL )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4130:3: lv_name_0_0= ruleNUMBER_LITERAL
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNumberLiteralExpCSAccess().getNameNUMBER_LITERALParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNUMBER_LITERAL_in_ruleNumberLiteralExpCS8247);
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4160:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4161:2: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4162:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStringLiteralExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteralExpCS_in_entryRuleStringLiteralExpCS8282);
            iv_ruleStringLiteralExpCS=ruleStringLiteralExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStringLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteralExpCS8292); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4169:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= ruleStringLiteral ) )+ ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4174:6: ( ( (lv_name_0_0= ruleStringLiteral ) )+ )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4175:1: ( (lv_name_0_0= ruleStringLiteral ) )+
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4175:1: ( (lv_name_0_0= ruleStringLiteral ) )+
            int cnt56=0;
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_SINGLE_QUOTED_STRING) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4176:1: (lv_name_0_0= ruleStringLiteral )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4176:1: (lv_name_0_0= ruleStringLiteral )
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4177:3: lv_name_0_0= ruleStringLiteral
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStringLiteralExpCSAccess().getNameStringLiteralParserRuleCall_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleStringLiteralExpCS8337);
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
            	    if ( cnt56 >= 1 ) break loop56;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4207:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4208:2: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4209:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanLiteralExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpCS_in_entryRuleBooleanLiteralExpCS8373);
            iv_ruleBooleanLiteralExpCS=ruleBooleanLiteralExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanLiteralExpCS8383); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4216:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4221:6: ( ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4222:1: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4222:1: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==73) ) {
                alt57=1;
            }
            else if ( (LA57_0==74) ) {
                alt57=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4222:1: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4222:2: ( (lv_name_0_0= 'true' ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4222:2: ( (lv_name_0_0= 'true' ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4223:1: (lv_name_0_0= 'true' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4223:1: (lv_name_0_0= 'true' )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4224:3: lv_name_0_0= 'true'
                    {
                    lv_name_0_0=(Token)input.LT(1);
                    match(input,73,FollowSets000.FOLLOW_73_in_ruleBooleanLiteralExpCS8426); if (failed) return current;
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
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4244:6: ( (lv_name_1_0= 'false' ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4244:6: ( (lv_name_1_0= 'false' ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4245:1: (lv_name_1_0= 'false' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4245:1: (lv_name_1_0= 'false' )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4246:3: lv_name_1_0= 'false'
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,74,FollowSets000.FOLLOW_74_in_ruleBooleanLiteralExpCS8463); if (failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4273:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4274:2: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4275:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_entryRuleUnlimitedNaturalLiteralExpCS8512);
            iv_ruleUnlimitedNaturalLiteralExpCS=ruleUnlimitedNaturalLiteralExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnlimitedNaturalLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnlimitedNaturalLiteralExpCS8522); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4282:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4287:6: ( ( () '*' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4288:1: ( () '*' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4288:1: ( () '*' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4288:2: () '*'
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4288:2: ()
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4289:2: 
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

            match(input,51,FollowSets000.FOLLOW_51_in_ruleUnlimitedNaturalLiteralExpCS8569); if (failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4314:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4315:2: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4316:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInvalidLiteralExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInvalidLiteralExpCS_in_entryRuleInvalidLiteralExpCS8605);
            iv_ruleInvalidLiteralExpCS=ruleInvalidLiteralExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInvalidLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvalidLiteralExpCS8615); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4323:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4328:6: ( ( () 'invalid' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4329:1: ( () 'invalid' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4329:1: ( () 'invalid' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4329:2: () 'invalid'
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4329:2: ()
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4330:2: 
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

            match(input,75,FollowSets000.FOLLOW_75_in_ruleInvalidLiteralExpCS8662); if (failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4355:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4356:2: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4357:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNullLiteralExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNullLiteralExpCS_in_entryRuleNullLiteralExpCS8698);
            iv_ruleNullLiteralExpCS=ruleNullLiteralExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNullLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNullLiteralExpCS8708); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4364:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4369:6: ( ( () 'null' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4370:1: ( () 'null' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4370:1: ( () 'null' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4370:2: () 'null'
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4370:2: ()
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4371:2: 
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

            match(input,76,FollowSets000.FOLLOW_76_in_ruleNullLiteralExpCS8755); if (failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4396:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4397:2: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4398:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeLiteralCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_entryRuleTypeLiteralCS8791);
            iv_ruleTypeLiteralCS=ruleTypeLiteralCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeLiteralCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralCS8801); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4405:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_CollectionTypeCS_1 = null;

        EObject this_TupleTypeCS_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4410:6: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4411:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4411:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS )
            int alt58=3;
            switch ( input.LA(1) ) {
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                {
                alt58=1;
                }
                break;
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                {
                alt58=2;
                }
                break;
            case 69:
                {
                alt58=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4411:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS )", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4412:2: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeLiteralCSAccess().getPrimitiveTypeCSParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeCS_in_ruleTypeLiteralCS8851);
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
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4425:2: this_CollectionTypeCS_1= ruleCollectionTypeCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeLiteralCSAccess().getCollectionTypeCSParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleTypeLiteralCS8881);
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
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4438:2: this_TupleTypeCS_2= ruleTupleTypeCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeLiteralCSAccess().getTupleTypeCSParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleTypeCS_in_ruleTypeLiteralCS8911);
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4457:1: entryRuleTypeLiteralExpCS returns [EObject current=null] : iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF ;
    public final EObject entryRuleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4458:2: (iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4459:2: iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeLiteralExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_entryRuleTypeLiteralExpCS8946);
            iv_ruleTypeLiteralExpCS=ruleTypeLiteralExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralExpCS8956); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4466:1: ruleTypeLiteralExpCS returns [EObject current=null] : ( (lv_ownedType_0_0= ruleTypeLiteralCS ) ) ;
    public final EObject ruleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedType_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4471:6: ( ( (lv_ownedType_0_0= ruleTypeLiteralCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4472:1: ( (lv_ownedType_0_0= ruleTypeLiteralCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4472:1: ( (lv_ownedType_0_0= ruleTypeLiteralCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4473:1: (lv_ownedType_0_0= ruleTypeLiteralCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4473:1: (lv_ownedType_0_0= ruleTypeLiteralCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4474:3: lv_ownedType_0_0= ruleTypeLiteralCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeTypeLiteralCSParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_ruleTypeLiteralExpCS9001);
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4504:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4505:2: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4506:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeNameExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeNameExpCS_in_entryRuleTypeNameExpCS9036);
            iv_ruleTypeNameExpCS=ruleTypeNameExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeNameExpCS9046); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4513:1: ruleTypeNameExpCS returns [EObject current=null] : ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) ) ;
    public final EObject ruleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4518:6: ( ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4519:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4519:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )
            int alt60=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==42) ) {
                    alt60=1;
                }
                else if ( (LA60_1==EOF||(LA60_1>=15 && LA60_1<=16)||LA60_1==18||LA60_1==20||(LA60_1>=35 && LA60_1<=41)||(LA60_1>=79 && LA60_1<=80)) ) {
                    alt60=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4519:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 60, 1, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                int LA60_2 = input.LA(2);

                if ( (LA60_2==42) ) {
                    alt60=1;
                }
                else if ( (LA60_2==EOF||(LA60_2>=15 && LA60_2<=16)||LA60_2==18||LA60_2==20||(LA60_2>=35 && LA60_2<=41)||(LA60_2>=79 && LA60_2<=80)) ) {
                    alt60=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4519:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 60, 2, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA60_3 = input.LA(2);

                if ( (LA60_3==42) ) {
                    alt60=1;
                }
                else if ( (LA60_3==EOF||(LA60_3>=15 && LA60_3<=16)||LA60_3==18||LA60_3==20||(LA60_3>=35 && LA60_3<=41)||(LA60_3>=79 && LA60_3<=80)) ) {
                    alt60=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4519:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 60, 3, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA60_4 = input.LA(2);

                if ( (LA60_4==EOF||(LA60_4>=15 && LA60_4<=16)||LA60_4==18||LA60_4==20||(LA60_4>=35 && LA60_4<=41)||(LA60_4>=79 && LA60_4<=80)) ) {
                    alt60=2;
                }
                else if ( (LA60_4==42) ) {
                    alt60=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4519:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 60, 4, input);

                    throw nvae;
                }
                }
                break;
            case 63:
                {
                int LA60_5 = input.LA(2);

                if ( (LA60_5==EOF||(LA60_5>=15 && LA60_5<=16)||LA60_5==18||LA60_5==20||(LA60_5>=35 && LA60_5<=41)||(LA60_5>=79 && LA60_5<=80)) ) {
                    alt60=2;
                }
                else if ( (LA60_5==42) ) {
                    alt60=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4519:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 60, 5, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                int LA60_6 = input.LA(2);

                if ( (LA60_6==EOF||(LA60_6>=15 && LA60_6<=16)||LA60_6==18||LA60_6==20||(LA60_6>=35 && LA60_6<=41)||(LA60_6>=79 && LA60_6<=80)) ) {
                    alt60=2;
                }
                else if ( (LA60_6==42) ) {
                    alt60=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4519:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 60, 6, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                int LA60_7 = input.LA(2);

                if ( (LA60_7==EOF||(LA60_7>=15 && LA60_7<=16)||LA60_7==18||LA60_7==20||(LA60_7>=35 && LA60_7<=41)||(LA60_7>=79 && LA60_7<=80)) ) {
                    alt60=2;
                }
                else if ( (LA60_7==42) ) {
                    alt60=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4519:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 60, 7, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                int LA60_8 = input.LA(2);

                if ( (LA60_8==42) ) {
                    alt60=1;
                }
                else if ( (LA60_8==EOF||(LA60_8>=15 && LA60_8<=16)||LA60_8==18||LA60_8==20||(LA60_8>=35 && LA60_8<=41)||(LA60_8>=79 && LA60_8<=80)) ) {
                    alt60=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4519:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 60, 8, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                int LA60_9 = input.LA(2);

                if ( (LA60_9==42) ) {
                    alt60=1;
                }
                else if ( (LA60_9==EOF||(LA60_9>=15 && LA60_9<=16)||LA60_9==18||LA60_9==20||(LA60_9>=35 && LA60_9<=41)||(LA60_9>=79 && LA60_9<=80)) ) {
                    alt60=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4519:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 60, 9, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA60_10 = input.LA(2);

                if ( (LA60_10==42) ) {
                    alt60=1;
                }
                else if ( (LA60_10==EOF||(LA60_10>=15 && LA60_10<=16)||LA60_10==18||LA60_10==20||(LA60_10>=35 && LA60_10<=41)||(LA60_10>=79 && LA60_10<=80)) ) {
                    alt60=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4519:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 60, 10, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                int LA60_11 = input.LA(2);

                if ( (LA60_11==42) ) {
                    alt60=1;
                }
                else if ( (LA60_11==EOF||(LA60_11>=15 && LA60_11<=16)||LA60_11==18||LA60_11==20||(LA60_11>=35 && LA60_11<=41)||(LA60_11>=79 && LA60_11<=80)) ) {
                    alt60=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4519:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 60, 11, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                int LA60_12 = input.LA(2);

                if ( (LA60_12==42) ) {
                    alt60=1;
                }
                else if ( (LA60_12==EOF||(LA60_12>=15 && LA60_12<=16)||LA60_12==18||LA60_12==20||(LA60_12>=35 && LA60_12<=41)||(LA60_12>=79 && LA60_12<=80)) ) {
                    alt60=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4519:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 60, 12, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                int LA60_13 = input.LA(2);

                if ( (LA60_13==EOF||(LA60_13>=15 && LA60_13<=16)||LA60_13==18||LA60_13==20||(LA60_13>=35 && LA60_13<=41)||(LA60_13>=79 && LA60_13<=80)) ) {
                    alt60=2;
                }
                else if ( (LA60_13==42) ) {
                    alt60=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4519:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 60, 13, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4519:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4519:2: ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4519:2: ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4519:3: ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4519:3: ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4519:4: ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )*
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4519:4: ( ( ruleUnrestrictedName ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4520:1: ( ruleUnrestrictedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4520:1: ( ruleUnrestrictedName )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4521:3: ruleUnrestrictedName
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
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTypeNameExpCS9100);
                    ruleUnrestrictedName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,42,FollowSets000.FOLLOW_42_in_ruleTypeNameExpCS9110); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeNameExpCSAccess().getColonColonKeyword_0_0_1(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4542:1: ( ( ( ruleUnreservedName ) ) '::' )*
                    loop59:
                    do {
                        int alt59=2;
                        switch ( input.LA(1) ) {
                        case RULE_ID:
                            {
                            int LA59_1 = input.LA(2);

                            if ( (LA59_1==42) ) {
                                alt59=1;
                            }


                            }
                            break;
                        case 46:
                            {
                            int LA59_2 = input.LA(2);

                            if ( (LA59_2==42) ) {
                                alt59=1;
                            }


                            }
                            break;
                        case 47:
                            {
                            int LA59_3 = input.LA(2);

                            if ( (LA59_3==42) ) {
                                alt59=1;
                            }


                            }
                            break;
                        case 15:
                            {
                            int LA59_4 = input.LA(2);

                            if ( (LA59_4==42) ) {
                                alt59=1;
                            }


                            }
                            break;
                        case 63:
                            {
                            int LA59_5 = input.LA(2);

                            if ( (LA59_5==42) ) {
                                alt59=1;
                            }


                            }
                            break;
                        case 20:
                            {
                            int LA59_6 = input.LA(2);

                            if ( (LA59_6==42) ) {
                                alt59=1;
                            }


                            }
                            break;
                        case 21:
                            {
                            int LA59_7 = input.LA(2);

                            if ( (LA59_7==42) ) {
                                alt59=1;
                            }


                            }
                            break;
                        case 40:
                            {
                            int LA59_8 = input.LA(2);

                            if ( (LA59_8==42) ) {
                                alt59=1;
                            }


                            }
                            break;
                        case 41:
                            {
                            int LA59_9 = input.LA(2);

                            if ( (LA59_9==42) ) {
                                alt59=1;
                            }


                            }
                            break;
                        case 16:
                            {
                            int LA59_10 = input.LA(2);

                            if ( (LA59_10==42) ) {
                                alt59=1;
                            }


                            }
                            break;
                        case 17:
                            {
                            int LA59_11 = input.LA(2);

                            if ( (LA59_11==42) ) {
                                alt59=1;
                            }


                            }
                            break;
                        case 18:
                            {
                            int LA59_12 = input.LA(2);

                            if ( (LA59_12==42) ) {
                                alt59=1;
                            }


                            }
                            break;
                        case 19:
                            {
                            int LA59_13 = input.LA(2);

                            if ( (LA59_13==42) ) {
                                alt59=1;
                            }


                            }
                            break;

                        }

                        switch (alt59) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4542:2: ( ( ruleUnreservedName ) ) '::'
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4542:2: ( ( ruleUnreservedName ) )
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4543:1: ( ruleUnreservedName )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4543:1: ( ruleUnreservedName )
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4544:3: ruleUnreservedName
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
                    	    pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_ruleTypeNameExpCS9138);
                    	    ruleUnreservedName();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    match(input,42,FollowSets000.FOLLOW_42_in_ruleTypeNameExpCS9148); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getTypeNameExpCSAccess().getColonColonKeyword_0_0_2_1(), null); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }

                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4565:4: ( ( ruleUnreservedName ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4566:1: ( ruleUnreservedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4566:1: ( ruleUnreservedName )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4567:3: ruleUnreservedName
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
                    pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_ruleTypeNameExpCS9178);
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
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4585:6: ( ( ruleUnrestrictedName ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4585:6: ( ( ruleUnrestrictedName ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4586:1: ( ruleUnrestrictedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4586:1: ( ruleUnrestrictedName )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4587:3: ruleUnrestrictedName
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
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTypeNameExpCS9212);
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4612:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4613:2: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4614:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_entryRuleTypeExpCS9248);
            iv_ruleTypeExpCS=ruleTypeExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeExpCS9258); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4621:1: ruleTypeExpCS returns [EObject current=null] : (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4626:6: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4627:1: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4627:1: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID||(LA61_0>=15 && LA61_0<=21)||(LA61_0>=40 && LA61_0<=41)||(LA61_0>=46 && LA61_0<=47)||LA61_0==63) ) {
                alt61=1;
            }
            else if ( ((LA61_0>=22 && LA61_0<=31)||(LA61_0>=64 && LA61_0<=69)) ) {
                alt61=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4627:1: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4628:2: this_TypeNameExpCS_0= ruleTypeNameExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeNameExpCSParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeNameExpCS_in_ruleTypeExpCS9308);
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
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4641:2: this_TypeLiteralCS_1= ruleTypeLiteralCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeLiteralCSParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_ruleTypeExpCS9338);
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4660:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4661:2: (iv_ruleExpCS= ruleExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4662:2: iv_ruleExpCS= ruleExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_entryRuleExpCS9373);
            iv_ruleExpCS=ruleExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpCS9383); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4669:1: ruleExpCS returns [EObject current=null] : this_InfixedExpCS_0= ruleInfixedExpCS ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_InfixedExpCS_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4674:6: (this_InfixedExpCS_0= ruleInfixedExpCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4676:2: this_InfixedExpCS_0= ruleInfixedExpCS
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getExpCSAccess().getInfixedExpCSParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixedExpCS_in_ruleExpCS9432);
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4695:1: entryRuleInfixedExpCS returns [EObject current=null] : iv_ruleInfixedExpCS= ruleInfixedExpCS EOF ;
    public final EObject entryRuleInfixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixedExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4696:2: (iv_ruleInfixedExpCS= ruleInfixedExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4697:2: iv_ruleInfixedExpCS= ruleInfixedExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInfixedExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixedExpCS_in_entryRuleInfixedExpCS9466);
            iv_ruleInfixedExpCS=ruleInfixedExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInfixedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfixedExpCS9476); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4704:1: ruleInfixedExpCS returns [EObject current=null] : (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? ) ;
    public final EObject ruleInfixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedExpCS_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4709:6: ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4710:1: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4710:1: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4711:2: this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getInfixedExpCSAccess().getPrefixedExpCSParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_ruleInfixedExpCS9526);
            this_PrefixedExpCS_0=rulePrefixedExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_PrefixedExpCS_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4722:1: ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?
            int alt63=2;
            switch ( input.LA(1) ) {
                case 51:
                    {
                    int LA63_1 = input.LA(2);

                    if ( (synpred111()) ) {
                        alt63=1;
                    }
                    }
                    break;
                case 52:
                    {
                    int LA63_2 = input.LA(2);

                    if ( (synpred111()) ) {
                        alt63=1;
                    }
                    }
                    break;
                case 48:
                    {
                    int LA63_3 = input.LA(2);

                    if ( (synpred111()) ) {
                        alt63=1;
                    }
                    }
                    break;
                case 49:
                    {
                    int LA63_4 = input.LA(2);

                    if ( (synpred111()) ) {
                        alt63=1;
                    }
                    }
                    break;
                case 53:
                    {
                    int LA63_5 = input.LA(2);

                    if ( (synpred111()) ) {
                        alt63=1;
                    }
                    }
                    break;
                case 54:
                    {
                    int LA63_6 = input.LA(2);

                    if ( (synpred111()) ) {
                        alt63=1;
                    }
                    }
                    break;
                case 55:
                    {
                    int LA63_7 = input.LA(2);

                    if ( (synpred111()) ) {
                        alt63=1;
                    }
                    }
                    break;
                case 56:
                    {
                    int LA63_8 = input.LA(2);

                    if ( (synpred111()) ) {
                        alt63=1;
                    }
                    }
                    break;
                case 37:
                    {
                    int LA63_9 = input.LA(2);

                    if ( (synpred111()) ) {
                        alt63=1;
                    }
                    }
                    break;
                case 57:
                    {
                    int LA63_10 = input.LA(2);

                    if ( (synpred111()) ) {
                        alt63=1;
                    }
                    }
                    break;
                case 58:
                    {
                    int LA63_11 = input.LA(2);

                    if ( (synpred111()) ) {
                        alt63=1;
                    }
                    }
                    break;
                case 59:
                    {
                    int LA63_12 = input.LA(2);

                    if ( (synpred111()) ) {
                        alt63=1;
                    }
                    }
                    break;
                case 60:
                    {
                    int LA63_13 = input.LA(2);

                    if ( (synpred111()) ) {
                        alt63=1;
                    }
                    }
                    break;
                case 61:
                    {
                    int LA63_14 = input.LA(2);

                    if ( (synpred111()) ) {
                        alt63=1;
                    }
                    }
                    break;
                case 45:
                    {
                    int LA63_15 = input.LA(2);

                    if ( (synpred111()) ) {
                        alt63=1;
                    }
                    }
                    break;
                case 62:
                    {
                    int LA63_16 = input.LA(2);

                    if ( (synpred111()) ) {
                        alt63=1;
                    }
                    }
                    break;
                case 13:
                    {
                    int LA63_17 = input.LA(2);

                    if ( (synpred111()) ) {
                        alt63=1;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA63_18 = input.LA(2);

                    if ( (synpred111()) ) {
                        alt63=1;
                    }
                    }
                    break;
            }

            switch (alt63) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4722:2: () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4722:2: ()
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4723:2: 
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

                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4741:2: ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=2;
                        switch ( input.LA(1) ) {
                        case 51:
                            {
                            int LA62_2 = input.LA(2);

                            if ( (synpred110()) ) {
                                alt62=1;
                            }


                            }
                            break;
                        case 52:
                            {
                            int LA62_3 = input.LA(2);

                            if ( (synpred110()) ) {
                                alt62=1;
                            }


                            }
                            break;
                        case 48:
                            {
                            int LA62_4 = input.LA(2);

                            if ( (synpred110()) ) {
                                alt62=1;
                            }


                            }
                            break;
                        case 49:
                            {
                            int LA62_5 = input.LA(2);

                            if ( (synpred110()) ) {
                                alt62=1;
                            }


                            }
                            break;
                        case 53:
                            {
                            int LA62_6 = input.LA(2);

                            if ( (synpred110()) ) {
                                alt62=1;
                            }


                            }
                            break;
                        case 54:
                            {
                            int LA62_7 = input.LA(2);

                            if ( (synpred110()) ) {
                                alt62=1;
                            }


                            }
                            break;
                        case 55:
                            {
                            int LA62_8 = input.LA(2);

                            if ( (synpred110()) ) {
                                alt62=1;
                            }


                            }
                            break;
                        case 56:
                            {
                            int LA62_9 = input.LA(2);

                            if ( (synpred110()) ) {
                                alt62=1;
                            }


                            }
                            break;
                        case 37:
                            {
                            int LA62_10 = input.LA(2);

                            if ( (synpred110()) ) {
                                alt62=1;
                            }


                            }
                            break;
                        case 57:
                            {
                            int LA62_11 = input.LA(2);

                            if ( (synpred110()) ) {
                                alt62=1;
                            }


                            }
                            break;
                        case 58:
                            {
                            int LA62_12 = input.LA(2);

                            if ( (synpred110()) ) {
                                alt62=1;
                            }


                            }
                            break;
                        case 59:
                            {
                            int LA62_13 = input.LA(2);

                            if ( (synpred110()) ) {
                                alt62=1;
                            }


                            }
                            break;
                        case 60:
                            {
                            int LA62_14 = input.LA(2);

                            if ( (synpred110()) ) {
                                alt62=1;
                            }


                            }
                            break;
                        case 61:
                            {
                            int LA62_15 = input.LA(2);

                            if ( (synpred110()) ) {
                                alt62=1;
                            }


                            }
                            break;
                        case 45:
                            {
                            int LA62_16 = input.LA(2);

                            if ( (synpred110()) ) {
                                alt62=1;
                            }


                            }
                            break;
                        case 62:
                            {
                            int LA62_17 = input.LA(2);

                            if ( (synpred110()) ) {
                                alt62=1;
                            }


                            }
                            break;
                        case 13:
                            {
                            int LA62_18 = input.LA(2);

                            if ( (synpred110()) ) {
                                alt62=1;
                            }


                            }
                            break;
                        case 14:
                            {
                            int LA62_19 = input.LA(2);

                            if ( (synpred110()) ) {
                                alt62=1;
                            }


                            }
                            break;

                        }

                        switch (alt62) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4741:3: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4741:3: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) )
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4742:1: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4742:1: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4743:3: lv_ownedOperator_2_0= ruleBinaryOperatorCS
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_1_1_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_ruleInfixedExpCS9560);
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

                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4765:2: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4766:1: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4766:1: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4767:3: lv_ownedExpression_3_0= rulePrefixedExpCS
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_ruleInfixedExpCS9581);
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
                    	    if ( cnt62 >= 1 ) break loop62;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(62, input);
                                throw eee;
                        }
                        cnt62++;
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4797:1: entryRuleBinaryOperatorCS returns [EObject current=null] : iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF ;
    public final EObject entryRuleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperatorCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4798:2: (iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4799:2: iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBinaryOperatorCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_entryRuleBinaryOperatorCS9621);
            iv_ruleBinaryOperatorCS=ruleBinaryOperatorCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBinaryOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryOperatorCS9631); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4806:1: ruleBinaryOperatorCS returns [EObject current=null] : (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) ;
    public final EObject ruleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject this_InfixOperatorCS_0 = null;

        EObject this_NavigationOperatorCS_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4811:6: ( (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4812:1: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4812:1: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==37||(LA64_0>=48 && LA64_0<=49)||(LA64_0>=51 && LA64_0<=61)) ) {
                alt64=1;
            }
            else if ( ((LA64_0>=13 && LA64_0<=14)||LA64_0==45||LA64_0==62) ) {
                alt64=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4812:1: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4813:2: this_InfixOperatorCS_0= ruleInfixOperatorCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBinaryOperatorCSAccess().getInfixOperatorCSParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInfixOperatorCS_in_ruleBinaryOperatorCS9681);
                    this_InfixOperatorCS_0=ruleInfixOperatorCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_InfixOperatorCS_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4826:2: this_NavigationOperatorCS_1= ruleNavigationOperatorCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBinaryOperatorCSAccess().getNavigationOperatorCSParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigationOperatorCS_in_ruleBinaryOperatorCS9711);
                    this_NavigationOperatorCS_1=ruleNavigationOperatorCS();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NavigationOperatorCS_1; 
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
    // $ANTLR end ruleBinaryOperatorCS


    // $ANTLR start entryRuleInfixOperatorCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4845:1: entryRuleInfixOperatorCS returns [EObject current=null] : iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF ;
    public final EObject entryRuleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixOperatorCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4846:2: (iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4847:2: iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInfixOperatorCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixOperatorCS_in_entryRuleInfixOperatorCS9746);
            iv_ruleInfixOperatorCS=ruleInfixOperatorCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInfixOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfixOperatorCS9756); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInfixOperatorCS


    // $ANTLR start ruleInfixOperatorCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4854:1: ruleInfixOperatorCS returns [EObject current=null] : ( (lv_name_0_0= ruleInfixOperator ) ) ;
    public final EObject ruleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4859:6: ( ( (lv_name_0_0= ruleInfixOperator ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4860:1: ( (lv_name_0_0= ruleInfixOperator ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4860:1: ( (lv_name_0_0= ruleInfixOperator ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4861:1: (lv_name_0_0= ruleInfixOperator )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4861:1: (lv_name_0_0= ruleInfixOperator )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4862:3: lv_name_0_0= ruleInfixOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInfixOperatorCSAccess().getNameInfixOperatorParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixOperator_in_ruleInfixOperatorCS9801);
            lv_name_0_0=ruleInfixOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInfixOperatorCSRule().getType().getClassifier());
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
    // $ANTLR end ruleInfixOperatorCS


    // $ANTLR start entryRuleNavigationOperatorCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4892:1: entryRuleNavigationOperatorCS returns [EObject current=null] : iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF ;
    public final EObject entryRuleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationOperatorCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4893:2: (iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4894:2: iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNavigationOperatorCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigationOperatorCS_in_entryRuleNavigationOperatorCS9836);
            iv_ruleNavigationOperatorCS=ruleNavigationOperatorCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNavigationOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigationOperatorCS9846); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNavigationOperatorCS


    // $ANTLR start ruleNavigationOperatorCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4901:1: ruleNavigationOperatorCS returns [EObject current=null] : ( (lv_name_0_0= ruleNavigationOperator ) ) ;
    public final EObject ruleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4906:6: ( ( (lv_name_0_0= ruleNavigationOperator ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4907:1: ( (lv_name_0_0= ruleNavigationOperator ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4907:1: ( (lv_name_0_0= ruleNavigationOperator ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4908:1: (lv_name_0_0= ruleNavigationOperator )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4908:1: (lv_name_0_0= ruleNavigationOperator )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4909:3: lv_name_0_0= ruleNavigationOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNavigationOperatorCSAccess().getNameNavigationOperatorParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigationOperator_in_ruleNavigationOperatorCS9891);
            lv_name_0_0=ruleNavigationOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNavigationOperatorCSRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"NavigationOperator", 
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
    // $ANTLR end ruleNavigationOperatorCS


    // $ANTLR start entryRulePrefixedExpCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4939:1: entryRulePrefixedExpCS returns [EObject current=null] : iv_rulePrefixedExpCS= rulePrefixedExpCS EOF ;
    public final EObject entryRulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4940:2: (iv_rulePrefixedExpCS= rulePrefixedExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4941:2: iv_rulePrefixedExpCS= rulePrefixedExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrefixedExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_entryRulePrefixedExpCS9926);
            iv_rulePrefixedExpCS=rulePrefixedExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrefixedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrefixedExpCS9936); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4948:1: rulePrefixedExpCS returns [EObject current=null] : (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) ) ;
    public final EObject rulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpCS_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4953:6: ( (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4954:1: (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4954:1: (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=RULE_SINGLE_QUOTED_STRING && LA66_0<=RULE_ID)||(LA66_0>=15 && LA66_0<=31)||LA66_0==34||(LA66_0>=40 && LA66_0<=41)||(LA66_0>=46 && LA66_0<=47)||LA66_0==51||(LA66_0>=63 && LA66_0<=69)||(LA66_0>=73 && LA66_0<=76)||LA66_0==81||LA66_0==85||LA66_0==87) ) {
                alt66=1;
            }
            else if ( ((LA66_0>=49 && LA66_0<=50)) ) {
                alt66=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4954:1: (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) )", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4955:2: this_PrimaryExpCS_0= rulePrimaryExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrefixedExpCSAccess().getPrimaryExpCSParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS9986);
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
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4967:6: ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4967:6: ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4967:7: () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4967:7: ()
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4968:2: 
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

                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4981:2: ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( ((LA65_0>=49 && LA65_0<=50)) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4982:1: (lv_ownedOperator_2_0= ruleUnaryOperatorCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4982:1: (lv_ownedOperator_2_0= ruleUnaryOperatorCS )
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4983:3: lv_ownedOperator_2_0= ruleUnaryOperatorCS
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getPrefixedExpCSAccess().getOwnedOperatorUnaryOperatorCSParserRuleCall_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorCS_in_rulePrefixedExpCS10025);
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
                    	    if ( cnt65 >= 1 ) break loop65;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
                    } while (true);

                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5005:3: ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5006:1: (lv_ownedExpression_3_0= rulePrimaryExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5006:1: (lv_ownedExpression_3_0= rulePrimaryExpCS )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5007:3: lv_ownedExpression_3_0= rulePrimaryExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPrefixedExpCSAccess().getOwnedExpressionPrimaryExpCSParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS10047);
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5037:1: entryRuleUnaryOperatorCS returns [EObject current=null] : iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF ;
    public final EObject entryRuleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperatorCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5038:2: (iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5039:2: iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnaryOperatorCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorCS_in_entryRuleUnaryOperatorCS10084);
            iv_ruleUnaryOperatorCS=ruleUnaryOperatorCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnaryOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryOperatorCS10094); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5046:1: ruleUnaryOperatorCS returns [EObject current=null] : ( (lv_name_0_0= rulePrefixOperator ) ) ;
    public final EObject ruleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5051:6: ( ( (lv_name_0_0= rulePrefixOperator ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5052:1: ( (lv_name_0_0= rulePrefixOperator ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5052:1: ( (lv_name_0_0= rulePrefixOperator ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5053:1: (lv_name_0_0= rulePrefixOperator )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5053:1: (lv_name_0_0= rulePrefixOperator )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5054:3: lv_name_0_0= rulePrefixOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUnaryOperatorCSAccess().getNamePrefixOperatorParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixOperator_in_ruleUnaryOperatorCS10139);
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5084:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5085:2: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5086:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimaryExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_entryRulePrimaryExpCS10174);
            iv_rulePrimaryExpCS=rulePrimaryExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimaryExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpCS10184); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5093:1: rulePrimaryExpCS returns [EObject current=null] : (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS ) ;
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
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5098:6: ( (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5099:1: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5099:1: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )
            int alt67=9;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 40:
            case 41:
            case 46:
            case 47:
            case 63:
                {
                alt67=1;
                }
                break;
            case 87:
                {
                alt67=2;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
            case RULE_INT:
            case 51:
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt67=3;
                }
                break;
            case 69:
                {
                int LA67_22 = input.LA(2);

                if ( (synpred118()) ) {
                    alt67=4;
                }
                else if ( (synpred120()) ) {
                    alt67=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("5099:1: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )", 67, 22, input);

                    throw nvae;
                }
                }
                break;
            case 64:
                {
                int LA67_23 = input.LA(2);

                if ( (synpred119()) ) {
                    alt67=5;
                }
                else if ( (synpred120()) ) {
                    alt67=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("5099:1: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )", 67, 23, input);

                    throw nvae;
                }
                }
                break;
            case 65:
                {
                int LA67_24 = input.LA(2);

                if ( (synpred119()) ) {
                    alt67=5;
                }
                else if ( (synpred120()) ) {
                    alt67=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("5099:1: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )", 67, 24, input);

                    throw nvae;
                }
                }
                break;
            case 66:
                {
                int LA67_25 = input.LA(2);

                if ( (synpred119()) ) {
                    alt67=5;
                }
                else if ( (synpred120()) ) {
                    alt67=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("5099:1: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )", 67, 25, input);

                    throw nvae;
                }
                }
                break;
            case 67:
                {
                int LA67_26 = input.LA(2);

                if ( (synpred119()) ) {
                    alt67=5;
                }
                else if ( (synpred120()) ) {
                    alt67=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("5099:1: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )", 67, 26, input);

                    throw nvae;
                }
                }
                break;
            case 68:
                {
                int LA67_27 = input.LA(2);

                if ( (synpred119()) ) {
                    alt67=5;
                }
                else if ( (synpred120()) ) {
                    alt67=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("5099:1: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )", 67, 27, input);

                    throw nvae;
                }
                }
                break;
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                {
                alt67=6;
                }
                break;
            case 85:
                {
                alt67=7;
                }
                break;
            case 81:
                {
                alt67=8;
                }
                break;
            case 34:
                {
                alt67=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5099:1: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5100:2: this_NavigatingExpCS_0= ruleNavigatingExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNavigatingExpCSParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingExpCS_in_rulePrimaryExpCS10234);
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
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5113:2: this_SelfExpCS_1= ruleSelfExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSelfExpCSParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSelfExpCS_in_rulePrimaryExpCS10264);
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
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5126:2: this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPrimitiveLiteralExpCSParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveLiteralExpCS_in_rulePrimaryExpCS10294);
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
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5139:2: this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTupleLiteralExpCSParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_rulePrimaryExpCS10324);
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
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5152:2: this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpCSAccess().getCollectionLiteralExpCSParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_rulePrimaryExpCS10354);
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
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5165:2: this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTypeLiteralExpCSParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_rulePrimaryExpCS10384);
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
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5178:2: this_LetExpCS_6= ruleLetExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpCSAccess().getLetExpCSParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_rulePrimaryExpCS10414);
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
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5191:2: this_IfExpCS_7= ruleIfExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpCSAccess().getIfExpCSParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIfExpCS_in_rulePrimaryExpCS10444);
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
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5204:2: this_NestedExpCS_8= ruleNestedExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNestedExpCSParserRuleCall_8(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNestedExpCS_in_rulePrimaryExpCS10474);
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5223:1: entryRuleNameExpCS returns [EObject current=null] : iv_ruleNameExpCS= ruleNameExpCS EOF ;
    public final EObject entryRuleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5224:2: (iv_ruleNameExpCS= ruleNameExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5225:2: iv_ruleNameExpCS= ruleNameExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNameExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNameExpCS_in_entryRuleNameExpCS10509);
            iv_ruleNameExpCS=ruleNameExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNameExpCS10519); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5232:1: ruleNameExpCS returns [EObject current=null] : ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) ) ;
    public final EObject ruleNameExpCS() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5237:6: ( ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5238:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5238:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )
            int alt69=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA69_1 = input.LA(2);

                if ( (LA69_1==42) ) {
                    alt69=1;
                }
                else if ( (LA69_1==EOF||(LA69_1>=13 && LA69_1<=18)||(LA69_1>=20 && LA69_1<=21)||(LA69_1>=32 && LA69_1<=41)||LA69_1==43||LA69_1==45||(LA69_1>=48 && LA69_1<=49)||(LA69_1>=51 && LA69_1<=62)||(LA69_1>=71 && LA69_1<=72)||(LA69_1>=77 && LA69_1<=80)||(LA69_1>=82 && LA69_1<=84)||LA69_1==86) ) {
                    alt69=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("5238:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 69, 1, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                int LA69_2 = input.LA(2);

                if ( (LA69_2==42) ) {
                    alt69=1;
                }
                else if ( (LA69_2==EOF||(LA69_2>=13 && LA69_2<=18)||(LA69_2>=20 && LA69_2<=21)||(LA69_2>=32 && LA69_2<=41)||LA69_2==43||LA69_2==45||(LA69_2>=48 && LA69_2<=49)||(LA69_2>=51 && LA69_2<=62)||(LA69_2>=71 && LA69_2<=72)||(LA69_2>=77 && LA69_2<=80)||(LA69_2>=82 && LA69_2<=84)||LA69_2==86) ) {
                    alt69=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("5238:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 69, 2, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA69_3 = input.LA(2);

                if ( (LA69_3==EOF||(LA69_3>=13 && LA69_3<=18)||(LA69_3>=20 && LA69_3<=21)||(LA69_3>=32 && LA69_3<=41)||LA69_3==43||LA69_3==45||(LA69_3>=48 && LA69_3<=49)||(LA69_3>=51 && LA69_3<=62)||(LA69_3>=71 && LA69_3<=72)||(LA69_3>=77 && LA69_3<=80)||(LA69_3>=82 && LA69_3<=84)||LA69_3==86) ) {
                    alt69=2;
                }
                else if ( (LA69_3==42) ) {
                    alt69=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("5238:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 69, 3, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA69_4 = input.LA(2);

                if ( (LA69_4==EOF||(LA69_4>=13 && LA69_4<=18)||(LA69_4>=20 && LA69_4<=21)||(LA69_4>=32 && LA69_4<=41)||LA69_4==43||LA69_4==45||(LA69_4>=48 && LA69_4<=49)||(LA69_4>=51 && LA69_4<=62)||(LA69_4>=71 && LA69_4<=72)||(LA69_4>=77 && LA69_4<=80)||(LA69_4>=82 && LA69_4<=84)||LA69_4==86) ) {
                    alt69=2;
                }
                else if ( (LA69_4==42) ) {
                    alt69=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("5238:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 69, 4, input);

                    throw nvae;
                }
                }
                break;
            case 63:
                {
                int LA69_5 = input.LA(2);

                if ( (LA69_5==EOF||(LA69_5>=13 && LA69_5<=18)||(LA69_5>=20 && LA69_5<=21)||(LA69_5>=32 && LA69_5<=41)||LA69_5==43||LA69_5==45||(LA69_5>=48 && LA69_5<=49)||(LA69_5>=51 && LA69_5<=62)||(LA69_5>=71 && LA69_5<=72)||(LA69_5>=77 && LA69_5<=80)||(LA69_5>=82 && LA69_5<=84)||LA69_5==86) ) {
                    alt69=2;
                }
                else if ( (LA69_5==42) ) {
                    alt69=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("5238:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 69, 5, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                int LA69_6 = input.LA(2);

                if ( (LA69_6==EOF||(LA69_6>=13 && LA69_6<=18)||(LA69_6>=20 && LA69_6<=21)||(LA69_6>=32 && LA69_6<=41)||LA69_6==43||LA69_6==45||(LA69_6>=48 && LA69_6<=49)||(LA69_6>=51 && LA69_6<=62)||(LA69_6>=71 && LA69_6<=72)||(LA69_6>=77 && LA69_6<=80)||(LA69_6>=82 && LA69_6<=84)||LA69_6==86) ) {
                    alt69=2;
                }
                else if ( (LA69_6==42) ) {
                    alt69=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("5238:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 69, 6, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                int LA69_7 = input.LA(2);

                if ( (LA69_7==42) ) {
                    alt69=1;
                }
                else if ( (LA69_7==EOF||(LA69_7>=13 && LA69_7<=18)||(LA69_7>=20 && LA69_7<=21)||(LA69_7>=32 && LA69_7<=41)||LA69_7==43||LA69_7==45||(LA69_7>=48 && LA69_7<=49)||(LA69_7>=51 && LA69_7<=62)||(LA69_7>=71 && LA69_7<=72)||(LA69_7>=77 && LA69_7<=80)||(LA69_7>=82 && LA69_7<=84)||LA69_7==86) ) {
                    alt69=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("5238:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 69, 7, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                int LA69_8 = input.LA(2);

                if ( (LA69_8==42) ) {
                    alt69=1;
                }
                else if ( (LA69_8==EOF||(LA69_8>=13 && LA69_8<=18)||(LA69_8>=20 && LA69_8<=21)||(LA69_8>=32 && LA69_8<=41)||LA69_8==43||LA69_8==45||(LA69_8>=48 && LA69_8<=49)||(LA69_8>=51 && LA69_8<=62)||(LA69_8>=71 && LA69_8<=72)||(LA69_8>=77 && LA69_8<=80)||(LA69_8>=82 && LA69_8<=84)||LA69_8==86) ) {
                    alt69=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("5238:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 69, 8, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                int LA69_9 = input.LA(2);

                if ( (LA69_9==42) ) {
                    alt69=1;
                }
                else if ( (LA69_9==EOF||(LA69_9>=13 && LA69_9<=18)||(LA69_9>=20 && LA69_9<=21)||(LA69_9>=32 && LA69_9<=41)||LA69_9==43||LA69_9==45||(LA69_9>=48 && LA69_9<=49)||(LA69_9>=51 && LA69_9<=62)||(LA69_9>=71 && LA69_9<=72)||(LA69_9>=77 && LA69_9<=80)||(LA69_9>=82 && LA69_9<=84)||LA69_9==86) ) {
                    alt69=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("5238:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 69, 9, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA69_10 = input.LA(2);

                if ( (LA69_10==42) ) {
                    alt69=1;
                }
                else if ( (LA69_10==EOF||(LA69_10>=13 && LA69_10<=18)||(LA69_10>=20 && LA69_10<=21)||(LA69_10>=32 && LA69_10<=41)||LA69_10==43||LA69_10==45||(LA69_10>=48 && LA69_10<=49)||(LA69_10>=51 && LA69_10<=62)||(LA69_10>=71 && LA69_10<=72)||(LA69_10>=77 && LA69_10<=80)||(LA69_10>=82 && LA69_10<=84)||LA69_10==86) ) {
                    alt69=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("5238:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 69, 10, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                int LA69_11 = input.LA(2);

                if ( (LA69_11==EOF||(LA69_11>=13 && LA69_11<=18)||(LA69_11>=20 && LA69_11<=21)||(LA69_11>=32 && LA69_11<=41)||LA69_11==43||LA69_11==45||(LA69_11>=48 && LA69_11<=49)||(LA69_11>=51 && LA69_11<=62)||(LA69_11>=71 && LA69_11<=72)||(LA69_11>=77 && LA69_11<=80)||(LA69_11>=82 && LA69_11<=84)||LA69_11==86) ) {
                    alt69=2;
                }
                else if ( (LA69_11==42) ) {
                    alt69=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("5238:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 69, 11, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                int LA69_12 = input.LA(2);

                if ( (LA69_12==EOF||(LA69_12>=13 && LA69_12<=18)||(LA69_12>=20 && LA69_12<=21)||(LA69_12>=32 && LA69_12<=41)||LA69_12==43||LA69_12==45||(LA69_12>=48 && LA69_12<=49)||(LA69_12>=51 && LA69_12<=62)||(LA69_12>=71 && LA69_12<=72)||(LA69_12>=77 && LA69_12<=80)||(LA69_12>=82 && LA69_12<=84)||LA69_12==86) ) {
                    alt69=2;
                }
                else if ( (LA69_12==42) ) {
                    alt69=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("5238:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 69, 12, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                int LA69_13 = input.LA(2);

                if ( (LA69_13==EOF||(LA69_13>=13 && LA69_13<=18)||(LA69_13>=20 && LA69_13<=21)||(LA69_13>=32 && LA69_13<=41)||LA69_13==43||LA69_13==45||(LA69_13>=48 && LA69_13<=49)||(LA69_13>=51 && LA69_13<=62)||(LA69_13>=71 && LA69_13<=72)||(LA69_13>=77 && LA69_13<=80)||(LA69_13>=82 && LA69_13<=84)||LA69_13==86) ) {
                    alt69=2;
                }
                else if ( (LA69_13==42) ) {
                    alt69=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("5238:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 69, 13, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5238:1: ( ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) ) | ( ( ruleUnrestrictedName ) ) )", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5238:2: ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5238:2: ( ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5238:3: ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* ) ( ( ruleUnreservedName ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5238:3: ( ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )* )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5238:4: ( ( ruleUnrestrictedName ) ) '::' ( ( ( ruleUnreservedName ) ) '::' )*
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5238:4: ( ( ruleUnrestrictedName ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5239:1: ( ruleUnrestrictedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5239:1: ( ruleUnrestrictedName )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5240:3: ruleUnrestrictedName
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
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleNameExpCS10573);
                    ruleUnrestrictedName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,42,FollowSets000.FOLLOW_42_in_ruleNameExpCS10583); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNameExpCSAccess().getColonColonKeyword_0_0_1(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5261:1: ( ( ( ruleUnreservedName ) ) '::' )*
                    loop68:
                    do {
                        int alt68=2;
                        switch ( input.LA(1) ) {
                        case RULE_ID:
                            {
                            int LA68_1 = input.LA(2);

                            if ( (LA68_1==42) ) {
                                alt68=1;
                            }


                            }
                            break;
                        case 46:
                            {
                            int LA68_2 = input.LA(2);

                            if ( (LA68_2==42) ) {
                                alt68=1;
                            }


                            }
                            break;
                        case 47:
                            {
                            int LA68_3 = input.LA(2);

                            if ( (LA68_3==42) ) {
                                alt68=1;
                            }


                            }
                            break;
                        case 15:
                            {
                            int LA68_4 = input.LA(2);

                            if ( (LA68_4==42) ) {
                                alt68=1;
                            }


                            }
                            break;
                        case 63:
                            {
                            int LA68_5 = input.LA(2);

                            if ( (LA68_5==42) ) {
                                alt68=1;
                            }


                            }
                            break;
                        case 20:
                            {
                            int LA68_6 = input.LA(2);

                            if ( (LA68_6==42) ) {
                                alt68=1;
                            }


                            }
                            break;
                        case 21:
                            {
                            int LA68_7 = input.LA(2);

                            if ( (LA68_7==42) ) {
                                alt68=1;
                            }


                            }
                            break;
                        case 40:
                            {
                            int LA68_8 = input.LA(2);

                            if ( (LA68_8==42) ) {
                                alt68=1;
                            }


                            }
                            break;
                        case 41:
                            {
                            int LA68_9 = input.LA(2);

                            if ( (LA68_9==42) ) {
                                alt68=1;
                            }


                            }
                            break;
                        case 16:
                            {
                            int LA68_10 = input.LA(2);

                            if ( (LA68_10==42) ) {
                                alt68=1;
                            }


                            }
                            break;
                        case 17:
                            {
                            int LA68_11 = input.LA(2);

                            if ( (LA68_11==42) ) {
                                alt68=1;
                            }


                            }
                            break;
                        case 18:
                            {
                            int LA68_12 = input.LA(2);

                            if ( (LA68_12==42) ) {
                                alt68=1;
                            }


                            }
                            break;
                        case 19:
                            {
                            int LA68_13 = input.LA(2);

                            if ( (LA68_13==42) ) {
                                alt68=1;
                            }


                            }
                            break;

                        }

                        switch (alt68) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5261:2: ( ( ruleUnreservedName ) ) '::'
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5261:2: ( ( ruleUnreservedName ) )
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5262:1: ( ruleUnreservedName )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5262:1: ( ruleUnreservedName )
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5263:3: ruleUnreservedName
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
                    	    pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_ruleNameExpCS10611);
                    	    ruleUnreservedName();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    match(input,42,FollowSets000.FOLLOW_42_in_ruleNameExpCS10621); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getNameExpCSAccess().getColonColonKeyword_0_0_2_1(), null); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    }

                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5284:4: ( ( ruleUnreservedName ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5285:1: ( ruleUnreservedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5285:1: ( ruleUnreservedName )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5286:3: ruleUnreservedName
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
                    pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_ruleNameExpCS10651);
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
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5304:6: ( ( ruleUnrestrictedName ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5304:6: ( ( ruleUnrestrictedName ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5305:1: ( ruleUnrestrictedName )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5305:1: ( ruleUnrestrictedName )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5306:3: ruleUnrestrictedName
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
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleNameExpCS10685);
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5331:1: entryRuleIndexExpCS returns [EObject current=null] : iv_ruleIndexExpCS= ruleIndexExpCS EOF ;
    public final EObject entryRuleIndexExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5332:2: (iv_ruleIndexExpCS= ruleIndexExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5333:2: iv_ruleIndexExpCS= ruleIndexExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIndexExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIndexExpCS_in_entryRuleIndexExpCS10721);
            iv_ruleIndexExpCS=ruleIndexExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIndexExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIndexExpCS10731); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5340:1: ruleIndexExpCS returns [EObject current=null] : (this_NameExpCS_0= ruleNameExpCS ( () '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) ( ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* ']' ( '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) ( ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* ']' )? )? ) ;
    public final EObject ruleIndexExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NameExpCS_0 = null;

        EObject lv_firstIndexes_3_0 = null;

        EObject lv_firstIndexes_5_0 = null;

        EObject lv_secondIndexes_8_0 = null;

        EObject lv_secondIndexes_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5345:6: ( (this_NameExpCS_0= ruleNameExpCS ( () '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) ( ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* ']' ( '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) ( ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* ']' )? )? ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5346:1: (this_NameExpCS_0= ruleNameExpCS ( () '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) ( ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* ']' ( '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) ( ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* ']' )? )? )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5346:1: (this_NameExpCS_0= ruleNameExpCS ( () '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) ( ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* ']' ( '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) ( ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* ']' )? )? )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5347:2: this_NameExpCS_0= ruleNameExpCS ( () '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) ( ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* ']' ( '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) ( ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* ']' )? )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getIndexExpCSAccess().getNameExpCSParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNameExpCS_in_ruleIndexExpCS10781);
            this_NameExpCS_0=ruleNameExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_NameExpCS_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5358:1: ( () '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) ( ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* ']' ( '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) ( ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* ']' )? )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==77) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5358:2: () '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) ( ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* ']' ( '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) ( ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* ']' )?
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5358:2: ()
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5359:2: 
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

                    match(input,77,FollowSets000.FOLLOW_77_in_ruleIndexExpCS10803); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getIndexExpCSAccess().getLeftSquareBracketKeyword_1_1(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5381:1: ( (lv_firstIndexes_3_0= ruleExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5382:1: (lv_firstIndexes_3_0= ruleExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5382:1: (lv_firstIndexes_3_0= ruleExpCS )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5383:3: lv_firstIndexes_3_0= ruleExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getIndexExpCSAccess().getFirstIndexesExpCSParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIndexExpCS10824);
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

                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5405:2: ( ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==35) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5405:4: ',' ( (lv_firstIndexes_5_0= ruleExpCS ) )
                    	    {
                    	    match(input,35,FollowSets000.FOLLOW_35_in_ruleIndexExpCS10835); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getIndexExpCSAccess().getCommaKeyword_1_3_0(), null); 
                    	          
                    	    }
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5409:1: ( (lv_firstIndexes_5_0= ruleExpCS ) )
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5410:1: (lv_firstIndexes_5_0= ruleExpCS )
                    	    {
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5410:1: (lv_firstIndexes_5_0= ruleExpCS )
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5411:3: lv_firstIndexes_5_0= ruleExpCS
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getIndexExpCSAccess().getFirstIndexesExpCSParserRuleCall_1_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIndexExpCS10856);
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
                    	    break loop70;
                        }
                    } while (true);

                    match(input,78,FollowSets000.FOLLOW_78_in_ruleIndexExpCS10868); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getIndexExpCSAccess().getRightSquareBracketKeyword_1_4(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5437:1: ( '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) ( ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* ']' )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==77) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5437:3: '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) ( ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* ']'
                            {
                            match(input,77,FollowSets000.FOLLOW_77_in_ruleIndexExpCS10879); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getIndexExpCSAccess().getLeftSquareBracketKeyword_1_5_0(), null); 
                                  
                            }
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5441:1: ( (lv_secondIndexes_8_0= ruleExpCS ) )
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5442:1: (lv_secondIndexes_8_0= ruleExpCS )
                            {
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5442:1: (lv_secondIndexes_8_0= ruleExpCS )
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5443:3: lv_secondIndexes_8_0= ruleExpCS
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getIndexExpCSAccess().getSecondIndexesExpCSParserRuleCall_1_5_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIndexExpCS10900);
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

                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5465:2: ( ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )*
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( (LA71_0==35) ) {
                                    alt71=1;
                                }


                                switch (alt71) {
                            	case 1 :
                            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5465:4: ',' ( (lv_secondIndexes_10_0= ruleExpCS ) )
                            	    {
                            	    match(input,35,FollowSets000.FOLLOW_35_in_ruleIndexExpCS10911); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getIndexExpCSAccess().getCommaKeyword_1_5_2_0(), null); 
                            	          
                            	    }
                            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5469:1: ( (lv_secondIndexes_10_0= ruleExpCS ) )
                            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5470:1: (lv_secondIndexes_10_0= ruleExpCS )
                            	    {
                            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5470:1: (lv_secondIndexes_10_0= ruleExpCS )
                            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5471:3: lv_secondIndexes_10_0= ruleExpCS
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getIndexExpCSAccess().getSecondIndexesExpCSParserRuleCall_1_5_2_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIndexExpCS10932);
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
                            	    break loop71;
                                }
                            } while (true);

                            match(input,78,FollowSets000.FOLLOW_78_in_ruleIndexExpCS10944); if (failed) return current;
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


    // $ANTLR start entryRuleNavigatingExpCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5505:1: entryRuleNavigatingExpCS returns [EObject current=null] : iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF ;
    public final EObject entryRuleNavigatingExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5506:2: (iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5507:2: iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNavigatingExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingExpCS_in_entryRuleNavigatingExpCS10984);
            iv_ruleNavigatingExpCS=ruleNavigatingExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNavigatingExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingExpCS10994); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5514:1: ruleNavigatingExpCS returns [EObject current=null] : (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () '(' ( ( (lv_arguments_3_0= ruleNavigatingArgCSfirst ) ) ( (lv_arguments_4_0= ruleNavigatingArgCSnext ) )* )? ')' )? ) ;
    public final EObject ruleNavigatingExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NavigatingExpCS_Base_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5519:6: ( (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () '(' ( ( (lv_arguments_3_0= ruleNavigatingArgCSfirst ) ) ( (lv_arguments_4_0= ruleNavigatingArgCSnext ) )* )? ')' )? ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5520:1: (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () '(' ( ( (lv_arguments_3_0= ruleNavigatingArgCSfirst ) ) ( (lv_arguments_4_0= ruleNavigatingArgCSnext ) )* )? ')' )? )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5520:1: (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () '(' ( ( (lv_arguments_3_0= ruleNavigatingArgCSfirst ) ) ( (lv_arguments_4_0= ruleNavigatingArgCSnext ) )* )? ')' )? )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5521:2: this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () '(' ( ( (lv_arguments_3_0= ruleNavigatingArgCSfirst ) ) ( (lv_arguments_4_0= ruleNavigatingArgCSnext ) )* )? ')' )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCS_BaseParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingExpCS_Base_in_ruleNavigatingExpCS11044);
            this_NavigatingExpCS_Base_0=ruleNavigatingExpCS_Base();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_NavigatingExpCS_Base_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5532:1: ( () '(' ( ( (lv_arguments_3_0= ruleNavigatingArgCSfirst ) ) ( (lv_arguments_4_0= ruleNavigatingArgCSnext ) )* )? ')' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==34) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5532:2: () '(' ( ( (lv_arguments_3_0= ruleNavigatingArgCSfirst ) ) ( (lv_arguments_4_0= ruleNavigatingArgCSnext ) )* )? ')'
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5532:2: ()
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5533:2: 
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

                    match(input,34,FollowSets000.FOLLOW_34_in_ruleNavigatingExpCS11066); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNavigatingExpCSAccess().getLeftParenthesisKeyword_1_1(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5555:1: ( ( (lv_arguments_3_0= ruleNavigatingArgCSfirst ) ) ( (lv_arguments_4_0= ruleNavigatingArgCSnext ) )* )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( ((LA75_0>=RULE_SINGLE_QUOTED_STRING && LA75_0<=RULE_ID)||(LA75_0>=15 && LA75_0<=31)||LA75_0==34||(LA75_0>=40 && LA75_0<=41)||LA75_0==44||(LA75_0>=46 && LA75_0<=47)||(LA75_0>=49 && LA75_0<=51)||(LA75_0>=63 && LA75_0<=69)||(LA75_0>=73 && LA75_0<=76)||LA75_0==81||LA75_0==85||LA75_0==87) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5555:2: ( (lv_arguments_3_0= ruleNavigatingArgCSfirst ) ) ( (lv_arguments_4_0= ruleNavigatingArgCSnext ) )*
                            {
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5555:2: ( (lv_arguments_3_0= ruleNavigatingArgCSfirst ) )
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5556:1: (lv_arguments_3_0= ruleNavigatingArgCSfirst )
                            {
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5556:1: (lv_arguments_3_0= ruleNavigatingArgCSfirst )
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5557:3: lv_arguments_3_0= ruleNavigatingArgCSfirst
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentsNavigatingArgCSfirstParserRuleCall_1_2_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCSfirst_in_ruleNavigatingExpCS11088);
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

                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5579:2: ( (lv_arguments_4_0= ruleNavigatingArgCSnext ) )*
                            loop74:
                            do {
                                int alt74=2;
                                int LA74_0 = input.LA(1);

                                if ( (LA74_0==35||(LA74_0>=79 && LA74_0<=80)) ) {
                                    alt74=1;
                                }


                                switch (alt74) {
                            	case 1 :
                            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5580:1: (lv_arguments_4_0= ruleNavigatingArgCSnext )
                            	    {
                            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5580:1: (lv_arguments_4_0= ruleNavigatingArgCSnext )
                            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5581:3: lv_arguments_4_0= ruleNavigatingArgCSnext
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentsNavigatingArgCSnextParserRuleCall_1_2_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCSnext_in_ruleNavigatingExpCS11109);
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
                            	    break loop74;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,36,FollowSets000.FOLLOW_36_in_ruleNavigatingExpCS11122); if (failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5615:1: entryRuleNavigatingArgCSfirst returns [EObject current=null] : iv_ruleNavigatingArgCSfirst= ruleNavigatingArgCSfirst EOF ;
    public final EObject entryRuleNavigatingArgCSfirst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCSfirst = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5616:2: (iv_ruleNavigatingArgCSfirst= ruleNavigatingArgCSfirst EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5617:2: iv_ruleNavigatingArgCSfirst= ruleNavigatingArgCSfirst EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNavigatingArgCSfirstRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCSfirst_in_entryRuleNavigatingArgCSfirst11160);
            iv_ruleNavigatingArgCSfirst=ruleNavigatingArgCSfirst();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNavigatingArgCSfirst; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgCSfirst11170); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5624:1: ruleNavigatingArgCSfirst returns [EObject current=null] : ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? ) ;
    public final EObject ruleNavigatingArgCSfirst() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5629:6: ( ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5630:1: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5630:1: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5630:2: ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5630:2: ( (lv_name_0_0= ruleNavigatingArgExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5631:1: (lv_name_0_0= ruleNavigatingArgExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5631:1: (lv_name_0_0= ruleNavigatingArgExpCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5632:3: lv_name_0_0= ruleNavigatingArgExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNavigatingArgCSfirstAccess().getNameNavigatingArgExpCSParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCSfirst11216);
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

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5654:2: ( ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==32) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5654:4: ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_ruleNavigatingArgCSfirst11227); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNavigatingArgCSfirstAccess().getColonKeyword_1_0(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5658:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5659:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5659:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5660:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNavigatingArgCSfirstAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCSfirst11248);
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5690:1: entryRuleNavigatingArgCSnext returns [EObject current=null] : iv_ruleNavigatingArgCSnext= ruleNavigatingArgCSnext EOF ;
    public final EObject entryRuleNavigatingArgCSnext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCSnext = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5691:2: (iv_ruleNavigatingArgCSnext= ruleNavigatingArgCSnext EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5692:2: iv_ruleNavigatingArgCSnext= ruleNavigatingArgCSnext EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNavigatingArgCSnextRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCSnext_in_entryRuleNavigatingArgCSnext11286);
            iv_ruleNavigatingArgCSnext=ruleNavigatingArgCSnext();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNavigatingArgCSnext; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgCSnext11296); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5699:1: ruleNavigatingArgCSnext returns [EObject current=null] : ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) ) | ( ( (lv_prefix_2_0= ',' ) ) ( (lv_name_3_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) )? ) | ( ( (lv_prefix_6_0= ';' ) ) ( (lv_name_7_0= ruleNavigatingArgExpCS ) ) ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) ) '=' ( (lv_init_11_0= ruleExpCS ) ) ) ) ;
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
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5704:6: ( ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) ) | ( ( (lv_prefix_2_0= ',' ) ) ( (lv_name_3_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) )? ) | ( ( (lv_prefix_6_0= ';' ) ) ( (lv_name_7_0= ruleNavigatingArgExpCS ) ) ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) ) '=' ( (lv_init_11_0= ruleExpCS ) ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5705:1: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) ) | ( ( (lv_prefix_2_0= ',' ) ) ( (lv_name_3_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) )? ) | ( ( (lv_prefix_6_0= ';' ) ) ( (lv_name_7_0= ruleNavigatingArgExpCS ) ) ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) ) '=' ( (lv_init_11_0= ruleExpCS ) ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5705:1: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) ) | ( ( (lv_prefix_2_0= ',' ) ) ( (lv_name_3_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) )? ) | ( ( (lv_prefix_6_0= ';' ) ) ( (lv_name_7_0= ruleNavigatingArgExpCS ) ) ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) ) '=' ( (lv_init_11_0= ruleExpCS ) ) ) )
            int alt79=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt79=1;
                }
                break;
            case 35:
                {
                alt79=2;
                }
                break;
            case 80:
                {
                alt79=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5705:1: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) ) | ( ( (lv_prefix_2_0= ',' ) ) ( (lv_name_3_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) )? ) | ( ( (lv_prefix_6_0= ';' ) ) ( (lv_name_7_0= ruleNavigatingArgExpCS ) ) ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) ) '=' ( (lv_init_11_0= ruleExpCS ) ) ) )", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5705:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5705:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5705:3: ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5705:3: ( (lv_prefix_0_0= '|' ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5706:1: (lv_prefix_0_0= '|' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5706:1: (lv_prefix_0_0= '|' )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5707:3: lv_prefix_0_0= '|'
                    {
                    lv_prefix_0_0=(Token)input.LT(1);
                    match(input,79,FollowSets000.FOLLOW_79_in_ruleNavigatingArgCSnext11340); if (failed) return current;
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

                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5726:2: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5727:1: (lv_name_1_0= ruleNavigatingArgExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5727:1: (lv_name_1_0= ruleNavigatingArgExpCS )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5728:3: lv_name_1_0= ruleNavigatingArgExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNavigatingArgCSnextAccess().getNameNavigatingArgExpCSParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCSnext11374);
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
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5751:6: ( ( (lv_prefix_2_0= ',' ) ) ( (lv_name_3_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) )? )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5751:6: ( ( (lv_prefix_2_0= ',' ) ) ( (lv_name_3_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) )? )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5751:7: ( (lv_prefix_2_0= ',' ) ) ( (lv_name_3_0= ruleNavigatingArgExpCS ) ) ( ':' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) )?
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5751:7: ( (lv_prefix_2_0= ',' ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5752:1: (lv_prefix_2_0= ',' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5752:1: (lv_prefix_2_0= ',' )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5753:3: lv_prefix_2_0= ','
                    {
                    lv_prefix_2_0=(Token)input.LT(1);
                    match(input,35,FollowSets000.FOLLOW_35_in_ruleNavigatingArgCSnext11400); if (failed) return current;
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

                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5772:2: ( (lv_name_3_0= ruleNavigatingArgExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5773:1: (lv_name_3_0= ruleNavigatingArgExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5773:1: (lv_name_3_0= ruleNavigatingArgExpCS )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5774:3: lv_name_3_0= ruleNavigatingArgExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNavigatingArgCSnextAccess().getNameNavigatingArgExpCSParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCSnext11434);
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

                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5796:2: ( ':' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==32) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5796:4: ':' ( (lv_ownedType_5_0= ruleTypeExpCS ) )
                            {
                            match(input,32,FollowSets000.FOLLOW_32_in_ruleNavigatingArgCSnext11445); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getNavigatingArgCSnextAccess().getColonKeyword_1_2_0(), null); 
                                  
                            }
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5800:1: ( (lv_ownedType_5_0= ruleTypeExpCS ) )
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5801:1: (lv_ownedType_5_0= ruleTypeExpCS )
                            {
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5801:1: (lv_ownedType_5_0= ruleTypeExpCS )
                            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5802:3: lv_ownedType_5_0= ruleTypeExpCS
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getNavigatingArgCSnextAccess().getOwnedTypeTypeExpCSParserRuleCall_1_2_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCSnext11466);
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
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5825:6: ( ( (lv_prefix_6_0= ';' ) ) ( (lv_name_7_0= ruleNavigatingArgExpCS ) ) ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) ) '=' ( (lv_init_11_0= ruleExpCS ) ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5825:6: ( ( (lv_prefix_6_0= ';' ) ) ( (lv_name_7_0= ruleNavigatingArgExpCS ) ) ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) ) '=' ( (lv_init_11_0= ruleExpCS ) ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5825:7: ( (lv_prefix_6_0= ';' ) ) ( (lv_name_7_0= ruleNavigatingArgExpCS ) ) ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) ) '=' ( (lv_init_11_0= ruleExpCS ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5825:7: ( (lv_prefix_6_0= ';' ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5826:1: (lv_prefix_6_0= ';' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5826:1: (lv_prefix_6_0= ';' )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5827:3: lv_prefix_6_0= ';'
                    {
                    lv_prefix_6_0=(Token)input.LT(1);
                    match(input,80,FollowSets000.FOLLOW_80_in_ruleNavigatingArgCSnext11494); if (failed) return current;
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

                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5846:2: ( (lv_name_7_0= ruleNavigatingArgExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5847:1: (lv_name_7_0= ruleNavigatingArgExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5847:1: (lv_name_7_0= ruleNavigatingArgExpCS )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5848:3: lv_name_7_0= ruleNavigatingArgExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNavigatingArgCSnextAccess().getNameNavigatingArgExpCSParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCSnext11528);
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

                    match(input,32,FollowSets000.FOLLOW_32_in_ruleNavigatingArgCSnext11538); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNavigatingArgCSnextAccess().getColonKeyword_2_2(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5874:1: ( (lv_ownedType_9_0= ruleTypeExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5875:1: (lv_ownedType_9_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5875:1: (lv_ownedType_9_0= ruleTypeExpCS )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5876:3: lv_ownedType_9_0= ruleTypeExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNavigatingArgCSnextAccess().getOwnedTypeTypeExpCSParserRuleCall_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCSnext11559);
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

                    match(input,37,FollowSets000.FOLLOW_37_in_ruleNavigatingArgCSnext11569); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNavigatingArgCSnextAccess().getEqualsSignKeyword_2_4(), null); 
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5902:1: ( (lv_init_11_0= ruleExpCS ) )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5903:1: (lv_init_11_0= ruleExpCS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5903:1: (lv_init_11_0= ruleExpCS )
                    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5904:3: lv_init_11_0= ruleExpCS
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNavigatingArgCSnextAccess().getInitExpCSParserRuleCall_2_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgCSnext11590);
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


    // $ANTLR start entryRuleIfExpCS
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5934:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5935:2: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5936:2: iv_ruleIfExpCS= ruleIfExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIfExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIfExpCS_in_entryRuleIfExpCS11627);
            iv_ruleIfExpCS=ruleIfExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfExpCS11637); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5943:1: ruleIfExpCS returns [EObject current=null] : ( 'if' ( (lv_condition_1_0= ruleExpCS ) ) 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) 'endif' ) ;
    public final EObject ruleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_condition_1_0 = null;

        EObject lv_thenExpression_3_0 = null;

        EObject lv_elseExpression_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5948:6: ( ( 'if' ( (lv_condition_1_0= ruleExpCS ) ) 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) 'endif' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5949:1: ( 'if' ( (lv_condition_1_0= ruleExpCS ) ) 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) 'endif' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5949:1: ( 'if' ( (lv_condition_1_0= ruleExpCS ) ) 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) 'endif' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5949:3: 'if' ( (lv_condition_1_0= ruleExpCS ) ) 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) 'endif'
            {
            match(input,81,FollowSets000.FOLLOW_81_in_ruleIfExpCS11672); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIfExpCSAccess().getIfKeyword_0(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5953:1: ( (lv_condition_1_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5954:1: (lv_condition_1_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5954:1: (lv_condition_1_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5955:3: lv_condition_1_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getIfExpCSAccess().getConditionExpCSParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS11693);
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

            match(input,82,FollowSets000.FOLLOW_82_in_ruleIfExpCS11703); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIfExpCSAccess().getThenKeyword_2(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5981:1: ( (lv_thenExpression_3_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5982:1: (lv_thenExpression_3_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5982:1: (lv_thenExpression_3_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5983:3: lv_thenExpression_3_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getIfExpCSAccess().getThenExpressionExpCSParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS11724);
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

            match(input,83,FollowSets000.FOLLOW_83_in_ruleIfExpCS11734); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIfExpCSAccess().getElseKeyword_4(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6009:1: ( (lv_elseExpression_5_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6010:1: (lv_elseExpression_5_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6010:1: (lv_elseExpression_5_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6011:3: lv_elseExpression_5_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getIfExpCSAccess().getElseExpressionExpCSParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS11755);
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

            match(input,84,FollowSets000.FOLLOW_84_in_ruleIfExpCS11765); if (failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6045:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6046:2: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6047:2: iv_ruleLetExpCS= ruleLetExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLetExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_entryRuleLetExpCS11801);
            iv_ruleLetExpCS=ruleLetExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetExpCS11811); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6054:1: ruleLetExpCS returns [EObject current=null] : ( 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) ( ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* 'in' ( (lv_in_5_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_variable_1_0 = null;

        EObject lv_variable_3_0 = null;

        EObject lv_in_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6059:6: ( ( 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) ( ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* 'in' ( (lv_in_5_0= ruleExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6060:1: ( 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) ( ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6060:1: ( 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) ( ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6060:3: 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) ( ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* 'in' ( (lv_in_5_0= ruleExpCS ) )
            {
            match(input,85,FollowSets000.FOLLOW_85_in_ruleLetExpCS11846); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLetExpCSAccess().getLetKeyword_0(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6064:1: ( (lv_variable_1_0= ruleLetVariableCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6065:1: (lv_variable_1_0= ruleLetVariableCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6065:1: (lv_variable_1_0= ruleLetVariableCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6066:3: lv_variable_1_0= ruleLetVariableCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_ruleLetExpCS11867);
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

            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6088:2: ( ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==35) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6088:4: ',' ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    {
            	    match(input,35,FollowSets000.FOLLOW_35_in_ruleLetExpCS11878); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0(), null); 
            	          
            	    }
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6092:1: ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6093:1: (lv_variable_3_0= ruleLetVariableCS )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6093:1: (lv_variable_3_0= ruleLetVariableCS )
            	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6094:3: lv_variable_3_0= ruleLetVariableCS
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_ruleLetExpCS11899);
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
            	    break loop80;
                }
            } while (true);

            match(input,86,FollowSets000.FOLLOW_86_in_ruleLetExpCS11911); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLetExpCSAccess().getInKeyword_3(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6120:1: ( (lv_in_5_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6121:1: (lv_in_5_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6121:1: (lv_in_5_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6122:3: lv_in_5_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetExpCSAccess().getInExpCSParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLetExpCS11932);
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6152:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6153:2: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6154:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLetVariableCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_entryRuleLetVariableCS11968);
            iv_ruleLetVariableCS=ruleLetVariableCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLetVariableCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetVariableCS11978); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6161:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetVariableCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6166:6: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6167:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6167:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6167:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6167:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6168:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6168:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6169:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleLetVariableCS12024);
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

            match(input,32,FollowSets000.FOLLOW_32_in_ruleLetVariableCS12034); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLetVariableCSAccess().getColonKeyword_1(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6195:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6196:1: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6196:1: (lv_ownedType_2_0= ruleTypeExpCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6197:3: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleLetVariableCS12055);
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

            match(input,37,FollowSets000.FOLLOW_37_in_ruleLetVariableCS12065); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_3(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6223:1: ( (lv_initExpression_4_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6224:1: (lv_initExpression_4_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6224:1: (lv_initExpression_4_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6225:3: lv_initExpression_4_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetVariableCSAccess().getInitExpressionExpCSParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLetVariableCS12086);
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6255:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6256:2: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6257:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNestedExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNestedExpCS_in_entryRuleNestedExpCS12122);
            iv_ruleNestedExpCS=ruleNestedExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNestedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNestedExpCS12132); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6264:1: ruleNestedExpCS returns [EObject current=null] : ( '(' ( (lv_source_1_0= ruleExpCS ) ) ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_source_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6269:6: ( ( '(' ( (lv_source_1_0= ruleExpCS ) ) ')' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6270:1: ( '(' ( (lv_source_1_0= ruleExpCS ) ) ')' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6270:1: ( '(' ( (lv_source_1_0= ruleExpCS ) ) ')' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6270:3: '(' ( (lv_source_1_0= ruleExpCS ) ) ')'
            {
            match(input,34,FollowSets000.FOLLOW_34_in_ruleNestedExpCS12167); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0(), null); 
                  
            }
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6274:1: ( (lv_source_1_0= ruleExpCS ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6275:1: (lv_source_1_0= ruleExpCS )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6275:1: (lv_source_1_0= ruleExpCS )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6276:3: lv_source_1_0= ruleExpCS
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNestedExpCSAccess().getSourceExpCSParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNestedExpCS12188);
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

            match(input,36,FollowSets000.FOLLOW_36_in_ruleNestedExpCS12198); if (failed) return current;
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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6310:1: entryRuleSelfExpCS returns [EObject current=null] : iv_ruleSelfExpCS= ruleSelfExpCS EOF ;
    public final EObject entryRuleSelfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpCS = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6311:2: (iv_ruleSelfExpCS= ruleSelfExpCS EOF )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6312:2: iv_ruleSelfExpCS= ruleSelfExpCS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSelfExpCSRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSelfExpCS_in_entryRuleSelfExpCS12234);
            iv_ruleSelfExpCS=ruleSelfExpCS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSelfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelfExpCS12244); if (failed) return current;

            }

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
    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6319:1: ruleSelfExpCS returns [EObject current=null] : ( () 'self' ) ;
    public final EObject ruleSelfExpCS() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6324:6: ( ( () 'self' ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6325:1: ( () 'self' )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6325:1: ( () 'self' )
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6325:2: () 'self'
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6325:2: ()
            // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:6326:2: 
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

            match(input,87,FollowSets000.FOLLOW_87_in_ruleSelfExpCS12291); if (failed) return current;
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
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:243:5: ( ruleEssentialOCLUnrestrictedName )
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:243:5: ruleEssentialOCLUnrestrictedName
        {
        if ( backtracking==0 ) {
           
                  currentNode=createCompositeNode(grammarAccess.getUnrestrictedNameAccess().getEssentialOCLUnrestrictedNameParserRuleCall_0(), currentNode); 
              
        }
        pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_synpred6426);
        ruleEssentialOCLUnrestrictedName();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:255:2: ( 'body' )
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:255:2: 'body'
        {
        match(input,15,FollowSets000.FOLLOW_15_in_synpred7450); if (failed) return ;

        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:290:2: ( 'init' )
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:290:2: 'init'
        {
        match(input,20,FollowSets000.FOLLOW_20_in_synpred12545); if (failed) return ;

        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred27
    public final void synpred27_fragment() throws RecognitionException {   
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:673:2: ( rulePropertyContextDeclCS )
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:673:2: rulePropertyContextDeclCS
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_rulePropertyContextDeclCS_in_synpred271371);
        rulePropertyContextDeclCS();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred27

    // $ANTLR start synpred28
    public final void synpred28_fragment() throws RecognitionException {   
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:686:2: ( ruleClassifierContextDeclCS )
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:686:2: ruleClassifierContextDeclCS
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleClassifierContextDeclCS_in_synpred281401);
        ruleClassifierContextDeclCS();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred28

    // $ANTLR start synpred40
    public final void synpred40_fragment() throws RecognitionException {   
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1386:1: ( ( ruleTypeExpCS ) )
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1386:1: ( ruleTypeExpCS )
        {
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1386:1: ( ruleTypeExpCS )
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:1387:3: ruleTypeExpCS
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getOwnedTypeTypeExpCSParserRuleCall_6_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_synpred402555);
        ruleTypeExpCS();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred40

    // $ANTLR start synpred57
    public final void synpred57_fragment() throws RecognitionException {   
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2746:2: ( '.' RULE_INT )
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:2746:2: '.' RULE_INT
        {
        match(input,45,FollowSets000.FOLLOW_45_in_synpred575075); if (failed) return ;
        match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_synpred575090); if (failed) return ;

        }
    }
    // $ANTLR end synpred57

    // $ANTLR start synpred110
    public final void synpred110_fragment() throws RecognitionException {   
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4741:3: ( ( ( ruleBinaryOperatorCS ) ) ( ( rulePrefixedExpCS ) ) )
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4741:3: ( ( ruleBinaryOperatorCS ) ) ( ( rulePrefixedExpCS ) )
        {
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4741:3: ( ( ruleBinaryOperatorCS ) )
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4742:1: ( ruleBinaryOperatorCS )
        {
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4742:1: ( ruleBinaryOperatorCS )
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4743:3: ruleBinaryOperatorCS
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_1_1_0_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_synpred1109560);
        ruleBinaryOperatorCS();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4765:2: ( ( rulePrefixedExpCS ) )
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4766:1: ( rulePrefixedExpCS )
        {
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4766:1: ( rulePrefixedExpCS )
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4767:3: rulePrefixedExpCS
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_1_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_synpred1109581);
        rulePrefixedExpCS();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred110

    // $ANTLR start synpred111
    public final void synpred111_fragment() throws RecognitionException {   
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4722:2: ( () ( ( ( ruleBinaryOperatorCS ) ) ( ( rulePrefixedExpCS ) ) )+ )
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4722:2: () ( ( ( ruleBinaryOperatorCS ) ) ( ( rulePrefixedExpCS ) ) )+
        {
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4722:2: ()
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4723:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4741:2: ( ( ( ruleBinaryOperatorCS ) ) ( ( rulePrefixedExpCS ) ) )+
        int cnt95=0;
        loop95:
        do {
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( ((LA95_0>=13 && LA95_0<=14)||LA95_0==37||LA95_0==45||(LA95_0>=48 && LA95_0<=49)||(LA95_0>=51 && LA95_0<=62)) ) {
                alt95=1;
            }


            switch (alt95) {
        	case 1 :
        	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4741:3: ( ( ruleBinaryOperatorCS ) ) ( ( rulePrefixedExpCS ) )
        	    {
        	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4741:3: ( ( ruleBinaryOperatorCS ) )
        	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4742:1: ( ruleBinaryOperatorCS )
        	    {
        	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4742:1: ( ruleBinaryOperatorCS )
        	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4743:3: ruleBinaryOperatorCS
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_1_1_0_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_synpred1119560);
        	    ruleBinaryOperatorCS();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }

        	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4765:2: ( ( rulePrefixedExpCS ) )
        	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4766:1: ( rulePrefixedExpCS )
        	    {
        	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4766:1: ( rulePrefixedExpCS )
        	    // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:4767:3: rulePrefixedExpCS
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_1_1_1_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_synpred1119581);
        	    rulePrefixedExpCS();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt95 >= 1 ) break loop95;
        	    if (backtracking>0) {failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(95, input);
                    throw eee;
            }
            cnt95++;
        } while (true);


        }
    }
    // $ANTLR end synpred111

    // $ANTLR start synpred118
    public final void synpred118_fragment() throws RecognitionException {   
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5139:2: ( ruleTupleLiteralExpCS )
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5139:2: ruleTupleLiteralExpCS
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_synpred11810324);
        ruleTupleLiteralExpCS();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred118

    // $ANTLR start synpred119
    public final void synpred119_fragment() throws RecognitionException {   
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5152:2: ( ruleCollectionLiteralExpCS )
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5152:2: ruleCollectionLiteralExpCS
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_synpred11910354);
        ruleCollectionLiteralExpCS();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred119

    // $ANTLR start synpred120
    public final void synpred120_fragment() throws RecognitionException {   
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5165:2: ( ruleTypeLiteralExpCS )
        // ../org.eclipse.ocl.examples.xtext.completeocl/src-gen/org/eclipse/ocl/examples/xtext/completeocl/parser/antlr/internal/InternalCompleteOCL.g:5165:2: ruleTypeLiteralExpCS
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_synpred12010384);
        ruleTypeLiteralExpCS();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred120

    public final boolean synpred27() {
        backtracking++;
        int start = input.mark();
        try {
            synpred27_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred12() {
        backtracking++;
        int start = input.mark();
        try {
            synpred12_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred118() {
        backtracking++;
        int start = input.mark();
        try {
            synpred118_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred7() {
        backtracking++;
        int start = input.mark();
        try {
            synpred7_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred111() {
        backtracking++;
        int start = input.mark();
        try {
            synpred111_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred120() {
        backtracking++;
        int start = input.mark();
        try {
            synpred120_fragment(); // can never throw exception
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
    public final boolean synpred28() {
        backtracking++;
        int start = input.mark();
        try {
            synpred28_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred119() {
        backtracking++;
        int start = input.mark();
        try {
            synpred119_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred57() {
        backtracking++;
        int start = input.mark();
        try {
            synpred57_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred40() {
        backtracking++;
        int start = input.mark();
        try {
            synpred40_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred110() {
        backtracking++;
        int start = input.mark();
        try {
            synpred110_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_ruleCompleteOCLDocumentCS_in_entryRuleCompleteOCLDocumentCS81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompleteOCLDocumentCS91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImportCS_in_ruleCompleteOCLDocumentCS137 = new BitSet(new long[]{0x0000004000090002L});
        public static final BitSet FOLLOW_rulePackageDeclarationCS_in_ruleCompleteOCLDocumentCS160 = new BitSet(new long[]{0x0000004000010002L});
        public static final BitSet FOLLOW_ruleContextDeclCS_in_ruleCompleteOCLDocumentCS187 = new BitSet(new long[]{0x0000004000010002L});
        public static final BitSet FOLLOW_ruleNavigationOperator_in_entryRuleNavigationOperator226 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigationOperator237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLNavigationOperator_in_ruleNavigationOperator284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleNavigationOperator308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleNavigationOperator327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_entryRuleUnrestrictedName368 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnrestrictedName379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_ruleUnrestrictedName426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleUnrestrictedName450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleUnrestrictedName469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleUnrestrictedName488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleUnrestrictedName507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleUnrestrictedName526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleUnrestrictedName545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleUnrestrictedName564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_entryRulePrimitiveTypeIdentifier605 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeIdentifier616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rulePrimitiveTypeIdentifier654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rulePrimitiveTypeIdentifier673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rulePrimitiveTypeIdentifier692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rulePrimitiveTypeIdentifier711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rulePrimitiveTypeIdentifier730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rulePrimitiveTypeIdentifier749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rulePrimitiveTypeIdentifier768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rulePrimitiveTypeIdentifier787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rulePrimitiveTypeIdentifier806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rulePrimitiveTypeIdentifier825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBodyCS_in_entryRuleBodyCS865 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBodyCS875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleBodyCS910 = new BitSet(new long[]{0x8000C301003F8040L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleBodyCS931 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleBodyCS942 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleBodyCS963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassifierContextDeclCS_in_entryRuleClassifierContextDeclCS999 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassifierContextDeclCS1009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleClassifierContextDeclCS1044 = new BitSet(new long[]{0x8000C300003F8040L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleClassifierContextDeclCS1066 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleClassifierContextDeclCS1076 = new BitSet(new long[]{0x8000C30000308040L});
        public static final BitSet FOLLOW_ruleClassifierRefCS_in_ruleClassifierContextDeclCS1099 = new BitSet(new long[]{0x0000000200220002L});
        public static final BitSet FOLLOW_ruleInvCS_in_ruleClassifierContextDeclCS1121 = new BitSet(new long[]{0x0000000200220002L});
        public static final BitSet FOLLOW_ruleDefCS_in_ruleClassifierContextDeclCS1148 = new BitSet(new long[]{0x0000000200220002L});
        public static final BitSet FOLLOW_ruleClassifierRefCS_in_entryRuleClassifierRefCS1186 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassifierRefCS1196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedClassifierRefCS_in_ruleClassifierRefCS1246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleClassifierRefCS_in_ruleClassifierRefCS1276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContextDeclCS_in_entryRuleContextDeclCS1311 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContextDeclCS1321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyContextDeclCS_in_ruleContextDeclCS1371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassifierContextDeclCS_in_ruleContextDeclCS1401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperationContextDeclCS_in_ruleContextDeclCS1431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefCS_in_entryRuleDefCS1466 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDefCS1476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleDefCS1519 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDefCS1543 = new BitSet(new long[]{0x8000C301003F8040L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleDefCS1564 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleDefCS1575 = new BitSet(new long[]{0x8000C300003F8040L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleDefCS1596 = new BitSet(new long[]{0x0000000500000000L});
        public static final BitSet FOLLOW_34_in_ruleDefCS1607 = new BitSet(new long[]{0x8000C310FFFF8040L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleParameterCS_in_ruleDefCS1629 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_35_in_ruleDefCS1640 = new BitSet(new long[]{0x8000C300FFFF8040L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleParameterCS_in_ruleDefCS1661 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_36_in_ruleDefCS1675 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleDefCS1687 = new BitSet(new long[]{0x8000C320FFFF8040L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleDefCS1708 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleDefCS1719 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleDefCS1740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDerCS_in_entryRuleDerCS1776 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDerCS1786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleDerCS1829 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleDerCS1852 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleDerCS1873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImportCS_in_entryRuleImportCS1909 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImportCS1919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleImportCS1954 = new BitSet(new long[]{0x8000C30000308050L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleImportCS1976 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleImportCS1986 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleImportCS2010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitCS_in_entryRuleInitCS2046 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInitCS2056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleInitCS2099 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleInitCS2122 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleInitCS2143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvCS_in_entryRuleInvCS2179 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvCS2189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleInvCS2232 = new BitSet(new long[]{0x8000C301003F8040L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleInvCS2267 = new BitSet(new long[]{0x0000000500000000L});
        public static final BitSet FOLLOW_34_in_ruleInvCS2278 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleInvCS2299 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleInvCS2309 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleInvCS2323 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleInvCS2344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperationContextDeclCS_in_entryRuleOperationContextDeclCS2380 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperationContextDeclCS2390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleOperationContextDeclCS2425 = new BitSet(new long[]{0x8000C30000308040L});
        public static final BitSet FOLLOW_ruleOperationRefCS_in_ruleOperationContextDeclCS2446 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleOperationContextDeclCS2456 = new BitSet(new long[]{0x8000C310FFFF8040L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleParameterCS_in_ruleOperationContextDeclCS2478 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_35_in_ruleOperationContextDeclCS2489 = new BitSet(new long[]{0x8000C300FFFF8040L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleParameterCS_in_ruleOperationContextDeclCS2510 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_36_in_ruleOperationContextDeclCS2524 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleOperationContextDeclCS2534 = new BitSet(new long[]{0x8000C300FFFF8042L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleOperationContextDeclCS2555 = new BitSet(new long[]{0x0000030000008002L});
        public static final BitSet FOLLOW_rulePreCS_in_ruleOperationContextDeclCS2578 = new BitSet(new long[]{0x0000030000008002L});
        public static final BitSet FOLLOW_rulePostCS_in_ruleOperationContextDeclCS2605 = new BitSet(new long[]{0x0000030000008002L});
        public static final BitSet FOLLOW_ruleBodyCS_in_ruleOperationContextDeclCS2632 = new BitSet(new long[]{0x0000030000008002L});
        public static final BitSet FOLLOW_ruleOperationRefCS_in_entryRuleOperationRefCS2670 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperationRefCS2680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedOperationRefCS_in_ruleOperationRefCS2730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleOperationRefCS_in_ruleOperationRefCS2760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageDeclarationCS_in_entryRulePackageDeclarationCS2795 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclarationCS2805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rulePackageDeclarationCS2840 = new BitSet(new long[]{0x8000C30000308040L});
        public static final BitSet FOLLOW_rulePackageRefCS_in_rulePackageDeclarationCS2861 = new BitSet(new long[]{0x0000008000010000L});
        public static final BitSet FOLLOW_ruleContextDeclCS_in_rulePackageDeclarationCS2882 = new BitSet(new long[]{0x0000008000010000L});
        public static final BitSet FOLLOW_39_in_rulePackageDeclarationCS2893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageRefCS_in_entryRulePackageRefCS2929 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackageRefCS2939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedPackageRefCS_in_rulePackageRefCS2989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimplePackageRefCS_in_rulePackageRefCS3019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterCS_in_entryRuleParameterCS3054 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterCS3064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleParameterCS3111 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleParameterCS3121 = new BitSet(new long[]{0x8000C300FFFF8040L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleParameterCS3144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePostCS_in_entryRulePostCS3180 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePostCS3190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rulePostCS3233 = new BitSet(new long[]{0x8000C301003F8040L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_rulePostCS3267 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulePostCS3278 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleExpCS_in_rulePostCS3299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreCS_in_entryRulePreCS3335 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePreCS3345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rulePreCS3388 = new BitSet(new long[]{0x8000C301003F8040L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_rulePreCS3422 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulePreCS3433 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleExpCS_in_rulePreCS3454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyContextDeclCS_in_entryRulePropertyContextDeclCS3490 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyContextDeclCS3500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rulePropertyContextDeclCS3535 = new BitSet(new long[]{0x8000C30000308040L});
        public static final BitSet FOLLOW_rulePropertyRefCS_in_rulePropertyContextDeclCS3556 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulePropertyContextDeclCS3566 = new BitSet(new long[]{0x8000C300FFFF8040L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_rulePropertyContextDeclCS3587 = new BitSet(new long[]{0x0000000000140002L});
        public static final BitSet FOLLOW_ruleInitCS_in_rulePropertyContextDeclCS3610 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleDerCS_in_rulePropertyContextDeclCS3631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDerCS_in_rulePropertyContextDeclCS3662 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_ruleInitCS_in_rulePropertyContextDeclCS3683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyRefCS_in_entryRulePropertyRefCS3722 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyRefCS3732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedPropertyRefCS_in_rulePropertyRefCS3782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimplePropertyRefCS_in_rulePropertyRefCS3812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedClassifierRefCS_in_entryRuleQualifiedClassifierRefCS3847 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedClassifierRefCS3857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleQualifiedClassifierRefCS3909 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleQualifiedClassifierRefCS3919 = new BitSet(new long[]{0x8000C30000308040L});
        public static final BitSet FOLLOW_ruleClassifierRefCS_in_ruleQualifiedClassifierRefCS3940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedOperationRefCS_in_entryRuleQualifiedOperationRefCS3976 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedOperationRefCS3986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleQualifiedOperationRefCS4038 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleQualifiedOperationRefCS4048 = new BitSet(new long[]{0x8000C30000308040L});
        public static final BitSet FOLLOW_ruleOperationRefCS_in_ruleQualifiedOperationRefCS4069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedPropertyRefCS_in_entryRuleQualifiedPropertyRefCS4105 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedPropertyRefCS4115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleQualifiedPropertyRefCS4167 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleQualifiedPropertyRefCS4177 = new BitSet(new long[]{0x8000C30000308040L});
        public static final BitSet FOLLOW_rulePropertyRefCS_in_ruleQualifiedPropertyRefCS4198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedPackageRefCS_in_entryRuleQualifiedPackageRefCS4234 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedPackageRefCS4244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleQualifiedPackageRefCS4296 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleQualifiedPackageRefCS4306 = new BitSet(new long[]{0x8000C30000308040L});
        public static final BitSet FOLLOW_rulePackageRefCS_in_ruleQualifiedPackageRefCS4327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleClassifierRefCS_in_entryRuleSimpleClassifierRefCS4363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleClassifierRefCS4373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleSimpleClassifierRefCS4424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleOperationRefCS_in_entryRuleSimpleOperationRefCS4459 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleOperationRefCS4469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleSimpleOperationRefCS4520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimplePackageRefCS_in_entryRuleSimplePackageRefCS4555 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimplePackageRefCS4565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleSimplePackageRefCS4616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimplePropertyRefCS_in_entryRuleSimplePropertyRefCS4651 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimplePropertyRefCS4661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleSimplePropertyRefCS4712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingExpCS_Base_in_entryRuleNavigatingExpCS_Base4747 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingExpCS_Base4757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIndexExpCS_in_ruleNavigatingExpCS_Base4807 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_43_in_ruleNavigatingExpCS_Base4829 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleNavigatingExpCS_Base4839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_entryRuleNavigatingArgExpCS4877 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgExpCS4887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleNavigatingArgExpCS4935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgExpCS4967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL5005 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER_LITERAL5016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL5056 = new BitSet(new long[]{0x0000E00000000002L});
        public static final BitSet FOLLOW_45_in_ruleNUMBER_LITERAL5075 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL5090 = new BitSet(new long[]{0x0000C00000000002L});
        public static final BitSet FOLLOW_46_in_ruleNUMBER_LITERAL5112 = new BitSet(new long[]{0x0003000000000020L});
        public static final BitSet FOLLOW_47_in_ruleNUMBER_LITERAL5131 = new BitSet(new long[]{0x0003000000000020L});
        public static final BitSet FOLLOW_48_in_ruleNUMBER_LITERAL5146 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_49_in_ruleNUMBER_LITERAL5165 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL5182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLPrefixOperator_in_entryRuleEssentialOCLPrefixOperator5232 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLPrefixOperator5243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleEssentialOCLPrefixOperator5281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleEssentialOCLPrefixOperator5300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLInfixOperator_in_entryRuleEssentialOCLInfixOperator5341 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLInfixOperator5352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleEssentialOCLInfixOperator5390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleEssentialOCLInfixOperator5409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleEssentialOCLInfixOperator5428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleEssentialOCLInfixOperator5447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleEssentialOCLInfixOperator5466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleEssentialOCLInfixOperator5485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleEssentialOCLInfixOperator5504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleEssentialOCLInfixOperator5523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleEssentialOCLInfixOperator5542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleEssentialOCLInfixOperator5561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleEssentialOCLInfixOperator5580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleEssentialOCLInfixOperator5599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleEssentialOCLInfixOperator5618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleEssentialOCLInfixOperator5637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLNavigationOperator_in_entryRuleEssentialOCLNavigationOperator5678 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLNavigationOperator5689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleEssentialOCLNavigationOperator5727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleEssentialOCLNavigationOperator5746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier5787 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier5798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIdentifier5838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleIdentifier5862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleIdentifier5881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleIdentifier5900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleIdentifier5919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleIdentifier5938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleIdentifier5957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleIdentifier5976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleIdentifier5995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6036 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral6047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleStringLiteral6086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixOperator_in_entryRulePrefixOperator6131 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrefixOperator6142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLPrefixOperator_in_rulePrefixOperator6188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperator_in_entryRuleInfixOperator6233 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfixOperator6244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLInfixOperator_in_ruleInfixOperator6290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_entryRuleEssentialOCLUnrestrictedName6335 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedName6346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleEssentialOCLUnrestrictedName6392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnreservedName_in_entryRuleEssentialOCLUnreservedName6437 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnreservedName6448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleEssentialOCLUnreservedName6494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_entryRuleUnreservedName6539 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnreservedName6550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnreservedName_in_ruleUnreservedName6596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeCS_in_entryRulePrimitiveTypeCS6640 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeCS6650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_rulePrimitiveTypeCS6695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_entryRuleCollectionTypeIdentifier6731 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionTypeIdentifier6742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleCollectionTypeIdentifier6780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleCollectionTypeIdentifier6799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleCollectionTypeIdentifier6818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleCollectionTypeIdentifier6837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleCollectionTypeIdentifier6856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_entryRuleCollectionTypeCS6896 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionTypeCS6906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_ruleCollectionTypeCS6952 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleCollectionTypeCS6963 = new BitSet(new long[]{0x8000C300FFFF8040L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS6984 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleCollectionTypeCS6994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeCS_in_entryRuleTupleTypeCS7032 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleTypeCS7042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleTupleTypeCS7085 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleTupleTypeCS7109 = new BitSet(new long[]{0x8000C310003F8040L});
        public static final BitSet FOLLOW_ruletuplePartCS_in_ruleTupleTypeCS7131 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_35_in_ruleTupleTypeCS7142 = new BitSet(new long[]{0x8000C300003F8040L});
        public static final BitSet FOLLOW_ruletuplePartCS_in_ruleTupleTypeCS7163 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_36_in_ruleTupleTypeCS7177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletuplePartCS_in_entryRuletuplePartCS7215 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuletuplePartCS7225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruletuplePartCS7271 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruletuplePartCS7281 = new BitSet(new long[]{0x8000C300FFFF8040L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruletuplePartCS7302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_entryRuleCollectionLiteralExpCS7338 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteralExpCS7348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleCollectionLiteralExpCS7394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_70_in_ruleCollectionLiteralExpCS7404 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21EBFL});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS7426 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_35_in_ruleCollectionLiteralExpCS7437 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS7458 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_71_in_ruleCollectionLiteralExpCS7472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_entryRuleCollectionLiteralPartCS7508 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteralPartCS7518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS7564 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
        public static final BitSet FOLLOW_72_in_ruleCollectionLiteralPartCS7575 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS7596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_entryRulePrimitiveLiteralExpCS7634 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveLiteralExpCS7644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpCS_in_rulePrimitiveLiteralExpCS7694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteralExpCS_in_rulePrimitiveLiteralExpCS7724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpCS_in_rulePrimitiveLiteralExpCS7754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_rulePrimitiveLiteralExpCS7784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvalidLiteralExpCS_in_rulePrimitiveLiteralExpCS7814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullLiteralExpCS_in_rulePrimitiveLiteralExpCS7844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_entryRuleTupleLiteralExpCS7879 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralExpCS7889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleTupleLiteralExpCS7924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_70_in_ruleTupleLiteralExpCS7934 = new BitSet(new long[]{0x8000C300003F8040L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS7955 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_35_in_ruleTupleLiteralExpCS7966 = new BitSet(new long[]{0x8000C300003F8040L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS7987 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_71_in_ruleTupleLiteralExpCS7999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_entryRuleTupleLiteralPartCS8035 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralPartCS8045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTupleLiteralPartCS8091 = new BitSet(new long[]{0x0000002100000000L});
        public static final BitSet FOLLOW_32_in_ruleTupleLiteralPartCS8102 = new BitSet(new long[]{0x8000C300FFFF8040L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleTupleLiteralPartCS8123 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleTupleLiteralPartCS8135 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleTupleLiteralPartCS8156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpCS_in_entryRuleNumberLiteralExpCS8192 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteralExpCS8202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_ruleNumberLiteralExpCS8247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteralExpCS_in_entryRuleStringLiteralExpCS8282 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteralExpCS8292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleStringLiteralExpCS8337 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpCS_in_entryRuleBooleanLiteralExpCS8373 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteralExpCS8383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleBooleanLiteralExpCS8426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleBooleanLiteralExpCS8463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_entryRuleUnlimitedNaturalLiteralExpCS8512 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedNaturalLiteralExpCS8522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleUnlimitedNaturalLiteralExpCS8569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvalidLiteralExpCS_in_entryRuleInvalidLiteralExpCS8605 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvalidLiteralExpCS8615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleInvalidLiteralExpCS8662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullLiteralExpCS_in_entryRuleNullLiteralExpCS8698 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteralExpCS8708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleNullLiteralExpCS8755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_entryRuleTypeLiteralCS8791 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralCS8801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeCS_in_ruleTypeLiteralCS8851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleTypeLiteralCS8881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeCS_in_ruleTypeLiteralCS8911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_entryRuleTypeLiteralExpCS8946 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralExpCS8956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_ruleTypeLiteralExpCS9001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeNameExpCS_in_entryRuleTypeNameExpCS9036 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeNameExpCS9046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTypeNameExpCS9100 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleTypeNameExpCS9110 = new BitSet(new long[]{0x8000C300003F8040L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_ruleTypeNameExpCS9138 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleTypeNameExpCS9148 = new BitSet(new long[]{0x8000C300003F8040L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_ruleTypeNameExpCS9178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTypeNameExpCS9212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_entryRuleTypeExpCS9248 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeExpCS9258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeNameExpCS_in_ruleTypeExpCS9308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_ruleTypeExpCS9338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_entryRuleExpCS9373 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpCS9383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixedExpCS_in_ruleExpCS9432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixedExpCS_in_entryRuleInfixedExpCS9466 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfixedExpCS9476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_ruleInfixedExpCS9526 = new BitSet(new long[]{0x7FFB202000006002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_ruleInfixedExpCS9560 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_ruleInfixedExpCS9581 = new BitSet(new long[]{0x7FFB202000006002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_entryRuleBinaryOperatorCS9621 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperatorCS9631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperatorCS_in_ruleBinaryOperatorCS9681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperatorCS_in_ruleBinaryOperatorCS9711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperatorCS_in_entryRuleInfixOperatorCS9746 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfixOperatorCS9756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperator_in_ruleInfixOperatorCS9801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperatorCS_in_entryRuleNavigationOperatorCS9836 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigationOperatorCS9846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperator_in_ruleNavigationOperatorCS9891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_entryRulePrefixedExpCS9926 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrefixedExpCS9936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS9986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorCS_in_rulePrefixedExpCS10025 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS10047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorCS_in_entryRuleUnaryOperatorCS10084 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperatorCS10094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixOperator_in_ruleUnaryOperatorCS10139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_entryRulePrimaryExpCS10174 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpCS10184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingExpCS_in_rulePrimaryExpCS10234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelfExpCS_in_rulePrimaryExpCS10264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_rulePrimaryExpCS10294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_rulePrimaryExpCS10324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_rulePrimaryExpCS10354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_rulePrimaryExpCS10384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_rulePrimaryExpCS10414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpCS_in_rulePrimaryExpCS10444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpCS_in_rulePrimaryExpCS10474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNameExpCS_in_entryRuleNameExpCS10509 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNameExpCS10519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleNameExpCS10573 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleNameExpCS10583 = new BitSet(new long[]{0x8000C300003F8040L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_ruleNameExpCS10611 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleNameExpCS10621 = new BitSet(new long[]{0x8000C300003F8040L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_ruleNameExpCS10651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleNameExpCS10685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIndexExpCS_in_entryRuleIndexExpCS10721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIndexExpCS10731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNameExpCS_in_ruleIndexExpCS10781 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
        public static final BitSet FOLLOW_77_in_ruleIndexExpCS10803 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIndexExpCS10824 = new BitSet(new long[]{0x0000000800000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_35_in_ruleIndexExpCS10835 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIndexExpCS10856 = new BitSet(new long[]{0x0000000800000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_78_in_ruleIndexExpCS10868 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
        public static final BitSet FOLLOW_77_in_ruleIndexExpCS10879 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIndexExpCS10900 = new BitSet(new long[]{0x0000000800000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_35_in_ruleIndexExpCS10911 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIndexExpCS10932 = new BitSet(new long[]{0x0000000800000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_78_in_ruleIndexExpCS10944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingExpCS_in_entryRuleNavigatingExpCS10984 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingExpCS10994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingExpCS_Base_in_ruleNavigatingExpCS11044 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleNavigatingExpCS11066 = new BitSet(new long[]{0x800ED314FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleNavigatingArgCSfirst_in_ruleNavigatingExpCS11088 = new BitSet(new long[]{0x0000001800000000L,0x0000000000018000L});
        public static final BitSet FOLLOW_ruleNavigatingArgCSnext_in_ruleNavigatingExpCS11109 = new BitSet(new long[]{0x0000001800000000L,0x0000000000018000L});
        public static final BitSet FOLLOW_36_in_ruleNavigatingExpCS11122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgCSfirst_in_entryRuleNavigatingArgCSfirst11160 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgCSfirst11170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCSfirst11216 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_ruleNavigatingArgCSfirst11227 = new BitSet(new long[]{0x8000C300FFFF8040L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCSfirst11248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgCSnext_in_entryRuleNavigatingArgCSnext11286 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgCSnext11296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_ruleNavigatingArgCSnext11340 = new BitSet(new long[]{0x800ED304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCSnext11374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleNavigatingArgCSnext11400 = new BitSet(new long[]{0x800ED304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCSnext11434 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_ruleNavigatingArgCSnext11445 = new BitSet(new long[]{0x8000C300FFFF8040L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCSnext11466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_ruleNavigatingArgCSnext11494 = new BitSet(new long[]{0x800ED304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCSnext11528 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleNavigatingArgCSnext11538 = new BitSet(new long[]{0x8000C300FFFF8040L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCSnext11559 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleNavigatingArgCSnext11569 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgCSnext11590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpCS_in_entryRuleIfExpCS11627 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfExpCS11637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleIfExpCS11672 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS11693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_82_in_ruleIfExpCS11703 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS11724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
        public static final BitSet FOLLOW_83_in_ruleIfExpCS11734 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS11755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_84_in_ruleIfExpCS11765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_entryRuleLetExpCS11801 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetExpCS11811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_ruleLetExpCS11846 = new BitSet(new long[]{0x8000C300003F8040L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_ruleLetExpCS11867 = new BitSet(new long[]{0x0000000800000000L,0x0000000000400000L});
        public static final BitSet FOLLOW_35_in_ruleLetExpCS11878 = new BitSet(new long[]{0x8000C300003F8040L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_ruleLetExpCS11899 = new BitSet(new long[]{0x0000000800000000L,0x0000000000400000L});
        public static final BitSet FOLLOW_86_in_ruleLetExpCS11911 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLetExpCS11932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_entryRuleLetVariableCS11968 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetVariableCS11978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleLetVariableCS12024 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleLetVariableCS12034 = new BitSet(new long[]{0x8000C300FFFF8040L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleLetVariableCS12055 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleLetVariableCS12065 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLetVariableCS12086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpCS_in_entryRuleNestedExpCS12122 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNestedExpCS12132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleNestedExpCS12167 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNestedExpCS12188 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleNestedExpCS12198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelfExpCS_in_entryRuleSelfExpCS12234 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelfExpCS12244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_ruleSelfExpCS12291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_synpred6426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_synpred7450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_synpred12545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyContextDeclCS_in_synpred271371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassifierContextDeclCS_in_synpred281401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_synpred402555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_synpred575075 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_synpred575090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_synpred1109560 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_synpred1109581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_synpred1119560 = new BitSet(new long[]{0x800EC304FFFF8070L,0x0000000000A21E3FL});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_synpred1119581 = new BitSet(new long[]{0x7FFB202000006002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_synpred11810324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_synpred11910354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_synpred12010384 = new BitSet(new long[]{0x0000000000000002L});
    }


}