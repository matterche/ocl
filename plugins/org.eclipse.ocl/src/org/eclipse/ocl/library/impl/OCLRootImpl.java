/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLRootImpl.java,v 1.1.2.1 2010/01/24 07:41:15 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.ocl.expressions.ExpressionsFactory;
import org.eclipse.ocl.expressions.InvalidLiteralExp;
import org.eclipse.ocl.expressions.LiteralExp;
import org.eclipse.ocl.expressions.NullLiteralExp;
import org.eclipse.ocl.expressions.TypeExp;
import org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.library.LibraryFactory;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLAnyType;
import org.eclipse.ocl.library.OCLBagType;
import org.eclipse.ocl.library.OCLCache;
import org.eclipse.ocl.library.OCLCollectionType;
import org.eclipse.ocl.library.OCLInvalidType;
import org.eclipse.ocl.library.OCLOrderedSetType;
import org.eclipse.ocl.library.OCLPackage;
import org.eclipse.ocl.library.OCLRoot;
import org.eclipse.ocl.library.OCLSequenceType;
import org.eclipse.ocl.library.OCLSetType;
import org.eclipse.ocl.library.OCLTemplateParameterType;
import org.eclipse.ocl.library.OCLTupleType;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.OCLVoidType;
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
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getT <em>T</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getTList <em>TList</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLRootImpl#getT2 <em>T2</em>}</li>
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
	 * @generated NOT
	 * @ordered
	 */
	protected InvalidLiteralExp<OCLType> invalid;

	/**
	 * The cached value of the '{@link #getNull() <em>Null</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNull()
	 * @generated NOT
	 * @ordered
	 */
	protected NullLiteralExp<OCLType> null_;

	/**
	 * The cached value of the '{@link #getUnlimited() <em>Unlimited</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnlimited()
	 * @generated NOT
	 * @ordered
	 */
	protected UnlimitedNaturalLiteralExp<OCLType> unlimited;

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
	public OCLBagType getBag() {
		if (bag == null) {
			bag = (OCLBagType) getStdlibType(BagType.SINGLETON_NAME);
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
			boolean_ = getStdlibType(PrimitiveType.BOOLEAN_NAME);
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
			classifier = getStdlibType(CLASSIFIER_NAME);
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
			collection = (OCLCollectionType) getStdlibType(CollectionType.SINGLETON_NAME);
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
			enumeration = getStdlibType(ENUMERATION_NAME);
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
			integer = getStdlibType(PrimitiveType.INTEGER_NAME);
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
			oclAny = (OCLAnyType) getStdlibType(AnyType.SINGLETON_NAME);
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
			oclInvalid = (OCLInvalidType) getStdlibType(InvalidType.SINGLETON_NAME);
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
			oclMessage = getStdlibType(MessageType.SINGLETON_NAME);
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
			oclTuple = (OCLTupleType) getStdlibType(TupleType.SINGLETON_NAME);
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
			oclType = getStdlibType(TypeType.SINGLETON_NAME);
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
			oclVoid = (OCLVoidType) getStdlibType(VoidType.SINGLETON_NAME);
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
			orderedSet = (OCLOrderedSetType) getStdlibType(OrderedSetType.SINGLETON_NAME);
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
			real = getStdlibType(PrimitiveType.REAL_NAME);
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
			sequence = (OCLSequenceType) getStdlibType(SequenceType.SINGLETON_NAME);
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
			set = (OCLSetType) getStdlibType(SetType.SINGLETON_NAME);
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
			string = getStdlibType(PrimitiveType.STRING_NAME);
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
			t = (OCLTemplateParameterType) getStdlibType(OCL_T);
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
			tList = new EObjectEList<OCLTemplateParameterType>(OCLTemplateParameterType.class, this, LibraryPackage.OCL_ROOT__TLIST);
			tList.add(getT());
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
			t2 = (OCLTemplateParameterType) getStdlibType(OCL_T2);
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
	 * @generated NOT
	 */
	@SuppressWarnings("nls")
	public OCLBagType getBagType(OCLType elementType) {
		String collectionName = BagType.SINGLETON_NAME + "(" + elementType.getQualifiedName() + ")";
		OCLBagType collectionType = (OCLBagType) getType(collectionName);		
		if (collectionType == null) {
			collectionType = LibraryFactory.eINSTANCE.createOCLBagType();
			collectionType.setName(collectionName);
			collectionType.setElementType(elementType);
			collectionType.getConforms().add(getBag());
			getType().add(collectionType);
		}
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("nls")
	public OCLCollectionType getCollectionType(OCLType elementType) {
		String collectionName = CollectionType.SINGLETON_NAME + "(" + elementType.getQualifiedName() + ")";
		OCLCollectionType collectionType = (OCLCollectionType) getType(collectionName);		
		if (collectionType == null) {
			collectionType = LibraryFactory.eINSTANCE.createOCLCollectionType();
			collectionType.setName(collectionName);
			collectionType.setElementType(elementType);
			collectionType.getConforms().add(getCollection());
			getType().add(collectionType);
		}
		return collectionType;
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
				String name = ((AnyType<?>)object).getName();
				if (OCL_T.equals(name)) {
					return getT();
				}
				else if (OCL_T2.equals(name)) {
					return getT2();
				}
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
				if (object instanceof OCLTupleType) {
					return (OCLTupleType) object;
				}
			}
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
			if (oclStaticType instanceof OCLCollectionType) {
				oclElementType = ((OCLCollectionType)oclStaticType).getElementType();
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
		return null;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("nls")
	public OCLOrderedSetType getOrderedSetType(OCLType elementType) {
		String collectionName = OrderedSetType.SINGLETON_NAME + "(" + elementType.getQualifiedName() + ")";
		OCLOrderedSetType collectionType = (OCLOrderedSetType) getType(collectionName);		
		if (collectionType == null) {
			collectionType = LibraryFactory.eINSTANCE.createOCLOrderedSetType();
			collectionType.setName(collectionName);
			collectionType.setElementType(elementType);
			collectionType.getConforms().add(getOrderedSet());
			getType().add(collectionType);
		}
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("nls")
	public OCLSequenceType getSequenceType(OCLType elementType) {
		String collectionName = SequenceType.SINGLETON_NAME + "(" + elementType.getQualifiedName() + ")";
		OCLSequenceType collectionType = (OCLSequenceType) getType(collectionName);		
		if (collectionType == null) {
			collectionType = LibraryFactory.eINSTANCE.createOCLSequenceType();
			collectionType.setName(collectionName);
			collectionType.setElementType(elementType);
			collectionType.getConforms().add(getSequence());
			getType().add(collectionType);
		}
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("nls")
	public OCLSetType getSetType(OCLType elementType) {
		String collectionName = SetType.SINGLETON_NAME + "(" + elementType.getQualifiedName() + ")";
		OCLSetType collectionType = (OCLSetType) getType(collectionName);		
		if (collectionType == null) {
			collectionType = LibraryFactory.eINSTANCE.createOCLSetType();
			collectionType.setName(collectionName);
			collectionType.setElementType(elementType);
			collectionType.getConforms().add(getSet());
			getType().add(collectionType);
		}
		return collectionType;
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
			case LibraryPackage.OCL_ROOT__T:
				return getT();
			case LibraryPackage.OCL_ROOT__TLIST:
				return getTList();
			case LibraryPackage.OCL_ROOT__T2:
				return getT2();
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
			case LibraryPackage.OCL_ROOT__T:
				return t != null;
			case LibraryPackage.OCL_ROOT__TLIST:
				return tList != null && !tList.isEmpty();
			case LibraryPackage.OCL_ROOT__T2:
				return t2 != null;
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
				case LibraryPackage.OCL_ROOT__T: return LibraryPackage.OCL_CACHE__T;
				case LibraryPackage.OCL_ROOT__TLIST: return LibraryPackage.OCL_CACHE__TLIST;
				case LibraryPackage.OCL_ROOT__T2: return LibraryPackage.OCL_CACHE__T2;
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
				case LibraryPackage.OCL_CACHE__T: return LibraryPackage.OCL_ROOT__T;
				case LibraryPackage.OCL_CACHE__TLIST: return LibraryPackage.OCL_ROOT__TLIST;
				case LibraryPackage.OCL_CACHE__T2: return LibraryPackage.OCL_ROOT__T2;
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
	
	private OCLType getStdlibType(String name) {
		if (stdlibPackage == null) {
			stdlibPackage = getPackage(OCL);
		}
		if (stdlibPackage != null) {
			return stdlibPackage.getType(name);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLType getType(String name) {
		if (type != null) {
			for (OCLType aType : type) {
				if (name.equals(aType.getName())) {
					return aType;
				}
			}
		}
		return null;
	}

} //LibraryRootImpl
