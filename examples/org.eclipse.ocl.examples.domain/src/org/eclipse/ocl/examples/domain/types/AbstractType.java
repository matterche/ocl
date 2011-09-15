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

import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.library.LibraryFeature;

public abstract class AbstractType implements DomainType
{
	protected final String name;

	public AbstractType(String name) {
		this.name = name;
	}

	public abstract DomainType getCommonType(DomainType type, DomainStandardLibrary standardLibrary);
	
	public final String getName() {
		return name;
	}

	public boolean isOrdered() {
		return false;
	}

	public boolean isUnique() {
		return false;
	}

	public boolean isSuperClassOf(DomainType type, DomainStandardLibrary standardLibrary) {
		if (this == type) {
			return true;
		}
		return standardLibrary.isSuperClassOf(this, type);
	}

	public boolean isSuperInheritanceOf(DomainInheritance inheritance, DomainStandardLibrary standardLibrary) {
		return isSuperClassOf(inheritance.getType(), standardLibrary);
	}

	public LibraryFeature lookupImplementation(DomainOperation staticOperation) {
		throw new UnsupportedOperationException();		// WIP
	}
}