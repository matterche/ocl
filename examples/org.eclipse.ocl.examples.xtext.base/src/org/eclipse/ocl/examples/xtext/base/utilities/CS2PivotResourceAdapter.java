/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: CS2PivotResourceAdapter.java,v 1.12 2011/05/15 20:20:22 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.utilities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceAdapter;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceSetAdapter;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2Pivot;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;

/**
 * A CS2PivotResourceAdapter enhances the Resource for a Concrete Syntax model
 * to support synchronization with a Pivot model representation.
 */
public class CS2PivotResourceAdapter extends MetaModelManagerResourceAdapter
{		
	public static CS2PivotResourceAdapter findAdapter(BaseCSResource csResource) {
		if (csResource == null) {
			return null;
		}
		MetaModelManagerResourceAdapter adapter = PivotUtil.getAdapter(MetaModelManagerResourceAdapter.class, csResource);
		if (adapter == null) {
			return null;
		}
		if (adapter instanceof CS2PivotResourceAdapter) {
			return (CS2PivotResourceAdapter) adapter;
		}
		List<Adapter> eAdapters = csResource.eAdapters();
		eAdapters.remove(adapter);
		adapter.dispose();
		CS2PivotResourceAdapter derivedAdapter = new CS2PivotResourceAdapter(csResource, adapter.getMetaModelManager());
		eAdapters.add(derivedAdapter);
		return derivedAdapter;
	}
	
	public static CS2PivotResourceAdapter getAdapter(BaseCSResource csResource, MetaModelManager metaModelManager) {
		List<Adapter> eAdapters = csResource.eAdapters();
		CS2PivotResourceAdapter adapter = findAdapter(csResource);
		if (adapter == null) {
			if (metaModelManager == null) {
				ResourceSet csResourceSet = csResource.getResourceSet();
				MetaModelManagerResourceSetAdapter rsAdapter = MetaModelManagerResourceSetAdapter.findAdapter(csResourceSet);
				if (rsAdapter != null) {
					metaModelManager = rsAdapter.getMetaModelManager();					
				}
				if (metaModelManager == null) {
					metaModelManager = csResource.createMetaModelManager();
					MetaModelManagerResourceSetAdapter.getAdapter(csResourceSet, metaModelManager);
				}
				metaModelManager.addClassLoader(csResource.getClass().getClassLoader());
			}
			adapter = new CS2PivotResourceAdapter(csResource, metaModelManager);
			eAdapters.add(adapter);
		}
		return adapter;
	}
	
	private final CS2Pivot converter;
	
	public CS2PivotResourceAdapter(BaseCSResource csResource, MetaModelManager metaModelManager) {
		super(csResource, metaModelManager);
		Map<Resource, Resource> cs2pivotResourceMap = computeCS2PivotResourceMap(
			csResource, metaModelManager);
		converter = csResource.createCS2Pivot(cs2pivotResourceMap, metaModelManager);
	}

	public Map<Resource, Resource> computeCS2PivotResourceMap(Resource csResource, MetaModelManager metaModelManager) {
		ResourceSet pivotResourceSet = metaModelManager.getTarget();
		Map<Resource,Resource> cs2pivotResourceMap = new HashMap<Resource,Resource>();
	//	ResourceSet csResourceSet = csResource.getResourceSet();
	//	if (csResourceSet != null) {
//		for (Resource acsResource : csResourceSet.getResources()) {
			Resource acsResource = csResource;
				URI uri = acsResource.getURI();
				List<EObject> contents = acsResource.getContents();
	//			if (!"java".equals(uri.scheme())) { //$NON-NLS-1$
				if ((contents.size() > 0) && (contents.get(0) instanceof ModelElementCS)) { //$NON-NLS-1$
					URI pivotURI = PivotUtil.getPivotURI(uri);
					Resource pivotResource = pivotResourceSet.getResource(pivotURI, false);
					if (pivotResource == null) {
						pivotResource = pivotResourceSet.createResource(pivotURI, PivotPackage.eCONTENT_TYPE);
					}
					cs2pivotResourceMap.put(acsResource, pivotResource);
				}
	//		}
	//	}
		return cs2pivotResourceMap;
	}
	
	public CS2Pivot getConverter() {
		return converter;
	}

	@Override
	public Resource getPivotResource(Resource csResource) {
		return converter.getPivotResource(csResource);
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return super.isAdapterForType(type) || (type == CS2PivotResourceAdapter.class);
	}	
	
	public void refreshPivotMappings(IDiagnosticConsumer diagnosticsConsumer) throws Exception {
		try {
			converter.update(diagnosticsConsumer);
		}
		catch (Exception e) {
			dispose();
			throw e;
		}
	}
}