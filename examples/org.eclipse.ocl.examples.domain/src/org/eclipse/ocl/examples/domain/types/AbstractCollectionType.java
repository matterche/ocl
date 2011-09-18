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
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.LibraryFeature;

public class AbstractCollectionType extends AbstractType implements DomainCollectionType
{
	protected final DomainType containerClass;
	protected final DomainType elementClass;
	
	public AbstractCollectionType(String name, DomainType containerClass, DomainType elementClass) {
		super(name);
		this.containerClass = containerClass;
		this.elementClass = elementClass;
	}

	public boolean conformsTo(DomainStandardLibrary standardLibrary, DomainType type) {
		if (this == type) {
			return true;
		}
		if (!(type instanceof DomainCollectionType)) {
			return false;
		}
		return standardLibrary.conformsToCollectionType(this, (DomainCollectionType)type);
	}

	@Override
	public DomainType getCommonType(DomainStandardLibrary standardLibrary, DomainType type) {
		if (!(type instanceof AbstractCollectionType)) {
			return standardLibrary.getOclAnyType();
		}
		AbstractCollectionType thatClass = (AbstractCollectionType) type;
		// FIXME kind
		DomainType commonContainerClass = containerClass;		// FIXME WIP
		DomainType commonElementClass = elementClass.getCommonType(standardLibrary, thatClass.elementClass);
		if ((commonContainerClass == containerClass) && (commonElementClass == elementClass)) {
			return this;
		}
		else if ((commonContainerClass == thatClass.containerClass) && (commonElementClass == thatClass.elementClass)) {
			return thatClass;
		}
		else {
			if (commonContainerClass.isOrdered()) {
				if (commonContainerClass.isUnique()) {
					return standardLibrary.getOrderedSetType(commonElementClass);
				}
				else {
					return standardLibrary.getSequenceType(commonElementClass);
				}
			}
			else {
				if (commonContainerClass.isUnique()) {
					return standardLibrary.getSetType(commonElementClass);
				}
				else {
					return standardLibrary.getBagType(commonElementClass);
				}
			}
		}
	}

	public DomainType getContainerType() {
		return containerClass;
	}

	public DomainType getElementType() {
		return elementClass;
	}

//	public DomainType getInstanceType() {
//		// TODO Auto-generated method stub
//		throw new UnsupportedOperationException();
//	}

	public boolean isEqualTo(DomainStandardLibrary standardLibrary, DomainType type) {
		if (this == type) {
			return true;
		}
		if (!(type instanceof DomainCollectionType)) {
			return false;
		}
		return standardLibrary.isEqualToCollectionType(this, (DomainCollectionType)type);
	}

	public boolean isSuperClassOf(DomainStandardLibrary standardLibrary, DomainType type) {
		if (this == type) {
			return true;
		}
		return standardLibrary.isSuperClassOf(this, type);
	}

	@Override
	public boolean isOrdered() {
		return containerClass.isOrdered();
	}

	@Override
	public boolean isUnique() {
		return containerClass.isUnique();
	}

	public LibraryFeature lookupImplementation(DomainStandardLibrary standardLibrary, DomainOperation staticOperation) throws InvalidValueException {
		return containerClass.lookupImplementation(standardLibrary, staticOperation);
	}

	public DomainOperation lookupOperation(DomainStandardLibrary standardLibrary, String operationName, DomainType... argumentTypes) {
		return containerClass.lookupOperation(standardLibrary, operationName, argumentTypes);
	}

	@Override
	public String toString() {
		return String.valueOf(containerClass) + "<" + String.valueOf(elementClass) + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}
}