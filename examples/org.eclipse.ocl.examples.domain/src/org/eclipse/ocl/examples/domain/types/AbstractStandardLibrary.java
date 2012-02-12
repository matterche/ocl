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

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.domain.elements.DomainCollectionType;
import org.eclipse.ocl.examples.domain.elements.DomainElement;
import org.eclipse.ocl.examples.domain.elements.DomainEnumeration;
import org.eclipse.ocl.examples.domain.elements.DomainInheritance;
import org.eclipse.ocl.examples.domain.elements.DomainLambdaType;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainTupleType;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.elements.DomainTypedElement;

public abstract class AbstractStandardLibrary implements DomainStandardLibrary
{
	/**
	 * Mapping from name to list of correspondingly named types for definition of tuple parts. This cache is used to provide the
	 * required part definitions to construct a tuple type in the lightweight execution environment. This cache may remain
	 * unused when using the full pivot environment.
	 */
	private Map<String, Map<DomainType, DomainTypedElement>> tupleParts = null;		// Lazily created
		
	public boolean conformsToCollectionType(DomainCollectionType firstCollectionType, DomainCollectionType secondCollectionType) {
		DomainType firstContainerType = firstCollectionType.getContainerType();
		DomainType secondContainerType = secondCollectionType.getContainerType();
		if (firstContainerType != secondContainerType) {
			if (secondContainerType == null) {
				return false;
			}
			DomainInheritance firstInheritance = firstCollectionType.getInheritance(this);
			DomainInheritance secondInheritance = secondCollectionType.getInheritance(this);
			if (!secondInheritance.isSuperInheritanceOf(this, firstInheritance)) {
				return false;
			}
		}
		DomainType firstElementType = firstCollectionType.getElementType();
		DomainType secondElementType = secondCollectionType.getElementType();
		if (firstElementType != secondElementType) {
			if (firstElementType == null) {
				return false;
			}
			if (!firstElementType.conformsTo(this, secondElementType)) {
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
		DomainInheritance firstInheritance = firstTupleType.getInheritance(this);
		DomainInheritance secondInheritance = secondTupleType.getInheritance(this);
		return firstInheritance.isSuperInheritanceOf(this, secondInheritance);
	}

	public void dispose() {
		tupleParts = null;	
	}
	
	public DomainCollectionType getCollectionType(DomainCollectionType containerType, DomainType elementType) {
		boolean isOrdered = containerType.isOrdered();
		boolean isUnique = containerType.isUnique();
		if (isOrdered) {
			if (isUnique) {
				return getOrderedSetType(elementType);
			}
			else {
				return getSequenceType(elementType);
			}
		}
		else {
			if (isUnique) {
				return getSetType(elementType);
			}
			else {
				return getBagType(elementType);
			}
		}
	}

	public DomainEnumeration getEnumeration(Enumerator enumerator) {
		throw new UnsupportedOperationException();
	}

	public DomainType getMetaType(DomainType instanceType) {
		throw new UnsupportedOperationException();
	}

	public DomainTypedElement getTuplePart(String name, DomainType type) {
		if (tupleParts == null) {
			tupleParts = new HashMap<String, Map<DomainType, DomainTypedElement>>();
		}
		Map<DomainType, DomainTypedElement> typeMap = tupleParts.get(name);
		if (typeMap == null) {
			typeMap = new HashMap<DomainType, DomainTypedElement>();
			tupleParts.put(name, typeMap);
		}
		DomainTypedElement tupleProperty = typeMap.get(type);
		if (tupleProperty == null) {
			tupleProperty = new AbstractTuplePart(type, name);
			typeMap.put(type, tupleProperty);
		}
		return tupleProperty;
	}
	
	public DomainTupleType getTupleType(DomainTypedElement ... parts) {
		List<DomainTypedElement> partsList = new ArrayList<DomainTypedElement>(parts.length);
		for (DomainTypedElement part : parts) {
			partsList.add(part);
		}
		return getTupleType(partsList);
	}

	public DomainType getType(DomainElement element) {
		if (element instanceof EObject) {
			return getType(((EObject)element).eClass());
		}
		throw new UnsupportedOperationException();
	}
	
	public boolean isEqualToCollectionType(DomainCollectionType firstCollectionType, DomainCollectionType secondCollectionType) {
		DomainType firstContainerType = firstCollectionType.getContainerType();
		DomainType secondContainerType = secondCollectionType.getContainerType();
		if (firstContainerType != secondContainerType) {
			if (firstContainerType == null) {
				return false;
			}
			if (!firstContainerType.isEqualToUnspecializedType(this, secondContainerType)) {
				return false;
			}
		}
		DomainType firstElementType = firstCollectionType.getElementType();
		DomainType secondElementType = secondCollectionType.getElementType();
		if (firstElementType != secondElementType) {
			if (firstElementType == null) {
				return false;
			}
			if (!firstElementType.isEqualTo(this, secondElementType)) {
				return false;
			}
		}
		return true;
	}

	public boolean isEqualToTupleType(DomainTupleType firstTupleType, DomainTupleType secondTupleType) {
		List<? extends DomainTypedElement> firstParts = firstTupleType.getOwnedAttribute();
		List<? extends DomainTypedElement> secondParts = secondTupleType.getOwnedAttribute();
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
				if (!firstType.isEqualTo(this, secondType)) {
					return false;
				}
			}
		}
		return true;
	}
}
