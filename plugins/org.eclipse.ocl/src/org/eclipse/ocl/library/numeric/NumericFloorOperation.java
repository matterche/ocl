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
 * $Id: NumericFloorOperation.java,v 1.1.2.1 2010/01/20 06:09:06 ewillink Exp $
 */
package org.eclipse.ocl.library.numeric;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;


/**
 * FloorOperation realises the floor() library operation.
 * 
 * @since 3.0
 */
public class NumericFloorOperation extends AbstractNumericUnaryOperation
{
	@Override
	protected Object evaluateInteger(BigInteger left) {
		return left;
	}
	
	@Override
	protected Object evaluateReal(BigDecimal left) {
		return left.setScale(0, RoundingMode.FLOOR).toBigInteger();
	}
}
