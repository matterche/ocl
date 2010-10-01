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
 * $Id: TypedMultiplicityElementImpl.java,v 1.1.2.1 2010/10/01 13:49:56 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.internal.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.Comment;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.INamedElement;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypedElement;
import org.eclipse.ocl.examples.pivot.TypedMultiplicityElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Multiplicity Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.TypedMultiplicityElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.TypedMultiplicityElementImpl#getOwnedRules <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.TypedMultiplicityElementImpl#getOwnedAnnotations <em>Owned Annotation</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.TypedMultiplicityElementImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypedMultiplicityElementImpl extends MultiplicityElementImpl implements TypedMultiplicityElement
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedRules() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> ownedRules;

	/**
	 * The cached value of the '{@link #getOwnedAnnotations() <em>Owned Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> ownedAnnotations;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedMultiplicityElementImpl()
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
		return PivotPackage.Literals.TYPED_MULTIPLICITY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getOwnedAnnotations()
	{
		if (ownedAnnotations == null)
		{
			ownedAnnotations = new EObjectContainmentEList.Resolving<Annotation>(Annotation.class, this, PivotPackage.TYPED_MULTIPLICITY_ELEMENT__OWNED_ANNOTATION);
		}
		return ownedAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createOwnedAnnotation()
	{
		Annotation newOwnedAnnotation = (Annotation) create(PivotPackage.Literals.ANNOTATION);
		getOwnedAnnotations().add(newOwnedAnnotation);
		return newOwnedAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.TYPED_MULTIPLICITY_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getOwnedRules()
	{
		if (ownedRules == null)
		{
			ownedRules = new EObjectContainmentEList.Resolving<Constraint>(Constraint.class, this, PivotPackage.TYPED_MULTIPLICITY_ELEMENT__OWNED_RULE);
		}
		return ownedRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createOwnedRule()
	{
		Constraint newOwnedRule = (Constraint) create(PivotPackage.Literals.CONSTRAINT);
		getOwnedRules().add(newOwnedRule);
		return newOwnedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType()
	{
		if (type != null && ((EObject)type).eIsProxy())
		{
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotPackage.TYPED_MULTIPLICITY_ELEMENT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType()
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType)
	{
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.TYPED_MULTIPLICITY_ELEMENT__TYPE, oldType, type));
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
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__OWNED_COMMENT:
				return ((InternalEList<?>)getOwnedComments()).basicRemove(otherEnd, msgs);
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRules()).basicRemove(otherEnd, msgs);
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__OWNED_ANNOTATION:
				return ((InternalEList<?>)getOwnedAnnotations()).basicRemove(otherEnd, msgs);
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
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__OWNED_COMMENT:
				return getOwnedComments();
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__MONIKER:
				return getMoniker();
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__IS_ORDERED:
				return isOrdered();
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__IS_UNIQUE:
				return isUnique();
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__LOWER:
				return getLower();
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__UPPER:
				return getUpper();
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__NAME:
				return getName();
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__OWNED_RULE:
				return getOwnedRules();
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__OWNED_ANNOTATION:
				return getOwnedAnnotations();
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__MONIKER:
				setMoniker((String)newValue);
				return;
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__LOWER:
				setLower((BigInteger)newValue);
				return;
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__UPPER:
				setUpper((BigInteger)newValue);
				return;
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection<? extends Constraint>)newValue);
				return;
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__OWNED_ANNOTATION:
				getOwnedAnnotations().clear();
				getOwnedAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__TYPE:
				setType((Type)newValue);
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
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__MONIKER:
				setMoniker(MONIKER_EDEFAULT);
				return;
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__OWNED_ANNOTATION:
				getOwnedAnnotations().clear();
				return;
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__TYPE:
				setType((Type)null);
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
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__MONIKER:
				return MONIKER_EDEFAULT == null ? getMoniker() != null : !MONIKER_EDEFAULT.equals(getMoniker());
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__IS_ORDERED:
				return ((eFlags & IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__IS_UNIQUE:
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__LOWER:
				return LOWER_EDEFAULT == null ? lower != null : !LOWER_EDEFAULT.equals(lower);
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__UPPER:
				return UPPER_EDEFAULT == null ? upper != null : !UPPER_EDEFAULT.equals(upper);
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__OWNED_ANNOTATION:
				return ownedAnnotations != null && !ownedAnnotations.isEmpty();
			case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__TYPE:
				return type != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == INamedElement.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class)
		{
			switch (derivedFeatureID)
			{
				case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__NAME: return PivotPackage.NAMED_ELEMENT__NAME;
				case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__OWNED_RULE: return PivotPackage.NAMED_ELEMENT__OWNED_RULE;
				case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__OWNED_ANNOTATION: return PivotPackage.NAMED_ELEMENT__OWNED_ANNOTATION;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class)
		{
			switch (derivedFeatureID)
			{
				case PivotPackage.TYPED_MULTIPLICITY_ELEMENT__TYPE: return PivotPackage.TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == INamedElement.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class)
		{
			switch (baseFeatureID)
			{
				case PivotPackage.NAMED_ELEMENT__NAME: return PivotPackage.TYPED_MULTIPLICITY_ELEMENT__NAME;
				case PivotPackage.NAMED_ELEMENT__OWNED_RULE: return PivotPackage.TYPED_MULTIPLICITY_ELEMENT__OWNED_RULE;
				case PivotPackage.NAMED_ELEMENT__OWNED_ANNOTATION: return PivotPackage.TYPED_MULTIPLICITY_ELEMENT__OWNED_ANNOTATION;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class)
		{
			switch (baseFeatureID)
			{
				case PivotPackage.TYPED_ELEMENT__TYPE: return PivotPackage.TYPED_MULTIPLICITY_ELEMENT__TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TypedMultiplicityElementImpl
