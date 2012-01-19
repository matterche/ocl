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

import org.eclipse.ocl.examples.domain.elements.DomainFragment;
import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.elements.DomainProperty;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.types.AbstractInheritance;

public class ExecutorType extends AbstractInheritance implements DomainType, ExecutorTypeArgument
{
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
	
	public ExecutorType(String name, ExecutorPackage evaluationPackage, int flags, ExecutorTypeParameter... typeParameters) {
		super(name, evaluationPackage, flags);
	}
	
	public FragmentIterable getAllSuperFragments() {
		return new FragmentIterable(fragments);
	}

	public int getDepth() {
		return indexes.length-2;
	}

	public DomainFragment getFragment(int fragmentNumber) {
		return fragments[fragmentNumber];
	}
	
	public int getIndex(int fragmentNumber) {
		return indexes[fragmentNumber];
	}

	public int getIndexes(){
		return indexes.length;
	}

	public Iterable<? extends DomainOperation> getLocalOperations() {
		return getSelfFragment().getLocalOperations();
	}

	public Iterable<? extends DomainProperty> getLocalProperties() {
		return getSelfFragment().getLocalProperties();
	}

	public Iterable<? extends DomainType> getLocalSuperTypes() {
		return getSelfFragment().getLocalSuperTypes();
	}

	public String getMetaTypeName() {
		throw new UnsupportedOperationException();
	}

	public ExecutorFragment getSelfFragment() {
		return (ExecutorFragment) getFragment(fragments.length-1);
	}

	public DomainStandardLibrary getStandardLibrary() {
		return ExecutorStandardLibrary.INSTANCE;
	}
	
	public final FragmentIterable getSuperFragments(int depth) {
		return new FragmentIterable(fragments, indexes[depth], indexes[depth+1]);
	}

	public DomainType getType() {
		return this;
	}

	public void initFragments(ExecutorFragment[] fragments, int[] depthCounts) {
		if (fragments != null) {
			int[] indexes = new int[depthCounts.length+1];
			indexes[0] = 0;
			for (int i = 0; i <  depthCounts.length; i++) {
				indexes[i+1] = indexes[i] + depthCounts[i];
			}
			this.fragments = fragments;
			this.indexes = indexes;
		}
		else {
			this.fragments = null;
			this.indexes = null;
		}
	}
}