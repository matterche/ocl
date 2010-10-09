/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: EssentialOCLCS2PivotSwitch.java,v 1.1.2.3 2010/10/09 20:10:00 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.utilities;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.examples.common.utils.StringUtils;
import org.eclipse.ocl.examples.pivot.AssociativityKind;
import org.eclipse.ocl.examples.pivot.BooleanLiteralExp;
import org.eclipse.ocl.examples.pivot.CallExp;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.IfExp;
import org.eclipse.ocl.examples.pivot.IntegerLiteralExp;
import org.eclipse.ocl.examples.pivot.InvalidLiteralExp;
import org.eclipse.ocl.examples.pivot.Iterate;
import org.eclipse.ocl.examples.pivot.IterateExp;
import org.eclipse.ocl.examples.pivot.Iterator;
import org.eclipse.ocl.examples.pivot.IteratorExp;
import org.eclipse.ocl.examples.pivot.LetExp;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.NullLiteralExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Precedence;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.PropertyCallExp;
import org.eclipse.ocl.examples.pivot.RealLiteralExp;
import org.eclipse.ocl.examples.pivot.StringLiteralExp;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.VariableDeclaration;
import org.eclipse.ocl.examples.pivot.VariableExp;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeRefCS;
import org.eclipse.ocl.examples.xtext.base.utilities.BaseCS2PivotSwitch;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2Pivot;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BinaryOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BooleanLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ContextCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.EssentialOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.IfExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InfixExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InvalidLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.LetExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.LetVariableCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NameExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NamedExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingArgCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigationOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NestedExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NullLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NumberLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.OperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.PrefixExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.SelfExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.StringLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.UnaryOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.VariableCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.util.EssentialOCLCSTSwitch;

public class EssentialOCLCS2PivotSwitch implements CS2Pivot.Switch
{	
	private static final Logger logger = Logger.getLogger(EssentialOCLCS2PivotSwitch.class);

	private static final class Factory implements CS2Pivot.Factory
	{
		private Factory() {
			BaseCS2PivotSwitch.FACTORY.getClass();
			CS2Pivot.addFactory(this);
		}
		
		public CS2Pivot.Switch create(CS2Pivot converter) {
			return new EssentialOCLCS2PivotSwitch(converter);
		}

		public EPackage getEPackage() {
			return EssentialOCLCSTPackage.eINSTANCE;
		}
	}

	public static CS2Pivot.Factory FACTORY = new Factory();
	
	public class DeclarationPass extends EssentialOCLCSTSwitch<Element> implements CS2Pivot.Switch.Pass
	{	
		protected final BaseCS2PivotSwitch.DeclarationPass baseSwitch;
		
		public DeclarationPass() {
			baseSwitch = (BaseCS2PivotSwitch.DeclarationPass) converter.getSwitch(BaseCS2PivotSwitch.FACTORY).getDeclarationPass();
		}

/*		@Override
		public Element caseLibIterationCS(LibIterationCS csElement) {
			Iteration pivotElement = converter.defineOperation(Iteration.class, PivotPackage.Literals.ITERATION, csElement);
			converter.defineElements(Parameter.class, pivotElement.getOwnedIterators(), csElement.getOwnedIterator());
//			converter.queueReferencers(csElement.getOwnedIterator());	// For type
			return pivotElement;
		}

		@Override
		public Element caseLibOperationCS(LibOperationCS csElement) {
			return converter.defineOperation(Operation.class, PivotPackage.Literals.OPERATION, csElement);
		}

		@Override
		public Element caseLibPropertyCS(LibPropertyCS csElement) {
			Property pivotElement = converter.defineNamedElement(Property.class, PivotPackage.Literals.PROPERTY, csElement);
			converter.queueReferencer(csElement);	// For type
			return pivotElement;
		} */

		@Override
		public Element caseContextCS(ContextCS csElement) {
			ExpressionInOcl pivotElement = converter.refreshMonikeredElement(ExpressionInOcl.class,
				PivotPackage.Literals.EXPRESSION_IN_OCL, csElement.getMoniker());
			converter.installPivotElement(csElement, pivotElement);
			converter.queueReferencer(csElement);	// For expression
			return pivotElement;
		}

