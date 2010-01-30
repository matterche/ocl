/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLMergedLibraryFactory.java,v 1.1.2.2 2010/01/30 07:49:33 ewillink Exp $
 */
package org.eclipse.ocl.library.merged;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @since 3.0
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage
 * @generated
 */
public interface OCLMergedLibraryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OCLMergedLibraryFactory eINSTANCE = org.eclipse.ocl.library.merged.impl.OCLMergedLibraryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Merged Library Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merged Library Operation</em>'.
	 * @generated
	 */
	MergedLibraryOperation createMergedLibraryOperation();

	/**
	 * Returns a new object of class '<em>Merged Library Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merged Library Property</em>'.
	 * @generated
	 */
	MergedLibraryProperty createMergedLibraryProperty();

	/**
	 * Returns a new object of class '<em>Merged Meta Model Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merged Meta Model Operation</em>'.
	 * @generated
	 */
	MergedMetaModelOperation createMergedMetaModelOperation();

	/**
	 * Returns a new object of class '<em>Merged Meta Model Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merged Meta Model Property</em>'.
	 * @generated
	 */
	MergedMetaModelProperty createMergedMetaModelProperty();

	/**
	 * Returns a new object of class '<em>Merged Operation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merged Operation Definition</em>'.
	 * @generated
	 */
	MergedOperationDefinition createMergedOperationDefinition();

	/**
	 * Returns a new object of class '<em>Merged Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merged Property Definition</em>'.
	 * @generated
	 */
	MergedPropertyDefinition createMergedPropertyDefinition();

	/**
	 * Returns a new object of class '<em>Merged Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merged Type</em>'.
	 * @generated
	 */
	MergedType createMergedType();

	/**
	 * Returns a new object of class '<em>OCL Bound Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Bound Collection Type</em>'.
	 * @generated
	 */
	OCLBoundCollectionType createOCLBoundCollectionType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OCLMergedLibraryPackage getOCLMergedLibraryPackage();

} //OCLMergedLibraryFactory
