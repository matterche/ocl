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
 * $Id: CompleteOCLCS2Pivot.java,v 1.4 2011/05/20 15:26:51 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.cs2pivot;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2PivotResourceAdapter;
import org.eclipse.ocl.examples.xtext.completeocl.utilities.CompleteOCLCSResource;
import org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot.EssentialOCLCS2Pivot;

public class CompleteOCLCS2Pivot extends EssentialOCLCS2Pivot
{	
	public static MetaModelManager.Factory FACTORY = new Factory();

	private static final class Factory implements MetaModelManager.Factory
	{
		private Factory() {
			MetaModelManager.addFactory(this);
		}

		public boolean canHandle(Resource resource) {
			return resource instanceof CompleteOCLCSResource;
		}

		public void configure(ResourceSet resourceSet) {}

		public URI getPackageURI(EObject eObject) {
			return null;
		}

		public Element importFromResource(MetaModelManager metaModelManager, Resource resource, String uriFragment) {
			CS2PivotResourceAdapter adapter = CS2PivotResourceAdapter.getAdapter((CompleteOCLCSResource)resource, metaModelManager);
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
		
	public CompleteOCLCS2Pivot(Map<? extends Resource, ? extends Resource> cs2pivotResourceMap, MetaModelManager metaModelManager) {
		super(cs2pivotResourceMap, metaModelManager);
	}

	@Override
	protected CompleteOCLContainmentVisitor createContainmentVisitor(CS2PivotConversion converter) {
		return new CompleteOCLContainmentVisitor(converter);
	}

	@Override
	protected CompleteOCLLeft2RightVisitor createLeft2RightVisitor(CS2PivotConversion converter) {
		return new CompleteOCLLeft2RightVisitor(converter);
	}

	@Override
	protected CompleteOCLPostOrderVisitor createPostOrderVisitor(CS2PivotConversion converter) {
		return new CompleteOCLPostOrderVisitor(converter);
	}

	@Override
	protected CompleteOCLPreOrderVisitor createPreOrderVisitor(CS2PivotConversion converter) {
		return new CompleteOCLPreOrderVisitor(converter);
	}
}
