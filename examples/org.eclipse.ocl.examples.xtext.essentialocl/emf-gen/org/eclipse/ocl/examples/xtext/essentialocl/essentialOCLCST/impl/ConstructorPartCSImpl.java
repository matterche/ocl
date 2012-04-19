/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.examples.pivot.Property;

import org.eclipse.ocl.examples.xtext.base.baseCST.impl.ModelElementCSImpl;
import org.eclipse.ocl.examples.xtext.base.util.BaseCSVisitor;

import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ConstructorPartCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.EssentialOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.util.EssentialOCLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor Part CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.impl.ConstructorPartCSImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.impl.ConstructorPartCSImpl#getInitExpression <em>Init Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstructorPartCSImpl extends ModelElementCSImpl implements ConstructorPartCS
{
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected Property property;

	/**
	 * The cached value of the '{@link #getInitExpression() <em>Init Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitExpression()
	 * @generated
	 * @ordered
	 */
	protected ExpCS initExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorPartCSImpl()
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
		return EssentialOCLCSTPackage.Literals.CONSTRUCTOR_PART_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getProperty()
	{
		if (property != null && ((EObject)property).eIsProxy())
		{
			InternalEObject oldProperty = (InternalEObject)property;
			property = (Property)eResolveProxy(oldProperty);
			if (property != oldProperty)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EssentialOCLCSTPackage.CONSTRUCTOR_PART_CS__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetProperty()
	{
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(Property newProperty)
	{
		Property oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssentialOCLCSTPackage.CONSTRUCTOR_PART_CS__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpCS getInitExpression()
	{
		return initExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitExpression(ExpCS newInitExpression, NotificationChain msgs)
	{
		ExpCS oldInitExpression = initExpression;
		initExpression = newInitExpression;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssentialOCLCSTPackage.CONSTRUCTOR_PART_CS__INIT_EXPRESSION, oldInitExpression, newInitExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitExpression(ExpCS newInitExpression)
	{
		if (newInitExpression != initExpression)
		{
			NotificationChain msgs = null;
			if (initExpression != null)
				msgs = ((InternalEObject)initExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssentialOCLCSTPackage.CONSTRUCTOR_PART_CS__INIT_EXPRESSION, null, msgs);
			if (newInitExpression != null)
				msgs = ((InternalEObject)newInitExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssentialOCLCSTPackage.CONSTRUCTOR_PART_CS__INIT_EXPRESSION, null, msgs);
			msgs = basicSetInitExpression(newInitExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssentialOCLCSTPackage.CONSTRUCTOR_PART_CS__INIT_EXPRESSION, newInitExpression, newInitExpression));
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
			case EssentialOCLCSTPackage.CONSTRUCTOR_PART_CS__INIT_EXPRESSION:
				return basicSetInitExpression(null, msgs);
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
			case EssentialOCLCSTPackage.CONSTRUCTOR_PART_CS__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
			case EssentialOCLCSTPackage.CONSTRUCTOR_PART_CS__INIT_EXPRESSION:
				return getInitExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case EssentialOCLCSTPackage.CONSTRUCTOR_PART_CS__PROPERTY:
				setProperty((Property)newValue);
				return;
			case EssentialOCLCSTPackage.CONSTRUCTOR_PART_CS__INIT_EXPRESSION:
				setInitExpression((ExpCS)newValue);
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
			case EssentialOCLCSTPackage.CONSTRUCTOR_PART_CS__PROPERTY:
				setProperty((Property)null);
				return;
			case EssentialOCLCSTPackage.CONSTRUCTOR_PART_CS__INIT_EXPRESSION:
				setInitExpression((ExpCS)null);
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
			case EssentialOCLCSTPackage.CONSTRUCTOR_PART_CS__PROPERTY:
				return property != null;
			case EssentialOCLCSTPackage.CONSTRUCTOR_PART_CS__INIT_EXPRESSION:
				return initExpression != null;
		}
		return super.eIsSet(featureID);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <R> R accept(BaseCSVisitor<R> visitor) {
		return (R) visitor.getAdapter(EssentialOCLCSVisitor.class).visitConstructorPartCS(this);
	}

	public String getName() {
		return getProperty().getName();
	}
} //ConstructorPartCSImpl
