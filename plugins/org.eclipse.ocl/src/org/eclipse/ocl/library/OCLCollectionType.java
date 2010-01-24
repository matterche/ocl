/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLCollectionType.java,v 1.1.2.1 2010/01/24 07:40:55 ewillink Exp $
 */
package org.eclipse.ocl.library;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library Collection Type</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLCollectionType#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCollectionType()
 * @model
 * @generated
 */
public interface OCLCollectionType extends OCLType {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' reference.
	 * @see #setElementType(OCLType)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCollectionType_ElementType()
	 * @model
	 * @generated
	 */
	OCLType getElementType();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLCollectionType#getElementType <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(OCLType value);

} // LibraryCollectionType
