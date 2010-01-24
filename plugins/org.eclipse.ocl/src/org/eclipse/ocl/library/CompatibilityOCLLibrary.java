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
 * $Id: CompatibilityOCLLibrary.java,v 1.1.2.7 2010/01/24 07:40:55 ewillink Exp $
 */

package org.eclipse.ocl.library;

import java.util.ArrayList;
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
public abstract class CompatibilityOCLLibrary<NE extends EObject, TE extends NE, PK extends NE, T extends NE, CT extends T, TT extends T, DT extends T, ET extends T, EL extends NE, OF extends NE, OP extends TE, PF extends TE> extends AbstractOCLLibrary
{
	private Map<OCLType, Map<OF, List<OCLOperation>>> operationMaps = new HashMap<OCLType, Map<OF, List<OCLOperation>>>();
//	private Map<OCLType, Map<PF, OCLProperty>> propertyMaps = new HashMap<OCLType, Map<PF, OCLProperty>>();
    private Map<T, OCLType> typeMap = new HashMap<T, OCLType>();
    private Map<Integer, List<OCLTupleType>> tupleTypeMap = null;

    public CompatibilityOCLLibrary(String libraryURI) {
		super(libraryURI);
	}
    
    public void addType(T aType, OCLType oclType) {
		PK aPackage = getPackage(aType);
		OCLPackage oclPackage = getLibraryPackage(aPackage);
    	typeMap.put(aType, oclType);
		oclPackage.getType().add(oclType);
//    	ownedTypes.put(type.getQualifiedName(), type);
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
			T returnType = getReturnType(anOperation);
			if (returnType != null) {
				oclOperation.setType(getLibraryTypeOfType(returnType));
			}
			for (OP aParameter : getParameters(anOperation)) {
				OCLParameter oclParameter = LibraryFactory.eINSTANCE.createOCLParameter();
				oclParameter.setName(getName(aParameter));
//				oclParameter.setMetaModelElement(aParameter);
				oclOperation.getParameter().add(oclParameter);
				oclParameter.setType(getLibraryTypeOfTypedElement(aParameter));
			}
		}
		for (PF aProperty : getProperties(aClassifier)) {
			OCLMetaModelProperty oclProperty = createOCLMetaModelProperty();
			oclProperty.setName(getName(aProperty));
			oclProperty.setMetaModelElement(aProperty);
			oclClassifier.getProperty().add(oclProperty);
			oclProperty.setType(getLibraryTypeOfTypedElement(aProperty));
		}		
		List<? extends T> eSuperTypes = getSuperTypes(aClassifier);
		if ((eSuperTypes != null) && !eSuperTypes.isEmpty()) {
	 		for (T superType : eSuperTypes) {
				if (!visited.containsKey(superType)) {
					OCLType superOCLType = getLibraryTypeOfType(superType);
					oclClassifier.getConforms().add(superOCLType);
				}
			}
		}
		else {
			oclClassifier.getConforms().add(getClassifier());
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
		oclEnumeration.getConforms().add(getEnumeration());
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

	protected OCLTupleType createOCLTupleType(TT aTupleType, Map<T, OCLType> visited) {
	    if (tupleTypeMap == null) {
	    	tupleTypeMap = new HashMap<Integer, List<OCLTupleType>>();
	    }
		int typeHash = computeTupleTypeHash(aTupleType);
		List<OCLTupleType> oclTupleTypes = tupleTypeMap.get(typeHash);
		if (oclTupleTypes != null) {
			for (OCLTupleType oclTupleType : oclTupleTypes) {
				if (compareTupleType(oclTupleType, aTupleType) == 0) {
					return oclTupleType;
				}
			}
		}
		else {
			oclTupleTypes = new ArrayList<OCLTupleType>();
			tupleTypeMap.put(typeHash, oclTupleTypes);
		}
		OCLTupleType oclTupleType = LibraryFactory.eINSTANCE.createOCLTupleType();
		oclTupleType.setName(getName(aTupleType));
		oclTupleType.setMetaModelElement(aTupleType);
		addType(aTupleType, oclTupleType);
		for (PF aProperty : getSortedTupleParts(aTupleType)) {
			OCLMetaModelProperty oclProperty = createOCLMetaModelProperty();
			oclProperty.setName(getName(aProperty));
			oclProperty.setMetaModelElement(aProperty);
			oclTupleType.getProperty().add(oclProperty);
			oclProperty.setType(getLibraryTypeOfTypedElement(aProperty));
		}
		oclTupleType.getConforms().add(getOclTuple());
		oclTupleTypes.add(oclTupleType);
		return oclTupleType;
	}

	protected int compareTupleType(OCLTupleType oclTupleType, TT aTupleType) {
		List<OCLProperty> oclTupleParts = oclTupleType.getProperty();
		List<? extends PF> someTupleParts = getSortedTupleParts(aTupleType);
		int iMax = oclTupleParts.size();
		int delta = iMax - someTupleParts.size();
		if (delta != 0) {
			return delta;
		}
		for (int i = 0; i < iMax; i++) {
			OCLProperty oclTuplePart = oclTupleParts.get(i);
			PF aTuplePart = someTupleParts.get(i);
			delta = oclTuplePart.getName().compareTo(getName(aTuplePart));
			if (delta != 0) {
				return delta;
			}
			OCLType oclType = oclTuplePart.getType();
			OCLType aType = getLibraryTypeOfTypedElement(aTuplePart);
			if (oclType != aType) {
				delta = oclType.hashCode() - aType.hashCode();
				if (delta != 0) {
					return delta;
				}
				return -1;
			}				
		}
		return 0;
	}

	protected int computeTupleTypeHash(TT aTupleType) {
		int hash = 7777;
		for (PF aProperty : getSortedTupleParts(aTupleType)) {
			hash = hash * 10101;
			OCLType type = getLibraryTypeOfTypedElement(aProperty);
			hash += getName(aProperty).hashCode() + type.hashCode();
		}
		return hash;
	}

	protected abstract OCLType createOCLType(T aType, Map<T, OCLType> visited);

	protected abstract List<EL> getLiterals(ET enumeration);

	protected abstract String getName(NE namedElement);

	@Override
	public OCLType getLibraryTypeOfType(Object object) {
		OCLType oclType = super.getLibraryTypeOfType(object);
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
	public OCLType getLibraryTypeOfValue(Object value, Object staticType) {
		OCLType type = super.getLibraryTypeOfValue(value, staticType);
		if (type == null) {
			T aType = asMetaType(value);
			if (aType != null) {
				type = typeMap.get(aType);
				if (type == null) {
					type = createOCLType(aType, new HashMap<T, OCLType>());
				}
			}
		}
		return type;
	}

	protected abstract OCLType getLibraryTypeOfTypedElement(TE typedElement);
	
	@Override
	public List<OCLOperation> getOperations(OCLType dynamicType, OperationCallExp<?, ?> operationCall) {
		List<OCLOperation> oclOperations = super.getOperations(dynamicType, operationCall);
		if (oclOperations != null) {
			return oclOperations;
		}
		Map<OF, List<OCLOperation>> operationMap = operationMaps.get(dynamicType);
		if (operationMap == null) {
			operationMap = new HashMap<OF, List<OCLOperation>>();
			operationMaps.put(dynamicType, operationMap);
		}
		@SuppressWarnings("unchecked")
		OF referredOperation = (OF) operationCall.getReferredOperation();
		oclOperations = operationMap.get(referredOperation);
		if ((oclOperations == null) && !operationMap.containsKey(referredOperation)) {
			oclOperations = resolveOperations(dynamicType, referredOperation);
			operationMap.put(referredOperation, oclOperations);
		}
		return oclOperations;
	}

	public OCLPackage getLibraryPackage(PK aPackage) {
		OCLPackageParent packageParent = this;
		PK aParentPackage = getNestingPackage(aPackage);
		if (aParentPackage != null) {
			packageParent = getLibraryPackage(aParentPackage);
		}
		String packageName = getName(aPackage);
		OCLPackage libraryPackage = packageParent.getPackage(packageName);
		if (libraryPackage == null) {
			libraryPackage = LibraryFactory.eINSTANCE.createOCLPackage();
			libraryPackage.setName(packageName);
			packageParent.getPackage().add(libraryPackage);
		}
		return libraryPackage;
	}

	protected abstract PK getNestingPackage(PK aPackage);

	protected abstract List<OF> getOperations(CT aClassifier);

	protected abstract PK getPackage(T aType);

	protected abstract List<OP> getParameters(OF anOperation);

	protected abstract List<PF> getProperties(CT aClassifier);
	
/*	@Override
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
	} */

	protected abstract T getReturnType(OF anOperation);

	protected abstract List<? extends PF> getSortedTupleParts(TT aTupleType);

	protected abstract List<? extends T> getSuperTypes(CT classifier);
	
	public abstract void loadPackage(PK aPackage);

	protected abstract List<OCLOperation> resolveOperations(OCLType dynamicType, OF anOperation);

	protected abstract OCLProperty resolveProperty(OCLType dynamicType, PF aProperty);
}