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
 * $Id: OpaqueExpressionImpl.java,v 1.4 2011/05/19 16:55:39 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.Comment;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.OpaqueExpression;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.OpaqueExpressionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.OpaqueExpressionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.OpaqueExpressionImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.internal.impl.OpaqueExpressionImpl#getValueExpression <em>Value Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpaqueExpressionImpl
		extends ValueSpecificationImpl
		implements OpaqueExpression {

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<String> body;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> language;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> message;

	/**
	 * The cached value of the '{@link #getValueExpression() <em>Value Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueExpression()
	 * @generated
	 * @ordered
	 */
	protected ExpressionInOcl valueExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpaqueExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotPackage.Literals.OPAQUE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBody()
	{
		if (body == null)
		{
			body = new EDataTypeEList<String>(String.class, this, PivotPackage.OPAQUE_EXPRESSION__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLanguage()
	{
		if (language == null)
		{
			language = new EDataTypeUniqueEList<String>(String.class, this, PivotPackage.OPAQUE_EXPRESSION__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMessage()
	{
		if (message == null)
		{
			message = new EDataTypeEList<String>(String.class, this, PivotPackage.OPAQUE_EXPRESSION__MESSAGE);
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionInOcl getValueExpression()
	{
		if (valueExpression != null && ((EObject)valueExpression).eIsProxy())
		{
			InternalEObject oldValueExpression = (InternalEObject)valueExpression;
			valueExpression = (ExpressionInOcl)eResolveProxy(oldValueExpression);
			if (valueExpression != oldValueExpression)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotPackage.OPAQUE_EXPRESSION__VALUE_EXPRESSION, oldValueExpression, valueExpression));
			}
		}
		return valueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionInOcl basicGetValueExpression()
	{
		return valueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueExpression(ExpressionInOcl newValueExpression)
	{
		ExpressionInOcl oldValueExpression = valueExpression;
		valueExpression = newValueExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.OPAQUE_EXPRESSION__VALUE_EXPRESSION, oldValueExpression, valueExpression));
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
			case PivotPackage.OPAQUE_EXPRESSION__OWNED_COMMENT:
				return getOwnedComment();
			case PivotPackage.OPAQUE_EXPRESSION__NAME:
				return getName();
			case PivotPackage.OPAQUE_EXPRESSION__OWNED_RULE:
				return getOwnedRule();
			case PivotPackage.OPAQUE_EXPRESSION__IS_STATIC:
				return isStatic();
			case PivotPackage.OPAQUE_EXPRESSION__OWNED_ANNOTATION:
				return getOwnedAnnotation();
			case PivotPackage.OPAQUE_EXPRESSION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case PivotPackage.OPAQUE_EXPRESSION__OWNING_TEMPLATE_PARAMETER:
				return getOwningTemplateParameter();
			case PivotPackage.OPAQUE_EXPRESSION__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case PivotPackage.OPAQUE_EXPRESSION__BODY:
				return getBody();
			case PivotPackage.OPAQUE_EXPRESSION__LANGUAGE:
				return getLanguage();
			case PivotPackage.OPAQUE_EXPRESSION__MESSAGE:
				return getMessage();
			case PivotPackage.OPAQUE_EXPRESSION__VALUE_EXPRESSION:
				if (resolve) return getValueExpression();
				return basicGetValueExpression();
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
			case PivotPackage.OPAQUE_EXPRESSION__OWNED_COMMENT:
				getOwnedComment().clear();
				getOwnedComment().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.OPAQUE_EXPRESSION__NAME:
				setName((String)newValue);
				return;
			case PivotPackage.OPAQUE_EXPRESSION__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
				return;
			case PivotPackage.OPAQUE_EXPRESSION__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case PivotPackage.OPAQUE_EXPRESSION__OWNED_ANNOTATION:
				getOwnedAnnotation().clear();
				getOwnedAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case PivotPackage.OPAQUE_EXPRESSION__TYPE:
				setType((Type)newValue);
				return;
			case PivotPackage.OPAQUE_EXPRESSION__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)newValue);
				return;
			case PivotPackage.OPAQUE_EXPRESSION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case PivotPackage.OPAQUE_EXPRESSION__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends String>)newValue);
				return;
			case PivotPackage.OPAQUE_EXPRESSION__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends String>)newValue);
				return;
			case PivotPackage.OPAQUE_EXPRESSION__MESSAGE:
				getMessage().clear();
				getMessage().addAll((Collection<? extends String>)newValue);
				return;
			case PivotPackage.OPAQUE_EXPRESSION__VALUE_EXPRESSION:
				setValueExpression((ExpressionInOcl)newValue);
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
			case PivotPackage.OPAQUE_EXPRESSION__OWNED_COMMENT:
				getOwnedComment().clear();
				return;
			case PivotPackage.OPAQUE_EXPRESSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotPackage.OPAQUE_EXPRESSION__OWNED_RULE:
				getOwnedRule().clear();
				return;
			case PivotPackage.OPAQUE_EXPRESSION__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case PivotPackage.OPAQUE_EXPRESSION__OWNED_ANNOTATION:
				getOwnedAnnotation().clear();
				return;
			case PivotPackage.OPAQUE_EXPRESSION__TYPE:
				setType((Type)null);
				return;
			case PivotPackage.OPAQUE_EXPRESSION__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)null);
				return;
			case PivotPackage.OPAQUE_EXPRESSION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case PivotPackage.OPAQUE_EXPRESSION__BODY:
				getBody().clear();
				return;
			case PivotPackage.OPAQUE_EXPRESSION__LANGUAGE:
				getLanguage().clear();
				return;
			case PivotPackage.OPAQUE_EXPRESSION__MESSAGE:
				getMessage().clear();
				return;
			case PivotPackage.OPAQUE_EXPRESSION__VALUE_EXPRESSION:
				setValueExpression((ExpressionInOcl)null);
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
			case PivotPackage.OPAQUE_EXPRESSION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case PivotPackage.OPAQUE_EXPRESSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.OPAQUE_EXPRESSION__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case PivotPackage.OPAQUE_EXPRESSION__IS_STATIC:
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case PivotPackage.OPAQUE_EXPRESSION__OWNED_ANNOTATION:
				return ownedAnnotation != null && !ownedAnnotation.isEmpty();
			case PivotPackage.OPAQUE_EXPRESSION__TYPE:
				return type != null;
			case PivotPackage.OPAQUE_EXPRESSION__OWNING_TEMPLATE_PARAMETER:
				return getOwningTemplateParameter() != null;
			case PivotPackage.OPAQUE_EXPRESSION__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case PivotPackage.OPAQUE_EXPRESSION__BODY:
				return body != null && !body.isEmpty();
			case PivotPackage.OPAQUE_EXPRESSION__LANGUAGE:
				return language != null && !language.isEmpty();
			case PivotPackage.OPAQUE_EXPRESSION__MESSAGE:
				return message != null && !message.isEmpty();
			case PivotPackage.OPAQUE_EXPRESSION__VALUE_EXPRESSION:
				return valueExpression != null;
		}
		return eDynamicIsSet(featureID);
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

	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitOpaqueExpression(this);
	}
} //OpaqueExpressionImpl
