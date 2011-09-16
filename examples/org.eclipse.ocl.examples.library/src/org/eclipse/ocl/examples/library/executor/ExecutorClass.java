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

import org.eclipse.ocl.examples.domain.types.DomainClassifierType;
import org.eclipse.ocl.examples.domain.types.DomainInheritance;
import org.eclipse.ocl.examples.domain.types.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.types.DomainType;

public class ExecutorClass extends ExecutorType implements DomainClassifierType
{
	public static final int ORDERED = 1 << 0;
	public static final int UNIQUE = 1 << 1;
	
	protected final String name;
	protected final ExecutorPackage evaluationPackage;
	protected final int flags;
	
	public ExecutorClass(String name, ExecutorPackage evaluationPackage, int flags, ExecutorTypeParameter... typeParameters) {
		this.name = name;
		this.evaluationPackage = evaluationPackage;
		this.flags = flags;
	}

	public boolean conformsTo(DomainType type, DomainStandardLibrary standardLibrary) {
		if (this == type) {
			return true;
		}
		return type.isSuperInheritanceOf(this, standardLibrary);
	}
	
	public DomainType getCommonType(DomainType type, DomainStandardLibrary standardLibrary) {
		DomainInheritance firstInheritance = this;
		DomainInheritance secondInheritance = standardLibrary.getInheritance(type);
		DomainInheritance commonInheritance = firstInheritance.getCommonInheritance(secondInheritance);
		return commonInheritance.getType();
	}
	
	public final ExecutorPackage getEvaluationPackage() {
		return evaluationPackage;
	}

	public DomainType getInstanceType() {
		return this;
	}

	public final String getName() {
		return name;
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

	public boolean isEqualTo(DomainType type, DomainStandardLibrary standardLibrary) {
		if (this == type) {
			return true;
		}
		throw new UnsupportedOperationException();		// WIP
//		return false;
	}

	public boolean isOrdered() {
		return (flags & ORDERED) != 0;
	}

	public boolean isUnique() {
		return (flags & UNIQUE) != 0;
	}

/*	public ExecutorOperation lookupOperation(ExecutorOperation staticOperation) {
		ExecutorClass staticClass = staticOperation.evaluationClass;
		int staticDepth = staticClass.indexes.length;
		int iMax = indexes[staticDepth+1];
		for (int i = indexes[staticDepth]; i < iMax; i++) {
			if (fragments[i].baseEvaluationClass == staticClass) {
				return fragments[i].operations[staticOperation.operationIndex];
			}
		}
		return null;
	} */

	@Override
	public String toString() {
		return String.valueOf(evaluationPackage) + "::" + String.valueOf(name); //$NON-NLS-1$
	}

	public DomainStandardLibrary getStandardLibrary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Iterable<? extends DomainInheritance> getSuperInheritances() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected DomainInheritance getInheritance(DomainType superClass) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();		// WIP
	}

	@Override
	protected DomainInheritance getOclAnyInheritance() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();		// WIP
	}
}