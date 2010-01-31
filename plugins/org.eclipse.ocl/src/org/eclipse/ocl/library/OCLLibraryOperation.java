/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLLibraryOperation.java,v 1.1.2.7 2010/01/31 22:23:43 ewillink Exp $
 */
package org.eclipse.ocl.library;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Library Operation</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLLibraryOperation#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLLibraryOperation#getLibraryOperation <em>Library Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLLibraryOperation()
 * @model
 * @generated
 */
public interface OCLLibraryOperation extends OCLOperation {

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass_(Class)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLLibraryOperation_Class()
	 * @model required="true"
	 * @generated
	 */
	Class<? extends LibraryOperation> getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLLibraryOperation#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass_(Class<? extends LibraryOperation> value);

	/**
	 * Returns the value of the '<em><b>Library Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Operation</em>' attribute.
	 * @see #setLibraryOperation(LibraryOperation)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLLibraryOperation_LibraryOperation()
	 * @model dataType="org.eclipse.ocl.library.LibraryOperation" transient="true"
	 * @generated
	 */
	LibraryOperation getLibraryOperation();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLLibraryOperation#getLibraryOperation <em>Library Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Operation</em>' attribute.
	 * @see #getLibraryOperation()
	 * @generated
	 */
	void setLibraryOperation(LibraryOperation value);
} // OCLLibraryOperation
