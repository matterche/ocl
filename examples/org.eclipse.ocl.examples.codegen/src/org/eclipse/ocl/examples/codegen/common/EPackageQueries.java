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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibPackage;
import org.eclipse.ocl.examples.pivot.Library;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.ecore.Ecore2Pivot;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceSetAdapter;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

public class EPackageQueries
{	
	public org.eclipse.ocl.examples.pivot.Package getPivotPackage(EPackage ePackage) {
		Resource resource = ePackage.eResource();
		ResourceSet resourceSet = resource.getResourceSet();
		MetaModelManagerResourceSetAdapter resourceSetAdapter = MetaModelManagerResourceSetAdapter.getAdapter(resourceSet, null);
		Ecore2Pivot ecore2Pivot = Ecore2Pivot.getAdapter(resource, resourceSetAdapter.getMetaModelManager());
		org.eclipse.ocl.examples.pivot.Package pivotPackage = ecore2Pivot.getCreated(org.eclipse.ocl.examples.pivot.Package.class, ePackage);
		if (pivotPackage.getNsURI().equals(OCLstdlibPackage.eNS_URI)) {				// If generating OCLstdlibTables ...
			mergeLibrary(resourceSetAdapter.getMetaModelManager(), pivotPackage);
		}
//		else if (pivotPackage.getNsURI().equals(PivotPackage.eNS_URI)) {			// If generating PivotTables ...
//			mergeLibrary(resourceSetAdapter.getMetaModelManager(), pivotPackage);
//		}
//		else if (pivotPackage.getNsURI().equals(OCLPackage.eNS_URI)) {
//			mergeLibrary(resourceSetAdapter.getMetaModelManager(), pivotPackage);
//		}
//		else if (pivotPackage.getNsURI().equals(OCLPackage.eNS_URI + ".oclstdlib")) {
//			mergeLibrary(resourceSetAdapter.getMetaModelManager(), pivotPackage);
//		}
		return pivotPackage;
	}
	
	protected void mergeLibrary(MetaModelManager metaModelManager, org.eclipse.ocl.examples.pivot.Package primaryPackage) {
//		primaryPackage.setName("ocl");
		List<Type> primaryTypes = primaryPackage.getOwnedTypes();
		for (Library library : metaModelManager.getLibraries()) {
			Map<Type,Type> typeMap = new HashMap<Type,Type>();
			ArrayList<Type> libraryTypes = new ArrayList<Type>(library.getOwnedTypes());
			for (Type secondaryType : libraryTypes) {
				Type primaryType = PivotUtil.getNamedElement(primaryTypes, secondaryType.getName());
				if (primaryType != null) {
					typeMap.put(secondaryType, primaryType);
				}
				else {
					primaryTypes.add(secondaryType);
				}
			}
			for (Type secondaryType : libraryTypes) {
				Type primaryType = typeMap.get(secondaryType);
				if (primaryType != null) {
					List<Type> primarySuperClasses = primaryType.getSuperClasses();
					for (Type secondarySuperClass : secondaryType.getSuperClasses()) {
						Type primarySuperClass = typeMap.get(secondarySuperClass);
						if (primarySuperClass == null) {
							primarySuperClasses.add(secondarySuperClass);
						}
						else if (!primarySuperClasses.contains(primarySuperClass)) {
							primarySuperClasses.add(primarySuperClass);
						}
					}
					primaryType.getOwnedOperations().addAll(secondaryType.getOwnedOperations());
					primaryType.getOwnedAttributes().addAll(secondaryType.getOwnedAttributes());
				}
			}
		}
		for (Type primaryType : primaryTypes) {
			if (primaryType instanceof Type) {
				List<Type> primarySuperClasses = primaryType.getSuperClasses();
				Type classType = PivotUtil.getNamedElement(primarySuperClasses, "Class");
				Type classifierType = PivotUtil.getNamedElement(primarySuperClasses, "Classifier");
				if ((classType != null) && (classifierType != null)) {
					primarySuperClasses.remove(classType);		// WIP FIXME fix at source
				}
			}
		}
	}  
}
