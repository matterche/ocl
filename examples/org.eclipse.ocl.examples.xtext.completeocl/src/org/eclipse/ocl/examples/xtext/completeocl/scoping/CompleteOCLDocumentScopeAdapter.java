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
 * $Id: CompleteOCLDocumentScopeAdapter.java,v 1.11 2011/05/21 19:04:14 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Library;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.scope.AbstractRootCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLDocumentCS;

public class CompleteOCLDocumentScopeAdapter extends AbstractRootCSScopeAdapter
{
	public static final CompleteOCLDocumentScopeAdapter INSTANCE = new CompleteOCLDocumentScopeAdapter();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		CompleteOCLDocumentCS targetElement = (CompleteOCLDocumentCS)target;
		MetaModelManager metaModelManager = environmentView.getMetaModelManager();
		for (ImportCS anImport : targetElement.getOwnedImport()) {
			Namespace namespace = anImport.getNamespace();
			if ((namespace != null) && !namespace.eIsProxy()) {
				String importName = anImport.getName();
				if (importName != null) {
					environmentView.addElement(importName, namespace);
					if (anImport.isAll() && (namespace instanceof org.eclipse.ocl.examples.pivot.Package)) {
						org.eclipse.ocl.examples.pivot.Package rootPackage = (org.eclipse.ocl.examples.pivot.Package)namespace;
						environmentView.addNamedElements(rootPackage.getNestedPackage());
						environmentView.addNamedElements(rootPackage.getOwnedType());
					}
				} else if (namespace instanceof org.eclipse.ocl.examples.pivot.Package) {		// FIXME This legacy behaviour needs cleaning up
					environmentView.addNamedElement(namespace);
					for (org.eclipse.ocl.examples.pivot.Package rootPackage : ((org.eclipse.ocl.examples.pivot.Package)namespace).getNestedPackage()) {
						environmentView.addNamedElement(rootPackage);		// FIXME Rationalize root of pivot model
						environmentView.addNamedElements(rootPackage.getNestedPackage());
						environmentView.addNamedElements(rootPackage.getOwnedType());
					}
				}
			}
		}
		if (!environmentView.hasFinalResult()) {
			metaModelManager.getOclAnyType();
			for (Library library : metaModelManager.getLibraries()) {
				environmentView.addNamedElement(library);
			}
		}
		return null;
	}
}
