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
 * $Id: EssentialOCLLeft2RightVisitor.java,v 1.1.2.1 2010/12/13 08:15:02 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.AssociativityKind;
import org.eclipse.ocl.examples.pivot.BooleanLiteralExp;
import org.eclipse.ocl.examples.pivot.CollectionItem;
import org.eclipse.ocl.examples.pivot.CollectionKind;
import org.eclipse.ocl.examples.pivot.CollectionLiteralExp;
import org.eclipse.ocl.examples.pivot.CollectionLiteralPart;
import org.eclipse.ocl.examples.pivot.CollectionRange;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.IfExp;
import org.eclipse.ocl.examples.pivot.IntegerLiteralExp;
import org.eclipse.ocl.examples.pivot.InvalidLiteralExp;
import org.eclipse.ocl.examples.pivot.IteratorKind;
import org.eclipse.ocl.examples.pivot.LetExp;
import org.eclipse.ocl.examples.pivot.MonikeredElement;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.NullLiteralExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Precedence;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.PropertyCallExp;
import org.eclipse.ocl.examples.pivot.RealLiteralExp;
import org.eclipse.ocl.examples.pivot.StringLiteralExp;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypeExp;
import org.eclipse.ocl.examples.pivot.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.VariableDeclaration;
import org.eclipse.ocl.examples.pivot.VariableExp;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil.PrecedenceComparator;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedRefCS;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.BaseLeft2RightVisitor;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeCSAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BinaryOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BooleanLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralPartCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionTypeCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ContextCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpConstraintCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.IfExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.IndexExpCS;
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
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TypeLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.UnaryOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.UnlimitedNaturalLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.VariableCS;
import org.eclipse.ocl.examples.xtext.essentialocl.util.AbstractExtendingDelegatingEssentialOCLCSVisitor;

