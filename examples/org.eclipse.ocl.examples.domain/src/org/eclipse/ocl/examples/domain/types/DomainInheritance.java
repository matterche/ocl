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
package org.eclipse.ocl.examples.domain.types;

import java.util.List;

import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.library.LibraryFeature;

/**
 * An Inheritance provides access to the transitive inheritance relationships of a type
 * with respect to a particular type regime, noting that the complexities of CompleteOCL allow
 * for different inheritance for different applications.
 * 
 * The allSuperInheritances relationship is computed lazily and invalidated whenever a superclass changes.
 * KnownSubInheritances are also notified of invalidation avoiding the need for an adapting Inheritance
 * to adapt more than its own target class.
 */
public interface DomainInheritance
{
	/**
	 * Return a depth ordered, OclAny-first, OclSelf-last, Iterable of all the super-adapters including this one.
	 */
	Iterable<DomainInheritance> getAllSuperInheritances();

	/**
	 * Return the inheritance depth of the target type: OclAny is at depth 0.
	 */
	int getDepth();
	
	DomainStandardLibrary getStandardLibrary();
	
	/**
	 * Return an Iterable of all the super-inheritances at a specified depth, between 0 and getDepth() inclusive.
	 */
	Iterable<DomainInheritance> getSuperInheritances(int depth);

	DomainType getType();


	boolean isSubInheritanceOf(DomainInheritance thatInheritance);
	boolean isSuperInheritanceOf(DomainInheritance thatInheritance, DomainStandardLibrary standardLibrary);
	
	void addSubInheritance(DomainInheritance subInheritance);
	void gatherUninstalledInheritances(List<DomainInheritance> inheritances);
	DomainFragment[] getFragments();
	int[] getIndexes();
	boolean install();
	void installIn(DomainInheritance subInheritance, List<List<DomainFragment>> all);
	boolean isInstallable();
	boolean isInstalled();
	void removeSubInheritance(DomainInheritance subInheritance);
	void uninstall();

	DomainInheritance getCommonInheritance(DomainInheritance inheritance);

	boolean isUndefined();

	LibraryFeature lookupImplementation(DomainOperation staticOperation);
}
