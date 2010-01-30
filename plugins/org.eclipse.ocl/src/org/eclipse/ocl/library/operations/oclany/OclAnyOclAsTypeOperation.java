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
 * $Id: OclAnyOclAsTypeOperation.java,v 1.1.2.1 2010/01/30 20:15:35 ewillink Exp $
 */
package org.eclipse.ocl.library.operations.oclany;

import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.merged.MergedLibrary;
import org.eclipse.ocl.library.operations.AbstractOperation;

/**
 * OclAnyOclAsTypeOperation realises the OclAny::oclAsType() library operation.
 * 
 * @since 3.0
 */
public class OclAnyOclAsTypeOperation extends AbstractOperation
{
	public <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> visitor, Object sourceVal, OperationCallExp<C, O> operationCall) {
		Environment<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> environment = visitor.getEnvironment();
		MergedLibrary library = environment.getMergedLibrary();
		OCLType sourceType = library.getLibraryTypeOfValue(sourceVal, operationCall.getSource().getType());
		if (sourceType == null) {
			return null;
		}
		Object argVal = visitor.visitArgument(operationCall, 0);
		OCLType argType = library.getLibraryTypeOfType(argVal);
		if (sourceType.conformsTo(argType)) {
			return evaluateConforming(library, sourceVal, argType);
		}
		else {
			return evaluateNonConforming(library, sourceVal, argType);
		}
	}

	protected Object evaluateConforming(MergedLibrary library, Object sourceVal, OCLType argType) {
		return sourceVal;
	}

	protected Object evaluateNonConforming(MergedLibrary library, Object sourceVal, OCLType argType) {
		return null;
	}
}
