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
 * $Id: StringSubstringOperation.java,v 1.1.2.1 2010/01/18 08:57:52 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.string;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.evaluator.operations.AbstractOperation;
import org.eclipse.ocl.expressions.OperationCallExp;

/**
 * StringSubstringOperation realises the String::substring() library operation.
 * 
 * @since 3.0
 */
public class StringSubstringOperation extends AbstractOperation
{
	@Override
	public Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, Object sourceVal, OperationCallExp<?, ?> operationCall) {
		Object arg0Val = evaluateArgument(visitor, operationCall, 0);
		Object arg1Val = evaluateArgument(visitor, operationCall, 1);
		if (isString(sourceVal) && isInteger(arg0Val) && isInteger(arg1Val)) {
			String string = String.valueOf(sourceVal);
			int size = string.length();
			int lower = ((Number)arg0Val).intValue();
			int upper = ((Number)arg1Val).intValue();
			if ((0 < lower) && (lower <= upper) && (upper <= size))
				return string.substring(lower-1, upper);
		}			
		return null;
	}
}
