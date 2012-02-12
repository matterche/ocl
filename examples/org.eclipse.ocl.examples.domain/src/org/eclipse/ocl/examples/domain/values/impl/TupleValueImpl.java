/**
 * <copyright>
 *
 * Copyright (c) 2005,2011 IBM Corporation and others.
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
 * $Id: TupleValueImpl.java,v 1.6 2011/03/14 17:04:44 ewillink Exp $
 */

package org.eclipse.ocl.examples.domain.values.impl;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.ocl.examples.domain.elements.DomainTupleType;
import org.eclipse.ocl.examples.domain.elements.DomainTypedElement;
import org.eclipse.ocl.examples.domain.values.TupleValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

/**
 * UML implementation of a tuple value.
 * 
 * @author Christian W. Damus (cdamus)
 */
public class TupleValueImpl extends AbstractValue implements TupleValue
{
	protected final DomainTupleType type;
    private final Map<String, Value> parts = new java.util.HashMap<String, Value>();
    private Integer hashCode = null;

    /**
     * Initializes me with a map of part values.
     * 
     * @param type my type
     * @param values my parts
     */
    public TupleValueImpl(ValueFactory valueFactory, DomainTupleType type, Map<? extends DomainTypedElement, Value> values) {
		super(valueFactory);
		this.type = type;
        for (Map.Entry<? extends DomainTypedElement, Value> entry : values.entrySet()) {
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
    public TupleValueImpl(ValueFactory valueFactory, DomainTupleType type, Value firstValue, Value secondValue) {
		super(valueFactory);
		this.type = type;
        parts.put("first", firstValue);			// FIXME define "first" elsewhere
        parts.put("second", secondValue);
    }

	public Object asObject() {
		return parts;
	}

	public Value asValidValue() {
		return this;
	}

    // overrides the inherited implementation
    @Override
    public boolean equals(Object o) {
        boolean result = o instanceof TupleValueImpl;

        if (result) {
            TupleValueImpl other = (TupleValueImpl) o;

            result &= other.type.equals(type);
            result &= other.parts.equals(parts);
        }

        return result;
    }

	public DomainTupleType getType() {
		return type;
	}

    // implements the inherited specification
    public Value getValue(String partName) {
        return parts.get(partName);
    }

    // implements the inherited specification
    public Value getValue(DomainTypedElement part) {
        return getValue(part.getName());
    }

    // overrides the inherited implementation
    @Override
    public int hashCode() {
    	if (hashCode == null) {
            int typeHashCode = type.hashCode();
    		int partsHashCode = parts.hashCode();
    		hashCode = 37 * typeHashCode + 17 * partsHashCode;
    	}
		return hashCode;
    }

	@Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Tuple{"); //$NON-NLS-1$
        
        for (Iterator<? extends DomainTypedElement> iter =  getType().getOwnedAttribute().iterator();
                iter.hasNext();) {
            
        	DomainTypedElement p = iter.next();
            
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
        /*if (o instanceof String) {
            return "'" + (String) o + "'"; //$NON-NLS-1$ //$NON-NLS-2$
        } else if (o instanceof NullValue) {
            return o.toString();
        } else if (o instanceof CollectionValue) {
            return toString((CollectionValue) o);
        } else*/ if (o == null) {
            return "null"; //$NON-NLS-1$
        } else {
            return o.toString();
        }
    }
}
