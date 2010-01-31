/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLConcreteTypeImpl.java,v 1.1.2.2 2010/01/31 22:23:47 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLBoundType;
import org.eclipse.ocl.library.OCLConcreteType;
import org.eclipse.ocl.library.OCLIteration;
import org.eclipse.ocl.library.OCLNamedElement;
import org.eclipse.ocl.library.OCLOperation;
import org.eclipse.ocl.library.OCLPackage;
import org.eclipse.ocl.library.OCLParameter;
import org.eclipse.ocl.library.OCLProperty;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.OCLTypeBinding;
import org.eclipse.ocl.library.OCLTypeParameter;
import org.eclipse.ocl.library.OCLTypeParameterParent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Type</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLConcreteTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLConcreteTypeImpl#getTypeParameter <em>Type Parameter</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLConcreteTypeImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLConcreteTypeImpl#getIteration <em>Iteration</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLConcreteTypeImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLConcreteTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLConcreteTypeImpl#getBoundType <em>Bound Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OCLConcreteTypeImpl extends OCLTypeImpl implements OCLConcreteType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
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
	 * The cached value of the '{@link #getIteration() <em>Iteration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteration()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLIteration> iteration;
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
	 * The cached value of the '{@link #getBoundType() <em>Bound Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundType()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLBoundType> boundType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLConcreteTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_CONCRETE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_CONCRETE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OCLBoundType> getBoundType() {
		if (boundType == null) {
			boundType = new EObjectContainmentEList<OCLBoundType>(OCLBoundType.class, this, LibraryPackage.OCL_CONCRETE_TYPE__BOUND_TYPE);
		}
		return boundType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OCLOperation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentWithInverseEList<OCLOperation>(OCLOperation.class, this, LibraryPackage.OCL_CONCRETE_TYPE__OPERATION, LibraryPackage.OCL_OPERATION__CONTAINER);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OCLProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<OCLProperty>(OCLProperty.class, this, LibraryPackage.OCL_CONCRETE_TYPE__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OCLTypeParameter> getTypeParameter() {
		if (typeParameter == null) {
			typeParameter = new EObjectContainmentWithInverseEList<OCLTypeParameter>(OCLTypeParameter.class, this, LibraryPackage.OCL_CONCRETE_TYPE__TYPE_PARAMETER, LibraryPackage.OCL_TYPE_PARAMETER__TYPE_PARAMETER_PARENT);
		}
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLPackage getContainer() {
		if (eContainerFeatureID() != LibraryPackage.OCL_CONCRETE_TYPE__CONTAINER) return null;
		return (OCLPackage)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(OCLPackage newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, LibraryPackage.OCL_CONCRETE_TYPE__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(OCLPackage newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != LibraryPackage.OCL_CONCRETE_TYPE__CONTAINER && newContainer != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_CONCRETE_TYPE__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<OCLIteration> getIteration() {
		if (iteration == null) {
			iteration = new EObjectContainmentWithInverseEList<OCLIteration>(OCLIteration.class, this, LibraryPackage.OCL_CONCRETE_TYPE__ITERATION, LibraryPackage.OCL_ITERATION__CONTAINER);
		}
		return iteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
//	public OCLConcreteType getNormalizedType() {
//		return this;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<OCLOperation> getOperations(String name, EList<OCLType> types, OCLType contextType) {
		EList<OCLOperation> operations = null;
		if (operation != null) {
			int size = types.size();
			for (OCLOperation anOperation : operation) {
				if (name.equals(anOperation.getName())) {
					EList<OCLParameter> parameters = anOperation.getParameter();
					if (parameters.size() == size) {
						int i = 0;
						for (; i < size; i++) {
							OCLType parameterType = parameters.get(i).getResolvedType(contextType);
							OCLType opType = types.get(i);
							if (!opType.conformsTo(parameterType) && !parameterType.conformsTo(opType)) {
								break;
							}
						}
						if (i >= size) {
							operations = addOperation(operations, anOperation);
						}
					}
				}
			}
		}
		if (conforms != null) {
			for (OCLType superType : conforms) {
				EList<OCLOperation> superOperations = superType.getOperations(name, types, contextType);
				if (superOperations != null) {
					for (OCLOperation superOperation : superOperations) {
						operations = addOperation(operations, superOperation);
					}
				}
			}
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<OCLTypeBinding> getBinding() {
		return noTypeBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<OCLTypeParameter> getParameter() {
		return noTypeParameters;
	}

	private EList<OCLOperation> addOperation(EList<OCLOperation> operations, OCLOperation anOperation) {
		if (operations == null) {
			operations = new BasicEList<OCLOperation>();
			operations.add(anOperation);
		}
		else {
			if (false) { // test overload visibility
				
			}
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public OCLProperty getProperty(String name) {
		if (property != null) {
			for (OCLProperty anProperty : property) {
				if (name.equals(anProperty.getName())) {
					return anProperty;
				}
			}
		}
		if (conforms != null) {
			for (OCLType superType : conforms) {
				OCLProperty aProperty = superType.getProperty(name);
				if (aProperty != null) {
					return aProperty;
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
			case LibraryPackage.OCL_CONCRETE_TYPE__TYPE_PARAMETER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypeParameter()).basicAdd(otherEnd, msgs);
			case LibraryPackage.OCL_CONCRETE_TYPE__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((OCLPackage)otherEnd, msgs);
			case LibraryPackage.OCL_CONCRETE_TYPE__ITERATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIteration()).basicAdd(otherEnd, msgs);
			case LibraryPackage.OCL_CONCRETE_TYPE__OPERATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperation()).basicAdd(otherEnd, msgs);
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
			case LibraryPackage.OCL_CONCRETE_TYPE__TYPE_PARAMETER:
				return ((InternalEList<?>)getTypeParameter()).basicRemove(otherEnd, msgs);
			case LibraryPackage.OCL_CONCRETE_TYPE__CONTAINER:
				return basicSetContainer(null, msgs);
			case LibraryPackage.OCL_CONCRETE_TYPE__ITERATION:
				return ((InternalEList<?>)getIteration()).basicRemove(otherEnd, msgs);
			case LibraryPackage.OCL_CONCRETE_TYPE__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case LibraryPackage.OCL_CONCRETE_TYPE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case LibraryPackage.OCL_CONCRETE_TYPE__BOUND_TYPE:
				return ((InternalEList<?>)getBoundType()).basicRemove(otherEnd, msgs);
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
			case LibraryPackage.OCL_CONCRETE_TYPE__CONTAINER:
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
			case LibraryPackage.OCL_CONCRETE_TYPE__NAME:
				return getName();
			case LibraryPackage.OCL_CONCRETE_TYPE__TYPE_PARAMETER:
				return getTypeParameter();
			case LibraryPackage.OCL_CONCRETE_TYPE__CONTAINER:
				return getContainer();
			case LibraryPackage.OCL_CONCRETE_TYPE__ITERATION:
				return getIteration();
			case LibraryPackage.OCL_CONCRETE_TYPE__OPERATION:
				return getOperation();
			case LibraryPackage.OCL_CONCRETE_TYPE__PROPERTY:
				return getProperty();
			case LibraryPackage.OCL_CONCRETE_TYPE__BOUND_TYPE:
				return getBoundType();
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
			case LibraryPackage.OCL_CONCRETE_TYPE__NAME:
				setName((String)newValue);
				return;
			case LibraryPackage.OCL_CONCRETE_TYPE__TYPE_PARAMETER:
				getTypeParameter().clear();
				getTypeParameter().addAll((Collection<? extends OCLTypeParameter>)newValue);
				return;
			case LibraryPackage.OCL_CONCRETE_TYPE__CONTAINER:
				setContainer((OCLPackage)newValue);
				return;
			case LibraryPackage.OCL_CONCRETE_TYPE__ITERATION:
				getIteration().clear();
				getIteration().addAll((Collection<? extends OCLIteration>)newValue);
				return;
			case LibraryPackage.OCL_CONCRETE_TYPE__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends OCLOperation>)newValue);
				return;
			case LibraryPackage.OCL_CONCRETE_TYPE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends OCLProperty>)newValue);
				return;
			case LibraryPackage.OCL_CONCRETE_TYPE__BOUND_TYPE:
				getBoundType().clear();
				getBoundType().addAll((Collection<? extends OCLBoundType>)newValue);
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
			case LibraryPackage.OCL_CONCRETE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LibraryPackage.OCL_CONCRETE_TYPE__TYPE_PARAMETER:
				getTypeParameter().clear();
				return;
			case LibraryPackage.OCL_CONCRETE_TYPE__CONTAINER:
				setContainer((OCLPackage)null);
				return;
			case LibraryPackage.OCL_CONCRETE_TYPE__ITERATION:
				getIteration().clear();
				return;
			case LibraryPackage.OCL_CONCRETE_TYPE__OPERATION:
				getOperation().clear();
				return;
			case LibraryPackage.OCL_CONCRETE_TYPE__PROPERTY:
				getProperty().clear();
				return;
			case LibraryPackage.OCL_CONCRETE_TYPE__BOUND_TYPE:
				getBoundType().clear();
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
			case LibraryPackage.OCL_CONCRETE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LibraryPackage.OCL_CONCRETE_TYPE__TYPE_PARAMETER:
				return typeParameter != null && !typeParameter.isEmpty();
			case LibraryPackage.OCL_CONCRETE_TYPE__CONTAINER:
				return getContainer() != null;
			case LibraryPackage.OCL_CONCRETE_TYPE__ITERATION:
				return iteration != null && !iteration.isEmpty();
			case LibraryPackage.OCL_CONCRETE_TYPE__OPERATION:
				return operation != null && !operation.isEmpty();
			case LibraryPackage.OCL_CONCRETE_TYPE__PROPERTY:
				return property != null && !property.isEmpty();
			case LibraryPackage.OCL_CONCRETE_TYPE__BOUND_TYPE:
				return boundType != null && !boundType.isEmpty();
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
		if (baseClass == OCLNamedElement.class) {
			switch (derivedFeatureID) {
				case LibraryPackage.OCL_CONCRETE_TYPE__NAME: return LibraryPackage.OCL_NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == OCLTypeParameterParent.class) {
			switch (derivedFeatureID) {
				case LibraryPackage.OCL_CONCRETE_TYPE__TYPE_PARAMETER: return LibraryPackage.OCL_TYPE_PARAMETER_PARENT__TYPE_PARAMETER;
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
		if (baseClass == OCLNamedElement.class) {
			switch (baseFeatureID) {
				case LibraryPackage.OCL_NAMED_ELEMENT__NAME: return LibraryPackage.OCL_CONCRETE_TYPE__NAME;
				default: return -1;
			}
		}
		if (baseClass == OCLTypeParameterParent.class) {
			switch (baseFeatureID) {
				case LibraryPackage.OCL_TYPE_PARAMETER_PARENT__TYPE_PARAMETER: return LibraryPackage.OCL_CONCRETE_TYPE__TYPE_PARAMETER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public OCLIteration getIteration(String name) {
		for (OCLIteration anIteration : iteration) {
			if (name.equals(anIteration.getName())) {
				return anIteration;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 *
	public OCLOperation getOperation(String name) {
		for (OCLOperation anOperation : operation) {
			if (name.equals(anOperation.getName())) {
				return anOperation;
			}
		}
		return null;
	} */

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
} //OCLTypeImpl
