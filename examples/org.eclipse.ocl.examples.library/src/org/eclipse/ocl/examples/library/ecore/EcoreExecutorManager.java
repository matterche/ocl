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
package org.eclipse.ocl.examples.library.ecore;

import org.eclipse.ocl.examples.domain.elements.DomainElement;
import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.library.LibraryFeature;
import org.eclipse.ocl.examples.domain.types.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.ElementValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.library.executor.ExecutorManager;

public class EcoreExecutorManager extends ExecutorManager
{
	public static final EcoreExecutorManager INSTANCE = new EcoreExecutorManager(null);		// WIP

	public EcoreExecutorManager(DomainStandardLibrary standardLibrary) {
		super(new EcoreValueFactory(standardLibrary));
	}

	public boolean conformsTo(DomainType firstType, DomainType secondType) {
		// WIP Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	public <E extends DomainElement> ElementValue<E> createElementValue(
			E element) {
		// WIP Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	public DomainEvaluator createNestedEvaluator() {
		return new EcoreExecutorManager(valueFactory.getStandardLibrary());
	}

	public DomainType getCommonType(DomainType firstType, DomainType secondType) {
		// WIP Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	public Object getEcoreValueOf(Value result) {
		// WIP Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	public LibraryFeature lookupImplementation(DomainType dynamicType, DomainOperation operation) {
		// WIP Auto-generated method stub
		throw new UnsupportedOperationException();
	}
}