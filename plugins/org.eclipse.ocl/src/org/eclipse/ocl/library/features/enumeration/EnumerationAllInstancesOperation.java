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
 * $Id: EnumerationAllInstancesOperation.java,v 1.1.2.1 2010/01/31 22:23:50 ewillink Exp $
 */
package org.eclipse.ocl.library.features.enumeration;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.OCLTypeValue;
import org.eclipse.ocl.library.features.AbstractOperation;
import org.eclipse.ocl.library.merged.MergedLibrary;
import org.eclipse.ocl.library.merged.OCLEnumeration;
import org.eclipse.ocl.library.merged.OCLEnumerationLiteral;
import org.eclipse.ocl.util.CollectionUtil;

/**
 * EnumerationAllInstancesOperation realises the Enumeration::allInstances() library operation.
 * 
 * @since 3.0
 */
public class EnumerationAllInstancesOperation extends AbstractOperation
{
	public <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> visitor, Object sourceVal, OperationCallExp<C, O> operationCall) {
		Environment<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> environment = visitor.getEnvironment();
		MergedLibrary library = environment.getMergedLibrary();
		OCLTypeValue sourceType = library.getLibraryTypeOfType(sourceVal);
		Set<Object> result = CollectionUtil.createNewSet();
		// the instances are the literals
		for (OCLEnumerationLiteral oclLiteral : ((OCLEnumeration)sourceType).getLiterals()) {
			EObject metaModelElement = oclLiteral.getMetaModelElement();
			result.add(metaModelElement != null ? metaModelElement : oclLiteral);
		}
		return result;
	}
}
