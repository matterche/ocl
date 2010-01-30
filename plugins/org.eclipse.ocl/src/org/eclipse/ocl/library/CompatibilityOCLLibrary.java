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
 * $Id: CompatibilityOCLLibrary.java,v 1.1.2.9 2010/01/30 07:49:20 ewillink Exp $
 */

package org.eclipse.ocl.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.merged.MergedLibrary;
import org.eclipse.ocl.library.merged.OCLClassifier;
import org.eclipse.ocl.library.merged.OCLDataType;
import org.eclipse.ocl.library.merged.OCLEnumeration;
import org.eclipse.ocl.library.merged.OCLEnumerationLiteral;
import org.eclipse.ocl.library.merged.OCLMetaModelOperation;
import org.eclipse.ocl.library.merged.OCLMetaModelProperty;

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
	private Map<OCLConcreteType, Map<OF, List<OCLOperation>>> operationMaps = new HashMap<OCLConcreteType, Map<OF, List<OCLOperation>>>();
//	private Map<OCLType, Map<PF, OCLProperty>> propertyMaps = new HashMap<OCLType, Map<PF, OCLProperty>>();
    private Map<Object, OCLConcreteType> typeMap = new HashMap<Object, OCLConcreteType>();
    private Map<Integer, List<OCLConcreteType>> tupleTypeMap = null;

    public CompatibilityOCLLibrary(String libraryURI) {
		super(libraryURI);
	}
    
    public void addType(T aType, OCLConcreteType oclType) {
		PK aPackage = getPackage(aType);
		OCLPackage oclPackage = getLibraryPackage(aPackage);
    	typeMap.put(aType, oclType);
		oclPackage.getType().add(oclType);
//    	ownedTypes.put(type.getQualifiedName(), type);
    }

	protected abstract Object asMetaType(Object object);

	protected abstract T asType(Object object);

	protected abstract OCLClassifier createOCLClassifier();

	protected OCLClassifier createOCLClassifier(MergedLibrary mergedLibrary, CT aClassifier, Map<Object, OCLConcreteType> visited) {
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
				oclOperation.setType(mergedLibrary.getLibraryTypeOfType(returnType));
			}
			for (OP aParameter : getParameters(anOperation)) {
				OCLParameter oclParameter = LibraryFactory.eINSTANCE.createOCLParameter();
				oclParameter.setName(getName(aParameter));
//				oclParameter.setMetaModelElement(aParameter);
				oclOperation.getParameter().add(oclParameter);
				oclParameter.setType(getLibraryTypeOfTypedElement(mergedLibrary, aParameter));
			}
		}
		for (PF aProperty : getProperties(aClassifier)) {
			OCLMetaModelProperty oclProperty = createOCLMetaModelProperty();
			oclProperty.setName(getName(aProperty));
			oclProperty.setMetaModelElement(aProperty);
			oclClassifier.getProperty().add(oclProperty);
			oclProperty.setType(getLibraryTypeOfTypedElement(mergedLibrary, aProperty));
		}		
		List<? extends T> eSuperTypes = getSuperTypes(aClassifier);
		if ((eSuperTypes != null) && !eSuperTypes.isEmpty()) {
	 		for (T superType : eSuperTypes) {
				if (!visited.containsKey(superType)) {
					OCLType superOCLType = mergedLibrary.getLibraryTypeOfType(superType);
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
	
	protected OCLDataType createOCLDataType(MergedLibrary mergedLibrary, DT aDataType, Map<Object, OCLConcreteType> visited) {
		OCLDataType oclDataType = createOCLDataType();
		oclDataType.setName(getName(aDataType));
		oclDataType.setMetaModelElement(aDataType);
		oclDataType.getConforms().add(getOclAny());
		addType(aDataType, oclDataType);
		return oclDataType;
	}

	protected abstract OCLEnumeration createOCLEnumeration();

	protected OCLEnumeration createOCLEnumeration(MergedLibrary mergedLibrary, ET anEnumeration, Map<Object, OCLConcreteType> visited) {
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
	
	protected OCLJavaType createOCLJavaType(Class<?> aJavaType, Map<Object, OCLConcreteType> visited) {
		OCLJavaType oclJavaType = LibraryFactory.eINSTANCE.createOCLJavaType();
		oclJavaType.setName(aJavaType.getName());
		oclJavaType.setJavaClass(aJavaType);
		oclJavaType.getConforms().add(getJava());
    	typeMap.put(aJavaType, oclJavaType);
//		addType(aJavaType, oclJavaType);
		return oclJavaType;
	}

	protected abstract OCLMetaModelOperation createOCLMetaModelOperation();

	protected abstract OCLMetaModelProperty createOCLMetaModelProperty();

	protected OCLConcreteType createOCLTupleType(MergedLibrary mergedLibrary, TT aTupleType, Map<Object, OCLConcreteType> visited) {
	    if (tupleTypeMap == null) {
	    	tupleTypeMap = new HashMap<Integer, List<OCLConcreteType>>();
	    }
		int typeHash = computeTupleTypeHash(mergedLibrary, aTupleType);
		List<OCLConcreteType> oclTupleTypes = tupleTypeMap.get(typeHash);
		if (oclTupleTypes != null) {
			for (OCLConcreteType oclTupleType : oclTupleTypes) {
				if (compareTupleType(mergedLibrary, oclTupleType, aTupleType) == 0) {
					return oclTupleType;
				}
			}
		}
		else {
			oclTupleTypes = new ArrayList<OCLConcreteType>();
			tupleTypeMap.put(typeHash, oclTupleTypes);
		}
		OCLConcreteType oclTupleType = LibraryFactory.eINSTANCE.createOCLConcreteType();
		oclTupleType.setName(getName(aTupleType));
//		oclTupleType.setMetaModelElement(aTupleType);
		addType(aTupleType, oclTupleType);
		for (PF aProperty : getSortedTupleParts(aTupleType)) {
			OCLMetaModelProperty oclProperty = createOCLMetaModelProperty();
			oclProperty.setName(getName(aProperty));
			oclProperty.setMetaModelElement(aProperty);
			oclTupleType.getProperty().add(oclProperty);
			oclProperty.setType(getLibraryTypeOfTypedElement(mergedLibrary, aProperty));
		}
		oclTupleType.getConforms().add(getOclTuple());
		oclTupleTypes.add(oclTupleType);
		return oclTupleType;
	}

	protected int compareTupleType(MergedLibrary mergedLibrary, OCLConcreteType oclTupleType, TT aTupleType) {
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
			OCLType oclType = oclTuplePart.getResolvedType(null);
			OCLType aType = getLibraryTypeOfTypedElement(mergedLibrary, aTuplePart);
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

	protected int computeTupleTypeHash(MergedLibrary mergedLibrary, TT aTupleType) {
		int hash = 7777;
		for (PF aProperty : getSortedTupleParts(aTupleType)) {
			hash = hash * 10101;
			OCLType type = getLibraryTypeOfTypedElement(mergedLibrary, aProperty);
			hash += getName(aProperty).hashCode() + type.hashCode();
		}
		return hash;
	}

	protected abstract OCLConcreteType createOCLType(MergedLibrary mergedLibrary, Object aType, Map<Object, OCLConcreteType> visited);

	protected abstract List<EL> getLiterals(ET enumeration);

	protected abstract String getName(NE namedElement);

	public OCLType getLibraryTypeOfType(MergedLibrary mergedLibrary, Object object) {
		OCLType oclType = typeMap.get(object);
		if (oclType == null) {
			T aType = asType(object);
			if (aType != null) {
				oclType = createOCLType(mergedLibrary, aType, new HashMap<Object, OCLConcreteType>());
			}
		}
		return oclType;
	}

	public OCLType getLibraryTypeOfValue(MergedLibrary mergedLibrary, Object value, Object staticType) {
		if (staticType instanceof EEnum) {
			return getEnumeration();
		}
		OCLType type = null;
		Object aType = asMetaType(value);
		if (aType != null) {
			type = typeMap.get(aType);
			if (type == null) {
				type = createOCLType(mergedLibrary, aType, new HashMap<Object, OCLConcreteType>());
			}
		}
		else {
			aType = value.getClass();
			if (aType != null) {
				type = typeMap.get(aType);
				if (type == null) {
					type = createOCLType(mergedLibrary, aType, new HashMap<Object, OCLConcreteType>());
				}
			}
		}
		return type;
	}

	protected abstract OCLType getLibraryTypeOfTypedElement(MergedLibrary mergedLibrary, TE typedElement);
	
	@Override
	public List<OCLOperation> getOperations(MergedLibrary mergedLibrary, OCLConcreteType dynamicType, OperationCallExp<?, ?> operationCall) {
		List<OCLOperation> oclOperations = super.getOperations(mergedLibrary, dynamicType, operationCall);
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
			oclOperations = resolveOperations(mergedLibrary, dynamicType, referredOperation);
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
	
	public abstract void loadPackage(MergedLibrary mergedLibrary, PK aPackage);

	protected abstract List<OCLOperation> resolveOperations(MergedLibrary mergedLibrary, OCLType dynamicType, OF anOperation);

	protected abstract OCLProperty resolveProperty(MergedLibrary mergedLibrary, OCLType dynamicType, PF aProperty);
}