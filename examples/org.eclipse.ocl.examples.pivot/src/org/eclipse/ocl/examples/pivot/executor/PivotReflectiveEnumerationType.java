/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.pivot.executor;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.domain.elements.DomainEnumeration;
import org.eclipse.ocl.examples.domain.elements.DomainEnumerationLiteral;
import org.eclipse.ocl.examples.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.examples.library.executor.ExecutorEnumerationLiteral;
import org.eclipse.ocl.examples.pivot.Enumeration;
import org.eclipse.ocl.examples.pivot.EnumerationLiteral;

public class PivotReflectiveEnumerationType extends PivotReflectiveType implements DomainEnumeration
{
	private Map<String, DomainEnumerationLiteral> literals = new HashMap<String, DomainEnumerationLiteral>();
	
	public PivotReflectiveEnumerationType(PivotReflectivePackage executorPackage, Enumeration type) {
		super(executorPackage, type);
		int index = 0;
		EObject eTarget = type.getETarget();
		if (eTarget instanceof EEnum) {
			for (EEnumLiteral eLiteral : ((EEnum)eTarget).getELiterals()) {
				String enumerationLiteralName = eLiteral.getName();
				literals.put(enumerationLiteralName, new EcoreExecutorEnumerationLiteral(eLiteral, this, index++));
			}
		}
		else {
			for (EnumerationLiteral enumerationLiteral : type.getOwnedLiterals()) {
				String enumerationLiteralName = enumerationLiteral.getName();
				literals.put(enumerationLiteralName, new ExecutorEnumerationLiteral(enumerationLiteralName, this, index++));
			}
		}
	}

	public DomainEnumerationLiteral getEnumerationLiteral(String name) {
		return literals.get(name);
	}

	public Iterable<? extends DomainEnumerationLiteral> getEnumerationLiterals() {
		return literals.values();
	}
}
