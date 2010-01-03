/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLOperation.java,v 1.1.2.3 2010/01/03 22:53:47 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Operation</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLOperation#isIterator <em>Is Iterator</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLOperation#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLOperation#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLOperation#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLOperation()
 * @model abstract="true"
 * @generated
 */
public interface OCLOperation extends OCLElement {
	/**
	 * Returns the value of the '<em><b>Is Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Iterator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Iterator</em>' attribute.
	 * @see #setIsIterator(boolean)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLOperation_IsIterator()
	 * @model
	 * @generated
	 */
	boolean isIterator();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLOperation#isIterator <em>Is Iterator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Iterator</em>' attribute.
	 * @see #isIterator()
	 * @generated
	 */
	void setIsIterator(boolean value);

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
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLOperation_Parameter()
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
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLOperation_Type()
	 * @model required="true"
	 * @generated
	 */
	OCLType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLOperation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(OCLType value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.OCLType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(OCLType)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLOperation_Container()
	 * @see org.eclipse.ocl.library.OCLType#getOperation
	 * @model opposite="operation" transient="false"
	 * @generated
	 */
	OCLType getContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLOperation#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(OCLType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.ocl.library.Exception" evaluationVisitorDataType="org.eclipse.ocl.library.EvaluationVisitor" operationCallDataType="org.eclipse.ocl.library.OperationCallExp"
	 * @generated
	 */
	Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> evaluationVisitor, OperationCallExp<?, ?> operationCall) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Object getOperationCode();

} // OCLOperation
