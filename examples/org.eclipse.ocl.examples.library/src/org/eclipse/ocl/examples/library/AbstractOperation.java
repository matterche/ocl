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
 * $Id: AbstractOperation.java,v 1.1.2.1 2010/10/01 13:28:36 ewillink Exp $
 */
package org.eclipse.ocl.examples.library;

import java.util.List;

import org.eclipse.ocl.examples.pivot.CallExp;
import org.eclipse.ocl.examples.pivot.EvaluationContext;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.OperationCallExp;

/**
 * @since 3.1
 */
public abstract class AbstractOperation extends AbstractFeature implements LibraryOperation
{
	public Object evaluate(EvaluationContext evaluationContext, CallExp callExp) {
		OclExpression source = callExp.getSource();
		Object sourceVal = source != null ? source.evaluate(evaluationContext) : null;
		return evaluate(evaluationContext, sourceVal, (OperationCallExp) callExp);
	}
	
	protected Object evaluateArgument(EvaluationContext evaluationContext,
			OperationCallExp operationCall, int i) {
		List<OclExpression> args = operationCall.getArguments();
		if ((i < 0) || (args.size() <= i)) {
			return null;
		}
		return args.get(i).evaluate(evaluationContext);
	}

	protected int getNumArguments(OperationCallExp operationCall) {
		List<?> args = operationCall.getArguments();
		return args.size();
	}
}
