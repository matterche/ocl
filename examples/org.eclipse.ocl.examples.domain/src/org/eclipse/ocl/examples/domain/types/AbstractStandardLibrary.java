/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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
 * $Id: Bag.java,v 1.2 2011/01/24 20:47:51 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.ocl.examples.domain.elements.DomainTypedElement;

public abstract class AbstractStandardLibrary implements DomainStandardLibrary
{
	private Map<DomainType, Map<DomainType, AbstractCollectionType>> specializations = new HashMap<DomainType, Map<DomainType, AbstractCollectionType>>();
	private Map<String, Map<DomainType, DomainTypedElement>> tupleProperties = new HashMap<String, Map<DomainType, DomainTypedElement>>();
	private Map<String, List<DomainTupleType>> tupleTypeMap = new HashMap<String, List<DomainTupleType>>();
	
	public boolean conformsToCollectionType(DomainCollectionType firstCollectionType, DomainCollectionType secondCollectionType) {
		DomainType firstContainerType = firstCollectionType.getContainerType();
		DomainType secondContainerType = secondCollectionType.getContainerType();
		if (firstContainerType != secondContainerType) {
			if (secondContainerType == null) {
				return false;
			}
			if (!secondContainerType.isSuperClassOf(firstContainerType, this)) {
				return false;
			}
		}
		DomainType firstElementType = firstCollectionType.getElementType();
		DomainType secondElementType = secondCollectionType.getElementType();
		if (firstElementType != secondElementType) {
			if (firstElementType == null) {
				return false;
			}
			if (!firstElementType.conformsTo(secondElementType, this)) {
				return false;
			}
		}
		return true;
	}

	public boolean conformsToLambdaType(DomainLambdaType firstLambdaType, DomainLambdaType secondLambdaType) {
		throw new UnsupportedOperationException();
	}

	public boolean conformsToTupleType(DomainTupleType firstTupleType, DomainTupleType secondTupleType) {
		if (isEqualToTupleType(firstTupleType, secondTupleType)) {
			return true;
		}
		if (secondTupleType == null) {
			return false;
		}
		return secondTupleType.isSuperClassOf(firstTupleType, this);
	}

	public DomainCollectionType getBagType(DomainType elementType) {
		return getCollectionType(getBagType(), elementType);
	}

	public DomainClassifierType getClassifierType(DomainType classType) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	public DomainCollectionType getCollectionType(DomainType genericType, DomainType elementType) {
		AbstractCollectionType specializedType = null;
		Map<DomainType, AbstractCollectionType> map = specializations.get(genericType);
		if (map == null) {
			map = new HashMap<DomainType, AbstractCollectionType>();
			specializations.put(genericType, map);
		}
		else {
			specializedType = map.get(elementType);
		}
		if (specializedType == null) {
			specializedType = new AbstractCollectionType(genericType.getName(), genericType, elementType);
			map.put(elementType, specializedType);
		}
		return specializedType;
	}

	public DomainType getCommonType(DomainType firstType, DomainType secondType) {
//		if (firstType instanceof VoidType) {
//			return secondType;
//		}
		DomainInheritance firstInheritance = getInheritance(firstType);
		DomainInheritance secondInheritance = getInheritance(secondType);
		DomainInheritance commonInheritance = firstInheritance.getCommonInheritance(secondInheritance);
		return commonInheritance.getType();
	}

	public DomainInheritance getInheritance(DomainType type) {
		return (DomainInheritance) type;
	}

	public DomainCollectionType getOrderedSetType(DomainType elementType) {
		return getCollectionType(getOrderedSetType(), elementType);
	}

	public DomainCollectionType getSequenceType(DomainType elementType) {
		return getCollectionType(getSequenceType(), elementType);
	}

	public DomainCollectionType getSetType(DomainType elementType) {
		return getCollectionType(getSetType(), elementType);
	}

	public Iterable<? extends DomainType> getSuperClasses(DomainType type) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	public DomainTypedElement getTuplePart(String name, DomainType type) {
		Map<DomainType, DomainTypedElement> typeMap = tupleProperties.get(name);
		if (typeMap == null) {
			typeMap = new HashMap<DomainType, DomainTypedElement>();
			tupleProperties.put(name, typeMap);
		}
		DomainTypedElement tupleProperty = typeMap.get(type);
		if (tupleProperty == null) {
			tupleProperty = new AbstractTuplePart(type, name);
			typeMap.put(type, tupleProperty);
		}
		return tupleProperty;
	}

	public DomainTupleType getTupleType(List<? extends DomainTypedElement> parts) {
		StringBuffer s = new StringBuffer();
		for (DomainTypedElement part : parts) {
			s.append(part.getName());
			s.append("\n"); //$NON-NLS-1$
		}
		String key = s.toString();
		List<DomainTupleType> tupleTypes = tupleTypeMap.get(key);
		if (tupleTypes != null) {
			for (DomainTupleType tupleType : tupleTypes) {
				int i = 0;
				for (; i < parts.size(); i++) {
					List<? extends DomainTypedElement> ownedAttributes = tupleType.getOwnedAttributes();
					if (ownedAttributes.get(i).getType() != parts.get(i).getType()) {
						break;
					}
				}
				if (i >= parts.size()) {
					return tupleType;
				}
			}
		}
		else {
			tupleTypes = new ArrayList<DomainTupleType>();
			tupleTypeMap.put(key, tupleTypes);
		}
		DomainTupleType tupleType = new AbstractTupleType("Tuple", parts);
		tupleTypes.add(tupleType);
		return tupleType;
	}
	
	public boolean isEqualToCollectionType(DomainCollectionType firstCollectionType, DomainCollectionType secondCollectionType) {
		DomainType firstContainerType = firstCollectionType.getContainerType();
		DomainType secondContainerType = secondCollectionType.getContainerType();
		if (firstContainerType != secondContainerType) {
			if (firstContainerType == null) {
				return false;
			}
			if (!firstContainerType.isEqualTo(secondContainerType, this)) {
				return false;
			}
		}
		DomainType firstElementType = firstCollectionType.getElementType();
		DomainType secondElementType = secondCollectionType.getElementType();
		if (firstElementType != secondElementType) {
			if (firstElementType == null) {
				return false;
			}
			if (!firstElementType.isEqualTo(secondElementType, this)) {
				return false;
			}
		}
		return true;
	}

	public boolean isEqualToTupleType(DomainTupleType firstTupleType, DomainTupleType secondTupleType) {
		List<? extends DomainTypedElement> firstParts = firstTupleType.getOwnedAttributes();
		List<? extends DomainTypedElement> secondParts = secondTupleType.getOwnedAttributes();
		int iMax = firstParts.size();
		if (iMax != secondParts.size()) {
			return false;
		}
		for (int i = 0; i < iMax; i++) {		// NB. Names are in alphabetical order
			DomainTypedElement firstPart = firstParts.get(i);
			DomainTypedElement secondPart = secondParts.get(i);
			String firstName = firstPart.getName();
			String secondName = secondPart.getName();
			if (firstName != secondName)  {
				if (firstName == null) {
					return false;
				}
				if (!firstName.equals(secondName)) {
					return false;
				}
			}
			DomainType firstType = firstPart.getType();
			DomainType secondType = secondPart.getType();
			if (firstType != secondType) {
				if (firstType == null) {
					return false;
				}
				if (!firstType.isEqualTo(secondType, this)) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean isSuperClassOf(DomainType firstType, DomainType secondType) {
		// TODO Auto-generated method stub
		return false;
	}
}
