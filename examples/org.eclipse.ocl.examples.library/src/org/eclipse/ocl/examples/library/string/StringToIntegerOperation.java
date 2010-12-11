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
 * $Id: StringToIntegerOperation.java,v 1.1.2.2 2010/12/11 10:44:20 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.string;

import org.eclipse.ocl.examples.library.util.ObjectUtil2;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;

/**
 * StringToIntegerOperation realises the String::toInteger() library operation.
 * 
 * @since 3.1
 */
public class StringToIntegerOperation extends AbstractStringUnaryOperation
{
	public static final StringToIntegerOperation INSTANCE = new StringToIntegerOperation();

	@Override
	public Object evaluateString(String sourceVal) {
		return ObjectUtil2.createBigInteger(sourceVal.trim());
	}

	@Override
	public Object evaluate(EvaluationVisitor evaluationVisitor,
			Object sourceVal, OperationCallExp operationCall) {
		try {
			return super.evaluate(evaluationVisitor, sourceVal, operationCall);
		}
		catch (NumberFormatException e) {
			return evaluationVisitor.getStandardLibrary().createInvalidValue(sourceVal, operationCall, "Not an Integer", e);
		}
	}
}
