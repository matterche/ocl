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
 * $Id$
 */
package org.eclipse.ocl.examples.library.executor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.ocl.examples.domain.elements.DomainFragment;
import org.eclipse.ocl.examples.domain.elements.DomainInheritance;
import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.elements.DomainProperty;
import org.eclipse.ocl.examples.domain.library.LibraryFeature;
import org.eclipse.ocl.examples.domain.types.AbstractFragment;
import org.eclipse.ocl.examples.domain.utilities.IndexableIterable;

/**
 * A ReflectiveFragment provides the description of the properties and operations defined by some class when accessed by the same
 * or another class. The descriptions are normally built lazily and one name at a time using reflective access to some meta-model.
 */
public abstract class ReflectiveFragment extends AbstractFragment
{
	protected Map<DomainOperation, LibraryFeature> operationMap = null;
	protected Map<DomainProperty, LibraryFeature> propertyMap = null;

	public ReflectiveFragment(DomainInheritance derivedInheritance, DomainInheritance baseInheritance) {
		super(derivedInheritance, baseInheritance);
	}

	public LibraryFeature getImplementation(DomainOperation baseOperation) {
		if (operationMap != null) {
			LibraryFeature libraryFeature = operationMap.get(baseOperation);
			if (libraryFeature != null) {
				return libraryFeature;
			}
		}
		else {
			operationMap = new HashMap<DomainOperation, LibraryFeature>();		// Optimize to reuse single super map if no local ops
		}
		DomainOperation localOperation = getOperationOverload(baseOperation);
		if (localOperation == null) {
			localOperation = baseOperation;
		}
		LibraryFeature libraryFeature = localOperation.getImplementation();
		if (derivedInheritance == baseInheritance) {
			assert localOperation == baseOperation;
		}
		else if (libraryFeature == null) {
			int depth = derivedInheritance.getDepth();
			List<Integer> multiDepths = null;
			Set<DomainInheritance> multiOverrides = null;
			IndexableIterable<DomainFragment> superFragments = derivedInheritance.getSuperFragments(depth-1);
			if (superFragments.size() > 1) {
				// 
				//	The depth of a single base is always one less than the derived depth. However some of the bases
				//	of a multi-base type may be more than one away, but only at levels that are also multi-base. So
				//	keep track of all inherited multiDepth levels for a mulrti-base type.
				//
				for (int i = depth-2; i > 0; --i) {
					IndexableIterable<DomainFragment> superSuperFragments = derivedInheritance.getSuperFragments(i);
					if (superSuperFragments.size() > 1) {
						if (multiDepths == null) {
							multiDepths = new ArrayList<Integer>();
							multiOverrides = new HashSet<DomainInheritance>();
						}
						multiDepths.add(i);
					}
				}
			}
			for (DomainFragment derivedSuperFragment : superFragments) {
				DomainInheritance superInheritance = derivedSuperFragment.getBaseInheritance();
				if (multiDepths != null) {
					for (Integer multiDepth : multiDepths) {
						for (DomainFragment superSuperFragment : superInheritance.getSuperFragments(multiDepth)) {
							Set<DomainInheritance> nonNullMultiOverrides = multiOverrides;
							nonNullMultiOverrides.add(superSuperFragment.getBaseInheritance());
						}
					}
				}
				DomainFragment superFragment = superInheritance.getFragment(baseInheritance);
				if (superFragment != null) {
					LibraryFeature superFeature = superFragment.getImplementation(baseOperation);
					if (libraryFeature == null) {
						libraryFeature = superFeature;
					}
					else {
						assert libraryFeature == superFeature;
					}
				}
			}
			if (multiDepths != null) {
				for (Integer multiDepth : multiDepths) {
					for (DomainFragment superSuperFragment : derivedInheritance.getSuperFragments(multiDepth)) {
						DomainInheritance superSuperInheritance = superSuperFragment.getBaseInheritance();
						Set<DomainInheritance> nonNullMultiOverrides = multiOverrides;
						if (!nonNullMultiOverrides.contains(superSuperInheritance)) {
							DomainFragment superFragment = superSuperInheritance.getFragment(baseInheritance);
							if (superFragment != null) {
								LibraryFeature superFeature = superFragment.getImplementation(baseOperation);
								if (libraryFeature == null) {
									libraryFeature = superFeature;
								}
								else {
									assert libraryFeature == superFeature;
								}
							}
						}
					}
				}
			}
		}
		assert libraryFeature != null;
		operationMap.put(baseOperation, libraryFeature);
		return libraryFeature;
	}

	protected abstract DomainOperation getOperationOverload(DomainOperation baseOperation);

//	public Iterable<? extends DomainProperty> getProperties() {
//		return propertyMap != null ? propertyMap.keySet() : Collections.<DomainProperty>emptyList();
//	}
}