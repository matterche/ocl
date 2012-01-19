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
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.library.LibraryFeature;
import org.eclipse.ocl.examples.domain.types.AbstractType;

public class ExecutorTypeParameter extends AbstractType implements ExecutorTypeArgument
{
	public ExecutorTypeParameter(DomainStandardLibrary standardLibrary, String name) {
		super(standardLibrary, name);
	}

	@Deprecated
	public ExecutorTypeParameter(String name) {
		super(null, name);
	}

	public boolean conformsTo(DomainStandardLibrary standardLibrary, DomainType type) {
		throw new UnsupportedOperationException();			// WIP fixme
	}

	public boolean isEqualTo(DomainStandardLibrary standardLibrary, DomainType type) {
		throw new UnsupportedOperationException();			// WIP fixme
	}

	public LibraryFeature lookupImplementation(DomainStandardLibrary standardLibrary, DomainOperation staticOperation) {
		throw new UnsupportedOperationException();			// WIP fixme
	}

	public DomainOperation lookupOperation(DomainStandardLibrary standardLibrary, String operationName, DomainType... argumentTypes) {
		throw new UnsupportedOperationException();			// WIP fixme
	}

	@Override
	public DomainType getCommonType(DomainStandardLibrary standardLibrary, DomainType type) {
		throw new UnsupportedOperationException();			// WIP fixme
	}
}