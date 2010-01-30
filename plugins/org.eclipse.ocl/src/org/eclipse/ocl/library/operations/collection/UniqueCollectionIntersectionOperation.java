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
 * $Id: UniqueCollectionIntersectionOperation.java,v 1.1.2.1 2010/01/30 07:49:39 ewillink Exp $
 */
package org.eclipse.ocl.library.operations.collection;

import java.util.Collection;

import org.eclipse.ocl.util.CollectionUtil;

/**
 * UniqueCollectionIntersectionOperation realises the UniqueCollection::intersection() library operation.
 * 
 * @since 3.0
 */
public class UniqueCollectionIntersectionOperation extends AbstractCollectionPairedOperation
{
	@Override
	protected Object evaluateCollection(Collection<?> sourceVal, Collection<?> argVal) {
		return CollectionUtil.intersection(sourceVal, argVal);
	}
}
