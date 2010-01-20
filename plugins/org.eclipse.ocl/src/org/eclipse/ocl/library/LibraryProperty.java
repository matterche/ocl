/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryProperty.java,v 1.1.2.1 2010/01/20 09:09:33 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.EvaluationVisitor;

import org.eclipse.ocl.expressions.PropertyCallExp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.LibraryProperty#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getLibraryProperty()
 * @model
 * @generated
 */
public interface LibraryProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>References</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLLibraryProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference list.
	 * @see org.eclipse.ocl.library.LibraryPackage#getLibraryProperty_References()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<OCLLibraryProperty> getReferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.ocl.library.Exception" evaluationVisitorDataType="org.eclipse.ocl.library.EvaluationVisitor" propertyCallDataType="org.eclipse.ocl.library.PropertyCallExp"
	 * @generated
	 */
	Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> evaluationVisitor, Object source, PropertyCallExp<?, ?> propertyCall) throws Exception;

} // LibraryProperty
