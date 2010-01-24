/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLLibraryOperationImpl.java,v 1.1.2.5 2010/01/24 07:41:14 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.library.ILibraryOperation;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLLibrary;
import org.eclipse.ocl.library.OCLLibraryOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Library Operation</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLLibraryOperationImpl#getLibraryOperationClass <em>Library Operation Class</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLLibraryOperationImpl#getLibraryOperation <em>Library Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OCLLibraryOperationImpl extends OCLOperationImpl implements OCLLibraryOperation {
	/**
	 * The cached value of the '{@link #getLibraryOperationClass() <em>Library Operation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryOperationClass()
	 * @generated
	 * @ordered
	 */
	protected Class<? extends ILibraryOperation> libraryOperationClass;
	/**
	 * The default value of the '{@link #getLibraryOperation() <em>Library Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryOperation()
	 * @generated
	 * @ordered
	 */
	protected static final ILibraryOperation LIBRARY_OPERATION_EDEFAULT = null;
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
	public Class<? extends ILibraryOperation> getLibraryOperationClass() {
		return libraryOperationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibraryOperationClass(Class<? extends ILibraryOperation> newLibraryOperationClass) {
		Class<? extends ILibraryOperation> oldLibraryOperationClass = libraryOperationClass;
		libraryOperationClass = newLibraryOperationClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_LIBRARY_OPERATION__LIBRARY_OPERATION_CLASS, oldLibraryOperationClass, libraryOperationClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.OCL_LIBRARY_OPERATION__LIBRARY_OPERATION_CLASS:
				return getLibraryOperationClass();
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
			case LibraryPackage.OCL_LIBRARY_OPERATION__LIBRARY_OPERATION_CLASS:
				setLibraryOperationClass((Class<? extends ILibraryOperation>)newValue);
				return;
			case LibraryPackage.OCL_LIBRARY_OPERATION__LIBRARY_OPERATION:
				setLibraryOperation((ILibraryOperation)newValue);
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
			case LibraryPackage.OCL_LIBRARY_OPERATION__LIBRARY_OPERATION_CLASS:
				setLibraryOperationClass((Class<? extends ILibraryOperation>)null);
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
			case LibraryPackage.OCL_LIBRARY_OPERATION__LIBRARY_OPERATION_CLASS:
				return libraryOperationClass != null;
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
		result.append(" -> "); //$NON-NLS-1$
		if (libraryOperationClass != null) {
			result.append(libraryOperationClass.getSimpleName());
		}
		return result.toString();
	}

	private ILibraryOperation libraryOperation = null;

	public ILibraryOperation getLibraryOperation() {
		if (libraryOperation == null) {
			OCLLibrary library = getLibrary();
			libraryOperation = library.getLibraryOperation(libraryOperationClass);
			if (libraryOperation == null) {
				try {
					libraryOperation = libraryOperationClass.newInstance();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (libraryOperation != null) {
				library.putLibraryOperation(libraryOperationClass, libraryOperation);
			}
		}
		return libraryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibraryOperation(ILibraryOperation newLibraryOperation) {
		ILibraryOperation oldLibraryOperation = libraryOperation;
		libraryOperation = newLibraryOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_LIBRARY_OPERATION__LIBRARY_OPERATION, oldLibraryOperation, libraryOperation));
	}
} //OCLLibraryOperationImpl
