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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.eclipse.ocl.examples.domain.elements.DomainFragment;
import org.eclipse.ocl.examples.domain.elements.DomainInheritance;
import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.library.LibraryFeature;

public abstract class AbstractInheritance implements DomainInheritance
{
	public static class InheritanceIterable implements Iterable<DomainInheritance>
	{
		protected class Iterator implements java.util.Iterator<DomainInheritance>
		{
			private int index = firstIndex;
			
			public boolean hasNext() {
				return index < lastIndex;
			}

			public DomainInheritance next() {
				return array[index++].getInheritance();
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}
		}
		
		private final DomainFragment[] array;
		private final int firstIndex;
		private final int lastIndex;
		
		public InheritanceIterable(DomainFragment[] array) {
			this.array = array;
			this.firstIndex = 0;
			this.lastIndex = array.length;
		}
		
		public InheritanceIterable(DomainFragment[] array, int firstIndex, int lastIndex) {
			this.array = array;
			this.firstIndex = firstIndex;
			this.lastIndex = lastIndex;
		}
		
		public java.util.Iterator<DomainInheritance> iterator() {
			return new Iterator();
		}		
	}

	/**
	 * Depth ordered inheritance fragments. OclAny at depth 0, OclSelf at depth size-1.
	 */
	private DomainFragment[] fragments = null;
	
	/**
	 * The index in fragments at which inheritance fragments at a given depth start.
	 * depthIndexes[0] is always zero since OclAny is always at depth 0.
	 * depthIndexes[depthIndexes.length-2] is always depthIndexes.length-1 since OclSelf is always at depth depthIndexes.length-2.
	 * depthIndexes[depthIndexes.length-1] is always depthIndexes.length to provide an easy end stop.
	 */
	private int[] indexes = null;
	
	/**
	 * The Inheritances of sub-types that have been installed, and which must be
	 * uninstalled in the event of an inheritance change for this Inheritance.
	 */
	private Set<DomainInheritance> knownSubInheritances = null;

	public void addSubInheritance(DomainInheritance subInheritance) {
		if (knownSubInheritances == null) {
			knownSubInheritances = new HashSet<DomainInheritance>();
		}
		knownSubInheritances.add(subInheritance);
	}

	protected abstract AbstractFragment createFragment(DomainInheritance baseInheritance);
	
	/**
	 * Add this Inheritance and all un-installed super-Inheritances to inheritances.
	 */
	public void gatherUninstalledInheritances(List<DomainInheritance> inheritances) {
		if (!inheritances.contains(this)) {
			inheritances.add(this);
			if (fragments == null) {
				for (DomainInheritance superInheritance : getInitialSuperInheritances()) {
					superInheritance.gatherUninstalledInheritances(inheritances);
				}
			}
		}
	}
	
	/**
	 * Return a depth ordered, OclAny-first, OclSelf-last, Iterable of all the super-inheritances including this one.
	 */
	public final InheritanceIterable getAllSuperInheritances() {
		if (fragments == null) {
			initialize();
		}
		return new InheritanceIterable(fragments) {};
	}

	public DomainInheritance getCommonInheritance(DomainInheritance thatInheritance) {
		int thatDepth = thatInheritance.getDepth();
		if ((thatDepth ==  1) && thatInheritance.isUndefined()) {
			return this;
		}
		int thisDepth = getDepth();
		int staticDepth = Math.min(thisDepth, thatDepth);
		DomainFragment[] thoseFragments = thatInheritance.getFragments();
		int[] thoseIndexes = thatInheritance.getIndexes();
		for ( ; staticDepth > 0; --staticDepth) {
			int iMax = indexes[staticDepth+1];
			int jMax = thoseIndexes[staticDepth+1];
			for (int i = indexes[staticDepth]; i < iMax; i++) {
				DomainInheritance thisBaseInheritance = fragments[i].getBaseInheritance();
				for (int j = thoseIndexes[staticDepth]; j < jMax; j++) {
					DomainInheritance thatBaseInheritance = thoseFragments[j].getBaseInheritance();
					if (thisBaseInheritance == thatBaseInheritance) {
						return thisBaseInheritance;
					}
				}
			}
		}
		return fragments[0].getInheritance();	// Always OclAny at index 0
	}