		@Override
		public Element defaultCase(EObject csElement) {
			return baseSwitch.doSwitch(csElement);
		}

		public Element doInPackageSwitch(EObject csElement) {
			int classifierID = csElement.eClass().getClassifierID();
			return doSwitch(classifierID, csElement);
		}

		@Override
		public Element doSwitch(EObject csElement) {
			EClass eClass = csElement.eClass();
			return doSwitch(eClass, csElement);
		}
	}
	
	public class DefinitionPass extends EssentialOCLCSTSwitch<Element> implements CS2Pivot.Switch.Pass
	{	
		protected final BaseCS2PivotSwitch.DefinitionPass baseSwitch;
		
		public DefinitionPass() {
			baseSwitch = (BaseCS2PivotSwitch.DefinitionPass) converter.getSwitch(BaseCS2PivotSwitch.FACTORY).getDefinitionPass();
		}
		@Override
		public Element defaultCase(EObject csElement) {
			return baseSwitch.doSwitch(csElement);
		}

		public Element doInPackageSwitch(EObject csElement) {
			int classifierID = csElement.eClass().getClassifierID();
			return doSwitch(classifierID, csElement);
		}

		@Override
		public Element doSwitch(EObject csElement) {
			EClass eClass = csElement.eClass();
			return doSwitch(eClass, csElement);
		}
	}
	
	public class ReferencePass extends EssentialOCLCSTSwitch<Element> implements CS2Pivot.Switch.Pass
	{	
		protected final BaseCS2PivotSwitch.ReferencePass baseSwitch;
		
		public ReferencePass() {
			baseSwitch = (BaseCS2PivotSwitch.ReferencePass) converter.getSwitch(BaseCS2PivotSwitch.FACTORY).getReferencePass();
		}

		@Override
		public Element caseBinaryOperatorCS(BinaryOperatorCS csOperator) {
			OperationCallExp expression = refreshExpression(OperationCallExp.class, PivotPackage.Literals.OPERATION_CALL_EXP, csOperator);
			converter.refreshName(expression, csOperator.getName());
			OclExpression leftElement = converter.referenceElement(OclExpression.class, csOperator.getLeft());
			OclExpression rightElement = converter.referenceElement(OclExpression.class, csOperator.getRight());
			expression.setSource(leftElement);
			expression.getArguments().add(rightElement);	// FIXME refresh
			return expression;
		}

		@Override
		public Element caseBooleanLiteralExpCS(BooleanLiteralExpCS csElement) {
			BooleanLiteralExp expression = refreshExpression(BooleanLiteralExp.class, PivotPackage.Literals.BOOLEAN_LITERAL_EXP, csElement);
			expression.setBooleanSymbol(Boolean.valueOf(csElement.getName()));
			converter.queueResolver(csElement);
			return expression;
		}

		@Override
		public Element caseContextCS(ContextCS csElement) {
			ExpressionInOcl pivotElement = converter.getPivotElement(ExpressionInOcl.class, csElement);
			OclExpression expression = converter.referenceElement(OclExpression.class, csElement.getOwnedExpression());
			pivotElement.setBodyExpression(expression);
			return pivotElement;
		}

		@Override
		public Element caseIfExpCS(IfExpCS csElement) {
			IfExp expression = refreshExpression(IfExp.class, PivotPackage.Literals.IF_EXP, csElement);
			expression.setCondition(converter.referenceElement(OclExpression.class, csElement.getCondition()));
			expression.setThenExpression(converter.referenceElement(OclExpression.class, csElement.getThenExpression()));
			expression.setElseExpression(converter.referenceElement(OclExpression.class, csElement.getElseExpression()));
			converter.queueResolver(csElement);
			return expression;
		}
		
