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
 * $Id: CollectionAsBagOperation.java,v 1.1.2.1 2010/01/24 07:41:06 ewillink Exp $
 */
package org.eclipse.ocl.library.operations.collection;

import java.util.Collection;

import org.eclipse.ocl.util.CollectionUtil;

/**
 * CollectionAsBagOperation realises the Collection::asBag() library operation.
 * 
 * @since 3.0
 */
public class CollectionAsBagOperation extends AbstractCollectionUnaryOperation
{
	@Override
	protected Object evaluateCollection(Collection<?> sourceVal) {
		return CollectionUtil.asBag(sourceVal);
	}
}
