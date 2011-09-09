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
package org.eclipse.ocl.examples.pivot.manager;

import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

/**
 * A MetaModelManagerResourceSetAdapter associates a MetaModelManager with a ResourceSet so
 * that Resource creation can re-use a shared MetaModelManager.
 */
public class MetaModelManagerResourceSetAdapter implements MetaModelManagedAdapter
{		
	public static MetaModelManagerResourceSetAdapter findAdapter(ResourceSet resourceSet) {
		if (resourceSet == null) {
			return null;
		}
		return PivotUtil.getAdapter(MetaModelManagerResourceSetAdapter.class, resourceSet);
	}
	
	public static MetaModelManagerResourceSetAdapter getAdapter(ResourceSet resourceSet, MetaModelManager metaModelManager) {
		List<Adapter> eAdapters = resourceSet.eAdapters();
		MetaModelManagerResourceSetAdapter adapter = PivotUtil.getAdapter(MetaModelManagerResourceSetAdapter.class, eAdapters);
		if (adapter == null) {
			if (metaModelManager == null) {
				metaModelManager = new MetaModelManager();
			}
			adapter = new MetaModelManagerResourceSetAdapter(resourceSet, metaModelManager);
			eAdapters.add(adapter);
		}
		return adapter;
	}
	
	protected final ResourceSet resourceSet;
	protected final MetaModelManager metaModelManager;
	
	public MetaModelManagerResourceSetAdapter(ResourceSet resourceSet, MetaModelManager metaModelManager) {
		this.resourceSet = resourceSet;
		this.metaModelManager = metaModelManager;
		metaModelManager.addListener(this);
	}

	public void dispose() {
		resourceSet.eAdapters().remove(this);
	}
	
	public MetaModelManager getMetaModelManager() {
		return metaModelManager;
	}

	public ResourceSet getTarget() {
		return resourceSet;
	}

	public boolean isAdapterForType(Object type) {
		return type == MetaModelManagerResourceSetAdapter.class;
	}	

	public boolean isAdapterFor(MetaModelManager metaModelManager) {
		return this.metaModelManager == metaModelManager;
	}

	public void metaModelManagerDisposed(MetaModelManager metaModelManager) {
		dispose();
	}

	public void notifyChanged(Notification notification) {
	}

	public void setTarget(Notifier newTarget) {
		assert (newTarget == resourceSet) || (newTarget == null);
	}

	public void unsetTarget(Notifier oldTarget) {
		// TODO Auto-generated method stub		
	}
}