/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.xtext.base.baseCST.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.MultiplicityStringCS;
import org.eclipse.ocl.examples.xtext.base.util.BaseCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Multiplicity CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.MultiplicityStringCSImpl#getStringBounds <em>String Bounds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiplicityStringCSImpl extends ElementCSImpl implements MultiplicityStringCS
{
	/**
	 * The default value of the '{@link #getStringBounds() <em>String Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringBounds()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_BOUNDS_EDEFAULT = "1"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getStringBounds() <em>String Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringBounds()
	 * @generated
	 * @ordered
	 */
	protected String stringBounds = STRING_BOUNDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityStringCSImpl()
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
		return BaseCSTPackage.Literals.MULTIPLICITY_STRING_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStringBounds()
	{
		return stringBounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringBounds(String newStringBounds)
	{
		String oldStringBounds = stringBounds;
		stringBounds = newStringBounds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaseCSTPackage.MULTIPLICITY_STRING_CS__STRING_BOUNDS, oldStringBounds, stringBounds));
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
			case BaseCSTPackage.MULTIPLICITY_STRING_CS__STRING_BOUNDS:
				return getStringBounds();
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
			case BaseCSTPackage.MULTIPLICITY_STRING_CS__STRING_BOUNDS:
				setStringBounds((String)newValue);
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
			case BaseCSTPackage.MULTIPLICITY_STRING_CS__STRING_BOUNDS:
				setStringBounds(STRING_BOUNDS_EDEFAULT);
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
			case BaseCSTPackage.MULTIPLICITY_STRING_CS__STRING_BOUNDS:
				return STRING_BOUNDS_EDEFAULT == null ? stringBounds != null : !STRING_BOUNDS_EDEFAULT.equals(stringBounds);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString()
	{
		return super.toString();
	}

	@Override
	public <R, C> R accept(BaseCSVisitor<R, C> visitor) {
		return visitor.visitMultiplicityStringCS(this);
	}

	public int getLower() {
		if ("?".equals(stringBounds)) {
			return 0;
		}
		else if ("+".equals(stringBounds)) {
			return 1;
		}
		else if ("*".equals(stringBounds)) {
			return 0;
		}
		else {
			return 1;
		}
	}

	public int getUpper() {
		if ("?".equals(stringBounds)) {
			return 1;
		}
		else if ("+".equals(stringBounds)) {
			return -1;
		}
		else if ("*".equals(stringBounds)) {
			return -1;
		}
		else {
			return 1;
		}
	}

} //StringMultiplicityCSImpl
