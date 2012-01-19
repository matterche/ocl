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
 * $Id$
 */
package org.eclipse.ocl.examples.library.executor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.domain.elements.DomainClassifierType;
import org.eclipse.ocl.examples.domain.elements.DomainCollectionType;
import org.eclipse.ocl.examples.domain.elements.DomainTupleType;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.elements.DomainTypedElement;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.types.AbstractCollectionType;
import org.eclipse.ocl.examples.domain.types.AbstractStandardLibrary;
import org.eclipse.ocl.examples.domain.types.AbstractTupleType;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;

public abstract class ExecutableStandardLibrary extends AbstractStandardLibrary
{
	private Map<DomainType, DomainClassifierType> classifiers = new HashMap<DomainType, DomainClassifierType>();
	private Map<DomainType, Map<DomainType, AbstractCollectionType>> specializations = new HashMap<DomainType, Map<DomainType, AbstractCollectionType>>();
	private Map<String, List<DomainTupleType>> tupleTypeMap = new HashMap<String, List<DomainTupleType>>();

	protected abstract DomainClassifierType createClassifierType(DomainType classType);
	
	public abstract DomainEvaluator createEvaluator(EObject contextObject, Map<Object, Object> contextMap);

	public DomainType getAnyClassifierType() {
		return OCLstdlibTables.Types._AnyClassifier;
	}
	
	public DomainType getBagType() {
		return OCLstdlibTables.Types._Bag;
	}

	public DomainCollectionType getBagType(DomainType elementType) {
		return getCollectionType(getBagType(), elementType);
	}

	public DomainType getBooleanType() {
		return OCLstdlibTables.Types._Boolean;
	}

	public DomainClassifierType getClassifierType(DomainType classType) {
		DomainClassifierType classifierType = classifiers.get(classType);
		if (classifierType == null) {
			classifierType = createClassifierType(classType);
			classifiers.put(classType, classifierType);
		}
		return classifierType;
	}

	public DomainType getCollectionType() {
		return OCLstdlibTables.Types._Collection;
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
			specializedType = new AbstractCollectionType(this, genericType.getName(), genericType, elementType);
			map.put(elementType, specializedType);
		}
		return specializedType;
	}

	public DomainType getEnumerationType() {
		return OCLstdlibTables.Types._Enumeration;
	}

	public DomainType getIntegerType() {
		return OCLstdlibTables.Types._Integer;
	}

	public DomainType getOclAnyType() {
		return OCLstdlibTables.Types._OclAny;
	}

	public DomainType getOclComparableType() {
		return OCLstdlibTables.Types._OclComparable;
	}

	public DomainType getOclElementType() {
		return OCLstdlibTables.Types._OclElement;
	}

	public DomainType getOclInvalidType() {
		return OCLstdlibTables.Types._OclInvalid;
	}

	public DomainType getOclMessageType() {
		return OCLstdlibTables.Types._OclMessage;
	}

	public DomainType getOclSelfType() {
		return OCLstdlibTables.Types._OclSelf;
	}

	public DomainType getOclSummableType() {
		return OCLstdlibTables.Types._OclSummable;
	}

	public DomainType getOclTupleType() {
		return OCLstdlibTables.Types._OclTuple;
	}

	public DomainType getOclVoidType() {
		return OCLstdlibTables.Types._OclVoid;
	}

	public DomainType getOrderedSetType() {
		return OCLstdlibTables.Types._OrderedSet;
	}

	public DomainCollectionType getOrderedSetType(DomainType elementType) {
		return getCollectionType(getOrderedSetType(), elementType);
	}

	public DomainType getRealType() {
		return OCLstdlibTables.Types._Real;
	}

	public DomainType getSequenceType() {
		return OCLstdlibTables.Types._Sequence;
	}

	public DomainCollectionType getSequenceType(DomainType elementType) {
		return getCollectionType(getSequenceType(), elementType);
	}

	public DomainType getSetType() {
		return OCLstdlibTables.Types._Set;
	}

	public DomainCollectionType getSetType(DomainType elementType) {
		return getCollectionType(getSetType(), elementType);
	}

	public DomainType getStringType() {
		return OCLstdlibTables.Types._String;
	}

	public DomainTupleType getTupleType(List<? extends DomainTypedElement> parts) {
		StringBuilder s = new StringBuilder();
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
		DomainTupleType tupleType = new AbstractTupleType(this, parts);
		tupleTypes.add(tupleType);
		return tupleType;
	}

	public DomainType getUnlimitedNaturalType() {
		return OCLstdlibTables.Types._UnlimitedNatural;
	}
}
