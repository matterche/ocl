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
package org.eclipse.ocl.examples.domain.types;

import org.eclipse.ocl.examples.domain.elements.DomainInheritance;
import org.eclipse.ocl.examples.domain.elements.DomainPackage;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;

public abstract class AbstractType implements DomainType	// FIXME rename as perhaps DerivativeType
{
	protected final String name;

	public AbstractType(String name) {
		this.name = name;
	}

	public abstract DomainType getCommonType(DomainStandardLibrary standardLibrary, DomainType type);

	public DomainInheritance getInheritance(DomainStandardLibrary standardLibrary) {
		throw new UnsupportedOperationException();			// WIP fixme / DerivativeType should not be used as full types
	}
	
	public final String getName() {
		return name;
	}

	public DomainPackage getPackage() {
		throw new UnsupportedOperationException();			// WIP fixme / DerivativeType should not be used as full types
	}

	public boolean isEqualToUnspecializedType(DomainStandardLibrary standardLibrary, DomainType type) {
		if (this == type) {
			return true;
		}
		return false;
	}

	public boolean isOrdered() {
		return false;
	}

	public boolean isSuperClassOf(DomainStandardLibrary standardLibrary, DomainType type) {
		throw new UnsupportedOperationException();			// WIP fixme / DerivativeType should not be used as full types
	}

	public boolean isSuperInheritanceOf(DomainStandardLibrary standardLibrary, DomainInheritance inheritance) {
		return isSuperClassOf(standardLibrary, inheritance.getType());
	}

	public boolean isUnique() {
		return false;
	}
}