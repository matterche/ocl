/**
 * <copyright>
 * </copyright>
 *
 * $Id: UMLLibraryFactory.java,v 1.1.2.1 2010/01/20 09:09:23 ewillink Exp $
 */
package org.eclipse.ocl.uml.library;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.uml.library.UMLLibraryPackage
 * @generated
 */
public interface UMLLibraryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UMLLibraryFactory eINSTANCE = org.eclipse.ocl.uml.library.impl.UMLLibraryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>UMLOCL Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UMLOCL Classifier</em>'.
	 * @generated
	 */
	UMLOCLClassifier createUMLOCLClassifier();

	/**
	 * Returns a new object of class '<em>UMLOCL Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UMLOCL Data Type</em>'.
	 * @generated
	 */
	UMLOCLDataType createUMLOCLDataType();

	/**
	 * Returns a new object of class '<em>UMLOCL Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UMLOCL Enumeration</em>'.
	 * @generated
	 */
	UMLOCLEnumeration createUMLOCLEnumeration();

	/**
	 * Returns a new object of class '<em>UMLOCL Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UMLOCL Enumeration Literal</em>'.
	 * @generated
	 */
	UMLOCLEnumerationLiteral createUMLOCLEnumerationLiteral();

	/**
	 * Returns a new object of class '<em>UMLOCL Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UMLOCL Operation</em>'.
	 * @generated
	 */
	UMLOCLOperation createUMLOCLOperation();

	/**
	 * Returns a new object of class '<em>UMLOCL Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UMLOCL Property</em>'.
	 * @generated
	 */
	UMLOCLProperty createUMLOCLProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UMLLibraryPackage getUMLLibraryPackage();

} //UMLLibraryFactory
