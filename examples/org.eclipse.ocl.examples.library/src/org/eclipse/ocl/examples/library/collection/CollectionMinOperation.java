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
 * $Id: CollectionMinOperation.java,v 1.3 2011/02/21 08:37:46 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractUnaryOperation;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.library.numeric.NumericMinOperation;

/**
 * CollectionMinOperation realises the Collection::min() library operation.
 */
public class CollectionMinOperation extends AbstractUnaryOperation
{
	public static final CollectionMinOperation INSTANCE = new CollectionMinOperation();

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceVal) throws InvalidValueException {
		CollectionValue collectionValue = sourceVal.asCollectionValue();
		// FIXME Bug 301351 Look for user-defined min
		return collectionValue.maxMin(evaluator, returnType, NumericMinOperation.INSTANCE);
	}
}
