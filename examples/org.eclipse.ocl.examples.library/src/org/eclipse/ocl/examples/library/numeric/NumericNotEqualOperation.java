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
 * $Id: NumericNotEqualOperation.java,v 1.1.2.2 2010/12/23 19:24:49 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.numeric;

import org.eclipse.ocl.examples.pivot.values.BooleanValue;
import org.eclipse.ocl.examples.pivot.values.IntegerValue;
import org.eclipse.ocl.examples.pivot.values.RealValue;
import org.eclipse.ocl.examples.pivot.values.Value;


/**
 * NotEqualOperation realises the <>() library operation.
 * 
 * @since 3.1
 */
public class NumericNotEqualOperation extends NumericEqualOperation
{
	public static final NumericNotEqualOperation INSTANCE = new NumericNotEqualOperation();

	@Override
	protected BooleanValue evaluateInteger(IntegerValue left, IntegerValue right) {
		return BooleanValue.valueOfNot(super.evaluateInteger(left, right));
	}

	@Override
	protected BooleanValue evaluateInvalid(Value left, Value right) {
		return BooleanValue.valueOfNot(super.evaluateInvalid(left, right));
	}

	@Override
	protected BooleanValue evaluateNonNumeric(Value left, Value right) {
		return BooleanValue.valueOfNot(super.evaluateNonNumeric(left, right));
	}

	@Override
	protected BooleanValue evaluateNull(Value left, Value right) {
		return BooleanValue.valueOfNot(super.evaluateNull(left, right));
	}

	@Override
	protected BooleanValue evaluateReal(RealValue left, RealValue right) {
		return BooleanValue.valueOfNot(super.evaluateReal(left, right));
	}

	@Override
	protected BooleanValue evaluateUnlimited(Value left, Value right) {
		return BooleanValue.valueOfNot(super.evaluateUnlimited(left, right));
	}
}
