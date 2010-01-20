/**
 * <copyright>
 * </copyright>
 *
 * $Id: UMLLibraryFactoryImpl.java,v 1.1.2.1 2010/01/20 09:09:24 ewillink Exp $
 */
package org.eclipse.ocl.uml.library.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.ocl.uml.library.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLLibraryFactoryImpl extends EFactoryImpl implements UMLLibraryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UMLLibraryFactory init() {
		try {
			UMLLibraryFactory theUMLLibraryFactory = (UMLLibraryFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/ocl/3.0.0/UMLLibrary"); //$NON-NLS-1$ 
			if (theUMLLibraryFactory != null) {
				return theUMLLibraryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UMLLibraryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLLibraryFactoryImpl() {
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
			case UMLLibraryPackage.UMLOCL_CLASSIFIER: return createUMLOCLClassifier();
			case UMLLibraryPackage.UMLOCL_DATA_TYPE: return createUMLOCLDataType();
			case UMLLibraryPackage.UMLOCL_ENUMERATION: return createUMLOCLEnumeration();
			case UMLLibraryPackage.UMLOCL_ENUMERATION_LITERAL: return createUMLOCLEnumerationLiteral();
			case UMLLibraryPackage.UMLOCL_OPERATION: return createUMLOCLOperation();
			case UMLLibraryPackage.UMLOCL_PROPERTY: return createUMLOCLProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLOCLClassifier createUMLOCLClassifier() {
		UMLOCLClassifierImpl umloclClassifier = new UMLOCLClassifierImpl();
		return umloclClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLOCLDataType createUMLOCLDataType() {
		UMLOCLDataTypeImpl umloclDataType = new UMLOCLDataTypeImpl();
		return umloclDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLOCLEnumeration createUMLOCLEnumeration() {
		UMLOCLEnumerationImpl umloclEnumeration = new UMLOCLEnumerationImpl();
		return umloclEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLOCLEnumerationLiteral createUMLOCLEnumerationLiteral() {
		UMLOCLEnumerationLiteralImpl umloclEnumerationLiteral = new UMLOCLEnumerationLiteralImpl();
		return umloclEnumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLOCLOperation createUMLOCLOperation() {
		UMLOCLOperationImpl umloclOperation = new UMLOCLOperationImpl();
		return umloclOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLOCLProperty createUMLOCLProperty() {
		UMLOCLPropertyImpl umloclProperty = new UMLOCLPropertyImpl();
		return umloclProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLLibraryPackage getUMLLibraryPackage() {
		return (UMLLibraryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UMLLibraryPackage getPackage() {
		return UMLLibraryPackage.eINSTANCE;
	}

} //UMLLibraryFactoryImpl
