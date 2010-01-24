/**
 * <copyright>
 * </copyright>
 *
 * $Id: MergedLibraryProperty.java,v 1.1.2.1 2010/01/24 07:41:02 ewillink Exp $
 */
package org.eclipse.ocl.library.merged;

import org.eclipse.ocl.library.OCLLibraryProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merged Property Reference</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedLibraryProperty#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedLibraryProperty()
 * @model
 * @generated
 */
public interface MergedLibraryProperty extends MergedProperty {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #isSetProperty()
	 * @see #unsetProperty()
	 * @see #setProperty(OCLLibraryProperty)
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedLibraryProperty_Property()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	OCLLibraryProperty getProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.merged.MergedLibraryProperty#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #isSetProperty()
	 * @see #unsetProperty()
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(OCLLibraryProperty value);

	/**
	 * Unsets the value of the '{@link org.eclipse.ocl.library.merged.MergedLibraryProperty#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProperty()
	 * @see #getProperty()
	 * @see #setProperty(OCLLibraryProperty)
	 * @generated
	 */
	void unsetProperty();

	/**
	 * Returns whether the value of the '{@link org.eclipse.ocl.library.merged.MergedLibraryProperty#getProperty <em>Property</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Property</em>' reference is set.
	 * @see #unsetProperty()
	 * @see #getProperty()
	 * @see #setProperty(OCLLibraryProperty)
	 * @generated
	 */
	boolean isSetProperty();

} // MergedPropertyReference
