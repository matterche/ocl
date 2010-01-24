/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryPackageImpl.java,v 1.1.2.9 2010/01/24 07:41:14 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.ocl.library.ILibraryOperation;
import org.eclipse.ocl.library.ILibraryProperty;
import org.eclipse.ocl.library.LibraryFactory;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLAnyType;
import org.eclipse.ocl.library.OCLBagType;
import org.eclipse.ocl.library.OCLCache;
import org.eclipse.ocl.library.OCLClassifier;
import org.eclipse.ocl.library.OCLCollectionType;
import org.eclipse.ocl.library.OCLDataType;
import org.eclipse.ocl.library.OCLElement;
import org.eclipse.ocl.library.OCLEnumeration;
import org.eclipse.ocl.library.OCLEnumerationLiteral;
import org.eclipse.ocl.library.OCLInvalidType;
import org.eclipse.ocl.library.OCLLibrary;
import org.eclipse.ocl.library.OCLLibraryOperation;
import org.eclipse.ocl.library.OCLLibraryProperty;
import org.eclipse.ocl.library.OCLMetaModelOperation;
import org.eclipse.ocl.library.OCLMetaModelProperty;
import org.eclipse.ocl.library.OCLNamedElement;
import org.eclipse.ocl.library.OCLNonOrderedCollectionType;
import org.eclipse.ocl.library.OCLNonUniqueCollectionType;
import org.eclipse.ocl.library.OCLOperation;
import org.eclipse.ocl.library.OCLOrderedCollectionType;
import org.eclipse.ocl.library.OCLOrderedSetType;
import org.eclipse.ocl.library.OCLPackage;
import org.eclipse.ocl.library.OCLPackageParent;
import org.eclipse.ocl.library.OCLParameter;
import org.eclipse.ocl.library.OCLProperty;
import org.eclipse.ocl.library.OCLRoot;
import org.eclipse.ocl.library.OCLSequenceType;
import org.eclipse.ocl.library.OCLSetType;
import org.eclipse.ocl.library.OCLTemplateParameterType;
import org.eclipse.ocl.library.OCLTupleType;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.OCLTypedElement;
import org.eclipse.ocl.library.OCLUniqueCollectionType;
import org.eclipse.ocl.library.OCLVoidType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * @since 3.0
 * <!-- end-user-doc -->
 * @generated
 */
