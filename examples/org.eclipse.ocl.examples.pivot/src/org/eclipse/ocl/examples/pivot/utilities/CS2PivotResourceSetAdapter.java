/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: CS2PivotResourceSetAdapter.java,v 1.1.2.1 2010/10/01 13:49:55 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.utilities;

import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * A CS2PivotResourceSetAdapter enhances the ResourceSet for Concrete Syntax model
 * to support synchronization with a Pivot model representation.
 */
public class CS2PivotResourceSetAdapter implements Adapter
{		
	public static CS2PivotResourceSetAdapter findAdapter(ResourceSet csResourceSet) {
		if (csResourceSet == null) {
			return null;
		}
		List<Adapter> eAdapters = csResourceSet.eAdapters();
		return (CS2PivotResourceSetAdapter) EcoreUtil.getAdapter(eAdapters, CS2PivotResourceSetAdapter.class);
	}
	
	public static CS2PivotResourceSetAdapter getAdapter(ResourceSet csResourceSet, PivotManager pivotManager) {
		List<Adapter> eAdapters = csResourceSet.eAdapters();
		CS2PivotResourceSetAdapter adapter = (CS2PivotResourceSetAdapter) EcoreUtil.getAdapter(eAdapters, CS2PivotResourceSetAdapter.class);
		if (adapter == null) {
			if (pivotManager == null) {
				pivotManager = new PivotManager();
			}
			adapter = new CS2PivotResourceSetAdapter(csResourceSet, pivotManager);
			eAdapters.add(adapter);
		}
		return adapter;
	}
	
	private final ResourceSet csResourceSet;
	private final PivotManager pivotManager;
	
	public CS2PivotResourceSetAdapter(ResourceSet csResourceSet, PivotManager pivotManager) {
		this.csResourceSet = csResourceSet;
		this.pivotManager = pivotManager;
	}
	
	public PivotManager getPivotManager() {
		return pivotManager;
	}

	public ResourceSet getTarget() {
		return csResourceSet;
	}

	public boolean isAdapterForType(Object type) {
		return type == CS2PivotResourceSetAdapter.class;
	}	

	public void notifyChanged(Notification notification) {
	}

	public void setTarget(Notifier newTarget) {
		assert newTarget == csResourceSet;
	}
}