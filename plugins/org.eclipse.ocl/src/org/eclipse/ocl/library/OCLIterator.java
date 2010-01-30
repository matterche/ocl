/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLIterator.java,v 1.1.2.1 2010/01/30 07:49:17 ewillink Exp $
 */
package org.eclipse.ocl.library;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Iterator</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLIterator#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLIterator()
 * @model
 * @generated
 */
public interface OCLIterator extends OCLTypedElement {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.OCLOperation#getIterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(OCLOperation)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLIterator_Container()
	 * @see org.eclipse.ocl.library.OCLOperation#getIterator
	 * @model opposite="iterator" transient="false"
	 * @generated
	 */
	OCLOperation getContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLIterator#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(OCLOperation value);

} // OCLIterator
