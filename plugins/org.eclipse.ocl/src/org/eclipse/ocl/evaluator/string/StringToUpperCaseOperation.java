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
 * $Id: StringToUpperCaseOperation.java,v 1.1.2.1 2010/01/18 08:57:52 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.string;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.evaluator.operations.AbstractOperation;
import org.eclipse.ocl.expressions.OperationCallExp;

/**
 * StringToUpperCaseOperation realises the String::toUpperCase() library operation.
 * 
 * @since 3.0
 */
public class StringToUpperCaseOperation extends AbstractOperation
{
	@Override
	public Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, Object sourceVal, OperationCallExp<?, ?> operationCall) {
		if (isString(sourceVal)) {
			return String.valueOf(sourceVal).toUpperCase();
		}			
		return null;
	}
}
