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
import org.eclipse.ocl.examples.domain.library.LibraryUnaryOperation;
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
 * PropertyBodies provides the Java implementation bodies of OCL-defined Property operations and properties.
 */
@SuppressWarnings("nls")
public class PropertyBodies
{

	/** 
	 * Implementation of the Property 'CompatibleInitialiser' invariant.
	 */
	public static class _invariant_CompatibleInitialiser extends AbstractUnaryOperation
	{
		public static _invariant_CompatibleInitialiser INSTANCE = new _invariant_CompatibleInitialiser();
	
		/*
		isDerived implies
	let
	  derivedConstraint : Constraint = ownedRule->any(stereotype = 'derivation')
	in
	  let
	    initialConstraint : Constraint = ownedRule->any(stereotype = 'initial')
	  in
	    let
	      derivedSpecification : ValueSpecification = if derivedConstraint <> null
	      then derivedConstraint.specification
	      else null
	      endif
	    in
	      let
	        initialSpecification : ValueSpecification = if initialConstraint <> null
	        then initialConstraint.specification
	        else null
	        endif
	      in
	        let
	          initialiser : ValueSpecification = if derivedSpecification <> null
	          then derivedSpecification
	          else initialSpecification
	          endif
	        in initialiser <> null and
	          initialiser.oclIsKindOf(ExpressionInOcl) implies
	          CompatibleBody(initialiser)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorProperty P_Property_isDerived = PivotTables.Properties._Property__isDerived;
			final LibraryProperty IP_Property_isDerived = P_Property_isDerived.getImplementation();
			final ExecutorOperation O_Boolean_and = OCLstdlibTables.Operations._Boolean__and;
			final ExecutorOperation O_OclAny__lt__gt_ = OCLstdlibTables.Operations._OclAny___lt__gt_;
			final NullValue Null = valueFactory.getNull();
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
			final StringValue S_initial = valueFactory.stringValueOf("initial");
			final StringValue S_derivati___ = valueFactory.stringValueOf("derivation");
			
			Value leftA_symbol_2;
			try {
				
				Value A_symbol_3 = IP_Property_isDerived.evaluate(evaluator, T_Boolean, self, P_Property_isDerived);
				
				leftA_symbol_2 = A_symbol_3;
			} catch (InvalidValueException e) {
				leftA_symbol_2 = valueFactory.getInvalid();
			}
			Value A_symbol_3 = leftA_symbol_2;
			Value rightA_symbol_2;
			try {
				
				Value A_symbol_4 = IP_NamedElement_ownedRule.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Constraint_, self, P_NamedElement_ownedRule);
				
				
				/** 
				 * Implementation of the iterator body.
				 */
				AbstractBinaryOperation body_A_symbol_5 = new AbstractBinaryOperation()
				{
				/*
				stereotype = 'derivation'
				*/
					public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
						final Value V_1_ = iterator1;	// iterator: 1_
						
						Value A_symbol_6 = IP_Constraint_stereotype.evaluate(evaluator, T_String, V_1_, P_Constraint_stereotype);
						
						DomainType static_A_symbol_7 = valueFactory.typeOf(A_symbol_6, S_derivati___);
						LibraryBinaryOperation dynamic_A_symbol_7 = (LibraryBinaryOperation)static_A_symbol_7.lookupImplementation(standardLibrary, O_String__eq_);
						Value A_symbol_7 = dynamic_A_symbol_7.evaluate(evaluator, T_Boolean, A_symbol_6, S_derivati___);
						return A_symbol_7;
					}
				};
				DomainType static_A_symbol_5 = A_symbol_4.getType();
				LibraryIteration dynamic_A_symbol_5 = (LibraryIteration)static_A_symbol_5.lookupImplementation(standardLibrary, O_Collection_any);
				Value acc_A_symbol_5 = dynamic_A_symbol_5.createAccumulatorValue(evaluator, T_Pivot_ecore__pivot__Constraint, T_Boolean);
				ExecutorSingleIterationManager manager_A_symbol_5 = new ExecutorSingleIterationManager(evaluator, T_Pivot_ecore__pivot__Constraint, body_A_symbol_5, (CollectionValue)A_symbol_4, acc_A_symbol_5);
				Value A_symbol_5 = dynamic_A_symbol_5.evaluateIteration(manager_A_symbol_5);
				final Value V_derivedConstraint = A_symbol_5;
				
