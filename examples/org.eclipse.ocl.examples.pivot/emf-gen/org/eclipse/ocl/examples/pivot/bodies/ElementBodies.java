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
import org.eclipse.ocl.examples.domain.library.AbstractUnaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryBinaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryUnaryOperation;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorType;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.examples.pivot.PivotTables;

/**
 * ElementBodies provides the Java implementation bodies of OCL-defined Element operations and properties.
 */
@SuppressWarnings("nls")
public class ElementBodies
{

	/** 
	 * Implementation of the Element 'not_own_self' invariant.
	 */
	public static class _invariant_not_own_self extends AbstractUnaryOperation
	{
		public static _invariant_not_own_self INSTANCE = new _invariant_not_own_self();
	
		/*
		not allOwnedElements()->includes(self)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_not = OCLstdlibTables.Operations._Boolean__not;
			final ExecutorOperation O_Collection_includes = OCLstdlibTables.Operations._Collection__includes;
			final ExecutorType T_Pivot_ecore__pivot__Element = PivotTables.Types._Element;
			final DomainCollectionType T_Set_Pivot_ecore__pivot__Element_ = standardLibrary.getSetType(T_Pivot_ecore__pivot__Element);
			final ExecutorOperation O_Element_allOwnedElements = PivotTables.Operations._Element__allOwnedElements;
			
			
			DomainType static_A_symbol_62 = valueFactory.typeOf(self);
			LibraryUnaryOperation dynamic_A_symbol_62 = (LibraryUnaryOperation)static_A_symbol_62.lookupImplementation(standardLibrary, O_Element_allOwnedElements);
			Value A_symbol_62 = dynamic_A_symbol_62.evaluate(evaluator, T_Set_Pivot_ecore__pivot__Element_, self);
			
			DomainType static_A_symbol_63 = valueFactory.typeOf(A_symbol_62);
			LibraryBinaryOperation dynamic_A_symbol_63 = (LibraryBinaryOperation)static_A_symbol_63.lookupImplementation(standardLibrary, O_Collection_includes);
			Value A_symbol_63 = dynamic_A_symbol_63.evaluate(evaluator, T_Boolean, A_symbol_62, self);
			DomainType static_A_symbol_64 = valueFactory.typeOf(A_symbol_63);
			LibraryUnaryOperation dynamic_A_symbol_64 = (LibraryUnaryOperation)static_A_symbol_64.lookupImplementation(standardLibrary, O_Boolean_not);
			Value A_symbol_64 = dynamic_A_symbol_64.evaluate(evaluator, T_Boolean, A_symbol_63);
			return A_symbol_64;
		}
	}

	/** 
	 * Implementation of the Element::allOwnedElements '' <body>.
	 */
	public static class _allOwnedElements_body_ extends AbstractUnaryOperation
	{
		public static _allOwnedElements_body_ INSTANCE = new _allOwnedElements_body_();
	
		/*
		oclContents()
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_OclElement = OCLstdlibTables.Types._OclElement;
			final DomainCollectionType T_Set_OclElement_ = standardLibrary.getSetType(T_OclElement);
			final ExecutorOperation O_OclElement_oclContents = OCLstdlibTables.Operations._OclElement__oclContents;
			
			
			DomainType static_A_symbol_65 = valueFactory.typeOf(self);
			LibraryUnaryOperation dynamic_A_symbol_65 = (LibraryUnaryOperation)static_A_symbol_65.lookupImplementation(standardLibrary, O_OclElement_oclContents);
			Value A_symbol_65 = dynamic_A_symbol_65.evaluate(evaluator, T_Set_OclElement_, self);
			return A_symbol_65;
		}
	}




}

