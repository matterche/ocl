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

import java.util.List;

import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainTupleType;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.elements.DomainTypedElement;
import org.eclipse.ocl.examples.domain.library.LibraryFeature;

public class AbstractTupleType extends AbstractType implements DomainTupleType
{
	private List<? extends DomainTypedElement> parts;
	
	public AbstractTupleType(DomainStandardLibrary standardLibrary, List<? extends DomainTypedElement> parts) {
		super(standardLibrary, "Tuple");
		this.parts = parts;
	}

	public boolean conformsTo(DomainStandardLibrary standardLibrary, DomainType type) {
		if (this == type) {
			return true;
		}
		if (!(type instanceof DomainTupleType)) {
			return false;
		}
		return standardLibrary.conformsToTupleType(this, (DomainTupleType)type);
	}

	@Override
	public DomainType getCommonType(DomainStandardLibrary standardLibrary, DomainType type) {
		if (type != this) {
			return standardLibrary.getOclAnyType();
		}
		return this;
	}

	public List<? extends DomainTypedElement> getOwnedAttribute() {
		return parts;
	}

	public boolean isEqualTo(DomainStandardLibrary standardLibrary, DomainType type) {
		if (this == type) {
			return true;
		}
		if (!(type instanceof DomainTupleType)) {
			return false;
		}
		return standardLibrary.isEqualToTupleType(this, (DomainTupleType)type);
	}

	public LibraryFeature lookupImplementation(DomainStandardLibrary standardLibrary, DomainOperation staticOperation) {
		return standardLibrary.getOclTupleType().lookupImplementation(standardLibrary, staticOperation);
	}

//	@Override
//	public DomainOperation lookupLocalOperation(DomainStandardLibrary standardLibrary, String operationName, DomainType... argumentTypes) {
//		return standardLibrary.getOclTupleType().lookupLocalOperation(standardLibrary, operationName, argumentTypes);
//	}
}