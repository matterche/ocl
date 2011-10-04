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

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenOperation;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.examples.library.LibraryConstants;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Feature;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.PivotConstants;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceSetAdapter;

public class GenPackageQueries
{		
	public String getCopyright(GenPackage genPackage, String indentation) {
		return genPackage.getCopyright(indentation);
	}

	public String getEcorePackageName(GenPackage genPackage) {
		return genPackage.getEcorePackage().getName();	// Workaround for Acceleo URI resolution bug
	}
	
	public String getFeatureTypeCast(GenPackage genPackage, Feature typedElement) {
		return "(" + typedElement.getClass().getSimpleName() + ")";
	}
	
	public GenClass getGenClass(GenPackage genPackage, Type type) {
		String name = type.getName();
		for (GenClass genClass : genPackage.getGenClasses()) {
			if (name.equals(genClass.getName())) {
				return genClass;
			}
		}
		return null;
	}
	
	public GenFeature getGenFeature(GenPackage genPackage, GenClass genClass, Property property) {
		String name = property.getName();
		for (GenFeature genFeature : genClass.getGenFeatures()) {
			if (name.equals(genFeature.getName())) {
				return genFeature;
			}
		}
		return null;
	}
	
	public GenOperation getGenOperation(GenPackage genPackage, GenClass genClass, Operation operation) {
		String name = operation.getName();
		for (GenOperation genOperation : genClass.getGenOperations()) {
			if (name.equals(genOperation.getName())) {
				return genOperation;		// FIXME signatures
			}
		}
		return null;
	}
	
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
	
	public String getInterfacePackageName(GenPackage genPackage) {
		return genPackage.getInterfacePackageName();
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

	private <T extends GenClassifier> T getNamedElement1(List<T> genClasses, String name) {
		for (T genClass : genClasses) {
			if (genClass.getName().equals(name)) {
				return genClass;
			}
		}
		return null;
	}

	private <T extends GenFeature> T getNamedElement2(List<T> genClasses, String name) {
		for (T genClass : genClasses) {
			if (genClass.getName().equals(name)) {
				return genClass;
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
	
	public String getOperationID(GenPackage genPackage, Type type, Constraint rule, Boolean diagnosticCode) {
		GenClass genClass = getGenClass(genPackage, type);
		if (genClass != null) {
			String name = rule.isCallable() ? rule.getName() : ("invariant_" + rule.getName());
			for (GenOperation genOperation : genClass.getGenOperations()) {
				if (name.equals(genOperation.getName())) {
					return genClass.getOperationID(genOperation, diagnosticCode);
				}
			}
		}
		return "";
	}
	
	public String getOperationReturnType(GenPackage genPackage, Operation operation) {
		GenClass genClass = getGenClass(genPackage, operation.getOwningType());
		if (genClass != null) {
			GenOperation genOperation = getGenOperation(genPackage, genClass, operation);
			if (genOperation != null) {
				return "(" + genOperation.getObjectType(genClass) + ")";
			}
		}
		return "";
	}
	
	public String getPropertyType(GenPackage genPackage, Property property) {
		GenClass genClass = getGenClass(genPackage, property.getOwningType());
		if (genClass != null) {
			GenFeature genFeature = getGenFeature(genPackage, genClass, property);
			if (genFeature != null) {
				return "(" + genFeature.getObjectType(genClass) + ")";
			}
		}
		return "";
	}
	
	public String getQualifiedPackageName(GenPackage genPackage) {
		return genPackage.getQualifiedPackageName();
	}
	
	public String getQualifiedValidatorClassName(GenPackage genPackage) {
		return genPackage.getQualifiedValidatorClassName();
	}
	
	public Boolean hasEcore(GenPackage genPackage, Property property) {
		GenClass genClass = getNamedElement1(genPackage.getGenClasses(), property.getOwningType().getName());
		if (genClass == null) {
			return false;
		}
		GenFeature genFeature = getNamedElement2(genClass.getAllGenFeatures(), property.getName());
		if (genFeature == null) {
			return false;
		}
		return true;
	}

	private GenPackage loadGenPackage(ResourceSet resourceSet, URI genModelURI) {
		Resource resource = resourceSet.getResource(genModelURI, true);
		GenModel genModel = (GenModel) resource.getContents().get(0);
		return genModel.getGenPackages().get(0);
	}
}
