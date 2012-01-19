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
package org.eclipse.ocl.examples.domain.types;

import org.eclipse.ocl.examples.domain.elements.DomainFragment;
import org.eclipse.ocl.examples.domain.elements.DomainInheritance;
import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.elements.DomainPackage;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.library.LibraryFeature;
import org.eclipse.ocl.examples.domain.utilities.IndexableIterable;
import org.eclipse.ocl.examples.domain.values.ObjectValue;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public abstract class AbstractInheritance implements DomainInheritance
{
	public static class FragmentIterable implements IndexableIterable<DomainFragment>
	{
		protected class Iterator implements java.util.Iterator<DomainFragment>
		{
			private int index = firstIndex;
			
			public boolean hasNext() {
				return index < lastIndex;
			}

			public DomainFragment next() {
				return array[index++];
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}
		}
		
		private final DomainFragment[] array;
		private final int firstIndex;
		private final int lastIndex;
		
		public FragmentIterable(DomainFragment[] array) {
			this.array = array;
			this.firstIndex = 0;
			this.lastIndex = array.length;
		}
		
		public FragmentIterable(DomainFragment[] array, int firstIndex, int lastIndex) {
			this.array = array;
			this.firstIndex = firstIndex;
			this.lastIndex = lastIndex;
		}

		public DomainFragment get(int index) {
			return array[firstIndex + index];
		}
		
		public java.util.Iterator<DomainFragment> iterator() {
			return new Iterator();
		}

		public int size() {
			return lastIndex - firstIndex;
		}

		@Override
		public String toString() {
			StringBuilder s = null;
			for (int i = firstIndex; i < lastIndex; i++) {
				if (s == null) {
					s = new StringBuilder();
					s.append("[");
				}
				else {
					s.append(", ");
				}
				s.append(array[i]);
			}
			if (s == null) {
				return "";
			}
			s.append("]");
			return s.toString();
		}		
	}

	public static final int ORDERED = 1 << 0;
	public static final int UNIQUE = 1 << 1;
	
	protected final String name;
	protected final DomainPackage evaluationPackage;
	protected final int flags;
	
	public AbstractInheritance(String name, DomainPackage evaluationPackage, int flags) {
		this.name = name;
		this.evaluationPackage = evaluationPackage;
		this.flags = flags;
	}

	public boolean conformsTo(DomainStandardLibrary standardLibrary, DomainType type) {
		DomainInheritance thatInheritance = type.getInheritance(standardLibrary);
		if (this == thatInheritance) {
			return true;
		}
		return thatInheritance.isSuperInheritanceOf(standardLibrary, this);
	}

	public ObjectValue createInstance(ValueFactory valueFactory) {
		throw new UnsupportedOperationException();
	}

	public DomainInheritance getCommonInheritance(DomainInheritance thatInheritance) {
		int thatDepth = thatInheritance.getDepth();
		if ((thatDepth ==  1) && thatInheritance.isUndefined()) {
			return this;
		}
		int thisDepth = getDepth();
		int staticDepth = Math.min(thisDepth, thatDepth);
		for ( ; staticDepth > 0; --staticDepth) {
			int iMax = getIndex(staticDepth+1);
			int jMax = thatInheritance.getIndex(staticDepth+1);
			for (int i = getIndex(staticDepth); i < iMax; i++) {
				DomainInheritance thisBaseInheritance = getFragment(i).getBaseInheritance();
				for (int j = thatInheritance.getIndex(staticDepth); j < jMax; j++) {
					DomainInheritance thatBaseInheritance = thatInheritance.getFragment(j).getBaseInheritance();
					if (thisBaseInheritance == thatBaseInheritance) {
						return thisBaseInheritance;
					}
				}
			}
		}
		return getFragment(0).getDerivedInheritance();	// Always OclAny at index 0
	}
	
	public DomainType getCommonType(DomainStandardLibrary standardLibrary, DomainType type) {
		DomainInheritance firstInheritance = this;
		DomainInheritance secondInheritance = type.getInheritance(standardLibrary);
		DomainInheritance commonInheritance = firstInheritance.getCommonInheritance(secondInheritance);
		return commonInheritance;
	}

	public DomainFragment getFragment(DomainInheritance thatInheritance) {
		int staticDepth = thatInheritance.getDepth();
		if (staticDepth <= getDepth()) {
			int iMax = getIndex(staticDepth+1);
			for (int i = getIndex(staticDepth); i < iMax; i++) {
				DomainFragment fragment = getFragment(i);
				if (fragment.getBaseInheritance() == thatInheritance) {
					return fragment;
				}
			}
		}
		return null;
	}

	public DomainInheritance getInheritance(DomainStandardLibrary standardLibrary) {
		return this;
	}

	public final String getName() {
		return name;
	}

	public DomainType getNormalizedType(DomainStandardLibrary standardLibrary) {
		return this;
	}

	protected DomainInheritance getOclAnyInheritance() {
		DomainStandardLibrary standardLibrary = getStandardLibrary();
		DomainType oclAnyType = standardLibrary.getOclAnyType();
		return oclAnyType.getInheritance(standardLibrary);
	}
	
	public final DomainPackage getPackage() {
		return evaluationPackage;
	}

	public boolean isEqualTo(DomainStandardLibrary standardLibrary, DomainType type) {
		return this == type;
	}

	public boolean isEqualToUnspecializedType(DomainStandardLibrary standardLibrary, DomainType type) {
		return this == type;
	}

	public boolean isOrdered() {
		return (flags & ORDERED) != 0;
	}

	public boolean isSubInheritanceOf(DomainInheritance thatInheritance) {
		return getFragment(thatInheritance) != null;
	}

	public boolean isSuperInheritanceOf(DomainStandardLibrary standardLibrary, DomainInheritance thatInheritance) {
		return thatInheritance.getFragment(this) != null;
	}

	public boolean isUndefined() {
		return false;
	}

	public boolean isUnique() {
		return (flags & UNIQUE) != 0;
	}

	public LibraryFeature lookupImplementation(DomainStandardLibrary standardLibrary, DomainOperation staticOperation) {
		getDepth();
		DomainInheritance staticInheritance = staticOperation.getInheritance(standardLibrary);
		int staticDepth = staticInheritance.getDepth();
		if (staticDepth+1 < getIndexes()) {				// null and invalid may fail here
			int iMax = getIndex(staticDepth+1);
			for (int i = getIndex(staticDepth); i < iMax; i++) {
				DomainFragment fragment = getFragment(i);
				if (fragment.getBaseInheritance() == staticInheritance) {
					return fragment.getImplementation(staticOperation);
				}
			}
		}
		return staticOperation.getImplementation();			// invoke static op for null and invalid
	}

	public DomainOperation lookupLocalOperation(DomainStandardLibrary standardLibrary, String operationName, DomainInheritance... argumentTypes) {
		for (DomainOperation localOperation : getLocalOperations()) {
			if (localOperation.getName().equals(operationName)) {
				IndexableIterable<? extends DomainType> firstParameterTypes = localOperation.getParameterTypes();
				int iMax = firstParameterTypes.size();
				if (iMax == argumentTypes.length) {
					int i = 0;
					for (; i < iMax; i++) {
						DomainType firstParameterType = firstParameterTypes.get(i);
						DomainType secondParameterType = argumentTypes[i];
						if (!firstParameterType.isEqualTo(standardLibrary, secondParameterType)) {
							break;
						}
					}
					if (i >= iMax) {
						return localOperation;
					}
				}
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return String.valueOf(evaluationPackage) + "::" + String.valueOf(name); //$NON-NLS-1$
	}
}
