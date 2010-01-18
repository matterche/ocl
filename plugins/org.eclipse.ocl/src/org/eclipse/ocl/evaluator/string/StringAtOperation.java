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
 * $Id: StringAtOperation.java,v 1.1.2.1 2010/01/18 08:57:52 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.string;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.evaluator.operations.AbstractOperation;
import org.eclipse.ocl.expressions.OperationCallExp;

/**
 * StringAtOperation realises the String::at() library operation.
 * 
 * @since 3.0
 */
public class StringAtOperation extends AbstractOperation
{
	@Override
	public Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, Object sourceVal, OperationCallExp<?, ?> operationCall) {
		Object argVal = evaluateArgument(visitor, operationCall, 0);
		if (isString(sourceVal) && isInteger(argVal)) {
			String string = String.valueOf(sourceVal);
			int size = string.length();
			int index = ((Number)argVal).intValue();
			if ((0 < index) && (index <= size))
				return String.valueOf(string.charAt(index-1));
		}			
		return null;
	}
}
