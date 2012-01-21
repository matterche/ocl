/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.library.ecore;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.LibraryProperty;
import org.eclipse.ocl.examples.domain.values.ObjectValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;

public class EcoreExecutorProperty extends ExecutorProperty
{
	protected EStructuralFeature eFeature;
	
	public EcoreExecutorProperty(String name, EcoreExecutorType executorType, int propertyIndex, LibraryProperty implementation) {
		super(name, executorType, propertyIndex, implementation);
	}

	@Override
	public void setValue(ObjectValue objectValue, Value propertyValue) throws InvalidValueException {
		EObject eObject = objectValue.asNavigableObject();
		Object eValue = propertyValue.asEcoreObject();
		eObject.eSet(eFeature, eValue);
	}
}