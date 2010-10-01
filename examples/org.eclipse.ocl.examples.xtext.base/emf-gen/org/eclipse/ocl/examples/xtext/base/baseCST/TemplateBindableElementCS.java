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
 * $Id: TemplateBindableElementCS.java,v 1.1.2.1 2010/10/01 14:13:01 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.baseCST;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Bindable Element CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindableElementCS#getOwnedTemplateBinding <em>Owned Template Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage#getTemplateBindableElementCS()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TemplateBindableElementCS extends MonikeredElementCS {
	/**
	 * Returns the value of the '<em><b>Owned Template Binding</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindingCS#getOwningTemplateBindableElement <em>Owning Template Bindable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Template Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Template Binding</em>' containment reference.
	 * @see #setOwnedTemplateBinding(TemplateBindingCS)
	 * @see org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage#getTemplateBindableElementCS_OwnedTemplateBinding()
	 * @see org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindingCS#getOwningTemplateBindableElement
	 * @model opposite="owningTemplateBindableElement" containment="true"
	 * @generated
	 */
	TemplateBindingCS getOwnedTemplateBinding();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindableElementCS#getOwnedTemplateBinding <em>Owned Template Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Template Binding</em>' containment reference.
	 * @see #getOwnedTemplateBinding()
	 * @generated
	 */
	void setOwnedTemplateBinding(TemplateBindingCS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
//	TemplateSignatureCS getTemplateSignature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
//	TemplateableElementCS getTemplateableElement();

} // TemplateBindableElementCS
