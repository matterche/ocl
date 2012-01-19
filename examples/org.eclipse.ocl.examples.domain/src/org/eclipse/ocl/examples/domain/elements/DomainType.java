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
import org.eclipse.ocl.examples.domain.values.ObjectValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public interface DomainType extends DomainElement
{
	/**
	 * Return true if this type conform to thatType within standardLibrary.
	 */
	boolean conformsTo(DomainStandardLibrary standardLibrary, DomainType thatType);

	/**
	 * Return a new instance of this type from valueFactory. Properties may be initialised using
	 * {@link DomainProperty#setValue(ObjectValue, Value) } provided no side-effect free
	 * OCL functionality is permitted to use the ObjectValue until initialisation has completed.
	 */
	ObjectValue createInstance(ValueFactory valueFactory);
	
	/**
	 * Return the most derived type com mon to this type and thatType within standardLibrary.
	 */
	DomainType getCommonType(DomainStandardLibrary standardLibrary, DomainType thatType);

	/**
	 * Return the inheritance description for this type within standardLibrary.
	 */
	DomainInheritance getInheritance(DomainStandardLibrary standardLibrary);
	Iterable<? extends DomainOperation> getLocalOperations();
	Iterable<? extends DomainProperty> getLocalProperties();
	Iterable<? extends DomainType> getLocalSuperTypes();
	
	/**
	 * Return the name of the meta-type of this type.
	 */
	String getMetaTypeName();
	
	/**
	 * Return the name of this type (without any decoratuions for specializations).
	 */
	String getName();
	
	/**
	 * Return the unique executable form of this type within standardLibrary.
	 */
	DomainType getNormalizedType(DomainStandardLibrary standardLibrary);
	
	/**
	 * Return the package containing this type.
	 */
	DomainPackage getPackage();
	
	/**
	 * Return true if this is the same type as thatType within standardLibrary.
	 */
	boolean isEqualTo(DomainStandardLibrary standardLibrary, DomainType thatType);
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
