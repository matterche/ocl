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
 * $Id: OrderedCollectionInsertAtOperation.java,v 1.1.2.1 2010/01/20 06:07:48 ewillink Exp $
 */
package org.eclipse.ocl.library.collection;

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.ocl.util.CollectionUtil;

/**
 * OrderedCollectionInsertAtOperation realises the OrderedCollection::insertAt() library operation.
 * 
 * @since 3.0
 */
public class OrderedCollectionInsertAtOperation extends AbstractOrderedCollectionTernaryOperation
{
	@Override
	protected Object evaluateCollection(Collection<?> sourceVal, Object argVal1, Object argVal2) {
		if (!(argVal1 instanceof BigInteger)) {
			return null;
		}
		@SuppressWarnings("unchecked")
		Collection<Object> sourceColl = (Collection<Object>)sourceVal;
		return CollectionUtil.insertAt(sourceColl, ((BigInteger)argVal1).intValue(), argVal2);
	}
}
