/**
 * <copyright>
 * </copyright>
 *
 * $Id: MergedPropertyDefinition.java,v 1.1.2.1 2010/01/24 07:41:02 ewillink Exp $
 */
package org.eclipse.ocl.library.merged;

import org.eclipse.ocl.library.OCLType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merged Property Definition</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedPropertyDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedPropertyDefinition#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedPropertyDefinition()
 * @model
 * @generated
 */
public interface MergedPropertyDefinition extends MergedProperty {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedPropertyDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.merged.MergedPropertyDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(OCLType)
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedPropertyDefinition_Type()
	 * @model required="true"
	 * @generated
	 */
	OCLType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.merged.MergedPropertyDefinition#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(OCLType value);

} // MergedPropertyDefinition
