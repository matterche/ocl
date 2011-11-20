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
			
			Value leftA_symbol_42;
			try {
				
				DomainType static_A_symbol_43 = valueFactory.typeOf(self);
				LibraryUnaryOperation dynamic_A_symbol_43 = (LibraryUnaryOperation)static_A_symbol_43.lookupImplementation(standardLibrary, O_MultiplicityElement_lowerBound);
				Value A_symbol_43 = dynamic_A_symbol_43.evaluate(evaluator, T_Integer, self);
				DomainType static_A_symbol_44 = valueFactory.typeOf(A_symbol_43);
				LibraryUnaryOperation dynamic_A_symbol_44 = (LibraryUnaryOperation)static_A_symbol_44.lookupImplementation(standardLibrary, O_OclAny_oclAsSet);
				Value A_symbol_44 = dynamic_A_symbol_44.evaluate(evaluator, T_Set_Integer_, A_symbol_43);
				DomainType static_A_symbol_45 = valueFactory.typeOf(A_symbol_44);
				LibraryUnaryOperation dynamic_A_symbol_45 = (LibraryUnaryOperation)static_A_symbol_45.lookupImplementation(standardLibrary, O_Collection_notEmpty);
				Value A_symbol_45 = dynamic_A_symbol_45.evaluate(evaluator, T_Boolean, A_symbol_44);
				leftA_symbol_42 = A_symbol_45;
			} catch (InvalidValueException e) {
				leftA_symbol_42 = valueFactory.getInvalid();
			}
			Value A_symbol_45 = leftA_symbol_42;
			Value rightA_symbol_42;
			try {
				
				DomainType static_A_symbol_46 = valueFactory.typeOf(self);
				LibraryUnaryOperation dynamic_A_symbol_46 = (LibraryUnaryOperation)static_A_symbol_46.lookupImplementation(standardLibrary, O_MultiplicityElement_lowerBound);
				Value A_symbol_46 = dynamic_A_symbol_46.evaluate(evaluator, T_Integer, self);
				DomainType static_A_symbol_47 = valueFactory.typeOf(A_symbol_46, I_0);
				LibraryBinaryOperation dynamic_A_symbol_47 = (LibraryBinaryOperation)static_A_symbol_47.lookupImplementation(standardLibrary, O_Real__gt__eq_);
				Value A_symbol_47 = dynamic_A_symbol_47.evaluate(evaluator, T_Boolean, A_symbol_46, I_0);
				rightA_symbol_42 = A_symbol_47;
			} catch (InvalidValueException e) {
				rightA_symbol_42 = valueFactory.getInvalid();
			}
			Value A_symbol_47 = rightA_symbol_42;
			DomainType static_A_symbol_42 = valueFactory.typeOf(A_symbol_45);
			LibraryBinaryOperation dynamic_A_symbol_42 = (LibraryBinaryOperation)static_A_symbol_42.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_42 = dynamic_A_symbol_42.evaluate(evaluator, T_Boolean, A_symbol_45, A_symbol_47);
			return A_symbol_42;
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
			
			Value leftA_symbol_48;
			try {
				Value leftA_symbol_49;
				try {
					
					DomainType static_A_symbol_50 = valueFactory.typeOf(self);
					LibraryUnaryOperation dynamic_A_symbol_50 = (LibraryUnaryOperation)static_A_symbol_50.lookupImplementation(standardLibrary, O_MultiplicityElement_upperBound);
					Value A_symbol_50 = dynamic_A_symbol_50.evaluate(evaluator, T_Integer, self);
					DomainType static_A_symbol_51 = valueFactory.typeOf(A_symbol_50);
					LibraryUnaryOperation dynamic_A_symbol_51 = (LibraryUnaryOperation)static_A_symbol_51.lookupImplementation(standardLibrary, O_OclAny_oclAsSet);
					Value A_symbol_51 = dynamic_A_symbol_51.evaluate(evaluator, T_Set_Integer_, A_symbol_50);
					DomainType static_A_symbol_52 = valueFactory.typeOf(A_symbol_51);
					LibraryUnaryOperation dynamic_A_symbol_52 = (LibraryUnaryOperation)static_A_symbol_52.lookupImplementation(standardLibrary, O_Collection_notEmpty);
					Value A_symbol_52 = dynamic_A_symbol_52.evaluate(evaluator, T_Boolean, A_symbol_51);
					leftA_symbol_49 = A_symbol_52;
				} catch (InvalidValueException e) {
					leftA_symbol_49 = valueFactory.getInvalid();
				}
				Value A_symbol_52 = leftA_symbol_49;
				Value rightA_symbol_49;
				try {
					
					DomainType static_A_symbol_53 = valueFactory.typeOf(self);
					LibraryUnaryOperation dynamic_A_symbol_53 = (LibraryUnaryOperation)static_A_symbol_53.lookupImplementation(standardLibrary, O_MultiplicityElement_lowerBound);
					Value A_symbol_53 = dynamic_A_symbol_53.evaluate(evaluator, T_Integer, self);
					DomainType static_A_symbol_54 = valueFactory.typeOf(A_symbol_53);
					LibraryUnaryOperation dynamic_A_symbol_54 = (LibraryUnaryOperation)static_A_symbol_54.lookupImplementation(standardLibrary, O_OclAny_oclAsSet);
					Value A_symbol_54 = dynamic_A_symbol_54.evaluate(evaluator, T_Set_Integer_, A_symbol_53);
					DomainType static_A_symbol_55 = valueFactory.typeOf(A_symbol_54);
					LibraryUnaryOperation dynamic_A_symbol_55 = (LibraryUnaryOperation)static_A_symbol_55.lookupImplementation(standardLibrary, O_Collection_notEmpty);
					Value A_symbol_55 = dynamic_A_symbol_55.evaluate(evaluator, T_Boolean, A_symbol_54);
					rightA_symbol_49 = A_symbol_55;
				} catch (InvalidValueException e) {
					rightA_symbol_49 = valueFactory.getInvalid();
				}
				Value A_symbol_55 = rightA_symbol_49;
				DomainType static_A_symbol_49 = valueFactory.typeOf(A_symbol_52);
				LibraryBinaryOperation dynamic_A_symbol_49 = (LibraryBinaryOperation)static_A_symbol_49.lookupImplementation(standardLibrary, O_Boolean_and);
				Value A_symbol_49 = dynamic_A_symbol_49.evaluate(evaluator, T_Boolean, A_symbol_52, A_symbol_55);
				leftA_symbol_48 = A_symbol_49;
			} catch (InvalidValueException e) {
				leftA_symbol_48 = valueFactory.getInvalid();
			}
			Value A_symbol_49 = leftA_symbol_48;
			Value rightA_symbol_48;
			try {
				
				DomainType static_A_symbol_56 = valueFactory.typeOf(self);
				LibraryUnaryOperation dynamic_A_symbol_56 = (LibraryUnaryOperation)static_A_symbol_56.lookupImplementation(standardLibrary, O_MultiplicityElement_upperBound);
				Value A_symbol_56 = dynamic_A_symbol_56.evaluate(evaluator, T_Integer, self);
				
				DomainType static_A_symbol_57 = valueFactory.typeOf(self);
				LibraryUnaryOperation dynamic_A_symbol_57 = (LibraryUnaryOperation)static_A_symbol_57.lookupImplementation(standardLibrary, O_MultiplicityElement_lowerBound);
				Value A_symbol_57 = dynamic_A_symbol_57.evaluate(evaluator, T_Integer, self);
				DomainType static_A_symbol_58 = valueFactory.typeOf(A_symbol_56, A_symbol_57);
				LibraryBinaryOperation dynamic_A_symbol_58 = (LibraryBinaryOperation)static_A_symbol_58.lookupImplementation(standardLibrary, O_Real__gt__eq_);
				Value A_symbol_58 = dynamic_A_symbol_58.evaluate(evaluator, T_Boolean, A_symbol_56, A_symbol_57);
				rightA_symbol_48 = A_symbol_58;
			} catch (InvalidValueException e) {
				rightA_symbol_48 = valueFactory.getInvalid();
			}
			Value A_symbol_58 = rightA_symbol_48;
			DomainType static_A_symbol_48 = valueFactory.typeOf(A_symbol_49);
			LibraryBinaryOperation dynamic_A_symbol_48 = (LibraryBinaryOperation)static_A_symbol_48.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_48 = dynamic_A_symbol_48.evaluate(evaluator, T_Boolean, A_symbol_49, A_symbol_58);
			return A_symbol_48;
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
			
			Value leftA_symbol_59;
			try {
				
				DomainType static_A_symbol_60 = valueFactory.typeOf(self);
				LibraryUnaryOperation dynamic_A_symbol_60 = (LibraryUnaryOperation)static_A_symbol_60.lookupImplementation(standardLibrary, O_MultiplicityElement_lowerBound);
				Value A_symbol_60 = dynamic_A_symbol_60.evaluate(evaluator, T_Integer, self);
				
				DomainType static_A_symbol_61 = valueFactory.typeOf(A_symbol_60, C);
				LibraryBinaryOperation dynamic_A_symbol_61 = (LibraryBinaryOperation)static_A_symbol_61.lookupImplementation(standardLibrary, O_Real__lt__eq_);
				Value A_symbol_61 = dynamic_A_symbol_61.evaluate(evaluator, T_Boolean, A_symbol_60, C);
				leftA_symbol_59 = A_symbol_61;
			} catch (InvalidValueException e) {
				leftA_symbol_59 = valueFactory.getInvalid();
			}
			Value A_symbol_61 = leftA_symbol_59;
			Value rightA_symbol_59;
			try {
				
				DomainType static_A_symbol_62 = valueFactory.typeOf(self);
				LibraryUnaryOperation dynamic_A_symbol_62 = (LibraryUnaryOperation)static_A_symbol_62.lookupImplementation(standardLibrary, O_MultiplicityElement_upperBound);
				Value A_symbol_62 = dynamic_A_symbol_62.evaluate(evaluator, T_Integer, self);
				
				DomainType static_A_symbol_63 = valueFactory.typeOf(A_symbol_62, C);
				LibraryBinaryOperation dynamic_A_symbol_63 = (LibraryBinaryOperation)static_A_symbol_63.lookupImplementation(standardLibrary, O_Real__gt__eq_);
				Value A_symbol_63 = dynamic_A_symbol_63.evaluate(evaluator, T_Boolean, A_symbol_62, C);
				rightA_symbol_59 = A_symbol_63;
			} catch (InvalidValueException e) {
				rightA_symbol_59 = valueFactory.getInvalid();
			}
			Value A_symbol_63 = rightA_symbol_59;
			DomainType static_A_symbol_59 = valueFactory.typeOf(A_symbol_61);
			LibraryBinaryOperation dynamic_A_symbol_59 = (LibraryBinaryOperation)static_A_symbol_59.lookupImplementation(standardLibrary, O_Boolean_and);
			Value A_symbol_59 = dynamic_A_symbol_59.evaluate(evaluator, T_Boolean, A_symbol_61, A_symbol_63);
			return A_symbol_59;
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
			
			Value leftA_symbol_64;
			try {
				
				DomainType static_A_symbol_65 = valueFactory.typeOf(self);
				LibraryUnaryOperation dynamic_A_symbol_65 = (LibraryUnaryOperation)static_A_symbol_65.lookupImplementation(standardLibrary, O_MultiplicityElement_lowerBound);
				Value A_symbol_65 = dynamic_A_symbol_65.evaluate(evaluator, T_Integer, self);
				
				DomainType static_A_symbol_66 = valueFactory.typeOf(M);
				LibraryUnaryOperation dynamic_A_symbol_66 = (LibraryUnaryOperation)static_A_symbol_66.lookupImplementation(standardLibrary, O_MultiplicityElement_lowerBound);
				Value A_symbol_66 = dynamic_A_symbol_66.evaluate(evaluator, T_Integer, M);
				DomainType static_A_symbol_67 = valueFactory.typeOf(A_symbol_65, A_symbol_66);
				LibraryBinaryOperation dynamic_A_symbol_67 = (LibraryBinaryOperation)static_A_symbol_67.lookupImplementation(standardLibrary, O_Real__lt__eq_);
				Value A_symbol_67 = dynamic_A_symbol_67.evaluate(evaluator, T_Boolean, A_symbol_65, A_symbol_66);
				leftA_symbol_64 = A_symbol_67;
			} catch (InvalidValueException e) {
				leftA_symbol_64 = valueFactory.getInvalid();
			}
			Value A_symbol_67 = leftA_symbol_64;
			Value rightA_symbol_64;
			try {
				
				DomainType static_A_symbol_68 = valueFactory.typeOf(self);
				LibraryUnaryOperation dynamic_A_symbol_68 = (LibraryUnaryOperation)static_A_symbol_68.lookupImplementation(standardLibrary, O_MultiplicityElement_upperBound);
				Value A_symbol_68 = dynamic_A_symbol_68.evaluate(evaluator, T_Integer, self);
				
				DomainType static_A_symbol_69 = valueFactory.typeOf(M);
				LibraryUnaryOperation dynamic_A_symbol_69 = (LibraryUnaryOperation)static_A_symbol_69.lookupImplementation(standardLibrary, O_MultiplicityElement_upperBound);
				Value A_symbol_69 = dynamic_A_symbol_69.evaluate(evaluator, T_Integer, M);
				DomainType static_A_symbol_70 = valueFactory.typeOf(A_symbol_68, A_symbol_69);
				LibraryBinaryOperation dynamic_A_symbol_70 = (LibraryBinaryOperation)static_A_symbol_70.lookupImplementation(standardLibrary, O_Real__gt__eq_);
				Value A_symbol_70 = dynamic_A_symbol_70.evaluate(evaluator, T_Boolean, A_symbol_68, A_symbol_69);
				rightA_symbol_64 = A_symbol_70;
			} catch (InvalidValueException e) {
				rightA_symbol_64 = valueFactory.getInvalid();
			}
			Value A_symbol_70 = rightA_symbol_64;
			DomainType static_A_symbol_64 = valueFactory.typeOf(A_symbol_67);
			LibraryBinaryOperation dynamic_A_symbol_64 = (LibraryBinaryOperation)static_A_symbol_64.lookupImplementation(standardLibrary, O_Boolean_and);
			Value A_symbol_64 = dynamic_A_symbol_64.evaluate(evaluator, T_Boolean, A_symbol_67, A_symbol_70);
			return A_symbol_64;
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
			
			
			DomainType static_A_symbol_71 = valueFactory.typeOf(self);
			LibraryUnaryOperation dynamic_A_symbol_71 = (LibraryUnaryOperation)static_A_symbol_71.lookupImplementation(standardLibrary, O_MultiplicityElement_upperBound);
			Value A_symbol_71 = dynamic_A_symbol_71.evaluate(evaluator, T_Integer, self);
			DomainType static_A_symbol_72 = valueFactory.typeOf(A_symbol_71, I_1);
			LibraryBinaryOperation dynamic_A_symbol_72 = (LibraryBinaryOperation)static_A_symbol_72.lookupImplementation(standardLibrary, O_Real__gt_);
			Value A_symbol_72 = dynamic_A_symbol_72.evaluate(evaluator, T_Boolean, A_symbol_71, I_1);
			return A_symbol_72;
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
			
				
				Value A_symbol_73 = IP_MultiplicityElement_lower.evaluate(evaluator, T_Integer, self, P_MultiplicityElement_lower);
				
				DomainType static_A_symbol_74 = valueFactory.typeOf(A_symbol_73);
				LibraryUnaryOperation dynamic_A_symbol_74 = (LibraryUnaryOperation)static_A_symbol_74.lookupImplementation(standardLibrary, O_OclAny_oclAsSet);
				Value A_symbol_74 = dynamic_A_symbol_74.evaluate(evaluator, T_Set_Integer_, A_symbol_73);
				DomainType static_A_symbol_75 = valueFactory.typeOf(A_symbol_74);
				LibraryUnaryOperation dynamic_A_symbol_75 = (LibraryUnaryOperation)static_A_symbol_75.lookupImplementation(standardLibrary, O_Collection_notEmpty);
				Value A_symbol_75 = dynamic_A_symbol_75.evaluate(evaluator, T_Boolean, A_symbol_74);
			Value A_symbol_76;
			if (A_symbol_75.isTrue()) {
				
				Value A_symbol_77 = IP_MultiplicityElement_lower.evaluate(evaluator, T_Integer, self, P_MultiplicityElement_lower);
				
				A_symbol_76 = A_symbol_77;
			}
			else if (A_symbol_75.isFalse()) {
				A_symbol_76 = I_1;
			}
			else if (A_symbol_75.isNull()) {
				A_symbol_76 = valueFactory.throwInvalidValueException("null if condition");
			}
			else {
				A_symbol_76 = valueFactory.throwInvalidValueException("invalid if condition");
			}
			return A_symbol_76;
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
			
				
				Value A_symbol_78 = IP_MultiplicityElement_upper.evaluate(evaluator, T_Integer, self, P_MultiplicityElement_upper);
				
				DomainType static_A_symbol_79 = valueFactory.typeOf(A_symbol_78);
				LibraryUnaryOperation dynamic_A_symbol_79 = (LibraryUnaryOperation)static_A_symbol_79.lookupImplementation(standardLibrary, O_OclAny_oclAsSet);
				Value A_symbol_79 = dynamic_A_symbol_79.evaluate(evaluator, T_Set_Integer_, A_symbol_78);
				DomainType static_A_symbol_80 = valueFactory.typeOf(A_symbol_79);
				LibraryUnaryOperation dynamic_A_symbol_80 = (LibraryUnaryOperation)static_A_symbol_80.lookupImplementation(standardLibrary, O_Collection_notEmpty);
				Value A_symbol_80 = dynamic_A_symbol_80.evaluate(evaluator, T_Boolean, A_symbol_79);
			Value A_symbol_81;
			if (A_symbol_80.isTrue()) {
				
				Value A_symbol_82 = IP_MultiplicityElement_upper.evaluate(evaluator, T_Integer, self, P_MultiplicityElement_upper);
				
				A_symbol_81 = A_symbol_82;
			}
			else if (A_symbol_80.isFalse()) {
				A_symbol_81 = I_1;
			}
			else if (A_symbol_80.isNull()) {
				A_symbol_81 = valueFactory.throwInvalidValueException("null if condition");
			}
			else {
				A_symbol_81 = valueFactory.throwInvalidValueException("invalid if condition");
			}
			return A_symbol_81;
		}
	}




}

