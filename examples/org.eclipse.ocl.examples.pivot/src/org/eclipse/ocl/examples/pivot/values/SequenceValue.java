/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: SequenceValue.java,v 1.1.2.1 2010/12/23 19:25:10 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SequenceValue
	extends AbstractCollectionValue<List<Value>>
	implements OrderedCollectionValue, NonUniqueCollectionValue
{
    public static SequenceValue union(CollectionValue left, CollectionValue right) {
    	if (left.isEmpty()) {
            return right.asSequenceValue();
        }
    	if (right.isEmpty()) {
            return left.asSequenceValue();
        }    	
    	List<Value> result = new ArrayList<Value>(left.asCollection());
        result.addAll(right.asCollection());
		return new SequenceValue(result);
    }
	
	public static class Accumulator extends SequenceValue implements CollectionValue.Accumulator
	{
		public boolean add(Value value) {
			return elements.add(value);			
		}		
	}
    
	public SequenceValue(Value... elements) {
		super(new ArrayList<Value>());
		if (elements != null) {
			for (Value element : elements) {
				this.elements.add(element);
			}
		}
		if (!isValid(elements)) {
			elements = null;
		}
	}

	public SequenceValue(Collection<? extends Value> elements) {
		super(new ArrayList<Value>(elements));
	}

	public SequenceValue(List<Value> elements) {
		super(elements);
	}
	
	@Override
	public List<Value> asList() {
		return elements != null ? elements : Collections.<Value>emptyList();
	}

	@Override
	public OrderedCollectionValue asOrderedCollectionValue() {
		return this;
	}

    @Override
	public SequenceValue asSequenceValue() {
        return this;
    }

    public SequenceValue append(Value object) {
    	List<Value> result = new ArrayList<Value>(elements);
        result.add(object);
        return new SequenceValue(result);
    }

    public Value at(int index) {
        if (elements == null) {
            return null;
        }
        index = index - 1;        
        if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException(
				"index: " + (index + 1) + ", size: " //$NON-NLS-1$ //$NON-NLS-2$
					+ size());
		}        
        return elements.get(index);
    }

	public SequenceValue createNew() {
		return new SequenceValue();
	}

	public SequenceValue excluding(Value value) {
		List<Value> result = new ArrayList<Value>(elements);
		result.remove(value);
		return new SequenceValue(result);
	}

    public Value first() {
        if ((elements == null) || (elements.size() <= 0)) {
            return null;
        }
        return elements.get(0);
    }

	public SequenceValue including(Value value) {
		List<Value> result = new ArrayList<Value>(elements);
		result.add(value);
		return new SequenceValue(result);
	}

    public int indexOf(Value object) {
        int index = elements.indexOf(object);
        return index >= 0 ? index+1 : -1;
    }

    public SequenceValue insertAt(int index, Value object) {
        index = index - 1;        
        if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException(
				"index: " + (index + 1) + ", size: " //$NON-NLS-1$ //$NON-NLS-2$
					+ size());
        }        
		List<Value> result = new ArrayList<Value>(elements);
		result.add(index, object);
		return new SequenceValue(result);
    }

  
    public Value last() {
        if (elements == null) {
            return null;
        }
        int size = elements.size();
		if (size <= 0) {
            return null;
        }
        return elements.get(size-1);
    }
    
    public SequenceValue prepend(Value object) {
    	List<Value> result = new ArrayList<Value>();
        result.add(object);
        result.addAll(elements);
        return new SequenceValue(result);
    }

	public SequenceValue reverse() {
		List<Value> elements = new ArrayList<Value>(this.elements);
		Collections.reverse(elements);
        return new SequenceValue(elements);
    }
	   
    public SequenceValue sort(Comparator<Value> comparator) {
    	List<Value> values = new ArrayList<Value>(elements);
    	Collections.sort(values, comparator);
    	return new SequenceValue(values);
    }
	
    /**
     * Implementation of the OCL
     * <tt>Sequence::subSequence(lower : Integer, upper : Integer) : Sequence(T)</tt></li>
     * operation.
     * 
     * @param self the source sequence
     * @param lower the 1-based (in OCL fashion) inclusive lower bound
     * @param upper the 1-based (in OCL fashion) inclusive upper bound
     * @return the source collection with the object inserted at the index
     * 
     * @throws IndexOutOfBoundsException if an index is out of bounds
     * @throws IllegalArgumentException if the lower bound is greater than the upper
     */
    public SequenceValue subSequence(int lower, int upper) {
        lower = lower - 1;
        upper = upper - 1;
        
        if (lower < 0) {
			throw new IndexOutOfBoundsException("lower: " + (lower + 1)); //$NON-NLS-1$
        } else if (upper >= size()) {
			throw new IndexOutOfBoundsException(
				"upper: " + (upper + 1) + ", size: " //$NON-NLS-1$ //$NON-NLS-2$
					+ size());
        } else if (upper < lower) {
			throw new IllegalArgumentException(
				"lower: " + (lower + 1) + ", upper: " //$NON-NLS-1$ //$NON-NLS-2$
					+ (upper + 1));
        }
        
		List<Value> result = new ArrayList<Value>();
        int curr = 0;
        for (Iterator<Value> it = iterator(); it.hasNext();) {
        	Value object = it.next();
            if (curr >= lower && curr <= upper) {
                result.add(object);
            }
            curr++;
        }
        return new SequenceValue(result);
    }
 }
