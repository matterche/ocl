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
package org.eclipse.ocl.examples.library.collection;

import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.TypeValue;
import org.eclipse.ocl.examples.domain.values.Value;

/**
 * CollectionSelectByKindOperation realises the Collection::selectByType() library operation.
 */
public class CollectionSelectByKindOperation extends AbstractBinaryOperation
{
	public static final CollectionSelectByKindOperation INSTANCE = new CollectionSelectByKindOperation();

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceVal, Value argVal) throws InvalidValueException {
		CollectionValue collectionValue = sourceVal.asCollectionValue();
		TypeValue typeVal = argVal.asTypeValue();
		DomainType typeValue = typeVal.getInstanceType();
		return collectionValue.selectByKind(typeValue);
	}
}
