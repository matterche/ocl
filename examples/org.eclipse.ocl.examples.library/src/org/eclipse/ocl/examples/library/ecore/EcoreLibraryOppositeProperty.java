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

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.domain.elements.DomainProperty;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractProperty;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.Value;

/** 
 * An EcoreLibraryOppositeProperty provides the LibraryProperty to implement a
 * PropertyCallExp using the inverse navigation of an EStructuralFeature.
 */
public class EcoreLibraryOppositeProperty extends AbstractProperty
{
	protected final EStructuralFeature eFeature;

	public EcoreLibraryOppositeProperty(EStructuralFeature eFeature) {
		this.eFeature = eFeature;
	}

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, DomainProperty property) throws InvalidValueException {
		throw new UnsupportedOperationException();		// WIP
	}
}