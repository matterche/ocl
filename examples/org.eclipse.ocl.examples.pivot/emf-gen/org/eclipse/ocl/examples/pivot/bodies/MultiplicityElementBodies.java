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
import org.eclipse.ocl.examples.domain.library.LibraryProperty;
import org.eclipse.ocl.examples.domain.library.LibraryUnaryOperation;
import org.eclipse.ocl.examples.domain.values.IntegerValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorType;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.examples.pivot.PivotTables;

/**
 * MultiplicityElementBodies provides the Java implementation bodies of OCL-defined MultiplicityElement operations and properties.
 */
@SuppressWarnings("nls")
public class MultiplicityElementBodies
{

	/** 
	 * Implementation of the MultiplicityElement 'lower_ge_0' invariant.
	 */
	public static class _invariant_lower_ge_0 extends AbstractUnaryOperation
	{
		public static _invariant_lower_ge_0 INSTANCE = new _invariant_lower_ge_0();
	
		/*
		lowerBound()->notEmpty() implies lowerBound() >= 0
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_Collection_notEmpty = OCLstdlibTables.Operations._Collection__notEmpty;
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final DomainCollectionType T_Set_Integer_ = standardLibrary.getSetType(T_Integer);
			final ExecutorOperation O_OclAny_oclAsSet = OCLstdlibTables.Operations._OclAny__oclAsSet;
			final ExecutorOperation O_MultiplicityElement_lowerBound = PivotTables.Operations._MultiplicityElement__lowerBound;
			final ExecutorOperation O_Real__gt__eq_ = OCLstdlibTables.Operations._Real___gt__eq_;
			final IntegerValue I_0 = valueFactory.integerValueOf(0);
			
			Value leftA_symbol_6;
			try {
				
				DomainType static_A_symbol_7 = valueFactory.typeOf(self);
				LibraryUnaryOperation dynamic_A_symbol_7 = (LibraryUnaryOperation)static_A_symbol_7.lookupImplementation(standardLibrary, O_MultiplicityElement_lowerBound);
				Value A_symbol_7 = dynamic_A_symbol_7.evaluate(evaluator, T_Integer, self);
				DomainType static_A_symbol_8 = valueFactory.typeOf(A_symbol_7);
				LibraryUnaryOperation dynamic_A_symbol_8 = (LibraryUnaryOperation)static_A_symbol_8.lookupImplementation(standardLibrary, O_OclAny_oclAsSet);
				Value A_symbol_8 = dynamic_A_symbol_8.evaluate(evaluator, T_Set_Integer_, A_symbol_7);
				DomainType static_A_symbol_9 = valueFactory.typeOf(A_symbol_8);
				LibraryUnaryOperation dynamic_A_symbol_9 = (LibraryUnaryOperation)static_A_symbol_9.lookupImplementation(standardLibrary, O_Collection_notEmpty);
				Value A_symbol_9 = dynamic_A_symbol_9.evaluate(evaluator, T_Boolean, A_symbol_8);
				leftA_symbol_6 = A_symbol_9;
			} catch (InvalidValueException e) {
				leftA_symbol_6 = valueFactory.getInvalid();
			}
			Value A_symbol_9 = leftA_symbol_6;
			Value rightA_symbol_6;
			try {
				
				DomainType static_A_symbol_10 = valueFactory.typeOf(self);
				LibraryUnaryOperation dynamic_A_symbol_10 = (LibraryUnaryOperation)static_A_symbol_10.lookupImplementation(standardLibrary, O_MultiplicityElement_lowerBound);
				Value A_symbol_10 = dynamic_A_symbol_10.evaluate(evaluator, T_Integer, self);
				DomainType static_A_symbol_11 = valueFactory.typeOf(A_symbol_10, I_0);
				LibraryBinaryOperation dynamic_A_symbol_11 = (LibraryBinaryOperation)static_A_symbol_11.lookupImplementation(standardLibrary, O_Real__gt__eq_);
				Value A_symbol_11 = dynamic_A_symbol_11.evaluate(evaluator, T_Boolean, A_symbol_10, I_0);
				rightA_symbol_6 = A_symbol_11;
			} catch (InvalidValueException e) {
				rightA_symbol_6 = valueFactory.getInvalid();
			}
			Value A_symbol_11 = rightA_symbol_6;
			DomainType static_A_symbol_6 = valueFactory.typeOf(A_symbol_9);
			LibraryBinaryOperation dynamic_A_symbol_6 = (LibraryBinaryOperation)static_A_symbol_6.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_6 = dynamic_A_symbol_6.evaluate(evaluator, T_Boolean, A_symbol_9, A_symbol_11);
			return A_symbol_6;
		}
	}

	/** 
	 * Implementation of the MultiplicityElement 'upper_ge_lower' invariant.
	 */
	public static class _invariant_upper_ge_lower extends AbstractUnaryOperation
	{
		public static _invariant_upper_ge_lower INSTANCE = new _invariant_upper_ge_lower();
	
