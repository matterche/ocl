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
 * $Id: OclAnyImpl.java,v 1.1.2.1 2010/10/01 13:54:10 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.internal.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.examples.pivot.OclAny;
import org.eclipse.ocl.examples.pivot.PivotPackage;

import org.eclipse.ocl.examples.pivot.Visitor;
import org.eclipse.ocl.examples.pivot.internal.operations.OclAnyOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ocl Any</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OclAnyImpl extends VisitableImpl implements OclAny
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected OclAnyImpl()
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
		return PivotPackage.Literals.OCL_ANY;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public org.eclipse.ocl.examples.pivot.Class oclType()
  {
		return OclAnyOperations.oclType(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean oclIsInvalid()
  {
		return OclAnyOperations.oclIsInvalid(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean oclIsUndefined()
  {
		return OclAnyOperations.oclIsUndefined(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
@SuppressWarnings("unchecked")
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID)
		{
			case PivotPackage.OCL_ANY___ACCEPT__VISITOR:
				return accept((Visitor)arguments.get(0));
			case PivotPackage.OCL_ANY___OCL_TYPE:
				return oclType();
			case PivotPackage.OCL_ANY___OCL_IS_INVALID:
				return oclIsInvalid();
			case PivotPackage.OCL_ANY___OCL_IS_UNDEFINED:
				return oclIsUndefined();
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //OclAnyImpl
