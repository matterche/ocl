/**
 * <copyright>
 *
 * Copyright (c) 2006, 2008 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bugs 244946, 248869
 *
 * </copyright>
 *
 * $Id: CollectionUtil.java,v 1.1.2.2 2010/12/23 19:25:10 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.ocl.examples.pivot.BagType;
import org.eclipse.ocl.examples.pivot.CollectionKind;
import org.eclipse.ocl.examples.pivot.CollectionLiteralExp;
import org.eclipse.ocl.examples.pivot.CollectionLiteralPart;
import org.eclipse.ocl.examples.pivot.CollectionRange;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.OrderedSetType;
import org.eclipse.ocl.examples.pivot.SequenceType;
import org.eclipse.ocl.examples.pivot.SetType;
import org.eclipse.ocl.examples.pivot.TupleType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.messages.OCLMessages;
import org.eclipse.ocl.examples.pivot.util.PivotPlugin;

/**
 * Utility methods for working with OCL collection values.
 *
 * @author Christian W. Damus (cdamus)
 */
public class CollectionUtil {

    // not instantiable
	private CollectionUtil() {
		super();
	}

    /**
     * Implementation of the OCL
     * <tt>Collection::isEmpty() : Boolean</tt>
     * operation.
     * 
     * @param self the source collection
     * @return whether the collection does not have any elements
     */
    public static boolean isEmpty(Collection<?> self) {
        return self.isEmpty();
    }
    
	public static boolean isSimpleRange(CollectionLiteralExp cl) {
		List<CollectionLiteralPart> partsList = cl.getParts();
		int size = partsList.size();
		if (size == 1) {
			CollectionLiteralPart part = partsList.get(0);
			return part instanceof CollectionRange;
		}
		return false;
	}

    /**
     * Implementation of the OCL
     * <tt>Collection::notEmpty() : Boolean</tt>
     * operation.
     * 
     * @param self the source collection
     * @return whether the collection has any elements
     */
    public static boolean notEmpty(Collection<?> self) {
        return !self.isEmpty();
    }

    /**
     * Implementation of the OCL
     * <tt>Collection::sum() : T</tt>
     * operation.
     * 
     * @param self the source collection
     * @return the sum of the collection's elements
     */
    // Assumes the elements of the collection are all Integer or
    // all Double.
    public static Object sum(Collection<?> self) {

        if (self.isEmpty()) {
            return null; // undefined
        }
        
        Iterator<?> it = self.iterator();
        Object object = it.next();

        // two cases: Integer and Double
        if (object instanceof Integer) {
            int currVal = 0;
            for (it = self.iterator(); it.hasNext();) {
                currVal += ((Integer) it.next()).intValue();
            }
            return new Integer(currVal);
        } else if (object instanceof Double) {
            double currVal = 0.0;
            for (it = self.iterator(); it.hasNext();) {
                currVal += ((Double) it.next()).doubleValue();
            }
            return new Double(currVal);
        } else {
            IllegalArgumentException error = new IllegalArgumentException(
            		OCLMessages.SumOperator_ERROR_);
            PivotPlugin.throwing(CollectionUtil.class, "sum", error);//$NON-NLS-1$
            throw error;
        }
    }

    /**
     * Implementation of the OCL
     * <ul>
     * <li><tt>Set::=(set : Set(T)) : Boolean</tt></li>
     * <li><tt>OrderedSet::=(set : OrderedSet(T)) : Boolean</tt></li>
     * <li><tt>Bag::=(bag : Bag(T)) : Boolean</tt></li>
     * <li><tt>Sequence::=(s : Sequence(T)) : Boolean</tt></li>
     * </ul>
     * operations.
     * 
     * @param self the source collection
     * @param c another collection of the same kind
     * @return whether collections are equal
     */
    public static boolean equals(CollectionValue self, CollectionValue c) {
    	if (self.size() != c.size()) {
    		// collections of different sizes cannot be equal
    		return false;
    	} else if (self instanceof Bag<?> && c instanceof Bag<?>) {
            return ((Bag<?>) self).equals(c);
    	} else if (self instanceof List<?> && c instanceof List<?>) {
            return ((List<?>) self).equals(c);
    	} else if (self instanceof OrderedSetValue && c instanceof OrderedSetValue) {
            // OrderedSet

            // PivotOrderedSet.equals() doesn't care about order but we do
            int size1 = self.size();
            int size2 = c.size();
            if (size1 != size2) {
                return false;
            }
            Iterator<?> it1 = self.iterator();
            Iterator<?> it2 = c.iterator();
            while (it1.hasNext()) {
                Object o1 = it1.next();
                Object o2 = it2.next();
                if (!o1.equals(o2)) {
                    return false;
                }
            }
            
            return true;
        } else if (self instanceof Set<?> && c instanceof Set<?>) {
        	return ((Set<?>) self).equals(c);
        } else {
        	// incompatible OCL types
        	return false;
        }
    }
    
