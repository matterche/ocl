/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLRootImpl.java,v 1.1.2.2 2010/01/30 07:49:26 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.expressions.ExpressionsFactory;
import org.eclipse.ocl.expressions.InvalidLiteralExp;
import org.eclipse.ocl.expressions.NullLiteralExp;
import org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLCache;
import org.eclipse.ocl.library.OCLConcreteType;
import org.eclipse.ocl.library.OCLJavaType;
import org.eclipse.ocl.library.OCLPackage;
import org.eclipse.ocl.library.OCLRoot;
import org.eclipse.ocl.types.AnyType;
import org.eclipse.ocl.types.BagType;
import org.eclipse.ocl.types.CollectionType;
import org.eclipse.ocl.types.InvalidType;
import org.eclipse.ocl.types.MessageType;
import org.eclipse.ocl.types.OrderedSetType;
import org.eclipse.ocl.types.PrimitiveType;
import org.eclipse.ocl.types.SequenceType;
import org.eclipse.ocl.types.SetType;
import org.eclipse.ocl.types.TupleType;
import org.eclipse.ocl.types.TypeType;
import org.eclipse.ocl.types.VoidType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library Root</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getBag <em>Bag</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getInteger <em>Integer</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getJava <em>Java</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getOclAny <em>Ocl Any</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getOclInvalid <em>Ocl Invalid</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getOclMessage <em>Ocl Message</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getOclTuple <em>Ocl Tuple</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getOclType <em>Ocl Type</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getOclVoid <em>Ocl Void</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getOrderedSet <em>Ordered Set</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getReal <em>Real</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getString <em>String</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getUnlimitedNatural <em>Unlimited Natural</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getInvalid <em>Invalid</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getNull <em>Null</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getUnlimited <em>Unlimited</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OCLRootImpl extends OCLLibraryImpl implements OCLRoot {

	public static final String JAVA = "Java"; //$NON-NLS-1$

	public static final String CLASSIFIER_NAME = "Classifier"; //$NON-NLS-1$

	public static final String ENUMERATION_NAME = "Enumeration"; //$NON-NLS-1$

	public static final String OCL = "ocl"; //$NON-NLS-1$

	public static final String OCL_T = "T"; //$NON-NLS-1$

	public static final String OCL_T2 = "T2"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getBag() <em>Bag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBag()
	 * @generated
	 * @ordered
	 */
	protected OCLConcreteType bag;

	/**
	 * The cached value of the '{@link #getBoolean() <em>Boolean</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolean()
	 * @generated
	 * @ordered
	 */
	protected OCLConcreteType boolean_;

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected OCLConcreteType classifier;

	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected OCLConcreteType collection;

	/**
	 * The cached value of the '{@link #getEnumeration() <em>Enumeration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeration()
	 * @generated
	 * @ordered
	 */
	protected OCLConcreteType enumeration;

	/**
	 * The cached value of the '{@link #getInteger() <em>Integer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteger()
	 * @generated
	 * @ordered
	 */
	protected OCLConcreteType integer;

	/**
	 * The cached value of the '{@link #getJava() <em>Java</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJava()
	 * @generated
	 * @ordered
	 */
	protected OCLJavaType java;

	/**
	 * The cached value of the '{@link #getOclAny() <em>Ocl Any</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclAny()
	 * @generated
	 * @ordered
	 */
	protected OCLConcreteType oclAny;

	/**
	 * The cached value of the '{@link #getOclInvalid() <em>Ocl Invalid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclInvalid()
	 * @generated
	 * @ordered
	 */
	protected OCLConcreteType oclInvalid;

	/**
	 * The cached value of the '{@link #getOclMessage() <em>Ocl Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclMessage()
	 * @generated
	 * @ordered
	 */
	protected OCLConcreteType oclMessage;

	/**
	 * The cached value of the '{@link #getOclTuple() <em>Ocl Tuple</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclTuple()
	 * @generated
	 * @ordered
	 */
	protected OCLConcreteType oclTuple;

	/**
	 * The cached value of the '{@link #getOclType() <em>Ocl Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclType()
	 * @generated
	 * @ordered
	 */
	protected OCLConcreteType oclType;

	/**
	 * The cached value of the '{@link #getOclVoid() <em>Ocl Void</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclVoid()
	 * @generated
	 * @ordered
	 */
	protected OCLConcreteType oclVoid;

	/**
	 * The cached value of the '{@link #getOrderedSet() <em>Ordered Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedSet()
	 * @generated
	 * @ordered
	 */
	protected OCLConcreteType orderedSet;

	/**
	 * The cached value of the '{@link #getReal() <em>Real</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReal()
	 * @generated
	 * @ordered
	 */
	protected OCLConcreteType real;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected OCLConcreteType sequence;

	/**
	 * The cached value of the '{@link #getSet() <em>Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet()
	 * @generated
	 * @ordered
	 */
	protected OCLConcreteType set;

	/**
	 * The cached value of the '{@link #getString() <em>String</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected OCLConcreteType string;

	/**
	 * The cached value of the '{@link #getUnlimitedNatural() <em>Unlimited Natural</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnlimitedNatural()
	 * @generated
	 * @ordered
	 */
	protected OCLConcreteType unlimitedNatural;

	/**
	 * The cached value of the '{@link #getInvalid() <em>Invalid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalid()
	 * @generated NOT
	 * @ordered
	 */
	protected InvalidLiteralExp<OCLConcreteType> invalid;

	/**
	 * The cached value of the '{@link #getNull() <em>Null</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNull()
	 * @generated NOT
	 * @ordered
	 */
	protected NullLiteralExp<OCLConcreteType> null_;

	/**
	 * The cached value of the '{@link #getUnlimited() <em>Unlimited</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnlimited()
	 * @generated NOT
	 * @ordered
	 */
	protected UnlimitedNaturalLiteralExp<OCLConcreteType> unlimited;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLConcreteType getBag() {
		if (bag == null) {
			bag = getStdlibType(BagType.SINGLETON_NAME);
		}
		return bag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLConcreteType getBoolean() {
		if (boolean_ == null) {
			boolean_ = getStdlibType(PrimitiveType.BOOLEAN_NAME);
		}
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLConcreteType getClassifier() {
		if (classifier == null) {
			classifier = getStdlibType(CLASSIFIER_NAME);
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLConcreteType getCollection() {
		if (collection == null) {
			collection = getStdlibType(CollectionType.SINGLETON_NAME);
		}
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLConcreteType getEnumeration() {
		if (enumeration == null) {
			enumeration = getStdlibType(ENUMERATION_NAME);
		}
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLConcreteType getInteger() {
		if (integer == null) {
			integer = getStdlibType(PrimitiveType.INTEGER_NAME);
		}
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLJavaType getJava() {
		if (java == null) {
			java = (OCLJavaType) getStdlibType(JAVA);
		}
		return java;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLConcreteType getOclAny() {
		if (oclAny == null) {
			oclAny = getStdlibType(AnyType.SINGLETON_NAME);
		}
		return oclAny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLConcreteType getOclInvalid() {
		if (oclInvalid == null) {
			oclInvalid = getStdlibType(InvalidType.SINGLETON_NAME);
		}
		return oclInvalid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLConcreteType getOclMessage() {
		if (oclMessage == null) {
			oclMessage = getStdlibType(MessageType.SINGLETON_NAME);
		}
		return oclMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLConcreteType getOclTuple() {
		if (oclTuple == null) {
			oclTuple = getStdlibType(TupleType.SINGLETON_NAME);
		}
		return oclTuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLConcreteType getOclType() {
		if (oclType == null) {
			oclType = getStdlibType(TypeType.SINGLETON_NAME);
		}
		return oclType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLConcreteType getOclVoid() {
		if (oclVoid == null) {
			oclVoid = getStdlibType(VoidType.SINGLETON_NAME);
		}
		return oclVoid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLConcreteType getOrderedSet() {
		if (orderedSet == null) {
			orderedSet = getStdlibType(OrderedSetType.SINGLETON_NAME);
		}
		return orderedSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLConcreteType getReal() {
		if (real == null) {
			real = getStdlibType(PrimitiveType.REAL_NAME);
		}
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLConcreteType getSequence() {
		if (sequence == null) {
			sequence = getStdlibType(SequenceType.SINGLETON_NAME);
		}
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLConcreteType getSet() {
		if (set == null) {
			set = getStdlibType(SetType.SINGLETON_NAME);
		}
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLConcreteType getString() {
		if (string == null) {
			string = getStdlibType(PrimitiveType.STRING_NAME);
		}
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLConcreteType getUnlimitedNatural() {
		if (unlimitedNatural == null) {
			unlimitedNatural = getStdlibType(PrimitiveType.UNLIMITED_NATURAL_NAME);
		}
		return unlimitedNatural;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EObject getInvalid() {
		if (invalid == null) {
			invalid = ExpressionsFactory.eINSTANCE.createInvalidLiteralExp();
			invalid.setType(getOclInvalid());
		}
		return invalid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EObject getNull() {
		if (null_ == null) {
			null_ = ExpressionsFactory.eINSTANCE.createNullLiteralExp();
			null_.setType(getOclVoid());
		}
		return null_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EObject getUnlimited() {
		if (unlimited == null) {
			unlimited = ExpressionsFactory.eINSTANCE.createUnlimitedNaturalLiteralExp();
			unlimited.setUnlimitedNaturalSymbol(UnlimitedNaturalLiteralExp.UNLIMITED);
			unlimited.setType(getUnlimitedNatural());
		}
		return unlimited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.OCL_ROOT__BAG:
				return getBag();
			case LibraryPackage.OCL_ROOT__BOOLEAN:
				return getBoolean();
			case LibraryPackage.OCL_ROOT__CLASSIFIER:
				return getClassifier();
			case LibraryPackage.OCL_ROOT__COLLECTION:
				return getCollection();
			case LibraryPackage.OCL_ROOT__ENUMERATION:
				return getEnumeration();
			case LibraryPackage.OCL_ROOT__INTEGER:
				return getInteger();
			case LibraryPackage.OCL_ROOT__JAVA:
				return getJava();
			case LibraryPackage.OCL_ROOT__OCL_ANY:
				return getOclAny();
			case LibraryPackage.OCL_ROOT__OCL_INVALID:
				return getOclInvalid();
			case LibraryPackage.OCL_ROOT__OCL_MESSAGE:
				return getOclMessage();
			case LibraryPackage.OCL_ROOT__OCL_TUPLE:
				return getOclTuple();
			case LibraryPackage.OCL_ROOT__OCL_TYPE:
				return getOclType();
			case LibraryPackage.OCL_ROOT__OCL_VOID:
				return getOclVoid();
			case LibraryPackage.OCL_ROOT__ORDERED_SET:
				return getOrderedSet();
			case LibraryPackage.OCL_ROOT__REAL:
				return getReal();
			case LibraryPackage.OCL_ROOT__SEQUENCE:
				return getSequence();
			case LibraryPackage.OCL_ROOT__SET:
				return getSet();
			case LibraryPackage.OCL_ROOT__STRING:
				return getString();
			case LibraryPackage.OCL_ROOT__UNLIMITED_NATURAL:
				return getUnlimitedNatural();
			case LibraryPackage.OCL_ROOT__INVALID:
				return getInvalid();
			case LibraryPackage.OCL_ROOT__NULL:
				return getNull();
			case LibraryPackage.OCL_ROOT__UNLIMITED:
				return getUnlimited();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LibraryPackage.OCL_ROOT__BAG:
				return bag != null;
			case LibraryPackage.OCL_ROOT__BOOLEAN:
				return boolean_ != null;
			case LibraryPackage.OCL_ROOT__CLASSIFIER:
				return classifier != null;
			case LibraryPackage.OCL_ROOT__COLLECTION:
				return collection != null;
			case LibraryPackage.OCL_ROOT__ENUMERATION:
				return enumeration != null;
			case LibraryPackage.OCL_ROOT__INTEGER:
				return integer != null;
			case LibraryPackage.OCL_ROOT__JAVA:
				return java != null;
			case LibraryPackage.OCL_ROOT__OCL_ANY:
				return oclAny != null;
			case LibraryPackage.OCL_ROOT__OCL_INVALID:
				return oclInvalid != null;
			case LibraryPackage.OCL_ROOT__OCL_MESSAGE:
				return oclMessage != null;
			case LibraryPackage.OCL_ROOT__OCL_TUPLE:
				return oclTuple != null;
			case LibraryPackage.OCL_ROOT__OCL_TYPE:
				return oclType != null;
			case LibraryPackage.OCL_ROOT__OCL_VOID:
				return oclVoid != null;
			case LibraryPackage.OCL_ROOT__ORDERED_SET:
				return orderedSet != null;
			case LibraryPackage.OCL_ROOT__REAL:
				return real != null;
			case LibraryPackage.OCL_ROOT__SEQUENCE:
				return sequence != null;
			case LibraryPackage.OCL_ROOT__SET:
				return set != null;
			case LibraryPackage.OCL_ROOT__STRING:
				return string != null;
			case LibraryPackage.OCL_ROOT__UNLIMITED_NATURAL:
				return unlimitedNatural != null;
			case LibraryPackage.OCL_ROOT__INVALID:
				return invalid != null;
			case LibraryPackage.OCL_ROOT__NULL:
				return null_ != null;
			case LibraryPackage.OCL_ROOT__UNLIMITED:
				return unlimited != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == OCLCache.class) {
			switch (derivedFeatureID) {
				case LibraryPackage.OCL_ROOT__BAG: return LibraryPackage.OCL_CACHE__BAG;
				case LibraryPackage.OCL_ROOT__BOOLEAN: return LibraryPackage.OCL_CACHE__BOOLEAN;
				case LibraryPackage.OCL_ROOT__CLASSIFIER: return LibraryPackage.OCL_CACHE__CLASSIFIER;
				case LibraryPackage.OCL_ROOT__COLLECTION: return LibraryPackage.OCL_CACHE__COLLECTION;
				case LibraryPackage.OCL_ROOT__ENUMERATION: return LibraryPackage.OCL_CACHE__ENUMERATION;
				case LibraryPackage.OCL_ROOT__INTEGER: return LibraryPackage.OCL_CACHE__INTEGER;
				case LibraryPackage.OCL_ROOT__JAVA: return LibraryPackage.OCL_CACHE__JAVA;
				case LibraryPackage.OCL_ROOT__OCL_ANY: return LibraryPackage.OCL_CACHE__OCL_ANY;
				case LibraryPackage.OCL_ROOT__OCL_INVALID: return LibraryPackage.OCL_CACHE__OCL_INVALID;
				case LibraryPackage.OCL_ROOT__OCL_MESSAGE: return LibraryPackage.OCL_CACHE__OCL_MESSAGE;
				case LibraryPackage.OCL_ROOT__OCL_TUPLE: return LibraryPackage.OCL_CACHE__OCL_TUPLE;
				case LibraryPackage.OCL_ROOT__OCL_TYPE: return LibraryPackage.OCL_CACHE__OCL_TYPE;
				case LibraryPackage.OCL_ROOT__OCL_VOID: return LibraryPackage.OCL_CACHE__OCL_VOID;
				case LibraryPackage.OCL_ROOT__ORDERED_SET: return LibraryPackage.OCL_CACHE__ORDERED_SET;
				case LibraryPackage.OCL_ROOT__REAL: return LibraryPackage.OCL_CACHE__REAL;
				case LibraryPackage.OCL_ROOT__SEQUENCE: return LibraryPackage.OCL_CACHE__SEQUENCE;
				case LibraryPackage.OCL_ROOT__SET: return LibraryPackage.OCL_CACHE__SET;
				case LibraryPackage.OCL_ROOT__STRING: return LibraryPackage.OCL_CACHE__STRING;
				case LibraryPackage.OCL_ROOT__UNLIMITED_NATURAL: return LibraryPackage.OCL_CACHE__UNLIMITED_NATURAL;
				case LibraryPackage.OCL_ROOT__INVALID: return LibraryPackage.OCL_CACHE__INVALID;
				case LibraryPackage.OCL_ROOT__NULL: return LibraryPackage.OCL_CACHE__NULL;
				case LibraryPackage.OCL_ROOT__UNLIMITED: return LibraryPackage.OCL_CACHE__UNLIMITED;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == OCLCache.class) {
			switch (baseFeatureID) {
				case LibraryPackage.OCL_CACHE__BAG: return LibraryPackage.OCL_ROOT__BAG;
				case LibraryPackage.OCL_CACHE__BOOLEAN: return LibraryPackage.OCL_ROOT__BOOLEAN;
				case LibraryPackage.OCL_CACHE__CLASSIFIER: return LibraryPackage.OCL_ROOT__CLASSIFIER;
				case LibraryPackage.OCL_CACHE__COLLECTION: return LibraryPackage.OCL_ROOT__COLLECTION;
				case LibraryPackage.OCL_CACHE__ENUMERATION: return LibraryPackage.OCL_ROOT__ENUMERATION;
				case LibraryPackage.OCL_CACHE__INTEGER: return LibraryPackage.OCL_ROOT__INTEGER;
				case LibraryPackage.OCL_CACHE__JAVA: return LibraryPackage.OCL_ROOT__JAVA;
				case LibraryPackage.OCL_CACHE__OCL_ANY: return LibraryPackage.OCL_ROOT__OCL_ANY;
				case LibraryPackage.OCL_CACHE__OCL_INVALID: return LibraryPackage.OCL_ROOT__OCL_INVALID;
				case LibraryPackage.OCL_CACHE__OCL_MESSAGE: return LibraryPackage.OCL_ROOT__OCL_MESSAGE;
				case LibraryPackage.OCL_CACHE__OCL_TUPLE: return LibraryPackage.OCL_ROOT__OCL_TUPLE;
				case LibraryPackage.OCL_CACHE__OCL_TYPE: return LibraryPackage.OCL_ROOT__OCL_TYPE;
				case LibraryPackage.OCL_CACHE__OCL_VOID: return LibraryPackage.OCL_ROOT__OCL_VOID;
				case LibraryPackage.OCL_CACHE__ORDERED_SET: return LibraryPackage.OCL_ROOT__ORDERED_SET;
				case LibraryPackage.OCL_CACHE__REAL: return LibraryPackage.OCL_ROOT__REAL;
				case LibraryPackage.OCL_CACHE__SEQUENCE: return LibraryPackage.OCL_ROOT__SEQUENCE;
				case LibraryPackage.OCL_CACHE__SET: return LibraryPackage.OCL_ROOT__SET;
				case LibraryPackage.OCL_CACHE__STRING: return LibraryPackage.OCL_ROOT__STRING;
				case LibraryPackage.OCL_CACHE__UNLIMITED_NATURAL: return LibraryPackage.OCL_ROOT__UNLIMITED_NATURAL;
				case LibraryPackage.OCL_CACHE__INVALID: return LibraryPackage.OCL_ROOT__INVALID;
				case LibraryPackage.OCL_CACHE__NULL: return LibraryPackage.OCL_ROOT__NULL;
				case LibraryPackage.OCL_CACHE__UNLIMITED: return LibraryPackage.OCL_ROOT__UNLIMITED;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	private OCLPackage stdlibPackage = null;
	
	private OCLConcreteType getStdlibType(String name) {
		if (stdlibPackage == null) {
			stdlibPackage = getPackage(OCL);
		}
		if (stdlibPackage != null) {
			return stdlibPackage.getType(name);
		}
		return null;
	}
} //LibraryRootImpl
