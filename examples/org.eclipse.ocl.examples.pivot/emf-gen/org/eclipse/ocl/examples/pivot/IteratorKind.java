/**
 * <copyright>
 * </copyright>
 *
 * $Id: IteratorKind.java,v 1.1.2.1 2010/12/06 17:20:44 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Iterator Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getIteratorKind()
 * @model
 * @generated
 */
public enum IteratorKind
		implements Enumerator {
	/**
	 * The '<em><b>Parameter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMETER(0, "Parameter", "Parameter"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Iterator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	ITERATOR(1, "Iterator", "Iterator"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Accumulator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCUMULATOR_VALUE
	 * @generated
	 * @ordered
	 */
	ACCUMULATOR(2, "Accumulator", "Accumulator"), /**
	 * The '<em><b>Result</b></em>' literal object.
	 * <!-- begin-user-doc -->
													 * <!-- end-user-doc -->
	 * @see #RESULT_VALUE
	 * @generated
	 * @ordered
	 */
	RESULT(3, "Result", "Result"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Parameter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parameter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARAMETER
	 * @model name="Parameter"
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_VALUE = 0;

	/**
	 * The '<em><b>Iterator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Iterator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITERATOR
	 * @model name="Iterator"
	 * @generated
	 * @ordered
	 */
	public static final int ITERATOR_VALUE = 1;

	/**
	 * The '<em><b>Accumulator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Accumulator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCUMULATOR
	 * @model name="Accumulator"
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_VALUE = 2;

	/**
	 * The '<em><b>Result</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Result</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESULT
	 * @model name="Result"
	 * @generated
	 * @ordered
	 */
	public static final int RESULT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Iterator Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IteratorKind[] VALUES_ARRAY = new IteratorKind[]
		{
			PARAMETER,
			ITERATOR,
			ACCUMULATOR,
			RESULT,
		};

	/**
	 * A public read-only list of all the '<em><b>Iterator Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IteratorKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Iterator Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IteratorKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			IteratorKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Iterator Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IteratorKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			IteratorKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Iterator Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IteratorKind get(int value) {
		switch (value)
		{
			case PARAMETER_VALUE: return PARAMETER;
			case ITERATOR_VALUE: return ITERATOR;
			case ACCUMULATOR_VALUE: return ACCUMULATOR;
			case RESULT_VALUE: return RESULT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private IteratorKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //IteratorKind
