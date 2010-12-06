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
 * $Id: EssentialOCLPostOrderVisitor.java,v 1.1.2.1 2010/12/06 18:03:09 ewillink Exp $
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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.AssociativityKind;
import org.eclipse.ocl.examples.pivot.BooleanLiteralExp;
import org.eclipse.ocl.examples.pivot.CollectionItem;
import org.eclipse.ocl.examples.pivot.CollectionLiteralExp;
import org.eclipse.ocl.examples.pivot.CollectionLiteralPart;
import org.eclipse.ocl.examples.pivot.CollectionRange;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.IfExp;
import org.eclipse.ocl.examples.pivot.IntegerLiteralExp;
import org.eclipse.ocl.examples.pivot.InvalidLiteralExp;
import org.eclipse.ocl.examples.pivot.IteratorKind;
import org.eclipse.ocl.examples.pivot.LetExp;
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
import org.eclipse.ocl.examples.pivot.TypedElement;
import org.eclipse.ocl.examples.pivot.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.VariableDeclaration;
import org.eclipse.ocl.examples.pivot.VariableExp;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedRefCS;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.BasePostOrderVisitor;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.BasicContinuation;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.Continuation;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.Continuations;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.Dependency;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.PivotDependency;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.SingleContinuation;
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
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.UnaryOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.UnlimitedNaturalLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.VariableCS;
import org.eclipse.ocl.examples.xtext.essentialocl.util.AbstractExtendingDelegatingEssentialOCLCSVisitor;

