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
 * $Id: MessageExpImpl.java,v 1.4 2011/05/19 16:55:39 ewillink Exp $
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
import org.eclipse.ocl.examples.pivot.CallOperationAction;
import org.eclipse.ocl.examples.pivot.Comment;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.MessageExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.PivotTables;
import org.eclipse.ocl.examples.pivot.SendSignalAction;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.bodies.MessageExpBodies;
import org.eclipse.ocl.examples.pivot.util.PivotValidator;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ocl.examples.pivot.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.MessageExpImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.MessageExpImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.MessageExpImpl#getCalledOperation <em>Called Operation</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.MessageExpImpl#getSentSignal <em>Sent Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageExpImpl
		extends OclExpressionImpl
		implements MessageExp {

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected OclExpression target;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<OclExpression> argument;

	/**
	 * The cached value of the '{@link #getCalledOperation() <em>Called Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledOperation()
	 * @generated
	 * @ordered
	 */
	protected CallOperationAction calledOperation;

	/**
	 * The cached value of the '{@link #getSentSignal() <em>Sent Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentSignal()
	 * @generated
	 * @ordered
	 */
	protected SendSignalAction sentSignal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotPackage.Literals.MESSAGE_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OclExpression getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(OclExpression newTarget,
			NotificationChain msgs) {
		OclExpression oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PivotPackage.MESSAGE_EXP__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(OclExpression newTarget) {
		if (newTarget != target)
		{
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PivotPackage.MESSAGE_EXP__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PivotPackage.MESSAGE_EXP__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.MESSAGE_EXP__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression createTarget(EClass eClass) {
		OclExpression newTarget = (OclExpression) create(eClass);
		setTarget(newTarget);
		return newTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OclExpression> getArgument()
	{
		if (argument == null)
		{
			argument = new EObjectContainmentEList<OclExpression>(OclExpression.class, this, PivotPackage.MESSAGE_EXP__ARGUMENT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression createArgument(EClass eClass) {
		OclExpression newArgument = (OclExpression) create(eClass);
		getArgument().add(newArgument);
		return newArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOperationAction getCalledOperation() {
		return calledOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalledOperation(
			CallOperationAction newCalledOperation, NotificationChain msgs) {
		CallOperationAction oldCalledOperation = calledOperation;
		calledOperation = newCalledOperation;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PivotPackage.MESSAGE_EXP__CALLED_OPERATION, oldCalledOperation, newCalledOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledOperation(CallOperationAction newCalledOperation) {
		if (newCalledOperation != calledOperation)
		{
			NotificationChain msgs = null;
			if (calledOperation != null)
				msgs = ((InternalEObject)calledOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PivotPackage.MESSAGE_EXP__CALLED_OPERATION, null, msgs);
			if (newCalledOperation != null)
				msgs = ((InternalEObject)newCalledOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PivotPackage.MESSAGE_EXP__CALLED_OPERATION, null, msgs);
			msgs = basicSetCalledOperation(newCalledOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.MESSAGE_EXP__CALLED_OPERATION, newCalledOperation, newCalledOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOperationAction createCalledOperation() {
		CallOperationAction newCalledOperation = (CallOperationAction) create(PivotPackage.Literals.CALL_OPERATION_ACTION);
		setCalledOperation(newCalledOperation);
		return newCalledOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendSignalAction getSentSignal() {
		return sentSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSentSignal(SendSignalAction newSentSignal,
			NotificationChain msgs) {
		SendSignalAction oldSentSignal = sentSignal;
		sentSignal = newSentSignal;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PivotPackage.MESSAGE_EXP__SENT_SIGNAL, oldSentSignal, newSentSignal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSentSignal(SendSignalAction newSentSignal) {
		if (newSentSignal != sentSignal)
		{
			NotificationChain msgs = null;
			if (sentSignal != null)
				msgs = ((InternalEObject)sentSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PivotPackage.MESSAGE_EXP__SENT_SIGNAL, null, msgs);
			if (newSentSignal != null)
				msgs = ((InternalEObject)newSentSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PivotPackage.MESSAGE_EXP__SENT_SIGNAL, null, msgs);
			msgs = basicSetSentSignal(newSentSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.MESSAGE_EXP__SENT_SIGNAL, newSentSignal, newSentSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendSignalAction createSentSignal() {
		SendSignalAction newSentSignal = (SendSignalAction) create(PivotPackage.Literals.SEND_SIGNAL_ACTION);
		setSentSignal(newSentSignal);
		return newSentSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetIsNotACollection(DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		/*
		not target.type.oclIsKindOf(CollectionType)
		*/
		try {
			final DomainEvaluator evaluator = new EcoreExecutorManager(this, null, PivotTables.LIBRARY);
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final Value self = valueFactory.valueOf(this);
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			
			final DomainType returnType = T_Boolean;
			final Value result = MessageExpBodies._invariant_TargetIsNotACollection.INSTANCE.evaluate(evaluator, returnType, self);
			final boolean resultIsNull = result.isNull();
			if (!resultIsNull && result.asBoolean()) {	// true => true, false/null => dropthrough, invalid => exception
				return true;
			}
			if (diagnostics != null) {
				int severity = resultIsNull ? Diagnostic.ERROR : Diagnostic.WARNING;
				String message = NLS.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"MessageExp", "TargetIsNotACollection", EObjectValidator.getObjectLabel(this, context)});
			    diagnostics.add(new BasicDiagnostic(severity, PivotValidator.DIAGNOSTIC_SOURCE, PivotValidator.MESSAGE_EXP__TARGET_IS_NOT_ACOLLECTION, message, new Object [] { this }));
			}
			return false;
		} catch (InvalidValueException e) {
			String message = NLS.bind(EvaluatorMessages.ValidationEvaluationFailed_ERROR_, new Object[]{"MessageExp", "TargetIsNotACollection", EObjectValidator.getObjectLabel(this, context)});
			throw new WrappedException(message, e);
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneCallOrOneSend(DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		/*
		calledOperation->size() + sentSignal->size() = 1
		*/
		try {
			final DomainEvaluator evaluator = new EcoreExecutorManager(this, null, PivotTables.LIBRARY);
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final Value self = valueFactory.valueOf(this);
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			
			final DomainType returnType = T_Boolean;
			final Value result = MessageExpBodies._invariant_OneCallOrOneSend.INSTANCE.evaluate(evaluator, returnType, self);
			final boolean resultIsNull = result.isNull();
			if (!resultIsNull && result.asBoolean()) {	// true => true, false/null => dropthrough, invalid => exception
				return true;
			}
			if (diagnostics != null) {
				int severity = resultIsNull ? Diagnostic.ERROR : Diagnostic.WARNING;
				String message = NLS.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"MessageExp", "OneCallOrOneSend", EObjectValidator.getObjectLabel(this, context)});
			    diagnostics.add(new BasicDiagnostic(severity, PivotValidator.DIAGNOSTIC_SOURCE, PivotValidator.MESSAGE_EXP__ONE_CALL_OR_ONE_SEND, message, new Object [] { this }));
			}
			return false;
		} catch (InvalidValueException e) {
			String message = NLS.bind(EvaluatorMessages.ValidationEvaluationFailed_ERROR_, new Object[]{"MessageExp", "OneCallOrOneSend", EObjectValidator.getObjectLabel(this, context)});
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
			case PivotPackage.MESSAGE_EXP__OWNED_COMMENT:
				return ((InternalEList<?>)getOwnedComment()).basicRemove(otherEnd, msgs);
			case PivotPackage.MESSAGE_EXP__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
			case PivotPackage.MESSAGE_EXP__OWNED_ANNOTATION:
				return ((InternalEList<?>)getOwnedAnnotation()).basicRemove(otherEnd, msgs);
			case PivotPackage.MESSAGE_EXP__TARGET:
				return basicSetTarget(null, msgs);
			case PivotPackage.MESSAGE_EXP__ARGUMENT:
				return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
			case PivotPackage.MESSAGE_EXP__CALLED_OPERATION:
				return basicSetCalledOperation(null, msgs);
			case PivotPackage.MESSAGE_EXP__SENT_SIGNAL:
				return basicSetSentSignal(null, msgs);
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
			case PivotPackage.MESSAGE_EXP__OWNED_COMMENT:
				return getOwnedComment();
			case PivotPackage.MESSAGE_EXP__NAME:
				return getName();
			case PivotPackage.MESSAGE_EXP__OWNED_RULE:
				return getOwnedRule();
			case PivotPackage.MESSAGE_EXP__IS_STATIC:
				return isStatic();
			case PivotPackage.MESSAGE_EXP__OWNED_ANNOTATION:
				return getOwnedAnnotation();
			case PivotPackage.MESSAGE_EXP__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case PivotPackage.MESSAGE_EXP__TARGET:
				return getTarget();
			case PivotPackage.MESSAGE_EXP__ARGUMENT:
				return getArgument();
			case PivotPackage.MESSAGE_EXP__CALLED_OPERATION:
				return getCalledOperation();
			case PivotPackage.MESSAGE_EXP__SENT_SIGNAL:
				return getSentSignal();
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
			case PivotPackage.MESSAGE_EXP__OWNED_COMMENT:
				getOwnedComment().clear();
				getOwnedComment().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.MESSAGE_EXP__NAME:
				setName((String)newValue);
				return;
			case PivotPackage.MESSAGE_EXP__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
				return;
			case PivotPackage.MESSAGE_EXP__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case PivotPackage.MESSAGE_EXP__OWNED_ANNOTATION:
				getOwnedAnnotation().clear();
				getOwnedAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case PivotPackage.MESSAGE_EXP__TYPE:
				setType((Type)newValue);
				return;
			case PivotPackage.MESSAGE_EXP__TARGET:
				setTarget((OclExpression)newValue);
				return;
			case PivotPackage.MESSAGE_EXP__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends OclExpression>)newValue);
				return;
			case PivotPackage.MESSAGE_EXP__CALLED_OPERATION:
				setCalledOperation((CallOperationAction)newValue);
				return;
			case PivotPackage.MESSAGE_EXP__SENT_SIGNAL:
				setSentSignal((SendSignalAction)newValue);
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
			case PivotPackage.MESSAGE_EXP__OWNED_COMMENT:
				getOwnedComment().clear();
				return;
			case PivotPackage.MESSAGE_EXP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotPackage.MESSAGE_EXP__OWNED_RULE:
				getOwnedRule().clear();
				return;
			case PivotPackage.MESSAGE_EXP__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case PivotPackage.MESSAGE_EXP__OWNED_ANNOTATION:
				getOwnedAnnotation().clear();
				return;
			case PivotPackage.MESSAGE_EXP__TYPE:
				setType((Type)null);
				return;
			case PivotPackage.MESSAGE_EXP__TARGET:
				setTarget((OclExpression)null);
				return;
			case PivotPackage.MESSAGE_EXP__ARGUMENT:
				getArgument().clear();
				return;
			case PivotPackage.MESSAGE_EXP__CALLED_OPERATION:
				setCalledOperation((CallOperationAction)null);
				return;
			case PivotPackage.MESSAGE_EXP__SENT_SIGNAL:
				setSentSignal((SendSignalAction)null);
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
			case PivotPackage.MESSAGE_EXP__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case PivotPackage.MESSAGE_EXP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.MESSAGE_EXP__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case PivotPackage.MESSAGE_EXP__IS_STATIC:
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case PivotPackage.MESSAGE_EXP__OWNED_ANNOTATION:
				return ownedAnnotation != null && !ownedAnnotation.isEmpty();
			case PivotPackage.MESSAGE_EXP__TYPE:
				return type != null;
			case PivotPackage.MESSAGE_EXP__TARGET:
				return target != null;
			case PivotPackage.MESSAGE_EXP__ARGUMENT:
				return argument != null && !argument.isEmpty();
			case PivotPackage.MESSAGE_EXP__CALLED_OPERATION:
				return calledOperation != null;
			case PivotPackage.MESSAGE_EXP__SENT_SIGNAL:
				return sentSignal != null;
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
			case PivotPackage.MESSAGE_EXP___ALL_OWNED_ELEMENTS:
				return allOwnedElements();
			case PivotPackage.MESSAGE_EXP___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP:
				return validateNotOwnSelf((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case PivotPackage.MESSAGE_EXP___VALIDATE_ONE_CALL_OR_ONE_SEND__DIAGNOSTICCHAIN_MAP:
				return validateOneCallOrOneSend((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case PivotPackage.MESSAGE_EXP___VALIDATE_TARGET_IS_NOT_ACOLLECTION__DIAGNOSTICCHAIN_MAP:
				return validateTargetIsNotACollection((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitMessageExp(this);
	}
} //MessageExpImpl
