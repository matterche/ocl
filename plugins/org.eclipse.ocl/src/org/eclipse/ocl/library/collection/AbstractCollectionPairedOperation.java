/**
 * <copyright>
 *
 * Copyright (c) 2009 Eclipse Modeling Project and others.
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
 * $Id: AbstractCollectionPairedOperation.java,v 1.1.2.1 2010/01/20 06:07:56 ewillink Exp $
 */
package org.eclipse.ocl.library.collection;

import java.util.Collection;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.operations.AbstractOperation;

/**
 * AbstractCollectionPairedOperation provides the standard null to Bag{}
 * conversion for all symmetrical binary collection operations.
 * 
 * @since 3.0
 */
public abstract class AbstractCollectionPairedOperation extends AbstractOperation
{
	@Override
	public Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, Object sourceVal, OperationCallExp<?, ?> operationCall) throws Exception {
		Object argVal = evaluateArgument(visitor, operationCall, 0);
		if (isInvalid(sourceVal) || isInvalid(argVal)) {
			return evaluateInvalid(sourceVal, argVal);
		}		
		Collection<?> sourceColl = convertToCollection(sourceVal);
		Collection<?> argColl = convertToCollection(argVal);
		return evaluateCollection(sourceColl, argColl);
	}
	
	protected abstract Object evaluateCollection(Collection<?> sourceVal, Collection<?> argVal);
	
	protected Object evaluateInvalid(Object sourceVal, Object argVal) {
		return null;
	}
}
