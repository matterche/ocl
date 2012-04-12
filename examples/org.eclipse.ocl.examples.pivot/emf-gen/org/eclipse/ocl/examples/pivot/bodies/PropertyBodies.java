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
			
			Value leftA_symbol_324;
			try {
				
				Value A_symbol_325 = IP_Property_isDerived.evaluate(evaluator, T_Boolean, self, P_Property_isDerived);
				
				leftA_symbol_324 = A_symbol_325;
			} catch (InvalidValueException e) {
				leftA_symbol_324 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_325 = leftA_symbol_324;
			Value rightA_symbol_324;
			try {
				
				Value A_symbol_326 = IP_NamedElement_ownedRule.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Constraint_, self, P_NamedElement_ownedRule);
				
				
				/** 
				 * Implementation of the iterator body.
				 */
				AbstractBinaryOperation body_A_symbol_327 = new AbstractBinaryOperation()
				{
				/*
				stereotype = 'derivation'
				*/
					public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
						final Value V_1_ = iterator1;	// iterator: 1_
						
						Value A_symbol_328 = IP_Constraint_stereotype.evaluate(evaluator, T_String, V_1_, P_Constraint_stereotype);
						
						DomainType static_A_symbol_329 = valueFactory.typeOf(A_symbol_328, S_derivati___);
						LibraryBinaryOperation dynamic_A_symbol_329 = (LibraryBinaryOperation)static_A_symbol_329.lookupImplementation(standardLibrary, O_String__eq_);
						Value A_symbol_329 = dynamic_A_symbol_329.evaluate(evaluator, T_Boolean, A_symbol_328, S_derivati___);
						return A_symbol_329;
					}
				};
				DomainType static_A_symbol_327 = A_symbol_326.getType();
				LibraryIteration dynamic_A_symbol_327 = (LibraryIteration)static_A_symbol_327.lookupImplementation(standardLibrary, O_Collection_any);
				Value acc_A_symbol_327 = dynamic_A_symbol_327.createAccumulatorValue(evaluator, T_Pivot_ecore__pivot__Constraint, T_Boolean);
				ExecutorSingleIterationManager manager_A_symbol_327 = new ExecutorSingleIterationManager(evaluator, T_Pivot_ecore__pivot__Constraint, body_A_symbol_327, (CollectionValue)A_symbol_326, acc_A_symbol_327);
				Value A_symbol_327 = dynamic_A_symbol_327.evaluateIteration(manager_A_symbol_327);
				final Value V_derivedConstraint = A_symbol_327;
				
				Value A_symbol_330 = IP_NamedElement_ownedRule.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Constraint_, self, P_NamedElement_ownedRule);
				
				
				/** 
				 * Implementation of the iterator body.
				 */
				AbstractBinaryOperation body_A_symbol_331 = new AbstractBinaryOperation()
				{
				/*
				stereotype = 'initial'
				*/
					public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
						final Value V_1_1 = iterator1;	// iterator: 1_
						
						Value A_symbol_332 = IP_Constraint_stereotype.evaluate(evaluator, T_String, V_1_1, P_Constraint_stereotype);
						
						DomainType static_A_symbol_333 = valueFactory.typeOf(A_symbol_332, S_initial);
						LibraryBinaryOperation dynamic_A_symbol_333 = (LibraryBinaryOperation)static_A_symbol_333.lookupImplementation(standardLibrary, O_String__eq_);
						Value A_symbol_333 = dynamic_A_symbol_333.evaluate(evaluator, T_Boolean, A_symbol_332, S_initial);
						return A_symbol_333;
					}
				};
				DomainType static_A_symbol_331 = A_symbol_330.getType();
				LibraryIteration dynamic_A_symbol_331 = (LibraryIteration)static_A_symbol_331.lookupImplementation(standardLibrary, O_Collection_any);
				Value acc_A_symbol_331 = dynamic_A_symbol_331.createAccumulatorValue(evaluator, T_Pivot_ecore__pivot__Constraint, T_Boolean);
				ExecutorSingleIterationManager manager_A_symbol_331 = new ExecutorSingleIterationManager(evaluator, T_Pivot_ecore__pivot__Constraint, body_A_symbol_331, (CollectionValue)A_symbol_330, acc_A_symbol_331);
				Value A_symbol_331 = dynamic_A_symbol_331.evaluateIteration(manager_A_symbol_331);
				final Value V_initialConstraint = A_symbol_331;
					
					DomainType static_A_symbol_334 = valueFactory.typeOf(V_derivedConstraint, Null);
					LibraryBinaryOperation dynamic_A_symbol_334 = (LibraryBinaryOperation)static_A_symbol_334.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
					Value A_symbol_334 = dynamic_A_symbol_334.evaluate(evaluator, T_Boolean, V_derivedConstraint, Null);
				Value A_symbol_335;
				if (A_symbol_334.isTrue()) {
					
					Value A_symbol_336 = IP_Constraint_specification.evaluate(evaluator, T_Pivot_ecore__pivot__ValueSpecification, V_derivedConstraint, P_Constraint_specification);
					
					A_symbol_335 = A_symbol_336;
				}
				else if (A_symbol_334.isFalse()) {
					A_symbol_335 = Null;
				}
				else if (A_symbol_334.isNull()) {
					A_symbol_335 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_335 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				final Value V_derivedSpecification = A_symbol_335;
					
					DomainType static_A_symbol_337 = valueFactory.typeOf(V_initialConstraint, Null);
					LibraryBinaryOperation dynamic_A_symbol_337 = (LibraryBinaryOperation)static_A_symbol_337.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
					Value A_symbol_337 = dynamic_A_symbol_337.evaluate(evaluator, T_Boolean, V_initialConstraint, Null);
				Value A_symbol_338;
				if (A_symbol_337.isTrue()) {
					
					Value A_symbol_339 = IP_Constraint_specification.evaluate(evaluator, T_Pivot_ecore__pivot__ValueSpecification, V_initialConstraint, P_Constraint_specification);
					
					A_symbol_338 = A_symbol_339;
				}
				else if (A_symbol_337.isFalse()) {
					A_symbol_338 = Null;
				}
				else if (A_symbol_337.isNull()) {
					A_symbol_338 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_338 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				final Value V_initialSpecification = A_symbol_338;
					
					DomainType static_A_symbol_340 = valueFactory.typeOf(V_derivedSpecification, Null);
					LibraryBinaryOperation dynamic_A_symbol_340 = (LibraryBinaryOperation)static_A_symbol_340.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
					Value A_symbol_340 = dynamic_A_symbol_340.evaluate(evaluator, T_Boolean, V_derivedSpecification, Null);
				Value A_symbol_341;
				if (A_symbol_340.isTrue()) {
					
					A_symbol_341 = V_derivedSpecification;
				}
				else if (A_symbol_340.isFalse()) {
					
					A_symbol_341 = V_initialSpecification;
				}
				else if (A_symbol_340.isNull()) {
					A_symbol_341 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_341 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				final Value V_initialiser = A_symbol_341;
				Value leftA_symbol_342;
				try {
					Value leftA_symbol_343;
					try {
						
						DomainType static_A_symbol_344 = valueFactory.typeOf(V_initialiser, Null);
						LibraryBinaryOperation dynamic_A_symbol_344 = (LibraryBinaryOperation)static_A_symbol_344.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
						Value A_symbol_344 = dynamic_A_symbol_344.evaluate(evaluator, T_Boolean, V_initialiser, Null);
						leftA_symbol_343 = A_symbol_344;
					} catch (InvalidValueException e) {
						leftA_symbol_343 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_344 = leftA_symbol_343;
					Value rightA_symbol_343;
					try {
						
						DomainType static_A_symbol_345 = valueFactory.typeOf(V_initialiser);
						LibraryBinaryOperation dynamic_A_symbol_345 = (LibraryBinaryOperation)static_A_symbol_345.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_345 = dynamic_A_symbol_345.evaluate(evaluator, T_Boolean, V_initialiser, T_ClassClassifier_Pivot_ecore__pivot__ExpressionInOcl_);
						rightA_symbol_343 = A_symbol_345;
					} catch (InvalidValueException e) {
						rightA_symbol_343 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_345 = rightA_symbol_343;
					DomainType static_A_symbol_343 = valueFactory.typeOf(A_symbol_344);
					LibraryBinaryOperation dynamic_A_symbol_343 = (LibraryBinaryOperation)static_A_symbol_343.lookupImplementation(standardLibrary, O_Boolean_and);
					Value A_symbol_343 = dynamic_A_symbol_343.evaluate(evaluator, T_Boolean, A_symbol_344, A_symbol_345);
					leftA_symbol_342 = A_symbol_343;
				} catch (InvalidValueException e) {
					leftA_symbol_342 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_343 = leftA_symbol_342;
				Value rightA_symbol_342;
				try {
					
					
					DomainType static_A_symbol_346 = valueFactory.typeOf(self);
					LibraryBinaryOperation dynamic_A_symbol_346 = (LibraryBinaryOperation)static_A_symbol_346.lookupImplementation(standardLibrary, O_TypedMultiplicityElement_CompatibleBody);
					Value A_symbol_346 = dynamic_A_symbol_346.evaluate(evaluator, T_Boolean, self, V_initialiser);
					rightA_symbol_342 = A_symbol_346;
				} catch (InvalidValueException e) {
					rightA_symbol_342 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_346 = rightA_symbol_342;
				DomainType static_A_symbol_342 = valueFactory.typeOf(A_symbol_343);
				LibraryBinaryOperation dynamic_A_symbol_342 = (LibraryBinaryOperation)static_A_symbol_342.lookupImplementation(standardLibrary, O_Boolean_implies);
				Value A_symbol_342 = dynamic_A_symbol_342.evaluate(evaluator, T_Boolean, A_symbol_343, A_symbol_346);
				final Value A_symbol_347 = A_symbol_342;
				final Value A_symbol_348 = A_symbol_347;
				final Value A_symbol_349 = A_symbol_348;
				final Value A_symbol_350 = A_symbol_349;
				final Value A_symbol_351 = A_symbol_350;
				rightA_symbol_324 = A_symbol_351;
			} catch (InvalidValueException e) {
				rightA_symbol_324 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_351 = rightA_symbol_324;
			DomainType static_A_symbol_324 = valueFactory.typeOf(A_symbol_325);
			LibraryBinaryOperation dynamic_A_symbol_324 = (LibraryBinaryOperation)static_A_symbol_324.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_324 = dynamic_A_symbol_324.evaluate(evaluator, T_Boolean, A_symbol_325, A_symbol_351);
			return A_symbol_324;
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
			
			
			DomainType static_A_symbol_352 = valueFactory.typeOf(self);
			LibraryUnaryOperation dynamic_A_symbol_352 = (LibraryUnaryOperation)static_A_symbol_352.lookupImplementation(standardLibrary, O_OclElement_oclContainer);
			Value A_symbol_352 = dynamic_A_symbol_352.evaluate(evaluator, T_OclElement, self);
			final Value V_container = A_symbol_352;
			Value leftA_symbol_353;
			try {
				
				DomainType static_A_symbol_354 = valueFactory.typeOf(V_container);
				LibraryBinaryOperation dynamic_A_symbol_354 = (LibraryBinaryOperation)static_A_symbol_354.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_354 = dynamic_A_symbol_354.evaluate(evaluator, T_Boolean, V_container, T_ClassClassifier_Type_);
				leftA_symbol_353 = A_symbol_354;
			} catch (InvalidValueException e) {
				leftA_symbol_353 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_354 = leftA_symbol_353;
			Value rightA_symbol_353;
			try {
				
				DomainType static_A_symbol_355 = valueFactory.typeOf(V_container);
				LibraryBinaryOperation dynamic_A_symbol_355 = (LibraryBinaryOperation)static_A_symbol_355.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_355 = dynamic_A_symbol_355.evaluate(evaluator, T_Type, V_container, T_ClassClassifier_Type_);
				Value A_symbol_356 = IP_Type_ownedAttribute.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Property_, A_symbol_355, P_Type_ownedAttribute);
				
				
				DomainType static_A_symbol_357 = valueFactory.typeOf(A_symbol_356);
				LibraryBinaryOperation dynamic_A_symbol_357 = (LibraryBinaryOperation)static_A_symbol_357.lookupImplementation(standardLibrary, O_Collection_includes);
				Value A_symbol_357 = dynamic_A_symbol_357.evaluate(evaluator, T_Boolean, A_symbol_356, self);
				rightA_symbol_353 = A_symbol_357;
			} catch (InvalidValueException e) {
				rightA_symbol_353 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_357 = rightA_symbol_353;
			DomainType static_A_symbol_353 = valueFactory.typeOf(A_symbol_354);
			LibraryBinaryOperation dynamic_A_symbol_353 = (LibraryBinaryOperation)static_A_symbol_353.lookupImplementation(standardLibrary, O_Boolean_and);
			Value A_symbol_353 = dynamic_A_symbol_353.evaluate(evaluator, T_Boolean, A_symbol_354, A_symbol_357);
			final Value A_symbol_358 = A_symbol_353;
			return A_symbol_358;
		}
	}


















}

