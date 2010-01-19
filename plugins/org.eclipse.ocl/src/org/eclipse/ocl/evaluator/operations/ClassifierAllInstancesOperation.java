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
 * $Id: ClassifierAllInstancesOperation.java,v 1.1.2.1 2010/01/19 22:34:19 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.operations;

import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.OCLClassifier;
import org.eclipse.ocl.library.OCLEnumeration;
import org.eclipse.ocl.library.OCLEnumerationLiteral;
import org.eclipse.ocl.library.OCLInvalidType;
import org.eclipse.ocl.library.OCLLibrary;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.OCLVoidType;
import org.eclipse.ocl.util.CollectionUtil;

/**
 * OclAsCollectionOperation realises the oclAsCollection() library operation.
 * 
 * @since 3.0
 */
public class ClassifierAllInstancesOperation extends AbstractOperation
{
	@Override
	public Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, Object sourceVal, OperationCallExp<?, ?> operationCall) {
		Environment<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> environment = visitor.getEnvironment();
		OCLLibrary library = environment.getOCLLibrary();
		OCLType sourceType = library.getOCLTypeOfType(sourceVal);
		if (sourceType == null) {
			return null;
		}
		Set<Object> result = CollectionUtil.createNewSet();
		if (sourceType instanceof OCLEnumeration) {
			// the instances are the literals
			for (OCLEnumerationLiteral oclLiteral : ((OCLEnumeration)sourceType).getLiterals()) {
				EObject metaModelElement = oclLiteral.getMetaModelElement();
				result.add(metaModelElement != null ? metaModelElement : oclLiteral);
			}
		}
		else if (sourceType instanceof OCLVoidType) {
			// OclVoid has a single instance: null
			result.add(library.getNull());
		}
		else if (sourceType instanceof OCLInvalidType) {
			// OclInvalid has a single instance: invalid
			result.add(library.getInvalid());		// FIXME investigate
		}
		else if (sourceType instanceof OCLClassifier) {
			Map<?, ? extends Set<?>> extentMap = visitor.getExtentMap();
			Set<?> instances = extentMap.get(sourceVal);
			result.addAll(instances);
		}
		return result;
	}
}
