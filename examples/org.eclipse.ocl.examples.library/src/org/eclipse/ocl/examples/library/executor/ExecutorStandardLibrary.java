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
package org.eclipse.ocl.examples.library.executor;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.examples.domain.elements.DomainClassifierType;
import org.eclipse.ocl.examples.domain.elements.DomainCollectionType;
import org.eclipse.ocl.examples.domain.elements.DomainInheritance;
import org.eclipse.ocl.examples.domain.elements.DomainPackage;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.types.AbstractClassifierType;
import org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager;
import org.eclipse.ocl.examples.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;

public class ExecutorStandardLibrary extends ExecutableStandardLibrary
{
	public static final ExecutorStandardLibrary INSTANCE = new ExecutorStandardLibrary();
	
//	private Map<EPackage, EcoreExecutorPackage> ePackageMap = new HashMap<EPackage, EcoreExecutorPackage>();
	private Map<String, EcoreExecutorPackage> ePackageMap = new HashMap<String, EcoreExecutorPackage>();
	private Map<DomainPackage, DomainReflectivePackage> domainPackageMap = null;
	private Map<EClassifier, ExecutorType> typeMap = new HashMap<EClassifier, ExecutorType>();
//	private Map<Class<?>, DomainEnumeration> enumerationMap = null;
	
	public ExecutorStandardLibrary(EcoreExecutorPackage... execPackages) {
		OCLstdlibTables.PACKAGE.getClass();
		for (EcoreExecutorPackage execPackage : execPackages) {
			addPackage(execPackage);
		}
	}

	public void addPackage(EcoreExecutorPackage execPackage) {
		@SuppressWarnings("unused")
		EcoreExecutorPackage oldExecPackage = ePackageMap.put(execPackage.getNsURI(), execPackage);
//		if ((oldExecPackage != null) && (oldExecPackage != execPackage)) {
//			Iterable<ExecutorType> newTypes = execPackage.getOwnedType();
//			for (DomainType oldType : oldExecPackage.getOwnedType()) {
//				-- check for type compatibility
//			}
//		}
	}

	@Override
	protected DomainClassifierType createClassifierType(DomainType classType) {
		DomainType anyClassifierType = getAnyClassifierType();
		DomainClassifierType classifierType = new AbstractClassifierType(this, anyClassifierType, classType);
		return classifierType;
	}
	
	@Override
	public DomainEvaluator createEvaluator(EObject contextObject, Map<Object, Object> contextMap) {
		return new EcoreExecutorManager(contextObject, contextMap, this);
	}

/*	@Override
	public DomainEnumeration getEnumeration(Enumerator enumerator) {
		Class<?> enumeratorClass = enumerator.getClass();
		String enumerationName = enumeratorClass.getSimpleName();
		if (enumerationMap == null) {
			enumerationMap = new HashMap<Class<?>, DomainEnumeration>();
		}
		else {
			DomainEnumeration enumeration = enumerationMap.get(enumeratorClass);
			if (enumeration != null) {
				return enumeration;
			}
		}
		Package enumeratorPackage = enumeratorClass.getPackage();
		for (EcoreExecutorPackage dPackage : ePackageMap.values()) {
// FIXME			if (OCLstdlibTables.PACKAGE.getNsURI().equals(dPackage.getNsURI())) {	
							ExecutorType type = dPackage.getType(enumerationName);
							if (type != null) {
								enumerationMap.put(enumeratorClass, (DomainEnumeration)type);
								return (DomainEnumeration)type;
							}
//						}
					}
		return super.getEnumeration(enumerator);
	} */

	public DomainInheritance getInheritance(DomainType type) {
		if (type instanceof DomainInheritance) {
			return (DomainInheritance) type;
		}
		if (type instanceof DomainClassifierType) {
			DomainType instanceType = ((DomainClassifierType)type).getInstanceType();
			DomainClassifierType classifierType = getClassifierType(instanceType);
			DomainType containerType = classifierType.getContainerType();
			return containerType.getInheritance(this);
		}
		if (type instanceof DomainCollectionType) {
			DomainType containerType = ((DomainCollectionType)type).getContainerType();
			if ((containerType != null) && (containerType != type)) {
				return containerType.getInheritance(this);
			}
		}
		DomainPackage domainPackage = type.getPackage();
		EcoreExecutorPackage ecoreExecutorPackage = ePackageMap.get(domainPackage.getNsURI());
		if (ecoreExecutorPackage != null) {
			ExecutorType executorType = ecoreExecutorPackage.getType(type.getName());
			if (executorType != null) {
				return executorType;
			}
		}
		if (domainPackageMap == null) {
			domainPackageMap = new HashMap<DomainPackage, DomainReflectivePackage>();
		}
		DomainReflectivePackage domainExecutorPackage = domainPackageMap.get(domainPackage);
		if (domainExecutorPackage == null) {
			domainExecutorPackage = new DomainReflectivePackage(this, domainPackage);
			domainPackageMap.put(domainPackage, domainExecutorPackage);
		}
		return domainExecutorPackage.getInheritance(type);
	}

	public EcoreExecutorPackage getPackage(EPackage ePackage) {
		return ePackageMap.get(ePackage.getNsURI());
	}

	public ExecutorType getOclType(String typeName) {
		for (EcoreExecutorPackage dPackage : ePackageMap.values()) {
// FIXME			if (OCLstdlibTables.PACKAGE.getNsURI().equals(dPackage.getNsURI())) {	
				ExecutorType type = dPackage.getType(typeName);
				if (type != null) {
					return type;
				}
//			}
		}
		return null;
	}

	public ExecutorType getType(EClassifier eClassifier) {
		ExecutorType type = typeMap.get(eClassifier);
		if (type == null) {
			EcoreExecutorPackage execPackage = getPackage(eClassifier.getEPackage());
			if (execPackage != null) {
				type = execPackage.getType(eClassifier.getName());
				typeMap.put(eClassifier, type);
			}
		}
		return type;
	}
}
