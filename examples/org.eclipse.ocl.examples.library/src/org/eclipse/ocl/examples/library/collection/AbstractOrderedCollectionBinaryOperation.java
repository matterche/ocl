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
 * $Id: AbstractOrderedCollectionBinaryOperation.java,v 1.1.2.1 2010/10/01 13:28:34 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import java.util.Collection;

import org.eclipse.ocl.examples.library.AbstractBinaryOperation;

/**
 * AbstractOrderedCollectionBinaryOperation provides the standard null to Bag{}
 * conversion for all binary ordered collection operations.
 * 
 * @since 3.1
 */
public abstract class AbstractOrderedCollectionBinaryOperation extends AbstractBinaryOperation
{
	public Object evaluate(Object left, Object right) {
		if (isInvalid(left) || isInvalid(right)) {
			return null;
		}		
		if (isOrderedCollection(left)) {
			return evaluateCollection((Collection<?>)left, right);
		}
		else {
			return null;
		}
	}

	protected abstract Object evaluateCollection(Collection<?> sourceVal, Object argVal);
}
