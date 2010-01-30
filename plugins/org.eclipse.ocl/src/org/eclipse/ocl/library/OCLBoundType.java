/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLBoundType.java,v 1.1.2.1 2010/01/30 07:49:20 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Bound Type</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLBoundType#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLBoundType#getTypeBinding <em>Type Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLBoundType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OneTypeBindingForEachTypeParameter'"
 * @generated
 */
public interface OCLBoundType extends OCLType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(OCLType)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLBoundType_Type()
	 * @model required="true"
	 * @generated
	 */
	OCLType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLBoundType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(OCLType value);

	/**
	 * Returns the value of the '<em><b>Type Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLTypeBinding}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.OCLTypeBinding#getBoundType <em>Bound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Binding</em>' containment reference list.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLBoundType_TypeBinding()
	 * @see org.eclipse.ocl.library.OCLTypeBinding#getBoundType
	 * @model opposite="boundType" containment="true"
	 * @generated
	 */
	EList<OCLTypeBinding> getTypeBinding();

} // OCLBoundType
