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
package org.eclipse.ocl.examples.library.executor;

import org.eclipse.ocl.examples.domain.elements.DomainPackage;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;

/**
 * DomainExecutorPackage uses the limited Domain interfaces to construct a package description for use
 * in contexts where no explicit ExecutorPackage is available.
 * 
 * This typically occurs when a dynamic Ecore model is used but no MetaModelManager is accessible.
 */
public class DomainReflectivePackage extends ReflectivePackage
{
	protected final DomainStandardLibrary standardLibrary;
	protected final DomainPackage domainPackage;

	public DomainReflectivePackage(DomainStandardLibrary standardLibrary, DomainPackage domainPackage) {
		super(domainPackage.getName(), domainPackage.getNsURI());
		this.standardLibrary = standardLibrary;
		this.domainPackage = domainPackage;
	}

	@Override
	protected ReflectiveType createExecutorType(final DomainType domainType) {
		return new DomainReflectiveType(this, domainType);
	}

	@Override
	protected Iterable<? extends DomainType> getDomainTypes() {
		return domainPackage.getOwnedType();
	}
	
	@Override
	protected DomainStandardLibrary getStandardLibrary() {
		return standardLibrary;
	}
}