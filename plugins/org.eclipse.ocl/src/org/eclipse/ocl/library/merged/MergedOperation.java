/**
 * <copyright>
 * </copyright>
 *
 * $Id: MergedOperation.java,v 1.1.2.2 2010/01/30 07:49:32 ewillink Exp $
 */
package org.eclipse.ocl.library.merged;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.OCLElement;
import org.eclipse.ocl.library.OCLParameter;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.OCLTypeParameter;
import org.eclipse.ocl.utilities.ExpressionInOCL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Merged Operation</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedOperation#getPost <em>Post</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedOperation#getPre <em>Pre</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedOperation()
 * @model abstract="true"
 * @generated
 */
public interface MergedOperation extends OCLElement {
	/**
	 * Returns the value of the '<em><b>Post</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.ocl.utilities.ExpressionInOCL}&lt;?, ?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' reference list.
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedOperation_Post()
	 * @model
	 * @generated
	 */
	EList<ExpressionInOCL<?, ?>> getPost();

	/**
	 * Returns the value of the '<em><b>Pre</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.ocl.utilities.ExpressionInOCL}&lt;?, ?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' reference list.
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedOperation_Pre()
	 * @model
	 * @generated
	 */
	EList<ExpressionInOCL<?, ?>> getPre();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ExpressionInOCL<?, ?> getBody();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<OCLParameter> getParameter();

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
	 * @model kind="operation"
	 * @generated
	 */
	EList<OCLTypeParameter> getTypeParameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isStatic();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setBody(ExpressionInOCL<?, ?> body);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.ocl.library.Exception" evaluationVisitorDataType="org.eclipse.ocl.library.EvaluationVisitor" operationCallDataType="org.eclipse.ocl.library.OperationCallExp"
	 * @generated NOT
	 */
	<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> evaluationVisitor, Object sourceVal, OperationCallExp<C, O> operationCall);

} // OCLMergedOperation
