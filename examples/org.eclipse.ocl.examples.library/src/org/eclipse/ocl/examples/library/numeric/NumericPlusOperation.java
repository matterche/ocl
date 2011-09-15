/**
 * <copyright>
 *
 * Copyright (c) 2009,2011 E.D.Willink and others.
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
 * $Id: NumericPlusOperation.java,v 1.3 2011/02/21 08:37:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.numeric;

import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.values.IntegerValue;
import org.eclipse.ocl.examples.domain.values.RealValue;

/**
 * PlusOperation realises the +() library operation.
 */
@Deprecated
public class NumericPlusOperation extends AbstractNumericBinaryOperation
{
	public static final NumericPlusOperation INSTANCE = new NumericPlusOperation();

	@Override
	protected IntegerValue evaluateInteger(DomainEvaluator evaluator, IntegerValue left, IntegerValue right) throws InvalidValueException {
		return left.add(right);
	}

	@Override
	protected RealValue evaluateReal(DomainEvaluator evaluator, RealValue left, RealValue right) throws InvalidValueException {
		return left.add(right);
	}
}
