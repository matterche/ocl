/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLLibraryPropertyImpl.java,v 1.1.2.5 2010/01/24 07:41:14 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.library.ILibraryProperty;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLLibraryProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Library Property</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLLibraryPropertyImpl#getLibraryPropertyClass <em>Library Property Class</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLLibraryPropertyImpl#getLibraryProperty <em>Library Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OCLLibraryPropertyImpl extends OCLPropertyImpl implements OCLLibraryProperty {
	/**
	 * The cached value of the '{@link #getLibraryPropertyClass() <em>Library Property Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryPropertyClass()
	 * @generated
	 * @ordered
	 */
	protected Class<? extends ILibraryProperty> libraryPropertyClass;
	/**
	 * The default value of the '{@link #getLibraryProperty() <em>Library Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryProperty()
	 * @generated
	 * @ordered
	 */
	protected static final ILibraryProperty LIBRARY_PROPERTY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLibraryProperty() <em>Library Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryProperty()
	 * @generated
	 * @ordered
	 */
	protected ILibraryProperty libraryProperty = LIBRARY_PROPERTY_EDEFAULT;
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
	public Class<? extends ILibraryProperty> getLibraryPropertyClass() {
		return libraryPropertyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibraryPropertyClass(Class<? extends ILibraryProperty> newLibraryPropertyClass) {
		Class<? extends ILibraryProperty> oldLibraryPropertyClass = libraryPropertyClass;
		libraryPropertyClass = newLibraryPropertyClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY_CLASS, oldLibraryPropertyClass, libraryPropertyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILibraryProperty getLibraryProperty() {
		return libraryProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibraryProperty(ILibraryProperty newLibraryProperty) {
		ILibraryProperty oldLibraryProperty = libraryProperty;
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
			case LibraryPackage.OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY_CLASS:
				return getLibraryPropertyClass();
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
			case LibraryPackage.OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY_CLASS:
				setLibraryPropertyClass((Class<? extends ILibraryProperty>)newValue);
				return;
			case LibraryPackage.OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY:
				setLibraryProperty((ILibraryProperty)newValue);
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
			case LibraryPackage.OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY_CLASS:
				setLibraryPropertyClass((Class<? extends ILibraryProperty>)null);
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
			case LibraryPackage.OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY_CLASS:
				return libraryPropertyClass != null;
			case LibraryPackage.OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY:
				return LIBRARY_PROPERTY_EDEFAULT == null ? libraryProperty != null : !LIBRARY_PROPERTY_EDEFAULT.equals(libraryProperty);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (libraryPropertyClass: "); //$NON-NLS-1$
		result.append(libraryPropertyClass);
		result.append(", libraryProperty: "); //$NON-NLS-1$
		result.append(libraryProperty);
		result.append(')');
		return result.toString();
	}
} //OCLLibraryPropertyImpl
