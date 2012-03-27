/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl;

import java.util.Collections;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.xtext.base.baseCST.QualifiedNamedElementRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.impl.ModelElementCSImpl;
import org.eclipse.ocl.examples.xtext.base.util.BaseCSVisitor;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.NamedElementDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.util.CompleteOCLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element Decl CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.NamedElementDeclCSImpl#getQualifiedElementRef <em>Qualified Element Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NamedElementDeclCSImpl extends ModelElementCSImpl implements NamedElementDeclCS
{
	/**
	 * The cached value of the '{@link #getQualifiedElementRef() <em>Qualified Element Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedElementRef()
	 * @generated
	 * @ordered
	 */
	protected QualifiedNamedElementRefCS qualifiedElementRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementDeclCSImpl()
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
		return CompleteOCLCSTPackage.Literals.NAMED_ELEMENT_DECL_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedNamedElementRefCS getQualifiedElementRef()
	{
		return qualifiedElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualifiedElementRef(QualifiedNamedElementRefCS newQualifiedElementRef, NotificationChain msgs)
	{
		QualifiedNamedElementRefCS oldQualifiedElementRef = qualifiedElementRef;
		qualifiedElementRef = newQualifiedElementRef;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompleteOCLCSTPackage.NAMED_ELEMENT_DECL_CS__QUALIFIED_ELEMENT_REF, oldQualifiedElementRef, newQualifiedElementRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedElementRef(QualifiedNamedElementRefCS newQualifiedElementRef)
	{
		if (newQualifiedElementRef != qualifiedElementRef)
		{
			NotificationChain msgs = null;
			if (qualifiedElementRef != null)
				msgs = ((InternalEObject)qualifiedElementRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompleteOCLCSTPackage.NAMED_ELEMENT_DECL_CS__QUALIFIED_ELEMENT_REF, null, msgs);
			if (newQualifiedElementRef != null)
				msgs = ((InternalEObject)newQualifiedElementRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CompleteOCLCSTPackage.NAMED_ELEMENT_DECL_CS__QUALIFIED_ELEMENT_REF, null, msgs);
			msgs = basicSetQualifiedElementRef(newQualifiedElementRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteOCLCSTPackage.NAMED_ELEMENT_DECL_CS__QUALIFIED_ELEMENT_REF, newQualifiedElementRef, newQualifiedElementRef));
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
			case CompleteOCLCSTPackage.NAMED_ELEMENT_DECL_CS__QUALIFIED_ELEMENT_REF:
				return basicSetQualifiedElementRef(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case CompleteOCLCSTPackage.NAMED_ELEMENT_DECL_CS__QUALIFIED_ELEMENT_REF:
				return getQualifiedElementRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case CompleteOCLCSTPackage.NAMED_ELEMENT_DECL_CS__QUALIFIED_ELEMENT_REF:
				setQualifiedElementRef((QualifiedNamedElementRefCS)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case CompleteOCLCSTPackage.NAMED_ELEMENT_DECL_CS__QUALIFIED_ELEMENT_REF:
				setQualifiedElementRef((QualifiedNamedElementRefCS)null);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case CompleteOCLCSTPackage.NAMED_ELEMENT_DECL_CS__QUALIFIED_ELEMENT_REF:
				return qualifiedElementRef != null;
		}
		return super.eIsSet(featureID);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <R, C> R accept(BaseCSVisitor<R, C> visitor) {
		return (R) visitor.getAdapter(CompleteOCLCSVisitor.class).visitNamedElementDeclCS(this);
	}

	public Iterable<Element> getMorePivots() {
		if (qualifiedElementRef == null) {
			return Collections.<Element>emptyList();
		}
		NamedElement pNamedElement = qualifiedElementRef.getElement();
		if (pNamedElement == null) {
			return Collections.<Element>emptyList();
		}
		return Collections.<Element>singletonList(pNamedElement);
	}
} //NamedElementDeclCSImpl