		/*
		upperBound()
	->notEmpty() and
	lowerBound()
	->notEmpty() implies
	upperBound() >=
	lowerBound()
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_Boolean_and = OCLstdlibTables.Operations._Boolean__and;
			final ExecutorOperation O_Collection_notEmpty = OCLstdlibTables.Operations._Collection__notEmpty;
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final DomainCollectionType T_Set_Integer_ = standardLibrary.getSetType(T_Integer);
			final ExecutorOperation O_OclAny_oclAsSet = OCLstdlibTables.Operations._OclAny__oclAsSet;
			final ExecutorOperation O_MultiplicityElement_upperBound = PivotTables.Operations._MultiplicityElement__upperBound;
			final ExecutorOperation O_MultiplicityElement_lowerBound = PivotTables.Operations._MultiplicityElement__lowerBound;
			final ExecutorOperation O_Real__gt__eq_ = OCLstdlibTables.Operations._Real___gt__eq_;
			
			Value leftA_symbol_12;
			try {
				Value leftA_symbol_13;
				try {
					
					DomainType static_A_symbol_14 = valueFactory.typeOf(self);
					LibraryUnaryOperation dynamic_A_symbol_14 = (LibraryUnaryOperation)static_A_symbol_14.lookupImplementation(standardLibrary, O_MultiplicityElement_upperBound);
					Value A_symbol_14 = dynamic_A_symbol_14.evaluate(evaluator, T_Integer, self);
					DomainType static_A_symbol_15 = valueFactory.typeOf(A_symbol_14);
					LibraryUnaryOperation dynamic_A_symbol_15 = (LibraryUnaryOperation)static_A_symbol_15.lookupImplementation(standardLibrary, O_OclAny_oclAsSet);
					Value A_symbol_15 = dynamic_A_symbol_15.evaluate(evaluator, T_Set_Integer_, A_symbol_14);
					DomainType static_A_symbol_16 = valueFactory.typeOf(A_symbol_15);
					LibraryUnaryOperation dynamic_A_symbol_16 = (LibraryUnaryOperation)static_A_symbol_16.lookupImplementation(standardLibrary, O_Collection_notEmpty);
					Value A_symbol_16 = dynamic_A_symbol_16.evaluate(evaluator, T_Boolean, A_symbol_15);
					leftA_symbol_13 = A_symbol_16;
				} catch (InvalidValueException e) {
					leftA_symbol_13 = valueFactory.getInvalid();
				}
				Value A_symbol_16 = leftA_symbol_13;
				Value rightA_symbol_13;
				try {
					
					DomainType static_A_symbol_17 = valueFactory.typeOf(self);
					LibraryUnaryOperation dynamic_A_symbol_17 = (LibraryUnaryOperation)static_A_symbol_17.lookupImplementation(standardLibrary, O_MultiplicityElement_lowerBound);
					Value A_symbol_17 = dynamic_A_symbol_17.evaluate(evaluator, T_Integer, self);
					DomainType static_A_symbol_18 = valueFactory.typeOf(A_symbol_17);
					LibraryUnaryOperation dynamic_A_symbol_18 = (LibraryUnaryOperation)static_A_symbol_18.lookupImplementation(standardLibrary, O_OclAny_oclAsSet);
					Value A_symbol_18 = dynamic_A_symbol_18.evaluate(evaluator, T_Set_Integer_, A_symbol_17);
					DomainType static_A_symbol_19 = valueFactory.typeOf(A_symbol_18);
					LibraryUnaryOperation dynamic_A_symbol_19 = (LibraryUnaryOperation)static_A_symbol_19.lookupImplementation(standardLibrary, O_Collection_notEmpty);
					Value A_symbol_19 = dynamic_A_symbol_19.evaluate(evaluator, T_Boolean, A_symbol_18);
					rightA_symbol_13 = A_symbol_19;
				} catch (InvalidValueException e) {
					rightA_symbol_13 = valueFactory.getInvalid();
				}
				Value A_symbol_19 = rightA_symbol_13;
				DomainType static_A_symbol_13 = valueFactory.typeOf(A_symbol_16);
				LibraryBinaryOperation dynamic_A_symbol_13 = (LibraryBinaryOperation)static_A_symbol_13.lookupImplementation(standardLibrary, O_Boolean_and);
				Value A_symbol_13 = dynamic_A_symbol_13.evaluate(evaluator, T_Boolean, A_symbol_16, A_symbol_19);
				leftA_symbol_12 = A_symbol_13;
			} catch (InvalidValueException e) {
				leftA_symbol_12 = valueFactory.getInvalid();
			}
			Value A_symbol_13 = leftA_symbol_12;
			Value rightA_symbol_12;
			try {
				
				DomainType static_A_symbol_20 = valueFactory.typeOf(self);
				LibraryUnaryOperation dynamic_A_symbol_20 = (LibraryUnaryOperation)static_A_symbol_20.lookupImplementation(standardLibrary, O_MultiplicityElement_upperBound);
				Value A_symbol_20 = dynamic_A_symbol_20.evaluate(evaluator, T_Integer, self);
				
				DomainType static_A_symbol_21 = valueFactory.typeOf(self);
				LibraryUnaryOperation dynamic_A_symbol_21 = (LibraryUnaryOperation)static_A_symbol_21.lookupImplementation(standardLibrary, O_MultiplicityElement_lowerBound);
				Value A_symbol_21 = dynamic_A_symbol_21.evaluate(evaluator, T_Integer, self);
				DomainType static_A_symbol_22 = valueFactory.typeOf(A_symbol_20, A_symbol_21);
				LibraryBinaryOperation dynamic_A_symbol_22 = (LibraryBinaryOperation)static_A_symbol_22.lookupImplementation(standardLibrary, O_Real__gt__eq_);
				Value A_symbol_22 = dynamic_A_symbol_22.evaluate(evaluator, T_Boolean, A_symbol_20, A_symbol_21);
				rightA_symbol_12 = A_symbol_22;
			} catch (InvalidValueException e) {
				rightA_symbol_12 = valueFactory.getInvalid();
			}
			Value A_symbol_22 = rightA_symbol_12;
			DomainType static_A_symbol_12 = valueFactory.typeOf(A_symbol_13);
			LibraryBinaryOperation dynamic_A_symbol_12 = (LibraryBinaryOperation)static_A_symbol_12.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_12 = dynamic_A_symbol_12.evaluate(evaluator, T_Boolean, A_symbol_13, A_symbol_22);
			return A_symbol_12;
		}
	}

	/** 
	 * Implementation of the MultiplicityElement::includesCardinality '' <body>.
	 */
	public static class _includesCardinality_body_ extends AbstractBinaryOperation
	{
		public static _includesCardinality_body_ INSTANCE = new _includesCardinality_body_();
	
