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

import org.eclipse.ocl.examples.domain.elements.DomainClassifierType;
import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.LibraryFeature;

public class AbstractClassifierType extends AbstractType implements DomainClassifierType
{
	protected final DomainType containerType;
	protected final DomainType instanceType;
	
	public AbstractClassifierType(String name, DomainType containerType, DomainType instanceType) {
		super(name);
		this.containerType = containerType;
		this.instanceType = instanceType;
	}

	public boolean conformsTo(DomainStandardLibrary standardLibrary, DomainType type) {
		if (this == type) {
			return true;
		}
		if (!(type instanceof DomainClassifierType)) {
			return false;
		}
		return instanceType.conformsTo(standardLibrary, ((DomainClassifierType)type).getInstanceType());
	}

	@Override
	public DomainType getCommonType(DomainStandardLibrary standardLibrary, DomainType type) {
		if (!(type instanceof DomainClassifierType)) {
			return standardLibrary.getOclAnyType();
		}
		DomainType thatInstanceType = ((DomainClassifierType)type).getInstanceType();
		DomainType commonInstanceType = instanceType.getCommonType(standardLibrary, thatInstanceType);
		if (commonInstanceType == instanceType) {
			return this;
		}
		else if (commonInstanceType == thatInstanceType) {
			return type;
		}
		else {
			return standardLibrary.getClassifierType(commonInstanceType);
		}
	}

	public DomainType getContainerType() {
		return containerType;
	}

	public DomainType getInstanceType() {
		return instanceType;
	}

	public boolean isEqualTo(DomainStandardLibrary standardLibrary, DomainType type) {
		if (this == type) {
			return true;
		}
		if (!(type instanceof DomainClassifierType)) {
			return false;
		}
		return instanceType.isEqualTo(standardLibrary, ((DomainClassifierType)type).getInstanceType());
	}

	public LibraryFeature lookupImplementation(DomainStandardLibrary standardLibrary, DomainOperation staticOperation) throws InvalidValueException {
		return containerType.lookupImplementation(standardLibrary, staticOperation);
	}

	public DomainOperation lookupOperation(DomainStandardLibrary standardLibrary, String operationName, DomainType... argumentTypes) {
		return containerType.lookupOperation(standardLibrary, operationName, argumentTypes);
	}

	@Override
	public String toString() {
		return String.valueOf(containerType) + "<" + String.valueOf(instanceType) + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}
}