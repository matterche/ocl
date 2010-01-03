/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLLibraryOperation.java,v 1.1.2.3 2010/01/03 22:53:47 ewillink Exp $
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
 *   <li>{@link org.eclipse.ocl.library.OCLLibraryOperation#getLibraryOperationClass <em>Library Operation Class</em>}</li>
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
	 * Returns the value of the '<em><b>Library Operation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Operation Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Operation Class</em>' attribute.
	 * @see #setLibraryOperationClass(Class)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLLibraryOperation_LibraryOperationClass()
	 * @model required="true"
	 * @generated
	 */
	Class<? extends LibraryOperation> getLibraryOperationClass();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLLibraryOperation#getLibraryOperationClass <em>Library Operation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Operation Class</em>' attribute.
	 * @see #getLibraryOperationClass()
	 * @generated
	 */
	void setLibraryOperationClass(Class<? extends LibraryOperation> value);

	/**
	 * Returns the value of the '<em><b>Library Operation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.LibraryOperation#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Operation</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLLibraryOperation_LibraryOperation()
	 * @see org.eclipse.ocl.library.LibraryOperation#getReferences
	 * @model opposite="references" resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	LibraryOperation getLibraryOperation();
} // OCLLibraryOperation
