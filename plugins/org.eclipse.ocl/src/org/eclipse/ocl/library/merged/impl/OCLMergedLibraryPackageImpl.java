/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLMergedLibraryPackageImpl.java,v 1.1.2.2 2010/01/30 07:49:13 ewillink Exp $
 */
package org.eclipse.ocl.library.merged.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.ocl.expressions.ExpressionsPackage;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.merged.MergedLibrary;
import org.eclipse.ocl.library.merged.MergedOperation;
import org.eclipse.ocl.library.merged.MergedOperationDefinition;
import org.eclipse.ocl.library.merged.MergedLibraryOperation;
import org.eclipse.ocl.library.merged.MergedMetaModelOperation;
import org.eclipse.ocl.library.merged.MergedMetaModelProperty;
import org.eclipse.ocl.library.merged.MergedProperty;
import org.eclipse.ocl.library.merged.MergedPropertyDefinition;
import org.eclipse.ocl.library.merged.MergedLibraryProperty;
import org.eclipse.ocl.library.merged.MergedType;
import org.eclipse.ocl.library.merged.OCLBoundCollectionType;
import org.eclipse.ocl.library.merged.OCLClassifier;
import org.eclipse.ocl.library.merged.OCLDataType;
import org.eclipse.ocl.library.merged.OCLEnumeration;
import org.eclipse.ocl.library.merged.OCLEnumerationLiteral;
import org.eclipse.ocl.library.merged.OCLMergedLibraryFactory;
import org.eclipse.ocl.library.merged.OCLMergedLibraryPackage;
import org.eclipse.ocl.library.merged.OCLMetaModelOperation;
import org.eclipse.ocl.library.merged.OCLMetaModelProperty;
import org.eclipse.ocl.library.merged.util.OCLMergedLibraryValidator;
import org.eclipse.ocl.types.TypesPackage;
import org.eclipse.ocl.utilities.UtilitiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * @since 3.0
 * <!-- end-user-doc -->
 * @generated
 */
