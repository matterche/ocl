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
 * $Id: CollectionUtil2.java,v 1.1.2.3 2010/12/23 19:24:50 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.util;

import java.util.Iterator;

import org.eclipse.ocl.examples.library.LibraryBinaryOperation;
import org.eclipse.ocl.examples.pivot.CollectionKind;
import org.eclipse.ocl.examples.pivot.OrderedSetType;
import org.eclipse.ocl.examples.pivot.SequenceType;
import org.eclipse.ocl.examples.pivot.SetType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.values.CollectionUtil;
import org.eclipse.ocl.examples.pivot.values.CollectionValue;
import org.eclipse.ocl.examples.pivot.values.Value;

public class CollectionUtil2 {

    
	/**
	 * Creates a new OCL <tt>Collection</tt> of the specified ordering and uniqueness.
     * 
	 * @param isOrdered the required collection ordering
	 * @param isUnique the required collection uniqueness
	 * @return the new collection
	 * @since 3.1
	 */
	public static CollectionValue createNewCollection(boolean isOrdered, boolean isUnique) {
		if (isOrdered) {
			if (isUnique) {
				return CollectionUtil.createNewCollection(CollectionKind.ORDERED_SET);
			}
			else {
				return CollectionUtil.createNewCollection(CollectionKind.SEQUENCE);
			}
		}
		else {
			if (isUnique) {
				return CollectionUtil.createNewCollection(CollectionKind.SET);
			}
			else {
				return CollectionUtil.createNewCollection(CollectionKind.BAG);
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
     * <tt>Collection::sum() : T</tt>
     * operation.
     * 
     * @param self the source collection
     * @param binaryOperation the pair-wise + operation
     * @param zero the zero value to seed the summation
     * @return the maximum or minimum of the collection's elements
     * @since 3.1
     */
	public static Value sum(CollectionValue self, LibraryBinaryOperation binaryOperation, Value zero) {
		Value result = zero;
        for (Iterator<Value> it = self.iterator(); (result != null) && it.hasNext(); ) {
        	Value next = it.next();
        	result = binaryOperation.evaluate(result, next);
        }
        return result;
    }
}
