/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLTypeImpl.java,v 1.1.2.1 2009/12/13 18:44:27 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLOperation;
import org.eclipse.ocl.library.OCLProperty;
import org.eclipse.ocl.library.OCLType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLTypeImpl#getConforms <em>Conforms</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLTypeImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLTypeImpl#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OCLTypeImpl extends OCLElementImpl implements OCLType {
	/**
	 * The cached value of the '{@link #getConforms() <em>Conforms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConforms()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLType> conforms;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLOperation> operation;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLProperty> property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OCLType> getConforms() {
		if (conforms == null) {
			conforms = new EObjectResolvingEList<OCLType>(OCLType.class, this, LibraryPackage.OCL_TYPE__CONFORMS);
		}
		return conforms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OCLOperation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<OCLOperation>(OCLOperation.class, this, LibraryPackage.OCL_TYPE__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OCLProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<OCLProperty>(OCLProperty.class, this, LibraryPackage.OCL_TYPE__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean conformsTo(OCLType type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.OCL_TYPE__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case LibraryPackage.OCL_TYPE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.OCL_TYPE__CONFORMS:
				return getConforms();
			case LibraryPackage.OCL_TYPE__OPERATION:
				return getOperation();
			case LibraryPackage.OCL_TYPE__PROPERTY:
				return getProperty();
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
			case LibraryPackage.OCL_TYPE__CONFORMS:
				getConforms().clear();
				getConforms().addAll((Collection<? extends OCLType>)newValue);
				return;
			case LibraryPackage.OCL_TYPE__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends OCLOperation>)newValue);
				return;
			case LibraryPackage.OCL_TYPE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends OCLProperty>)newValue);
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
			case LibraryPackage.OCL_TYPE__CONFORMS:
				getConforms().clear();
				return;
			case LibraryPackage.OCL_TYPE__OPERATION:
				getOperation().clear();
				return;
			case LibraryPackage.OCL_TYPE__PROPERTY:
				getProperty().clear();
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
			case LibraryPackage.OCL_TYPE__CONFORMS:
				return conforms != null && !conforms.isEmpty();
			case LibraryPackage.OCL_TYPE__OPERATION:
				return operation != null && !operation.isEmpty();
			case LibraryPackage.OCL_TYPE__PROPERTY:
				return property != null && !property.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OCLTypeImpl
