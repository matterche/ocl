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
 * $Id: NumericGreaterThanOperation.java,v 1.1.2.2 2010/01/15 17:27:37 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.operations;

import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * GreaterThanOperation realises the >() library operation.
 * 
 * @since 3.0
 */
public class NumericGreaterThanOperation extends NumericBinaryOperation
{
	@Override
	protected Object evaluateInteger(BigInteger left, BigInteger right) {
		return left.compareTo(right) > 0;
	}

	@Override
	protected Object evaluateReal(BigDecimal left, BigDecimal right) {
		return left.compareTo(right) > 0;
	}

	@Override
	protected Object evaluateUnlimited(Object left, Object right) {
		return isUnlimited(left) && !isUnlimited(right);
	}
}
