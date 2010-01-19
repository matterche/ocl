/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLDataTypeImpl.java,v 1.1.2.1 2010/01/19 22:34:20 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Data Type</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLDataTypeImpl#getMetaModelElement <em>Meta Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OCLDataTypeImpl extends OCLTypeImpl implements OCLDataType {
	/**
	 * The cached value of the '{@link #getMetaModelElement() <em>Meta Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModelElement()
	 * @generated
	 * @ordered
	 */
	protected EObject metaModelElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getMetaModelElement() {
		if (metaModelElement != null && metaModelElement.eIsProxy()) {
			InternalEObject oldMetaModelElement = (InternalEObject)metaModelElement;
			metaModelElement = eResolveProxy(oldMetaModelElement);
			if (metaModelElement != oldMetaModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LibraryPackage.OCL_DATA_TYPE__META_MODEL_ELEMENT, oldMetaModelElement, metaModelElement));
			}
		}
		return metaModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetMetaModelElement() {
		return metaModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaModelElement(EObject newMetaModelElement) {
		EObject oldMetaModelElement = metaModelElement;
		metaModelElement = newMetaModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_DATA_TYPE__META_MODEL_ELEMENT, oldMetaModelElement, metaModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.OCL_DATA_TYPE__META_MODEL_ELEMENT:
				if (resolve) return getMetaModelElement();
				return basicGetMetaModelElement();
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
			case LibraryPackage.OCL_DATA_TYPE__META_MODEL_ELEMENT:
				setMetaModelElement((EObject)newValue);
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
			case LibraryPackage.OCL_DATA_TYPE__META_MODEL_ELEMENT:
				setMetaModelElement((EObject)null);
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
			case LibraryPackage.OCL_DATA_TYPE__META_MODEL_ELEMENT:
				return metaModelElement != null;
		}
		return super.eIsSet(featureID);
	}

} //OCLDataTypeImpl
