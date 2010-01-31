/**
 * <copyright>
 *
 * Copyright (c) 2009 Eclipse Modeling Project and others.
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
 * $Id: AbstractCollectionPairedOperation.java,v 1.1.2.1 2010/01/31 22:23:47 ewillink Exp $
 */
package org.eclipse.ocl.library.features.collection;

import java.util.Collection;

import org.eclipse.ocl.library.features.AbstractBinaryOperation;

/**
 * AbstractCollectionPairedOperation provides the standard null to Bag{}
 * conversion for all symmetrical binary collection operations.
 * 
 * @since 3.0
 */
public abstract class AbstractCollectionPairedOperation extends AbstractBinaryOperation
{
	public Object evaluate(Object left, Object right) {
		if (isInvalid(left) || isInvalid(right)) {
			return evaluateInvalid(left, right);
		}		
		if (isNull(left) || isNull(right)) {
			return evaluateNull(left, right);
		}		
//		Collection<?> sourceColl = convertToCollection(sourceVal);
//		Collection<?> argColl = convertToCollection(argVal);		// FIXME Pass target collection kind
		if ((left instanceof Collection<?>) && (right instanceof Collection<?>)) {
			return evaluateCollection((Collection<?>)left, (Collection<?>)right);
		}
		else {
			return evaluateNonCollection(left, right);
		}
	}
	
	protected abstract Object evaluateCollection(Collection<?> sourceVal, Collection<?> argVal);
	
	protected Object evaluateInvalid(Object sourceVal, Object argVal) {
		return null;
	}
	
	protected Object evaluateNonCollection(Object sourceVal, Object argVal) {
		return null;
	}
	
	protected Object evaluateNull(Object sourceVal, Object argVal) {
		return null;
	}
}
