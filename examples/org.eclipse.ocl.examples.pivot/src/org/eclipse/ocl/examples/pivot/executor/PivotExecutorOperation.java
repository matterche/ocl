/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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
 * $Id$
 */
package org.eclipse.ocl.examples.pivot.executor;

import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.pivot.Operation;

public class PivotExecutorOperation extends ExecutorOperation
{
	protected final Operation pivotOperation;
	
	public PivotExecutorOperation(PivotExecutorType inheritance, int operationIndex, Operation pivotOperation) {
		super(pivotOperation.getName(), inheritance, operationIndex, pivotOperation.getImplementation());
		this.pivotOperation = pivotOperation;		
	}
	
	public final Operation getPivotOperation() {
		return pivotOperation;
	}
}