/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLLibraryProperty.java,v 1.1.2.6 2010/01/31 22:23:43 ewillink Exp $
 */
package org.eclipse.ocl.library;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Library Property</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLLibraryProperty#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLLibraryProperty#getLibraryProperty <em>Library Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLLibraryProperty()
 * @model
 * @generated
 */
public interface OCLLibraryProperty extends OCLProperty {

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
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLLibraryProperty_Class()
	 * @model required="true"
	 * @generated
	 */
	Class<? extends LibraryProperty> getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLLibraryProperty#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass_(Class<? extends LibraryProperty> value);

	/**
	 * Returns the value of the '<em><b>Library Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Property</em>' attribute.
	 * @see #setLibraryProperty(LibraryProperty)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLLibraryProperty_LibraryProperty()
	 * @model dataType="org.eclipse.ocl.library.LibraryProperty" transient="true"
	 * @generated
	 */
	LibraryProperty getLibraryProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLLibraryProperty#getLibraryProperty <em>Library Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Property</em>' attribute.
	 * @see #getLibraryProperty()
	 * @generated
	 */
	void setLibraryProperty(LibraryProperty value);
} // OCLLibraryProperty
