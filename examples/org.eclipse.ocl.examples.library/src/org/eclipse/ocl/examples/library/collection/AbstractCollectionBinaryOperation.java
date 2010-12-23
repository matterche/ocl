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
 * $Id: AbstractCollectionBinaryOperation.java,v 1.1.2.2 2010/12/23 19:24:48 ewillink Exp $
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
			return null;
		}		
		CollectionValue sourceColl = convertToCollection(left);
		return evaluateCollection(sourceColl, right);
	}
	
	protected abstract Value evaluateCollection(CollectionValue sourceVal, Value argVal);
}
