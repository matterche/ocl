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
 * $Id: StringGreaterThanOperation.java,v 1.1.2.1 2010/01/20 06:07:30 ewillink Exp $
 */
package org.eclipse.ocl.library.string;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.operations.AbstractOperation;


/**
 * StringGreaterThanOperation realises the String::>() library operation.
 * 
 * @since 3.0
 */
public class StringGreaterThanOperation extends AbstractOperation
{
	@Override
	public Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, Object sourceVal, OperationCallExp<?, ?> operationCall) {
		Object argVal = evaluateArgument(visitor, operationCall, 0);
		if (isString(sourceVal) && isString(argVal)) {
			return String.valueOf(sourceVal).compareTo(String.valueOf(argVal)) > 0;
		}
		return null;
	}
}
