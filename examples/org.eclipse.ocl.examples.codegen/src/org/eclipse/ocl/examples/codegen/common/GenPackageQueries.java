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

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenOperation;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.examples.library.LibraryConstants;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibPackage;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Feature;
import org.eclipse.ocl.examples.pivot.Library;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.PivotConstants;
import org.eclipse.ocl.examples.pivot.PrimitiveType;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.ecore.Ecore2Pivot;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceSetAdapter;
import org.eclipse.ocl.examples.pivot.manager.TypeServer;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;

public class GenPackageQueries
{		
	public Type getAnotherType(GenPackage genPackage, Type type) {
		MetaModelManager metaModelManager = getMetaModelManager(genPackage);
		Type primaryType = metaModelManager.getPrimaryType(type);
		return primaryType;
	}
	
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
			String clsName = genClass.getEcoreClass().getName();
			if (name.equals(clsName)) {
				return genClass;
			}
		}
		return null;
	}
	
	public GenFeature getGenFeature(GenPackage genPackage, GenClass genClass, Property property) {
		String name = property.getName();
		for (GenFeature genFeature : genClass.getGenFeatures()) {
			String featureName = genFeature.getEcoreFeature().getName();
			if (name.equals(featureName)) {
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
	
	public GenPackage getGenPackage(GenPackage genPackage, org.eclipse.ocl.examples.pivot.Package pivotPackage) {
//		org.eclipse.ocl.examples.pivot.Package pivotPackage = pivotType.getPackage();
		if (pivotPackage == null) {
			return genPackage;	// FIXME
		}
		EPackage firstEPackage = genPackage.getEcorePackage();
		if (firstEPackage.getName().equals(pivotPackage.getName())) {
			return genPackage;
		}
		GenModel genModel = genPackage.getGenModel();
		List<GenPackage> usedGenPackages = genModel.getUsedGenPackages();
//		String nsURI = pivotPackage.getNsURI();
//		String name = pivotType.getName();
//		GenPackage usedGenPackage = getNsURIGenPackage(usedGenPackages, nsURI, name);
//		if (usedGenPackage != null) {
//			return usedGenPackage;
//		}		
		Resource genModelResource = genPackage.eResource();
		ResourceSet genModelResourceSet = genModelResource.getResourceSet();
		MetaModelManager metaModelManager = getMetaModelManager(genPackage);
		org.eclipse.ocl.examples.pivot.Package metaModelPackage = metaModelManager.getPivotMetaModel();
		org.eclipse.ocl.examples.pivot.Package libraryPackage = metaModelManager.getLibraries().get(0);
		if (pivotPackage == libraryPackage) {
			GenPackage libraryGenPackage = getLibraryGenPackage(usedGenPackages);
			if (libraryGenPackage == null) {
				libraryGenPackage = loadGenPackage(genModelResourceSet, LibraryConstants.GEN_MODEL_URI);
			}
			return libraryGenPackage;
		}
		if (pivotPackage == metaModelPackage) {
			GenPackage metaModelGenPackage = getMetaModelGenPackage(usedGenPackages);
			if (metaModelGenPackage == null) {
				metaModelGenPackage = loadGenPackage(genModelResourceSet, PivotConstants.GEN_MODEL_URI);
			}
			return metaModelGenPackage;
		}
		return genPackage;	// FIXME
	}

	protected MetaModelManager getMetaModelManager(GenPackage genPackage) {
		Resource genModelResource = genPackage.eResource();
		ResourceSet genModelResourceSet = genModelResource.getResourceSet();
		MetaModelManagerResourceSetAdapter resourceSetAdapter = MetaModelManagerResourceSetAdapter.getAdapter(genModelResourceSet, null);
		MetaModelManager metaModelManager = resourceSetAdapter.getMetaModelManager();
		return metaModelManager;
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

/*	private <T extends GenPackage> T getNsURIGenPackage(List<T> genPackages, String nsURI, String name) {
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
	} */
	  protected static boolean isBlank(String string)
	  {
	    return string == null || string.length() == 0;
	  }
	
	public String getOperationID(GenPackage genPackage, Type type, Constraint rule, Boolean diagnosticCode) {
		GenClass genClass = getGenClass(genPackage, type);
		if (genClass != null) {
			String name;
			String prefix = null;
			prefix = UML2GenModelUtil.getInvariantPrefix(genPackage.getGenModel());
			if (rule.isCallable()) {
				name = rule.getName();
			}
			else {
				name = prefix + rule.getName();
			}
			for (GenOperation genOperation : genClass.getGenOperations()) {
				String opName = genOperation.getEcoreOperation().getName();
				if (name.equals(opName)) {
					String operationID;
					if (!isBlank(prefix)) {
						String upperCaseOpName = CodeGenUtil.format(genOperation.getName(), '_', prefix, false, false).toUpperCase(); //$NON-NLS-1$
						operationID = genClass.getClassifierID() + "__" + upperCaseOpName; //$NON-NLS-1$
					}
					else {
						operationID = genClass.getOperationID(genOperation, diagnosticCode);
					}
					return operationID;
				}
			}
		}
		return "<<unknown-OperationId>>";
	}
	
	public String getOperationReturnType(GenPackage genPackage, Operation operation) {
		GenClass genClass = getGenClass(genPackage, operation.getOwningType());
		if (genClass != null) {
			GenOperation genOperation = getGenOperation(genPackage, genClass, operation);
			if (genOperation != null) {
				return genOperation.getObjectType(genClass);
			}
		}
		return "";
	}
	
	public org.eclipse.ocl.examples.pivot.Package getPivotPackage(GenPackage genPackage) {
		EPackage ePackage = genPackage.getEcorePackage();
		Resource ecoreResource = ePackage.eResource();
		MetaModelManager metaModelManager = getMetaModelManager(genPackage);
		Ecore2Pivot ecore2Pivot = Ecore2Pivot.getAdapter(ecoreResource, metaModelManager);
		org.eclipse.ocl.examples.pivot.Package pivotPackage = ecore2Pivot.getCreated(org.eclipse.ocl.examples.pivot.Package.class, ePackage);
		if (pivotPackage.getNsURI().equals(OCLstdlibPackage.eNS_URI)) {				// If generating OCLstdlibTables ...
			mergeLibrary(metaModelManager, pivotPackage);
		}
//		else if (pivotPackage.getNsURI().equals(PivotPackage.eNS_URI)) {			// If generating PivotTables ...
//			mergeLibrary(metaModelManager, pivotPackage);
//		}
//		else if (pivotPackage.getNsURI().equals(OCLPackage.eNS_URI)) {
//			mergeLibrary(metaModelManager, pivotPackage);
//		}
//		else if (pivotPackage.getNsURI().equals(OCLPackage.eNS_URI + ".oclstdlib")) {
//			mergeLibrary(metaModelManager, pivotPackage);
//		}
		return pivotPackage;
	}
	
	public String getPropertyType(GenPackage genPackage, Property property) {
		GenClass genClass = getGenClass(genPackage, property.getOwningType());
		if (genClass != null) {
			GenFeature genFeature = getGenFeature(genPackage, genClass, property);
			if (genFeature != null) {
				return genFeature.getObjectType(genClass);
			}
		}
		return "";
	}
	
	public String getQualifyingPackage(GenPackage genPackage, Type type) {
		GenPackage genPackage2 = getGenPackage(genPackage, type.getPackage());
		return genPackage2 != null ? (genPackage2.getQualifiedPackageName() + "." + genPackage2.getPrefix() + "Tables") : "";
	}
	
	public String getQualifiedPackageName(GenPackage genPackage) {
		return genPackage.getQualifiedPackageName();
	}
	
	public String getQualifiedValidatorClassName(GenPackage genPackage) {
		return genPackage.getQualifiedValidatorClassName();
	}

	public String getSharedLibrary(GenPackage genPackage) {
		org.eclipse.ocl.examples.pivot.Package thisPackage = getPivotPackage(genPackage);
		MetaModelManager metaModelManager = getMetaModelManager(genPackage);
		PrimitiveType booleanType = metaModelManager.getBooleanType();
		TypeServer typeServer = metaModelManager.getTypeServer(booleanType);
		for (Type type : typeServer.getTypes()) {
			if (type.getPackage() != thisPackage) {
				GenPackage gPackage = getGenPackage(genPackage, type.getPackage());
				return getInterfacePackageName(gPackage) + "." + gPackage.getPrefix() + "Tables";
			}
		}
		return "";
	}
		
	/**
	 * Return  true if type has another definition counterpart. The Standard Library
	 * providers a base definition for the pivot model.
	 */
	public Boolean hasAnotherType(GenPackage genPackage, Type type) {
		MetaModelManager metaModelManager = getMetaModelManager(genPackage);
		Type primaryType = metaModelManager.getPrimaryType(type);
//		GenClass genClass = getNamedElement1(genPackage.getGenClasses(), type.getName());
//		if (genClass == null) {
			return primaryType != type;
//		}
//		return true;
	}
	
	/**
	 * Return  true if property has an Ecore counterpart. Non-navigable opposites may have a Property
	 * but no Ecore EReference.
	 */
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
	
	/**
	 * Return  true if type has an Ecore counterpart. The Standard Library genmodel has
	 * no Ecore types, unless the Pivot model is also in use.
	 */
	public Boolean hasEcore(GenPackage genPackage, Type type) {
		GenClass genClass = getNamedElement1(genPackage.getGenClasses(), type.getName());
		if (genClass == null) {
			return false;
		}
		return true;
	}

	public Boolean hasSharedLibrary(GenPackage genPackage) {
		org.eclipse.ocl.examples.pivot.Package thisPackage = getPivotPackage(genPackage);
		MetaModelManager metaModelManager = getMetaModelManager(genPackage);
		PrimitiveType booleanType = metaModelManager.getBooleanType();
		TypeServer typeServer = metaModelManager.getTypeServer(booleanType);
		boolean gotThatPackage = false;
		boolean gotThisPackage = false;
		for (Type type : typeServer.getTypes()) {
			if (type.getPackage() == thisPackage) {
				gotThisPackage = true;
			}
			else {
				gotThatPackage = true;
			}
		}
		return gotThisPackage && gotThatPackage;
	}

	private GenPackage loadGenPackage(ResourceSet resourceSet, URI genModelURI) {
		Resource resource = resourceSet.getResource(genModelURI, true);
		GenModel genModel = (GenModel) resource.getContents().get(0);
		return genModel.getGenPackages().get(0);
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