public class OCLMergedLibraryPackageImpl extends EPackageImpl implements OCLMergedLibraryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergedLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergedLibraryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergedLibraryPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergedMetaModelOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergedMetaModelPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergedOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergedOperationDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergedPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergedPropertyDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclBoundCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclEnumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclMetaModelOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclMetaModelPropertyEClass = null;

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
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OCLMergedLibraryPackageImpl() {
		super(eNS_URI, OCLMergedLibraryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OCLMergedLibraryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OCLMergedLibraryPackage init() {
		if (isInited) return (OCLMergedLibraryPackage)EPackage.Registry.INSTANCE.getEPackage(OCLMergedLibraryPackage.eNS_URI);

		// Obtain or create and register package
		OCLMergedLibraryPackageImpl theOCLMergedLibraryPackage = (OCLMergedLibraryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OCLMergedLibraryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OCLMergedLibraryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();
		UtilitiesPackage.eINSTANCE.eClass();
		ExpressionsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOCLMergedLibraryPackage.createPackageContents();

		// Initialize created meta-data
		theOCLMergedLibraryPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOCLMergedLibraryPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return OCLMergedLibraryValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOCLMergedLibraryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OCLMergedLibraryPackage.eNS_URI, theOCLMergedLibraryPackage);
		return theOCLMergedLibraryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergedLibrary() {
		return mergedLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergedLibrary_BaseLibrary() {
		return (EReference)mergedLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergedLibraryOperation() {
		return mergedLibraryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergedLibraryOperation_Operation() {
		return (EReference)mergedLibraryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergedLibraryProperty() {
		return mergedLibraryPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergedLibraryProperty_Property() {
		return (EReference)mergedLibraryPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergedMetaModelOperation() {
		return mergedMetaModelOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergedMetaModelOperation_Operation() {
		return (EReference)mergedMetaModelOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergedMetaModelOperation_Body() {
		return (EReference)mergedMetaModelOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergedMetaModelProperty() {
		return mergedMetaModelPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergedMetaModelProperty_Property() {
		return (EReference)mergedMetaModelPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergedOperation() {
		return mergedOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergedOperation_Post() {
		return (EReference)mergedOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergedOperation_Pre() {
		return (EReference)mergedOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergedOperationDefinition() {
		return mergedOperationDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMergedOperationDefinition_Name() {
		return (EAttribute)mergedOperationDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergedOperationDefinition_Parameter() {
		return (EReference)mergedOperationDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergedOperationDefinition_Type() {
		return (EReference)mergedOperationDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergedOperationDefinition_Body() {
		return (EReference)mergedOperationDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergedProperty() {
		return mergedPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergedProperty_Init() {
		return (EReference)mergedPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergedProperty_Derive() {
		return (EReference)mergedPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergedPropertyDefinition() {
		return mergedPropertyDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMergedPropertyDefinition_Name() {
		return (EAttribute)mergedPropertyDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergedPropertyDefinition_Type() {
		return (EReference)mergedPropertyDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergedType() {
		return mergedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergedType_MergedLibrary() {
		return (EReference)mergedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergedType_Conforms() {
		return (EReference)mergedTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergedType_Operation() {
		return (EReference)mergedTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergedType_Property() {
		return (EReference)mergedTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergedType_Inv() {
		return (EReference)mergedTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLBoundCollectionType() {
		return oclBoundCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLClassifier() {
		return oclClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLClassifier_MetaModelElement() {
		return (EReference)oclClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLDataType() {
		return oclDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLDataType_MetaModelElement() {
		return (EReference)oclDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLEnumeration() {
		return oclEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLEnumeration_MetaModelElement() {
		return (EReference)oclEnumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLEnumeration_Literals() {
		return (EReference)oclEnumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLEnumerationLiteral() {
		return oclEnumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLEnumerationLiteral_Container() {
		return (EReference)oclEnumerationLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLEnumerationLiteral_MetaModelElement() {
		return (EReference)oclEnumerationLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLMetaModelOperation() {
		return oclMetaModelOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLMetaModelOperation_MetaModelElement() {
		return (EReference)oclMetaModelOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLMetaModelProperty() {
		return oclMetaModelPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLMetaModelProperty_MetaModelElement() {
		return (EReference)oclMetaModelPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergedType_Type() {
		return (EReference)mergedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLMergedLibraryFactory getOCLMergedLibraryFactory() {
		return (OCLMergedLibraryFactory)getEFactoryInstance();
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
		mergedLibraryEClass = createEClass(MERGED_LIBRARY);
		createEReference(mergedLibraryEClass, MERGED_LIBRARY__BASE_LIBRARY);

		mergedLibraryOperationEClass = createEClass(MERGED_LIBRARY_OPERATION);
		createEReference(mergedLibraryOperationEClass, MERGED_LIBRARY_OPERATION__OPERATION);

		mergedLibraryPropertyEClass = createEClass(MERGED_LIBRARY_PROPERTY);
		createEReference(mergedLibraryPropertyEClass, MERGED_LIBRARY_PROPERTY__PROPERTY);

		mergedMetaModelOperationEClass = createEClass(MERGED_META_MODEL_OPERATION);
		createEReference(mergedMetaModelOperationEClass, MERGED_META_MODEL_OPERATION__OPERATION);
		createEReference(mergedMetaModelOperationEClass, MERGED_META_MODEL_OPERATION__BODY);

		mergedMetaModelPropertyEClass = createEClass(MERGED_META_MODEL_PROPERTY);
		createEReference(mergedMetaModelPropertyEClass, MERGED_META_MODEL_PROPERTY__PROPERTY);

		mergedOperationEClass = createEClass(MERGED_OPERATION);
		createEReference(mergedOperationEClass, MERGED_OPERATION__POST);
		createEReference(mergedOperationEClass, MERGED_OPERATION__PRE);

		mergedOperationDefinitionEClass = createEClass(MERGED_OPERATION_DEFINITION);
		createEAttribute(mergedOperationDefinitionEClass, MERGED_OPERATION_DEFINITION__NAME);
		createEReference(mergedOperationDefinitionEClass, MERGED_OPERATION_DEFINITION__PARAMETER);
		createEReference(mergedOperationDefinitionEClass, MERGED_OPERATION_DEFINITION__TYPE);
		createEReference(mergedOperationDefinitionEClass, MERGED_OPERATION_DEFINITION__BODY);

		mergedPropertyEClass = createEClass(MERGED_PROPERTY);
		createEReference(mergedPropertyEClass, MERGED_PROPERTY__INIT);
		createEReference(mergedPropertyEClass, MERGED_PROPERTY__DERIVE);

		mergedPropertyDefinitionEClass = createEClass(MERGED_PROPERTY_DEFINITION);
		createEAttribute(mergedPropertyDefinitionEClass, MERGED_PROPERTY_DEFINITION__NAME);
		createEReference(mergedPropertyDefinitionEClass, MERGED_PROPERTY_DEFINITION__TYPE);

		mergedTypeEClass = createEClass(MERGED_TYPE);
		createEReference(mergedTypeEClass, MERGED_TYPE__MERGED_LIBRARY);
		createEReference(mergedTypeEClass, MERGED_TYPE__TYPE);
		createEReference(mergedTypeEClass, MERGED_TYPE__CONFORMS);
		createEReference(mergedTypeEClass, MERGED_TYPE__OPERATION);
		createEReference(mergedTypeEClass, MERGED_TYPE__PROPERTY);
		createEReference(mergedTypeEClass, MERGED_TYPE__INV);

		oclBoundCollectionTypeEClass = createEClass(OCL_BOUND_COLLECTION_TYPE);

		oclClassifierEClass = createEClass(OCL_CLASSIFIER);
		createEReference(oclClassifierEClass, OCL_CLASSIFIER__META_MODEL_ELEMENT);

		oclDataTypeEClass = createEClass(OCL_DATA_TYPE);
		createEReference(oclDataTypeEClass, OCL_DATA_TYPE__META_MODEL_ELEMENT);

		oclEnumerationEClass = createEClass(OCL_ENUMERATION);
		createEReference(oclEnumerationEClass, OCL_ENUMERATION__META_MODEL_ELEMENT);
		createEReference(oclEnumerationEClass, OCL_ENUMERATION__LITERALS);

		oclEnumerationLiteralEClass = createEClass(OCL_ENUMERATION_LITERAL);
		createEReference(oclEnumerationLiteralEClass, OCL_ENUMERATION_LITERAL__CONTAINER);
		createEReference(oclEnumerationLiteralEClass, OCL_ENUMERATION_LITERAL__META_MODEL_ELEMENT);

		oclMetaModelOperationEClass = createEClass(OCL_META_MODEL_OPERATION);
		createEReference(oclMetaModelOperationEClass, OCL_META_MODEL_OPERATION__META_MODEL_ELEMENT);

		oclMetaModelPropertyEClass = createEClass(OCL_META_MODEL_PROPERTY);
		createEReference(oclMetaModelPropertyEClass, OCL_META_MODEL_PROPERTY__META_MODEL_ELEMENT);
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
		UtilitiesPackage theUtilitiesPackage = (UtilitiesPackage)EPackage.Registry.INSTANCE.getEPackage(UtilitiesPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mergedLibraryEClass.getESuperTypes().add(theLibraryPackage.getOCLNamedElement());
		mergedLibraryEClass.getESuperTypes().add(theLibraryPackage.getOCLCache());
		mergedLibraryOperationEClass.getESuperTypes().add(this.getMergedOperation());
		mergedLibraryPropertyEClass.getESuperTypes().add(this.getMergedProperty());
		mergedMetaModelOperationEClass.getESuperTypes().add(this.getMergedOperation());
		mergedMetaModelPropertyEClass.getESuperTypes().add(this.getMergedProperty());
		mergedOperationEClass.getESuperTypes().add(theLibraryPackage.getOCLElement());
		mergedOperationDefinitionEClass.getESuperTypes().add(this.getMergedOperation());
		mergedPropertyEClass.getESuperTypes().add(theLibraryPackage.getOCLElement());
		mergedPropertyDefinitionEClass.getESuperTypes().add(this.getMergedProperty());
		mergedTypeEClass.getESuperTypes().add(theLibraryPackage.getOCLElement());
		oclBoundCollectionTypeEClass.getESuperTypes().add(theLibraryPackage.getOCLBoundType());
		oclBoundCollectionTypeEClass.getESuperTypes().add(theLibraryPackage.getOCLNamedElement());
		oclClassifierEClass.getESuperTypes().add(theLibraryPackage.getOCLConcreteType());
		oclDataTypeEClass.getESuperTypes().add(theLibraryPackage.getOCLConcreteType());
		oclEnumerationEClass.getESuperTypes().add(theLibraryPackage.getOCLConcreteType());
		oclEnumerationLiteralEClass.getESuperTypes().add(theLibraryPackage.getOCLNamedElement());
		oclMetaModelOperationEClass.getESuperTypes().add(theLibraryPackage.getOCLOperation());
		oclMetaModelPropertyEClass.getESuperTypes().add(theLibraryPackage.getOCLProperty());

		// Initialize classes and features; add operations and parameters
		initEClass(mergedLibraryEClass, MergedLibrary.class, "MergedLibrary", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMergedLibrary_BaseLibrary(), theLibraryPackage.getOCLRoot(), null, "baseLibrary", null, 0, 1, MergedLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		EOperation op = addEOperation(mergedLibraryEClass, this.getOCLBoundCollectionType(), "getBagType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theLibraryPackage.getOCLType(), "elementType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(mergedLibraryEClass, theLibraryPackage.getOCLType(), "getLibraryTypeOfType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(mergedLibraryEClass, theLibraryPackage.getOCLType(), "getLibraryTypeOfValue", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEJavaObject(), "staticType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(mergedLibraryEClass, this.getOCLBoundCollectionType(), "getOrderedSetType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theLibraryPackage.getOCLType(), "elementType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(mergedLibraryEClass, this.getOCLBoundCollectionType(), "getSequenceType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theLibraryPackage.getOCLType(), "elementType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(mergedLibraryEClass, this.getOCLBoundCollectionType(), "getSetType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theLibraryPackage.getOCLType(), "elementType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(mergedLibraryOperationEClass, MergedLibraryOperation.class, "MergedLibraryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMergedLibraryOperation_Operation(), theLibraryPackage.getOCLLibraryOperation(), null, "operation", null, 1, 1, MergedLibraryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(mergedLibraryPropertyEClass, MergedLibraryProperty.class, "MergedLibraryProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMergedLibraryProperty_Property(), theLibraryPackage.getOCLLibraryProperty(), null, "property", null, 1, 1, MergedLibraryProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(mergedMetaModelOperationEClass, MergedMetaModelOperation.class, "MergedMetaModelOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMergedMetaModelOperation_Operation(), this.getOCLMetaModelOperation(), null, "operation", null, 1, 1, MergedMetaModelOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		EGenericType g1 = createEGenericType(theUtilitiesPackage.getExpressionInOCL());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getMergedMetaModelOperation_Body(), g1, null, "body", null, 0, 1, MergedMetaModelOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(mergedMetaModelPropertyEClass, MergedMetaModelProperty.class, "MergedMetaModelProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMergedMetaModelProperty_Property(), this.getOCLMetaModelProperty(), null, "property", null, 1, 1, MergedMetaModelProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(mergedOperationEClass, MergedOperation.class, "MergedOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		g1 = createEGenericType(theUtilitiesPackage.getExpressionInOCL());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getMergedOperation_Post(), g1, null, "post", null, 0, -1, MergedOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(theUtilitiesPackage.getExpressionInOCL());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getMergedOperation_Pre(), g1, null, "pre", null, 0, -1, MergedOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(mergedOperationEClass, null, "getBody", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(theUtilitiesPackage.getExpressionInOCL());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(mergedOperationEClass, theLibraryPackage.getOCLParameter(), "getParameter", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(mergedOperationEClass, theLibraryPackage.getOCLType(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(mergedOperationEClass, theLibraryPackage.getOCLTypeParameter(), "getTypeParameter", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(mergedOperationEClass, theEcorePackage.getEBoolean(), "isStatic", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(mergedOperationEClass, null, "setBody", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(theUtilitiesPackage.getExpressionInOCL());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "body", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(mergedOperationDefinitionEClass, MergedOperationDefinition.class, "MergedOperationDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getMergedOperationDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1, MergedOperationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMergedOperationDefinition_Parameter(), theLibraryPackage.getOCLParameter(), null, "parameter", null, 0, -1, MergedOperationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMergedOperationDefinition_Type(), theLibraryPackage.getOCLType(), null, "type", null, 1, 1, MergedOperationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(theUtilitiesPackage.getExpressionInOCL());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getMergedOperationDefinition_Body(), g1, null, "body", null, 0, 1, MergedOperationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(mergedPropertyEClass, MergedProperty.class, "MergedProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		g1 = createEGenericType(theUtilitiesPackage.getExpressionInOCL());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getMergedProperty_Init(), g1, null, "init", null, 0, 1, MergedProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(theUtilitiesPackage.getExpressionInOCL());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getMergedProperty_Derive(), g1, null, "derive", null, 0, 1, MergedProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(mergedPropertyEClass, theLibraryPackage.getOCLType(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(mergedPropertyDefinitionEClass, MergedPropertyDefinition.class, "MergedPropertyDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getMergedPropertyDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1, MergedPropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMergedPropertyDefinition_Type(), theLibraryPackage.getOCLType(), null, "type", null, 1, 1, MergedPropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(mergedTypeEClass, MergedType.class, "MergedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMergedType_MergedLibrary(), this.getMergedLibrary(), null, "mergedLibrary", null, 1, 1, MergedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMergedType_Type(), theLibraryPackage.getOCLType(), null, "type", null, 1, 1, MergedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMergedType_Conforms(), theLibraryPackage.getOCLType(), null, "conforms", null, 0, -1, MergedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getMergedType_Operation(), this.getMergedOperation(), null, "operation", null, 0, -1, MergedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getMergedType_Property(), this.getMergedProperty(), null, "property", null, 0, -1, MergedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(theUtilitiesPackage.getExpressionInOCL());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getMergedType_Inv(), g1, null, "inv", null, 0, 1, MergedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(mergedTypeEClass, theLibraryPackage.getOCLTypeParameter(), "getTypeParameter", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclBoundCollectionTypeEClass, OCLBoundCollectionType.class, "OCLBoundCollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(oclBoundCollectionTypeEClass, theLibraryPackage.getOCLType(), "getElementType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclClassifierEClass, OCLClassifier.class, "OCLClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLClassifier_MetaModelElement(), ecorePackage.getEObject(), null, "metaModelElement", null, 0, 1, OCLClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclDataTypeEClass, OCLDataType.class, "OCLDataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLDataType_MetaModelElement(), ecorePackage.getEObject(), null, "metaModelElement", null, 0, 1, OCLDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclEnumerationEClass, OCLEnumeration.class, "OCLEnumeration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLEnumeration_MetaModelElement(), ecorePackage.getEObject(), null, "metaModelElement", null, 0, 1, OCLEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLEnumeration_Literals(), this.getOCLEnumerationLiteral(), this.getOCLEnumerationLiteral_Container(), "literals", null, 0, -1, OCLEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclEnumerationLiteralEClass, OCLEnumerationLiteral.class, "OCLEnumerationLiteral", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLEnumerationLiteral_Container(), this.getOCLEnumeration(), this.getOCLEnumeration_Literals(), "container", null, 0, 1, OCLEnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLEnumerationLiteral_MetaModelElement(), ecorePackage.getEObject(), null, "metaModelElement", null, 0, 1, OCLEnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclMetaModelOperationEClass, OCLMetaModelOperation.class, "OCLMetaModelOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLMetaModelOperation_MetaModelElement(), ecorePackage.getEObject(), null, "metaModelElement", null, 0, 1, OCLMetaModelOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclMetaModelPropertyEClass, OCLMetaModelProperty.class, "OCLMetaModelProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLMetaModelProperty_MetaModelElement(), ecorePackage.getEObject(), null, "metaModelElement", null, 0, 1, OCLMetaModelProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore"; //$NON-NLS-1$		
		addAnnotation
		  (oclBoundCollectionTypeEClass, 
		   source, 
		   new String[] {
			 "constraints", "NotMoreThanOneTypeParameter" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //OCLMergedLibraryPackageImpl
