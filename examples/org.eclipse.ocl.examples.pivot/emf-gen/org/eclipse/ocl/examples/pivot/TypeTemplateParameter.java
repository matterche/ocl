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
 * $Id: TypeTemplateParameter.java,v 1.2 2011/01/24 20:49:36 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A type template parameter exposes a type as a formal template parameter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.TypeTemplateParameter#isAllowSubstitutable <em>Allow Substitutable</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.TypeTemplateParameter#getConstrainingType <em>Constraining Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getTypeTemplateParameter()
 * @model
 * @generated
 */
public interface TypeTemplateParameter
		extends TemplateParameter {

	/**
	 * Returns the value of the '<em><b>Allow Substitutable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constrains the required relationship between an actual parameter and the parameteredElement for this formal parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Substitutable</em>' attribute.
	 * @see #setAllowSubstitutable(boolean)
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getTypeTemplateParameter_AllowSubstitutable()
	 * @model default="true" dataType="org.eclipse.ocl.examples.pivot.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter!allowSubstitutable'"
	 * @generated
	 */
	boolean isAllowSubstitutable();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.pivot.TypeTemplateParameter#isAllowSubstitutable <em>Allow Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Substitutable</em>' attribute.
	 * @see #isAllowSubstitutable()
	 * @generated
	 */
	void setAllowSubstitutable(boolean value);

	/**
	 * Returns the value of the '<em><b>Constraining Type</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.ocl.examples.pivot.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classifiers that constrain the argument that can be used for the parameter. If the allowSubstitutable attribute is true, then any classifier that is compatible with this constraining classifier can be substituted; otherwise, it must be either this classifier or one of its subclasses. If this property is empty, there are no constraints on the classifier that can be used as an argument.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraining Type</em>' reference list.
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getTypeTemplateParameter_ConstrainingType()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter!constrainingType'"
	 * @generated
	 */
	EList<Type> getConstrainingType();

} // TypeTemplateParameter
