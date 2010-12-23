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
 * $Id: CollectionEqualOperation.java,v 1.1.2.3 2010/12/23 19:24:48 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import org.eclipse.ocl.examples.pivot.values.BooleanValue;
import org.eclipse.ocl.examples.pivot.values.CollectionValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * CollectionEqualOperation realises the Collection::=() library operation.
 * 
 * @since 3.1
 */
public class CollectionEqualOperation extends AbstractCollectionPairedOperation
{
	public static final CollectionEqualOperation INSTANCE = new CollectionEqualOperation();

	@Override
	protected BooleanValue evaluateCollection(CollectionValue sourceVal, CollectionValue argVal) {
		return BooleanValue.valueOf(sourceVal.equals(argVal));
	}
	
	@Override
	protected BooleanValue evaluateInvalid(Value sourceVal, Value argVal) {
		return BooleanValue.valueOf(sourceVal.isInvalid() && argVal.isInvalid());
	}
	
	@Override
	protected BooleanValue evaluateNonCollection(Value sourceVal, Value argVal) {
		return BooleanValue.FALSE;
	}

	@Override
	protected BooleanValue evaluateNull(Value sourceVal, Value argVal) {
		return BooleanValue.valueOf(sourceVal.isNull() && argVal.isNull());
	}
}
