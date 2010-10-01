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
 * $Id: AbstractIteration.java,v 1.1.2.1 2010/10/01 13:28:36 ewillink Exp $
 */
package org.eclipse.ocl.examples.library;

import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.ocl.examples.pivot.CallExp;
import org.eclipse.ocl.examples.pivot.EvaluationContext;
import org.eclipse.ocl.examples.pivot.IteratorExp;
import org.eclipse.ocl.examples.pivot.OclExpression;

/**
 * AbstractIteration realises shared characteristics of library iterations.
 * 
 * @since 3.1
 */
public abstract class AbstractIteration extends AbstractFeature implements LibraryIteration
{
	private static AtomicInteger tempCounter = new AtomicInteger();

	public Object evaluate(EvaluationContext evaluationContext, CallExp callExp) {
		OclExpression source = callExp.getSource();
		Object sourceVal = source != null ? source.evaluate(evaluationContext) : null;
		return evaluate(evaluationContext, sourceVal, (IteratorExp) callExp);
	}	

	protected static synchronized String generateName() {
		return "__result__" + tempCounter.getAndIncrement();	//$NON-NLS-1$
	}
}
