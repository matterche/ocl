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
 * $Id: AbstractCollectionPairedOperation.java,v 1.1.2.2 2010/12/23 19:24:48 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import org.eclipse.ocl.examples.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.pivot.values.CollectionValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * AbstractCollectionPairedOperation provides the standard null to Bag{}
 * conversion for all symmetrical binary collection operations.
 * 
 * @since 3.1
 */
public abstract class AbstractCollectionPairedOperation extends AbstractBinaryOperation
{
	public Value evaluate(Value left, Value right) {
		if (left.isInvalid() || right.isInvalid()) {
			return evaluateInvalid(left, right);
		}		
		if (left.isNull() || right.isNull()) {
			return evaluateNull(left, right);
		}		
//		Collection<?> sourceColl = convertToCollection(sourceVal);
//		Collection<?> argColl = convertToCollection(argVal);		// FIXME Pass target collection kind
		if ((left instanceof CollectionValue) && (right instanceof CollectionValue)) {
			return evaluateCollection((CollectionValue)left, (CollectionValue)right);
		}
		else {
			return evaluateNonCollection(left, right);
		}
	}
	
	protected abstract Value evaluateCollection(CollectionValue sourceVal, CollectionValue argVal);
	
	protected Value evaluateInvalid(Value sourceVal, Value argVal) {
		return null;
	}
	
	protected Value evaluateNonCollection(Value sourceVal, Value argVal) {
		return null;
	}
	
	protected Value evaluateNull(Value sourceVal, Value argVal) {
		return null;
	}
}
