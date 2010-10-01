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
 * $Id: NumericOclAsTypeOperation.java,v 1.1.2.1 2010/10/01 13:28:36 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.numeric;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.examples.pivot.EvaluationContext;
import org.eclipse.ocl.examples.pivot.Type;

/**
 * NumericOclAsTypeOperation realises the Real::oclIsTypeOf() library operation.
 * 
 * @since 3.1
 */
public class NumericOclAsTypeOperation extends OclAnyOclAsTypeOperation
{
	public static final NumericOclAsTypeOperation INSTANCE = new NumericOclAsTypeOperation();

	@Override
	protected Object evaluateConforming(EvaluationContext evaluationContext, Object sourceVal, Type argType) {
		if (isUnlimited(sourceVal) && ((argType == evaluationContext.getIntegerType()) || (argType == evaluationContext.getRealType()))) {
			return null;
		}
		else if ((sourceVal instanceof BigInteger) && (argType == evaluationContext.getRealType())) {
			return new BigDecimal(((BigInteger)sourceVal));
		}
		else {
			return sourceVal;
		}
	}

	@Override
	protected Object evaluateNonConforming(EvaluationContext evaluationContext, Object sourceVal, Type argType) {
		if (sourceVal instanceof BigDecimal) {
			BigDecimal source = (BigDecimal) sourceVal;
			if (argType == evaluationContext.getUnlimitedNaturalType()) {
				if (source.signum() < 0) {
					return null;
				}
				BigInteger result = source.toBigInteger();
				BigDecimal delta = source.subtract(new BigDecimal(result));
				if (delta.signum() != 0) {
					return null;
				}
				return result;
			}
			else if (argType == evaluationContext.getIntegerType()) {
				BigInteger result = source.toBigInteger();
				BigDecimal delta = source.subtract(new BigDecimal(result));
				if (delta.signum() != 0) {
					return null;
				}
				return result;
			}
		}
		else if (sourceVal instanceof BigInteger) {
			BigInteger source = (BigInteger) sourceVal;
			if (argType == evaluationContext.getUnlimitedNaturalType()) {
				if (source.signum() < 0) {
					return null;
				}
				return source;
			}
		}
		return null;
	}
}
