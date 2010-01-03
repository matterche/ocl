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
 * $Id: StringToIntegerOperation.java,v 1.1.2.1 2010/01/03 23:41:16 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.operations;

import java.math.BigInteger;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;

/**
 * StringToIntegerOperation realises the String::toInteger() library operation.
 * 
 * @since 3.0
 */
public class StringToIntegerOperation extends AbstractOperation
{
	@Override
	public Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, OperationCallExp<?, ?> operationCall) {
		Object sourceVal = evaluateSource(visitor, operationCall);
		if (isString(sourceVal)) {
			String string = String.valueOf(sourceVal).trim();
			try {
				return Integer.valueOf(string);
			} catch (NumberFormatException e1) {
				try {
					return Long.valueOf(string);
				} catch (NumberFormatException e2) {
					return new BigInteger(string);
				}				
			}
		}			
		return null;
	}
}
