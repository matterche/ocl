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
			
			Value leftA_symbol_341;
			try {
				
				Value A_symbol_342 = IP_Property_isDerived.evaluate(evaluator, T_Boolean, self, P_Property_isDerived);
				
				leftA_symbol_341 = A_symbol_342;
			} catch (InvalidValueException e) {
				leftA_symbol_341 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_342 = leftA_symbol_341;
			Value rightA_symbol_341;
			try {
				
				Value A_symbol_343 = IP_NamedElement_ownedRule.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Constraint_, self, P_NamedElement_ownedRule);
				
				
				/** 
				 * Implementation of the iterator body.
				 */
				AbstractBinaryOperation body_A_symbol_344 = new AbstractBinaryOperation()
				{
				/*
				stereotype = 'derivation'
				*/
					public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
						final Value V_1_ = iterator1;	// iterator: 1_
						
						Value A_symbol_345 = IP_Constraint_stereotype.evaluate(evaluator, T_String, V_1_, P_Constraint_stereotype);
						
						DomainType static_A_symbol_346 = valueFactory.typeOf(A_symbol_345, S_derivati___);
						LibraryBinaryOperation dynamic_A_symbol_346 = (LibraryBinaryOperation)static_A_symbol_346.lookupImplementation(standardLibrary, O_String__eq_);
						Value A_symbol_346 = dynamic_A_symbol_346.evaluate(evaluator, T_Boolean, A_symbol_345, S_derivati___);
						return A_symbol_346;
					}
				};
				DomainType static_A_symbol_344 = A_symbol_343.getType();
				LibraryIteration dynamic_A_symbol_344 = (LibraryIteration)static_A_symbol_344.lookupImplementation(standardLibrary, O_Collection_any);
				Value acc_A_symbol_344 = dynamic_A_symbol_344.createAccumulatorValue(evaluator, T_Pivot_ecore__pivot__Constraint, T_Boolean);
				ExecutorSingleIterationManager manager_A_symbol_344 = new ExecutorSingleIterationManager(evaluator, T_Pivot_ecore__pivot__Constraint, body_A_symbol_344, (CollectionValue)A_symbol_343, acc_A_symbol_344);
				Value A_symbol_344 = dynamic_A_symbol_344.evaluateIteration(manager_A_symbol_344);
				final Value V_derivedConstraint = A_symbol_344;
				
				Value A_symbol_347 = IP_NamedElement_ownedRule.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Constraint_, self, P_NamedElement_ownedRule);
				
				
				/** 
				 * Implementation of the iterator body.
				 */
				AbstractBinaryOperation body_A_symbol_348 = new AbstractBinaryOperation()
				{
				/*
				stereotype = 'initial'
				*/
					public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
						final Value V_1_1 = iterator1;	// iterator: 1_
						
						Value A_symbol_349 = IP_Constraint_stereotype.evaluate(evaluator, T_String, V_1_1, P_Constraint_stereotype);
						
						DomainType static_A_symbol_350 = valueFactory.typeOf(A_symbol_349, S_initial);
						LibraryBinaryOperation dynamic_A_symbol_350 = (LibraryBinaryOperation)static_A_symbol_350.lookupImplementation(standardLibrary, O_String__eq_);
						Value A_symbol_350 = dynamic_A_symbol_350.evaluate(evaluator, T_Boolean, A_symbol_349, S_initial);
						return A_symbol_350;
					}
				};
				DomainType static_A_symbol_348 = A_symbol_347.getType();
				LibraryIteration dynamic_A_symbol_348 = (LibraryIteration)static_A_symbol_348.lookupImplementation(standardLibrary, O_Collection_any);
				Value acc_A_symbol_348 = dynamic_A_symbol_348.createAccumulatorValue(evaluator, T_Pivot_ecore__pivot__Constraint, T_Boolean);
				ExecutorSingleIterationManager manager_A_symbol_348 = new ExecutorSingleIterationManager(evaluator, T_Pivot_ecore__pivot__Constraint, body_A_symbol_348, (CollectionValue)A_symbol_347, acc_A_symbol_348);
				Value A_symbol_348 = dynamic_A_symbol_348.evaluateIteration(manager_A_symbol_348);
				final Value V_initialConstraint = A_symbol_348;
					
					DomainType static_A_symbol_351 = valueFactory.typeOf(V_derivedConstraint, Null);
					LibraryBinaryOperation dynamic_A_symbol_351 = (LibraryBinaryOperation)static_A_symbol_351.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
					Value A_symbol_351 = dynamic_A_symbol_351.evaluate(evaluator, T_Boolean, V_derivedConstraint, Null);
				Value A_symbol_352;
				if (A_symbol_351.isTrue()) {
					
					Value A_symbol_353 = IP_Constraint_specification.evaluate(evaluator, T_Pivot_ecore__pivot__ValueSpecification, V_derivedConstraint, P_Constraint_specification);
					
					A_symbol_352 = A_symbol_353;
				}
				else if (A_symbol_351.isFalse()) {
					A_symbol_352 = Null;
				}
				else if (A_symbol_351.isNull()) {
					A_symbol_352 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_352 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				final Value V_derivedSpecification = A_symbol_352;
					
					DomainType static_A_symbol_354 = valueFactory.typeOf(V_initialConstraint, Null);
					LibraryBinaryOperation dynamic_A_symbol_354 = (LibraryBinaryOperation)static_A_symbol_354.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
					Value A_symbol_354 = dynamic_A_symbol_354.evaluate(evaluator, T_Boolean, V_initialConstraint, Null);
				Value A_symbol_355;
				if (A_symbol_354.isTrue()) {
					
					Value A_symbol_356 = IP_Constraint_specification.evaluate(evaluator, T_Pivot_ecore__pivot__ValueSpecification, V_initialConstraint, P_Constraint_specification);
					
					A_symbol_355 = A_symbol_356;
				}
				else if (A_symbol_354.isFalse()) {
					A_symbol_355 = Null;
				}
				else if (A_symbol_354.isNull()) {
					A_symbol_355 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_355 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				final Value V_initialSpecification = A_symbol_355;
					
					DomainType static_A_symbol_357 = valueFactory.typeOf(V_derivedSpecification, Null);
					LibraryBinaryOperation dynamic_A_symbol_357 = (LibraryBinaryOperation)static_A_symbol_357.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
					Value A_symbol_357 = dynamic_A_symbol_357.evaluate(evaluator, T_Boolean, V_derivedSpecification, Null);
				Value A_symbol_358;
				if (A_symbol_357.isTrue()) {
					
					A_symbol_358 = V_derivedSpecification;
				}
				else if (A_symbol_357.isFalse()) {
					
					A_symbol_358 = V_initialSpecification;
				}
				else if (A_symbol_357.isNull()) {
					A_symbol_358 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_358 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				final Value V_initialiser = A_symbol_358;
				Value leftA_symbol_359;
				try {
					Value leftA_symbol_360;
					try {
						
						DomainType static_A_symbol_361 = valueFactory.typeOf(V_initialiser, Null);
						LibraryBinaryOperation dynamic_A_symbol_361 = (LibraryBinaryOperation)static_A_symbol_361.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
						Value A_symbol_361 = dynamic_A_symbol_361.evaluate(evaluator, T_Boolean, V_initialiser, Null);
						leftA_symbol_360 = A_symbol_361;
					} catch (InvalidValueException e) {
						leftA_symbol_360 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_361 = leftA_symbol_360;
					Value rightA_symbol_360;
					try {
						
						DomainType static_A_symbol_362 = valueFactory.typeOf(V_initialiser);
						LibraryBinaryOperation dynamic_A_symbol_362 = (LibraryBinaryOperation)static_A_symbol_362.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_362 = dynamic_A_symbol_362.evaluate(evaluator, T_Boolean, V_initialiser, T_ClassClassifier_Pivot_ecore__pivot__ExpressionInOcl_);
						rightA_symbol_360 = A_symbol_362;
					} catch (InvalidValueException e) {
						rightA_symbol_360 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_362 = rightA_symbol_360;
					DomainType static_A_symbol_360 = valueFactory.typeOf(A_symbol_361);
					LibraryBinaryOperation dynamic_A_symbol_360 = (LibraryBinaryOperation)static_A_symbol_360.lookupImplementation(standardLibrary, O_Boolean_and);
					Value A_symbol_360 = dynamic_A_symbol_360.evaluate(evaluator, T_Boolean, A_symbol_361, A_symbol_362);
					leftA_symbol_359 = A_symbol_360;
				} catch (InvalidValueException e) {
					leftA_symbol_359 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_360 = leftA_symbol_359;
				Value rightA_symbol_359;
				try {
					
					
					DomainType static_A_symbol_363 = valueFactory.typeOf(self);
					LibraryBinaryOperation dynamic_A_symbol_363 = (LibraryBinaryOperation)static_A_symbol_363.lookupImplementation(standardLibrary, O_TypedMultiplicityElement_CompatibleBody);
					Value A_symbol_363 = dynamic_A_symbol_363.evaluate(evaluator, T_Boolean, self, V_initialiser);
					rightA_symbol_359 = A_symbol_363;
				} catch (InvalidValueException e) {
					rightA_symbol_359 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_363 = rightA_symbol_359;
				DomainType static_A_symbol_359 = valueFactory.typeOf(A_symbol_360);
				LibraryBinaryOperation dynamic_A_symbol_359 = (LibraryBinaryOperation)static_A_symbol_359.lookupImplementation(standardLibrary, O_Boolean_implies);
				Value A_symbol_359 = dynamic_A_symbol_359.evaluate(evaluator, T_Boolean, A_symbol_360, A_symbol_363);
				final Value A_symbol_364 = A_symbol_359;
				final Value A_symbol_365 = A_symbol_364;
				final Value A_symbol_366 = A_symbol_365;
				final Value A_symbol_367 = A_symbol_366;
				final Value A_symbol_368 = A_symbol_367;
				rightA_symbol_341 = A_symbol_368;
			} catch (InvalidValueException e) {
				rightA_symbol_341 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_368 = rightA_symbol_341;
			DomainType static_A_symbol_341 = valueFactory.typeOf(A_symbol_342);
			LibraryBinaryOperation dynamic_A_symbol_341 = (LibraryBinaryOperation)static_A_symbol_341.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_341 = dynamic_A_symbol_341.evaluate(evaluator, T_Boolean, A_symbol_342, A_symbol_368);
			return A_symbol_341;
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
			
			
			DomainType static_A_symbol_369 = valueFactory.typeOf(self);
			LibraryUnaryOperation dynamic_A_symbol_369 = (LibraryUnaryOperation)static_A_symbol_369.lookupImplementation(standardLibrary, O_OclElement_oclContainer);
			Value A_symbol_369 = dynamic_A_symbol_369.evaluate(evaluator, T_OclElement, self);
			final Value V_container = A_symbol_369;
			Value leftA_symbol_370;
			try {
				
				DomainType static_A_symbol_371 = valueFactory.typeOf(V_container);
				LibraryBinaryOperation dynamic_A_symbol_371 = (LibraryBinaryOperation)static_A_symbol_371.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_371 = dynamic_A_symbol_371.evaluate(evaluator, T_Boolean, V_container, T_ClassClassifier_Type_);
				leftA_symbol_370 = A_symbol_371;
			} catch (InvalidValueException e) {
				leftA_symbol_370 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_371 = leftA_symbol_370;
			Value rightA_symbol_370;
			try {
				
				DomainType static_A_symbol_372 = valueFactory.typeOf(V_container);
				LibraryBinaryOperation dynamic_A_symbol_372 = (LibraryBinaryOperation)static_A_symbol_372.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_372 = dynamic_A_symbol_372.evaluate(evaluator, T_Type, V_container, T_ClassClassifier_Type_);
				Value A_symbol_373 = IP_Type_ownedAttribute.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Property_, A_symbol_372, P_Type_ownedAttribute);
				
				
				DomainType static_A_symbol_374 = valueFactory.typeOf(A_symbol_373);
				LibraryBinaryOperation dynamic_A_symbol_374 = (LibraryBinaryOperation)static_A_symbol_374.lookupImplementation(standardLibrary, O_Collection_includes);
				Value A_symbol_374 = dynamic_A_symbol_374.evaluate(evaluator, T_Boolean, A_symbol_373, self);
				rightA_symbol_370 = A_symbol_374;
			} catch (InvalidValueException e) {
				rightA_symbol_370 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_374 = rightA_symbol_370;
			DomainType static_A_symbol_370 = valueFactory.typeOf(A_symbol_371);
			LibraryBinaryOperation dynamic_A_symbol_370 = (LibraryBinaryOperation)static_A_symbol_370.lookupImplementation(standardLibrary, O_Boolean_and);
			Value A_symbol_370 = dynamic_A_symbol_370.evaluate(evaluator, T_Boolean, A_symbol_371, A_symbol_374);
			final Value A_symbol_375 = A_symbol_370;
			return A_symbol_375;
		}
	}


















}

