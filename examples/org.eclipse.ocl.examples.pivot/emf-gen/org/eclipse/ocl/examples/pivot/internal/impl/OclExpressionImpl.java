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
 * $Id: OclExpressionImpl.java,v 1.1.2.1 2010/10/01 13:49:57 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.internal.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.examples.pivot.EvaluationContext;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Visitor;
import org.eclipse.ocl.examples.pivot.internal.operations.OclExpressionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ocl Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OclExpressionImpl extends TypedElementImpl implements OclExpression
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected OclExpressionImpl()
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
		return PivotPackage.Literals.OCL_EXPRESSION;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object evaluate(EvaluationContext context)
	{
		return OclExpressionOperations.evaluate(this, context);
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
			case PivotPackage.OCL_EXPRESSION___ACCEPT__VISITOR:
				return accept((Visitor)arguments.get(0));
			case PivotPackage.OCL_EXPRESSION___OCL_TYPE:
				return oclType();
			case PivotPackage.OCL_EXPRESSION___OCL_IS_INVALID:
				return oclIsInvalid();
			case PivotPackage.OCL_EXPRESSION___OCL_IS_UNDEFINED:
				return oclIsUndefined();
			case PivotPackage.OCL_EXPRESSION___HAS_MONIKER:
				return hasMoniker();
			case PivotPackage.OCL_EXPRESSION___GET_NAME:
				return getName();
			case PivotPackage.OCL_EXPRESSION___EVALUATE__EVALUATIONCONTEXT:
				return evaluate((EvaluationContext)arguments.get(0));
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //OclExpressionImpl
