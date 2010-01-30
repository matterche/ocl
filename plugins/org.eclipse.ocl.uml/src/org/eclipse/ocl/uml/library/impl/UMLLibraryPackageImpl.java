/**
 * <copyright>
 * </copyright>
 *
 * $Id: UMLLibraryPackageImpl.java,v 1.1.2.3 2010/01/30 07:49:48 ewillink Exp $
 */
package org.eclipse.ocl.uml.library.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.ocl.library.merged.OCLMergedLibraryPackage;
import org.eclipse.ocl.uml.library.UMLLibraryFactory;
import org.eclipse.ocl.uml.library.UMLLibraryPackage;
import org.eclipse.ocl.uml.library.UMLOCLClassifier;
import org.eclipse.ocl.uml.library.UMLOCLDataType;
import org.eclipse.ocl.uml.library.UMLOCLEnumeration;
import org.eclipse.ocl.uml.library.UMLOCLEnumerationLiteral;
import org.eclipse.ocl.uml.library.UMLOCLOperation;
import org.eclipse.ocl.uml.library.UMLOCLProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLLibraryPackageImpl extends EPackageImpl implements UMLLibraryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umloclClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umloclDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umloclEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umloclEnumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umloclOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umloclPropertyEClass = null;

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
	 * @see org.eclipse.ocl.uml.library.UMLLibraryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UMLLibraryPackageImpl() {
		super(eNS_URI, UMLLibraryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UMLLibraryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UMLLibraryPackage init() {
		if (isInited) return (UMLLibraryPackage)EPackage.Registry.INSTANCE.getEPackage(UMLLibraryPackage.eNS_URI);

		// Obtain or create and register package
		UMLLibraryPackageImpl theUMLLibraryPackage = (UMLLibraryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UMLLibraryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UMLLibraryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OCLMergedLibraryPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUMLLibraryPackage.createPackageContents();

		// Initialize created meta-data
		theUMLLibraryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUMLLibraryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UMLLibraryPackage.eNS_URI, theUMLLibraryPackage);
		return theUMLLibraryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLOCLClassifier() {
		return umloclClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLOCLDataType() {
		return umloclDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLOCLEnumeration() {
		return umloclEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLOCLEnumerationLiteral() {
		return umloclEnumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLOCLOperation() {
		return umloclOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLOCLProperty() {
		return umloclPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLLibraryFactory getUMLLibraryFactory() {
		return (UMLLibraryFactory)getEFactoryInstance();
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
		umloclClassifierEClass = createEClass(UMLOCL_CLASSIFIER);

		umloclDataTypeEClass = createEClass(UMLOCL_DATA_TYPE);

		umloclEnumerationEClass = createEClass(UMLOCL_ENUMERATION);

		umloclEnumerationLiteralEClass = createEClass(UMLOCL_ENUMERATION_LITERAL);

		umloclOperationEClass = createEClass(UMLOCL_OPERATION);

		umloclPropertyEClass = createEClass(UMLOCL_PROPERTY);
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
		OCLMergedLibraryPackage theOCLMergedLibraryPackage = (OCLMergedLibraryPackage)EPackage.Registry.INSTANCE.getEPackage(OCLMergedLibraryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		umloclClassifierEClass.getESuperTypes().add(theOCLMergedLibraryPackage.getOCLClassifier());
		umloclDataTypeEClass.getESuperTypes().add(theOCLMergedLibraryPackage.getOCLDataType());
		umloclEnumerationEClass.getESuperTypes().add(theOCLMergedLibraryPackage.getOCLEnumeration());
		umloclEnumerationLiteralEClass.getESuperTypes().add(theOCLMergedLibraryPackage.getOCLEnumerationLiteral());
		umloclOperationEClass.getESuperTypes().add(theOCLMergedLibraryPackage.getOCLMetaModelOperation());
		umloclPropertyEClass.getESuperTypes().add(theOCLMergedLibraryPackage.getOCLMetaModelProperty());

		// Initialize classes and features; add operations and parameters
		initEClass(umloclClassifierEClass, UMLOCLClassifier.class, "UMLOCLClassifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(umloclDataTypeEClass, UMLOCLDataType.class, "UMLOCLDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(umloclEnumerationEClass, UMLOCLEnumeration.class, "UMLOCLEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(umloclEnumerationLiteralEClass, UMLOCLEnumerationLiteral.class, "UMLOCLEnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(umloclOperationEClass, UMLOCLOperation.class, "UMLOCLOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(umloclPropertyEClass, UMLOCLProperty.class, "UMLOCLProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //UMLLibraryPackageImpl
