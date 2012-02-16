package org.eclipse.ocl.examples.xtext.oclinecore.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.xtext.base.baseCST.AnnotationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.AttributeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.DataTypeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.DetailCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.DocumentationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.EnumerationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.EnumerationLiteralCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.LibraryCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.MultiplicityCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PrimitiveTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ReferenceCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootPackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindingCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterSubstitutionCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateSignatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TuplePartCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TupleTypeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.WildcardTypeRefCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BinaryOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BooleanLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralPartCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionTypeCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ConstructorExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ConstructorPartCS;
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
import org.eclipse.ocl.examples.xtext.essentialocl.serializer.EssentialOCLSemanticSequencer;
import org.eclipse.ocl.examples.xtext.oclinecore.oclinEcoreCST.OCLinEcoreCSTPackage;
import org.eclipse.ocl.examples.xtext.oclinecore.oclinEcoreCST.OCLinEcoreConstraintCS;
import org.eclipse.ocl.examples.xtext.oclinecore.oclinEcoreCST.OCLinEcoreSpecificationCS;
import org.eclipse.ocl.examples.xtext.oclinecore.services.OCLinEcoreGrammarAccess;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("restriction")
public class AbstractOCLinEcoreSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected OCLinEcoreGrammarAccess grammarAccess;
	
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
			case BaseCSTPackage.ANNOTATION_CS:
				if(context == grammarAccess.getAnnotationCSRule() ||
				   context == grammarAccess.getAnnotationElementCSRule()) {
					sequence_AnnotationCS(context, (AnnotationCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.ATTRIBUTE_CS:
				if(context == grammarAccess.getAttributeCSRule() ||
				   context == grammarAccess.getModelElementCSRule() ||
				   context == grammarAccess.getStructuralFeatureCSRule()) {
					sequence_AttributeCS(context, (AttributeCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.CLASS_CS:
				if(context == grammarAccess.getClassCSRule() ||
				   context == grammarAccess.getClassifierCSRule() ||
				   context == grammarAccess.getModelElementCSRule()) {
					sequence_ClassCS(context, (ClassCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.DATA_TYPE_CS:
				if(context == grammarAccess.getClassifierCSRule() ||
				   context == grammarAccess.getDataTypeCSRule() ||
				   context == grammarAccess.getModelElementCSRule()) {
					sequence_DataTypeCS(context, (DataTypeCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.DETAIL_CS:
				if(context == grammarAccess.getDetailCSRule()) {
					sequence_DetailCS(context, (DetailCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.DOCUMENTATION_CS:
				if(context == grammarAccess.getAnnotationElementCSRule() ||
				   context == grammarAccess.getDocumentationCSRule()) {
					sequence_DocumentationCS(context, (DocumentationCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.ENUMERATION_CS:
				if(context == grammarAccess.getClassifierCSRule() ||
				   context == grammarAccess.getEnumerationCSRule() ||
				   context == grammarAccess.getModelElementCSRule()) {
					sequence_EnumerationCS(context, (EnumerationCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.ENUMERATION_LITERAL_CS:
				if(context == grammarAccess.getEnumerationLiteralCSRule() ||
				   context == grammarAccess.getModelElementCSRule()) {
					sequence_EnumerationLiteralCS(context, (EnumerationLiteralCS) semanticObject); 
					return; 
				}
				else break;
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
			case BaseCSTPackage.MODEL_ELEMENT_REF_CS:
				if(context == grammarAccess.getModelElementRefCSRule()) {
					sequence_ModelElementRefCS(context, (ModelElementRefCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.MULTIPLICITY_CS:
				if(context == grammarAccess.getMultiplicityCSRule()) {
					sequence_MultiplicityCS(context, (MultiplicityCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.OPERATION_CS:
				if(context == grammarAccess.getModelElementCSRule() ||
				   context == grammarAccess.getOperationCSRule()) {
					sequence_OperationCS(context, (OperationCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.PACKAGE_CS:
				if(context == grammarAccess.getModelElementCSRule() ||
				   context == grammarAccess.getPackageCSRule()) {
					sequence_PackageCS(context, (PackageCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.PARAMETER_CS:
				if(context == grammarAccess.getParameterCSRule()) {
					sequence_ParameterCS(context, (ParameterCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.PRIMITIVE_TYPE_REF_CS:
				if(context == grammarAccess.getPrimitiveTypeCSRule() ||
				   context == grammarAccess.getTypeLiteralCSRule() ||
				   context == grammarAccess.getTypeRefCSRule() ||
				   context == grammarAccess.getTypedRefCSRule()) {
					sequence_PrimitiveTypeCS(context, (PrimitiveTypeRefCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeExpCSRule()) {
					sequence_TypeExpCS(context, (PrimitiveTypeRefCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypedMultiplicityRefCSRule()) {
					sequence_TypedMultiplicityRefCS(context, (PrimitiveTypeRefCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.REFERENCE_CS:
				if(context == grammarAccess.getModelElementCSRule() ||
				   context == grammarAccess.getReferenceCSRule() ||
				   context == grammarAccess.getStructuralFeatureCSRule()) {
					sequence_ReferenceCS(context, (ReferenceCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.ROOT_PACKAGE_CS:
				if(context == grammarAccess.getRootPackageCSRule()) {
					sequence_RootPackageCS(context, (RootPackageCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.TEMPLATE_BINDING_CS:
				if(context == grammarAccess.getTemplateBindingCSRule()) {
					sequence_TemplateBindingCS(context, (TemplateBindingCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.TEMPLATE_PARAMETER_SUBSTITUTION_CS:
				if(context == grammarAccess.getTemplateParameterSubstitutionCSRule()) {
					sequence_TemplateParameterSubstitutionCS(context, (TemplateParameterSubstitutionCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.TEMPLATE_SIGNATURE_CS:
				if(context == grammarAccess.getTemplateSignatureCSRule()) {
					sequence_TemplateSignatureCS(context, (TemplateSignatureCS) semanticObject); 
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
				   context == grammarAccess.getTypeLiteralCSRule()) {
					sequence_TupleTypeCS(context, (TupleTypeCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeExpCSRule()) {
					sequence_TypeExpCS(context, (TupleTypeCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.TYPE_PARAMETER_CS:
				if(context == grammarAccess.getTypeParameterCSRule()) {
					sequence_TypeParameterCS(context, (TypeParameterCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.TYPED_TYPE_REF_CS:
				if(context == grammarAccess.getTypedMultiplicityRefCSRule()) {
					sequence_TypedMultiplicityRefCS(context, (TypedTypeRefCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeRefCSRule() ||
				   context == grammarAccess.getTypedRefCSRule() ||
				   context == grammarAccess.getTypedTypeRefCSRule()) {
					sequence_TypedTypeRefCS(context, (TypedTypeRefCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSTPackage.WILDCARD_TYPE_REF_CS:
				if(context == grammarAccess.getTypeRefCSRule() ||
				   context == grammarAccess.getWildcardTypeRefCSRule()) {
					sequence_WildcardTypeRefCS(context, (WildcardTypeRefCS) semanticObject); 
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
				   context == grammarAccess.getTypeLiteralCSRule()) {
					sequence_CollectionTypeCS(context, (CollectionTypeCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeExpCSRule()) {
					sequence_TypeExpCS(context, (CollectionTypeCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.CONSTRUCTOR_EXP_CS:
				if(context == grammarAccess.getConstructorExpCSRule() ||
				   context == grammarAccess.getExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSRule() ||
				   context == grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0() ||
				   context == grammarAccess.getNavigatingArgExpCSRule() ||
				   context == grammarAccess.getPrefixedExpCSRule() ||
				   context == grammarAccess.getPrimaryExpCSRule()) {
					sequence_ConstructorExpCS(context, (ConstructorExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSTPackage.CONSTRUCTOR_PART_CS:
				if(context == grammarAccess.getConstructorPartCSRule()) {
					sequence_ConstructorPartCS(context, (ConstructorPartCS) semanticObject); 
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
					sequence_PrimitiveLiteralExpCS(context, (InvalidLiteralExpCS) semanticObject); 
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
					sequence_PrimitiveLiteralExpCS(context, (NullLiteralExpCS) semanticObject); 
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
					sequence_ExpCS(context, (SelfExpCS) semanticObject); 
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
				if(context == grammarAccess.getTypeExpCSRule()) {
					sequence_TypeExpCS(context, (TypeNameExpCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeNameExpCSRule()) {
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
					sequence_PrimitiveLiteralExpCS(context, (UnlimitedNaturalLiteralExpCS) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == OCLinEcoreCSTPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case OCLinEcoreCSTPackage.OC_LIN_ECORE_CONSTRAINT_CS:
				if(context == grammarAccess.getBodyConstraintCSRule()) {
					sequence_BodyConstraintCS(context, (OCLinEcoreConstraintCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getDerivedConstraintCSRule()) {
					sequence_DerivedConstraintCS(context, (OCLinEcoreConstraintCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInitialConstraintCSRule()) {
					sequence_InitialConstraintCS(context, (OCLinEcoreConstraintCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInvariantConstraintCSRule()) {
					sequence_InvariantConstraintCS(context, (OCLinEcoreConstraintCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPostconditionConstraintCSRule()) {
					sequence_PostconditionConstraintCS(context, (OCLinEcoreConstraintCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPreconditionConstraintCSRule()) {
					sequence_PreconditionConstraintCS(context, (OCLinEcoreConstraintCS) semanticObject); 
					return; 
				}
				else break;
			case OCLinEcoreCSTPackage.OC_LIN_ECORE_SPECIFICATION_CS:
				if(context == grammarAccess.getSpecificationCSRule()) {
					sequence_SpecificationCS(context, (OCLinEcoreSpecificationCS) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         (name=UnrestrictedName | name=SINGLE_QUOTED_STRING)? 
	 *         (ownedDetail+=DetailCS ownedDetail+=DetailCS*)? 
	 *         (ownedAnnotation+=AnnotationElementCS | ownedContent+=ModelElementCS | ownedReference+=ModelElementRefCS)*
	 *     )
	 */
	protected void sequence_AnnotationCS(EObject context, AnnotationCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (qualifier+='static' | qualifier+='definition')* 
	 *         name=UnrestrictedName 
	 *         ownedType=TypedMultiplicityRefCS? 
	 *         default=SINGLE_QUOTED_STRING? 
	 *         (
	 *             qualifier+='derived' | 
	 *             qualifier+='!derived' | 
	 *             qualifier+='id' | 
	 *             qualifier+='!id' | 
	 *             qualifier+='ordered' | 
	 *             qualifier+='!ordered' | 
	 *             qualifier+='readonly' | 
	 *             qualifier+='!readonly' | 
	 *             qualifier+='transient' | 
	 *             qualifier+='!transient' | 
	 *             qualifier+='unique' | 
	 *             qualifier+='!unique' | 
	 *             qualifier+='unsettable' | 
	 *             qualifier+='!unsettable' | 
	 *             qualifier+='volatile' | 
	 *             qualifier+='!volatile'
	 *         )* 
	 *         (ownedAnnotation+=AnnotationElementCS | ownedConstraint+=InitialConstraintCS | ownedConstraint+=DerivedConstraintCS)*
	 *     )
	 */
	protected void sequence_AttributeCS(EObject context, AttributeCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stereotype='body' name=UnrestrictedName? specification=SpecificationCS?)
	 */
	protected void sequence_BodyConstraintCS(EObject context, OCLinEcoreConstraintCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='true' | name='false')
	 */
	protected void sequence_BooleanLiteralExpCS(EObject context, BooleanLiteralExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         qualifier+='abstract'? 
	 *         name=UnrestrictedName 
	 *         ownedTemplateSignature=TemplateSignatureCS? 
	 *         (ownedSuperType+=TypedRefCS ownedSuperType+=TypedRefCS*)? 
	 *         instanceClassName=SINGLE_QUOTED_STRING? 
	 *         qualifier+='interface'? 
	 *         (ownedAnnotation+=AnnotationElementCS | ownedOperation+=OperationCS | ownedProperty+=StructuralFeatureCS | ownedConstraint+=InvariantConstraintCS)*
	 *     )
	 */
	protected void sequence_ClassCS(EObject context, ClassCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedType=CollectionTypeCS (ownedParts+=CollectionLiteralPartCS ownedParts+=CollectionLiteralPartCS*)?)
	 */
	protected void sequence_CollectionLiteralExpCS(EObject context, CollectionLiteralExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expressionCS=ExpCS lastExpressionCS=ExpCS?)
	 */
	protected void sequence_CollectionLiteralPartCS(EObject context, CollectionLiteralPartCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=CollectionTypeIdentifier (ownedType=TypeExpCS | ownedType=TypeExpCS)?)
	 */
	protected void sequence_CollectionTypeCS(EObject context, CollectionTypeCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (namespace+=[Namespace|UnrestrictedName] namespace+=[Namespace|UnreservedName]* element=[Type|UnreservedName]) | 
	 *             element=[Type|UnrestrictedName]
	 *         ) 
	 *         ownedParts+=ConstructorPartCS 
	 *         ownedParts+=ConstructorPartCS*
	 *     )
	 */
	protected void sequence_ConstructorExpCS(EObject context, ConstructorExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property=[Property|UnrestrictedName] initExpression=ExpCS)
	 */
	protected void sequence_ConstructorPartCS(EObject context, ConstructorPartCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=UnrestrictedName 
	 *         ownedTemplateSignature=TemplateSignatureCS? 
	 *         instanceClassName=SINGLE_QUOTED_STRING? 
	 *         (qualifier+='serializable' | qualifier+='!serializable')? 
	 *         (ownedAnnotation+=AnnotationElementCS | ownedConstraint+=InvariantConstraintCS)*
	 *     )
	 */
	protected void sequence_DataTypeCS(EObject context, DataTypeCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stereotype='derivation' specification=SpecificationCS?)
	 */
	protected void sequence_DerivedConstraintCS(EObject context, OCLinEcoreConstraintCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=UnrestrictedName | name=SINGLE_QUOTED_STRING) (value+=SINGLE_QUOTED_STRING | value+=ML_SINGLE_QUOTED_STRING)*)
	 */
	protected void sequence_DetailCS(EObject context, DetailCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=SINGLE_QUOTED_STRING? (ownedDetail+=DetailCS ownedDetail+=DetailCS*)?)
	 */
	protected void sequence_DocumentationCS(EObject context, DocumentationCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=UnrestrictedName 
	 *         ownedTemplateSignature=TemplateSignatureCS? 
	 *         instanceClassName=SINGLE_QUOTED_STRING? 
	 *         (qualifier+='serializable' | qualifier+='!serializable')? 
	 *         (ownedAnnotation+=AnnotationElementCS | ownedLiterals+=EnumerationLiteralCS | ownedConstraint+=InvariantConstraintCS)*
	 *     )
	 */
	protected void sequence_EnumerationCS(EObject context, EnumerationCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=UnrestrictedName value=INTEGER? ownedAnnotation+=AnnotationElementCS*)
	 */
	protected void sequence_EnumerationLiteralCS(EObject context, EnumerationLiteralCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {SelfExpCS}
	 */
	protected void sequence_ExpCS(EObject context, SelfExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=ExpCS thenExpression=ExpCS elseExpression=ExpCS)
	 */
	protected void sequence_IfExpCS(EObject context, IfExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=UnrestrictedName? namespace=[Namespace|URI] all?='::'?)
	 */
	protected void sequence_ImportCS(EObject context, ImportCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (namedExp=IndexExpCS_IndexExpCS_1_0 firstIndexes+=ExpCS firstIndexes+=ExpCS* (secondIndexes+=ExpCS secondIndexes+=ExpCS*)?)
	 */
	protected void sequence_IndexExpCS(EObject context, IndexExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=InfixOperator
	 */
	protected void sequence_InfixOperatorCS(EObject context, BinaryOperatorCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedExpression+=InfixedExpCS_InfixExpCS_1_0 (ownedOperator+=BinaryOperatorCS ownedExpression+=PrefixedExpCS)+)
	 */
	protected void sequence_InfixedExpCS(EObject context, InfixExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stereotype='initial' specification=SpecificationCS?)
	 */
	protected void sequence_InitialConstraintCS(EObject context, OCLinEcoreConstraintCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (callable?='callable'? stereotype='invariant' (name=UnrestrictedName messageSpecification=SpecificationCS?)? specification=SpecificationCS?)
	 */
	protected void sequence_InvariantConstraintCS(EObject context, OCLinEcoreConstraintCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable+=LetVariableCS variable+=LetVariableCS* in=ExpCS)
	 */
	protected void sequence_LetExpCS(EObject context, LetExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=UnrestrictedName ownedType=TypeExpCS? initExpression=ExpCS)
	 */
	protected void sequence_LetVariableCS(EObject context, LetVariableCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=UnrestrictedName? package=[Package|URI])
	 */
	protected void sequence_LibraryCS(EObject context, LibraryCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (namespace+=[Namespace|UnrestrictedName] namespace+=[Namespace|UnreservedName]* element=[Element|UnreservedName]) | 
	 *         element=[Element|UnrestrictedName]
	 *     )
	 */
	protected void sequence_ModelElementRefCS(EObject context, ModelElementRefCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ownedExpression=ExpCS
	 */
	protected void sequence_Model(EObject context, ContextCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((lower=LOWER upper=UPPER?) | multiplicity='*' | multiplicity='+' | multiplicity='?')
	 */
	protected void sequence_MultiplicityCS(EObject context, MultiplicityCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (namespace+=[Namespace|UnrestrictedName] namespace+=[Namespace|UnreservedName]* element=[NamedElement|UnreservedName]) | 
	 *         element=[NamedElement|UnrestrictedName]
	 *     )
	 */
	protected void sequence_NameExpCS(EObject context, NameExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=NavigatingArgExpCS ownedType=TypeExpCS? init=ExpCS?)
	 */
	protected void sequence_NavigatingArgCS(EObject context, NavigatingArgCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prefix='|' name=NavigatingArgExpCS ownedType=TypeExpCS? init=ExpCS?)
	 */
	protected void sequence_NavigatingBarArgCS(EObject context, NavigatingArgCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prefix=',' name=NavigatingArgExpCS ownedType=TypeExpCS? init=ExpCS?)
	 */
	protected void sequence_NavigatingCommaArgCS(EObject context, NavigatingArgCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
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
	 */
	protected void sequence_NavigatingExpCS(EObject context, NavigatingExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prefix=';' name=NavigatingArgExpCS ownedType=TypeExpCS? init=ExpCS?)
	 */
	protected void sequence_NavigatingSemiArgCS(EObject context, NavigatingArgCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=NavigationOperator
	 */
	protected void sequence_NavigationOperatorCS(EObject context, NavigationOperatorCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     source=ExpCS
	 */
	protected void sequence_NestedExpCS(EObject context, NestedExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=NUMBER_LITERAL
	 */
	protected void sequence_NumberLiteralExpCS(EObject context, NumberLiteralExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (qualifier+='static' | qualifier+='definition')* 
	 *         name=UnrestrictedName 
	 *         ownedTemplateSignature=TemplateSignatureCS? 
	 *         (ownedParameter+=ParameterCS ownedParameter+=ParameterCS*)? 
	 *         ownedType=TypedMultiplicityRefCS? 
	 *         (ownedException+=TypedRefCS ownedException+=TypedRefCS*)? 
	 *         (
	 *             qualifier+='derived' | 
	 *             qualifier+='!derived' | 
	 *             qualifier+='ordered' | 
	 *             qualifier+='!ordered' | 
	 *             qualifier+='unique' | 
	 *             qualifier+='!unique'
	 *         )* 
	 *         (
	 *             ownedAnnotation+=AnnotationElementCS | 
	 *             ownedConstraint+=PreconditionConstraintCS | 
	 *             ownedConstraint+=BodyConstraintCS | 
	 *             ownedConstraint+=PostconditionConstraintCS
	 *         )*
	 *     )
	 */
	protected void sequence_OperationCS(EObject context, OperationCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=UnrestrictedName 
	 *         nsPrefix=UnrestrictedName? 
	 *         nsURI=URI? 
	 *         (ownedAnnotation+=AnnotationElementCS | ownedNestedPackage+=PackageCS | ownedType+=ClassifierCS)*
	 *     )
	 */
	protected void sequence_PackageCS(EObject context, PackageCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=UnrestrictedName 
	 *         ownedType=TypedMultiplicityRefCS? 
	 *         (qualifier+='ordered' | qualifier+='!ordered' | qualifier+='unique' | qualifier+='!unique')* 
	 *         ownedAnnotation+=AnnotationElementCS*
	 *     )
	 */
	protected void sequence_ParameterCS(EObject context, ParameterCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stereotype='postcondition' name=UnrestrictedName? specification=SpecificationCS?)
	 */
	protected void sequence_PostconditionConstraintCS(EObject context, OCLinEcoreConstraintCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stereotype='precondition' name=UnrestrictedName? specification=SpecificationCS?)
	 */
	protected void sequence_PreconditionConstraintCS(EObject context, OCLinEcoreConstraintCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedOperator+=UnaryOperatorCS+ ownedExpression=PrimaryExpCS)
	 */
	protected void sequence_PrefixedExpCS(EObject context, PrefixExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {InvalidLiteralExpCS}
	 */
	protected void sequence_PrimitiveLiteralExpCS(EObject context, InvalidLiteralExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NullLiteralExpCS}
	 */
	protected void sequence_PrimitiveLiteralExpCS(EObject context, NullLiteralExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {UnlimitedNaturalLiteralExpCS}
	 */
	protected void sequence_PrimitiveLiteralExpCS(EObject context, UnlimitedNaturalLiteralExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=PrimitiveTypeIdentifier
	 */
	protected void sequence_PrimitiveTypeCS(EObject context, PrimitiveTypeRefCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (qualifier+='static' | qualifier+='definition')* 
	 *         name=UnrestrictedName 
	 *         opposite=[Property|UnrestrictedName]? 
	 *         ownedType=TypedMultiplicityRefCS? 
	 *         default=SINGLE_QUOTED_STRING? 
	 *         (
	 *             qualifier+='composes' | 
	 *             qualifier+='!composes' | 
	 *             qualifier+='derived' | 
	 *             qualifier+='!derived' | 
	 *             qualifier+='ordered' | 
	 *             qualifier+='!ordered' | 
	 *             qualifier+='readonly' | 
	 *             qualifier+='!readonly' | 
	 *             qualifier+='resolve' | 
	 *             qualifier+='!resolve' | 
	 *             qualifier+='transient' | 
	 *             qualifier+='!transient' | 
	 *             qualifier+='unique' | 
	 *             qualifier+='!unique' | 
	 *             qualifier+='unsettable' | 
	 *             qualifier+='!unsettable' | 
	 *             qualifier+='volatile' | 
	 *             qualifier+='!volatile'
	 *         )* 
	 *         (
	 *             ownedAnnotation+=AnnotationElementCS | 
	 *             (keys+=[Property|UnrestrictedName] keys+=[Property|UnrestrictedName]*) | 
	 *             ownedConstraint+=InitialConstraintCS | 
	 *             ownedConstraint+=DerivedConstraintCS
	 *         )*
	 *     )
	 */
	protected void sequence_ReferenceCS(EObject context, ReferenceCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=UnrestrictedName? ownedLibrary+=LibraryCS* ownedImport+=ImportCS* ownedNestedPackage+=PackageCS*)
	 */
	protected void sequence_RootPackageCS(EObject context, RootPackageCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedExpression=ExpCS | exprString=UNQUOTED_STRING)
	 */
	protected void sequence_SpecificationCS(EObject context, OCLinEcoreSpecificationCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name+=StringLiteral+
	 */
	protected void sequence_StringLiteralExpCS(EObject context, StringLiteralExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedParameterSubstitution+=TemplateParameterSubstitutionCS ownedParameterSubstitution+=TemplateParameterSubstitutionCS*)
	 */
	protected void sequence_TemplateBindingCS(EObject context, TemplateBindingCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ownedActualParameter=TypeRefCS
	 */
	protected void sequence_TemplateParameterSubstitutionCS(EObject context, TemplateParameterSubstitutionCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedTemplateParameter+=TypeParameterCS ownedTemplateParameter+=TypeParameterCS*)
	 */
	protected void sequence_TemplateSignatureCS(EObject context, TemplateSignatureCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedParts+=TupleLiteralPartCS ownedParts+=TupleLiteralPartCS*)
	 */
	protected void sequence_TupleLiteralExpCS(EObject context, TupleLiteralExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=UnrestrictedName ownedType=TypeExpCS? initExpression=ExpCS)
	 */
	protected void sequence_TupleLiteralPartCS(EObject context, TupleLiteralPartCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Tuple' ((ownedParts+=tuplePartCS ownedParts+=tuplePartCS*)? | (ownedParts+=tuplePartCS ownedParts+=tuplePartCS*)?)?)
	 */
	protected void sequence_TupleTypeCS(EObject context, TupleTypeCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=CollectionTypeIdentifier (ownedType=TypeExpCS | ownedType=TypeExpCS)? multiplicity=MultiplicityCS?)
	 */
	protected void sequence_TypeExpCS(EObject context, CollectionTypeCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=PrimitiveTypeIdentifier multiplicity=MultiplicityCS?)
	 */
	protected void sequence_TypeExpCS(EObject context, PrimitiveTypeRefCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name='Tuple' 
	 *         ((ownedParts+=tuplePartCS ownedParts+=tuplePartCS*)? | (ownedParts+=tuplePartCS ownedParts+=tuplePartCS*)?)? 
	 *         multiplicity=MultiplicityCS?
	 *     )
	 */
	protected void sequence_TypeExpCS(EObject context, TupleTypeCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (namespace+=[Namespace|UnrestrictedName] namespace+=[Namespace|UnreservedName]* element=[Type|UnreservedName]) | 
	 *             element=[Type|UnrestrictedName]
	 *         ) 
	 *         multiplicity=MultiplicityCS?
	 *     )
	 */
	protected void sequence_TypeExpCS(EObject context, TypeNameExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ownedType=TypeLiteralCS
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
	 */
	protected void sequence_TypeNameExpCS(EObject context, TypeNameExpCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=UnrestrictedName ((ownedExtends+=TypedRefCS ownedExtends+=TypedRefCS*) | ownedSuper=TypedRefCS)?)
	 */
	protected void sequence_TypeParameterCS(EObject context, TypeParameterCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=PrimitiveTypeIdentifier multiplicity=MultiplicityCS?)
	 */
	protected void sequence_TypedMultiplicityRefCS(EObject context, PrimitiveTypeRefCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         ((namespace+=[Namespace|UnrestrictedName] namespace+=[Namespace|UnreservedName]* type=[Type|UnreservedName]) | type=[Type|UnrestrictedName]) 
	 *         ownedTemplateBinding=TemplateBindingCS? 
	 *         multiplicity=MultiplicityCS?
	 *     )
	 */
	protected void sequence_TypedMultiplicityRefCS(EObject context, TypedTypeRefCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         ((namespace+=[Namespace|UnrestrictedName] namespace+=[Namespace|UnreservedName]* type=[Type|UnreservedName]) | type=[Type|UnrestrictedName]) 
	 *         ownedTemplateBinding=TemplateBindingCS?
	 *     )
	 */
	protected void sequence_TypedTypeRefCS(EObject context, TypedTypeRefCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=PrefixOperator
	 */
	protected void sequence_UnaryOperatorCS(EObject context, UnaryOperatorCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((extends=TypedRefCS | super=TypedRefCS)?)
	 */
	protected void sequence_WildcardTypeRefCS(EObject context, WildcardTypeRefCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=UnrestrictedName ownedType=TypeExpCS)
	 */
	protected void sequence_tuplePartCS(EObject context, TuplePartCS semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
}
