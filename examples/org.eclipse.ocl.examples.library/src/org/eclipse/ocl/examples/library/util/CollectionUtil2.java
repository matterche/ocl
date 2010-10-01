/**
 * <copyright>
 *
 * Copyright (c) 2009,2010 E.D.Willink and others.
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
 * $Id: CollectionUtil2.java,v 1.1.2.1 2010/10/01 13:28:37 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

import org.eclipse.ocl.examples.library.LibraryBinaryOperation;
import org.eclipse.ocl.examples.pivot.OrderedSetType;
import org.eclipse.ocl.examples.pivot.SequenceType;
import org.eclipse.ocl.examples.pivot.SetType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.expressions.CollectionKind;
import org.eclipse.ocl.util.CollectionUtil;

public class CollectionUtil2 {

    
	/**
	 * Creates a new OCL <tt>Collection</tt> of the specified ordering and uniqueness.
     * 
	 * @param isOrdered the required collection ordering
	 * @param isUnique the required collection uniqueness
	 * @return the new collection
	 * @since 3.1
	 */
	public static <E> Collection<E> createNewCollection(boolean isOrdered, boolean isUnique) {
		if (isOrdered) {
			if (isUnique) {
				return CollectionUtil.createNewCollection(CollectionKind.ORDERED_SET_LITERAL);
			}
			else {
				return CollectionUtil.createNewCollection(CollectionKind.SEQUENCE_LITERAL);
			}
		}
		else {
			if (isUnique) {
				return CollectionUtil.createNewCollection(CollectionKind.SET_LITERAL);
			}
			else {
				return CollectionUtil.createNewCollection(CollectionKind.BAG_LITERAL);
			}
		}
	}

	public static boolean isOrdered(Type sourceType) {
		if (sourceType instanceof OrderedSetType) {
			return true;
		}
		if (sourceType instanceof SequenceType) {
			return true;
		}
		return false;
	}

	public static boolean isUnique(Type sourceType) {
		if (sourceType instanceof OrderedSetType) {
			return true;
		}
		if (sourceType instanceof SetType) {
			return true;
		}
		return false;
	}

    /**
     * Implementation of the OCL
     * <tt>Collection::max() : T</tt>
     * or
     * <tt>Collection::min() : T</tt>
     * operation.
     * 
     * @param self the source collection
     * @param binaryOperation the pair-wise max or min operation
     * @return the maximum or minimum of the collection's elements
     * @since 3.1
     */
	public static Object maxMin(Collection<?> self, LibraryBinaryOperation binaryOperation) {
        Iterator<?> it = self.iterator();
        if (!it.hasNext()) {
        	return null;
        }
        Object result = it.next();
        while ((result != null) && it.hasNext()) {
            Object next = it.next();
        	result = binaryOperation.evaluate(result, next);
        }
        return result;
    }

    /**
     * Implementation of the OCL
     * <tt>Collection::sum() : T</tt>
     * operation.
     * 
     * @param self the source collection
     * @param binaryOperation the pair-wise + operation
     * @param zero the zero value to seed the summation
     * @return the maximum or minimum of the collection's elements
     * @since 3.1
     */
	public static Object sum(Collection<?> self, LibraryBinaryOperation binaryOperation, Object zero) {
        Object result = zero;
        for (Iterator<?> it = self.iterator(); (result != null) && it.hasNext(); ) {
            Object next = it.next();
        	result = binaryOperation.evaluate(result, next);
        }
        return result;
    }

    /**
     * Implementation of the OCL
     * <ul>
     * <li><tt>OrderedSet::reverse() : OrderedSet(T)</tt></li>
     * <li><tt>Sequence::reverse() : Sequence(T)</tt></li>
     * </ul>
     * operations.
     * 
     * @param self the source collection
     * @param object an object
     * @return the reversed source collection
     * @since 3.1
     */
	public static <E> Collection<E> reverse(Collection<E> self) {
        Collection<E> result;
    	Object[] elements = self.toArray();
        if (self instanceof LinkedHashSet<?>) {
        	result = CollectionUtil.createNewOrderedSet();
        } else {
            result = CollectionUtil.createNewSequence();
        }
        for (int i = elements.length; --i >= 0; ) {
            @SuppressWarnings("unchecked")
        	E element = (E)elements[i];
			result.add(element);
        }
        return result;
    }
}
