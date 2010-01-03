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
 * $Id: StringToLowerCaseOperation.java,v 1.1.2.2 2010/01/03 23:41:16 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.operations;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;

/**
 * StringToLowerCaseOperation realises the String::toLowerCase() library operation.
 * 
 * @since 3.0
 */
public class StringToLowerCaseOperation extends AbstractOperation
{
	@Override
	public Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, OperationCallExp<?, ?> operationCall) {
		Object sourceVal = evaluateSource(visitor, operationCall);
		if (isString(sourceVal)) {
			return String.valueOf(sourceVal).toLowerCase();
		}			
		return null;
	}
}
