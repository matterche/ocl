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
 * $Id: ImplicitCompositionProperty.java,v 1.1 2011/04/27 06:19:59 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.library;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.domain.elements.DomainProperty;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractProperty;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

/**
 * The static instance of ImplicitCompositionProperty supports evaluation of
 * implicit properties for opposites of composition relationships.
 */
public class ImplicitCompositionProperty extends AbstractProperty
{
	public static final ImplicitCompositionProperty INSTANCE = new ImplicitCompositionProperty();

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, DomainProperty property) throws InvalidValueException {
		ValueFactory valueFactory = evaluator.getValueFactory();
		EObject thisObject = (EObject) sourceValue.asObject();
		Object thatObject = thisObject.eContainer();
		if (thatObject != null) {
			return valueFactory.valueOf(thatObject);
		}
		else {
			return valueFactory.getNull();
		}
	}
}