public class LibraryPackageImpl extends EPackageImpl implements LibraryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclAnyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclBagTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclCacheEClass = null;

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
	private EClass oclCollectionTypeEClass = null;

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
	private EClass oclElementEClass = null;

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
	private EClass oclInvalidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclLibraryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclLibraryPropertyEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclNonOrderedCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclNonUniqueCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclOrderedCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclOrderedSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclPackageParentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclTemplateParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclTupleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclUniqueCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclVoidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclSequenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iLibraryOperationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iLibraryPropertyEDataType = null;

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
	 * @see org.eclipse.ocl.library.LibraryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LibraryPackageImpl() {
		super(eNS_URI, LibraryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LibraryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LibraryPackage init() {
		if (isInited) return (LibraryPackage)EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI);

		// Obtain or create and register package
		LibraryPackageImpl theLibraryPackage = (LibraryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LibraryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LibraryPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLibraryPackage.createPackageContents();

		// Initialize created meta-data
		theLibraryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLibraryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LibraryPackage.eNS_URI, theLibraryPackage);
		return theLibraryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLLibrary() {
		return oclLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLLibrary_Extends() {
		return (EReference)oclLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLLibrary_Type() {
		return (EReference)oclLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLAnyType() {
		return oclAnyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLBagType() {
		return oclBagTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLCache() {
		return oclCacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_Bag() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_Boolean() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_Classifier() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_Collection() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_Enumeration() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_Integer() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_OclAny() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_OclInvalid() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_OclMessage() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_OclTuple() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_OclType() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_OclVoid() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_OrderedSet() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_Real() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_Sequence() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_Set() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_String() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_T() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_TList() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_T2() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_UnlimitedNatural() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_Invalid() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_Null() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_Unlimited() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(23);
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
	public EClass getOCLCollectionType() {
		return oclCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCollectionType_ElementType() {
		return (EReference)oclCollectionTypeEClass.getEStructuralFeatures().get(0);
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
	public EClass getOCLElement() {
		return oclElementEClass;
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
	public EClass getOCLInvalidType() {
		return oclInvalidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLLibraryOperation() {
		return oclLibraryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLLibraryOperation_LibraryOperationClass() {
		return (EAttribute)oclLibraryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLLibraryOperation_LibraryOperation() {
		return (EAttribute)oclLibraryOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLLibraryProperty() {
		return oclLibraryPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLLibraryProperty_LibraryPropertyClass() {
		return (EAttribute)oclLibraryPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLLibraryProperty_LibraryProperty() {
		return (EAttribute)oclLibraryPropertyEClass.getEStructuralFeatures().get(1);
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
	public EClass getOCLNamedElement() {
		return oclNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLNamedElement_Name() {
		return (EAttribute)oclNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLNonOrderedCollectionType() {
		return oclNonOrderedCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLNonUniqueCollectionType() {
		return oclNonUniqueCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLOperation() {
		return oclOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLOperation_IsIterator() {
		return (EAttribute)oclOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLOperation_Parameter() {
		return (EReference)oclOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLOperation_Container() {
		return (EReference)oclOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLOrderedCollectionType() {
		return oclOrderedCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLOrderedSetType() {
		return oclOrderedSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLPackage() {
		return oclPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLPackage_Type() {
		return (EReference)oclPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLPackage_Container() {
		return (EReference)oclPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLPackageParent() {
		return oclPackageParentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLPackageParent_Package() {
		return (EReference)oclPackageParentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLParameter() {
		return oclParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLParameter_Container() {
		return (EReference)oclParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLTemplateParameterType() {
		return oclTemplateParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLProperty() {
		return oclPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLProperty_Container() {
		return (EReference)oclPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLRoot() {
		return oclRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLTupleType() {
		return oclTupleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLTupleType_MetaModelElement() {
		return (EReference)oclTupleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLType() {
		return oclTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLType_Conforms() {
		return (EReference)oclTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLType_Operation() {
		return (EReference)oclTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLType_Property() {
		return (EReference)oclTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLType_Container() {
		return (EReference)oclTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLTypedElement() {
		return oclTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLTypedElement_Type() {
		return (EReference)oclTypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLUniqueCollectionType() {
		return oclUniqueCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLVoidType() {
		return oclVoidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLSequenceType() {
		return oclSequenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLSetType() {
		return oclSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getILibraryOperation() {
		return iLibraryOperationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getILibraryProperty() {
		return iLibraryPropertyEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryFactory getLibraryFactory() {
		return (LibraryFactory)getEFactoryInstance();
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
		oclLibraryEClass = createEClass(OCL_LIBRARY);
		createEReference(oclLibraryEClass, OCL_LIBRARY__EXTENDS);
		createEReference(oclLibraryEClass, OCL_LIBRARY__TYPE);

		oclAnyTypeEClass = createEClass(OCL_ANY_TYPE);

		oclBagTypeEClass = createEClass(OCL_BAG_TYPE);

		oclCacheEClass = createEClass(OCL_CACHE);
		createEReference(oclCacheEClass, OCL_CACHE__BAG);
		createEReference(oclCacheEClass, OCL_CACHE__BOOLEAN);
		createEReference(oclCacheEClass, OCL_CACHE__CLASSIFIER);
		createEReference(oclCacheEClass, OCL_CACHE__COLLECTION);
		createEReference(oclCacheEClass, OCL_CACHE__ENUMERATION);
		createEReference(oclCacheEClass, OCL_CACHE__INTEGER);
		createEReference(oclCacheEClass, OCL_CACHE__OCL_ANY);
		createEReference(oclCacheEClass, OCL_CACHE__OCL_INVALID);
		createEReference(oclCacheEClass, OCL_CACHE__OCL_MESSAGE);
		createEReference(oclCacheEClass, OCL_CACHE__OCL_TUPLE);
		createEReference(oclCacheEClass, OCL_CACHE__OCL_TYPE);
		createEReference(oclCacheEClass, OCL_CACHE__OCL_VOID);
		createEReference(oclCacheEClass, OCL_CACHE__ORDERED_SET);
		createEReference(oclCacheEClass, OCL_CACHE__REAL);
		createEReference(oclCacheEClass, OCL_CACHE__SEQUENCE);
		createEReference(oclCacheEClass, OCL_CACHE__SET);
		createEReference(oclCacheEClass, OCL_CACHE__STRING);
		createEReference(oclCacheEClass, OCL_CACHE__T);
		createEReference(oclCacheEClass, OCL_CACHE__TLIST);
		createEReference(oclCacheEClass, OCL_CACHE__T2);
		createEReference(oclCacheEClass, OCL_CACHE__UNLIMITED_NATURAL);
		createEReference(oclCacheEClass, OCL_CACHE__INVALID);
		createEReference(oclCacheEClass, OCL_CACHE__NULL);
		createEReference(oclCacheEClass, OCL_CACHE__UNLIMITED);

		oclClassifierEClass = createEClass(OCL_CLASSIFIER);
		createEReference(oclClassifierEClass, OCL_CLASSIFIER__META_MODEL_ELEMENT);

		oclCollectionTypeEClass = createEClass(OCL_COLLECTION_TYPE);
		createEReference(oclCollectionTypeEClass, OCL_COLLECTION_TYPE__ELEMENT_TYPE);

		oclDataTypeEClass = createEClass(OCL_DATA_TYPE);
		createEReference(oclDataTypeEClass, OCL_DATA_TYPE__META_MODEL_ELEMENT);

		oclElementEClass = createEClass(OCL_ELEMENT);

		oclEnumerationEClass = createEClass(OCL_ENUMERATION);
		createEReference(oclEnumerationEClass, OCL_ENUMERATION__META_MODEL_ELEMENT);
		createEReference(oclEnumerationEClass, OCL_ENUMERATION__LITERALS);

		oclEnumerationLiteralEClass = createEClass(OCL_ENUMERATION_LITERAL);
		createEReference(oclEnumerationLiteralEClass, OCL_ENUMERATION_LITERAL__CONTAINER);
		createEReference(oclEnumerationLiteralEClass, OCL_ENUMERATION_LITERAL__META_MODEL_ELEMENT);

		oclInvalidTypeEClass = createEClass(OCL_INVALID_TYPE);

		oclLibraryOperationEClass = createEClass(OCL_LIBRARY_OPERATION);
		createEAttribute(oclLibraryOperationEClass, OCL_LIBRARY_OPERATION__LIBRARY_OPERATION_CLASS);
		createEAttribute(oclLibraryOperationEClass, OCL_LIBRARY_OPERATION__LIBRARY_OPERATION);

		oclLibraryPropertyEClass = createEClass(OCL_LIBRARY_PROPERTY);
		createEAttribute(oclLibraryPropertyEClass, OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY_CLASS);
		createEAttribute(oclLibraryPropertyEClass, OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY);

		oclMetaModelOperationEClass = createEClass(OCL_META_MODEL_OPERATION);
		createEReference(oclMetaModelOperationEClass, OCL_META_MODEL_OPERATION__META_MODEL_ELEMENT);

		oclMetaModelPropertyEClass = createEClass(OCL_META_MODEL_PROPERTY);
		createEReference(oclMetaModelPropertyEClass, OCL_META_MODEL_PROPERTY__META_MODEL_ELEMENT);

		oclNamedElementEClass = createEClass(OCL_NAMED_ELEMENT);
		createEAttribute(oclNamedElementEClass, OCL_NAMED_ELEMENT__NAME);

		oclNonOrderedCollectionTypeEClass = createEClass(OCL_NON_ORDERED_COLLECTION_TYPE);

		oclNonUniqueCollectionTypeEClass = createEClass(OCL_NON_UNIQUE_COLLECTION_TYPE);

		oclOperationEClass = createEClass(OCL_OPERATION);
		createEAttribute(oclOperationEClass, OCL_OPERATION__IS_ITERATOR);
		createEReference(oclOperationEClass, OCL_OPERATION__PARAMETER);
		createEReference(oclOperationEClass, OCL_OPERATION__CONTAINER);

		oclOrderedCollectionTypeEClass = createEClass(OCL_ORDERED_COLLECTION_TYPE);

		oclOrderedSetTypeEClass = createEClass(OCL_ORDERED_SET_TYPE);

		oclPackageEClass = createEClass(OCL_PACKAGE);
		createEReference(oclPackageEClass, OCL_PACKAGE__TYPE);
		createEReference(oclPackageEClass, OCL_PACKAGE__CONTAINER);

		oclPackageParentEClass = createEClass(OCL_PACKAGE_PARENT);
		createEReference(oclPackageParentEClass, OCL_PACKAGE_PARENT__PACKAGE);

		oclParameterEClass = createEClass(OCL_PARAMETER);
		createEReference(oclParameterEClass, OCL_PARAMETER__CONTAINER);

		oclTemplateParameterTypeEClass = createEClass(OCL_TEMPLATE_PARAMETER_TYPE);

		oclPropertyEClass = createEClass(OCL_PROPERTY);
		createEReference(oclPropertyEClass, OCL_PROPERTY__CONTAINER);

		oclRootEClass = createEClass(OCL_ROOT);

		oclSequenceTypeEClass = createEClass(OCL_SEQUENCE_TYPE);

		oclSetTypeEClass = createEClass(OCL_SET_TYPE);

		oclTupleTypeEClass = createEClass(OCL_TUPLE_TYPE);
		createEReference(oclTupleTypeEClass, OCL_TUPLE_TYPE__META_MODEL_ELEMENT);

		oclTypeEClass = createEClass(OCL_TYPE);
		createEReference(oclTypeEClass, OCL_TYPE__CONFORMS);
		createEReference(oclTypeEClass, OCL_TYPE__OPERATION);
		createEReference(oclTypeEClass, OCL_TYPE__PROPERTY);
		createEReference(oclTypeEClass, OCL_TYPE__CONTAINER);

		oclTypedElementEClass = createEClass(OCL_TYPED_ELEMENT);
		createEReference(oclTypedElementEClass, OCL_TYPED_ELEMENT__TYPE);

		oclUniqueCollectionTypeEClass = createEClass(OCL_UNIQUE_COLLECTION_TYPE);

		oclVoidTypeEClass = createEClass(OCL_VOID_TYPE);

		// Create data types
		iLibraryOperationEDataType = createEDataType(ILIBRARY_OPERATION);
		iLibraryPropertyEDataType = createEDataType(ILIBRARY_PROPERTY);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		oclLibraryEClass.getESuperTypes().add(this.getOCLPackageParent());
		oclAnyTypeEClass.getESuperTypes().add(this.getOCLType());
		oclBagTypeEClass.getESuperTypes().add(this.getOCLCollectionType());
		oclBagTypeEClass.getESuperTypes().add(this.getOCLNonOrderedCollectionType());
		oclBagTypeEClass.getESuperTypes().add(this.getOCLNonUniqueCollectionType());
		oclCacheEClass.getESuperTypes().add(this.getOCLElement());
		oclClassifierEClass.getESuperTypes().add(this.getOCLType());
		oclCollectionTypeEClass.getESuperTypes().add(this.getOCLType());
		oclDataTypeEClass.getESuperTypes().add(this.getOCLType());
		oclEnumerationEClass.getESuperTypes().add(this.getOCLType());
		oclEnumerationLiteralEClass.getESuperTypes().add(this.getOCLNamedElement());
		oclInvalidTypeEClass.getESuperTypes().add(this.getOCLType());
		oclLibraryOperationEClass.getESuperTypes().add(this.getOCLOperation());
		oclLibraryPropertyEClass.getESuperTypes().add(this.getOCLProperty());
		oclMetaModelOperationEClass.getESuperTypes().add(this.getOCLOperation());
		oclMetaModelPropertyEClass.getESuperTypes().add(this.getOCLProperty());
		oclNamedElementEClass.getESuperTypes().add(this.getOCLElement());
		oclNonOrderedCollectionTypeEClass.getESuperTypes().add(this.getOCLCollectionType());
		oclNonUniqueCollectionTypeEClass.getESuperTypes().add(this.getOCLCollectionType());
		oclOperationEClass.getESuperTypes().add(this.getOCLTypedElement());
		oclOrderedCollectionTypeEClass.getESuperTypes().add(this.getOCLCollectionType());
		oclOrderedSetTypeEClass.getESuperTypes().add(this.getOCLCollectionType());
		oclOrderedSetTypeEClass.getESuperTypes().add(this.getOCLOrderedCollectionType());
		oclOrderedSetTypeEClass.getESuperTypes().add(this.getOCLUniqueCollectionType());
		oclPackageEClass.getESuperTypes().add(this.getOCLPackageParent());
		oclPackageParentEClass.getESuperTypes().add(this.getOCLNamedElement());
		oclParameterEClass.getESuperTypes().add(this.getOCLTypedElement());
		oclTemplateParameterTypeEClass.getESuperTypes().add(this.getOCLType());
		oclPropertyEClass.getESuperTypes().add(this.getOCLTypedElement());
		oclRootEClass.getESuperTypes().add(this.getOCLLibrary());
		oclRootEClass.getESuperTypes().add(this.getOCLCache());
		oclSequenceTypeEClass.getESuperTypes().add(this.getOCLCollectionType());
		oclSequenceTypeEClass.getESuperTypes().add(this.getOCLOrderedCollectionType());
		oclSequenceTypeEClass.getESuperTypes().add(this.getOCLNonUniqueCollectionType());
		oclSetTypeEClass.getESuperTypes().add(this.getOCLCollectionType());
		oclSetTypeEClass.getESuperTypes().add(this.getOCLUniqueCollectionType());
		oclSetTypeEClass.getESuperTypes().add(this.getOCLNonOrderedCollectionType());
		oclTupleTypeEClass.getESuperTypes().add(this.getOCLType());
		oclTypeEClass.getESuperTypes().add(this.getOCLNamedElement());
		oclTypedElementEClass.getESuperTypes().add(this.getOCLNamedElement());
		oclUniqueCollectionTypeEClass.getESuperTypes().add(this.getOCLCollectionType());
		oclVoidTypeEClass.getESuperTypes().add(this.getOCLType());

		// Initialize classes and features; add operations and parameters
		initEClass(oclLibraryEClass, OCLLibrary.class, "OCLLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLLibrary_Extends(), this.getOCLLibrary(), null, "extends", null, 0, -1, OCLLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLLibrary_Type(), this.getOCLType(), null, "type", null, 0, -1, OCLLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		EOperation op = addEOperation(oclLibraryEClass, this.getILibraryOperation(), "getLibraryOperation", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getILibraryOperation());
		g2.setEUpperBound(g3);
		addEParameter(op, g1, "libraryOperationClass", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclLibraryEClass, null, "putLibraryOperation", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getILibraryOperation());
		g2.setEUpperBound(g3);
		addEParameter(op, g1, "libraryOperationClass", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getILibraryOperation(), "libraryOperation", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclAnyTypeEClass, OCLAnyType.class, "OCLAnyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclBagTypeEClass, OCLBagType.class, "OCLBagType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclCacheEClass, OCLCache.class, "OCLCache", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLCache_Bag(), this.getOCLBagType(), null, "bag", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Boolean(), this.getOCLType(), null, "boolean", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Classifier(), this.getOCLType(), null, "classifier", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Collection(), this.getOCLCollectionType(), null, "collection", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Enumeration(), this.getOCLType(), null, "enumeration", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Integer(), this.getOCLType(), null, "integer", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_OclAny(), this.getOCLAnyType(), null, "oclAny", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_OclInvalid(), this.getOCLInvalidType(), null, "oclInvalid", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_OclMessage(), this.getOCLType(), null, "oclMessage", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_OclTuple(), this.getOCLTupleType(), null, "oclTuple", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_OclType(), this.getOCLType(), null, "oclType", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_OclVoid(), this.getOCLVoidType(), null, "oclVoid", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_OrderedSet(), this.getOCLOrderedSetType(), null, "orderedSet", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Real(), this.getOCLType(), null, "real", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Sequence(), this.getOCLSequenceType(), null, "sequence", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Set(), this.getOCLSetType(), null, "set", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_String(), this.getOCLType(), null, "string", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_T(), this.getOCLTemplateParameterType(), null, "t", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_TList(), this.getOCLTemplateParameterType(), null, "tList", null, 0, -1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_T2(), this.getOCLTemplateParameterType(), null, "t2", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_UnlimitedNatural(), this.getOCLType(), null, "unlimitedNatural", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Invalid(), ecorePackage.getEObject(), null, "invalid", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Null(), ecorePackage.getEObject(), null, "null", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Unlimited(), ecorePackage.getEObject(), null, "unlimited", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclCacheEClass, this.getOCLBagType(), "getBagType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getOCLType(), "elementType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclCacheEClass, this.getOCLType(), "getLibraryTypeOfType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclCacheEClass, this.getOCLType(), "getLibraryTypeOfValue", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEJavaObject(), "staticType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclCacheEClass, this.getOCLOrderedSetType(), "getOrderedSetType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getOCLType(), "elementType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclCacheEClass, this.getOCLSequenceType(), "getSequenceType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getOCLType(), "elementType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclCacheEClass, this.getOCLSetType(), "getSetType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getOCLType(), "elementType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclClassifierEClass, OCLClassifier.class, "OCLClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLClassifier_MetaModelElement(), ecorePackage.getEObject(), null, "metaModelElement", null, 0, 1, OCLClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclCollectionTypeEClass, OCLCollectionType.class, "OCLCollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLCollectionType_ElementType(), this.getOCLType(), null, "elementType", null, 0, 1, OCLCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclDataTypeEClass, OCLDataType.class, "OCLDataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLDataType_MetaModelElement(), ecorePackage.getEObject(), null, "metaModelElement", null, 0, 1, OCLDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclElementEClass, OCLElement.class, "OCLElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(oclElementEClass, this.getOCLLibrary(), "getLibrary", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(oclElementEClass, ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(oclElementEClass, ecorePackage.getEString(), "getQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclEnumerationEClass, OCLEnumeration.class, "OCLEnumeration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLEnumeration_MetaModelElement(), ecorePackage.getEObject(), null, "metaModelElement", null, 0, 1, OCLEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLEnumeration_Literals(), this.getOCLEnumerationLiteral(), this.getOCLEnumerationLiteral_Container(), "literals", null, 0, -1, OCLEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclEnumerationLiteralEClass, OCLEnumerationLiteral.class, "OCLEnumerationLiteral", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLEnumerationLiteral_Container(), this.getOCLEnumeration(), this.getOCLEnumeration_Literals(), "container", null, 0, 1, OCLEnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLEnumerationLiteral_MetaModelElement(), ecorePackage.getEObject(), null, "metaModelElement", null, 0, 1, OCLEnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclInvalidTypeEClass, OCLInvalidType.class, "OCLInvalidType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclLibraryOperationEClass, OCLLibraryOperation.class, "OCLLibraryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getILibraryOperation());
		g2.setEUpperBound(g3);
		initEAttribute(getOCLLibraryOperation_LibraryOperationClass(), g1, "libraryOperationClass", null, 1, 1, OCLLibraryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getOCLLibraryOperation_LibraryOperation(), this.getILibraryOperation(), "libraryOperation", null, 0, 1, OCLLibraryOperation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclLibraryPropertyEClass, OCLLibraryProperty.class, "OCLLibraryProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getILibraryProperty());
		g2.setEUpperBound(g3);
		initEAttribute(getOCLLibraryProperty_LibraryPropertyClass(), g1, "libraryPropertyClass", null, 1, 1, OCLLibraryProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getOCLLibraryProperty_LibraryProperty(), this.getILibraryProperty(), "libraryProperty", null, 0, 1, OCLLibraryProperty.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclMetaModelOperationEClass, OCLMetaModelOperation.class, "OCLMetaModelOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLMetaModelOperation_MetaModelElement(), ecorePackage.getEObject(), null, "metaModelElement", null, 0, 1, OCLMetaModelOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclMetaModelPropertyEClass, OCLMetaModelProperty.class, "OCLMetaModelProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLMetaModelProperty_MetaModelElement(), ecorePackage.getEObject(), null, "metaModelElement", null, 0, 1, OCLMetaModelProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclNamedElementEClass, OCLNamedElement.class, "OCLNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getOCLNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, OCLNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclNonOrderedCollectionTypeEClass, OCLNonOrderedCollectionType.class, "OCLNonOrderedCollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclNonUniqueCollectionTypeEClass, OCLNonUniqueCollectionType.class, "OCLNonUniqueCollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclOperationEClass, OCLOperation.class, "OCLOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getOCLOperation_IsIterator(), ecorePackage.getEBoolean(), "isIterator", null, 0, 1, OCLOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLOperation_Parameter(), this.getOCLParameter(), this.getOCLParameter_Container(), "parameter", null, 0, -1, OCLOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLOperation_Container(), this.getOCLType(), this.getOCLType_Operation(), "container", null, 0, 1, OCLOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(oclOperationEClass, ecorePackage.getEJavaObject(), "getOperationCode", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclOrderedCollectionTypeEClass, OCLOrderedCollectionType.class, "OCLOrderedCollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclOrderedSetTypeEClass, OCLOrderedSetType.class, "OCLOrderedSetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclPackageEClass, OCLPackage.class, "OCLPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLPackage_Type(), this.getOCLType(), this.getOCLType_Container(), "type", null, 0, -1, OCLPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLPackage_Container(), this.getOCLPackageParent(), this.getOCLPackageParent_Package(), "container", null, 0, 1, OCLPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclPackageEClass, this.getOCLType(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclPackageParentEClass, OCLPackageParent.class, "OCLPackageParent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLPackageParent_Package(), this.getOCLPackage(), this.getOCLPackage_Container(), "package", null, 0, -1, OCLPackageParent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclPackageParentEClass, this.getOCLPackage(), "getPackage", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclParameterEClass, OCLParameter.class, "OCLParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLParameter_Container(), this.getOCLOperation(), this.getOCLOperation_Parameter(), "container", null, 0, 1, OCLParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclTemplateParameterTypeEClass, OCLTemplateParameterType.class, "OCLTemplateParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclPropertyEClass, OCLProperty.class, "OCLProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLProperty_Container(), this.getOCLType(), null, "container", null, 0, 1, OCLProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclRootEClass, OCLRoot.class, "OCLRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclSequenceTypeEClass, OCLSequenceType.class, "OCLSequenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclSetTypeEClass, OCLSetType.class, "OCLSetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclTupleTypeEClass, OCLTupleType.class, "OCLTupleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLTupleType_MetaModelElement(), ecorePackage.getEObject(), null, "metaModelElement", null, 0, 1, OCLTupleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclTypeEClass, OCLType.class, "OCLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLType_Conforms(), this.getOCLType(), null, "conforms", null, 0, -1, OCLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLType_Operation(), this.getOCLOperation(), this.getOCLOperation_Container(), "operation", null, 0, -1, OCLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLType_Property(), this.getOCLProperty(), null, "property", null, 0, -1, OCLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLType_Container(), this.getOCLPackage(), this.getOCLPackage_Type(), "container", null, 0, 1, OCLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclTypeEClass, ecorePackage.getEBoolean(), "conformsTo", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getOCLType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(oclTypeEClass, this.getOCLType(), "getNormalizedType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclTypeEClass, this.getOCLOperation(), "getOperations", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getOCLType(), "parameterTypes", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclTypeEClass, this.getOCLType(), "getTemplateBinding", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getOCLTemplateParameterType(), "templateParameter", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(oclTypeEClass, this.getOCLTemplateParameterType(), "getTemplateParameter", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclTypeEClass, this.getOCLProperty(), "getProperty", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclTypedElementEClass, OCLTypedElement.class, "OCLTypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLTypedElement_Type(), this.getOCLType(), null, "type", null, 1, 1, OCLTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclUniqueCollectionTypeEClass, OCLUniqueCollectionType.class, "OCLUniqueCollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclVoidTypeEClass, OCLVoidType.class, "OCLVoidType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Initialize data types
		initEDataType(iLibraryOperationEDataType, ILibraryOperation.class, "ILibraryOperation", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(iLibraryPropertyEDataType, ILibraryProperty.class, "ILibraryProperty", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //OCLLibraryPackageImpl
