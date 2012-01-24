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
 * $Id: OrderedCollectionInsertAtOperation.java,v 1.3 2011/02/21 08:37:46 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractTernaryOperation;
import org.eclipse.ocl.examples.domain.values.SequenceValue;
import org.eclipse.ocl.examples.domain.values.Value;

/**
 * OrderedCollectionInsertAtOperation realises the OrderedCollection::insertAt() library operation.
 */
public class OrderedCollectionInsertAtOperation extends AbstractTernaryOperation
{
	public static final OrderedCollectionInsertAtOperation INSTANCE = new OrderedCollectionInsertAtOperation();

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value firstArgumentValue, Value secondArgumentValue) throws InvalidValueException {
		SequenceValue selfValue = sourceValue.asSequenceValue();
		Integer indexValue = firstArgumentValue.asInteger();
		Value insertValue = secondArgumentValue.asValidValue();
		return selfValue.insertAt(indexValue, insertValue);
	}
}
