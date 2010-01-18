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
 * $Id: AbstractOrderedCollectionUnaryOperation.java,v 1.1.2.1 2010/01/18 08:57:49 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.collection;

import java.util.Collection;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.evaluator.operations.AbstractOperation;
import org.eclipse.ocl.expressions.OperationCallExp;

/**
 * AbstractOrderedCollectionUnaryOperation provides the standard null to Bag{}
 * conversion for all unary ordered collection operations.
 * 
 * @since 3.0
 */
public abstract class AbstractOrderedCollectionUnaryOperation extends AbstractOperation
{
	@Override
	public Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, Object sourceVal, OperationCallExp<?, ?> operationCall) throws Exception {
		if (isInvalid(sourceVal)) {
			return null;
		}
		if (isOrderedCollection(sourceVal)) {
			return evaluateCollection((Collection<?>)sourceVal);
		}
		else {
			return null;
		}
	}
	
	protected abstract Object evaluateCollection(Collection<?> sourceVal);
}