		@Override
		public Element caseInfixExpCS(InfixExpCS csElement) {
			// FIXME special case trivial expressions
			//
			//	Establish the Infix tree and the per leaf expression parent operator.
			//
			OperatorCS[] csParents = createInfixOperatorTree(csElement);			
			//
			//	Interleave the Prefix Operators.
			//
			interleavePrefixes(csElement, csParents);
			//
			//	Establish the root operator
			//
			OperatorCS csOperator = csParents[0];
			while (csOperator.getParent() != null) {
				csOperator = csOperator.getParent();
			}
			//
			//	Create the pivot expressions.
			//
//			OclExpression pivotElement = createCallTree(csOperator);
			csOperator.setPivot(csElement.getPivot());		// Preserve any pre-created pivot
//			converter.referenceElements(csElement.getOwnedExpression());
//			OperationCallExp pivotElement = refreshExpression(OperationCallExp.class, PivotPackage.Literals.OPERATION_CALL_EXP, csOperator);
//			F I X M E create all calls
			CallExp pivotElement = converter.referenceElement(CallExp.class, csOperator);
			converter.installPivotElement(csElement, pivotElement);
			converter.queueResolver(csElement); 	// For referredOperation
			return pivotElement;
		}

/*		private OclExpression createCallTree(ExpCS csOperator) {
			if (csOperator instanceof BinaryOperatorCS) {
				BinaryOperatorCS csBinary = (BinaryOperatorCS)csOperator;
				OclExpression source = createCallTree(csBinary.getLeft());
				OclExpression arg = createCallTree(csBinary.getRight());
			}
			else if (csOperator instanceof UnaryOperatorCS) {
				UnaryOperatorCS csUnary = (UnaryOperatorCS)csOperator;
				OclExpression child = createCallTree(csUnary.getChild());
				OperationCallExp pivotUnary = refreshExpression(OperationCallExp.class, PivotPackage.Literals.OPERATION_CALL_EXP, csUnary);
				pivotUnary.setName(pivotUnary.getName());
				pivotUnary.setIsPre(pivotUnary.isPre());
				pivotUnary.setSource(child);
			}
			else if (csOperator instanceof OclExpression) {
				UnaryOperatorCS csUnary = (UnaryOperatorCS)csOperator;
				OclExpression child = createCallTree(csUnary.getChild());
				OperationCallExp pivotUnary = refreshExpression(OperationCallExp.class, PivotPackage.Literals.OPERATION_CALL_EXP, csUnary);
				pivotUnary.setName(pivotUnary.getName());
				pivotUnary.setIsPre(pivotUnary.isPre());
				pivotUnary.setSource(child);
			}
			return null;
		} */

		@Override
		public Element caseInvalidLiteralExpCS(InvalidLiteralExpCS csElement) {
//			InvalidLiteralExp expression = refreshExpression(InvalidLiteralExp.class, PivotPackage.Literals.INVALID_LITERAL_EXP, csElement);
			InvalidLiteralExp expression = pivotManager.createInvalidValue(csElement, null, "invalid literal", null);
			converter.installPivotElement(csElement, expression);
			converter.queueResolver(csElement);
			return expression;
		}
		
		@Override
		public Element caseLetExpCS(LetExpCS csElement) {
			LetExp rootLetExp = null;
			LetExp parentLetExp = null;
			String baseMoniker = csElement.getMoniker();
			int letIndex = 0;
			for (LetVariableCS csVariable : csElement.getVariable()) {
				String letMoniker = baseMoniker + "_" + letIndex++;
				LetExp pivotLetExp = converter.refreshMonikeredElement(LetExp.class,
					PivotPackage.Literals.LET_EXP, letMoniker);
				if (parentLetExp == null) {
					rootLetExp = pivotLetExp;
					converter.installPivotElement(csElement, rootLetExp);
				}
				else {
					parentLetExp.setIn(pivotLetExp);
				}
				Variable pivotVariable = converter.referenceElement(Variable.class, csVariable);
				pivotLetExp.setVariable(pivotVariable);
				parentLetExp = pivotLetExp;
			}
			if (parentLetExp != null) {			// Redundant but JDT doesn't know that
				parentLetExp.setIn(converter.referenceElement(OclExpression.class, csElement.getIn()));
			}
			converter.queueResolver(csElement); 	// For types
			return rootLetExp;
		}

