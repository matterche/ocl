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
 * $Id: ClassifierOclContainerOperation.java,v 1.2 2011/05/07 16:41:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.classifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.domain.elements.DomainElement;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractUnaryOperation;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.values.ObjectValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

/**
 * ClassifierOclContainerOperation realises the Classifier::oclContainer() library operation.
 */
public class ClassifierOclContainerOperation extends AbstractUnaryOperation
{
	public static final ClassifierOclContainerOperation INSTANCE = new ClassifierOclContainerOperation();

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceVal) throws InvalidValueException {
		ValueFactory valueFactory = evaluator.getValueFactory();
		ObjectValue objectVal = sourceVal.asObjectValue();
		Object object = objectVal.getObject();
		if (object instanceof EObject) {
			EObject eContainer = ((EObject)object).eContainer();
			if (eContainer != null) {
				return valueFactory.valueOf(eContainer);
			}
			else {
				return valueFactory.getNull();
			}
		}
		else if (object instanceof DomainElement) {
			// FIXME containers
			return valueFactory.getNull();
		}
		else {
			return valueFactory.throwInvalidValueException(EvaluatorMessages.EObjectRequired, object.getClass().getName());
		}
	}
}
