/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLBoundTypeImpl.java,v 1.1.2.1 2010/01/30 07:49:25 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLBoundType;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.OCLTypeBinding;
import org.eclipse.ocl.library.OCLTypeParameter;
import org.eclipse.ocl.library.OCLTypeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Bound Type</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLBoundTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLBoundTypeImpl#getTypeBinding <em>Type Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OCLBoundTypeImpl extends OCLTypeImpl implements OCLBoundType {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected OCLType type;
	/**
	 * The cached value of the '{@link #getTypeBinding() <em>Type Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLTypeBinding> typeBinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLBoundTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_BOUND_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (OCLType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LibraryPackage.OCL_BOUND_TYPE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(OCLType newType) {
		OCLType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_BOUND_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OCLTypeBinding> getTypeBinding() {
		if (typeBinding == null) {
			typeBinding = new EObjectContainmentWithInverseEList<OCLTypeBinding>(OCLTypeBinding.class, this, LibraryPackage.OCL_BOUND_TYPE__TYPE_BINDING, LibraryPackage.OCL_TYPE_BINDING__BOUND_TYPE);
		}
		return typeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.OCL_BOUND_TYPE__TYPE_BINDING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypeBinding()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public OCLTypeBinding getTypeBinding(OCLTypeParameter typeParameter) {
		if (typeBinding != null) {
			for (OCLTypeBinding aTypeBinding : typeBinding) {
				if (typeParameter == aTypeBinding.getTypeParameter()) {
					return aTypeBinding;
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.OCL_BOUND_TYPE__TYPE_BINDING:
				return ((InternalEList<?>)getTypeBinding()).basicRemove(otherEnd, msgs);
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
			case LibraryPackage.OCL_BOUND_TYPE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case LibraryPackage.OCL_BOUND_TYPE__TYPE_BINDING:
				return getTypeBinding();
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
			case LibraryPackage.OCL_BOUND_TYPE__TYPE:
				setType((OCLType)newValue);
				return;
			case LibraryPackage.OCL_BOUND_TYPE__TYPE_BINDING:
				getTypeBinding().clear();
				getTypeBinding().addAll((Collection<? extends OCLTypeBinding>)newValue);
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
			case LibraryPackage.OCL_BOUND_TYPE__TYPE:
				setType((OCLType)null);
				return;
			case LibraryPackage.OCL_BOUND_TYPE__TYPE_BINDING:
				getTypeBinding().clear();
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
			case LibraryPackage.OCL_BOUND_TYPE__TYPE:
				return type != null;
			case LibraryPackage.OCL_BOUND_TYPE__TYPE_BINDING:
				return typeBinding != null && !typeBinding.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void appendQualifiedSignature(StringBuffer s) {
		appendQualifiedName(s, type);
		appendTypeBindings(s);
	}

	@Override
	public void appendSignature(StringBuffer s) {
		appendName(s, type);
		appendTypeBindings(s);
	}

	@SuppressWarnings("nls")
	public void appendTypeBindings(StringBuffer s) {
		List<OCLTypeParameter> typeParameters = type != null ? type.getTypeParameter() : null;
		List<OCLTypeBinding> typeBindings = getTypeBinding();
		if (!typeBindings.isEmpty() || ((typeParameters != null) && !typeParameters.isEmpty())) {
			s.append("(");
			String prefix = "";
			if (typeParameters != null) {
				for (OCLTypeParameter typeParameter : typeParameters) {
					s.append(prefix);
					OCLTypeBinding typeBinding = getTypeBinding(typeParameter);
					OCLTypeValue typeValue = typeBinding != null ? typeBinding.getTypeValue() : null;
					appendSignature(s, typeValue);
					prefix = " ,";
				}
			}
			s.append(")");
		}
	}

	@Override
	public String getName() {
		return type.getName();
	}

} //OCLBoundTypeImpl
