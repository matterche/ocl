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
import org.eclipse.ocl.examples.domain.values.IntegerValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorType;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.examples.pivot.PivotTables;

/**
 * IterateExpBodies provides the Java implementation bodies of OCL-defined IterateExp operations and properties.
 */
@SuppressWarnings("nls")
public class IterateExpBodies
{

	/** 
	 * Implementation of the IterateExp 'BodyTypeConformsToResultType' invariant.
	 */
	public static class _invariant_BodyTypeConformsToResultType extends AbstractUnaryOperation
	{
		public static _invariant_BodyTypeConformsToResultType INSTANCE = new _invariant_BodyTypeConformsToResultType();
	
		/*
		body.type.conformsTo(result.type)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_OclType_conformsTo = OCLstdlibTables.Operations._OclType__conformsTo;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__OclExpression = PivotTables.Types._OclExpression;
			final ExecutorProperty P_LoopExp_body = PivotTables.Properties._LoopExp__body;
			final LibraryProperty IP_LoopExp_body = P_LoopExp_body.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__Variable = PivotTables.Types._Variable;
			final ExecutorProperty P_IterateExp_result = PivotTables.Properties._IterateExp__result;
			final LibraryProperty IP_IterateExp_result = P_IterateExp_result.getImplementation();
			
			
			Value A_symbol_345 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
			
			Value A_symbol_346 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_345, P_TypedElement_type);
			
			
			Value A_symbol_347 = IP_IterateExp_result.evaluate(evaluator, T_Pivot_ecore__pivot__Variable, self, P_IterateExp_result);
			
			Value A_symbol_348 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_347, P_TypedElement_type);
			
			DomainType static_A_symbol_349 = valueFactory.typeOf(A_symbol_346);
			LibraryBinaryOperation dynamic_A_symbol_349 = (LibraryBinaryOperation)static_A_symbol_349.lookupImplementation(standardLibrary, O_OclType_conformsTo);
			Value A_symbol_349 = dynamic_A_symbol_349.evaluate(evaluator, T_Boolean, A_symbol_346, A_symbol_348);
			return A_symbol_349;
		}
	}

	/** 
	 * Implementation of the IterateExp 'OneInitializer' invariant.
	 */
	public static class _invariant_OneInitializer extends AbstractUnaryOperation
	{
		public static _invariant_OneInitializer INSTANCE = new _invariant_OneInitializer();
	
		/*
		self.result.initExpression->size() = 1
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Real__eq_ = OCLstdlibTables.Operations._Real___eq_;
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final ExecutorOperation O_Collection_size = OCLstdlibTables.Operations._Collection__size;
			final ExecutorType T_Pivot_ecore__pivot__OclExpression = PivotTables.Types._OclExpression;
			final DomainCollectionType T_Set_Pivot_ecore__pivot__OclExpression_ = standardLibrary.getSetType(T_Pivot_ecore__pivot__OclExpression);
			final ExecutorOperation O_OclAny_oclAsSet = OCLstdlibTables.Operations._OclAny__oclAsSet;
			final ExecutorProperty P_Variable_initExpression = PivotTables.Properties._Variable__initExpression;
			final LibraryProperty IP_Variable_initExpression = P_Variable_initExpression.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__Variable = PivotTables.Types._Variable;
			final ExecutorProperty P_IterateExp_result = PivotTables.Properties._IterateExp__result;
			final LibraryProperty IP_IterateExp_result = P_IterateExp_result.getImplementation();
			final IntegerValue I_1 = valueFactory.integerValueOf(1);
			
			
			Value A_symbol_350 = IP_IterateExp_result.evaluate(evaluator, T_Pivot_ecore__pivot__Variable, self, P_IterateExp_result);
			
			Value A_symbol_351 = IP_Variable_initExpression.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, A_symbol_350, P_Variable_initExpression);
			
			DomainType static_A_symbol_352 = valueFactory.typeOf(A_symbol_351);
			LibraryUnaryOperation dynamic_A_symbol_352 = (LibraryUnaryOperation)static_A_symbol_352.lookupImplementation(standardLibrary, O_OclAny_oclAsSet);
			Value A_symbol_352 = dynamic_A_symbol_352.evaluate(evaluator, T_Set_Pivot_ecore__pivot__OclExpression_, A_symbol_351);
			DomainType static_A_symbol_353 = valueFactory.typeOf(A_symbol_352);
			LibraryUnaryOperation dynamic_A_symbol_353 = (LibraryUnaryOperation)static_A_symbol_353.lookupImplementation(standardLibrary, O_Collection_size);
			Value A_symbol_353 = dynamic_A_symbol_353.evaluate(evaluator, T_Integer, A_symbol_352);
			DomainType static_A_symbol_354 = valueFactory.typeOf(A_symbol_353, I_1);
			LibraryBinaryOperation dynamic_A_symbol_354 = (LibraryBinaryOperation)static_A_symbol_354.lookupImplementation(standardLibrary, O_Real__eq_);
			Value A_symbol_354 = dynamic_A_symbol_354.evaluate(evaluator, T_Boolean, A_symbol_353, I_1);
			return A_symbol_354;
		}
	}

	/** 
	 * Implementation of the IterateExp 'TypeIsResultType' invariant.
	 */
	public static class _invariant_TypeIsResultType extends AbstractUnaryOperation
	{
		public static _invariant_TypeIsResultType INSTANCE = new _invariant_TypeIsResultType();
	
		/*
		type = result.type
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__Variable = PivotTables.Types._Variable;
			final ExecutorProperty P_IterateExp_result = PivotTables.Properties._IterateExp__result;
			final LibraryProperty IP_IterateExp_result = P_IterateExp_result.getImplementation();
			
			
			Value A_symbol_355 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
			
			
			Value A_symbol_356 = IP_IterateExp_result.evaluate(evaluator, T_Pivot_ecore__pivot__Variable, self, P_IterateExp_result);
			
			Value A_symbol_357 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_356, P_TypedElement_type);
			
			DomainType static_A_symbol_358 = valueFactory.typeOf(A_symbol_355, A_symbol_357);
			LibraryBinaryOperation dynamic_A_symbol_358 = (LibraryBinaryOperation)static_A_symbol_358.lookupImplementation(standardLibrary, O_OclAny__eq_);
			Value A_symbol_358 = dynamic_A_symbol_358.evaluate(evaluator, T_Boolean, A_symbol_355, A_symbol_357);
			return A_symbol_358;
		}
	}

}