		/*
		lowerBound() <= C and upperBound() >= C
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self, Value C) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_and = OCLstdlibTables.Operations._Boolean__and;
			final ExecutorOperation O_Real__lt__eq_ = OCLstdlibTables.Operations._Real___lt__eq_;
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final ExecutorOperation O_MultiplicityElement_lowerBound = PivotTables.Operations._MultiplicityElement__lowerBound;
			final ExecutorOperation O_Real__gt__eq_ = OCLstdlibTables.Operations._Real___gt__eq_;
			final ExecutorOperation O_MultiplicityElement_upperBound = PivotTables.Operations._MultiplicityElement__upperBound;
			
			Value leftA_symbol_23;
			try {
				
				DomainType static_A_symbol_24 = valueFactory.typeOf(self);
				LibraryUnaryOperation dynamic_A_symbol_24 = (LibraryUnaryOperation)static_A_symbol_24.lookupImplementation(standardLibrary, O_MultiplicityElement_lowerBound);
				Value A_symbol_24 = dynamic_A_symbol_24.evaluate(evaluator, T_Integer, self);
				
				DomainType static_A_symbol_25 = valueFactory.typeOf(A_symbol_24, C);
				LibraryBinaryOperation dynamic_A_symbol_25 = (LibraryBinaryOperation)static_A_symbol_25.lookupImplementation(standardLibrary, O_Real__lt__eq_);
				Value A_symbol_25 = dynamic_A_symbol_25.evaluate(evaluator, T_Boolean, A_symbol_24, C);
				leftA_symbol_23 = A_symbol_25;
			} catch (InvalidValueException e) {
				leftA_symbol_23 = valueFactory.getInvalid();
			}
			Value A_symbol_25 = leftA_symbol_23;
			Value rightA_symbol_23;
			try {
				
				DomainType static_A_symbol_26 = valueFactory.typeOf(self);
				LibraryUnaryOperation dynamic_A_symbol_26 = (LibraryUnaryOperation)static_A_symbol_26.lookupImplementation(standardLibrary, O_MultiplicityElement_upperBound);
				Value A_symbol_26 = dynamic_A_symbol_26.evaluate(evaluator, T_Integer, self);
				
				DomainType static_A_symbol_27 = valueFactory.typeOf(A_symbol_26, C);
				LibraryBinaryOperation dynamic_A_symbol_27 = (LibraryBinaryOperation)static_A_symbol_27.lookupImplementation(standardLibrary, O_Real__gt__eq_);
				Value A_symbol_27 = dynamic_A_symbol_27.evaluate(evaluator, T_Boolean, A_symbol_26, C);
				rightA_symbol_23 = A_symbol_27;
			} catch (InvalidValueException e) {
				rightA_symbol_23 = valueFactory.getInvalid();
			}
			Value A_symbol_27 = rightA_symbol_23;
			DomainType static_A_symbol_23 = valueFactory.typeOf(A_symbol_25);
			LibraryBinaryOperation dynamic_A_symbol_23 = (LibraryBinaryOperation)static_A_symbol_23.lookupImplementation(standardLibrary, O_Boolean_and);
			Value A_symbol_23 = dynamic_A_symbol_23.evaluate(evaluator, T_Boolean, A_symbol_25, A_symbol_27);
			return A_symbol_23;
		}
	}

	/** 
	 * Implementation of the MultiplicityElement::includesMultiplicity '' <body>.
	 */
	public static class _includesMultiplicity_body_ extends AbstractBinaryOperation
	{
		public static _includesMultiplicity_body_ INSTANCE = new _includesMultiplicity_body_();
	
