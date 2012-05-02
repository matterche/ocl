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
			
			
			Value A_symbol_7 = IP_NamedElement_ownedRule.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Constraint_, self, P_NamedElement_ownedRule);
			
			
			/** 
			 * Implementation of the iterator body.
			 */
			AbstractBinaryOperation body_A_symbol_8 = new AbstractBinaryOperation()
			{
			/*
			stereotype = 'body'
			*/
				public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
					final Value V_1_ = iterator1;	// iterator: 1_
					
					Value A_symbol_9 = IP_Constraint_stereotype.evaluate(evaluator, T_String, V_1_, P_Constraint_stereotype);
					
					DomainType static_A_symbol_10 = valueFactory.typeOf(A_symbol_9, S_body);
					LibraryBinaryOperation dynamic_A_symbol_10 = (LibraryBinaryOperation)static_A_symbol_10.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_10 = dynamic_A_symbol_10.evaluate(evaluator, T_Boolean, A_symbol_9, S_body);
					return A_symbol_10;
				}
			};
			DomainType static_A_symbol_8 = A_symbol_7.getType();
			LibraryIteration dynamic_A_symbol_8 = (LibraryIteration)static_A_symbol_8.lookupImplementation(standardLibrary, O_Collection_any);
			Value acc_A_symbol_8 = dynamic_A_symbol_8.createAccumulatorValue(evaluator, T_Pivot_ecore__pivot__Constraint, T_Boolean);
			ExecutorSingleIterationManager manager_A_symbol_8 = new ExecutorSingleIterationManager(evaluator, T_Pivot_ecore__pivot__Constraint, body_A_symbol_8, (CollectionValue)A_symbol_7, acc_A_symbol_8);
			Value A_symbol_8 = dynamic_A_symbol_8.evaluateIteration(manager_A_symbol_8);
			final Value V_bodyConstraint = A_symbol_8;
			Value leftA_symbol_11;
			try {
				
				DomainType static_A_symbol_12 = valueFactory.typeOf(V_bodyConstraint, Null);
				LibraryBinaryOperation dynamic_A_symbol_12 = (LibraryBinaryOperation)static_A_symbol_12.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
				Value A_symbol_12 = dynamic_A_symbol_12.evaluate(evaluator, T_Boolean, V_bodyConstraint, Null);
				leftA_symbol_11 = A_symbol_12;
			} catch (InvalidValueException e) {
				leftA_symbol_11 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_12 = leftA_symbol_11;
			Value rightA_symbol_11;
			try {
				
				Value A_symbol_13 = IP_Constraint_specification.evaluate(evaluator, T_Pivot_ecore__pivot__ValueSpecification, V_bodyConstraint, P_Constraint_specification);
				
				final Value V_bodySpecification = A_symbol_13;
				Value leftA_symbol_14;
				try {
					Value leftA_symbol_15;
					try {
						
						DomainType static_A_symbol_16 = valueFactory.typeOf(V_bodySpecification, Null);
						LibraryBinaryOperation dynamic_A_symbol_16 = (LibraryBinaryOperation)static_A_symbol_16.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
						Value A_symbol_16 = dynamic_A_symbol_16.evaluate(evaluator, T_Boolean, V_bodySpecification, Null);
						leftA_symbol_15 = A_symbol_16;
					} catch (InvalidValueException e) {
						leftA_symbol_15 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_16 = leftA_symbol_15;
					Value rightA_symbol_15;
					try {
						
						DomainType static_A_symbol_17 = valueFactory.typeOf(V_bodySpecification);
						LibraryBinaryOperation dynamic_A_symbol_17 = (LibraryBinaryOperation)static_A_symbol_17.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_17 = dynamic_A_symbol_17.evaluate(evaluator, T_Boolean, V_bodySpecification, T_ClassClassifier_Pivot_ecore__pivot__ExpressionInOcl_);
						rightA_symbol_15 = A_symbol_17;
					} catch (InvalidValueException e) {
						rightA_symbol_15 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_17 = rightA_symbol_15;
					DomainType static_A_symbol_15 = valueFactory.typeOf(A_symbol_16);
					LibraryBinaryOperation dynamic_A_symbol_15 = (LibraryBinaryOperation)static_A_symbol_15.lookupImplementation(standardLibrary, O_Boolean_and);
					Value A_symbol_15 = dynamic_A_symbol_15.evaluate(evaluator, T_Boolean, A_symbol_16, A_symbol_17);
					leftA_symbol_14 = A_symbol_15;
				} catch (InvalidValueException e) {
					leftA_symbol_14 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_15 = leftA_symbol_14;
				Value rightA_symbol_14;
				try {
					
					
					DomainType static_A_symbol_18 = valueFactory.typeOf(self);
					LibraryBinaryOperation dynamic_A_symbol_18 = (LibraryBinaryOperation)static_A_symbol_18.lookupImplementation(standardLibrary, O_TypedMultiplicityElement_CompatibleBody);
					Value A_symbol_18 = dynamic_A_symbol_18.evaluate(evaluator, T_Boolean, self, V_bodySpecification);
					rightA_symbol_14 = A_symbol_18;
				} catch (InvalidValueException e) {
					rightA_symbol_14 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_18 = rightA_symbol_14;
				DomainType static_A_symbol_14 = valueFactory.typeOf(A_symbol_15);
				LibraryBinaryOperation dynamic_A_symbol_14 = (LibraryBinaryOperation)static_A_symbol_14.lookupImplementation(standardLibrary, O_Boolean_implies);
				Value A_symbol_14 = dynamic_A_symbol_14.evaluate(evaluator, T_Boolean, A_symbol_15, A_symbol_18);
				final Value A_symbol_19 = A_symbol_14;
				rightA_symbol_11 = A_symbol_19;
			} catch (InvalidValueException e) {
				rightA_symbol_11 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_19 = rightA_symbol_11;
			DomainType static_A_symbol_11 = valueFactory.typeOf(A_symbol_12);
			LibraryBinaryOperation dynamic_A_symbol_11 = (LibraryBinaryOperation)static_A_symbol_11.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_11 = dynamic_A_symbol_11.evaluate(evaluator, T_Boolean, A_symbol_12, A_symbol_19);
			final Value A_symbol_20 = A_symbol_11;
			return A_symbol_20;
		}
	}








}

