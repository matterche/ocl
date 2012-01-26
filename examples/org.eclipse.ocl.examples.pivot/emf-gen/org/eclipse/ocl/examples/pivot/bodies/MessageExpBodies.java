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
 * MessageExpBodies provides the Java implementation bodies of OCL-defined MessageExp operations and properties.
 */
@SuppressWarnings("nls")
public class MessageExpBodies
{

	/** 
	 * Implementation of the MessageExp 'OneCallOrOneSend' invariant.
	 */
	public static class _invariant_OneCallOrOneSend extends AbstractUnaryOperation
	{
		public static _invariant_OneCallOrOneSend INSTANCE = new _invariant_OneCallOrOneSend();
	
		/*
		calledOperation->size() + sentSignal->size() = 1
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Real__eq_ = OCLstdlibTables.Operations._Real___eq_;
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final ExecutorOperation O_Integer__add_ = OCLstdlibTables.Operations._Integer___add_;
			final ExecutorOperation O_Collection_size = OCLstdlibTables.Operations._Collection__size;
			final ExecutorType T_Pivot_ecore__pivot__CallOperationAction = PivotTables.Types._CallOperationAction;
			final DomainCollectionType T_Set_Pivot_ecore__pivot__CallOperationAction_ = standardLibrary.getSetType(T_Pivot_ecore__pivot__CallOperationAction);
			final ExecutorOperation O_OclAny_oclAsSet = OCLstdlibTables.Operations._OclAny__oclAsSet;
			final ExecutorProperty P_MessageExp_calledOperation = PivotTables.Properties._MessageExp__calledOperation;
			final LibraryProperty IP_MessageExp_calledOperation = P_MessageExp_calledOperation.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__SendSignalAction = PivotTables.Types._SendSignalAction;
			final DomainCollectionType T_Set_Pivot_ecore__pivot__SendSignalAction_ = standardLibrary.getSetType(T_Pivot_ecore__pivot__SendSignalAction);
			final ExecutorProperty P_MessageExp_sentSignal = PivotTables.Properties._MessageExp__sentSignal;
			final LibraryProperty IP_MessageExp_sentSignal = P_MessageExp_sentSignal.getImplementation();
			final IntegerValue I_1 = valueFactory.integerValueOf(1);
			
			
			Value A_symbol_2 = IP_MessageExp_calledOperation.evaluate(evaluator, T_Pivot_ecore__pivot__CallOperationAction, self, P_MessageExp_calledOperation);
			
			DomainType static_A_symbol_3 = valueFactory.typeOf(A_symbol_2);
			LibraryUnaryOperation dynamic_A_symbol_3 = (LibraryUnaryOperation)static_A_symbol_3.lookupImplementation(standardLibrary, O_OclAny_oclAsSet);
			Value A_symbol_3 = dynamic_A_symbol_3.evaluate(evaluator, T_Set_Pivot_ecore__pivot__CallOperationAction_, A_symbol_2);
			DomainType static_A_symbol_4 = valueFactory.typeOf(A_symbol_3);
			LibraryUnaryOperation dynamic_A_symbol_4 = (LibraryUnaryOperation)static_A_symbol_4.lookupImplementation(standardLibrary, O_Collection_size);
			Value A_symbol_4 = dynamic_A_symbol_4.evaluate(evaluator, T_Integer, A_symbol_3);
			
			Value A_symbol_5 = IP_MessageExp_sentSignal.evaluate(evaluator, T_Pivot_ecore__pivot__SendSignalAction, self, P_MessageExp_sentSignal);
			
			DomainType static_A_symbol_6 = valueFactory.typeOf(A_symbol_5);
			LibraryUnaryOperation dynamic_A_symbol_6 = (LibraryUnaryOperation)static_A_symbol_6.lookupImplementation(standardLibrary, O_OclAny_oclAsSet);
			Value A_symbol_6 = dynamic_A_symbol_6.evaluate(evaluator, T_Set_Pivot_ecore__pivot__SendSignalAction_, A_symbol_5);
			DomainType static_A_symbol_7 = valueFactory.typeOf(A_symbol_6);
			LibraryUnaryOperation dynamic_A_symbol_7 = (LibraryUnaryOperation)static_A_symbol_7.lookupImplementation(standardLibrary, O_Collection_size);
			Value A_symbol_7 = dynamic_A_symbol_7.evaluate(evaluator, T_Integer, A_symbol_6);
			DomainType static_A_symbol_8 = valueFactory.typeOf(A_symbol_4, A_symbol_7);
			LibraryBinaryOperation dynamic_A_symbol_8 = (LibraryBinaryOperation)static_A_symbol_8.lookupImplementation(standardLibrary, O_Integer__add_);
			Value A_symbol_8 = dynamic_A_symbol_8.evaluate(evaluator, T_Integer, A_symbol_4, A_symbol_7);
			DomainType static_A_symbol_9 = valueFactory.typeOf(A_symbol_8, I_1);
			LibraryBinaryOperation dynamic_A_symbol_9 = (LibraryBinaryOperation)static_A_symbol_9.lookupImplementation(standardLibrary, O_Real__eq_);
			Value A_symbol_9 = dynamic_A_symbol_9.evaluate(evaluator, T_Boolean, A_symbol_8, I_1);
			return A_symbol_9;
		}
	}

	/** 
	 * Implementation of the MessageExp 'TargetIsNotACollection' invariant.
	 */
	public static class _invariant_TargetIsNotACollection extends AbstractUnaryOperation
	{
		public static _invariant_TargetIsNotACollection INSTANCE = new _invariant_TargetIsNotACollection();
	
		/*
		not target.type.oclIsKindOf(CollectionType)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_not = OCLstdlibTables.Operations._Boolean__not;
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__OclExpression = PivotTables.Types._OclExpression;
			final ExecutorProperty P_MessageExp_target = PivotTables.Properties._MessageExp__target;
			final LibraryProperty IP_MessageExp_target = P_MessageExp_target.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__CollectionType_ = valueFactory.createTypeValue(PivotTables.Types._CollectionType);
			
			
			Value A_symbol_10 = IP_MessageExp_target.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_MessageExp_target);
			
			Value A_symbol_11 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_10, P_TypedElement_type);
			
			DomainType static_A_symbol_12 = valueFactory.typeOf(A_symbol_11);
			LibraryBinaryOperation dynamic_A_symbol_12 = (LibraryBinaryOperation)static_A_symbol_12.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
			Value A_symbol_12 = dynamic_A_symbol_12.evaluate(evaluator, T_Boolean, A_symbol_11, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
			DomainType static_A_symbol_13 = valueFactory.typeOf(A_symbol_12);
			LibraryUnaryOperation dynamic_A_symbol_13 = (LibraryUnaryOperation)static_A_symbol_13.lookupImplementation(standardLibrary, O_Boolean_not);
			Value A_symbol_13 = dynamic_A_symbol_13.evaluate(evaluator, T_Boolean, A_symbol_12);
			return A_symbol_13;
		}
	}




}

