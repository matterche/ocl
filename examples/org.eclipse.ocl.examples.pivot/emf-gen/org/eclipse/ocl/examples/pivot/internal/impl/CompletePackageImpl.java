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
 * $Id: CompletePackageImpl.java,v 1.1.2.1 2010/10/01 13:49:57 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.internal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.examples.pivot.CompletePackage;
import org.eclipse.ocl.examples.pivot.PivotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complete Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.CompletePackageImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.CompletePackageImpl#getTypes <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompletePackageImpl extends PackageImpl implements CompletePackage
{
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.ocl.examples.pivot.Package model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompletePackageImpl()
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
		return PivotPackage.Literals.COMPLETE_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.examples.pivot.Package getModel()
	{
		if (model != null && ((EObject)model).eIsProxy())
		{
			InternalEObject oldModel = (InternalEObject)model;
			model = (org.eclipse.ocl.examples.pivot.Package)eResolveProxy(oldModel);
			if (model != oldModel)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotPackage.COMPLETE_PACKAGE__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.examples.pivot.Package basicGetModel()
	{
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.ocl.examples.pivot.Class> getTypes()
	{
		// TODO: implement this method to return the 'Type' reference list
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
			case PivotPackage.COMPLETE_PACKAGE__OWNED_COMMENT:
				return getOwnedComments();
			case PivotPackage.COMPLETE_PACKAGE__MONIKER:
				return getMoniker();
			case PivotPackage.COMPLETE_PACKAGE__NAME:
				return getName();
			case PivotPackage.COMPLETE_PACKAGE__OWNED_RULE:
				return getOwnedRules();
			case PivotPackage.COMPLETE_PACKAGE__OWNED_ANNOTATION:
				return getOwnedAnnotations();
			case PivotPackage.COMPLETE_PACKAGE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case PivotPackage.COMPLETE_PACKAGE__OWNED_TEMPLATE_SIGNATURE:
				if (resolve) return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case PivotPackage.COMPLETE_PACKAGE__OWNED_SPECIALIZATION:
				return getOwnedSpecializations();
			case PivotPackage.COMPLETE_PACKAGE__NESTED_PACKAGE:
				return getNestedPackages();
			case PivotPackage.COMPLETE_PACKAGE__NESTING_PACKAGE:
				if (resolve) return getNestingPackage();
				return basicGetNestingPackage();
			case PivotPackage.COMPLETE_PACKAGE__NS_PREFIX:
				return getNsPrefix();
			case PivotPackage.COMPLETE_PACKAGE__NS_URI:
				return getNsURI();
			case PivotPackage.COMPLETE_PACKAGE__OWNED_PRECEDENCE:
				return getOwnedPrecedences();
			case PivotPackage.COMPLETE_PACKAGE__OWNED_TYPE:
				return getOwnedTypes();
			case PivotPackage.COMPLETE_PACKAGE__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case PivotPackage.COMPLETE_PACKAGE__TYPE:
				return getTypes();
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
			case PivotPackage.COMPLETE_PACKAGE__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case PivotPackage.COMPLETE_PACKAGE__MONIKER:
				return MONIKER_EDEFAULT == null ? getMoniker() != null : !MONIKER_EDEFAULT.equals(getMoniker());
			case PivotPackage.COMPLETE_PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.COMPLETE_PACKAGE__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case PivotPackage.COMPLETE_PACKAGE__OWNED_ANNOTATION:
				return ownedAnnotations != null && !ownedAnnotations.isEmpty();
			case PivotPackage.COMPLETE_PACKAGE__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case PivotPackage.COMPLETE_PACKAGE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case PivotPackage.COMPLETE_PACKAGE__OWNED_SPECIALIZATION:
				return ownedSpecializations != null && !ownedSpecializations.isEmpty();
			case PivotPackage.COMPLETE_PACKAGE__NESTED_PACKAGE:
				return nestedPackages != null && !nestedPackages.isEmpty();
			case PivotPackage.COMPLETE_PACKAGE__NESTING_PACKAGE:
				return basicGetNestingPackage() != null;
			case PivotPackage.COMPLETE_PACKAGE__NS_PREFIX:
				return NS_PREFIX_EDEFAULT == null ? nsPrefix != null : !NS_PREFIX_EDEFAULT.equals(nsPrefix);
			case PivotPackage.COMPLETE_PACKAGE__NS_URI:
				return NS_URI_EDEFAULT == null ? nsURI != null : !NS_URI_EDEFAULT.equals(nsURI);
			case PivotPackage.COMPLETE_PACKAGE__OWNED_PRECEDENCE:
				return ownedPrecedences != null && !ownedPrecedences.isEmpty();
			case PivotPackage.COMPLETE_PACKAGE__OWNED_TYPE:
				return ownedTypes != null && !ownedTypes.isEmpty();
			case PivotPackage.COMPLETE_PACKAGE__MODEL:
				return model != null;
			case PivotPackage.COMPLETE_PACKAGE__TYPE:
				return !getTypes().isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //CompletePackageImpl
