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
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.library.LibraryFeature;

public abstract class AbstractSpecializedType extends AbstractType
{
	protected final DomainType containerType;
	
	public AbstractSpecializedType(DomainStandardLibrary standardLibrary, String name, DomainType containerType) {
		super(standardLibrary, name);
		this.containerType = containerType;
	}

	public DomainType getContainerType() {
		return containerType;
	}

	@Override
	public boolean isOrdered() {
		return containerType.isOrdered();
	}

	@Override
	public boolean isUnique() {
		return containerType.isUnique();
	}

	public LibraryFeature lookupImplementation(DomainStandardLibrary standardLibrary, DomainOperation staticOperation) {
		return containerType.lookupImplementation(standardLibrary, staticOperation);
	}
}