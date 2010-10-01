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
 * $Id: AbstractCollectionUnaryOperation.java,v 1.1.2.1 2010/10/01 13:28:34 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import java.util.Collection;
import java.util.Set;

import org.eclipse.ocl.examples.library.AbstractUnaryOperation;
import org.eclipse.ocl.util.CollectionUtil;

/**
 * AbstractCollectionUnaryOperation provides the standard null to Bag{}
 * conversion for all unary collection operations.
 * 
 * @since 3.1
 */
public abstract class AbstractCollectionUnaryOperation extends AbstractUnaryOperation
{
	public Object evaluate(Object argument) {
		if (isInvalid(argument)) {
			return null;
		}
		else if (isNull(argument)) {
			return evaluateCollection(CollectionUtil.createNewBag());
		}
		else if (argument instanceof Collection<?>) {
			return evaluateCollection((Collection<?>)argument);
		}
		else {
			Set<Object> sourceSet = CollectionUtil.createNewSet();
			sourceSet.add(argument);
			return evaluateCollection(sourceSet);
		}
	}
	
	protected abstract Object evaluateCollection(Collection<?> sourceVal);
}
