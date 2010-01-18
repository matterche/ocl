/**
 * <copyright>
 *
 * Copyright (c) 2006, 2008 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 252600
 *
 * </copyright>
 *
 * $Id: CompatibilityOCLLibrary.java,v 1.1.2.2 2010/01/18 08:57:52 ewillink Exp $
 */

package org.eclipse.ocl.library;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.expressions.OperationCallExp;

/**
 * A CompatibilityOCLLibrary extends the {@link AbstractOCLLibrary} to provide backward compatibility
 * mappings from types and operations in a traditional Ecore or UML variant of the
 * OCL standard library to the new generic standard library.
 * <p>
 * The mapping is computed lazily since few applications will use more than a few mappings.
 * 
 * @since 3.0
 */
public abstract class CompatibilityOCLLibrary<C extends EObject> extends AbstractOCLLibrary
{
	protected Map<OCLType, Map<Object, OCLOperation>> operationMaps = new HashMap<OCLType, Map<Object, OCLOperation>>();
    protected Map<C, OCLType> typeMap = new HashMap<C, OCLType>();

    public CompatibilityOCLLibrary(String libraryURI) {
		super(libraryURI);
	}
    
    public void addType(C object, OCLType type) {
    	typeMap.put(object, type);
    }

	protected abstract C asClass(Object object);

	protected abstract C asMetaClass(Object object);

	protected OCLType createOCLType(C classifier, Map<EObject, OCLType> visited) {
		OCLType type = LibraryFactory.eINSTANCE.createOCLType();
		type.setName(getName(classifier));
		addType(classifier, type);
		visited.put(classifier, type);
		List<C> eSuperTypes = getSuperTypes(classifier);
		if ((eSuperTypes != null) && !eSuperTypes.isEmpty()) {
	 		for (C superType : eSuperTypes) {
				if (!visited.containsKey(superType)) {
					OCLType superOCLType = createOCLType(superType, visited);
					type.getConforms().add(superOCLType);
				}
			}
		}
		else {
			type.getConforms().add(getOclAny());
		}
		return type;
	}

	protected abstract String getName(C classifier);

	@Override
	public OCLType getOCLTypeOfType(Object object) {
		OCLType oclType = super.getOCLTypeOfType(object);
		if (oclType == null) {
			oclType = typeMap.get(object);
		}
		if (oclType == null) {
			C classifier = asClass(object);
			if (classifier != null) {
				oclType = createOCLType(classifier, new HashMap<EObject, OCLType>());
			}
		}
		return oclType;
	}

	@Override
	public OCLType getOCLTypeOfValue(Object object) {
		OCLType type = super.getOCLTypeOfValue(object);
		if (type == null) {
			C classifier = asMetaClass(object);
			if (classifier != null) {
				type = typeMap.get(classifier);
				if (type == null) {
					type = createOCLType(classifier, new HashMap<EObject, OCLType>());
				}
			}
		}
		return type;
	}
	
	@Override
	public OCLOperation getOperation(OCLType dynamicType, OperationCallExp<?, ?> operationCall) {
		OCLOperation oclOperation = super.getOperation(dynamicType, operationCall);
		if (oclOperation != null) {
			return oclOperation;
		}
		Map<Object, OCLOperation> operationMap = operationMaps.get(dynamicType);
		if (operationMap == null) {
			operationMap = new HashMap<Object, OCLOperation>();
			operationMaps.put(dynamicType, operationMap);
		}
		Object referredOperation = operationCall.getReferredOperation();
		OCLOperation operation = operationMap.get(referredOperation);
		if (operation == null) {
			operation = resolveOperation(dynamicType, referredOperation);
			if (operation != null) {
				operationMap.put(referredOperation, operation);
			}			
		}
		return operation;
	}

	protected abstract List<C> getSuperTypes(C classifier);

	protected abstract OCLOperation resolveOperation(OCLType dynamicType, Object referredOperation);
}