		/*
		self.lowerBound() <= M.lowerBound() and self.upperBound() >= M.upperBound()
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self, Value M) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_and = OCLstdlibTables.Operations._Boolean__and;
			final ExecutorOperation O_Real__lt__eq_ = OCLstdlibTables.Operations._Real___lt__eq_;
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final ExecutorOperation O_MultiplicityElement_lowerBound = PivotTables.Operations._MultiplicityElement__lowerBound;
			final ExecutorOperation O_Real__gt__eq_ = OCLstdlibTables.Operations._Real___gt__eq_;
			final ExecutorOperation O_MultiplicityElement_upperBound = PivotTables.Operations._MultiplicityElement__upperBound;
			
			Value leftA_symbol_28;
			try {
				
				DomainType static_A_symbol_29 = valueFactory.typeOf(self);
				LibraryUnaryOperation dynamic_A_symbol_29 = (LibraryUnaryOperation)static_A_symbol_29.lookupImplementation(standardLibrary, O_MultiplicityElement_lowerBound);
				Value A_symbol_29 = dynamic_A_symbol_29.evaluate(evaluator, T_Integer, self);
				
				DomainType static_A_symbol_30 = valueFactory.typeOf(M);
				LibraryUnaryOperation dynamic_A_symbol_30 = (LibraryUnaryOperation)static_A_symbol_30.lookupImplementation(standardLibrary, O_MultiplicityElement_lowerBound);
				Value A_symbol_30 = dynamic_A_symbol_30.evaluate(evaluator, T_Integer, M);
				DomainType static_A_symbol_31 = valueFactory.typeOf(A_symbol_29, A_symbol_30);
				LibraryBinaryOperation dynamic_A_symbol_31 = (LibraryBinaryOperation)static_A_symbol_31.lookupImplementation(standardLibrary, O_Real__lt__eq_);
				Value A_symbol_31 = dynamic_A_symbol_31.evaluate(evaluator, T_Boolean, A_symbol_29, A_symbol_30);
				leftA_symbol_28 = A_symbol_31;
			} catch (InvalidValueException e) {
				leftA_symbol_28 = valueFactory.getInvalid();
			}
			Value A_symbol_31 = leftA_symbol_28;
			Value rightA_symbol_28;
			try {
				
				DomainType static_A_symbol_32 = valueFactory.typeOf(self);
				LibraryUnaryOperation dynamic_A_symbol_32 = (LibraryUnaryOperation)static_A_symbol_32.lookupImplementation(standardLibrary, O_MultiplicityElement_upperBound);
				Value A_symbol_32 = dynamic_A_symbol_32.evaluate(evaluator, T_Integer, self);
				
				DomainType static_A_symbol_33 = valueFactory.typeOf(M);
				LibraryUnaryOperation dynamic_A_symbol_33 = (LibraryUnaryOperation)static_A_symbol_33.lookupImplementation(standardLibrary, O_MultiplicityElement_upperBound);
				Value A_symbol_33 = dynamic_A_symbol_33.evaluate(evaluator, T_Integer, M);
				DomainType static_A_symbol_34 = valueFactory.typeOf(A_symbol_32, A_symbol_33);
				LibraryBinaryOperation dynamic_A_symbol_34 = (LibraryBinaryOperation)static_A_symbol_34.lookupImplementation(standardLibrary, O_Real__gt__eq_);
				Value A_symbol_34 = dynamic_A_symbol_34.evaluate(evaluator, T_Boolean, A_symbol_32, A_symbol_33);
				rightA_symbol_28 = A_symbol_34;
			} catch (InvalidValueException e) {
				rightA_symbol_28 = valueFactory.getInvalid();
			}
			Value A_symbol_34 = rightA_symbol_28;
			DomainType static_A_symbol_28 = valueFactory.typeOf(A_symbol_31);
			LibraryBinaryOperation dynamic_A_symbol_28 = (LibraryBinaryOperation)static_A_symbol_28.lookupImplementation(standardLibrary, O_Boolean_and);
			Value A_symbol_28 = dynamic_A_symbol_28.evaluate(evaluator, T_Boolean, A_symbol_31, A_symbol_34);
			return A_symbol_28;
		}
	}

	/** 
	 * Implementation of the MultiplicityElement::isMultivalued '' <body>.
	 */
	public static class _isMultivalued_body_ extends AbstractUnaryOperation
	{
		public static _isMultivalued_body_ INSTANCE = new _isMultivalued_body_();
	
