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
 * $Id: AbstractPackageCSImpl.java,v 1.1.2.1 2010/10/01 14:13:03 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.baseCST.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.examples.xtext.base.baseCST.AbstractPackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Package CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.AbstractPackageCSImpl#getOwnedNestedPackage <em>Owned Nested Package</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.AbstractPackageCSImpl#getNsPrefix <em>Ns Prefix</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.AbstractPackageCSImpl#getNsURI <em>Ns URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractPackageCSImpl extends NamedElementCSImpl implements AbstractPackageCS
{
	/**
	 * The cached value of the '{@link #getOwnedNestedPackage() <em>Owned Nested Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedNestedPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPackageCS> ownedNestedPackage;

	/**
	 * The default value of the '{@link #getNsPrefix() <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNsPrefix() <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected String nsPrefix = NS_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getNsURI() <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsURI()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNsURI() <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsURI()
	 * @generated
	 * @ordered
	 */
	protected String nsURI = NS_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractPackageCSImpl()
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
		return BaseCSTPackage.Literals.ABSTRACT_PACKAGE_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractPackageCS> getOwnedNestedPackage()
	{
		if (ownedNestedPackage == null)
		{
			ownedNestedPackage = new EObjectContainmentEList<AbstractPackageCS>(AbstractPackageCS.class, this, BaseCSTPackage.ABSTRACT_PACKAGE_CS__OWNED_NESTED_PACKAGE);
		}
		return ownedNestedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNsPrefix()
	{
		return nsPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNsPrefix(String newNsPrefix)
	{
		String oldNsPrefix = nsPrefix;
		nsPrefix = newNsPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaseCSTPackage.ABSTRACT_PACKAGE_CS__NS_PREFIX, oldNsPrefix, nsPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNsURI()
	{
		return nsURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNsURI(String newNsURI)
	{
		String oldNsURI = nsURI;
		nsURI = newNsURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaseCSTPackage.ABSTRACT_PACKAGE_CS__NS_URI, oldNsURI, nsURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case BaseCSTPackage.ABSTRACT_PACKAGE_CS__OWNED_NESTED_PACKAGE:
				return ((InternalEList<?>)getOwnedNestedPackage()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case BaseCSTPackage.ABSTRACT_PACKAGE_CS__OWNED_NESTED_PACKAGE:
				return getOwnedNestedPackage();
			case BaseCSTPackage.ABSTRACT_PACKAGE_CS__NS_PREFIX:
				return getNsPrefix();
			case BaseCSTPackage.ABSTRACT_PACKAGE_CS__NS_URI:
				return getNsURI();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case BaseCSTPackage.ABSTRACT_PACKAGE_CS__OWNED_NESTED_PACKAGE:
				getOwnedNestedPackage().clear();
				getOwnedNestedPackage().addAll((Collection<? extends AbstractPackageCS>)newValue);
				return;
			case BaseCSTPackage.ABSTRACT_PACKAGE_CS__NS_PREFIX:
				setNsPrefix((String)newValue);
				return;
			case BaseCSTPackage.ABSTRACT_PACKAGE_CS__NS_URI:
				setNsURI((String)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case BaseCSTPackage.ABSTRACT_PACKAGE_CS__OWNED_NESTED_PACKAGE:
				getOwnedNestedPackage().clear();
				return;
			case BaseCSTPackage.ABSTRACT_PACKAGE_CS__NS_PREFIX:
				setNsPrefix(NS_PREFIX_EDEFAULT);
				return;
			case BaseCSTPackage.ABSTRACT_PACKAGE_CS__NS_URI:
				setNsURI(NS_URI_EDEFAULT);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case BaseCSTPackage.ABSTRACT_PACKAGE_CS__OWNED_NESTED_PACKAGE:
				return ownedNestedPackage != null && !ownedNestedPackage.isEmpty();
			case BaseCSTPackage.ABSTRACT_PACKAGE_CS__NS_PREFIX:
				return NS_PREFIX_EDEFAULT == null ? nsPrefix != null : !NS_PREFIX_EDEFAULT.equals(nsPrefix);
			case BaseCSTPackage.ABSTRACT_PACKAGE_CS__NS_URI:
				return NS_URI_EDEFAULT == null ? nsURI != null : !NS_URI_EDEFAULT.equals(nsURI);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nsPrefix: "); //$NON-NLS-1$
		result.append(nsPrefix);
		result.append(", nsURI: "); //$NON-NLS-1$
		result.append(nsURI);
		result.append(')');
		return result.toString();
	}

} //AbstractPackageCSImpl
