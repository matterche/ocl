/**
 * <copyright>
 * 
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 * 
 * </copyright>
 *************************************************************************
 * This code is 100% auto-generated
 * from: pivot
 * using: org.eclipse.ocl.examples.codegen.tables.model2tables.mtl
 *
 * Do not edit it.
 */
package org.eclipse.ocl.examples.pivot.bodies;

import org.eclipse.ocl.examples.domain.elements.DomainCollectionType;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractUnaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryBinaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryProperty;
import org.eclipse.ocl.examples.domain.library.LibraryUnaryOperation;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorType;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.examples.pivot.PivotTables;

/**
 * OperationCallExpBodies provides the Java implementation bodies of OCL-defined OperationCallExp operations and properties.
 */
@SuppressWarnings("nls")
public class OperationCallExpBodies
{

	/** 
	 * Implementation of the OperationCallExp 'ArgumentCount' invariant.
	 */
	public static class _invariant_ArgumentCount extends AbstractUnaryOperation
	{
		public static _invariant_ArgumentCount INSTANCE = new _invariant_ArgumentCount();
	
		/*
		argument->size() = referredOperation.ownedParameter->size()
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Real__eq_ = OCLstdlibTables.Operations._Real___eq_;
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final ExecutorOperation O_Collection_size = OCLstdlibTables.Operations._Collection__size;
			final ExecutorType T_Pivot_ecore__pivot__OclExpression = PivotTables.Types._OclExpression;
			final DomainCollectionType T_OrderedSet_Pivot_ecore__pivot__OclExpression_ = standardLibrary.getOrderedSetType(T_Pivot_ecore__pivot__OclExpression);
			final ExecutorProperty P_OperationCallExp_argument = PivotTables.Properties._OperationCallExp__argument;
			final LibraryProperty IP_OperationCallExp_argument = P_OperationCallExp_argument.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__Parameter = PivotTables.Types._Parameter;
			final DomainCollectionType T_OrderedSet_Pivot_ecore__pivot__Parameter_ = standardLibrary.getOrderedSetType(T_Pivot_ecore__pivot__Parameter);
			final ExecutorProperty P_Operation_ownedParameter = PivotTables.Properties._Operation__ownedParameter;
			final LibraryProperty IP_Operation_ownedParameter = P_Operation_ownedParameter.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__Operation = PivotTables.Types._Operation;
			final ExecutorProperty P_OperationCallExp_referredOperation = PivotTables.Properties._OperationCallExp__referredOperation;
			final LibraryProperty IP_OperationCallExp_referredOperation = P_OperationCallExp_referredOperation.getImplementation();
			
			
			Value A_symbol_171 = IP_OperationCallExp_argument.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__OclExpression_, self, P_OperationCallExp_argument);
			
			DomainType static_A_symbol_172 = valueFactory.typeOf(A_symbol_171);
			LibraryUnaryOperation dynamic_A_symbol_172 = (LibraryUnaryOperation)static_A_symbol_172.lookupImplementation(standardLibrary, O_Collection_size);
			Value A_symbol_172 = dynamic_A_symbol_172.evaluate(evaluator, T_Integer, A_symbol_171);
			
			Value A_symbol_173 = IP_OperationCallExp_referredOperation.evaluate(evaluator, T_Pivot_ecore__pivot__Operation, self, P_OperationCallExp_referredOperation);
			
			Value A_symbol_174 = IP_Operation_ownedParameter.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Parameter_, A_symbol_173, P_Operation_ownedParameter);
			
			DomainType static_A_symbol_175 = valueFactory.typeOf(A_symbol_174);
			LibraryUnaryOperation dynamic_A_symbol_175 = (LibraryUnaryOperation)static_A_symbol_175.lookupImplementation(standardLibrary, O_Collection_size);
			Value A_symbol_175 = dynamic_A_symbol_175.evaluate(evaluator, T_Integer, A_symbol_174);
			DomainType static_A_symbol_176 = valueFactory.typeOf(A_symbol_172, A_symbol_175);
			LibraryBinaryOperation dynamic_A_symbol_176 = (LibraryBinaryOperation)static_A_symbol_176.lookupImplementation(standardLibrary, O_Real__eq_);
			Value A_symbol_176 = dynamic_A_symbol_176.evaluate(evaluator, T_Boolean, A_symbol_172, A_symbol_175);
			return A_symbol_176;
		}
	}


}

