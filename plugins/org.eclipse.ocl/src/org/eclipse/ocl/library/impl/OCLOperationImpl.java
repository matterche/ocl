/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLOperationImpl.java,v 1.1.2.6 2010/01/24 07:41:16 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLOperation;
import org.eclipse.ocl.library.OCLParameter;
import org.eclipse.ocl.library.OCLType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Operation</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLOperationImpl#isIterator <em>Is Iterator</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLOperationImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLOperationImpl#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OCLOperationImpl extends OCLTypedElementImpl implements OCLOperation {
	/**
	 * The default value of the '{@link #isIterator() <em>Is Iterator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIterator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ITERATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIterator() <em>Is Iterator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIterator()
	 * @generated
	 * @ordered
	 */
	protected boolean isIterator = IS_ITERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLParameter> parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIterator() {
		return isIterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIterator(boolean newIsIterator) {
		boolean oldIsIterator = isIterator;
		isIterator = newIsIterator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_OPERATION__IS_ITERATOR, oldIsIterator, isIterator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OCLParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentWithInverseEList<OCLParameter>(OCLParameter.class, this, LibraryPackage.OCL_OPERATION__PARAMETER, LibraryPackage.OCL_PARAMETER__CONTAINER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLType getContainer() {
		if (eContainerFeatureID() != LibraryPackage.OCL_OPERATION__CONTAINER) return null;
		return (OCLType)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(OCLType newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, LibraryPackage.OCL_OPERATION__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(OCLType newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != LibraryPackage.OCL_OPERATION__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, LibraryPackage.OCL_TYPE__OPERATION, OCLType.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_OPERATION__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getOperationCode() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.OCL_OPERATION__PARAMETER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameter()).basicAdd(otherEnd, msgs);
			case LibraryPackage.OCL_OPERATION__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((OCLType)otherEnd, msgs);
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
			case LibraryPackage.OCL_OPERATION__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case LibraryPackage.OCL_OPERATION__CONTAINER:
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
			case LibraryPackage.OCL_OPERATION__CONTAINER:
				return eInternalContainer().eInverseRemove(this, LibraryPackage.OCL_TYPE__OPERATION, OCLType.class, msgs);
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
			case LibraryPackage.OCL_OPERATION__IS_ITERATOR:
				return isIterator();
			case LibraryPackage.OCL_OPERATION__PARAMETER:
				return getParameter();
			case LibraryPackage.OCL_OPERATION__CONTAINER:
				return getContainer();
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
			case LibraryPackage.OCL_OPERATION__IS_ITERATOR:
				setIsIterator((Boolean)newValue);
				return;
			case LibraryPackage.OCL_OPERATION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends OCLParameter>)newValue);
				return;
			case LibraryPackage.OCL_OPERATION__CONTAINER:
				setContainer((OCLType)newValue);
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
			case LibraryPackage.OCL_OPERATION__IS_ITERATOR:
				setIsIterator(IS_ITERATOR_EDEFAULT);
				return;
			case LibraryPackage.OCL_OPERATION__PARAMETER:
				getParameter().clear();
				return;
			case LibraryPackage.OCL_OPERATION__CONTAINER:
				setContainer((OCLType)null);
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
			case LibraryPackage.OCL_OPERATION__IS_ITERATOR:
				return isIterator != IS_ITERATOR_EDEFAULT;
			case LibraryPackage.OCL_OPERATION__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case LibraryPackage.OCL_OPERATION__CONTAINER:
				return getContainer() != null;
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("nls")
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();
		StringBuffer s = new StringBuffer();
		appendQualifiedName(s);
		s.append("(");
		int iMax = parameter != null ? parameter.size() : 0;
		for (int i = 0; i < iMax; i++) {
			if (i > 0) {
				s.append(",");
			}
			parameter.get(i).appendName(s);
			s.append(" : ");
			parameter.get(i).getType().appendQualifiedName(s);
		}
		s.append(") : ");
		if (type != null) {
			type.appendQualifiedName(s);
		}
		return s.toString();
	}
} //OCLOperationImpl
