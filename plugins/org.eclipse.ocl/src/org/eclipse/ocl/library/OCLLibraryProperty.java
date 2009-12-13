/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLLibraryProperty.java,v 1.1.2.1 2009/12/13 18:44:51 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.ocl.LibraryProperty;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Library Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLLibraryProperty#getLibraryPropertyClass <em>Library Property Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLLibraryProperty()
 * @model
 * @generated
 */
public interface OCLLibraryProperty extends OCLProperty {

	/**
	 * Returns the value of the '<em><b>Library Property Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Property Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Property Class</em>' attribute.
	 * @see #setLibraryPropertyClass(Class)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLLibraryProperty_LibraryPropertyClass()
	 * @model required="true"
	 * @generated
	 */
	Class<? extends LibraryProperty> getLibraryPropertyClass();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLLibraryProperty#getLibraryPropertyClass <em>Library Property Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Property Class</em>' attribute.
	 * @see #getLibraryPropertyClass()
	 * @generated
	 */
	void setLibraryPropertyClass(Class<? extends LibraryProperty> value);
} // OCLLibraryProperty
