/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryOperation.java,v 1.1.2.2 2010/01/18 08:57:52 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.EvaluationVisitor;

import org.eclipse.ocl.expressions.OperationCallExp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.LibraryOperation#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getLibraryOperation()
 * @model
 * @generated
 */
public interface LibraryOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>References</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLLibraryOperation}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.OCLLibraryOperation#getLibraryOperation <em>Library Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference list.
	 * @see org.eclipse.ocl.library.LibraryPackage#getLibraryOperation_References()
	 * @see org.eclipse.ocl.library.OCLLibraryOperation#getLibraryOperation
	 * @model opposite="libraryOperation" resolveProxies="false"
	 * @generated
	 */
	EList<OCLLibraryOperation> getReferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.ocl.library.Exception" evaluationVisitorDataType="org.eclipse.ocl.library.EvaluationVisitor" operationCallDataType="org.eclipse.ocl.library.OperationCallExp"
	 * @generated
	 */
	Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> evaluationVisitor, Object source, OperationCallExp<?, ?> operationCall) throws Exception;

} // LibraryOperation
