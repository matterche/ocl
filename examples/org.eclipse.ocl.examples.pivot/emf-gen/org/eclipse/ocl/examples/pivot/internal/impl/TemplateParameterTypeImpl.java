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
 * $Id: TemplateParameterTypeImpl.java,v 1.1.2.1 2010/10/01 13:49:57 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.Comment;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.TemplateBinding;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateParameterType;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.TemplateableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.TemplateParameterTypeImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateParameterTypeImpl extends TypeImpl implements TemplateParameterType
{
  /**
	 * The default value of the '{@link #getSpecification() <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
  protected static final String SPECIFICATION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
  protected String specification = SPECIFICATION_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TemplateParameterTypeImpl()
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
		return PivotPackage.Literals.TEMPLATE_PARAMETER_TYPE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getSpecification()
  {
		return specification;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSpecification(String newSpecification)
  {
		String oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.TEMPLATE_PARAMETER_TYPE__SPECIFICATION, oldSpecification, specification));
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
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNED_COMMENT:
				return getOwnedComments();
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__MONIKER:
				return getMoniker();
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__NAME:
				return getName();
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNED_RULE:
				return getOwnedRules();
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNED_ANNOTATION:
				return getOwnedAnnotations();
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNED_TEMPLATE_SIGNATURE:
				if (resolve) return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNED_SPECIALIZATION:
				return getOwnedSpecializations();
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNING_TEMPLATE_PARAMETER:
				if (resolve) return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__SPECIFICATION:
				return getSpecification();
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
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__MONIKER:
				setMoniker((String)newValue);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__NAME:
				setName((String)newValue);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection<? extends Constraint>)newValue);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNED_ANNOTATION:
				getOwnedAnnotations().clear();
				getOwnedAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection<? extends TemplateBinding>)newValue);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNED_SPECIALIZATION:
				getOwnedSpecializations().clear();
				getOwnedSpecializations().addAll((Collection<? extends TemplateableElement>)newValue);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)newValue);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__PACKAGE:
				setPackage((org.eclipse.ocl.examples.pivot.Package)newValue);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__SPECIFICATION:
				setSpecification((String)newValue);
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
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__MONIKER:
				setMoniker(MONIKER_EDEFAULT);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNED_ANNOTATION:
				getOwnedAnnotations().clear();
				return;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNED_SPECIALIZATION:
				getOwnedSpecializations().clear();
				return;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)null);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__PACKAGE:
				setPackage((org.eclipse.ocl.examples.pivot.Package)null);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__SPECIFICATION:
				setSpecification(SPECIFICATION_EDEFAULT);
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
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__MONIKER:
				return MONIKER_EDEFAULT == null ? getMoniker() != null : !MONIKER_EDEFAULT.equals(getMoniker());
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNED_ANNOTATION:
				return ownedAnnotations != null && !ownedAnnotations.isEmpty();
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNED_SPECIALIZATION:
				return ownedSpecializations != null && !ownedSpecializations.isEmpty();
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__OWNING_TEMPLATE_PARAMETER:
				return basicGetOwningTemplateParameter() != null;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__TEMPLATE_PARAMETER:
				return isSetTemplateParameter();
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__PACKAGE:
				return basicGetPackage() != null;
			case PivotPackage.TEMPLATE_PARAMETER_TYPE__SPECIFICATION:
				return SPECIFICATION_EDEFAULT == null ? specification != null : !SPECIFICATION_EDEFAULT.equals(specification);
		}
		return eDynamicIsSet(featureID);
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
		result.append(" (specification: "); //$NON-NLS-1$
		result.append(specification);
		result.append(')');
		return result.toString();
	}

} //TemplateParameterTypeImpl