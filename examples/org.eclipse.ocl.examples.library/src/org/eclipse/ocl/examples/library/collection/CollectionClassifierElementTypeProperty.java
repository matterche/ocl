/**
 * <copyright>
 *
 * Copyright (c) 2009,2011 E.D.Willink and others.
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
package org.eclipse.ocl.examples.library.collection;

import org.eclipse.ocl.examples.library.AbstractProperty;
import org.eclipse.ocl.examples.pivot.ClassifierType;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.InvalidValueException;
import org.eclipse.ocl.examples.pivot.PropertyCallExp;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.values.TypeValue;
import org.eclipse.ocl.examples.pivot.values.Value;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;

/**
 * CollectionClassifierElementTypeProperty realizes the CollectionClassifier::elementType() library property.
 */
public class CollectionClassifierElementTypeProperty extends AbstractProperty
{
	public static final CollectionClassifierElementTypeProperty INSTANCE = new CollectionClassifierElementTypeProperty();

	public Value evaluate(EvaluationVisitor evaluationVisitor, Value sourceValue, PropertyCallExp callExp) throws InvalidValueException {
		ValueFactory valueFactory = evaluationVisitor.getValueFactory();
		TypeValue sourceTypeValue = sourceValue.asTypeValue();
		Type sourceType = sourceTypeValue.getInstanceType();
		Type elementType = ((CollectionType)sourceType).getElementType();
		ClassifierType elementClassifierType = evaluationVisitor.getMetaModelManager().getClassifierType(elementType);
		return valueFactory.createTypeValue(elementClassifierType);
	}
}
