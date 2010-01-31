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
 * $Id: AbstractMergedLibrary.java,v 1.1.2.4 2010/01/31 22:23:42 ewillink Exp $
 */

package org.eclipse.ocl.library.merged;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ocl.library.LibraryFactory;
import org.eclipse.ocl.library.OCLLibrary;
import org.eclipse.ocl.library.OCLParameter;
import org.eclipse.ocl.library.OCLRoot;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.features.AbstractOperation;
import org.eclipse.ocl.library.merged.impl.MergedLibraryImpl;
import org.eclipse.ocl.utilities.ExpressionInOCL;
import org.eclipse.ocl.utilities.UMLReflection;

/**
 * Implementation of the {@link OCLLibrary} for the Ecore environment.
 * @since 3.0
 */
public class AbstractMergedLibrary extends MergedLibraryImpl
{
	private Map<OCLType, MergedType> mergedTypeMap = new HashMap<OCLType, MergedType>();
    
	public AbstractMergedLibrary(OCLRoot baseLibrary) {
		this.baseLibrary = baseLibrary;
	}
	
	public MergedProperty getConformingProperty(OCLType dynamicType, String name) {
		MergedType mergedType = getMergedType(dynamicType);
		return mergedType.getConformingProperty(name);
	}
	
	public MergedType getMergedType(OCLType type) {
		MergedType mergedType = mergedTypeMap.get(type);
		if (mergedType == null) {
			mergedType = OCLMergedLibraryFactory.eINSTANCE.createMergedType();
			mergedType.setMergedLibrary(this);
			mergedType.setType(type);
			mergedType.getConforms().addAll(type.getConforms());
			mergedTypeMap.put(type, mergedType);
		}
		return mergedType;
	}

	public MergedOperation mergeOperation(OCLType ownerType, String name,
			OCLType returnType, String[] paramNames, OCLType[] paramTypes, String stereotype,
			ExpressionInOCL<?, ?> specification) {
		MergedType mergedType = getMergedType(ownerType);
		MergedOperation mergedOperation = mergedType.getExactOperation(name, paramTypes);
		if (mergedOperation == null) {
			MergedOperationDefinition mergedOperationDefinition = OCLMergedLibraryFactory.eINSTANCE.createMergedOperationDefinition();
			mergedOperationDefinition.setName(name);
			mergedOperationDefinition.setType(returnType);
			for (int i = 0; i < paramTypes.length; i++) {
				OCLParameter parameter = LibraryFactory.eINSTANCE.createOCLParameter();
				parameter.setName(paramNames[i]);
				parameter.setType(paramTypes[i]);
				mergedOperationDefinition.getParameter().add(parameter);
			}
			mergedOperation = mergedOperationDefinition;
		}
		if (UMLReflection.DEFINITION.equals(stereotype) || UMLReflection.BODY.equals(stereotype)) {
			if (mergedOperation.getBody() != null) {
				return AbstractOperation.createInvalid(null, "Duplicate body: " + mergedOperation); //$NON-NLS-1$
			}
			mergedOperation.setBody(specification);
		}
		else if (UMLReflection.POSTCONDITION.equals(stereotype)) {
			mergedOperation.getPost().add(specification);
		}
		else if (UMLReflection.PRECONDITION.equals(stereotype)) {
			mergedOperation.getPre().add(specification);
		}
		else {
			return AbstractOperation.createInvalid(null, "Unknown stereotype: " + stereotype  + " for " + mergedOperation); //$NON-NLS-1$ //$NON-NLS-2$			
		}
		mergedType.addOperation(mergedOperation);
		return mergedOperation;
	}

	public MergedProperty mergeProperty(OCLType ownerType, String name,
			OCLType valueType, String stereotype, ExpressionInOCL<?, ?> specification) {
		MergedType mergedType = getMergedType(ownerType);
		MergedProperty mergedProperty = mergedType.getLocalProperty(name);
		if (mergedProperty == null) {
			MergedPropertyDefinition mergedPropertyDefinition = OCLMergedLibraryFactory.eINSTANCE.createMergedPropertyDefinition();
			mergedPropertyDefinition.setName(name);
			mergedPropertyDefinition.setType(valueType);
			mergedType.addProperty(mergedPropertyDefinition);
			mergedProperty = mergedPropertyDefinition;
		}
		else {
			if (mergedProperty.getType() != valueType) {
				return AbstractOperation.createInvalid(null, "Property type mismatch: " + mergedProperty + " : " + valueType); //$NON-NLS-1$ //$NON-NLS-2$
			}
		}
		if (UMLReflection.DERIVATION.equals(stereotype)) {
			if (mergedProperty.getDerive() != null) {
				return AbstractOperation.createInvalid(null, "Duplicate derive: " + mergedProperty); //$NON-NLS-1$
			}
			mergedProperty.setDerive(specification);
		}
		else if (UMLReflection.INITIAL.equals(stereotype) || UMLReflection.DEFINITION.equals(stereotype)) {
			if (mergedProperty.getInit() != null) {
				return AbstractOperation.createInvalid(null, "Duplicate init: " + mergedProperty); //$NON-NLS-1$
			}
			mergedProperty.setInit(specification);
		}
		return mergedProperty;
	}
}