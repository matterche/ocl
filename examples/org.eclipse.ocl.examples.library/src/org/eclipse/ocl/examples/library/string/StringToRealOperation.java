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
 * $Id: StringToRealOperation.java,v 1.1.2.2 2010/12/11 10:44:20 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.string;

import java.math.BigDecimal;

import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;

/**
 * StringToRealOperation realises the String::toReal() library operation.
 * 
 * @since 3.1
 */
public class StringToRealOperation extends AbstractStringUnaryOperation
{
	public static final StringToRealOperation INSTANCE = new StringToRealOperation();

	@Override
	public  Object evaluateString(String sourceVal) {
		return new BigDecimal(sourceVal.trim());
	}

	@Override
	public Object evaluate(EvaluationVisitor evaluationVisitor,
			Object sourceVal, OperationCallExp operationCall) {
		try {
			return super.evaluate(evaluationVisitor, sourceVal, operationCall);
		}
		catch (NumberFormatException e) {
			return evaluationVisitor.getStandardLibrary().createInvalidValue(sourceVal, operationCall, "Not a Real", e);
		}
	}
}