public class EssentialOCLPostOrderVisitor
	extends AbstractExtendingDelegatingEssentialOCLCSVisitor<Continuation<?>, CS2PivotConversion, BasePostOrderVisitor>
{
	static final Logger logger = Logger.getLogger(EssentialOCLPostOrderVisitor.class);

	protected static Dependency<?>[] createDependencies(Dependency<?> firstDependency, Dependency<?> secondDependency) {
		if (secondDependency != null) {
			if (firstDependency != null) {
				return new Dependency<?>[] {firstDependency, secondDependency};	
			}
			else {
				return new Dependency<?>[] {secondDependency};						
			}
		}
		else {
			if (firstDependency != null) {
				return new Dependency<?>[] {firstDependency};	
			}
			else {
				return new Dependency<?>[] {};						
			}
		}
	}

	protected static class CollectionLiteralExpCSCompletion extends SingleContinuation<CollectionLiteralExpCS>
	{	
		private static Dependency<?>[] computeDependencies(CS2PivotConversion context, CollectionLiteralExpCS csElement) {
			CollectionTypeCS ownedCollectionType = csElement.getOwnedType();
			TypedRefCS ownedElementType = ownedCollectionType.getOwnedType();
			if (ownedElementType != null) {
				return new Dependency<?>[] {new PivotDependency(ownedElementType)};
			}
			List<Dependency<?>> dependencies = null;
			for (CollectionLiteralPartCS csPart : csElement.getOwnedParts()) {
				CollectionLiteralPart pivotPart = context.getPivotElement(CollectionLiteralPart.class, csPart);
				Type type = pivotPart.getType();
				if (type == null) {
					if (dependencies == null) {
						dependencies = new ArrayList<Dependency<?>>();
					}
					dependencies.add(new PivotTypeOfDependency(csPart));
				}
			}
			if (dependencies == null) {
				return new Dependency<?>[] {};						
			}
			else {
				return dependencies.toArray(new Dependency<?>[dependencies.size()]);
			}
		}
		
		private CollectionLiteralExpCSCompletion(CS2PivotConversion context, CollectionLiteralExpCS csElement) {
			super(context, null, null, csElement, computeDependencies(context, csElement));
		}
	
		@Override
		public BasicContinuation<?> execute() {
			PivotManager pivotManager = context.getPivotManager();
			Type commonType = null;
			CollectionTypeCS ownedCollectionType = csElement.getOwnedType();
			TypedRefCS ownedElementType = ownedCollectionType.getOwnedType();
			if (ownedElementType != null) {
				commonType = (Type) ownedElementType.getPivot();
			}
			else {
				for (CollectionLiteralPartCS csPart : csElement.getOwnedParts()) {
					CollectionLiteralPart pivotPart = context.getPivotElement(CollectionLiteralPart.class, csPart);
					Type type = pivotPart.getType();
					if (commonType == null) {
						commonType = type;
					}
					else {
						commonType = pivotManager.getCommonSuperType(commonType, type);
					}
				}
			}
			CollectionLiteralExp expression = context.getPivotElement(CollectionLiteralExp.class, csElement);
			String collectionTypeName = ownedCollectionType.getName();
			Type type = pivotManager.getLibraryType(collectionTypeName, Collections.singletonList(commonType));
			context.setType(expression, type);
			return null;
		}
	}
	
	protected static class CollectionLiteralPartCSCompletion extends SingleContinuation<CollectionLiteralPartCS>
	{	
		private static Dependency<?>[] computeDependencies(CS2PivotConversion context, CollectionLiteralPartCS csElement) {
			Dependency<?> firstDependency = null;
			Dependency<?> secondDependency = null;
			ExpCS csFirst = csElement.getExpressionCS();
			OclExpression pivotFirst = context.getPivotElement(OclExpression.class, csFirst);
			Type firstType = pivotFirst.getType();
			if (firstType == null) {
				firstDependency = new PivotTypeOfDependency(csFirst);
			}
			ExpCS csLast = csElement.getLastExpressionCS();
			if (csLast != null) {
				OclExpression pivotLast = context.getPivotElement(OclExpression.class, csLast);
				Type secondType = pivotLast.getType();
				if (secondType == null) {
					secondDependency = new PivotTypeOfDependency(csLast);
				}
			}			
			return createDependencies(firstDependency, secondDependency);
		}
		
		private CollectionLiteralPartCSCompletion(CS2PivotConversion context, CollectionLiteralPartCS csElement) {
			super(context, null, null, csElement, computeDependencies(context, csElement));
		}
	
		@Override
		public BasicContinuation<?> execute() {
			ExpCS csFirst = csElement.getExpressionCS();
			OclExpression pivotFirst = context.getPivotElement(OclExpression.class, csFirst);
			Type type = pivotFirst.getType();
			ExpCS csLast = csElement.getLastExpressionCS();
			if (csLast != null) {
				OclExpression pivotLast = context.getPivotElement(OclExpression.class, csLast);
				Type secondType = pivotLast.getType();
				type = context.getPivotManager().getCommonSuperType(type, secondType);
			}
			CollectionLiteralPart expression = context.getPivotElement(CollectionLiteralPart.class, csElement);
			context.setType(expression, type);
			return null;
		}
	}

	protected static class ExpConstraintCSCompletion extends SingleContinuation<ExpConstraintCS>
	{	
		private ExpConstraintCSCompletion(CS2PivotConversion context, ExpConstraintCS csElement) {
			super(context, null, null, csElement, new PivotDependency(csElement.getOwnedExpression()));
		}
	
		@Override
		public BasicContinuation<?> execute() {
			Constraint constraint = context.getPivotElement(Constraint.class, csElement);
			ExpressionInOcl specification = (ExpressionInOcl) constraint.getSpecification();
			ExpCS csExpression = csElement.getOwnedExpression();
			OclExpression expression = context.getPivotElement(OclExpression.class, csExpression);
			specification.setBodyExpression(expression);
			return null;
		}
	}

	protected static class InfixExpCSCompletion extends SingleContinuation<InfixExpCS>
	{
		protected final ExpCS csRoot;
		
		private InfixExpCSCompletion(CS2PivotConversion context, InfixExpCS csElement, ExpCS csRoot) {
			super(context, null, null, csElement, new PivotTypeOfDependency(csRoot));
			this.csRoot = csRoot;
		}
	
		@Override
		public BasicContinuation<?> execute() {
			context.installPivotElement(csElement, context.getPivotElement(OclExpression.class, csRoot));
			return null;
		}
	}
	
	protected class NameExpCSCompletion extends SingleContinuation<NameExpCS>
	{	
		private NameExpCSCompletion(CS2PivotConversion context, NameExpCS csElement) {
			super(context, null, null, csElement);
		}
	
		@Override
		public BasicContinuation<?> execute() {
			NamedElement element = csElement.getElement();
			if (element instanceof VariableDeclaration) {
				final VariableDeclaration variableDeclaration = (VariableDeclaration) element;
				final VariableExp expression = refreshExpression(VariableExp.class, PivotPackage.Literals.VARIABLE_EXP, csElement);
				expression.setReferredVariable(variableDeclaration);
				return new SingleContinuation<NameExpCS>(context, expression, PivotPackage.Literals.TYPED_ELEMENT__TYPE, csElement, new TypeOfDependency(variableDeclaration))
				{
					@Override
					public BasicContinuation<?> execute() {
						context.setType(expression, variableDeclaration.getType());
						return null;
					}			
				};
			}
			else if (element instanceof Property) {
				final PropertyCallExp expression = refreshExpression(PropertyCallExp.class, PivotPackage.Literals.PROPERTY_CALL_EXP, csElement);
				final Property property = (Property) element;
				expression.setReferredProperty(property);
				context.setType(expression, property.getType());		// FIXME resolve template parameter
			}
			else if (element instanceof Operation) {
				addError("No parameters for operation " + element.getName());
			}
			else {
				logger.warn("Unsupported NameExpCS " + element.eClass().getName());		// FIXME
			}
			return null;
		}
	}

	protected class NavigatingExpCSCompletion extends SingleContinuation<NavigatingExpCS>
	{	
		private NavigatingExpCSCompletion(CS2PivotConversion context, NavigatingExpCS csElement) {
			super(context, null, null, csElement);
		}
	
		@Override
		public BasicContinuation<?> execute() {
			NamedExpCS csNamedExp = csElement.getNamedExp();
			NavigationOperatorCS csOperator = (NavigationOperatorCS) csNamedExp.getParent();
			OperationCallExp expression = refreshExpression(OperationCallExp.class, PivotPackage.Literals.OPERATION_CALL_EXP, csNamedExp);
			ExpCS csSource;
			if (csOperator != null) {
				assert csOperator.getRight() == csNamedExp;
				csSource = csOperator.getLeft();
			}
			else {
				csSource = null; // Implicit
			}
			int barIndex = -1;
			int semiIndex = -1;
			NamedElement namedElement = csNamedExp.getNamedElement();
			boolean isOperation = namedElement instanceof Operation;
			if (!isOperation) {
				csNamedExp.getError().add("Operation name expected");
				return null;
			}
			Operation operation = (Operation) namedElement;
			int operationAccumulatorCount = 0;
			int operationIteratorCount = 0;
			int operationParameterCount = 0;
			List<Parameter> parameters = operation.getOwnedParameters();
			for (Parameter parameter : parameters) {
				IteratorKind iteratorKind = parameter.getIteratorKind();
				switch (iteratorKind) {
					case ACCUMULATOR: operationAccumulatorCount++; break;
					case ITERATOR: operationIteratorCount++; break;
					case PARAMETER: operationParameterCount++; break;
				}
			}
			List<NavigatingArgCS> arguments = csElement.getArguments();
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
					if (barIndex < 0) {
						semiIndex = i;
					}
				}
			}
			int iteratorCount = (semiIndex > 0) ? semiIndex : (barIndex > 0) ? barIndex : iMax;
			int accumulatorCount = (semiIndex > 0) && (barIndex > semiIndex) ? (barIndex - semiIndex) : 0;
			int parameterCount = barIndex > 0 ? (iMax - barIndex) : iMax;
			if (semiIndex > barIndex) {
				csElement.getError().add("accumulators cannot follow parameters");
			}
			if (accumulatorCount > operationAccumulatorCount) {
				csElement.getError().add("Too many accumulators");
			}
			else if (accumulatorCount < operationAccumulatorCount) {
				csElement.getError().add("Insufficient accumulators");
			}
			if (iteratorCount > operationIteratorCount) {
				csElement.getError().add("Too many iterators");
			}
			if (parameterCount > operationParameterCount) {
				csElement.getError().add("Too many parameters");
			}
			else if (parameterCount < operationParameterCount) {
				csElement.getError().add("Insufficient parameters");
			}
			List<OclExpression> pivotArguments = new ArrayList<OclExpression>();
			for (int i = 0; i < iMax; i++) {
				Parameter parameter;
				NavigatingArgCS arg = arguments.get(i);
				String prefix = arg.getPrefix();
				if (i >= barIndex) {
					parameter = getParameter(operation, IteratorKind.PARAMETER, i - barIndex);
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
				int index = parameters.indexOf(parameter);
				pivotArguments.set(index, context.getPivotElement(OclExpression.class, arg));
				context.installPivotElement(arg, parameter);
			}
			context.refreshList(expression.getArguments(), pivotArguments);
//			context.refreshName(operationExp, namedElement.getName());
			expression.setSource(context.getPivotElement(OclExpression.class, csSource));
			expression.setReferredOperation(operation);
			expression.setType(operation.getType());
			return null;
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
	}
	
	protected static class OperatorCSCompletion extends SingleContinuation<OperatorCS>
	{
		private OperatorCSCompletion(CS2PivotConversion context, OperatorCS csElement) {
			super(context, null, null, csElement, computeDependencies(context, csElement));
		}

		private static Dependency<?>[] computeDependencies(CS2PivotConversion context, OperatorCS csElement) {
			Dependency<?> firstDependency = null;
			Dependency<?> secondDependency = null;
			if (csElement instanceof BinaryOperatorCS) {
				BinaryOperatorCS csBinaryOperator = (BinaryOperatorCS) csElement;
				ExpCS csLeft = csBinaryOperator.getLeft();
				if (csLeft != null) {
					firstDependency = new PivotTypeOfDependency(csLeft);
				}
				ExpCS csRight = csBinaryOperator.getRight();
				if (csRight != null) {
					secondDependency = new PivotTypeOfDependency(csRight);
				}
			}
			else if (csElement instanceof UnaryOperatorCS) {
				UnaryOperatorCS csUnaryOperator = (UnaryOperatorCS) csElement;
				ExpCS csChild = csUnaryOperator.getChild();
				if (csChild != null) {
					firstDependency = new PivotTypeOfDependency(csChild);
				}
			}
			return createDependencies(firstDependency, secondDependency);
		}

		@Override
		public BasicContinuation<?> execute() {
			if (csElement instanceof NavigationOperatorCS) {
				NavigationOperatorCS csNavigationOperator = (NavigationOperatorCS) csElement;
				OperationCallExp pivotElement = context.getPivotElement(OperationCallExp.class, csNavigationOperator.getRight());
				context.installPivotElement(csNavigationOperator, pivotElement);
				return null;
			}
			OperationCallExp pivotElement = context.getPivotElement(OperationCallExp.class, csElement);
			if (csElement instanceof BinaryOperatorCS) {
				BinaryOperatorCS csBinaryOperator = (BinaryOperatorCS) csElement;
				ExpCS csLeft = csBinaryOperator.getLeft();
				if (csLeft != null) {
					OclExpression pivotLeft = context.getPivotElement(OclExpression.class, csLeft);
					pivotElement.setSource(pivotLeft);
				}
				ExpCS csRight = csBinaryOperator.getRight();
				if (csRight != null) {
					OclExpression pivotRight = context.getPivotElement(OclExpression.class, csRight);
					pivotElement.getArguments().add(pivotRight);
				}
			}
			else if (csElement instanceof UnaryOperatorCS) {
				UnaryOperatorCS csUnaryOperator = (UnaryOperatorCS) csElement;
				ExpCS csChild = csUnaryOperator.getChild();
				if (csChild != null) {
					OclExpression pivotChild = context.getPivotElement(OclExpression.class, csChild);
					pivotElement.setSource(pivotChild);
				}
			}
			Operation operation = context.resolveOperationCall(pivotElement);
			if (operation == null) {
				addError("Failed to resolve " + pivotElement);
			}
			pivotElement.setReferredOperation(operation);
			if (operation != null) {
				context.setType(pivotElement, operation.getType());
			}
			return null;
		}
	}

	protected static class SelfExpCSCompletion extends SingleContinuation<SelfExpCS>
	{	
		private SelfExpCSCompletion(CS2PivotConversion context, SelfExpCS csElement) {
			super(context, null, null, csElement);
		}
	
		@Override
		public BasicContinuation<?> execute() {
			ScopeCSAdapter scopeAdapter = ElementUtil.getScopeCSAdapter(csElement);
			EnvironmentView environmentView = new EnvironmentView(PivotPackage.Literals.EXPRESSION_IN_OCL__CONTEXT_VARIABLE, "self");
			ScopeView scopeView = scopeAdapter.getOuterScopeView(null);
			scopeView.computeLookup(environmentView);
			VariableDeclaration variableDeclaration = (VariableDeclaration) environmentView.getContent();
			VariableExp expression = context.getPivotElement(VariableExp.class, csElement);
			expression.setReferredVariable(variableDeclaration);
			context.setType(expression, variableDeclaration.getType());
			return null;
		}
	}
	
	public EssentialOCLPostOrderVisitor(CS2PivotConversion context) {
		super(new BasePostOrderVisitor(context), context);
	}

	protected OperatorCS[] createInfixOperatorTree(InfixExpCS csElement) {
		//
		//	Create the per-precedence list of operator indexes, and a
		//	highest precedence first list of all used infix precedences.
		//
		Map<Precedence, List<Integer>> precedenceToOperatorIndex = createInfixPrecedenceMap(csElement);
		List<Precedence> sortedPrecedences = context.getPivotManager().getSortedPrecedences(precedenceToOperatorIndex.keySet());
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
//				OperationCallExp pivotElement = converter.refreshMonikeredElement(OperationCallExp.class, PivotPackage.Literals.OPERATION_CALL_EXP, csOperator);
//				converter.refreshName(pivotElement, csOperator.getName());
//				OperationCallExp pivotElement = PivotFactory.eINSTANCE.createOperationCallExp();
//				pivotElement.setName(csOperator.getName());
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
//					pivotElement.setSource((OclExpression) csLeftRoot.getPivot());
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
//					pivotElement.getArguments().add((OclExpression) csRightRoot.getPivot());
				}					
			}
		}
		return csParents;
	}

	protected Map<Precedence, List<Integer>> createInfixPrecedenceMap(InfixExpCS csElement) {
		PivotManager pivotManager = context.getPivotManager();
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
			ExpCS csLeft = csExpressions.get(i);
			if (csLeft instanceof NamedExpCS) {
				csLeft = ((NamedExpCS)csLeft).getSimpleNamedExp();
			}
			csOperator.setLeft(csLeft);
			ExpCS csRight = csExpressions.get(i+1);
			if (csRight instanceof NamedExpCS) {
				csRight = ((NamedExpCS)csRight).getSimpleNamedExp();
			}
			csOperator.setRight(csRight);
		}
		return precedenceToOperatorIndex;
	}

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
			ExpCS csChild = prefixExpCS.getOwnedExpression();
			if (csChild instanceof NamedExpCS) {
				csChild = ((NamedExpCS)csChild).getSimpleNamedExp();
			}
			csUnaryOperator.setChild(csChild);
			csParent = csUnaryOperator;
		}
	}

	protected Continuations installInfixPivotElements(OperatorCS[] csParents) {
		Continuations continuations = new Continuations();
		for (OperatorCS csOperator :  csParents) {
			if (csOperator instanceof BinaryOperatorCS) {
				BinaryOperatorCS csBinaryOperator = (BinaryOperatorCS) csOperator;
				ExpCS csLeft = csBinaryOperator.getLeft();
				if (csLeft != null) {
					if (csLeft instanceof NamedExpCS) {
						csLeft = ((NamedExpCS)csLeft).getSimpleNamedExp();
					}
					csLeft.setParent(csBinaryOperator);
				}
				ExpCS csRight = csBinaryOperator.getRight();
				if (csRight != null) {
					if (csRight instanceof NamedExpCS) {
						csRight = ((NamedExpCS)csRight).getSimpleNamedExp();
					}
					csRight.setParent(csBinaryOperator);
				}
			}
			else if (csOperator instanceof UnaryOperatorCS) {
				UnaryOperatorCS csUnaryOperator = (UnaryOperatorCS) csOperator;
				ExpCS csChild = csUnaryOperator.getChild();
				if (csChild != null) {
					if (csChild instanceof NamedExpCS) {
						csChild = ((NamedExpCS)csChild).getSimpleNamedExp();
					}
					csChild.setParent(csUnaryOperator);
				}
			}
			continuations.add(new OperatorCSCompletion(context, csOperator));
		}
		return continuations;
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
			Precedence parentPrecedence = context.getPivotManager().getInfixPrecedence(csParent.getName());
			Precedence unaryPrecedence = context.getPivotManager().getPrefixPrecedence(csOperator.getName());
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
/*		assert pivotClass == pivotEClass.getInstanceClass();
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
*/
		Element pivotElement = context.refreshMonikeredElement(pivotClass, pivotEClass, csElement);
		context.installPivotElement(csElement, pivotElement);
		
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

	  
	@Override
	public Continuation<?> visitBinaryOperatorCS(BinaryOperatorCS csBinaryOperator) {
		OperationCallExp expression = refreshExpression(OperationCallExp.class, PivotPackage.Literals.OPERATION_CALL_EXP, csBinaryOperator);
		context.refreshName(expression, csBinaryOperator.getName());
		return null; //new BinaryOperatorCSLeftCompletion(context, csBinaryOperator, expression);
	}

	@Override
	public Continuation<?> visitBooleanLiteralExpCS(BooleanLiteralExpCS csBooleanLiteralExp) {
		BooleanLiteralExp expression = refreshExpression(BooleanLiteralExp.class, PivotPackage.Literals.BOOLEAN_LITERAL_EXP, csBooleanLiteralExp);
		expression.setBooleanSymbol(Boolean.valueOf(csBooleanLiteralExp.getName()));
		expression.setType(context.getPivotManager().getBooleanType());
		return null;
	}

	@Override
	public Continuation<?> visitCollectionLiteralExpCS(CollectionLiteralExpCS csCollectionLiteralExp) {
//		CollectionTypeCS ownedCollectionType = csCollectionLiteralExp.getOwnedType();
//		Type collectionType = context.getPivotManager().getLibraryType(ownedCollectionType.getName());
//		context.installPivotElement(ownedCollectionType, collectionType);
		CollectionLiteralExp expression = refreshExpression(CollectionLiteralExp.class, PivotPackage.Literals.COLLECTION_LITERAL_EXP, csCollectionLiteralExp);
		context.refreshPivotList(CollectionLiteralPart.class, expression.getParts(), csCollectionLiteralExp.getOwnedParts());
		return new CollectionLiteralExpCSCompletion(context, csCollectionLiteralExp);
	}

	@Override
	public Continuation<?> visitCollectionLiteralPartCS(CollectionLiteralPartCS csCollectionLiteralPart) {
		ExpCS csFirst = csCollectionLiteralPart.getExpressionCS();
		OclExpression pivotFirst = context.getPivotElement(OclExpression.class, csFirst);
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
			OclExpression pivotLast = context.getPivotElement(OclExpression.class, csLast);
			expression.setLast(pivotLast);
		}
		return new CollectionLiteralPartCSCompletion(context, csCollectionLiteralPart);
	}

	@Override
	public Continuation<?> visitCollectionTypeCS(CollectionTypeCS csCollectionType) {
//		String collectionName = csCollectionType.getName();
//		context.getPivotManager().get
		return null;
	}

	@Override
	public Continuation<?> visitContextCS(ContextCS csContext) {
		ExpressionInOcl pivotElement = context.refreshMonikeredElement(ExpressionInOcl.class,
			PivotPackage.Literals.EXPRESSION_IN_OCL, csContext);
		context.installPivotElement(csContext, pivotElement);
		pivotElement.setBodyExpression(context.getPivotElement(OclExpression.class, csContext.getOwnedExpression()));
		return null; // new ContextCSCompletion(context, csContext, pivotElement);
	}

	@Override
	public Continuation<?> visitExpConstraintCS(ExpConstraintCS csExpConstraint) {
		Continuation<?> superCompletion = super.visitExpConstraintCS(csExpConstraint);
		if (csExpConstraint.getOwnedExpression() == null) {
			return superCompletion;
		}
		Continuation<?> localCompletion = new ExpConstraintCSCompletion(context, csExpConstraint);
		return Continuations.combine(superCompletion, localCompletion);
	}

	@Override
	public Continuation<?> visitIfExpCS(IfExpCS csIfExp) {
		IfExp expression = refreshExpression(IfExp.class, PivotPackage.Literals.IF_EXP, csIfExp);
		expression.setCondition(context.getPivotElement(OclExpression.class, csIfExp.getCondition()));
		expression.setThenExpression(context.getPivotElement(OclExpression.class, csIfExp.getThenExpression()));
		expression.setElseExpression(context.getPivotElement(OclExpression.class, csIfExp.getElseExpression()));
		return null;
	}

	@Override
	public Continuation<?> visitIndexExpCS(IndexExpCS csIndexExp) {
		// Navigating completions are orchestrated by the SimpleNamedExpCS.
		return null;
	}

	@Override
	public Continuation<?> visitInfixExpCS(InfixExpCS csInfixExp) {
		// FIXME special case trivial expressions
		//
		//	Establish the Infix tree and the per leaf expression parent operator.
		//
		OperatorCS[] csParents = createInfixOperatorTree(csInfixExp);			
		//
		//	Interleave the Prefix Operators.
		//
		interleavePrefixes(csInfixExp, csParents);
		Continuations continuations = installInfixPivotElements(csParents);
		ExpCS csRoot = csParents[0];
		for (ExpCS csParent = csRoot.getParent(); csParent != null; csParent = csRoot.getParent()) {
			csRoot = csParent;
		}
		continuations.add(new InfixExpCSCompletion(context, csInfixExp, csRoot));
		return continuations.getContinuation();
	}

	@Override
	public Continuation<?> visitInvalidLiteralExpCS(InvalidLiteralExpCS csInvalidLiteralExp) {
		InvalidLiteralExp expression = context.getPivotManager().createInvalidValue(csInvalidLiteralExp, null, "invalid literal", null);
		context.installPivotElement(csInvalidLiteralExp, expression);
		return null;
	}

	@Override
	public Continuation<?> visitLetExpCS(LetExpCS csLetExp) {
		// Each CS Let Variable becomes a Pivot LetExpression and Variable
		// The CS Let therefore just re-uses the Pivot of the first CS Let Variable
		Variable firstLet = context.getPivotElement(Variable.class, csLetExp.getVariable().get(0));
		context.installPivotElement(csLetExp, (Element) firstLet.eContainer());
		return null; //new LetExpCSCompletion(context, csLetExp);
	}

	@Override
	public Continuation<?> visitLetVariableCS(LetVariableCS csLetVariable) {
		LetExpCS csLetExpression = csLetVariable.getLetExpression();
		List<LetVariableCS> csLetVariables = csLetExpression.getVariable();
		int index = csLetVariables.indexOf(csLetVariable);
		String letMoniker = csLetExpression.getMoniker() + "_" + index;
		boolean isLast = index >= csLetVariables.size()-1;
		final ExpCS csIn = isLast ? csLetExpression.getIn() : csLetVariables.get(index+1);
		final LetExp pivotLetExp = context.refreshMonikeredElement(LetExp.class,
			PivotPackage.Literals.LET_EXP, letMoniker);
		final Variable pivotVariable = context.refreshMonikeredElement(Variable.class,
			PivotPackage.Literals.VARIABLE, csLetVariable);
		context.installPivotElement(csLetVariable, pivotVariable);
		context.refreshName(pivotVariable, csLetVariable.getName());
		pivotLetExp.setVariable(pivotVariable);
		TypedRefCS csType = csLetVariable.getOwnedType();
		if (csType != null) {
			return new SingleContinuation<LetVariableCS>(context, pivotVariable, PivotPackage.Literals.TYPED_ELEMENT__TYPE, csLetVariable, new PivotDependency(csType))
			{
				@Override
				public BasicContinuation<?> execute() {
					context.setType(pivotVariable, (Type) csElement.getOwnedType().getPivot());
					return new SingleContinuation< LetVariableCS>(context, pivotVariable, PivotPackage.Literals.VARIABLE__INIT_EXPRESSION, csElement, new PivotDependency(csElement.getInitExpression()))
					{
						@Override
						public BasicContinuation<?> execute() {
							pivotVariable.setInitExpression(context.getPivotElement(OclExpression.class, csElement.getInitExpression()));
							return new SingleContinuation<LetVariableCS>(context, pivotLetExp, PivotPackage.Literals.LET_EXP__IN, csElement, new PivotTypeOfDependency(csIn))
							{
								@Override
								public BasicContinuation<?> execute() {
									TypedElement pivotInElement = context.getPivotElement(TypedElement.class, csIn);
									if (pivotInElement instanceof Variable) {
										pivotInElement = (TypedElement) pivotInElement.eContainer();
									}
									OclExpression pivotInExpression = (OclExpression) pivotInElement;
									pivotLetExp.setIn(pivotInExpression);
									context.setType(pivotLetExp, pivotInExpression.getType());
									return null;
								}
							};
						}			
					};
				}			
			};
		}
		else {
			return new SingleContinuation<LetVariableCS>(context, pivotVariable, PivotPackage.Literals.VARIABLE__INIT_EXPRESSION, csLetVariable, new PivotTypeOfDependency(csLetVariable.getInitExpression()))
			{
				@Override
				public BasicContinuation<?> execute() {
					OclExpression pivotInitExpression = context.getPivotElement(OclExpression.class, csElement.getInitExpression());
					context.setType(pivotVariable, pivotInitExpression.getType());
					pivotVariable.setInitExpression(pivotInitExpression);
					return new SingleContinuation<LetVariableCS>(context, pivotLetExp, PivotPackage.Literals.LET_EXP__IN, csElement, new PivotTypeOfDependency(csIn))
					{
						@Override
						public BasicContinuation<?> execute() {
							TypedElement pivotInElement = context.getPivotElement(TypedElement.class, csIn);
							if (pivotInElement instanceof Variable) {
								pivotInElement = (TypedElement) pivotInElement.eContainer();
							}
							OclExpression pivotInExpression = (OclExpression) pivotInElement;
							pivotLetExp.setIn(pivotInExpression);
							context.setType(pivotLetExp, pivotInExpression.getType());
							return null;
						}			
					};
				}			
			};
		}
	}

	@Override
	public Continuation<?> visitNameExpCS(NameExpCS csNameExp) {
		EObject eContainer = csNameExp.eContainer();
		if (eContainer instanceof NavigatingExpCS) {
			EObject eContainerContainer = eContainer.eContainer();
			if (eContainerContainer instanceof NamedExpCS) {
				logger.warn("Unsupported '" + eContainerContainer.eClass().getName() + "' for () navigation");
			}
			return new NavigatingExpCSCompletion(context, (NavigatingExpCS) eContainer);
		}
//		else if (eContainer instanceof IndexExpCS) {
//			EObject eContainerContainer = eContainer.eContainer();
//			if (eContainerContainer instanceof NamedExpCS) {
//				logger.warn("Unsupported '" + eContainerContainer.eClass().getName() + "' for [] navigation");
//			}
//			return new IndexExpCSCompletion(context, (IndexExpCS) eContainer);
//		}
		else {
			return new NameExpCSCompletion(context, csNameExp);
		}
	}

	public Continuation<?> visitNavigatingArgCS(NavigatingArgCS csNavigatingArg) {
		return null;
	}

	@Override
	public Continuation<?> visitNavigatingExpCS(NavigatingExpCS csNavigatingExp) {
		// Navigating completions are orchestrated by the SimpleNamedExpCS.
		return null;
	}

	@Override
	public Continuation<?> visitNavigationOperatorCS(NavigationOperatorCS csNavigationOperator) {
		// The AST for a NavigationOperator is associated with the right-hand SimpleNamedExpCS.
		return null;
	}

	@Override
	public Continuation<?> visitNestedExpCS(NestedExpCS csNestedExp) {
		context.installPivotElement(csNestedExp, context.getPivotElement(OclExpression.class, csNestedExp.getSource()));
		return null;
	}

	@Override
	public Continuation<?> visitNullLiteralExpCS(NullLiteralExpCS csNullLiteralExp) {
		NullLiteralExp expression = refreshExpression(NullLiteralExp.class, PivotPackage.Literals.NULL_LITERAL_EXP, csNullLiteralExp);
		expression.setType(context.getPivotManager().getNullType());
		return null;
	}

	@Override
	public Continuation<?> visitNumberLiteralExpCS(NumberLiteralExpCS csNumberLiteralExp) {
		Number number = csNumberLiteralExp.getName();
		if (number instanceof BigDecimal) {
			RealLiteralExp expression = refreshExpression(RealLiteralExp.class, PivotPackage.Literals.REAL_LITERAL_EXP, csNumberLiteralExp);
			expression.setRealSymbol((BigDecimal) number);
			expression.setType(context.getPivotManager().getRealType());
		}
		else {
			BigInteger bigInteger = (BigInteger) number;
			if (bigInteger.signum() < 0) {
				IntegerLiteralExp expression = refreshExpression(IntegerLiteralExp.class, PivotPackage.Literals.INTEGER_LITERAL_EXP, csNumberLiteralExp);
				expression.setIntegerSymbol(bigInteger);
				expression.setType(context.getPivotManager().getIntegerType());
			}
			else {
				UnlimitedNaturalLiteralExp expression = refreshExpression(UnlimitedNaturalLiteralExp.class, PivotPackage.Literals.UNLIMITED_NATURAL_LITERAL_EXP, csNumberLiteralExp);
				expression.setSymbol(bigInteger);
				expression.setType(context.getPivotManager().getUnlimitedNaturalType());
			}
		}
		return null;
	}

	@Override
	public Continuation<?> visitPrefixExpCS(PrefixExpCS csPrefixExp) {
		initializePrefixOperators(csPrefixExp, null);
		context.installPivotElement(csPrefixExp, context.getPivotElement(OclExpression.class, csPrefixExp.getOwnedOperator().get(0)));
		Continuations continuations = new Continuations();
		for (UnaryOperatorCS csUnaryOperator :  csPrefixExp.getOwnedOperator()) {
			ExpCS csChild = csUnaryOperator.getChild();
			if (csChild != null) {
				csChild.setParent(csUnaryOperator);
				continuations.add(new OperatorCSCompletion(context, csUnaryOperator));
			}
		}
		return continuations;
	}

	@Override
	public Continuation<?> visitSelfExpCS(SelfExpCS csSelfExp) {
		@SuppressWarnings("unused")
		VariableExp expression = refreshExpression(VariableExp.class, PivotPackage.Literals.VARIABLE_EXP, csSelfExp);
		return new SelfExpCSCompletion(context, csSelfExp);
	}

	@Override
	public Continuation<?> visitStringLiteralExpCS(StringLiteralExpCS csStringLiteralExp) {
		StringLiteralExp expression = refreshExpression(StringLiteralExp.class, PivotPackage.Literals.STRING_LITERAL_EXP, csStringLiteralExp);
		expression.setType(context.getPivotManager().getStringType());
		return null;
	}

	@Override
	public Continuation<?> visitUnaryOperatorCS(UnaryOperatorCS csUnaryOperator) {
		OperationCallExp expression = refreshExpression(OperationCallExp.class, PivotPackage.Literals.OPERATION_CALL_EXP, csUnaryOperator);
		context.refreshName(expression, csUnaryOperator.getName());
		return null; // new UnaryOperatorCSCompletion(context, csUnaryOperator, expression);
	}

	@Override
	public Continuation<?> visitUnlimitedNaturalLiteralExpCS(UnlimitedNaturalLiteralExpCS csUnlimitedNaturalLiteralExp) {
		UnlimitedNaturalLiteralExp expression = refreshExpression(UnlimitedNaturalLiteralExp.class, PivotPackage.Literals.UNLIMITED_NATURAL_LITERAL_EXP, csUnlimitedNaturalLiteralExp);
		expression.setType(context.getPivotManager().getUnlimitedNaturalType());
		return null;
	}

	@Override
	public Continuation<?> visitVariableCS(VariableCS csVariable) {
		Variable pivotElement = context.refreshMonikeredElement(Variable.class,
			PivotPackage.Literals.VARIABLE, csVariable);
		context.installPivotElement(csVariable, pivotElement);
		context.refreshName(pivotElement, csVariable.getName());
//			converter.referenceElement(csVariable.getOwnedType());
//			pivotElement.setInitExpression(converter.referenceElement(OclExpression.class, csVariable.getInitExpression()));
//			converter.queueResolver(csVariable);	// For type
		return null;
	}	
}