		@Override
		public Element caseNameExpCS(NameExpCS csElement) {
			NamedElement element = csElement.getElement();
			if (element instanceof VariableDeclaration) {
				VariableExp expression = refreshExpression(VariableExp.class, PivotPackage.Literals.VARIABLE_EXP, csElement);
				expression.setReferredVariable((VariableDeclaration) element);
				converter.queueResolver(csElement);
				return expression;
			}
			else if (element instanceof Property) {
				PropertyCallExp expression = refreshExpression(PropertyCallExp.class, PivotPackage.Literals.PROPERTY_CALL_EXP, csElement);
				expression.setReferredProperty((Property) element);
				converter.queueResolver(csElement);
				return expression;
			}
			else {
				logger.warn("Unsupported NameExpCS " + element.eClass().getName());		// FIXME
				return null;
			}
		}

		@Override
		public Element caseNavigatingExpCS(NavigatingExpCS csElement) {
			InfixExpCS csInfix = (InfixExpCS) csElement.eContainer();
			int index = csInfix.getOwnedExpression().indexOf(csElement);
			NavigationOperatorCS csNavigationOperator = index > 0 ? (NavigationOperatorCS)csInfix.getOwnedOperator().get(index-1) : null;
			int barIndex = -1;
			int semiIndex = -1;
			NamedExpCS namedExp = csElement.getName();
			NamedElement namedElement = namedExp.getNamedElement();
			boolean isOperation = namedElement instanceof Operation;
			boolean isIterator = namedElement instanceof Iterator;
			boolean isIterate = namedElement instanceof Iterate;
			List<NavigatingArgCS> arguments = csElement.getArguments();
			int iMax = arguments.size();
			for (int i = 0; i < iMax; i++) {
				NavigatingArgCS arg = arguments.get(i);
				String prefix = arg.getPrefix();
				if ("|".equals(prefix)) {
					if (barIndex >= 0) {
						arg.getError().add("Unexpected extra '|' separator");
					}
					else if (!isIterator) {
						arg.getError().add("Inappropriate '|' separator");
					}
					else {
						barIndex = i;
					}
				}
				else if (";".equals(prefix)) {
					if (barIndex >= 0) {
						arg.getError().add("Unexpected extra ';' separator");
					}
					else if (semiIndex >= 0) {
						arg.getError().add("Unexpected ';' separator");
					}
					else if (!isIterate) {
						arg.getError().add("Inappropriate ';' separator");
					}
					else {
						semiIndex = i;
					}
				}
			}
			if (isIterate) {
				IterateExp iterateExp = refreshExpression(IterateExp.class, PivotPackage.Literals.ITERATE_EXP, csElement);
//				converter.referenceElement(csElement.getOwnedIterator());
				return iterateExp;
			}
			else if (isIterator) {
				IteratorExp iteratorExp = refreshExpression(IteratorExp.class, PivotPackage.Literals.ITERATOR_EXP, csElement);
				return iteratorExp;
			}
			else if (isOperation) {
				OperationCallExp operationExp = refreshExpression(OperationCallExp.class, PivotPackage.Literals.OPERATION_CALL_EXP, csElement);
				converter.refreshName(operationExp, namedElement.getName());
				operationExp.setSource((OclExpression) csNavigationOperator.getLeft().getPivot());
//				converter.referenceElements(arguments);
				return operationExp;
			}
			else {
				namedExp.getError().add("Operation name expected");
				return null;
			}
		}

		@Override
		public Element caseNavigationOperatorCS(NavigationOperatorCS csOperator) {
			@SuppressWarnings("unused")
			OclExpression leftElement = converter.referenceElement(OclExpression.class, csOperator.getLeft());
			OclExpression rightElement = converter.referenceElement(OclExpression.class, csOperator.getRight());
			return rightElement;
		}

		@Override
		public Element caseNestedExpCS(NestedExpCS csElement) {
			OclExpression pivotElement = converter.referenceElement(OclExpression.class, csElement.getSource());
			converter.installPivotElement(csElement, pivotElement);
			return pivotElement;
		}

		@Override
		public Element caseNullLiteralExpCS(NullLiteralExpCS csElement) {
			NullLiteralExp expression = refreshExpression(NullLiteralExp.class, PivotPackage.Literals.NULL_LITERAL_EXP, csElement);
			converter.queueResolver(csElement);
			return expression;
		}

