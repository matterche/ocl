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
 * $Id: AbstractCollectionTernaryOperation.java,v 1.1.2.1 2010/10/01 13:28:34 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import java.util.Collection;
import java.util.Set;

import org.eclipse.ocl.examples.library.AbstractTernaryOperation;
import org.eclipse.ocl.util.CollectionUtil;

/**
 * AbstractCollectionTernaryOperation provides the standard null to Bag{}
 * conversion for all ternary collection operations.
 * 
 * @since 3.1
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