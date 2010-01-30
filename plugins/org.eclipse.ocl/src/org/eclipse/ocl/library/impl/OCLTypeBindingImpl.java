/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLTypeBindingImpl.java,v 1.1.2.1 2010/01/30 07:49:27 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLBoundType;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.OCLTypeBinding;
import org.eclipse.ocl.library.OCLTypeParameter;
import org.eclipse.ocl.library.OCLTypeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Type Binding</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLTypeBindingImpl#getTypeParameter <em>Type Parameter</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLTypeBindingImpl#getTypeValue <em>Type Value</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLTypeBindingImpl#getBoundType <em>Bound Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OCLTypeBindingImpl extends OCLElementImpl implements OCLTypeBinding {
	/**
	 * The cached value of the '{@link #getTypeParameter() <em>Type Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameter()
	 * @generated
	 * @ordered
	 */
	protected OCLTypeParameter typeParameter;
	/**
	 * The cached value of the '{@link #getTypeValue() <em>Type Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeValue()
	 * @generated
	 * @ordered
	 */
	protected OCLTypeValue typeValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLTypeBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_TYPE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLTypeParameter getTypeParameter() {
		if (typeParameter != null && typeParameter.eIsProxy()) {
			InternalEObject oldTypeParameter = (InternalEObject)typeParameter;
			typeParameter = (OCLTypeParameter)eResolveProxy(oldTypeParameter);
			if (typeParameter != oldTypeParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LibraryPackage.OCL_TYPE_BINDING__TYPE_PARAMETER, oldTypeParameter, typeParameter));
			}
		}
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLTypeParameter basicGetTypeParameter() {
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeParameter(OCLTypeParameter newTypeParameter) {
		OCLTypeParameter oldTypeParameter = typeParameter;
		typeParameter = newTypeParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_TYPE_BINDING__TYPE_PARAMETER, oldTypeParameter, typeParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLTypeValue getTypeValue() {
		if (typeValue != null && typeValue.eIsProxy()) {
			InternalEObject oldTypeValue = (InternalEObject)typeValue;
			typeValue = (OCLTypeValue)eResolveProxy(oldTypeValue);
			if (typeValue != oldTypeValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LibraryPackage.OCL_TYPE_BINDING__TYPE_VALUE, oldTypeValue, typeValue));
			}
		}
		return typeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLTypeValue basicGetTypeValue() {
		return typeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeValue(OCLTypeValue newTypeValue) {
		OCLTypeValue oldTypeValue = typeValue;
		typeValue = newTypeValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_TYPE_BINDING__TYPE_VALUE, oldTypeValue, typeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLBoundType getBoundType() {
		if (eContainerFeatureID() != LibraryPackage.OCL_TYPE_BINDING__BOUND_TYPE) return null;
		return (OCLBoundType)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundType(OCLBoundType newBoundType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBoundType, LibraryPackage.OCL_TYPE_BINDING__BOUND_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundType(OCLBoundType newBoundType) {
		if (newBoundType != eInternalContainer() || (eContainerFeatureID() != LibraryPackage.OCL_TYPE_BINDING__BOUND_TYPE && newBoundType != null)) {
			if (EcoreUtil.isAncestor(this, newBoundType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBoundType != null)
				msgs = ((InternalEObject)newBoundType).eInverseAdd(this, LibraryPackage.OCL_BOUND_TYPE__TYPE_BINDING, OCLBoundType.class, msgs);
			msgs = basicSetBoundType(newBoundType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_TYPE_BINDING__BOUND_TYPE, newBoundType, newBoundType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLType getResolvedType() {
		if (typeValue instanceof OCLType) {
			return (OCLType) typeValue;
		}
		throw new UnsupportedOperationException();		// FIXME UOE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.OCL_TYPE_BINDING__BOUND_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBoundType((OCLBoundType)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.OCL_TYPE_BINDING__BOUND_TYPE:
				return basicSetBoundType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case LibraryPackage.OCL_TYPE_BINDING__BOUND_TYPE:
				return eInternalContainer().eInverseRemove(this, LibraryPackage.OCL_BOUND_TYPE__TYPE_BINDING, OCLBoundType.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.OCL_TYPE_BINDING__TYPE_PARAMETER:
				if (resolve) return getTypeParameter();
				return basicGetTypeParameter();
			case LibraryPackage.OCL_TYPE_BINDING__TYPE_VALUE:
				if (resolve) return getTypeValue();
				return basicGetTypeValue();
			case LibraryPackage.OCL_TYPE_BINDING__BOUND_TYPE:
				return getBoundType();
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
			case LibraryPackage.OCL_TYPE_BINDING__TYPE_PARAMETER:
				setTypeParameter((OCLTypeParameter)newValue);
				return;
			case LibraryPackage.OCL_TYPE_BINDING__TYPE_VALUE:
				setTypeValue((OCLTypeValue)newValue);
				return;
			case LibraryPackage.OCL_TYPE_BINDING__BOUND_TYPE:
				setBoundType((OCLBoundType)newValue);
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
			case LibraryPackage.OCL_TYPE_BINDING__TYPE_PARAMETER:
				setTypeParameter((OCLTypeParameter)null);
				return;
			case LibraryPackage.OCL_TYPE_BINDING__TYPE_VALUE:
				setTypeValue((OCLTypeValue)null);
				return;
			case LibraryPackage.OCL_TYPE_BINDING__BOUND_TYPE:
				setBoundType((OCLBoundType)null);
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
			case LibraryPackage.OCL_TYPE_BINDING__TYPE_PARAMETER:
				return typeParameter != null;
			case LibraryPackage.OCL_TYPE_BINDING__TYPE_VALUE:
				return typeValue != null;
			case LibraryPackage.OCL_TYPE_BINDING__BOUND_TYPE:
				return getBoundType() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String getName() {
		return typeParameter != null ? typeParameter.getName() : null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		appendQualifiedSignature(s);
		s.append(" => "); //$NON-NLS-1$
		appendQualifiedSignature(s, typeValue);
		return s.toString();
	}

} //OCLTypeBindingImpl
