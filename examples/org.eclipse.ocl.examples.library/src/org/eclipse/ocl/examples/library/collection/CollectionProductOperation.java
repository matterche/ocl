/**
 * <copyright>
 *
 * Copyright (c) 2009,2010 E.D.Willink and others.
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
 * $Id: CollectionProductOperation.java,v 1.1.2.4 2010/12/26 15:20:28 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import org.eclipse.ocl.examples.library.AbstractOperation;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.TupleType;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.values.CollectionValue;
import org.eclipse.ocl.examples.pivot.values.SetValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * CollectionProductOperation realises the Collection::product() library operation.
 * 
 * @since 3.1
 */
public class CollectionProductOperation extends AbstractOperation // FIXME Make this an AbstractBinaryOperation
{
	public static final CollectionProductOperation INSTANCE = new CollectionProductOperation();

	public Value evaluate(EvaluationVisitor evaluationVisitor, Value sourceVal, OperationCallExp operationCall) {
		if (sourceVal.isInvalid()) {
			return null;
		}
		Value argVal = evaluateArgument(evaluationVisitor, operationCall, 0);
		if (sourceVal.isInvalid() || argVal.isInvalid()) {
			return null;
		}		
		CollectionValue argumentValue = argVal.asCollectionValue();
		if (argumentValue == null) {
			return null;
		}
		if (sourceVal.isNull()) {
			return evaluateCollection(evaluationVisitor, createBagValue(), operationCall, argumentValue);
		}
		else if (sourceVal instanceof CollectionValue) {
			return evaluateCollection(evaluationVisitor, (CollectionValue)sourceVal, operationCall, argumentValue);
		}
		else {
			SetValue sourceSet = createSetValue(sourceVal);
			return evaluateCollection(evaluationVisitor, sourceSet, operationCall, argumentValue);
		}
	}

	protected Value evaluateCollection(EvaluationVisitor evaluationVisitor, CollectionValue sourceVal, OperationCallExp operationCall, CollectionValue argVal) {
		CollectionType collType = (CollectionType) operationCall.getType();
		TupleType tupleType = (TupleType) collType.getElementType();
		return sourceVal.product(argVal, tupleType);
	}
}