    /**
     * Computes the hash of a collection, accounting for the similar hashing of
     * primitive numeric values that OCL considers equal but Java does not.
     * 
     * @param c a collection
     * 
     * @return its hash
     *
    public static int hashCode(Collection<?> c) {
    	int result = 1;
    	
    	for (Object next : c) {
    		result = 37 * result + ObjectUtil.hashCode(next);
    	}
    	
    	return result;
    } */

    /**
     * Implementation of the OCL
     * <ul>
     * <li><tt>Set::intersection(set : Set(T)) : Set(T)</tt></li>
     * <li><tt>Set::intersection(bag : Bag(T)) : Set(T)</tt></li>
     * <li><tt>Bag::intersection(set : Set(T)) : Set(T)</tt></li>
     * <li><tt>Bag::intersection(bag : Bag(T)) : Set(T)</tt></li>
     * </ul>
     * operations.
     * 
     * @param self the source set or bag
     * @param c another set or bag
     * @return the intersection of the source set or bag with the other set or bag
     */
    public static CollectionValue intersection(CollectionValue self, CollectionValue c) {
        boolean resultIsSet = (self instanceof Set<?>) || (c instanceof Set<?>);  	
        int size1 = self.size();
        int size2 = c.size();
        
        // if either collection is empty, then so is the result
        if ((size1 == 0) || (size2 == 0)) {
            return resultIsSet ? SetValue.EMPTY : BagValue.EMPTY;
        }
        Collection<Value> result = resultIsSet ? new HashSet<Value>() : new BagImpl<Value>();

        // loop over the smaller collection and add only elements
        // that are in the larger collection
        if (self.size() > c.size()) {
            for (Value e : c) {
                if (self.includes(e)) {
                    result.add(e);
                }
            }
        } else {
            for (Value e : self) {
                if (c.includes(e)) {
                    result.add(e);
                }
            }
        }

        return resultIsSet
        	? new SetValue((Set<Value>)result)
        	: new BagValue((Bag<Value>)result);
    }

    /**
     * Obtains the type of the flattened form of the specified collection type.
     * 
     * @param type a collection type
     * @return the flattened collection type
     * 
     * @since 1.2
     */
    public static Type getFlattenedElementType(
            CollectionType type) {
        
        Type result = type.getElementType();
        
        while (result instanceof CollectionType) {
            result = ((CollectionType) result).getElementType();
        }
        
        return result;
    }

    /**
     * Implementation of the OCL
     * <tt>Collection::product(c : Collection(T2)) : Set(Tuple(first : T, second : T2))</tt>
     * operations.
     * 
     * @param evalEnv the current evaluation environment (for construction of
     *     tuples)
     * @param env the current OCL environment (for introspection of the tuple type)
     * @param self the source collection
     * @param c another collection
     * @return the product of the collections
     */
    public static SetValue product(CollectionValue self, CollectionValue c, TupleType tupleType) {   	
    	Set<Tuple> result = new HashSet<Tuple>();		
        for (Value next1 : self) {
        	for (Value next2 : c) {
        		result.add(new TupleImpl(tupleType, next1, next2));
        	}
        }
        return new SetValue();
    }
    
