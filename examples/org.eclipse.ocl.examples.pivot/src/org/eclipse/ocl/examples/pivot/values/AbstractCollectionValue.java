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
 * $Id: AbstractCollectionValue.java,v 1.1.2.1 2010/12/23 19:25:11 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.ocl.examples.pivot.CollectionKind;
import org.eclipse.ocl.examples.pivot.ObjectUtil;
import org.eclipse.ocl.examples.pivot.evaluation.CallableImplementation;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.messages.OCLMessages;
import org.eclipse.ocl.examples.pivot.util.PivotPlugin;

public abstract class AbstractCollectionValue<C extends Collection<Value>>
	extends AbstractValue
	implements CollectionValue
{
	public static CollectionValue create(CollectionKind kind, Value... values) {
		switch (kind) {
			case BAG: return new BagValue(values);
			case ORDERED_SET: return new OrderedSetValue(values);
			case SEQUENCE: return new SequenceValue(values);
			case SET: return new SetValue(values);
		}
		String message = OCLMessages.bind(OCLMessages.OCLCollectionKindNotImpl_ERROR_, kind);
		IllegalArgumentException error = new IllegalArgumentException(message);
		PivotPlugin.throwing(CollectionUtil.class, "createNewCollection", error);//$NON-NLS-1$
		throw error;
	}

	public static CollectionValue create(CollectionKind kind, Collection<Value> values) {
		switch (kind) {
			case BAG: return new BagValue(values);
			case ORDERED_SET: return new OrderedSetValue(values);
			case SEQUENCE: return new SequenceValue(values);
			case SET: return new SetValue(values);
		}
		String message = OCLMessages.bind(OCLMessages.OCLCollectionKindNotImpl_ERROR_, kind);
		IllegalArgumentException error = new IllegalArgumentException(message);
		PivotPlugin.throwing(CollectionUtil.class, "createNewCollection", error);//$NON-NLS-1$
		throw error;
	}

	public static boolean isValid(Value[] elements) {
		if (elements == null) {
			return false;			
		}
		for (Value element : elements) {
			if (element.isInvalid()) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isValid(Collection<? extends Value> elements) {
		if (elements == null) {
			return false;			
		}
		for (Value element : elements) {
			if (element.isInvalid()) {
				return false;
			}
		}
		return true;
	}

	protected final C elements;
	
	protected AbstractCollectionValue(C elements) {
		this.elements = isValid(elements) ? elements : null;
	}

    @Override
    public BagValue asBagValue() {
        return new BagValue(elements);
    }

	public Collection<Value> asCollection() {
		return elements != null ? elements : Collections.<Value>emptyList();
	}

	public List<Value> asList() {
		return elements != null ? new ArrayList<Value>(elements) : Collections.<Value>emptyList();
	}

	@Override
	public CollectionValue asCollectionValue() {
		return this;
	}

    @Override
	public OrderedSetValue asOrderedSetValue() {
        return new OrderedSetValue(elements);
    }

    @Override
    public SequenceValue asSequenceValue() {
        return new SequenceValue(elements);
    }

    @Override
    public SetValue asSetValue() {
        return new SetValue(elements);
    }

    /**
     * Implementation of the OCL
     * <tt>Collection::count(object : T) : Integer</tt>
     * operation.
     * 
     * @param self the source collection
     * @param object an object
     * @return the number of occurrences of the object in the collection
     */
    public int count(Value value) {
        int count = 0;
        for (Value next : elements) {
            if (ObjectUtil.equal(next, value)) {
                count++;
            }
        }        
        return count;
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
    public boolean excludes(Value value) {
    	return (elements != null) && !elements.contains(value);
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
    public boolean excludesAll(CollectionValue c) {
        for (Value next : c) {
            if (includes(next)) {
                return false;
            }
        }
        return true;
    }

    public CollectionValue flatten() {
    	throw new UnsupportedOperationException();
/*    	CollectionValue result = this;
        
        for (;;) {
            if (result.isEmpty()) {
                break;
            }
            
            Iterator<Value> it = result.iterator();
            Value object = it.next();
    
            // if the element type is not a collection type, the result is the
            // current collection.
            if (!(object instanceof CollectionValue)) {
                break;
            }
    
            CollectionValue newResult = null;
            if (result instanceof Bag<?>) {
                newResult = createNewBag();
            } else if (result instanceof Set<?>) {
                newResult = createNewSet();
            } else {
                // Sequence
                newResult = createNewSequence();
            }
            
            // the element type is a collection type -- flatten one level
            newResult.addAll((CollectionValue) object);
            while (it.hasNext()) {
                newResult.addAll((CollectionValue) it.next());
            }
            
            result = newResult;
            // loop until the result is empty or the first element is not a
            // collection
        }
        
        return result; */
    }

    /**
     * Implementation of the OCL
     * <tt>Collection::includes(object : T) : Boolean</tt>
     * operation.
     * 
     * @param self the source collection
     * @param object an object
     * @return whether the collection includes the object
     */
    public boolean includes(Value value) {
		return (elements != null) && elements.contains(value);
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
    public boolean includesAll(CollectionValue c) {
    	for (Value next : c) {
    		if (!includes(next)) {
    			return false;
    		}
    	}   	
        return true;
    }

	public boolean isEmpty() {
		return (elements == null) || (elements.size() == 0);
	}

	public Iterator<Value> iterator() {
		return elements != null ? elements.iterator() : Collections.<Value>emptyList().iterator();
	}
	
	public Value maxMin(EvaluationVisitor evaluationVisitor, CallableImplementation binaryOperation) {
		throw new UnsupportedOperationException();
/*        Iterator<Value> it = iterator();
        if (!it.hasNext()) {
        	return null;
        }
        Value result = it.next();
        while ((result != null) && it.hasNext()) {
            Object next = it.next();
        	result = binaryOperation.evaluate(evaluationVisitor, result, next);
        }
        return result; */
    }

	public boolean notEmpty() {
		return (elements == null) || (elements.size() != 0);
	}

	public int size() {
		return (elements != null) ? elements.size() : 0;
	}

    public CollectionValue union(CollectionValue c) {
        if (this instanceof BagValue || c instanceof BagValue) {
            return BagValue.union(this, c);
        }
        else if (this instanceof SequenceValue || c instanceof SequenceValue) {
            return SequenceValue.union(this, c);
        }
        else if (this instanceof OrderedSetValue || c instanceof OrderedSetValue) {
            return OrderedSetValue.union(this, c);
        }
        else {
            return SetValue.union(this, c);
        }
    }
}
