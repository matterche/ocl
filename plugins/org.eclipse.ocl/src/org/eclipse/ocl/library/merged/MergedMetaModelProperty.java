/**
 * <copyright>
 * </copyright>
 *
 * $Id: MergedMetaModelProperty.java,v 1.1.2.1 2010/01/24 07:41:03 ewillink Exp $
 */
package org.eclipse.ocl.library.merged;

import org.eclipse.ocl.library.OCLMetaModelProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merged Meta Model Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedMetaModelProperty#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedMetaModelProperty()
 * @model
 * @generated
 */
public interface MergedMetaModelProperty extends MergedProperty {
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
	 * @see #setProperty(OCLMetaModelProperty)
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedMetaModelProperty_Property()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	OCLMetaModelProperty getProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.merged.MergedMetaModelProperty#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #isSetProperty()
	 * @see #unsetProperty()
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(OCLMetaModelProperty value);

	/**
	 * Unsets the value of the '{@link org.eclipse.ocl.library.merged.MergedMetaModelProperty#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProperty()
	 * @see #getProperty()
	 * @see #setProperty(OCLMetaModelProperty)
	 * @generated
	 */
	void unsetProperty();

	/**
	 * Returns whether the value of the '{@link org.eclipse.ocl.library.merged.MergedMetaModelProperty#getProperty <em>Property</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Property</em>' reference is set.
	 * @see #unsetProperty()
	 * @see #getProperty()
	 * @see #setProperty(OCLMetaModelProperty)
	 * @generated
	 */
	boolean isSetProperty();

} // MergedMetaModelProperty
