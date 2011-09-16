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

import org.eclipse.ocl.examples.library.executor.ExecutorClass;


public class PivotExecutorClass extends ExecutorClass
{
	protected final org.eclipse.ocl.examples.pivot.Class pivotClass;
	
	public PivotExecutorClass(PivotExecutorPackage evaluationPackage, int flags, PivotFragment[] fragments, org.eclipse.ocl.examples.pivot.Class pivotClass) {
		super(pivotClass.getName(), evaluationPackage, flags, null, null);	// WIP
		this.pivotClass = pivotClass;		
	}
	
	public final org.eclipse.ocl.examples.pivot.Class getPivotClass() {
		return pivotClass;
	}
}