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
			
			Value leftA_symbol_21;
			try {
				
				Value A_symbol_22 = IP_Property_isDerived.evaluate(evaluator, T_Boolean, self, P_Property_isDerived);
				
				leftA_symbol_21 = A_symbol_22;
			} catch (InvalidValueException e) {
				leftA_symbol_21 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_22 = leftA_symbol_21;
			Value rightA_symbol_21;
			try {
				
				Value A_symbol_23 = IP_NamedElement_ownedRule.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Constraint_, self, P_NamedElement_ownedRule);
				
				
				/** 
				 * Implementation of the iterator body.
				 */
				AbstractBinaryOperation body_A_symbol_24 = new AbstractBinaryOperation()
				{
				/*
				stereotype = 'derivation'
				*/
					public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
						final Value V_1_ = iterator1;	// iterator: 1_
						
						Value A_symbol_25 = IP_Constraint_stereotype.evaluate(evaluator, T_String, V_1_, P_Constraint_stereotype);
						
						DomainType static_A_symbol_26 = valueFactory.typeOf(A_symbol_25, S_derivati___);
						LibraryBinaryOperation dynamic_A_symbol_26 = (LibraryBinaryOperation)static_A_symbol_26.lookupImplementation(standardLibrary, O_String__eq_);
						Value A_symbol_26 = dynamic_A_symbol_26.evaluate(evaluator, T_Boolean, A_symbol_25, S_derivati___);
						return A_symbol_26;
					}
				};
				DomainType static_A_symbol_24 = A_symbol_23.getType();
				LibraryIteration dynamic_A_symbol_24 = (LibraryIteration)static_A_symbol_24.lookupImplementation(standardLibrary, O_Collection_any);
				Value acc_A_symbol_24 = dynamic_A_symbol_24.createAccumulatorValue(evaluator, T_Pivot_ecore__pivot__Constraint, T_Boolean);
				ExecutorSingleIterationManager manager_A_symbol_24 = new ExecutorSingleIterationManager(evaluator, T_Pivot_ecore__pivot__Constraint, body_A_symbol_24, (CollectionValue)A_symbol_23, acc_A_symbol_24);
				Value A_symbol_24 = dynamic_A_symbol_24.evaluateIteration(manager_A_symbol_24);
				final Value V_derivedConstraint = A_symbol_24;
				
				Value A_symbol_27 = IP_NamedElement_ownedRule.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Constraint_, self, P_NamedElement_ownedRule);
				
				
				/** 
				 * Implementation of the iterator body.
				 */
				AbstractBinaryOperation body_A_symbol_28 = new AbstractBinaryOperation()
				{
				/*
				stereotype = 'initial'
				*/
					public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
						final Value V_1_1 = iterator1;	// iterator: 1_
						
						Value A_symbol_29 = IP_Constraint_stereotype.evaluate(evaluator, T_String, V_1_1, P_Constraint_stereotype);
						
						DomainType static_A_symbol_30 = valueFactory.typeOf(A_symbol_29, S_initial);
						LibraryBinaryOperation dynamic_A_symbol_30 = (LibraryBinaryOperation)static_A_symbol_30.lookupImplementation(standardLibrary, O_String__eq_);
						Value A_symbol_30 = dynamic_A_symbol_30.evaluate(evaluator, T_Boolean, A_symbol_29, S_initial);
						return A_symbol_30;
					}
				};
				DomainType static_A_symbol_28 = A_symbol_27.getType();
				LibraryIteration dynamic_A_symbol_28 = (LibraryIteration)static_A_symbol_28.lookupImplementation(standardLibrary, O_Collection_any);
				Value acc_A_symbol_28 = dynamic_A_symbol_28.createAccumulatorValue(evaluator, T_Pivot_ecore__pivot__Constraint, T_Boolean);
				ExecutorSingleIterationManager manager_A_symbol_28 = new ExecutorSingleIterationManager(evaluator, T_Pivot_ecore__pivot__Constraint, body_A_symbol_28, (CollectionValue)A_symbol_27, acc_A_symbol_28);
				Value A_symbol_28 = dynamic_A_symbol_28.evaluateIteration(manager_A_symbol_28);
				final Value V_initialConstraint = A_symbol_28;
					
					DomainType static_A_symbol_31 = valueFactory.typeOf(V_derivedConstraint, Null);
					LibraryBinaryOperation dynamic_A_symbol_31 = (LibraryBinaryOperation)static_A_symbol_31.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
					Value A_symbol_31 = dynamic_A_symbol_31.evaluate(evaluator, T_Boolean, V_derivedConstraint, Null);
				Value A_symbol_32;
				if (A_symbol_31.isTrue()) {
					
					Value A_symbol_33 = IP_Constraint_specification.evaluate(evaluator, T_Pivot_ecore__pivot__ValueSpecification, V_derivedConstraint, P_Constraint_specification);
					
					A_symbol_32 = A_symbol_33;
				}
				else if (A_symbol_31.isFalse()) {
					A_symbol_32 = Null;
				}
				else if (A_symbol_31.isNull()) {
					A_symbol_32 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_32 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				final Value V_derivedSpecification = A_symbol_32;
					
					DomainType static_A_symbol_34 = valueFactory.typeOf(V_initialConstraint, Null);
					LibraryBinaryOperation dynamic_A_symbol_34 = (LibraryBinaryOperation)static_A_symbol_34.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
					Value A_symbol_34 = dynamic_A_symbol_34.evaluate(evaluator, T_Boolean, V_initialConstraint, Null);
				Value A_symbol_35;
				if (A_symbol_34.isTrue()) {
					
					Value A_symbol_36 = IP_Constraint_specification.evaluate(evaluator, T_Pivot_ecore__pivot__ValueSpecification, V_initialConstraint, P_Constraint_specification);
					
					A_symbol_35 = A_symbol_36;
				}
				else if (A_symbol_34.isFalse()) {
					A_symbol_35 = Null;
				}
				else if (A_symbol_34.isNull()) {
					A_symbol_35 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_35 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				final Value V_initialSpecification = A_symbol_35;
					
					DomainType static_A_symbol_37 = valueFactory.typeOf(V_derivedSpecification, Null);
					LibraryBinaryOperation dynamic_A_symbol_37 = (LibraryBinaryOperation)static_A_symbol_37.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
					Value A_symbol_37 = dynamic_A_symbol_37.evaluate(evaluator, T_Boolean, V_derivedSpecification, Null);
				Value A_symbol_38;
				if (A_symbol_37.isTrue()) {
					
					A_symbol_38 = V_derivedSpecification;
				}
				else if (A_symbol_37.isFalse()) {
					
					A_symbol_38 = V_initialSpecification;
				}
				else if (A_symbol_37.isNull()) {
					A_symbol_38 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_38 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				final Value V_initialiser = A_symbol_38;
				Value leftA_symbol_39;
				try {
					Value leftA_symbol_40;
					try {
						
						DomainType static_A_symbol_41 = valueFactory.typeOf(V_initialiser, Null);
						LibraryBinaryOperation dynamic_A_symbol_41 = (LibraryBinaryOperation)static_A_symbol_41.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
						Value A_symbol_41 = dynamic_A_symbol_41.evaluate(evaluator, T_Boolean, V_initialiser, Null);
						leftA_symbol_40 = A_symbol_41;
					} catch (InvalidValueException e) {
						leftA_symbol_40 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_41 = leftA_symbol_40;
					Value rightA_symbol_40;
					try {
						
						DomainType static_A_symbol_42 = valueFactory.typeOf(V_initialiser);
						LibraryBinaryOperation dynamic_A_symbol_42 = (LibraryBinaryOperation)static_A_symbol_42.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_42 = dynamic_A_symbol_42.evaluate(evaluator, T_Boolean, V_initialiser, T_ClassClassifier_Pivot_ecore__pivot__ExpressionInOcl_);
						rightA_symbol_40 = A_symbol_42;
					} catch (InvalidValueException e) {
						rightA_symbol_40 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_42 = rightA_symbol_40;
					DomainType static_A_symbol_40 = valueFactory.typeOf(A_symbol_41);
					LibraryBinaryOperation dynamic_A_symbol_40 = (LibraryBinaryOperation)static_A_symbol_40.lookupImplementation(standardLibrary, O_Boolean_and);
					Value A_symbol_40 = dynamic_A_symbol_40.evaluate(evaluator, T_Boolean, A_symbol_41, A_symbol_42);
					leftA_symbol_39 = A_symbol_40;
				} catch (InvalidValueException e) {
					leftA_symbol_39 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_40 = leftA_symbol_39;
				Value rightA_symbol_39;
				try {
					
					
					DomainType static_A_symbol_43 = valueFactory.typeOf(self);
					LibraryBinaryOperation dynamic_A_symbol_43 = (LibraryBinaryOperation)static_A_symbol_43.lookupImplementation(standardLibrary, O_TypedMultiplicityElement_CompatibleBody);
					Value A_symbol_43 = dynamic_A_symbol_43.evaluate(evaluator, T_Boolean, self, V_initialiser);
					rightA_symbol_39 = A_symbol_43;
				} catch (InvalidValueException e) {
					rightA_symbol_39 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_43 = rightA_symbol_39;
				DomainType static_A_symbol_39 = valueFactory.typeOf(A_symbol_40);
				LibraryBinaryOperation dynamic_A_symbol_39 = (LibraryBinaryOperation)static_A_symbol_39.lookupImplementation(standardLibrary, O_Boolean_implies);
				Value A_symbol_39 = dynamic_A_symbol_39.evaluate(evaluator, T_Boolean, A_symbol_40, A_symbol_43);
				final Value A_symbol_44 = A_symbol_39;
				final Value A_symbol_45 = A_symbol_44;
				final Value A_symbol_46 = A_symbol_45;
				final Value A_symbol_47 = A_symbol_46;
				final Value A_symbol_48 = A_symbol_47;
				rightA_symbol_21 = A_symbol_48;
			} catch (InvalidValueException e) {
				rightA_symbol_21 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_48 = rightA_symbol_21;
			DomainType static_A_symbol_21 = valueFactory.typeOf(A_symbol_22);
			LibraryBinaryOperation dynamic_A_symbol_21 = (LibraryBinaryOperation)static_A_symbol_21.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_21 = dynamic_A_symbol_21.evaluate(evaluator, T_Boolean, A_symbol_22, A_symbol_48);
			return A_symbol_21;
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
			
			
			DomainType static_A_symbol_49 = valueFactory.typeOf(self);
			LibraryUnaryOperation dynamic_A_symbol_49 = (LibraryUnaryOperation)static_A_symbol_49.lookupImplementation(standardLibrary, O_OclElement_oclContainer);
			Value A_symbol_49 = dynamic_A_symbol_49.evaluate(evaluator, T_OclElement, self);
			final Value V_container = A_symbol_49;
			Value leftA_symbol_50;
			try {
				
				DomainType static_A_symbol_51 = valueFactory.typeOf(V_container);
				LibraryBinaryOperation dynamic_A_symbol_51 = (LibraryBinaryOperation)static_A_symbol_51.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_51 = dynamic_A_symbol_51.evaluate(evaluator, T_Boolean, V_container, T_ClassClassifier_Type_);
				leftA_symbol_50 = A_symbol_51;
			} catch (InvalidValueException e) {
				leftA_symbol_50 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_51 = leftA_symbol_50;
			Value rightA_symbol_50;
			try {
				
				DomainType static_A_symbol_52 = valueFactory.typeOf(V_container);
				LibraryBinaryOperation dynamic_A_symbol_52 = (LibraryBinaryOperation)static_A_symbol_52.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_52 = dynamic_A_symbol_52.evaluate(evaluator, T_Type, V_container, T_ClassClassifier_Type_);
				Value A_symbol_53 = IP_Type_ownedAttribute.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Property_, A_symbol_52, P_Type_ownedAttribute);
				
				
				DomainType static_A_symbol_54 = valueFactory.typeOf(A_symbol_53);
				LibraryBinaryOperation dynamic_A_symbol_54 = (LibraryBinaryOperation)static_A_symbol_54.lookupImplementation(standardLibrary, O_Collection_includes);
				Value A_symbol_54 = dynamic_A_symbol_54.evaluate(evaluator, T_Boolean, A_symbol_53, self);
				rightA_symbol_50 = A_symbol_54;
			} catch (InvalidValueException e) {
				rightA_symbol_50 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_54 = rightA_symbol_50;
			DomainType static_A_symbol_50 = valueFactory.typeOf(A_symbol_51);
			LibraryBinaryOperation dynamic_A_symbol_50 = (LibraryBinaryOperation)static_A_symbol_50.lookupImplementation(standardLibrary, O_Boolean_and);
			Value A_symbol_50 = dynamic_A_symbol_50.evaluate(evaluator, T_Boolean, A_symbol_51, A_symbol_54);
			final Value A_symbol_55 = A_symbol_50;
			return A_symbol_55;
		}
	}


















}

