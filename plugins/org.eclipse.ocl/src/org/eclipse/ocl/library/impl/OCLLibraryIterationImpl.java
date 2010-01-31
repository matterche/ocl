/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLLibraryIterationImpl.java,v 1.1.2.1 2010/01/31 22:23:47 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.library.LibraryIteration;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLLibraryIteration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Library Iteration</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLLibraryIterationImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLLibraryIterationImpl#getLibraryIteration <em>Library Iteration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OCLLibraryIterationImpl extends OCLIterationImpl implements OCLLibraryIteration {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected Class<? extends LibraryIteration> class_;

	/**
	 * The default value of the '{@link #getLibraryIteration() <em>Library Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryIteration()
	 * @generated
	 * @ordered
	 */
	protected static final LibraryIteration LIBRARY_ITERATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLLibraryIterationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_LIBRARY_ITERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<? extends LibraryIteration> getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass_(Class<? extends LibraryIteration> newClass) {
		Class<? extends LibraryIteration> oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_LIBRARY_ITERATION__CLASS, oldClass, class_));
	}

	private LibraryIteration libraryIteration = null;

	public LibraryIteration getLibraryIteration() {
		if ((libraryIteration == null) && (class_ != null)) {
			libraryIteration = createLibraryFeatureInstance(class_);
		}
		return libraryIteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibraryIteration(LibraryIteration newLibraryIteration) {
		LibraryIteration oldLibraryIteration = libraryIteration;
		libraryIteration = newLibraryIteration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_LIBRARY_ITERATION__LIBRARY_ITERATION, oldLibraryIteration, libraryIteration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.OCL_LIBRARY_ITERATION__CLASS:
				return getClass_();
			case LibraryPackage.OCL_LIBRARY_ITERATION__LIBRARY_ITERATION:
				return getLibraryIteration();
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
			case LibraryPackage.OCL_LIBRARY_ITERATION__CLASS:
				setClass_((Class<? extends LibraryIteration>)newValue);
				return;
			case LibraryPackage.OCL_LIBRARY_ITERATION__LIBRARY_ITERATION:
				setLibraryIteration((LibraryIteration)newValue);
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
			case LibraryPackage.OCL_LIBRARY_ITERATION__CLASS:
				setClass_((Class<? extends LibraryIteration>)null);
				return;
			case LibraryPackage.OCL_LIBRARY_ITERATION__LIBRARY_ITERATION:
				setLibraryIteration(LIBRARY_ITERATION_EDEFAULT);
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
			case LibraryPackage.OCL_LIBRARY_ITERATION__CLASS:
				return class_ != null;
			case LibraryPackage.OCL_LIBRARY_ITERATION__LIBRARY_ITERATION:
				return LIBRARY_ITERATION_EDEFAULT == null ? libraryIteration != null : !LIBRARY_ITERATION_EDEFAULT.equals(libraryIteration);
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

} //OCLLibraryIterationImpl
