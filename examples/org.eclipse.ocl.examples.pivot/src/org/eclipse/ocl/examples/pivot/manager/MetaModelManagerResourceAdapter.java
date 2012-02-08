/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

/**
 * A MetaModelManagerResourceAdapter enhances the Resource for a Concrete Syntax model
 * to support synchronization with a Pivot model representation.
 */
public class MetaModelManagerResourceAdapter implements MetaModelManagedAdapter
{		
	public static MetaModelManagerResourceAdapter findAdapter(Resource resource) {
		if (resource == null) {
			return null;
		}
		return PivotUtil.getAdapter(MetaModelManagerResourceAdapter.class, resource);
	}
	
	public static MetaModelManagerResourceAdapter getAdapter(Resource resource, MetaModelManager metaModelManager) {
		List<Adapter> eAdapters = resource.eAdapters();
		MetaModelManagerResourceAdapter adapter = PivotUtil.getAdapter(MetaModelManagerResourceAdapter.class, eAdapters);
		if ((adapter != null) && (metaModelManager != null) && (adapter.getMetaModelManager() != metaModelManager)) {
			eAdapters.remove(adapter);
			adapter = null;
		}
		if (adapter == null) {
			if (metaModelManager == null) {
				metaModelManager = new MetaModelManager();
			}
			adapter = new MetaModelManagerResourceAdapter(resource, metaModelManager);
			eAdapters.add(adapter);
		}
		return adapter;
	}
	
//	public static LiveInstances<MetaModelManagerResourceAdapter> INSTANCES = new LiveInstances(MetaModelManagerResourceAdapter.class);
	
	protected final Resource resource;
	protected final MetaModelManager metaModelManager;
	
	public MetaModelManagerResourceAdapter(Resource resource, MetaModelManager metaModelManager) {
		this.resource = resource;
		this.metaModelManager = metaModelManager;
		metaModelManager.addListener(this);
//		INSTANCES.add(this);		
	}

	public void dispose() {
//		INSTANCES.remove(this);
		resource.eAdapters().remove(this);
	}
	
	public Resource getPivotResource(Resource csResource) {
		return null;		// Overridden by CS2PivotResourceAdapter
	}

	public Resource getTarget() {
		return resource;
	}
	
	public MetaModelManager getMetaModelManager() {
		return metaModelManager;
	}

	public boolean isAdapterFor(MetaModelManager metaModelManager) {
		return this.metaModelManager == metaModelManager;
	}

	public boolean isAdapterForType(Object type) {
		return type == MetaModelManagerResourceAdapter.class;
	}	

	public void metaModelManagerDisposed(MetaModelManager metaModelManager) {
		dispose();
	}

	public void notifyChanged(Notification notification) {
	}

	public void setTarget(Notifier newTarget) {
		assert newTarget == resource;
	}

	public void unsetTarget(Notifier oldTarget) {
		assert oldTarget == resource;
	}
}