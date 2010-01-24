/**
 * <copyright>
 * </copyright>
 *
 * $Id: MergedLibraryImpl.java,v 1.1.2.1 2010/01/24 07:41:12 ewillink Exp $
 */
package org.eclipse.ocl.library.merged.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLAnyType;
import org.eclipse.ocl.library.OCLBagType;
import org.eclipse.ocl.library.OCLCache;
import org.eclipse.ocl.library.OCLCollectionType;
import org.eclipse.ocl.library.OCLInvalidType;
import org.eclipse.ocl.library.OCLOrderedSetType;
import org.eclipse.ocl.library.OCLRoot;
import org.eclipse.ocl.library.OCLSequenceType;
import org.eclipse.ocl.library.OCLSetType;
import org.eclipse.ocl.library.OCLTemplateParameterType;
import org.eclipse.ocl.library.OCLTupleType;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.OCLVoidType;
import org.eclipse.ocl.library.impl.OCLNamedElementImpl;
import org.eclipse.ocl.library.merged.MergedLibrary;
import org.eclipse.ocl.library.merged.OCLMergedLibraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merged Library</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getBag <em>Bag</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getInteger <em>Integer</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getOclAny <em>Ocl Any</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getOclInvalid <em>Ocl Invalid</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getOclMessage <em>Ocl Message</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getOclTuple <em>Ocl Tuple</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getOclType <em>Ocl Type</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getOclVoid <em>Ocl Void</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getOrderedSet <em>Ordered Set</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getReal <em>Real</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getString <em>String</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getT <em>T</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getTList <em>TList</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getT2 <em>T2</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getUnlimitedNatural <em>Unlimited Natural</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getInvalid <em>Invalid</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getNull <em>Null</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getUnlimited <em>Unlimited</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getBaseLibrary <em>Base Library</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MergedLibraryImpl extends OCLNamedElementImpl implements MergedLibrary {
	/**
	 * The cached value of the '{@link #getBag() <em>Bag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBag()
	 * @generated
	 * @ordered
	 */
	protected OCLBagType bag;

	/**
	 * The cached value of the '{@link #getBoolean() <em>Boolean</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolean()
	 * @generated
	 * @ordered
	 */
	protected OCLType boolean_;

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected OCLType classifier;

	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected OCLCollectionType collection;

	/**
	 * The cached value of the '{@link #getEnumeration() <em>Enumeration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeration()
	 * @generated
	 * @ordered
	 */
	protected OCLType enumeration;

	/**
	 * The cached value of the '{@link #getInteger() <em>Integer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteger()
	 * @generated
	 * @ordered
	 */
	protected OCLType integer;

	/**
	 * The cached value of the '{@link #getOclAny() <em>Ocl Any</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclAny()
	 * @generated
	 * @ordered
	 */
	protected OCLAnyType oclAny;

	/**
	 * The cached value of the '{@link #getOclInvalid() <em>Ocl Invalid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclInvalid()
	 * @generated
	 * @ordered
	 */
	protected OCLInvalidType oclInvalid;

	/**
	 * The cached value of the '{@link #getOclMessage() <em>Ocl Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclMessage()
	 * @generated
	 * @ordered
	 */
	protected OCLType oclMessage;

	/**
	 * The cached value of the '{@link #getOclTuple() <em>Ocl Tuple</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclTuple()
	 * @generated
	 * @ordered
	 */
	protected OCLTupleType oclTuple;

	/**
	 * The cached value of the '{@link #getOclType() <em>Ocl Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclType()
	 * @generated
	 * @ordered
	 */
	protected OCLType oclType;

	/**
	 * The cached value of the '{@link #getOclVoid() <em>Ocl Void</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclVoid()
	 * @generated
	 * @ordered
	 */
	protected OCLVoidType oclVoid;

	/**
	 * The cached value of the '{@link #getOrderedSet() <em>Ordered Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedSet()
	 * @generated
	 * @ordered
	 */
	protected OCLOrderedSetType orderedSet;

	/**
	 * The cached value of the '{@link #getReal() <em>Real</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReal()
	 * @generated
	 * @ordered
	 */
	protected OCLType real;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected OCLSequenceType sequence;

	/**
	 * The cached value of the '{@link #getSet() <em>Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet()
	 * @generated
	 * @ordered
	 */
	protected OCLSetType set;

	/**
	 * The cached value of the '{@link #getString() <em>String</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected OCLType string;

	/**
	 * The cached value of the '{@link #getT() <em>T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT()
	 * @generated
	 * @ordered
	 */
	protected OCLTemplateParameterType t;

	/**
	 * The cached value of the '{@link #getTList() <em>TList</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTList()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLTemplateParameterType> tList;

	/**
	 * The cached value of the '{@link #getT2() <em>T2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT2()
	 * @generated
	 * @ordered
	 */
	protected OCLTemplateParameterType t2;

	/**
	 * The cached value of the '{@link #getUnlimitedNatural() <em>Unlimited Natural</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnlimitedNatural()
	 * @generated
	 * @ordered
	 */
	protected OCLType unlimitedNatural;

	/**
	 * The cached value of the '{@link #getInvalid() <em>Invalid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalid()
	 * @generated
	 * @ordered
	 */
	protected EObject invalid;

	/**
	 * The cached value of the '{@link #getNull() <em>Null</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNull()
	 * @generated
	 * @ordered
	 */
	protected EObject null_;

	/**
	 * The cached value of the '{@link #getUnlimited() <em>Unlimited</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnlimited()
	 * @generated
	 * @ordered
	 */
	protected EObject unlimited;

	/**
	 * The cached value of the '{@link #getBaseLibrary() <em>Base Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseLibrary()
	 * @generated
	 * @ordered
	 */
	protected OCLRoot baseLibrary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergedLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCLMergedLibraryPackage.Literals.MERGED_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLBagType getBag() {
		if (bag == null) {
			bag = baseLibrary.getBag();
		}
		return bag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLType getBoolean() {
		if (boolean_ == null) {
			boolean_ = baseLibrary.getBoolean();
		}
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLType getClassifier() {
		if (classifier == null) {
			classifier = baseLibrary.getClassifier();
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLCollectionType getCollection() {
		if (collection == null) {
			collection = baseLibrary.getCollection();
		}
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLType getEnumeration() {
		if (enumeration == null) {
			enumeration = baseLibrary.getEnumeration();
		}
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLType getInteger() {
		if (integer == null) {
			integer = baseLibrary.getInteger();
		}
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLAnyType getOclAny() {
		if (oclAny == null) {
			oclAny = baseLibrary.getOclAny();
		}
		return oclAny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLInvalidType getOclInvalid() {
		if (oclInvalid == null) {
			oclInvalid = baseLibrary.getOclInvalid();
		}
		return oclInvalid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLType getOclMessage() {
		if (oclMessage == null) {
			oclMessage = baseLibrary.getOclMessage();
		}
		return oclMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLTupleType getOclTuple() {
		if (oclTuple == null) {
			oclTuple = baseLibrary.getOclTuple();
		}
		return oclTuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLType getOclType() {
		if (oclType == null) {
			oclType = baseLibrary.getOclType();
		}
		return oclType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLVoidType getOclVoid() {
		if (oclVoid == null) {
			oclVoid = baseLibrary.getOclVoid();
		}
		return oclVoid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLOrderedSetType getOrderedSet() {
		if (orderedSet == null) {
			orderedSet = baseLibrary.getOrderedSet();
		}
		return orderedSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLType getReal() {
		if (real == null) {
			real = baseLibrary.getReal();
		}
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLSequenceType getSequence() {
		if (sequence == null) {
			sequence = baseLibrary.getSequence();
		}
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLSetType getSet() {
		if (set == null) {
			set = baseLibrary.getSet();
		}
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLType getString() {
		if (string == null) {
			string = baseLibrary.getString();
		}
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLTemplateParameterType getT() {
		if (t == null) {
			t = baseLibrary.getT();
		}
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<OCLTemplateParameterType> getTList() {
		if (tList == null) {
			tList = baseLibrary.getTList();
		}
		return tList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLTemplateParameterType getT2() {
		if (t2 == null) {
			t2 = baseLibrary.getT2();
		}
		return t2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLType getUnlimitedNatural() {
		if (unlimitedNatural == null) {
			unlimitedNatural = baseLibrary.getUnlimitedNatural();
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
			invalid = baseLibrary.getInvalid();
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
			null_ = baseLibrary.getNull();
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
			unlimited = baseLibrary.getUnlimited();
		}
		return unlimited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLRoot getBaseLibrary() {
		if (baseLibrary != null && baseLibrary.eIsProxy()) {
			InternalEObject oldBaseLibrary = (InternalEObject)baseLibrary;
			baseLibrary = (OCLRoot)eResolveProxy(oldBaseLibrary);
			if (baseLibrary != oldBaseLibrary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCLMergedLibraryPackage.MERGED_LIBRARY__BASE_LIBRARY, oldBaseLibrary, baseLibrary));
			}
		}
		return baseLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLRoot basicGetBaseLibrary() {
		return baseLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseLibrary(OCLRoot newBaseLibrary) {
		OCLRoot oldBaseLibrary = baseLibrary;
		baseLibrary = newBaseLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLMergedLibraryPackage.MERGED_LIBRARY__BASE_LIBRARY, oldBaseLibrary, baseLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLBagType getBagType(OCLType elementType) {
		return baseLibrary.getBagType(elementType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLType getLibraryTypeOfType(Object object) {
		return baseLibrary.getLibraryTypeOfType(object);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLType getLibraryTypeOfValue(Object value, Object staticType) {
		return baseLibrary.getLibraryTypeOfValue(value, staticType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLOrderedSetType getOrderedSetType(OCLType elementType) {
		return baseLibrary.getOrderedSetType(elementType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLSequenceType getSequenceType(OCLType elementType) {
		return baseLibrary.getSequenceType(elementType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLSetType getSetType(OCLType elementType) {
		return baseLibrary.getSetType(elementType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCLMergedLibraryPackage.MERGED_LIBRARY__BAG:
				return getBag();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__BOOLEAN:
				return getBoolean();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__CLASSIFIER:
				return getClassifier();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__COLLECTION:
				return getCollection();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__ENUMERATION:
				return getEnumeration();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__INTEGER:
				return getInteger();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_ANY:
				return getOclAny();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_INVALID:
				return getOclInvalid();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_MESSAGE:
				return getOclMessage();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_TUPLE:
				return getOclTuple();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_TYPE:
				return getOclType();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_VOID:
				return getOclVoid();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__ORDERED_SET:
				return getOrderedSet();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__REAL:
				return getReal();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__SEQUENCE:
				return getSequence();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__SET:
				return getSet();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__STRING:
				return getString();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__T:
				return getT();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__TLIST:
				return getTList();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__T2:
				return getT2();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__UNLIMITED_NATURAL:
				return getUnlimitedNatural();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__INVALID:
				return getInvalid();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__NULL:
				return getNull();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__UNLIMITED:
				return getUnlimited();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__BASE_LIBRARY:
				if (resolve) return getBaseLibrary();
				return basicGetBaseLibrary();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OCLMergedLibraryPackage.MERGED_LIBRARY__BASE_LIBRARY:
				setBaseLibrary((OCLRoot)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OCLMergedLibraryPackage.MERGED_LIBRARY__BASE_LIBRARY:
				setBaseLibrary((OCLRoot)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OCLMergedLibraryPackage.MERGED_LIBRARY__BAG:
				return bag != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__BOOLEAN:
				return boolean_ != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__CLASSIFIER:
				return classifier != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__COLLECTION:
				return collection != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__ENUMERATION:
				return enumeration != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__INTEGER:
				return integer != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_ANY:
				return oclAny != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_INVALID:
				return oclInvalid != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_MESSAGE:
				return oclMessage != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_TUPLE:
				return oclTuple != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_TYPE:
				return oclType != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_VOID:
				return oclVoid != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__ORDERED_SET:
				return orderedSet != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__REAL:
				return real != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__SEQUENCE:
				return sequence != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__SET:
				return set != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__STRING:
				return string != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__T:
				return t != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__TLIST:
				return tList != null && !tList.isEmpty();
			case OCLMergedLibraryPackage.MERGED_LIBRARY__T2:
				return t2 != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__UNLIMITED_NATURAL:
				return unlimitedNatural != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__INVALID:
				return invalid != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__NULL:
				return null_ != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__UNLIMITED:
				return unlimited != null;
			case OCLMergedLibraryPackage.MERGED_LIBRARY__BASE_LIBRARY:
				return baseLibrary != null;
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
				case OCLMergedLibraryPackage.MERGED_LIBRARY__BAG: return LibraryPackage.OCL_CACHE__BAG;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__BOOLEAN: return LibraryPackage.OCL_CACHE__BOOLEAN;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__CLASSIFIER: return LibraryPackage.OCL_CACHE__CLASSIFIER;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__COLLECTION: return LibraryPackage.OCL_CACHE__COLLECTION;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__ENUMERATION: return LibraryPackage.OCL_CACHE__ENUMERATION;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__INTEGER: return LibraryPackage.OCL_CACHE__INTEGER;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_ANY: return LibraryPackage.OCL_CACHE__OCL_ANY;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_INVALID: return LibraryPackage.OCL_CACHE__OCL_INVALID;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_MESSAGE: return LibraryPackage.OCL_CACHE__OCL_MESSAGE;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_TUPLE: return LibraryPackage.OCL_CACHE__OCL_TUPLE;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_TYPE: return LibraryPackage.OCL_CACHE__OCL_TYPE;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_VOID: return LibraryPackage.OCL_CACHE__OCL_VOID;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__ORDERED_SET: return LibraryPackage.OCL_CACHE__ORDERED_SET;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__REAL: return LibraryPackage.OCL_CACHE__REAL;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__SEQUENCE: return LibraryPackage.OCL_CACHE__SEQUENCE;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__SET: return LibraryPackage.OCL_CACHE__SET;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__STRING: return LibraryPackage.OCL_CACHE__STRING;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__T: return LibraryPackage.OCL_CACHE__T;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__TLIST: return LibraryPackage.OCL_CACHE__TLIST;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__T2: return LibraryPackage.OCL_CACHE__T2;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__UNLIMITED_NATURAL: return LibraryPackage.OCL_CACHE__UNLIMITED_NATURAL;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__INVALID: return LibraryPackage.OCL_CACHE__INVALID;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__NULL: return LibraryPackage.OCL_CACHE__NULL;
				case OCLMergedLibraryPackage.MERGED_LIBRARY__UNLIMITED: return LibraryPackage.OCL_CACHE__UNLIMITED;
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
				case LibraryPackage.OCL_CACHE__BAG: return OCLMergedLibraryPackage.MERGED_LIBRARY__BAG;
				case LibraryPackage.OCL_CACHE__BOOLEAN: return OCLMergedLibraryPackage.MERGED_LIBRARY__BOOLEAN;
				case LibraryPackage.OCL_CACHE__CLASSIFIER: return OCLMergedLibraryPackage.MERGED_LIBRARY__CLASSIFIER;
				case LibraryPackage.OCL_CACHE__COLLECTION: return OCLMergedLibraryPackage.MERGED_LIBRARY__COLLECTION;
				case LibraryPackage.OCL_CACHE__ENUMERATION: return OCLMergedLibraryPackage.MERGED_LIBRARY__ENUMERATION;
				case LibraryPackage.OCL_CACHE__INTEGER: return OCLMergedLibraryPackage.MERGED_LIBRARY__INTEGER;
				case LibraryPackage.OCL_CACHE__OCL_ANY: return OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_ANY;
				case LibraryPackage.OCL_CACHE__OCL_INVALID: return OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_INVALID;
				case LibraryPackage.OCL_CACHE__OCL_MESSAGE: return OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_MESSAGE;
				case LibraryPackage.OCL_CACHE__OCL_TUPLE: return OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_TUPLE;
				case LibraryPackage.OCL_CACHE__OCL_TYPE: return OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_TYPE;
				case LibraryPackage.OCL_CACHE__OCL_VOID: return OCLMergedLibraryPackage.MERGED_LIBRARY__OCL_VOID;
				case LibraryPackage.OCL_CACHE__ORDERED_SET: return OCLMergedLibraryPackage.MERGED_LIBRARY__ORDERED_SET;
				case LibraryPackage.OCL_CACHE__REAL: return OCLMergedLibraryPackage.MERGED_LIBRARY__REAL;
				case LibraryPackage.OCL_CACHE__SEQUENCE: return OCLMergedLibraryPackage.MERGED_LIBRARY__SEQUENCE;
				case LibraryPackage.OCL_CACHE__SET: return OCLMergedLibraryPackage.MERGED_LIBRARY__SET;
				case LibraryPackage.OCL_CACHE__STRING: return OCLMergedLibraryPackage.MERGED_LIBRARY__STRING;
				case LibraryPackage.OCL_CACHE__T: return OCLMergedLibraryPackage.MERGED_LIBRARY__T;
				case LibraryPackage.OCL_CACHE__TLIST: return OCLMergedLibraryPackage.MERGED_LIBRARY__TLIST;
				case LibraryPackage.OCL_CACHE__T2: return OCLMergedLibraryPackage.MERGED_LIBRARY__T2;
				case LibraryPackage.OCL_CACHE__UNLIMITED_NATURAL: return OCLMergedLibraryPackage.MERGED_LIBRARY__UNLIMITED_NATURAL;
				case LibraryPackage.OCL_CACHE__INVALID: return OCLMergedLibraryPackage.MERGED_LIBRARY__INVALID;
				case LibraryPackage.OCL_CACHE__NULL: return OCLMergedLibraryPackage.MERGED_LIBRARY__NULL;
				case LibraryPackage.OCL_CACHE__UNLIMITED: return OCLMergedLibraryPackage.MERGED_LIBRARY__UNLIMITED;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MergedLibraryImpl
