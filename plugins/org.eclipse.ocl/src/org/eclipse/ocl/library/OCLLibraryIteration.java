/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLLibraryIteration.java,v 1.1.2.1 2010/01/31 22:23:43 ewillink Exp $
 */
package org.eclipse.ocl.library;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Library Iteration</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLLibraryIteration#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLLibraryIteration#getLibraryIteration <em>Library Iteration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLLibraryIteration()
 * @model
 * @generated
 */
public interface OCLLibraryIteration extends OCLIteration {
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
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLLibraryIteration_Class()
	 * @model required="true"
	 * @generated
	 */
	Class<? extends LibraryIteration> getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLLibraryIteration#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass_(Class<? extends LibraryIteration> value);

	/**
	 * Returns the value of the '<em><b>Library Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Iteration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Iteration</em>' attribute.
	 * @see #setLibraryIteration(LibraryIteration)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLLibraryIteration_LibraryIteration()
	 * @model dataType="org.eclipse.ocl.library.LibraryIteration" transient="true"
	 * @generated
	 */
	LibraryIteration getLibraryIteration();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLLibraryIteration#getLibraryIteration <em>Library Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Iteration</em>' attribute.
	 * @see #getLibraryIteration()
	 * @generated
	 */
	void setLibraryIteration(LibraryIteration value);

} // OCLLibraryIteration
