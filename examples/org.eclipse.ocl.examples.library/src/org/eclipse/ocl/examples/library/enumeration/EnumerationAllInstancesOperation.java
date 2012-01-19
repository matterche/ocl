/**
 * <copyright>
 *
 * Copyright (c) 2009,2010 E.D.Willink and others.
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
 * $Id: EnumerationAllInstancesOperation.java,v 1.4 2011/04/25 09:48:57 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.enumeration;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.ocl.examples.domain.elements.DomainClassifierType;
import org.eclipse.ocl.examples.domain.elements.DomainCollectionType;
import org.eclipse.ocl.examples.domain.elements.DomainElement;
import org.eclipse.ocl.examples.domain.elements.DomainEnumeration;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractUnaryOperation;
import org.eclipse.ocl.examples.domain.values.TypeValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

/**
 * EnumerationAllInstancesOperation realises the Enumeration::allInstances() library operation.
 */
public class EnumerationAllInstancesOperation extends AbstractUnaryOperation
{
	public static final EnumerationAllInstancesOperation INSTANCE = new EnumerationAllInstancesOperation();

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceVal) throws InvalidValueException {
		ValueFactory valueFactory = evaluator.getValueFactory();
		TypeValue sourceTypeValue = sourceVal.asTypeValue();
		DomainType sourceType = sourceTypeValue.getInstanceType();
		Set<Value> results = new HashSet<Value>();
		DomainEnumeration domainEnumeration = sourceType instanceof DomainEnumeration ? (DomainEnumeration)sourceType : (DomainEnumeration)((DomainClassifierType)sourceType).getInstanceType();
		for (DomainElement instance : domainEnumeration.getOwnedLiterals()) {
			results.add(valueFactory.valueOf(instance));
		}
		return valueFactory.createSetValue((DomainCollectionType)returnType, results);
	}
}
