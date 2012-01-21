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
			
			Value leftA_symbol_27;
			try {
				
				Value A_symbol_28 = IP_Property_isDerived.evaluate(evaluator, T_Boolean, self, P_Property_isDerived);
				
				leftA_symbol_27 = A_symbol_28;
			} catch (InvalidValueException e) {
				leftA_symbol_27 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_28 = leftA_symbol_27;
			Value rightA_symbol_27;
			try {
				
				Value A_symbol_29 = IP_NamedElement_ownedRule.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Constraint_, self, P_NamedElement_ownedRule);
				
				
				/** 
				 * Implementation of the iterator body.
				 */
				AbstractBinaryOperation body_A_symbol_30 = new AbstractBinaryOperation()
				{
				/*
				stereotype = 'derivation'
				*/
					public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
						final Value V_1_ = iterator1;	// iterator: 1_
						
						Value A_symbol_31 = IP_Constraint_stereotype.evaluate(evaluator, T_String, V_1_, P_Constraint_stereotype);
						
						DomainType static_A_symbol_32 = valueFactory.typeOf(A_symbol_31, S_derivati___);
						LibraryBinaryOperation dynamic_A_symbol_32 = (LibraryBinaryOperation)static_A_symbol_32.lookupImplementation(standardLibrary, O_String__eq_);
						Value A_symbol_32 = dynamic_A_symbol_32.evaluate(evaluator, T_Boolean, A_symbol_31, S_derivati___);
						return A_symbol_32;
					}
				};
				DomainType static_A_symbol_30 = A_symbol_29.getType();
				LibraryIteration dynamic_A_symbol_30 = (LibraryIteration)static_A_symbol_30.lookupImplementation(standardLibrary, O_Collection_any);
				Value acc_A_symbol_30 = dynamic_A_symbol_30.createAccumulatorValue(evaluator, T_Pivot_ecore__pivot__Constraint, T_Boolean);
				ExecutorSingleIterationManager manager_A_symbol_30 = new ExecutorSingleIterationManager(evaluator, T_Pivot_ecore__pivot__Constraint, body_A_symbol_30, (CollectionValue)A_symbol_29, acc_A_symbol_30);
				Value A_symbol_30 = dynamic_A_symbol_30.evaluateIteration(manager_A_symbol_30);
				final Value V_derivedConstraint = A_symbol_30;
				
				Value A_symbol_33 = IP_NamedElement_ownedRule.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Constraint_, self, P_NamedElement_ownedRule);
				
				
				/** 
				 * Implementation of the iterator body.
				 */
				AbstractBinaryOperation body_A_symbol_34 = new AbstractBinaryOperation()
				{
				/*
				stereotype = 'initial'
				*/
					public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
						final Value V_1_1 = iterator1;	// iterator: 1_
						
						Value A_symbol_35 = IP_Constraint_stereotype.evaluate(evaluator, T_String, V_1_1, P_Constraint_stereotype);
						
						DomainType static_A_symbol_36 = valueFactory.typeOf(A_symbol_35, S_initial);
						LibraryBinaryOperation dynamic_A_symbol_36 = (LibraryBinaryOperation)static_A_symbol_36.lookupImplementation(standardLibrary, O_String__eq_);
						Value A_symbol_36 = dynamic_A_symbol_36.evaluate(evaluator, T_Boolean, A_symbol_35, S_initial);
						return A_symbol_36;
					}
				};
				DomainType static_A_symbol_34 = A_symbol_33.getType();
				LibraryIteration dynamic_A_symbol_34 = (LibraryIteration)static_A_symbol_34.lookupImplementation(standardLibrary, O_Collection_any);
				Value acc_A_symbol_34 = dynamic_A_symbol_34.createAccumulatorValue(evaluator, T_Pivot_ecore__pivot__Constraint, T_Boolean);
				ExecutorSingleIterationManager manager_A_symbol_34 = new ExecutorSingleIterationManager(evaluator, T_Pivot_ecore__pivot__Constraint, body_A_symbol_34, (CollectionValue)A_symbol_33, acc_A_symbol_34);
				Value A_symbol_34 = dynamic_A_symbol_34.evaluateIteration(manager_A_symbol_34);
				final Value V_initialConstraint = A_symbol_34;
					
					DomainType static_A_symbol_37 = valueFactory.typeOf(V_derivedConstraint, Null);
					LibraryBinaryOperation dynamic_A_symbol_37 = (LibraryBinaryOperation)static_A_symbol_37.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
					Value A_symbol_37 = dynamic_A_symbol_37.evaluate(evaluator, T_Boolean, V_derivedConstraint, Null);
				Value A_symbol_38;
				if (A_symbol_37.isTrue()) {
					
					Value A_symbol_39 = IP_Constraint_specification.evaluate(evaluator, T_Pivot_ecore__pivot__ValueSpecification, V_derivedConstraint, P_Constraint_specification);
					
					A_symbol_38 = A_symbol_39;
				}
				else if (A_symbol_37.isFalse()) {
					A_symbol_38 = Null;
				}
				else if (A_symbol_37.isNull()) {
					A_symbol_38 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_38 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				final Value V_derivedSpecification = A_symbol_38;
					
					DomainType static_A_symbol_40 = valueFactory.typeOf(V_initialConstraint, Null);
					LibraryBinaryOperation dynamic_A_symbol_40 = (LibraryBinaryOperation)static_A_symbol_40.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
					Value A_symbol_40 = dynamic_A_symbol_40.evaluate(evaluator, T_Boolean, V_initialConstraint, Null);
				Value A_symbol_41;
				if (A_symbol_40.isTrue()) {
					
					Value A_symbol_42 = IP_Constraint_specification.evaluate(evaluator, T_Pivot_ecore__pivot__ValueSpecification, V_initialConstraint, P_Constraint_specification);
					
					A_symbol_41 = A_symbol_42;
				}
				else if (A_symbol_40.isFalse()) {
					A_symbol_41 = Null;
				}
				else if (A_symbol_40.isNull()) {
					A_symbol_41 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_41 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				final Value V_initialSpecification = A_symbol_41;
					
					DomainType static_A_symbol_43 = valueFactory.typeOf(V_derivedSpecification, Null);
					LibraryBinaryOperation dynamic_A_symbol_43 = (LibraryBinaryOperation)static_A_symbol_43.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
					Value A_symbol_43 = dynamic_A_symbol_43.evaluate(evaluator, T_Boolean, V_derivedSpecification, Null);
				Value A_symbol_44;
				if (A_symbol_43.isTrue()) {
					
					A_symbol_44 = V_derivedSpecification;
				}
				else if (A_symbol_43.isFalse()) {
					
					A_symbol_44 = V_initialSpecification;
				}
				else if (A_symbol_43.isNull()) {
					A_symbol_44 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_44 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				final Value V_initialiser = A_symbol_44;
				Value leftA_symbol_45;
				try {
					Value leftA_symbol_46;
					try {
						
						DomainType static_A_symbol_47 = valueFactory.typeOf(V_initialiser, Null);
						LibraryBinaryOperation dynamic_A_symbol_47 = (LibraryBinaryOperation)static_A_symbol_47.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
						Value A_symbol_47 = dynamic_A_symbol_47.evaluate(evaluator, T_Boolean, V_initialiser, Null);
						leftA_symbol_46 = A_symbol_47;
					} catch (InvalidValueException e) {
						leftA_symbol_46 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_47 = leftA_symbol_46;
					Value rightA_symbol_46;
					try {
						
						DomainType static_A_symbol_48 = valueFactory.typeOf(V_initialiser);
						LibraryBinaryOperation dynamic_A_symbol_48 = (LibraryBinaryOperation)static_A_symbol_48.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_48 = dynamic_A_symbol_48.evaluate(evaluator, T_Boolean, V_initialiser, T_ClassClassifier_Pivot_ecore__pivot__ExpressionInOcl_);
						rightA_symbol_46 = A_symbol_48;
					} catch (InvalidValueException e) {
						rightA_symbol_46 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_48 = rightA_symbol_46;
					DomainType static_A_symbol_46 = valueFactory.typeOf(A_symbol_47);
					LibraryBinaryOperation dynamic_A_symbol_46 = (LibraryBinaryOperation)static_A_symbol_46.lookupImplementation(standardLibrary, O_Boolean_and);
					Value A_symbol_46 = dynamic_A_symbol_46.evaluate(evaluator, T_Boolean, A_symbol_47, A_symbol_48);
					leftA_symbol_45 = A_symbol_46;
				} catch (InvalidValueException e) {
					leftA_symbol_45 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_46 = leftA_symbol_45;
				Value rightA_symbol_45;
				try {
					
					
					DomainType static_A_symbol_49 = valueFactory.typeOf(self);
					LibraryBinaryOperation dynamic_A_symbol_49 = (LibraryBinaryOperation)static_A_symbol_49.lookupImplementation(standardLibrary, O_TypedMultiplicityElement_CompatibleBody);
					Value A_symbol_49 = dynamic_A_symbol_49.evaluate(evaluator, T_Boolean, self, V_initialiser);
					rightA_symbol_45 = A_symbol_49;
				} catch (InvalidValueException e) {
					rightA_symbol_45 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_49 = rightA_symbol_45;
				DomainType static_A_symbol_45 = valueFactory.typeOf(A_symbol_46);
				LibraryBinaryOperation dynamic_A_symbol_45 = (LibraryBinaryOperation)static_A_symbol_45.lookupImplementation(standardLibrary, O_Boolean_implies);
				Value A_symbol_45 = dynamic_A_symbol_45.evaluate(evaluator, T_Boolean, A_symbol_46, A_symbol_49);
				final Value A_symbol_50 = A_symbol_45;
				final Value A_symbol_51 = A_symbol_50;
				final Value A_symbol_52 = A_symbol_51;
				final Value A_symbol_53 = A_symbol_52;
				final Value A_symbol_54 = A_symbol_53;
				rightA_symbol_27 = A_symbol_54;
			} catch (InvalidValueException e) {
				rightA_symbol_27 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_54 = rightA_symbol_27;
			DomainType static_A_symbol_27 = valueFactory.typeOf(A_symbol_28);
			LibraryBinaryOperation dynamic_A_symbol_27 = (LibraryBinaryOperation)static_A_symbol_27.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_27 = dynamic_A_symbol_27.evaluate(evaluator, T_Boolean, A_symbol_28, A_symbol_54);
			return A_symbol_27;
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
			
			
			DomainType static_A_symbol_55 = valueFactory.typeOf(self);
			LibraryUnaryOperation dynamic_A_symbol_55 = (LibraryUnaryOperation)static_A_symbol_55.lookupImplementation(standardLibrary, O_OclElement_oclContainer);
			Value A_symbol_55 = dynamic_A_symbol_55.evaluate(evaluator, T_OclElement, self);
			final Value V_container = A_symbol_55;
			Value leftA_symbol_56;
			try {
				
				DomainType static_A_symbol_57 = valueFactory.typeOf(V_container);
				LibraryBinaryOperation dynamic_A_symbol_57 = (LibraryBinaryOperation)static_A_symbol_57.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_57 = dynamic_A_symbol_57.evaluate(evaluator, T_Boolean, V_container, T_ClassClassifier_Type_);
				leftA_symbol_56 = A_symbol_57;
			} catch (InvalidValueException e) {
				leftA_symbol_56 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_57 = leftA_symbol_56;
			Value rightA_symbol_56;
			try {
				
				DomainType static_A_symbol_58 = valueFactory.typeOf(V_container);
				LibraryBinaryOperation dynamic_A_symbol_58 = (LibraryBinaryOperation)static_A_symbol_58.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_58 = dynamic_A_symbol_58.evaluate(evaluator, T_Type, V_container, T_ClassClassifier_Type_);
				Value A_symbol_59 = IP_Type_ownedAttribute.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Property_, A_symbol_58, P_Type_ownedAttribute);
				
				
				DomainType static_A_symbol_60 = valueFactory.typeOf(A_symbol_59);
				LibraryBinaryOperation dynamic_A_symbol_60 = (LibraryBinaryOperation)static_A_symbol_60.lookupImplementation(standardLibrary, O_Collection_includes);
				Value A_symbol_60 = dynamic_A_symbol_60.evaluate(evaluator, T_Boolean, A_symbol_59, self);
				rightA_symbol_56 = A_symbol_60;
			} catch (InvalidValueException e) {
				rightA_symbol_56 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_60 = rightA_symbol_56;
			DomainType static_A_symbol_56 = valueFactory.typeOf(A_symbol_57);
			LibraryBinaryOperation dynamic_A_symbol_56 = (LibraryBinaryOperation)static_A_symbol_56.lookupImplementation(standardLibrary, O_Boolean_and);
			Value A_symbol_56 = dynamic_A_symbol_56.evaluate(evaluator, T_Boolean, A_symbol_57, A_symbol_60);
			final Value A_symbol_61 = A_symbol_56;
			return A_symbol_61;
		}
	}



















}

