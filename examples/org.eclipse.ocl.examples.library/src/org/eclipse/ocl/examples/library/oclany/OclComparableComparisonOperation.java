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
 * $Id: NumericGreaterThanEqualOperation.java,v 1.2 2011/01/24 19:56:31 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.oclany;

import org.eclipse.ocl.examples.domain.elements.DomainInheritance;
import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryBinaryOperation;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

/**
 * OclComparableComparisonOperation provides the abstract support for a comparison operation.
 */
public abstract class OclComparableComparisonOperation extends AbstractBinaryOperation
{
	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value left, Value right) throws InvalidValueException {
		ValueFactory valueFactory = evaluator.getValueFactory();
		DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
		DomainInheritance leftType = left.getType().getInheritance(standardLibrary);
		DomainInheritance rightType = right.getType().getInheritance(standardLibrary);
		DomainInheritance commonType = leftType.getCommonInheritance(rightType);
		DomainInheritance comparableType = standardLibrary.getOclComparableType().getInheritance(standardLibrary);
		DomainInheritance selfType = standardLibrary.getOclSelfType().getInheritance(standardLibrary);
		DomainOperation staticOperation = comparableType.lookupLocalOperation(standardLibrary, EvaluatorMessages.CompareToOperation, selfType);
		int intComparison;
		LibraryBinaryOperation implementation;
		try {
			implementation = (LibraryBinaryOperation) commonType.lookupImplementation(standardLibrary, staticOperation);
		} catch (Exception e) {
			throw new InvalidValueException(e);
		}
		if (implementation != null) {
			Value comparison = implementation.evaluate(evaluator, standardLibrary.getIntegerType(), left, right);
			intComparison = comparison.asInteger();
		}
		else {
			Object leftObject = left.asObject();
			Object rightObject = right.asObject();
			if (!(leftObject instanceof Comparable<?>)) {
				return valueFactory.throwInvalidValueException("Unsupported compareTo for ''{0}''", left.getClass().getName()); //$NON-NLS-1$
			}
			@SuppressWarnings("unchecked")
			int comparison = ((Comparable<Object>)leftObject).compareTo(rightObject);
			intComparison = comparison;
		}
		return valueFactory.booleanValueOf(getResultValue(intComparison));
	}

	protected abstract boolean getResultValue(Integer comparison);
}
