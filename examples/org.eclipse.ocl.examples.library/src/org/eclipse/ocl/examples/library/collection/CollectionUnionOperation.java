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
 * $Id: CollectionUnionOperation.java,v 1.1.2.2 2010/10/05 17:29:59 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import java.util.Collection;

import org.eclipse.ocl.examples.pivot.values.CollectionUtil;

/**
 * CollectionUnionOperation realises the Collection::union() library operation.
 * 
 * @since 3.1
 */
public class CollectionUnionOperation extends AbstractCollectionPairedOperation
{
	public static final CollectionUnionOperation INSTANCE = new CollectionUnionOperation();

	@Override
	protected Object evaluateCollection(Collection<?> sourceVal, Collection<?> argVal) {
		return CollectionUtil.union(sourceVal, argVal);
	}
}
