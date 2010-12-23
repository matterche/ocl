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
 * $Id: UnlimitedValue.java,v 1.1.2.1 2010/12/23 19:25:10 ewillink Exp $
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
 * $Id: UnlimitedValue.java,v 1.1.2.1 2010/12/23 19:25:10 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values;

import java.math.BigDecimal;



public class UnlimitedValue extends AbstractValue implements NumericValue
{
	public final static UnlimitedValue INSTANCE = new UnlimitedValue(); 
	
	private UnlimitedValue() {}

	public Value abs() {
		return this;
	}

	public BigDecimal bigDecimalValue() {
		throw new UnsupportedOperationException(getClass().getName()+ ".bigDecimalValue");
//		return BigDecimal.valueOf(Double.POSITIVE_INFINITY);
	}

	public int compareTo(NumericValue o) {
		throw new UnsupportedOperationException(getClass().getName()+ ".compareTo");
	}

	public double doubleValue() {
		throw new UnsupportedOperationException(getClass().getName()+ ".doubleValue");
//		return Double.POSITIVE_INFINITY;
	}

	@Override
	public boolean isUnlimited() {
		return true;
	}

	@Override
	public boolean isUnlimitedNatural() {
		return true;
	}

	public Value negate() {
		throw new UnsupportedOperationException(getClass().getName()+ ".negate");
//		return createInvalidValue("Negated Unlimited value");
	}

	@Override
	public String toString() {
		return "*";
	}
}
