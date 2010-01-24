/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLCache.java,v 1.1.2.1 2010/01/24 07:40:56 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library Cache</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getBag <em>Bag</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getInteger <em>Integer</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getOclAny <em>Ocl Any</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getOclInvalid <em>Ocl Invalid</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getOclMessage <em>Ocl Message</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getOclTuple <em>Ocl Tuple</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getOclType <em>Ocl Type</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getOclVoid <em>Ocl Void</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getOrderedSet <em>Ordered Set</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getReal <em>Real</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getSet <em>Set</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getString <em>String</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getT <em>T</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getTList <em>TList</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getT2 <em>T2</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getUnlimitedNatural <em>Unlimited Natural</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getInvalid <em>Invalid</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getNull <em>Null</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLCache#getUnlimited <em>Unlimited</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface OCLCache extends OCLElement {
	/**
	 * Returns the value of the '<em><b>Bag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bag</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bag</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_Bag()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	OCLBagType getBag();

	/**
	 * Returns the value of the '<em><b>Boolean</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_Boolean()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	OCLType getBoolean();

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_Classifier()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	OCLType getClassifier();

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_Collection()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	OCLCollectionType getCollection();

	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_Enumeration()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	OCLType getEnumeration();

	/**
	 * Returns the value of the '<em><b>Integer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_Integer()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	OCLType getInteger();

	/**
	 * Returns the value of the '<em><b>Ocl Any</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ocl Any</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ocl Any</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_OclAny()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	OCLAnyType getOclAny();

	/**
	 * Returns the value of the '<em><b>Ocl Invalid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ocl Invalid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ocl Invalid</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_OclInvalid()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	OCLInvalidType getOclInvalid();

	/**
	 * Returns the value of the '<em><b>Ocl Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ocl Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ocl Message</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_OclMessage()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	OCLType getOclMessage();

	/**
	 * Returns the value of the '<em><b>Ocl Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ocl Tuple</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ocl Tuple</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_OclTuple()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	OCLTupleType getOclTuple();

	/**
	 * Returns the value of the '<em><b>Ocl Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ocl Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ocl Type</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_OclType()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	OCLType getOclType();

	/**
	 * Returns the value of the '<em><b>Ocl Void</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ocl Void</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ocl Void</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_OclVoid()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	OCLVoidType getOclVoid();

	/**
	 * Returns the value of the '<em><b>Ordered Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered Set</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_OrderedSet()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	OCLOrderedSetType getOrderedSet();

	/**
	 * Returns the value of the '<em><b>Real</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_Real()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	OCLType getReal();

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_Sequence()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	OCLSequenceType getSequence();

	/**
	 * Returns the value of the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_Set()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	OCLSetType getSet();

	/**
	 * Returns the value of the '<em><b>String</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_String()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	OCLType getString();

	/**
	 * Returns the value of the '<em><b>T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>T</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>T</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_T()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	OCLTemplateParameterType getT();

	/**
	 * Returns the value of the '<em><b>TList</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLTemplateParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TList</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TList</em>' reference list.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_TList()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	EList<OCLTemplateParameterType> getTList();

	/**
	 * Returns the value of the '<em><b>T2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>T2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>T2</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_T2()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	OCLTemplateParameterType getT2();

	/**
	 * Returns the value of the '<em><b>Unlimited Natural</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unlimited Natural</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unlimited Natural</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_UnlimitedNatural()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	OCLType getUnlimitedNatural();

	/**
	 * Returns the value of the '<em><b>Invalid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invalid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invalid</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_Invalid()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	EObject getInvalid();

	/**
	 * Returns the value of the '<em><b>Null</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Null</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_Null()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	EObject getNull();

	/**
	 * Returns the value of the '<em><b>Unlimited</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unlimited</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unlimited</em>' reference.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLCache_Unlimited()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	EObject getUnlimited();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OCLBagType getBagType(OCLType elementType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OCLType getLibraryTypeOfType(Object object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OCLType getLibraryTypeOfValue(Object value, Object staticType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OCLOrderedSetType getOrderedSetType(OCLType elementType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OCLSequenceType getSequenceType(OCLType elementType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OCLSetType getSetType(OCLType elementType);

} // LibraryCache
