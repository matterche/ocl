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
 * $Id: Value.java,v 1.6 2011/05/07 16:41:16 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.types;

import org.eclipse.ocl.examples.domain.elements.DomainElement;
import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.LibraryFeature;

public interface DomainType extends DomainElement
{
	boolean conformsTo(DomainType type, DomainStandardLibrary standardLibrary);
	DomainType getCommonType(DomainType type, DomainStandardLibrary standardLibrary);
	String getName();
	boolean isEqualTo(DomainType type, DomainStandardLibrary standardLibrary);
	boolean isOrdered();		
	boolean isUnique();		
	boolean isSuperClassOf(DomainType type, DomainStandardLibrary standardLibrary);
	boolean isSuperInheritanceOf(DomainInheritance inheritance, DomainStandardLibrary standardLibrary);
	LibraryFeature lookupImplementation(DomainStandardLibrary standardLibrary, DomainOperation staticOperation) throws InvalidValueException;
	DomainOperation lookupOperation(DomainStandardLibrary standardLibrary, String operationName, DomainType... argumentTypes);
}
