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
 * $Id: OclAsTypeOperation.java,v 1.1.2.1 2010/01/20 06:08:20 ewillink Exp $
 */
package org.eclipse.ocl.library.operations;

import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.OCLLibrary;
import org.eclipse.ocl.library.OCLType;

/**
 * OclAsTypeOperation realises the OclAny::oclIsTypeOf() library operation.
 * 
 * @since 3.0
 */
public class OclAsTypeOperation extends AbstractOperation
{
	@Override
	public Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, Object sourceVal, OperationCallExp<?, ?> operationCall) {
		Environment<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> environment = visitor.getEnvironment();
		OCLLibrary library = environment.getOCLLibrary();
		OCLType sourceType = library.getOCLTypeOfValue(sourceVal);
		if (sourceType == null) {
			return null;
		}
		Object argVal = evaluateArgument(visitor, operationCall, 0);
		OCLType argType = library.getOCLTypeOfType(argVal);
		if (sourceType.conformsTo(argType)) {
			return evaluateConforming(library, sourceVal, argType);
		}
		else {
			return evaluateNonConforming(library, sourceVal, argType);
		}
	}

	protected Object evaluateConforming(OCLLibrary library, Object sourceVal, OCLType argType) {
		return sourceVal;
	}

	protected Object evaluateNonConforming(OCLLibrary library, Object sourceVal, OCLType argType) {
		return null;
	}
}
