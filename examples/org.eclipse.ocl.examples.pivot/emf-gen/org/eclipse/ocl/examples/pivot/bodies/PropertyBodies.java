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
			
			Value leftA_symbol_4;
			try {
				
				Value A_symbol_5 = IP_Property_isDerived.evaluate(evaluator, T_Boolean, self, P_Property_isDerived);
				
				leftA_symbol_4 = A_symbol_5;
			} catch (InvalidValueException e) {
				leftA_symbol_4 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_5 = leftA_symbol_4;
			Value rightA_symbol_4;
			try {
				
				Value A_symbol_6 = IP_NamedElement_ownedRule.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Constraint_, self, P_NamedElement_ownedRule);
				
				
				/** 
				 * Implementation of the iterator body.
				 */
				AbstractBinaryOperation body_A_symbol_7 = new AbstractBinaryOperation()
				{
				/*
				stereotype = 'derivation'
				*/
					public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
						final Value V_1_ = iterator1;	// iterator: 1_
						
						Value A_symbol_8 = IP_Constraint_stereotype.evaluate(evaluator, T_String, V_1_, P_Constraint_stereotype);
						
						DomainType static_A_symbol_9 = valueFactory.typeOf(A_symbol_8, S_derivati___);
						LibraryBinaryOperation dynamic_A_symbol_9 = (LibraryBinaryOperation)static_A_symbol_9.lookupImplementation(standardLibrary, O_String__eq_);
						Value A_symbol_9 = dynamic_A_symbol_9.evaluate(evaluator, T_Boolean, A_symbol_8, S_derivati___);
						return A_symbol_9;
					}
				};
				DomainType static_A_symbol_7 = A_symbol_6.getType();
				LibraryIteration dynamic_A_symbol_7 = (LibraryIteration)static_A_symbol_7.lookupImplementation(standardLibrary, O_Collection_any);
				Value acc_A_symbol_7 = dynamic_A_symbol_7.createAccumulatorValue(evaluator, T_Pivot_ecore__pivot__Constraint, T_Boolean);
				ExecutorSingleIterationManager manager_A_symbol_7 = new ExecutorSingleIterationManager(evaluator, T_Pivot_ecore__pivot__Constraint, body_A_symbol_7, (CollectionValue)A_symbol_6, acc_A_symbol_7);
				Value A_symbol_7 = dynamic_A_symbol_7.evaluateIteration(manager_A_symbol_7);
				final Value V_derivedConstraint = A_symbol_7;
				
				Value A_symbol_10 = IP_NamedElement_ownedRule.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Constraint_, self, P_NamedElement_ownedRule);
				
				
				/** 
				 * Implementation of the iterator body.
				 */
				AbstractBinaryOperation body_A_symbol_11 = new AbstractBinaryOperation()
				{
				/*
				stereotype = 'initial'
				*/
					public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
						final Value V_1_1 = iterator1;	// iterator: 1_
						
						Value A_symbol_12 = IP_Constraint_stereotype.evaluate(evaluator, T_String, V_1_1, P_Constraint_stereotype);
						
						DomainType static_A_symbol_13 = valueFactory.typeOf(A_symbol_12, S_initial);
						LibraryBinaryOperation dynamic_A_symbol_13 = (LibraryBinaryOperation)static_A_symbol_13.lookupImplementation(standardLibrary, O_String__eq_);
						Value A_symbol_13 = dynamic_A_symbol_13.evaluate(evaluator, T_Boolean, A_symbol_12, S_initial);
						return A_symbol_13;
					}
				};
				DomainType static_A_symbol_11 = A_symbol_10.getType();
				LibraryIteration dynamic_A_symbol_11 = (LibraryIteration)static_A_symbol_11.lookupImplementation(standardLibrary, O_Collection_any);
				Value acc_A_symbol_11 = dynamic_A_symbol_11.createAccumulatorValue(evaluator, T_Pivot_ecore__pivot__Constraint, T_Boolean);
				ExecutorSingleIterationManager manager_A_symbol_11 = new ExecutorSingleIterationManager(evaluator, T_Pivot_ecore__pivot__Constraint, body_A_symbol_11, (CollectionValue)A_symbol_10, acc_A_symbol_11);
				Value A_symbol_11 = dynamic_A_symbol_11.evaluateIteration(manager_A_symbol_11);
				final Value V_initialConstraint = A_symbol_11;
					
					DomainType static_A_symbol_14 = valueFactory.typeOf(V_derivedConstraint, Null);
					LibraryBinaryOperation dynamic_A_symbol_14 = (LibraryBinaryOperation)static_A_symbol_14.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
					Value A_symbol_14 = dynamic_A_symbol_14.evaluate(evaluator, T_Boolean, V_derivedConstraint, Null);
				Value A_symbol_15;
				if (A_symbol_14.isTrue()) {
					
					Value A_symbol_16 = IP_Constraint_specification.evaluate(evaluator, T_Pivot_ecore__pivot__ValueSpecification, V_derivedConstraint, P_Constraint_specification);
					
					A_symbol_15 = A_symbol_16;
				}
				else if (A_symbol_14.isFalse()) {
					A_symbol_15 = Null;
				}
				else if (A_symbol_14.isNull()) {
					A_symbol_15 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_15 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				final Value V_derivedSpecification = A_symbol_15;
					
					DomainType static_A_symbol_17 = valueFactory.typeOf(V_initialConstraint, Null);
					LibraryBinaryOperation dynamic_A_symbol_17 = (LibraryBinaryOperation)static_A_symbol_17.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
					Value A_symbol_17 = dynamic_A_symbol_17.evaluate(evaluator, T_Boolean, V_initialConstraint, Null);
				Value A_symbol_18;
				if (A_symbol_17.isTrue()) {
					
					Value A_symbol_19 = IP_Constraint_specification.evaluate(evaluator, T_Pivot_ecore__pivot__ValueSpecification, V_initialConstraint, P_Constraint_specification);
					
					A_symbol_18 = A_symbol_19;
				}
				else if (A_symbol_17.isFalse()) {
					A_symbol_18 = Null;
				}
				else if (A_symbol_17.isNull()) {
					A_symbol_18 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_18 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				final Value V_initialSpecification = A_symbol_18;
					
					DomainType static_A_symbol_20 = valueFactory.typeOf(V_derivedSpecification, Null);
					LibraryBinaryOperation dynamic_A_symbol_20 = (LibraryBinaryOperation)static_A_symbol_20.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
					Value A_symbol_20 = dynamic_A_symbol_20.evaluate(evaluator, T_Boolean, V_derivedSpecification, Null);
				Value A_symbol_21;
				if (A_symbol_20.isTrue()) {
					
					A_symbol_21 = V_derivedSpecification;
				}
				else if (A_symbol_20.isFalse()) {
					
					A_symbol_21 = V_initialSpecification;
				}
				else if (A_symbol_20.isNull()) {
					A_symbol_21 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_21 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				final Value V_initialiser = A_symbol_21;
				Value leftA_symbol_22;
				try {
					Value leftA_symbol_23;
					try {
						
						DomainType static_A_symbol_24 = valueFactory.typeOf(V_initialiser, Null);
						LibraryBinaryOperation dynamic_A_symbol_24 = (LibraryBinaryOperation)static_A_symbol_24.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
						Value A_symbol_24 = dynamic_A_symbol_24.evaluate(evaluator, T_Boolean, V_initialiser, Null);
						leftA_symbol_23 = A_symbol_24;
					} catch (InvalidValueException e) {
						leftA_symbol_23 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_24 = leftA_symbol_23;
					Value rightA_symbol_23;
					try {
						
						DomainType static_A_symbol_25 = valueFactory.typeOf(V_initialiser);
						LibraryBinaryOperation dynamic_A_symbol_25 = (LibraryBinaryOperation)static_A_symbol_25.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_25 = dynamic_A_symbol_25.evaluate(evaluator, T_Boolean, V_initialiser, T_ClassClassifier_Pivot_ecore__pivot__ExpressionInOcl_);
						rightA_symbol_23 = A_symbol_25;
					} catch (InvalidValueException e) {
						rightA_symbol_23 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_25 = rightA_symbol_23;
					DomainType static_A_symbol_23 = valueFactory.typeOf(A_symbol_24);
					LibraryBinaryOperation dynamic_A_symbol_23 = (LibraryBinaryOperation)static_A_symbol_23.lookupImplementation(standardLibrary, O_Boolean_and);
					Value A_symbol_23 = dynamic_A_symbol_23.evaluate(evaluator, T_Boolean, A_symbol_24, A_symbol_25);
					leftA_symbol_22 = A_symbol_23;
				} catch (InvalidValueException e) {
					leftA_symbol_22 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_23 = leftA_symbol_22;
				Value rightA_symbol_22;
				try {
					
					
					DomainType static_A_symbol_26 = valueFactory.typeOf(self);
					LibraryBinaryOperation dynamic_A_symbol_26 = (LibraryBinaryOperation)static_A_symbol_26.lookupImplementation(standardLibrary, O_TypedMultiplicityElement_CompatibleBody);
					Value A_symbol_26 = dynamic_A_symbol_26.evaluate(evaluator, T_Boolean, self, V_initialiser);
					rightA_symbol_22 = A_symbol_26;
				} catch (InvalidValueException e) {
					rightA_symbol_22 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_26 = rightA_symbol_22;
				DomainType static_A_symbol_22 = valueFactory.typeOf(A_symbol_23);
				LibraryBinaryOperation dynamic_A_symbol_22 = (LibraryBinaryOperation)static_A_symbol_22.lookupImplementation(standardLibrary, O_Boolean_implies);
				Value A_symbol_22 = dynamic_A_symbol_22.evaluate(evaluator, T_Boolean, A_symbol_23, A_symbol_26);
				final Value A_symbol_27 = A_symbol_22;
				final Value A_symbol_28 = A_symbol_27;
				final Value A_symbol_29 = A_symbol_28;
				final Value A_symbol_30 = A_symbol_29;
				final Value A_symbol_31 = A_symbol_30;
				rightA_symbol_4 = A_symbol_31;
			} catch (InvalidValueException e) {
				rightA_symbol_4 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_31 = rightA_symbol_4;
			DomainType static_A_symbol_4 = valueFactory.typeOf(A_symbol_5);
			LibraryBinaryOperation dynamic_A_symbol_4 = (LibraryBinaryOperation)static_A_symbol_4.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_4 = dynamic_A_symbol_4.evaluate(evaluator, T_Boolean, A_symbol_5, A_symbol_31);
			return A_symbol_4;
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
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self, final Value p) throws InvalidValueException {
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
			
			
			DomainType static_A_symbol_32 = valueFactory.typeOf(self);
			LibraryUnaryOperation dynamic_A_symbol_32 = (LibraryUnaryOperation)static_A_symbol_32.lookupImplementation(standardLibrary, O_OclElement_oclContainer);
			Value A_symbol_32 = dynamic_A_symbol_32.evaluate(evaluator, T_OclElement, self);
			final Value V_container = A_symbol_32;
			Value leftA_symbol_33;
			try {
				
				DomainType static_A_symbol_34 = valueFactory.typeOf(V_container);
				LibraryBinaryOperation dynamic_A_symbol_34 = (LibraryBinaryOperation)static_A_symbol_34.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_34 = dynamic_A_symbol_34.evaluate(evaluator, T_Boolean, V_container, T_ClassClassifier_Type_);
				leftA_symbol_33 = A_symbol_34;
			} catch (InvalidValueException e) {
				leftA_symbol_33 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_34 = leftA_symbol_33;
			Value rightA_symbol_33;
			try {
				
				DomainType static_A_symbol_35 = valueFactory.typeOf(V_container);
				LibraryBinaryOperation dynamic_A_symbol_35 = (LibraryBinaryOperation)static_A_symbol_35.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_35 = dynamic_A_symbol_35.evaluate(evaluator, T_Type, V_container, T_ClassClassifier_Type_);
				Value A_symbol_36 = IP_Type_ownedAttribute.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Property_, A_symbol_35, P_Type_ownedAttribute);
				
				
				DomainType static_A_symbol_37 = valueFactory.typeOf(A_symbol_36);
				LibraryBinaryOperation dynamic_A_symbol_37 = (LibraryBinaryOperation)static_A_symbol_37.lookupImplementation(standardLibrary, O_Collection_includes);
				Value A_symbol_37 = dynamic_A_symbol_37.evaluate(evaluator, T_Boolean, A_symbol_36, self);
				rightA_symbol_33 = A_symbol_37;
			} catch (InvalidValueException e) {
				rightA_symbol_33 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_37 = rightA_symbol_33;
			DomainType static_A_symbol_33 = valueFactory.typeOf(A_symbol_34);
			LibraryBinaryOperation dynamic_A_symbol_33 = (LibraryBinaryOperation)static_A_symbol_33.lookupImplementation(standardLibrary, O_Boolean_and);
			Value A_symbol_33 = dynamic_A_symbol_33.evaluate(evaluator, T_Boolean, A_symbol_34, A_symbol_37);
			final Value A_symbol_38 = A_symbol_33;
			return A_symbol_38;
		}
	}


















}

