/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLLibraryOperationImpl.java,v 1.1.2.8 2010/01/31 22:23:47 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.library.LibraryOperation;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLLibraryOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Library Operation</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLLibraryOperationImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLLibraryOperationImpl#getLibraryOperation <em>Library Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OCLLibraryOperationImpl extends OCLOperationImpl implements OCLLibraryOperation {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected Class<? extends LibraryOperation> class_;
	/**
	 * The default value of the '{@link #getLibraryOperation() <em>Library Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryOperation()
	 * @generated
	 * @ordered
	 */
	protected static final LibraryOperation LIBRARY_OPERATION_EDEFAULT = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLLibraryOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_LIBRARY_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<? extends LibraryOperation> getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass_(Class<? extends LibraryOperation> newClass) {
		Class<? extends LibraryOperation> oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_LIBRARY_OPERATION__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.OCL_LIBRARY_OPERATION__CLASS:
				return getClass_();
			case LibraryPackage.OCL_LIBRARY_OPERATION__LIBRARY_OPERATION:
				return getLibraryOperation();
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
			case LibraryPackage.OCL_LIBRARY_OPERATION__CLASS:
				setClass_((Class<? extends LibraryOperation>)newValue);
				return;
			case LibraryPackage.OCL_LIBRARY_OPERATION__LIBRARY_OPERATION:
				setLibraryOperation((LibraryOperation)newValue);
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
			case LibraryPackage.OCL_LIBRARY_OPERATION__CLASS:
				setClass_((Class<? extends LibraryOperation>)null);
				return;
			case LibraryPackage.OCL_LIBRARY_OPERATION__LIBRARY_OPERATION:
				setLibraryOperation(LIBRARY_OPERATION_EDEFAULT);
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
			case LibraryPackage.OCL_LIBRARY_OPERATION__CLASS:
				return class_ != null;
			case LibraryPackage.OCL_LIBRARY_OPERATION__LIBRARY_OPERATION:
				return LIBRARY_OPERATION_EDEFAULT == null ? libraryOperation != null : !LIBRARY_OPERATION_EDEFAULT.equals(libraryOperation);
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

	private LibraryOperation libraryOperation = null;

	public LibraryOperation getLibraryOperation() {
		if ((libraryOperation == null) && (class_ != null)) {
			libraryOperation = createLibraryFeatureInstance(class_);
		}
		return libraryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibraryOperation(LibraryOperation newLibraryOperation) {
		LibraryOperation oldLibraryOperation = libraryOperation;
		libraryOperation = newLibraryOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_LIBRARY_OPERATION__LIBRARY_OPERATION, oldLibraryOperation, libraryOperation));
	}
} //OCLLibraryOperationImpl
