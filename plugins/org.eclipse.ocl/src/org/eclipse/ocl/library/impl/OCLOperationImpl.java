/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLOperationImpl.java,v 1.1.2.7 2010/01/30 07:49:30 ewillink Exp $
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
import org.eclipse.ocl.library.OCLConcreteType;
import org.eclipse.ocl.library.OCLIterator;
import org.eclipse.ocl.library.OCLOperation;
import org.eclipse.ocl.library.OCLParameter;
import org.eclipse.ocl.library.OCLTypeParameter;
import org.eclipse.ocl.library.OCLTypeParameterParent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Operation</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLOperationImpl#getTypeParameter <em>Type Parameter</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLOperationImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLOperationImpl#isStatic <em>Is Static</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLOperationImpl#getIterator <em>Iterator</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLOperationImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OCLOperationImpl extends OCLTypedElementImpl implements OCLOperation {
	/**
	 * The cached value of the '{@link #getTypeParameter() <em>Type Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLTypeParameter> typeParameter;

	/**
	 * The default value of the '{@link #isStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isStatic = IS_STATIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIterator() <em>Iterator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterator()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLIterator> iterator;

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
	public EList<OCLIterator> getIterator() {
		if (iterator == null) {
			iterator = new EObjectContainmentWithInverseEList<OCLIterator>(OCLIterator.class, this, LibraryPackage.OCL_OPERATION__ITERATOR, LibraryPackage.OCL_ITERATOR__CONTAINER);
		}
		return iterator;
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
	public EList<OCLTypeParameter> getTypeParameter() {
		if (typeParameter == null) {
			typeParameter = new EObjectContainmentWithInverseEList<OCLTypeParameter>(OCLTypeParameter.class, this, LibraryPackage.OCL_OPERATION__TYPE_PARAMETER, LibraryPackage.OCL_TYPE_PARAMETER__TYPE_PARAMETER_PARENT);
		}
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLConcreteType getContainer() {
		if (eContainerFeatureID() != LibraryPackage.OCL_OPERATION__CONTAINER) return null;
		return (OCLConcreteType)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(OCLConcreteType newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, LibraryPackage.OCL_OPERATION__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(OCLConcreteType newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != LibraryPackage.OCL_OPERATION__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, LibraryPackage.OCL_CONCRETE_TYPE__OPERATION, OCLConcreteType.class, msgs);
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
	public boolean isStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(boolean newIsStatic) {
		boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_OPERATION__IS_STATIC, oldIsStatic, isStatic));
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
			case LibraryPackage.OCL_OPERATION__TYPE_PARAMETER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypeParameter()).basicAdd(otherEnd, msgs);
			case LibraryPackage.OCL_OPERATION__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((OCLConcreteType)otherEnd, msgs);
			case LibraryPackage.OCL_OPERATION__ITERATOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIterator()).basicAdd(otherEnd, msgs);
			case LibraryPackage.OCL_OPERATION__PARAMETER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameter()).basicAdd(otherEnd, msgs);
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
			case LibraryPackage.OCL_OPERATION__TYPE_PARAMETER:
				return ((InternalEList<?>)getTypeParameter()).basicRemove(otherEnd, msgs);
			case LibraryPackage.OCL_OPERATION__CONTAINER:
				return basicSetContainer(null, msgs);
			case LibraryPackage.OCL_OPERATION__ITERATOR:
				return ((InternalEList<?>)getIterator()).basicRemove(otherEnd, msgs);
			case LibraryPackage.OCL_OPERATION__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
				return eInternalContainer().eInverseRemove(this, LibraryPackage.OCL_CONCRETE_TYPE__OPERATION, OCLConcreteType.class, msgs);
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
			case LibraryPackage.OCL_OPERATION__TYPE_PARAMETER:
				return getTypeParameter();
			case LibraryPackage.OCL_OPERATION__CONTAINER:
				return getContainer();
			case LibraryPackage.OCL_OPERATION__IS_STATIC:
				return isStatic();
			case LibraryPackage.OCL_OPERATION__ITERATOR:
				return getIterator();
			case LibraryPackage.OCL_OPERATION__PARAMETER:
				return getParameter();
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
			case LibraryPackage.OCL_OPERATION__TYPE_PARAMETER:
				getTypeParameter().clear();
				getTypeParameter().addAll((Collection<? extends OCLTypeParameter>)newValue);
				return;
			case LibraryPackage.OCL_OPERATION__CONTAINER:
				setContainer((OCLConcreteType)newValue);
				return;
			case LibraryPackage.OCL_OPERATION__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case LibraryPackage.OCL_OPERATION__ITERATOR:
				getIterator().clear();
				getIterator().addAll((Collection<? extends OCLIterator>)newValue);
				return;
			case LibraryPackage.OCL_OPERATION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends OCLParameter>)newValue);
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
			case LibraryPackage.OCL_OPERATION__TYPE_PARAMETER:
				getTypeParameter().clear();
				return;
			case LibraryPackage.OCL_OPERATION__CONTAINER:
				setContainer((OCLConcreteType)null);
				return;
			case LibraryPackage.OCL_OPERATION__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case LibraryPackage.OCL_OPERATION__ITERATOR:
				getIterator().clear();
				return;
			case LibraryPackage.OCL_OPERATION__PARAMETER:
				getParameter().clear();
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
			case LibraryPackage.OCL_OPERATION__TYPE_PARAMETER:
				return typeParameter != null && !typeParameter.isEmpty();
			case LibraryPackage.OCL_OPERATION__CONTAINER:
				return getContainer() != null;
			case LibraryPackage.OCL_OPERATION__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case LibraryPackage.OCL_OPERATION__ITERATOR:
				return iterator != null && !iterator.isEmpty();
			case LibraryPackage.OCL_OPERATION__PARAMETER:
				return parameter != null && !parameter.isEmpty();
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
		if (baseClass == OCLTypeParameterParent.class) {
			switch (derivedFeatureID) {
				case LibraryPackage.OCL_OPERATION__TYPE_PARAMETER: return LibraryPackage.OCL_TYPE_PARAMETER_PARENT__TYPE_PARAMETER;
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
		if (baseClass == OCLTypeParameterParent.class) {
			switch (baseFeatureID) {
				case LibraryPackage.OCL_TYPE_PARAMETER_PARENT__TYPE_PARAMETER: return LibraryPackage.OCL_OPERATION__TYPE_PARAMETER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	@Override
	@SuppressWarnings("nls")
	public void appendTypeSignature(StringBuffer s) {
		appendTypeParameterSignature(s, getTypeParameter());
		s.append("(");
		int iMax = iterator != null ? iterator.size() : 0;
		for (int i = 0; i < iMax; i++) {
			if (i > 0) {
				s.append(", ");
			}
			OCLIterator oclIterator = iterator.get(i);
			oclIterator.appendName(s);
			s.append(" : ");
			appendSignature(s, oclIterator.getType());
		}
		if (iMax > 0) {
			s.append(" | ");
		}
		int pMax = parameter != null ? parameter.size() : 0;
		for (int p = 0; p < pMax; p++) {
			if (p > 0) {
				s.append(", ");
			}
			OCLParameter oclParameter = parameter.get(p);
			oclParameter.appendName(s);
			s.append(" : ");
			appendSignature(s, oclParameter.getType());
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
	public boolean isTypeParameter(OCLTypeParameter aTypeParameter) {
		if ((typeParameter != null) && typeParameter.contains(aTypeParameter)) {
			return true;
		}
		return super.isTypeParameter(aTypeParameter);
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
} //OCLOperationImpl
