package org.eclipse.ocl.examples.xtext.base.utilities;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.utilities.CS2PivotResourceSetAdapter;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.lazy.LazyLinker;

/**
 * CS2PivotLinker ensures that the CS 2 Pivot mappings are refreshed after
 * and CS Resource modification is committed.
 */
public class CS2PivotLinker extends LazyLinker
{
	@Override
	protected void afterModelLinked(EObject model, IDiagnosticConsumer diagnosticsConsumer) {
		Resource eResource = model.eResource();		// FIXME Try to do a narrower refresh
		if ((eResource != null) && eResource.getErrors().isEmpty()) {
			CS2PivotResourceSetAdapter resourceSetAdapter = CS2PivotResourceSetAdapter.getAdapter(eResource.getResourceSet(), null);
			CS2PivotResourceAdapter.refreshPivotMappings(eResource, resourceSetAdapter.getPivotManager());
		}
	}
}