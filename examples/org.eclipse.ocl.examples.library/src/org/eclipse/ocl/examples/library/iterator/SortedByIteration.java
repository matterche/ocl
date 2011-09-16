/**
 * <copyright>
 *
 * Copyright (c) 2009,2011 E.D.Willink and others.
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
 * $Id: SortedByIteration.java,v 1.9 2011/05/20 15:26:37 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.DomainIterationManager;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractIteration;
import org.eclipse.ocl.examples.domain.library.EvaluatorSingleIterationManager;
import org.eclipse.ocl.examples.domain.library.LibraryBinaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryValidator;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.types.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.IntegerValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.impl.AbstractValue;

/**
 * SelectIteration realizes the Collection::sortedBy() library iteration.
 */
public class SortedByIteration extends AbstractIteration
{
	protected static class SortingValue extends AbstractValue implements Comparator<Value>
	{
		private final DomainEvaluator evaluator;
		private final Map<Value, Value> content = new HashMap<Value, Value>();	// User object to sortedBy value
		private final DomainType iteratorType;
		private final LibraryBinaryOperation implementation;

		public SortingValue(DomainEvaluator evaluator, DomainType returnType, LibraryBinaryOperation implementation) {
			super(evaluator.getValueFactory(), returnType);
			this.evaluator = evaluator;
			this.iteratorType = valueFactory.getStandardLibrary().getIntegerType();
			this.implementation = implementation;
		}

		public Object asObject() {
			return content;
		}

		public Value asValidValue() {
			return this;
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
			try {
				IntegerValue comparison = implementation.evaluate(evaluator, iteratorType, v1, v2).asIntegerValue();
				return comparison.signum();
			} catch (InvalidValueException e) {
				evaluator.throwInvalidEvaluation(e);
			}
			return 0;
		}

		public Value createSortedValue() {
			List<Value> result = new ArrayList<Value>(content.keySet());
			Collections.sort(result, this);
			boolean isUnique = type.isUnique();
			return valueFactory.createCollectionValue(true, isUnique, type, result);
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
	private static LibraryValidator validator = null; 

	public SortedByIteration.SortingValue createAccumulatorValue(DomainEvaluator evaluator, DomainType accumulatorType, DomainType iteratorType) throws InvalidValueException {
		DomainStandardLibrary standardLibrary = evaluator.getValueFactory().getStandardLibrary();
		DomainType comparableType = standardLibrary.getOclComparableType();
		DomainOperation staticOperation = standardLibrary.lookupOperation(comparableType, EvaluatorMessages.CompareToOperation, comparableType);
		DomainOperation dynamicOperation = standardLibrary.lookupDynamicOperation(iteratorType, staticOperation);
		try {
			LibraryBinaryOperation implementation = (LibraryBinaryOperation) standardLibrary.lookupImplementation(dynamicOperation);
			return new SortingValue(evaluator, accumulatorType, implementation);
		} catch (Exception e) {
			throw new InvalidValueException(e);
		}
	}

	@Override
	public LibraryValidator getValidator(DomainStandardLibrary standardLibrary) {
		if (validator == null) {
			validator = getLibraryValidator(standardLibrary, "org.eclipse.ocl.examples.pivot.library.validators.ValidateSortedByIteration"); //$NON-NLS-1$
		}
		return validator;
	}
	
	@Override
	protected Value resolveTerminalValue(DomainIterationManager iterationManager) {
		SortingValue accumulatorValue = (SortingValue) iterationManager.getAccumulatorValue();
		return accumulatorValue.createSortedValue();
	}

	@Override
    protected Value updateAccumulator(DomainIterationManager iterationManager) {
		Value bodyVal = iterationManager.evaluateBody();		
		if (bodyVal.isUndefined()) {
			return iterationManager.throwInvalidEvaluation(EvaluatorMessages.UndefinedBody, "sortedBy"); 	// Null body is invalid //$NON-NLS-1$
		}
		EvaluatorSingleIterationManager singleIterationManager = (EvaluatorSingleIterationManager) iterationManager;
		Value iterValue = singleIterationManager.get();		
		SortingValue accumulatorValue = (SortingValue) iterationManager.getAccumulatorValue();
		accumulatorValue.put(iterValue, bodyVal);
		return null;										// Carry on
	}
}
