/**
 * <copyright>
 * </copyright>
 *
 * $Id: MergedLibraryImpl.java,v 1.1.2.2 2010/01/30 07:49:15 ewillink Exp $
 */
package org.eclipse.ocl.library.merged.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.expressions.InvalidLiteralExp;
import org.eclipse.ocl.expressions.LiteralExp;
import org.eclipse.ocl.expressions.NullLiteralExp;
import org.eclipse.ocl.expressions.TypeExp;
import org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.library.CompatibilityOCLLibrary;
import org.eclipse.ocl.library.LibraryFactory;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLCache;
import org.eclipse.ocl.library.OCLConcreteType;
import org.eclipse.ocl.library.OCLJavaType;
import org.eclipse.ocl.library.OCLRoot;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.OCLTypeBinding;
import org.eclipse.ocl.library.impl.OCLNamedElementImpl;
import org.eclipse.ocl.library.merged.MergedLibrary;
import org.eclipse.ocl.library.merged.OCLBoundCollectionType;
import org.eclipse.ocl.library.merged.OCLMergedLibraryFactory;
import org.eclipse.ocl.library.merged.OCLMergedLibraryPackage;
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
import org.eclipse.ocl.util.Bag;
import org.eclipse.ocl.utilities.PredefinedType;

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
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl#getJava <em>Java</em>}</li>
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
	public OCLConcreteType getBag() {
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
	public OCLConcreteType getBoolean() {
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
	public OCLConcreteType getClassifier() {
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
	public OCLConcreteType getCollection() {
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
	public OCLConcreteType getEnumeration() {
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
	public OCLConcreteType getInteger() {
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
	public OCLJavaType getJava() {
		if (java == null) {
			java = baseLibrary.getJava();
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
			oclAny = baseLibrary.getOclAny();
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
			oclInvalid = baseLibrary.getOclInvalid();
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
			oclMessage = baseLibrary.getOclMessage();
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
			oclTuple = baseLibrary.getOclTuple();
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
			oclType = baseLibrary.getOclType();
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
			oclVoid = baseLibrary.getOclVoid();
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
			orderedSet = baseLibrary.getOrderedSet();
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
			real = baseLibrary.getReal();
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
			sequence = baseLibrary.getSequence();
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
			set = baseLibrary.getSet();
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
			string = baseLibrary.getString();
		}
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 *
	public OCLTemplateParameterType getT() {
		if (t == null) {
			t = baseLibrary.getT();
		}
		return t;
	} */

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 *
	public EList<OCLTemplateParameterType> getTList() {
		if (tList == null) {
			tList = baseLibrary.getTList();
		}
		return tList;
	} */

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 *
	public OCLTemplateParameterType getT2() {
		if (t2 == null) {
			t2 = baseLibrary.getT2();
		}
		return t2;
	} */

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLConcreteType getUnlimitedNatural() {
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
			case OCLMergedLibraryPackage.MERGED_LIBRARY__JAVA:
				return getJava();
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
			case OCLMergedLibraryPackage.MERGED_LIBRARY__JAVA:
				return java != null;
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
				case OCLMergedLibraryPackage.MERGED_LIBRARY__JAVA: return LibraryPackage.OCL_CACHE__JAVA;
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
				case LibraryPackage.OCL_CACHE__JAVA: return OCLMergedLibraryPackage.MERGED_LIBRARY__JAVA;
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
				case LibraryPackage.OCL_CACHE__UNLIMITED_NATURAL: return OCLMergedLibraryPackage.MERGED_LIBRARY__UNLIMITED_NATURAL;
				case LibraryPackage.OCL_CACHE__INVALID: return OCLMergedLibraryPackage.MERGED_LIBRARY__INVALID;
				case LibraryPackage.OCL_CACHE__NULL: return OCLMergedLibraryPackage.MERGED_LIBRARY__NULL;
				case LibraryPackage.OCL_CACHE__UNLIMITED: return OCLMergedLibraryPackage.MERGED_LIBRARY__UNLIMITED;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	public OCLBoundCollectionType getBoundCollectionType(String collectionName, OCLType unboundType, OCLType elementType) {
		OCLBoundCollectionType collectionType = (OCLBoundCollectionType) baseLibrary.getType(collectionName);		
		if (collectionType == null) {
			OCLTypeBinding typeBinding = LibraryFactory.eINSTANCE.createOCLTypeBinding();
			typeBinding.setTypeParameter(unboundType.getTypeParameter().get(0));
			typeBinding.setTypeValue(elementType);
			collectionType = OCLMergedLibraryFactory.eINSTANCE.createOCLBoundCollectionType();
			collectionType.setName(collectionName);
			collectionType.setType(unboundType);
			collectionType.getConforms().add(unboundType);
			collectionType.getTypeBinding().add(typeBinding);
			baseLibrary.getType().add(collectionType);
		}
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("nls")
	public OCLBoundCollectionType getBagType(OCLType elementType) {
		String collectionName = BagType.SINGLETON_NAME + "(" + elementType.getQualifiedName() + ")";
		return getBoundCollectionType(collectionName, getBag(), elementType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("nls")
	public OCLBoundCollectionType getCollectionType(OCLType elementType) {
		String collectionName = CollectionType.SINGLETON_NAME + "(" + elementType.getQualifiedName() + ")";
		return getBoundCollectionType(collectionName, getCollection(), elementType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLType getLibraryTypeOfType(Object object) {
		if (object instanceof PredefinedType<?>) {
			if (object instanceof InvalidType<?>) {
				return getOclInvalid();
			}
			else if (object instanceof VoidType<?>) {
				return getOclVoid();
			}
			else if (object instanceof AnyType<?>) {
//				String name = ((AnyType<?>)object).getName();
//				if (OCL_T.equals(name)) {
//					return getT();
//				}
//				else if (OCL_T2.equals(name)) {
//					return getT2();
//				}
				return getOclAny();
			}
			else if (object instanceof TypeType<?, ?>) {
				return getOclType();
			}
			else if (object instanceof MessageType<?, ?, ?>) {
				return getOclMessage();
			}
			else if (object instanceof PrimitiveType<?>) {
				String name = ((PrimitiveType<?>)object).getName();
				if (PrimitiveType.BOOLEAN_NAME.equals(name)) {
					return getBoolean();
				}
				else if (PrimitiveType.INTEGER_NAME.equals(name)) {
					return getInteger();
				}
				else if (PrimitiveType.REAL_NAME.equals(name)) {
					return getReal();
				}
				else if (PrimitiveType.STRING_NAME.equals(name)) {
					return getString();
				}
				else if (PrimitiveType.UNLIMITED_NATURAL_NAME.equals(name)) {
					return getUnlimitedNatural();
				}
			}
			else if (object instanceof CollectionType<?, ?>) {
				Object elementType = ((CollectionType<?, ?>)object).getElementType();
				OCLType oclElementType = getLibraryTypeOfType(elementType);
				if (object instanceof BagType<?, ?>) {
					return getBagType(oclElementType);
				}
				else if (object instanceof OrderedSetType<?, ?>) {
					return getOrderedSetType(oclElementType);
				}
				else if (object instanceof SequenceType<?, ?>) {
					return getSequenceType(oclElementType);
				}
				else if (object instanceof SetType<?, ?>) {
					return getSetType(oclElementType);
				}
				else {
					return getCollectionType(oclElementType);
				}
			}
			else if (object instanceof TupleType<?, ?>) {
//				if (object instanceof OCLTupleType) {
//					return (OCLTupleType) object;
//				}
			}
		}
		if (baseLibrary instanceof CompatibilityOCLLibrary<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) {
			return ((CompatibilityOCLLibrary<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) baseLibrary).getLibraryTypeOfType(this, object);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLType getLibraryTypeOfValue(Object value, Object staticType) {
		if (value instanceof Number) {
			if (value instanceof BigInteger) {
				return ((BigInteger)value).signum() >= 0 ? getUnlimitedNatural() : getInteger();
			}
			else if (value instanceof BigDecimal) {
				return getReal();
			}
		}
		else if (value instanceof Collection<?>) {
			OCLType oclStaticType = getLibraryTypeOfType(staticType);
			OCLType oclElementType = getOclAny();
			if (oclStaticType instanceof OCLBoundCollectionType) {
				oclElementType = ((OCLBoundCollectionType)oclStaticType).getElementType();
			}
			if (value instanceof LinkedHashSet<?>) {
				return getOrderedSetType(oclElementType);
			}
			else if (value instanceof Set<?>) {
				return getSetType(oclElementType);
			}
			else if (value instanceof List<?>) {
				return getSequenceType(oclElementType);
			}
			else if (value instanceof Bag<?>) {
				return getBagType(oclElementType);
			}
			else {
				return getCollectionType(oclElementType);
			}
		}
		else if (value instanceof Boolean) {
			return getBoolean();
		}
		else if ((value instanceof String) || (value instanceof StringBuffer)) {
			return getString();
		}
		else if (value instanceof TypeExp<?>) {
			return getLibraryTypeOfType(((TypeExp<?>)value).getReferredType());
		}		 
		else if (value instanceof LiteralExp<?>) {
			if (value instanceof InvalidLiteralExp<?>) {
				return getOclInvalid();
			}
			else if (value instanceof NullLiteralExp<?>) {
				return getOclVoid();
			}
			else if ((value instanceof UnlimitedNaturalLiteralExp<?>) && ((UnlimitedNaturalLiteralExp<?>)value).isUnlimited()) {			// FIXME This should not be needed
				return getUnlimitedNatural();
			}
		}		 
		if (baseLibrary instanceof CompatibilityOCLLibrary<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) {
			return ((CompatibilityOCLLibrary<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) baseLibrary).getLibraryTypeOfValue(this, value, staticType);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("nls")
	public OCLBoundCollectionType getOrderedSetType(OCLType elementType) {
		String collectionName = OrderedSetType.SINGLETON_NAME + "(" + elementType.getQualifiedName() + ")";
		return getBoundCollectionType(collectionName, getOrderedSet(), elementType);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("nls")
	public OCLBoundCollectionType getSequenceType(OCLType elementType) {
		String collectionName = SequenceType.SINGLETON_NAME + "(" + elementType.getQualifiedName() + ")";
		return getBoundCollectionType(collectionName, getSequence(), elementType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("nls")
	public OCLBoundCollectionType getSetType(OCLType elementType) {
		String collectionName = SetType.SINGLETON_NAME + "(" + elementType.getQualifiedName() + ")";
		return getBoundCollectionType(collectionName, getSet(), elementType);
	}

} //MergedLibraryImpl
