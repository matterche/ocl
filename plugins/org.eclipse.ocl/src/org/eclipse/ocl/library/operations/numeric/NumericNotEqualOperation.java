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
 * $Id: NumericNotEqualOperation.java,v 1.1.2.1 2010/01/24 07:40:59 ewillink Exp $
 */
package org.eclipse.ocl.library.operations.numeric;

import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * NotEqualOperation realises the <>() library operation.
 * 
 * @since 3.0
 */
public class NumericNotEqualOperation extends NumericEqualOperation
{
	@Override
	protected Boolean evaluateInteger(BigInteger left, BigInteger right) {
		return !super.evaluateInteger(left, right);
	}

	@Override
	protected Boolean evaluateInvalid(Object left, Object right) {
		return !super.evaluateInvalid(left, right);
	}

	@Override
	protected Boolean evaluateNull(Object left, Object right) {
		return !super.evaluateNull(left, right);
	}

	@Override
	protected Boolean evaluateReal(BigDecimal left, BigDecimal right) {
		return !super.evaluateReal(left, right);
	}

	@Override
	protected Boolean evaluateUnlimited(Object left, Object right) {
		return !super.evaluateUnlimited(left, right);
	}
}
