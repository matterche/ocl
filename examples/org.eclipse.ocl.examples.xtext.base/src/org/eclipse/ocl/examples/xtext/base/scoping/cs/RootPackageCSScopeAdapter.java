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
 * $Id: RootPackageCSScopeAdapter.java,v 1.1.2.2 2010/12/06 17:53:57 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootPackageCS;
import org.eclipse.ocl.examples.xtext.base.scope.AbstractRootCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

public class RootPackageCSScopeAdapter extends AbstractRootCSScopeAdapter<RootPackageCS, org.eclipse.ocl.examples.pivot.Package>
{
	public RootPackageCSScopeAdapter(RootPackageCS csElement) {
		super(csElement, org.eclipse.ocl.examples.pivot.Package.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		org.eclipse.ocl.examples.pivot.Package pivot = getPivot();
		if (pivot != null) {
			environmentView.addNamedElements(PivotPackage.Literals.PACKAGE, pivot.getNestedPackages());
		}
		if (environmentView.accepts(PivotPackage.Literals.NAMESPACE)) {
			for (ImportCS anImport : getTarget().getOwnedImport()) {
				Namespace namespace = anImport.getNamespace();
				String importName = anImport.getName();
				if (importName == null) {
					if (namespace instanceof org.eclipse.ocl.examples.pivot.Package) {
						environmentView.addNamedElements(((org.eclipse.ocl.examples.pivot.Package)namespace).getNestedPackages());
					}
				}
				else {
					if (environmentView.addNamedElement(namespace) > 0) {
						EcoreUtil.resolveAll(namespace);
					}
					environmentView.addElement(importName, namespace);
				}
			}
			if (pivot != null) {
				environmentView.addNamedElements(pivot.getNestedPackages());		// Overrides imports
			}
		}
		if (environmentView.accepts(PivotPackage.Literals.PRECEDENCE)) {
			if (pivot != null) {
				environmentView.addNamedElements(pivot.getOwnedPrecedences());		// Overrides imports
			}
		}
/*		if (environmentView.accepts(BaseCSTPackage.Literals.PACKAGE_CS)) {
			for (ImportCS anImport : getTarget().getOwnedImport()) {
				if (anImport.getName() == null) {
					Namespace namespace = anImport.getNamespace();
					if (namespace instanceof org.eclipse.ocl.examples.pivot.Package) {
						environmentView.addNamedElements(((org.eclipse.ocl.examples.pivot.Package)namespace).getNestedPackages());
					}
				}
				else {
					if (environmentView.addNamedElement(anImport) > 0) {
						EcoreUtil.resolveAll(anImport.getNamespace());
					}
				}
			}
			if (pivot != null) {
				environmentView.addNamedElements(pivot.getNestedPackages());		// Overrides imports
			}
		} */
		return null;
	}
}
