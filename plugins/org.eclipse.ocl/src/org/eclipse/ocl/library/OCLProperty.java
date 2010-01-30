/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLProperty.java,v 1.1.2.6 2010/01/30 07:49:23 ewillink Exp $
 */
package org.eclipse.ocl.library;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Property</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLProperty#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLProperty#isStatic <em>Is Static</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLProperty()
 * @model abstract="true"
 * @generated
 */
public interface OCLProperty extends OCLTypedElement {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(OCLConcreteType)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLProperty_Container()
	 * @model
	 * @generated
	 */
	OCLConcreteType getContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLProperty#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
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
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLProperty_IsStatic()
	 * @model default="false"
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLProperty#isStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);
} // OCLProperty
