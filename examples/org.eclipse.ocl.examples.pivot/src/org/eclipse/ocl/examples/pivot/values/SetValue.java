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
 * $Id: SetValue.java,v 1.1.2.1 2010/12/23 19:25:10 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.ocl.examples.pivot.Element;

public class SetValue extends AbstractCollectionValue<Set<Value>>
	implements NonOrderedCollectionValue, UniqueCollectionValue
{
	public static SetValue EMPTY = new SetValue();

	public static SetValue union(CollectionValue left, CollectionValue right) {
    	if (left.isEmpty()) {
            return right.asSetValue();
        }
    	if (right.isEmpty()) {
            return left.asSetValue();
        }    	
    	Set<Value> result = new LinkedHashSet<Value>(left.asCollection());
        result.addAll(right.asCollection());
		return new SetValue(result);
    }   

	public static SetValue valueOfElements(Collection<? extends Element> elements) {
		Set<Value> results = new HashSet<Value>();
		for (Element element : elements) {
			results.add(ElementValue.valueOf(element));
		}
		return new SetValue(results);
	}

	public static SetValue valueOfObjects(Collection<? extends Object> objects) {
		Set<Value> results = new HashSet<Value>();
		for (Object object : objects) {
			results.add(ObjectValue.valueOf(object));
		}
		return new SetValue(results);
	}
	
	public static class Accumulator extends SetValue implements CollectionValue.Accumulator
	{
		public boolean add(Value value) {
			return elements.add(value);			
		}		
	}
	
	public SetValue(Value... elements) {
		super(new HashSet<Value>());
		if (elements != null) {
			for (Value element : elements) {
				this.elements.add(element);
			}
		}
		if (!isValid(elements)) {
			elements = null;
		}
	}

	public SetValue(Collection<? extends Value> elements) {
		super(new HashSet<Value>(elements));
	}

//	public SetValue(CollectionValue c) {
//		this(c.asCollection());
//	}

	public SetValue(Set<Value> elements) {
		super(elements);
	}

    @Override
	public SetValue asSetValue() {
        return this;
    }

	public SetValue createNew() {
		return new SetValue();
	}

	public SetValue excluding(Value value) {
		Set<Value> result = new HashSet<Value>(elements);
		result.remove(value);
		return new SetValue(result);
	}

	public SetValue including(Value value) {
		Set<Value> result = new HashSet<Value>(elements);
		result.add(value);
		return new SetValue(result);
	}

    /**
     * Implementation of the OCL
     * <tt>Set::-(set : Set(T)) : Set(T)</tt>
     * operation.
     * 
     * @param self the source set
     * @param set another set
     * @return the subtraction of the other set from the source set
     */
    public SetValue minus(SetValue set) {
    	Set<Value> result = new HashSet<Value>(elements);
        result.removeAll(set.asCollection());
        return new SetValue(result);
    }
    
    public OrderedSetValue sort(Comparator<Value> comparator) {
    	List<Value> values = new ArrayList<Value>(elements);
    	Collections.sort(values, comparator);
    	return new OrderedSetValue(values);
    }

    /**
     * Implementation of the OCL
     * <tt>Set::symmetricDifference(set : Set(T)) : Set(T)</tt>
     * operation.
     * 
     * @param self the source set
     * @param set another set
     * @return the set of elements in either the source or the other set but not
     *     in both
     */
    public SetValue symmetricDifference(SetValue set) {       
    	Set<Value> result = new HashSet<Value>(elements);       
        for (Value e : set) {
            if (result.contains(e)) {
                result.remove(e);
            } else {
                result.add(e);
            }
        }        
        return new SetValue(result);
    }
}
