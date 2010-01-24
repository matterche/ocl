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
 * $Id: CollectionSumOperation.java,v 1.1.2.1 2010/01/24 07:41:07 ewillink Exp $
 */
package org.eclipse.ocl.library.operations.collection;

import java.util.Collection;

import org.eclipse.ocl.util.CollectionUtil;

/**
 * CollectionSumOperation realises the Collection::sum() library operation.
 * 
 * @since 3.0
 */
public class CollectionSumOperation extends AbstractCollectionUnaryOperation
{
	@Override
	protected Object evaluateCollection(Collection<?> sourceVal) {
		return CollectionUtil.sum(sourceVal);
			
/*			if (num == null) {
				// empty collection
				@SuppressWarnings("unchecked")
				CollectionType<C, O> numCollType = (CollectionType<C, O>) sourceType;
				C numType = numCollType.getElementType();
				
				if (numType == getReal()) {
					num = new Double(0.0);
				} else if (numType == getInteger()) {
					num = new Integer(0);
				}
			}
			
			return num; */
	}
}
