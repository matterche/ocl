package org.eclipse.ocl.examples.xtext.essentialocl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.MultiplicityCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PrimitiveTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TuplePartCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TupleTypeCS;
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
import org.eclipse.ocl.examples.xtext.essentialocl.services.EssentialOCLGrammarAccess;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("restriction")
public class AbstractEssentialOCLSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected EssentialOCLGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BaseCSTPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BaseCSTPackage.MULTIPLICITY_CS:
				if(context == grammarAccess.getMultiplicityCSRule()) {
					sequence_MultiplicityCS(context, (MultiplicityCS) semanticObject); 
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
					sequence_PrimitiveLiteralExpCS(context, (UnlimitedNaturalLiteralExpCS) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name='true' | name='false')
	 */
	protected void sequence_BooleanLiteralExpCS(EObject context, BooleanLiteralExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedType=CollectionTypeCS (ownedParts+=CollectionLiteralPartCS ownedParts+=CollectionLiteralPartCS*)?)
	 */
	protected void sequence_CollectionLiteralExpCS(EObject context, CollectionLiteralExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expressionCS=ExpCS lastExpressionCS=ExpCS?)
	 */
	protected void sequence_CollectionLiteralPartCS(EObject context, CollectionLiteralPartCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=CollectionTypeIdentifier (ownedType=TypeExpCS | ownedType=TypeExpCS)?)
	 */
	protected void sequence_CollectionTypeCS(EObject context, CollectionTypeCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property=[Property|UnrestrictedName] initExpression=ExpCS)
	 */
	protected void sequence_ConstructorPartCS(EObject context, ConstructorPartCS semanticObject) {
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
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (namedExp=IndexExpCS_IndexExpCS_1_0 firstIndexes+=ExpCS firstIndexes+=ExpCS* (secondIndexes+=ExpCS secondIndexes+=ExpCS*)?)
	 */
	protected void sequence_IndexExpCS(EObject context, IndexExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=InfixOperator
	 */
	protected void sequence_InfixOperatorCS(EObject context, BinaryOperatorCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedExpression+=InfixedExpCS_InfixExpCS_1_0 (ownedOperator+=BinaryOperatorCS ownedExpression+=PrefixedExpCS)+)
	 */
	protected void sequence_InfixedExpCS(EObject context, InfixExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable+=LetVariableCS variable+=LetVariableCS* in=ExpCS)
	 */
	protected void sequence_LetExpCS(EObject context, LetExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=UnrestrictedName ownedType=TypeExpCS? initExpression=ExpCS)
	 */
	protected void sequence_LetVariableCS(EObject context, LetVariableCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ownedExpression=ExpCS
	 */
	protected void sequence_Model(EObject context, ContextCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((lower=LOWER upper=UPPER?) | multiplicity='*' | multiplicity='+' | multiplicity='?')
	 */
	protected void sequence_MultiplicityCS(EObject context, MultiplicityCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (namespace+=[Namespace|UnrestrictedName] namespace+=[Namespace|UnreservedName]* element=[NamedElement|UnreservedName]) | 
	 *         element=[NamedElement|UnrestrictedName]
	 *     )
	 */
	protected void sequence_NameExpCS(EObject context, NameExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=NavigatingArgExpCS ownedType=TypeExpCS? init=ExpCS?)
	 */
	protected void sequence_NavigatingArgCS(EObject context, NavigatingArgCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prefix='|' name=NavigatingArgExpCS ownedType=TypeExpCS? init=ExpCS?)
	 */
	protected void sequence_NavigatingBarArgCS(EObject context, NavigatingArgCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prefix=',' name=NavigatingArgExpCS ownedType=TypeExpCS? init=ExpCS?)
	 */
	protected void sequence_NavigatingCommaArgCS(EObject context, NavigatingArgCS semanticObject) {
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
	 */
	protected void sequence_NavigatingExpCS(EObject context, NavigatingExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prefix=';' name=NavigatingArgExpCS ownedType=TypeExpCS? init=ExpCS?)
	 */
	protected void sequence_NavigatingSemiArgCS(EObject context, NavigatingArgCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=NavigationOperator
	 */
	protected void sequence_NavigationOperatorCS(EObject context, NavigationOperatorCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     source=ExpCS
	 */
	protected void sequence_NestedExpCS(EObject context, NestedExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=NUMBER_LITERAL
	 */
	protected void sequence_NumberLiteralExpCS(EObject context, NumberLiteralExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedOperator+=UnaryOperatorCS+ ownedExpression=PrimaryExpCS)
	 */
	protected void sequence_PrefixedExpCS(EObject context, PrefixExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name+=StringLiteral+
	 */
	protected void sequence_StringLiteralExpCS(EObject context, StringLiteralExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedParts+=TupleLiteralPartCS ownedParts+=TupleLiteralPartCS*)
	 */
	protected void sequence_TupleLiteralExpCS(EObject context, TupleLiteralExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=UnrestrictedName ownedType=TypeExpCS? initExpression=ExpCS)
	 */
	protected void sequence_TupleLiteralPartCS(EObject context, TupleLiteralPartCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Tuple' ((ownedParts+=tuplePartCS ownedParts+=tuplePartCS*)? | (ownedParts+=tuplePartCS ownedParts+=tuplePartCS*)?)?)
	 */
	protected void sequence_TupleTypeCS(EObject context, TupleTypeCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ownedType=TypeLiteralCS
	 */
	protected void sequence_TypeLiteralExpCS(EObject context, TypeLiteralExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (namespace+=[Namespace|UnrestrictedName] namespace+=[Namespace|UnreservedName]* element=[Type|UnreservedName]) | 
	 *         element=[Type|UnrestrictedName]
	 *     )
	 */
	protected void sequence_TypeNameExpCS(EObject context, TypeNameExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=PrefixOperator
	 */
	protected void sequence_UnaryOperatorCS(EObject context, UnaryOperatorCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=UnrestrictedName ownedType=TypeExpCS)
	 */
	protected void sequence_tuplePartCS(EObject context, TuplePartCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
