/**
 * <copyright>
 *
 * Copyright (c) 2009,2011 E.D.Willink and others.
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
package org.eclipse.ocl.examples.library.enumeration;

import java.util.Set;

import org.eclipse.ocl.examples.domain.elements.DomainCollectionType;
import org.eclipse.ocl.examples.domain.elements.DomainElement;
import org.eclipse.ocl.examples.domain.elements.DomainEnumeration;
import org.eclipse.ocl.examples.domain.elements.DomainProperty;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractProperty;
import org.eclipse.ocl.examples.domain.values.TypeValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.domain.values.impl.OrderedSetImpl;

/**
 * EnumerationClassifierOwnedLiteralProperty realizes the EnumerationClassifier::ownedLiteral() library property.
 */
public class EnumerationClassifierOwnedLiteralProperty extends AbstractProperty
{
	public static final EnumerationClassifierOwnedLiteralProperty INSTANCE = new EnumerationClassifierOwnedLiteralProperty();

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, DomainProperty property) throws InvalidValueException {
		ValueFactory valueFactory = evaluator.getValueFactory();
		TypeValue sourceTypeValue = sourceValue.asTypeValue();
		DomainType sourceType = sourceTypeValue.getInstanceType();
		Set<Value> results = new OrderedSetImpl<Value>();
		for (DomainElement instance : ((DomainEnumeration)sourceType).getEnumerationLiterals()) {
			results.add(valueFactory.valueOf(instance));
		}
		return valueFactory.createOrderedSetValue((DomainCollectionType)returnType, results);
	}
}
