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
 * $Id: RootPackageCSAttribution.java,v 1.6 2011/05/11 19:51:16 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.attributes;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.scoping.ScopeView;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootPackageCS;
import org.eclipse.ocl.examples.xtext.base.scoping.AbstractRootCSAttribution;

public class RootPackageCSAttribution extends AbstractRootCSAttribution
{
	public static final RootPackageCSAttribution INSTANCE = new RootPackageCSAttribution();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		RootPackageCS targetElement = (RootPackageCS)target;
		MetaModelManager metaModelManager = environmentView.getMetaModelManager();
		org.eclipse.ocl.examples.pivot.Package pivotPackage = PivotUtil.getPivot(org.eclipse.ocl.examples.pivot.Package.class, targetElement);
		if (pivotPackage != null) {
			environmentView.addNamedElements(metaModelManager.getLocalPackages(pivotPackage));
			environmentView.addNamedElements(metaModelManager.getLocalClasses(pivotPackage));
		}
		if (environmentView.accepts(PivotPackage.Literals.NAMESPACE)) {
			for (ImportCS anImport : targetElement.getOwnedImport()) {
				Namespace namespace = anImport.getNamespace();
				if (!namespace.eIsProxy()) {
					String importName = anImport.getName();
					if (importName == null) {
						if (namespace instanceof org.eclipse.ocl.examples.pivot.Package) {
							environmentView.addNamedElements(metaModelManager.getLocalPackages((org.eclipse.ocl.examples.pivot.Package)namespace));
						}
					}
					else {
						environmentView.addElement(importName, namespace);
					}
				}
			}
			if (!environmentView.hasFinalResult()) {
				for (org.eclipse.ocl.examples.pivot.Package pPackage : metaModelManager.getPackageManager().getAllPackages()) {
					String nsURI = pPackage.getNsURI();
					if (nsURI != null) {
						environmentView.addElement(nsURI, pPackage);
					}
				}
			}
			if ((pivotPackage != null) && !environmentView.hasFinalResult()) {
				URI baseURI = pivotPackage.eResource().getURI();
            	if (baseURI != null) {
                	if (PivotUtil.isPivotURI(baseURI)) {
                		baseURI = PivotUtil.getNonPivotURI(baseURI);
                	}
                	if (baseURI != null) {
                		String name = environmentView.getName();
						if (name != null) {
							URI uri = URI.createURI(name).resolve(baseURI);
							try {
								Element importedElement = metaModelManager.loadResource(uri, null, null);				
								environmentView.addElement(name, importedElement);
							} catch (Exception e) {
								// if it doesn't load just treat it as unresolved
							}
						}
                	}
            	}
			}
		}
		if (environmentView.accepts(PivotPackage.Literals.PRECEDENCE)) {
			if (pivotPackage != null) {
				environmentView.addNamedElements(metaModelManager.getPrecedences(pivotPackage));		// Overrides imports
			}
		}
		return null;
	}
}