		@Override
		public Element caseNumberLiteralExpCS(NumberLiteralExpCS csElement) {
			Number number = csElement.getName();
			if (number instanceof BigDecimal) {
				RealLiteralExp expression = refreshExpression(RealLiteralExp.class, PivotPackage.Literals.REAL_LITERAL_EXP, csElement);
				expression.setRealSymbol((BigDecimal) number);
				converter.queueResolver(csElement);
				return expression;
			}
			else {
				BigInteger bigInteger = (BigInteger) number;
				if (bigInteger.signum() < 0) {
					IntegerLiteralExp expression = refreshExpression(IntegerLiteralExp.class, PivotPackage.Literals.INTEGER_LITERAL_EXP, csElement);
					expression.setIntegerSymbol(bigInteger);
					converter.queueResolver(csElement);
					return expression;
				}
				else {
					UnlimitedNaturalLiteralExp expression = refreshExpression(UnlimitedNaturalLiteralExp.class, PivotPackage.Literals.UNLIMITED_NATURAL_LITERAL_EXP, csElement);
					expression.setSymbol(bigInteger);
					converter.queueResolver(csElement);
					return expression;
				}
			}
		}

		@Override
		public Element casePrefixExpCS(PrefixExpCS csElement) {
			initializePrefixOperators(csElement, null);
			OperationCallExp pivotElement = converter.referenceElement(OperationCallExp.class, csElement.getOwnedOperator().get(0));
			converter.installPivotElement(csElement, pivotElement);
			converter.queueResolver(csElement);
			return pivotElement;
		}

		@Override
		public Element caseSelfExpCS(SelfExpCS csElement) {
			VariableExp expression = refreshExpression(VariableExp.class, PivotPackage.Literals.VARIABLE_EXP, csElement);
//			expression.setReferredVariable("self");
			converter.queueResolver(csElement);
			return expression;
		}

		@Override
		public Element caseStringLiteralExpCS(StringLiteralExpCS csElement) {
			StringLiteralExp expression = refreshExpression(StringLiteralExp.class, PivotPackage.Literals.STRING_LITERAL_EXP, csElement);
			expression.setStringSymbol(StringUtils.splice(csElement.getName(), ""));
			converter.queueResolver(csElement);
			return expression;
		}

		@Override
		public Element caseUnaryOperatorCS(UnaryOperatorCS csOperator) {
			OperationCallExp expression = refreshExpression(OperationCallExp.class, PivotPackage.Literals.OPERATION_CALL_EXP, csOperator);
			converter.refreshName(expression, csOperator.getName());
			OclExpression childElement = converter.referenceElement(OclExpression.class, csOperator.getChild());
			expression.setSource(childElement);
			return expression;
		}

		@Override
		public Element caseVariableCS(VariableCS csElement) {
			Variable pivotElement = converter.refreshMonikeredElement(Variable.class,
				PivotPackage.Literals.VARIABLE, csElement.getMoniker());
			converter.installPivotElement(csElement, pivotElement);
			converter.refreshName(pivotElement, csElement.getName());
			converter.referenceElement(csElement.getOwnedType());
			pivotElement.setInitExpression(converter.referenceElement(OclExpression.class, csElement.getInitExpression()));
			converter.queueResolver(csElement);	// For type
			return pivotElement;
		}

