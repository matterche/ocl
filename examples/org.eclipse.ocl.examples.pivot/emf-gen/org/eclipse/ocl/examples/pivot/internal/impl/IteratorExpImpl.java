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
 * $Id: IteratorExpImpl.java,v 1.1.2.1 2010/10/01 13:49:56 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.Comment;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.EvaluationContext;
import org.eclipse.ocl.examples.pivot.Iterator;
import org.eclipse.ocl.examples.pivot.IteratorExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iterator Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.IteratorExpImpl#getReferredIterator <em>Referred Iterator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IteratorExpImpl extends LoopExpImpl implements IteratorExp
{
  /**
	 * The cached value of the '{@link #getReferredIterator() <em>Referred Iterator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredIterator()
	 * @generated
	 * @ordered
	 */
	protected Iterator referredIterator;

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected IteratorExpImpl()
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
		return PivotPackage.Literals.ITERATOR_EXP;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterator getReferredIterator()
	{
		if (referredIterator != null && ((EObject)referredIterator).eIsProxy())
		{
			InternalEObject oldReferredIterator = (InternalEObject)referredIterator;
			referredIterator = (Iterator)eResolveProxy(oldReferredIterator);
			if (referredIterator != oldReferredIterator)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotPackage.ITERATOR_EXP__REFERRED_ITERATOR, oldReferredIterator, referredIterator));
			}
		}
		return referredIterator;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterator basicGetReferredIterator()
	{
		return referredIterator;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferredIterator(Iterator newReferredIterator)
	{
		Iterator oldReferredIterator = referredIterator;
		referredIterator = newReferredIterator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.ITERATOR_EXP__REFERRED_ITERATOR, oldReferredIterator, referredIterator));
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
			case PivotPackage.ITERATOR_EXP__OWNED_COMMENT:
				return getOwnedComments();
			case PivotPackage.ITERATOR_EXP__MONIKER:
				return getMoniker();
			case PivotPackage.ITERATOR_EXP__NAME:
				return getName();
			case PivotPackage.ITERATOR_EXP__OWNED_RULE:
				return getOwnedRules();
			case PivotPackage.ITERATOR_EXP__OWNED_ANNOTATION:
				return getOwnedAnnotations();
			case PivotPackage.ITERATOR_EXP__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case PivotPackage.ITERATOR_EXP__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case PivotPackage.ITERATOR_EXP__BODY:
				if (resolve) return getBody();
				return basicGetBody();
			case PivotPackage.ITERATOR_EXP__ITERATOR:
				return getIterators();
			case PivotPackage.ITERATOR_EXP__REFERRED_ITERATOR:
				if (resolve) return getReferredIterator();
				return basicGetReferredIterator();
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
			case PivotPackage.ITERATOR_EXP__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.ITERATOR_EXP__MONIKER:
				setMoniker((String)newValue);
				return;
			case PivotPackage.ITERATOR_EXP__NAME:
				setName((String)newValue);
				return;
			case PivotPackage.ITERATOR_EXP__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection<? extends Constraint>)newValue);
				return;
			case PivotPackage.ITERATOR_EXP__OWNED_ANNOTATION:
				getOwnedAnnotations().clear();
				getOwnedAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case PivotPackage.ITERATOR_EXP__TYPE:
				setType((Type)newValue);
				return;
			case PivotPackage.ITERATOR_EXP__SOURCE:
				setSource((OclExpression)newValue);
				return;
			case PivotPackage.ITERATOR_EXP__BODY:
				setBody((OclExpression)newValue);
				return;
			case PivotPackage.ITERATOR_EXP__ITERATOR:
				getIterators().clear();
				getIterators().addAll((Collection<? extends Variable>)newValue);
				return;
			case PivotPackage.ITERATOR_EXP__REFERRED_ITERATOR:
				setReferredIterator((Iterator)newValue);
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
			case PivotPackage.ITERATOR_EXP__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case PivotPackage.ITERATOR_EXP__MONIKER:
				setMoniker(MONIKER_EDEFAULT);
				return;
			case PivotPackage.ITERATOR_EXP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotPackage.ITERATOR_EXP__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case PivotPackage.ITERATOR_EXP__OWNED_ANNOTATION:
				getOwnedAnnotations().clear();
				return;
			case PivotPackage.ITERATOR_EXP__TYPE:
				setType((Type)null);
				return;
			case PivotPackage.ITERATOR_EXP__SOURCE:
				setSource((OclExpression)null);
				return;
			case PivotPackage.ITERATOR_EXP__BODY:
				setBody((OclExpression)null);
				return;
			case PivotPackage.ITERATOR_EXP__ITERATOR:
				getIterators().clear();
				return;
			case PivotPackage.ITERATOR_EXP__REFERRED_ITERATOR:
				setReferredIterator((Iterator)null);
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
			case PivotPackage.ITERATOR_EXP__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case PivotPackage.ITERATOR_EXP__MONIKER:
				return MONIKER_EDEFAULT == null ? getMoniker() != null : !MONIKER_EDEFAULT.equals(getMoniker());
			case PivotPackage.ITERATOR_EXP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.ITERATOR_EXP__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case PivotPackage.ITERATOR_EXP__OWNED_ANNOTATION:
				return ownedAnnotations != null && !ownedAnnotations.isEmpty();
			case PivotPackage.ITERATOR_EXP__TYPE:
				return type != null;
			case PivotPackage.ITERATOR_EXP__SOURCE:
				return source != null;
			case PivotPackage.ITERATOR_EXP__BODY:
				return body != null;
			case PivotPackage.ITERATOR_EXP__ITERATOR:
				return iterators != null && !iterators.isEmpty();
			case PivotPackage.ITERATOR_EXP__REFERRED_ITERATOR:
				return referredIterator != null;
		}
		return eDynamicIsSet(featureID);
	}
	
	@Override
	public Object evaluate(EvaluationContext context) {
		Iterator iterator = getReferredIterator();
		return iterator != null ? iterator.evaluate(context, this) : null;
	}

} //IteratorExpImpl
