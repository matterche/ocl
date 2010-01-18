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
 * $Id: OrderedCollectionIndexOfOperation.java,v 1.1.2.1 2010/01/18 08:57:49 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.collection;

import java.util.Collection;

import org.eclipse.ocl.util.CollectionUtil;

/**
 * OrderedCollectionIndexOfOperation realises the OrderedCollection::indexOf() library operation.
 * 
 * @since 3.0
 */
public class OrderedCollectionIndexOfOperation extends AbstractOrderedCollectionBinaryOperation
{
	@Override
	protected Object evaluateCollection(Collection<?> sourceVal, Object argVal) {
		return CollectionUtil.indexOf(sourceVal, argVal);
	}
}
