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
package org.eclipse.ocl.examples.domain.elements;

import org.eclipse.ocl.examples.domain.library.LibraryFeature;

public interface DomainFragment
{
	DomainFragment getBaseFragment();
	DomainInheritance getBaseInheritance();
	DomainInheritance getDerivedInheritance();
	LibraryFeature getImplementation(DomainOperation staticOperation);
//	Iterable<? extends DomainOperation> getOperations();
//	Iterable<? extends DomainProperty> getProperties();
//	void initOperations(String name);
//	DomainOperation lookupOperation(DomainStandardLibrary standardLibrary, DomainType staticType, String operationName, DomainType[] argumentTypes);
}