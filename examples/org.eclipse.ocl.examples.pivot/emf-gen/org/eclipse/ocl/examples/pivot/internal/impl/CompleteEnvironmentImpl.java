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
 * $Id: CompleteEnvironmentImpl.java,v 1.1.2.4 2010/12/06 17:20:45 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.internal.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.examples.pivot.CompleteClass;
import org.eclipse.ocl.examples.pivot.CompleteEnvironment;
import org.eclipse.ocl.examples.pivot.CompleteOperation;
import org.eclipse.ocl.examples.pivot.CompletePackage;
import org.eclipse.ocl.examples.pivot.CompleteProperty;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.internal.operations.CompleteEnvironmentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complete Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CompleteEnvironmentImpl
		extends PackageImpl
		implements CompleteEnvironment {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompleteEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotPackage.Literals.COMPLETE_ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteClass getCompleteClass(
			org.eclipse.ocl.examples.pivot.Class model) {
		return CompleteEnvironmentOperations.getCompleteClass(this, model);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteOperation getCompleteOperation(Operation model) {
		return CompleteEnvironmentOperations.getCompleteOperation(this, model);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletePackage getCompletePackage(
			org.eclipse.ocl.examples.pivot.Package model) {
		return CompleteEnvironmentOperations.getCompletePackage(this, model);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteProperty getCompleteProperty(Property model) {
		return CompleteEnvironmentOperations.getCompleteProperty(this, model);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID)
		{
			case PivotPackage.COMPLETE_ENVIRONMENT___OCL_TYPE:
				return oclType();
			case PivotPackage.COMPLETE_ENVIRONMENT___OCL_IS_INVALID:
				return oclIsInvalid();
			case PivotPackage.COMPLETE_ENVIRONMENT___OCL_IS_UNDEFINED:
				return oclIsUndefined();
			case PivotPackage.COMPLETE_ENVIRONMENT___HAS_MONIKER:
				return hasMoniker();
			case PivotPackage.COMPLETE_ENVIRONMENT___PARAMETERABLE_ELEMENTS:
				return parameterableElements();
			case PivotPackage.COMPLETE_ENVIRONMENT___IS_TEMPLATE:
				return isTemplate();
			case PivotPackage.COMPLETE_ENVIRONMENT___GET_COMPLETE_CLASS__CLASS:
				return getCompleteClass((org.eclipse.ocl.examples.pivot.Class)arguments.get(0));
			case PivotPackage.COMPLETE_ENVIRONMENT___GET_COMPLETE_OPERATION__OPERATION:
				return getCompleteOperation((Operation)arguments.get(0));
			case PivotPackage.COMPLETE_ENVIRONMENT___GET_COMPLETE_PACKAGE__PACKAGE:
				return getCompletePackage((org.eclipse.ocl.examples.pivot.Package)arguments.get(0));
			case PivotPackage.COMPLETE_ENVIRONMENT___GET_COMPLETE_PROPERTY__PROPERTY:
				return getCompleteProperty((Property)arguments.get(0));
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //CompleteEnvironmentImpl
