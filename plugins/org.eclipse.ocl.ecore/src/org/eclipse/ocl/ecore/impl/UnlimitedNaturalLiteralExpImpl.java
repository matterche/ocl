/**
 * <copyright>
 * 
 * Copyright (c) 2007, 2009 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bugs 241426, 207365
 *
 * </copyright>
 *
 * $Id: UnlimitedNaturalLiteralExpImpl.java,v 1.8.10.1 2010/01/15 17:27:21 ewillink Exp $
 */
package org.eclipse.ocl.ecore.impl;

import java.math.BigInteger;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

//import org.eclipse.emf.common.util.BasicDiagnostic;
//import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

//import org.eclipse.emf.ecore.plugin.EcorePlugin;
//import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ocl.ecore.EcorePackage;
import org.eclipse.ocl.ecore.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.expressions.ExpressionsPackage;

//import org.eclipse.ocl.expressions.util.ExpressionsValidator;
import org.eclipse.ocl.expressions.operations.UnlimitedNaturalLiteralExpOperations;
import org.eclipse.ocl.utilities.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unlimited Natural Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.ecore.impl.UnlimitedNaturalLiteralExpImpl#getUnlimitedNaturalSymbol <em>Unlimited Natural Symbol</em>}</li>
 *   <li>{@link org.eclipse.ocl.ecore.impl.UnlimitedNaturalLiteralExpImpl#isUnlimited <em>Unlimited</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnlimitedNaturalLiteralExpImpl
		extends NumericLiteralExpImpl
		implements UnlimitedNaturalLiteralExp {

	/**
	 * The default value of the '{@link #getUnlimitedNaturalSymbol() <em>Unlimited Natural Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #getUnlimitedNaturalSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger UNLIMITED_NATURAL_SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnlimitedNaturalSymbol() <em>Unlimited Natural Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #getUnlimitedNaturalSymbol()
	 * @generated
	 * @ordered
	 */
	protected BigInteger unlimitedNaturalSymbol = UNLIMITED_NATURAL_SYMBOL_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnlimited() <em>Unlimited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnlimited()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNLIMITED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnlimitedNaturalLiteralExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.UNLIMITED_NATURAL_LITERAL_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getUnlimitedNaturalSymbol() {
		return unlimitedNaturalSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnlimitedNaturalSymbol(BigInteger newUnlimitedNaturalSymbol) {
		BigInteger oldUnlimitedNaturalSymbol = unlimitedNaturalSymbol;
		unlimitedNaturalSymbol = newUnlimitedNaturalSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
				this,
				Notification.SET,
				EcorePackage.UNLIMITED_NATURAL_LITERAL_EXP__UNLIMITED_NATURAL_SYMBOL,
				oldUnlimitedNaturalSymbol, unlimitedNaturalSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isUnlimited() {
		return (unlimitedNaturalSymbol == null)
			|| (unlimitedNaturalSymbol == UNLIMITED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean checkNaturalType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnlimitedNaturalLiteralExpOperations.checkNaturalType(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @deprecated use setUnlimitedNaturalSymbol
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerSymbol(Integer value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setUnlimitedNaturalSymbol(Integer value) {
		setUnlimitedNaturalSymbol(BigInteger.valueOf(value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackage.UNLIMITED_NATURAL_LITERAL_EXP__UNLIMITED_NATURAL_SYMBOL :
				return getUnlimitedNaturalSymbol();
			case EcorePackage.UNLIMITED_NATURAL_LITERAL_EXP__UNLIMITED :
				return isUnlimited();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackage.UNLIMITED_NATURAL_LITERAL_EXP__UNLIMITED_NATURAL_SYMBOL :
				setUnlimitedNaturalSymbol((BigInteger) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case EcorePackage.UNLIMITED_NATURAL_LITERAL_EXP__UNLIMITED_NATURAL_SYMBOL :
				setUnlimitedNaturalSymbol(UNLIMITED_NATURAL_SYMBOL_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EcorePackage.UNLIMITED_NATURAL_LITERAL_EXP__UNLIMITED_NATURAL_SYMBOL :
				return UNLIMITED_NATURAL_SYMBOL_EDEFAULT == null
					? unlimitedNaturalSymbol != null
					: !UNLIMITED_NATURAL_SYMBOL_EDEFAULT
						.equals(unlimitedNaturalSymbol);
			case EcorePackage.UNLIMITED_NATURAL_LITERAL_EXP__UNLIMITED :
				return isUnlimited() != UNLIMITED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp.class) {
			switch (derivedFeatureID) {
				case EcorePackage.UNLIMITED_NATURAL_LITERAL_EXP__UNLIMITED_NATURAL_SYMBOL :
					return ExpressionsPackage.UNLIMITED_NATURAL_LITERAL_EXP__UNLIMITED_NATURAL_SYMBOL;
				case EcorePackage.UNLIMITED_NATURAL_LITERAL_EXP__UNLIMITED :
					return ExpressionsPackage.UNLIMITED_NATURAL_LITERAL_EXP__UNLIMITED;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp.class) {
			switch (baseFeatureID) {
				case ExpressionsPackage.UNLIMITED_NATURAL_LITERAL_EXP__UNLIMITED_NATURAL_SYMBOL :
					return EcorePackage.UNLIMITED_NATURAL_LITERAL_EXP__UNLIMITED_NATURAL_SYMBOL;
				case ExpressionsPackage.UNLIMITED_NATURAL_LITERAL_EXP__UNLIMITED :
					return EcorePackage.UNLIMITED_NATURAL_LITERAL_EXP__UNLIMITED;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return super.toString();
	}

	/**
	 * @generated NOT
	 */
	@Override
	@SuppressWarnings("unchecked")
	public <T, U extends Visitor<T, ?, ?, ?, ?, ?, ?, ?, ?, ?>> T accept(U v) {
		return ((Visitor<T, EClassifier, ?, ?, ?, ?, ?, ?, ?, ?>) v)
			.visitUnlimitedNaturalLiteralExp(this);
	}

} //UnlimitedNaturalLiteralExpImpl
