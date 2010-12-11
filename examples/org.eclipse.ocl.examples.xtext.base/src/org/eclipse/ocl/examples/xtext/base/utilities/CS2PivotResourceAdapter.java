package org.eclipse.ocl.examples.xtext.base.utilities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2Pivot;
import org.eclipse.ocl.examples.xtext.base.scope.RootCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeCSAdapter;

/**
 * A CS2PivotResourceAdapter enhances the Resource for a Concrete Syntax model
 * to support synchronization with a Pivot model representation.
 */
public class CS2PivotResourceAdapter implements Adapter
{		
	public static CS2PivotResourceAdapter findAdapter(Resource csResource) {
		if (csResource == null) {
			return null;
		}
		return PivotUtil.getAdapter(CS2PivotResourceAdapter.class, csResource);
	}
	
	public static CS2PivotResourceAdapter getAdapter(BaseCSResource csResource, PivotManager pivotManager) {
		List<Adapter> eAdapters = csResource.eAdapters();
		CS2PivotResourceAdapter adapter = PivotUtil.getAdapter(CS2PivotResourceAdapter.class, eAdapters);
		if (adapter == null) {
			pivotManager = ElementUtil.getPivotManager(csResource);
			if (pivotManager == null) {
				pivotManager = new PivotManager();
			}
			adapter = new CS2PivotResourceAdapter(csResource, pivotManager);
			eAdapters.add(adapter);
		}
		return adapter;
	}
	
	public static CS2PivotResourceAdapter refreshPivotMappings(BaseCSResource csResource, PivotManager pivotManager) {
		CSAliasCreator.refreshPackageAliases(csResource);
		CS2PivotResourceAdapter adapter = getAdapter(csResource, pivotManager);
		adapter.refreshPivotMappings();
		return adapter;
	}
	
	private final Resource csResource;
	private final PivotManager pivotManager;
	private final CS2Pivot converter;
	
	public CS2PivotResourceAdapter(BaseCSResource csResource, PivotManager pivotManager) {
		this.csResource = csResource;
		this.pivotManager = pivotManager;
		Map<Resource, Resource> cs2pivotResourceMap = computeCS2PivotResourceMap(
			csResource, pivotManager);
		converter = csResource.createCS2Pivot(cs2pivotResourceMap, pivotManager);
	}

	public Map<Resource, Resource> computeCS2PivotResourceMap(Resource csResource, PivotManager pivotManager) {
		ResourceSet pivotResourceSet = pivotManager.getTarget();
		Map<Resource,Resource> cs2pivotResourceMap = new HashMap<Resource,Resource>();
		for (Resource acsResource : csResource.getResourceSet().getResources()) {
			URI uri = acsResource.getURI();
			List<EObject> contents = acsResource.getContents();
//			if (!"java".equals(uri.scheme())) { //$NON-NLS-1$
			if ((contents.size() > 0) && (contents.get(0) instanceof ModelElementCS)) { //$NON-NLS-1$
				URI pivotURI = uri.appendFileExtension("pivot");
				Resource pivotResource = pivotResourceSet.getResource(pivotURI, false);
				if (pivotResource == null) {
					pivotResource = pivotResourceSet.createResource(pivotURI);
				}
				cs2pivotResourceMap.put(acsResource, pivotResource);
			}
		}
		return cs2pivotResourceMap;
	}
	
	public CS2Pivot getConverter() {
		return converter;
	}

	public long getModificationCount() {
		List<EObject> contents = csResource.getContents();
		if (!contents.isEmpty()) {
			ElementCS csElement = (ElementCS) contents.get(0);
			ScopeCSAdapter scopeAdapter = ElementUtil.getScopeCSAdapter(csElement);
			if (scopeAdapter != null) {
				RootCSScopeAdapter documentScopeAdapter = scopeAdapter.getRootScopeAdapter();
				if (documentScopeAdapter != null) {
					return documentScopeAdapter.getModificationCount();
				}
			}
		}
		return -1;
	}
	
	public PivotManager getPivotManager() {
		return pivotManager;
	}

	public Resource getPivotResource(Resource csResource) {
		return converter.getPivotResource(csResource);
	}

	public Resource getTarget() {
		return csResource;
	}

	public boolean isAdapterForType(Object type) {
		return type == CS2PivotResourceAdapter.class;
	}	
	
	public void refreshPivotMappings() {
		converter.update();
	}

	public void notifyChanged(Notification notification) {
	}

	public void setTarget(Notifier newTarget) {
		assert newTarget == csResource;
	}
}