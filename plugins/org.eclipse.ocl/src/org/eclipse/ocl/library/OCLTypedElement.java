/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLTypedElement.java,v 1.1.2.2 2010/01/30 07:49:17 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Typed Element</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLTypedElement#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLTypedElement#getBoundType <em>Bound Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLTypedElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ReferencedTypeIsBound'"
 * @generated
 */
public interface OCLTypedElement extends OCLNamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(OCLTypeValue)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLTypedElement_Type()
	 * @model required="true"
	 * @generated
	 */
	OCLTypeValue getType();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLTypedElement#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(OCLTypeValue value);

	/**
	 * Returns the value of the '<em><b>Bound Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLBoundType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Type</em>' containment reference list.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLTypedElement_BoundType()
	 * @model containment="true"
	 * @generated
	 */
	EList<OCLBoundType> getBoundType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextTypeRequired="true"
	 * @generated
	 */
	OCLType getResolvedType(OCLType contextType);

} // OCLTypedElement
