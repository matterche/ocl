/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLTypedElementImpl.java,v 1.1.2.3 2010/01/31 22:23:47 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.library.LibraryFeature;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLBoundType;
import org.eclipse.ocl.library.OCLLibrary;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.OCLTypeBinding;
import org.eclipse.ocl.library.OCLTypeParameter;
import org.eclipse.ocl.library.OCLTypeValue;
import org.eclipse.ocl.library.OCLTypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Typed Element</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLTypedElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLTypedElementImpl#getBoundType <em>Bound Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OCLTypedElementImpl extends OCLNamedElementImpl implements OCLTypedElement {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected OCLTypeValue type;

	/**
	 * The cached value of the '{@link #getBoundType() <em>Bound Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundType()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLBoundType> boundType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLTypedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_TYPED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLTypeValue getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (OCLTypeValue)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LibraryPackage.OCL_TYPED_ELEMENT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLTypeValue basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(OCLTypeValue newType) {
		OCLTypeValue oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_TYPED_ELEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OCLBoundType> getBoundType() {
		if (boundType == null) {
			boundType = new EObjectContainmentEList<OCLBoundType>(OCLBoundType.class, this, LibraryPackage.OCL_TYPED_ELEMENT__BOUND_TYPE);
		}
		return boundType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLType getResolvedType(OCLType contextType) {
		OCLTypeValue typeValue = type;
		while (typeValue instanceof OCLTypeParameter) {
			OCLTypeBinding typeBinding = contextType.getTypeBinding((OCLTypeParameter) typeValue);
			typeValue = typeBinding != null ? typeBinding.getTypeValue() : null;;
		}
		if (typeValue instanceof OCLType) {
			return (OCLType) typeValue;
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
			case LibraryPackage.OCL_TYPED_ELEMENT__BOUND_TYPE:
				return ((InternalEList<?>)getBoundType()).basicRemove(otherEnd, msgs);
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
			case LibraryPackage.OCL_TYPED_ELEMENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case LibraryPackage.OCL_TYPED_ELEMENT__BOUND_TYPE:
				return getBoundType();
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
			case LibraryPackage.OCL_TYPED_ELEMENT__TYPE:
				setType((OCLTypeValue)newValue);
				return;
			case LibraryPackage.OCL_TYPED_ELEMENT__BOUND_TYPE:
				getBoundType().clear();
				getBoundType().addAll((Collection<? extends OCLBoundType>)newValue);
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
			case LibraryPackage.OCL_TYPED_ELEMENT__TYPE:
				setType((OCLTypeValue)null);
				return;
			case LibraryPackage.OCL_TYPED_ELEMENT__BOUND_TYPE:
				getBoundType().clear();
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
			case LibraryPackage.OCL_TYPED_ELEMENT__TYPE:
				return type != null;
			case LibraryPackage.OCL_TYPED_ELEMENT__BOUND_TYPE:
				return boundType != null && !boundType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void appendQualifiedSignature(StringBuffer s) {
		super.appendQualifiedSignature(s);
		appendTypeSignature(s);
	}

	@Override
	public void appendSignature(StringBuffer s) {
		super.appendSignature(s);
		appendTypeSignature(s);
	}

	public void appendTypeSignature(StringBuffer s) {
		s.append(" : "); //$NON-NLS-1$
		appendSignature(s, type);
	}

	protected <T extends LibraryFeature> T createLibraryFeatureInstance(Class<? extends T> libraryFeatureClass) {
		OCLLibrary library = getLibrary();
		T libraryFeature = library.getLibraryFeature(libraryFeatureClass);
		if (libraryFeature == null) {
			try {
				libraryFeature = libraryFeatureClass.newInstance();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (libraryFeature != null) {
			library.putLibraryFeature(libraryFeatureClass, libraryFeature);
		}
		return libraryFeature;
	}

	@Override
	public String getNameSeparator() {
		return "."; //$NON-NLS-1$
	}
} //OCLTypedElementImpl
