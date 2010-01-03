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
 * $Id: OperationVisitor.java,v 1.1.2.2 2010/01/03 22:53:48 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.operations;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;


/**
 * @since 3.0
 */
public interface OperationVisitor
{
	/**
	 * Return true if this OPerationVisitor can evaluate operationCall..
	 * 
	 * @param oc
	 * @return true if operationCall can be evaluated 
	 */
	boolean canEvaluate(OperationCallExp<?, ?> operationCall);

	/**
	 * Return the result of evaluating an operationCall within an environment and an evaluationEnvironment.
	 * 
	 * @param environment
	 * @param evaluationEnvironment
	 * @param oc
	 * @return the result 
	 */
	Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, OperationCallExp<?, ?> operationCall);

	Object getOperationCode();
}
