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
 * $Id: AbstractOperation.java,v 1.1.2.1 2009/12/14 21:59:09 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.operations;

import java.util.List;

import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.LibraryOperation;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.types.OCLStandardLibrary;


/**
 * @since 3.0
 */
public abstract class AbstractOperation implements LibraryOperation
{
	protected final Object operationCode;

	public AbstractOperation(Object operationCode) {
		this.operationCode = operationCode;
	}


	protected <C, O> Object evaluateSource(EvaluationVisitor<?, C, O, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, OperationCallExp<C, O> operationCall) {
		try {
			OCLExpression<?> source = operationCall.getSource();
			return source.accept(visitor);
		}
		catch (Exception e) {
			Environment<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> environment = visitor.getEnvironment();
			OCLStandardLibrary<?> oclStandardLibrary = environment.getOCLStandardLibrary();
			return oclStandardLibrary.getInvalid();
		}
	}

	protected int getNumArguments(OperationCallExp<?, ?> operationCall) {
		List<?> args = operationCall.getArgument();
		return args.size();
	}

	public Object getOperationCode() {
		return operationCode;
	}

	/**
	 * Convenience method to determine whether the specified value is the <tt>null</tt>
     * or <tt>invalid</tt> value.
	 * 
	 * @param value a value
	 * 
	 * @return whether it is undefined
	 */
	protected boolean isUndefined(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, Object value) {
		Environment<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> environment = visitor.getEnvironment();
		OCLStandardLibrary<?> oclStandardLibrary = environment.getOCLStandardLibrary();
		return (value == null) || 		// FIXME Deprecated
		(value == oclStandardLibrary.getNull()) || 
		(value == oclStandardLibrary.getInvalid());
	}
	
	/**
	 * Convenience method to determine whether the specified value is the <tt>invalid</tt> value.
	 * 
	 * @param value a value
	 * 
	 * @return whether it is undefined
	 */
	protected boolean isInvalid(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, Object value) {
		Environment<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> environment = visitor.getEnvironment();
		OCLStandardLibrary<?> oclStandardLibrary = environment.getOCLStandardLibrary();
		return (value == null) || 		// FIXME Deprecated
		(value == oclStandardLibrary.getInvalid());
	}
	
//	public String toString() {
//		Environment<?, C, O, ?, ?, ?, ?, ?, ?, ?, ?, ?> environment = visitor.getEnvironment();
//		UMLReflection<?, C, O, ?, ?, ?, ?, ?, ?, ?> reflection = environment.getUMLReflection();
//		return "::" + reflection.getName(operation);
//	}
}
