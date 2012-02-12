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
package org.eclipse.ocl.examples.library.executor;

import org.eclipse.ocl.examples.domain.elements.DomainInheritance;
import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.library.LibraryFeature;
import org.eclipse.ocl.examples.domain.utilities.ArrayIterable;
import org.eclipse.ocl.examples.domain.utilities.IndexableIterable;

public class ExecutorOperation implements DomainOperation
{
	protected final String name;
	protected final DomainInheritance inheritance;
	protected final int index;
	protected final LibraryFeature implementation;
	protected final ExecutorTypeArgument[] parameterTypes;
	
	public ExecutorOperation(String name, DomainInheritance inheritance, int index, LibraryFeature implementation, ExecutorTypeArgument... parameterTypes) {
		this.name = name;
		this.inheritance = inheritance;
		this.index = index;
		this.implementation = implementation;
		this.parameterTypes = parameterTypes;
	}

	public LibraryFeature getImplementation() {
		return implementation;
	}

	public final int getIndex() {
		return index;
	}

	public final DomainInheritance getInheritance(DomainStandardLibrary standardLibrary) {
		return inheritance;
	}

	public final String getName() {
		return name;
	}

	public IndexableIterable<DomainType> getParameterType() {
		return new ArrayIterable<DomainType>(parameterTypes);
	}

	public boolean isStatic() {
		return false;								// WIP FIXME
	}

	@Override
	public String toString() {
		return inheritance.toString() + "::" + name; //$NON-NLS-1$
	}
}