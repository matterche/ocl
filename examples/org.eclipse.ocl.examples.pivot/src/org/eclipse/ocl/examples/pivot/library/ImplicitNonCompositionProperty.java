/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: ImplicitNonCompositionProperty.java,v 1.1 2011/04/27 06:19:59 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.library;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.domain.elements.DomainProperty;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.DomainModelManager;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractProperty;
import org.eclipse.ocl.examples.domain.types.DomainCollectionType;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

/**
 * The static instance of ImplicitNonCompositionProperty supports evaluation of
 * implicit properties for opposites of non-composition relationships.
 */
public class ImplicitNonCompositionProperty extends AbstractProperty
{
	public static final ImplicitNonCompositionProperty INSTANCE = new ImplicitNonCompositionProperty();

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, DomainProperty thisProperty) throws InvalidValueException {
		ValueFactory valueFactory = evaluator.getValueFactory();
		DomainModelManager modelManager = evaluator.getModelManager();
		DomainProperty thatProperty = thisProperty.getOpposite();
		DomainType thatType = thisProperty.getType();		
		List<Value> results = new ArrayList<Value>();
		for (EObject eObject : modelManager.get(thatType)) {	// FIXME Use a cache
			EClass eClass = eObject.eClass();
			EStructuralFeature eFeature = eClass.getEStructuralFeature(thatProperty.getName());
			Object eGet = eObject.eGet(eFeature);
			if (eGet == sourceValue) {
				results.add(valueFactory.valueOf(eObject));
			}
		}
		return valueFactory.createBagValue((DomainCollectionType)returnType, results);
	}
}