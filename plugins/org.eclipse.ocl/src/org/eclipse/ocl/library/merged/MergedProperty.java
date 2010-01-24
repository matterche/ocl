/**
 * <copyright>
 * </copyright>
 *
 * $Id: MergedProperty.java,v 1.1.2.1 2010/01/24 07:41:02 ewillink Exp $
 */
package org.eclipse.ocl.library.merged;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.PropertyCallExp;
import org.eclipse.ocl.library.OCLElement;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.utilities.ExpressionInOCL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Merged Property</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedProperty#getInit <em>Init</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedProperty#getDerive <em>Derive</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedProperty()
 * @model abstract="true"
 * @generated
 */
public interface MergedProperty extends OCLElement {
	/**
	 * Returns the value of the '<em><b>Init</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' reference.
	 * @see #setInit(ExpressionInOCL)
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedProperty_Init()
	 * @model
	 * @generated
	 */
	ExpressionInOCL<?, ?> getInit();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.merged.MergedProperty#getInit <em>Init</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' reference.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(ExpressionInOCL<?, ?> value);

	/**
	 * Returns the value of the '<em><b>Derive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derive</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derive</em>' reference.
	 * @see #setDerive(ExpressionInOCL)
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedProperty_Derive()
	 * @model
	 * @generated
	 */
	ExpressionInOCL<?, ?> getDerive();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.merged.MergedProperty#getDerive <em>Derive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derive</em>' reference.
	 * @see #getDerive()
	 * @generated
	 */
	void setDerive(ExpressionInOCL<?, ?> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	OCLType getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.ocl.library.Exception" evaluationVisitorDataType="org.eclipse.ocl.library.EvaluationVisitor" propertyCallDataType="org.eclipse.ocl.library.PropertyCallExp"
	 * @generated NOT
	 */
	<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> evaluationVisitor, Object source, PropertyCallExp<C, P> propertyCall) throws Exception;
} // OCLMergedProperty
