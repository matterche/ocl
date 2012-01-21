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

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.ocl.examples.domain.elements.DomainEnumeration;
import org.eclipse.ocl.examples.domain.elements.DomainEnumerationLiteral;
import org.eclipse.ocl.examples.domain.utilities.ArrayIterable;
import org.eclipse.ocl.examples.domain.values.ObjectValue;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.executor.ExecutorTypeParameter;

public class EcoreExecutorEnumeration extends EcoreExecutorType implements DomainEnumeration
{
	private EcoreExecutorEnumerationLiteral[] literals = null;

	/**
	 * Construct an executable type descriptor for a known EClassifier.
	 */
	public EcoreExecutorEnumeration(EEnum eEnum, EcoreExecutorPackage evaluationPackage, int flags, ExecutorTypeParameter... typeParameters) {
		super(eEnum, evaluationPackage, flags, typeParameters);
	}

	@Override
	public ObjectValue createInstance(ValueFactory valueFactory) {
		throw new UnsupportedOperationException();
	}

	public final EEnum getEEnum() {
		return (EEnum) eClassifier;
	}

	public EcoreExecutorEnumerationLiteral getEnumerationLiteral(String name) {
		for (EcoreExecutorEnumerationLiteral enumerationLiteral : literals) {
			if (name.equals(enumerationLiteral.getName())) {
				return enumerationLiteral;
			}
		}
		return null;
	}

	public Iterable<? extends DomainEnumerationLiteral> getEnumerationLiterals() {
		return new ArrayIterable<EcoreExecutorEnumerationLiteral>(literals);
	}
	
	public EcoreExecutorEnumeration initLiterals(EcoreExecutorEnumerationLiteral[] literals) {
		assert this.literals == null;
		this.literals = literals;
		return this;
	}
}
