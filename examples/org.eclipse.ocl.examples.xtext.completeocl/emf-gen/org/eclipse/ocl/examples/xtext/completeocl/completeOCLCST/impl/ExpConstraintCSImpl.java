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
 * $Id: ExpConstraintCSImpl.java,v 1.1.2.1 2010/10/01 15:03:01 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.examples.xtext.base.baseCST.impl.ConstraintCSImpl;

import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ExpConstraintCS;

import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exp Constraint CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.ExpConstraintCSImpl#getOwnedExpression <em>Owned Expression</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.ExpConstraintCSImpl#getOwnedReason <em>Owned Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpConstraintCSImpl extends ConstraintCSImpl implements ExpConstraintCS
{
	/**
	 * The cached value of the '{@link #getOwnedExpression() <em>Owned Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExpression()
	 * @generated
	 * @ordered
	 */
	protected ExpCS ownedExpression;

	/**
	 * The cached value of the '{@link #getOwnedReason() <em>Owned Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedReason()
	 * @generated
	 * @ordered
	 */
	protected ExpCS ownedReason;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpConstraintCSImpl()
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
		return CompleteOCLCSTPackage.Literals.EXP_CONSTRAINT_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpCS getOwnedExpression()
	{
		return ownedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedExpression(ExpCS newOwnedExpression, NotificationChain msgs)
	{
		ExpCS oldOwnedExpression = ownedExpression;
		ownedExpression = newOwnedExpression;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompleteOCLCSTPackage.EXP_CONSTRAINT_CS__OWNED_EXPRESSION, oldOwnedExpression, newOwnedExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedExpression(ExpCS newOwnedExpression)
	{
		if (newOwnedExpression != ownedExpression)
		{
			NotificationChain msgs = null;
			if (ownedExpression != null)
				msgs = ((InternalEObject)ownedExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompleteOCLCSTPackage.EXP_CONSTRAINT_CS__OWNED_EXPRESSION, null, msgs);
			if (newOwnedExpression != null)
				msgs = ((InternalEObject)newOwnedExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CompleteOCLCSTPackage.EXP_CONSTRAINT_CS__OWNED_EXPRESSION, null, msgs);
			msgs = basicSetOwnedExpression(newOwnedExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteOCLCSTPackage.EXP_CONSTRAINT_CS__OWNED_EXPRESSION, newOwnedExpression, newOwnedExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpCS getOwnedReason()
	{
		return ownedReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedReason(ExpCS newOwnedReason, NotificationChain msgs)
	{
		ExpCS oldOwnedReason = ownedReason;
		ownedReason = newOwnedReason;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompleteOCLCSTPackage.EXP_CONSTRAINT_CS__OWNED_REASON, oldOwnedReason, newOwnedReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedReason(ExpCS newOwnedReason)
	{
		if (newOwnedReason != ownedReason)
		{
			NotificationChain msgs = null;
			if (ownedReason != null)
				msgs = ((InternalEObject)ownedReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompleteOCLCSTPackage.EXP_CONSTRAINT_CS__OWNED_REASON, null, msgs);
			if (newOwnedReason != null)
				msgs = ((InternalEObject)newOwnedReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CompleteOCLCSTPackage.EXP_CONSTRAINT_CS__OWNED_REASON, null, msgs);
			msgs = basicSetOwnedReason(newOwnedReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteOCLCSTPackage.EXP_CONSTRAINT_CS__OWNED_REASON, newOwnedReason, newOwnedReason));
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
			case CompleteOCLCSTPackage.EXP_CONSTRAINT_CS__OWNED_EXPRESSION:
				return basicSetOwnedExpression(null, msgs);
			case CompleteOCLCSTPackage.EXP_CONSTRAINT_CS__OWNED_REASON:
				return basicSetOwnedReason(null, msgs);
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
			case CompleteOCLCSTPackage.EXP_CONSTRAINT_CS__OWNED_EXPRESSION:
				return getOwnedExpression();
			case CompleteOCLCSTPackage.EXP_CONSTRAINT_CS__OWNED_REASON:
				return getOwnedReason();
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
			case CompleteOCLCSTPackage.EXP_CONSTRAINT_CS__OWNED_EXPRESSION:
				setOwnedExpression((ExpCS)newValue);
				return;
			case CompleteOCLCSTPackage.EXP_CONSTRAINT_CS__OWNED_REASON:
				setOwnedReason((ExpCS)newValue);
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
			case CompleteOCLCSTPackage.EXP_CONSTRAINT_CS__OWNED_EXPRESSION:
				setOwnedExpression((ExpCS)null);
				return;
			case CompleteOCLCSTPackage.EXP_CONSTRAINT_CS__OWNED_REASON:
				setOwnedReason((ExpCS)null);
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
			case CompleteOCLCSTPackage.EXP_CONSTRAINT_CS__OWNED_EXPRESSION:
				return ownedExpression != null;
			case CompleteOCLCSTPackage.EXP_CONSTRAINT_CS__OWNED_REASON:
				return ownedReason != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpConstraintCSImpl
