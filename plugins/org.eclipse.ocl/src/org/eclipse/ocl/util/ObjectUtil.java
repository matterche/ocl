/**
 * <copyright>
 *
 * Copyright (c) 2006, 2008 IBM Corporation and others.
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
 * $Id: ObjectUtil.java,v 1.5.8.2 2010/01/18 08:57:53 ewillink Exp $
 */
package org.eclipse.ocl.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp;

/**
 * Certain generic utility operations on objects.
 * 
 * @author Christian W. Damus (cdamus)
 */
public class ObjectUtil {

	private static final String maxLongValue = Long.toString(Long.MAX_VALUE);
	private static final int maxLongSize = maxLongValue.length();

	/**
     * Computes the equivalence of two objects, accounting for primitive numeric
     * values that OCL considers equal but Java does not.  This is also safe
     * when either value is <code>null</code>.
     * 
     * @param anObject an object or <code>null</code>
     * @param anotherObject another object or <code>null</code>
     * 
     * @return whether they are equivalent as far as OCL is concerned
     */
	public static boolean equal(Object anObject, Object anotherObject) {
		// FIXME This should be driven Built-in and User-defined '=' operations.
		// if either value is undefined, the result is true just if both are
		// undefined and false otherwise.
		if (anObject == null || anotherObject == null) {
            return anObject == anotherObject;
        }

		// primitive types
		if (isPrimitive(anObject) || isPrimitive(anotherObject)) {
		    if (anObject instanceof Number && anotherObject instanceof Number) {
		        anObject = ObjectUtil.normalise(anObject);
                anotherObject = ObjectUtil.normalise(anotherObject);
				if (anObject instanceof BigInteger) {
					if (anotherObject instanceof BigInteger) {
		                return anObject.equals(anotherObject);
					}
					anObject = new BigDecimal((BigInteger) anObject);
				}
				else if (anotherObject instanceof BigInteger) {
					anotherObject = new BigDecimal((BigInteger) anotherObject);
				}
				BigDecimal delta = ((BigDecimal) anObject).subtract((BigDecimal) anotherObject);
				return delta.signum() == 0;
			} else if (anObject instanceof UnlimitedNaturalLiteralExp<?> && anotherObject instanceof UnlimitedNaturalLiteralExp<?>) {
                return ((UnlimitedNaturalLiteralExp<?>)anObject).isUnlimited() && ((UnlimitedNaturalLiteralExp<?>)anotherObject).isUnlimited();
			} else if (anObject instanceof String && anotherObject instanceof String) {
                return anObject.equals(anotherObject);
            } else if (anObject instanceof Boolean && anotherObject instanceof Boolean) {
                return ((Boolean) anObject).booleanValue() == ((Boolean) anotherObject).booleanValue();
            };

			// if the types are incompatible the result is false
			return false;
		}

		if ((anObject instanceof EEnumLiteral) && (anotherObject instanceof EEnumLiteral)) {
			return anObject == anotherObject;
		} else if ((anObject instanceof EEnumLiteral) && (anotherObject instanceof Enumerator)) {
			return ((EEnumLiteral) anObject).getInstance() == anotherObject;
		} else if ((anotherObject instanceof EEnumLiteral) && (anObject instanceof Enumerator)) {
			return ((EEnumLiteral) anotherObject).getInstance() == anObject;
		}
		return anObject.equals(anotherObject);
	}
	
