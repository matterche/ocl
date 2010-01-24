/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryPackage.java,v 1.1.2.8 2010/01/24 07:40:56 ewillink Exp $
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
	int OCL_ELEMENT = 7;

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
	int OCL_NAMED_ELEMENT = 15;

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
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLPackageParentImpl <em>OCL Package Parent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLPackageParentImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLPackageParent()
	 * @generated
	 */
	int OCL_PACKAGE_PARENT = 22;

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
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLLibraryImpl <em>OCL Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLLibraryImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLLibrary()
	 * @generated
	 */
	int OCL_LIBRARY = 0;

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
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLTypeImpl <em>OCL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLType()
	 * @generated
	 */
	int OCL_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__NAME = OCL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__CONFORMS = OCL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__OPERATION = OCL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__PROPERTY = OCL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__CONTAINER = OCL_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>OCL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE_FEATURE_COUNT = OCL_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLAnyTypeImpl <em>OCL Any Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLAnyTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLAnyType()
	 * @generated
	 */
	int OCL_ANY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__CONFORMS = OCL_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__PROPERTY = OCL_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__CONTAINER = OCL_TYPE__CONTAINER;

	/**
	 * The number of structural features of the '<em>OCL Any Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLCollectionTypeImpl <em>OCL Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLCollectionTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLCollectionType()
	 * @generated
	 */
	int OCL_COLLECTION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_COLLECTION_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_COLLECTION_TYPE__CONFORMS = OCL_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_COLLECTION_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_COLLECTION_TYPE__PROPERTY = OCL_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_COLLECTION_TYPE__CONTAINER = OCL_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_COLLECTION_TYPE__ELEMENT_TYPE = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_COLLECTION_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLBagTypeImpl <em>OCL Bag Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLBagTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLBagType()
	 * @generated
	 */
	int OCL_BAG_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_BAG_TYPE__NAME = OCL_COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_BAG_TYPE__CONFORMS = OCL_COLLECTION_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_BAG_TYPE__OPERATION = OCL_COLLECTION_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_BAG_TYPE__PROPERTY = OCL_COLLECTION_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_BAG_TYPE__CONTAINER = OCL_COLLECTION_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_BAG_TYPE__ELEMENT_TYPE = OCL_COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>OCL Bag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_BAG_TYPE_FEATURE_COUNT = OCL_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.OCLCache <em>OCL Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.OCLCache
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLCache()
	 * @generated
	 */
	int OCL_CACHE = 3;

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
	 * The feature id for the '<em><b>Ocl Any</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__OCL_ANY = OCL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ocl Invalid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__OCL_INVALID = OCL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ocl Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__OCL_MESSAGE = OCL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ocl Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__OCL_TUPLE = OCL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ocl Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__OCL_TYPE = OCL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Ocl Void</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__OCL_VOID = OCL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Ordered Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__ORDERED_SET = OCL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Real</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__REAL = OCL_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__SEQUENCE = OCL_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__SET = OCL_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>String</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__STRING = OCL_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__T = OCL_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>TList</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__TLIST = OCL_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>T2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__T2 = OCL_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Unlimited Natural</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__UNLIMITED_NATURAL = OCL_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Invalid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__INVALID = OCL_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Null</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__NULL = OCL_ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Unlimited</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE__UNLIMITED = OCL_ELEMENT_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>OCL Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CACHE_FEATURE_COUNT = OCL_ELEMENT_FEATURE_COUNT + 24;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLClassifierImpl <em>OCL Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLClassifierImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLClassifier()
	 * @generated
	 */
	int OCL_CLASSIFIER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER__CONFORMS = OCL_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER__PROPERTY = OCL_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER__CONTAINER = OCL_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER__META_MODEL_ELEMENT = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLDataTypeImpl <em>OCL Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLDataTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLDataType()
	 * @generated
	 */
	int OCL_DATA_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE__CONFORMS = OCL_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE__PROPERTY = OCL_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE__CONTAINER = OCL_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE__META_MODEL_ELEMENT = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLEnumerationImpl <em>OCL Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLEnumerationImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLEnumeration()
	 * @generated
	 */
	int OCL_ENUMERATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__CONFORMS = OCL_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__PROPERTY = OCL_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__CONTAINER = OCL_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__META_MODEL_ELEMENT = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__LITERALS = OCL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLEnumerationLiteralImpl <em>OCL Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLEnumerationLiteralImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLEnumerationLiteral()
	 * @generated
	 */
	int OCL_ENUMERATION_LITERAL = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION_LITERAL__NAME = OCL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION_LITERAL__CONTAINER = OCL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION_LITERAL__META_MODEL_ELEMENT = OCL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION_LITERAL_FEATURE_COUNT = OCL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLInvalidTypeImpl <em>OCL Invalid Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLInvalidTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLInvalidType()
	 * @generated
	 */
	int OCL_INVALID_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID_TYPE__CONFORMS = OCL_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID_TYPE__PROPERTY = OCL_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID_TYPE__CONTAINER = OCL_TYPE__CONTAINER;

	/**
	 * The number of structural features of the '<em>OCL Invalid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLTypedElementImpl <em>OCL Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLTypedElementImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLTypedElement()
	 * @generated
	 */
	int OCL_TYPED_ELEMENT = 31;

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
	 * The number of structural features of the '<em>OCL Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPED_ELEMENT_FEATURE_COUNT = OCL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLOperationImpl <em>OCL Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLOperationImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLOperation()
	 * @generated
	 */
	int OCL_OPERATION = 18;

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
	 * The feature id for the '<em><b>Is Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__IS_ITERATOR = OCL_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__PARAMETER = OCL_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__CONTAINER = OCL_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>OCL Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION_FEATURE_COUNT = OCL_TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLLibraryOperationImpl <em>OCL Library Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLLibraryOperationImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLLibraryOperation()
	 * @generated
	 */
	int OCL_LIBRARY_OPERATION = 11;

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
	 * The feature id for the '<em><b>Is Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_OPERATION__IS_ITERATOR = OCL_OPERATION__IS_ITERATOR;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_OPERATION__PARAMETER = OCL_OPERATION__PARAMETER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_OPERATION__CONTAINER = OCL_OPERATION__CONTAINER;

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
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLPropertyImpl <em>OCL Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLPropertyImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLProperty()
	 * @generated
	 */
	int OCL_PROPERTY = 25;

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
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PROPERTY__CONTAINER = OCL_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PROPERTY_FEATURE_COUNT = OCL_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLLibraryPropertyImpl <em>OCL Library Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLLibraryPropertyImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLLibraryProperty()
	 * @generated
	 */
	int OCL_LIBRARY_PROPERTY = 12;

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
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_PROPERTY__CONTAINER = OCL_PROPERTY__CONTAINER;

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
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLMetaModelOperationImpl <em>OCL Meta Model Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLMetaModelOperationImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLMetaModelOperation()
	 * @generated
	 */
	int OCL_META_MODEL_OPERATION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION__NAME = OCL_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION__TYPE = OCL_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Is Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION__IS_ITERATOR = OCL_OPERATION__IS_ITERATOR;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION__PARAMETER = OCL_OPERATION__PARAMETER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION__CONTAINER = OCL_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION__META_MODEL_ELEMENT = OCL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Meta Model Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION_FEATURE_COUNT = OCL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLMetaModelPropertyImpl <em>OCL Meta Model Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLMetaModelPropertyImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLMetaModelProperty()
	 * @generated
	 */
	int OCL_META_MODEL_PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_PROPERTY__NAME = OCL_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_PROPERTY__TYPE = OCL_PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_PROPERTY__CONTAINER = OCL_PROPERTY__CONTAINER;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_PROPERTY__META_MODEL_ELEMENT = OCL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Meta Model Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_PROPERTY_FEATURE_COUNT = OCL_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLNonOrderedCollectionTypeImpl <em>OCL Non Ordered Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLNonOrderedCollectionTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLNonOrderedCollectionType()
	 * @generated
	 */
	int OCL_NON_ORDERED_COLLECTION_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_NON_ORDERED_COLLECTION_TYPE__NAME = OCL_COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_NON_ORDERED_COLLECTION_TYPE__CONFORMS = OCL_COLLECTION_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_NON_ORDERED_COLLECTION_TYPE__OPERATION = OCL_COLLECTION_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_NON_ORDERED_COLLECTION_TYPE__PROPERTY = OCL_COLLECTION_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_NON_ORDERED_COLLECTION_TYPE__CONTAINER = OCL_COLLECTION_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_NON_ORDERED_COLLECTION_TYPE__ELEMENT_TYPE = OCL_COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>OCL Non Ordered Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_NON_ORDERED_COLLECTION_TYPE_FEATURE_COUNT = OCL_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLNonUniqueCollectionTypeImpl <em>OCL Non Unique Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLNonUniqueCollectionTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLNonUniqueCollectionType()
	 * @generated
	 */
	int OCL_NON_UNIQUE_COLLECTION_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_NON_UNIQUE_COLLECTION_TYPE__NAME = OCL_COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_NON_UNIQUE_COLLECTION_TYPE__CONFORMS = OCL_COLLECTION_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_NON_UNIQUE_COLLECTION_TYPE__OPERATION = OCL_COLLECTION_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_NON_UNIQUE_COLLECTION_TYPE__PROPERTY = OCL_COLLECTION_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_NON_UNIQUE_COLLECTION_TYPE__CONTAINER = OCL_COLLECTION_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_NON_UNIQUE_COLLECTION_TYPE__ELEMENT_TYPE = OCL_COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>OCL Non Unique Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_NON_UNIQUE_COLLECTION_TYPE_FEATURE_COUNT = OCL_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLOrderedCollectionTypeImpl <em>OCL Ordered Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLOrderedCollectionTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLOrderedCollectionType()
	 * @generated
	 */
	int OCL_ORDERED_COLLECTION_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ORDERED_COLLECTION_TYPE__NAME = OCL_COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ORDERED_COLLECTION_TYPE__CONFORMS = OCL_COLLECTION_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ORDERED_COLLECTION_TYPE__OPERATION = OCL_COLLECTION_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ORDERED_COLLECTION_TYPE__PROPERTY = OCL_COLLECTION_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ORDERED_COLLECTION_TYPE__CONTAINER = OCL_COLLECTION_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ORDERED_COLLECTION_TYPE__ELEMENT_TYPE = OCL_COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>OCL Ordered Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ORDERED_COLLECTION_TYPE_FEATURE_COUNT = OCL_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLOrderedSetTypeImpl <em>OCL Ordered Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLOrderedSetTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLOrderedSetType()
	 * @generated
	 */
	int OCL_ORDERED_SET_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ORDERED_SET_TYPE__NAME = OCL_COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ORDERED_SET_TYPE__CONFORMS = OCL_COLLECTION_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ORDERED_SET_TYPE__OPERATION = OCL_COLLECTION_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ORDERED_SET_TYPE__PROPERTY = OCL_COLLECTION_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ORDERED_SET_TYPE__CONTAINER = OCL_COLLECTION_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ORDERED_SET_TYPE__ELEMENT_TYPE = OCL_COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>OCL Ordered Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ORDERED_SET_TYPE_FEATURE_COUNT = OCL_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLPackageImpl <em>OCL Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLPackageImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLPackage()
	 * @generated
	 */
	int OCL_PACKAGE = 21;

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
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLParameterImpl <em>OCL Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLParameterImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLParameter()
	 * @generated
	 */
	int OCL_PARAMETER = 23;

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
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLTemplateParameterTypeImpl <em>OCL Template Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLTemplateParameterTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLTemplateParameterType()
	 * @generated
	 */
	int OCL_TEMPLATE_PARAMETER_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TEMPLATE_PARAMETER_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TEMPLATE_PARAMETER_TYPE__CONFORMS = OCL_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TEMPLATE_PARAMETER_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TEMPLATE_PARAMETER_TYPE__PROPERTY = OCL_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TEMPLATE_PARAMETER_TYPE__CONTAINER = OCL_TYPE__CONTAINER;

	/**
	 * The number of structural features of the '<em>OCL Template Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TEMPLATE_PARAMETER_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLRootImpl <em>OCL Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLRootImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLRoot()
	 * @generated
	 */
	int OCL_ROOT = 26;

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
	 * The feature id for the '<em><b>Ocl Any</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__OCL_ANY = OCL_LIBRARY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ocl Invalid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__OCL_INVALID = OCL_LIBRARY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ocl Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__OCL_MESSAGE = OCL_LIBRARY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ocl Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__OCL_TUPLE = OCL_LIBRARY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ocl Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__OCL_TYPE = OCL_LIBRARY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Ocl Void</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__OCL_VOID = OCL_LIBRARY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Ordered Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__ORDERED_SET = OCL_LIBRARY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Real</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__REAL = OCL_LIBRARY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__SEQUENCE = OCL_LIBRARY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__SET = OCL_LIBRARY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>String</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__STRING = OCL_LIBRARY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__T = OCL_LIBRARY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>TList</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__TLIST = OCL_LIBRARY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>T2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__T2 = OCL_LIBRARY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Unlimited Natural</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__UNLIMITED_NATURAL = OCL_LIBRARY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Invalid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__INVALID = OCL_LIBRARY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Null</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__NULL = OCL_LIBRARY_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Unlimited</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT__UNLIMITED = OCL_LIBRARY_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>OCL Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ROOT_FEATURE_COUNT = OCL_LIBRARY_FEATURE_COUNT + 24;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLTupleTypeImpl <em>OCL Tuple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLTupleTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLTupleType()
	 * @generated
	 */
	int OCL_TUPLE_TYPE = 29;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLVoidTypeImpl <em>OCL Void Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLVoidTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLVoidType()
	 * @generated
	 */
	int OCL_VOID_TYPE = 33;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLSequenceTypeImpl <em>OCL Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLSequenceTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLSequenceType()
	 * @generated
	 */
	int OCL_SEQUENCE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_SEQUENCE_TYPE__NAME = OCL_COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_SEQUENCE_TYPE__CONFORMS = OCL_COLLECTION_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_SEQUENCE_TYPE__OPERATION = OCL_COLLECTION_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_SEQUENCE_TYPE__PROPERTY = OCL_COLLECTION_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_SEQUENCE_TYPE__CONTAINER = OCL_COLLECTION_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_SEQUENCE_TYPE__ELEMENT_TYPE = OCL_COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>OCL Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_SEQUENCE_TYPE_FEATURE_COUNT = OCL_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLSetTypeImpl <em>OCL Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLSetTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLSetType()
	 * @generated
	 */
	int OCL_SET_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_SET_TYPE__NAME = OCL_COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_SET_TYPE__CONFORMS = OCL_COLLECTION_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_SET_TYPE__OPERATION = OCL_COLLECTION_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_SET_TYPE__PROPERTY = OCL_COLLECTION_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_SET_TYPE__CONTAINER = OCL_COLLECTION_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_SET_TYPE__ELEMENT_TYPE = OCL_COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>OCL Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_SET_TYPE_FEATURE_COUNT = OCL_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TUPLE_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TUPLE_TYPE__CONFORMS = OCL_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TUPLE_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TUPLE_TYPE__PROPERTY = OCL_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TUPLE_TYPE__CONTAINER = OCL_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TUPLE_TYPE__META_MODEL_ELEMENT = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Tuple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TUPLE_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLUniqueCollectionTypeImpl <em>OCL Unique Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLUniqueCollectionTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLUniqueCollectionType()
	 * @generated
	 */
	int OCL_UNIQUE_COLLECTION_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNIQUE_COLLECTION_TYPE__NAME = OCL_COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNIQUE_COLLECTION_TYPE__CONFORMS = OCL_COLLECTION_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNIQUE_COLLECTION_TYPE__OPERATION = OCL_COLLECTION_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNIQUE_COLLECTION_TYPE__PROPERTY = OCL_COLLECTION_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNIQUE_COLLECTION_TYPE__CONTAINER = OCL_COLLECTION_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNIQUE_COLLECTION_TYPE__ELEMENT_TYPE = OCL_COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>OCL Unique Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNIQUE_COLLECTION_TYPE_FEATURE_COUNT = OCL_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_VOID_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_VOID_TYPE__CONFORMS = OCL_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_VOID_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_VOID_TYPE__PROPERTY = OCL_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_VOID_TYPE__CONTAINER = OCL_TYPE__CONTAINER;

	/**
	 * The number of structural features of the '<em>OCL Void Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_VOID_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>ILibrary Operation</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.ILibraryOperation
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getILibraryOperation()
	 * @generated
	 */
	int ILIBRARY_OPERATION = 34;

	/**
	 * The meta object id for the '<em>ILibrary Property</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.ILibraryProperty
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getILibraryProperty()
	 * @generated
	 */
	int ILIBRARY_PROPERTY = 35;


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
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLAnyType <em>OCL Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Any Type</em>'.
	 * @see org.eclipse.ocl.library.OCLAnyType
	 * @generated
	 */
	EClass getOCLAnyType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLBagType <em>OCL Bag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Bag Type</em>'.
	 * @see org.eclipse.ocl.library.OCLBagType
	 * @generated
	 */
	EClass getOCLBagType();

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
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>T</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getT()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_T();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.ocl.library.OCLCache#getTList <em>TList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>TList</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getTList()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_TList();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCache#getT2 <em>T2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>T2</em>'.
	 * @see org.eclipse.ocl.library.OCLCache#getT2()
	 * @see #getOCLCache()
	 * @generated
	 */
	EReference getOCLCache_T2();

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
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLClassifier <em>OCL Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Classifier</em>'.
	 * @see org.eclipse.ocl.library.OCLClassifier
	 * @generated
	 */
	EClass getOCLClassifier();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLClassifier#getMetaModelElement <em>Meta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Model Element</em>'.
	 * @see org.eclipse.ocl.library.OCLClassifier#getMetaModelElement()
	 * @see #getOCLClassifier()
	 * @generated
	 */
	EReference getOCLClassifier_MetaModelElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLCollectionType <em>OCL Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Collection Type</em>'.
	 * @see org.eclipse.ocl.library.OCLCollectionType
	 * @generated
	 */
	EClass getOCLCollectionType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLCollectionType#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Type</em>'.
	 * @see org.eclipse.ocl.library.OCLCollectionType#getElementType()
	 * @see #getOCLCollectionType()
	 * @generated
	 */
	EReference getOCLCollectionType_ElementType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLDataType <em>OCL Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Data Type</em>'.
	 * @see org.eclipse.ocl.library.OCLDataType
	 * @generated
	 */
	EClass getOCLDataType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLDataType#getMetaModelElement <em>Meta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Model Element</em>'.
	 * @see org.eclipse.ocl.library.OCLDataType#getMetaModelElement()
	 * @see #getOCLDataType()
	 * @generated
	 */
	EReference getOCLDataType_MetaModelElement();

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
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLEnumeration <em>OCL Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Enumeration</em>'.
	 * @see org.eclipse.ocl.library.OCLEnumeration
	 * @generated
	 */
	EClass getOCLEnumeration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLEnumeration#getMetaModelElement <em>Meta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Model Element</em>'.
	 * @see org.eclipse.ocl.library.OCLEnumeration#getMetaModelElement()
	 * @see #getOCLEnumeration()
	 * @generated
	 */
	EReference getOCLEnumeration_MetaModelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.OCLEnumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see org.eclipse.ocl.library.OCLEnumeration#getLiterals()
	 * @see #getOCLEnumeration()
	 * @generated
	 */
	EReference getOCLEnumeration_Literals();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLEnumerationLiteral <em>OCL Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Enumeration Literal</em>'.
	 * @see org.eclipse.ocl.library.OCLEnumerationLiteral
	 * @generated
	 */
	EClass getOCLEnumerationLiteral();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.library.OCLEnumerationLiteral#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.eclipse.ocl.library.OCLEnumerationLiteral#getContainer()
	 * @see #getOCLEnumerationLiteral()
	 * @generated
	 */
	EReference getOCLEnumerationLiteral_Container();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLEnumerationLiteral#getMetaModelElement <em>Meta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Model Element</em>'.
	 * @see org.eclipse.ocl.library.OCLEnumerationLiteral#getMetaModelElement()
	 * @see #getOCLEnumerationLiteral()
	 * @generated
	 */
	EReference getOCLEnumerationLiteral_MetaModelElement();

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
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLMetaModelOperation <em>OCL Meta Model Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Meta Model Operation</em>'.
	 * @see org.eclipse.ocl.library.OCLMetaModelOperation
	 * @generated
	 */
	EClass getOCLMetaModelOperation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLMetaModelOperation#getMetaModelElement <em>Meta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Model Element</em>'.
	 * @see org.eclipse.ocl.library.OCLMetaModelOperation#getMetaModelElement()
	 * @see #getOCLMetaModelOperation()
	 * @generated
	 */
	EReference getOCLMetaModelOperation_MetaModelElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLMetaModelProperty <em>OCL Meta Model Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Meta Model Property</em>'.
	 * @see org.eclipse.ocl.library.OCLMetaModelProperty
	 * @generated
	 */
	EClass getOCLMetaModelProperty();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLMetaModelProperty#getMetaModelElement <em>Meta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Model Element</em>'.
	 * @see org.eclipse.ocl.library.OCLMetaModelProperty#getMetaModelElement()
	 * @see #getOCLMetaModelProperty()
	 * @generated
	 */
	EReference getOCLMetaModelProperty_MetaModelElement();

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
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLNonOrderedCollectionType <em>OCL Non Ordered Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Non Ordered Collection Type</em>'.
	 * @see org.eclipse.ocl.library.OCLNonOrderedCollectionType
	 * @generated
	 */
	EClass getOCLNonOrderedCollectionType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLNonUniqueCollectionType <em>OCL Non Unique Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Non Unique Collection Type</em>'.
	 * @see org.eclipse.ocl.library.OCLNonUniqueCollectionType
	 * @generated
	 */
	EClass getOCLNonUniqueCollectionType();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.library.OCLOperation#isIterator <em>Is Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Iterator</em>'.
	 * @see org.eclipse.ocl.library.OCLOperation#isIterator()
	 * @see #getOCLOperation()
	 * @generated
	 */
	EAttribute getOCLOperation_IsIterator();

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
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLOrderedCollectionType <em>OCL Ordered Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Ordered Collection Type</em>'.
	 * @see org.eclipse.ocl.library.OCLOrderedCollectionType
	 * @generated
	 */
	EClass getOCLOrderedCollectionType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLOrderedSetType <em>OCL Ordered Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Ordered Set Type</em>'.
	 * @see org.eclipse.ocl.library.OCLOrderedSetType
	 * @generated
	 */
	EClass getOCLOrderedSetType();

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
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLTemplateParameterType <em>OCL Template Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Template Parameter Type</em>'.
	 * @see org.eclipse.ocl.library.OCLTemplateParameterType
	 * @generated
	 */
	EClass getOCLTemplateParameterType();

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
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLRoot <em>OCL Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Root</em>'.
	 * @see org.eclipse.ocl.library.OCLRoot
	 * @generated
	 */
	EClass getOCLRoot();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLTupleType <em>OCL Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Tuple Type</em>'.
	 * @see org.eclipse.ocl.library.OCLTupleType
	 * @generated
	 */
	EClass getOCLTupleType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLTupleType#getMetaModelElement <em>Meta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Model Element</em>'.
	 * @see org.eclipse.ocl.library.OCLTupleType#getMetaModelElement()
	 * @see #getOCLTupleType()
	 * @generated
	 */
	EReference getOCLTupleType_MetaModelElement();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.OCLType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see org.eclipse.ocl.library.OCLType#getOperation()
	 * @see #getOCLType()
	 * @generated
	 */
	EReference getOCLType_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.OCLType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.eclipse.ocl.library.OCLType#getProperty()
	 * @see #getOCLType()
	 * @generated
	 */
	EReference getOCLType_Property();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.library.OCLType#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.eclipse.ocl.library.OCLType#getContainer()
	 * @see #getOCLType()
	 * @generated
	 */
	EReference getOCLType_Container();

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
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLUniqueCollectionType <em>OCL Unique Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Unique Collection Type</em>'.
	 * @see org.eclipse.ocl.library.OCLUniqueCollectionType
	 * @generated
	 */
	EClass getOCLUniqueCollectionType();

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
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLSequenceType <em>OCL Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Sequence Type</em>'.
	 * @see org.eclipse.ocl.library.OCLSequenceType
	 * @generated
	 */
	EClass getOCLSequenceType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLSetType <em>OCL Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Set Type</em>'.
	 * @see org.eclipse.ocl.library.OCLSetType
	 * @generated
	 */
	EClass getOCLSetType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.ocl.library.ILibraryOperation <em>ILibrary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ILibrary Operation</em>'.
	 * @see org.eclipse.ocl.library.ILibraryOperation
	 * @model instanceClass="org.eclipse.ocl.library.ILibraryOperation" serializeable="false"
	 * @generated
	 */
	EDataType getILibraryOperation();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.ocl.library.ILibraryProperty <em>ILibrary Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ILibrary Property</em>'.
	 * @see org.eclipse.ocl.library.ILibraryProperty
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
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLAnyTypeImpl <em>OCL Any Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLAnyTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLAnyType()
		 * @generated
		 */
		EClass OCL_ANY_TYPE = eINSTANCE.getOCLAnyType();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLBagTypeImpl <em>OCL Bag Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLBagTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLBagType()
		 * @generated
		 */
		EClass OCL_BAG_TYPE = eINSTANCE.getOCLBagType();

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
		 * The meta object literal for the '<em><b>T</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__T = eINSTANCE.getOCLCache_T();

		/**
		 * The meta object literal for the '<em><b>TList</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__TLIST = eINSTANCE.getOCLCache_TList();

		/**
		 * The meta object literal for the '<em><b>T2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CACHE__T2 = eINSTANCE.getOCLCache_T2();

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
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLClassifierImpl <em>OCL Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLClassifierImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLClassifier()
		 * @generated
		 */
		EClass OCL_CLASSIFIER = eINSTANCE.getOCLClassifier();

		/**
		 * The meta object literal for the '<em><b>Meta Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CLASSIFIER__META_MODEL_ELEMENT = eINSTANCE.getOCLClassifier_MetaModelElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLCollectionTypeImpl <em>OCL Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLCollectionTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLCollectionType()
		 * @generated
		 */
		EClass OCL_COLLECTION_TYPE = eINSTANCE.getOCLCollectionType();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_COLLECTION_TYPE__ELEMENT_TYPE = eINSTANCE.getOCLCollectionType_ElementType();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLDataTypeImpl <em>OCL Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLDataTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLDataType()
		 * @generated
		 */
		EClass OCL_DATA_TYPE = eINSTANCE.getOCLDataType();

		/**
		 * The meta object literal for the '<em><b>Meta Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_DATA_TYPE__META_MODEL_ELEMENT = eINSTANCE.getOCLDataType_MetaModelElement();

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
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLEnumerationImpl <em>OCL Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLEnumerationImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLEnumeration()
		 * @generated
		 */
		EClass OCL_ENUMERATION = eINSTANCE.getOCLEnumeration();

		/**
		 * The meta object literal for the '<em><b>Meta Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_ENUMERATION__META_MODEL_ELEMENT = eINSTANCE.getOCLEnumeration_MetaModelElement();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_ENUMERATION__LITERALS = eINSTANCE.getOCLEnumeration_Literals();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLEnumerationLiteralImpl <em>OCL Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLEnumerationLiteralImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLEnumerationLiteral()
		 * @generated
		 */
		EClass OCL_ENUMERATION_LITERAL = eINSTANCE.getOCLEnumerationLiteral();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_ENUMERATION_LITERAL__CONTAINER = eINSTANCE.getOCLEnumerationLiteral_Container();

		/**
		 * The meta object literal for the '<em><b>Meta Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_ENUMERATION_LITERAL__META_MODEL_ELEMENT = eINSTANCE.getOCLEnumerationLiteral_MetaModelElement();

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
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLMetaModelOperationImpl <em>OCL Meta Model Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLMetaModelOperationImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLMetaModelOperation()
		 * @generated
		 */
		EClass OCL_META_MODEL_OPERATION = eINSTANCE.getOCLMetaModelOperation();

		/**
		 * The meta object literal for the '<em><b>Meta Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_META_MODEL_OPERATION__META_MODEL_ELEMENT = eINSTANCE.getOCLMetaModelOperation_MetaModelElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLMetaModelPropertyImpl <em>OCL Meta Model Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLMetaModelPropertyImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLMetaModelProperty()
		 * @generated
		 */
		EClass OCL_META_MODEL_PROPERTY = eINSTANCE.getOCLMetaModelProperty();

		/**
		 * The meta object literal for the '<em><b>Meta Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_META_MODEL_PROPERTY__META_MODEL_ELEMENT = eINSTANCE.getOCLMetaModelProperty_MetaModelElement();

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
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLNonOrderedCollectionTypeImpl <em>OCL Non Ordered Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLNonOrderedCollectionTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLNonOrderedCollectionType()
		 * @generated
		 */
		EClass OCL_NON_ORDERED_COLLECTION_TYPE = eINSTANCE.getOCLNonOrderedCollectionType();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLNonUniqueCollectionTypeImpl <em>OCL Non Unique Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLNonUniqueCollectionTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLNonUniqueCollectionType()
		 * @generated
		 */
		EClass OCL_NON_UNIQUE_COLLECTION_TYPE = eINSTANCE.getOCLNonUniqueCollectionType();

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
		 * The meta object literal for the '<em><b>Is Iterator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_OPERATION__IS_ITERATOR = eINSTANCE.getOCLOperation_IsIterator();

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
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLOrderedCollectionTypeImpl <em>OCL Ordered Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLOrderedCollectionTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLOrderedCollectionType()
		 * @generated
		 */
		EClass OCL_ORDERED_COLLECTION_TYPE = eINSTANCE.getOCLOrderedCollectionType();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLOrderedSetTypeImpl <em>OCL Ordered Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLOrderedSetTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLOrderedSetType()
		 * @generated
		 */
		EClass OCL_ORDERED_SET_TYPE = eINSTANCE.getOCLOrderedSetType();

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
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLTemplateParameterTypeImpl <em>OCL Template Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLTemplateParameterTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLTemplateParameterType()
		 * @generated
		 */
		EClass OCL_TEMPLATE_PARAMETER_TYPE = eINSTANCE.getOCLTemplateParameterType();

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
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLRootImpl <em>OCL Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLRootImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLRoot()
		 * @generated
		 */
		EClass OCL_ROOT = eINSTANCE.getOCLRoot();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLTupleTypeImpl <em>OCL Tuple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLTupleTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLTupleType()
		 * @generated
		 */
		EClass OCL_TUPLE_TYPE = eINSTANCE.getOCLTupleType();

		/**
		 * The meta object literal for the '<em><b>Meta Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TUPLE_TYPE__META_MODEL_ELEMENT = eINSTANCE.getOCLTupleType_MetaModelElement();

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
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__OPERATION = eINSTANCE.getOCLType_Operation();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__PROPERTY = eINSTANCE.getOCLType_Property();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__CONTAINER = eINSTANCE.getOCLType_Container();

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
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLUniqueCollectionTypeImpl <em>OCL Unique Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLUniqueCollectionTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLUniqueCollectionType()
		 * @generated
		 */
		EClass OCL_UNIQUE_COLLECTION_TYPE = eINSTANCE.getOCLUniqueCollectionType();

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
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLSequenceTypeImpl <em>OCL Sequence Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLSequenceTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLSequenceType()
		 * @generated
		 */
		EClass OCL_SEQUENCE_TYPE = eINSTANCE.getOCLSequenceType();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLSetTypeImpl <em>OCL Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLSetTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLSetType()
		 * @generated
		 */
		EClass OCL_SET_TYPE = eINSTANCE.getOCLSetType();

		/**
		 * The meta object literal for the '<em>ILibrary Operation</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.ILibraryOperation
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getILibraryOperation()
		 * @generated
		 */
		EDataType ILIBRARY_OPERATION = eINSTANCE.getILibraryOperation();

		/**
		 * The meta object literal for the '<em>ILibrary Property</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.ILibraryProperty
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getILibraryProperty()
		 * @generated
		 */
		EDataType ILIBRARY_PROPERTY = eINSTANCE.getILibraryProperty();

	}

} //OCLLibraryPackage
