/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: UnlimitedValueImpl.java,v 1.1.2.1 2010/12/26 15:21:27 ewillink Exp $
 */
/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: UnlimitedValueImpl.java,v 1.1.2.1 2010/12/26 15:21:27 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values.impl;

import java.math.BigDecimal;

import org.eclipse.ocl.examples.pivot.values.IntegerValue;
import org.eclipse.ocl.examples.pivot.values.NumericValue;
import org.eclipse.ocl.examples.pivot.values.UnlimitedValue;

public class UnlimitedValueImpl extends AbstractValue implements UnlimitedValue
{
	public UnlimitedValueImpl() {}

	public UnlimitedValueImpl abs() {
		return this;
	}

	public BigDecimal bigDecimalValue() {
		return null;
//		throw new UnsupportedOperationException(getClass().getName()+ ".bigDecimalValue");
//		return BigDecimal.valueOf(Double.POSITIVE_INFINITY);
	}

	public int compareTo(NumericValue o) {
		throw new UnsupportedOperationException(getClass().getName()+ ".compareTo");
	}

	public double doubleValue() {
		throw new UnsupportedOperationException(getClass().getName()+ ".doubleValue");
	}

	@Override
	public boolean isUnlimited() {
		return true;
	}

	@Override
	public boolean isUnlimitedNatural() {
		return true;
	}

	public UnlimitedValue negate() {
		return createInvalidValue("negated UnlimitedValue");
	}

	public int signum() {
		return 1;
	}

	public IntegerValue toIntegerValue() {
		return createInvalidValue("non-integer UnlimitedValue");
	}

	@Override
	public String toString() {
		return "*";
	}

//	public <T extends NumericValue> T toValue(Class<T> numericClass) {
//		if (numericClass == UnlimitedValueImpl.class) {
//			return (T) this;
//		}
//		return (T) ValueUtils.createInvalidValue(numericClass, null, "unsupported UnlimitedValue", null);
//	}
}
