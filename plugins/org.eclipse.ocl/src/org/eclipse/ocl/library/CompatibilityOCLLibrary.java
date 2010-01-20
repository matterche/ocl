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
 * $Id: CompatibilityOCLLibrary.java,v 1.1.2.5 2010/01/20 09:09:33 ewillink Exp $
 */

package org.eclipse.ocl.library;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.PropertyCallExp;

/**
 * A CompatibilityOCLLibrary extends the {@link AbstractOCLLibrary} to provide backward compatibility
 * mappings from types and operations in a traditional Ecore or UML variant of the
 * OCL standard library to the new generic standard library.
 * <p>
 * The mapping is computed lazily since few applications will use more than a few mappings.
 * 
 * @since 3.0
 */
public abstract class CompatibilityOCLLibrary<NE extends EObject, TE extends NE, PK extends NE, T extends NE, CT extends T, DT extends T, ET extends T, EL extends NE, OF extends NE, OP extends TE, PF extends TE> extends AbstractOCLLibrary
{
	protected Map<OCLType, Map<OF, OCLOperation>> operationMaps = new HashMap<OCLType, Map<OF, OCLOperation>>();
	protected Map<OCLType, Map<PF, OCLProperty>> propertyMaps = new HashMap<OCLType, Map<PF, OCLProperty>>();
    protected Map<T, OCLType> typeMap = new HashMap<T, OCLType>();

    public CompatibilityOCLLibrary(String libraryURI) {
		super(libraryURI);
	}
    
    public void addType(T object, OCLType type) {
    	typeMap.put(object, type);
    }

	protected abstract T asMetaType(Object object);

	protected abstract T asType(Object object);

	protected abstract OCLClassifier createOCLClassifier();

	protected OCLClassifier createOCLClassifier(CT aClassifier, Map<T, OCLType> visited) {
		OCLClassifier oclClassifier = createOCLClassifier();
		oclClassifier.setName(getName(aClassifier));
		oclClassifier.setMetaModelElement(aClassifier);
		addType(aClassifier, oclClassifier);
		visited.put(aClassifier, oclClassifier);		
		for (OF anOperation : getOperations(aClassifier)) {
			OCLMetaModelOperation oclOperation = createOCLMetaModelOperation();
			oclOperation.setName(getName(anOperation));
			oclOperation.setMetaModelElement(anOperation);
			oclClassifier.getOperation().add(oclOperation);
			oclOperation.setType(getOCLTypeOfType(getReturnType(anOperation)));
			for (OP aParameter : getParameters(anOperation)) {
				OCLParameter oclParameter = LibraryFactory.eINSTANCE.createOCLParameter();
				oclParameter.setName(getName(aParameter));
//				oclParameter.setMetaModelElement(aParameter);
				oclOperation.getParameter().add(oclParameter);
				oclParameter.setType(getOCLTypeOfType(getType(aParameter)));
			}
		}
		for (PF aProperty : getProperties(aClassifier)) {
			OCLMetaModelProperty oclProperty = createOCLMetaModelProperty();
			oclProperty.setName(getName(aProperty));
			oclProperty.setMetaModelElement(aProperty);
			oclClassifier.getProperty().add(oclProperty);
			oclProperty.setType(getOCLTypeOfType(getType(aProperty)));
		}		
		List<? extends T> eSuperTypes = getSuperTypes(aClassifier);
		if ((eSuperTypes != null) && !eSuperTypes.isEmpty()) {
	 		for (T superType : eSuperTypes) {
				if (!visited.containsKey(superType)) {
					OCLType superOCLType = createOCLType(superType, visited);
					oclClassifier.getConforms().add(superOCLType);
				}
			}
		}
		else {
			oclClassifier.getConforms().add(getOclAny());
		}
		return oclClassifier;
	}

	protected abstract OCLDataType createOCLDataType();
	
	protected OCLDataType createOCLDataType(DT aDataType, Map<T, OCLType> visited) {
		OCLDataType oclDataType = createOCLDataType();
		oclDataType.setName(getName(aDataType));
		oclDataType.setMetaModelElement(aDataType);
		oclDataType.getConforms().add(getOclAny());
		addType(aDataType, oclDataType);
		return oclDataType;
	}

