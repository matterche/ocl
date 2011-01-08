/**
 * <copyright> 
 *
 * Copyright (c) 2006, 2007 IBM Corporation and others.
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
 * $Id: StandardLibrary.java,v 1.1.2.4 2011/01/08 15:35:07 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot;

import org.eclipse.ocl.Environment;



/**
 * A representation of the OCL Standard Library, which is the set of singleton
 * instances of the OCL-defined metatypes, including the generic collection
 * types (e.g., <tt>Set(T)</tt>).
 * <p>
 * See the {@link Environment} class for a description of the
 * generic type parameters of this class. 
 * </p>
 * 
 * @author Christian W. Damus (cdamus)
 */
public interface StandardLibrary {

	boolean conformsTo(Type firstType, Type secondType);

	/**
	 * Create an explanatory invalid value arising for evaluation of an expression for an object,
	 * typically the source value of an operation call.
	 * Optionally a reason and a throwable provide further explanation of the cause of invalidity.
	 * <p>
	 * Unless explanatory invalid behaviour has been enabled, the context and
	 * explanation are discarded and the singleton invalid value is returned instead.
	 * @param object
	 * @param expression
	 * @param reason
	 * @param throwable
	 * @return
	 */
	Object createInvalidValue(Object object, OclExpression expression, String reason, Throwable throwable);
	
    /**
     * Obtains the single instance of the {@link AnyType} metatype, named
     * <tt>OclAny</tt>.
     * 
     * @return the <tt>OclAny</tt> type (an instance of {@link AnyType})
     */
	Type getOclAnyType();
	
    /**
     * Obtains the single instance of the {@link VoidType} metatype, named
     * <tt>OclVoid</tt>.
     * 
     * @return the <tt>OclVoid</tt> type (an instance of {@link VoidType})
     */
	Type getNullType();
	
    /**
     * Obtains the single instance of the {@link InvalidType} metatype, named
     * <tt>OclInvalid</tt>.
     * 
     * @return the <tt>OclInvalid</tt> type (an instance of {@link InvalidType})
     */
	Type getInvalidType();
	
    /**
     * Obtains the single instance of the {@link #getOclInvalid() OclInvalid} type,
     * identified by the token <tt>invalid</tt>.
     * 
     * @return the <tt>invalid</tt> instance
     *     (an instance of {@link #getOclInvalid() invalid})
     */
	Object getInvalidValue();
	
    /**
     * Obtains the single instance of the {@link #getOclVoid() OclVoid} type,
     * identified by the token <tt>null</tt>.
     * 
     * @return the <tt>invalid</tt> instance
     *     (an instance of {@link #getOclVoid() null})
     */
	Object getNullValue();
	
    /**
     * Obtains the instance of the {@link PrimitiveType} metatype, named
     * <tt>Boolean</tt>.
     * 
     * @return the <tt>Boolean</tt> type (an instance of {@link PrimitiveType})
     */
	Type getBooleanType();
	
    /**
     * Obtains the instance of the {@link PrimitiveType} metatype, named
     * <tt>String</tt>.
     * 
     * @return the <tt>String</tt> type (an instance of {@link PrimitiveType})
     */
	Type getStringType();
	
    /**
     * Obtains the instance of the {@link PrimitiveType} metatype, named
     * <tt>Real</tt>.
     * 
     * @return the <tt>Real</tt> type (an instance of {@link PrimitiveType})
     */
	Type getRealType();
	
    /**
     * Obtains the instance of the {@link PrimitiveType} metatype, named
     * <tt>Integer</tt>.
     * 
     * @return the <tt>Integer</tt> type (an instance of {@link PrimitiveType})
     */
	Type getIntegerType();
    
    /**
     * Obtains the instance of the {@link PrimitiveType} metatype,
     * named <tt>UnlimitedNatural</tt>.
     * 
     * @return the <tt>UnlimitedNatural</tt> type (an instance of
     *     {@link PrimitiveType})
     */
    Type getUnlimitedNaturalType();

	Object getUnlimitedValue();
	
    /**
     * Obtains the generic instance of the {@link TypeType} metatype, named
     * <tt>OclType</tt>.
     * 
     * @return the <tt>OclType</tt> type (an instance of {@link TypeType})
     */
//	Type getOclType();
	
    /**
     * Obtains the generic instance of the {@link ElementType} metatype, named
     * <tt>OclElement</tt>.
     * 
     * @return the <tt>OclElement</tt> type (an instance of {@link ElementType})
     */
//	Type getOclElement();
	
    /**
     * Obtains the generic instance of the {@link MessageType} metatype, named
     * <tt>OclMessage</tt>.
     * 
     * @return the <tt>OclMessage</tt> type (an instance of {@link MessageType})
     */
	Type getOclMessageType();
	
    /**
     * Obtains the generic instance of the {@link SetType} metatype, named
     * <tt>Set(T)</tt>.
     * 
     * @return the <tt>Set(T)</tt> type (an instance of {@link SetType})
     */
	Type getSetType();
	
    /**
     * Obtains the generic instance of the {@link OrderedSetType} metatype, named
     * <tt>OrderedSet(T)</tt>.
     * 
     * @return the <tt>OrderedSet(T)</tt> type (an instance of {@link OrderedSetType})
     */
	Type getOrderedSetType();
	
    /**
     * Obtains the generic instance of the {@link BagType} metatype, named
     * <tt>Bag(T)</tt>.
     * 
     * @return the <tt>Bag(T)</tt> type (an instance of {@link BagType})
     */
	Type getBagType();
	
    /**
     * Obtains the generic instance of the {@link SequenceType} metatype, named
     * <tt>Sequence(T)</tt>.
     * 
     * @return the <tt>Sequence(T)</tt> type (an instance of {@link SequenceType})
     */
	Type getSequenceType();
	
    /**
     * Obtains the generic instance of the {@link CollectionType} metatype, named
     * <tt>Collection(T)</tt>.
     * 
     * @return the <tt>Collection(T)</tt> type (an instance of {@link CollectionType})
     */
	Type getCollectionType();
    
    /**
     * Obtains the instance of the {@link ElementType} metatype that represents
     * the type of states in the model, named <tt>State</tt>.
     * 
     * @return the <tt>State</tt> type (an instance of {@link ElementType})
     */
//    Type getState();
    
    /**
     * Obtains the instance of the {@link ElementType} metatype that represents
     * the type of OCL expressions in the model, named <tt>OclExpression</tt>.
     * 
     * @return the <tt>OclExpression</tt> type (an instance of {@link ElementType})
     */
//    Type getOclExpression();
    
    /**
     * Obtains a generic instance of the {@link AnyType} metatype that represents
     * the type parameter of generic types and operations, named <tt>T</tt>.
     * 
     * @return the <tt>T</tt> type parameter (an instance of {@link AnyType})
     */
	@Deprecated
    Type getT();
    
    /**
     * Obtains a generic instance of the {@link AnyType} metatype that represents
     * another type parameter of generic operations (particularly certain
     * OCL {@link #getCollection() Collection} operations), named <tt>T2</tt>.
     * 
     * @return the <tt>T2</tt> type parameter (an instance of {@link AnyType})
     */
	@Deprecated
    Type getT2();

	Type getTypeOfType(Object type);

	Type getTypeOfValue(Object value, Type type);

	Object getValueOfValue(Object value);
	
	boolean isOrdered(Type sourceType);

	boolean isUnique(Type sourceType);
}
