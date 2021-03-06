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
 * $Id: BooleanLiteralExpImpl.java,v 1.2 2011/01/24 20:42:32 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager;
import org.eclipse.ocl.examples.library.executor.ExecutorType;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.BooleanLiteralExp;
import org.eclipse.ocl.examples.pivot.Comment;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.PivotTables;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.bodies.BooleanLiteralExpBodies;
import org.eclipse.ocl.examples.pivot.util.PivotValidator;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ocl.examples.pivot.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.BooleanLiteralExpImpl#isBooleanSymbol <em>Boolean Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanLiteralExpImpl
		extends PrimitiveLiteralExpImpl
		implements BooleanLiteralExp {

	/**
	 * The default value of the '{@link #isBooleanSymbol() <em>Boolean Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBooleanSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOLEAN_SYMBOL_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isBooleanSymbol() <em>Boolean Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBooleanSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final int BOOLEAN_SYMBOL_EFLAG = 1 << 9;

	/**
	 * The flag representing whether the Boolean Symbol attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int BOOLEAN_SYMBOL_ESETFLAG = 1 << 10;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanLiteralExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotPackage.Literals.BOOLEAN_LITERAL_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBooleanSymbol() {
		return (eFlags & BOOLEAN_SYMBOL_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanSymbol(boolean newBooleanSymbol) {
		boolean oldBooleanSymbol = (eFlags & BOOLEAN_SYMBOL_EFLAG) != 0;
		if (newBooleanSymbol) eFlags |= BOOLEAN_SYMBOL_EFLAG; else eFlags &= ~BOOLEAN_SYMBOL_EFLAG;
		boolean oldBooleanSymbolESet = (eFlags & BOOLEAN_SYMBOL_ESETFLAG) != 0;
		eFlags |= BOOLEAN_SYMBOL_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL, oldBooleanSymbol, newBooleanSymbol, !oldBooleanSymbolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBooleanSymbol() {
		boolean oldBooleanSymbol = (eFlags & BOOLEAN_SYMBOL_EFLAG) != 0;
		boolean oldBooleanSymbolESet = (eFlags & BOOLEAN_SYMBOL_ESETFLAG) != 0;
		if (BOOLEAN_SYMBOL_EDEFAULT) eFlags |= BOOLEAN_SYMBOL_EFLAG; else eFlags &= ~BOOLEAN_SYMBOL_EFLAG;
		eFlags &= ~BOOLEAN_SYMBOL_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PivotPackage.BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL, oldBooleanSymbol, BOOLEAN_SYMBOL_EDEFAULT, oldBooleanSymbolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBooleanSymbol() {
		return (eFlags & BOOLEAN_SYMBOL_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeIsBoolean(DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		/*
		self.type = Boolean
		*/
		try {
			final DomainEvaluator evaluator = new EcoreExecutorManager(this, null, PivotTables.LIBRARY);
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final Value self = valueFactory.valueOf(this);
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			
			final DomainType returnType = T_Boolean;
			final Value result = BooleanLiteralExpBodies._invariant_TypeIsBoolean.INSTANCE.evaluate(evaluator, returnType, self);
			final boolean resultIsNull = result.isNull();
			if (!resultIsNull && result.asBoolean()) {	// true => true, false/null => dropthrough, invalid => exception
				return true;
			}
			if (diagnostics != null) {
				int severity = resultIsNull ? Diagnostic.ERROR : Diagnostic.WARNING;
				String message = NLS.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"BooleanLiteralExp", "TypeIsBoolean", EObjectValidator.getObjectLabel(this, context)});
			    diagnostics.add(new BasicDiagnostic(severity, PivotValidator.DIAGNOSTIC_SOURCE, PivotValidator.BOOLEAN_LITERAL_EXP__TYPE_IS_BOOLEAN, message, new Object [] { this }));
			}
			return false;
		} catch (InvalidValueException e) {
			String message = NLS.bind(EvaluatorMessages.ValidationEvaluationFailed_ERROR_, new Object[]{"BooleanLiteralExp", "TypeIsBoolean", EObjectValidator.getObjectLabel(this, context)});
			throw new WrappedException(message, e);
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID)
		{
			case PivotPackage.BOOLEAN_LITERAL_EXP__OWNED_COMMENT:
				return getOwnedComment();
			case PivotPackage.BOOLEAN_LITERAL_EXP__NAME:
				return getName();
			case PivotPackage.BOOLEAN_LITERAL_EXP__OWNED_RULE:
				return getOwnedRule();
			case PivotPackage.BOOLEAN_LITERAL_EXP__IS_STATIC:
				return isStatic();
			case PivotPackage.BOOLEAN_LITERAL_EXP__OWNED_ANNOTATION:
				return getOwnedAnnotation();
			case PivotPackage.BOOLEAN_LITERAL_EXP__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case PivotPackage.BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL:
				return isBooleanSymbol();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID)
		{
			case PivotPackage.BOOLEAN_LITERAL_EXP__OWNED_COMMENT:
				getOwnedComment().clear();
				getOwnedComment().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.BOOLEAN_LITERAL_EXP__NAME:
				setName((String)newValue);
				return;
			case PivotPackage.BOOLEAN_LITERAL_EXP__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
				return;
			case PivotPackage.BOOLEAN_LITERAL_EXP__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case PivotPackage.BOOLEAN_LITERAL_EXP__OWNED_ANNOTATION:
				getOwnedAnnotation().clear();
				getOwnedAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case PivotPackage.BOOLEAN_LITERAL_EXP__TYPE:
				setType((Type)newValue);
				return;
			case PivotPackage.BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL:
				setBooleanSymbol((Boolean)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID)
		{
			case PivotPackage.BOOLEAN_LITERAL_EXP__OWNED_COMMENT:
				getOwnedComment().clear();
				return;
			case PivotPackage.BOOLEAN_LITERAL_EXP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotPackage.BOOLEAN_LITERAL_EXP__OWNED_RULE:
				getOwnedRule().clear();
				return;
			case PivotPackage.BOOLEAN_LITERAL_EXP__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case PivotPackage.BOOLEAN_LITERAL_EXP__OWNED_ANNOTATION:
				getOwnedAnnotation().clear();
				return;
			case PivotPackage.BOOLEAN_LITERAL_EXP__TYPE:
				setType((Type)null);
				return;
			case PivotPackage.BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL:
				unsetBooleanSymbol();
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
	public boolean eIsSet(int featureID) {
		switch (featureID)
		{
			case PivotPackage.BOOLEAN_LITERAL_EXP__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case PivotPackage.BOOLEAN_LITERAL_EXP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.BOOLEAN_LITERAL_EXP__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case PivotPackage.BOOLEAN_LITERAL_EXP__IS_STATIC:
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case PivotPackage.BOOLEAN_LITERAL_EXP__OWNED_ANNOTATION:
				return ownedAnnotation != null && !ownedAnnotation.isEmpty();
			case PivotPackage.BOOLEAN_LITERAL_EXP__TYPE:
				return type != null;
			case PivotPackage.BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL:
				return isSetBooleanSymbol();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID)
		{
			case PivotPackage.BOOLEAN_LITERAL_EXP___ALL_OWNED_ELEMENTS:
				return allOwnedElements();
			case PivotPackage.BOOLEAN_LITERAL_EXP___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP:
				return validateNotOwnSelf((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case PivotPackage.BOOLEAN_LITERAL_EXP___VALIDATE_TYPE_IS_BOOLEAN__DIAGNOSTICCHAIN_MAP:
				return validateTypeIsBoolean((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
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

	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitBooleanLiteralExp(this);
	}
} //BooleanLiteralExpImpl
