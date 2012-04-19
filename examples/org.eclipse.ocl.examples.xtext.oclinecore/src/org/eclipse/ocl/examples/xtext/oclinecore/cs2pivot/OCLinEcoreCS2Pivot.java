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
 * $Id: OCLinEcoreCS2Pivot.java,v 1.4 2011/05/20 15:27:12 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclinecore.cs2pivot;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.PackageCS;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2PivotResourceAdapter;
import org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot.EssentialOCLCS2Pivot;
import org.eclipse.ocl.examples.xtext.oclinecore.utilities.OCLinEcoreCSResource;

public class OCLinEcoreCS2Pivot extends EssentialOCLCS2Pivot 
{	
	private static final class Factory implements MetaModelManager.Factory
	{
		private Factory() {
			MetaModelManager.addFactory(this);
		}

		public boolean canHandle(Resource resource) {
			return resource instanceof OCLinEcoreCSResource;
		}

		public void configure(ResourceSet resourceSet) {}

		public URI getPackageURI(EObject eObject) {
			if (eObject instanceof PackageCS) {
				Element pivot = ((PackageCS)eObject).getPivot();
				if (pivot instanceof org.eclipse.ocl.examples.pivot.Package) {
					String uri = ((org.eclipse.ocl.examples.pivot.Package)pivot).getNsURI();
					if (uri != null) {
						return URI.createURI(uri);
					}
				}
			}
			return null;
		}

		public Element importFromResource(MetaModelManager metaModelManager, Resource resource, String uriFragment) {
			CS2PivotResourceAdapter adapter = CS2PivotResourceAdapter.getAdapter((OCLinEcoreCSResource)resource, metaModelManager);
			Resource pivotResource = adapter.getPivotResource(resource);
			if (pivotResource == null) {
				return null;
			}
			List<EObject> contents = pivotResource.getContents();
			if (contents.size() <= 0) {
				return null;
			}
			if (uriFragment == null) {
				return (Element) contents.get(0);
			}
			else {
				throw new UnsupportedOperationException();	// FIXME
			}
		}
	}

	public static MetaModelManager.Factory FACTORY = new Factory();
		
	public OCLinEcoreCS2Pivot(Map<? extends Resource, ? extends Resource> cs2pivotResourceMap, MetaModelManager metaModelManager) {
		super(cs2pivotResourceMap, metaModelManager);
	}

	@Override
	protected OCLinEcoreContainmentVisitor createContainmentVisitor(CS2PivotConversion converter) {
		return new OCLinEcoreContainmentVisitor(converter);
	}

	@Override
	protected OCLinEcoreLeft2RightVisitor createLeft2RightVisitor(CS2PivotConversion converter) {
		return new OCLinEcoreLeft2RightVisitor(converter);
	}

	@Override
	protected OCLinEcorePostOrderVisitor createPostOrderVisitor(CS2PivotConversion converter) {
		return new OCLinEcorePostOrderVisitor(converter);
	}

	@Override
	protected OCLinEcorePreOrderVisitor createPreOrderVisitor(CS2PivotConversion converter) {
		return new OCLinEcorePreOrderVisitor(converter);
	}
}
