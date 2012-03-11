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

import org.eclipse.ocl.examples.domain.elements.DomainCollectionType;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;

public class AbstractCollectionType extends AbstractSpecializedType implements DomainCollectionType
{
	protected final DomainType elementType;
	
	public AbstractCollectionType(DomainStandardLibrary standardLibrary, String name, DomainType containerType, DomainType elementType) {
		super(standardLibrary, name, containerType);
		this.elementType = elementType;
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
		DomainType commonContainerClass = containerType;		// FIXME WIP
		DomainType commonElementClass = elementType.getCommonType(standardLibrary, thatClass.elementType);
		if ((commonContainerClass == containerType) && (commonElementClass == elementType)) {
			return this;
		}
		else if ((commonContainerClass == thatClass.containerType) && (commonElementClass == thatClass.elementType)) {
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

	public DomainType getElementType() {
		return elementType;
	}

/*	public DomainType getMetaType(DomainStandardLibrary standardLibrary) {
		if (containerType.isOrdered()) {
			if (containerType.isUnique()) {
				return standardLibrary.getOrderedSetType(elementType);
			}
			else {
				return standardLibrary.getSequenceType(elementType);
			}
		}
		else {
			if (containerType.isUnique()) {
				return standardLibrary.getSetType(elementType);
			}
			else {
				return standardLibrary.getBagType(elementType);
			}
		}
	} */

	public boolean isEqualTo(DomainStandardLibrary standardLibrary, DomainType type) {
		if (this == type) {
			return true;
		}
		if (!(type instanceof DomainCollectionType)) {
			return false;
		}
		return standardLibrary.isEqualToCollectionType(this, (DomainCollectionType)type);
	}

	@Override
	public String toString() {
		return String.valueOf(containerType) + "(" + String.valueOf(elementType) + ")"; //$NON-NLS-1$ //$NON-NLS-2$
	}
}