	/**
	 * Return the inheritance depth of the target type: OclAny is at depth 0.
	 */
	public final int getDepth() {
		if (indexes == null) {
			initialize();
		}
		return indexes.length-2;
	}
	
	public DomainFragment[] getFragments() {
//		if (fragments == null) {
//			initialize();
//		}
		return fragments;
	}

	public int[] getIndexes(){
//		if (indexes == null) {
//			initialize();
//		}
		return indexes;
	}

	protected DomainInheritance getOclAnyInheritance() {
		DomainStandardLibrary standardLibrary = getStandardLibrary();
		DomainType oclAnyType = standardLibrary.getOclAnyType();
		return oclAnyType.getInheritance(standardLibrary);
	}

	/**
	 * Return the immediate superinheritances without reference to the fragments.
	 */
	protected abstract Iterable<? extends DomainInheritance> getInitialSuperInheritances();
	
	/**
	 * Return an Iterable of all the super-inheritances at a specified depth, between 0 and getDepth() inclusive.
	 */
	public final InheritanceIterable getSuperInheritances(int depth) {
		return new InheritanceIterable(fragments, indexes[depth], indexes[depth+1]);
	}

	protected void initialize() {
		List<DomainInheritance> uninstalledInheritances = new ArrayList<DomainInheritance>();
		gatherUninstalledInheritances(uninstalledInheritances);
		int oldPendingCount = uninstalledInheritances.size();
		while (true) {
			for (ListIterator<DomainInheritance> it = uninstalledInheritances.listIterator(); it.hasNext(); ) {
				DomainInheritance uninstalledInheritance = it.next();
				if (uninstalledInheritance.isInstallable()) {
					uninstalledInheritance.install();
					it.remove();
				}
			}
			if (uninstalledInheritances.isEmpty()) {
				break;
			}
			int newPendingCount = uninstalledInheritances.size();
			if (newPendingCount >= oldPendingCount) {
				StringBuffer s = new StringBuffer();
				s.append("Inheritance loop for ");
				for (ListIterator<DomainInheritance> it = uninstalledInheritances.listIterator(); it.hasNext(); ) {
					DomainInheritance uninstalledInheritance = it.next();
					if (!uninstalledInheritance.isInstallable()) {
						s.append("\n  ");
						s.append(uninstalledInheritance);
					}
				}
				throw new IllegalStateException(s.toString());
			}
			oldPendingCount = newPendingCount;
		}
	}

	protected void initFragments(DomainFragment[] fragments, int[] indexes) {
		assert this.fragments == null;
		this.fragments = fragments;
		this.indexes = indexes;
	}

	/**
	 * Install this Inheritance establishing its superClass tables and registering
	 * it to be notified of any changes.
	 * 
	 * @return true if installed, false if some superClass uninstallable
	 */
	public boolean install() {
		if (fragments != null) {
			return true;
		}
		DomainInheritance oclAnyInheritance = getOclAnyInheritance();
		if (this == oclAnyInheritance){
			fragments = new DomainFragment[] { createFragment(oclAnyInheritance) };
			indexes = new int[] { 0, 1 };
		}
		else {
			List<List<DomainFragment>> all = new ArrayList<List<DomainFragment>>();
			for (DomainInheritance superInheritance : getInitialSuperInheritances()) {
				superInheritance.installIn(this, all);
			}
			int superDepths = all.size();
			int superInheritances = 0;
			for (List<DomainFragment> some : all) {
				superInheritances += some.size();
			}
			if (superDepths > 0) {
				fragments = new DomainFragment[superInheritances+1];	// +1 for OclSelf
				indexes = new int[superDepths+2];		// +1 for OclSelf, +1 for tail pointer
				int j = 0;
				indexes[0] = 0;
				for (int i = 0; i < superDepths; i++) {
					for (DomainFragment some : all.get(i)) {
						fragments[j++] = some;
					}
					indexes[i+1] = j;
				}
				indexes[superDepths++] = j;
				fragments[j++] = createFragment(this);
				indexes[superDepths++] = j;
			}
			else {
				fragments = new DomainFragment[] { oclAnyInheritance.getFragments()[0], createFragment(this) };
				indexes = new int[] { 0, 1, 2 };
			}
		}
		return true;
	}

