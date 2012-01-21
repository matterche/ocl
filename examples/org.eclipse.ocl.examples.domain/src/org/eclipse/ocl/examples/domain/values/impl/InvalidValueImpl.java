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
 * $Id: InvalidValueImpl.java,v 1.6 2011/05/07 16:41:18 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.values.impl;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.domain.elements.DomainElement;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.InvalidEvaluationException;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.values.BagValue;
import org.eclipse.ocl.examples.domain.values.BooleanValue;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.ElementValue;
import org.eclipse.ocl.examples.domain.values.IntegerValue;
import org.eclipse.ocl.examples.domain.values.InvalidValue;
import org.eclipse.ocl.examples.domain.values.ObjectValue;
import org.eclipse.ocl.examples.domain.values.OrderedCollectionValue;
import org.eclipse.ocl.examples.domain.values.OrderedSetValue;
import org.eclipse.ocl.examples.domain.values.RealValue;
import org.eclipse.ocl.examples.domain.values.SequenceValue;
import org.eclipse.ocl.examples.domain.values.SetValue;
import org.eclipse.ocl.examples.domain.values.StringValue;
import org.eclipse.ocl.examples.domain.values.TypeValue;
import org.eclipse.ocl.examples.domain.values.UniqueCollectionValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public class InvalidValueImpl extends AbstractUndefinedCollectionValue implements InvalidValue
{	
	protected final InvalidEvaluationException exception;

	public InvalidValueImpl(ValueFactory valueFactory) {
		super(valueFactory);
		this.exception = null;
	}

	public InvalidValueImpl(ValueFactory valueFactory, InvalidEvaluationException exception) {
		super(valueFactory);
		this.exception = exception;
	}

	@Override
	public Object asEcoreObject() {
		if (exception != null) {
			throw exception;
		}
//		throw new RuntimeException();
		return null;
	}

	@Override
	public BagValue asBagValue() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		return super.asBagValue();
	}

	@Override
	public boolean asBoolean() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		return super.asBoolean();
	}

	@Override
	public BooleanValue asBooleanValue() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		return super.asBooleanValue();
	}

	@Override
	public CollectionValue asCollectionValue() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		return super.asCollectionValue();
	}

	@Override
	public Double asDouble() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		return super.asDouble();
	}

	@Override
	public DomainElement asElement() {
		if (exception != null) {
			throw exception;
		}
		return super.asElement();
	}

	@Override
	public ElementValue asElementValue() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		return super.asElementValue();
	}

	@Override
	public Integer asInteger() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		return super.asInteger();
	}

	@Override
	public IntegerValue asIntegerValue() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		return super.asIntegerValue();
	}

	@Override
	public EObject asNavigableObject() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		return super.asNavigableObject();
	}

	@Override
	public ObjectValue asObjectValue() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		return super.asObjectValue();
	}

	@Override
	public OrderedCollectionValue asOrderedCollectionValue() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		return super.asOrderedCollectionValue();
	}

	@Override
	public OrderedSetValue asOrderedSetValue() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		return super.asOrderedSetValue();
	}

	@Override
	public RealValue asRealValue() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		return super.asRealValue();
	}

	@Override
	public SequenceValue asSequenceValue() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		return super.asSequenceValue();
	}

	@Override
	public SetValue asSetValue() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		return super.asSetValue();
	}

	@Override
	public String asString() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		return super.asString();
	}

	@Override
	public StringValue asStringValue() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		return super.asStringValue();
	}

	@Override
	public TypeValue asTypeValue() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		return super.asTypeValue();
	}

	@Override
	public UniqueCollectionValue asUniqueCollectionValue() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		return super.asUniqueCollectionValue();
	}

	public Value asValidValue() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		else {
			valueFactory.throwInvalidValueException(EvaluatorMessages.TypedValueRequired, "valid", getType());
			return null;
		}
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof InvalidValue;
	}
	
	public Exception getException() {
		return exception;
	}

	public DomainType getType() {
		return valueFactory.getStandardLibrary().getOclInvalidType();
	}

	@Override
	public int hashCode() {
		return 0x22222222;
	}

	@Override
	public boolean isInvalid() {
		return true;
	}

	@Override
	public IntegerValue toIntegerValue() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		return super.toIntegerValue();
	}

	@Override
	public Iterator<Value> toIteratorValue() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		return super.toIteratorValue();
	}

	@Override
	public RealValue toRealValue() throws InvalidValueException {
		if (exception != null) {
			throw exception;
		}
		return super.toRealValue();
	}

	@Override
	public String toString() {
//		if (exception != null) {
//			return Value.INVALID_NAME + "<" + exception.getMessage() + ">";
//		}
//		else {
			return Value.INVALID_NAME;
//		}
	}
}
