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
import org.eclipse.ocl.examples.domain.elements.DomainProperty;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.LibraryProperty;
import org.eclipse.ocl.examples.domain.values.ObjectValue;
import org.eclipse.ocl.examples.domain.values.Value;

public class ExecutorProperty implements DomainProperty
{
	protected final String name;
	protected final DomainInheritance executorType;
	protected final int propertyIndex;
	protected final LibraryProperty implementation;
	protected ExecutorProperty opposite;
	
	public ExecutorProperty(String name, DomainInheritance executorType, int propertyIndex, LibraryProperty implementation) {
		this.name = name;
		this.executorType = executorType;
		this.propertyIndex = propertyIndex;
		this.implementation = implementation;
		this.opposite = null;
	}

	public LibraryProperty getImplementation() {
		return implementation;
	}

	public DomainInheritance getInheritance(DomainStandardLibrary standardLibrary) {
		return executorType;
	}

	public String getName() {
		return name;
	}

	public DomainProperty getOpposite() {
		return opposite;
	}

	public DomainType getType() {
		return executorType;
	}

	void initOpposite(ExecutorProperty opposite) {
		this.opposite = opposite;
	}

	public void setValue(ObjectValue objectValue, Value propertyValue) throws InvalidValueException {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String toString() {
		return String.valueOf(executorType) + "::" + String.valueOf(name); //$NON-NLS-1$
	}
}