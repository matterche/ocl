package org.eclipse.ocl.examples.xtext.completeocl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.LibraryCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PrimitiveTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TuplePartCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TupleTypeCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.BodyCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ClassifierContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLDocumentCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextSpecificationCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DerCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.IncludeCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.InitCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.InvCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OclMessageArgCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OperationContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PackageDeclarationCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PostCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PreCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PreExpCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PropertyContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.services.CompleteOCLGrammarAccess;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BinaryOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BooleanLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralPartCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionTypeCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ContextCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.EssentialOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.IfExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.IndexExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InfixExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InvalidLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.LetExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.LetVariableCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NameExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingArgCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigationOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NestedExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NullLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NumberLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.PrefixExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.SelfExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.StringLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TupleLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TupleLiteralPartCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TypeLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TypeNameExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.UnaryOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.UnlimitedNaturalLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.VariableCS;
import org.eclipse.ocl.examples.xtext.essentialocl.serializer.EssentialOCLSemanticSequencer;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("restriction")
public class AbstractCompleteOCLSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected CompleteOCLGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	@Inject
	protected Provider<EssentialOCLSemanticSequencer> superSequencerProvider;
	 
	protected EssentialOCLSemanticSequencer superSequencer; 
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.superSequencer = superSequencerProvider.get();
		this.superSequencer.init(sequencer, sequenceAcceptor, errorAcceptor); 
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BaseCSTPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BaseCSTPackage.IMPORT_CS:
				if(context == grammarAccess.getImportCSRule()) {
					sequence_ImportCS(context, (ImportCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.LIBRARY_CS:
				if(context == grammarAccess.getLibraryCSRule()) {
					sequence_LibraryCS(context, (LibraryCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.PRIMITIVE_TYPE_REF_CS:
				if(context == grammarAccess.getPrimitiveTypeCSRule() ||
				   context == grammarAccess.getTypeExpCSRule() ||
				   context == grammarAccess.getTypeLiteralCSRule()) {
					sequence_PrimitiveTypeCS(context, (PrimitiveTypeRefCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.TUPLE_PART_CS:
				if(context == grammarAccess.getTuplePartCSRule()) {
					sequence_tuplePartCS(context, (TuplePartCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.TUPLE_TYPE_CS:
				if(context == grammarAccess.getTupleTypeCSRule() ||
				   context == grammarAccess.getTypeExpCSRule() ||
				   context == grammarAccess.getTypeLiteralCSRule()) {
					sequence_TupleTypeCS(context, (TupleTypeCS) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == CompleteOCLCSTPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CompleteOCLCSTPackage.BODY_CS:
				if(context == grammarAccess.getBodyCSRule()) {
					sequence_BodyCS(context, (BodyCS) semanticObject); 
					return; 
				}
				else break;
			case CompleteOCLCSTPackage.CLASSIFIER_CONTEXT_DECL_CS:
				if(context == grammarAccess.getClassifierContextDeclCSRule() ||
				   context == grammarAccess.getContextDeclCSRule()) {
					sequence_ClassifierContextDeclCS(context, (ClassifierContextDeclCS) semanticObject); 
					return; 
				}
				else break;
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS:
				if(context == grammarAccess.getCompleteOCLDocumentCSRule()) {
					sequence_CompleteOCLDocumentCS(context, (CompleteOCLDocumentCS) semanticObject); 
					return; 
				}
				else break;
			case CompleteOCLCSTPackage.CONTEXT_SPECIFICATION_CS:
				if(context == grammarAccess.getSpecificationCSRule()) {
					sequence_SpecificationCS(context, (ContextSpecificationCS) semanticObject); 
					return; 
				}
				else break;
			case CompleteOCLCSTPackage.DEF_CS:
				if(context == grammarAccess.getDefCSRule()) {
					sequence_DefCS(context, (DefCS) semanticObject); 
					return; 
				}
				else break;
			case CompleteOCLCSTPackage.DER_CS:
				if(context == grammarAccess.getDerCSRule()) {
					sequence_DerCS(context, (DerCS) semanticObject); 
					return; 
				}
				else break;
			case CompleteOCLCSTPackage.INCLUDE_CS:
				if(context == grammarAccess.getIncludeCSRule()) {
					sequence_IncludeCS(context, (IncludeCS) semanticObject); 
					return; 
				}
				else break;
			case CompleteOCLCSTPackage.INIT_CS:
				if(context == grammarAccess.getInitCSRule()) {
					sequence_InitCS(context, (InitCS) semanticObject); 
					return; 
				}
				else break;
			case CompleteOCLCSTPackage.INV_CS:
				if(context == grammarAccess.getInvCSRule()) {
					sequence_InvCS(context, (InvCS) semanticObject); 
					return; 
				}
				else break;
			case CompleteOCLCSTPackage.OCL_MESSAGE_ARG_CS:
				if(context == grammarAccess.getNavigatingArgExpCSRule()) {
					sequence_NavigatingArgExpCS(context, (OclMessageArgCS) semanticObject); 
					return; 
				}
				else break;
			case CompleteOCLCSTPackage.OPERATION_CONTEXT_DECL_CS:
				if(context == grammarAccess.getContextDeclCSRule() ||
				   context == grammarAccess.getOperationContextDeclCSRule()) {
					sequence_OperationContextDeclCS(context, (OperationContextDeclCS) semanticObject); 
					return; 
				}
				else break;
			case CompleteOCLCSTPackage.PACKAGE_DECLARATION_CS:
				if(context == grammarAccess.getPackageDeclarationCSRule()) {
					sequence_PackageDeclarationCS(context, (PackageDeclarationCS) semanticObject); 
					return; 
				}
				else break;
			case CompleteOCLCSTPackage.POST_CS:
				if(context == grammarAccess.getPostCSRule()) {
					sequence_PostCS(context, (PostCS) semanticObject); 
					return; 
				}
				else break;
			case CompleteOCLCSTPackage.PRE_CS:
				if(context == grammarAccess.getPreCSRule()) {
					sequence_PreCS(context, (PreCS) semanticObject); 
					return; 
				}
				else break;
			case CompleteOCLCSTPackage.PRE_EXP_CS:
				if(context == grammarAccess.getExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0() ||
				   context == grammarAccess.getNavigatingArgExpCSRule() ||
				   context == grammarAccess.getNavigatingExpCSRule() ||
				   context == grammarAccess.getNavigatingExpCS_BaseRule() ||
				   context == grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCSNamedExpAction_1_0() ||
				   context == grammarAccess.getPrefixedExpCSRule() ||
				   context == grammarAccess.getPrimaryExpCSRule()) {
					sequence_NavigatingExpCS_Base(context, (PreExpCS) semanticObject); 
					return; 
				}
				else break;
			case CompleteOCLCSTPackage.PROPERTY_CONTEXT_DECL_CS:
				if(context == grammarAccess.getContextDeclCSRule() ||
				   context == grammarAccess.getPropertyContextDeclCSRule()) {
					sequence_PropertyContextDeclCS(context, (PropertyContextDeclCS) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == EssentialOCLCSTPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EssentialOCLCSTPackage.BINARY_OPERATOR_CS:
				if(context == grammarAccess.getBinaryOperatorCSRule() ||
				   context == grammarAccess.getInfixOperatorCSRule()) {
					sequence_InfixOperatorCS(context, (BinaryOperatorCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.BOOLEAN_LITERAL_EXP_CS:
				if(context == grammarAccess.getBooleanLiteralExpCSRule() ||
				   context == grammarAccess.getExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0() ||
				   context == grammarAccess.getNavigatingArgExpCSRule() ||
				   context == grammarAccess.getPrefixedExpCSRule() ||
				   context == grammarAccess.getPrimaryExpCSRule() ||
				   context == grammarAccess.getPrimitiveLiteralExpCSRule()) {
					sequence_BooleanLiteralExpCS(context, (BooleanLiteralExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.COLLECTION_LITERAL_EXP_CS:
				if(context == grammarAccess.getCollectionLiteralExpCSRule() ||
				   context == grammarAccess.getExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0() ||
				   context == grammarAccess.getNavigatingArgExpCSRule() ||
				   context == grammarAccess.getPrefixedExpCSRule() ||
				   context == grammarAccess.getPrimaryExpCSRule()) {
					sequence_CollectionLiteralExpCS(context, (CollectionLiteralExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.COLLECTION_LITERAL_PART_CS:
				if(context == grammarAccess.getCollectionLiteralPartCSRule()) {
					sequence_CollectionLiteralPartCS(context, (CollectionLiteralPartCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.COLLECTION_TYPE_CS:
				if(context == grammarAccess.getCollectionTypeCSRule() ||
				   context == grammarAccess.getTypeExpCSRule() ||
				   context == grammarAccess.getTypeLiteralCSRule()) {
					sequence_CollectionTypeCS(context, (CollectionTypeCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.CONTEXT_CS:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (ContextCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.IF_EXP_CS:
				if(context == grammarAccess.getExpCSRule() ||
				   context == grammarAccess.getIfExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0() ||
				   context == grammarAccess.getNavigatingArgExpCSRule() ||
				   context == grammarAccess.getPrefixedExpCSRule() ||
				   context == grammarAccess.getPrimaryExpCSRule()) {
					sequence_IfExpCS(context, (IfExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.INDEX_EXP_CS:
				if(context == grammarAccess.getExpCSRule() ||
				   context == grammarAccess.getIndexExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0() ||
				   context == grammarAccess.getNavigatingArgExpCSRule() ||
				   context == grammarAccess.getNavigatingExpCSRule() ||
				   context == grammarAccess.getNavigatingExpCS_BaseRule() ||
				   context == grammarAccess.getNavigatingExpCS_BaseAccess().getPreExpCSNamedExpAction_1_0() ||
				   context == grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCSNamedExpAction_1_0() ||
				   context == grammarAccess.getPrefixedExpCSRule() ||
				   context == grammarAccess.getPrimaryExpCSRule()) {
					sequence_IndexExpCS(context, (IndexExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.INFIX_EXP_CS:
				if(context == grammarAccess.getExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSRule() ||
				   context == grammarAccess.getNavigatingArgExpCSRule()) {
					sequence_InfixedExpCS(context, (InfixExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.INVALID_LITERAL_EXP_CS:
				if(context == grammarAccess.getExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0() ||
				   context == grammarAccess.getInvalidLiteralExpCSRule() ||
				   context == grammarAccess.getNavigatingArgExpCSRule() ||
				   context == grammarAccess.getPrefixedExpCSRule() ||
				   context == grammarAccess.getPrimaryExpCSRule() ||
				   context == grammarAccess.getPrimitiveLiteralExpCSRule()) {
					sequence_NavigatingArgExpCS(context, (InvalidLiteralExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.LET_EXP_CS:
				if(context == grammarAccess.getExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0() ||
				   context == grammarAccess.getLetExpCSRule() ||
				   context == grammarAccess.getNavigatingArgExpCSRule() ||
				   context == grammarAccess.getPrefixedExpCSRule() ||
				   context == grammarAccess.getPrimaryExpCSRule()) {
					sequence_LetExpCS(context, (LetExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.LET_VARIABLE_CS:
				if(context == grammarAccess.getLetVariableCSRule()) {
					sequence_LetVariableCS(context, (LetVariableCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.NAME_EXP_CS:
				if(context == grammarAccess.getExpCSRule() ||
				   context == grammarAccess.getIndexExpCSRule() ||
				   context == grammarAccess.getIndexExpCSAccess().getIndexExpCSNamedExpAction_1_0() ||
				   context == grammarAccess.getInfixedExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0() ||
				   context == grammarAccess.getNameExpCSRule() ||
				   context == grammarAccess.getNavigatingArgExpCSRule() ||
				   context == grammarAccess.getNavigatingExpCSRule() ||
				   context == grammarAccess.getNavigatingExpCS_BaseRule() ||
				   context == grammarAccess.getNavigatingExpCS_BaseAccess().getPreExpCSNamedExpAction_1_0() ||
				   context == grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCSNamedExpAction_1_0() ||
				   context == grammarAccess.getPrefixedExpCSRule() ||
				   context == grammarAccess.getPrimaryExpCSRule()) {
					sequence_NameExpCS(context, (NameExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.NAVIGATING_ARG_CS:
				if(context == grammarAccess.getNavigatingArgCSRule()) {
					sequence_NavigatingArgCS(context, (NavigatingArgCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNavigatingBarArgCSRule()) {
					sequence_NavigatingBarArgCS(context, (NavigatingArgCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNavigatingCommaArgCSRule()) {
					sequence_NavigatingCommaArgCS(context, (NavigatingArgCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNavigatingSemiArgCSRule()) {
					sequence_NavigatingSemiArgCS(context, (NavigatingArgCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.NAVIGATING_EXP_CS:
				if(context == grammarAccess.getExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0() ||
				   context == grammarAccess.getNavigatingArgExpCSRule() ||
				   context == grammarAccess.getNavigatingExpCSRule() ||
				   context == grammarAccess.getPrefixedExpCSRule() ||
				   context == grammarAccess.getPrimaryExpCSRule()) {
					sequence_NavigatingExpCS(context, (NavigatingExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.NAVIGATION_OPERATOR_CS:
				if(context == grammarAccess.getBinaryOperatorCSRule() ||
				   context == grammarAccess.getNavigationOperatorCSRule()) {
					sequence_NavigationOperatorCS(context, (NavigationOperatorCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.NESTED_EXP_CS:
				if(context == grammarAccess.getExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0() ||
				   context == grammarAccess.getNavigatingArgExpCSRule() ||
				   context == grammarAccess.getNestedExpCSRule() ||
				   context == grammarAccess.getPrefixedExpCSRule() ||
				   context == grammarAccess.getPrimaryExpCSRule()) {
					sequence_NestedExpCS(context, (NestedExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.NULL_LITERAL_EXP_CS:
				if(context == grammarAccess.getExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0() ||
				   context == grammarAccess.getNavigatingArgExpCSRule() ||
				   context == grammarAccess.getNullLiteralExpCSRule() ||
				   context == grammarAccess.getPrefixedExpCSRule() ||
				   context == grammarAccess.getPrimaryExpCSRule() ||
				   context == grammarAccess.getPrimitiveLiteralExpCSRule()) {
					sequence_NavigatingArgExpCS(context, (NullLiteralExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.NUMBER_LITERAL_EXP_CS:
				if(context == grammarAccess.getExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0() ||
				   context == grammarAccess.getNavigatingArgExpCSRule() ||
				   context == grammarAccess.getNumberLiteralExpCSRule() ||
				   context == grammarAccess.getPrefixedExpCSRule() ||
				   context == grammarAccess.getPrimaryExpCSRule() ||
				   context == grammarAccess.getPrimitiveLiteralExpCSRule()) {
					sequence_NumberLiteralExpCS(context, (NumberLiteralExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.PREFIX_EXP_CS:
				if(context == grammarAccess.getExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0() ||
				   context == grammarAccess.getNavigatingArgExpCSRule() ||
				   context == grammarAccess.getPrefixedExpCSRule()) {
					sequence_PrefixedExpCS(context, (PrefixExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.SELF_EXP_CS:
				if(context == grammarAccess.getExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0() ||
				   context == grammarAccess.getNavigatingArgExpCSRule() ||
				   context == grammarAccess.getPrefixedExpCSRule() ||
				   context == grammarAccess.getPrimaryExpCSRule() ||
				   context == grammarAccess.getSelfExpCSRule()) {
					sequence_NavigatingArgExpCS(context, (SelfExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.STRING_LITERAL_EXP_CS:
				if(context == grammarAccess.getExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0() ||
				   context == grammarAccess.getNavigatingArgExpCSRule() ||
				   context == grammarAccess.getPrefixedExpCSRule() ||
				   context == grammarAccess.getPrimaryExpCSRule() ||
				   context == grammarAccess.getPrimitiveLiteralExpCSRule() ||
				   context == grammarAccess.getStringLiteralExpCSRule()) {
					sequence_StringLiteralExpCS(context, (StringLiteralExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.TUPLE_LITERAL_EXP_CS:
				if(context == grammarAccess.getExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0() ||
				   context == grammarAccess.getNavigatingArgExpCSRule() ||
				   context == grammarAccess.getPrefixedExpCSRule() ||
				   context == grammarAccess.getPrimaryExpCSRule() ||
				   context == grammarAccess.getTupleLiteralExpCSRule()) {
					sequence_TupleLiteralExpCS(context, (TupleLiteralExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.TUPLE_LITERAL_PART_CS:
				if(context == grammarAccess.getTupleLiteralPartCSRule()) {
					sequence_TupleLiteralPartCS(context, (TupleLiteralPartCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.TYPE_LITERAL_EXP_CS:
				if(context == grammarAccess.getExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0() ||
				   context == grammarAccess.getNavigatingArgExpCSRule() ||
				   context == grammarAccess.getPrefixedExpCSRule() ||
				   context == grammarAccess.getPrimaryExpCSRule() ||
				   context == grammarAccess.getTypeLiteralExpCSRule()) {
					sequence_TypeLiteralExpCS(context, (TypeLiteralExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.TYPE_NAME_EXP_CS:
				if(context == grammarAccess.getTypeExpCSRule() ||
				   context == grammarAccess.getTypeNameExpCSRule()) {
					sequence_TypeNameExpCS(context, (TypeNameExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.UNARY_OPERATOR_CS:
				if(context == grammarAccess.getUnaryOperatorCSRule()) {
					sequence_UnaryOperatorCS(context, (UnaryOperatorCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.UNLIMITED_NATURAL_LITERAL_EXP_CS:
				if(context == grammarAccess.getExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0() ||
				   context == grammarAccess.getNavigatingArgExpCSRule() ||
				   context == grammarAccess.getPrefixedExpCSRule() ||
				   context == grammarAccess.getPrimaryExpCSRule() ||
				   context == grammarAccess.getPrimitiveLiteralExpCSRule() ||
				   context == grammarAccess.getUnlimitedNaturalLiteralExpCSRule()) {
					sequence_NavigatingArgExpCS(context, (UnlimitedNaturalLiteralExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.VARIABLE_CS:
				if(context == grammarAccess.getParameterCSRule()) {
					sequence_ParameterCS(context, (VariableCS) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (stereotype='body' name=UnrestrictedName? specification=SpecificationCS)
	 *
	 * Features:
	 *    name[0, 1]
	 *    stereotype[1, 1]
	 *    specification[1, 1]
	 */
	protected void sequence_BodyCS(EObject context, BodyCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='true' | name='false')
	 *
	 * Features:
	 *    name[0, 2]
	 */
	protected void sequence_BooleanLiteralExpCS(EObject context, BooleanLiteralExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         selfName=UnrestrictedName? 
	 *         (
	 *             (namespace+=[Namespace|UnrestrictedName] namespace+=[Namespace|UnreservedName]* classifier=[Type|UnreservedName]) | 
	 *             classifier=[Type|UnrestrictedName]
	 *         ) 
	 *         (rules+=InvCS | rules+=DefCS)*
	 *     )
	 *
	 * Features:
	 *    namespace[0, *]
	 *         EXCLUDE_IF_UNSET classifier
	 *         EXCLUDE_IF_SET classifier
	 *    rules[0, *]
	 *    classifier[0, 2]
	 *    selfName[0, 1]
	 */
	protected void sequence_ClassifierContextDeclCS(EObject context, ClassifierContextDeclCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedType=CollectionTypeCS (ownedParts+=CollectionLiteralPartCS ownedParts+=CollectionLiteralPartCS*)?)
	 *
	 * Features:
	 *    ownedType[1, 1]
	 *    ownedParts[0, *]
	 */
	protected void sequence_CollectionLiteralExpCS(EObject context, CollectionLiteralExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expressionCS=ExpCS lastExpressionCS=ExpCS?)
	 *
	 * Features:
	 *    expressionCS[1, 1]
	 *    lastExpressionCS[0, 1]
	 */
	protected void sequence_CollectionLiteralPartCS(EObject context, CollectionLiteralPartCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=CollectionTypeIdentifier (ownedType=TypeExpCS | ownedType=TypeExpCS)?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    ownedType[0, 2]
	 */
	protected void sequence_CollectionTypeCS(EObject context, CollectionTypeCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((ownedImport+=ImportCS | ownedInclude+=IncludeCS | ownedLibrary+=LibraryCS)* (packages+=PackageDeclarationCS | contexts+=ContextDeclCS)*)
	 *
	 * Features:
	 *    ownedImport[0, *]
	 *    ownedLibrary[0, *]
	 *    packages[0, *]
	 *    contexts[0, *]
	 *    ownedInclude[0, *]
	 */
	protected void sequence_CompleteOCLDocumentCS(EObject context, CompleteOCLDocumentCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         static?='static'? 
	 *         stereotype='def' 
	 *         name=UnrestrictedName? 
	 *         constrainedName=UnrestrictedName 
	 *         (operation?='(' (parameters+=ParameterCS parameters+=ParameterCS*)?)? 
	 *         ownedType=TypeExpCS? 
	 *         specification=SpecificationCS
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    stereotype[1, 1]
	 *    specification[1, 1]
	 *    static[0, 1]
	 *    constrainedName[1, 1]
	 *    operation[0, 1]
	 *         MANDATORY_IF_SET parameters
	 *         MANDATORY_IF_SET parameters
	 *    parameters[0, *]
	 *         EXCLUDE_IF_UNSET operation
	 *    ownedType[0, 1]
	 */
	protected void sequence_DefCS(EObject context, DefCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stereotype='derive' specification=SpecificationCS)
	 *
	 * Features:
	 *    stereotype[1, 1]
	 *    specification[1, 1]
	 */
	protected void sequence_DerCS(EObject context, DerCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=ExpCS thenExpression=ExpCS elseExpression=ExpCS)
	 *
	 * Features:
	 *    condition[1, 1]
	 *    thenExpression[1, 1]
	 *    elseExpression[1, 1]
	 */
	protected void sequence_IfExpCS(EObject context, IfExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Identifier? namespace=[Namespace|SINGLE_QUOTED_STRING])
	 *
	 * Features:
	 *    name[0, 1]
	 *    namespace[1, 1]
	 */
	protected void sequence_ImportCS(EObject context, ImportCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     namespace=[Namespace|SINGLE_QUOTED_STRING]
	 *
	 * Features:
	 *    namespace[1, 1]
	 */
	protected void sequence_IncludeCS(EObject context, IncludeCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (namedExp=IndexExpCS_IndexExpCS_1_0 firstIndexes+=ExpCS firstIndexes+=ExpCS* (secondIndexes+=ExpCS secondIndexes+=ExpCS*)?)
	 *
	 * Features:
	 *    namedExp[1, 1]
	 *    firstIndexes[1, *]
	 *    secondIndexes[0, *]
	 */
	protected void sequence_IndexExpCS(EObject context, IndexExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=InfixOperator
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_InfixOperatorCS(EObject context, BinaryOperatorCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedExpression+=InfixedExpCS_InfixExpCS_1_0 (ownedOperator+=BinaryOperatorCS ownedExpression+=PrefixedExpCS)+)
	 *
	 * Features:
	 *    ownedExpression[2, *]
	 *    ownedOperator[1, *]
	 *         SAME ownedExpression
	 */
	protected void sequence_InfixedExpCS(EObject context, InfixExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stereotype='init' specification=SpecificationCS)
	 *
	 * Features:
	 *    stereotype[1, 1]
	 *    specification[1, 1]
	 */
	protected void sequence_InitCS(EObject context, InitCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stereotype='inv' (name=UnrestrictedName messageSpecification=SpecificationCS?)? specification=SpecificationCS)
	 *
	 * Features:
	 *    name[0, 1]
	 *         MANDATORY_IF_SET messageSpecification
	 *    stereotype[1, 1]
	 *    specification[1, 1]
	 *    messageSpecification[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 */
	protected void sequence_InvCS(EObject context, InvCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable+=LetVariableCS variable+=LetVariableCS* in=ExpCS)
	 *
	 * Features:
	 *    variable[1, *]
	 *    in[1, 1]
	 */
	protected void sequence_LetExpCS(EObject context, LetExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=UnrestrictedName ownedType=TypeExpCS? initExpression=ExpCS)
	 *
	 * Features:
	 *    name[1, 1]
	 *    ownedType[0, 1]
	 *    initExpression[1, 1]
	 */
	protected void sequence_LetVariableCS(EObject context, LetVariableCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     package=[Package|SINGLE_QUOTED_STRING]
	 *
	 * Features:
	 *    package[1, 1]
	 */
	protected void sequence_LibraryCS(EObject context, LibraryCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ownedExpression=ExpCS
	 *
	 * Features:
	 *    ownedExpression[1, 1]
	 */
	protected void sequence_Model(EObject context, ContextCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (namespace+=[Namespace|UnrestrictedName] namespace+=[Namespace|UnreservedName]* element=[NamedElement|UnreservedName]) | 
	 *         element=[NamedElement|UnrestrictedName]
	 *     )
	 *
	 * Features:
	 *    namespace[0, *]
	 *         EXCLUDE_IF_UNSET element
	 *         EXCLUDE_IF_SET element
	 *    element[0, 2]
	 */
	protected void sequence_NameExpCS(EObject context, NameExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=NavigatingArgExpCS ownedType=TypeExpCS? init=ExpCS?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    ownedType[0, 1]
	 *    init[0, 1]
	 */
	protected void sequence_NavigatingArgCS(EObject context, NavigatingArgCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {InvalidLiteralExpCS}
	 *
	 * Features:
	 */
	protected void sequence_NavigatingArgExpCS(EObject context, InvalidLiteralExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NullLiteralExpCS}
	 *
	 * Features:
	 */
	protected void sequence_NavigatingArgExpCS(EObject context, NullLiteralExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {OclMessageArgCS}
	 *
	 * Features:
	 */
	protected void sequence_NavigatingArgExpCS(EObject context, OclMessageArgCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {SelfExpCS}
	 *
	 * Features:
	 */
	protected void sequence_NavigatingArgExpCS(EObject context, SelfExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {UnlimitedNaturalLiteralExpCS}
	 *
	 * Features:
	 */
	protected void sequence_NavigatingArgExpCS(EObject context, UnlimitedNaturalLiteralExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prefix='|' name=NavigatingArgExpCS ownedType=TypeExpCS? init=ExpCS?)
	 *
	 * Features:
	 *    prefix[1, 1]
	 *    name[1, 1]
	 *    ownedType[0, 1]
	 *    init[0, 1]
	 */
	protected void sequence_NavigatingBarArgCS(EObject context, NavigatingArgCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prefix=',' name=NavigatingArgExpCS ownedType=TypeExpCS? init=ExpCS?)
	 *
	 * Features:
	 *    prefix[1, 1]
	 *    name[1, 1]
	 *    ownedType[0, 1]
	 *    init[0, 1]
	 */
	protected void sequence_NavigatingCommaArgCS(EObject context, NavigatingArgCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     namedExp=NavigatingExpCS_Base_PreExpCS_1_0
	 *
	 * Features:
	 *    namedExp[1, 1]
	 */
	protected void sequence_NavigatingExpCS_Base(EObject context, PreExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             namedExp=NavigatingExpCS_NavigatingExpCS_1_0 
	 *             (
	 *                 argument+=NavigatingArgCS 
	 *                 argument+=NavigatingCommaArgCS* 
	 *                 (argument+=NavigatingSemiArgCS argument+=NavigatingCommaArgCS*)? 
	 *                 (argument+=NavigatingBarArgCS argument+=NavigatingCommaArgCS*)?
	 *             )?
	 *         ) | 
	 *         namedExp=NavigatingExpCS_NavigatingExpCS_1_0
	 *     )
	 *
	 * Features:
	 *    namedExp[0, 2]
	 *    argument[0, *]
	 *         EXCLUDE_IF_UNSET namedExp
	 *         EXCLUDE_IF_SET namedExp
	 */
	protected void sequence_NavigatingExpCS(EObject context, NavigatingExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prefix=';' name=NavigatingArgExpCS ownedType=TypeExpCS? init=ExpCS?)
	 *
	 * Features:
	 *    prefix[1, 1]
	 *    name[1, 1]
	 *    ownedType[0, 1]
	 *    init[0, 1]
	 */
	protected void sequence_NavigatingSemiArgCS(EObject context, NavigatingArgCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=NavigationOperator
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_NavigationOperatorCS(EObject context, NavigationOperatorCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     source=ExpCS
	 *
	 * Features:
	 *    source[1, 1]
	 */
	protected void sequence_NestedExpCS(EObject context, NestedExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=NUMBER_LITERAL
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_NumberLiteralExpCS(EObject context, NumberLiteralExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (namespace+=[Namespace|UnrestrictedName] namespace+=[Namespace|UnreservedName]* operation=[Operation|UnreservedName]) | 
	 *             operation=[Operation|UnrestrictedName]
	 *         ) 
	 *         (parameters+=ParameterCS parameters+=ParameterCS*)? 
	 *         ownedType=TypeExpCS? 
	 *         (rules+=PreCS | rules+=PostCS | rules+=BodyCS)*
	 *     )
	 *
	 * Features:
	 *    namespace[0, *]
	 *         EXCLUDE_IF_UNSET operation
	 *         EXCLUDE_IF_SET operation
	 *    rules[0, *]
	 *    ownedType[0, 1]
	 *    operation[0, 2]
	 *    parameters[0, *]
	 */
	protected void sequence_OperationContextDeclCS(EObject context, OperationContextDeclCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (namespace+=[Namespace|UnrestrictedName] namespace+=[Namespace|UnreservedName]* package=[Package|UnreservedName]) | 
	 *             package=[Package|UnrestrictedName]
	 *         ) 
	 *         contexts+=ContextDeclCS*
	 *     )
	 *
	 * Features:
	 *    namespace[0, *]
	 *         EXCLUDE_IF_UNSET package
	 *         EXCLUDE_IF_SET package
	 *    package[0, 2]
	 *    contexts[0, *]
	 */
	protected void sequence_PackageDeclarationCS(EObject context, PackageDeclarationCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=UnrestrictedName? ownedType=TypeExpCS)
	 *
	 * Features:
	 *    name[0, 1]
	 *    ownedType[1, 1]
	 */
	protected void sequence_ParameterCS(EObject context, VariableCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stereotype='post' name=UnrestrictedName? specification=SpecificationCS)
	 *
	 * Features:
	 *    name[0, 1]
	 *    stereotype[1, 1]
	 *    specification[1, 1]
	 */
	protected void sequence_PostCS(EObject context, PostCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stereotype='pre' name=UnrestrictedName? specification=SpecificationCS)
	 *
	 * Features:
	 *    name[0, 1]
	 *    stereotype[1, 1]
	 *    specification[1, 1]
	 */
	protected void sequence_PreCS(EObject context, PreCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedOperator+=UnaryOperatorCS+ ownedExpression=PrimaryExpCS)
	 *
	 * Features:
	 *    ownedOperator[1, *]
	 *    ownedExpression[1, 1]
	 */
	protected void sequence_PrefixedExpCS(EObject context, PrefixExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=PrimitiveTypeIdentifier
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_PrimitiveTypeCS(EObject context, PrimitiveTypeRefCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (namespace+=[Namespace|UnrestrictedName] namespace+=[Namespace|UnreservedName]* property=[Property|UnreservedName]) | 
	 *             property=[Property|UnrestrictedName]
	 *         ) 
	 *         ownedType=TypeExpCS 
	 *         ((rules+=InitCS rules+=DerCS?)? | (rules+=DerCS rules+=InitCS?))
	 *     )
	 *
	 * Features:
	 *    namespace[0, *]
	 *         EXCLUDE_IF_UNSET property
	 *         EXCLUDE_IF_SET property
	 *    rules[0, 4]
	 *    ownedType[1, 1]
	 *    property[0, 2]
	 */
	protected void sequence_PropertyContextDeclCS(EObject context, PropertyContextDeclCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ownedExpression=ExpCS
	 *
	 * Features:
	 *    ownedExpression[1, 1]
	 */
	protected void sequence_SpecificationCS(EObject context, ContextSpecificationCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name+=StringLiteral+
	 *
	 * Features:
	 *    name[1, *]
	 */
	protected void sequence_StringLiteralExpCS(EObject context, StringLiteralExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedParts+=TupleLiteralPartCS ownedParts+=TupleLiteralPartCS*)
	 *
	 * Features:
	 *    ownedParts[1, *]
	 */
	protected void sequence_TupleLiteralExpCS(EObject context, TupleLiteralExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=UnrestrictedName ownedType=TypeExpCS? initExpression=ExpCS)
	 *
	 * Features:
	 *    name[1, 1]
	 *    ownedType[0, 1]
	 *    initExpression[1, 1]
	 */
	protected void sequence_TupleLiteralPartCS(EObject context, TupleLiteralPartCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Tuple' ((ownedParts+=tuplePartCS ownedParts+=tuplePartCS*)? | (ownedParts+=tuplePartCS ownedParts+=tuplePartCS*)?)?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    ownedParts[0, *]
	 */
	protected void sequence_TupleTypeCS(EObject context, TupleTypeCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ownedType=TypeLiteralCS
	 *
	 * Features:
	 *    ownedType[1, 1]
	 */
	protected void sequence_TypeLiteralExpCS(EObject context, TypeLiteralExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (namespace+=[Namespace|UnrestrictedName] namespace+=[Namespace|UnreservedName]* element=[Type|UnreservedName]) | 
	 *         element=[Type|UnrestrictedName]
	 *     )
	 *
	 * Features:
	 *    namespace[0, *]
	 *         EXCLUDE_IF_UNSET element
	 *         EXCLUDE_IF_SET element
	 *    element[0, 2]
	 */
	protected void sequence_TypeNameExpCS(EObject context, TypeNameExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=PrefixOperator
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_UnaryOperatorCS(EObject context, UnaryOperatorCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=UnrestrictedName ownedType=TypeExpCS)
	 *
	 * Features:
	 *    name[1, 1]
	 *    ownedType[1, 1]
	 */
	protected void sequence_tuplePartCS(EObject context, TuplePartCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
}