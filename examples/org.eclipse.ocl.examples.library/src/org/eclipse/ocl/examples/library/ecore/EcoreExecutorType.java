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
package org.eclipse.ocl.examples.library.ecore;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.examples.domain.elements.DomainInheritance;
import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.elements.DomainProperty;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.types.AbstractFragment;
import org.eclipse.ocl.examples.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.examples.library.executor.ReflectiveExecutorType;

public class EcoreExecutorType extends ReflectiveExecutorType
{
	protected final EClassifier eClassifier;
	
	public EcoreExecutorType(EcoreExecutorPackage evaluationPackage, int flags, EClassifier eClassifier) {
		super(eClassifier.getName(), evaluationPackage, flags);
		this.eClassifier = eClassifier;		
	}

	@Override
	protected AbstractFragment createFragment(DomainInheritance baseInheritance) {
		return new EcoreExecutorFragment(this, baseInheritance);
	}

	public final EClassifier getEClassifier() {
		return eClassifier;
	}

	@Override
	public Iterable<? extends DomainInheritance> getInitialSuperInheritances() {
		throw new UnsupportedOperationException();		// FIXME
	}

	public Iterable<? extends DomainOperation> getLocalOperations() {
		throw new UnsupportedOperationException();		// FIXME
	}

	public Iterable<? extends DomainProperty> getLocalProperties() {
		throw new UnsupportedOperationException();		// FIXME
	}

	public Iterable<? extends DomainType> getLocalSuperTypes() {
		throw new UnsupportedOperationException();		// FIXME
	}

	public DomainStandardLibrary getStandardLibrary() {
		return ExecutorStandardLibrary.INSTANCE;
	}
}
