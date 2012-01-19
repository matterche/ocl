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
import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.elements.DomainPackage;
import org.eclipse.ocl.examples.domain.elements.DomainProperty;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.values.ObjectValue;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public abstract class AbstractType implements DomainType	// FIXME rename as perhaps DerivativeType
{
	protected final DomainStandardLibrary standardLibrary;

	protected final String name;

	public AbstractType(DomainStandardLibrary standardLibrary, String name) {
		this.standardLibrary = standardLibrary;
		this.name = name;
	}

	public ObjectValue createInstance(ValueFactory valueFactory) {
		throw new UnsupportedOperationException();
	}

	public abstract DomainType getCommonType(DomainStandardLibrary standardLibrary, DomainType type);

	public DomainInheritance getInheritance(DomainStandardLibrary standardLibrary) {
		throw new UnsupportedOperationException();			// WIP fixme / DerivativeType should not be used as full types
	}

	public Iterable<? extends DomainOperation> getLocalOperations() {
		throw new UnsupportedOperationException();			// WIP fixme / DerivativeType should not be used as full types
	}

	public Iterable<? extends DomainProperty> getLocalProperties() {
		throw new UnsupportedOperationException();			// WIP fixme / DerivativeType should not be used as full types
	}

	public Iterable<? extends DomainType> getLocalSuperTypes() {
		throw new UnsupportedOperationException();			// WIP fixme / DerivativeType should not be used as full types
	}

	public String getMetaTypeName() {
		throw new UnsupportedOperationException();			// WIP fixme / DerivativeType should not be used as full types
	}
	
	public final String getName() {
		return name;
	}

	public DomainType getNormalizedType(DomainStandardLibrary standardLibrary) {
		return getInheritance(standardLibrary);
	}

	public DomainPackage getPackage() {
		throw new UnsupportedOperationException();			// WIP fixme / DerivativeType should not be used as full types
	}
	
	public final DomainStandardLibrary getStandardLibrary() {
		return standardLibrary;
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

	public boolean isUnique() {
		return false;
	}
}