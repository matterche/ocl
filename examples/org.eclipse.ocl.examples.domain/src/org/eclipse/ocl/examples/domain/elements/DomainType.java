/**
 * <copyright>
 *
 * Copyright (c) 2011,2012 E.D.Willink and others.
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
package org.eclipse.ocl.examples.domain.elements;

import org.eclipse.ocl.examples.domain.library.LibraryFeature;

public interface DomainType extends DomainElement
{
	boolean conformsTo(DomainStandardLibrary standardLibrary, DomainType type);
	DomainType getCommonType(DomainStandardLibrary standardLibrary, DomainType type);
	DomainInheritance getInheritance(DomainStandardLibrary standardLibrary);
	Iterable<? extends DomainOperation> getLocalOperations();
	Iterable<? extends DomainProperty> getLocalProperties();
	Iterable<? extends DomainType> getLocalSuperTypes();
	String getName();
	DomainPackage getPackage();
	boolean isEqualTo(DomainStandardLibrary standardLibrary, DomainType type);
	boolean isEqualToUnspecializedType(DomainStandardLibrary standardLibrary, DomainType type);
	
	/**
	 * Return true if this type is a Collection type and has ordered elements.
	 */
	boolean isOrdered();		
	
	/**
	 * Return true if this type is a Collection type and has unique elements.
	 */
	boolean isUnique();
	
	/**
	 * Return the dynamic (overloaded) implementation of the staticOperation applicable to the types managed
	 * by the given Standard Library.
	 */
	LibraryFeature lookupImplementation(DomainStandardLibrary standardLibrary, DomainOperation staticOperation);
}
