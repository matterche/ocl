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
 * $Id: OclIsKindOfOperation.java,v 1.1.2.2 2010/01/18 08:57:51 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.operations;

import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.OCLLibrary;
import org.eclipse.ocl.library.OCLType;

/**
 * OclIsKindOfOperation realises the oclIsKindOf() library operation.
 * 
 * @since 3.0
 */
public class OclIsKindOfOperation extends AbstractOperation
{
	@Override
	public Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, Object sourceVal, OperationCallExp<?, ?> operationCall) {
		Environment<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> environment = visitor.getEnvironment();
		OCLLibrary library = environment.getOCLLibrary();
		OCLType sourceType = library.getOCLTypeOfValue(sourceVal);
		Object argVal = evaluateArgument(visitor, operationCall, 0);
		OCLType argType = library.getOCLTypeOfType(argVal);
		return (sourceType != null) && sourceType.conformsTo(argType);
	}
}
