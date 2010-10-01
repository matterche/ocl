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
 * $Id: VariableImpl.java,v 1.1.2.1 2010/10/01 13:49:56 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.Comment;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.EvaluationContext;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.VariableImpl#getInitExpression <em>Init Expression</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.VariableImpl#getRepresentedParameter <em>Represented Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends TypedElementImpl implements Variable
{
  /**
	 * The cached value of the '{@link #getInitExpression() <em>Init Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInitExpression()
	 * @generated
	 * @ordered
	 */
  protected OclExpression initExpression;

  /**
	 * The cached value of the '{@link #getRepresentedParameter() <em>Represented Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRepresentedParameter()
	 * @generated
	 * @ordered
	 */
  protected Parameter representedParameter;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected VariableImpl()
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
		return PivotPackage.Literals.VARIABLE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OclExpression getInitExpression()
  {
		if (initExpression != null && ((EObject)initExpression).eIsProxy())
		{
			InternalEObject oldInitExpression = (InternalEObject)initExpression;
			initExpression = (OclExpression)eResolveProxy(oldInitExpression);
			if (initExpression != oldInitExpression)
			{
				InternalEObject newInitExpression = (InternalEObject)initExpression;
				NotificationChain msgs = oldInitExpression.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PivotPackage.VARIABLE__INIT_EXPRESSION, null, null);
				if (newInitExpression.eInternalContainer() == null)
				{
					msgs = newInitExpression.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PivotPackage.VARIABLE__INIT_EXPRESSION, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotPackage.VARIABLE__INIT_EXPRESSION, oldInitExpression, initExpression));
			}
		}
		return initExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OclExpression basicGetInitExpression()
  {
		return initExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetInitExpression(OclExpression newInitExpression, NotificationChain msgs)
  {
		OclExpression oldInitExpression = initExpression;
		initExpression = newInitExpression;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PivotPackage.VARIABLE__INIT_EXPRESSION, oldInitExpression, newInitExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setInitExpression(OclExpression newInitExpression)
  {
		if (newInitExpression != initExpression)
		{
			NotificationChain msgs = null;
			if (initExpression != null)
				msgs = ((InternalEObject)initExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PivotPackage.VARIABLE__INIT_EXPRESSION, null, msgs);
			if (newInitExpression != null)
				msgs = ((InternalEObject)newInitExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PivotPackage.VARIABLE__INIT_EXPRESSION, null, msgs);
			msgs = basicSetInitExpression(newInitExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.VARIABLE__INIT_EXPRESSION, newInitExpression, newInitExpression));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OclExpression createInitExpression(EClass eClass)
  {
		OclExpression newInitExpression = (OclExpression) create(eClass);
		setInitExpression(newInitExpression);
		return newInitExpression;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression createInitExpression()
	{
		return createInitExpression(PivotPackage.Literals.OCL_EXPRESSION);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Parameter getRepresentedParameter()
  {
		if (representedParameter != null && ((EObject)representedParameter).eIsProxy())
		{
			InternalEObject oldRepresentedParameter = (InternalEObject)representedParameter;
			representedParameter = (Parameter)eResolveProxy(oldRepresentedParameter);
			if (representedParameter != oldRepresentedParameter)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotPackage.VARIABLE__REPRESENTED_PARAMETER, oldRepresentedParameter, representedParameter));
			}
		}
		return representedParameter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Parameter basicGetRepresentedParameter()
  {
		return representedParameter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRepresentedParameter(Parameter newRepresentedParameter)
  {
		Parameter oldRepresentedParameter = representedParameter;
		representedParameter = newRepresentedParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.VARIABLE__REPRESENTED_PARAMETER, oldRepresentedParameter, representedParameter));
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
			case PivotPackage.VARIABLE__OWNED_COMMENT:
				return ((InternalEList<?>)getOwnedComments()).basicRemove(otherEnd, msgs);
			case PivotPackage.VARIABLE__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRules()).basicRemove(otherEnd, msgs);
			case PivotPackage.VARIABLE__OWNED_ANNOTATION:
				return ((InternalEList<?>)getOwnedAnnotations()).basicRemove(otherEnd, msgs);
			case PivotPackage.VARIABLE__INIT_EXPRESSION:
				return basicSetInitExpression(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
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
			case PivotPackage.VARIABLE__OWNED_COMMENT:
				return getOwnedComments();
			case PivotPackage.VARIABLE__MONIKER:
				return getMoniker();
			case PivotPackage.VARIABLE__NAME:
				return getName();
			case PivotPackage.VARIABLE__OWNED_RULE:
				return getOwnedRules();
			case PivotPackage.VARIABLE__OWNED_ANNOTATION:
				return getOwnedAnnotations();
			case PivotPackage.VARIABLE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case PivotPackage.VARIABLE__INIT_EXPRESSION:
				if (resolve) return getInitExpression();
				return basicGetInitExpression();
			case PivotPackage.VARIABLE__REPRESENTED_PARAMETER:
				if (resolve) return getRepresentedParameter();
				return basicGetRepresentedParameter();
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
			case PivotPackage.VARIABLE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.VARIABLE__MONIKER:
				setMoniker((String)newValue);
				return;
			case PivotPackage.VARIABLE__NAME:
				setName((String)newValue);
				return;
			case PivotPackage.VARIABLE__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection<? extends Constraint>)newValue);
				return;
			case PivotPackage.VARIABLE__OWNED_ANNOTATION:
				getOwnedAnnotations().clear();
				getOwnedAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case PivotPackage.VARIABLE__TYPE:
				setType((Type)newValue);
				return;
			case PivotPackage.VARIABLE__INIT_EXPRESSION:
				setInitExpression((OclExpression)newValue);
				return;
			case PivotPackage.VARIABLE__REPRESENTED_PARAMETER:
				setRepresentedParameter((Parameter)newValue);
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
			case PivotPackage.VARIABLE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case PivotPackage.VARIABLE__MONIKER:
				setMoniker(MONIKER_EDEFAULT);
				return;
			case PivotPackage.VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotPackage.VARIABLE__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case PivotPackage.VARIABLE__OWNED_ANNOTATION:
				getOwnedAnnotations().clear();
				return;
			case PivotPackage.VARIABLE__TYPE:
				setType((Type)null);
				return;
			case PivotPackage.VARIABLE__INIT_EXPRESSION:
				setInitExpression((OclExpression)null);
				return;
			case PivotPackage.VARIABLE__REPRESENTED_PARAMETER:
				setRepresentedParameter((Parameter)null);
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
			case PivotPackage.VARIABLE__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case PivotPackage.VARIABLE__MONIKER:
				return MONIKER_EDEFAULT == null ? getMoniker() != null : !MONIKER_EDEFAULT.equals(getMoniker());
			case PivotPackage.VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.VARIABLE__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case PivotPackage.VARIABLE__OWNED_ANNOTATION:
				return ownedAnnotations != null && !ownedAnnotations.isEmpty();
			case PivotPackage.VARIABLE__TYPE:
				return type != null;
			case PivotPackage.VARIABLE__INIT_EXPRESSION:
				return initExpression != null;
			case PivotPackage.VARIABLE__REPRESENTED_PARAMETER:
				return representedParameter != null;
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
			case PivotPackage.VARIABLE___ACCEPT__VISITOR:
				return accept((Visitor)arguments.get(0));
			case PivotPackage.VARIABLE___OCL_TYPE:
				return oclType();
			case PivotPackage.VARIABLE___OCL_IS_INVALID:
				return oclIsInvalid();
			case PivotPackage.VARIABLE___OCL_IS_UNDEFINED:
				return oclIsUndefined();
			case PivotPackage.VARIABLE___HAS_MONIKER:
				return hasMoniker();
			case PivotPackage.VARIABLE___GET_NAME:
				return getName();
			case PivotPackage.VARIABLE___EVALUATE__EVALUATIONCONTEXT:
				return evaluate((EvaluationContext)arguments.get(0));
		}
		return eDynamicInvoke(operationID, arguments);
	}
	
	public Object evaluate(EvaluationContext context) {
		OclExpression expression = getInitExpression();
		return expression != null ? expression.evaluate(context) : null;
	}

} //VariableImpl
