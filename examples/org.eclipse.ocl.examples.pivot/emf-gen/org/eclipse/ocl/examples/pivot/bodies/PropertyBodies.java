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
			
			Value leftA_symbol_56;
			try {
				
				Value A_symbol_57 = IP_Property_isDerived.evaluate(evaluator, T_Boolean, self, P_Property_isDerived);
				
				leftA_symbol_56 = A_symbol_57;
			} catch (InvalidValueException e) {
				leftA_symbol_56 = valueFactory.getInvalid();
			}
			Value A_symbol_57 = leftA_symbol_56;
			Value rightA_symbol_56;
			try {
				
				Value A_symbol_58 = IP_NamedElement_ownedRule.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Constraint_, self, P_NamedElement_ownedRule);
				
				
				/** 
				 * Implementation of the iterator body.
				 */
				AbstractBinaryOperation body_A_symbol_59 = new AbstractBinaryOperation()
				{
				/*
				stereotype = 'derivation'
				*/
					public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
						final Value V_1_ = iterator1;	// iterator: 1_
						
						Value A_symbol_60 = IP_Constraint_stereotype.evaluate(evaluator, T_String, V_1_, P_Constraint_stereotype);
						
						DomainType static_A_symbol_61 = valueFactory.typeOf(A_symbol_60, S_derivati___);
						LibraryBinaryOperation dynamic_A_symbol_61 = (LibraryBinaryOperation)static_A_symbol_61.lookupImplementation(standardLibrary, O_String__eq_);
						Value A_symbol_61 = dynamic_A_symbol_61.evaluate(evaluator, T_Boolean, A_symbol_60, S_derivati___);
						return A_symbol_61;
					}
				};
				DomainType static_A_symbol_59 = A_symbol_58.getType();
				LibraryIteration dynamic_A_symbol_59 = (LibraryIteration)static_A_symbol_59.lookupImplementation(standardLibrary, O_Collection_any);
				Value acc_A_symbol_59 = dynamic_A_symbol_59.createAccumulatorValue(evaluator, T_Pivot_ecore__pivot__Constraint, T_Boolean);
				ExecutorSingleIterationManager manager_A_symbol_59 = new ExecutorSingleIterationManager(evaluator, T_Pivot_ecore__pivot__Constraint, body_A_symbol_59, (CollectionValue)A_symbol_58, acc_A_symbol_59);
				Value A_symbol_59 = dynamic_A_symbol_59.evaluateIteration(manager_A_symbol_59);
				final Value V_derivedConstraint = A_symbol_59;
				
				Value A_symbol_62 = IP_NamedElement_ownedRule.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Constraint_, self, P_NamedElement_ownedRule);
				
				
				/** 
				 * Implementation of the iterator body.
				 */
				AbstractBinaryOperation body_A_symbol_63 = new AbstractBinaryOperation()
				{
				/*
				stereotype = 'initial'
				*/
					public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
						final Value V_1_1 = iterator1;	// iterator: 1_
						
						Value A_symbol_64 = IP_Constraint_stereotype.evaluate(evaluator, T_String, V_1_1, P_Constraint_stereotype);
						
						DomainType static_A_symbol_65 = valueFactory.typeOf(A_symbol_64, S_initial);
						LibraryBinaryOperation dynamic_A_symbol_65 = (LibraryBinaryOperation)static_A_symbol_65.lookupImplementation(standardLibrary, O_String__eq_);
						Value A_symbol_65 = dynamic_A_symbol_65.evaluate(evaluator, T_Boolean, A_symbol_64, S_initial);
						return A_symbol_65;
					}
				};
				DomainType static_A_symbol_63 = A_symbol_62.getType();
				LibraryIteration dynamic_A_symbol_63 = (LibraryIteration)static_A_symbol_63.lookupImplementation(standardLibrary, O_Collection_any);
				Value acc_A_symbol_63 = dynamic_A_symbol_63.createAccumulatorValue(evaluator, T_Pivot_ecore__pivot__Constraint, T_Boolean);
				ExecutorSingleIterationManager manager_A_symbol_63 = new ExecutorSingleIterationManager(evaluator, T_Pivot_ecore__pivot__Constraint, body_A_symbol_63, (CollectionValue)A_symbol_62, acc_A_symbol_63);
				Value A_symbol_63 = dynamic_A_symbol_63.evaluateIteration(manager_A_symbol_63);
				final Value V_initialConstraint = A_symbol_63;
					
					DomainType static_A_symbol_66 = valueFactory.typeOf(V_derivedConstraint, Null);
					LibraryBinaryOperation dynamic_A_symbol_66 = (LibraryBinaryOperation)static_A_symbol_66.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
					Value A_symbol_66 = dynamic_A_symbol_66.evaluate(evaluator, T_Boolean, V_derivedConstraint, Null);
				Value A_symbol_67;
				if (A_symbol_66.isTrue()) {
					
					Value A_symbol_68 = IP_Constraint_specification.evaluate(evaluator, T_Pivot_ecore__pivot__ValueSpecification, V_derivedConstraint, P_Constraint_specification);
					
					A_symbol_67 = A_symbol_68;
				}
				else if (A_symbol_66.isFalse()) {
					A_symbol_67 = Null;
				}
				else if (A_symbol_66.isNull()) {
					A_symbol_67 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_67 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				final Value V_derivedSpecification = A_symbol_67;
					
					DomainType static_A_symbol_69 = valueFactory.typeOf(V_initialConstraint, Null);
					LibraryBinaryOperation dynamic_A_symbol_69 = (LibraryBinaryOperation)static_A_symbol_69.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
					Value A_symbol_69 = dynamic_A_symbol_69.evaluate(evaluator, T_Boolean, V_initialConstraint, Null);
				Value A_symbol_70;
				if (A_symbol_69.isTrue()) {
					
					Value A_symbol_71 = IP_Constraint_specification.evaluate(evaluator, T_Pivot_ecore__pivot__ValueSpecification, V_initialConstraint, P_Constraint_specification);
					
					A_symbol_70 = A_symbol_71;
				}
				else if (A_symbol_69.isFalse()) {
					A_symbol_70 = Null;
				}
				else if (A_symbol_69.isNull()) {
					A_symbol_70 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_70 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				final Value V_initialSpecification = A_symbol_70;
					
					DomainType static_A_symbol_72 = valueFactory.typeOf(V_derivedSpecification, Null);
					LibraryBinaryOperation dynamic_A_symbol_72 = (LibraryBinaryOperation)static_A_symbol_72.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
					Value A_symbol_72 = dynamic_A_symbol_72.evaluate(evaluator, T_Boolean, V_derivedSpecification, Null);
				Value A_symbol_73;
				if (A_symbol_72.isTrue()) {
					
					A_symbol_73 = V_derivedSpecification;
				}
				else if (A_symbol_72.isFalse()) {
					
					A_symbol_73 = V_initialSpecification;
				}
				else if (A_symbol_72.isNull()) {
					A_symbol_73 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_73 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				final Value V_initialiser = A_symbol_73;
				Value leftA_symbol_74;
				try {
					Value leftA_symbol_75;
					try {
						
						DomainType static_A_symbol_76 = valueFactory.typeOf(V_initialiser, Null);
						LibraryBinaryOperation dynamic_A_symbol_76 = (LibraryBinaryOperation)static_A_symbol_76.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
						Value A_symbol_76 = dynamic_A_symbol_76.evaluate(evaluator, T_Boolean, V_initialiser, Null);
						leftA_symbol_75 = A_symbol_76;
					} catch (InvalidValueException e) {
						leftA_symbol_75 = valueFactory.getInvalid();
					}
					Value A_symbol_76 = leftA_symbol_75;
					Value rightA_symbol_75;
					try {
						
						DomainType static_A_symbol_77 = valueFactory.typeOf(V_initialiser);
						LibraryBinaryOperation dynamic_A_symbol_77 = (LibraryBinaryOperation)static_A_symbol_77.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_77 = dynamic_A_symbol_77.evaluate(evaluator, T_Boolean, V_initialiser, T_ClassClassifier_Pivot_ecore__pivot__ExpressionInOcl_);
						rightA_symbol_75 = A_symbol_77;
					} catch (InvalidValueException e) {
						rightA_symbol_75 = valueFactory.getInvalid();
					}
					Value A_symbol_77 = rightA_symbol_75;
					DomainType static_A_symbol_75 = valueFactory.typeOf(A_symbol_76);
					LibraryBinaryOperation dynamic_A_symbol_75 = (LibraryBinaryOperation)static_A_symbol_75.lookupImplementation(standardLibrary, O_Boolean_and);
					Value A_symbol_75 = dynamic_A_symbol_75.evaluate(evaluator, T_Boolean, A_symbol_76, A_symbol_77);
					leftA_symbol_74 = A_symbol_75;
				} catch (InvalidValueException e) {
					leftA_symbol_74 = valueFactory.getInvalid();
				}
				Value A_symbol_75 = leftA_symbol_74;
				Value rightA_symbol_74;
				try {
					
					
					DomainType static_A_symbol_78 = valueFactory.typeOf(self);
					LibraryBinaryOperation dynamic_A_symbol_78 = (LibraryBinaryOperation)static_A_symbol_78.lookupImplementation(standardLibrary, O_TypedMultiplicityElement_CompatibleBody);
					Value A_symbol_78 = dynamic_A_symbol_78.evaluate(evaluator, T_Boolean, self, V_initialiser);
					rightA_symbol_74 = A_symbol_78;
				} catch (InvalidValueException e) {
					rightA_symbol_74 = valueFactory.getInvalid();
				}
				Value A_symbol_78 = rightA_symbol_74;
				DomainType static_A_symbol_74 = valueFactory.typeOf(A_symbol_75);
				LibraryBinaryOperation dynamic_A_symbol_74 = (LibraryBinaryOperation)static_A_symbol_74.lookupImplementation(standardLibrary, O_Boolean_implies);
				Value A_symbol_74 = dynamic_A_symbol_74.evaluate(evaluator, T_Boolean, A_symbol_75, A_symbol_78);
				final Value A_symbol_79 = A_symbol_74;
				final Value A_symbol_80 = A_symbol_79;
				final Value A_symbol_81 = A_symbol_80;
				final Value A_symbol_82 = A_symbol_81;
				final Value A_symbol_83 = A_symbol_82;
				rightA_symbol_56 = A_symbol_83;
			} catch (InvalidValueException e) {
				rightA_symbol_56 = valueFactory.getInvalid();
			}
			Value A_symbol_83 = rightA_symbol_56;
			DomainType static_A_symbol_56 = valueFactory.typeOf(A_symbol_57);
			LibraryBinaryOperation dynamic_A_symbol_56 = (LibraryBinaryOperation)static_A_symbol_56.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_56 = dynamic_A_symbol_56.evaluate(evaluator, T_Boolean, A_symbol_57, A_symbol_83);
			return A_symbol_56;
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
			
			
			DomainType static_A_symbol_84 = valueFactory.typeOf(self);
			LibraryUnaryOperation dynamic_A_symbol_84 = (LibraryUnaryOperation)static_A_symbol_84.lookupImplementation(standardLibrary, O_OclElement_oclContainer);
			Value A_symbol_84 = dynamic_A_symbol_84.evaluate(evaluator, T_OclElement, self);
			final Value V_container = A_symbol_84;
			Value leftA_symbol_85;
			try {
				
				DomainType static_A_symbol_86 = valueFactory.typeOf(V_container);
				LibraryBinaryOperation dynamic_A_symbol_86 = (LibraryBinaryOperation)static_A_symbol_86.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_86 = dynamic_A_symbol_86.evaluate(evaluator, T_Boolean, V_container, T_ClassClassifier_Type_);
				leftA_symbol_85 = A_symbol_86;
			} catch (InvalidValueException e) {
				leftA_symbol_85 = valueFactory.getInvalid();
			}
			Value A_symbol_86 = leftA_symbol_85;
			Value rightA_symbol_85;
			try {
				
				DomainType static_A_symbol_87 = valueFactory.typeOf(V_container);
				LibraryBinaryOperation dynamic_A_symbol_87 = (LibraryBinaryOperation)static_A_symbol_87.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_87 = dynamic_A_symbol_87.evaluate(evaluator, T_Type, V_container, T_ClassClassifier_Type_);
				Value A_symbol_88 = IP_Type_ownedAttribute.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Property_, A_symbol_87, P_Type_ownedAttribute);
				
				
				DomainType static_A_symbol_89 = valueFactory.typeOf(A_symbol_88);
				LibraryBinaryOperation dynamic_A_symbol_89 = (LibraryBinaryOperation)static_A_symbol_89.lookupImplementation(standardLibrary, O_Collection_includes);
				Value A_symbol_89 = dynamic_A_symbol_89.evaluate(evaluator, T_Boolean, A_symbol_88, self);
				rightA_symbol_85 = A_symbol_89;
			} catch (InvalidValueException e) {
				rightA_symbol_85 = valueFactory.getInvalid();
			}
			Value A_symbol_89 = rightA_symbol_85;
			DomainType static_A_symbol_85 = valueFactory.typeOf(A_symbol_86);
			LibraryBinaryOperation dynamic_A_symbol_85 = (LibraryBinaryOperation)static_A_symbol_85.lookupImplementation(standardLibrary, O_Boolean_and);
			Value A_symbol_85 = dynamic_A_symbol_85.evaluate(evaluator, T_Boolean, A_symbol_86, A_symbol_89);
			final Value A_symbol_90 = A_symbol_85;
			return A_symbol_90;
		}
	}



















}

