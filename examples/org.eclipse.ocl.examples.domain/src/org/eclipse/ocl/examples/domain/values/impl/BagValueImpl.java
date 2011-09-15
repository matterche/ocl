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
 * $Id: BagValueImpl.java,v 1.5 2011/05/07 16:41:20 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.values.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.types.DomainCollectionType;
import org.eclipse.ocl.examples.domain.values.Bag;
import org.eclipse.ocl.examples.domain.values.BagValue;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.IntegerValue;
import org.eclipse.ocl.examples.domain.values.OrderedCollectionValue;
import org.eclipse.ocl.examples.domain.values.SequenceValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public class BagValueImpl
	extends AbstractCollectionValue<Bag<Value>>
	implements BagValue
{
    public static BagValue intersection(ValueFactory valueFactory, DomainCollectionType type, CollectionValue left, CollectionValue right) throws InvalidValueException
    {
    	assert !left.isUndefined() && !right.isUndefined();
		Collection<Value> leftElements = left.asCollection();
        Collection<Value> rightElements = right.asCollection();
        int leftSize = leftElements.size();
        int rightSize = rightElements.size();
    	if ((leftSize == 0) || (rightSize == 0)) {
            return new BagValueImpl(valueFactory, type);
        }    	
        Bag<Value> results = new BagImpl<Value>();
        // loop over the smaller collection and add only elements
        // that are in the larger collection
        Set<Value> minElements = new HashSet<Value>(leftSize < rightSize ? leftElements : rightElements);
        for (Value e : minElements) {
        	IntegerValue leftCount = left.count(e);
        	IntegerValue rightCount = right.count(e);
        	for (int i = Math.min(leftCount.asInteger(), rightCount.asInteger()); i > 0; i--) {
        		results.add(e);
        	}
        }
    	return results.size() > 0 ? new BagValueImpl(valueFactory, type, results) : new BagValueImpl(valueFactory, type);
    }

    public static BagValue union(ValueFactory valueFactory, DomainCollectionType type, CollectionValue left, CollectionValue right) throws InvalidValueException {
    	assert !left.isUndefined() && !right.isUndefined();
		Collection<Value> leftElements = left.asCollection();
        Collection<Value> rightElements = right.asCollection();
    	if (leftElements.isEmpty()) {
            return right.asBagValue();
        }
    	else if (rightElements.isEmpty()) {
            return left.asBagValue();
        }    	
    	else {
			Bag<Value> result = new BagImpl<Value>(leftElements);
			result.addAll(rightElements);
    		return new BagValueImpl(valueFactory, type, result);
        } 
    }
	
	public static class Accumulator extends BagValueImpl implements CollectionValue.Accumulator
	{
		public Accumulator(ValueFactory valueFactory, DomainCollectionType type) {
			super(valueFactory, type);
		}

		public boolean add(Value value) {
			return elements.add(value);			
		}		
	}
	
	public BagValueImpl(ValueFactory valueFactory, DomainCollectionType type, Value... elements) {
		super(valueFactory, type, new BagImpl<Value>());
		if (elements != null) {
			for (Value element : elements) {
				this.elements.add(element);
			}
		}
	}

	public BagValueImpl(ValueFactory valueFactory, DomainCollectionType type, Collection<? extends Value> elements) {
		super(valueFactory, type, new BagImpl<Value>(elements));
	}

//	public BagValue(CollectionValue c) {
//		this(c.asCollection());
//	}

	public BagValueImpl(ValueFactory valueFactory, DomainCollectionType type, Bag<Value> elements) {
		super(valueFactory, type, elements);
	}

    @Override
	public BagValue asBagValue() {
        return this;
    }

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof BagValueImpl)) {
			return false;
		}
		return elements.equals(((BagValueImpl)obj).elements);
	}

	public BagValue excluding(Value value) {
		Bag<Value> result = new BagImpl<Value>();
		for (Value element : elements) {
			if (!element.equals(value)) {
				result.add(element);
			}
		}
		if (result.size() < elements.size()) {
			return new BagValueImpl(valueFactory, getCollectionType(), result);
		}
		else {
			return this;
		}
	}

    public BagValue flatten() throws InvalidValueException {
    	Bag<Value> flattened = new BagImpl<Value>();
    	if (flatten(flattened)) {
    		return new BagValueImpl(valueFactory, getCollectionType(), flattened);
    	}
    	else {
    		return this;
    	}
    }
	
	public String getKind() {
	    return "Bag";
	}

	public BagValue including(Value value) throws InvalidValueException {
		if (value.isInvalid()) {
			valueFactory.throwInvalidValueException(EvaluatorMessages.InvalidSource, "including");
		}
		Bag<Value> result = new BagImpl<Value>(elements);
		result.add(value);
		return new BagValueImpl(valueFactory, getCollectionType(), result);
	}
	   
    public SequenceValue sort(Comparator<Value> comparator) {
    	List<Value> values = new ArrayList<Value>(elements);
    	Collections.sort(values, comparator);
    	return new SequenceValueImpl(valueFactory, getSequenceType(), values);
    }
    
	public OrderedCollectionValue toOrderedCollectionValue() {
		return new SequenceValueImpl(valueFactory, getSequenceType(), elements);
	}

	@Override
	public void toString(StringBuffer s, int lengthLimit) {
		s.append("Bag");
		super.toString(s, lengthLimit);
	}
}
