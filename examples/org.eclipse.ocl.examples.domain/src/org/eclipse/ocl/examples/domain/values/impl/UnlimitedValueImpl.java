/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
 * $Id: UnlimitedValueImpl.java,v 1.5 2011/05/07 16:41:16 ewillink Exp $
 */
/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
 * $Id: UnlimitedValueImpl.java,v 1.5 2011/05/07 16:41:16 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.values.impl;

import java.math.BigDecimal;

import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.values.NumericValue;
import org.eclipse.ocl.examples.domain.values.UnlimitedValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public class UnlimitedValueImpl extends AbstractValue implements UnlimitedValue
{
	public UnlimitedValueImpl(ValueFactory valueFactory) {
		super(valueFactory);
	}

	public UnlimitedValueImpl abs() {
		return this;
	}

	public Object asObject() {
		return this;
	}

	public Value asValidValue() {
		return this;
	}

	public BigDecimal bigDecimalValue() {
		return null;
//		throw new UnsupportedOperationException(getClass().getName()+ ".bigDecimalValue");
//		return BigDecimal.valueOf(Double.POSITIVE_INFINITY);
	}

	public int compareTo(NumericValue o) {
		throw new UnsupportedOperationException(getClass().getName()+ ".compareTo");
	}

	public double doubleValue() {
		throw new UnsupportedOperationException(getClass().getName()+ ".doubleValue");
	}

	public DomainType getType() {
		return valueFactory.getStandardLibrary().getUnlimitedNaturalType();
	}

	@Override
	public boolean isUnlimited() {
		return true;
	}

	@Override
	public boolean isUnlimitedNatural() {
		return true;
	}

	public UnlimitedValue negate() throws InvalidValueException {
		valueFactory.throwInvalidValueException(EvaluatorMessages.InvalidOperation, "negate", "UnlimitedValue");
		return null;
	}

	public int signum() {
		return 1;
	}

	@Override
	public String toString() {
		return "*";
	}

//	public <T extends NumericValue> T toValue(Class<T> numericClass) {
//		if (numericClass == UnlimitedValueImpl.class) {
//			return (T) this;
//		}
//		return (T) ValueUtils.createInvalidValue(numericClass, null, "unsupported UnlimitedValue", null);
//	}
}
