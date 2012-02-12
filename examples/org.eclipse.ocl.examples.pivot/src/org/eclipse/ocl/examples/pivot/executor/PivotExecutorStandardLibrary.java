/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ocl.examples.pivot.executor;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.domain.elements.DomainClassifierType;
import org.eclipse.ocl.examples.domain.elements.DomainCollectionType;
import org.eclipse.ocl.examples.domain.elements.DomainInheritance;
import org.eclipse.ocl.examples.domain.elements.DomainPackage;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.examples.library.executor.ExecutableStandardLibrary;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.examples.pivot.ClassifierType;
import org.eclipse.ocl.examples.pivot.Package;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.PivotTables;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.ecore.Ecore2Pivot;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManageable;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.model.OCLstdlib;

public class PivotExecutorStandardLibrary extends ExecutableStandardLibrary implements MetaModelManageable
{
//	public static final PivotExecutorStandardLibrary INSTANCE = new PivotExecutorStandardLibrary(new MetaModelManager(), OCLstdlib.STDLIB_URI);

	protected final MetaModelManager metaModelManager;
	private Map<DomainType, Type> typeMap = null;
	private Map<DomainPackage, org.eclipse.ocl.examples.pivot.Package> packageMap = null;
	
//	public PivotExecutorStandardLibrary(MetaModelManager metaModelManager, String stdlibURI) {
//		this.metaModelManager = metaModelManager;
//		metaModelManager.setDefaultStandardLibraryURI(stdlibURI);
//		PivotTables.PACKAGE.getClass();
//	}

	public PivotExecutorStandardLibrary(EcoreExecutorPackage... execPackages) {
		OCLstdlibTables.PACKAGE.getClass();
		this.metaModelManager = new MetaModelManager();
		metaModelManager.setDefaultStandardLibraryURI(OCLstdlib.STDLIB_URI);
		PivotTables.PACKAGE.getClass();
	}

	@Override
	protected DomainClassifierType createClassifierType(DomainType typeType) {
		ClassifierType anyClassifierType = getAnyClassifierType();
		ClassifierType classifierType = PivotFactory.eINSTANCE.createClassifierType();
		classifierType.setName(anyClassifierType.getName());
		classifierType.setUnspecializedElement(anyClassifierType);
		classifierType.setInstanceType(getType(typeType));
		return classifierType;
	}
	
	@Override
	public DomainEvaluator createEvaluator(EObject contextObject, Map<Object, Object> contextMap) {
		return new PivotEcoreExecutorManager(contextObject, contextMap, this, metaModelManager);
	}

	protected Package createPackage(DomainPackage domainPackage) {
		org.eclipse.ocl.examples.pivot.Package pivotPackage = PivotFactory.eINSTANCE.createPackage();
		pivotPackage.setName(domainPackage.getName());
		pivotPackage.setNsURI(domainPackage.getNsURI());
		for (DomainType domainType : domainPackage.getOwnedType()) {
			Type pivotType = createType(domainType);
			pivotPackage.getOwnedType().add(pivotType);
		}
		return pivotPackage;
	}

	protected Type createType(DomainType domainType) {
		Type pivotType = PivotFactory.eINSTANCE.createType();
		pivotType.setName(domainType.getName());
		return pivotType;
	}

	@Override
	public ClassifierType getAnyClassifierType() {
		return metaModelManager.getAnyClassifierType();
	}

	public DomainInheritance getInheritance(DomainType type) {
		return metaModelManager.getInheritance(type);
	}

	public MetaModelManager getMetaModelManager() {
		return metaModelManager;
	}

	public DomainType getOclType(String typeName) {
		return PivotTables.PACKAGE.getType(typeName);
	}
	
	protected Type getType(DomainType typeType) {
		if (typeType instanceof DomainCollectionType) {
			DomainCollectionType domainCollectionType = (DomainCollectionType)typeType;
			return metaModelManager.getCollectionType(domainCollectionType.getContainerType(), domainCollectionType.getElementType());
		}
		if (typeMap == null) {
			typeMap = new HashMap<DomainType, Type>();
		}
		else {			
			Type type = typeMap.get(typeType);
			if (type != null) {
				return type;
			}
		}
		if (packageMap == null) {
			packageMap = new HashMap<DomainPackage, org.eclipse.ocl.examples.pivot.Package>();
		}		
		DomainPackage domainPackage = typeType.getPackage();
		org.eclipse.ocl.examples.pivot.Package pivotPackage = packageMap.get(domainPackage);
		if (pivotPackage == null) {
			pivotPackage = metaModelManager.getPrimaryPackage(domainPackage.getNsURI());
			if (pivotPackage == null) {
				pivotPackage = createPackage(domainPackage);
				metaModelManager.addPackage(pivotPackage);
			}
		}
		return metaModelManager.getPrimaryType(pivotPackage, typeType.getName());
	}

	public DomainType getType(EClassifier eClassifier) {
		Ecore2Pivot ecore2Pivot = Ecore2Pivot.getAdapter(eClassifier.eResource(), metaModelManager);
		Type pivotType = ecore2Pivot.getCreated(Type.class, eClassifier);
		return pivotType;
	}
}
