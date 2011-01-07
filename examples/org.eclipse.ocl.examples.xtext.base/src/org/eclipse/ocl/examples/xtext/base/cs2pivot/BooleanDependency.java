/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: BooleanDependency.java,v 1.1.2.2 2011/01/07 12:13:18 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.cs2pivot;

public class BooleanDependency extends AbstractDependency<Object>
{
	private Boolean satisfied = false;
	
	public BooleanDependency(String description) {
		super(description);
	}

	@Override
	public boolean canExecute() {
		return satisfied;
	}
	
	public void setSatisfied() {
		satisfied = true;
	}
}