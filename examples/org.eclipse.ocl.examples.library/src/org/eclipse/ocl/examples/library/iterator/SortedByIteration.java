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
 * $Id: SortedByIteration.java,v 1.1.2.8 2011/01/12 10:28:53 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.ocl.examples.library.AbstractIteration;
import org.eclipse.ocl.examples.library.evaluation.IterationTemplate;
import org.eclipse.ocl.examples.library.evaluation.IterationTemplateSortedBy;
import org.eclipse.ocl.examples.pivot.CompleteOperation;
import org.eclipse.ocl.examples.pivot.LoopExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.VariableDeclaration;
import org.eclipse.ocl.examples.pivot.evaluation.CallableImplementation;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.utilities.CompleteEnvironmentManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.pivot.values.CollectionValue;
import org.eclipse.ocl.examples.pivot.values.Value;
import org.eclipse.ocl.examples.pivot.values.Value.BinaryOperation;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;

/**
 * SelectIteration realises the Collection::sortedBy() library iteration.
 * 
 * @since 3.1
 */
public class SortedByIteration extends AbstractIteration
{
	private static class SortedByComparator implements Comparator<Object>
	{	// FIXME faster version for when binaryImplementation has a compareTo sibling
		private final ValueFactory valueFactory;
		private final BinaryOperation binaryImplementation;
		private final Map<Object, Value> map;

		private SortedByComparator(ValueFactory valueFactory,
				BinaryOperation binaryImplementation, Map<Object, Value> map) {
			this.valueFactory = valueFactory;
			this.binaryImplementation = binaryImplementation;
			this.map = map;
		}

		public int compare(Object o1, Object o2) {
			if (o1 == o2) {
				return 0;
			}
			Value v1 = map.get(o1);
			Value v2 = map.get(o2);
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
		CallableImplementation implementation = staticCompleteOperation.getImplementation();
		if (implementation == null) {
			String implementationClassName = staticCompleteOperation.getImplementationClass();
			try {
				implementation = pivotManager.loadImplementationClass(implementationClassName);
			} catch (Exception e) {
				return valueFactory.createInvalidValue(sourceVal, iteratorExp, "Failed to load '" + implementationClassName + "'", e);
			}
			if (implementation == null) {
				return valueFactory.createInvalidValue(sourceVal, iteratorExp, "Failed to load '" + implementationClassName + "'", null);
			}
		}
		if (!(implementation instanceof Value.BinaryOperation)) {
			return valueFactory.createInvalidValue(sourceVal, iteratorExp, "'<' is not a binary operation", null);
		}
		Value.BinaryOperation binaryImplementation = (BinaryOperation) implementation;
		
		List<? extends VariableDeclaration> iterators = iteratorExp.getReferredIteration().getOwnedIterators();
		CollectionValue coll = (CollectionValue) sourceVal;
		// get an iteration template to evaluate the iterator
		IterationTemplate is = IterationTemplateSortedBy.getInstance(evaluationVisitor);
		// generate a name for the result variable and add it to the environment
		String resultName = generateName();
		Map<Object, Value> map = new HashMap<Object, Value>();
		IterationTemplateSortedBy.SortingValue workingValue = new IterationTemplateSortedBy.SortingValue(valueFactory, map);
		evaluationEnvironment.add(resultName, workingValue);		
		try {
			// evaluate to populate the element to body expression value map
			is.evaluate(coll, iterators, body, resultName);
		} finally {
			// remove result name from environment
			evaluationEnvironment.remove(resultName);
		}
		// put values in a sortable collection
		List<Value> result = new ArrayList<Value>(coll.asCollection());
		// sort based on the body expression values
		try {
			Collections.sort(result, new SortedByComparator(valueFactory, binaryImplementation, map));
		}
		catch (Exception e) {
			return valueFactory.createInvalidValue(sourceVal, iteratorExp, "'<' evaluation failed", null);
		}
		// create result from the sorted collection
		Type sourceType = iteratorExp.getSource().getType();
		boolean isUnique = pivotManager.isUnique(sourceType);
		return valueFactory.createCollectionValue(true, isUnique, result);
	}
}
