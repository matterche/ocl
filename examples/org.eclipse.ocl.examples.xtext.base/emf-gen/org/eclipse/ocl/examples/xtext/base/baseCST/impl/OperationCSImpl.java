/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: OperationCSImpl.java,v 1.3.6.1 2010/10/01 14:13:03 ewillink Exp $
 */

package org.eclipse.ocl.examples.xtext.base.baseCST.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ConstraintCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindableElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindingCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateSignatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateableElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedRefCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.OperationCSImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.OperationCSImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.OperationCSImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.OperationCSImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.OperationCSImpl#getOwnedConstraint <em>Owned Constraint</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.OperationCSImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.OperationCSImpl#getOwnedTemplateBinding <em>Owned Template Binding</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.OperationCSImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.OperationCSImpl#getOwningClass <em>Owning Class</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.OperationCSImpl#getOwnedIterator <em>Owned Iterator</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.OperationCSImpl#getOwnedAccumulator <em>Owned Accumulator</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.OperationCSImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.OperationCSImpl#getOwnedException <em>Owned Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationCSImpl extends NamedElementCSImpl implements OperationCS {
	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected int lower = LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected String multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedType() <em>Owned Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedType()
	 * @generated
	 * @ordered
	 */
	protected TypedRefCS ownedType;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected int upper = UPPER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedConstraint() <em>Owned Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintCS> ownedConstraint;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<String> qualifier;

	/**
	 * The cached value of the '{@link #getOwnedTemplateBinding() <em>Owned Template Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTemplateBinding()
	 * @generated
	 * @ordered
	 */
	protected TemplateBindingCS ownedTemplateBinding;

	/**
	 * The cached value of the '{@link #getOwnedTemplateSignature() <em>Owned Template Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTemplateSignature()
	 * @generated
	 * @ordered
	 */
	protected TemplateSignatureCS ownedTemplateSignature;

	/**
	 * The cached value of the '{@link #getOwnedIterator() <em>Owned Iterator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedIterator()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterCS> ownedIterator;

	/**
	 * The cached value of the '{@link #getOwnedAccumulator() <em>Owned Accumulator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAccumulator()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterCS> ownedAccumulator;

	/**
	 * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterCS> ownedParameter;

	/**
	 * The cached value of the '{@link #getOwnedException() <em>Owned Exception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedException()
	 * @generated
	 * @ordered
	 */
	protected EList<TypedRefCS> ownedException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaseCSTPackage.Literals.OPERATION_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		int oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaseCSTPackage.OPERATION_CS__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(String newMultiplicity) {
		String oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaseCSTPackage.OPERATION_CS__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedRefCS getOwnedType() {
		return ownedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedType(TypedRefCS newOwnedType, NotificationChain msgs) {
		TypedRefCS oldOwnedType = ownedType;
		ownedType = newOwnedType;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaseCSTPackage.OPERATION_CS__OWNED_TYPE, oldOwnedType, newOwnedType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedType(TypedRefCS newOwnedType) {
		if (newOwnedType != ownedType)
		{
			NotificationChain msgs = null;
			if (ownedType != null)
				msgs = ((InternalEObject)ownedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaseCSTPackage.OPERATION_CS__OWNED_TYPE, null, msgs);
			if (newOwnedType != null)
				msgs = ((InternalEObject)newOwnedType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaseCSTPackage.OPERATION_CS__OWNED_TYPE, null, msgs);
			msgs = basicSetOwnedType(newOwnedType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaseCSTPackage.OPERATION_CS__OWNED_TYPE, newOwnedType, newOwnedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		int oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaseCSTPackage.OPERATION_CS__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintCS> getOwnedConstraint()
	{
		if (ownedConstraint == null)
		{
			ownedConstraint = new EObjectContainmentEList<ConstraintCS>(ConstraintCS.class, this, BaseCSTPackage.OPERATION_CS__OWNED_CONSTRAINT);
		}
		return ownedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getQualifier()
	{
		if (qualifier == null)
		{
			qualifier = new EDataTypeUniqueEList<String>(String.class, this, BaseCSTPackage.OPERATION_CS__QUALIFIER);
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignatureCS getOwnedTemplateSignature() {
		return ownedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTemplateSignature(TemplateSignatureCS newOwnedTemplateSignature, NotificationChain msgs) {
		TemplateSignatureCS oldOwnedTemplateSignature = ownedTemplateSignature;
		ownedTemplateSignature = newOwnedTemplateSignature;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaseCSTPackage.OPERATION_CS__OWNED_TEMPLATE_SIGNATURE, oldOwnedTemplateSignature, newOwnedTemplateSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTemplateSignature(TemplateSignatureCS newOwnedTemplateSignature) {
		if (newOwnedTemplateSignature != ownedTemplateSignature)
		{
			NotificationChain msgs = null;
			if (ownedTemplateSignature != null)
				msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, BaseCSTPackage.TEMPLATE_SIGNATURE_CS__OWNING_TEMPLATE_ELEMENT, TemplateSignatureCS.class, msgs);
			if (newOwnedTemplateSignature != null)
				msgs = ((InternalEObject)newOwnedTemplateSignature).eInverseAdd(this, BaseCSTPackage.TEMPLATE_SIGNATURE_CS__OWNING_TEMPLATE_ELEMENT, TemplateSignatureCS.class, msgs);
			msgs = basicSetOwnedTemplateSignature(newOwnedTemplateSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaseCSTPackage.OPERATION_CS__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature, newOwnedTemplateSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterCS> getOwnedIterator()
	{
		if (ownedIterator == null)
		{
			ownedIterator = new EObjectContainmentEList<ParameterCS>(ParameterCS.class, this, BaseCSTPackage.OPERATION_CS__OWNED_ITERATOR);
		}
		return ownedIterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterCS> getOwnedAccumulator()
	{
		if (ownedAccumulator == null)
		{
			ownedAccumulator = new EObjectContainmentEList<ParameterCS>(ParameterCS.class, this, BaseCSTPackage.OPERATION_CS__OWNED_ACCUMULATOR);
		}
		return ownedAccumulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBindingCS getOwnedTemplateBinding() {
		return ownedTemplateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTemplateBinding(TemplateBindingCS newOwnedTemplateBinding, NotificationChain msgs) {
		TemplateBindingCS oldOwnedTemplateBinding = ownedTemplateBinding;
		ownedTemplateBinding = newOwnedTemplateBinding;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaseCSTPackage.OPERATION_CS__OWNED_TEMPLATE_BINDING, oldOwnedTemplateBinding, newOwnedTemplateBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTemplateBinding(TemplateBindingCS newOwnedTemplateBinding) {
		if (newOwnedTemplateBinding != ownedTemplateBinding)
		{
			NotificationChain msgs = null;
			if (ownedTemplateBinding != null)
				msgs = ((InternalEObject)ownedTemplateBinding).eInverseRemove(this, BaseCSTPackage.TEMPLATE_BINDING_CS__OWNING_TEMPLATE_BINDABLE_ELEMENT, TemplateBindingCS.class, msgs);
			if (newOwnedTemplateBinding != null)
				msgs = ((InternalEObject)newOwnedTemplateBinding).eInverseAdd(this, BaseCSTPackage.TEMPLATE_BINDING_CS__OWNING_TEMPLATE_BINDABLE_ELEMENT, TemplateBindingCS.class, msgs);
			msgs = basicSetOwnedTemplateBinding(newOwnedTemplateBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaseCSTPackage.OPERATION_CS__OWNED_TEMPLATE_BINDING, newOwnedTemplateBinding, newOwnedTemplateBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterCS> getOwnedParameter() {
		if (ownedParameter == null)
		{
			ownedParameter = new EObjectContainmentWithInverseEList<ParameterCS>(ParameterCS.class, this, BaseCSTPackage.OPERATION_CS__OWNED_PARAMETER, BaseCSTPackage.PARAMETER_CS__OWNER);
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypedRefCS> getOwnedException()
	{
		if (ownedException == null)
		{
			ownedException = new EObjectContainmentEList<TypedRefCS>(TypedRefCS.class, this, BaseCSTPackage.OPERATION_CS__OWNED_EXCEPTION);
		}
		return ownedException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassCS getOwningClass() {
		if (eContainerFeatureID() != BaseCSTPackage.OPERATION_CS__OWNING_CLASS) return null;
		return (ClassCS)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningClass(ClassCS newOwningClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningClass, BaseCSTPackage.OPERATION_CS__OWNING_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningClass(ClassCS newOwningClass) {
		if (newOwningClass != eInternalContainer() || (eContainerFeatureID() != BaseCSTPackage.OPERATION_CS__OWNING_CLASS && newOwningClass != null))
		{
			if (EcoreUtil.isAncestor(this, newOwningClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningClass != null)
				msgs = ((InternalEObject)newOwningClass).eInverseAdd(this, BaseCSTPackage.CLASS_CS__OWNED_OPERATION, ClassCS.class, msgs);
			msgs = basicSetOwningClass(newOwningClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaseCSTPackage.OPERATION_CS__OWNING_CLASS, newOwningClass, newOwningClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TemplateSignatureCS getTemplateSignature() {
		return getOwnedTemplateSignature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID)
		{
			case BaseCSTPackage.OPERATION_CS__OWNED_TEMPLATE_BINDING:
				if (ownedTemplateBinding != null)
					msgs = ((InternalEObject)ownedTemplateBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaseCSTPackage.OPERATION_CS__OWNED_TEMPLATE_BINDING, null, msgs);
				return basicSetOwnedTemplateBinding((TemplateBindingCS)otherEnd, msgs);
			case BaseCSTPackage.OPERATION_CS__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaseCSTPackage.OPERATION_CS__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignatureCS)otherEnd, msgs);
			case BaseCSTPackage.OPERATION_CS__OWNING_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningClass((ClassCS)otherEnd, msgs);
			case BaseCSTPackage.OPERATION_CS__OWNED_PARAMETER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedParameter()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID)
		{
			case BaseCSTPackage.OPERATION_CS__OWNED_TYPE:
				return basicSetOwnedType(null, msgs);
			case BaseCSTPackage.OPERATION_CS__OWNED_CONSTRAINT:
				return ((InternalEList<?>)getOwnedConstraint()).basicRemove(otherEnd, msgs);
			case BaseCSTPackage.OPERATION_CS__OWNED_TEMPLATE_BINDING:
				return basicSetOwnedTemplateBinding(null, msgs);
			case BaseCSTPackage.OPERATION_CS__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case BaseCSTPackage.OPERATION_CS__OWNING_CLASS:
				return basicSetOwningClass(null, msgs);
			case BaseCSTPackage.OPERATION_CS__OWNED_ITERATOR:
				return ((InternalEList<?>)getOwnedIterator()).basicRemove(otherEnd, msgs);
			case BaseCSTPackage.OPERATION_CS__OWNED_ACCUMULATOR:
				return ((InternalEList<?>)getOwnedAccumulator()).basicRemove(otherEnd, msgs);
			case BaseCSTPackage.OPERATION_CS__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
			case BaseCSTPackage.OPERATION_CS__OWNED_EXCEPTION:
				return ((InternalEList<?>)getOwnedException()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID())
		{
			case BaseCSTPackage.OPERATION_CS__OWNING_CLASS:
				return eInternalContainer().eInverseRemove(this, BaseCSTPackage.CLASS_CS__OWNED_OPERATION, ClassCS.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case BaseCSTPackage.OPERATION_CS__LOWER:
				return getLower();
			case BaseCSTPackage.OPERATION_CS__MULTIPLICITY:
				return getMultiplicity();
			case BaseCSTPackage.OPERATION_CS__OWNED_TYPE:
				return getOwnedType();
			case BaseCSTPackage.OPERATION_CS__UPPER:
				return getUpper();
			case BaseCSTPackage.OPERATION_CS__OWNED_CONSTRAINT:
				return getOwnedConstraint();
			case BaseCSTPackage.OPERATION_CS__QUALIFIER:
				return getQualifier();
			case BaseCSTPackage.OPERATION_CS__OWNED_TEMPLATE_BINDING:
				return getOwnedTemplateBinding();
			case BaseCSTPackage.OPERATION_CS__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case BaseCSTPackage.OPERATION_CS__OWNING_CLASS:
				return getOwningClass();
			case BaseCSTPackage.OPERATION_CS__OWNED_ITERATOR:
				return getOwnedIterator();
			case BaseCSTPackage.OPERATION_CS__OWNED_ACCUMULATOR:
				return getOwnedAccumulator();
			case BaseCSTPackage.OPERATION_CS__OWNED_PARAMETER:
				return getOwnedParameter();
			case BaseCSTPackage.OPERATION_CS__OWNED_EXCEPTION:
				return getOwnedException();
		}
		return super.eGet(featureID, resolve, coreType);
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
			case BaseCSTPackage.OPERATION_CS__LOWER:
				setLower((Integer)newValue);
				return;
			case BaseCSTPackage.OPERATION_CS__MULTIPLICITY:
				setMultiplicity((String)newValue);
				return;
			case BaseCSTPackage.OPERATION_CS__OWNED_TYPE:
				setOwnedType((TypedRefCS)newValue);
				return;
			case BaseCSTPackage.OPERATION_CS__UPPER:
				setUpper((Integer)newValue);
				return;
			case BaseCSTPackage.OPERATION_CS__OWNED_CONSTRAINT:
				getOwnedConstraint().clear();
				getOwnedConstraint().addAll((Collection<? extends ConstraintCS>)newValue);
				return;
			case BaseCSTPackage.OPERATION_CS__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends String>)newValue);
				return;
			case BaseCSTPackage.OPERATION_CS__OWNED_TEMPLATE_BINDING:
				setOwnedTemplateBinding((TemplateBindingCS)newValue);
				return;
			case BaseCSTPackage.OPERATION_CS__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignatureCS)newValue);
				return;
			case BaseCSTPackage.OPERATION_CS__OWNING_CLASS:
				setOwningClass((ClassCS)newValue);
				return;
			case BaseCSTPackage.OPERATION_CS__OWNED_ITERATOR:
				getOwnedIterator().clear();
				getOwnedIterator().addAll((Collection<? extends ParameterCS>)newValue);
				return;
			case BaseCSTPackage.OPERATION_CS__OWNED_ACCUMULATOR:
				getOwnedAccumulator().clear();
				getOwnedAccumulator().addAll((Collection<? extends ParameterCS>)newValue);
				return;
			case BaseCSTPackage.OPERATION_CS__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends ParameterCS>)newValue);
				return;
			case BaseCSTPackage.OPERATION_CS__OWNED_EXCEPTION:
				getOwnedException().clear();
				getOwnedException().addAll((Collection<? extends TypedRefCS>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID)
		{
			case BaseCSTPackage.OPERATION_CS__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case BaseCSTPackage.OPERATION_CS__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
				return;
			case BaseCSTPackage.OPERATION_CS__OWNED_TYPE:
				setOwnedType((TypedRefCS)null);
				return;
			case BaseCSTPackage.OPERATION_CS__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case BaseCSTPackage.OPERATION_CS__OWNED_CONSTRAINT:
				getOwnedConstraint().clear();
				return;
			case BaseCSTPackage.OPERATION_CS__QUALIFIER:
				getQualifier().clear();
				return;
			case BaseCSTPackage.OPERATION_CS__OWNED_TEMPLATE_BINDING:
				setOwnedTemplateBinding((TemplateBindingCS)null);
				return;
			case BaseCSTPackage.OPERATION_CS__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignatureCS)null);
				return;
			case BaseCSTPackage.OPERATION_CS__OWNING_CLASS:
				setOwningClass((ClassCS)null);
				return;
			case BaseCSTPackage.OPERATION_CS__OWNED_ITERATOR:
				getOwnedIterator().clear();
				return;
			case BaseCSTPackage.OPERATION_CS__OWNED_ACCUMULATOR:
				getOwnedAccumulator().clear();
				return;
			case BaseCSTPackage.OPERATION_CS__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case BaseCSTPackage.OPERATION_CS__OWNED_EXCEPTION:
				getOwnedException().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID)
		{
			case BaseCSTPackage.OPERATION_CS__LOWER:
				return lower != LOWER_EDEFAULT;
			case BaseCSTPackage.OPERATION_CS__MULTIPLICITY:
				return MULTIPLICITY_EDEFAULT == null ? multiplicity != null : !MULTIPLICITY_EDEFAULT.equals(multiplicity);
			case BaseCSTPackage.OPERATION_CS__OWNED_TYPE:
				return ownedType != null;
			case BaseCSTPackage.OPERATION_CS__UPPER:
				return upper != UPPER_EDEFAULT;
			case BaseCSTPackage.OPERATION_CS__OWNED_CONSTRAINT:
				return ownedConstraint != null && !ownedConstraint.isEmpty();
			case BaseCSTPackage.OPERATION_CS__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
			case BaseCSTPackage.OPERATION_CS__OWNED_TEMPLATE_BINDING:
				return ownedTemplateBinding != null;
			case BaseCSTPackage.OPERATION_CS__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case BaseCSTPackage.OPERATION_CS__OWNING_CLASS:
				return getOwningClass() != null;
			case BaseCSTPackage.OPERATION_CS__OWNED_ITERATOR:
				return ownedIterator != null && !ownedIterator.isEmpty();
			case BaseCSTPackage.OPERATION_CS__OWNED_ACCUMULATOR:
				return ownedAccumulator != null && !ownedAccumulator.isEmpty();
			case BaseCSTPackage.OPERATION_CS__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case BaseCSTPackage.OPERATION_CS__OWNED_EXCEPTION:
				return ownedException != null && !ownedException.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TemplateBindableElementCS.class)
		{
			switch (derivedFeatureID)
			{
				case BaseCSTPackage.OPERATION_CS__OWNED_TEMPLATE_BINDING: return BaseCSTPackage.TEMPLATE_BINDABLE_ELEMENT_CS__OWNED_TEMPLATE_BINDING;
				default: return -1;
			}
		}
		if (baseClass == TemplateableElementCS.class)
		{
			switch (derivedFeatureID)
			{
				case BaseCSTPackage.OPERATION_CS__OWNED_TEMPLATE_SIGNATURE: return BaseCSTPackage.TEMPLATEABLE_ELEMENT_CS__OWNED_TEMPLATE_SIGNATURE;
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TemplateBindableElementCS.class)
		{
			switch (baseFeatureID)
			{
				case BaseCSTPackage.TEMPLATE_BINDABLE_ELEMENT_CS__OWNED_TEMPLATE_BINDING: return BaseCSTPackage.OPERATION_CS__OWNED_TEMPLATE_BINDING;
				default: return -1;
			}
		}
		if (baseClass == TemplateableElementCS.class)
		{
			switch (baseFeatureID)
			{
				case BaseCSTPackage.TEMPLATEABLE_ELEMENT_CS__OWNED_TEMPLATE_SIGNATURE: return BaseCSTPackage.OPERATION_CS__OWNED_TEMPLATE_SIGNATURE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return super.toString();
	}
} //OperationCSImpl
