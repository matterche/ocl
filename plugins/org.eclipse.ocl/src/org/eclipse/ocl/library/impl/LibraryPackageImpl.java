/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryPackageImpl.java,v 1.1.2.12 2010/01/31 22:23:47 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.ocl.library.LibraryFactory;
import org.eclipse.ocl.library.LibraryIteration;
import org.eclipse.ocl.library.LibraryOperation;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.LibraryProperty;
import org.eclipse.ocl.library.OCLAnyType;
import org.eclipse.ocl.library.OCLBoundType;
import org.eclipse.ocl.library.OCLCache;
import org.eclipse.ocl.library.OCLConcreteType;
import org.eclipse.ocl.library.OCLDeprecatedType;
import org.eclipse.ocl.library.OCLElement;
import org.eclipse.ocl.library.OCLInvalidType;
import org.eclipse.ocl.library.OCLIteration;
import org.eclipse.ocl.library.OCLJavaType;
import org.eclipse.ocl.library.OCLLibrary;
import org.eclipse.ocl.library.OCLLibraryIteration;
import org.eclipse.ocl.library.OCLLibraryOperation;
import org.eclipse.ocl.library.OCLLibraryProperty;
import org.eclipse.ocl.library.OCLNamedElement;
import org.eclipse.ocl.library.OCLOperation;
import org.eclipse.ocl.library.OCLPackage;
import org.eclipse.ocl.library.OCLPackageParent;
import org.eclipse.ocl.library.OCLParameter;
import org.eclipse.ocl.library.OCLProperty;
import org.eclipse.ocl.library.OCLRoot;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.OCLTypeBinding;
import org.eclipse.ocl.library.OCLTypeParameter;
import org.eclipse.ocl.library.OCLTypeParameterParent;
import org.eclipse.ocl.library.OCLTypeValue;
import org.eclipse.ocl.library.OCLTypedElement;
import org.eclipse.ocl.library.OCLVoidType;
import org.eclipse.ocl.library.util.LibraryValidator;

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
	private EClass oclAnyTypeEClass = null;

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
	private EClass oclLibraryIterationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclBoundTypeEClass = null;

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
	private EClass oclConcreteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclDeprecatedTypeEClass = null;

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
	private EClass oclInvalidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclIterationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclJavaTypeEClass = null;

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
	private EClass oclNamedElementEClass = null;

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
	private EClass oclTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclTypeBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclTypeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclTypeParameterParentEClass = null;

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
	private EClass oclTypeValueEClass = null;

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
	private EDataType libraryIterationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType libraryOperationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType libraryPropertyEDataType = null;

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

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theLibraryPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return LibraryValidator.INSTANCE;
				 }
			 });

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
	public EClass getOCLAnyType() {
		return oclAnyTypeEClass;
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
	public EClass getOCLLibraryIteration() {
		return oclLibraryIterationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLLibraryIteration_Class() {
		return (EAttribute)oclLibraryIterationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLLibraryIteration_LibraryIteration() {
		return (EAttribute)oclLibraryIterationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLBoundType() {
		return oclBoundTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLBoundType_Type() {
		return (EReference)oclBoundTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLBoundType_TypeBinding() {
		return (EReference)oclBoundTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getOCLCache_Java() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_NonOrderedCollection() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_NonUniqueCollection() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_OclAny() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_OclInvalid() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_OclMessage() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_OclTuple() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_OclType() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_OclVoid() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_OrderedCollection() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_OrderedSet() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_Real() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_Sequence() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_Set() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_String() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_UniqueCollection() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_UnlimitedNatural() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_Invalid() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_Null() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLCache_Unlimited() {
		return (EReference)oclCacheEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLConcreteType() {
		return oclConcreteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLConcreteType_Container() {
		return (EReference)oclConcreteTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLConcreteType_Iteration() {
		return (EReference)oclConcreteTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLConcreteType_Operation() {
		return (EReference)oclConcreteTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLConcreteType_Property() {
		return (EReference)oclConcreteTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLConcreteType_BoundType() {
		return (EReference)oclConcreteTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLDeprecatedType() {
		return oclDeprecatedTypeEClass;
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
	public EClass getOCLInvalidType() {
		return oclInvalidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLIteration() {
		return oclIterationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLIteration_Container() {
		return (EReference)oclIterationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLIteration_Iterators() {
		return (EAttribute)oclIterationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLJavaType() {
		return oclJavaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLJavaType_JavaClass() {
		return (EAttribute)oclJavaTypeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getOCLLibraryOperation_Class() {
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
	public EAttribute getOCLLibraryProperty_Class() {
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
	public EClass getOCLOperation() {
		return oclOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLOperation_Parameter() {
		return (EReference)oclOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLOperation_Container() {
		return (EReference)oclOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLOperation_IsStatic() {
		return (EAttribute)oclOperationEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getOCLProperty_IsStatic() {
		return (EAttribute)oclPropertyEClass.getEStructuralFeatures().get(1);
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
	public EClass getOCLTypeBinding() {
		return oclTypeBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLTypeBinding_TypeParameter() {
		return (EReference)oclTypeBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLTypeBinding_TypeValue() {
		return (EReference)oclTypeBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLTypeBinding_BoundType() {
		return (EReference)oclTypeBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLTypeParameter() {
		return oclTypeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLTypeParameter_TypeParameterParent() {
		return (EReference)oclTypeParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLTypeParameterParent() {
		return oclTypeParameterParentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLTypeParameterParent_TypeParameter() {
		return (EReference)oclTypeParameterParentEClass.getEStructuralFeatures().get(0);
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
	public EReference getOCLTypedElement_BoundType() {
		return (EReference)oclTypedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLTypeValue() {
		return oclTypeValueEClass;
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
	public EDataType getLibraryIteration() {
		return libraryIterationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLibraryOperation() {
		return libraryOperationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLibraryProperty() {
		return libraryPropertyEDataType;
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
		oclAnyTypeEClass = createEClass(OCL_ANY_TYPE);

		oclBoundTypeEClass = createEClass(OCL_BOUND_TYPE);
		createEReference(oclBoundTypeEClass, OCL_BOUND_TYPE__TYPE);
		createEReference(oclBoundTypeEClass, OCL_BOUND_TYPE__TYPE_BINDING);

		oclCacheEClass = createEClass(OCL_CACHE);
		createEReference(oclCacheEClass, OCL_CACHE__BAG);
		createEReference(oclCacheEClass, OCL_CACHE__BOOLEAN);
		createEReference(oclCacheEClass, OCL_CACHE__CLASSIFIER);
		createEReference(oclCacheEClass, OCL_CACHE__COLLECTION);
		createEReference(oclCacheEClass, OCL_CACHE__ENUMERATION);
		createEReference(oclCacheEClass, OCL_CACHE__INTEGER);
		createEReference(oclCacheEClass, OCL_CACHE__JAVA);
		createEReference(oclCacheEClass, OCL_CACHE__NON_ORDERED_COLLECTION);
		createEReference(oclCacheEClass, OCL_CACHE__NON_UNIQUE_COLLECTION);
		createEReference(oclCacheEClass, OCL_CACHE__OCL_ANY);
		createEReference(oclCacheEClass, OCL_CACHE__OCL_INVALID);
		createEReference(oclCacheEClass, OCL_CACHE__OCL_MESSAGE);
		createEReference(oclCacheEClass, OCL_CACHE__OCL_TUPLE);
		createEReference(oclCacheEClass, OCL_CACHE__OCL_TYPE);
		createEReference(oclCacheEClass, OCL_CACHE__OCL_VOID);
		createEReference(oclCacheEClass, OCL_CACHE__ORDERED_COLLECTION);
		createEReference(oclCacheEClass, OCL_CACHE__ORDERED_SET);
		createEReference(oclCacheEClass, OCL_CACHE__REAL);
		createEReference(oclCacheEClass, OCL_CACHE__SEQUENCE);
		createEReference(oclCacheEClass, OCL_CACHE__SET);
		createEReference(oclCacheEClass, OCL_CACHE__STRING);
		createEReference(oclCacheEClass, OCL_CACHE__UNIQUE_COLLECTION);
		createEReference(oclCacheEClass, OCL_CACHE__UNLIMITED_NATURAL);
		createEReference(oclCacheEClass, OCL_CACHE__INVALID);
		createEReference(oclCacheEClass, OCL_CACHE__NULL);
		createEReference(oclCacheEClass, OCL_CACHE__UNLIMITED);

		oclConcreteTypeEClass = createEClass(OCL_CONCRETE_TYPE);
		createEReference(oclConcreteTypeEClass, OCL_CONCRETE_TYPE__CONTAINER);
		createEReference(oclConcreteTypeEClass, OCL_CONCRETE_TYPE__ITERATION);
		createEReference(oclConcreteTypeEClass, OCL_CONCRETE_TYPE__OPERATION);
		createEReference(oclConcreteTypeEClass, OCL_CONCRETE_TYPE__PROPERTY);
		createEReference(oclConcreteTypeEClass, OCL_CONCRETE_TYPE__BOUND_TYPE);

		oclDeprecatedTypeEClass = createEClass(OCL_DEPRECATED_TYPE);

		oclElementEClass = createEClass(OCL_ELEMENT);

		oclInvalidTypeEClass = createEClass(OCL_INVALID_TYPE);

		oclIterationEClass = createEClass(OCL_ITERATION);
		createEReference(oclIterationEClass, OCL_ITERATION__CONTAINER);
		createEAttribute(oclIterationEClass, OCL_ITERATION__ITERATORS);

		oclJavaTypeEClass = createEClass(OCL_JAVA_TYPE);
		createEAttribute(oclJavaTypeEClass, OCL_JAVA_TYPE__JAVA_CLASS);

		oclLibraryEClass = createEClass(OCL_LIBRARY);
		createEReference(oclLibraryEClass, OCL_LIBRARY__EXTENDS);
		createEReference(oclLibraryEClass, OCL_LIBRARY__TYPE);

		oclLibraryIterationEClass = createEClass(OCL_LIBRARY_ITERATION);
		createEAttribute(oclLibraryIterationEClass, OCL_LIBRARY_ITERATION__CLASS);
		createEAttribute(oclLibraryIterationEClass, OCL_LIBRARY_ITERATION__LIBRARY_ITERATION);

		oclLibraryOperationEClass = createEClass(OCL_LIBRARY_OPERATION);
		createEAttribute(oclLibraryOperationEClass, OCL_LIBRARY_OPERATION__CLASS);
		createEAttribute(oclLibraryOperationEClass, OCL_LIBRARY_OPERATION__LIBRARY_OPERATION);

		oclLibraryPropertyEClass = createEClass(OCL_LIBRARY_PROPERTY);
		createEAttribute(oclLibraryPropertyEClass, OCL_LIBRARY_PROPERTY__CLASS);
		createEAttribute(oclLibraryPropertyEClass, OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY);

		oclNamedElementEClass = createEClass(OCL_NAMED_ELEMENT);
		createEAttribute(oclNamedElementEClass, OCL_NAMED_ELEMENT__NAME);

		oclOperationEClass = createEClass(OCL_OPERATION);
		createEReference(oclOperationEClass, OCL_OPERATION__CONTAINER);
		createEAttribute(oclOperationEClass, OCL_OPERATION__IS_STATIC);
		createEReference(oclOperationEClass, OCL_OPERATION__PARAMETER);

		oclPackageEClass = createEClass(OCL_PACKAGE);
		createEReference(oclPackageEClass, OCL_PACKAGE__TYPE);
		createEReference(oclPackageEClass, OCL_PACKAGE__CONTAINER);

		oclPackageParentEClass = createEClass(OCL_PACKAGE_PARENT);
		createEReference(oclPackageParentEClass, OCL_PACKAGE_PARENT__PACKAGE);

		oclParameterEClass = createEClass(OCL_PARAMETER);
		createEReference(oclParameterEClass, OCL_PARAMETER__CONTAINER);

		oclPropertyEClass = createEClass(OCL_PROPERTY);
		createEReference(oclPropertyEClass, OCL_PROPERTY__CONTAINER);
		createEAttribute(oclPropertyEClass, OCL_PROPERTY__IS_STATIC);

		oclRootEClass = createEClass(OCL_ROOT);

		oclTypeEClass = createEClass(OCL_TYPE);
		createEReference(oclTypeEClass, OCL_TYPE__CONFORMS);

		oclTypeBindingEClass = createEClass(OCL_TYPE_BINDING);
		createEReference(oclTypeBindingEClass, OCL_TYPE_BINDING__TYPE_PARAMETER);
		createEReference(oclTypeBindingEClass, OCL_TYPE_BINDING__TYPE_VALUE);
		createEReference(oclTypeBindingEClass, OCL_TYPE_BINDING__BOUND_TYPE);

		oclTypeParameterEClass = createEClass(OCL_TYPE_PARAMETER);
		createEReference(oclTypeParameterEClass, OCL_TYPE_PARAMETER__TYPE_PARAMETER_PARENT);

		oclTypeParameterParentEClass = createEClass(OCL_TYPE_PARAMETER_PARENT);
		createEReference(oclTypeParameterParentEClass, OCL_TYPE_PARAMETER_PARENT__TYPE_PARAMETER);

		oclTypedElementEClass = createEClass(OCL_TYPED_ELEMENT);
		createEReference(oclTypedElementEClass, OCL_TYPED_ELEMENT__TYPE);
		createEReference(oclTypedElementEClass, OCL_TYPED_ELEMENT__BOUND_TYPE);

		oclTypeValueEClass = createEClass(OCL_TYPE_VALUE);

		oclVoidTypeEClass = createEClass(OCL_VOID_TYPE);

		// Create data types
		libraryIterationEDataType = createEDataType(LIBRARY_ITERATION);
		libraryOperationEDataType = createEDataType(LIBRARY_OPERATION);
		libraryPropertyEDataType = createEDataType(LIBRARY_PROPERTY);
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
		oclAnyTypeEClass.getESuperTypes().add(this.getOCLConcreteType());
		oclBoundTypeEClass.getESuperTypes().add(this.getOCLType());
		oclCacheEClass.getESuperTypes().add(this.getOCLElement());
		oclConcreteTypeEClass.getESuperTypes().add(this.getOCLType());
		oclConcreteTypeEClass.getESuperTypes().add(this.getOCLTypeParameterParent());
		oclDeprecatedTypeEClass.getESuperTypes().add(this.getOCLConcreteType());
		oclInvalidTypeEClass.getESuperTypes().add(this.getOCLConcreteType());
		oclIterationEClass.getESuperTypes().add(this.getOCLTypedElement());
		oclJavaTypeEClass.getESuperTypes().add(this.getOCLConcreteType());
		oclLibraryEClass.getESuperTypes().add(this.getOCLPackageParent());
		oclLibraryIterationEClass.getESuperTypes().add(this.getOCLIteration());
		oclLibraryOperationEClass.getESuperTypes().add(this.getOCLOperation());
		oclLibraryPropertyEClass.getESuperTypes().add(this.getOCLProperty());
		oclNamedElementEClass.getESuperTypes().add(this.getOCLElement());
		oclOperationEClass.getESuperTypes().add(this.getOCLTypedElement());
		oclOperationEClass.getESuperTypes().add(this.getOCLTypeParameterParent());
		oclPackageEClass.getESuperTypes().add(this.getOCLPackageParent());
		oclPackageParentEClass.getESuperTypes().add(this.getOCLNamedElement());
		oclParameterEClass.getESuperTypes().add(this.getOCLTypedElement());
		oclPropertyEClass.getESuperTypes().add(this.getOCLTypedElement());
		oclRootEClass.getESuperTypes().add(this.getOCLLibrary());
		oclRootEClass.getESuperTypes().add(this.getOCLCache());
		oclTypeEClass.getESuperTypes().add(this.getOCLTypeValue());
		oclTypeBindingEClass.getESuperTypes().add(this.getOCLElement());
		oclTypeParameterEClass.getESuperTypes().add(this.getOCLTypeValue());
		oclTypeParameterEClass.getESuperTypes().add(this.getOCLNamedElement());
		oclTypeParameterParentEClass.getESuperTypes().add(this.getOCLNamedElement());
		oclTypedElementEClass.getESuperTypes().add(this.getOCLNamedElement());
		oclTypeValueEClass.getESuperTypes().add(this.getOCLElement());
		oclVoidTypeEClass.getESuperTypes().add(this.getOCLConcreteType());

		// Initialize classes and features; add operations and parameters
		initEClass(oclAnyTypeEClass, OCLAnyType.class, "OCLAnyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclBoundTypeEClass, OCLBoundType.class, "OCLBoundType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLBoundType_Type(), this.getOCLType(), null, "type", null, 1, 1, OCLBoundType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLBoundType_TypeBinding(), this.getOCLTypeBinding(), this.getOCLTypeBinding_BoundType(), "typeBinding", null, 0, -1, OCLBoundType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclCacheEClass, OCLCache.class, "OCLCache", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLCache_Bag(), this.getOCLConcreteType(), null, "bag", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Boolean(), this.getOCLConcreteType(), null, "boolean", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Classifier(), this.getOCLConcreteType(), null, "classifier", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Collection(), this.getOCLConcreteType(), null, "collection", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Enumeration(), this.getOCLConcreteType(), null, "enumeration", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Integer(), this.getOCLConcreteType(), null, "integer", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Java(), this.getOCLJavaType(), null, "java", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_NonOrderedCollection(), this.getOCLConcreteType(), null, "nonOrderedCollection", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_NonUniqueCollection(), this.getOCLConcreteType(), null, "nonUniqueCollection", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_OclAny(), this.getOCLConcreteType(), null, "oclAny", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_OclInvalid(), this.getOCLConcreteType(), null, "oclInvalid", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_OclMessage(), this.getOCLConcreteType(), null, "oclMessage", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_OclTuple(), this.getOCLConcreteType(), null, "oclTuple", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_OclType(), this.getOCLConcreteType(), null, "oclType", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_OclVoid(), this.getOCLConcreteType(), null, "oclVoid", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_OrderedCollection(), this.getOCLConcreteType(), null, "orderedCollection", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_OrderedSet(), this.getOCLConcreteType(), null, "orderedSet", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Real(), this.getOCLConcreteType(), null, "real", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Sequence(), this.getOCLConcreteType(), null, "sequence", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Set(), this.getOCLConcreteType(), null, "set", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_String(), this.getOCLConcreteType(), null, "string", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_UniqueCollection(), this.getOCLConcreteType(), null, "uniqueCollection", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_UnlimitedNatural(), this.getOCLConcreteType(), null, "unlimitedNatural", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Invalid(), ecorePackage.getEObject(), null, "invalid", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Null(), ecorePackage.getEObject(), null, "null", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLCache_Unlimited(), ecorePackage.getEObject(), null, "unlimited", null, 0, 1, OCLCache.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclConcreteTypeEClass, OCLConcreteType.class, "OCLConcreteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLConcreteType_Container(), this.getOCLPackage(), this.getOCLPackage_Type(), "container", null, 0, 1, OCLConcreteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLConcreteType_Iteration(), this.getOCLIteration(), this.getOCLIteration_Container(), "iteration", null, 0, -1, OCLConcreteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLConcreteType_Operation(), this.getOCLOperation(), this.getOCLOperation_Container(), "operation", null, 0, -1, OCLConcreteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLConcreteType_Property(), this.getOCLProperty(), null, "property", null, 0, -1, OCLConcreteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLConcreteType_BoundType(), this.getOCLBoundType(), null, "boundType", null, 0, -1, OCLConcreteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclDeprecatedTypeEClass, OCLDeprecatedType.class, "OCLDeprecatedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclElementEClass, OCLElement.class, "OCLElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(oclElementEClass, this.getOCLLibrary(), "getLibrary", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(oclElementEClass, ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(oclElementEClass, ecorePackage.getEString(), "getQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(oclElementEClass, ecorePackage.getEString(), "getQualifiedSignature", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		EOperation op = addEOperation(oclElementEClass, ecorePackage.getEBoolean(), "isTypeParameter", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getOCLTypeParameter(), "typeParameter", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclInvalidTypeEClass, OCLInvalidType.class, "OCLInvalidType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclIterationEClass, OCLIteration.class, "OCLIteration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLIteration_Container(), this.getOCLConcreteType(), this.getOCLConcreteType_Iteration(), "container", null, 0, 1, OCLIteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getOCLIteration_Iterators(), ecorePackage.getEInt(), "iterators", "1", 0, 1, OCLIteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(oclJavaTypeEClass, OCLJavaType.class, "OCLJavaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getOCLJavaType_JavaClass(), g1, "javaClass", null, 0, 1, OCLJavaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclLibraryEClass, OCLLibrary.class, "OCLLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLLibrary_Extends(), this.getOCLLibrary(), null, "extends", null, 0, -1, OCLLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLLibrary_Type(), this.getOCLTypeValue(), null, "type", null, 0, -1, OCLLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclLibraryEClass, this.getOCLTypeValue(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclLibraryIterationEClass, OCLLibraryIteration.class, "OCLLibraryIteration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getLibraryIteration());
		g2.setEUpperBound(g3);
		initEAttribute(getOCLLibraryIteration_Class(), g1, "class", null, 1, 1, OCLLibraryIteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getOCLLibraryIteration_LibraryIteration(), this.getLibraryIteration(), "libraryIteration", null, 0, 1, OCLLibraryIteration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclLibraryOperationEClass, OCLLibraryOperation.class, "OCLLibraryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getLibraryOperation());
		g2.setEUpperBound(g3);
		initEAttribute(getOCLLibraryOperation_Class(), g1, "class", null, 1, 1, OCLLibraryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getOCLLibraryOperation_LibraryOperation(), this.getLibraryOperation(), "libraryOperation", null, 0, 1, OCLLibraryOperation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclLibraryPropertyEClass, OCLLibraryProperty.class, "OCLLibraryProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getLibraryProperty());
		g2.setEUpperBound(g3);
		initEAttribute(getOCLLibraryProperty_Class(), g1, "class", null, 1, 1, OCLLibraryProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getOCLLibraryProperty_LibraryProperty(), this.getLibraryProperty(), "libraryProperty", null, 0, 1, OCLLibraryProperty.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclNamedElementEClass, OCLNamedElement.class, "OCLNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getOCLNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, OCLNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclOperationEClass, OCLOperation.class, "OCLOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLOperation_Container(), this.getOCLConcreteType(), this.getOCLConcreteType_Operation(), "container", null, 0, 1, OCLOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getOCLOperation_IsStatic(), ecorePackage.getEBoolean(), "isStatic", "false", 0, 1, OCLOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getOCLOperation_Parameter(), this.getOCLParameter(), this.getOCLParameter_Container(), "parameter", null, 0, -1, OCLOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclPackageEClass, OCLPackage.class, "OCLPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLPackage_Type(), this.getOCLConcreteType(), this.getOCLConcreteType_Container(), "type", null, 0, -1, OCLPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLPackage_Container(), this.getOCLPackageParent(), this.getOCLPackageParent_Package(), "container", null, 0, 1, OCLPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclPackageEClass, this.getOCLConcreteType(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclPackageParentEClass, OCLPackageParent.class, "OCLPackageParent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLPackageParent_Package(), this.getOCLPackage(), this.getOCLPackage_Container(), "package", null, 0, -1, OCLPackageParent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclPackageParentEClass, this.getOCLPackage(), "getPackage", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclParameterEClass, OCLParameter.class, "OCLParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLParameter_Container(), this.getOCLOperation(), this.getOCLOperation_Parameter(), "container", null, 0, 1, OCLParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclPropertyEClass, OCLProperty.class, "OCLProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLProperty_Container(), this.getOCLConcreteType(), null, "container", null, 0, 1, OCLProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getOCLProperty_IsStatic(), ecorePackage.getEBoolean(), "isStatic", "false", 0, 1, OCLProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(oclRootEClass, OCLRoot.class, "OCLRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclTypeEClass, OCLType.class, "OCLType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLType_Conforms(), this.getOCLType(), null, "conforms", null, 0, -1, OCLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclTypeEClass, ecorePackage.getEBoolean(), "conformsTo", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getOCLType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(oclTypeEClass, this.getOCLIteration(), "getIteration", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclTypeEClass, this.getOCLIteration(), "getIteration", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(oclTypeEClass, this.getOCLOperation(), "getOperation", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclTypeEClass, this.getOCLOperation(), "getOperations", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getOCLType(), "parameterTypes", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getOCLType(), "contextType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(oclTypeEClass, this.getOCLProperty(), "getProperty", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclTypeEClass, this.getOCLProperty(), "getProperty", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(oclTypeEClass, this.getOCLTypeBinding(), "getTypeBinding", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclTypeEClass, this.getOCLTypeBinding(), "getTypeBinding", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getOCLTypeParameter(), "typeParameter", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(oclTypeEClass, this.getOCLTypeParameter(), "getTypeParameter", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(oclTypeEClass, ecorePackage.getEBoolean(), "isOrdered", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(oclTypeEClass, ecorePackage.getEBoolean(), "isUnique", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclTypeBindingEClass, OCLTypeBinding.class, "OCLTypeBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLTypeBinding_TypeParameter(), this.getOCLTypeParameter(), null, "typeParameter", null, 1, 1, OCLTypeBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLTypeBinding_TypeValue(), this.getOCLTypeValue(), null, "typeValue", null, 1, 1, OCLTypeBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLTypeBinding_BoundType(), this.getOCLBoundType(), this.getOCLBoundType_TypeBinding(), "boundType", null, 0, 1, OCLTypeBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(oclTypeBindingEClass, this.getOCLType(), "getResolvedType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclTypeParameterEClass, OCLTypeParameter.class, "OCLTypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLTypeParameter_TypeParameterParent(), this.getOCLTypeParameterParent(), this.getOCLTypeParameterParent_TypeParameter(), "typeParameterParent", null, 0, 1, OCLTypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclTypeParameterParentEClass, OCLTypeParameterParent.class, "OCLTypeParameterParent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLTypeParameterParent_TypeParameter(), this.getOCLTypeParameter(), this.getOCLTypeParameter_TypeParameterParent(), "typeParameter", null, 0, -1, OCLTypeParameterParent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclTypedElementEClass, OCLTypedElement.class, "OCLTypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLTypedElement_Type(), this.getOCLTypeValue(), null, "type", null, 1, 1, OCLTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLTypedElement_BoundType(), this.getOCLBoundType(), null, "boundType", null, 0, -1, OCLTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclTypedElementEClass, this.getOCLType(), "getResolvedType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getOCLType(), "contextType", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclTypeValueEClass, OCLTypeValue.class, "OCLTypeValue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclVoidTypeEClass, OCLVoidType.class, "OCLVoidType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Initialize data types
		initEDataType(libraryIterationEDataType, LibraryIteration.class, "LibraryIteration", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(libraryOperationEDataType, LibraryOperation.class, "LibraryOperation", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(libraryPropertyEDataType, LibraryProperty.class, "LibraryProperty", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

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
		  (oclBoundTypeEClass, 
		   source, 
		   new String[] {
			 "constraints", "OneTypeBindingForEachTypeParameter" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (oclTypeEClass, 
		   source, 
		   new String[] {
			 "constraints", "EachConformsTypeIsBound" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (oclTypeBindingEClass, 
		   source, 
		   new String[] {
			 "constraints", "TypeParameterDefinedByBoundTypeParent" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (oclTypedElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "ReferencedTypeIsBound" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //OCLLibraryPackageImpl
