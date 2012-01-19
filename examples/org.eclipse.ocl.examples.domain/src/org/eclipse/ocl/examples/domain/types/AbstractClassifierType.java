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
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;

public class AbstractClassifierType extends AbstractSpecializedType implements DomainClassifierType
{
	protected final DomainType instanceType;
	protected DomainType metaType = null;
	private DomainType normalizedInstanceType = null;
	private int hashCode;
	
	public AbstractClassifierType(DomainStandardLibrary standardLibrary, DomainType containerType, DomainType instanceType) {
		super(standardLibrary, containerType.getName(), containerType);
		this.instanceType = instanceType;
	}

	public boolean conformsTo(DomainStandardLibrary standardLibrary, DomainType type) {
		if (this == type) {
			return true;
		}
		DomainType thisMetaType = getMetaType();
		DomainType thatMetaType = type;
		return thisMetaType != null ? thisMetaType.conformsTo(standardLibrary, thatMetaType) : false;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof DomainClassifierType)) {
			return false;
		}
		DomainType thisInstanceType = getNormalizedInstanceType();
		DomainType thatInstanceType = ((DomainClassifierType)obj).getInstanceType().getNormalizedType(standardLibrary);
		return thisInstanceType.isEqualTo(standardLibrary, thatInstanceType);
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

	public DomainType getInstanceType() {
		return instanceType;
	}
	
	protected DomainType getMetaType() {
		String metaTypeName = instanceType.getMetaTypeName();
		if (metaTypeName != null) {
			metaType = standardLibrary.getOclType(metaTypeName);
		}
		return metaType;
	}
	
	protected DomainType getNormalizedInstanceType() {
		if (normalizedInstanceType == null) {
			normalizedInstanceType = instanceType.getNormalizedType(standardLibrary);
			hashCode = normalizedInstanceType.hashCode();
		}
		return normalizedInstanceType;
	}

	@Override
	public int hashCode() {
		if (normalizedInstanceType == null) {
			getNormalizedInstanceType();
		}
		return hashCode;
	}

	public boolean isEqualTo(DomainStandardLibrary standardLibrary, DomainType type) {
		if (this == type) {
			return true;
		}
		if (!(type instanceof DomainClassifierType)) {
			return false;
		}
		DomainType thisInstanceType = getNormalizedInstanceType();
		DomainType thatInstanceType = ((DomainClassifierType)type).getInstanceType().getNormalizedType(standardLibrary);
		return thisInstanceType.isEqualTo(standardLibrary, thatInstanceType);
	}

	@Override
	public String toString() {
		return String.valueOf(containerType) + "<" + String.valueOf(instanceType) + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}
}