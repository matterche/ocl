/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreLibraryFactory.java,v 1.1.2.2 2010/01/24 07:40:43 ewillink Exp $
 */
package org.eclipse.ocl.ecore.library;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @since 3.0
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.ecore.library.EcoreLibraryPackage
 * @generated
 */
public interface EcoreLibraryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcoreLibraryFactory eINSTANCE = org.eclipse.ocl.ecore.library.impl.EcoreLibraryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ecore OCL Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore OCL Classifier</em>'.
	 * @generated
	 */
	EcoreOCLClassifier createEcoreOCLClassifier();

	/**
	 * Returns a new object of class '<em>Ecore OCL Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore OCL Data Type</em>'.
	 * @generated
	 */
	EcoreOCLDataType createEcoreOCLDataType();

	/**
	 * Returns a new object of class '<em>Ecore OCL Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore OCL Enumeration</em>'.
	 * @generated
	 */
	EcoreOCLEnumeration createEcoreOCLEnumeration();

	/**
	 * Returns a new object of class '<em>Ecore OCL Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore OCL Enumeration Literal</em>'.
	 * @generated
	 */
	EcoreOCLEnumerationLiteral createEcoreOCLEnumerationLiteral();

	/**
	 * Returns a new object of class '<em>Ecore OCL Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore OCL Operation</em>'.
	 * @generated
	 */
	EcoreOCLOperation createEcoreOCLOperation();

	/**
	 * Returns a new object of class '<em>Ecore OCL Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore OCL Property</em>'.
	 * @generated
	 */
	EcoreOCLProperty createEcoreOCLProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcoreLibraryPackage getEcoreLibraryPackage();

} //EcoreLibraryFactory