		protected OperatorCS[] createInfixOperatorTree(InfixExpCS csElement) {
			//
			//	Create the per-precedence list of operator indexes, and a
			//	highest precedence first list of all used infix precedences.
			//
			Map<Precedence, List<Integer>> precedenceToOperatorIndex = createInfixPrecedenceMap(csElement);
			List<Precedence> sortedPrecedences = pivotManager.getSortedPrecedences(precedenceToOperatorIndex.keySet());
			OperatorCS[] csParents = new OperatorCS[csElement.getOwnedExpression().size()];
			List<BinaryOperatorCS> operators = csElement.getOwnedOperator();
			for (Precedence precedence : sortedPrecedences) {
				// null precedence arises when precedence or operation-to-precedence is wrong
				boolean isLeft = precedence == null || (precedence.getAssociativity() == AssociativityKind.LEFT);
				List<Integer> equiPrecedenceOperatorIndexes = precedenceToOperatorIndex.get(precedence);
				int equiPrecedenceOperatorCount = equiPrecedenceOperatorIndexes.size();
				int iFirst = isLeft ? 0 : equiPrecedenceOperatorCount-1;
				int iIndex = isLeft ? 1 : -1;
				int iLast = isLeft ? equiPrecedenceOperatorCount : -1;
				for (int i = iFirst; i != iLast; i += iIndex) {
					int operatorIndex = equiPrecedenceOperatorIndexes.get(i);
					BinaryOperatorCS csOperator = operators.get(operatorIndex);
//					OperationCallExp pivotElement = converter.refreshMonikeredElement(OperationCallExp.class, PivotPackage.Literals.OPERATION_CALL_EXP, csOperator);
//					converter.refreshName(pivotElement, csOperator.getName());
//					OperationCallExp pivotElement = PivotFactory.eINSTANCE.createOperationCallExp();
//					pivotElement.setName(csOperator.getName());
					OperatorCS csLeftRoot = csParents[operatorIndex];
					if (csLeftRoot == null) {
						csParents[operatorIndex] = csOperator;
					}
					else {
						while (csLeftRoot.getParent() != null) {
							csLeftRoot = csLeftRoot.getParent();
						}
						csLeftRoot.setParent(csOperator);
						csOperator.setLeft(csLeftRoot);
//						pivotElement.setSource((OclExpression) csLeftRoot.getPivot());
					}
					OperatorCS csRightRoot = csParents[operatorIndex+1];
					if (csRightRoot == null) {
						csParents[operatorIndex+1] = csOperator;
					}
					else {
						while (csRightRoot.getParent() != null) {
							csRightRoot = csRightRoot.getParent();
						}
						csRightRoot.setParent(csOperator);
						csOperator.setRight(csRightRoot);
//						pivotElement.getArguments().add((OclExpression) csRightRoot.getPivot());
					}					
				}
			}
			return csParents;
		}

		protected Map<Precedence, List<Integer>> createInfixPrecedenceMap(InfixExpCS csElement) {
			List<ExpCS> csExpressions = csElement.getOwnedExpression();
			List<BinaryOperatorCS> operators = csElement.getOwnedOperator();
			int operatorCount = operators.size();
			Map<Precedence, List<Integer>> precedenceToOperatorIndex = new HashMap<Precedence, List<Integer>>();
			for (int i = 0; i < operatorCount; i++) {
				BinaryOperatorCS csOperator = operators.get(i);
				String operator = csOperator.getName();
				Precedence precedence = pivotManager.getInfixPrecedence(operator);
				List<Integer> opList = precedenceToOperatorIndex.get(precedence);
				if (opList == null) {
					opList = new ArrayList<Integer>();
					precedenceToOperatorIndex.put(precedence, opList);
				}
				opList.add(i);
				csOperator.setLeft(csExpressions.get(i));
				csOperator.setRight(csExpressions.get(i+1));
			}
			return precedenceToOperatorIndex;
		}

		@Override
		public Element defaultCase(EObject csElement) {
			return baseSwitch.doSwitch(csElement);
		}

		public Element doInPackageSwitch(EObject csElement) {
			int classifierID = csElement.eClass().getClassifierID();
			return doSwitch(classifierID, csElement);
		}

		@Override
		public Element doSwitch(EObject csElement) {
			return baseSwitch.doSwitch(csElement);
		}

/*		public Element getParentPivotElement(ElementCS csElement) {
			for (EObject eObject = csElement; eObject != null; eObject = eObject.eContainer()) {
				if (eObject instanceof ModelElementCS) {
					Element pivotElement = ((ModelElementCS)eObject).getPivot();
					if (pivotElement != null) {
						return pivotElement;
					}
				}
			}
			return null;
		} */

		protected void initializePrefixOperators(PrefixExpCS prefixExpCS, OperatorCS csParent) {
			for (UnaryOperatorCS csUnaryOperator : prefixExpCS.getOwnedOperator()) {
				if (csParent instanceof UnaryOperatorCS) {
					UnaryOperatorCS csUnaryParent = (UnaryOperatorCS)csParent;
					csUnaryParent.setChild(csUnaryOperator);
				}
				else if (csParent instanceof BinaryOperatorCS) {
					BinaryOperatorCS csBinaryParent = (BinaryOperatorCS)csParent;
					if (csBinaryParent.getLeft() == prefixExpCS) {
						csBinaryParent.setLeft(csUnaryOperator);
					}
					else {
						csBinaryParent.setRight(csUnaryOperator);
					}
				}
				csUnaryOperator.setParent(csParent);
				csUnaryOperator.setChild(prefixExpCS.getOwnedExpression());
				csParent = csUnaryOperator;
			}
		}

