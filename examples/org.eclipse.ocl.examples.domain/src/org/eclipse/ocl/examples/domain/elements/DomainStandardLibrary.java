/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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
 * $Id: Bag.java,v 1.2 2011/01/24 20:47:51 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.elements;

import java.util.Enumeration;
import java.util.List;

import org.eclipse.emf.ecore.EClassifier;

/**
 * A representation of the OCL Standard Library, which is the set of singleton
 * instances of the OCL-defined metatypes, including the generic collection
 * types (e.g., <tt>Set(T)</tt>).
 */
public interface DomainStandardLibrary
{
	boolean conformsToCollectionType(DomainCollectionType firstCollectionType, DomainCollectionType secondCollectionType);

	boolean conformsToLambdaType(DomainLambdaType firstLambdaType, DomainLambdaType secondLambdaType);

	boolean conformsToTupleType(DomainTupleType firstTupleType, DomainTupleType secondTupleType);
	
    /**
     * Obtains the single instance of the {@link DomainClassifierType} metatype, named
     * <tt>AnyClassifier</tt>.
     * 
     * @return the <tt>Classifier</tt> type (an instance of {@link AnyClassifier})
     */
	DomainType getAnyClassifierType();
	
    /**
     * Obtains the generic instance of the {@link BagType} metatype, named
     * <tt>Bag(T)</tt>.
     * 
     * @return the <tt>Bag(T)</tt> type (an instance of {@link BagType})
     */
	DomainType getBagType();

	/**
	 * Return the instance of the Bag metatype whose elements are of elementType.
	 */
	DomainCollectionType getBagType(DomainType elementType);
	
    /**
     * Obtains the instance of the {@link PrimitiveType} metatype, named
     * <tt>Boolean</tt>.
     * 
     * @return the <tt>Boolean</tt> type (an instance of {@link PrimitiveType})
     */
	DomainType getBooleanType();

	/**
	 * Return the instance of the Classifier metatype whose class is classType.
	 */
	DomainClassifierType getClassifierType(DomainType classType);
	
    /**
     * Obtains the generic instance of the {@link CollectionType} metatype, named
     * <tt>Collection(T)</tt>.
     * 
     * @return the <tt>Collection(T)</tt> type (an instance of {@link CollectionType})
     */
	DomainType getCollectionType();
	
	/**
	 * Return the specialized collection type for the containerType for elementType.
	 */
	DomainCollectionType getCollectionType(DomainCollectionType containerType, DomainType elementType);
	
    /**
     * Obtains the single instance of the {@link EnumerationType} metatype, named
     * <tt>Enumeration</tt>.
     * 
     * @return the <tt>Enumeration</tt> type (an instance of {@link Enumeration})
     */
	DomainType getEnumerationType();

	/**
	 * Return the Inheritance dispatch table for a given type.
	 */
	DomainInheritance getInheritance(DomainType type);
	
    /**
     * Obtains the instance of the {@link PrimitiveType} metatype, named
     * <tt>Integer</tt>.
     * 
     * @return the <tt>Integer</tt> type (an instance of {@link PrimitiveType})
     */
	DomainType getIntegerType();

    /**
     * Returns the meta-type of a given type.
     */
	DomainType getMetaType(DomainType type);
	
    /**
     * Obtains the single instance of the {@link AnyType} metatype, named
     * <tt>OclAny</tt>.
     * 
     * @return the <tt>OclAny</tt> type (an instance of {@link AnyType})
     */
	DomainType getOclAnyType();
	
    /**
     * Obtains the single instance of the {@link OclComparable} metatype, named
     * <tt>OclAny</tt>.
     * 
     * @return the <tt>OclAny</tt> type (an instance of {@link Class})
     */
	DomainType getOclComparableType();

    /**
     * Obtains the single instance of the {@link Class} metatype, named
     * <tt>OclElement</tt>.
     * 
     * @return the <tt>OclElement</tt> type (an instance of {@link Class})
     */
	DomainType getOclElementType();
	
    /**
     * Obtains the single instance of the {@link InvalidType} metatype, named
     * <tt>OclInvalid</tt>.
     * 
     * @return the <tt>OclInvalid</tt> type (an instance of {@link InvalidType})
     */
	DomainType getOclInvalidType();
	
