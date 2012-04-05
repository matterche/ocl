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
		context.ownedRule->excluding(self)
	->forAll(name <> self.name or stereotype <> self.stereotype)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Collection_forAll = OCLstdlibTables.Operations._Collection__1_forAll;
			final ExecutorType T_Pivot_ecore__pivot__Constraint = PivotTables.Types._Constraint;
			final DomainCollectionType T_OrderedSet_Pivot_ecore__pivot__Constraint_ = standardLibrary.getOrderedSetType(T_Pivot_ecore__pivot__Constraint);
			final ExecutorOperation O_OrderedSet_excluding = OCLstdlibTables.Operations._OrderedSet__excluding;
			final ExecutorProperty P_NamedElement_ownedRule = PivotTables.Properties._NamedElement__ownedRule;
			final LibraryProperty IP_NamedElement_ownedRule = P_NamedElement_ownedRule.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__NamedElement = PivotTables.Types._NamedElement;
			final ExecutorProperty P_Constraint_context = PivotTables.Properties._Constraint__context;
			final LibraryProperty IP_Constraint_context = P_Constraint_context.getImplementation();
			final ExecutorOperation O_Boolean_or = OCLstdlibTables.Operations._Boolean__or;
			final ExecutorOperation O_String__lt__gt_ = OCLstdlibTables.Operations._String___lt__gt_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final ExecutorProperty P_Constraint_stereotype = PivotTables.Properties._Constraint__stereotype;
			final LibraryProperty IP_Constraint_stereotype = P_Constraint_stereotype.getImplementation();
			
			
			Value A_symbol_332 = IP_Constraint_context.evaluate(evaluator, T_Pivot_ecore__pivot__NamedElement, self, P_Constraint_context);
			
			Value A_symbol_333 = IP_NamedElement_ownedRule.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Constraint_, A_symbol_332, P_NamedElement_ownedRule);
			
			
			DomainType static_A_symbol_330 = valueFactory.typeOf(A_symbol_333);
			LibraryBinaryOperation dynamic_A_symbol_330 = (LibraryBinaryOperation)static_A_symbol_330.lookupImplementation(standardLibrary, O_OrderedSet_excluding);
			Value A_symbol_330 = dynamic_A_symbol_330.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Constraint_, A_symbol_333, self);
			
			/** 
			 * Implementation of the iterator body.
			 */
			AbstractBinaryOperation body_A_symbol_331 = new AbstractBinaryOperation()
			{
			/*
			name <> self.name or stereotype <> self.stereotype
			*/
				public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
					final Value V_1_ = iterator1;	// iterator: 1_
					Value leftA_symbol_334;
					try {
						
						Value A_symbol_335 = IP_NamedElement_name.evaluate(evaluator, T_String, V_1_, P_NamedElement_name);
						
						
						Value A_symbol_336 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
						
						DomainType static_A_symbol_337 = valueFactory.typeOf(A_symbol_335, A_symbol_336);
						LibraryBinaryOperation dynamic_A_symbol_337 = (LibraryBinaryOperation)static_A_symbol_337.lookupImplementation(standardLibrary, O_String__lt__gt_);
						Value A_symbol_337 = dynamic_A_symbol_337.evaluate(evaluator, T_Boolean, A_symbol_335, A_symbol_336);
						leftA_symbol_334 = A_symbol_337;
					} catch (InvalidValueException e) {
						leftA_symbol_334 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_337 = leftA_symbol_334;
					Value rightA_symbol_334;
					try {
						
						Value A_symbol_338 = IP_Constraint_stereotype.evaluate(evaluator, T_String, V_1_, P_Constraint_stereotype);
						
						
						Value A_symbol_339 = IP_Constraint_stereotype.evaluate(evaluator, T_String, self, P_Constraint_stereotype);
						
						DomainType static_A_symbol_340 = valueFactory.typeOf(A_symbol_338, A_symbol_339);
						LibraryBinaryOperation dynamic_A_symbol_340 = (LibraryBinaryOperation)static_A_symbol_340.lookupImplementation(standardLibrary, O_String__lt__gt_);
						Value A_symbol_340 = dynamic_A_symbol_340.evaluate(evaluator, T_Boolean, A_symbol_338, A_symbol_339);
						rightA_symbol_334 = A_symbol_340;
					} catch (InvalidValueException e) {
						rightA_symbol_334 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_340 = rightA_symbol_334;
					DomainType static_A_symbol_334 = valueFactory.typeOf(A_symbol_337);
					LibraryBinaryOperation dynamic_A_symbol_334 = (LibraryBinaryOperation)static_A_symbol_334.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_334 = dynamic_A_symbol_334.evaluate(evaluator, T_Boolean, A_symbol_337, A_symbol_340);
					return A_symbol_334;
				}
			};
			DomainType static_A_symbol_331 = A_symbol_330.getType();
			LibraryIteration dynamic_A_symbol_331 = (LibraryIteration)static_A_symbol_331.lookupImplementation(standardLibrary, O_Collection_forAll);
			Value acc_A_symbol_331 = dynamic_A_symbol_331.createAccumulatorValue(evaluator, T_Boolean, T_Boolean);
			ExecutorSingleIterationManager manager_A_symbol_331 = new ExecutorSingleIterationManager(evaluator, T_Boolean, body_A_symbol_331, (CollectionValue)A_symbol_330, acc_A_symbol_331);
			Value A_symbol_331 = dynamic_A_symbol_331.evaluateIteration(manager_A_symbol_331);
			return A_symbol_331;
		}
	}





}

