/**
 * <copyright>
 * </copyright>
 *
 * $Id: MergedMetaModelOperation.java,v 1.1.2.2 2010/01/30 07:49:36 ewillink Exp $
 */
package org.eclipse.ocl.library.merged;

import org.eclipse.ocl.utilities.ExpressionInOCL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merged Meta Model Operation</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedMetaModelOperation#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedMetaModelOperation#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedMetaModelOperation()
 * @model
 * @generated
 */
public interface MergedMetaModelOperation extends MergedOperation {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #isSetOperation()
	 * @see #unsetOperation()
	 * @see #setOperation(OCLMetaModelOperation)
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedMetaModelOperation_Operation()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	OCLMetaModelOperation getOperation();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.merged.MergedMetaModelOperation#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #isSetOperation()
	 * @see #unsetOperation()
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(OCLMetaModelOperation value);

	/**
	 * Unsets the value of the '{@link org.eclipse.ocl.library.merged.MergedMetaModelOperation#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperation()
	 * @see #getOperation()
	 * @see #setOperation(OCLMetaModelOperation)
	 * @generated
	 */
	void unsetOperation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.ocl.library.merged.MergedMetaModelOperation#getOperation <em>Operation</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operation</em>' reference is set.
	 * @see #unsetOperation()
	 * @see #getOperation()
	 * @see #setOperation(OCLMetaModelOperation)
	 * @generated
	 */
	boolean isSetOperation();

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
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedMetaModelOperation_Body()
	 * @model
	 * @generated
	 */
	ExpressionInOCL<?, ?> getBody();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.merged.MergedMetaModelOperation#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(ExpressionInOCL<?, ?> value);

} // MergedMetaModelOperation
