/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: CompleteClassImpl.java,v 1.1.2.4 2010/12/13 08:14:55 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.Comment;
import org.eclipse.ocl.examples.pivot.CompleteClass;
import org.eclipse.ocl.examples.pivot.CompleteEnvironment;
import org.eclipse.ocl.examples.pivot.CompleteOperation;
import org.eclipse.ocl.examples.pivot.CompleteProperty;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.TemplateBinding;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complete Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.CompleteClassImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.CompleteClassImpl#getCompleteEnvironment <em>Complete Environment</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.CompleteClassImpl#getCompleteOperations <em>Complete Operation</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.CompleteClassImpl#getCompleteProperties <em>Complete Property</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.CompleteClassImpl#getCompleteSuperClasses <em>Complete Super Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompleteClassImpl
		extends ClassImpl
		implements CompleteClass {

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.ocl.examples.pivot.Class model;

	/**
	 * The cached value of the '{@link #getCompleteEnvironment() <em>Complete Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteEnvironment()
	 * @generated
	 * @ordered
	 */
	protected CompleteEnvironment completeEnvironment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompleteClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotPackage.Literals.COMPLETE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.examples.pivot.Class getModel() {
		if (model != null && ((EObject)model).eIsProxy())
		{
			InternalEObject oldModel = (InternalEObject)model;
			model = (org.eclipse.ocl.examples.pivot.Class)eResolveProxy(oldModel);
			if (model != oldModel)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotPackage.COMPLETE_CLASS__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.examples.pivot.Class basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(org.eclipse.ocl.examples.pivot.Class newModel) {
		org.eclipse.ocl.examples.pivot.Class oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.COMPLETE_CLASS__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteEnvironment getCompleteEnvironment() {
		if (completeEnvironment != null && ((EObject)completeEnvironment).eIsProxy())
		{
			InternalEObject oldCompleteEnvironment = (InternalEObject)completeEnvironment;
			completeEnvironment = (CompleteEnvironment)eResolveProxy(oldCompleteEnvironment);
			if (completeEnvironment != oldCompleteEnvironment)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotPackage.COMPLETE_CLASS__COMPLETE_ENVIRONMENT, oldCompleteEnvironment, completeEnvironment));
			}
		}
		return completeEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteEnvironment basicGetCompleteEnvironment() {
		return completeEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompleteEnvironment(
			CompleteEnvironment newCompleteEnvironment) {
		CompleteEnvironment oldCompleteEnvironment = completeEnvironment;
		completeEnvironment = newCompleteEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.COMPLETE_CLASS__COMPLETE_ENVIRONMENT, oldCompleteEnvironment, completeEnvironment));
	}

	private EList<CompleteClass> completeSuperClasses = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<CompleteClass> getCompleteSuperClasses() {
		if (completeSuperClasses == null) {
			completeSuperClasses = new BasicEList<CompleteClass>();
			for (org.eclipse.ocl.examples.pivot.Class superClass : getSuperClasses()) {
				completeSuperClasses.add(completeEnvironment.getCompleteClass(superClass));
			}
			org.eclipse.ocl.examples.pivot.Class thisModel = model;
			if (thisModel.getTemplateBindings().size() > 0) {
				thisModel = (org.eclipse.ocl.examples.pivot.Class)thisModel.getTemplateBindings().get(0).getSignature().getTemplate();
			}
			for (org.eclipse.ocl.examples.pivot.Class superClass : thisModel.getSuperClasses()) {
				completeSuperClasses.add(completeEnvironment.getCompleteClass(superClass));
			}
		}
		return completeSuperClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean conformsTo(CompleteClass aClass) {
		if (this == aClass) {
			return true;
		}
		for (CompleteClass aSuperClass : getCompleteSuperClasses()) {
			if (aSuperClass.conformsTo(aClass)) {
				return true;
			}
		}
		return false;
	}

	private Map<CompleteOperation, CompleteOperation> dynamicOperationMap = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CompleteOperation getDynamicOperation(CompleteOperation staticOperation) {
		if (dynamicOperationMap == null) {
			dynamicOperationMap = new HashMap<CompleteOperation, CompleteOperation>();
		}
		CompleteOperation dynamicOperation = dynamicOperationMap.get(staticOperation);
		if ((dynamicOperation == null)
			&& !dynamicOperationMap.containsKey(staticOperation)) {
			List<CompleteClass> staticClasses = new ArrayList<CompleteClass>();
			for (Parameter staticParameter : staticOperation.getCompleteParameters()) {
				Type staticType = staticParameter.getType();
				CompleteClass staticClass = completeEnvironment
					.getCompleteClass((org.eclipse.ocl.examples.pivot.Class) staticType);
				staticClasses.add(staticClass);
			}
			Set<CompleteOperation> dynamicOperations = findOperationsOrNull(
				this, staticOperation.getName(), staticClasses);
			if ((dynamicOperations != null) && (dynamicOperations.size() == 1)) {
				dynamicOperation = dynamicOperations.iterator().next();
			}
			dynamicOperationMap.put(staticOperation, dynamicOperation);
		}
		return dynamicOperation;
	}

	private Set<CompleteOperation> findOperationsOrNull(CompleteClass completeClass,
			String staticName, List<CompleteClass> staticClasses) {
		int staticSize = staticClasses.size();
		Set<CompleteOperation> list = null;
		for (CompleteOperation dynamicOperation : completeClass.getCompleteOperations(staticName)) {
			List<Parameter> dynamicParameters = dynamicOperation.getCompleteParameters();
			if (staticSize == dynamicParameters.size()) {
				boolean gotIt = true;
				for (int i = 0; i < staticSize; i++) {
					CompleteClass staticClass = staticClasses.get(i);
					Parameter dynamicParameter = dynamicParameters.get(i);
					Type dynamicType = dynamicParameter.getType();
					CompleteClass dynamicClass = completeEnvironment
						.getCompleteClass((org.eclipse.ocl.examples.pivot.Class) dynamicType);
					if (!dynamicClass.conformsTo(staticClass)) {
						gotIt = false;
					}
				}
				if (gotIt) {
					if (list == null) {
						list = new HashSet<CompleteOperation>();
					}
					list.add(dynamicOperation);
				}
			}
		}
		if (list == null) {
			for (CompleteClass completeSuperClass : completeClass.getCompleteSuperClasses()) {
				Set<CompleteOperation> superOperations = findOperationsOrNull(
					completeSuperClass, staticName, staticClasses);
				if (superOperations != null) {
					if (list == null) {
						list = superOperations;
					} else {
						list.addAll(superOperations);
					}
				}
			}
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<CompleteOperation> getCompleteOperations(String name) {
		EList<CompleteOperation> completeOperations = new BasicEList<CompleteOperation>();
		for (Operation operation : getOwnedOperations()) {
			if (name.equals(operation.getName())) {
				completeOperations.add(completeEnvironment
					.getCompleteOperation(operation));
			}
		}
		org.eclipse.ocl.examples.pivot.Class thisModel = model;
		if (thisModel.getTemplateBindings().size() > 0) {
			thisModel = (org.eclipse.ocl.examples.pivot.Class)thisModel.getTemplateBindings().get(0).getSignature().getTemplate();
		}
		for (Operation operation : thisModel.getOwnedOperations()) {
			if (name.equals(operation.getName())) {
				CompleteOperation completeOperation = completeEnvironment
					.getCompleteOperation(operation);
				if (!completeOperations.contains(completeOperation)) {
					completeOperations.add(completeOperation);
				}
			}
		}
		return completeOperations;
	}

	private EList<CompleteProperty> completeProperties = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<CompleteProperty> getCompleteProperties() {
		if (completeProperties == null) {
			completeProperties = new BasicEList<CompleteProperty>();
			for (Property property : getOwnedAttributes()) {
				completeProperties.add(completeEnvironment
					.getCompleteProperty(property));
			}
			for (Property property : model.getOwnedAttributes()) {
				completeProperties.add(completeEnvironment
					.getCompleteProperty(property));
			}
		}
		return completeProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID)
		{
			case PivotPackage.COMPLETE_CLASS__OWNED_COMMENT:
				return getOwnedComments();
			case PivotPackage.COMPLETE_CLASS__MONIKER:
				return getMoniker();
			case PivotPackage.COMPLETE_CLASS__NAME:
				return getName();
			case PivotPackage.COMPLETE_CLASS__OWNED_RULE:
				return getOwnedRules();
			case PivotPackage.COMPLETE_CLASS__IS_STATIC:
				return isStatic();
			case PivotPackage.COMPLETE_CLASS__OWNED_ANNOTATION:
				return getOwnedAnnotations();
			case PivotPackage.COMPLETE_CLASS__OWNING_TEMPLATE_PARAMETER:
				if (resolve) return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case PivotPackage.COMPLETE_CLASS__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case PivotPackage.COMPLETE_CLASS__TEMPLATE_BINDING:
				return getTemplateBindings();
			case PivotPackage.COMPLETE_CLASS__OWNED_TEMPLATE_SIGNATURE:
				if (resolve) return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case PivotPackage.COMPLETE_CLASS__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case PivotPackage.COMPLETE_CLASS__IS_ABSTRACT:
				return isAbstract();
			case PivotPackage.COMPLETE_CLASS__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case PivotPackage.COMPLETE_CLASS__OWNED_OPERATION:
				return getOwnedOperations();
			case PivotPackage.COMPLETE_CLASS__SUPER_CLASS:
				return getSuperClasses();
			case PivotPackage.COMPLETE_CLASS__INSTANCE_CLASS_NAME:
				return getInstanceClassName();
			case PivotPackage.COMPLETE_CLASS__PRIMITIVE:
				return isPrimitive();
			case PivotPackage.COMPLETE_CLASS__SUB_CLASS:
				return getSubClasses();
			case PivotPackage.COMPLETE_CLASS__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case PivotPackage.COMPLETE_CLASS__COMPLETE_ENVIRONMENT:
				if (resolve) return getCompleteEnvironment();
				return basicGetCompleteEnvironment();
			case PivotPackage.COMPLETE_CLASS__COMPLETE_OPERATION:
				return getCompleteOperations();
			case PivotPackage.COMPLETE_CLASS__COMPLETE_PROPERTY:
				return getCompleteProperties();
			case PivotPackage.COMPLETE_CLASS__COMPLETE_SUPER_CLASS:
				return getCompleteSuperClasses();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID)
		{
			case PivotPackage.COMPLETE_CLASS__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.COMPLETE_CLASS__MONIKER:
				setMoniker((String)newValue);
				return;
			case PivotPackage.COMPLETE_CLASS__NAME:
				setName((String)newValue);
				return;
			case PivotPackage.COMPLETE_CLASS__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection<? extends Constraint>)newValue);
				return;
			case PivotPackage.COMPLETE_CLASS__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case PivotPackage.COMPLETE_CLASS__OWNED_ANNOTATION:
				getOwnedAnnotations().clear();
				getOwnedAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case PivotPackage.COMPLETE_CLASS__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)newValue);
				return;
			case PivotPackage.COMPLETE_CLASS__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case PivotPackage.COMPLETE_CLASS__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection<? extends TemplateBinding>)newValue);
				return;
			case PivotPackage.COMPLETE_CLASS__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case PivotPackage.COMPLETE_CLASS__PACKAGE:
				setPackage((org.eclipse.ocl.examples.pivot.Package)newValue);
				return;
			case PivotPackage.COMPLETE_CLASS__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case PivotPackage.COMPLETE_CLASS__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection<? extends Property>)newValue);
				return;
			case PivotPackage.COMPLETE_CLASS__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case PivotPackage.COMPLETE_CLASS__SUPER_CLASS:
				getSuperClasses().clear();
				getSuperClasses().addAll((Collection<? extends org.eclipse.ocl.examples.pivot.Class>)newValue);
				return;
			case PivotPackage.COMPLETE_CLASS__INSTANCE_CLASS_NAME:
				setInstanceClassName((String)newValue);
				return;
			case PivotPackage.COMPLETE_CLASS__PRIMITIVE:
				setPrimitive((Boolean)newValue);
				return;
			case PivotPackage.COMPLETE_CLASS__SUB_CLASS:
				getSubClasses().clear();
				getSubClasses().addAll((Collection<? extends org.eclipse.ocl.examples.pivot.Class>)newValue);
				return;
			case PivotPackage.COMPLETE_CLASS__MODEL:
				setModel((org.eclipse.ocl.examples.pivot.Class)newValue);
				return;
			case PivotPackage.COMPLETE_CLASS__COMPLETE_ENVIRONMENT:
				setCompleteEnvironment((CompleteEnvironment)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID)
		{
			case PivotPackage.COMPLETE_CLASS__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case PivotPackage.COMPLETE_CLASS__MONIKER:
				setMoniker(MONIKER_EDEFAULT);
				return;
			case PivotPackage.COMPLETE_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotPackage.COMPLETE_CLASS__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case PivotPackage.COMPLETE_CLASS__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case PivotPackage.COMPLETE_CLASS__OWNED_ANNOTATION:
				getOwnedAnnotations().clear();
				return;
			case PivotPackage.COMPLETE_CLASS__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)null);
				return;
			case PivotPackage.COMPLETE_CLASS__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case PivotPackage.COMPLETE_CLASS__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case PivotPackage.COMPLETE_CLASS__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case PivotPackage.COMPLETE_CLASS__PACKAGE:
				setPackage((org.eclipse.ocl.examples.pivot.Package)null);
				return;
			case PivotPackage.COMPLETE_CLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case PivotPackage.COMPLETE_CLASS__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case PivotPackage.COMPLETE_CLASS__OWNED_OPERATION:
				getOwnedOperations().clear();
				return;
			case PivotPackage.COMPLETE_CLASS__SUPER_CLASS:
				getSuperClasses().clear();
				return;
			case PivotPackage.COMPLETE_CLASS__INSTANCE_CLASS_NAME:
				setInstanceClassName(INSTANCE_CLASS_NAME_EDEFAULT);
				return;
			case PivotPackage.COMPLETE_CLASS__PRIMITIVE:
				setPrimitive(PRIMITIVE_EDEFAULT);
				return;
			case PivotPackage.COMPLETE_CLASS__SUB_CLASS:
				getSubClasses().clear();
				return;
			case PivotPackage.COMPLETE_CLASS__MODEL:
				setModel((org.eclipse.ocl.examples.pivot.Class)null);
				return;
			case PivotPackage.COMPLETE_CLASS__COMPLETE_ENVIRONMENT:
				setCompleteEnvironment((CompleteEnvironment)null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID)
		{
			case PivotPackage.COMPLETE_CLASS__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case PivotPackage.COMPLETE_CLASS__MONIKER:
				return MONIKER_EDEFAULT == null ? getMoniker() != null : !MONIKER_EDEFAULT.equals(getMoniker());
			case PivotPackage.COMPLETE_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.COMPLETE_CLASS__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case PivotPackage.COMPLETE_CLASS__IS_STATIC:
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case PivotPackage.COMPLETE_CLASS__OWNED_ANNOTATION:
				return ownedAnnotations != null && !ownedAnnotations.isEmpty();
			case PivotPackage.COMPLETE_CLASS__OWNING_TEMPLATE_PARAMETER:
				return basicGetOwningTemplateParameter() != null;
			case PivotPackage.COMPLETE_CLASS__TEMPLATE_PARAMETER:
				return isSetTemplateParameter();
			case PivotPackage.COMPLETE_CLASS__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case PivotPackage.COMPLETE_CLASS__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case PivotPackage.COMPLETE_CLASS__PACKAGE:
				return basicGetPackage() != null;
			case PivotPackage.COMPLETE_CLASS__IS_ABSTRACT:
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case PivotPackage.COMPLETE_CLASS__OWNED_ATTRIBUTE:
				return ownedAttributes != null && !ownedAttributes.isEmpty();
			case PivotPackage.COMPLETE_CLASS__OWNED_OPERATION:
				return ownedOperations != null && !ownedOperations.isEmpty();
			case PivotPackage.COMPLETE_CLASS__SUPER_CLASS:
				return superClasses != null && !superClasses.isEmpty();
			case PivotPackage.COMPLETE_CLASS__INSTANCE_CLASS_NAME:
				return INSTANCE_CLASS_NAME_EDEFAULT == null ? instanceClassName != null : !INSTANCE_CLASS_NAME_EDEFAULT.equals(instanceClassName);
			case PivotPackage.COMPLETE_CLASS__PRIMITIVE:
				return ((eFlags & PRIMITIVE_EFLAG) != 0) != PRIMITIVE_EDEFAULT;
			case PivotPackage.COMPLETE_CLASS__SUB_CLASS:
				return subClasses != null && !subClasses.isEmpty();
			case PivotPackage.COMPLETE_CLASS__MODEL:
				return model != null;
			case PivotPackage.COMPLETE_CLASS__COMPLETE_ENVIRONMENT:
				return completeEnvironment != null;
			case PivotPackage.COMPLETE_CLASS__COMPLETE_OPERATION:
				return !getCompleteOperations().isEmpty();
			case PivotPackage.COMPLETE_CLASS__COMPLETE_PROPERTY:
				return !getCompleteProperties().isEmpty();
			case PivotPackage.COMPLETE_CLASS__COMPLETE_SUPER_CLASS:
				return !getCompleteSuperClasses().isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID)
		{
			case PivotPackage.COMPLETE_CLASS___OCL_TYPE:
				return oclType();
			case PivotPackage.COMPLETE_CLASS___OCL_IS_INVALID:
				return oclIsInvalid();
			case PivotPackage.COMPLETE_CLASS___OCL_IS_UNDEFINED:
				return oclIsUndefined();
			case PivotPackage.COMPLETE_CLASS___HAS_MONIKER:
				return hasMoniker();
			case PivotPackage.COMPLETE_CLASS___IS_TEMPLATE_PARAMETER:
				return isTemplateParameter();
			case PivotPackage.COMPLETE_CLASS___PARAMETERABLE_ELEMENTS:
				return parameterableElements();
			case PivotPackage.COMPLETE_CLASS___IS_TEMPLATE:
				return isTemplate();
			case PivotPackage.COMPLETE_CLASS___CONFORMS_TO__COMPLETECLASS:
				return conformsTo((CompleteClass)arguments.get(0));
			case PivotPackage.COMPLETE_CLASS___GET_DYNAMIC_OPERATION__COMPLETEOPERATION:
				return getDynamicOperation((CompleteOperation)arguments.get(0));
			case PivotPackage.COMPLETE_CLASS___GET_COMPLETE_OPERATIONS__STRING:
				return getCompleteOperations((String)arguments.get(0));
		}
		return eDynamicInvoke(operationID, arguments);
	}

	public EList<CompleteOperation> getCompleteOperations() {
		// TODO Auto-generated method stub
		return null;
	}

} //CompleteClassImpl
