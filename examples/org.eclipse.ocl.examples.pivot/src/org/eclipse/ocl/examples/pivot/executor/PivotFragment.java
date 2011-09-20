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

import org.eclipse.ocl.examples.domain.elements.DomainInheritance;
import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.library.LibraryFeature;
import org.eclipse.ocl.examples.domain.types.AbstractFragment;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.pivot.Type;

public class PivotFragment extends AbstractFragment
{
	protected final Type pivotClass;

	public PivotFragment(PivotInheritance derivedInheritance, DomainInheritance baseInheritance) {
		super(derivedInheritance, baseInheritance);
		this.pivotClass = derivedInheritance.getType();		
	}
	
	public PivotFragment(PivotInheritance derivedInheritance, PivotInheritance baseInheritance,
			PivotExecutorOperation[] computeOperations,
			ExecutorProperty[] computeProperties, Type base) {
		super(derivedInheritance, baseInheritance);
		this.pivotClass = derivedInheritance.getType();		
		// WIP TODO Auto-generated constructor stub
	}

	public final Type getPivotClass() {
		return pivotClass;
	}

	public LibraryFeature getImplementation(DomainOperation staticOperation) {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainOperation lookupOperation(DomainStandardLibrary standardLibrary, DomainType staticType, String operationName, DomainType[] argumentTypes) {
		// TODO Auto-generated method stub
		return null;
	}
}