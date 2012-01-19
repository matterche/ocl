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

import java.util.Iterator;

import org.eclipse.ocl.examples.domain.elements.DomainInheritance;
import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.elements.DomainProperty;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.types.AbstractFragment;

public class DomainReflectiveType extends ReflectiveType
{
	protected final DomainStandardLibrary standardLibrary;
	protected final DomainType domainType;

	public DomainReflectiveType(DomainReflectivePackage evaluationPackage, DomainType domainType) {
		super(domainType.getName(), evaluationPackage, computeFlags(domainType));
		this.standardLibrary = evaluationPackage.getStandardLibrary();
		this.domainType = domainType;
	}

	@Override
	protected AbstractFragment createFragment(DomainInheritance baseInheritance) {
		return new DomainReflectiveFragment(this, baseInheritance);
	}

	@Override
	public Iterable<? extends DomainInheritance> getInitialSuperInheritances() {
		final Iterator<? extends DomainType> iterator = domainType.getLocalSuperTypes().iterator();
		return new Iterable<DomainInheritance>()
		{
			public Iterator<DomainInheritance> iterator() {
				return new Iterator<DomainInheritance>()
				{
					public boolean hasNext() {
						return iterator.hasNext();
					}

					public DomainInheritance next() {
						return iterator.next().getInheritance(standardLibrary);
					}

					public void remove() {
						throw new UnsupportedOperationException();
					}					
				};
			}			
		};
	}

	public Iterable<? extends DomainOperation> getLocalOperations() {
		return domainType.getLocalOperations();
	}

	public Iterable<? extends DomainProperty> getLocalProperties() {
		return domainType.getLocalProperties();
	}

	public Iterable<? extends DomainType> getLocalSuperTypes() {
		return domainType.getLocalSuperTypes();
	}

	public String getMetaTypeName() {
		return domainType.getMetaTypeName();
	}

	public DomainStandardLibrary getStandardLibrary() {
		return standardLibrary;
	}
}