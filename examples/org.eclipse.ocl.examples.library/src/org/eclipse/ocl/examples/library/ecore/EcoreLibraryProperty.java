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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.domain.elements.DomainProperty;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractProperty;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

/** 
 * An EcoreLibraryProperty provides the LibraryProperty to implement a
 * PropertyCallExp using an EStructuralFeature.
 */
public class EcoreLibraryProperty extends AbstractProperty
{
	protected final EStructuralFeature eFeature;

	public EcoreLibraryProperty(EStructuralFeature eFeature) {
		this.eFeature = eFeature;
	}

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, DomainProperty property) throws InvalidValueException {
		ValueFactory valueFactory = evaluator.getValueFactory();
		Object object = sourceValue.asObject();
		if (!(object instanceof EObject)) {
			return evaluator.throwInvalidEvaluation(null, null, object, "non-EObject"); //$NON-NLS-1$
		}
		Object eValue = ((EObject)object).eGet(eFeature);
		return valueFactory.valueOf(eValue, eFeature);
	}

	@Override
	public String toString() {
		return String.valueOf(eFeature.getContainerClass().getPackage().getName()) + "::" + String.valueOf(eFeature.getContainerClass().getName()) + "." + String.valueOf(eFeature.getName());  //$NON-NLS-1$//$NON-NLS-2$
	}
}