		/*
		upperBound() > 1
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Real__gt_ = OCLstdlibTables.Operations._Real___gt_;
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final ExecutorOperation O_MultiplicityElement_upperBound = PivotTables.Operations._MultiplicityElement__upperBound;
			final IntegerValue I_1 = valueFactory.integerValueOf(1);
			
			
			DomainType static_A_symbol_35 = valueFactory.typeOf(self);
			LibraryUnaryOperation dynamic_A_symbol_35 = (LibraryUnaryOperation)static_A_symbol_35.lookupImplementation(standardLibrary, O_MultiplicityElement_upperBound);
			Value A_symbol_35 = dynamic_A_symbol_35.evaluate(evaluator, T_Integer, self);
			DomainType static_A_symbol_36 = valueFactory.typeOf(A_symbol_35, I_1);
			LibraryBinaryOperation dynamic_A_symbol_36 = (LibraryBinaryOperation)static_A_symbol_36.lookupImplementation(standardLibrary, O_Real__gt_);
			Value A_symbol_36 = dynamic_A_symbol_36.evaluate(evaluator, T_Boolean, A_symbol_35, I_1);
			return A_symbol_36;
		}
	}

	/** 
	 * Implementation of the MultiplicityElement::lowerBound '' <body>.
	 */
	public static class _lowerBound_body_ extends AbstractUnaryOperation
	{
		public static _lowerBound_body_ INSTANCE = new _lowerBound_body_();
	
