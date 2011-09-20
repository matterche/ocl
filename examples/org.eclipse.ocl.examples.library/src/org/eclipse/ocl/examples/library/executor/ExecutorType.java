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
package org.eclipse.ocl.examples.library.executor;

import org.eclipse.ocl.examples.domain.elements.DomainClassifierType;
import org.eclipse.ocl.examples.domain.elements.DomainFragment;
import org.eclipse.ocl.examples.domain.elements.DomainInheritance;
import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.types.AbstractFragment;
import org.eclipse.ocl.examples.domain.types.AbstractInheritance;

public class ExecutorType extends AbstractInheritance implements DomainClassifierType, ExecutorTypeArgument
{
	public static final int ORDERED = 1 << 0;
	public static final int UNIQUE = 1 << 1;
	
	protected final String name;
	protected final ExecutorPackage evaluationPackage;
	protected final int flags;
	
	public ExecutorType(String name, ExecutorPackage evaluationPackage, int flags, ExecutorTypeParameter... typeParameters) {
		this.name = name;
		this.evaluationPackage = evaluationPackage;
		this.flags = flags;
	}
	
	@Override
	protected AbstractFragment createFragment(DomainInheritance baseInheritance) {
		return new ExecutorFragment(this, baseInheritance, null, null);
	}

	public boolean conformsTo(DomainStandardLibrary standardLibrary, DomainType type) {
		if (this == type) {
			return true;
		}
		return type.isSuperInheritanceOf(standardLibrary, this);
	}
	
	public DomainType getCommonType(DomainStandardLibrary standardLibrary, DomainType type) {
		DomainInheritance firstInheritance = this;
		DomainInheritance secondInheritance = type.getInheritance(standardLibrary);
		DomainInheritance commonInheritance = firstInheritance.getCommonInheritance(secondInheritance);
		return commonInheritance.getType();
	}

	public DomainInheritance getInheritance(DomainStandardLibrary standardLibrary) {
		return this;
	}

	public DomainType getInstanceType() {
		return this;
	}

	public final String getName() {
		return name;
	}
	
	public final ExecutorPackage getPackage() {
		return evaluationPackage;
	}

	public DomainStandardLibrary getStandardLibrary() {
		return ExecutorStandardLibrary.INSTANCE;
	}

	@Override
	protected Iterable<? extends DomainInheritance> getInitialSuperInheritances() {
		throw new UnsupportedOperationException();		// Not called since fragments already in place
	}

	public DomainType getType() {
		return this;
	}

	public void initFragments(ExecutorFragment[] fragments, int[] depthCounts) {
		if (fragments != null) {
			int[] indexes = new int[depthCounts.length+1];
			indexes[0] = 0;
			for (int i = 0; i <  depthCounts.length; i++) {
				indexes[i+1] = indexes[i] + depthCounts[i];
			}
			super.initFragments(fragments, indexes);
		}
		else {
			super.initFragments(null, null);
		}
	}

	public boolean isEqualTo(DomainStandardLibrary standardLibrary, DomainType type) {
		if (this == type) {
			return true;
		}
		throw new UnsupportedOperationException();		// WIP
//		return false;
	}

	public boolean isEqualToUnspecializedType(DomainStandardLibrary standardLibrary, DomainType type) {
		if (this == type) {
			return true;
		}
		return false;
	}

	public boolean isOrdered() {
		return (flags & ORDERED) != 0;
	}

	public boolean isSuperClassOf(DomainStandardLibrary standardLibrary, DomainType type) {
		if (this == type) {
			return true;
		}
		DomainInheritance thisInheritance = this;
		DomainInheritance thatInheritance = type.getInheritance(standardLibrary);
		return thisInheritance.isSuperInheritanceOf(standardLibrary, thatInheritance);
	}

	public boolean isUnique() {
		return (flags & UNIQUE) != 0;
	}

	public DomainOperation lookupOperation(DomainStandardLibrary standardLibrary, String operationName, DomainType... argumentTypes) {
		for (DomainFragment fragment : getFragments()) {
			DomainOperation operation = fragment.lookupOperation(standardLibrary, this, operationName, argumentTypes);
			if (operation != null) {
				return operation;				// FIXME ambiguous lookups
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return String.valueOf(evaluationPackage) + "::" + String.valueOf(name); //$NON-NLS-1$
	}
}