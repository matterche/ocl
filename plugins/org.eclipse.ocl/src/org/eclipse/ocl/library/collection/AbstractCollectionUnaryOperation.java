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
 * $Id: AbstractCollectionUnaryOperation.java,v 1.1.2.1 2010/01/20 06:07:58 ewillink Exp $
 */
package org.eclipse.ocl.library.collection;

import java.util.Collection;
import java.util.Set;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.operations.AbstractOperation;
import org.eclipse.ocl.util.CollectionUtil;

/**
 * AbstractCollectionUnaryOperation provides the standard null to Bag{}
 * conversion for all unary collection operations.
 * 
 * @since 3.0
 */
public abstract class AbstractCollectionUnaryOperation extends AbstractOperation
{
	@Override
	public Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, Object sourceVal, OperationCallExp<?, ?> operationCall) throws Exception {
		if (isInvalid(sourceVal)) {
			return null;
		}
		else if (isNull(sourceVal)) {
			return evaluateCollection(CollectionUtil.createNewBag());
		}
		else if (sourceVal instanceof Collection<?>) {
			return evaluateCollection((Collection<?>)sourceVal);
		}
		else {
			Set<Object> sourceSet = CollectionUtil.createNewSet();
			sourceSet.add(sourceVal);
			return evaluateCollection(sourceSet);
		}
	}
	
	protected abstract Object evaluateCollection(Collection<?> sourceVal);
}