    /**
     * Computes hash of an object, accounting for the similar
     * hashing of primitive numeric values that OCL considers equal but Java
     * does not.  It is also safe with <code>null</code> values.
     * 
     * @param anObject an object or <code>null</code>
     * 
     * @return its OCL hash
     */
	public static int hashCode(Object anObject) {
		if (anObject == null) {
			return 0;
		}

		if (isPrimitive(anObject)) {
			// equal double and integer should hash the same 
			if (anObject instanceof Integer) {
                return 37 * ((Integer) anObject).intValue();
            } else if (anObject instanceof Long) {
                return 37 * ((Long) anObject).intValue();
            } else if (anObject instanceof Double) {
                return 37 * ((Double) anObject).intValue();
            } else if (anObject instanceof BigDecimal) {
                return 37 * ((BigDecimal) anObject).intValue();
            } else if (anObject instanceof BigInteger) {
                return 37 * ((BigInteger) anObject).intValue();
            } else if (anObject instanceof String) {
                return anObject.hashCode();
            } else if (anObject instanceof Boolean) {
                return anObject.hashCode();
            }

			// shouldn't get here (there are no other OCL primitives)
			return 0;
		}

		if (anObject instanceof EEnumLiteral) {
			return ((EEnumLiteral) anObject).getInstance().hashCode();
		}
		
		return anObject.hashCode();
	}

    /**
     * Queries whether the specified object represents an OCL primitive value.
     * 
     * @param o an object
     * @return whether it is an OCL primitive value
     */
	public static boolean isPrimitive(Object o) {
		return o instanceof Integer || o instanceof Long || o instanceof BigInteger
			|| o instanceof String || o instanceof Boolean
			|| o instanceof Double || o instanceof BigDecimal || o instanceof UnlimitedNaturalLiteralExp<?>;
	}
	
	/**
	 * Creates a BigInteger representation for aValue.
	 * @param aValue the string representation of a (non-negative) integer number
	 * @return the numeric representation
	 * @throws NumberFormatException if representation cannot be created
	 * @since 3.0
	 */
	public static BigInteger createBigInteger(String aValue) {
		int len = aValue.length();
		if ((len < maxLongSize) || ((len == maxLongSize) && (maxLongValue.compareTo(aValue) >= 0))) {
			return BigInteger.valueOf(Long.parseLong(aValue));
		}
		else {
			return new BigInteger(aValue);
		}
	}
	
	/**
	 * Creates a BigInteger or BigDecimal representation for aValue.
	 * @param aValue the string representation of a (non-negative) integer number
	 * @return the numeric representation
	 * @throws NumberFormatException if representation cannot be created
	 * @since 3.0
	 */
	@SuppressWarnings("nls")
	public static Number createNumber(String aValue) {
		if (aValue.contains(".") || aValue.contains("e") || aValue.contains("E")) {
			return new BigDecimal(aValue);
		} else {
			return ObjectUtil.createBigInteger(aValue);
		}
	}

	/**
	 * Disposes of the specified <tt>object</tt>.  If, in particular, it is
	 * an {@link EObject}, then it and all of its contents will have their
	 * adapter-lists cleared.
	 * 
	 * @param object an object to dispose
	 * 
	 * @since 1.2
	 */
	public static void dispose(Object object) {
	    if (object instanceof EObject) {
	        EObject eObject = (EObject) object;
	        
            eObject.eAdapters().clear();
            for (Iterator<EObject> iter = EcoreUtil.getAllContents(eObject,
                false); iter.hasNext();) {
                iter.next().eAdapters().clear();
            }
	    } else if (object instanceof Collection<?>) {
	        for (Object next : ((Collection<?>) object)) {
	            dispose(next);
	        }
	    }
	}

    /**
     * <p>
     * Normalises the given object converting numbers to either <tt>BigDecimal</tt> or <tt>BigInteger</tt> precision.
     * </p>
     * 
     * @param object to normalise
     * @return the normalised object
     *
	 * @since 3.0
	 */
	public static Object normalise(Object object) {
		if (object instanceof Number) {
	        if ((object instanceof BigInteger) || (object instanceof BigDecimal)) {
	        	return object;
	        } else if ((object instanceof Byte) || (object instanceof Short) ||
	                (object instanceof Integer) || (object instanceof Long)) {
	            return BigInteger.valueOf(((Number)object).longValue());
	        } else if ((object instanceof Float) || (object instanceof Double)) {
	            return new BigDecimal(((Number)object).doubleValue());
	        }
	    }
        return object;
	}
}
