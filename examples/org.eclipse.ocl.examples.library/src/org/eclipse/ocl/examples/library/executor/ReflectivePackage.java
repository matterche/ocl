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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;

/**
 * A ReflectivePackage builds a dispatch table representative of a model package at run-time using a minimal reflective API.
 */
public abstract class ReflectivePackage extends ExecutorPackage
{
	protected Map<DomainType, ReflectiveType> types = null;

	public ReflectivePackage(String name, String nsURI) {
		super(name, nsURI);
	}
	
	protected void computeClasses() {
		types = new HashMap<DomainType, ReflectiveType>();
		for (DomainType domainType : getDomainTypes()) {
			ReflectiveType executorType = createExecutorType(domainType);
			types.put(domainType, executorType);
		}
	}

	protected abstract ReflectiveType createExecutorType(DomainType domainType);

	protected abstract Iterable<? extends DomainType> getDomainTypes();

	public ReflectiveType getInheritance(DomainType type) {
		if (types == null) {
			computeClasses();
		}
		return types.get(type);
	}

	public Iterable<? extends DomainType> getOwnedType() {
		if (types == null) {
			computeClasses();
		}
		return types.values();
	}

	protected abstract DomainStandardLibrary getStandardLibrary();
}