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
package org.eclipse.ocl.examples.library.ecore;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.examples.library.executor.ExecutorPackage;
import org.eclipse.ocl.examples.library.executor.ExecutorType;

public class EcoreExecutorPackage extends ExecutorPackage
{
	protected final EPackage ePackage;

	public EcoreExecutorPackage(EPackage ePackage) {
		super(ePackage.getName(), ePackage.getNsURI(), null);
		this.ePackage = ePackage;		
	}

	public final EPackage getEPackage() {
		return ePackage;
	}

	public ExecutorType getType(EClass eClass) {		// FIXME put literals in EcoreExecutorType
		String typeName = eClass.getName();
		for (ExecutorType type: getOwnedTypes()) {
			if (type.getName().equals(typeName)) {
				return type;
			}
		}
		return null;
	}
}