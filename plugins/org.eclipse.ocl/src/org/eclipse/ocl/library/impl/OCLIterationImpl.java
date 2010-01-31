/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLIterationImpl.java,v 1.1.2.1 2010/01/31 22:23:47 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLConcreteType;
import org.eclipse.ocl.library.OCLIteration;
import org.eclipse.ocl.library.OCLTypeParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Iteration</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLIterationImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLIterationImpl#getIterators <em>Iterators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OCLIterationImpl extends OCLTypedElementImpl implements OCLIteration {
	/**
	 * The default value of the '{@link #getIterators() <em>Iterators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterators()
	 * @generated
	 * @ordered
	 */
	protected static final int ITERATORS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getIterators() <em>Iterators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterators()
	 * @generated
	 * @ordered
	 */
	protected int iterators = ITERATORS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLIterationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_ITERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLConcreteType getContainer() {
		if (eContainerFeatureID() != LibraryPackage.OCL_ITERATION__CONTAINER) return null;
		return (OCLConcreteType)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(OCLConcreteType newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, LibraryPackage.OCL_ITERATION__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(OCLConcreteType newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != LibraryPackage.OCL_ITERATION__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, LibraryPackage.OCL_CONCRETE_TYPE__ITERATION, OCLConcreteType.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_ITERATION__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIterators() {
		return iterators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterators(int newIterators) {
		int oldIterators = iterators;
		iterators = newIterators;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_ITERATION__ITERATORS, oldIterators, iterators));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.OCL_ITERATION__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((OCLConcreteType)otherEnd, msgs);
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
			case LibraryPackage.OCL_ITERATION__CONTAINER:
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
			case LibraryPackage.OCL_ITERATION__CONTAINER:
				return eInternalContainer().eInverseRemove(this, LibraryPackage.OCL_CONCRETE_TYPE__ITERATION, OCLConcreteType.class, msgs);
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
			case LibraryPackage.OCL_ITERATION__CONTAINER:
				return getContainer();
			case LibraryPackage.OCL_ITERATION__ITERATORS:
				return getIterators();
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
			case LibraryPackage.OCL_ITERATION__CONTAINER:
				setContainer((OCLConcreteType)newValue);
				return;
			case LibraryPackage.OCL_ITERATION__ITERATORS:
				setIterators((Integer)newValue);
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
			case LibraryPackage.OCL_ITERATION__CONTAINER:
				setContainer((OCLConcreteType)null);
				return;
			case LibraryPackage.OCL_ITERATION__ITERATORS:
				setIterators(ITERATORS_EDEFAULT);
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
			case LibraryPackage.OCL_ITERATION__CONTAINER:
				return getContainer() != null;
			case LibraryPackage.OCL_ITERATION__ITERATORS:
				return iterators != ITERATORS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	@Override
	@SuppressWarnings("nls")
	public void appendTypeSignature(StringBuffer s) {
		OCLConcreteType type = getContainer();
		List<OCLTypeParameter> typeParameters = type.getTypeParameter();
		OCLTypeParameter typeParameter = typeParameters.isEmpty() ? null : typeParameters.get(0);
		String iteratorTypeName = typeParameter != null ? typeParameter.getName() : null;
		if (iteratorTypeName == null) {
			iteratorTypeName = "?";
		}
		s.append("(");
		for (int i = 0; i < iterators; i++) {
			if (i > 0) {
				s.append(", ");
			}
			s.append(iteratorTypeName);
			s.append(" : i");
			s.append(i+1);
		}
		s.append(")");
		super.appendTypeSignature(s);
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
} //OCLIterationImpl
