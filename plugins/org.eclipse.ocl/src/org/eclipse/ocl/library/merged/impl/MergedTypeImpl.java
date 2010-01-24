/**
 * <copyright>
 * </copyright>
 *
 * $Id: MergedTypeImpl.java,v 1.1.2.3 2010/01/24 14:02:18 ewillink Exp $
 */
package org.eclipse.ocl.library.merged.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.library.OCLLibraryOperation;
import org.eclipse.ocl.library.OCLLibraryProperty;
import org.eclipse.ocl.library.OCLMetaModelOperation;
import org.eclipse.ocl.library.OCLMetaModelProperty;
import org.eclipse.ocl.library.OCLOperation;
import org.eclipse.ocl.library.OCLParameter;
import org.eclipse.ocl.library.OCLProperty;
import org.eclipse.ocl.library.OCLTemplateParameterType;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.impl.OCLElementImpl;
import org.eclipse.ocl.library.merged.MergedLibrary;
import org.eclipse.ocl.library.merged.MergedLibraryOperation;
import org.eclipse.ocl.library.merged.MergedMetaModelOperation;
import org.eclipse.ocl.library.merged.MergedMetaModelProperty;
import org.eclipse.ocl.library.merged.MergedOperation;
import org.eclipse.ocl.library.merged.MergedProperty;
import org.eclipse.ocl.library.merged.MergedLibraryProperty;
import org.eclipse.ocl.library.merged.MergedType;
import org.eclipse.ocl.library.merged.OCLMergedLibraryFactory;
import org.eclipse.ocl.library.merged.OCLMergedLibraryPackage;
import org.eclipse.ocl.utilities.ExpressionInOCL;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Merged Type</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedTypeImpl#getMergedLibrary <em>Merged Library</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedTypeImpl#getConforms <em>Conforms</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedTypeImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedTypeImpl#getInv <em>Inv</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MergedTypeImpl extends OCLElementImpl implements MergedType {
	/**
	 * The cached value of the '{@link #getMergedLibrary() <em>Merged Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergedLibrary()
	 * @generated
	 * @ordered
	 */
	protected MergedLibrary mergedLibrary;

	/**
	 * This is true if the Merged Library reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mergedLibraryESet;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected OCLType type;

	/**
	 * This is true if the Type reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

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
	protected EList<MergedOperation> operation;

	/**
	 * MergedOperation indexed by name.
	 * @generated NOT
	 */
	protected Map<String, List<MergedOperation>> operationsMap;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<MergedProperty> property;

	/**
	 * MergedProperty indexed by name.
	 * @generated NOT
	 */
	protected Map<String, MergedProperty> propertyMap;

	/**
	 * The cached value of the '{@link #getInv() <em>Inv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInv()
	 * @generated
	 * @ordered
	 */
	protected ExpressionInOCL<?, ?> inv;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCLMergedLibraryPackage.Literals.MERGED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergedLibrary getMergedLibrary() {
		if (mergedLibrary != null && mergedLibrary.eIsProxy()) {
			InternalEObject oldMergedLibrary = (InternalEObject)mergedLibrary;
			mergedLibrary = (MergedLibrary)eResolveProxy(oldMergedLibrary);
			if (mergedLibrary != oldMergedLibrary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCLMergedLibraryPackage.MERGED_TYPE__MERGED_LIBRARY, oldMergedLibrary, mergedLibrary));
			}
		}
		return mergedLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergedLibrary basicGetMergedLibrary() {
		return mergedLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMergedLibrary(MergedLibrary newMergedLibrary) {
		MergedLibrary oldMergedLibrary = mergedLibrary;
		mergedLibrary = newMergedLibrary;
		boolean oldMergedLibraryESet = mergedLibraryESet;
		mergedLibraryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLMergedLibraryPackage.MERGED_TYPE__MERGED_LIBRARY, oldMergedLibrary, mergedLibrary, !oldMergedLibraryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMergedLibrary() {
		MergedLibrary oldMergedLibrary = mergedLibrary;
		boolean oldMergedLibraryESet = mergedLibraryESet;
		mergedLibrary = null;
		mergedLibraryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OCLMergedLibraryPackage.MERGED_TYPE__MERGED_LIBRARY, oldMergedLibrary, null, oldMergedLibraryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMergedLibrary() {
		return mergedLibraryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OCLType> getConforms() {
		if (conforms == null) {
			conforms = new EObjectResolvingEList<OCLType>(OCLType.class, this, OCLMergedLibraryPackage.MERGED_TYPE__CONFORMS);
		}
		return conforms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MergedOperation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<MergedOperation>(MergedOperation.class, this, OCLMergedLibraryPackage.MERGED_TYPE__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MergedProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<MergedProperty>(MergedProperty.class, this, OCLMergedLibraryPackage.MERGED_TYPE__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionInOCL<?, ?> getInv() {
		if (inv != null && inv.eIsProxy()) {
			InternalEObject oldInv = (InternalEObject)inv;
			inv = (ExpressionInOCL<?, ?>)eResolveProxy(oldInv);
			if (inv != oldInv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCLMergedLibraryPackage.MERGED_TYPE__INV, oldInv, inv));
			}
		}
		return inv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionInOCL<?, ?> basicGetInv() {
		return inv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInv(ExpressionInOCL<?, ?> newInv) {
		ExpressionInOCL<?, ?> oldInv = inv;
		inv = newInv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLMergedLibraryPackage.MERGED_TYPE__INV, oldInv, inv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCLMergedLibraryPackage.MERGED_TYPE__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case OCLMergedLibraryPackage.MERGED_TYPE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (OCLType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCLMergedLibraryPackage.MERGED_TYPE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(OCLType newType) {
		OCLType oldType = type;
		type = newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLMergedLibraryPackage.MERGED_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		OCLType oldType = type;
		boolean oldTypeESet = typeESet;
		type = null;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OCLMergedLibraryPackage.MERGED_TYPE__TYPE, oldType, null, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCLMergedLibraryPackage.MERGED_TYPE__MERGED_LIBRARY:
				if (resolve) return getMergedLibrary();
				return basicGetMergedLibrary();
			case OCLMergedLibraryPackage.MERGED_TYPE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case OCLMergedLibraryPackage.MERGED_TYPE__CONFORMS:
				return getConforms();
			case OCLMergedLibraryPackage.MERGED_TYPE__OPERATION:
				return getOperation();
			case OCLMergedLibraryPackage.MERGED_TYPE__PROPERTY:
				return getProperty();
			case OCLMergedLibraryPackage.MERGED_TYPE__INV:
				if (resolve) return getInv();
				return basicGetInv();
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
			case OCLMergedLibraryPackage.MERGED_TYPE__MERGED_LIBRARY:
				setMergedLibrary((MergedLibrary)newValue);
				return;
			case OCLMergedLibraryPackage.MERGED_TYPE__TYPE:
				setType((OCLType)newValue);
				return;
			case OCLMergedLibraryPackage.MERGED_TYPE__CONFORMS:
				getConforms().clear();
				getConforms().addAll((Collection<? extends OCLType>)newValue);
				return;
			case OCLMergedLibraryPackage.MERGED_TYPE__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends MergedOperation>)newValue);
				return;
			case OCLMergedLibraryPackage.MERGED_TYPE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends MergedProperty>)newValue);
				return;
			case OCLMergedLibraryPackage.MERGED_TYPE__INV:
				setInv((ExpressionInOCL<?, ?>)newValue);
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
			case OCLMergedLibraryPackage.MERGED_TYPE__MERGED_LIBRARY:
				unsetMergedLibrary();
				return;
			case OCLMergedLibraryPackage.MERGED_TYPE__TYPE:
				unsetType();
				return;
			case OCLMergedLibraryPackage.MERGED_TYPE__CONFORMS:
				getConforms().clear();
				return;
			case OCLMergedLibraryPackage.MERGED_TYPE__OPERATION:
				getOperation().clear();
				return;
			case OCLMergedLibraryPackage.MERGED_TYPE__PROPERTY:
				getProperty().clear();
				return;
			case OCLMergedLibraryPackage.MERGED_TYPE__INV:
				setInv((ExpressionInOCL<?, ?>)null);
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
			case OCLMergedLibraryPackage.MERGED_TYPE__MERGED_LIBRARY:
				return isSetMergedLibrary();
			case OCLMergedLibraryPackage.MERGED_TYPE__TYPE:
				return isSetType();
			case OCLMergedLibraryPackage.MERGED_TYPE__CONFORMS:
				return conforms != null && !conforms.isEmpty();
			case OCLMergedLibraryPackage.MERGED_TYPE__OPERATION:
				return operation != null && !operation.isEmpty();
			case OCLMergedLibraryPackage.MERGED_TYPE__PROPERTY:
				return property != null && !property.isEmpty();
			case OCLMergedLibraryPackage.MERGED_TYPE__INV:
				return inv != null;
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
		s.append("<merged> ");
		s.append(type);
		return s.toString();
	}

	@Override
	public String getName() {
		return type != null ? type.getName() : null;
	}

	public void addOperation(MergedOperation mergedOperation) {
		getOperation().add(mergedOperation);
		if (operationsMap == null) {
			loadOperations();
		}
		String name = mergedOperation.getName();
		List<MergedOperation> operations = operationsMap.get(name);
		if (operations == null) {
			operations = new ArrayList<MergedOperation>();
			operationsMap.put(name, operations);
		}
		operations.add(mergedOperation);
	}

	public void addProperty(MergedProperty mergedProperty) {
		getProperty().add(mergedProperty);
		if (propertyMap == null) {
			loadProperties();
		}
		String name = mergedProperty.getName();
		propertyMap.put(name, mergedProperty);
	}
	
	public Set<MergedOperation> getConformingOperations(String name, OCLType[] oclArguments) {
		if (operationsMap == null) {
			loadOperations();
		}
		Set<MergedOperation> conformingOperations = null;
		List<MergedOperation> mergedOperations = operationsMap.get(name);
		if (mergedOperations != null) {
			int iMax = oclArguments != null ? oclArguments.length : 0;
			for (MergedOperation mergedOperation : mergedOperations) {
				List<OCLParameter> mergedParameters = mergedOperation.getParameter();
				if (mergedParameters.size() == iMax) {
					Map<OCLTemplateParameterType, OCLType> parameterBindings = null;
					boolean allOpsOk = true;
					for (int i = 0; i < iMax; i++) {
						OCLParameter mergedParameter = mergedParameters.get(i);
						OCLType parameterType = mergedParameter.getType();
						OCLType argumentType = oclArguments[i];
						if (!argumentType.conformsTo(parameterType)) {
							if (!(parameterType instanceof OCLTemplateParameterType)) {
								allOpsOk = false;
								break;
							}
							EList<OCLTemplateParameterType> templateParameters = type.getTemplateParameter();
							if (templateParameters.isEmpty()) {
								allOpsOk = false;
								break;
							}
							if (parameterBindings == null) {
								parameterBindings = new HashMap<OCLTemplateParameterType, OCLType>();
								for (OCLTemplateParameterType templateParameterType : templateParameters) {
									OCLType boundType = type.getTemplateBinding(templateParameterType);
									if (boundType != null) {
										parameterBindings.put(templateParameterType, boundType);
									}
								}
							}
							OCLType binding = parameterBindings.get(parameterType);
							if (binding == null) {
								parameterBindings.put((OCLTemplateParameterType) parameterType, argumentType);
							}
							else if (!argumentType.conformsTo(binding)) {
								allOpsOk = false;
								break;									
							}
						}
					}
					if (allOpsOk) {
						if (conformingOperations == null) {
							conformingOperations = new HashSet<MergedOperation>();
						}
						conformingOperations.add(mergedOperation);
					}
				}
			}
			if (conformingOperations != null) {
				return conformingOperations;
			}
		}
		for (OCLType superType : getConforms()) {
			MergedType superMergedType = mergedLibrary.getMergedType(superType);
			conformingOperations = superMergedType.getConformingOperations(name, oclArguments);
			if (conformingOperations != null) {
				return conformingOperations;
			}
		}
		return null;
	}
	
	public MergedProperty getConformingProperty(String name) {
		if (propertyMap == null) {
			loadProperties();
		}
		MergedProperty mergedProperty = propertyMap.get(name);
		if (mergedProperty != null) {
			return mergedProperty;
		}
		for (OCLType superType : getConforms()) {
			MergedType superMergedType = mergedLibrary.getMergedType(superType);
			mergedProperty = superMergedType.getConformingProperty(name);
			if (mergedProperty != null) {
				return mergedProperty;
			}
		}
		return null;
	}
	
	public MergedOperation getExactOperation(String name, OCLType[] oclArguments) {
		if (operationsMap == null) {
			loadOperations();
		}
		List<MergedOperation> mergedOperations = operationsMap.get(name);
		if (mergedOperations != null) {
			int iMax = oclArguments != null ? oclArguments.length : 0;
			for (MergedOperation mergedOperation : mergedOperations) {
				List<OCLParameter> mergedParameters = mergedOperation.getParameter();
				if (mergedParameters.size() == iMax) {
					boolean allOpsOk = true;
					for (int i = 0; i < iMax; i++) {
						OCLParameter mergedParameter = mergedParameters.get(i);
						OCLType parameterType = mergedParameter.getType();
						OCLType argumentType = oclArguments[i];
						if (argumentType != parameterType) {
							allOpsOk = false;
							break;
						}
					}
					if (allOpsOk) {
						return mergedOperation;
					}
				}
			}
		}
		return null;
	}
	
	public MergedProperty getLocalProperty(String name) {
		if (propertyMap == null) {
			loadProperties();
		}
		MergedProperty property = propertyMap.get(name);
		return property;
	}

	private void loadOperations() {
		operationsMap = new HashMap<String, List<MergedOperation>>();
		for (OCLOperation operation : getType().getOperation()) {
			if (operation instanceof OCLLibraryOperation) {
				MergedLibraryOperation mergedOperation = OCLMergedLibraryFactory.eINSTANCE.createMergedLibraryOperation();
				mergedOperation.setOperation((OCLLibraryOperation) operation);
				addOperation(mergedOperation);
			}
			else if (operation instanceof OCLMetaModelOperation) {
				MergedMetaModelOperation mergedOperation = OCLMergedLibraryFactory.eINSTANCE.createMergedMetaModelOperation();
				mergedOperation.setOperation((OCLMetaModelOperation) operation);
				addOperation(mergedOperation);
			}
		}
	}

	private void loadProperties() {
		propertyMap = new HashMap<String, MergedProperty>();
		for (OCLProperty property : getType().getProperty()) {
			if (property instanceof OCLLibraryProperty) {
				MergedLibraryProperty mergedProperty = OCLMergedLibraryFactory.eINSTANCE.createMergedLibraryProperty();
				mergedProperty.setProperty((OCLLibraryProperty) property);
				addProperty(mergedProperty);
			}
			else if (property instanceof OCLMetaModelProperty) {
				MergedMetaModelProperty mergedProperty = OCLMergedLibraryFactory.eINSTANCE.createMergedMetaModelProperty();
				mergedProperty.setProperty((OCLMetaModelProperty) property);
				addProperty(mergedProperty);
			}
		}
	}
} //OCLMergedTypeImpl
