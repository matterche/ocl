/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLLibraryPropertyImpl.java,v 1.1.2.4 2010/01/20 09:09:32 ewillink Exp $
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
	protected Class<? extends LibraryProperty> libraryPropertyClass;
	/**
	 * The cached value of the '{@link #getLibraryProperty() <em>Library Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryProperty()
	 * @generated
	 * @ordered
	 */
	protected LibraryProperty libraryProperty;
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
	public Class<? extends LibraryProperty> getLibraryPropertyClass() {
		return libraryPropertyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibraryPropertyClass(Class<? extends LibraryProperty> newLibraryPropertyClass) {
		Class<? extends LibraryProperty> oldLibraryPropertyClass = libraryPropertyClass;
		libraryPropertyClass = newLibraryPropertyClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY_CLASS, oldLibraryPropertyClass, libraryPropertyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryProperty getLibraryProperty() {
		return libraryProperty;
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
				setLibraryPropertyClass((Class<? extends LibraryProperty>)newValue);
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
				setLibraryPropertyClass((Class<? extends LibraryProperty>)null);
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
				return libraryProperty != null;
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
		result.append(')');
		return result.toString();
	}

} //OCLLibraryPropertyImpl
