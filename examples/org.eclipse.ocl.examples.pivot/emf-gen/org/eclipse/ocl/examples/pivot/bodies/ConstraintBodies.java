/**
 * <copyright>
 * 
 * Copyright (c) 2011 E.D.Willink and others.
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
 * ConstraintBodies provides the Java implementation bodies of OCL-defined Constraint operations and properties.
 */
@SuppressWarnings("nls")
public class ConstraintBodies
{

	/** 
	 * Implementation of the Constraint 'UniqueName' invariant.
	 */
	public static class _invariant_UniqueName extends AbstractUnaryOperation
	{
		public static _invariant_UniqueName INSTANCE = new _invariant_UniqueName();
	
		/*
		context.ownedRule->excluding(self).name->excludes(self.name)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Collection_excludes = OCLstdlibTables.Operations._Collection__excludes;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final DomainCollectionType T_Sequence_String_ = standardLibrary.getSequenceType(T_String);
			final ExecutorOperation O_Sequence_collect = OCLstdlibTables.Operations._Sequence__collect;
			final ExecutorType T_Pivot_ecore__pivot__Constraint = PivotTables.Types._Constraint;
			final DomainCollectionType T_OrderedSet_Pivot_ecore__pivot__Constraint_ = standardLibrary.getOrderedSetType(T_Pivot_ecore__pivot__Constraint);
			final ExecutorOperation O_OrderedSet_excluding = OCLstdlibTables.Operations._OrderedSet__excluding;
			final ExecutorProperty P_NamedElement_ownedRule = PivotTables.Properties._NamedElement__ownedRule;
			final LibraryProperty IP_NamedElement_ownedRule = P_NamedElement_ownedRule.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__NamedElement = PivotTables.Types._NamedElement;
			final ExecutorProperty P_Constraint_context = PivotTables.Properties._Constraint__context;
			final LibraryProperty IP_Constraint_context = P_Constraint_context.getImplementation();
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			
			
			Value A_symbol_13 = IP_Constraint_context.evaluate(evaluator, T_Pivot_ecore__pivot__NamedElement, self, P_Constraint_context);
			
			Value A_symbol_14 = IP_NamedElement_ownedRule.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Constraint_, A_symbol_13, P_NamedElement_ownedRule);
			
			
			DomainType static_A_symbol_11 = valueFactory.typeOf(A_symbol_14);
			LibraryBinaryOperation dynamic_A_symbol_11 = (LibraryBinaryOperation)static_A_symbol_11.lookupImplementation(standardLibrary, O_OrderedSet_excluding);
			Value A_symbol_11 = dynamic_A_symbol_11.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Constraint_, A_symbol_14, self);
			
			/** 
			 * Implementation of the iterator body.
			 */
			AbstractBinaryOperation body_A_symbol_12 = new AbstractBinaryOperation()
			{
			/*
			name
			*/
				public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
					final Value V_1_ = iterator1;	// iterator: 1_
					
					Value A_symbol_15 = IP_NamedElement_name.evaluate(evaluator, T_String, V_1_, P_NamedElement_name);
					
					return A_symbol_15;
				}
			};
			DomainType static_A_symbol_12 = A_symbol_11.getType();
			LibraryIteration dynamic_A_symbol_12 = (LibraryIteration)static_A_symbol_12.lookupImplementation(standardLibrary, O_Sequence_collect);
			Value acc_A_symbol_12 = dynamic_A_symbol_12.createAccumulatorValue(evaluator, T_Sequence_String_, T_String);
			ExecutorSingleIterationManager manager_A_symbol_12 = new ExecutorSingleIterationManager(evaluator, T_Sequence_String_, body_A_symbol_12, (CollectionValue)A_symbol_11, acc_A_symbol_12);
			Value A_symbol_12 = dynamic_A_symbol_12.evaluateIteration(manager_A_symbol_12);
			
			Value A_symbol_16 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
			
			DomainType static_A_symbol_17 = valueFactory.typeOf(A_symbol_12);
			LibraryBinaryOperation dynamic_A_symbol_17 = (LibraryBinaryOperation)static_A_symbol_17.lookupImplementation(standardLibrary, O_Collection_excludes);
			Value A_symbol_17 = dynamic_A_symbol_17.evaluate(evaluator, T_Boolean, A_symbol_12, A_symbol_16);
			return A_symbol_17;
		}
	}





}

