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
	boolean conformsTo(DomainStandardLibrary standardLibrary, DomainType type);
	DomainType getCommonType(DomainStandardLibrary standardLibrary, DomainType type);
	DomainInheritance getInheritance(DomainStandardLibrary standardLibrary);
	String getName();
	boolean isEqualTo(DomainStandardLibrary standardLibrary, DomainType type);
	boolean isOrdered();		
	boolean isUnique();		
	boolean isSuperClassOf(DomainStandardLibrary standardLibrary, DomainType type);
	boolean isSuperInheritanceOf(DomainStandardLibrary standardLibrary, DomainInheritance inheritance);
	LibraryFeature lookupImplementation(DomainStandardLibrary standardLibrary, DomainOperation staticOperation) throws InvalidValueException;
	DomainOperation lookupOperation(DomainStandardLibrary standardLibrary, String operationName, DomainType... argumentTypes);
}
