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
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;

public class ExecutorStandardLibrary extends AbstractStandardLibrary
{
	public static final ExecutorStandardLibrary INSTANCE = new ExecutorStandardLibrary();
	
	public ExecutorStandardLibrary() {
		OCLstdlibTables.PACKAGE.getClass();
	}

	public DomainType getAnyClassifierType() {
		return OCLstdlibTables.Classes._AnyClassifier;
	}
	
	public ExecutorClass getBagType() {
		return OCLstdlibTables.Classes._Bag;
	}

	public DomainType getBooleanType() {
		return OCLstdlibTables.Classes._Boolean;
	}

	public DomainType getCollectionType() {
		return OCLstdlibTables.Classes._Collection;
	}

	public DomainType getEnumerationType() {
		return OCLstdlibTables.Classes._Enumeration;
	}

	public DomainType getIntegerType() {
		return OCLstdlibTables.Classes._Integer;
	}

	public DomainType getOclAnyType() {
		return OCLstdlibTables.Classes._OclAny;
	}

	public DomainType getOclComparableType() {
		return OCLstdlibTables.Classes._OclComparable;
	}

	public DomainType getOclElementType() {
		return OCLstdlibTables.Classes._OclElement;
	}

	public DomainType getOclInvalidType() {
		return OCLstdlibTables.Classes._OclInvalid;
	}

	public DomainType getOclMessageType() {
		return OCLstdlibTables.Classes._OclMessage;
	}

	public DomainType getOclSelfType() {
		return OCLstdlibTables.Classes._OclSelf;
	}

	public DomainType getOclSummableType() {
		return OCLstdlibTables.Classes._OclSummable;
	}

	public DomainType getOclVoidType() {
		return OCLstdlibTables.Classes._OclVoid;
	}

	public ExecutorClass getOrderedSetType() {
		return OCLstdlibTables.Classes._OrderedSet;
	}

	public DomainType getRealType() {
		return OCLstdlibTables.Classes._Real;
	}

	public ExecutorClass getSequenceType() {
		return OCLstdlibTables.Classes._Sequence;
	}

	public ExecutorClass getSetType() {
		return OCLstdlibTables.Classes._Set;
	}

	public DomainType getStringType() {
		return OCLstdlibTables.Classes._String;
	}

	public DomainType getUnlimitedNaturalType() {
		return OCLstdlibTables.Classes._UnlimitedNatural;
	}

	public DomainOperation lookupDynamicOperation(DomainType type, DomainOperation staticOperation) {
		throw new UnsupportedOperationException();
	}

	public LibraryFeature lookupImplementation(DomainOperation dynamicOperation)throws Exception {
		throw new UnsupportedOperationException();
	}

	public DomainOperation lookupOperation(DomainType type, String operationName, DomainType... argumentTypes) {
		throw new UnsupportedOperationException();
	}
}
