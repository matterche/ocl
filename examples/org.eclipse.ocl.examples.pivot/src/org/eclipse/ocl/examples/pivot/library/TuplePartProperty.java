/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: TuplePartProperty.java,v 1.1 2011/04/27 06:19:59 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.library;

import org.eclipse.ocl.examples.domain.elements.DomainProperty;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractProperty;
import org.eclipse.ocl.examples.domain.library.LibraryFeature;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.TupleValue;
import org.eclipse.ocl.examples.domain.values.Value;

public class TuplePartProperty extends AbstractProperty
{
	public static final LibraryFeature INSTANCE = new TuplePartProperty();

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, DomainProperty property) throws InvalidValueException {
/*		if (!(sourceValue instanceof TupleValue) || sourceValue.isUndefined()) {
			if (sourceValue.isInvalid()) {
				return sourceValue;
			}
			else {
				ValueFactory valueFactory = evaluationVisitor.getValueFactory();
				return valueFactory.createInvalidValue("non-tuple source");
			}
		} */
		Value resultValue = ((TupleValue)sourceValue).getValue(property);
		return resultValue;		// null is a static type error so no need to diagnose dynamically
	}
}