    /**
     * Obtains the generic instance of the {@link MessageType} metatype, named
     * <tt>OclMessage</tt>.
     * 
     * @return the <tt>OclMessage</tt> type (an instance of {@link MessageType})
     */
	DomainType getOclMessageType();

    /**
     * Obtains the single instance of the {@link OclSelf} pseudo-metatype, named
     * <tt>OclSelf</tt>.
     * 
     * @return the <tt>OclSelf</tt> type (an instance of {@link SelfType})
     */
	DomainType getOclSelfType();
	
    /**
     * Obtains the single instance of the {@link OclSummable} metatype, named
     * <tt>OclAny</tt>.
     * 
     * @return the <tt>OclAny</tt> type (an instance of {@link Class})
     */
	DomainType getOclSummableType();
	
    /**
     * Obtains the single instance of the {@link OclTupleType} metatype, named
     * <tt>OclVoid</tt>.
     * 
     * @return the <tt>OclTuple</tt> type (an instance of {@link Class})
     */
	DomainType getOclTupleType();
	
	DomainType getOclType(String typeName);
	
    /**
     * Obtains the single instance of the {@link VoidType} metatype, named
     * <tt>OclVoid</tt>.
     * 
     * @return the <tt>OclVoid</tt> type (an instance of {@link VoidType})
     */
	DomainType getOclVoidType();
	
    /**
     * Obtains the generic instance of the {@link OrderedSetType} metatype, named
     * <tt>OrderedSet(T)</tt>.
     * 
     * @return the <tt>OrderedSet(T)</tt> type (an instance of {@link OrderedSetType})
     */
	DomainType getOrderedSetType();

	/**
	 * Return the instance of the OrderedSet metatype whose elements are of elementType.
	 */
	DomainCollectionType getOrderedSetType(DomainType elementType);
	
    /**
     * Obtains the instance of the {@link PrimitiveType} metatype, named
     * <tt>Real</tt>.
     * 
     * @return the <tt>Real</tt> type (an instance of {@link PrimitiveType})
     */
	DomainType getRealType();
	
    /**
     * Obtains the generic instance of the {@link SequenceType} metatype, named
     * <tt>Sequence(T)</tt>.
     * 
     * @return the <tt>Sequence(T)</tt> type (an instance of {@link SequenceType})
     */
	DomainType getSequenceType();

	/**
	 * Return the instance of the Sequence metatype whose elements are of elementType.
	 */
	DomainCollectionType getSequenceType(DomainType elementType);
	
    /**
     * Obtains the generic instance of the {@link SetType} metatype, named
     * <tt>Set(T)</tt>.
     * 
     * @return the <tt>Set(T)</tt> type (an instance of {@link SetType})
     */
	DomainType getSetType();

	/**
	 * Return the instance of the Set metatype whose elements are of elementType.
	 */
	DomainCollectionType getSetType(DomainType elementType);
	
    /**
     * Obtains the instance of the {@link PrimitiveType} metatype, named
     * <tt>String</tt>.
     * 
     * @return the <tt>String</tt> type (an instance of {@link PrimitiveType})
     */
	DomainType getStringType();

	/**
	 * Obtains the instance of the tuple part description for a name and a type.
	 */
	DomainTypedElement getTuplePart(String name, DomainType type);

	/**
	 * Obtains the instance of the {@link TupleType} metatype for the given list of parts,
	 * which must be alphabetical order by name.
	 */
	DomainTupleType getTupleType(List<? extends DomainTypedElement> parts);
	DomainTupleType getTupleType(DomainTypedElement... parts);

	DomainType getType(DomainElement element);
	DomainType getType(EClassifier eClassifier);
    
    /**
     * Obtains the instance of the {@link PrimitiveType} metatype,
     * named <tt>UnlimitedNatural</tt>.
     * 
     * @return the <tt>UnlimitedNatural</tt> type (an instance of
     *     {@link PrimitiveType})
     */
	DomainType getUnlimitedNaturalType();
	
	boolean isEqualToCollectionType(DomainCollectionType firstCollectionType, DomainCollectionType secondCollectionType);

	boolean isEqualToTupleType(DomainTupleType firstTupleType, DomainTupleType secondTupleType);
}
