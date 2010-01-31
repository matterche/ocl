/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLLibraryPropertyImpl.java,v 1.1.2.7 2010/01/31 22:23:47 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.LibraryProperty;
import org.eclipse.ocl.library.OCLLibraryProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Library Property</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLLibraryPropertyImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLLibraryPropertyImpl#getLibraryProperty <em>Library Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OCLLibraryPropertyImpl extends OCLPropertyImpl implements OCLLibraryProperty {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected Class<? extends LibraryProperty> class_;
	/**
	 * The default value of the '{@link #getLibraryProperty() <em>Library Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryProperty()
	 * @generated
	 * @ordered
	 */
	protected static final LibraryProperty LIBRARY_PROPERTY_EDEFAULT = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLLibraryPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_LIBRARY_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<? extends LibraryProperty> getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass_(Class<? extends LibraryProperty> newClass) {
		Class<? extends LibraryProperty> oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_LIBRARY_PROPERTY__CLASS, oldClass, class_));
	}

	private LibraryProperty libraryProperty = null;

	public LibraryProperty getLibraryProperty() {
		if ((libraryProperty == null) && (class_ != null)) {
			libraryProperty = createLibraryFeatureInstance(class_);
		}
		return libraryProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibraryProperty(LibraryProperty newLibraryProperty) {
		LibraryProperty oldLibraryProperty = libraryProperty;
		libraryProperty = newLibraryProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY, oldLibraryProperty, libraryProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.OCL_LIBRARY_PROPERTY__CLASS:
				return getClass_();
			case LibraryPackage.OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY:
				return getLibraryProperty();
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
			case LibraryPackage.OCL_LIBRARY_PROPERTY__CLASS:
				setClass_((Class<? extends LibraryProperty>)newValue);
				return;
			case LibraryPackage.OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY:
				setLibraryProperty((LibraryProperty)newValue);
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
			case LibraryPackage.OCL_LIBRARY_PROPERTY__CLASS:
				setClass_((Class<? extends LibraryProperty>)null);
				return;
			case LibraryPackage.OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY:
				setLibraryProperty(LIBRARY_PROPERTY_EDEFAULT);
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
			case LibraryPackage.OCL_LIBRARY_PROPERTY__CLASS:
				return class_ != null;
			case LibraryPackage.OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY:
				return LIBRARY_PROPERTY_EDEFAULT == null ? libraryProperty != null : !LIBRARY_PROPERTY_EDEFAULT.equals(libraryProperty);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" => "); //$NON-NLS-1$
		if (class_ != null) {
			result.append(class_.getSimpleName());
		}
		return result.toString();
	}
} //OCLLibraryPropertyImpl
