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
 * $Id: ZeroArgumentOperation.java,v 1.1.2.1 2009/12/14 21:59:09 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.operations;

import org.eclipse.ocl.expressions.OperationCallExp;

/**
 * @since 3.0
 */
public abstract class ZeroArgumentOperation extends AbstractOperation
{
	protected ZeroArgumentOperation(Object operationCode) {
		super(operationCode);
	}

	public boolean canEvaluate(OperationCallExp<?, ?> operationCall) {
		return getNumArguments(operationCall) == 0;
	}
}
