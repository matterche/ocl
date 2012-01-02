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
import org.eclipse.ocl.examples.domain.elements.DomainProperty;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.library.LibraryFeature;
import org.eclipse.ocl.examples.domain.types.AbstractFragment;
import org.eclipse.ocl.examples.domain.utilities.ArrayIterable;

/**
 * An ExecutorFragment provides the description of the properties and operations defined by some class when accessed by the same
 * or another class. The descriptions are normally built by direct static construction from auto-generated code, with instnaces defined
 * in isolation during construction then cross-references defined later by calls to init().
 */
public class ExecutorFragment extends AbstractFragment
{
	private ExecutorOperation[] operations;
	private ExecutorProperty[] properties;

	public ExecutorFragment(ExecutorType derivedInheritance, DomainInheritance baseInheritance) {
		super(derivedInheritance, baseInheritance);
		this.operations = null;
		this.properties = null;
	}

	@Deprecated
	public ExecutorFragment(ExecutorType derivedInheritance, DomainInheritance baseInheritance, ExecutorOperation[] operations, ExecutorProperty[] properties) {
		super(derivedInheritance, baseInheritance);
		this.operations = operations;
		this.properties = properties;
	}
	
	public LibraryFeature getImplementation(DomainOperation staticOperation) {
		int index = staticOperation.getIndex();
		if (index >= 0) {
			return operations[index].implementation;
		}
		else {
			throw new UnsupportedOperationException();		// WIP 
		}
	}

	public Iterable<? extends DomainOperation> getLocalOperations() {
		return new ArrayIterable<ExecutorOperation>(operations);
	}
	
	public Iterable<? extends DomainProperty> getLocalProperties() {
		return new ArrayIterable<ExecutorProperty>(properties);
	}

	public Iterable<? extends DomainType> getLocalSuperTypes() {
		throw new UnsupportedOperationException();		// WIP 
	}

	public void initOperations(ExecutorOperation[] operations) {
		assert this.operations == null;
		this.operations = operations;
	}

	public void initProperties(ExecutorProperty[] properties) {
		assert this.properties == null;
		this.properties = properties;
	}
}