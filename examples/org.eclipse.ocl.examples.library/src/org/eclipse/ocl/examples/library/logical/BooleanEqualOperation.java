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
 * $Id: BooleanEqualOperation.java,v 1.1.2.2 2010/12/23 19:24:49 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.logical;

import org.eclipse.ocl.examples.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.pivot.values.BooleanValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * BooleanEqualOperation realises the Boolean::=() library operation.
 * 
 * @since 3.1
 */
public class BooleanEqualOperation extends AbstractBinaryOperation
{
	public static final BooleanEqualOperation INSTANCE = new BooleanEqualOperation();

	public BooleanValue evaluate(Value left, Value right) {
		BooleanValue leftBoolean = left.asBooleanValue();
		BooleanValue rightBoolean = right.asBooleanValue();
		if ((leftBoolean != null) && (rightBoolean != null)) {
			return BooleanValue.valueOf(leftBoolean == rightBoolean);
		}
		if (left.isInvalid() && right.isInvalid()) {
			return BooleanValue.TRUE;
		}
		if (left.isNull() && right.isNull()) {
			return BooleanValue.TRUE;
		}			
		return BooleanValue.FALSE;
	}
}
