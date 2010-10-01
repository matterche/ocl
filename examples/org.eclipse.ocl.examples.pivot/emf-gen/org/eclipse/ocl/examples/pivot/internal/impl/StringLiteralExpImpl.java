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
 * $Id: StringLiteralExpImpl.java,v 1.1.2.1 2010/10/01 13:54:10 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.Comment;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.EvaluationContext;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.StringLiteralExp;
import org.eclipse.ocl.examples.pivot.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.StringLiteralExpImpl#getStringSymbol <em>String Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringLiteralExpImpl extends PrimitiveLiteralExpImpl implements StringLiteralExp
{
  /**
	 * The default value of the '{@link #getStringSymbol() <em>String Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getStringSymbol()
	 * @generated
	 * @ordered
	 */
  protected static final String STRING_SYMBOL_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getStringSymbol() <em>String Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getStringSymbol()
	 * @generated
	 * @ordered
	 */
  protected String stringSymbol = STRING_SYMBOL_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected StringLiteralExpImpl()
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
		return PivotPackage.Literals.STRING_LITERAL_EXP;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getStringSymbol()
  {
		return stringSymbol;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setStringSymbol(String newStringSymbol)
  {
		String oldStringSymbol = stringSymbol;
		stringSymbol = newStringSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.STRING_LITERAL_EXP__STRING_SYMBOL, oldStringSymbol, stringSymbol));
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
			case PivotPackage.STRING_LITERAL_EXP__OWNED_COMMENT:
				return getOwnedComments();
			case PivotPackage.STRING_LITERAL_EXP__MONIKER:
				return getMoniker();
			case PivotPackage.STRING_LITERAL_EXP__NAME:
				return getName();
			case PivotPackage.STRING_LITERAL_EXP__OWNED_RULE:
				return getOwnedRules();
			case PivotPackage.STRING_LITERAL_EXP__OWNED_ANNOTATION:
				return getOwnedAnnotations();
			case PivotPackage.STRING_LITERAL_EXP__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case PivotPackage.STRING_LITERAL_EXP__STRING_SYMBOL:
				return getStringSymbol();
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
			case PivotPackage.STRING_LITERAL_EXP__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.STRING_LITERAL_EXP__MONIKER:
				setMoniker((String)newValue);
				return;
			case PivotPackage.STRING_LITERAL_EXP__NAME:
				setName((String)newValue);
				return;
			case PivotPackage.STRING_LITERAL_EXP__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection<? extends Constraint>)newValue);
				return;
			case PivotPackage.STRING_LITERAL_EXP__OWNED_ANNOTATION:
				getOwnedAnnotations().clear();
				getOwnedAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case PivotPackage.STRING_LITERAL_EXP__TYPE:
				setType((Type)newValue);
				return;
			case PivotPackage.STRING_LITERAL_EXP__STRING_SYMBOL:
				setStringSymbol((String)newValue);
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
			case PivotPackage.STRING_LITERAL_EXP__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case PivotPackage.STRING_LITERAL_EXP__MONIKER:
				setMoniker(MONIKER_EDEFAULT);
				return;
			case PivotPackage.STRING_LITERAL_EXP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotPackage.STRING_LITERAL_EXP__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case PivotPackage.STRING_LITERAL_EXP__OWNED_ANNOTATION:
				getOwnedAnnotations().clear();
				return;
			case PivotPackage.STRING_LITERAL_EXP__TYPE:
				setType((Type)null);
				return;
			case PivotPackage.STRING_LITERAL_EXP__STRING_SYMBOL:
				setStringSymbol(STRING_SYMBOL_EDEFAULT);
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
			case PivotPackage.STRING_LITERAL_EXP__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case PivotPackage.STRING_LITERAL_EXP__MONIKER:
				return MONIKER_EDEFAULT == null ? getMoniker() != null : !MONIKER_EDEFAULT.equals(getMoniker());
			case PivotPackage.STRING_LITERAL_EXP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.STRING_LITERAL_EXP__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case PivotPackage.STRING_LITERAL_EXP__OWNED_ANNOTATION:
				return ownedAnnotations != null && !ownedAnnotations.isEmpty();
			case PivotPackage.STRING_LITERAL_EXP__TYPE:
				return type != null;
			case PivotPackage.STRING_LITERAL_EXP__STRING_SYMBOL:
				return STRING_SYMBOL_EDEFAULT == null ? stringSymbol != null : !STRING_SYMBOL_EDEFAULT.equals(stringSymbol);
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
		result.append(" (stringSymbol: "); //$NON-NLS-1$
		result.append(stringSymbol);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public Object evaluate(EvaluationContext context) {
		String value = getStringSymbol();
		return value != null ? context.getStringValue(value) : null;
	}
} //StringLiteralExpImpl
