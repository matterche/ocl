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
 * $Id: OrderedCollectionLastOperation.java,v 1.3 2011/02/21 08:37:46 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractUnaryOperation;
import org.eclipse.ocl.examples.domain.values.SequenceValue;
import org.eclipse.ocl.examples.domain.values.Value;

/**
 * OrderedCollectionLastOperation realises the OrderedCollection::last() library operation.
 */
public class OrderedCollectionLastOperation extends AbstractUnaryOperation
{
	public static final OrderedCollectionLastOperation INSTANCE = new OrderedCollectionLastOperation();

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value argument) throws InvalidValueException {
		SequenceValue orderedCollectionValue = argument.asSequenceValue();
		return orderedCollectionValue.last();
	}
}
