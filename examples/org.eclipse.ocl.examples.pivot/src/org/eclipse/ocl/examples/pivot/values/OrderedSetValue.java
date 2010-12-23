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
 * $Id: OrderedSetValue.java,v 1.1.2.1 2010/12/23 19:25:10 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class OrderedSetValue
	extends AbstractCollectionValue<LinkedHashSet<Value>>
	implements OrderedCollectionValue, UniqueCollectionValue
{
    public static OrderedSetValue union(CollectionValue left, CollectionValue right) {
    	if (left.isEmpty()) {
            return right.asOrderedSetValue();
        }
    	if (right.isEmpty()) {
            return left.asOrderedSetValue();
        }    	
    	LinkedHashSet<Value> result = new LinkedHashSet<Value>(left.asCollection());
        result.addAll(right.asCollection());
		return new OrderedSetValue(result);
    }
	
	public static class Accumulator extends OrderedSetValue implements CollectionValue.Accumulator
	{
		public boolean add(Value value) {
			return elements.add(value);			
		}		
	}
    
	public OrderedSetValue(Value... elements) {
		super(new LinkedHashSet<Value>());
		if (elements != null) {
			for (Value element : elements) {
				this.elements.add(element);
			}
		}
		if (!isValid(elements)) {
			elements = null;
		}
	}

	public OrderedSetValue(Collection<? extends Value> elements) {
		super(new LinkedHashSet<Value>(elements));
	}

	public OrderedSetValue(LinkedHashSet<Value> elements) {
		super(elements);
	}

    public OrderedSetValue append(Value object) {
    	LinkedHashSet<Value> result = new LinkedHashSet<Value>(elements);
        result.remove(object);  // appended object must be last
        result.add(object);
        return new OrderedSetValue(result);
    }

	@Override
	public OrderedCollectionValue asOrderedCollectionValue() {
		return this;
	}

	@Override
	public OrderedSetValue asOrderedSetValue() {
		return this;
	}
	
    public Value at(int index) {
        index = index - 1;        
        if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException(
				"index: " + (index + 1) + ", size: " //$NON-NLS-1$ //$NON-NLS-2$
					+ size());
		}        
        int curr = 0;
        for (Iterator<Value> it = iterator(); it.hasNext();) {
        	Value object = it.next();
            if (curr++ == index) {
                return object;
            }
        }
        return null; // undefined
    }

	public OrderedSetValue createNew() {
		return new OrderedSetValue();
	}

	public OrderedSetValue excluding(Value value) {
		LinkedHashSet<Value> result = new LinkedHashSet<Value>(elements);
		result.remove(value);
		return new OrderedSetValue(result);
	}

    public Value first() {
        if ((elements == null) || (elements.size() <= 0)) {
            return null;
        }
        return elements.iterator().next();
    }

	public OrderedSetValue including(Value value) {
		LinkedHashSet<Value> result = new LinkedHashSet<Value>(elements);
		result.add(value);
		return new OrderedSetValue(result);
	}


    public int indexOf(Value object) {
        int index = 1;        
        for (Value next : elements) {
            if (object.equals(next)) {
                return index;
            }
            index++;
        }        
        return -1; // undefined
    }

    public OrderedSetValue insertAt(int index, Value object) {
        index = index - 1;
        
        if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException(
				"index: " + (index + 1) + ", size: " //$NON-NLS-1$ //$NON-NLS-2$
					+ size());
        }
        
    	LinkedHashSet<Value> result = new LinkedHashSet<Value>();
        int curr = 0;
        for (Iterator<Value> it = iterator(); it.hasNext();) {
            if (curr == index) {
                result.add(object);
            }
            result.add(it.next());
            curr++;
        }
        
        if (index == size()) {
        	// the loop finished before we could add the object
        	result.add(object);
        }
        return new OrderedSetValue(result);
    }

    public Value last() {
        if ((elements == null) || (elements.size() <= 0)) {
            return null;
        }
        Value result = null;
        for (Value next : elements) {
            result = next;
        }
        return result;
    }

    public OrderedSetValue prepend(Value object) {
    	LinkedHashSet<Value> result = new LinkedHashSet<Value>();
        result.add(object);
        result.addAll(elements);
        return new OrderedSetValue(result);
    }

	public OrderedSetValue reverse() {
		List<Value> elements = asList();
		Collections.reverse(elements);
        return new OrderedSetValue(elements);
    }
    
    public OrderedSetValue sort(Comparator<Value> comparator) {
    	List<Value> values = new ArrayList<Value>(elements);
    	Collections.sort(values, comparator);
    	return new OrderedSetValue(values);
    }

    public OrderedSetValue subOrderedSet(int lower, int upper) {
        lower = lower - 1;
        upper = upper - 1;
        
        if (lower < 0) {
			throw new IndexOutOfBoundsException("lower: " + (lower + 1)); //$NON-NLS-1$
        } else if (upper >= elements.size()) {
			throw new IndexOutOfBoundsException(
				"upper: " + (upper + 1) + ", size: " //$NON-NLS-1$ //$NON-NLS-2$
					+ size());
        } else if (upper < lower) {
			throw new IllegalArgumentException(
				"lower: " + (lower + 1) + ", upper: " //$NON-NLS-1$ //$NON-NLS-2$
					+ (upper + 1));
        }
        
        LinkedHashSet<Value> result = new LinkedHashSet<Value>();
        int curr = 0;
        for (Iterator<Value> it = elements.iterator(); it.hasNext();) {
        	Value object = it.next();
            if (curr >= lower && curr <= upper) {
                result.add(object);
            }
            curr++;
        }
        return new OrderedSetValue(result);
    }
}
