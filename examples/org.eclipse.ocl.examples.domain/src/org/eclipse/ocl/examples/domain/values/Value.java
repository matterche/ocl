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
 * $Id: Value.java,v 1.6 2011/05/07 16:41:16 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.values;


import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.domain.elements.DomainElement;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;

/**
 * asXXX returns an XXX if self is an XXX and not Null (and is not Invalid),
 * Null (and Invalid) throw an InvalidValueException.
 * 
 * isXXX returns an XXX-related value if self is an XXX and is not Null (and is not Invalid).
 * 
 * toXXX returns an XXX if self is or can be converted to an XXX; Invalid otherwise.
 */
public interface Value
{	
	public static final String INVALID_NAME = "invalid";

	BagValue asBagValue() throws InvalidValueException;
	boolean asBoolean() throws InvalidValueException;
	BooleanValue asBooleanValue() throws InvalidValueException;
	CollectionValue asCollectionValue() throws InvalidValueException;
	Double asDouble() throws InvalidValueException;
	
	/**
	 * Return the Ecore representation of this value.
	 */
	Object asEcoreObject();

	DomainElement asElement(); 
	ElementValue asElementValue() throws InvalidValueException;
	Integer asInteger() throws InvalidValueException;
	IntegerValue asIntegerValue() throws InvalidValueException;
	EObject asNavigableObject() throws InvalidValueException;
	Object asObject();
	ObjectValue asObjectValue() throws InvalidValueException;
	OrderedSetValue asOrderedSetValue() throws InvalidValueException;
	RealValue asRealValue() throws InvalidValueException;
	SequenceValue asSequenceValue() throws InvalidValueException;
	SetValue asSetValue() throws InvalidValueException;
	String asString() throws InvalidValueException;
	StringValue asStringValue() throws InvalidValueException;
	TypeValue asTypeValue() throws InvalidValueException;
	UniqueCollectionValue asUniqueCollectionValue() throws InvalidValueException;
	Value asValidValue() throws InvalidValueException;
	
	/**
	 * Return the type of this value determined from its content. In the case of collections
	 * this may differ from the constructed type. The actual type is used for validating
	 * oclAsType conversions.
	 */
	DomainType getActualType();

	/**
	 * 
	 * Return the type of this value determined from its construction context. In the case of collections
	 * this may differ from the actual type.
	 */
	DomainType getType();
	ValueFactory getValueFactory();	
	CollectionValue isCollectionValue();
	boolean isFalse();
	IntegerValue isIntegerValue();
	boolean isInvalid();
	boolean isNull();
	RealValue isRealValue();
	boolean isTrue();
	boolean isUndefined();
	boolean isUnlimited();
	boolean isUnlimitedNatural();

	String oclToString();

	IntegerValue toIntegerValue() throws InvalidValueException;
	Iterator<Value> toIteratorValue() throws InvalidValueException;
	RealValue toRealValue() throws InvalidValueException;
	void toString(StringBuilder s, int sizeLimit);
}
