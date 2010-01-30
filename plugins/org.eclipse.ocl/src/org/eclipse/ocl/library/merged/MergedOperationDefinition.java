/**
 * <copyright>
 * </copyright>
 *
 * $Id: MergedOperationDefinition.java,v 1.1.2.2 2010/01/30 07:49:36 ewillink Exp $
 */
package org.eclipse.ocl.library.merged;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.library.OCLParameter;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.utilities.ExpressionInOCL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merged Operation Definition</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedOperationDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedOperationDefinition#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedOperationDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedOperationDefinition#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedOperationDefinition()
 * @model
 * @generated
 */
public interface MergedOperationDefinition extends MergedOperation {
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
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedOperationDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.merged.MergedOperationDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedOperationDefinition_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<OCLParameter> getParameter();

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
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedOperationDefinition_Type()
	 * @model required="true"
	 * @generated
	 */
	OCLType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.merged.MergedOperationDefinition#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(OCLType value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(ExpressionInOCL)
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedOperationDefinition_Body()
	 * @model
	 * @generated
	 */
	ExpressionInOCL<?, ?> getBody();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.merged.MergedOperationDefinition#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(ExpressionInOCL<?, ?> value);

} // MergedOperationDefinition
