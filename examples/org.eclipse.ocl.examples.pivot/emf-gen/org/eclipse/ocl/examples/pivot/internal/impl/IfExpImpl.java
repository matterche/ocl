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
 * $Id: IfExpImpl.java,v 1.4 2011/05/19 16:55:39 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;
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
import org.eclipse.ocl.examples.pivot.IfExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.PivotTables;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.bodies.IfExpBodies;
import org.eclipse.ocl.examples.pivot.util.PivotValidator;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ocl.examples.pivot.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.IfExpImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.IfExpImpl#getThenExpression <em>Then Expression</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.IfExpImpl#getElseExpression <em>Else Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfExpImpl
		extends OclExpressionImpl
		implements IfExp {

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected OclExpression condition;

	/**
	 * The cached value of the '{@link #getThenExpression() <em>Then Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenExpression()
	 * @generated
	 * @ordered
	 */
	protected OclExpression thenExpression;

	/**
	 * The cached value of the '{@link #getElseExpression() <em>Else Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseExpression()
	 * @generated
	 * @ordered
	 */
	protected OclExpression elseExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotPackage.Literals.IF_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(OclExpression newCondition,
			NotificationChain msgs) {
		OclExpression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PivotPackage.IF_EXP__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(OclExpression newCondition) {
		if (newCondition != condition)
		{
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PivotPackage.IF_EXP__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PivotPackage.IF_EXP__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.IF_EXP__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression createCondition(EClass eClass) {
		OclExpression newCondition = (OclExpression) create(eClass);
		setCondition(newCondition);
		return newCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getThenExpression() {
		return thenExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThenExpression(
			OclExpression newThenExpression, NotificationChain msgs) {
		OclExpression oldThenExpression = thenExpression;
		thenExpression = newThenExpression;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PivotPackage.IF_EXP__THEN_EXPRESSION, oldThenExpression, newThenExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenExpression(OclExpression newThenExpression) {
		if (newThenExpression != thenExpression)
		{
			NotificationChain msgs = null;
			if (thenExpression != null)
				msgs = ((InternalEObject)thenExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PivotPackage.IF_EXP__THEN_EXPRESSION, null, msgs);
			if (newThenExpression != null)
				msgs = ((InternalEObject)newThenExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PivotPackage.IF_EXP__THEN_EXPRESSION, null, msgs);
			msgs = basicSetThenExpression(newThenExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.IF_EXP__THEN_EXPRESSION, newThenExpression, newThenExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression createThenExpression(EClass eClass) {
		OclExpression newThenExpression = (OclExpression) create(eClass);
		setThenExpression(newThenExpression);
		return newThenExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getElseExpression() {
		return elseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseExpression(
			OclExpression newElseExpression, NotificationChain msgs) {
		OclExpression oldElseExpression = elseExpression;
		elseExpression = newElseExpression;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PivotPackage.IF_EXP__ELSE_EXPRESSION, oldElseExpression, newElseExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseExpression(OclExpression newElseExpression) {
		if (newElseExpression != elseExpression)
		{
			NotificationChain msgs = null;
			if (elseExpression != null)
				msgs = ((InternalEObject)elseExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PivotPackage.IF_EXP__ELSE_EXPRESSION, null, msgs);
			if (newElseExpression != null)
				msgs = ((InternalEObject)newElseExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PivotPackage.IF_EXP__ELSE_EXPRESSION, null, msgs);
			msgs = basicSetElseExpression(newElseExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.IF_EXP__ELSE_EXPRESSION, newElseExpression, newElseExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression createElseExpression(EClass eClass) {
		OclExpression newElseExpression = (OclExpression) create(eClass);
		setElseExpression(newElseExpression);
		return newElseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionTypeIsBoolean(DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		/*
		self.condition.type = Boolean
		*/
		try {
			final DomainEvaluator evaluator = new EcoreExecutorManager(this, null, PivotTables.LIBRARY);
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final Value self = valueFactory.valueOf(this);
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			
			final DomainType returnType = T_Boolean;
			final Value result = IfExpBodies._invariant_ConditionTypeIsBoolean.INSTANCE.evaluate(evaluator, returnType, self);
			final boolean resultIsNull = result.isNull();
			if (!resultIsNull && result.asBoolean()) {	// true => true, false/null => dropthrough, invalid => exception
				return true;
			}
			if (diagnostics != null) {
				int severity = resultIsNull ? Diagnostic.ERROR : Diagnostic.WARNING;
				String message = NLS.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"IfExp", "ConditionTypeIsBoolean", EObjectValidator.getObjectLabel(this, context)});
			    diagnostics.add(new BasicDiagnostic(severity, PivotValidator.DIAGNOSTIC_SOURCE, PivotValidator.IF_EXP__CONDITION_TYPE_IS_BOOLEAN, message, new Object [] { this }));
			}
			return false;
		} catch (InvalidValueException e) {
			String message = NLS.bind(EvaluatorMessages.ValidationEvaluationFailed_ERROR_, new Object[]{"IfExp", "ConditionTypeIsBoolean", EObjectValidator.getObjectLabel(this, context)});
			throw new WrappedException(message, e);
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID)
		{
			case PivotPackage.IF_EXP__OWNED_COMMENT:
				return ((InternalEList<?>)getOwnedComment()).basicRemove(otherEnd, msgs);
			case PivotPackage.IF_EXP__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
			case PivotPackage.IF_EXP__OWNED_ANNOTATION:
				return ((InternalEList<?>)getOwnedAnnotation()).basicRemove(otherEnd, msgs);
			case PivotPackage.IF_EXP__CONDITION:
				return basicSetCondition(null, msgs);
			case PivotPackage.IF_EXP__THEN_EXPRESSION:
				return basicSetThenExpression(null, msgs);
			case PivotPackage.IF_EXP__ELSE_EXPRESSION:
				return basicSetElseExpression(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
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
			case PivotPackage.IF_EXP__OWNED_COMMENT:
				return getOwnedComment();
			case PivotPackage.IF_EXP__NAME:
				return getName();
			case PivotPackage.IF_EXP__OWNED_RULE:
				return getOwnedRule();
			case PivotPackage.IF_EXP__IS_STATIC:
				return isStatic();
			case PivotPackage.IF_EXP__OWNED_ANNOTATION:
				return getOwnedAnnotation();
			case PivotPackage.IF_EXP__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case PivotPackage.IF_EXP__CONDITION:
				return getCondition();
			case PivotPackage.IF_EXP__THEN_EXPRESSION:
				return getThenExpression();
			case PivotPackage.IF_EXP__ELSE_EXPRESSION:
				return getElseExpression();
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
			case PivotPackage.IF_EXP__OWNED_COMMENT:
				getOwnedComment().clear();
				getOwnedComment().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.IF_EXP__NAME:
				setName((String)newValue);
				return;
			case PivotPackage.IF_EXP__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
				return;
			case PivotPackage.IF_EXP__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case PivotPackage.IF_EXP__OWNED_ANNOTATION:
				getOwnedAnnotation().clear();
				getOwnedAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case PivotPackage.IF_EXP__TYPE:
				setType((Type)newValue);
				return;
			case PivotPackage.IF_EXP__CONDITION:
				setCondition((OclExpression)newValue);
				return;
			case PivotPackage.IF_EXP__THEN_EXPRESSION:
				setThenExpression((OclExpression)newValue);
				return;
			case PivotPackage.IF_EXP__ELSE_EXPRESSION:
				setElseExpression((OclExpression)newValue);
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
			case PivotPackage.IF_EXP__OWNED_COMMENT:
				getOwnedComment().clear();
				return;
			case PivotPackage.IF_EXP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotPackage.IF_EXP__OWNED_RULE:
				getOwnedRule().clear();
				return;
			case PivotPackage.IF_EXP__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case PivotPackage.IF_EXP__OWNED_ANNOTATION:
				getOwnedAnnotation().clear();
				return;
			case PivotPackage.IF_EXP__TYPE:
				setType((Type)null);
				return;
			case PivotPackage.IF_EXP__CONDITION:
				setCondition((OclExpression)null);
				return;
			case PivotPackage.IF_EXP__THEN_EXPRESSION:
				setThenExpression((OclExpression)null);
				return;
			case PivotPackage.IF_EXP__ELSE_EXPRESSION:
				setElseExpression((OclExpression)null);
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
			case PivotPackage.IF_EXP__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case PivotPackage.IF_EXP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.IF_EXP__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case PivotPackage.IF_EXP__IS_STATIC:
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case PivotPackage.IF_EXP__OWNED_ANNOTATION:
				return ownedAnnotation != null && !ownedAnnotation.isEmpty();
			case PivotPackage.IF_EXP__TYPE:
				return type != null;
			case PivotPackage.IF_EXP__CONDITION:
				return condition != null;
			case PivotPackage.IF_EXP__THEN_EXPRESSION:
				return thenExpression != null;
			case PivotPackage.IF_EXP__ELSE_EXPRESSION:
				return elseExpression != null;
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
			case PivotPackage.IF_EXP___ALL_OWNED_ELEMENTS:
				return allOwnedElements();
			case PivotPackage.IF_EXP___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP:
				return validateNotOwnSelf((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case PivotPackage.IF_EXP___VALIDATE_CONDITION_TYPE_IS_BOOLEAN__DIAGNOSTICCHAIN_MAP:
				return validateConditionTypeIsBoolean((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitIfExp(this);
	}
} //IfExpImpl
