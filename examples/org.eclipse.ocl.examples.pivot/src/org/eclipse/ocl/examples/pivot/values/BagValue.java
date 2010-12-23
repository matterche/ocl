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
 * $Id: BagValue.java,v 1.1.2.1 2010/12/23 19:25:10 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BagValue
	extends AbstractCollectionValue<Bag<Value>>
	implements NonOrderedCollectionValue, NonUniqueCollectionValue
{
	public static BagValue EMPTY = new BagValue();

    public static BagValue union(CollectionValue left, CollectionValue right) {
    	if (left.isEmpty()) {
            return right.asBagValue();
        }
    	if (right.isEmpty()) {
            return left.asBagValue();
        }    	
		Bag<Value> result = new BagImpl<Value>(left.asCollection());
        result.addAll(right.asCollection());
		return new BagValue(result);
    }
	
	public static class Accumulator extends BagValue implements CollectionValue.Accumulator
	{
		public boolean add(Value value) {
			return elements.add(value);			
		}		
	}
	
	public BagValue(Value... elements) {
		super(new BagImpl<Value>());
		if (elements != null) {
			for (Value element : elements) {
				this.elements.add(element);
			}
		}
		if (!isValid(elements)) {
			elements = null;
		}
	}

	public BagValue(Collection<? extends Value> elements) {
		super(new BagImpl<Value>(elements));
	}

//	public BagValue(CollectionValue c) {
//		this(c.asCollection());
//	}

	public BagValue(Bag<Value> elements) {
		super(elements);
	}

    @Override
	public BagValue asBagValue() {
        return this;
    }

	public BagValue createNew() {
		return new BagValue();
	}

	public BagValue excluding(Value value) {
		Bag<Value> result = new BagImpl<Value>(elements);
		result.remove(value);
		return new BagValue(result);
	}

	public BagValue including(Value value) {
		Bag<Value> result = new BagImpl<Value>(elements);
		result.add(value);
		return new BagValue(result);
	}
	   
    public SequenceValue sort(Comparator<Value> comparator) {
    	List<Value> values = new ArrayList<Value>(elements);
    	Collections.sort(values, comparator);
    	return new SequenceValue(values);
    }
}
