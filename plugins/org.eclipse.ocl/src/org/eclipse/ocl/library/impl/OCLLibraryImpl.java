/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLLibraryImpl.java,v 1.1.2.3 2010/01/31 08:43:26 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.library.LibraryOperation;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLLibrary;
import org.eclipse.ocl.library.OCLTypeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLLibraryImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLLibraryImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OCLLibraryImpl extends OCLPackageParentImpl implements OCLLibrary {

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLLibrary> extends_;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLTypeValue> type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OCLLibrary> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<OCLLibrary>(OCLLibrary.class, this, LibraryPackage.OCL_LIBRARY__EXTENDS);
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OCLTypeValue> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<OCLTypeValue>(OCLTypeValue.class, this, LibraryPackage.OCL_LIBRARY__TYPE);
		}
		return type;
	}
	
	/**
	 * Library operations created to support the serialised class references.
	 */
	private Map<Class<? extends LibraryOperation>, LibraryOperation> libraryOperationMap = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LibraryOperation getLibraryOperation(Class<? extends LibraryOperation> libraryOperationClass) {
		if (libraryOperationMap != null) {
			return libraryOperationMap .get(libraryOperationClass);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLTypeValue getType(String name) {
		if (type != null) {
			for (OCLTypeValue aType : type) {
				if (name.equals(aType.getName())) {
					return aType;
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
	public void putLibraryOperation(Class<? extends LibraryOperation> libraryOperationClass, LibraryOperation libraryOperation) {
		if (libraryOperationMap == null) {
			libraryOperationMap = new HashMap<Class<? extends LibraryOperation>, LibraryOperation>();
		}
		libraryOperationMap.put(libraryOperationClass, libraryOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.OCL_LIBRARY__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public OCLLibrary getLibrary() {
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("nls")
	@Override
	public String getQualifiedName() {
		return name != null ? name : "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.OCL_LIBRARY__EXTENDS:
				return getExtends();
			case LibraryPackage.OCL_LIBRARY__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LibraryPackage.OCL_LIBRARY__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends OCLLibrary>)newValue);
				return;
			case LibraryPackage.OCL_LIBRARY__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends OCLTypeValue>)newValue);
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
			case LibraryPackage.OCL_LIBRARY__EXTENDS:
				getExtends().clear();
				return;
			case LibraryPackage.OCL_LIBRARY__TYPE:
				getType().clear();
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
			case LibraryPackage.OCL_LIBRARY__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
			case LibraryPackage.OCL_LIBRARY__TYPE:
				return type != null && !type.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LibraryImpl