		protected void interleavePrefixes(InfixExpCS csElement, OperatorCS[] csParents) {
			List<ExpCS> csExpressions = csElement.getOwnedExpression();
			int expressionCount = csExpressions.size();
			for (int i = 0; i < expressionCount; i++) {
				ExpCS csExp = csExpressions.get(i);
				if (csExp instanceof PrefixExpCS) {
					PrefixExpCS prefixExpCS = (PrefixExpCS)csExp;
					OperatorCS csParent = csParents[i];
					initializePrefixOperators(prefixExpCS, csParent);			
					for (UnaryOperatorCS csUnaryOperator : prefixExpCS.getOwnedOperator()) {
						interleaveUnaryOperator(csUnaryOperator);
					}			
				}
			}
		}
		
		protected void interleaveUnaryOperator(UnaryOperatorCS csOperator) {
			OperatorCS csParent = csOperator.getParent();
			ExpCS csExp = csOperator.getChild();
			if (csParent instanceof BinaryOperatorCS) {
				Precedence parentPrecedence = pivotManager.getInfixPrecedence(csParent.getName());
				Precedence unaryPrecedence = pivotManager.getPrefixPrecedence(csOperator.getName());
				if (parentPrecedence.getOrder().compareTo(unaryPrecedence.getOrder()) < 0) {
					OperatorCS csGrandParent = csParent.getParent();
					if (csExp == ((BinaryOperatorCS) csParent).getLeft()) {
						if (csGrandParent instanceof BinaryOperatorCS) {
							if (((BinaryOperatorCS) csGrandParent).getLeft() == csParent) {
								((BinaryOperatorCS) csGrandParent).setLeft(csOperator);
							}
							else {
								((BinaryOperatorCS) csGrandParent).setRight(csOperator);
							}
						}
						else {
							((UnaryOperatorCS) csGrandParent).setChild(csOperator);
						}
						csParent.setParent(csOperator);
						csOperator.setChild(csParent);
						((BinaryOperatorCS) csParent).setLeft(csExp);
					}
					else if (csExp == ((BinaryOperatorCS) csParent).getRight()) {
						if (csGrandParent instanceof BinaryOperatorCS) {
							if (((BinaryOperatorCS) csGrandParent).getLeft() == csParent) {
								((BinaryOperatorCS) csGrandParent).setLeft(csExp);
								csGrandParent.setParent(csOperator);
								csOperator.setChild(csGrandParent);
							}
						}
					}
				}
			}
		}
		
		public <T extends OclExpression> T refreshExpression(Class<T> pivotClass, EClass pivotEClass, ExpCS csElement) {
			assert pivotClass == pivotEClass.getInstanceClass();
			Element pivotElement = csElement.getPivot();
			if ((pivotElement == null) || (pivotElement.eClass() != pivotEClass)) {
				logger.trace("Creating " + pivotEClass.getName()); //$NON-NLS-1$
				pivotElement = (Element) PivotFactory.eINSTANCE.create(pivotEClass);
			}
			else {
				logger.trace("Reusing " + pivotEClass.getName()); //$NON-NLS-1$
			}
			if (!pivotClass.isAssignableFrom(pivotElement.getClass())) {
				throw new ClassCastException();
			}

			converter.installPivotElement(csElement, pivotElement);
			
/*			String csClassName = csElement.eClass().getName();
			logger.trace("Installing " + csClassName); //$NON-NLS-1$
			EObject oldPivotElement = csElement.getPivot();
			if (oldPivotElement == null) {
				csElement.setPivot(pivotElement);
			} else if (oldPivotElement != pivotElement) {
				if (oldPivotElement.eResource() != null) {
					logger.warn("Conflicting pivot element for " + csClassName); //$NON-NLS-1$ //$NON-NLS-2$
				}
				else {
					csElement.setPivot(pivotElement);
				}
			} else {
//				logger.info("Duplicate pivot element for " + csClassName + " : " + moniker); //$NON-NLS-1$ //$NON-NLS-2$
			} */
			@SuppressWarnings("unchecked")
			T castElement = (T) pivotElement;
//			refreshTemplateSignature1(castElement, csElement, true);
//			converter.queueResolver(csElement);
			return castElement;
		}
	}
	
