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
 * $Id: CollectionSumOperation.java,v 1.3 2011/02/21 08:37:46 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractUnaryOperation;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.integer.IntegerPlusOperation;
import org.eclipse.ocl.examples.library.real.RealPlusOperation;

/**
 * CollectionSumOperation realises the Collection::sum() library operation.
 */
public class CollectionSumOperation extends AbstractUnaryOperation
{
	public static final CollectionSumOperation INSTANCE = new CollectionSumOperation();

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceVal) throws InvalidValueException {
		ValueFactory valueFactory = evaluator.getValueFactory();
		CollectionValue collectionValue = sourceVal.asCollectionValue();
		// FIXME Bug 301351 Look for user-defined zero
//			resultType.getZero();
		DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
		if (returnType.conformsTo(standardLibrary, standardLibrary.getIntegerType())) {
			return collectionValue.sum(evaluator, returnType, IntegerPlusOperation.INSTANCE, valueFactory.integerValueOf(0));
		}
		else {
			return collectionValue.sum(evaluator, returnType, RealPlusOperation.INSTANCE, valueFactory.realValueOf(0.0));
		}
	}
}
