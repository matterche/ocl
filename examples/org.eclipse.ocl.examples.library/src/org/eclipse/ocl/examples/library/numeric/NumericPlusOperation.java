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
 * $Id: NumericPlusOperation.java,v 1.1.2.3 2010/12/26 15:20:28 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.numeric;

import org.eclipse.ocl.examples.pivot.values.IntegerValue;
import org.eclipse.ocl.examples.pivot.values.RealValue;


/**
 * PlusOperation realises the +() library operation.
 * 
 * @since 3.1
 */
public class NumericPlusOperation extends AbstractNumericBinaryOperation
{
	public static final NumericPlusOperation INSTANCE = new NumericPlusOperation();

	@Override
	protected IntegerValue evaluateInteger(IntegerValue left, IntegerValue right) {
		return left.add(right);
	}

	@Override
	protected RealValue evaluateReal(RealValue left, RealValue right) {
		return left.add(right);
	}
}
