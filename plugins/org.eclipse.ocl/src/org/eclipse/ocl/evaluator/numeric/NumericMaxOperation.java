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
 * $Id: NumericMaxOperation.java,v 1.1.2.1 2010/01/18 08:57:49 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.numeric;

import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * MaxOperation realises the max() library operation.
 * 
 * @since 3.0
 */
public class NumericMaxOperation extends AbstractNumericBinaryOperation
{
	@Override
	protected Object evaluateInteger(BigInteger left, BigInteger right) {
		return left.max(right);
	}

	@Override
	protected Object evaluateReal(BigDecimal left, BigDecimal right) {
		return left.max(right);
	}

	@Override
	protected Object evaluateUnlimited(Object left, Object right) {
		if (!isUnlimitedNatural(left) || !isUnlimitedNatural(right)) {
			return null;
		}
		return isUnlimited(left) ? left : right;
	}
}
