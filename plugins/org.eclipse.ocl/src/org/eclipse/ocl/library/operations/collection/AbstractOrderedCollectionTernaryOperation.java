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
 * $Id: AbstractOrderedCollectionTernaryOperation.java,v 1.1.2.1 2010/01/24 07:41:04 ewillink Exp $
 */
package org.eclipse.ocl.library.operations.collection;

import java.util.Collection;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.operations.AbstractOperation;

/**
 * AbstractOrderedCollectionTernaryOperation provides the standard null to Bag{}
 * conversion for all ternary ordered collection operations.
 * 
 * @since 3.0
 */
public abstract class AbstractOrderedCollectionTernaryOperation extends AbstractOperation
{
	public <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> visitor, Object sourceVal, OperationCallExp<C, O> operationCall) {
		if (isInvalid(sourceVal)) {
			return null;
		}
		Object argVal1 = visitor.visitArgument(operationCall, 0);
		if (isInvalid(argVal1)) {
			return null;
		}		
		Object argVal2 = visitor.visitArgument(operationCall, 1);
		if (isInvalid(argVal2)) {
			return null;
		}		
		if (isOrderedCollection(sourceVal)) {
			return evaluateCollection((Collection<?>)sourceVal, argVal1, argVal2);
		}
		else {
			return null;
		}
	}
	
	protected abstract Object evaluateCollection(Collection<?> sourceVal, Object argVal1, Object argVal2);
}
