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
 * $Id: CollectionMaxOperation.java,v 1.1.2.1 2010/10/01 13:28:35 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import java.util.Collection;

import org.eclipse.ocl.examples.library.numeric.NumericMaxOperation;
import org.eclipse.ocl.examples.library.util.CollectionUtil2;

/**
 * CollectionMaxOperation realises the Collection::max() library operation.
 * 
 * @since 3.1
 */
public class CollectionMaxOperation extends AbstractCollectionUnaryOperation
{
	public static final CollectionMaxOperation INSTANCE = new CollectionMaxOperation();

	@Override
	protected Object evaluateCollection(Collection<?> sourceVal) {
		// FIXME Bug 301351 Look for user-defined max
		return CollectionUtil2.maxMin(sourceVal, new NumericMaxOperation());
	}
}
