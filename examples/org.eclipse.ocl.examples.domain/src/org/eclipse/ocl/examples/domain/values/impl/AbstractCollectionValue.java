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
 * $Id: AbstractCollectionValue.java,v 1.7 2011/05/07 16:41:18 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.values.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.ocl.examples.domain.elements.DomainCollectionType;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainTupleType;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.LibraryBinaryOperation;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.values.BagValue;
import org.eclipse.ocl.examples.domain.values.BooleanValue;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.IntegerValue;
import org.eclipse.ocl.examples.domain.values.OrderedSetValue;
import org.eclipse.ocl.examples.domain.values.SequenceValue;
import org.eclipse.ocl.examples.domain.values.SetValue;
import org.eclipse.ocl.examples.domain.values.TupleValue;
import org.eclipse.ocl.examples.domain.values.UniqueCollectionValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public abstract class AbstractCollectionValue<C extends Collection<Value>>
	extends AbstractedCollectionValue
{
	protected final C elements;
	
	protected AbstractCollectionValue(ValueFactory valueFactory, DomainCollectionType type, C elements) {
		super(valueFactory, type);
		this.elements = elements;
		assert elements != null;
	}
	
	/**
	 * Add a value to a working collection, returning true if the working
	 * collection is changed by the addition.
	 * <p>
	 * The default implementation is appropriate for non-unique collections and
	 * must be overridden to support OCL rather than Java uniqueness semantics.
	 */
//	protected boolean add(C values, Value value) {
//		return values.add(value);
//	}

    @Override
    public BagValue asBagValue() {
        return valueFactory.createBagValue(getBagType(), getElements());
    }

	@Override
	public Object asEcoreObject() {
		List<Object> ecoreResult = new BasicEList<Object>(intSize());
		for (Value elementValue : this) {
			ecoreResult.add(elementValue.asEcoreObject());
		}
		return ecoreResult;
	}

    @Override
	public OrderedSetValue asOrderedSetValue() {
        return valueFactory.createOrderedSetValue(getOrderedSetType(), getElements());
    }

    @Override
    public SequenceValue asSequenceValue() {
        return valueFactory.createSequenceValue(getSequenceType(), getElements());
    }

    @Override
    public SetValue asSetValue() {
        return valueFactory.createSetValue(getSetType(), getElements());
    }

    /**
     * Implementation of the OCL
     * <tt>Collection::count(object : T) : Integer</tt>
     * operation.
     * 
     * @param self the source collection
     * @param object an object
     * @return the number of occurrences of the object in the collection
     * @throws InvalidValueException 
     */
    public IntegerValue count(Value value) throws InvalidValueException {
        long count = 0;
        for (Value next : elements) {
            if (next.equals(value)) {
                count++;
            }
        }        
        return valueFactory.integerValueOf(count);
    }

    /**
     * Implementation of the OCL
     * <tt>Collection::excludes(object : T) : Boolean</tt>
     * operation.
     * 
     * @param self the source collection
     * @param object an object
     * @return whether the collection does not include the object
     */
    public BooleanValue excludes(Value value) {
    	return valueFactory.booleanValueOf(!elements.contains(value));
    }

	/**
     * Implementation of the OCL
     * <tt>Collection::excludesAll(c : Collection(T)) : Boolean</tt>
     * operation.
     * 
     * @param self the source collection
     * @param c another collection
     * @return whether the source collection does not contain any of the
     *     elements of the other
     */
    public BooleanValue excludesAll(CollectionValue c) {
        for (Value next : c) {
            if (elements.contains(next)) {
                return valueFactory.getFalse();
            }
        }
        return valueFactory.getTrue();
    }

    /**
     * Returns true if any element flattened.
     * @throws InvalidValueException 
     */
	public boolean flatten(Collection<Value> flattenedElements) throws InvalidValueException {
		boolean flattened = false;
		for (Value element : elements) {
			CollectionValue collectionElement = element.isCollectionValue();
			if (collectionElement != null) {
				flattened = true;
				collectionElement.flatten(flattenedElements);
			}
			else {
				flattenedElements.add(element);
			}
		}
		return flattened;
	}

	public DomainCollectionType getBagType() {
		return valueFactory.getStandardLibrary().getBagType(getElementType());
	}

	public DomainCollectionType getCollectionType() {
		return (DomainCollectionType) getType();
	}

	protected DomainType getElementType() {
		return getCollectionType().getElementType();
	}

	@Override
	protected Collection<Value> getElements() {
		return elements;
	}

	public DomainCollectionType getOrderedSetType() {
		return valueFactory.getStandardLibrary().getOrderedSetType(getElementType());
	}

	public DomainCollectionType getSequenceType() {
		return valueFactory.getStandardLibrary().getSequenceType(getElementType());
	}

	public DomainCollectionType getSetType() {
		return valueFactory.getStandardLibrary().getSetType(getElementType());
	}

	@Override
	public int hashCode() {
		return elements.hashCode();
	}

    public BooleanValue includes(Value value) {
		return valueFactory.booleanValueOf(elements.contains(value));
    }

    /**
     * Implementation of the OCL
     * <tt>Collection::includesAll(c : Collection(T)) : Boolean</tt>
     * operation.
     * 
     * @param self the source collection
     * @param c another collection
     * @return whether the source collection includes all of the elements
     *     of the other
     */
    public BooleanValue includesAll(CollectionValue c) {
    	for (Value next : c) {
    		if (!elements.contains(next)) {
    			return valueFactory.getFalse();
    		}
    	}   	
        return valueFactory.getTrue();
    }

	public int intSize() {
		return elements.size();
	}

	public CollectionValue intersection(CollectionValue c) throws InvalidValueException {
		DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
		if (this instanceof OrderedSetValue) {
            return OrderedSetValueImpl.intersection(valueFactory, standardLibrary.getOrderedSetType(getElementType()), this, c);
        }
        else if (this instanceof SequenceValue && c instanceof UniqueCollectionValue) {
            return OrderedSetValueImpl.intersection(valueFactory, standardLibrary.getOrderedSetType(getElementType()), this, c);
        }
        else if (this instanceof UniqueCollectionValue || c instanceof UniqueCollectionValue) {
            return SetValueImpl.intersection(valueFactory, standardLibrary.getSetType(getElementType()), this, c);
        }
        else {
            return BagValueImpl.intersection(valueFactory, standardLibrary.getBagType(getElementType()), this, c);
        }
	}

	public Iterator<Value> iterator() {
		return elements != null ? elements.iterator() : Collections.<Value>emptyList().iterator();
	}

	public Value maxMin(DomainEvaluator evaluator, DomainType returnType, LibraryBinaryOperation binaryOperation) throws InvalidValueException {
		Value result = null;
        for (Value element : elements) {
        	if (result == null) {
        		result = element;
        	}
        	else {
        		result = binaryOperation.evaluate(evaluator, returnType, result, element);
        		if (result == null) {
                	valueFactory.throwInvalidValueException(EvaluatorMessages.MissingResult, "max/min");
        		}
        		else if (result.isUndefined()) {
                	valueFactory.throwInvalidValueException(EvaluatorMessages.UndefinedResult, "max/min");
        		}
        	}
        }
		if (result == null) {
        	valueFactory.throwInvalidValueException(EvaluatorMessages.EmptyCollection, getKind(), "max/min");
		}
		return result;
    }

    public Set<TupleValue> product(CollectionValue c, DomainTupleType tupleType) {   	
    	Set<TupleValue> result = new HashSet<TupleValue>();		
        for (Value next1 : this) {
        	for (Value next2 : c) {
        		result.add(new TupleValueImpl(valueFactory, tupleType, next1, next2));
        	}
        }
        return result;
    }

	public CollectionValue selectByKind(DomainType requiredElementType) throws InvalidValueException {
    	DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
		boolean changedContents = false;
		Collection<Value> newElements = new ArrayList<Value>();
        for (Value element : elements) {
			if (element.isNull()) {
        		changedContents = true;
			}
			else {
				DomainType elementType = element.getType();
				if (elementType.conformsTo(standardLibrary, requiredElementType)) {
	        		newElements.add(element);
	        	}
	        	else {
	        		changedContents = true;
	        	}
			}
        }
        if (changedContents) {
        	DomainCollectionType collectionType = getType();
        	return valueFactory.createCollectionValue(collectionType.isOrdered(), collectionType.isUnique(), newElements);
        }
        else {
        	return this;
        }
	}

	public CollectionValue selectByType(DomainType requiredElementType) throws InvalidValueException {
    	DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
		boolean changedContents = false;
		Collection<Value> newElements = new ArrayList<Value>();
        for (Value element : elements) {
			DomainType elementType = element.getType();
			if (elementType.isEqualTo(standardLibrary, requiredElementType)) {
        		newElements.add(element);
        	}
        	else {
        		changedContents = true;
        	}
        }
        if (changedContents) {
        	DomainCollectionType collectionType = getType();
        	return valueFactory.createCollectionValue(collectionType.isOrdered(), collectionType.isUnique(), newElements);
        }
        else {
        	return this;
        }
	}

	public Value sum(DomainEvaluator evaluator, DomainType returnType, LibraryBinaryOperation binaryOperation, Value zero) throws InvalidValueException {
		Value result = zero;
        for (Value element : elements) {
        	result = binaryOperation.evaluate(evaluator, returnType, result, element);
        }
        return result;
    }

    public CollectionValue union(CollectionValue c) throws InvalidValueException {
    	if (this instanceof SetValue && c instanceof SetValue) {
            return SetValueImpl.union(valueFactory, getSetType(), this, c);
        }
        else if (this instanceof BagValue || c instanceof BagValue) {
            return BagValueImpl.union(valueFactory, getBagType(), this, c);
        }
        else if (this instanceof OrderedSetValue && c instanceof OrderedSetValue) {
            return OrderedSetValueImpl.union(valueFactory, getOrderedSetType(), this, c);
        }
        else if (this instanceof SequenceValue || c instanceof SequenceValue) {
            return SequenceValueImpl.union(valueFactory, getSequenceType(), this, c);
        }
        else {
            return SetValueImpl.union(valueFactory, getSetType(), this, c);
        }
    }
}