				Value A_symbol_8 = IP_NamedElement_ownedRule.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Constraint_, self, P_NamedElement_ownedRule);
				
				
				/** 
				 * Implementation of the iterator body.
				 */
				AbstractBinaryOperation body_A_symbol_9 = new AbstractBinaryOperation()
				{
				/*
				stereotype = 'initial'
				*/
					public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
						final Value V_1_1 = iterator1;	// iterator: 1_
						
						Value A_symbol_10 = IP_Constraint_stereotype.evaluate(evaluator, T_String, V_1_1, P_Constraint_stereotype);
						
						DomainType static_A_symbol_11 = valueFactory.typeOf(A_symbol_10, S_initial);
						LibraryBinaryOperation dynamic_A_symbol_11 = (LibraryBinaryOperation)static_A_symbol_11.lookupImplementation(standardLibrary, O_String__eq_);
						Value A_symbol_11 = dynamic_A_symbol_11.evaluate(evaluator, T_Boolean, A_symbol_10, S_initial);
						return A_symbol_11;
					}
				};
				DomainType static_A_symbol_9 = A_symbol_8.getType();
				LibraryIteration dynamic_A_symbol_9 = (LibraryIteration)static_A_symbol_9.lookupImplementation(standardLibrary, O_Collection_any);
				Value acc_A_symbol_9 = dynamic_A_symbol_9.createAccumulatorValue(evaluator, T_Pivot_ecore__pivot__Constraint, T_Boolean);
				ExecutorSingleIterationManager manager_A_symbol_9 = new ExecutorSingleIterationManager(evaluator, T_Pivot_ecore__pivot__Constraint, body_A_symbol_9, (CollectionValue)A_symbol_8, acc_A_symbol_9);
				Value A_symbol_9 = dynamic_A_symbol_9.evaluateIteration(manager_A_symbol_9);
				final Value V_initialConstraint = A_symbol_9;
					
					DomainType static_A_symbol_12 = valueFactory.typeOf(V_derivedConstraint, Null);
					LibraryBinaryOperation dynamic_A_symbol_12 = (LibraryBinaryOperation)static_A_symbol_12.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
					Value A_symbol_12 = dynamic_A_symbol_12.evaluate(evaluator, T_Boolean, V_derivedConstraint, Null);
				Value A_symbol_13;
				if (A_symbol_12.isTrue()) {
					
					Value A_symbol_14 = IP_Constraint_specification.evaluate(evaluator, T_Pivot_ecore__pivot__ValueSpecification, V_derivedConstraint, P_Constraint_specification);
					
					A_symbol_13 = A_symbol_14;
				}
				else if (A_symbol_12.isFalse()) {
					A_symbol_13 = Null;
				}
				else if (A_symbol_12.isNull()) {
					A_symbol_13 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_13 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				final Value V_derivedSpecification = A_symbol_13;
					
					DomainType static_A_symbol_15 = valueFactory.typeOf(V_initialConstraint, Null);
					LibraryBinaryOperation dynamic_A_symbol_15 = (LibraryBinaryOperation)static_A_symbol_15.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
					Value A_symbol_15 = dynamic_A_symbol_15.evaluate(evaluator, T_Boolean, V_initialConstraint, Null);
				Value A_symbol_16;
				if (A_symbol_15.isTrue()) {
					
					Value A_symbol_17 = IP_Constraint_specification.evaluate(evaluator, T_Pivot_ecore__pivot__ValueSpecification, V_initialConstraint, P_Constraint_specification);
					
					A_symbol_16 = A_symbol_17;
				}
				else if (A_symbol_15.isFalse()) {
					A_symbol_16 = Null;
				}
				else if (A_symbol_15.isNull()) {
					A_symbol_16 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_16 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				final Value V_initialSpecification = A_symbol_16;
					
					DomainType static_A_symbol_18 = valueFactory.typeOf(V_derivedSpecification, Null);
					LibraryBinaryOperation dynamic_A_symbol_18 = (LibraryBinaryOperation)static_A_symbol_18.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
					Value A_symbol_18 = dynamic_A_symbol_18.evaluate(evaluator, T_Boolean, V_derivedSpecification, Null);
				Value A_symbol_19;
				if (A_symbol_18.isTrue()) {
					
					A_symbol_19 = V_derivedSpecification;
				}
				else if (A_symbol_18.isFalse()) {
					
					A_symbol_19 = V_initialSpecification;
				}
				else if (A_symbol_18.isNull()) {
					A_symbol_19 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_19 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				final Value V_initialiser = A_symbol_19;
				Value leftA_symbol_20;
				try {
					Value leftA_symbol_21;
					try {
						
						DomainType static_A_symbol_22 = valueFactory.typeOf(V_initialiser, Null);
						LibraryBinaryOperation dynamic_A_symbol_22 = (LibraryBinaryOperation)static_A_symbol_22.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
						Value A_symbol_22 = dynamic_A_symbol_22.evaluate(evaluator, T_Boolean, V_initialiser, Null);
						leftA_symbol_21 = A_symbol_22;
					} catch (InvalidValueException e) {
						leftA_symbol_21 = valueFactory.getInvalid();
					}
					Value A_symbol_22 = leftA_symbol_21;
					Value rightA_symbol_21;
					try {
						
						DomainType static_A_symbol_23 = valueFactory.typeOf(V_initialiser);
						LibraryBinaryOperation dynamic_A_symbol_23 = (LibraryBinaryOperation)static_A_symbol_23.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_23 = dynamic_A_symbol_23.evaluate(evaluator, T_Boolean, V_initialiser, T_ClassClassifier_Pivot_ecore__pivot__ExpressionInOcl_);
						rightA_symbol_21 = A_symbol_23;
					} catch (InvalidValueException e) {
						rightA_symbol_21 = valueFactory.getInvalid();
					}
					Value A_symbol_23 = rightA_symbol_21;
					DomainType static_A_symbol_21 = valueFactory.typeOf(A_symbol_22);
					LibraryBinaryOperation dynamic_A_symbol_21 = (LibraryBinaryOperation)static_A_symbol_21.lookupImplementation(standardLibrary, O_Boolean_and);
					Value A_symbol_21 = dynamic_A_symbol_21.evaluate(evaluator, T_Boolean, A_symbol_22, A_symbol_23);
					leftA_symbol_20 = A_symbol_21;
				} catch (InvalidValueException e) {
					leftA_symbol_20 = valueFactory.getInvalid();
				}
				Value A_symbol_21 = leftA_symbol_20;
				Value rightA_symbol_20;
				try {
					
					
					DomainType static_A_symbol_24 = valueFactory.typeOf(self);
					LibraryBinaryOperation dynamic_A_symbol_24 = (LibraryBinaryOperation)static_A_symbol_24.lookupImplementation(standardLibrary, O_TypedMultiplicityElement_CompatibleBody);
					Value A_symbol_24 = dynamic_A_symbol_24.evaluate(evaluator, T_Boolean, self, V_initialiser);
					rightA_symbol_20 = A_symbol_24;
				} catch (InvalidValueException e) {
					rightA_symbol_20 = valueFactory.getInvalid();
				}
				Value A_symbol_24 = rightA_symbol_20;
				DomainType static_A_symbol_20 = valueFactory.typeOf(A_symbol_21);
				LibraryBinaryOperation dynamic_A_symbol_20 = (LibraryBinaryOperation)static_A_symbol_20.lookupImplementation(standardLibrary, O_Boolean_implies);
				Value A_symbol_20 = dynamic_A_symbol_20.evaluate(evaluator, T_Boolean, A_symbol_21, A_symbol_24);
				final Value A_symbol_25 = A_symbol_20;
				final Value A_symbol_26 = A_symbol_25;
				final Value A_symbol_27 = A_symbol_26;
				final Value A_symbol_28 = A_symbol_27;
				final Value A_symbol_29 = A_symbol_28;
				rightA_symbol_2 = A_symbol_29;
			} catch (InvalidValueException e) {
				rightA_symbol_2 = valueFactory.getInvalid();
			}
			Value A_symbol_29 = rightA_symbol_2;
			DomainType static_A_symbol_2 = valueFactory.typeOf(A_symbol_3);
			LibraryBinaryOperation dynamic_A_symbol_2 = (LibraryBinaryOperation)static_A_symbol_2.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_2 = dynamic_A_symbol_2.evaluate(evaluator, T_Boolean, A_symbol_3, A_symbol_29);
			return A_symbol_2;
		}
	}

	/** 
	 * Implementation of the Property::isAttribute '' <body>.
	 */
	public static class _isAttribute_body_ extends AbstractBinaryOperation
	{
		public static _isAttribute_body_ INSTANCE = new _isAttribute_body_();
	
		/*
		let container : OclElement = oclContainer()
	in
	  container.oclIsKindOf(Type) and
	  container.oclAsType(Type)
	  .ownedAttribute->includes(self)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self, Value p) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_and = OCLstdlibTables.Operations._Boolean__and;
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final Value T_ClassClassifier_Type_ = valueFactory.createTypeValue(OCLstdlibTables.Types._Type);
			final ExecutorOperation O_Collection_includes = OCLstdlibTables.Operations._Collection__includes;
			final ExecutorType T_Pivot_ecore__pivot__Property = PivotTables.Types._Property;
			final DomainCollectionType T_OrderedSet_Pivot_ecore__pivot__Property_ = standardLibrary.getOrderedSetType(T_Pivot_ecore__pivot__Property);
			final ExecutorProperty P_Type_ownedAttribute = PivotTables.Properties._Type__ownedAttribute;
			final LibraryProperty IP_Type_ownedAttribute = P_Type_ownedAttribute.getImplementation();
			final ExecutorType T_Type = OCLstdlibTables.Types._Type;
			final ExecutorOperation O_OclAny_oclAsType = OCLstdlibTables.Operations._OclAny__oclAsType;
			final ExecutorType T_OclElement = OCLstdlibTables.Types._OclElement;
			final ExecutorOperation O_OclElement_oclContainer = OCLstdlibTables.Operations._OclElement__oclContainer;
			
			
			DomainType static_A_symbol_30 = valueFactory.typeOf(self);
			LibraryUnaryOperation dynamic_A_symbol_30 = (LibraryUnaryOperation)static_A_symbol_30.lookupImplementation(standardLibrary, O_OclElement_oclContainer);
			Value A_symbol_30 = dynamic_A_symbol_30.evaluate(evaluator, T_OclElement, self);
			final Value V_container = A_symbol_30;
			Value leftA_symbol_31;
			try {
				
				DomainType static_A_symbol_32 = valueFactory.typeOf(V_container);
				LibraryBinaryOperation dynamic_A_symbol_32 = (LibraryBinaryOperation)static_A_symbol_32.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_32 = dynamic_A_symbol_32.evaluate(evaluator, T_Boolean, V_container, T_ClassClassifier_Type_);
				leftA_symbol_31 = A_symbol_32;
			} catch (InvalidValueException e) {
				leftA_symbol_31 = valueFactory.getInvalid();
			}
			Value A_symbol_32 = leftA_symbol_31;
			Value rightA_symbol_31;
			try {
				
				DomainType static_A_symbol_33 = valueFactory.typeOf(V_container);
				LibraryBinaryOperation dynamic_A_symbol_33 = (LibraryBinaryOperation)static_A_symbol_33.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_33 = dynamic_A_symbol_33.evaluate(evaluator, T_Type, V_container, T_ClassClassifier_Type_);
				Value A_symbol_34 = IP_Type_ownedAttribute.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Property_, A_symbol_33, P_Type_ownedAttribute);
				
				
				DomainType static_A_symbol_35 = valueFactory.typeOf(A_symbol_34);
				LibraryBinaryOperation dynamic_A_symbol_35 = (LibraryBinaryOperation)static_A_symbol_35.lookupImplementation(standardLibrary, O_Collection_includes);
				Value A_symbol_35 = dynamic_A_symbol_35.evaluate(evaluator, T_Boolean, A_symbol_34, self);
				rightA_symbol_31 = A_symbol_35;
			} catch (InvalidValueException e) {
				rightA_symbol_31 = valueFactory.getInvalid();
			}
			Value A_symbol_35 = rightA_symbol_31;
			DomainType static_A_symbol_31 = valueFactory.typeOf(A_symbol_32);
			LibraryBinaryOperation dynamic_A_symbol_31 = (LibraryBinaryOperation)static_A_symbol_31.lookupImplementation(standardLibrary, O_Boolean_and);
			Value A_symbol_31 = dynamic_A_symbol_31.evaluate(evaluator, T_Boolean, A_symbol_32, A_symbol_35);
			final Value A_symbol_36 = A_symbol_31;
			return A_symbol_36;
		}
	}


















}

