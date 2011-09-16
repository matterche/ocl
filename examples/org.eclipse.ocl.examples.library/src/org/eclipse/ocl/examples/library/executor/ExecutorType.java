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

import org.eclipse.ocl.examples.domain.types.AbstractFragment;
import org.eclipse.ocl.examples.domain.types.AbstractInheritance;
import org.eclipse.ocl.examples.domain.types.DomainInheritance;
import org.eclipse.ocl.examples.domain.types.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.types.DomainType;

public abstract class ExecutorType extends AbstractInheritance implements DomainType, ExecutorTypeArgument
{
//	public abstract ExecutorType getCommonType(DomainType type, ValueFactory valueFactory);

	@Override
	protected AbstractFragment createFragment(DomainInheritance baseInheritance) {
		return new ExecutorFragment(this, baseInheritance, null, null);
	}

//	public ExecutorType getOclAnyType(ValueFactory valueFactory) {
//		return (ExecutorType) valueFactory.getStandardLibrary().getOclAnyType(); 	// FIXME cast
//	}

	public DomainType getType() {
		return this;
	}

	public boolean isSuperClassOf(DomainType type, DomainStandardLibrary standardLibrary) {
		if (this == type) {
			return true;
		}
		return standardLibrary.isSuperClassOf(this, type);
	}

//	public abstract LibraryFeature lookupImplementation(DomainOperation staticOperation);
}