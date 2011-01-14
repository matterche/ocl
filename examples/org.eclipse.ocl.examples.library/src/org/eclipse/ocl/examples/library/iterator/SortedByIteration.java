/**
 * <copyright>
 *
 * Copyright (c) 2009,2010 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: SortedByIteration.java,v 1.1.2.9 2011/01/14 14:54:33 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.ocl.examples.library.AbstractIteration;
import org.eclipse.ocl.examples.pivot.CallExp;
import org.eclipse.ocl.examples.pivot.CompleteOperation;
import org.eclipse.ocl.examples.pivot.Iteration;
import org.eclipse.ocl.examples.pivot.LoopExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.StandardLibrary;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.VariableDeclaration;
import org.eclipse.ocl.examples.pivot.evaluation.CallableImplementation;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.messages.OCLMessages;
import org.eclipse.ocl.examples.pivot.utilities.CompleteEnvironmentManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.pivot.values.CollectionValue;
import org.eclipse.ocl.examples.pivot.values.Value;
import org.eclipse.ocl.examples.pivot.values.Value.BinaryOperation;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;
import org.eclipse.ocl.examples.pivot.values.impl.AbstractValue;
import org.eclipse.osgi.util.NLS;

/**
 * SelectIteration realises the Collection::sortedBy() library iteration.
 * 
 * @since 3.1
 */
public class SortedByIteration extends AbstractIteration<SortedByIteration.SortingValue>
{
	protected static class SortingValue extends AbstractValue implements Comparator<Value>
	{
		private final EvaluationEnvironment env;
		private final Value sourceVal;
		private final Map<Value, Value> content = new HashMap<Value, Value>();	// User object to sortedBy value
		private final LoopExp iteratorExp;
		private final Value.BinaryOperation binaryImplementation;

		public SortingValue(EvaluationEnvironment env, Value sourceVal, LoopExp iteratorExp, Value.BinaryOperation binaryImplementation) {
			super(env.getValueFactory());
			this.env = env;
			this.sourceVal = sourceVal;
			this.iteratorExp = iteratorExp;
			this.binaryImplementation = binaryImplementation;
		}
		
		public int compare(Value o1, Value o2) {
			if (o1 == o2) {
				return 0;
			}
			Value v1 = content.get(o1);
			Value v2 = content.get(o2);
			if (v1 == v2) {
				return 0;
			}
			Value lessThan = binaryImplementation.evaluate(valueFactory, v1, v2);
			if (lessThan.isTrue()) {
				return -1;
			}
			if (!lessThan.isFalse()) {
				throw new IllegalArgumentException();
			}
			Value greaterThan = binaryImplementation.evaluate(valueFactory, v2, v1);
			if (greaterThan.isTrue()) {
				return 1;
			}
			if (!greaterThan.isFalse()) {
				throw new IllegalArgumentException();
			}
			return 0;
		}

		public Value createSortedValue() {
			List<Value> result = new ArrayList<Value>(content.keySet());
			try {
				Collections.sort(result, this);
			}
			catch (Exception e) {
				return valueFactory.createInvalidValue(sourceVal, iteratorExp, "'<' evaluation failed", e);
			}
			// create result from the sorted collection
			Type sourceType = iteratorExp.getSource().getType();
			boolean isUnique = env.getPivotManager().isUnique(sourceType);
			return valueFactory.createCollectionValue(true, isUnique, result);
		}

		public Type getType(StandardLibrary standardLibrary, Type staticType) {
			return staticType;
		}

		public void put(Value iterVal, Value comparable) {
			content.put(iterVal, comparable);
		}

		@Override
		public String toString() {
			return content.toString();
		}
	}

	public static final SortedByIteration INSTANCE = new SortedByIteration();

