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
 * $Id: EvaluationContext.java,v 1.1.2.1 2010/10/01 13:49:55 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Set;

import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Context</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getEvaluationContext()
 * @model interface="true" abstract="true"
 * @generated NOT
 */
public interface EvaluationContext
{
	void addVariable(Variable variable);

	boolean conformsTo(Type firstType, Type secondType);

	EvaluationContext createNestedContext();

	Type getBooleanType();

	Object getBooleanValue(boolean value);

	EvaluationEnvironment getEvaluationEnvironment();

	Map<?, ? extends Set<?>> getExtentMap();

	Type getIntegerType();
	
	Object getIntegerValue(BigInteger value);

	Object getInvalidValue();

	Object getNullValue();

	Type getRealType();

	Object getRealValue(BigDecimal value);

	Type getStringType();

	Object getStringValue(String value);

	Type getTypeOfType(Object type);
	
	Type getTypeOfValue(Object value, Type type);

	Type getUnlimitedNaturalType();

	Object getUnlimitedNaturalValue(BigInteger value);

	Object getValueOfVariable(VariableDeclaration variable);

	boolean isDefined(Object value);
	
	CallableImplementation loadImplementationClass(String implementationClass);
} // EvaluationContext
