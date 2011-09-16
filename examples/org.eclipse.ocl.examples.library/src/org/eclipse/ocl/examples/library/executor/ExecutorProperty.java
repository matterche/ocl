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

import org.eclipse.ocl.examples.domain.elements.DomainProperty;
import org.eclipse.ocl.examples.domain.library.LibraryProperty;
import org.eclipse.ocl.examples.domain.types.DomainType;

public class ExecutorProperty implements DomainProperty
{
	protected final String name;
	protected final ExecutorClass evaluationClass;
	protected final int propertyIndex;
	protected final LibraryProperty implementation;
	protected ExecutorProperty opposite;
	
	public ExecutorProperty(String name, ExecutorClass evaluationClass, int propertyIndex, LibraryProperty implementation) {
		this.name = name;
		this.evaluationClass = evaluationClass;
		this.propertyIndex = propertyIndex;
		this.implementation = implementation;
		this.opposite = null;
	}

	public DomainType getClass_() {
		return evaluationClass;
	}

	public LibraryProperty getImplementation() {
		return implementation;
	}

	public String getName() {
		return name;
	}

	public DomainProperty getOpposite() {
		return opposite;
	}

	public ExecutorClass getType() {
		return evaluationClass;
	}

	void initOpposite(ExecutorProperty opposite) {
		this.opposite = opposite;
	}
	
	@Override
	public String toString() {
		return String.valueOf(evaluationClass) + "::" + String.valueOf(name); //$NON-NLS-1$
	}
}