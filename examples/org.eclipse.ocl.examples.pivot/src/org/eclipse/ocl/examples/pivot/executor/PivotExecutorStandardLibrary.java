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
package org.eclipse.ocl.examples.pivot.executor;
import org.eclipse.ocl.examples.domain.types.AbstractStandardLibrary;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.examples.pivot.PivotTables;

public class PivotExecutorStandardLibrary extends AbstractStandardLibrary
{
	public static final PivotExecutorStandardLibrary INSTANCE = new PivotExecutorStandardLibrary();

	public PivotExecutorStandardLibrary() {
		PivotTables.PACKAGE.getClass();
	}

	public DomainType getAnyClassifierType() {
		return OCLstdlibTables.Types._AnyClassifier;
	}
	
	public DomainType getBagType() {
		return OCLstdlibTables.Types._Bag;
	}

	public DomainType getBooleanType() {
		return OCLstdlibTables.Types._Boolean;
	}

	public DomainType getCollectionType() {
		return OCLstdlibTables.Types._Collection;
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

	public DomainType getRealType() {
		return OCLstdlibTables.Types._Real;
	}

	public DomainType getSequenceType() {
		return OCLstdlibTables.Types._Sequence;
	}

	public DomainType getSetType() {
		return OCLstdlibTables.Types._Set;
	}

	public DomainType getStringType() {
		return OCLstdlibTables.Types._String;
	}

	public DomainType getUnlimitedNaturalType() {
		return OCLstdlibTables.Types._UnlimitedNatural;
	}
}
