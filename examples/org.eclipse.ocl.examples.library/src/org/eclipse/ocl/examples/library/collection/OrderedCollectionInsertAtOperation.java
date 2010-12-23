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
 * $Id: OrderedCollectionInsertAtOperation.java,v 1.1.2.3 2010/12/23 19:24:48 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import org.eclipse.ocl.examples.pivot.values.InvalidValue;
import org.eclipse.ocl.examples.pivot.values.OrderedCollectionValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * OrderedCollectionInsertAtOperation realises the OrderedCollection::insertAt() library operation.
 * 
 * @since 3.1
 */
public class OrderedCollectionInsertAtOperation extends AbstractOrderedCollectionTernaryOperation
{
	public static final OrderedCollectionInsertAtOperation INSTANCE = new OrderedCollectionInsertAtOperation();

	@Override
	protected Value evaluateCollection(OrderedCollectionValue sourceVal, Value argVal1, Value argVal2) {
		OrderedCollectionValue selfValue = sourceVal.asOrderedCollectionValue();
		if (selfValue == null) {
			return new InvalidValue(sourceVal, null, "Invalid self for insertAt", null);
		}
		Integer indexValue = argVal1.asInteger();
		if (indexValue == null) {
			return new InvalidValue(argVal1, null, "Invalid index for insertAt", null);
		}
		if (argVal2.isInvalid()) {
			return null;
		}
		return selfValue.insertAt(indexValue, argVal2);
	}
}