	public Value evaluate(final EvaluationVisitor evaluationVisitor, Value sourceVal, LoopExp iteratorExp) {
		EvaluationEnvironment evaluationEnvironment = evaluationVisitor.getEvaluationEnvironment();
		ValueFactory valueFactory = evaluationVisitor.getValueFactory();		
		PivotManager pivotManager = evaluationEnvironment.getPivotManager();
		CompleteEnvironmentManager completeManager = pivotManager.getCompleteEnvironmentManager();
		OclExpression body = iteratorExp.getBody();		
		Type staticValueType = body.getType();
//		CompleteType completeStaticValueType = completeManager.getCompleteType(staticValueType);
		Operation staticLessThanOperation = pivotManager.resolveOperation(staticValueType, "<", staticValueType);
		if (staticLessThanOperation == null) {
			return valueFactory.createInvalidValue(sourceVal, iteratorExp, "No '<' operation defined", null);
		}
		CompleteOperation staticCompleteOperation = completeManager.getCompleteOperation(staticLessThanOperation);
//		Type dynamicSourceType = sourceValue.getType(getStandardLibrary(), staticSourceType);
//		CompleteType dynamicCompleteType = completeManager.getCompleteType(dynamicSourceType);
//		CompleteOperation dynamicOperation = dynamicCompleteType.getDynamicOperation(staticCompleteOperation);
		Value.BinaryOperation binaryImplementation;
		try {
			CallableImplementation implementation = pivotManager.getImplementation(staticCompleteOperation);
			if (implementation == null) {
				return valueFactory.createInvalidValue(sourceVal, iteratorExp, "Failed to load '" + staticCompleteOperation.getImplementationClass() + "'", null);
			}
			if (!(implementation instanceof Value.BinaryOperation)) {
				return valueFactory.createInvalidValue(sourceVal, iteratorExp, "'<' is not a binary operation", null);
			}
			binaryImplementation = (BinaryOperation) implementation;
		} catch (Exception e) {
			return valueFactory.createInvalidValue(sourceVal, iteratorExp, "Failed to load '" + staticCompleteOperation.getImplementationClass() + "'", e);
		}
		SortingValue accumulatorValue = new SortingValue(evaluationEnvironment, sourceVal, iteratorExp, binaryImplementation);
		return evaluateIteration(evaluationVisitor, (CollectionValue) sourceVal, iteratorExp, accumulatorValue);
	}
	
	@Override
	protected Value resolveTerminalValue(EvaluationEnvironment env, SortingValue accumulatorValue) {
		return accumulatorValue.createSortedValue();
	}

	@Override
    protected Value updateAccumulator(EvaluationVisitor evaluationVisitor, List<? extends VariableDeclaration> iterators,
    		OclExpression body, SortingValue accumulatorValue) {
		Value bodyVal = body.accept(evaluationVisitor);		
		if (bodyVal.isUndefined()) {
			return bodyVal.toInvalidValue();				// Null body is invalid
		}
		// must have exactly one iterator
		EvaluationEnvironment env = evaluationVisitor.getEvaluationEnvironment();
		String iterName = iterators.get(0).getName();
		Value iterVal = env.getValueOf(iterName);
		accumulatorValue.put(iterVal, bodyVal);
		return null;										// Carry on
	}

	@Override
	public Diagnostic validate(PivotManager pivotManager, CallExp callExp) {
		Iteration iteration = ((LoopExp)callExp).getReferredIteration();
		Type type = ((LoopExp)callExp).getBody().getType();
		Operation operation = pivotManager.resolveOperation(type, "<", type);
		try {
			if (operation == null) {
				return new Warning(OCLMessages.WarningUndefinedOperation, "<", type);
			}
			CallableImplementation implementation = pivotManager.getImplementation(operation);
			if (implementation == null) {
				return new Warning("Failed to load '" + operation.getImplementationClass() + "'");
			}
			else if (!(implementation instanceof Value.BinaryOperation)) {
				return new Warning(type.toString() + "::_'<'(" + type.toString() + ") is not a binary operation");
			}
			else {
				return null;
			}
		} catch (Exception e) {
			return new Warning("Failed to load '" + operation.getImplementationClass() + "'");  //, e);
		}
	}
	
	public static class Warning extends BasicDiagnostic
	{
		public Warning(String messageTemplate, Object... bindings) {
			super("Validation", WARNING, NLS.bind(messageTemplate, bindings), null);
		}
	}
}
