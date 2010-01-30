/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLTypeParameterImpl.java,v 1.1.2.1 2010/01/30 07:49:28 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLNamedElement;
import org.eclipse.ocl.library.OCLTypeParameter;
import org.eclipse.ocl.library.OCLTypeParameterParent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Type Parameter</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLTypeParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLTypeParameterImpl#getTypeParameterParent <em>Type Parameter Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OCLTypeParameterImpl extends OCLElementImpl implements OCLTypeParameter {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLTypeParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_TYPE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLTypeParameterParent getTypeParameterParent() {
		if (eContainerFeatureID() != LibraryPackage.OCL_TYPE_PARAMETER__TYPE_PARAMETER_PARENT) return null;
		return (OCLTypeParameterParent)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeParameterParent(OCLTypeParameterParent newTypeParameterParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTypeParameterParent, LibraryPackage.OCL_TYPE_PARAMETER__TYPE_PARAMETER_PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeParameterParent(OCLTypeParameterParent newTypeParameterParent) {
		if (newTypeParameterParent != eInternalContainer() || (eContainerFeatureID() != LibraryPackage.OCL_TYPE_PARAMETER__TYPE_PARAMETER_PARENT && newTypeParameterParent != null)) {
			if (EcoreUtil.isAncestor(this, newTypeParameterParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTypeParameterParent != null)
				msgs = ((InternalEObject)newTypeParameterParent).eInverseAdd(this, LibraryPackage.OCL_TYPE_PARAMETER_PARENT__TYPE_PARAMETER, OCLTypeParameterParent.class, msgs);
			msgs = basicSetTypeParameterParent(newTypeParameterParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_TYPE_PARAMETER__TYPE_PARAMETER_PARENT, newTypeParameterParent, newTypeParameterParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.OCL_TYPE_PARAMETER__TYPE_PARAMETER_PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTypeParameterParent((OCLTypeParameterParent)otherEnd, msgs);
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
			case LibraryPackage.OCL_TYPE_PARAMETER__TYPE_PARAMETER_PARENT:
				return basicSetTypeParameterParent(null, msgs);
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
			case LibraryPackage.OCL_TYPE_PARAMETER__TYPE_PARAMETER_PARENT:
				return eInternalContainer().eInverseRemove(this, LibraryPackage.OCL_TYPE_PARAMETER_PARENT__TYPE_PARAMETER, OCLTypeParameterParent.class, msgs);
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
			case LibraryPackage.OCL_TYPE_PARAMETER__NAME:
				return getName();
			case LibraryPackage.OCL_TYPE_PARAMETER__TYPE_PARAMETER_PARENT:
				return getTypeParameterParent();
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
			case LibraryPackage.OCL_TYPE_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case LibraryPackage.OCL_TYPE_PARAMETER__TYPE_PARAMETER_PARENT:
				setTypeParameterParent((OCLTypeParameterParent)newValue);
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
			case LibraryPackage.OCL_TYPE_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LibraryPackage.OCL_TYPE_PARAMETER__TYPE_PARAMETER_PARENT:
				setTypeParameterParent((OCLTypeParameterParent)null);
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
			case LibraryPackage.OCL_TYPE_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LibraryPackage.OCL_TYPE_PARAMETER__TYPE_PARAMETER_PARENT:
				return getTypeParameterParent() != null;
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
		if (baseClass == OCLNamedElement.class) {
			switch (derivedFeatureID) {
				case LibraryPackage.OCL_TYPE_PARAMETER__NAME: return LibraryPackage.OCL_NAMED_ELEMENT__NAME;
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
		if (baseClass == OCLNamedElement.class) {
			switch (baseFeatureID) {
				case LibraryPackage.OCL_NAMED_ELEMENT__NAME: return LibraryPackage.OCL_TYPE_PARAMETER__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return super.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_TYPE_PARAMETER__NAME, oldName, name));
	}

} //OCLTypeParameterImpl
