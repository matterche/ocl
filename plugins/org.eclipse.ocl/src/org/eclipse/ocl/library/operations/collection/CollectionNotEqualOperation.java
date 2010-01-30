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
 * $Id: CollectionNotEqualOperation.java,v 1.1.2.2 2010/01/30 07:49:39 ewillink Exp $
 */
package org.eclipse.ocl.library.operations.collection;

import java.util.Collection;

/**
 * CollectionNotEqualOperation realises the Collection::<>() library operation.
 * 
 * @since 3.0
 */
public class CollectionNotEqualOperation extends CollectionEqualOperation
{
	@Override
	protected Boolean evaluateCollection(Collection<?> sourceVal, Collection<?> argVal) {
		return !super.evaluateCollection(sourceVal, argVal);
	}
	
	@Override
	protected Boolean evaluateInvalid(Object sourceVal, Object argVal) {
		return !super.evaluateInvalid(sourceVal, argVal);
	}
	
	@Override
	protected Boolean evaluateNull(Object sourceVal, Object argVal) {
		return !super.evaluateNull(sourceVal, argVal);
	}
}
