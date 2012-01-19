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
 * $Id: CollectionItemImpl.java,v 1.4 2011/05/19 16:55:39 ewillink Exp $
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
import org.eclipse.ocl.examples.pivot.CollectionItem;
import org.eclipse.ocl.examples.pivot.Comment;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.PivotTables;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.bodies.CollectionItemBodies;
import org.eclipse.ocl.examples.pivot.util.PivotValidator;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ocl.examples.pivot.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.CollectionItemImpl#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionItemImpl
		extends CollectionLiteralPartImpl
		implements CollectionItem {

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected OclExpression item;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotPackage.Literals.COLLECTION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItem(OclExpression newItem,
			NotificationChain msgs) {
		OclExpression oldItem = item;
		item = newItem;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PivotPackage.COLLECTION_ITEM__ITEM, oldItem, newItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(OclExpression newItem) {
		if (newItem != item)
		{
			NotificationChain msgs = null;
			if (item != null)
				msgs = ((InternalEObject)item).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PivotPackage.COLLECTION_ITEM__ITEM, null, msgs);
			if (newItem != null)
				msgs = ((InternalEObject)newItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PivotPackage.COLLECTION_ITEM__ITEM, null, msgs);
			msgs = basicSetItem(newItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.COLLECTION_ITEM__ITEM, newItem, newItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression createItem(EClass eClass) {
		OclExpression newItem = (OclExpression) create(eClass);
		setItem(newItem);
		return newItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeIsItemType(DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		/*
		type = item.type
		*/
		try {
			final DomainEvaluator evaluator = new EcoreExecutorManager(this, PivotTables.LIBRARY);
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final Value self = valueFactory.valueOf(this);
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			
			final DomainType returnType = T_Boolean;
			final Value result = CollectionItemBodies._invariant_TypeIsItemType.INSTANCE.evaluate(evaluator, returnType, self);
			final boolean resultIsNull = result.isNull();
			if (!resultIsNull && result.asBoolean()) {	// true => true, false/null => dropthrough, invalid => exception
				return true;
			}
			if (diagnostics != null) {
				int severity = resultIsNull ? Diagnostic.ERROR : Diagnostic.WARNING;
				String message = NLS.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"CollectionItem", "TypeIsItemType", EObjectValidator.getObjectLabel(this, context)});
			    diagnostics.add(new BasicDiagnostic(severity, PivotValidator.DIAGNOSTIC_SOURCE, PivotValidator.COLLECTION_ITEM__TYPE_IS_ITEM_TYPE, message, new Object [] { this }));
			}
			return false;
		} catch (InvalidValueException e) {
			String message = NLS.bind(EvaluatorMessages.ValidationEvaluationFailed_ERROR_, new Object[]{"CollectionItem", "TypeIsItemType", EObjectValidator.getObjectLabel(this, context)});
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
			case PivotPackage.COLLECTION_ITEM__OWNED_COMMENT:
				return ((InternalEList<?>)getOwnedComments()).basicRemove(otherEnd, msgs);
			case PivotPackage.COLLECTION_ITEM__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRules()).basicRemove(otherEnd, msgs);
			case PivotPackage.COLLECTION_ITEM__OWNED_ANNOTATION:
				return ((InternalEList<?>)getOwnedAnnotations()).basicRemove(otherEnd, msgs);
			case PivotPackage.COLLECTION_ITEM__ITEM:
				return basicSetItem(null, msgs);
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
			case PivotPackage.COLLECTION_ITEM__OWNED_COMMENT:
				return getOwnedComments();
			case PivotPackage.COLLECTION_ITEM__NAME:
				return getName();
			case PivotPackage.COLLECTION_ITEM__OWNED_RULE:
				return getOwnedRules();
			case PivotPackage.COLLECTION_ITEM__IS_STATIC:
				return isStatic();
			case PivotPackage.COLLECTION_ITEM__OWNED_ANNOTATION:
				return getOwnedAnnotations();
			case PivotPackage.COLLECTION_ITEM__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case PivotPackage.COLLECTION_ITEM__ITEM:
				return getItem();
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
			case PivotPackage.COLLECTION_ITEM__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.COLLECTION_ITEM__NAME:
				setName((String)newValue);
				return;
			case PivotPackage.COLLECTION_ITEM__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection<? extends Constraint>)newValue);
				return;
			case PivotPackage.COLLECTION_ITEM__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case PivotPackage.COLLECTION_ITEM__OWNED_ANNOTATION:
				getOwnedAnnotations().clear();
				getOwnedAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case PivotPackage.COLLECTION_ITEM__TYPE:
				setType((Type)newValue);
				return;
			case PivotPackage.COLLECTION_ITEM__ITEM:
				setItem((OclExpression)newValue);
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
			case PivotPackage.COLLECTION_ITEM__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case PivotPackage.COLLECTION_ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotPackage.COLLECTION_ITEM__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case PivotPackage.COLLECTION_ITEM__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case PivotPackage.COLLECTION_ITEM__OWNED_ANNOTATION:
				getOwnedAnnotations().clear();
				return;
			case PivotPackage.COLLECTION_ITEM__TYPE:
				setType((Type)null);
				return;
			case PivotPackage.COLLECTION_ITEM__ITEM:
				setItem((OclExpression)null);
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
			case PivotPackage.COLLECTION_ITEM__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case PivotPackage.COLLECTION_ITEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.COLLECTION_ITEM__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case PivotPackage.COLLECTION_ITEM__IS_STATIC:
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case PivotPackage.COLLECTION_ITEM__OWNED_ANNOTATION:
				return ownedAnnotations != null && !ownedAnnotations.isEmpty();
			case PivotPackage.COLLECTION_ITEM__TYPE:
				return type != null;
			case PivotPackage.COLLECTION_ITEM__ITEM:
				return item != null;
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
			case PivotPackage.COLLECTION_ITEM___ALL_OWNED_ELEMENTS:
				return allOwnedElements();
			case PivotPackage.COLLECTION_ITEM___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP:
				return validateNotOwnSelf((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case PivotPackage.COLLECTION_ITEM___VALIDATE_TYPE_IS_ITEM_TYPE__DIAGNOSTICCHAIN_MAP:
				return validateTypeIsItemType((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

	@Override
	public <R, C> R accept(Visitor<R, C> visitor) {
		return visitor.visitCollectionItem(this);
	}
} //CollectionItemImpl
