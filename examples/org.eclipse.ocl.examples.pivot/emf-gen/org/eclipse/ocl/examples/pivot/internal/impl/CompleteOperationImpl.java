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
 * $Id: CompleteOperationImpl.java,v 1.1.2.1 2010/10/01 13:54:10 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.internal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.examples.pivot.CompleteOperation;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.PivotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complete Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.CompleteOperationImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompleteOperationImpl extends OperationImpl implements CompleteOperation
{
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Operation model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompleteOperationImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return PivotPackage.Literals.COMPLETE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getModel()
	{
		if (model != null && ((EObject)model).eIsProxy())
		{
			InternalEObject oldModel = (InternalEObject)model;
			model = (Operation)eResolveProxy(oldModel);
			if (model != oldModel)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotPackage.COMPLETE_OPERATION__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetModel()
	{
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case PivotPackage.COMPLETE_OPERATION__OWNED_COMMENT:
				return getOwnedComments();
			case PivotPackage.COMPLETE_OPERATION__MONIKER:
				return getMoniker();
			case PivotPackage.COMPLETE_OPERATION__IS_ORDERED:
				return isOrdered();
			case PivotPackage.COMPLETE_OPERATION__IS_UNIQUE:
				return isUnique();
			case PivotPackage.COMPLETE_OPERATION__LOWER:
				return getLower();
			case PivotPackage.COMPLETE_OPERATION__UPPER:
				return getUpper();
			case PivotPackage.COMPLETE_OPERATION__NAME:
				return getName();
			case PivotPackage.COMPLETE_OPERATION__OWNED_RULE:
				return getOwnedRules();
			case PivotPackage.COMPLETE_OPERATION__OWNED_ANNOTATION:
				return getOwnedAnnotations();
			case PivotPackage.COMPLETE_OPERATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case PivotPackage.COMPLETE_OPERATION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case PivotPackage.COMPLETE_OPERATION__OWNED_TEMPLATE_SIGNATURE:
				if (resolve) return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case PivotPackage.COMPLETE_OPERATION__OWNED_SPECIALIZATION:
				return getOwnedSpecializations();
			case PivotPackage.COMPLETE_OPERATION__OWNING_TEMPLATE_PARAMETER:
				if (resolve) return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case PivotPackage.COMPLETE_OPERATION__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case PivotPackage.COMPLETE_OPERATION__IMPLEMENTATION_CLASS:
				return getImplementationClass();
			case PivotPackage.COMPLETE_OPERATION__IMPLEMENTATION:
				if (resolve) return getImplementation();
				return basicGetImplementation();
			case PivotPackage.COMPLETE_OPERATION__RAISED_EXCEPTION:
				return getRaisedExceptions();
			case PivotPackage.COMPLETE_OPERATION__OWNED_PARAMETER:
				return getOwnedParameters();
			case PivotPackage.COMPLETE_OPERATION__PRECEDENCE:
				if (resolve) return getPrecedence();
				return basicGetPrecedence();
			case PivotPackage.COMPLETE_OPERATION__CLASS:
				if (resolve) return getClass_();
				return basicGetClass_();
			case PivotPackage.COMPLETE_OPERATION__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case PivotPackage.COMPLETE_OPERATION__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case PivotPackage.COMPLETE_OPERATION__MONIKER:
				return MONIKER_EDEFAULT == null ? getMoniker() != null : !MONIKER_EDEFAULT.equals(getMoniker());
			case PivotPackage.COMPLETE_OPERATION__IS_ORDERED:
				return ((eFlags & IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case PivotPackage.COMPLETE_OPERATION__IS_UNIQUE:
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case PivotPackage.COMPLETE_OPERATION__LOWER:
				return LOWER_EDEFAULT == null ? lower != null : !LOWER_EDEFAULT.equals(lower);
			case PivotPackage.COMPLETE_OPERATION__UPPER:
				return UPPER_EDEFAULT == null ? upper != null : !UPPER_EDEFAULT.equals(upper);
			case PivotPackage.COMPLETE_OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.COMPLETE_OPERATION__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case PivotPackage.COMPLETE_OPERATION__OWNED_ANNOTATION:
				return ownedAnnotations != null && !ownedAnnotations.isEmpty();
			case PivotPackage.COMPLETE_OPERATION__TYPE:
				return type != null;
			case PivotPackage.COMPLETE_OPERATION__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case PivotPackage.COMPLETE_OPERATION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case PivotPackage.COMPLETE_OPERATION__OWNED_SPECIALIZATION:
				return ownedSpecializations != null && !ownedSpecializations.isEmpty();
			case PivotPackage.COMPLETE_OPERATION__OWNING_TEMPLATE_PARAMETER:
				return basicGetOwningTemplateParameter() != null;
			case PivotPackage.COMPLETE_OPERATION__TEMPLATE_PARAMETER:
				return isSetTemplateParameter();
			case PivotPackage.COMPLETE_OPERATION__IMPLEMENTATION_CLASS:
				return IMPLEMENTATION_CLASS_EDEFAULT == null ? implementationClass != null : !IMPLEMENTATION_CLASS_EDEFAULT.equals(implementationClass);
			case PivotPackage.COMPLETE_OPERATION__IMPLEMENTATION:
				return implementation != null;
			case PivotPackage.COMPLETE_OPERATION__RAISED_EXCEPTION:
				return raisedExceptions != null && !raisedExceptions.isEmpty();
			case PivotPackage.COMPLETE_OPERATION__OWNED_PARAMETER:
				return ownedParameters != null && !ownedParameters.isEmpty();
			case PivotPackage.COMPLETE_OPERATION__PRECEDENCE:
				return precedence != null;
			case PivotPackage.COMPLETE_OPERATION__CLASS:
				return basicGetClass_() != null;
			case PivotPackage.COMPLETE_OPERATION__MODEL:
				return model != null;
		}
		return eDynamicIsSet(featureID);
	}

} //CompleteOperationImpl
