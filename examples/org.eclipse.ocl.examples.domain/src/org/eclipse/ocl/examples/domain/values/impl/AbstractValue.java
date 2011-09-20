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
 * $Id: AbstractValue.java,v 1.5 2011/05/07 16:41:18 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.values.impl;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.domain.elements.DomainElement;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.values.BagValue;
import org.eclipse.ocl.examples.domain.values.BooleanValue;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.ElementValue;
import org.eclipse.ocl.examples.domain.values.IntegerValue;
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

public abstract class AbstractValue implements Value
{
	protected final ValueFactory valueFactory;

	protected AbstractValue(ValueFactory valueFactory) {
		this.valueFactory = valueFactory;
	}

	public BagValue asBagValue() throws InvalidValueException {
		return valueFactory.throwInvalidValueException(EvaluatorMessages.TypedValueRequired, "Bag");
	}

	public boolean asBoolean() throws InvalidValueException {
		valueFactory.throwInvalidValueException(EvaluatorMessages.TypedValueRequired, "Boolean");
		return false;
	}

	public BooleanValue asBooleanValue() throws InvalidValueException {
		return valueFactory.throwInvalidValueException(EvaluatorMessages.TypedValueRequired, "Boolean");
	}

	public CollectionValue asCollectionValue() throws InvalidValueException {
		return valueFactory.throwInvalidValueException(EvaluatorMessages.TypedValueRequired, "Collection");
	}

	public Double asDouble() throws InvalidValueException {
		valueFactory.throwInvalidValueException(EvaluatorMessages.TypedValueRequired, "Double");
		return null;
	}

	public DomainElement asElement() {
		return null;
	}

	public ElementValue asElementValue() throws InvalidValueException {
		return valueFactory.throwInvalidValueException(EvaluatorMessages.TypedValueRequired, "Element");
	}

	public Integer asInteger() throws InvalidValueException {
		valueFactory.throwInvalidValueException(EvaluatorMessages.TypedValueRequired, "Integer");
		return null;
	}

	public IntegerValue asIntegerValue() throws InvalidValueException {
		return valueFactory.throwInvalidValueException(EvaluatorMessages.TypedValueRequired, "Integer");
	}

	public EObject asNavigableObject() throws InvalidValueException {
		Object object = asObject();
		if (object instanceof EObject) {
			return (EObject) object;
		}
		else {
			return (EObject) valueFactory.throwInvalidValueException(EvaluatorMessages.TypedValueRequired, "Object");
		}
	}

	public ObjectValue asObjectValue() throws InvalidValueException {
		return valueFactory.throwInvalidValueException(EvaluatorMessages.TypedValueRequired, "Object");
	}

	public OrderedCollectionValue asOrderedCollectionValue() throws InvalidValueException {
		return valueFactory.throwInvalidValueException(EvaluatorMessages.TypedValueRequired, "Ordered Collection");
	}

	public OrderedSetValue asOrderedSetValue() throws InvalidValueException {
		return valueFactory.throwInvalidValueException(EvaluatorMessages.TypedValueRequired, "OrderedSet");
	}

	public RealValue asRealValue() throws InvalidValueException {
		return valueFactory.throwInvalidValueException(EvaluatorMessages.TypedValueRequired, "Real");
	}

	public SequenceValue asSequenceValue() throws InvalidValueException {
		return valueFactory.throwInvalidValueException(EvaluatorMessages.TypedValueRequired, "Sequence");
	}

	public SetValue asSetValue() throws InvalidValueException {
		return valueFactory.throwInvalidValueException(EvaluatorMessages.TypedValueRequired, "Set");
	}

	public String asString() throws InvalidValueException {
		valueFactory.throwInvalidValueException(EvaluatorMessages.TypedValueRequired, "String");
		return null;
	}

	public StringValue asStringValue() throws InvalidValueException {
		return valueFactory.throwInvalidValueException(EvaluatorMessages.TypedValueRequired, "String");
	}

	public TypeValue asTypeValue() throws InvalidValueException {
		return valueFactory.throwInvalidValueException(EvaluatorMessages.TypedValueRequired, "Type");
	}

	public UniqueCollectionValue asUniqueCollectionValue() throws InvalidValueException {
		return valueFactory.throwInvalidValueException(EvaluatorMessages.TypedValueRequired, "Unique Collection");
	}
	
	public ValueFactory getValueFactory() {
		return valueFactory;
	}

	public CollectionValue isCollectionValue() {
		return null;
	}

	public boolean isFalse() {
		return false;
	}

	public IntegerValue isIntegerValue() {
		return null;
	}

	public boolean isInvalid() {
		return false;
	}

	public boolean isNull() {
		return false;
	}

	public RealValue isRealValue() {
		return null;
	}

	public boolean isTrue() {
		return false;
	}

	public boolean isUndefined() {
		return false;
	}

	public boolean isUnlimited() {
		return false;
	}
	
	public boolean isUnlimitedNatural() {
		return false;
	}

	public String oclToString() {
		return toString();
	}

	public IntegerValue toIntegerValue() throws InvalidValueException {
		return valueFactory.throwInvalidValueException(EvaluatorMessages.ConvertibleValueRequired, "Integer");
	}
	
	public Iterator<Value> toIteratorValue() throws InvalidValueException {
		valueFactory.throwInvalidValueException(EvaluatorMessages.ConvertibleValueRequired, "Integer");
		return null;
	}

	public RealValue toRealValue() throws InvalidValueException {
		return valueFactory.throwInvalidValueException(EvaluatorMessages.ConvertibleValueRequired, "Real");
	}

	public void toString(StringBuffer s, int sizeLimit) {
		s.append(toString());
	}
}
