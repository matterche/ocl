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
 * $Id: NumericOclAsTypeOperation.java,v 1.1.2.1 2010/01/20 06:08:52 ewillink Exp $
 */
package org.eclipse.ocl.library.numeric;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.ocl.library.OCLLibrary;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.operations.OclAsTypeOperation;

/**
 * NumericOclAsTypeOperation realises the Real::oclIsTypeOf() library operation.
 * 
 * @since 3.0
 */
public class NumericOclAsTypeOperation extends OclAsTypeOperation
{
	@Override
	protected Object evaluateConforming(OCLLibrary library, Object sourceVal, OCLType argType) {
		if (isUnlimited(sourceVal) && ((argType == library.getInteger()) || (argType == library.getReal()))) {
			return null;
		}
		else if ((sourceVal instanceof BigInteger) && (argType == library.getReal())) {
			return new BigDecimal(((BigInteger)sourceVal));
		}
		else {
			return sourceVal;
		}
	}

	@Override
	protected Object evaluateNonConforming(OCLLibrary library, Object sourceVal, OCLType argType) {
		if (sourceVal instanceof BigDecimal) {
			BigDecimal source = (BigDecimal) sourceVal;
			if (argType == library.getUnlimitedNatural()) {
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
			else if (argType == library.getInteger()) {
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
			if (argType == library.getUnlimitedNatural()) {
				if (source.signum() < 0) {
					return null;
				}
				return source;
			}
		}
		return null;
	}
}
