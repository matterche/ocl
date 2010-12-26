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
 * $Id: AbstractCollectionBinaryOperation.java,v 1.1.2.3 2010/12/26 15:20:28 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import org.eclipse.ocl.examples.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.pivot.values.CollectionValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * AbstractCollectionBinaryOperation provides the standard null to Bag{}
 * conversion for all binary collection operations.
 * 
 * @since 3.1
 */
public abstract class AbstractCollectionBinaryOperation extends AbstractBinaryOperation
{
	public Value evaluate(Value left, Value right) {
		if (left.isInvalid() || right.isInvalid()) {
			return evaluateInvalid(left, right);
		}		
		if (left.isNull()) {
			return evaluateNull(left, right);
		}		
		CollectionValue leftCollectionValue = left.asCollectionValue();
		if (leftCollectionValue != null) {
			return evaluateCollection(leftCollectionValue, right);
		}
		else {
			return evaluateNonCollection(left, right);
		}
	}
	
	protected abstract Value evaluateCollection(CollectionValue sourceVal, Value argVal);
	
	protected Value evaluateInvalid(Value sourceVal, Value argVal) {
		if (sourceVal.isInvalid()) {
			return sourceVal;
		}
		else {
			return argVal;
		}
	}
	
	protected Value evaluateNonCollection(Value sourceVal, Value argVal) {
		if (sourceVal.asCollectionValue() == null) {
			return createInvalidValue(sourceVal, null, "non-collection", null);
		}
		else {
			return createInvalidValue(argVal, null, "non-collection", null);
		}
	}
	
	protected Value evaluateNull(Value sourceVal, Value argVal) {
		if (sourceVal.isNull()) {
			return createInvalidValue(sourceVal, null, "non-collection", null);
		}
		else {
			return createInvalidValue(argVal, null, "non-collection", null);
		}
	}
}
