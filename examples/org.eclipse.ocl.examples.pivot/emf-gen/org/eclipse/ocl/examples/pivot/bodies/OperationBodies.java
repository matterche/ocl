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
import org.eclipse.ocl.examples.domain.values.NullValue;
import org.eclipse.ocl.examples.domain.values.StringValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorSingleIterationManager;
import org.eclipse.ocl.examples.library.executor.ExecutorType;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.examples.pivot.PivotTables;

/**
 * OperationBodies provides the Java implementation bodies of OCL-defined Operation operations and properties.
 */
@SuppressWarnings("nls")
public class OperationBodies
{

	/** 
	 * Implementation of the Operation 'CompatibleReturn' invariant.
	 */
	public static class _invariant_CompatibleReturn extends AbstractUnaryOperation
	{
		public static _invariant_CompatibleReturn INSTANCE = new _invariant_CompatibleReturn();
	
		/*
		let
	  bodyConstraint : Constraint = ownedRule->any(stereotype = 'body')
	in bodyConstraint <> null implies
	  let bodySpecification : ValueSpecification = bodyConstraint.specification
	  in bodySpecification <> null and
	    bodySpecification.oclIsKindOf(ExpressionInOcl) implies
	    CompatibleBody(bodySpecification)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_OclAny__lt__gt_ = OCLstdlibTables.Operations._OclAny___lt__gt_;
			final NullValue Null = valueFactory.getNull();
			final ExecutorOperation O_Boolean_and = OCLstdlibTables.Operations._Boolean__and;
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final Value T_ClassClassifier_Pivot_ecore__pivot__ExpressionInOcl_ = valueFactory.createTypeValue(PivotTables.Types._ExpressionInOcl);
			final ExecutorOperation O_TypedMultiplicityElement_CompatibleBody = PivotTables.Operations._TypedMultiplicityElement__CompatibleBody;
			final ExecutorType T_Pivot_ecore__pivot__ValueSpecification = PivotTables.Types._ValueSpecification;
			final ExecutorProperty P_Constraint_specification = PivotTables.Properties._Constraint__specification;
			final LibraryProperty IP_Constraint_specification = P_Constraint_specification.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__Constraint = PivotTables.Types._Constraint;
			final ExecutorOperation O_Collection_any = OCLstdlibTables.Operations._Collection__any;
			final DomainCollectionType T_OrderedSet_Pivot_ecore__pivot__Constraint_ = standardLibrary.getOrderedSetType(T_Pivot_ecore__pivot__Constraint);
			final ExecutorProperty P_NamedElement_ownedRule = PivotTables.Properties._NamedElement__ownedRule;
			final LibraryProperty IP_NamedElement_ownedRule = P_NamedElement_ownedRule.getImplementation();
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_Constraint_stereotype = PivotTables.Properties._Constraint__stereotype;
			final LibraryProperty IP_Constraint_stereotype = P_Constraint_stereotype.getImplementation();
			final StringValue S_body = valueFactory.stringValueOf("body");
			
			
			Value A_symbol_345 = IP_NamedElement_ownedRule.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Constraint_, self, P_NamedElement_ownedRule);
			
			
			/** 
			 * Implementation of the iterator body.
			 */
			AbstractBinaryOperation body_A_symbol_346 = new AbstractBinaryOperation()
			{
			/*
			stereotype = 'body'
			*/
				public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
					final Value V_1_ = iterator1;	// iterator: 1_
					
					Value A_symbol_347 = IP_Constraint_stereotype.evaluate(evaluator, T_String, V_1_, P_Constraint_stereotype);
					
					DomainType static_A_symbol_348 = valueFactory.typeOf(A_symbol_347, S_body);
					LibraryBinaryOperation dynamic_A_symbol_348 = (LibraryBinaryOperation)static_A_symbol_348.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_348 = dynamic_A_symbol_348.evaluate(evaluator, T_Boolean, A_symbol_347, S_body);
					return A_symbol_348;
				}
			};
			DomainType static_A_symbol_346 = A_symbol_345.getType();
			LibraryIteration dynamic_A_symbol_346 = (LibraryIteration)static_A_symbol_346.lookupImplementation(standardLibrary, O_Collection_any);
			Value acc_A_symbol_346 = dynamic_A_symbol_346.createAccumulatorValue(evaluator, T_Pivot_ecore__pivot__Constraint, T_Boolean);
			ExecutorSingleIterationManager manager_A_symbol_346 = new ExecutorSingleIterationManager(evaluator, T_Pivot_ecore__pivot__Constraint, body_A_symbol_346, (CollectionValue)A_symbol_345, acc_A_symbol_346);
			Value A_symbol_346 = dynamic_A_symbol_346.evaluateIteration(manager_A_symbol_346);
			final Value V_bodyConstraint = A_symbol_346;
			Value leftA_symbol_349;
			try {
				
				DomainType static_A_symbol_350 = valueFactory.typeOf(V_bodyConstraint, Null);
				LibraryBinaryOperation dynamic_A_symbol_350 = (LibraryBinaryOperation)static_A_symbol_350.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
				Value A_symbol_350 = dynamic_A_symbol_350.evaluate(evaluator, T_Boolean, V_bodyConstraint, Null);
				leftA_symbol_349 = A_symbol_350;
			} catch (InvalidValueException e) {
				leftA_symbol_349 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_350 = leftA_symbol_349;
			Value rightA_symbol_349;
			try {
				
				Value A_symbol_351 = IP_Constraint_specification.evaluate(evaluator, T_Pivot_ecore__pivot__ValueSpecification, V_bodyConstraint, P_Constraint_specification);
				
				final Value V_bodySpecification = A_symbol_351;
				Value leftA_symbol_352;
				try {
					Value leftA_symbol_353;
					try {
						
						DomainType static_A_symbol_354 = valueFactory.typeOf(V_bodySpecification, Null);
						LibraryBinaryOperation dynamic_A_symbol_354 = (LibraryBinaryOperation)static_A_symbol_354.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
						Value A_symbol_354 = dynamic_A_symbol_354.evaluate(evaluator, T_Boolean, V_bodySpecification, Null);
						leftA_symbol_353 = A_symbol_354;
					} catch (InvalidValueException e) {
						leftA_symbol_353 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_354 = leftA_symbol_353;
					Value rightA_symbol_353;
					try {
						
						DomainType static_A_symbol_355 = valueFactory.typeOf(V_bodySpecification);
						LibraryBinaryOperation dynamic_A_symbol_355 = (LibraryBinaryOperation)static_A_symbol_355.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_355 = dynamic_A_symbol_355.evaluate(evaluator, T_Boolean, V_bodySpecification, T_ClassClassifier_Pivot_ecore__pivot__ExpressionInOcl_);
						rightA_symbol_353 = A_symbol_355;
					} catch (InvalidValueException e) {
						rightA_symbol_353 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_355 = rightA_symbol_353;
					DomainType static_A_symbol_353 = valueFactory.typeOf(A_symbol_354);
					LibraryBinaryOperation dynamic_A_symbol_353 = (LibraryBinaryOperation)static_A_symbol_353.lookupImplementation(standardLibrary, O_Boolean_and);
					Value A_symbol_353 = dynamic_A_symbol_353.evaluate(evaluator, T_Boolean, A_symbol_354, A_symbol_355);
					leftA_symbol_352 = A_symbol_353;
				} catch (InvalidValueException e) {
					leftA_symbol_352 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_353 = leftA_symbol_352;
				Value rightA_symbol_352;
				try {
					
					
					DomainType static_A_symbol_356 = valueFactory.typeOf(self);
					LibraryBinaryOperation dynamic_A_symbol_356 = (LibraryBinaryOperation)static_A_symbol_356.lookupImplementation(standardLibrary, O_TypedMultiplicityElement_CompatibleBody);
					Value A_symbol_356 = dynamic_A_symbol_356.evaluate(evaluator, T_Boolean, self, V_bodySpecification);
					rightA_symbol_352 = A_symbol_356;
				} catch (InvalidValueException e) {
					rightA_symbol_352 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_356 = rightA_symbol_352;
				DomainType static_A_symbol_352 = valueFactory.typeOf(A_symbol_353);
				LibraryBinaryOperation dynamic_A_symbol_352 = (LibraryBinaryOperation)static_A_symbol_352.lookupImplementation(standardLibrary, O_Boolean_implies);
				Value A_symbol_352 = dynamic_A_symbol_352.evaluate(evaluator, T_Boolean, A_symbol_353, A_symbol_356);
				final Value A_symbol_357 = A_symbol_352;
				rightA_symbol_349 = A_symbol_357;
			} catch (InvalidValueException e) {
				rightA_symbol_349 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_357 = rightA_symbol_349;
			DomainType static_A_symbol_349 = valueFactory.typeOf(A_symbol_350);
			LibraryBinaryOperation dynamic_A_symbol_349 = (LibraryBinaryOperation)static_A_symbol_349.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_349 = dynamic_A_symbol_349.evaluate(evaluator, T_Boolean, A_symbol_350, A_symbol_357);
			final Value A_symbol_358 = A_symbol_349;
			return A_symbol_358;
		}
	}








}

