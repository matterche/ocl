/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLParameter.java,v 1.1.2.4 2010/01/24 07:40:55 ewillink Exp $
 */
package org.eclipse.ocl.library;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Parameter</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLParameter#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLParameter()
 * @model
 * @generated
 */
public interface OCLParameter extends OCLTypedElement {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.OCLOperation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(OCLOperation)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLParameter_Container()
	 * @see org.eclipse.ocl.library.OCLOperation#getParameter
	 * @model opposite="parameter" transient="false"
	 * @generated
	 */
	OCLOperation getContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLParameter#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(OCLOperation value);

} // OCLParameter