	/**
	 * Creates a new OCL <tt>Collection</tt> of the specified kind.
     * 
	 * @param kind the OCL collection kind
	 * @return the new collection
	 */
	public static CollectionValue createNewCollection(CollectionKind kind) {
		switch (kind) {
			case SET:
				return new SetValue();
			case SEQUENCE:
				return new SequenceValue();
			case ORDERED_SET:
				return new OrderedSetValue();
			case BAG:
				return new BagValue();
			default: {
				String message = OCLMessages.bind(
						OCLMessages.OCLCollectionKindNotImpl_ERROR_,
						kind);
				IllegalArgumentException error = new IllegalArgumentException(
					message);
				PivotPlugin.throwing(
						CollectionUtil.class,
						"createNewCollection", error);//$NON-NLS-1$
				throw error;

			}
		}
	}
	
    /**
     * Creates a new OCL <tt>Collection</tt> of the specified kind.
     * 
     * @param kind the OCL collection kind
     * @param c the contents of the new collection
     * @return the new collection of the specified <code>kind</code>, containing
     *     the same elements as <code>c</code>
     */
	public static <E extends Value> CollectionValue createNewCollection(
			CollectionKind kind, CollectionValue c) {
		switch (kind) {
			case SET:
				return new SetValue(c);
			case SEQUENCE:
				return new SequenceValue(c);
			case BAG:
				return new BagValue(c);
			case ORDERED_SET:
				return new OrderedSetValue(c);
			default: {
				String message = OCLMessages.bind(
						OCLMessages.OCLCollectionKindNotImpl_ERROR_,
						kind);
				IllegalArgumentException error = new IllegalArgumentException(
					message);
				PivotPlugin.throwing(
						CollectionUtil.class,
						"createNewCollection", error);//$NON-NLS-1$
				throw error;
			}
		}
	}
	
	/**
	 * Infers the OCL kind of a collection.
	 * 
	 * @param c a collection (not <code>null</code>)
	 * 
	 * @return its kind (likewise, not <code>null</code>)
	 */
	private static CollectionKind kindOf(CollectionValue c) {
	    CollectionKind result;
	    
        if (c instanceof List<?>){
            result = CollectionKind.SEQUENCE;
        } else if (c instanceof OrderedSetValue) {
            result = CollectionKind.ORDERED_SET;
        } else if (c instanceof SetValue) {
            result = CollectionKind.SET;
        } else if (c instanceof BagValue) {
            result = CollectionKind.BAG;
        } else {
            result = CollectionKind.COLLECTION;
        }
        
        return result;
	}
	
	/**
	 * Computes the string representation of a collection value using syntax
	 * like OCL's collection literals (e.g., <tt>OrderedSet{...}</tt>) instead
	 * of Java's default (i.e., <tt>[...]</tt>).
	 * 
	 * @param c a collection (not <code>null</code>)
	 * @return the string representation of the specified collection
	 * 
	 * @since 1.2
	 */
	public static String toString(CollectionValue c) {
	    StringBuilder result = new StringBuilder();
	    
        result.append(kindOf(c).getName());
        result.append('{');
        
        boolean notFirst = false;
        for (Iterator<?> iter = c.iterator();;) {
            if (iter.hasNext()) {
                if (notFirst) {
                    result.append(", "); //$NON-NLS-1$
                } else {
                    notFirst = true;
                }
                
                Object next = iter.next();
                if (next instanceof CollectionValue) {
                    // nested collection
                    result.append(toString((CollectionValue) next));
                } else if (next instanceof String) {
                    // string literal
                    result.append('\'').append(next).append('\'');
                } else {
                    result.append(next);
                }
            } else {
                break;
            }
        }
        
        result.append('}');
        
	    return result.toString();
	}

	public static CollectionKind getKind(CollectionType type) {
		if (type instanceof BagType) {
			return CollectionKind.BAG;
		}
		else if (type instanceof SequenceType) {
			return CollectionKind.SEQUENCE;
		}
		else if (type instanceof OrderedSetType) {
			return CollectionKind.ORDERED_SET;
		}
		else if (type instanceof SetType) {
			return CollectionKind.SET;
		}
		return null;
	}
}