	protected abstract OCLEnumeration createOCLEnumeration();

	protected OCLEnumeration createOCLEnumeration(ET anEnumeration, Map<T, OCLType> visited) {
		OCLEnumeration oclEnumeration = createOCLEnumeration();
		oclEnumeration.setName(getName(anEnumeration));
		oclEnumeration.setMetaModelElement(anEnumeration);
		oclEnumeration.getConforms().add(getOclAny());
		addType(anEnumeration, oclEnumeration);
		visited.put(anEnumeration, oclEnumeration);
		for (EL aLiteral : getLiterals(anEnumeration)) {
			OCLEnumerationLiteral oclLiteral = createOCLEnumerationLiteral();
			oclLiteral.setName(getName(aLiteral));
			oclLiteral.setMetaModelElement(aLiteral);
			oclEnumeration.getLiterals().add(oclLiteral);
		}
		return oclEnumeration;
	}
	
	protected abstract OCLEnumerationLiteral createOCLEnumerationLiteral();

	protected abstract OCLMetaModelOperation createOCLMetaModelOperation();

	protected abstract OCLMetaModelProperty createOCLMetaModelProperty();

	protected abstract OCLType createOCLType(T aType, Map<T, OCLType> visited);

	protected abstract List<EL> getLiterals(ET enumeration);

	protected abstract String getName(NE namedElement);

	@Override
	public OCLType getOCLTypeOfType(Object object) {
		OCLType oclType = super.getOCLTypeOfType(object);
		if (oclType == null) {
			oclType = typeMap.get(object);
		}
		if (oclType == null) {
			T aType = asType(object);
			if (aType != null) {
				oclType = createOCLType(aType, new HashMap<T, OCLType>());
			}
		}
		return oclType;
	}

	@Override
	public OCLType getOCLTypeOfValue(Object object) {
		OCLType type = super.getOCLTypeOfValue(object);
		if (type == null) {
			T aType = asMetaType(object);
			if (aType != null) {
				type = typeMap.get(aType);
				if (type == null) {
					type = createOCLType(aType, new HashMap<T, OCLType>());
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
		Map<OF, OCLOperation> operationMap = operationMaps.get(dynamicType);
		if (operationMap == null) {
			operationMap = new HashMap<OF, OCLOperation>();
			operationMaps.put(dynamicType, operationMap);
		}
		@SuppressWarnings("unchecked")
		OF referredOperation = (OF) operationCall.getReferredOperation();
		OCLOperation operation = operationMap.get(referredOperation);
		if ((operation == null) && !operationMap.containsKey(referredOperation)) {
			operation = resolveOperation(dynamicType, referredOperation);
			operationMap.put(referredOperation, operation);
		}
		return operation;
	}

	protected abstract List<OF> getOperations(CT aClassifier);

	protected abstract List<OP> getParameters(OF anOperation);

	protected abstract List<PF> getProperties(CT aClassifier);
	
	@Override
	public OCLProperty getProperty(OCLType dynamicType, PropertyCallExp<?, ?> propertyCall) {
		OCLProperty oclProperty = super.getProperty(dynamicType, propertyCall);
		if (oclProperty != null) {
			return oclProperty;
		}
		Map<PF, OCLProperty> propertyMap = propertyMaps.get(dynamicType);
		if (propertyMap == null) {
			propertyMap = new HashMap<PF, OCLProperty>();
			propertyMaps.put(dynamicType, propertyMap);
		}
		@SuppressWarnings("unchecked")
		PF referredProperty = (PF) propertyCall.getReferredProperty();
		OCLProperty property = propertyMap.get(referredProperty);
		if ((property == null) && !propertyMap.containsKey(referredProperty)) {
			property = resolveProperty(dynamicType, referredProperty);
			propertyMap.put(referredProperty, property);
		}
		return property;
	}

	protected abstract T getReturnType(OF anOperation);

	protected abstract List<? extends T> getSuperTypes(CT classifier);

	protected abstract T getType(TE typedElement);
	
	public abstract void loadPackage(PK aPackage);

	protected abstract OCLOperation resolveOperation(OCLType dynamicType, OF anOperation);

	protected abstract OCLProperty resolveProperty(OCLType dynamicType, PF aProperty);
}