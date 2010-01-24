/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLMetaModelProperty.java,v 1.1.2.5 2010/01/24 07:40:57 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.PropertyCallExp;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Meta Model Property</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLMetaModelProperty#getMetaModelElement <em>Meta Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLMetaModelProperty()
 * @model abstract="true"
 * @generated
 */
public interface OCLMetaModelProperty extends OCLProperty {
	/**
	 * Returns the value of the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Model Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Model Element</em>' reference.
	 * @see #setMetaModelElement(EObject)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLMetaModelProperty_MetaModelElement()
	 * @model
	 * @generated
	 */
	EObject getMetaModelElement();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLMetaModelProperty#getMetaModelElement <em>Meta Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Model Element</em>' reference.
	 * @see #getMetaModelElement()
	 * @generated
	 */
	void setMetaModelElement(EObject value);

	<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(
			EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> evaluationVisitor,
			Object sourceVal, PropertyCallExp<C, P> propertyCall);
} // OCLMetaModelProperty
