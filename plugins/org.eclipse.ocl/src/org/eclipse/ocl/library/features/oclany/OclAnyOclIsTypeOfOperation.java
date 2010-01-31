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
 * $Id: OclAnyOclIsTypeOfOperation.java,v 1.1.2.1 2010/01/31 22:23:41 ewillink Exp $
 */
package org.eclipse.ocl.library.features.oclany;

import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.features.AbstractOperation;
import org.eclipse.ocl.library.merged.MergedLibrary;

/**
 * OclAnyOclIsTypeOfOperation realises the OclAny::oclIsTypeOf() library operation.
 * 
 * @since 3.0
 */
public class OclAnyOclIsTypeOfOperation extends AbstractOperation
{
	public <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> visitor, Object sourceVal, OperationCallExp<C, O> operationCall) {
		Environment<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> environment = visitor.getEnvironment();
		MergedLibrary library = environment.getMergedLibrary();
		OCLType sourceType = library.getLibraryTypeOfValue(sourceVal, operationCall.getSource().getType());
		Object argVal = visitor.visitArgument(operationCall, 0);
		OCLType argType = library.getLibraryTypeOfType(argVal);
		return (sourceType != null) && (sourceType == argType);
	}
}
