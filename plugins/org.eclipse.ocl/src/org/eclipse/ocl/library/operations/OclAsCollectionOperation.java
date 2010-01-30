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
 * $Id: OclAsCollectionOperation.java,v 1.1.2.3 2010/01/30 07:49:39 ewillink Exp $
 */
package org.eclipse.ocl.library.operations;

import java.util.Collection;
import java.util.Set;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.util.CollectionUtil;

/**
 * OclAsCollectionOperation realises the oclAsCollection() library operation.
 * 
 * @since 3.0
 */
public class OclAsCollectionOperation extends AbstractOperation
{
	public <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> visitor, Object sourceVal, OperationCallExp<C, O> operationCall) {
		if (isInvalid(sourceVal)) {
			return null;
		}
		if (isNull(sourceVal)) {
			return null;
		}
		if (sourceVal instanceof Collection<?>) {
			return sourceVal;
		}
		Set<Object> newSet = CollectionUtil.createNewSet();
		newSet.add(sourceVal);
		return newSet;
	}
}
