package org.eclipse.ocl.examples.xtext.oclstdlib;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2PivotResourceAdapter;
import org.eclipse.xtext.resource.DefaultFragmentProvider;


public class PivotFragmentProvider extends DefaultFragmentProvider
{
	@Override
	public EObject getEObject(Resource resource, String fragment, Fallback fallback) {
		if (!fragment.startsWith("/")) {
			CS2PivotResourceAdapter converter = CS2PivotResourceAdapter.findAdapter(resource);
			if (converter != null) {
				Resource pivotResource = converter.getPivotResource(resource);
				if (pivotResource != null) {
					EObject eObject = pivotResource.getEObject(fragment);
					if (eObject != null) {
						return eObject;
					}
				}
			}
		}
		return super.getEObject(resource, fragment, fallback);
	}
}
