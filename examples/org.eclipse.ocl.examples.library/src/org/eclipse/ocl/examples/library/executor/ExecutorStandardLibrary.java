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
import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.library.LibraryFeature;
import org.eclipse.ocl.examples.domain.types.AbstractStandardLibrary;
import org.eclipse.ocl.examples.domain.types.DomainType;
//import org.eclipse.ocl.examples.library.ocl.OCLTables;

public class ExecutorStandardLibrary extends AbstractStandardLibrary
{
	public static final ExecutorStandardLibrary INSTANCE = new ExecutorStandardLibrary();
	
	public ExecutorStandardLibrary() {
//		OCLTables.PACKAGE.getClass();
	}

	public DomainType getAnyClassifierType() {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainType getBagType() {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainType getBooleanType() {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainType getCollectionType() {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainType getEnumerationType() {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainType getIntegerType() {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainType getOclAnyType() {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainType getOclComparableType() {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainType getOclElementType() {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainType getOclInvalidType() {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainType getOclMessageType() {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainType getOclSummableType() {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainType getOclVoidType() {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainType getOrderedSetType() {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainType getRealType() {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainType getSequenceType() {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainType getSetType() {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainType getStringType() {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainType getUnlimitedNaturalType() {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainType getRequiredLibraryType(String typeName) {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainOperation lookupOperation(DomainType type,
			String operationName, DomainType... argumentTypes) {
		// TODO Auto-generated method stub
		return null;
	}

	public LibraryFeature lookupImplementation(DomainOperation dynamicOperation)
			throws SecurityException, IllegalArgumentException,
			ClassNotFoundException, NoSuchFieldException,
			IllegalAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainOperation lookupDynamicOperation(DomainType type,
			DomainOperation staticOperation) {
		// TODO Auto-generated method stub
		return null;
	}
	
/*	public ExecutorClass getBagType() {
		return OCLTables.Classes._Bag;
	}

	public DomainType getBooleanType() {
		return OCLTables.Classes._Boolean;
	}

	public DomainType getClassifierType() {
		return OCLTables.Classes._Classifier;
	}

	public DomainType getCollectionType() {
		return OCLTables.Classes._Collection;
	}

	public DomainType getEnumerationType() {
		return OCLTables.Classes._Enumeration;
	}

	public DomainType getIntegerType() {
		return OCLTables.Classes._Integer;
	}

	public DomainType getOclAnyType() {
		return OCLTables.Classes._OclAny;
	}

	public DomainType getOclInvalidType() {
		return OCLTables.Classes._OclInvalid;
	}

	public DomainType getOclMessageType() {
		return OCLTables.Classes._OclMessage;
	}

	public DomainType getOclVoidType() {
		return OCLTables.Classes._OclVoid;
	}

	public ExecutorClass getOrderedSetType() {
		return OCLTables.Classes._OrderedSet;
	}

	public DomainType getRealType() {
		return OCLTables.Classes._Real;
	}

	public ExecutorClass getSequenceType() {
		return OCLTables.Classes._Sequence;
	}

	public ExecutorClass getSetType() {
		return OCLTables.Classes._Set;
	}

	public DomainType getStringType() {
		return OCLTables.Classes._String;
	}

	public DomainType getUnlimitedNaturalType() {
		return OCLTables.Classes._UnlimitedNatural;
	} */
}
