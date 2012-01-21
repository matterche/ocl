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
package org.eclipse.ocl.examples.library.ecore;

import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.ocl.examples.domain.elements.DomainEnumeration;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.library.executor.ExecutorEnumerationLiteral;

public class EcoreExecutorEnumerationLiteral extends ExecutorEnumerationLiteral
{
	protected final EEnumLiteral eEnumLiteral;
	
	public EcoreExecutorEnumerationLiteral(EEnumLiteral eEnumLiteral, DomainEnumeration enumeration, int ordinal) {
		super(eEnumLiteral.getName(), enumeration, ordinal);
		this.eEnumLiteral = eEnumLiteral;
	}

	@Override
	public Object asEcoreObject(DomainStandardLibrary standardLibrary) {
		return eEnumLiteral.getInstance();
	}
}