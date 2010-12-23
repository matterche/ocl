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
 * $Id: TupleEqualOperation.java,v 1.1.2.2 2010/12/23 19:24:50 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.tuple;

import org.eclipse.ocl.examples.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.pivot.values.BooleanValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * TupleEqualOperation realises the Tuple::=() library operation.
 * 
 * @since 3.1
 */
public class TupleEqualOperation extends AbstractBinaryOperation
{
	public static final TupleEqualOperation INSTANCE = new TupleEqualOperation();

	public BooleanValue evaluate(Value left, Value right) {
		if (left.isInvalid() && right.isInvalid()) {
			return BooleanValue.TRUE;
		}
		if (left.isNull() && right.isNull()) {
			return BooleanValue.TRUE;
		}
		if (left.isUndefined() && right.isUndefined()) {
			return BooleanValue.FALSE;
		}	
		return BooleanValue.valueOf(left.equals(right));
	}
}
