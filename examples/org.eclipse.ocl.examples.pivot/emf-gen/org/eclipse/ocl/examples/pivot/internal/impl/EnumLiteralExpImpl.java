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
 * $Id: EnumLiteralExpImpl.java,v 1.2 2011/01/24 20:42:32 ewillink Exp $
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
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
import org.eclipse.ocl.examples.pivot.Comment;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.EnumLiteralExp;
import org.eclipse.ocl.examples.pivot.EnumerationLiteral;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.PivotTables;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.bodies.EnumLiteralExpBodies;
import org.eclipse.ocl.examples.pivot.util.PivotValidator;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ocl.examples.pivot.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.EnumLiteralExpImpl#getReferredEnumLiteral <em>Referred Enum Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumLiteralExpImpl
		extends LiteralExpImpl
		implements EnumLiteralExp {

	/**
	 * The cached value of the '{@link #getReferredEnumLiteral() <em>Referred Enum Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredEnumLiteral()
	 * @generated
	 * @ordered
	 */
	protected EnumerationLiteral referredEnumLiteral;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumLiteralExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotPackage.Literals.ENUM_LITERAL_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getReferredEnumLiteral() {
		if (referredEnumLiteral != null && ((EObject)referredEnumLiteral).eIsProxy())
		{
			InternalEObject oldReferredEnumLiteral = (InternalEObject)referredEnumLiteral;
			referredEnumLiteral = (EnumerationLiteral)eResolveProxy(oldReferredEnumLiteral);
			if (referredEnumLiteral != oldReferredEnumLiteral)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotPackage.ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL, oldReferredEnumLiteral, referredEnumLiteral));
			}
		}
		return referredEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral basicGetReferredEnumLiteral() {
		return referredEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferredEnumLiteral(EnumerationLiteral newReferredEnumLiteral) {
		EnumerationLiteral oldReferredEnumLiteral = referredEnumLiteral;
		referredEnumLiteral = newReferredEnumLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL, oldReferredEnumLiteral, referredEnumLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeIsEnumerationType(DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		/*
		self.type = referredEnumLiteral.enumeration
		*/
		try {
			final DomainEvaluator evaluator = new EcoreExecutorManager(this, PivotTables.LIBRARY);
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final Value self = valueFactory.valueOf(this);
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			
			final DomainType returnType = T_Boolean;
			final Value result = EnumLiteralExpBodies._invariant_TypeIsEnumerationType.INSTANCE.evaluate(evaluator, returnType, self);
			final boolean resultIsNull = result.isNull();
			if (!resultIsNull && result.asBoolean()) {	// true => true, false/null => dropthrough, invalid => exception
				return true;
			}
			if (diagnostics != null) {
				int severity = resultIsNull ? Diagnostic.ERROR : Diagnostic.WARNING;
				String message = NLS.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"EnumLiteralExp", "TypeIsEnumerationType", EObjectValidator.getObjectLabel(this, context)});
			    diagnostics.add(new BasicDiagnostic(severity, PivotValidator.DIAGNOSTIC_SOURCE, PivotValidator.ENUM_LITERAL_EXP__TYPE_IS_ENUMERATION_TYPE, message, new Object [] { this }));
			}
			return false;
		} catch (InvalidValueException e) {
			String message = NLS.bind(EvaluatorMessages.ValidationEvaluationFailed_ERROR_, new Object[]{"EnumLiteralExp", "TypeIsEnumerationType", EObjectValidator.getObjectLabel(this, context)});
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
			case PivotPackage.ENUM_LITERAL_EXP__OWNED_COMMENT:
				return getOwnedComments();
			case PivotPackage.ENUM_LITERAL_EXP__NAME:
				return getName();
			case PivotPackage.ENUM_LITERAL_EXP__OWNED_RULE:
				return getOwnedRules();
			case PivotPackage.ENUM_LITERAL_EXP__IS_STATIC:
				return isStatic();
			case PivotPackage.ENUM_LITERAL_EXP__OWNED_ANNOTATION:
				return getOwnedAnnotations();
			case PivotPackage.ENUM_LITERAL_EXP__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case PivotPackage.ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL:
				if (resolve) return getReferredEnumLiteral();
				return basicGetReferredEnumLiteral();
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
			case PivotPackage.ENUM_LITERAL_EXP__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.ENUM_LITERAL_EXP__NAME:
				setName((String)newValue);
				return;
			case PivotPackage.ENUM_LITERAL_EXP__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection<? extends Constraint>)newValue);
				return;
			case PivotPackage.ENUM_LITERAL_EXP__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case PivotPackage.ENUM_LITERAL_EXP__OWNED_ANNOTATION:
				getOwnedAnnotations().clear();
				getOwnedAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case PivotPackage.ENUM_LITERAL_EXP__TYPE:
				setType((Type)newValue);
				return;
			case PivotPackage.ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL:
				setReferredEnumLiteral((EnumerationLiteral)newValue);
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
			case PivotPackage.ENUM_LITERAL_EXP__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case PivotPackage.ENUM_LITERAL_EXP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotPackage.ENUM_LITERAL_EXP__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case PivotPackage.ENUM_LITERAL_EXP__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case PivotPackage.ENUM_LITERAL_EXP__OWNED_ANNOTATION:
				getOwnedAnnotations().clear();
				return;
			case PivotPackage.ENUM_LITERAL_EXP__TYPE:
				setType((Type)null);
				return;
			case PivotPackage.ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL:
				setReferredEnumLiteral((EnumerationLiteral)null);
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
			case PivotPackage.ENUM_LITERAL_EXP__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case PivotPackage.ENUM_LITERAL_EXP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.ENUM_LITERAL_EXP__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case PivotPackage.ENUM_LITERAL_EXP__IS_STATIC:
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case PivotPackage.ENUM_LITERAL_EXP__OWNED_ANNOTATION:
				return ownedAnnotations != null && !ownedAnnotations.isEmpty();
			case PivotPackage.ENUM_LITERAL_EXP__TYPE:
				return type != null;
			case PivotPackage.ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL:
				return referredEnumLiteral != null;
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
			case PivotPackage.ENUM_LITERAL_EXP___ALL_OWNED_ELEMENTS:
				return allOwnedElements();
			case PivotPackage.ENUM_LITERAL_EXP___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP:
				return validateNotOwnSelf((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case PivotPackage.ENUM_LITERAL_EXP___VALIDATE_TYPE_IS_ENUMERATION_TYPE__DIAGNOSTICCHAIN_MAP:
				return validateTypeIsEnumerationType((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

	@Override
	public <R, C> R accept(Visitor<R, C> visitor) {
		return visitor.visitEnumLiteralExp(this);
	}
} //EnumLiteralExpImpl
