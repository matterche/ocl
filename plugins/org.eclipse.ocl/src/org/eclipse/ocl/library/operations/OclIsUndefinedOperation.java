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
 * $Id: OclIsUndefinedOperation.java,v 1.1.2.1 2010/01/20 06:08:21 ewillink Exp $
 */
package org.eclipse.ocl.library.operations;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;

/**
 * OclIsUndefinedOperation realises the oclIsUndefined() library operation.
 * 
 * @since 3.0
 */
public class OclIsUndefinedOperation extends AbstractOperation
{
	@Override
	public Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, Object sourceVal, OperationCallExp<?, ?> operationCall) {
		if (isUndefined(sourceVal)) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
}
