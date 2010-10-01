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
 * $Id: CompleteClassImpl.java,v 1.1.2.1 2010/10/01 13:49:56 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.internal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.examples.pivot.CompleteClass;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complete Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.CompleteClassImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.CompleteClassImpl#getOperations <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.CompleteClassImpl#getProperties <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompleteClassImpl extends ClassImpl implements CompleteClass
{
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompleteClassImpl()
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
		return PivotPackage.Literals.COMPLETE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.examples.pivot.Class getModel()
	{
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
	public org.eclipse.ocl.examples.pivot.Class basicGetModel()
	{
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations()
	{
		// TODO: implement this method to return the 'Operation' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties()
	{
		// TODO: implement this method to return the 'Property' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case PivotPackage.COMPLETE_CLASS__OWNED_COMMENT:
				return getOwnedComments();
			case PivotPackage.COMPLETE_CLASS__MONIKER:
				return getMoniker();
			case PivotPackage.COMPLETE_CLASS__NAME:
				return getName();
			case PivotPackage.COMPLETE_CLASS__OWNED_RULE:
				return getOwnedRules();
			case PivotPackage.COMPLETE_CLASS__OWNED_ANNOTATION:
				return getOwnedAnnotations();
			case PivotPackage.COMPLETE_CLASS__TEMPLATE_BINDING:
				return getTemplateBindings();
			case PivotPackage.COMPLETE_CLASS__OWNED_TEMPLATE_SIGNATURE:
				if (resolve) return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case PivotPackage.COMPLETE_CLASS__OWNED_SPECIALIZATION:
				return getOwnedSpecializations();
			case PivotPackage.COMPLETE_CLASS__OWNING_TEMPLATE_PARAMETER:
				if (resolve) return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case PivotPackage.COMPLETE_CLASS__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
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
			case PivotPackage.COMPLETE_CLASS__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case PivotPackage.COMPLETE_CLASS__OPERATION:
				return getOperations();
			case PivotPackage.COMPLETE_CLASS__PROPERTY:
				return getProperties();
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
			case PivotPackage.COMPLETE_CLASS__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case PivotPackage.COMPLETE_CLASS__MONIKER:
				return MONIKER_EDEFAULT == null ? getMoniker() != null : !MONIKER_EDEFAULT.equals(getMoniker());
			case PivotPackage.COMPLETE_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.COMPLETE_CLASS__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case PivotPackage.COMPLETE_CLASS__OWNED_ANNOTATION:
				return ownedAnnotations != null && !ownedAnnotations.isEmpty();
			case PivotPackage.COMPLETE_CLASS__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case PivotPackage.COMPLETE_CLASS__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case PivotPackage.COMPLETE_CLASS__OWNED_SPECIALIZATION:
				return ownedSpecializations != null && !ownedSpecializations.isEmpty();
			case PivotPackage.COMPLETE_CLASS__OWNING_TEMPLATE_PARAMETER:
				return basicGetOwningTemplateParameter() != null;
			case PivotPackage.COMPLETE_CLASS__TEMPLATE_PARAMETER:
				return isSetTemplateParameter();
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
			case PivotPackage.COMPLETE_CLASS__MODEL:
				return model != null;
			case PivotPackage.COMPLETE_CLASS__OPERATION:
				return !getOperations().isEmpty();
			case PivotPackage.COMPLETE_CLASS__PROPERTY:
				return !getProperties().isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //CompleteClassImpl
