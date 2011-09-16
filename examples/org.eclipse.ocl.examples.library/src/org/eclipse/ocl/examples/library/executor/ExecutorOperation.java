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

import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.library.LibraryFeature;
import org.eclipse.ocl.examples.domain.types.DomainInheritance;
import org.eclipse.ocl.examples.domain.types.DomainType;

public class ExecutorOperation implements DomainOperation
{
	protected final String name;
	protected final DomainInheritance inheritance;
	protected final int index;
	protected final LibraryFeature implementation;
	
	public ExecutorOperation(String name, DomainInheritance inheritance, int index, LibraryFeature implementation, ExecutorTypeArgument... parameterTypes) {
		this.name = name;
		this.inheritance = inheritance;
		this.index = index;
		this.implementation = implementation;
	}

	public final int getIndex() {
		return index;
	}

	public final DomainInheritance getInheritance() {
		return inheritance;
	}

	public final String getName() {
		return name;
	}

	public final DomainType getType() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return inheritance.toString() + "::" + name; //$NON-NLS-1$
	}
}