/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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
 * $Id$
 */
package org.eclipse.ocl.examples.codegen.common;

import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.examples.library.LibraryConstants;
import org.eclipse.ocl.examples.pivot.PivotConstants;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceSetAdapter;

public class GenPackageQueries
{	
	public GenPackage getGenPackage(GenPackage genPackage, Type pivotType, org.eclipse.ocl.examples.pivot.Package scope) {
		org.eclipse.ocl.examples.pivot.Package pivotPackage = pivotType.getPackage();
		if (pivotPackage == null) {
			return genPackage;	// FIXME
		}
		EPackage firstEPackage = genPackage.getEcorePackage();
		if (firstEPackage.getName().equals(pivotPackage.getName())) {
			return genPackage;
		}
		GenModel genModel = genPackage.getGenModel();
		List<GenPackage> usedGenPackages = genModel.getUsedGenPackages();
		String nsURI = pivotPackage.getNsURI();
		String name = pivotType.getName();
		GenPackage usedGenPackage = getNsURIGenPackage(usedGenPackages, nsURI, name);
		if (usedGenPackage != null) {
			return usedGenPackage;
		}		
		Resource resource = firstEPackage.eResource();
		ResourceSet resourceSet = resource.getResourceSet();
		MetaModelManagerResourceSetAdapter resourceSetAdapter = MetaModelManagerResourceSetAdapter.getAdapter(resourceSet, null);
		MetaModelManager metaModelManager = resourceSetAdapter.getMetaModelManager();
		org.eclipse.ocl.examples.pivot.Package metaModelPackage = metaModelManager.getPivotMetaModel();
		org.eclipse.ocl.examples.pivot.Package libraryPackage = metaModelManager.getLibraries().get(0);
		if (pivotPackage == libraryPackage) {
			GenPackage libraryGenPackage = getLibraryGenPackage(usedGenPackages);
			if (libraryGenPackage == null) {
				libraryGenPackage = loadGenPackage(resourceSet, LibraryConstants.GEN_MODEL_URI);
			}
			return libraryGenPackage;
		}
		if (pivotPackage == metaModelPackage) {
			GenPackage metaModelGenPackage = getMetaModelGenPackage(usedGenPackages);
			if (metaModelGenPackage == null) {
				metaModelGenPackage = loadGenPackage(resourceSet, PivotConstants.GEN_MODEL_URI);
			}
			return metaModelGenPackage;
		}
		return genPackage;	// FIXME
	}

	private <T extends GenPackage> T getLibraryGenPackage(List<T> genPackages) {
		for (T genPackage : genPackages) {
			EPackage ecorePackage = genPackage.getEcorePackage();
			EClassifier eClassifier = ecorePackage.getEClassifier("_Dummy");		// FIXME
			if (eClassifier != null) {
				return genPackage;
			}
		}		
		return null;
	}

	private <T extends GenPackage> T getMetaModelGenPackage(List<T> genPackages) {
		for (T genPackage : genPackages) {
			EPackage ecorePackage = genPackage.getEcorePackage();
			EClassifier eClassifier = ecorePackage.getEClassifier("Element");
			if (eClassifier != null) {
				return genPackage;
			}
		}		
		return null;
	}

	private <T extends GenPackage> T getNsURIGenPackage(List<T> genPackages, String nsURI, String name) {
		for (T genPackage : genPackages) {
			EPackage ecorePackage = genPackage.getEcorePackage();
			if (ecorePackage.getNsURI().equals(nsURI)) {
				EClassifier eClassifier = ecorePackage.getEClassifier(name);
				if (eClassifier != null) {
					return genPackage;
				}
			}
		}		
		return null;
	}

	private GenPackage loadGenPackage(ResourceSet resourceSet, URI genModelURI) {
		Resource resource = resourceSet.getResource(genModelURI, true);
		GenModel genModel = (GenModel) resource.getContents().get(0);
		return genModel.getGenPackages().get(0);
	}
}
