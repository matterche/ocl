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
 * $Id: ClosureIteration.java,v 1.7 2011/05/07 16:41:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.iterator;

import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.DomainIterationManager;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractIteration;
import org.eclipse.ocl.examples.domain.library.LibraryValidator;
import org.eclipse.ocl.examples.domain.types.DomainCollectionType;
import org.eclipse.ocl.examples.domain.types.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

/**
 * ClosureIteration realizes the Collection::closure() library iteration.
 */
public class ClosureIteration extends AbstractIteration
{
	public static final ClosureIteration INSTANCE = new ClosureIteration();
	private static LibraryValidator validator = null; 

	public CollectionValue.Accumulator createAccumulatorValue(DomainEvaluator evaluator, DomainType accumulatorType, DomainType iteratorType) {
		return evaluator.getValueFactory().createCollectionAccumulatorValue((DomainCollectionType) accumulatorType);
	}

	@Override
	public LibraryValidator getValidator(DomainStandardLibrary standardLibrary) {
		if (validator == null) {
			validator = getLibraryValidator(standardLibrary, "org.eclipse.ocl.examples.pivot.library.validators.ValidateClosureIteration"); //$NON-NLS-1$
		}
		return validator;
	}

	/**
	 * Recursively evaluates the iterator body expression.
	 */
    @Override
	protected Value updateAccumulator(DomainIterationManager iterationManager) {
		if (!iterationManager.isOuterIteration()) {
			// If there is the parent is the iterator
			Value value = iterationManager.get();
			CollectionValue.Accumulator accumulatorValue = (CollectionValue.Accumulator)iterationManager.getAccumulatorValue();
			if (!accumulatorValue.add(value)) {
				return accumulatorValue;
			}
		}
		Value bodyVal = iterationManager.evaluateBody();		
		if (bodyVal.isInvalid()) {
			return bodyVal;									// Invalid body is invalid
		}
		else if (bodyVal.isUndefined()) {
			return iterationManager.getAccumulatorValue();		// Null body is termination
		}
		else {
			try {
				CollectionValue collectionValue;
				if (bodyVal instanceof CollectionValue) {
					collectionValue = (CollectionValue) bodyVal;
				}
				else {
					ValueFactory valueFactory = iterationManager.getValueFactory();
					collectionValue = valueFactory.createSequenceValue(valueFactory.getStandardLibrary().getSequenceType(bodyVal.getType()), bodyVal);
				}
				evaluateIteration(iterationManager.createNestedIterationManager(collectionValue));
			} catch (InvalidValueException e) {
				iterationManager.throwInvalidEvaluation(e);
			}
			return null;
		}
	}
}
