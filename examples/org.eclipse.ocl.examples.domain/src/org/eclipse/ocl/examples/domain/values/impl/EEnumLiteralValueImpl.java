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
package org.eclipse.ocl.examples.domain.values.impl;

import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.ocl.examples.domain.elements.DomainEnumeration;
import org.eclipse.ocl.examples.domain.elements.DomainEnumerationLiteral;
import org.eclipse.ocl.examples.domain.utilities.DomainUtil;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public class EEnumLiteralValueImpl extends AbstractEnumerationLiteralValueImpl<EEnumLiteral>
{
	protected DomainEnumerationLiteral element = null;	// Lazily computed
	
	public EEnumLiteralValueImpl(ValueFactory valueFactory, EEnumLiteral eEnumLiteral) {
		super(valueFactory, eEnumLiteral);
	}

	public DomainEnumerationLiteral getElement() {
		if (element == null) {
			/*			Enumerator eEnumerator = (Enumerator) eValue;
			EClassifier eEnum = eFeature.getEType();
			org.eclipse.ocl.examples.pivot.Enumeration pivotEnum = ((MetaModelManager)valueFactory.getStandardLibrary()).getPivotOfEcore(org.eclipse.ocl.examples.pivot.Enumeration.class, eEnum);
			EnumerationLiteral pivotEnumLiteral = PivotUtil.getNamedElement(pivotEnum.getOwnedLiterals(), eEnumerator.getName());
			return valueFactory.createEnumerationLiteralValue(pivotEnumLiteral); */
			throw new UnsupportedOperationException();
		}
		return element;
	}

	public String getName() {
		return object.getName();
	}

	public DomainEnumeration getType() {
		if (type == null) {
			this.type = (DomainEnumeration) valueFactory.getStandardLibrary().getType(object.getEEnum());
		}
		return type;
	}

	@Override
	public String toString() {
		return DomainUtil.getLabel(object);
	}
}
