/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: AbstractRootCSScopeAdapter.java,v 1.1.2.1 2010/10/01 14:13:03 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scope;

import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.xtext.base.baseCST.AbstractPackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootCS;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ModelElementCSScopeAdapter;

public abstract class AbstractRootCSScopeAdapter<CS extends RootCS, P extends Element>
	extends ModelElementCSScopeAdapter<CS, P>
	implements RootCSScopeAdapter
{
	private long modificationCount = 0;

	public AbstractRootCSScopeAdapter(CS csElement, Class<P> pivotClass) {
		super(csElement, pivotClass);
	}

	public void endModification() {}

	public String getAlias(AbstractPackageCS csPackage) {
		for (ImportCS csImport : target.getOwnedImport()) {
			if (csPackage.getPivot() == csImport.getNamespace()) {
				return csImport.getName();
			}
		}
		return csPackage.getName();
	}

/*	public BoundDocumentCS getBoundDocument() {
		if (boundDocument == null) {
			Resource eResource = csElement.eResource();
			ResourceSet resourceSet = eResource.getResourceSet();
			for (Resource resource : resourceSet.getResources()) {
				if (resource.getContents().size() == 1) {
					EObject content = resource.getContents().get(0);
					if (content instanceof BoundDocumentCS) {
						boundDocument = (BoundDocumentCS) content;
						break;
					}
				}
			}
			if (boundDocument == null) {
				URI uri = URI.createURI("bound-document.xmi"); //$NON-NLS-1$
				Resource resource = resourceSet.createResource(uri);
				resourceSet.getResources().add(resource);
				boundDocument = BaseCSTFactory.eINSTANCE.createBoundDocumentCS();
				resource.getContents().add(boundDocument);
			}
		}
		return boundDocument;
	} */
	
	public long getModificationCount() {
		return modificationCount;
	}

	@Override
	public AbstractRootCSScopeAdapter<?,?> getRootScopeAdapter() {
		return this;
	}

	public void startModification() {
		modificationCount++;
	}
}
