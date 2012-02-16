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
package org.eclipse.ocl.examples.xtext.base.baseCST.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathNameCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.SimpleNamedElementRefCS;
import org.eclipse.ocl.examples.xtext.base.util.BaseCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Named Element Ref CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.SimpleNamedElementRefCSImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.SimpleNamedElementRefCSImpl#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleNamedElementRefCSImpl extends ElementCSImpl implements SimpleNamedElementRefCS
{
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected NamedElement element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleNamedElementRefCSImpl()
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
		return BaseCSTPackage.Literals.SIMPLE_NAMED_ELEMENT_REF_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathNameCS getQualifiedName()
	{
		if (eContainerFeatureID() != BaseCSTPackage.SIMPLE_NAMED_ELEMENT_REF_CS__QUALIFIED_NAME) return null;
		return (PathNameCS)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualifiedName(PathNameCS newQualifiedName, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newQualifiedName, BaseCSTPackage.SIMPLE_NAMED_ELEMENT_REF_CS__QUALIFIED_NAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedName(PathNameCS newQualifiedName)
	{
		if (newQualifiedName != eInternalContainer() || (eContainerFeatureID() != BaseCSTPackage.SIMPLE_NAMED_ELEMENT_REF_CS__QUALIFIED_NAME && newQualifiedName != null))
		{
			if (EcoreUtil.isAncestor(this, newQualifiedName))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newQualifiedName != null)
				msgs = ((InternalEObject)newQualifiedName).eInverseAdd(this, BaseCSTPackage.PATH_NAME_CS__PATH, PathNameCS.class, msgs);
			msgs = basicSetQualifiedName(newQualifiedName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaseCSTPackage.SIMPLE_NAMED_ELEMENT_REF_CS__QUALIFIED_NAME, newQualifiedName, newQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getElement()
	{
		if (element != null && ((EObject)element).eIsProxy())
		{
			InternalEObject oldElement = (InternalEObject)element;
			element = (NamedElement)eResolveProxy(oldElement);
			if (element != oldElement)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BaseCSTPackage.SIMPLE_NAMED_ELEMENT_REF_CS__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetElement()
	{
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(NamedElement newElement)
	{
		NamedElement oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaseCSTPackage.SIMPLE_NAMED_ELEMENT_REF_CS__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case BaseCSTPackage.SIMPLE_NAMED_ELEMENT_REF_CS__QUALIFIED_NAME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetQualifiedName((PathNameCS)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case BaseCSTPackage.SIMPLE_NAMED_ELEMENT_REF_CS__QUALIFIED_NAME:
				return basicSetQualifiedName(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case BaseCSTPackage.SIMPLE_NAMED_ELEMENT_REF_CS__QUALIFIED_NAME:
				return eInternalContainer().eInverseRemove(this, BaseCSTPackage.PATH_NAME_CS__PATH, PathNameCS.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case BaseCSTPackage.SIMPLE_NAMED_ELEMENT_REF_CS__QUALIFIED_NAME:
				return getQualifiedName();
			case BaseCSTPackage.SIMPLE_NAMED_ELEMENT_REF_CS__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
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
			case BaseCSTPackage.SIMPLE_NAMED_ELEMENT_REF_CS__QUALIFIED_NAME:
				setQualifiedName((PathNameCS)newValue);
				return;
			case BaseCSTPackage.SIMPLE_NAMED_ELEMENT_REF_CS__ELEMENT:
				setElement((NamedElement)newValue);
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
			case BaseCSTPackage.SIMPLE_NAMED_ELEMENT_REF_CS__QUALIFIED_NAME:
				setQualifiedName((PathNameCS)null);
				return;
			case BaseCSTPackage.SIMPLE_NAMED_ELEMENT_REF_CS__ELEMENT:
				setElement((NamedElement)null);
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
			case BaseCSTPackage.SIMPLE_NAMED_ELEMENT_REF_CS__QUALIFIED_NAME:
				return getQualifiedName() != null;
			case BaseCSTPackage.SIMPLE_NAMED_ELEMENT_REF_CS__ELEMENT:
				return element != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public <R, C> R accept(BaseCSVisitor<R, C> visitor) {
		return visitor.visitSimpleNamedElementRefCS(this);
	}

	public Element getPivot() {
		return getElement();
	}

	public void resetPivot() {}
} //SimpleNamedElementRefCSImpl
