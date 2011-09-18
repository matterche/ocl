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


public abstract class AbstractType implements DomainType
{
	protected final String name;

	public AbstractType(String name) {
		this.name = name;
	}

	public abstract DomainType getCommonType(DomainStandardLibrary standardLibrary, DomainType type);

	public DomainInheritance getInheritance(DomainStandardLibrary standardLibrary) {
		throw new UnsupportedOperationException();			// WIP fixme
	}
	
	public final String getName() {
		return name;
	}

	public boolean isOrdered() {
		return false;
	}

	public boolean isUnique() {
		return false;
	}

	public boolean isSuperInheritanceOf(DomainStandardLibrary standardLibrary, DomainInheritance inheritance) {
		return isSuperClassOf(standardLibrary, inheritance.getType());
	}
}