	public class ResolutionPass extends EssentialOCLCSTSwitch<Element> implements CS2Pivot.Switch.Pass
	{	
		protected final BaseCS2PivotSwitch.ResolutionPass baseSwitch;
		
		public ResolutionPass() {
			baseSwitch = (BaseCS2PivotSwitch.ResolutionPass) converter.getSwitch(BaseCS2PivotSwitch.FACTORY).getResolutionPass();
		}

		@Override
		public Element caseExpCS(ExpCS csElement) {
			OclExpression pivotElement = converter.getPivotElement(OclExpression.class, csElement);
			converter.resolveType(pivotElement);
			return null;
		}

		@Override
		public Element caseInfixExpCS(InfixExpCS csElement) {
			OperationCallExp pivotElement = converter.getPivotElement(OperationCallExp.class, csElement);
			converter.resolveOperationCall(pivotElement);
			return null;
		}

		@Override
		public Element caseNameExpCS(NameExpCS csElement) {
			Element pivotElement = converter.getPivotElement(Element.class, csElement);
			if (pivotElement instanceof VariableExp) {
				VariableExp expression = (VariableExp) pivotElement;
				expression.setType(expression.getReferredVariable().getType());
				return expression;
			}
			else if (pivotElement instanceof PropertyCallExp) {
				PropertyCallExp expression = (PropertyCallExp) pivotElement;
				expression.setType(expression.getReferredProperty().getType());
				return expression;
			}
			else {
				logger.warn("Unsupported NameExpCS " + pivotElement.eClass().getName());		// FIXME
				return null;
			}
		}

		@Override
		public Element casePrefixExpCS(PrefixExpCS csElement) {
			OperationCallExp pivotElement = converter.getPivotElement(OperationCallExp.class, csElement);
			converter.resolveOperationCall(pivotElement);
			return null;
		}

		@Override
		public Element caseVariableCS(VariableCS csElement) {
			Variable pivotElement = converter.getPivotElement(Variable.class, csElement);
			if (pivotElement != null) {
				TypeRefCS csType = csElement.getOwnedType();
				Type pivotType = converter.getPivotElement(Type.class, csType);
				if (pivotType == null) {
					String typeMoniker = csType.getMoniker();
					pivotType = converter.getPivotElement(Type.class, typeMoniker);
				}
				if (pivotType != pivotElement.getType()) {
					pivotElement.setType(pivotType);
				}
				converter.resolveElement(csType);
			}
			return null;
		}

		@Override
		public Element defaultCase(EObject csElement) {
			return baseSwitch.doSwitch(csElement);
		}

		public Element doInPackageSwitch(EObject csElement) {
			int classifierID = csElement.eClass().getClassifierID();
			return doSwitch(classifierID, csElement);
		}

		@Override
		public Element doSwitch(EObject csElement) {
			EClass eClass = csElement.eClass();
			return doSwitch(eClass, csElement);
		}
	}
		
	protected final CS2Pivot converter;
	protected final PivotManager pivotManager;
	protected final Pass declaration;
	protected final DefinitionPass definition;
	protected final ReferencePass reference;
	protected final ResolutionPass resolution;
	
	public EssentialOCLCS2PivotSwitch(CS2Pivot converter) {
		this.converter = converter;
		this.pivotManager = converter.getPivotManager();
		this.declaration = new DeclarationPass();
		this.definition = new DefinitionPass();
		this.reference =  new ReferencePass();
		this.resolution = new ResolutionPass();
	}

	public Pass getDeclarationPass() {
		return declaration;
	}

	public DefinitionPass getDefinitionPass() {
		return definition;
	}

	public ReferencePass getReferencePass() {
		return reference;
	}	

	public ResolutionPass getResolutionPass() {
		return resolution;
	}	
}
