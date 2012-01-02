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
 * $Id: Nameable.java,v 1.2 2011/01/24 20:49:36 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.elements;

import org.eclipse.ocl.examples.domain.utilities.IndexableIterable;

/**
 * An Inheritance provides access to the transitive inheritance relationships of a type
 * with respect to a particular type regime, noting that the complexities of CompleteOCL allow
 * for different inheritance for different applications.
 * 
 * The allSuperInheritances relationship is computed lazily and invalidated whenever a superclass changes.
 * KnownSubInheritances are also notified of invalidation avoiding the need for an adapting Inheritance
 * to adapt more than its own target class.
 */
public interface DomainInheritance extends DomainType
{
	/**
	 * Return a depth ordered, OclAny-first, OclSelf-last, Iterable of all the super-adapters including this one.
	 */
	Iterable<DomainFragment> getAllSuperFragments();

	/**
	 * Return the inheritance depth of the target type: OclAny is at depth 0.
	 */
	int getDepth();
	
	/**
	 * Return the Standard Library managing the dispatch tables.
	 */
	DomainStandardLibrary getStandardLibrary();
	
	/**
	 * Return an Iterable of all the super-inheritances at a specified depth, between 0 and getDepth() inclusive.
	 */
	IndexableIterable<DomainFragment> getSuperFragments(int depth);


	boolean isSubInheritanceOf(DomainInheritance inheritance);
	boolean isSuperInheritanceOf(DomainStandardLibrary standardLibrary, DomainInheritance inheritance);
	
	DomainFragment getFragment(DomainInheritance thatInheritance);
	DomainFragment getFragment(int fragmentNumber);
	int getIndex(int fragmentNumber);
	int getIndexes();

	DomainInheritance getCommonInheritance(DomainInheritance inheritance);

	boolean isUndefined();

	DomainFragment getSelfFragment();
	DomainOperation lookupLocalOperation(DomainStandardLibrary standardLibrary, String operationName, DomainInheritance... argumentTypes);
}
