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
 * $Id: NumericUnaryOperation.java,v 1.1.2.2 2010/01/15 17:27:37 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.operations;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;

/**
 * AbstractUnaryOperation dispatches a unary library operation to
 * matching-type-specific call-backs.
 * 
 * @since 3.0
 */
public abstract class NumericUnaryOperation extends AbstractOperation
{
	@Override
	public Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, OperationCallExp<?, ?> operationCall) {
		Object sourceVal = evaluateSource(visitor, operationCall);
		if (isUnlimited(sourceVal)) {
			return evaluateUnlimited(sourceVal);			
		}
		else if (sourceVal instanceof BigInteger) {
			return evaluateInteger((BigInteger)sourceVal);			
		}
		else if (sourceVal instanceof BigDecimal) {
			return evaluateReal((BigDecimal)sourceVal);			
		}
		return null;
	}

	protected Object evaluateReal(BigDecimal left) {
		return evaluate(left);
	}
	
	protected Object evaluateInteger(BigInteger left) {
		return evaluate(left);
	}
	
	protected Object evaluateUnlimited(Object left) {
		return null;
	}
	
	/**
	 * Return the result of evaluating the operation on left. 
	 * A null return or an exception may be used for invalid.
	 */
	protected <T extends Number & Comparable<T>> Object evaluate(T left) {
		return null;
	}
}
