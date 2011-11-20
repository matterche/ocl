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
import org.eclipse.ocl.examples.domain.library.AbstractUnaryOperation;
import org.eclipse.ocl.examples.domain.values.BooleanValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.executor.ExecutorType;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;

/**
 * ValueSpecificationBodies provides the Java implementation bodies of OCL-defined ValueSpecification operations and properties.
 */
@SuppressWarnings("nls")
public class ValueSpecificationBodies
{

	/** 
	 * Implementation of the ValueSpecification::booleanValue '' <body>.
	 */
	public static class _booleanValue_body_ extends AbstractUnaryOperation
	{
		public static _booleanValue_body_ INSTANCE = new _booleanValue_body_();
	
		/*
		Set{}
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_OclAny = OCLstdlibTables.Types._OclAny;
			final DomainCollectionType T_Set_OclAny_ = standardLibrary.getSetType(T_OclAny);
			final Value A_symbol_86 = valueFactory.createSetValue(T_Set_OclAny_);
			
			
			return A_symbol_86;
		}
	}

	/** 
	 * Implementation of the ValueSpecification::integerValue '' <body>.
	 */
	public static class _integerValue_body_ extends AbstractUnaryOperation
	{
		public static _integerValue_body_ INSTANCE = new _integerValue_body_();
	
		/*
		Set{}
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_OclAny = OCLstdlibTables.Types._OclAny;
			final DomainCollectionType T_Set_OclAny_ = standardLibrary.getSetType(T_OclAny);
			final Value A_symbol_87 = valueFactory.createSetValue(T_Set_OclAny_);
			
			
			return A_symbol_87;
		}
	}

	/** 
	 * Implementation of the ValueSpecification::isComputable '' <body>.
	 */
	public static class _isComputable_body_ extends AbstractUnaryOperation
	{
		public static _isComputable_body_ INSTANCE = new _isComputable_body_();
	
		/*
		false
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final BooleanValue False = valueFactory.getFalse();
			
			
			return False;
		}
	}

	/** 
	 * Implementation of the ValueSpecification::isNull '' <body>.
	 */
	public static class _isNull_body_ extends AbstractUnaryOperation
	{
		public static _isNull_body_ INSTANCE = new _isNull_body_();
	
		/*
		false
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final BooleanValue False = valueFactory.getFalse();
			
			
			return False;
		}
	}

	/** 
	 * Implementation of the ValueSpecification::stringValue '' <body>.
	 */
	public static class _stringValue_body_ extends AbstractUnaryOperation
	{
		public static _stringValue_body_ INSTANCE = new _stringValue_body_();
	
		/*
		Set{}
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_OclAny = OCLstdlibTables.Types._OclAny;
			final DomainCollectionType T_Set_OclAny_ = standardLibrary.getSetType(T_OclAny);
			final Value A_symbol_88 = valueFactory.createSetValue(T_Set_OclAny_);
			
			
			return A_symbol_88;
		}
	}

	/** 
	 * Implementation of the ValueSpecification::unlimitedValue '' <body>.
	 */
	public static class _unlimitedValue_body_ extends AbstractUnaryOperation
	{
		public static _unlimitedValue_body_ INSTANCE = new _unlimitedValue_body_();
	
		/*
		Set{}
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_OclAny = OCLstdlibTables.Types._OclAny;
			final DomainCollectionType T_Set_OclAny_ = standardLibrary.getSetType(T_OclAny);
			final Value A_symbol_89 = valueFactory.createSetValue(T_Set_OclAny_);
			
			
			return A_symbol_89;
		}
	}

}

