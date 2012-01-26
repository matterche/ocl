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
import org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.domain.library.AbstractUnaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryBinaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryIteration;
import org.eclipse.ocl.examples.domain.library.LibraryProperty;
import org.eclipse.ocl.examples.domain.library.LibraryUnaryOperation;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorSingleIterationManager;
import org.eclipse.ocl.examples.library.executor.ExecutorType;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.examples.pivot.PivotTables;

/**
 * LoopExpBodies provides the Java implementation bodies of OCL-defined LoopExp operations and properties.
 */
@SuppressWarnings("nls")
public class LoopExpBodies
{

	/** 
	 * Implementation of the LoopExp 'NoInitializers' invariant.
	 */
	public static class _invariant_NoInitializers extends AbstractUnaryOperation
	{
		public static _invariant_NoInitializers INSTANCE = new _invariant_NoInitializers();
	
		/*
		self.iterator->forAll(initExpression->isEmpty())
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Collection_forAll = OCLstdlibTables.Operations._Collection__0_forAll;
			final ExecutorType T_Pivot_ecore__pivot__Variable = PivotTables.Types._Variable;
			final DomainCollectionType T_OrderedSet_Pivot_ecore__pivot__Variable_ = standardLibrary.getOrderedSetType(T_Pivot_ecore__pivot__Variable);
			final ExecutorProperty P_LoopExp_iterator = PivotTables.Properties._LoopExp__iterator;
			final LibraryProperty IP_LoopExp_iterator = P_LoopExp_iterator.getImplementation();
			final ExecutorOperation O_Collection_isEmpty = OCLstdlibTables.Operations._Collection__isEmpty;
			final ExecutorType T_Pivot_ecore__pivot__OclExpression = PivotTables.Types._OclExpression;
			final DomainCollectionType T_Set_Pivot_ecore__pivot__OclExpression_ = standardLibrary.getSetType(T_Pivot_ecore__pivot__OclExpression);
			final ExecutorOperation O_OclAny_oclAsSet = OCLstdlibTables.Operations._OclAny__oclAsSet;
			final ExecutorProperty P_Variable_initExpression = PivotTables.Properties._Variable__initExpression;
			final LibraryProperty IP_Variable_initExpression = P_Variable_initExpression.getImplementation();
			
			
			Value A_symbol_84 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
			
			
			/** 
			 * Implementation of the iterator body.
			 */
			AbstractBinaryOperation body_A_symbol_85 = new AbstractBinaryOperation()
			{
			/*
			initExpression->isEmpty()
			*/
				public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
					final Value V_1_ = iterator1;	// iterator: 1_
					
					Value A_symbol_86 = IP_Variable_initExpression.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, V_1_, P_Variable_initExpression);
					
					DomainType static_A_symbol_87 = valueFactory.typeOf(A_symbol_86);
					LibraryUnaryOperation dynamic_A_symbol_87 = (LibraryUnaryOperation)static_A_symbol_87.lookupImplementation(standardLibrary, O_OclAny_oclAsSet);
					Value A_symbol_87 = dynamic_A_symbol_87.evaluate(evaluator, T_Set_Pivot_ecore__pivot__OclExpression_, A_symbol_86);
					DomainType static_A_symbol_88 = valueFactory.typeOf(A_symbol_87);
					LibraryUnaryOperation dynamic_A_symbol_88 = (LibraryUnaryOperation)static_A_symbol_88.lookupImplementation(standardLibrary, O_Collection_isEmpty);
					Value A_symbol_88 = dynamic_A_symbol_88.evaluate(evaluator, T_Boolean, A_symbol_87);
					return A_symbol_88;
				}
			};
			DomainType static_A_symbol_85 = A_symbol_84.getType();
			LibraryIteration dynamic_A_symbol_85 = (LibraryIteration)static_A_symbol_85.lookupImplementation(standardLibrary, O_Collection_forAll);
			Value acc_A_symbol_85 = dynamic_A_symbol_85.createAccumulatorValue(evaluator, T_Boolean, T_Boolean);
			ExecutorSingleIterationManager manager_A_symbol_85 = new ExecutorSingleIterationManager(evaluator, T_Boolean, body_A_symbol_85, (CollectionValue)A_symbol_84, acc_A_symbol_85);
			Value A_symbol_85 = dynamic_A_symbol_85.evaluateIteration(manager_A_symbol_85);
			return A_symbol_85;
		}
	}

	/** 
	 * Implementation of the LoopExp 'SourceIsCollection' invariant.
	 */
	public static class _invariant_SourceIsCollection extends AbstractUnaryOperation
	{
		public static _invariant_SourceIsCollection INSTANCE = new _invariant_SourceIsCollection();
	
		/*
		source.type.oclIsKindOf(CollectionType)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__OclExpression = PivotTables.Types._OclExpression;
			final ExecutorProperty P_CallExp_source = PivotTables.Properties._CallExp__source;
			final LibraryProperty IP_CallExp_source = P_CallExp_source.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__CollectionType_ = valueFactory.createTypeValue(PivotTables.Types._CollectionType);
			
			
			Value A_symbol_89 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
			
			Value A_symbol_90 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_89, P_TypedElement_type);
			
			DomainType static_A_symbol_91 = valueFactory.typeOf(A_symbol_90);
			LibraryBinaryOperation dynamic_A_symbol_91 = (LibraryBinaryOperation)static_A_symbol_91.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
			Value A_symbol_91 = dynamic_A_symbol_91.evaluate(evaluator, T_Boolean, A_symbol_90, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
			return A_symbol_91;
		}
	}



}

