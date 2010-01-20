/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLClassifierImpl.java,v 1.1.2.2 2010/01/20 09:09:32 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLClassifier;
import org.eclipse.ocl.library.OCLMetaModelElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Classifier</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLClassifierImpl#getMetaModelElement <em>Meta Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OCLClassifierImpl extends OCLTypeImpl implements OCLClassifier {
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
	protected OCLClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_CLASSIFIER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LibraryPackage.OCL_CLASSIFIER__META_MODEL_ELEMENT, oldMetaModelElement, metaModelElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_CLASSIFIER__META_MODEL_ELEMENT, oldMetaModelElement, metaModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.OCL_CLASSIFIER__META_MODEL_ELEMENT:
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
			case LibraryPackage.OCL_CLASSIFIER__META_MODEL_ELEMENT:
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
			case LibraryPackage.OCL_CLASSIFIER__META_MODEL_ELEMENT:
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
			case LibraryPackage.OCL_CLASSIFIER__META_MODEL_ELEMENT:
				return metaModelElement != null;
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
		if (baseClass == OCLMetaModelElement.class) {
			switch (derivedFeatureID) {
				case LibraryPackage.OCL_CLASSIFIER__META_MODEL_ELEMENT: return LibraryPackage.OCL_META_MODEL_ELEMENT__META_MODEL_ELEMENT;
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
		if (baseClass == OCLMetaModelElement.class) {
			switch (baseFeatureID) {
				case LibraryPackage.OCL_META_MODEL_ELEMENT__META_MODEL_ELEMENT: return LibraryPackage.OCL_CLASSIFIER__META_MODEL_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OCLClassifierImpl
