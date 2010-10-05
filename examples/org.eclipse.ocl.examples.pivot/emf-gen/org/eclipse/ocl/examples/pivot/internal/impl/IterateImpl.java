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
 * $Id: IterateImpl.java,v 1.1.2.2 2010/10/05 17:40:45 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.internal.impl;

import java.math.BigInteger;
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
import org.eclipse.ocl.examples.pivot.Iterate;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Precedence;
import org.eclipse.ocl.examples.pivot.TemplateBinding;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.TemplateableElement;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.evaluation.CallableImplementation;
import org.eclipse.ocl.examples.pivot.utilities.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iterate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.IterateImpl#getOwnedAccumulators <em>Owned Accumulator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IterateImpl
		extends IteratorImpl
		implements Iterate {

	/**
	 * The cached value of the '{@link #getOwnedAccumulators() <em>Owned Accumulator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAccumulators()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> ownedAccumulators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IterateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotPackage.Literals.ITERATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOwnedAccumulators() {
		if (ownedAccumulators == null)
		{
			ownedAccumulators = new EObjectContainmentEList.Resolving<Parameter>(Parameter.class, this, PivotPackage.ITERATE__OWNED_ACCUMULATOR);
		}
		return ownedAccumulators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createOwnedAccumulator() {
		Parameter newOwnedAccumulator = (Parameter) create(PivotPackage.Literals.PARAMETER);
		getOwnedAccumulators().add(newOwnedAccumulator);
		return newOwnedAccumulator;
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
			case PivotPackage.ITERATE__OWNED_COMMENT:
				return ((InternalEList<?>)getOwnedComments()).basicRemove(otherEnd, msgs);
			case PivotPackage.ITERATE__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRules()).basicRemove(otherEnd, msgs);
			case PivotPackage.ITERATE__OWNED_ANNOTATION:
				return ((InternalEList<?>)getOwnedAnnotations()).basicRemove(otherEnd, msgs);
			case PivotPackage.ITERATE__TEMPLATE_BINDING:
				return ((InternalEList<?>)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case PivotPackage.ITERATE__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case PivotPackage.ITERATE__OWNED_SPECIALIZATION:
				return ((InternalEList<?>)getOwnedSpecializations()).basicRemove(otherEnd, msgs);
			case PivotPackage.ITERATE__OWNING_TEMPLATE_PARAMETER:
				return basicSetOwningTemplateParameter(null, msgs);
			case PivotPackage.ITERATE__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case PivotPackage.ITERATE__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameters()).basicRemove(otherEnd, msgs);
			case PivotPackage.ITERATE__CLASS:
				return basicSetClass_(null, msgs);
			case PivotPackage.ITERATE__OWNED_ITERATOR:
				return ((InternalEList<?>)getOwnedIterators()).basicRemove(otherEnd, msgs);
			case PivotPackage.ITERATE__OWNED_ACCUMULATOR:
				return ((InternalEList<?>)getOwnedAccumulators()).basicRemove(otherEnd, msgs);
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
			case PivotPackage.ITERATE__OWNED_COMMENT:
				return getOwnedComments();
			case PivotPackage.ITERATE__MONIKER:
				return getMoniker();
			case PivotPackage.ITERATE__IS_ORDERED:
				return isOrdered();
			case PivotPackage.ITERATE__IS_UNIQUE:
				return isUnique();
			case PivotPackage.ITERATE__LOWER:
				return getLower();
			case PivotPackage.ITERATE__UPPER:
				return getUpper();
			case PivotPackage.ITERATE__NAME:
				return getName();
			case PivotPackage.ITERATE__OWNED_RULE:
				return getOwnedRules();
			case PivotPackage.ITERATE__OWNED_ANNOTATION:
				return getOwnedAnnotations();
			case PivotPackage.ITERATE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case PivotPackage.ITERATE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case PivotPackage.ITERATE__OWNED_TEMPLATE_SIGNATURE:
				if (resolve) return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case PivotPackage.ITERATE__OWNED_SPECIALIZATION:
				return getOwnedSpecializations();
			case PivotPackage.ITERATE__OWNING_TEMPLATE_PARAMETER:
				if (resolve) return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case PivotPackage.ITERATE__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case PivotPackage.ITERATE__IMPLEMENTATION_CLASS:
				return getImplementationClass();
			case PivotPackage.ITERATE__IMPLEMENTATION:
				return getImplementation();
			case PivotPackage.ITERATE__RAISED_EXCEPTION:
				return getRaisedExceptions();
			case PivotPackage.ITERATE__OWNED_PARAMETER:
				return getOwnedParameters();
			case PivotPackage.ITERATE__PRECEDENCE:
				if (resolve) return getPrecedence();
				return basicGetPrecedence();
			case PivotPackage.ITERATE__CLASS:
				if (resolve) return getClass_();
				return basicGetClass_();
			case PivotPackage.ITERATE__OWNED_ITERATOR:
				return getOwnedIterators();
			case PivotPackage.ITERATE__OWNED_ACCUMULATOR:
				return getOwnedAccumulators();
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
			case PivotPackage.ITERATE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.ITERATE__MONIKER:
				setMoniker((String)newValue);
				return;
			case PivotPackage.ITERATE__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case PivotPackage.ITERATE__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case PivotPackage.ITERATE__LOWER:
				setLower((BigInteger)newValue);
				return;
			case PivotPackage.ITERATE__UPPER:
				setUpper((BigInteger)newValue);
				return;
			case PivotPackage.ITERATE__NAME:
				setName((String)newValue);
				return;
			case PivotPackage.ITERATE__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection<? extends Constraint>)newValue);
				return;
			case PivotPackage.ITERATE__OWNED_ANNOTATION:
				getOwnedAnnotations().clear();
				getOwnedAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case PivotPackage.ITERATE__TYPE:
				setType((Type)newValue);
				return;
			case PivotPackage.ITERATE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection<? extends TemplateBinding>)newValue);
				return;
			case PivotPackage.ITERATE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case PivotPackage.ITERATE__OWNED_SPECIALIZATION:
				getOwnedSpecializations().clear();
				getOwnedSpecializations().addAll((Collection<? extends TemplateableElement>)newValue);
				return;
			case PivotPackage.ITERATE__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)newValue);
				return;
			case PivotPackage.ITERATE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case PivotPackage.ITERATE__IMPLEMENTATION_CLASS:
				setImplementationClass((String)newValue);
				return;
			case PivotPackage.ITERATE__IMPLEMENTATION:
				setImplementation((CallableImplementation)newValue);
				return;
			case PivotPackage.ITERATE__RAISED_EXCEPTION:
				getRaisedExceptions().clear();
				getRaisedExceptions().addAll((Collection<? extends Type>)newValue);
				return;
			case PivotPackage.ITERATE__OWNED_PARAMETER:
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case PivotPackage.ITERATE__PRECEDENCE:
				setPrecedence((Precedence)newValue);
				return;
			case PivotPackage.ITERATE__CLASS:
				setClass_((org.eclipse.ocl.examples.pivot.Class)newValue);
				return;
			case PivotPackage.ITERATE__OWNED_ITERATOR:
				getOwnedIterators().clear();
				getOwnedIterators().addAll((Collection<? extends Parameter>)newValue);
				return;
			case PivotPackage.ITERATE__OWNED_ACCUMULATOR:
				getOwnedAccumulators().clear();
				getOwnedAccumulators().addAll((Collection<? extends Parameter>)newValue);
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
			case PivotPackage.ITERATE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case PivotPackage.ITERATE__MONIKER:
				setMoniker(MONIKER_EDEFAULT);
				return;
			case PivotPackage.ITERATE__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case PivotPackage.ITERATE__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case PivotPackage.ITERATE__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case PivotPackage.ITERATE__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case PivotPackage.ITERATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotPackage.ITERATE__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case PivotPackage.ITERATE__OWNED_ANNOTATION:
				getOwnedAnnotations().clear();
				return;
			case PivotPackage.ITERATE__TYPE:
				setType((Type)null);
				return;
			case PivotPackage.ITERATE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case PivotPackage.ITERATE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case PivotPackage.ITERATE__OWNED_SPECIALIZATION:
				getOwnedSpecializations().clear();
				return;
			case PivotPackage.ITERATE__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)null);
				return;
			case PivotPackage.ITERATE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case PivotPackage.ITERATE__IMPLEMENTATION_CLASS:
				setImplementationClass(IMPLEMENTATION_CLASS_EDEFAULT);
				return;
			case PivotPackage.ITERATE__IMPLEMENTATION:
				setImplementation((CallableImplementation)null);
				return;
			case PivotPackage.ITERATE__RAISED_EXCEPTION:
				getRaisedExceptions().clear();
				return;
			case PivotPackage.ITERATE__OWNED_PARAMETER:
				getOwnedParameters().clear();
				return;
			case PivotPackage.ITERATE__PRECEDENCE:
				setPrecedence((Precedence)null);
				return;
			case PivotPackage.ITERATE__CLASS:
				setClass_((org.eclipse.ocl.examples.pivot.Class)null);
				return;
			case PivotPackage.ITERATE__OWNED_ITERATOR:
				getOwnedIterators().clear();
				return;
			case PivotPackage.ITERATE__OWNED_ACCUMULATOR:
				getOwnedAccumulators().clear();
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
			case PivotPackage.ITERATE__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case PivotPackage.ITERATE__MONIKER:
				return MONIKER_EDEFAULT == null ? getMoniker() != null : !MONIKER_EDEFAULT.equals(getMoniker());
			case PivotPackage.ITERATE__IS_ORDERED:
				return ((eFlags & IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case PivotPackage.ITERATE__IS_UNIQUE:
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case PivotPackage.ITERATE__LOWER:
				return LOWER_EDEFAULT == null ? lower != null : !LOWER_EDEFAULT.equals(lower);
			case PivotPackage.ITERATE__UPPER:
				return UPPER_EDEFAULT == null ? upper != null : !UPPER_EDEFAULT.equals(upper);
			case PivotPackage.ITERATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.ITERATE__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case PivotPackage.ITERATE__OWNED_ANNOTATION:
				return ownedAnnotations != null && !ownedAnnotations.isEmpty();
			case PivotPackage.ITERATE__TYPE:
				return type != null;
			case PivotPackage.ITERATE__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case PivotPackage.ITERATE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case PivotPackage.ITERATE__OWNED_SPECIALIZATION:
				return ownedSpecializations != null && !ownedSpecializations.isEmpty();
			case PivotPackage.ITERATE__OWNING_TEMPLATE_PARAMETER:
				return basicGetOwningTemplateParameter() != null;
			case PivotPackage.ITERATE__TEMPLATE_PARAMETER:
				return isSetTemplateParameter();
			case PivotPackage.ITERATE__IMPLEMENTATION_CLASS:
				return IMPLEMENTATION_CLASS_EDEFAULT == null ? implementationClass != null : !IMPLEMENTATION_CLASS_EDEFAULT.equals(implementationClass);
			case PivotPackage.ITERATE__IMPLEMENTATION:
				return implementation != null;
			case PivotPackage.ITERATE__RAISED_EXCEPTION:
				return raisedExceptions != null && !raisedExceptions.isEmpty();
			case PivotPackage.ITERATE__OWNED_PARAMETER:
				return ownedParameters != null && !ownedParameters.isEmpty();
			case PivotPackage.ITERATE__PRECEDENCE:
				return precedence != null;
			case PivotPackage.ITERATE__CLASS:
				return basicGetClass_() != null;
			case PivotPackage.ITERATE__OWNED_ITERATOR:
				return ownedIterators != null && !ownedIterators.isEmpty();
			case PivotPackage.ITERATE__OWNED_ACCUMULATOR:
				return ownedAccumulators != null && !ownedAccumulators.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitIterate(this);
	}

} //IterateImpl
