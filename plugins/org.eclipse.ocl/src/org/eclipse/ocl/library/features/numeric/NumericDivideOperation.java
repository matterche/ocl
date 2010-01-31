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
 * $Id: NumericDivideOperation.java,v 1.1.2.1 2010/01/31 22:23:48 ewillink Exp $
 */
package org.eclipse.ocl.library.features.numeric;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;


/**
 * DivideOperation realises the /() library operation.
 * 
 * @since 3.0
 */
public class NumericDivideOperation extends AbstractNumericBinaryOperation
{
	private static final int MINIMUM_SCALE = Double.SIZE/2;		// Gives nearly twice the precision of Double

	protected BigDecimal divideBigDecimal(BigDecimal left, BigDecimal right) {
		try {
			if (right.signum() == 0) {
				return null;
			}
			int scale = Math.max(left.scale() - right.scale(), MINIMUM_SCALE);
			BigDecimal result = left.divide(right, scale, RoundingMode.HALF_EVEN);
			return result;
		} catch (ArithmeticException e) {
			return null;
		}
	}

	@Override
	protected Object evaluateInteger(BigInteger left, BigInteger right) {
		return divideBigDecimal(new BigDecimal(left), new BigDecimal(right));
	}

	@Override
	protected Object evaluateReal(BigDecimal left, BigDecimal right) {
		return divideBigDecimal(left, right);
	}
}
