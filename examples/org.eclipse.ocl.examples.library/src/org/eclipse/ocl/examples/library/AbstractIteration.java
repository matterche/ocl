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
 * $Id: AbstractIteration.java,v 1.1.2.3 2010/12/06 17:13:33 ewillink Exp $
 */
package org.eclipse.ocl.examples.library;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.ocl.examples.pivot.CallExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;

/**
 * AbstractIteration realises shared characteristics of library iterations.
 * 
 * @since 3.1
 */
public abstract class AbstractIteration extends AbstractFeature implements LibraryOperation
{
	private static AtomicInteger tempCounter = new AtomicInteger();

	public Object evaluate(EvaluationVisitor evaluationVisitor, Object sourceValue, CallExp callExp) {
		return evaluate(evaluationVisitor, sourceValue, (OperationCallExp) callExp);
	}	

	protected static synchronized String generateName() {
		return "__result__" + tempCounter.getAndIncrement();	//$NON-NLS-1$
	}

	protected OclExpression getBody(OperationCallExp iteratorExp) {
		// TODO Auto-generated method stub
		return null; //iteratorExp.getReferredOperation().get;
	}

	protected List<Variable> getIterators(OperationCallExp iteratorExp) {
		// TODO Auto-generated method stub
		return null; //iteratorExp.getReferredOperation().getOwnedParameters();
	}
}
