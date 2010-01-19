/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLEnumerationLiteralImpl.java,v 1.1.2.1 2010/01/19 22:34:20 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLEnumeration;
import org.eclipse.ocl.library.OCLEnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Enumeration Literal</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLEnumerationLiteralImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLEnumerationLiteralImpl#getMetaModelElement <em>Meta Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OCLEnumerationLiteralImpl extends OCLElementImpl implements OCLEnumerationLiteral {
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
	protected OCLEnumerationLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_ENUMERATION_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLEnumeration getContainer() {
		if (eContainerFeatureID() != LibraryPackage.OCL_ENUMERATION_LITERAL__CONTAINER) return null;
		return (OCLEnumeration)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(OCLEnumeration newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, LibraryPackage.OCL_ENUMERATION_LITERAL__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(OCLEnumeration newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != LibraryPackage.OCL_ENUMERATION_LITERAL__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, LibraryPackage.OCL_ENUMERATION__LITERALS, OCLEnumeration.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_ENUMERATION_LITERAL__CONTAINER, newContainer, newContainer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LibraryPackage.OCL_ENUMERATION_LITERAL__META_MODEL_ELEMENT, oldMetaModelElement, metaModelElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_ENUMERATION_LITERAL__META_MODEL_ELEMENT, oldMetaModelElement, metaModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.OCL_ENUMERATION_LITERAL__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((OCLEnumeration)otherEnd, msgs);
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
			case LibraryPackage.OCL_ENUMERATION_LITERAL__CONTAINER:
				return basicSetContainer(null, msgs);
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
			case LibraryPackage.OCL_ENUMERATION_LITERAL__CONTAINER:
				return eInternalContainer().eInverseRemove(this, LibraryPackage.OCL_ENUMERATION__LITERALS, OCLEnumeration.class, msgs);
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
			case LibraryPackage.OCL_ENUMERATION_LITERAL__CONTAINER:
				return getContainer();
			case LibraryPackage.OCL_ENUMERATION_LITERAL__META_MODEL_ELEMENT:
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
			case LibraryPackage.OCL_ENUMERATION_LITERAL__CONTAINER:
				setContainer((OCLEnumeration)newValue);
				return;
			case LibraryPackage.OCL_ENUMERATION_LITERAL__META_MODEL_ELEMENT:
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
			case LibraryPackage.OCL_ENUMERATION_LITERAL__CONTAINER:
				setContainer((OCLEnumeration)null);
				return;
			case LibraryPackage.OCL_ENUMERATION_LITERAL__META_MODEL_ELEMENT:
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
			case LibraryPackage.OCL_ENUMERATION_LITERAL__CONTAINER:
				return getContainer() != null;
			case LibraryPackage.OCL_ENUMERATION_LITERAL__META_MODEL_ELEMENT:
				return metaModelElement != null;
		}
		return super.eIsSet(featureID);
	}

} //OCLEnumerationLiteralImpl
