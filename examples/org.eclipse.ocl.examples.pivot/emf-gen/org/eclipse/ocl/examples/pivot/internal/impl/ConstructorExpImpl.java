/**
 * <copyright>
 * 
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.ocl.examples.pivot.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.Comment;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.ConstructorExp;
import org.eclipse.ocl.examples.pivot.ConstructorPart;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.ConstructorExpImpl#getPart <em>Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstructorExpImpl extends OclExpressionImpl implements ConstructorExp
{
	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstructorPart> part;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorExpImpl()
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
		return PivotPackage.Literals.CONSTRUCTOR_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstructorPart> getPart()
	{
		if (part == null)
		{
			part = new EObjectContainmentEList<ConstructorPart>(ConstructorPart.class, this, PivotPackage.CONSTRUCTOR_EXP__PART);
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorPart createPart()
	{
		ConstructorPart newPart = (ConstructorPart) create(PivotPackage.Literals.CONSTRUCTOR_PART);
		getPart().add(newPart);
		return newPart;
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
			case PivotPackage.CONSTRUCTOR_EXP__OWNED_COMMENT:
				return ((InternalEList<?>)getOwnedComment()).basicRemove(otherEnd, msgs);
			case PivotPackage.CONSTRUCTOR_EXP__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
			case PivotPackage.CONSTRUCTOR_EXP__OWNED_ANNOTATION:
				return ((InternalEList<?>)getOwnedAnnotation()).basicRemove(otherEnd, msgs);
			case PivotPackage.CONSTRUCTOR_EXP__PART:
				return ((InternalEList<?>)getPart()).basicRemove(otherEnd, msgs);
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
			case PivotPackage.CONSTRUCTOR_EXP__OWNED_COMMENT:
				return getOwnedComment();
			case PivotPackage.CONSTRUCTOR_EXP__NAME:
				return getName();
			case PivotPackage.CONSTRUCTOR_EXP__OWNED_RULE:
				return getOwnedRule();
			case PivotPackage.CONSTRUCTOR_EXP__IS_STATIC:
				return isStatic();
			case PivotPackage.CONSTRUCTOR_EXP__OWNED_ANNOTATION:
				return getOwnedAnnotation();
			case PivotPackage.CONSTRUCTOR_EXP__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case PivotPackage.CONSTRUCTOR_EXP__PART:
				return getPart();
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
			case PivotPackage.CONSTRUCTOR_EXP__OWNED_COMMENT:
				getOwnedComment().clear();
				getOwnedComment().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.CONSTRUCTOR_EXP__NAME:
				setName((String)newValue);
				return;
			case PivotPackage.CONSTRUCTOR_EXP__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
				return;
			case PivotPackage.CONSTRUCTOR_EXP__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case PivotPackage.CONSTRUCTOR_EXP__OWNED_ANNOTATION:
				getOwnedAnnotation().clear();
				getOwnedAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case PivotPackage.CONSTRUCTOR_EXP__TYPE:
				setType((Type)newValue);
				return;
			case PivotPackage.CONSTRUCTOR_EXP__PART:
				getPart().clear();
				getPart().addAll((Collection<? extends ConstructorPart>)newValue);
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
			case PivotPackage.CONSTRUCTOR_EXP__OWNED_COMMENT:
				getOwnedComment().clear();
				return;
			case PivotPackage.CONSTRUCTOR_EXP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotPackage.CONSTRUCTOR_EXP__OWNED_RULE:
				getOwnedRule().clear();
				return;
			case PivotPackage.CONSTRUCTOR_EXP__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case PivotPackage.CONSTRUCTOR_EXP__OWNED_ANNOTATION:
				getOwnedAnnotation().clear();
				return;
			case PivotPackage.CONSTRUCTOR_EXP__TYPE:
				setType((Type)null);
				return;
			case PivotPackage.CONSTRUCTOR_EXP__PART:
				getPart().clear();
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
			case PivotPackage.CONSTRUCTOR_EXP__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case PivotPackage.CONSTRUCTOR_EXP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.CONSTRUCTOR_EXP__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case PivotPackage.CONSTRUCTOR_EXP__IS_STATIC:
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case PivotPackage.CONSTRUCTOR_EXP__OWNED_ANNOTATION:
				return ownedAnnotation != null && !ownedAnnotation.isEmpty();
			case PivotPackage.CONSTRUCTOR_EXP__TYPE:
				return type != null;
			case PivotPackage.CONSTRUCTOR_EXP__PART:
				return part != null && !part.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitConstructorExp(this);
	}
} //ConstructorExpImpl