		/*
		if lower->notEmpty() then lower else 1 endif
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Collection_notEmpty = OCLstdlibTables.Operations._Collection__notEmpty;
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final DomainCollectionType T_Set_Integer_ = standardLibrary.getSetType(T_Integer);
			final ExecutorOperation O_OclAny_oclAsSet = OCLstdlibTables.Operations._OclAny__oclAsSet;
			final ExecutorProperty P_MultiplicityElement_lower = PivotTables.Properties._MultiplicityElement__lower;
			final LibraryProperty IP_MultiplicityElement_lower = P_MultiplicityElement_lower.getImplementation();
			final IntegerValue I_1 = valueFactory.integerValueOf(1);
			
				
				Value A_symbol_37 = IP_MultiplicityElement_lower.evaluate(evaluator, T_Integer, self, P_MultiplicityElement_lower);
				
				DomainType static_A_symbol_38 = valueFactory.typeOf(A_symbol_37);
				LibraryUnaryOperation dynamic_A_symbol_38 = (LibraryUnaryOperation)static_A_symbol_38.lookupImplementation(standardLibrary, O_OclAny_oclAsSet);
				Value A_symbol_38 = dynamic_A_symbol_38.evaluate(evaluator, T_Set_Integer_, A_symbol_37);
				DomainType static_A_symbol_39 = valueFactory.typeOf(A_symbol_38);
				LibraryUnaryOperation dynamic_A_symbol_39 = (LibraryUnaryOperation)static_A_symbol_39.lookupImplementation(standardLibrary, O_Collection_notEmpty);
				Value A_symbol_39 = dynamic_A_symbol_39.evaluate(evaluator, T_Boolean, A_symbol_38);
			Value A_symbol_40;
			if (A_symbol_39.isTrue()) {
				
				Value A_symbol_41 = IP_MultiplicityElement_lower.evaluate(evaluator, T_Integer, self, P_MultiplicityElement_lower);
				
				A_symbol_40 = A_symbol_41;
			}
			else if (A_symbol_39.isFalse()) {
				A_symbol_40 = I_1;
			}
			else if (A_symbol_39.isNull()) {
				A_symbol_40 = valueFactory.throwInvalidValueException("null if condition");
			}
			else {
				A_symbol_40 = valueFactory.throwInvalidValueException("invalid if condition");
			}
			return A_symbol_40;
		}
	}

	/** 
	 * Implementation of the MultiplicityElement::upperBound '' <body>.
	 */
	public static class _upperBound_body_ extends AbstractUnaryOperation
	{
		public static _upperBound_body_ INSTANCE = new _upperBound_body_();
	
		/*
		if upper->notEmpty() then upper else 1 endif
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Collection_notEmpty = OCLstdlibTables.Operations._Collection__notEmpty;
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final DomainCollectionType T_Set_Integer_ = standardLibrary.getSetType(T_Integer);
			final ExecutorOperation O_OclAny_oclAsSet = OCLstdlibTables.Operations._OclAny__oclAsSet;
			final ExecutorProperty P_MultiplicityElement_upper = PivotTables.Properties._MultiplicityElement__upper;
			final LibraryProperty IP_MultiplicityElement_upper = P_MultiplicityElement_upper.getImplementation();
			final IntegerValue I_1 = valueFactory.integerValueOf(1);
			
				
				Value A_symbol_42 = IP_MultiplicityElement_upper.evaluate(evaluator, T_Integer, self, P_MultiplicityElement_upper);
				
				DomainType static_A_symbol_43 = valueFactory.typeOf(A_symbol_42);
				LibraryUnaryOperation dynamic_A_symbol_43 = (LibraryUnaryOperation)static_A_symbol_43.lookupImplementation(standardLibrary, O_OclAny_oclAsSet);
				Value A_symbol_43 = dynamic_A_symbol_43.evaluate(evaluator, T_Set_Integer_, A_symbol_42);
				DomainType static_A_symbol_44 = valueFactory.typeOf(A_symbol_43);
				LibraryUnaryOperation dynamic_A_symbol_44 = (LibraryUnaryOperation)static_A_symbol_44.lookupImplementation(standardLibrary, O_Collection_notEmpty);
				Value A_symbol_44 = dynamic_A_symbol_44.evaluate(evaluator, T_Boolean, A_symbol_43);
			Value A_symbol_45;
			if (A_symbol_44.isTrue()) {
				
				Value A_symbol_46 = IP_MultiplicityElement_upper.evaluate(evaluator, T_Integer, self, P_MultiplicityElement_upper);
				
				A_symbol_45 = A_symbol_46;
			}
			else if (A_symbol_44.isFalse()) {
				A_symbol_45 = I_1;
			}
			else if (A_symbol_44.isNull()) {
				A_symbol_45 = valueFactory.throwInvalidValueException("null if condition");
			}
			else {
				A_symbol_45 = valueFactory.throwInvalidValueException("invalid if condition");
			}
			return A_symbol_45;
		}
	}




}

