/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLConstraintProperty.java,v 1.1.2.3 2010/01/20 16:57:26 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.ocl.utilities.ExpressionInOCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Constraint Property</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLConstraintProperty#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLConstraintProperty#getStereotype <em>Stereotype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLConstraintProperty()
 * @model
 * @generated
 */
public interface OCLConstraintProperty extends OCLProperty {

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' attribute.
	 * @see #setSpecification(ExpressionInOCL)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLConstraintProperty_Specification()
	 * @model dataType="org.eclipse.ocl.library.ExpressionInOCL"
	 * @generated
	 */
	ExpressionInOCL<?, ?> getSpecification();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLConstraintProperty#getSpecification <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' attribute.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(ExpressionInOCL<?, ?> value);

	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see #setStereotype(String)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLConstraintProperty_Stereotype()
	 * @model required="true"
	 * @generated
	 */
	String getStereotype();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLConstraintProperty#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(String value);
} // OCLConstraintProperty
