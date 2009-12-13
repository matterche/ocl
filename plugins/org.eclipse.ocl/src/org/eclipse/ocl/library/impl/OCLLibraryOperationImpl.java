/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLLibraryOperationImpl.java,v 1.1.2.1 2009/12/13 18:44:27 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.LibraryOperation;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLLibraryOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Library Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLLibraryOperationImpl#getLibraryOperationClass <em>Library Operation Class</em>}</li>
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
	protected Class<? extends LibraryOperation> libraryOperationClass;
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
	public Class<? extends LibraryOperation> getLibraryOperationClass() {
		return libraryOperationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibraryOperationClass(Class<? extends LibraryOperation> newLibraryOperationClass) {
		Class<? extends LibraryOperation> oldLibraryOperationClass = libraryOperationClass;
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
				setLibraryOperationClass((Class<? extends LibraryOperation>)newValue);
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
				setLibraryOperationClass((Class<? extends LibraryOperation>)null);
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
		result.append(" (libraryOperationClass: ");
		result.append(libraryOperationClass);
		result.append(')');
		return result.toString();
	}

	private LibraryOperation libraryOperation = null;

	public LibraryOperation getLibraryOperation() throws Exception {
		if (libraryOperation != null) {
			libraryOperation = libraryOperationClass.newInstance();
		}
		return libraryOperation;
	}

	@Override
	public boolean canEvaluate(OperationCallExp operationCall) throws Exception {
		return getLibraryOperation().canEvaluate(operationCall);
	}

	@Override
	public EObject evaluate(EvaluationVisitor evaluationVisitor, OperationCallExp operationCall) throws Exception {
		return getLibraryOperation().evaluate(evaluationVisitor, operationCall);
	}

} //OCLLibraryOperationImpl
