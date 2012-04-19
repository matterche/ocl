/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
 * $Id: EnumerationLiteralImpl.java,v 1.3 2011/05/19 16:55:39 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.internal.impl;

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.examples.domain.elements.DomainEnumeration;
import org.eclipse.ocl.examples.domain.elements.DomainEnumerationLiteral;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.Comment;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Enumeration;
import org.eclipse.ocl.examples.pivot.EnumerationLiteral;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.EnumerationLiteralImpl#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.EnumerationLiteralImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationLiteralImpl
		extends NamedElementImpl
		implements EnumerationLiteral {

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VALUE_EDEFAULT = new BigInteger("0"); //$NON-NLS-1$
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected BigInteger value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotPackage.Literals.ENUMERATION_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration getEnumeration() {
		if (eContainerFeatureID() != PivotPackage.ENUMERATION_LITERAL__ENUMERATION) return null;
		return (Enumeration)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumeration(Enumeration newEnumeration,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnumeration, PivotPackage.ENUMERATION_LITERAL__ENUMERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumeration(Enumeration newEnumeration) {
		if (newEnumeration != eInternalContainer() || (eContainerFeatureID() != PivotPackage.ENUMERATION_LITERAL__ENUMERATION && newEnumeration != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newEnumeration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnumeration != null)
				msgs = ((InternalEObject)newEnumeration).eInverseAdd(this, PivotPackage.ENUMERATION__OWNED_LITERAL, Enumeration.class, msgs);
			msgs = basicSetEnumeration(newEnumeration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.ENUMERATION_LITERAL__ENUMERATION, newEnumeration, newEnumeration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getValue()
	{
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(BigInteger newValue)
	{
		BigInteger oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.ENUMERATION_LITERAL__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID)
		{
			case PivotPackage.ENUMERATION_LITERAL__OWNED_RULE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRule()).basicAdd(otherEnd, msgs);
			case PivotPackage.ENUMERATION_LITERAL__ENUMERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnumeration((Enumeration)otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
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
			case PivotPackage.ENUMERATION_LITERAL__OWNED_COMMENT:
				return ((InternalEList<?>)getOwnedComment()).basicRemove(otherEnd, msgs);
			case PivotPackage.ENUMERATION_LITERAL__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
			case PivotPackage.ENUMERATION_LITERAL__OWNED_ANNOTATION:
				return ((InternalEList<?>)getOwnedAnnotation()).basicRemove(otherEnd, msgs);
			case PivotPackage.ENUMERATION_LITERAL__ENUMERATION:
				return basicSetEnumeration(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID())
		{
			case PivotPackage.ENUMERATION_LITERAL__ENUMERATION:
				return eInternalContainer().eInverseRemove(this, PivotPackage.ENUMERATION__OWNED_LITERAL, Enumeration.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
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
			case PivotPackage.ENUMERATION_LITERAL__OWNED_COMMENT:
				return getOwnedComment();
			case PivotPackage.ENUMERATION_LITERAL__NAME:
				return getName();
			case PivotPackage.ENUMERATION_LITERAL__OWNED_RULE:
				return getOwnedRule();
			case PivotPackage.ENUMERATION_LITERAL__IS_STATIC:
				return isStatic();
			case PivotPackage.ENUMERATION_LITERAL__OWNED_ANNOTATION:
				return getOwnedAnnotation();
			case PivotPackage.ENUMERATION_LITERAL__ENUMERATION:
				return getEnumeration();
			case PivotPackage.ENUMERATION_LITERAL__VALUE:
				return getValue();
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
			case PivotPackage.ENUMERATION_LITERAL__OWNED_COMMENT:
				getOwnedComment().clear();
				getOwnedComment().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.ENUMERATION_LITERAL__NAME:
				setName((String)newValue);
				return;
			case PivotPackage.ENUMERATION_LITERAL__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
				return;
			case PivotPackage.ENUMERATION_LITERAL__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case PivotPackage.ENUMERATION_LITERAL__OWNED_ANNOTATION:
				getOwnedAnnotation().clear();
				getOwnedAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case PivotPackage.ENUMERATION_LITERAL__ENUMERATION:
				setEnumeration((Enumeration)newValue);
				return;
			case PivotPackage.ENUMERATION_LITERAL__VALUE:
				setValue((BigInteger)newValue);
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
			case PivotPackage.ENUMERATION_LITERAL__OWNED_COMMENT:
				getOwnedComment().clear();
				return;
			case PivotPackage.ENUMERATION_LITERAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotPackage.ENUMERATION_LITERAL__OWNED_RULE:
				getOwnedRule().clear();
				return;
			case PivotPackage.ENUMERATION_LITERAL__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case PivotPackage.ENUMERATION_LITERAL__OWNED_ANNOTATION:
				getOwnedAnnotation().clear();
				return;
			case PivotPackage.ENUMERATION_LITERAL__ENUMERATION:
				setEnumeration((Enumeration)null);
				return;
			case PivotPackage.ENUMERATION_LITERAL__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case PivotPackage.ENUMERATION_LITERAL__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case PivotPackage.ENUMERATION_LITERAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.ENUMERATION_LITERAL__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case PivotPackage.ENUMERATION_LITERAL__IS_STATIC:
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case PivotPackage.ENUMERATION_LITERAL__OWNED_ANNOTATION:
				return ownedAnnotation != null && !ownedAnnotation.isEmpty();
			case PivotPackage.ENUMERATION_LITERAL__ENUMERATION:
				return getEnumeration() != null;
			case PivotPackage.ENUMERATION_LITERAL__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString()
	{
		return super.toString();
	}

	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitEnumerationLiteral(this);
	}

	public Object asEcoreObject(DomainStandardLibrary standardLibrary) {
		DomainType normalizedType = getEnumeration().getNormalizedType(standardLibrary);
		DomainEnumeration normalizedEnumeration = (DomainEnumeration) normalizedType;
		DomainEnumerationLiteral enumerationLiteral = normalizedEnumeration.getEnumerationLiteral(getName());
		return enumerationLiteral.asEcoreObject(standardLibrary);
	}
} //EnumerationLiteralImpl
