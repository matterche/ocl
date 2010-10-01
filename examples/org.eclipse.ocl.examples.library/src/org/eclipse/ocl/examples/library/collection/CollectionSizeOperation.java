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
 * $Id: CollectionSizeOperation.java,v 1.1.2.1 2010/10/01 13:28:35 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import java.math.BigInteger;
import java.util.Collection;

/**
 * CollectionSizeOperation realises the Collection::size() library operation.
 * 
 * @since 3.1
 */
public class CollectionSizeOperation extends AbstractCollectionUnaryOperation
{
	public static final CollectionSizeOperation INSTANCE = new CollectionSizeOperation();

	@Override
	protected Object evaluateCollection(Collection<?> sourceVal) {
		return BigInteger.valueOf(sourceVal.size());
	}
}
