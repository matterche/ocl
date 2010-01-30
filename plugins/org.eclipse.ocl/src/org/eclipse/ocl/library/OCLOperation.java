/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLOperation.java,v 1.1.2.7 2010/01/30 07:49:17 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Operation</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLOperation#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLOperation#isStatic <em>Is Static</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLOperation#getIterator <em>Iterator</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLOperation#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLOperation()
 * @model abstract="true"
 * @generated
 */
public interface OCLOperation extends OCLTypedElement, OCLTypeParameterParent {
	/**
	 * Returns the value of the '<em><b>Iterator</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLIterator}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.OCLIterator#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator</em>' containment reference list.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLOperation_Iterator()
	 * @see org.eclipse.ocl.library.OCLIterator#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<OCLIterator> getIterator();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLParameter}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.OCLParameter#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLOperation_Parameter()
	 * @see org.eclipse.ocl.library.OCLParameter#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<OCLParameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.OCLConcreteType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(OCLConcreteType)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLOperation_Container()
	 * @see org.eclipse.ocl.library.OCLConcreteType#getOperation
	 * @model opposite="operation" transient="false"
	 * @generated
	 */
	OCLConcreteType getContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLOperation#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(OCLConcreteType value);

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLOperation_IsStatic()
	 * @model default="false"
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLOperation#isStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

} // OCLOperation
