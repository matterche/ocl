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
 * $Id: NumericEqualOperation.java,v 1.1.2.2 2010/01/30 20:15:36 ewillink Exp $
 */
package org.eclipse.ocl.library.operations.numeric;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * NumericEqualOperation realises the =() library operation.
 * 
 * @since 3.0
 */
public class NumericEqualOperation extends AbstractNumericBinaryOperation
{
	@Override
	protected Boolean evaluateInteger(BigInteger left, BigInteger right) {
		return left.compareTo(right) == 0;
	}

	@Override
	protected Boolean evaluateInvalid(Object left, Object right) {
		return isInvalid(left) == isInvalid(right);
	}

	@Override
	protected Boolean evaluateNonNumeric(Object left, Object right) {
		return Boolean.FALSE;
	}

	@Override
	protected Boolean evaluateNull(Object left, Object right) {
		return isNull(left) == isNull(right);
	}

	@Override
	protected Boolean evaluateReal(BigDecimal left, BigDecimal right) {
		return left.compareTo(right) == 0;
	}

	@Override
	protected Boolean evaluateUnlimited(Object left, Object right) {
		return isUnlimited(left) && isUnlimited(right);
	}
}