	public void installIn(DomainInheritance subInheritance, List<List<DomainFragment>> all) {
		int j = 0;
		for (int i = 0; i < indexes.length-1; i++) {
			List<DomainFragment> some = (i < all.size()) ? all.get(i) : null;
			if (some == null) {
				some = new ArrayList<DomainFragment>();
				all.add(some);
			}
			int jMax = indexes[i+1];
			for (; j < jMax; j++) {
				DomainFragment fragment = fragments[j];
				if (!some.contains(fragment)) {
					some.add(fragment);
					fragment.getInheritance().addSubInheritance(subInheritance);
				}
			}
		}
	}
	
	/**
	 * Return true if this is installed or able to be installed. Returns false if some superclass
	 * must be installed first.
	 */
	public boolean isInstallable() {
		if (fragments != null) {
			return true;
		}
		DomainInheritance oclAnyInheritance = getOclAnyInheritance();
		if (this != oclAnyInheritance) {
			for (DomainInheritance superInheritance : getInitialSuperInheritances()) {
				if (!superInheritance.isInstalled()) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Return true if this is installed.
	 */
	public boolean isInstalled() {
		return fragments != null;
	}

	public boolean isSubInheritanceOf(DomainInheritance thatInheritance) {
		int staticDepth = thatInheritance.getDepth();
		if (staticDepth <= getDepth()) {
			int iMax = indexes[staticDepth+1];
			for (int i = indexes[staticDepth]; i < iMax; i++) {
				if (fragments[i].getBaseInheritance() == thatInheritance) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean isSuperInheritanceOf(DomainStandardLibrary standardLibrary, DomainInheritance thatInheritance) {
		return thatInheritance.isSubInheritanceOf(this);
	}

	public boolean isUndefined() {
		return false;
	}

	public LibraryFeature lookupImplementation(DomainStandardLibrary standardLibrary, DomainOperation staticOperation) {
		DomainInheritance staticInheritance = staticOperation.getInheritance();
		int staticDepth = staticInheritance.getDepth();
		if (staticDepth+1 < indexes.length) {				// null and invalid may fail here
			int iMax = indexes[staticDepth+1];
			for (int i = indexes[staticDepth]; i < iMax; i++) {
				if (fragments[i].getBaseInheritance() == staticInheritance) {
					return fragments[i].getImplementation(staticOperation);
				}
			}
		}
		return staticOperation.getImplementation();			// invoke static op for null and invalid
	}

	public void removeSubInheritance(DomainInheritance subInheritance) {
		if (knownSubInheritances != null) {
			knownSubInheritances.remove(subInheritance);
		}
	}
	
	@Override
	public String toString() {
		return "Inheritance:" + String.valueOf(getType());
	}

	public void uninstall() {
		if (fragments != null) {
			for (DomainFragment fragment : fragments) {
				fragment.getBaseInheritance().removeSubInheritance(this);
			}
			fragments = null;
			indexes = null;
			if (knownSubInheritances != null) {
				Set<DomainInheritance> previouslyKnownSubInheritances = knownSubInheritances;
				knownSubInheritances = null;
				for (DomainInheritance subInheritance : previouslyKnownSubInheritances) {
					subInheritance.uninstall();
				}
			}
		}
	}
}
