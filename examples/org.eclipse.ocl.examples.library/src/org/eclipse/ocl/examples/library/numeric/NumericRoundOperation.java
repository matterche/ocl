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
 * $Id: NumericRoundOperation.java,v 1.1.2.1 2010/10/01 13:28:36 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.numeric;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;


/**
 * RoundOperation realises the round() library operation.
 * 
 * @since 3.1
 */
public class NumericRoundOperation extends AbstractNumericUnaryOperation
{
	public static final NumericRoundOperation INSTANCE = new NumericRoundOperation();

	@Override
	protected Object evaluateInteger(BigInteger left) {
		return left;
	}
	
	@Override
	protected Object evaluateReal(BigDecimal left) {
		BigDecimal rounded;
		if (left.signum() >= 0) {
			rounded = left.setScale(0, RoundingMode.HALF_UP);		// functions as HALF_AWAY
		}
		else {
			rounded = left.negate().setScale(0, RoundingMode.HALF_DOWN).negate();
		}
		return rounded.toBigInteger();
	}
}
