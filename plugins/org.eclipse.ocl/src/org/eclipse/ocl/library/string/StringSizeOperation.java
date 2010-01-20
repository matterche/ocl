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
 * $Id: StringSizeOperation.java,v 1.1.2.2 2010/01/20 16:57:25 ewillink Exp $
 */
package org.eclipse.ocl.library.string;

import java.math.BigInteger;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.operations.AbstractOperation;

/**
 * StringSizeOperation realises the String::size() library operation.
 * 
 * @since 3.0
 */
public class StringSizeOperation extends AbstractOperation
{
	@Override
	public Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, Object sourceVal, OperationCallExp<?, ?> operationCall) {
		if (!isString(sourceVal)) {
			return null;
		}
		return BigInteger.valueOf(String.valueOf(sourceVal).length());
	}
}
