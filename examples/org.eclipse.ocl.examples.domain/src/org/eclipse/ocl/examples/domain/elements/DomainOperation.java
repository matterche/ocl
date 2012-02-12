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
import org.eclipse.ocl.examples.domain.utilities.IndexableIterable;

public interface DomainOperation extends DomainNamedElement
{
	/**
	 * Return the index of this operation in the operation dispatch table.
	 */
	int getIndex();
	
	/**
	 * Return the implementation of this operation.
	 */
	LibraryFeature getImplementation();

	/**
	 * Return the Inheritance dispatch table for the owning type.
	 */
	DomainInheritance getInheritance(DomainStandardLibrary standardLibrary);
	
	/**
	 * Return the ordered list of parameters of this operation.
	 */
	IndexableIterable<? extends DomainType> getParameterType();

	/**
	 * Return true if this is a static operation.
	 */
	boolean isStatic();
}
