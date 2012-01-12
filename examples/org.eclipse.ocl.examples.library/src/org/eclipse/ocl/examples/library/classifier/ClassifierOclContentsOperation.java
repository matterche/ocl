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
 * $Id: ClassifierOclContentsOperation.java,v 1.2 2011/05/07 16:41:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.classifier;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.domain.elements.DomainCollectionType;
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
 * ClassifierOclContentsOperation realises the Classifier::oclContents() library operation.
 */
public class ClassifierOclContentsOperation extends AbstractUnaryOperation
{
	public static final ClassifierOclContentsOperation INSTANCE = new ClassifierOclContentsOperation();

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue) throws InvalidValueException {
		ValueFactory valueFactory = evaluator.getValueFactory();
		ObjectValue objectVal = sourceValue.asObjectValue();
		Object object = objectVal.getObject();
		if (object instanceof EObject) {
	    	Set<Value> collection = new HashSet<Value>();
			for (Object eContent : ((EObject)object).eContents()) {
				collection.add(valueFactory.valueOf(eContent));
	    	}
	    	return valueFactory.createSetValue((DomainCollectionType)returnType, collection);
		}
		else if (object instanceof DomainElement) {
	    	Set<Value> collection = new HashSet<Value>();
	    	// FIXME contents
	    	return valueFactory.createSetValue((DomainCollectionType)returnType, collection);
		}
		else {
			return valueFactory.throwInvalidValueException(EvaluatorMessages.EObjectRequired, object.getClass().getName());
		}
	}
}
