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
 * $Id: BooleanAllInstancesOperation.java,v 1.1.2.1 2010/01/31 22:23:45 ewillink Exp $
 */
package org.eclipse.ocl.library.features.logical;

import java.util.Set;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.features.AbstractOperation;
import org.eclipse.ocl.util.CollectionUtil;

/**
 * BooleanAllInstancesOperation realises the Boolean::allInstances() library operation.
 * 
 * @since 3.0
 */
public class BooleanAllInstancesOperation extends AbstractOperation
{
	private static Set<Boolean> allInstances = null;
	
	public <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> visitor, Object sourceVal, OperationCallExp<C, O> operationCall) {
		// Boolean has two instances: false, true
		if (allInstances == null) {
			allInstances = CollectionUtil.createNewSet();
			allInstances.add(Boolean.FALSE);
			allInstances.add(Boolean.TRUE);
		}
		return allInstances;
	}
}
