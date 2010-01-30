/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLTypeBinding.java,v 1.1.2.1 2010/01/30 07:49:21 ewillink Exp $
 */
package org.eclipse.ocl.library;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Type Binding</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLTypeBinding#getTypeParameter <em>Type Parameter</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLTypeBinding#getTypeValue <em>Type Value</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLTypeBinding#getBoundType <em>Bound Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLTypeBinding()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TypeParameterDefinedByBoundTypeParent'"
 * @generated
 */
public interface OCLTypeBinding extends OCLElement {

	/**
	 * Returns the value of the '<em><b>Type Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameter</em>' reference.
	 * @see #setTypeParameter(OCLTypeParameter)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLTypeBinding_TypeParameter()
	 * @model required="true"
	 * @generated
	 */
	OCLTypeParameter getTypeParameter();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLTypeBinding#getTypeParameter <em>Type Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Parameter</em>' reference.
	 * @see #getTypeParameter()
	 * @generated
	 */
	void setTypeParameter(OCLTypeParameter value);

	/**
	 * Returns the value of the '<em><b>Type Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Value</em>' reference.
	 * @see #setTypeValue(OCLTypeValue)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLTypeBinding_TypeValue()
	 * @model required="true"
	 * @generated
	 */
	OCLTypeValue getTypeValue();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLTypeBinding#getTypeValue <em>Type Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Value</em>' reference.
	 * @see #getTypeValue()
	 * @generated
	 */
	void setTypeValue(OCLTypeValue value);

	/**
	 * Returns the value of the '<em><b>Bound Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.OCLBoundType#getTypeBinding <em>Type Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Type</em>' container reference.
	 * @see #setBoundType(OCLBoundType)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLTypeBinding_BoundType()
	 * @see org.eclipse.ocl.library.OCLBoundType#getTypeBinding
	 * @model opposite="typeBinding" transient="false"
	 * @generated
	 */
	OCLBoundType getBoundType();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLTypeBinding#getBoundType <em>Bound Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Type</em>' container reference.
	 * @see #getBoundType()
	 * @generated
	 */
	void setBoundType(OCLBoundType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	OCLType getResolvedType();
} // OCLTypeBinding
