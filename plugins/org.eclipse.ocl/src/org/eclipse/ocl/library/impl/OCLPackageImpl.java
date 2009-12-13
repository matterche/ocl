/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLPackageImpl.java,v 1.1.2.1 2009/12/13 18:44:27 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLPackage;
import org.eclipse.ocl.library.OCLType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLPackageImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLPackageImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OCLPackageImpl extends OCLElementImpl implements OCLPackage {
	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLPackage> extends_;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLType> type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OCLPackage> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectContainmentEList<OCLPackage>(OCLPackage.class, this, LibraryPackage.OCL_PACKAGE__EXTENDS);
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OCLType> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<OCLType>(OCLType.class, this, LibraryPackage.OCL_PACKAGE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.OCL_PACKAGE__EXTENDS:
				return ((InternalEList<?>)getExtends()).basicRemove(otherEnd, msgs);
			case LibraryPackage.OCL_PACKAGE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.OCL_PACKAGE__EXTENDS:
				return getExtends();
			case LibraryPackage.OCL_PACKAGE__TYPE:
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
			case LibraryPackage.OCL_PACKAGE__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends OCLPackage>)newValue);
				return;
			case LibraryPackage.OCL_PACKAGE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends OCLType>)newValue);
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
			case LibraryPackage.OCL_PACKAGE__EXTENDS:
				getExtends().clear();
				return;
			case LibraryPackage.OCL_PACKAGE__TYPE:
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
			case LibraryPackage.OCL_PACKAGE__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
			case LibraryPackage.OCL_PACKAGE__TYPE:
				return type != null && !type.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OCLPackageImpl
