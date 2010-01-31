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
 * $Id: AbstractCollectionTernaryOperation.java,v 1.1.2.2 2010/01/31 08:43:26 ewillink Exp $
 */
package org.eclipse.ocl.library.operations.collection;

import java.util.Collection;
import java.util.Set;

import org.eclipse.ocl.library.operations.AbstractTernaryOperation;
import org.eclipse.ocl.util.CollectionUtil;

/**
 * AbstractCollectionTernaryOperation provides the standard null to Bag{}
 * conversion for all ternary collection operations.
 * 
 * @since 3.0
 */
public abstract class AbstractCollectionTernaryOperation extends AbstractTernaryOperation
{
	public Object evaluate(Object source, Object arg1, Object arg2) {
		if (isInvalid(source) || isInvalid(arg1) || isInvalid(arg2)) {
			return null;
		}		
		if (isNull(source)) {
			return evaluateCollection(CollectionUtil.createNewBag(), arg1, arg2);
		}
		else if (source instanceof Collection<?>) {
			return evaluateCollection((Collection<?>)source, arg1, arg2);
		}
		else {
			Set<Object> sourceSet = CollectionUtil.createNewSet();
			sourceSet.add(source);
			return evaluateCollection(sourceSet, arg1, arg2);
		}
	}
	
	protected abstract Object evaluateCollection(Collection<?> sourceVal, Object argVal1, Object argVal2);
}
