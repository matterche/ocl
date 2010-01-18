/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLTypeImpl.java,v 1.1.2.3 2010/01/18 08:57:53 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLOperation;
import org.eclipse.ocl.library.OCLPackage;
import org.eclipse.ocl.library.OCLParameter;
import org.eclipse.ocl.library.OCLProperty;
import org.eclipse.ocl.library.OCLType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Type</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLTypeImpl#getConforms <em>Conforms</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLTypeImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLTypeImpl#getContainer <em>Container</em>}</li>
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
			operation = new EObjectContainmentWithInverseEList<OCLOperation>(OCLOperation.class, this, LibraryPackage.OCL_TYPE__OPERATION, LibraryPackage.OCL_OPERATION__CONTAINER);
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
	public OCLPackage getContainer() {
		if (eContainerFeatureID() != LibraryPackage.OCL_TYPE__CONTAINER) return null;
		return (OCLPackage)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(OCLPackage newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, LibraryPackage.OCL_TYPE__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(OCLPackage newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != LibraryPackage.OCL_TYPE__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, LibraryPackage.OCL_PACKAGE__TYPE, OCLPackage.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_TYPE__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean conformsTo(OCLType type) {
		if (this == type)
			return true;
		if (conforms != null) {
			for (OCLType conform : conforms) {
				if (conform.conformsTo(type)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLOperation getOperation(String name, EList<OCLType> types) {
		if (operation != null) {
			int size = types.size();
			for (OCLOperation anOperation : operation) {
				if (name.equals(anOperation.getName())) {
					EList<OCLParameter> parameters = anOperation.getParameter();
					if (parameters.size() == size) {
						int i = 0;
						for (; i < size; i++) {
							OCLType parameterType = parameters.get(i).getType();
							OCLType opType = types.get(i);
							if (!opType.conformsTo(parameterType)) {
								break;
							}
						}
						if (i >= size) {
							return anOperation;
						}
					}
				}
			}
		}
		if (conforms != null) {
			for (OCLType superType : conforms) {
				OCLOperation anOperation = superType.getOperation(name, types);
				if (anOperation != null) {
					return anOperation;
				}
			}
		}
		return null;
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
			case LibraryPackage.OCL_TYPE__OPERATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperation()).basicAdd(otherEnd, msgs);
			case LibraryPackage.OCL_TYPE__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((OCLPackage)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLOperation getOperation(String name) {
		for (OCLOperation anOperation : operation) {
			if (name.equals(anOperation.getName())) {
				return anOperation;
			}
		}
		return null;
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
			case LibraryPackage.OCL_TYPE__CONTAINER:
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
			case LibraryPackage.OCL_TYPE__CONTAINER:
				return eInternalContainer().eInverseRemove(this, LibraryPackage.OCL_PACKAGE__TYPE, OCLPackage.class, msgs);
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
			case LibraryPackage.OCL_TYPE__CONFORMS:
				return getConforms();
			case LibraryPackage.OCL_TYPE__OPERATION:
				return getOperation();
			case LibraryPackage.OCL_TYPE__PROPERTY:
				return getProperty();
			case LibraryPackage.OCL_TYPE__CONTAINER:
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
			case LibraryPackage.OCL_TYPE__CONTAINER:
				setContainer((OCLPackage)newValue);
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
			case LibraryPackage.OCL_TYPE__CONTAINER:
				setContainer((OCLPackage)null);
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
			case LibraryPackage.OCL_TYPE__CONTAINER:
				return getContainer() != null;
		}
		return super.eIsSet(featureID);
	}

} //OCLTypeImpl
