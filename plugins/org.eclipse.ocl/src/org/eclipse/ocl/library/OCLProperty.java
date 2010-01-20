/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLProperty.java,v 1.1.2.4 2010/01/20 16:57:25 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.PropertyCallExp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Property</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLProperty#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLProperty#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLProperty()
 * @model abstract="true"
 * @generated
 */
public interface OCLProperty extends OCLElement {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.OCLType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(OCLType)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLProperty_Container()
	 * @see org.eclipse.ocl.library.OCLType#getProperty
	 * @model opposite="property" transient="false"
	 * @generated
	 */
	OCLType getContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLProperty#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(OCLType value);

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
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLProperty_Type()
	 * @model required="true"
	 * @generated
	 */
	OCLType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLProperty#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(OCLType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.ocl.library.Exception" evaluationVisitorDataType="org.eclipse.ocl.library.EvaluationVisitor" propertyCallDataType="org.eclipse.ocl.library.PropertyCallExp"
	 * @generated
	 */
	Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> evaluationVisitor, Object source, PropertyCallExp<?, ?> propertyCall) throws Exception;

} // OCLProperty
