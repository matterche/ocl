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
 * $Id: CollectionMaxOperation.java,v 1.1.2.2 2010/01/31 08:43:26 ewillink Exp $
 */
package org.eclipse.ocl.library.operations.collection;

import java.util.Collection;

import org.eclipse.ocl.library.operations.numeric.NumericMaxOperation;
import org.eclipse.ocl.util.CollectionUtil;

/**
 * CollectionMaxOperation realises the Collection::max() library operation.
 * 
 * @since 3.0
 */
public class CollectionMaxOperation extends AbstractCollectionUnaryOperation
{
	@Override
	protected Object evaluateCollection(Collection<?> sourceVal) {
		// FIXME Bug 301351 Look for user-defined max
		return CollectionUtil.maxMin(sourceVal, new NumericMaxOperation());
	}
}
