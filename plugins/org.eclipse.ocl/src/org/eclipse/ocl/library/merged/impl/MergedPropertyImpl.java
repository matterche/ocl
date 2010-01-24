/**
 * <copyright>
 * </copyright>
 *
 * $Id: MergedPropertyImpl.java,v 1.1.2.1 2010/01/24 07:41:12 ewillink Exp $
 */
package org.eclipse.ocl.library.merged.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.impl.OCLElementImpl;
import org.eclipse.ocl.library.merged.MergedProperty;
import org.eclipse.ocl.library.merged.OCLMergedLibraryPackage;
import org.eclipse.ocl.utilities.ExpressionInOCL;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Merged Property</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedPropertyImpl#getInit <em>Init</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedPropertyImpl#getDerive <em>Derive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MergedPropertyImpl extends OCLElementImpl implements MergedProperty {
	/**
	 * The cached value of the '{@link #getInit() <em>Init</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected ExpressionInOCL<?, ?> init;

	/**
	 * The cached value of the '{@link #getDerive() <em>Derive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerive()
	 * @generated
	 * @ordered
	 */
	protected ExpressionInOCL<?, ?> derive;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergedPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCLMergedLibraryPackage.Literals.MERGED_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionInOCL<?, ?> getInit() {
		if (init != null && init.eIsProxy()) {
			InternalEObject oldInit = (InternalEObject)init;
			init = (ExpressionInOCL<?, ?>)eResolveProxy(oldInit);
			if (init != oldInit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCLMergedLibraryPackage.MERGED_PROPERTY__INIT, oldInit, init));
			}
		}
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionInOCL<?, ?> basicGetInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(ExpressionInOCL<?, ?> newInit) {
		ExpressionInOCL<?, ?> oldInit = init;
		init = newInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLMergedLibraryPackage.MERGED_PROPERTY__INIT, oldInit, init));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionInOCL<?, ?> getDerive() {
		if (derive != null && derive.eIsProxy()) {
			InternalEObject oldDerive = (InternalEObject)derive;
			derive = (ExpressionInOCL<?, ?>)eResolveProxy(oldDerive);
			if (derive != oldDerive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCLMergedLibraryPackage.MERGED_PROPERTY__DERIVE, oldDerive, derive));
			}
		}
		return derive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionInOCL<?, ?> basicGetDerive() {
		return derive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerive(ExpressionInOCL<?, ?> newDerive) {
		ExpressionInOCL<?, ?> oldDerive = derive;
		derive = newDerive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLMergedLibraryPackage.MERGED_PROPERTY__DERIVE, oldDerive, derive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract OCLType getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCLMergedLibraryPackage.MERGED_PROPERTY__INIT:
				if (resolve) return getInit();
				return basicGetInit();
			case OCLMergedLibraryPackage.MERGED_PROPERTY__DERIVE:
				if (resolve) return getDerive();
				return basicGetDerive();
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
			case OCLMergedLibraryPackage.MERGED_PROPERTY__INIT:
				setInit((ExpressionInOCL<?, ?>)newValue);
				return;
			case OCLMergedLibraryPackage.MERGED_PROPERTY__DERIVE:
				setDerive((ExpressionInOCL<?, ?>)newValue);
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
			case OCLMergedLibraryPackage.MERGED_PROPERTY__INIT:
				setInit((ExpressionInOCL<?, ?>)null);
				return;
			case OCLMergedLibraryPackage.MERGED_PROPERTY__DERIVE:
				setDerive((ExpressionInOCL<?, ?>)null);
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
			case OCLMergedLibraryPackage.MERGED_PROPERTY__INIT:
				return init != null;
			case OCLMergedLibraryPackage.MERGED_PROPERTY__DERIVE:
				return derive != null;
		}
		return super.eIsSet(featureID);
	}
} //OCLMergedPropertyImpl
