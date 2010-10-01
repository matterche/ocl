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
 * $Id: ImportScopeAdapter.java,v 1.1.2.1 2010/10/01 14:13:01 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

public class ImportScopeAdapter extends ModelElementCSScopeAdapter<ImportCS, org.eclipse.ocl.examples.pivot.Package>
{
	private URI uri = null;
	private EObject importedElement = null;
	
	public ImportScopeAdapter(ImportCS csElement) {
		super(csElement, org.eclipse.ocl.examples.pivot.Package.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		if (containmentFeature == null) {
			environmentView.addElementsOfScope(importedElement, scopeView);
		}
		else {
			environmentView.addElementsOfScope(importedElement, scopeView);
		}
		return scopeView.getOuterScope();
	}

	public void setImportedElement(URI uri, EObject importedElement) {
		this.uri = uri;
		this.importedElement = importedElement;
	}

	public EObject getImportedElement() {
		return importedElement;
	}

	public URI getURI() {
		return uri;
	}
}
