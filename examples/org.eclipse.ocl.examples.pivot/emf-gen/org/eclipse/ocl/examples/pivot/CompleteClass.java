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
 * $Id: CompleteClass.java,v 1.1.2.2 2010/10/05 17:39:52 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complete Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.CompleteClass#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.CompleteClass#getCompleteEnvironment <em>Complete Environment</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.CompleteClass#getCompleteOperations <em>Complete Operation</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.CompleteClass#getCompleteProperties <em>Complete Property</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.CompleteClass#getCompleteSuperClasses <em>Complete Super Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getCompleteClass()
 * @model
 * @generated
 */
public interface CompleteClass
		extends org.eclipse.ocl.examples.pivot.Class {

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(org.eclipse.ocl.examples.pivot.Class)
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getCompleteClass_Model()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.ocl.examples.pivot.Class getModel();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.pivot.CompleteClass#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(org.eclipse.ocl.examples.pivot.Class value);

	/**
	 * Returns the value of the '<em><b>Complete Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complete Environment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complete Environment</em>' reference.
	 * @see #setCompleteEnvironment(CompleteEnvironment)
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getCompleteClass_CompleteEnvironment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CompleteEnvironment getCompleteEnvironment();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.pivot.CompleteClass#getCompleteEnvironment <em>Complete Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete Environment</em>' reference.
	 * @see #getCompleteEnvironment()
	 * @generated
	 */
	void setCompleteEnvironment(CompleteEnvironment value);

	/**
	 * Returns the value of the '<em><b>Complete Operation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.ocl.examples.pivot.CompleteOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complete Operation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complete Operation</em>' reference list.
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getCompleteClass_CompleteOperation()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<CompleteOperation> getCompleteOperations();

	/**
	 * Returns the value of the '<em><b>Complete Property</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.ocl.examples.pivot.CompleteProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complete Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complete Property</em>' reference list.
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getCompleteClass_CompleteProperty()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<CompleteProperty> getCompleteProperties();

	/**
	 * Returns the value of the '<em><b>Complete Super Class</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.ocl.examples.pivot.CompleteClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complete Super Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complete Super Class</em>' reference list.
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getCompleteClass_CompleteSuperClass()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<CompleteClass> getCompleteSuperClasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.ocl.examples.pivot.Boolean" required="true" ordered="false" aClassRequired="true" aClassOrdered="false"
	 * @generated
	 */
	boolean conformsTo(CompleteClass aClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" staticOperationRequired="true" staticOperationOrdered="false"
	 * @generated
	 */
	CompleteOperation getDynamicOperation(CompleteOperation staticOperation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" nameDataType="org.eclipse.ocl.examples.pivot.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	EList<CompleteOperation> getCompleteOperations(String name);

} // CompleteClass
