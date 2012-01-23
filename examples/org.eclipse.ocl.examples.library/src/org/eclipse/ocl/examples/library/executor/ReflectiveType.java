/**
 * <copyright>
 *
 * Copyright (c) 2011,2012 E.D.Willink and others.
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
 * $Id: Nameable.java,v 1.2 2011/01/24 20:49:36 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.executor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.eclipse.ocl.examples.domain.elements.DomainCollectionType;
import org.eclipse.ocl.examples.domain.elements.DomainFragment;
import org.eclipse.ocl.examples.domain.elements.DomainInheritance;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.types.AbstractFragment;
import org.eclipse.ocl.examples.domain.types.AbstractInheritance;

public abstract class ReflectiveType extends AbstractInheritance
{	
	protected static int computeFlags(DomainType type) {
		if (type instanceof DomainCollectionType) {
			DomainCollectionType collectionType = (DomainCollectionType)type;
			return (collectionType.isOrdered() ? ORDERED : 0) | (collectionType.isUnique() ? UNIQUE : 0);
		}
		else {
			return 0;
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
	private Set<ReflectiveType> knownSubInheritances = null;

	public ReflectiveType(String name, ExecutorPackage evaluationPackage, int flags, ExecutorTypeParameter... typeParameters) {
		super(name, evaluationPackage, flags);
	}

	public void addSubInheritance(ReflectiveType subInheritance) {
		if (knownSubInheritances == null) {
			knownSubInheritances = new HashSet<ReflectiveType>();
		}
		knownSubInheritances.add(subInheritance);
	}

	protected abstract AbstractFragment createFragment(DomainInheritance baseInheritance);

	public void dispose() {}
	
	/**
	 * Add this Inheritance and all un-installed super-Inheritances to inheritances.
	 */
	public void gatherUninstalledInheritances(List<ReflectiveType> inheritances) {
		if (!inheritances.contains(this)) {
			inheritances.add(this);
			if (fragments == null) {
				for (DomainInheritance superInheritance : getInitialSuperInheritances()) {
					if (superInheritance instanceof ReflectiveType) {
						((ReflectiveType)superInheritance).gatherUninstalledInheritances(inheritances);
					}
				}
			}
		}
	}
	
	public final FragmentIterable getAllSuperFragments() {
		if (fragments == null) {
			initialize();
		}
		return new FragmentIterable(fragments);
	}

	public final int getDepth() {
		if (indexes == null) {
			initialize();
		}
		return indexes.length-2;
	}

	public DomainFragment getFragment(int fragmentNumber) {
		return fragments[fragmentNumber];
	}
	
	protected DomainFragment[] getFragments() {
		return fragments;
	}

	public int getIndex(int fragmentNumber) {
		return indexes[fragmentNumber];
	}

	public int getIndexes(){
		return indexes.length;
	}

	/**
	 * Return the immediate superinheritances without reference to the fragments.
	 */
	protected abstract Iterable<? extends DomainInheritance> getInitialSuperInheritances();

	public DomainFragment getSelfFragment() {
		if (indexes == null) {
			initialize();
		}
		return getFragment(fragments.length-1);
	}
	
	public final FragmentIterable getSuperFragments(int depth) {
		return new FragmentIterable(fragments, indexes[depth], indexes[depth+1]);
	}

	public DomainType getType() {
		return this;
	}

	protected void initialize() {
		List<ReflectiveType> uninstalledInheritances = new ArrayList<ReflectiveType>();
		gatherUninstalledInheritances(uninstalledInheritances);
		int oldPendingCount = uninstalledInheritances.size();
		while (true) {
			for (ListIterator<ReflectiveType> it = uninstalledInheritances.listIterator(); it.hasNext(); ) {
				ReflectiveType uninstalledInheritance = it.next();
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
				StringBuilder s = new StringBuilder();
				s.append("Inheritance loop for "); //$NON-NLS-1$
				for (ListIterator<ReflectiveType> it = uninstalledInheritances.listIterator(); it.hasNext(); ) {
					ReflectiveType uninstalledInheritance = it.next();
					if (!uninstalledInheritance.isInstallable()) {
						s.append("\n  "); //$NON-NLS-1$
						s.append(uninstalledInheritance);
					}
				}
				throw new IllegalStateException(s.toString());
			}
			oldPendingCount = newPendingCount;
		}
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
		if (this != oclAnyInheritance){
			List<List<DomainInheritance>> all = new ArrayList<List<DomainInheritance>>();
			for (DomainInheritance superInheritance : getInitialSuperInheritances()) {
//				installIn(superInheritance, this, all);
				int j = 0;
				for (int i = 0; i < superInheritance.getIndexes()-1; i++) {
					List<DomainInheritance> some = (i < all.size()) ? all.get(i) : null;
					if (some == null) {
						some = new ArrayList<DomainInheritance>();
						all.add(some);
					}
					int jMax = superInheritance.getIndex(i+1);
					for (; j < jMax; j++) {
						DomainInheritance baseInheritance = superInheritance.getFragment(j).getBaseInheritance();
						if (!some.contains(baseInheritance)) {
							some.add(baseInheritance);
							if (baseInheritance instanceof ReflectiveType) {
								((ReflectiveType)baseInheritance).addSubInheritance(this);
							}
						}
					}
				}
			}
			int superDepths = all.size();
			int superInheritances = 0;
			for (List<DomainInheritance> some : all) {
				superInheritances += some.size();
			}
			if (superDepths > 0) {
				fragments = new DomainFragment[superInheritances+1];	// +1 for OclSelf
				indexes = new int[superDepths+2];		// +1 for OclSelf, +1 for tail pointer
				int j = 0;
				indexes[0] = 0;
				for (int i = 0; i < superDepths; i++) {
					for (DomainInheritance some : all.get(i)) {
						fragments[j++] = createFragment(some);
					}
					indexes[i+1] = j;
				}
				indexes[superDepths++] = j;
				fragments[j++] = createFragment(this);
				indexes[superDepths++] = j;
			}
			else {
				fragments = new DomainFragment[] { oclAnyInheritance.getFragment(0), createFragment(this) };
				indexes = new int[] { 0, 1, 2 };
			}
		}
		return true;
	}

	/**
	 * Install the root OclAny Inheritance.
	 */
	protected final void installOclAny() {
		assert fragments == null;
		fragments = new DomainFragment[] { createFragment(this) };
		indexes = new int[] { 0, 1 };
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
				if ((superInheritance instanceof ReflectiveType) && !((ReflectiveType)superInheritance).isInstalled()) {
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

	public void removeSubInheritance(ReflectiveType subInheritance) {
		if (knownSubInheritances != null) {
			knownSubInheritances.remove(subInheritance);
		}
	}

	public void uninstall() {
		if (fragments != null) {
			for (DomainFragment fragment : fragments) {
				DomainInheritance baseInheritance = fragment.getBaseInheritance();
				if (baseInheritance instanceof ReflectiveType) {
					((ReflectiveType)baseInheritance).removeSubInheritance(this);
				}
			}
			fragments = null;
			indexes = null;
			if (knownSubInheritances != null) {
				Set<ReflectiveType> previouslyKnownSubInheritances = knownSubInheritances;
				knownSubInheritances = null;
				for (ReflectiveType subInheritance : previouslyKnownSubInheritances) {
					subInheritance.uninstall();
				}
			}
		}
	}
}
