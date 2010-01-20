/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreLibraryFactoryImpl.java,v 1.1.2.1 2010/01/20 09:09:37 ewillink Exp $
 */
package org.eclipse.ocl.ecore.library.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.ocl.ecore.library.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreLibraryFactoryImpl extends EFactoryImpl implements EcoreLibraryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcoreLibraryFactory init() {
		try {
			EcoreLibraryFactory theEcoreLibraryFactory = (EcoreLibraryFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/ocl/3.0.0/EcoreLibrary"); //$NON-NLS-1$ 
			if (theEcoreLibraryFactory != null) {
				return theEcoreLibraryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcoreLibraryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreLibraryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EcoreLibraryPackage.ECORE_OCL_CLASSIFIER: return createEcoreOCLClassifier();
			case EcoreLibraryPackage.ECORE_OCL_DATA_TYPE: return createEcoreOCLDataType();
			case EcoreLibraryPackage.ECORE_OCL_ENUMERATION: return createEcoreOCLEnumeration();
			case EcoreLibraryPackage.ECORE_OCL_ENUMERATION_LITERAL: return createEcoreOCLEnumerationLiteral();
			case EcoreLibraryPackage.ECORE_OCL_OPERATION: return createEcoreOCLOperation();
			case EcoreLibraryPackage.ECORE_OCL_PROPERTY: return createEcoreOCLProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreOCLClassifier createEcoreOCLClassifier() {
		EcoreOCLClassifierImpl ecoreOCLClassifier = new EcoreOCLClassifierImpl();
		return ecoreOCLClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreOCLDataType createEcoreOCLDataType() {
		EcoreOCLDataTypeImpl ecoreOCLDataType = new EcoreOCLDataTypeImpl();
		return ecoreOCLDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreOCLEnumeration createEcoreOCLEnumeration() {
		EcoreOCLEnumerationImpl ecoreOCLEnumeration = new EcoreOCLEnumerationImpl();
		return ecoreOCLEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreOCLEnumerationLiteral createEcoreOCLEnumerationLiteral() {
		EcoreOCLEnumerationLiteralImpl ecoreOCLEnumerationLiteral = new EcoreOCLEnumerationLiteralImpl();
		return ecoreOCLEnumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreOCLOperation createEcoreOCLOperation() {
		EcoreOCLOperationImpl ecoreOCLOperation = new EcoreOCLOperationImpl();
		return ecoreOCLOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreOCLProperty createEcoreOCLProperty() {
		EcoreOCLPropertyImpl ecoreOCLProperty = new EcoreOCLPropertyImpl();
		return ecoreOCLProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreLibraryPackage getEcoreLibraryPackage() {
		return (EcoreLibraryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcoreLibraryPackage getPackage() {
		return EcoreLibraryPackage.eINSTANCE;
	}

} //EcoreLibraryFactoryImpl
