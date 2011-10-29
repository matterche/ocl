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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.examples.domain.elements.DomainClassifierType;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.types.AbstractClassifierType;
import org.eclipse.ocl.examples.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;

public class ExecutorStandardLibrary extends ExecutableStandardLibrary
{
	public static final ExecutorStandardLibrary INSTANCE = new ExecutorStandardLibrary();
	
	private Map<EPackage, EcoreExecutorPackage> packageMap = new HashMap<EPackage, EcoreExecutorPackage>();
	private Map<EClassifier, ExecutorType> typeMap = new HashMap<EClassifier, ExecutorType>();
	
	public ExecutorStandardLibrary(EcoreExecutorPackage... execPackages) {
		OCLstdlibTables.PACKAGE.getClass();
		for (EcoreExecutorPackage execPackage : execPackages) {
			packageMap.put(execPackage.getEPackage(), execPackage);
		}
	}

	@Override
	protected DomainClassifierType createClassiferType(DomainType classType) {
		DomainType anyClassifierType = getAnyClassifierType();
		DomainClassifierType classifierType = new AbstractClassifierType(anyClassifierType.getName(), anyClassifierType, classType);
		return classifierType;
	}

	public EcoreExecutorPackage getPackage(EPackage ePackage) {
		return packageMap.get(ePackage);
	}

	public ExecutorType getType(EClass eClass) {
		ExecutorType type = typeMap.get(eClass);
		if (type == null) {
			EcoreExecutorPackage execPackage = getPackage(eClass.getEPackage());
			if (execPackage != null) {
				type = execPackage.getType(eClass);
				typeMap.put(eClass, type);
			}
		}
		return type;
	}
}
