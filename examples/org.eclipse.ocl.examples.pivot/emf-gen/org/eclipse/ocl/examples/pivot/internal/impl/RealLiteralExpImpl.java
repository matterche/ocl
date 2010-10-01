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
 * $Id: RealLiteralExpImpl.java,v 1.1.2.1 2010/10/01 13:49:57 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.internal.impl;

import java.math.BigDecimal;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.Comment;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.EvaluationContext;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.RealLiteralExp;
import org.eclipse.ocl.examples.pivot.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.RealLiteralExpImpl#getRealSymbol <em>Real Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealLiteralExpImpl extends NumericLiteralExpImpl implements RealLiteralExp
{
  /**
	 * The default value of the '{@link #getRealSymbol() <em>Real Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRealSymbol()
	 * @generated
	 * @ordered
	 */
  protected static final BigDecimal REAL_SYMBOL_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getRealSymbol() <em>Real Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealSymbol()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal realSymbol = REAL_SYMBOL_EDEFAULT;

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RealLiteralExpImpl()
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
		return PivotPackage.Literals.REAL_LITERAL_EXP;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getRealSymbol()
	{
		return realSymbol;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealSymbol(BigDecimal newRealSymbol)
	{
		BigDecimal oldRealSymbol = realSymbol;
		realSymbol = newRealSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.REAL_LITERAL_EXP__REAL_SYMBOL, oldRealSymbol, realSymbol));
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
			case PivotPackage.REAL_LITERAL_EXP__OWNED_COMMENT:
				return getOwnedComments();
			case PivotPackage.REAL_LITERAL_EXP__MONIKER:
				return getMoniker();
			case PivotPackage.REAL_LITERAL_EXP__NAME:
				return getName();
			case PivotPackage.REAL_LITERAL_EXP__OWNED_RULE:
				return getOwnedRules();
			case PivotPackage.REAL_LITERAL_EXP__OWNED_ANNOTATION:
				return getOwnedAnnotations();
			case PivotPackage.REAL_LITERAL_EXP__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case PivotPackage.REAL_LITERAL_EXP__REAL_SYMBOL:
				return getRealSymbol();
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
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID)
		{
			case PivotPackage.REAL_LITERAL_EXP__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.REAL_LITERAL_EXP__MONIKER:
				setMoniker((String)newValue);
				return;
			case PivotPackage.REAL_LITERAL_EXP__NAME:
				setName((String)newValue);
				return;
			case PivotPackage.REAL_LITERAL_EXP__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection<? extends Constraint>)newValue);
				return;
			case PivotPackage.REAL_LITERAL_EXP__OWNED_ANNOTATION:
				getOwnedAnnotations().clear();
				getOwnedAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case PivotPackage.REAL_LITERAL_EXP__TYPE:
				setType((Type)newValue);
				return;
			case PivotPackage.REAL_LITERAL_EXP__REAL_SYMBOL:
				setRealSymbol((BigDecimal)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID)
		{
			case PivotPackage.REAL_LITERAL_EXP__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case PivotPackage.REAL_LITERAL_EXP__MONIKER:
				setMoniker(MONIKER_EDEFAULT);
				return;
			case PivotPackage.REAL_LITERAL_EXP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotPackage.REAL_LITERAL_EXP__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case PivotPackage.REAL_LITERAL_EXP__OWNED_ANNOTATION:
				getOwnedAnnotations().clear();
				return;
			case PivotPackage.REAL_LITERAL_EXP__TYPE:
				setType((Type)null);
				return;
			case PivotPackage.REAL_LITERAL_EXP__REAL_SYMBOL:
				setRealSymbol(REAL_SYMBOL_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID)
		{
			case PivotPackage.REAL_LITERAL_EXP__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case PivotPackage.REAL_LITERAL_EXP__MONIKER:
				return MONIKER_EDEFAULT == null ? getMoniker() != null : !MONIKER_EDEFAULT.equals(getMoniker());
			case PivotPackage.REAL_LITERAL_EXP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.REAL_LITERAL_EXP__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case PivotPackage.REAL_LITERAL_EXP__OWNED_ANNOTATION:
				return ownedAnnotations != null && !ownedAnnotations.isEmpty();
			case PivotPackage.REAL_LITERAL_EXP__TYPE:
				return type != null;
			case PivotPackage.REAL_LITERAL_EXP__REAL_SYMBOL:
				return REAL_SYMBOL_EDEFAULT == null ? realSymbol != null : !REAL_SYMBOL_EDEFAULT.equals(realSymbol);
		}
		return eDynamicIsSet(featureID);
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
		result.append(" (realSymbol: "); //$NON-NLS-1$
		result.append(realSymbol);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public Object evaluate(EvaluationContext context) {
		BigDecimal value = getRealSymbol();
		return value != null ? context.getRealValue(value) : null;
	}
} //RealLiteralExpImpl
