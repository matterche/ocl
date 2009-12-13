/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLParameter.java,v 1.1.2.1 2009/12/13 18:44:51 ewillink Exp $
 */
package org.eclipse.ocl.library;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLParameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLParameter()
 * @model
 * @generated
 */
public interface OCLParameter extends OCLElement {
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
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	OCLType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLParameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(OCLType value);

} // OCLParameter
