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
 * $Id: CompletePropertyImpl.java,v 1.1.2.1 2010/10/01 13:49:56 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.internal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.examples.pivot.CompleteProperty;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complete Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.CompletePropertyImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompletePropertyImpl extends PropertyImpl implements CompleteProperty
{
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Property model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompletePropertyImpl()
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
		return PivotPackage.Literals.COMPLETE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getModel()
	{
		if (model != null && ((EObject)model).eIsProxy())
		{
			InternalEObject oldModel = (InternalEObject)model;
			model = (Property)eResolveProxy(oldModel);
			if (model != oldModel)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotPackage.COMPLETE_PROPERTY__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetModel()
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
			case PivotPackage.COMPLETE_PROPERTY__OWNED_COMMENT:
				return getOwnedComments();
			case PivotPackage.COMPLETE_PROPERTY__MONIKER:
				return getMoniker();
			case PivotPackage.COMPLETE_PROPERTY__IS_ORDERED:
				return isOrdered();
			case PivotPackage.COMPLETE_PROPERTY__IS_UNIQUE:
				return isUnique();
			case PivotPackage.COMPLETE_PROPERTY__LOWER:
				return getLower();
			case PivotPackage.COMPLETE_PROPERTY__UPPER:
				return getUpper();
			case PivotPackage.COMPLETE_PROPERTY__NAME:
				return getName();
			case PivotPackage.COMPLETE_PROPERTY__OWNED_RULE:
				return getOwnedRules();
			case PivotPackage.COMPLETE_PROPERTY__OWNED_ANNOTATION:
				return getOwnedAnnotations();
			case PivotPackage.COMPLETE_PROPERTY__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case PivotPackage.COMPLETE_PROPERTY__OWNING_TEMPLATE_PARAMETER:
				if (resolve) return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case PivotPackage.COMPLETE_PROPERTY__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case PivotPackage.COMPLETE_PROPERTY__IMPLEMENTATION_CLASS:
				return getImplementationClass();
			case PivotPackage.COMPLETE_PROPERTY__IMPLEMENTATION:
				if (resolve) return getImplementation();
				return basicGetImplementation();
			case PivotPackage.COMPLETE_PROPERTY__IS_READ_ONLY:
				return isReadOnly();
			case PivotPackage.COMPLETE_PROPERTY__DEFAULT:
				return getDefault();
			case PivotPackage.COMPLETE_PROPERTY__IS_COMPOSITE:
				return isComposite();
			case PivotPackage.COMPLETE_PROPERTY__IS_DERIVED:
				return isDerived();
			case PivotPackage.COMPLETE_PROPERTY__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
			case PivotPackage.COMPLETE_PROPERTY__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case PivotPackage.COMPLETE_PROPERTY__CLASS:
				if (resolve) return getClass_();
				return basicGetClass_();
			case PivotPackage.COMPLETE_PROPERTY__MODEL:
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
			case PivotPackage.COMPLETE_PROPERTY__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case PivotPackage.COMPLETE_PROPERTY__MONIKER:
				return MONIKER_EDEFAULT == null ? getMoniker() != null : !MONIKER_EDEFAULT.equals(getMoniker());
			case PivotPackage.COMPLETE_PROPERTY__IS_ORDERED:
				return ((eFlags & IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case PivotPackage.COMPLETE_PROPERTY__IS_UNIQUE:
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case PivotPackage.COMPLETE_PROPERTY__LOWER:
				return LOWER_EDEFAULT == null ? lower != null : !LOWER_EDEFAULT.equals(lower);
			case PivotPackage.COMPLETE_PROPERTY__UPPER:
				return UPPER_EDEFAULT == null ? upper != null : !UPPER_EDEFAULT.equals(upper);
			case PivotPackage.COMPLETE_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.COMPLETE_PROPERTY__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case PivotPackage.COMPLETE_PROPERTY__OWNED_ANNOTATION:
				return ownedAnnotations != null && !ownedAnnotations.isEmpty();
			case PivotPackage.COMPLETE_PROPERTY__TYPE:
				return type != null;
			case PivotPackage.COMPLETE_PROPERTY__OWNING_TEMPLATE_PARAMETER:
				return basicGetOwningTemplateParameter() != null;
			case PivotPackage.COMPLETE_PROPERTY__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case PivotPackage.COMPLETE_PROPERTY__IMPLEMENTATION_CLASS:
				return IMPLEMENTATION_CLASS_EDEFAULT == null ? implementationClass != null : !IMPLEMENTATION_CLASS_EDEFAULT.equals(implementationClass);
			case PivotPackage.COMPLETE_PROPERTY__IMPLEMENTATION:
				return implementation != null;
			case PivotPackage.COMPLETE_PROPERTY__IS_READ_ONLY:
				return ((eFlags & IS_READ_ONLY_EFLAG) != 0) != IS_READ_ONLY_EDEFAULT;
			case PivotPackage.COMPLETE_PROPERTY__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case PivotPackage.COMPLETE_PROPERTY__IS_COMPOSITE:
				return ((eFlags & IS_COMPOSITE_EFLAG) != 0) != IS_COMPOSITE_EDEFAULT;
			case PivotPackage.COMPLETE_PROPERTY__IS_DERIVED:
				return ((eFlags & IS_DERIVED_EFLAG) != 0) != IS_DERIVED_EDEFAULT;
			case PivotPackage.COMPLETE_PROPERTY__OPPOSITE:
				return opposite != null;
			case PivotPackage.COMPLETE_PROPERTY__ASSOCIATION:
				return association != null;
			case PivotPackage.COMPLETE_PROPERTY__CLASS:
				return basicGetClass_() != null;
			case PivotPackage.COMPLETE_PROPERTY__MODEL:
				return model != null;
		}
		return eDynamicIsSet(featureID);
	}

} //CompletePropertyImpl