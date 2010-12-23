/**
 * <copyright>
 *
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: TupleImpl.java,v 1.1.2.2 2010/12/23 19:25:10 ewillink Exp $
 */

package org.eclipse.ocl.examples.pivot.values;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.TupleType;

/**
 * UML implementation of a tuple value.
 * 
 * @author Christian W. Damus (cdamus)
 */
public class TupleImpl extends AbstractValue implements Tuple
{
    private final TupleType type;

    private final Map<String, Value> parts = new java.util.HashMap<String, Value>();

    /**
     * Initializes me with a map of part values.
     * 
     * @param type my type
     * @param values my parts
     */
    public TupleImpl(TupleType type, Map<Property, Value> values) {
        this.type = type;

        for (Map.Entry<Property, Value> entry : values.entrySet()) {
            parts.put(entry.getKey().getName(), entry.getValue());
        }
    }
    
    /**
     * Convenience constructor to initialize me with a pair of part values as
     * required by the Collection::product() operation.
     * 
     * @param type my type
     * @param firstValue my first value
     * @param secondValue my second value
     */
    public TupleImpl(TupleType type, Value firstValue, Value secondValue) {
        this.type = type;						// FIXME use optimised ProductTupleImpl
        parts.put("first", firstValue);			// FIXME define "first" elsewhere
        parts.put("second", secondValue);
    }

    // implements the inherited specification
    public TupleType getTupleType() {
        return type;
    }

    // implements the inherited specification
    public Value getValue(String partName) {
        return parts.get(partName);
    }

    // implements the inherited specification
    public Value getValue(Property part) {
        return getValue(part.getName());
    }

    // overrides the inherited implementation
    @Override
    public boolean equals(Object o) {
        boolean result = o instanceof TupleImpl;

        if (result) {
            TupleImpl other = (TupleImpl) o;

            result &= other.type.equals(type);
            result &= other.parts.equals(parts);
        }

        return result;
    }

    // overrides the inherited implementation
    @Override
    public int hashCode() {
        return 37 * type.hashCode() + 17 * parts.hashCode();
    }
    
    @Override
	public boolean isInvalid() {
    	for (Value part : parts.values()) {
    		if (part.isInvalid()) {
    			return true;
    		}
    	}
		return false;
	}

	@Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Tuple{"); //$NON-NLS-1$
        
        for (Iterator<Property> iter =  getTupleType().getOwnedAttributes().iterator();
                iter.hasNext();) {
            
            Property p = iter.next();
            
            result.append(p.getName());
            result.append(" = "); //$NON-NLS-1$
            result.append(toString(getValue(p)));
            
            if (iter.hasNext()) {
                result.append(", "); //$NON-NLS-1$
            }
        }
        
        result.append("}"); //$NON-NLS-1$
        return result.toString();
    }
    
    private String toString(Object o) {
        if (o instanceof String) {
            return "'" + (String) o + "'"; //$NON-NLS-1$ //$NON-NLS-2$
        } else if (o instanceof CollectionValue) {
            return CollectionUtil.toString((CollectionValue) o);
        } else if (o == null) {
            return "null"; //$NON-NLS-1$
        } else {
            return o.toString();
        }
    }
}
