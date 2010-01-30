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
 * $Id: CollectionEqualOperation.java,v 1.1.2.3 2010/01/30 20:15:35 ewillink Exp $
 */
package org.eclipse.ocl.library.operations.collection;

import java.util.Collection;

import org.eclipse.ocl.util.CollectionUtil;

/**
 * CollectionEqualOperation realises the Collection::=() library operation.
 * 
 * @since 3.0
 */
public class CollectionEqualOperation extends AbstractCollectionPairedOperation
{
	@Override
	protected Boolean evaluateCollection(Collection<?> sourceVal, Collection<?> argVal) {
		return CollectionUtil.equals(sourceVal, argVal);
	}
	
	@Override
	protected Boolean evaluateInvalid(Object sourceVal, Object argVal) {
		return isInvalid(sourceVal) && isInvalid(argVal);
	}
	
	@Override
	protected Boolean evaluateNonCollection(Object sourceVal, Object argVal) {
		return Boolean.FALSE;
	}

	@Override
	protected Boolean evaluateNull(Object sourceVal, Object argVal) {
		return isNull(sourceVal) && isNull(argVal);
	}
}
