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
 * $Id: CollectionNotEqualOperation.java,v 1.1.2.1 2010/10/01 13:28:34 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import java.util.Collection;

/**
 * CollectionNotEqualOperation realises the Collection::<>() library operation.
 * 
 * @since 3.1
 */
public class CollectionNotEqualOperation extends CollectionEqualOperation
{
	public static final CollectionNotEqualOperation INSTANCE = new CollectionNotEqualOperation();

	@Override
	protected Boolean evaluateCollection(Collection<?> sourceVal, Collection<?> argVal) {
		return !super.evaluateCollection(sourceVal, argVal);
	}
	
	@Override
	protected Boolean evaluateInvalid(Object sourceVal, Object argVal) {
		return !super.evaluateInvalid(sourceVal, argVal);
	}
	
	@Override
	protected Boolean evaluateNonCollection(Object sourceVal, Object argVal) {
		return !super.evaluateNonCollection(sourceVal, argVal);
	}

	@Override
	protected Boolean evaluateNull(Object sourceVal, Object argVal) {
		return !super.evaluateNull(sourceVal, argVal);
	}
}
