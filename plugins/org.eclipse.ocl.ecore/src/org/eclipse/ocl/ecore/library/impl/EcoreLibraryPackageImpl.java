/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreLibraryPackageImpl.java,v 1.1.2.1 2010/01/20 09:09:37 ewillink Exp $
 */
package org.eclipse.ocl.ecore.library.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.ocl.ecore.library.EcoreLibraryFactory;
import org.eclipse.ocl.ecore.library.EcoreLibraryPackage;
import org.eclipse.ocl.ecore.library.EcoreOCLClassifier;
import org.eclipse.ocl.ecore.library.EcoreOCLDataType;
import org.eclipse.ocl.ecore.library.EcoreOCLEnumeration;
import org.eclipse.ocl.ecore.library.EcoreOCLEnumerationLiteral;
import org.eclipse.ocl.ecore.library.EcoreOCLOperation;
import org.eclipse.ocl.ecore.library.EcoreOCLProperty;

import org.eclipse.ocl.library.LibraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreLibraryPackageImpl extends EPackageImpl implements EcoreLibraryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreOCLClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreOCLDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreOCLEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreOCLEnumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreOCLOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreOCLPropertyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.ocl.ecore.library.EcoreLibraryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcoreLibraryPackageImpl() {
		super(eNS_URI, EcoreLibraryFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EcoreLibraryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcoreLibraryPackage init() {
		if (isInited) return (EcoreLibraryPackage)EPackage.Registry.INSTANCE.getEPackage(EcoreLibraryPackage.eNS_URI);

		// Obtain or create and register package
		EcoreLibraryPackageImpl theEcoreLibraryPackage = (EcoreLibraryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcoreLibraryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EcoreLibraryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		LibraryPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEcoreLibraryPackage.createPackageContents();

		// Initialize created meta-data
		theEcoreLibraryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcoreLibraryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcoreLibraryPackage.eNS_URI, theEcoreLibraryPackage);
		return theEcoreLibraryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreOCLClassifier() {
		return ecoreOCLClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreOCLDataType() {
		return ecoreOCLDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreOCLEnumeration() {
		return ecoreOCLEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreOCLEnumerationLiteral() {
		return ecoreOCLEnumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreOCLOperation() {
		return ecoreOCLOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreOCLProperty() {
		return ecoreOCLPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreLibraryFactory getEcoreLibraryFactory() {
		return (EcoreLibraryFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ecoreOCLClassifierEClass = createEClass(ECORE_OCL_CLASSIFIER);

		ecoreOCLDataTypeEClass = createEClass(ECORE_OCL_DATA_TYPE);

		ecoreOCLEnumerationEClass = createEClass(ECORE_OCL_ENUMERATION);

		ecoreOCLEnumerationLiteralEClass = createEClass(ECORE_OCL_ENUMERATION_LITERAL);

		ecoreOCLOperationEClass = createEClass(ECORE_OCL_OPERATION);

		ecoreOCLPropertyEClass = createEClass(ECORE_OCL_PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		LibraryPackage theLibraryPackage = (LibraryPackage)EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ecoreOCLClassifierEClass.getESuperTypes().add(theLibraryPackage.getOCLClassifier());
		ecoreOCLDataTypeEClass.getESuperTypes().add(theLibraryPackage.getOCLDataType());
		ecoreOCLEnumerationEClass.getESuperTypes().add(theLibraryPackage.getOCLEnumeration());
		ecoreOCLEnumerationLiteralEClass.getESuperTypes().add(theLibraryPackage.getOCLEnumerationLiteral());
		ecoreOCLOperationEClass.getESuperTypes().add(theLibraryPackage.getOCLMetaModelOperation());
		ecoreOCLPropertyEClass.getESuperTypes().add(theLibraryPackage.getOCLMetaModelProperty());

		// Initialize classes and features; add operations and parameters
		initEClass(ecoreOCLClassifierEClass, EcoreOCLClassifier.class, "EcoreOCLClassifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ecoreOCLDataTypeEClass, EcoreOCLDataType.class, "EcoreOCLDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ecoreOCLEnumerationEClass, EcoreOCLEnumeration.class, "EcoreOCLEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ecoreOCLEnumerationLiteralEClass, EcoreOCLEnumerationLiteral.class, "EcoreOCLEnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ecoreOCLOperationEClass, EcoreOCLOperation.class, "EcoreOCLOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ecoreOCLPropertyEClass, EcoreOCLProperty.class, "EcoreOCLProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //EcoreLibraryPackageImpl