public class EssentialOCLLeft2RightVisitor
	extends AbstractExtendingDelegatingEssentialOCLCSVisitor<MonikeredElement, CS2PivotConversion, BaseLeft2RightVisitor>
{
	private static final Logger logger = Logger.getLogger(EssentialOCLLeft2RightVisitor.class);

	protected final PivotManager pivotManager;
	
	public EssentialOCLLeft2RightVisitor(CS2PivotConversion context) {
		super(new BaseLeft2RightVisitor(context), context);
		this.pivotManager = context.getPivotManager();
	}

	public void addError(ModelElementCS csElement, String message) {
		csElement.getError().add(message);
	}

	/**
	 * Establish the parent-{source,argument} relationships between all infix
	 * operators in accordance with the precedence and associativity configuration.
	 */
	protected void createInfixOperatorTree(InfixExpCS csInfix) {
		//
		//	Create the per-precedence list of operator indexes, and a
		//	highest precedence first list of all used infix precedences.
		//
		Map<Precedence, List<Integer>> precedenceToOperatorIndexes = createInfixPrecedenceToOperatorIndexesMap(csInfix);
		List<Precedence> sortedPrecedences = new ArrayList<Precedence>(precedenceToOperatorIndexes.keySet());
		Collections.sort(sortedPrecedences, PrecedenceComparator.INSTANCE);
		//
		//	Build the tree leaf-to root precedence at a time.
		//
		List<ExpCS> csExpressions = csInfix.getOwnedExpression();
		List<BinaryOperatorCS> csOperators = csInfix.getOwnedOperator();
		for (Precedence precedence : sortedPrecedences) {
			// null precedence arises when precedence or operation-to-precedence is wrong
			boolean isLeft = precedence == null || (precedence.getAssociativity() == AssociativityKind.LEFT);
			List<Integer> operatorIndexes = precedenceToOperatorIndexes.get(precedence);
			int operatorCount = operatorIndexes.size();
			int iFirst = isLeft ? 0 : operatorCount-1;
			int iIndex = isLeft ? 1 : -1;
			int iLast = isLeft ? operatorCount : -1;
			for (int i = iFirst; i != iLast; i += iIndex) {
				int operatorIndex = operatorIndexes.get(i);
				BinaryOperatorCS csOperator = csOperators.get(operatorIndex);
				//
				//	Establish parent-child relationship of operator source
				//
				ExpCS csSource = csExpressions.get(operatorIndex);
//				if (csSource instanceof NamedExpCS) {
//					csSource = ((NamedExpCS)csSource).getSimpleNamedExp();
//				}
				while ((csSource.getParent() != null) && (csSource.getParent() != csOperator)) {
					csSource = csSource.getParent();
				}
				csSource.setParent(csOperator);
				csOperator.setSource(csSource);
				//
				//	Establish parent-child relationship of operator argument
				//
				ExpCS csArgument = csExpressions.get(operatorIndex+1);
//				if (csArgument instanceof NamedExpCS) {
//					csArgument = ((NamedExpCS)csArgument).getSimpleNamedExp();
//				}
				while ((csArgument.getParent() != null) && (csArgument.getParent() != csOperator)) {
					csArgument = csArgument.getParent();
				}
				csArgument.setParent(csOperator);
				csOperator.setArgument(csArgument);
			}
		}
	}

	/**
	 * Return a map of operator indexes for each used precedence.
	 */
	protected Map<Precedence, List<Integer>> createInfixPrecedenceToOperatorIndexesMap(InfixExpCS csInfix) {
		List<BinaryOperatorCS> csOperators = csInfix.getOwnedOperator();
		int operatorCount = csOperators.size();
		Map<Precedence, List<Integer>> precedenceToOperatorIndex = new HashMap<Precedence, List<Integer>>();
		for (int operatorIndex = 0; operatorIndex < operatorCount; operatorIndex++) {
			BinaryOperatorCS csOperator = csOperators.get(operatorIndex);
			Precedence precedence = pivotManager.getInfixPrecedence(csOperator.getName());
			List<Integer> indexesList = precedenceToOperatorIndex.get(precedence);
			if (indexesList == null) {
				indexesList = new ArrayList<Integer>();
				precedenceToOperatorIndex.put(precedence, indexesList);
			}
			indexesList.add(operatorIndex);
		}
		return precedenceToOperatorIndex;
	}

	private Parameter getParameter(Operation operation, IteratorKind kind, int number) {
		int i = 0;
		for (Parameter parameter : operation.getOwnedParameters()) {
			IteratorKind iteratorKind = parameter.getIteratorKind();
			if (iteratorKind == kind) {
				if (i == number) {
					return parameter;
				}
				i++;
			}
		}
		return null;
	}

	protected PropertyCallExp handlePropertyCallExp(NameExpCS csNameExp, Property property) {
		PropertyCallExp expression = context.refreshExpression(PropertyCallExp.class, PivotPackage.Literals.PROPERTY_CALL_EXP, csNameExp);
		expression.setReferredProperty(property);
		context.setType(expression, property.getType());		// FIXME resolve template parameter
		return expression;
	}

	protected VariableExp handleVariableExp(NameExpCS csNameExp, VariableDeclaration variableDeclaration) {
		VariableExp expression = context.refreshExpression(VariableExp.class, PivotPackage.Literals.VARIABLE_EXP, csNameExp);
		expression.setReferredVariable(variableDeclaration);
		context.setType(expression, variableDeclaration.getType());
		return expression;
	}

	protected void initializePrefixOperators(PrefixExpCS prefixExpCS, OperatorCS csParent) {
		for (UnaryOperatorCS csUnaryOperator : prefixExpCS.getOwnedOperator()) {
			if (csParent instanceof UnaryOperatorCS) {
				csParent.setSource(csUnaryOperator);
			}
			else if (csParent instanceof BinaryOperatorCS) {
				if (csParent.getSource() == prefixExpCS) {
					csParent.setSource(csUnaryOperator);
				}
				else {
					((BinaryOperatorCS) csParent).setArgument(csUnaryOperator);
				}
			}
			csUnaryOperator.setParent(csParent);
			ExpCS csChild = prefixExpCS.getOwnedExpression();
//			if (csChild instanceof NamedExpCS) {
//				csChild = ((NamedExpCS)csChild).getSimpleNamedExp();
//			}
			csUnaryOperator.setSource(csChild);
			csChild.setParent(csUnaryOperator);
			csParent = csUnaryOperator;
		}
	}

	protected void installInfixPivotElement(OperatorCS csOperator) {
		ExpCS csSource = csOperator.getSource();
//		if (csSource != null) {
//			if (csSource instanceof NamedExpCS) {
//				csSource = ((NamedExpCS)csSource).getSimpleNamedExp();
//			}
//			csSource.setParent(csOperator);
//		}
//		if (csOperator instanceof BinaryOperatorCS) {
//			ExpCS csArgument = ((BinaryOperatorCS) csOperator).getArgument();
//			if (csArgument != null) {
//				if (csArgument instanceof NamedExpCS) {
//					csArgument = ((NamedExpCS)csArgument).getSimpleNamedExp();
//				}
//				csArgument.setParent(csOperator);
//			}
//		}						
		if (csOperator instanceof NavigationOperatorCS) {
			NavigationOperatorCS csNavigationOperator = (NavigationOperatorCS) csOperator;
			OperationCallExp pivotElement = PivotUtil.getPivot(OperationCallExp.class, csNavigationOperator.getArgument());
			context.installPivotElement(csNavigationOperator, pivotElement);
			return;
		}
		OperationCallExp pivotElement = PivotUtil.getPivot(OperationCallExp.class, csOperator);
		if (csSource != null) {
			OclExpression pivotChild = PivotUtil.getPivot(OclExpression.class, csSource);
			pivotElement.setSource(pivotChild);
		}
		if (csOperator instanceof BinaryOperatorCS) {
			ExpCS csArgument = ((BinaryOperatorCS) csOperator).getArgument();
			if (csArgument != null) {
				OclExpression pivotRight = PivotUtil.getPivot(OclExpression.class, csArgument);
				pivotElement.getArguments().add(pivotRight);
			}
		}
		Operation operation = context.resolveOperationCall(pivotElement);
		if (operation == null) {
			addError(csOperator, "Failed to resolve " + pivotElement);
		}
		pivotElement.setReferredOperation(operation);
		if (operation != null) {
			context.setType(pivotElement, operation.getType());
		}
	}

	protected void interleavePrefixes(InfixExpCS csElement) {
		for (ExpCS csExp : csElement.getOwnedExpression()) {
			if (csExp instanceof PrefixExpCS) {
				PrefixExpCS prefixExpCS = (PrefixExpCS)csExp;
				OperatorCS csExpressionParent = prefixExpCS.getParent();
				initializePrefixOperators(prefixExpCS, csExpressionParent);			
				for (UnaryOperatorCS csUnaryOperator : prefixExpCS.getOwnedOperator()) {
					interleaveUnaryOperator(csUnaryOperator);
				}			
			}
		}
	}
	
	protected void interleaveUnaryOperator(UnaryOperatorCS csOperator) {
		OperatorCS csParent = csOperator.getParent();
		ExpCS csExp = csOperator.getSource();
		if (csParent instanceof BinaryOperatorCS) {
			Precedence parentPrecedence = pivotManager.getInfixPrecedence(csParent.getName());
			Precedence unaryPrecedence = pivotManager.getPrefixPrecedence(csOperator.getName());
			if (parentPrecedence.getOrder().compareTo(unaryPrecedence.getOrder()) < 0) {
				OperatorCS csGrandParent = csParent.getParent();
				if (csExp == csParent.getSource()) {
					if (csGrandParent instanceof BinaryOperatorCS) {
						if (csGrandParent.getSource() == csParent) {
							csGrandParent.setSource(csOperator);
						}
						else {
							((BinaryOperatorCS) csGrandParent).setArgument(csOperator);
						}
					}
					else {
						csGrandParent.setSource(csOperator);
					}
					csParent.setParent(csOperator);
					csOperator.setSource(csParent);
					((BinaryOperatorCS) csParent).setSource(csExp);
				}
				else if (csExp == ((BinaryOperatorCS) csParent).getArgument()) {
					if (csGrandParent instanceof BinaryOperatorCS) {
						if (csGrandParent.getSource() == csParent) {
							csGrandParent.setSource(csExp);
							csGrandParent.setParent(csOperator);
							csOperator.setSource(csGrandParent);
						}
					}
				}
			}
		}
	}
	  
	@Override
	public MonikeredElement visitBinaryOperatorCS(BinaryOperatorCS csBinaryOperator) {
		OperationCallExp expression = context.refreshExpression(OperationCallExp.class, PivotPackage.Literals.OPERATION_CALL_EXP, csBinaryOperator);
		context.refreshName(expression, csBinaryOperator.getName());
		return expression;
	}

	@Override
	public MonikeredElement visitBooleanLiteralExpCS(BooleanLiteralExpCS csBooleanLiteralExp) {
		BooleanLiteralExp expression = context.refreshExpression(BooleanLiteralExp.class, PivotPackage.Literals.BOOLEAN_LITERAL_EXP, csBooleanLiteralExp);
		expression.setBooleanSymbol(Boolean.valueOf(csBooleanLiteralExp.getName()));
		expression.setType(pivotManager.getBooleanType());
		return expression;
	}

	@Override
	public MonikeredElement visitCollectionLiteralExpCS(CollectionLiteralExpCS csCollectionLiteralExp) {
		CollectionLiteralExp expression = context.refreshExpression(CollectionLiteralExp.class, PivotPackage.Literals.COLLECTION_LITERAL_EXP, csCollectionLiteralExp);
		Type commonType = null;
		for (CollectionLiteralPartCS csPart : csCollectionLiteralExp.getOwnedParts()) {
			CollectionLiteralPart pivotPart = context.refreshExpTree(CollectionLiteralPart.class, csPart);
			Type type = pivotPart.getType();
			if (commonType == null) {
				commonType = type;
			}
			else {
				commonType = pivotManager.getCommonSuperType(commonType, type);
			}
		}
		context.refreshPivotList(CollectionLiteralPart.class, expression.getParts(), csCollectionLiteralExp.getOwnedParts());
		CollectionTypeCS ownedCollectionType = csCollectionLiteralExp.getOwnedType();
		TypedRefCS ownedElementType = ownedCollectionType.getOwnedType();
		if (ownedElementType != null) {
			commonType = (Type) ownedElementType.getPivot();
		}
		String collectionTypeName = ownedCollectionType.getName();
		Type type = pivotManager.getLibraryType(collectionTypeName, Collections.singletonList(commonType));
		context.setType(expression, type);
		if (pivotManager.conformsTo(type, pivotManager.getBagType())) {
			expression.setKind(CollectionKind.BAG);
		}
		else if (pivotManager.conformsTo(type, pivotManager.getOrderedSetType())) {
			expression.setKind(CollectionKind.ORDERED_SET);
		}
		else if (pivotManager.conformsTo(type, pivotManager.getSequenceType())) {
			expression.setKind(CollectionKind.SEQUENCE);
		}
		else if (pivotManager.conformsTo(type, pivotManager.getSetType())) {
			expression.setKind(CollectionKind.SET);
		}
		return expression;
	}

	@Override
	public MonikeredElement visitCollectionLiteralPartCS(CollectionLiteralPartCS csCollectionLiteralPart) {
		ExpCS csFirst = csCollectionLiteralPart.getExpressionCS();
		OclExpression pivotFirst = context.refreshExpTree(OclExpression.class, csFirst);
		ExpCS csLast = csCollectionLiteralPart.getLastExpressionCS();
		if (csLast == null) {
			CollectionItem expression = context.refreshMonikeredElement(CollectionItem.class, PivotPackage.Literals.COLLECTION_ITEM, csCollectionLiteralPart);	
			context.installPivotElement(csCollectionLiteralPart, expression);
			expression.setItem(pivotFirst);
		}
		else {
			CollectionRange expression = context.refreshMonikeredElement(CollectionRange.class, PivotPackage.Literals.COLLECTION_RANGE, csCollectionLiteralPart);
			context.installPivotElement(csCollectionLiteralPart, expression);
			expression.setFirst(pivotFirst);
			OclExpression pivotLast = context.refreshExpTree(OclExpression.class, csLast);
			expression.setLast(pivotLast);
		}
		Type type = pivotFirst.getType();
		if (csLast != null) {
			OclExpression pivotLast = PivotUtil.getPivot(OclExpression.class, csLast);
			Type secondType = pivotLast.getType();
			type = pivotManager.getCommonSuperType(type, secondType);
		}
		CollectionLiteralPart expression = PivotUtil.getPivot(CollectionLiteralPart.class, csCollectionLiteralPart);
		context.setType(expression, type);
		return expression;
	}

	@Override
	public MonikeredElement visitCollectionTypeCS(CollectionTypeCS object) {
		return null;
	}

	@Override
	public MonikeredElement visitContextCS(ContextCS csContext) {
		ExpressionInOcl pivotElement = context.refreshMonikeredElement(ExpressionInOcl.class,
			PivotPackage.Literals.EXPRESSION_IN_OCL, csContext);
		context.installPivotElement(csContext, pivotElement);
		ExpCS csExpression = csContext.getOwnedExpression();
		OclExpression expression = context.refreshExpTree(OclExpression.class, csExpression);
		pivotElement.setBodyExpression(expression);
		context.setType(pivotElement, expression.getType());
		return pivotElement;
	}

	@Override
	public MonikeredElement visitExpCS(ExpCS object) {
		return null;
	}

	@Override
	public MonikeredElement visitExpConstraintCS(ExpConstraintCS csExpConstraint) {
		ExpCS csExpression = csExpConstraint.getOwnedExpression();
		if (csExpression == null) {
			return null;
		}
		Constraint constraint = PivotUtil.getPivot(Constraint.class, csExpConstraint);
		OclExpression expression = context.refreshExpTree(OclExpression.class, csExpression);
		ExpressionInOcl specification = (ExpressionInOcl) constraint.getSpecification();
		specification.setBodyExpression(expression);
		return expression;
	}

	@Override
	public MonikeredElement visitIfExpCS(IfExpCS csIfExp) {
		IfExp expression = context.refreshExpression(IfExp.class, PivotPackage.Literals.IF_EXP, csIfExp);
		expression.setCondition(context.refreshExpTree(OclExpression.class, csIfExp.getCondition()));
		expression.setThenExpression(context.refreshExpTree(OclExpression.class, csIfExp.getThenExpression()));
		expression.setElseExpression(context.refreshExpTree(OclExpression.class, csIfExp.getElseExpression()));
		return expression;
	}

	@Override
	public MonikeredElement visitIndexExpCS(IndexExpCS csIndexExp) {
		// Navigating completions are orchestrated by the SimpleNamedExpCS.
		return null;
	}

	@Override
	public MonikeredElement visitInfixExpCS(InfixExpCS csInfixExp) {
		// FIXME special case trivial expressions
		//
		//	Establish the Infix tree and the per leaf expression parent operator.
		//
		createInfixOperatorTree(csInfixExp);			
		//
		//	Interleave the Prefix Operators.
		//
		interleavePrefixes(csInfixExp);
		//
		//	Build the tree left to right.
		//
		List<ExpCS> csExpressions = csInfixExp.getOwnedExpression();
		List<BinaryOperatorCS> csOperators = csInfixExp.getOwnedOperator();
		int iMax = csOperators.size();
		context.refreshExpTree(OclExpression.class, csExpressions.get(0));
		for (int i = 0; i < iMax; i++) {
			BinaryOperatorCS csOperator = csOperators.get(i);
			context.refreshExpTree(OclExpression.class, csOperator);
//			if (!(csOperator instanceof NavigationOperatorCS)) {
				context.refreshExpTree(OclExpression.class, csExpressions.get(i+1));
//			}
		}
		//
		for (OperatorCS csOperator :  csOperators) {
			installInfixPivotElement(csOperator);
		}
		//
		//	Map the infix CS to the root of the AS tree.
		//
		ExpCS csRoot = csOperators.get(0);
		for (ExpCS csParent = csRoot.getParent(); csParent != null; csParent = csRoot.getParent()) {
			csRoot = csParent;
		}
		OclExpression pivot = PivotUtil.getPivot(OclExpression.class, csRoot);
		context.installPivotElement(csInfixExp, pivot);
		return pivot;
	}

	@Override
	public MonikeredElement visitInvalidLiteralExpCS(InvalidLiteralExpCS csInvalidLiteralExp) {
		InvalidLiteralExp expression = pivotManager.createInvalidValue(csInvalidLiteralExp, null, "invalid literal", null);
		context.installPivotElement(csInvalidLiteralExp, expression);
		return expression;
	}

	@Override
	public MonikeredElement visitLetExpCS(LetExpCS csLetExp) {
		// Each CS Let Variable becomes a Pivot LetExpression and Variable
		// The CS Let therefore just re-uses the Pivot of the first CS Let Variable
		String baseMoniker = csLetExp.getMoniker();
		List<LetVariableCS> csLetVariables = csLetExp.getVariable();
		int iMax = csLetVariables.size();
		LetExp firstLetExp = null;
		LetExp lastLetExp = null;
		for (int i = 0; i < iMax; i++) {
			LetVariableCS csLetVariable = csLetVariables.get(i);
			String letMoniker = baseMoniker + "_" + i;
			LetExp letExp = context.refreshMonikeredElement(LetExp.class,
				PivotPackage.Literals.LET_EXP, letMoniker);
			Variable variable = context.refreshNamedElement(Variable.class,
				PivotPackage.Literals.VARIABLE, csLetVariable);
			letExp.setVariable(variable);		
			ExpCS csInitExpression = csLetVariable.getInitExpression();
			OclExpression initExpression = context.refreshExpTree(OclExpression.class, csInitExpression);
			variable.setInitExpression(initExpression);
			Type initType = initExpression != null ? initExpression.getType() : null;
			TypedRefCS csVariableType = csLetVariable.getOwnedType();
			Type variableType = csVariableType != null ? PivotUtil.getPivot(Type.class, csVariableType) : null;
			if (variableType == null) {
				variableType = initType;
			}
			context.setType(variable, variableType);
			
			if (lastLetExp != null) {
				lastLetExp.setIn(letExp);
			}
			else {
				firstLetExp = letExp;
				context.installPivotElement(csLetExp, firstLetExp);
			}
			lastLetExp = letExp;
		}
		if (lastLetExp != null) {
			OclExpression in = context.refreshExpTree(OclExpression.class, csLetExp.getIn());
			lastLetExp.setIn(in);
			Type type = in.getType();
			for (OclExpression letExp = firstLetExp; letExp != in; letExp = ((LetExp)letExp).getIn()) {
				context.setType(letExp, type);
			}
		}
		return firstLetExp;
	}

	@Override
	public MonikeredElement visitLetVariableCS(LetVariableCS csLetVariable) {
		return null;	// Handled by parent
	}

	@Override
	public MonikeredElement visitNameExpCS(NameExpCS csNameExp) {
		EObject eContainer = csNameExp.eContainer();
		if (eContainer instanceof NavigatingExpCS) {
			EObject eContainerContainer = eContainer.eContainer();
			if (eContainerContainer instanceof NamedExpCS) {
				logger.warn("Unsupported '" + eContainerContainer.eClass().getName() + "' for () navigation");
			}
//			new NavigatingExpCSCompletion(context, (NavigatingExpCS) eContainer);
			return null;
		}
//		else if (eContainer instanceof IndexExpCS) {
//			EObject eContainerContainer = eContainer.eContainer();
//			if (eContainerContainer instanceof NamedExpCS) {
//				logger.warn("Unsupported '" + eContainerContainer.eClass().getName() + "' for [] navigation");
//			}
//			return new IndexExpCSCompletion(context, (IndexExpCS) eContainer);
//		}
		else {
			NamedElement element = csNameExp.getElement();
			if (element instanceof VariableDeclaration) {
				return handleVariableExp(csNameExp, (VariableDeclaration)element);
			}
			else if (element instanceof Property) {
				return handlePropertyCallExp(csNameExp, (Property) element);
			}
			else if (element instanceof Operation) {
				addError(csNameExp, "No parameters for operation " + element.getName());
			}
			else {
				logger.warn("Unsupported NameExpCS " + element.eClass().getName());		// FIXME
			}
			return null;
		}
	}

	@Override
	public MonikeredElement visitNavigatingArgCS(NavigatingArgCS csNavigatingArg) {
		OclExpression pivot = PivotUtil.getPivot(OclExpression.class, csNavigatingArg.getName());
		context.installPivotElement(csNavigatingArg, pivot);
		return pivot;
	}

	@Override
	public MonikeredElement visitNavigatingExpCS(NavigatingExpCS csNavigatingExp) {
		NamedExpCS csNamedExp = csNavigatingExp.getNamedExp();
		NavigationOperatorCS csOperator = (NavigationOperatorCS) csNavigatingExp.getParent();
		OperationCallExp expression = context.refreshExpression(OperationCallExp.class, PivotPackage.Literals.OPERATION_CALL_EXP, csNamedExp);
		ExpCS csSource;
		if (csOperator != null) {
//			assert csOperator.getArgument() == csNamedExp;
			csSource = csOperator.getSource();
		}
		else {
			csSource = null; // Implicit
		}
		int barIndex = -1;
		int semiIndex = -1;
		NamedElement namedElement = csNamedExp.getNamedElement();
		boolean isOperation = (namedElement instanceof Operation) && !namedElement.eIsProxy();
		if (!isOperation) {
			csNamedExp.getError().add("Operation name expected");
			expression.setSource(context.getPivotManager().createInvalidValue(namedElement, null, "not an operation", null));
//			expression.setReferredOperation(operation);
			expression.setType(context.getPivotManager().getInvalidType());
			return expression;
		}
		Operation operation = (Operation) namedElement;
		int operationAccumulatorCount = 0;
		int operationIteratorCount = 0;
		int operationParameterCount = 0;
		List<Parameter> parameters = operation.getOwnedParameters();
		for (Parameter parameter : parameters) {
			IteratorKind iteratorKind = parameter.getIteratorKind();
			switch (iteratorKind) {
				case ACCUMULATOR: {
					assert operationParameterCount == 0;
					operationAccumulatorCount++;
					break;
				}
				case ITERATOR: {
					assert operationParameterCount == 0;
					assert operationAccumulatorCount == 0;
					operationIteratorCount++;
					break;
				}
				case PARAMETER: {
					operationParameterCount++;
					break;
				}
			}
		}
		List<NavigatingArgCS> arguments = csNavigatingExp.getArguments();
		int iMax = arguments.size();
		for (int i = 0; i < iMax; i++) {
			NavigatingArgCS arg = arguments.get(i);
			String prefix = arg.getPrefix();
			if ("|".equals(prefix)) {
				if (barIndex < 0) {
					barIndex = i;
				}
			}
			else if (";".equals(prefix)) {
				if (semiIndex < 0) {
					semiIndex = i;
				}
			}
		}
		if (semiIndex > barIndex) {
			csNavigatingExp.getError().add("accumulators cannot follow parameters");
		}
		int iteratorCount = 0;
		int accumulatorCount = 0;
		int parameterCount = 0;
		if (operationParameterCount == 0) {
			iteratorCount = (semiIndex > 0) ? semiIndex : (barIndex > 0) ? barIndex : iMax;
			accumulatorCount = (semiIndex > 0) && (barIndex > semiIndex) ? (barIndex - semiIndex) : 0;
		}
		else {
			iteratorCount = (semiIndex > 0) ? semiIndex : (barIndex > 0) ? barIndex : 0;
			accumulatorCount = (semiIndex > 0) && (barIndex > semiIndex) ? (barIndex - semiIndex) : 0;
			parameterCount = iMax - Math.max(0, Math.max(semiIndex, barIndex));
		}
		if (accumulatorCount > operationAccumulatorCount) {
			csNavigatingExp.getError().add("Too many accumulators");
		}
		else if (accumulatorCount < operationAccumulatorCount) {
			csNavigatingExp.getError().add("Insufficient accumulators");
		}
		if (iteratorCount > operationIteratorCount) {
			csNavigatingExp.getError().add("Too many iterators");
		}
		if (parameterCount > operationParameterCount) {
			csNavigatingExp.getError().add("Too many parameters");
		}
		else if (parameterCount < operationParameterCount) {
			csNavigatingExp.getError().add("Insufficient parameters");
		}
		List<OclExpression> pivotArguments = new ArrayList<OclExpression>();
		for (int i = 0; i < iMax; i++) {
			Parameter parameter;
			NavigatingArgCS arg = arguments.get(i);
			String prefix = arg.getPrefix();
			if (i >= barIndex) {
				if (arg.getInit() != null) {
					arg.getError().add("Unexpected initialiser for parameter");
				}
				if (arg.getOwnedType() != null) {
					arg.getError().add("Unexpected type for parameter");
				}
				context.installPivotElement(arg, context.refreshExpTree(OclExpression.class, arg.getName()));
				parameter = getParameter(operation, IteratorKind.PARAMETER, barIndex > 0 ? i - barIndex : i);
				if ((prefix != null) && !",".equals(prefix) && !"|".equals(prefix)) {
					arg.getError().add("Unexpected extra '" + prefix + "' separator for parameter");
				}
			}
			else if ((i >= semiIndex) && (semiIndex > 0)) {
				parameter = getParameter(operation, IteratorKind.ACCUMULATOR, i - semiIndex);
				if ((prefix != null) && !",".equals(prefix) && !";".equals(prefix)) {
					arg.getError().add("Unexpected extra '" + prefix + "' separator for accumulator");
				}
			}
			else {
				parameter = getParameter(operation, IteratorKind.ITERATOR, i);
				if ((prefix != null) && !",".equals(prefix)) {
					arg.getError().add("Unexpected extra '" + prefix + "' separator for iterator");
				}
			}
			pivotArguments.add(PivotUtil.getPivot(OclExpression.class, arg));
			context.installPivotElement(arg, parameter);
		}
		context.refreshList(expression.getArguments(), pivotArguments);
//		context.refreshName(operationExp, namedElement.getName());
		expression.setSource(PivotUtil.getPivot(OclExpression.class, csSource));
		expression.setReferredOperation(operation);
		expression.setType(operation.getType());
		context.installPivotElement(csNavigatingExp, expression);
		return expression;
	}

	@Override
	public MonikeredElement visitNavigationOperatorCS(NavigationOperatorCS csNavigationOperator) {
//		context.installPivotElement(csNavigationOperator, PropertyCallExp;
		return null; //PivotUtil.getPivot(OclExpression.class, csNavigationOperator);
	}

	@Override
	public MonikeredElement visitNestedExpCS(NestedExpCS csNestedExp) {
		OclExpression pivot = context.refreshExpTree(OclExpression.class, csNestedExp.getSource());
		context.installPivotElement(csNestedExp, pivot);
		return pivot;
	}

	@Override
	public MonikeredElement visitNullLiteralExpCS(NullLiteralExpCS csNullLiteralExp) {
		NullLiteralExp expression = context.refreshExpression(NullLiteralExp.class, PivotPackage.Literals.NULL_LITERAL_EXP, csNullLiteralExp);
		expression.setType(pivotManager.getNullType());
		return expression;
	}

	@Override
	public MonikeredElement visitNumberLiteralExpCS(NumberLiteralExpCS csNumberLiteralExp) {
		Number number = csNumberLiteralExp.getName();
		if (number instanceof BigDecimal) {
			RealLiteralExp expression = context.refreshExpression(RealLiteralExp.class, PivotPackage.Literals.REAL_LITERAL_EXP, csNumberLiteralExp);
			expression.setRealSymbol((BigDecimal) number);
			expression.setType(pivotManager.getRealType());
			return expression;
		}
		BigInteger bigInteger = (BigInteger) number;
		if (bigInteger.signum() < 0) {
			IntegerLiteralExp expression = context.refreshExpression(IntegerLiteralExp.class, PivotPackage.Literals.INTEGER_LITERAL_EXP, csNumberLiteralExp);
			expression.setIntegerSymbol(bigInteger);
			expression.setType(pivotManager.getIntegerType());
			return expression;
		}
		else {
			UnlimitedNaturalLiteralExp expression = context.refreshExpression(UnlimitedNaturalLiteralExp.class, PivotPackage.Literals.UNLIMITED_NATURAL_LITERAL_EXP, csNumberLiteralExp);
			expression.setUnlimitedNaturalSymbol(bigInteger);
			expression.setType(pivotManager.getUnlimitedNaturalType());
			return expression;
		}
	}

	@Override
	public MonikeredElement visitOperatorCS(OperatorCS object) {
		return null;
	}

	@Override
	public MonikeredElement visitPrefixExpCS(PrefixExpCS csPrefixExp) {
		initializePrefixOperators(csPrefixExp, null);
		OclExpression pivotChild = context.refreshExpTree(OclExpression.class, csPrefixExp.getOwnedExpression());
		List<UnaryOperatorCS> csOperators = csPrefixExp.getOwnedOperator();
		for (int i = csOperators.size(); --i >= 0; ) {
			UnaryOperatorCS csUnaryOperator = csOperators.get(i);
			ExpCS csChild = csUnaryOperator.getSource();
			if (csChild != null) {
//				csChild.setParent(csUnaryOperator);
				OperationCallExp pivotElement = context.refreshExpTree(OperationCallExp.class, csUnaryOperator);
				pivotElement.setSource(pivotChild);
//				ExpCS csSource = csUnaryOperator.getSource();
//				if (csSource != null) {
//					OclExpression pivotChild = PivotUtil.getPivot(OclExpression.class, csSource);
//					pivotElement.setSource(pivotChild);
//				}
				Operation operation = context.resolveOperationCall(pivotElement);
				if (operation == null) {
					addError(csUnaryOperator, "Failed to resolve " + pivotElement);
				}
				pivotElement.setReferredOperation(operation);
				if (operation != null) {
					context.setType(pivotElement, operation.getType());
				}
				pivotChild = pivotElement;
			}
		}
		context.installPivotElement(csPrefixExp, pivotChild);
		return pivotChild;
	}

	@Override
	public MonikeredElement visitSelfExpCS(SelfExpCS csSelfExp) {
		VariableExp expression = context.refreshExpression(VariableExp.class, PivotPackage.Literals.VARIABLE_EXP, csSelfExp);
		ScopeCSAdapter scopeAdapter = ElementUtil.getScopeCSAdapter(csSelfExp);
		EnvironmentView environmentView = new EnvironmentView(PivotPackage.Literals.EXPRESSION_IN_OCL__CONTEXT_VARIABLE, "self");
		ScopeView scopeView = scopeAdapter.getOuterScopeView(null);
		scopeView.computeLookup(environmentView);
		VariableDeclaration variableDeclaration = (VariableDeclaration) environmentView.getContent();
		expression.setReferredVariable(variableDeclaration);
		context.setType(expression, variableDeclaration.getType());
		return expression;
	}

	@Override
	public MonikeredElement visitStringLiteralExpCS(StringLiteralExpCS csStringLiteralExp) {
		StringLiteralExp expression = context.refreshExpression(StringLiteralExp.class, PivotPackage.Literals.STRING_LITERAL_EXP, csStringLiteralExp);
		List<String> names = csStringLiteralExp.getName();
		if (names.size() == 0) {
			expression.setStringSymbol("");
		}
		else if (names.size() == 1) {
			expression.setStringSymbol(names.get(0));
		}
		else {
			StringBuffer s = new StringBuffer();
			for (String name : names) {
				s.append(name);
			}
			expression.setStringSymbol(s.toString());
		}
		expression.setType(pivotManager.getStringType());
		return expression;
	}

	@Override
	public MonikeredElement visitTypeLiteralExpCS(TypeLiteralExpCS csTypeLiteralExp) {
		TypeExp expression = context.refreshExpression(TypeExp.class, PivotPackage.Literals.TYPE_EXP, csTypeLiteralExp);
		context.setType(expression, pivotManager.getClassifierType());
		TypedRefCS csType = csTypeLiteralExp.getOwnedType();
//		context.visitInOrder(csType, null);
		Type type = PivotUtil.getPivot(Type.class, csType);
		expression.setReferredType(type);
		return expression;
	}

	@Override
	public MonikeredElement visitUnaryOperatorCS(UnaryOperatorCS csUnaryOperator) {
		OperationCallExp expression = context.refreshExpression(OperationCallExp.class, PivotPackage.Literals.OPERATION_CALL_EXP, csUnaryOperator);
		context.refreshName(expression, csUnaryOperator.getName());
		return expression; // new UnaryOperatorCSCompletion(context, csUnaryOperator, expression);
	}

	@Override
	public MonikeredElement visitUnlimitedNaturalLiteralExpCS(UnlimitedNaturalLiteralExpCS csUnlimitedNaturalLiteralExp) {
		UnlimitedNaturalLiteralExp expression = context.refreshExpression(UnlimitedNaturalLiteralExp.class, PivotPackage.Literals.UNLIMITED_NATURAL_LITERAL_EXP, csUnlimitedNaturalLiteralExp);
		expression.setName("*");
		expression.setType(pivotManager.getUnlimitedNaturalType());
		expression.setUnlimitedNaturalSymbol(BigInteger.valueOf(-1));
		return expression;
	}

	@Override
	public MonikeredElement visitVariableCS(VariableCS csVariable) {
		Variable variable = context.refreshNamedElement(Variable.class,
			PivotPackage.Literals.VARIABLE, csVariable);
		OclExpression initExpression = PivotUtil.getPivot(OclExpression.class, csVariable.getInitExpression());
		Type variableType = PivotUtil.getPivot(Type.class, csVariable.getOwnedType());
		// FIXME deduce from initType
		variable.setInitExpression(initExpression);
		variable.setType(variableType);
		return variable;
	}	
}