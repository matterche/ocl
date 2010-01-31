/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryPackage.java,v 1.1.2.10 2010/01/31 08:43:25 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * @since 3.0
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.library.LibraryFactory
 * @model kind="package"
 * @generated
 */
public interface LibraryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "library"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/ocl/3.0.0/OCL/Library"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ocl.lib"; //$NON-NLS-1$

	/**
	 * The package content type ID.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eCONTENT_TYPE = "org.eclipse.ocl.library"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LibraryPackage eINSTANCE = org.eclipse.ocl.library.impl.LibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLElementImpl <em>OCL Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLElementImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLElement()
	 * @generated
	 */
	int OCL_ELEMENT = 5;

	/**
	 * The number of structural features of the '<em>OCL Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLNamedElementImpl <em>OCL Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLNamedElementImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLNamedElement()
	 * @generated
	 */
	int OCL_NAMED_ELEMENT = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLPackageParentImpl <em>OCL Package Parent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLPackageParentImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLPackageParent()
	 * @generated
	 */
	int OCL_PACKAGE_PARENT = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLLibraryImpl <em>OCL Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLLibraryImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLLibrary()
	 * @generated
	 */
	int OCL_LIBRARY = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLConcreteTypeImpl <em>OCL Concrete Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLConcreteTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLConcreteType()
	 * @generated
	 */
	int OCL_CONCRETE_TYPE = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.OCLTypeValue <em>OCL Type Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.OCLTypeValue
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLTypeValue()
	 * @generated
	 */
	int OCL_TYPE_VALUE = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLBoundTypeImpl <em>OCL Bound Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLBoundTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLBoundType()
	 * @generated
	 */
	int OCL_BOUND_TYPE = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.OCLCache <em>OCL Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.OCLCache
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLCache()
	 * @generated
	 */
	int OCL_CACHE = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLTypedElementImpl <em>OCL Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLTypedElementImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLTypedElement()
	 * @generated
	 */
	int OCL_TYPED_ELEMENT = 23;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLIteratorImpl <em>OCL Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLIteratorImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLIterator()
	 * @generated
	 */
	int OCL_ITERATOR = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLJavaTypeImpl <em>OCL Java Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLJavaTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLJavaType()
	 * @generated
	 */
	int OCL_JAVA_TYPE = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLOperationImpl <em>OCL Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLOperationImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLOperation()
	 * @generated
	 */
	int OCL_OPERATION = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLLibraryOperationImpl <em>OCL Library Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLLibraryOperationImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLLibraryOperation()
	 * @generated
	 */
	int OCL_LIBRARY_OPERATION = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLPropertyImpl <em>OCL Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLPropertyImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLProperty()
	 * @generated
	 */
	int OCL_PROPERTY = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLLibraryPropertyImpl <em>OCL Library Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLLibraryPropertyImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLLibraryProperty()
	 * @generated
	 */
	int OCL_LIBRARY_PROPERTY = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLPackageImpl <em>OCL Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLPackageImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLPackage()
	 * @generated
	 */
	int OCL_PACKAGE = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLParameterImpl <em>OCL Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLParameterImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLParameter()
	 * @generated
	 */
	int OCL_PARAMETER = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLRootImpl <em>OCL Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLRootImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLRoot()
	 * @generated
	 */
	int OCL_ROOT = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLTypeBindingImpl <em>OCL Type Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLTypeBindingImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLTypeBinding()
	 * @generated
	 */
	int OCL_TYPE_BINDING = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLTypeImpl <em>OCL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLType()
	 * @generated
	 */
	int OCL_TYPE = 19;

	/**
	 * The number of structural features of the '<em>OCL Type Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE_VALUE_FEATURE_COUNT = OCL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__CONFORMS = OCL_TYPE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE_FEATURE_COUNT = OCL_TYPE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONCRETE_TYPE__CONFORMS = OCL_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONCRETE_TYPE__NAME = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONCRETE_TYPE__TYPE_PARAMETER = OCL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONCRETE_TYPE__CONTAINER = OCL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONCRETE_TYPE__OPERATION = OCL_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONCRETE_TYPE__PROPERTY = OCL_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONCRETE_TYPE__BOUND_TYPE = OCL_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>OCL Concrete Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONCRETE_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLAnyTypeImpl <em>OCL Any Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLAnyTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLAnyType()
	 * @generated
	 */
	int OCL_ANY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__CONFORMS = OCL_CONCRETE_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__NAME = OCL_CONCRETE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__TYPE_PARAMETER = OCL_CONCRETE_TYPE__TYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__CONTAINER = OCL_CONCRETE_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__OPERATION = OCL_CONCRETE_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__PROPERTY = OCL_CONCRETE_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__BOUND_TYPE = OCL_CONCRETE_TYPE__BOUND_TYPE;

	/**
	 * The number of structural features of the '<em>OCL Any Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE_FEATURE_COUNT = OCL_CONCRETE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_BOUND_TYPE__CONFORMS = OCL_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_BOUND_TYPE__TYPE = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_BOUND_TYPE__TYPE_BINDING = OCL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Bound Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_BOUND_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__BAG = OCL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Boolean</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__BOOLEAN = OCL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__CLASSIFIER = OCL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__COLLECTION = OCL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__ENUMERATION = OCL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Integer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__INTEGER = OCL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Java</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__JAVA = OCL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ocl Any</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__OCL_ANY = OCL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ocl Invalid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__OCL_INVALID = OCL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ocl Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__OCL_MESSAGE = OCL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ocl Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__OCL_TUPLE = OCL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Ocl Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__OCL_TYPE = OCL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Ocl Void</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__OCL_VOID = OCL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Ordered Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__ORDERED_SET = OCL_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Real</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__REAL = OCL_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__SEQUENCE = OCL_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__SET = OCL_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>String</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__STRING = OCL_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Unlimited Natural</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__UNLIMITED_NATURAL = OCL_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Invalid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__INVALID = OCL_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Null</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__NULL = OCL_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Unlimited</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__UNLIMITED = OCL_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>OCL Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE_FEATURE_COUNT = OCL_ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLDeprecatedTypeImpl <em>OCL Deprecated Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLDeprecatedTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLDeprecatedType()
	 * @generated
	 */
	int OCL_DEPRECATED_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DEPRECATED_TYPE__CONFORMS = OCL_CONCRETE_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DEPRECATED_TYPE__NAME = OCL_CONCRETE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DEPRECATED_TYPE__TYPE_PARAMETER = OCL_CONCRETE_TYPE__TYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DEPRECATED_TYPE__CONTAINER = OCL_CONCRETE_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DEPRECATED_TYPE__OPERATION = OCL_CONCRETE_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DEPRECATED_TYPE__PROPERTY = OCL_CONCRETE_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DEPRECATED_TYPE__BOUND_TYPE = OCL_CONCRETE_TYPE__BOUND_TYPE;

	/**
	 * The number of structural features of the '<em>OCL Deprecated Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DEPRECATED_TYPE_FEATURE_COUNT = OCL_CONCRETE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLInvalidTypeImpl <em>OCL Invalid Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLInvalidTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLInvalidType()
	 * @generated
	 */
	int OCL_INVALID_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID_TYPE__CONFORMS = OCL_CONCRETE_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID_TYPE__NAME = OCL_CONCRETE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID_TYPE__TYPE_PARAMETER = OCL_CONCRETE_TYPE__TYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID_TYPE__CONTAINER = OCL_CONCRETE_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID_TYPE__OPERATION = OCL_CONCRETE_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID_TYPE__PROPERTY = OCL_CONCRETE_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID_TYPE__BOUND_TYPE = OCL_CONCRETE_TYPE__BOUND_TYPE;

	/**
	 * The number of structural features of the '<em>OCL Invalid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID_TYPE_FEATURE_COUNT = OCL_CONCRETE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_NAMED_ELEMENT__NAME = OCL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_NAMED_ELEMENT_FEATURE_COUNT = OCL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPED_ELEMENT__NAME = OCL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPED_ELEMENT__TYPE = OCL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPED_ELEMENT__BOUND_TYPE = OCL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPED_ELEMENT_FEATURE_COUNT = OCL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ITERATOR__NAME = OCL_TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ITERATOR__TYPE = OCL_TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ITERATOR__BOUND_TYPE = OCL_TYPED_ELEMENT__BOUND_TYPE;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ITERATOR__CONTAINER = OCL_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ITERATOR_FEATURE_COUNT = OCL_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_JAVA_TYPE__CONFORMS = OCL_CONCRETE_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_JAVA_TYPE__NAME = OCL_CONCRETE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_JAVA_TYPE__TYPE_PARAMETER = OCL_CONCRETE_TYPE__TYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_JAVA_TYPE__CONTAINER = OCL_CONCRETE_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_JAVA_TYPE__OPERATION = OCL_CONCRETE_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_JAVA_TYPE__PROPERTY = OCL_CONCRETE_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_JAVA_TYPE__BOUND_TYPE = OCL_CONCRETE_TYPE__BOUND_TYPE;

	/**
	 * The feature id for the '<em><b>Java Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_JAVA_TYPE__JAVA_CLASS = OCL_CONCRETE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Java Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_JAVA_TYPE_FEATURE_COUNT = OCL_CONCRETE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PACKAGE_PARENT__NAME = OCL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PACKAGE_PARENT__PACKAGE = OCL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Package Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PACKAGE_PARENT_FEATURE_COUNT = OCL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY__NAME = OCL_PACKAGE_PARENT__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY__PACKAGE = OCL_PACKAGE_PARENT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY__EXTENDS = OCL_PACKAGE_PARENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY__TYPE = OCL_PACKAGE_PARENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_FEATURE_COUNT = OCL_PACKAGE_PARENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__NAME = OCL_TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__TYPE = OCL_TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__BOUND_TYPE = OCL_TYPED_ELEMENT__BOUND_TYPE;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__TYPE_PARAMETER = OCL_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__CONTAINER = OCL_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__IS_STATIC = OCL_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__ITERATOR = OCL_TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__PARAMETER = OCL_TYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>OCL Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION_FEATURE_COUNT = OCL_TYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_OPERATION__NAME = OCL_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_OPERATION__TYPE = OCL_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_OPERATION__BOUND_TYPE = OCL_OPERATION__BOUND_TYPE;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_OPERATION__TYPE_PARAMETER = OCL_OPERATION__TYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_OPERATION__CONTAINER = OCL_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_OPERATION__IS_STATIC = OCL_OPERATION__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_OPERATION__ITERATOR = OCL_OPERATION__ITERATOR;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_OPERATION__PARAMETER = OCL_OPERATION__PARAMETER;

	/**
	 * The feature id for the '<em><b>Library Operation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_OPERATION__LIBRARY_OPERATION_CLASS = OCL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Library Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_OPERATION__LIBRARY_OPERATION = OCL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Library Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_OPERATION_FEATURE_COUNT = OCL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PROPERTY__NAME = OCL_TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PROPERTY__TYPE = OCL_TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PROPERTY__BOUND_TYPE = OCL_TYPED_ELEMENT__BOUND_TYPE;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PROPERTY__CONTAINER = OCL_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PROPERTY__IS_STATIC = OCL_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PROPERTY_FEATURE_COUNT = OCL_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_PROPERTY__NAME = OCL_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_PROPERTY__TYPE = OCL_PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_PROPERTY__BOUND_TYPE = OCL_PROPERTY__BOUND_TYPE;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_PROPERTY__CONTAINER = OCL_PROPERTY__CONTAINER;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_PROPERTY__IS_STATIC = OCL_PROPERTY__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Library Property Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY_CLASS = OCL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Library Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY = OCL_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Library Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_PROPERTY_FEATURE_COUNT = OCL_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PACKAGE__NAME = OCL_PACKAGE_PARENT__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PACKAGE__PACKAGE = OCL_PACKAGE_PARENT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PACKAGE__TYPE = OCL_PACKAGE_PARENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PACKAGE__CONTAINER = OCL_PACKAGE_PARENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PACKAGE_FEATURE_COUNT = OCL_PACKAGE_PARENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PARAMETER__NAME = OCL_TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PARAMETER__TYPE = OCL_TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PARAMETER__BOUND_TYPE = OCL_TYPED_ELEMENT__BOUND_TYPE;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PARAMETER__CONTAINER = OCL_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PARAMETER_FEATURE_COUNT = OCL_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__NAME = OCL_LIBRARY__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__PACKAGE = OCL_LIBRARY__PACKAGE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__EXTENDS = OCL_LIBRARY__EXTENDS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__TYPE = OCL_LIBRARY__TYPE;

	/**
	 * The feature id for the '<em><b>Bag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__BAG = OCL_LIBRARY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Boolean</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__BOOLEAN = OCL_LIBRARY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__CLASSIFIER = OCL_LIBRARY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__COLLECTION = OCL_LIBRARY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__ENUMERATION = OCL_LIBRARY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Integer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__INTEGER = OCL_LIBRARY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Java</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__JAVA = OCL_LIBRARY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ocl Any</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__OCL_ANY = OCL_LIBRARY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ocl Invalid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__OCL_INVALID = OCL_LIBRARY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ocl Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__OCL_MESSAGE = OCL_LIBRARY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ocl Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__OCL_TUPLE = OCL_LIBRARY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Ocl Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__OCL_TYPE = OCL_LIBRARY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Ocl Void</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__OCL_VOID = OCL_LIBRARY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Ordered Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__ORDERED_SET = OCL_LIBRARY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Real</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__REAL = OCL_LIBRARY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__SEQUENCE = OCL_LIBRARY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__SET = OCL_LIBRARY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>String</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__STRING = OCL_LIBRARY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Unlimited Natural</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__UNLIMITED_NATURAL = OCL_LIBRARY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Invalid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__INVALID = OCL_LIBRARY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Null</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__NULL = OCL_LIBRARY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Unlimited</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__UNLIMITED = OCL_LIBRARY_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>OCL Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT_FEATURE_COUNT = OCL_LIBRARY_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE_BINDING__TYPE_PARAMETER = OCL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE_BINDING__TYPE_VALUE = OCL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE_BINDING__BOUND_TYPE = OCL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>OCL Type Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE_BINDING_FEATURE_COUNT = OCL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLTypeParameterImpl <em>OCL Type Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLTypeParameterImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLTypeParameter()
	 * @generated
	 */
	int OCL_TYPE_PARAMETER = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE_PARAMETER__NAME = OCL_TYPE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Parameter Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE_PARAMETER__TYPE_PARAMETER_PARENT = OCL_TYPE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE_PARAMETER_FEATURE_COUNT = OCL_TYPE_VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLTypeParameterParentImpl <em>OCL Type Parameter Parent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLTypeParameterParentImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLTypeParameterParent()
	 * @generated
	 */
	int OCL_TYPE_PARAMETER_PARENT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE_PARAMETER_PARENT__NAME = OCL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE_PARAMETER_PARENT__TYPE_PARAMETER = OCL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Type Parameter Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE_PARAMETER_PARENT_FEATURE_COUNT = OCL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLVoidTypeImpl <em>OCL Void Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLVoidTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLVoidType()
	 * @generated
	 */
	int OCL_VOID_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_VOID_TYPE__CONFORMS = OCL_CONCRETE_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_VOID_TYPE__NAME = OCL_CONCRETE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_VOID_TYPE__TYPE_PARAMETER = OCL_CONCRETE_TYPE__TYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_VOID_TYPE__CONTAINER = OCL_CONCRETE_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_VOID_TYPE__OPERATION = OCL_CONCRETE_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_VOID_TYPE__PROPERTY = OCL_CONCRETE_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_VOID_TYPE__BOUND_TYPE = OCL_CONCRETE_TYPE__BOUND_TYPE;

	/**
	 * The number of structural features of the '<em>OCL Void Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_VOID_TYPE_FEATURE_COUNT = OCL_CONCRETE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>ILibrary Operation</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.LibraryOperation
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getILibraryOperation()
	 * @generated
	 */
	int ILIBRARY_OPERATION = 26;

	/**
	 * The meta object id for the '<em>ILibrary Property</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.LibraryProperty
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getILibraryProperty()
	 * @generated
	 */
	int ILIBRARY_PROPERTY = 27;


	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLAnyType <em>OCL Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Any Type</em>'.
	 * @see org.eclipse.ocl.library.OCLAnyType
	 * @generated
	 */
	EClass getOCLAnyType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLLibrary <em>OCL Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Library</em>'.
	 * @see org.eclipse.ocl.library.OCLLibrary
	 * @generated
	 */
	EClass getOCLLibrary();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.ocl.library.OCLLibrary#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see org.eclipse.ocl.library.OCLLibrary#getExtends()
	 * @see #getOCLLibrary()
	 * @generated
	 */
	EReference getOCLLibrary_Extends();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.OCLLibrary#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see org.eclipse.ocl.library.OCLLibrary#getType()
	 * @see #getOCLLibrary()
	 * @generated
	 */
	EReference getOCLLibrary_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLBoundType <em>OCL Bound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Bound Type</em>'.
	 * @see org.eclipse.ocl.library.OCLBoundType
	 * @generated
	 */
	EClass getOCLBoundType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLBoundType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.ocl.library.OCLBoundType#getType()
	 * @see #getOCLBoundType()
	 * @generated
	 */
	EReference getOCLBoundType_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.OCLBoundType#getTypeBinding <em>Type Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Binding</em>'.
	 * @see org.eclipse.ocl.library.OCLBoundType#getTypeBinding()
	 * @see #getOCLBoundType()
	 * @generated
	 */
	EReference getOCLBoundType_TypeBinding();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLCache <em>OCL Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Cache</em>'.
	 * @see org.eclipse.ocl.library.OCLCache
	 * @generated
	 */
	EClass getOCLCache();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getBag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bag</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getBag()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_Bag();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Boolean</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getBoolean()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_Boolean();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getClassifier()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_Classifier();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Collection</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getCollection()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_Collection();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enumeration</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getEnumeration()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_Enumeration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Integer</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getInteger()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_Integer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getJava <em>Java</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Java</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getJava()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_Java();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getOclAny <em>Ocl Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ocl Any</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getOclAny()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_OclAny();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getOclInvalid <em>Ocl Invalid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ocl Invalid</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getOclInvalid()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_OclInvalid();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getOclMessage <em>Ocl Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ocl Message</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getOclMessage()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_OclMessage();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getOclTuple <em>Ocl Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ocl Tuple</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getOclTuple()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_OclTuple();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getOclType <em>Ocl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ocl Type</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getOclType()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_OclType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getOclVoid <em>Ocl Void</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ocl Void</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getOclVoid()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_OclVoid();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getOrderedSet <em>Ordered Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ordered Set</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getOrderedSet()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_OrderedSet();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getReal <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Real</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getReal()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_Real();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sequence</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getSequence()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_Sequence();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getSet()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_Set();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>String</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getString()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_String();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getUnlimitedNatural <em>Unlimited Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unlimited Natural</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getUnlimitedNatural()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_UnlimitedNatural();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getInvalid <em>Invalid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invalid</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getInvalid()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_Invalid();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getNull <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Null</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getNull()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_Null();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getUnlimited <em>Unlimited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unlimited</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getUnlimited()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_Unlimited();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLConcreteType <em>OCL Concrete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Concrete Type</em>'.
	 * @see org.eclipse.ocl.library.OCLConcreteType
	 * @generated
	 */
	EClass getOCLConcreteType();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.library.OCLConcreteType#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.eclipse.ocl.library.OCLConcreteType#getContainer()
	 * @see #getOCLConcreteType()
	 * @generated
	 */
	EReference getOCLConcreteType_Container();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.OCLConcreteType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see org.eclipse.ocl.library.OCLConcreteType#getOperation()
	 * @see #getOCLConcreteType()
	 * @generated
	 */
	EReference getOCLConcreteType_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.OCLConcreteType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.eclipse.ocl.library.OCLConcreteType#getProperty()
	 * @see #getOCLConcreteType()
	 * @generated
	 */
	EReference getOCLConcreteType_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.OCLConcreteType#getBoundType <em>Bound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bound Type</em>'.
	 * @see org.eclipse.ocl.library.OCLConcreteType#getBoundType()
	 * @see #getOCLConcreteType()
	 * @generated
	 */
	EReference getOCLConcreteType_BoundType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLDeprecatedType <em>OCL Deprecated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Deprecated Type</em>'.
	 * @see org.eclipse.ocl.library.OCLDeprecatedType
	 * @generated
	 */
	EClass getOCLDeprecatedType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLElement <em>OCL Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Element</em>'.
	 * @see org.eclipse.ocl.library.OCLElement
	 * @generated
	 */
	EClass getOCLElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLInvalidType <em>OCL Invalid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Invalid Type</em>'.
	 * @see org.eclipse.ocl.library.OCLInvalidType
	 * @generated
	 */
	EClass getOCLInvalidType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLIterator <em>OCL Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Iterator</em>'.
	 * @see org.eclipse.ocl.library.OCLIterator
	 * @generated
	 */
	EClass getOCLIterator();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.library.OCLIterator#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.eclipse.ocl.library.OCLIterator#getContainer()
	 * @see #getOCLIterator()
	 * @generated
	 */
	EReference getOCLIterator_Container();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLJavaType <em>OCL Java Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Java Type</em>'.
	 * @see org.eclipse.ocl.library.OCLJavaType
	 * @generated
	 */
	EClass getOCLJavaType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.library.OCLJavaType#getJavaClass <em>Java Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Class</em>'.
	 * @see org.eclipse.ocl.library.OCLJavaType#getJavaClass()
	 * @see #getOCLJavaType()
	 * @generated
	 */
	EAttribute getOCLJavaType_JavaClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLLibraryOperation <em>OCL Library Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Library Operation</em>'.
	 * @see org.eclipse.ocl.library.OCLLibraryOperation
	 * @generated
	 */
	EClass getOCLLibraryOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.library.OCLLibraryOperation#getLibraryOperationClass <em>Library Operation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Operation Class</em>'.
	 * @see org.eclipse.ocl.library.OCLLibraryOperation#getLibraryOperationClass()
	 * @see #getOCLLibraryOperation()
	 * @generated
	 */
	EAttribute getOCLLibraryOperation_LibraryOperationClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.library.OCLLibraryOperation#getLibraryOperation <em>Library Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Operation</em>'.
	 * @see org.eclipse.ocl.library.OCLLibraryOperation#getLibraryOperation()
	 * @see #getOCLLibraryOperation()
	 * @generated
	 */
	EAttribute getOCLLibraryOperation_LibraryOperation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLLibraryProperty <em>OCL Library Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Library Property</em>'.
	 * @see org.eclipse.ocl.library.OCLLibraryProperty
	 * @generated
	 */
	EClass getOCLLibraryProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.library.OCLLibraryProperty#getLibraryPropertyClass <em>Library Property Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Property Class</em>'.
	 * @see org.eclipse.ocl.library.OCLLibraryProperty#getLibraryPropertyClass()
	 * @see #getOCLLibraryProperty()
	 * @generated
	 */
	EAttribute getOCLLibraryProperty_LibraryPropertyClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.library.OCLLibraryProperty#getLibraryProperty <em>Library Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Property</em>'.
	 * @see org.eclipse.ocl.library.OCLLibraryProperty#getLibraryProperty()
	 * @see #getOCLLibraryProperty()
	 * @generated
	 */
	EAttribute getOCLLibraryProperty_LibraryProperty();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLNamedElement <em>OCL Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Named Element</em>'.
	 * @see org.eclipse.ocl.library.OCLNamedElement
	 * @generated
	 */
	EClass getOCLNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.library.OCLNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.ocl.library.OCLNamedElement#getName()
	 * @see #getOCLNamedElement()
	 * @generated
	 */
	EAttribute getOCLNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLOperation <em>OCL Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Operation</em>'.
	 * @see org.eclipse.ocl.library.OCLOperation
	 * @generated
	 */
	EClass getOCLOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.OCLOperation#getIterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iterator</em>'.
	 * @see org.eclipse.ocl.library.OCLOperation#getIterator()
	 * @see #getOCLOperation()
	 * @generated
	 */
	EReference getOCLOperation_Iterator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.OCLOperation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see org.eclipse.ocl.library.OCLOperation#getParameter()
	 * @see #getOCLOperation()
	 * @generated
	 */
	EReference getOCLOperation_Parameter();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.library.OCLOperation#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.eclipse.ocl.library.OCLOperation#getContainer()
	 * @see #getOCLOperation()
	 * @generated
	 */
	EReference getOCLOperation_Container();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.library.OCLOperation#isStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see org.eclipse.ocl.library.OCLOperation#isStatic()
	 * @see #getOCLOperation()
	 * @generated
	 */
	EAttribute getOCLOperation_IsStatic();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLPackage <em>OCL Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Package</em>'.
	 * @see org.eclipse.ocl.library.OCLPackage
	 * @generated
	 */
	EClass getOCLPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.OCLPackage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see org.eclipse.ocl.library.OCLPackage#getType()
	 * @see #getOCLPackage()
	 * @generated
	 */
	EReference getOCLPackage_Type();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.library.OCLPackage#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.eclipse.ocl.library.OCLPackage#getContainer()
	 * @see #getOCLPackage()
	 * @generated
	 */
	EReference getOCLPackage_Container();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLPackageParent <em>OCL Package Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Package Parent</em>'.
	 * @see org.eclipse.ocl.library.OCLPackageParent
	 * @generated
	 */
	EClass getOCLPackageParent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.OCLPackageParent#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package</em>'.
	 * @see org.eclipse.ocl.library.OCLPackageParent#getPackage()
	 * @see #getOCLPackageParent()
	 * @generated
	 */
	EReference getOCLPackageParent_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLParameter <em>OCL Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Parameter</em>'.
	 * @see org.eclipse.ocl.library.OCLParameter
	 * @generated
	 */
	EClass getOCLParameter();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.library.OCLParameter#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.eclipse.ocl.library.OCLParameter#getContainer()
	 * @see #getOCLParameter()
	 * @generated
	 */
	EReference getOCLParameter_Container();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLProperty <em>OCL Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Property</em>'.
	 * @see org.eclipse.ocl.library.OCLProperty
	 * @generated
	 */
	EClass getOCLProperty();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLProperty#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see org.eclipse.ocl.library.OCLProperty#getContainer()
	 * @see #getOCLProperty()
	 * @generated
	 */
	EReference getOCLProperty_Container();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.library.OCLProperty#isStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see org.eclipse.ocl.library.OCLProperty#isStatic()
	 * @see #getOCLProperty()
	 * @generated
	 */
	EAttribute getOCLProperty_IsStatic();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLRoot <em>OCL Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Root</em>'.
	 * @see org.eclipse.ocl.library.OCLRoot
	 * @generated
	 */
	EClass getOCLRoot();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLType <em>OCL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Type</em>'.
	 * @see org.eclipse.ocl.library.OCLType
	 * @generated
	 */
	EClass getOCLType();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.ocl.library.OCLType#getConforms <em>Conforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conforms</em>'.
	 * @see org.eclipse.ocl.library.OCLType#getConforms()
	 * @see #getOCLType()
	 * @generated
	 */
	EReference getOCLType_Conforms();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLTypeBinding <em>OCL Type Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Type Binding</em>'.
	 * @see org.eclipse.ocl.library.OCLTypeBinding
	 * @generated
	 */
	EClass getOCLTypeBinding();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLTypeBinding#getTypeParameter <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Parameter</em>'.
	 * @see org.eclipse.ocl.library.OCLTypeBinding#getTypeParameter()
	 * @see #getOCLTypeBinding()
	 * @generated
	 */
	EReference getOCLTypeBinding_TypeParameter();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLTypeBinding#getTypeValue <em>Type Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Value</em>'.
	 * @see org.eclipse.ocl.library.OCLTypeBinding#getTypeValue()
	 * @see #getOCLTypeBinding()
	 * @generated
	 */
	EReference getOCLTypeBinding_TypeValue();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.library.OCLTypeBinding#getBoundType <em>Bound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bound Type</em>'.
	 * @see org.eclipse.ocl.library.OCLTypeBinding#getBoundType()
	 * @see #getOCLTypeBinding()
	 * @generated
	 */
	EReference getOCLTypeBinding_BoundType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLTypeParameter <em>OCL Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Type Parameter</em>'.
	 * @see org.eclipse.ocl.library.OCLTypeParameter
	 * @generated
	 */
	EClass getOCLTypeParameter();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.library.OCLTypeParameter#getTypeParameterParent <em>Type Parameter Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Type Parameter Parent</em>'.
	 * @see org.eclipse.ocl.library.OCLTypeParameter#getTypeParameterParent()
	 * @see #getOCLTypeParameter()
	 * @generated
	 */
	EReference getOCLTypeParameter_TypeParameterParent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLTypeParameterParent <em>OCL Type Parameter Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Type Parameter Parent</em>'.
	 * @see org.eclipse.ocl.library.OCLTypeParameterParent
	 * @generated
	 */
	EClass getOCLTypeParameterParent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.OCLTypeParameterParent#getTypeParameter <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameter</em>'.
	 * @see org.eclipse.ocl.library.OCLTypeParameterParent#getTypeParameter()
	 * @see #getOCLTypeParameterParent()
	 * @generated
	 */
	EReference getOCLTypeParameterParent_TypeParameter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLTypedElement <em>OCL Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Typed Element</em>'.
	 * @see org.eclipse.ocl.library.OCLTypedElement
	 * @generated
	 */
	EClass getOCLTypedElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLTypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.ocl.library.OCLTypedElement#getType()
	 * @see #getOCLTypedElement()
	 * @generated
	 */
	EReference getOCLTypedElement_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.OCLTypedElement#getBoundType <em>Bound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bound Type</em>'.
	 * @see org.eclipse.ocl.library.OCLTypedElement#getBoundType()
	 * @see #getOCLTypedElement()
	 * @generated
	 */
	EReference getOCLTypedElement_BoundType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLTypeValue <em>OCL Type Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Type Value</em>'.
	 * @see org.eclipse.ocl.library.OCLTypeValue
	 * @generated
	 */
	EClass getOCLTypeValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLVoidType <em>OCL Void Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Void Type</em>'.
	 * @see org.eclipse.ocl.library.OCLVoidType
	 * @generated
	 */
	EClass getOCLVoidType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.ocl.library.LibraryOperation <em>ILibrary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ILibrary Operation</em>'.
	 * @see org.eclipse.ocl.library.LibraryOperation
	 * @model instanceClass="org.eclipse.ocl.library.ILibraryOperation" serializeable="false"
	 * @generated
	 */
	EDataType getILibraryOperation();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.ocl.library.LibraryProperty <em>ILibrary Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ILibrary Property</em>'.
	 * @see org.eclipse.ocl.library.LibraryProperty
	 * @model instanceClass="org.eclipse.ocl.library.ILibraryProperty" serializeable="false"
	 * @generated
	 */
	EDataType getILibraryProperty();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LibraryFactory getLibraryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLAnyTypeImpl <em>OCL Any Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLAnyTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLAnyType()
		 * @generated
		 */
		EClass OCL_ANY_TYPE = eINSTANCE.getOCLAnyType();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLLibraryImpl <em>OCL Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLLibraryImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLLibrary()
		 * @generated
		 */
		EClass OCL_LIBRARY = eINSTANCE.getOCLLibrary();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_LIBRARY__EXTENDS = eINSTANCE.getOCLLibrary_Extends();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_LIBRARY__TYPE = eINSTANCE.getOCLLibrary_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLBoundTypeImpl <em>OCL Bound Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLBoundTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLBoundType()
		 * @generated
		 */
		EClass OCL_BOUND_TYPE = eINSTANCE.getOCLBoundType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_BOUND_TYPE__TYPE = eINSTANCE.getOCLBoundType_Type();

		/**
		 * The meta object literal for the '<em><b>Type Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_BOUND_TYPE__TYPE_BINDING = eINSTANCE.getOCLBoundType_TypeBinding();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.OCLCache <em>OCL Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.OCLCache
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLCache()
		 * @generated
		 */
		EClass OCL_CACHE = eINSTANCE.getOCLCache();

		/**
		 * The meta object literal for the '<em><b>Bag</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__BAG = eINSTANCE.getOCLCache_Bag();

		/**
		 * The meta object literal for the '<em><b>Boolean</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__BOOLEAN = eINSTANCE.getOCLCache_Boolean();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__CLASSIFIER = eINSTANCE.getOCLCache_Classifier();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__COLLECTION = eINSTANCE.getOCLCache_Collection();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__ENUMERATION = eINSTANCE.getOCLCache_Enumeration();

		/**
		 * The meta object literal for the '<em><b>Integer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__INTEGER = eINSTANCE.getOCLCache_Integer();

		/**
		 * The meta object literal for the '<em><b>Java</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__JAVA = eINSTANCE.getOCLCache_Java();

		/**
		 * The meta object literal for the '<em><b>Ocl Any</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__OCL_ANY = eINSTANCE.getOCLCache_OclAny();

		/**
		 * The meta object literal for the '<em><b>Ocl Invalid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__OCL_INVALID = eINSTANCE.getOCLCache_OclInvalid();

		/**
		 * The meta object literal for the '<em><b>Ocl Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__OCL_MESSAGE = eINSTANCE.getOCLCache_OclMessage();

		/**
		 * The meta object literal for the '<em><b>Ocl Tuple</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__OCL_TUPLE = eINSTANCE.getOCLCache_OclTuple();

		/**
		 * The meta object literal for the '<em><b>Ocl Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__OCL_TYPE = eINSTANCE.getOCLCache_OclType();

		/**
		 * The meta object literal for the '<em><b>Ocl Void</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__OCL_VOID = eINSTANCE.getOCLCache_OclVoid();

		/**
		 * The meta object literal for the '<em><b>Ordered Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__ORDERED_SET = eINSTANCE.getOCLCache_OrderedSet();

		/**
		 * The meta object literal for the '<em><b>Real</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__REAL = eINSTANCE.getOCLCache_Real();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__SEQUENCE = eINSTANCE.getOCLCache_Sequence();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__SET = eINSTANCE.getOCLCache_Set();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__STRING = eINSTANCE.getOCLCache_String();

		/**
		 * The meta object literal for the '<em><b>Unlimited Natural</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__UNLIMITED_NATURAL = eINSTANCE.getOCLCache_UnlimitedNatural();

		/**
		 * The meta object literal for the '<em><b>Invalid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__INVALID = eINSTANCE.getOCLCache_Invalid();

		/**
		 * The meta object literal for the '<em><b>Null</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__NULL = eINSTANCE.getOCLCache_Null();

		/**
		 * The meta object literal for the '<em><b>Unlimited</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__UNLIMITED = eINSTANCE.getOCLCache_Unlimited();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLConcreteTypeImpl <em>OCL Concrete Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLConcreteTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLConcreteType()
		 * @generated
		 */
		EClass OCL_CONCRETE_TYPE = eINSTANCE.getOCLConcreteType();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CONCRETE_TYPE__CONTAINER = eINSTANCE.getOCLConcreteType_Container();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CONCRETE_TYPE__OPERATION = eINSTANCE.getOCLConcreteType_Operation();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CONCRETE_TYPE__PROPERTY = eINSTANCE.getOCLConcreteType_Property();

		/**
		 * The meta object literal for the '<em><b>Bound Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CONCRETE_TYPE__BOUND_TYPE = eINSTANCE.getOCLConcreteType_BoundType();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLDeprecatedTypeImpl <em>OCL Deprecated Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLDeprecatedTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLDeprecatedType()
		 * @generated
		 */
		EClass OCL_DEPRECATED_TYPE = eINSTANCE.getOCLDeprecatedType();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLElementImpl <em>OCL Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLElementImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLElement()
		 * @generated
		 */
		EClass OCL_ELEMENT = eINSTANCE.getOCLElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLInvalidTypeImpl <em>OCL Invalid Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLInvalidTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLInvalidType()
		 * @generated
		 */
		EClass OCL_INVALID_TYPE = eINSTANCE.getOCLInvalidType();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLIteratorImpl <em>OCL Iterator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLIteratorImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLIterator()
		 * @generated
		 */
		EClass OCL_ITERATOR = eINSTANCE.getOCLIterator();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_ITERATOR__CONTAINER = eINSTANCE.getOCLIterator_Container();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLJavaTypeImpl <em>OCL Java Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLJavaTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLJavaType()
		 * @generated
		 */
		EClass OCL_JAVA_TYPE = eINSTANCE.getOCLJavaType();

		/**
		 * The meta object literal for the '<em><b>Java Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_JAVA_TYPE__JAVA_CLASS = eINSTANCE.getOCLJavaType_JavaClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLLibraryOperationImpl <em>OCL Library Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLLibraryOperationImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLLibraryOperation()
		 * @generated
		 */
		EClass OCL_LIBRARY_OPERATION = eINSTANCE.getOCLLibraryOperation();

		/**
		 * The meta object literal for the '<em><b>Library Operation Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_LIBRARY_OPERATION__LIBRARY_OPERATION_CLASS = eINSTANCE.getOCLLibraryOperation_LibraryOperationClass();

		/**
		 * The meta object literal for the '<em><b>Library Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_LIBRARY_OPERATION__LIBRARY_OPERATION = eINSTANCE.getOCLLibraryOperation_LibraryOperation();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLLibraryPropertyImpl <em>OCL Library Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLLibraryPropertyImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLLibraryProperty()
		 * @generated
		 */
		EClass OCL_LIBRARY_PROPERTY = eINSTANCE.getOCLLibraryProperty();

		/**
		 * The meta object literal for the '<em><b>Library Property Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY_CLASS = eINSTANCE.getOCLLibraryProperty_LibraryPropertyClass();

		/**
		 * The meta object literal for the '<em><b>Library Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY = eINSTANCE.getOCLLibraryProperty_LibraryProperty();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLNamedElementImpl <em>OCL Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLNamedElementImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLNamedElement()
		 * @generated
		 */
		EClass OCL_NAMED_ELEMENT = eINSTANCE.getOCLNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_NAMED_ELEMENT__NAME = eINSTANCE.getOCLNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLOperationImpl <em>OCL Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLOperationImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLOperation()
		 * @generated
		 */
		EClass OCL_OPERATION = eINSTANCE.getOCLOperation();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_OPERATION__ITERATOR = eINSTANCE.getOCLOperation_Iterator();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_OPERATION__PARAMETER = eINSTANCE.getOCLOperation_Parameter();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_OPERATION__CONTAINER = eINSTANCE.getOCLOperation_Container();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_OPERATION__IS_STATIC = eINSTANCE.getOCLOperation_IsStatic();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLPackageImpl <em>OCL Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLPackageImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLPackage()
		 * @generated
		 */
		EClass OCL_PACKAGE = eINSTANCE.getOCLPackage();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_PACKAGE__TYPE = eINSTANCE.getOCLPackage_Type();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_PACKAGE__CONTAINER = eINSTANCE.getOCLPackage_Container();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLPackageParentImpl <em>OCL Package Parent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLPackageParentImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLPackageParent()
		 * @generated
		 */
		EClass OCL_PACKAGE_PARENT = eINSTANCE.getOCLPackageParent();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_PACKAGE_PARENT__PACKAGE = eINSTANCE.getOCLPackageParent_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLParameterImpl <em>OCL Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLParameterImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLParameter()
		 * @generated
		 */
		EClass OCL_PARAMETER = eINSTANCE.getOCLParameter();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_PARAMETER__CONTAINER = eINSTANCE.getOCLParameter_Container();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLPropertyImpl <em>OCL Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLPropertyImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLProperty()
		 * @generated
		 */
		EClass OCL_PROPERTY = eINSTANCE.getOCLProperty();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_PROPERTY__CONTAINER = eINSTANCE.getOCLProperty_Container();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_PROPERTY__IS_STATIC = eINSTANCE.getOCLProperty_IsStatic();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLRootImpl <em>OCL Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLRootImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLRoot()
		 * @generated
		 */
		EClass OCL_ROOT = eINSTANCE.getOCLRoot();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLTypeImpl <em>OCL Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLType()
		 * @generated
		 */
		EClass OCL_TYPE = eINSTANCE.getOCLType();

		/**
		 * The meta object literal for the '<em><b>Conforms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__CONFORMS = eINSTANCE.getOCLType_Conforms();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLTypeBindingImpl <em>OCL Type Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLTypeBindingImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLTypeBinding()
		 * @generated
		 */
		EClass OCL_TYPE_BINDING = eINSTANCE.getOCLTypeBinding();

		/**
		 * The meta object literal for the '<em><b>Type Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE_BINDING__TYPE_PARAMETER = eINSTANCE.getOCLTypeBinding_TypeParameter();

		/**
		 * The meta object literal for the '<em><b>Type Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE_BINDING__TYPE_VALUE = eINSTANCE.getOCLTypeBinding_TypeValue();

		/**
		 * The meta object literal for the '<em><b>Bound Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE_BINDING__BOUND_TYPE = eINSTANCE.getOCLTypeBinding_BoundType();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLTypeParameterImpl <em>OCL Type Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLTypeParameterImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLTypeParameter()
		 * @generated
		 */
		EClass OCL_TYPE_PARAMETER = eINSTANCE.getOCLTypeParameter();

		/**
		 * The meta object literal for the '<em><b>Type Parameter Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE_PARAMETER__TYPE_PARAMETER_PARENT = eINSTANCE.getOCLTypeParameter_TypeParameterParent();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLTypeParameterParentImpl <em>OCL Type Parameter Parent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLTypeParameterParentImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLTypeParameterParent()
		 * @generated
		 */
		EClass OCL_TYPE_PARAMETER_PARENT = eINSTANCE.getOCLTypeParameterParent();

		/**
		 * The meta object literal for the '<em><b>Type Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE_PARAMETER_PARENT__TYPE_PARAMETER = eINSTANCE.getOCLTypeParameterParent_TypeParameter();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLTypedElementImpl <em>OCL Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLTypedElementImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLTypedElement()
		 * @generated
		 */
		EClass OCL_TYPED_ELEMENT = eINSTANCE.getOCLTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPED_ELEMENT__TYPE = eINSTANCE.getOCLTypedElement_Type();

		/**
		 * The meta object literal for the '<em><b>Bound Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPED_ELEMENT__BOUND_TYPE = eINSTANCE.getOCLTypedElement_BoundType();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.OCLTypeValue <em>OCL Type Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.OCLTypeValue
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLTypeValue()
		 * @generated
		 */
		EClass OCL_TYPE_VALUE = eINSTANCE.getOCLTypeValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLVoidTypeImpl <em>OCL Void Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLVoidTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLVoidType()
		 * @generated
		 */
		EClass OCL_VOID_TYPE = eINSTANCE.getOCLVoidType();

		/**
		 * The meta object literal for the '<em>ILibrary Operation</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.LibraryOperation
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getILibraryOperation()
		 * @generated
		 */
		EDataType ILIBRARY_OPERATION = eINSTANCE.getILibraryOperation();

		/**
		 * The meta object literal for the '<em>ILibrary Property</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.LibraryProperty
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getILibraryProperty()
		 * @generated
		 */
		EDataType ILIBRARY_PROPERTY = eINSTANCE.getILibraryProperty();

	}

} //OCLLibraryPackage
